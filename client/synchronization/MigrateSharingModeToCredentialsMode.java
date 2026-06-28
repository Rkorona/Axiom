package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.vaults.entitygraph.CredentialsMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class MigrateSharingModeToCredentialsMode {
    public static final int $stable = 8;
    private final boolean canEditSharedData;
    private final GroupDBAdapter groupDBAdapter;
    private final HashSet<GroupDBModel> groupUpdateSet;
    private final List<GroupDBModel> groups;
    private final HashSet<HostDBModel> hostUpdateSet;
    private final List<HostDBModel> hosts;
    private final HostsDBAdapter hostsDBAdapter;

    public MigrateSharingModeToCredentialsMode(GroupDBAdapter groupDBAdapter, HostsDBAdapter hostsDBAdapter, boolean z10) {
        t.f(groupDBAdapter, "groupDBAdapter");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        this.groupDBAdapter = groupDBAdapter;
        this.hostsDBAdapter = hostsDBAdapter;
        this.canEditSharedData = z10;
        this.groupUpdateSet = new HashSet<>();
        this.hostUpdateSet = new HashSet<>();
        this.groups = groupDBAdapter.getItemListWhichNotDeleted();
        this.hosts = hostsDBAdapter.getItemListWhichNotDeleted();
    }

    private final void updateGroupWithHosts(GroupDBModel groupDBModel, String str) {
        List<HostDBModel> list = this.hosts;
        t.e(list, Table.HOSTS);
        ArrayList<HostDBModel> arrayList = new ArrayList();
        for (Object obj : list) {
            HostDBModel hostDBModel = (HostDBModel) obj;
            Long groupId = hostDBModel.getGroupId();
            long idInDatabase = groupDBModel.getIdInDatabase();
            if (groupId != null && groupId.longValue() == idInDatabase && hostDBModel.getCredentialsMode() == null) {
                arrayList.add(obj);
            }
        }
        for (HostDBModel hostDBModel2 : arrayList) {
            hostDBModel2.setCredentialsMode(str);
            if (!this.hostUpdateSet.contains(hostDBModel2)) {
                this.hostUpdateSet.add(hostDBModel2);
            }
        }
        List<GroupDBModel> list2 = this.groups;
        t.e(list2, "groups");
        ArrayList<GroupDBModel> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            GroupDBModel groupDBModel2 = (GroupDBModel) obj2;
            Long parentGroupId = groupDBModel2.getParentGroupId();
            long idInDatabase2 = groupDBModel.getIdInDatabase();
            if (parentGroupId != null && parentGroupId.longValue() == idInDatabase2 && groupDBModel2.getCredentialsMode() == null) {
                arrayList2.add(obj2);
            }
        }
        for (GroupDBModel groupDBModel3 : arrayList2) {
            groupDBModel3.setCredentialsMode(str);
            if (!this.groupUpdateSet.contains(groupDBModel3)) {
                this.groupUpdateSet.add(groupDBModel3);
            }
            t.c(groupDBModel3);
            updateGroupWithHosts(groupDBModel3, str);
        }
    }

    public final void migrate() {
        List<GroupDBModel> list = this.groups;
        t.e(list, "groups");
        ArrayList<GroupDBModel> arrayList = new ArrayList();
        for (Object obj : list) {
            GroupDBModel groupDBModel = (GroupDBModel) obj;
            if (groupDBModel.isShared() && groupDBModel.getParentGroupId() == null) {
                arrayList.add(obj);
            }
        }
        for (GroupDBModel groupDBModel2 : arrayList) {
            if (groupDBModel2.getCredentialsMode() == null) {
                String sharingMode = groupDBModel2.getSharingMode();
                if (sharingMode == null) {
                    sharingMode = CredentialsMode.DoNotShareCredentials.getValue();
                }
                groupDBModel2.setCredentialsMode(sharingMode);
                if (!this.groupUpdateSet.contains(groupDBModel2)) {
                    this.groupUpdateSet.add(groupDBModel2);
                }
            }
            t.c(groupDBModel2);
            String credentialsMode = groupDBModel2.getCredentialsMode();
            t.e(credentialsMode, "getCredentialsMode(...)");
            updateGroupWithHosts(groupDBModel2, credentialsMode);
        }
        List<HostDBModel> list2 = this.hosts;
        t.e(list2, Table.HOSTS);
        ArrayList<HostDBModel> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            HostDBModel hostDBModel = (HostDBModel) obj2;
            if (hostDBModel.isShared() && hostDBModel.getGroupId() == null && hostDBModel.getCredentialsMode() == null) {
                arrayList2.add(obj2);
            }
        }
        for (HostDBModel hostDBModel2 : arrayList2) {
            hostDBModel2.setCredentialsMode(CredentialsMode.DoNotShareCredentials.getValue());
            if (!this.hostUpdateSet.contains(hostDBModel2)) {
                this.hostUpdateSet.add(hostDBModel2);
            }
        }
        for (GroupDBModel groupDBModel3 : v.d1(this.groupUpdateSet)) {
            if (this.canEditSharedData) {
                groupDBModel3.setStatus(1);
            }
            this.groupDBAdapter.editByLocalId(groupDBModel3.getIdInDatabase(), groupDBModel3);
        }
        for (HostDBModel hostDBModel3 : v.d1(this.hostUpdateSet)) {
            if (this.canEditSharedData) {
                hostDBModel3.setStatus(1);
            }
            this.hostsDBAdapter.editByLocalId(hostDBModel3.getIdInDatabase(), hostDBModel3);
        }
    }
}
