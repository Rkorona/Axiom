package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.group.GroupContent;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import il.v0;
import io.sentry.f;
import io.sentry.h7;
import java.util.Iterator;
import ju.n0;
import ju.t;
import mv.b;
import np.k;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeGroups extends BulkDataMergeService<GroupFullData> {
    public static final int $stable = 8;
    private final GroupDBAdapter groupDBAdapter;
    private final b jsonConverter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;
    private final v0 wasDataSharedRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeGroups(h hVar, v vVar, SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, b bVar, v0 v0Var) {
        super(hVar, vVar, GroupFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(groupDBAdapter, "groupDBAdapter");
        t.f(bVar, "jsonConverter");
        t.f(v0Var, "wasDataSharedRepository");
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.groupDBAdapter = groupDBAdapter;
        this.jsonConverter = bVar;
        this.wasDataSharedRepository = v0Var;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getGroups().iterator();
        while (it.hasNext()) {
            this.groupDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(GroupFullData groupFullData) throws po.a {
        GroupDBModel groupDBModel;
        t.f(groupFullData, "item");
        WithRecourseId parentGroupId = groupFullData.getParentGroupId();
        WithRecourseId sshConfigId = groupFullData.getSshConfigId();
        WithRecourseId telnetConfigId = groupFullData.getTelnetConfigId();
        String str = groupFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    groupDBModel = new GroupDBModel(((GroupContent) bVar.b(GroupContent.Companion.serializer(), str2)).getLabel());
                    groupDBModel.setContent(str);
                    groupDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("GroupFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(GroupContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(groupFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            groupDBModel = new GroupDBModel(groupFullData.label);
        }
        if (sshConfigId != null) {
            SshRemoteConfigDBModel itemByRemoteId = this.sshConfigDBAdapter.getItemByRemoteId(sshConfigId.getId());
            groupDBModel.setSshConfigId(itemByRemoteId != null ? Long.valueOf(itemByRemoteId.getIdInDatabase()) : null);
        }
        if (telnetConfigId != null) {
            TelnetRemoteConfigDBModel itemByRemoteId2 = this.telnetConfigDBAdapter.getItemByRemoteId(telnetConfigId.getId());
            groupDBModel.setTelnetConfigId(itemByRemoteId2 != null ? Long.valueOf(itemByRemoteId2.getIdInDatabase()) : null);
        }
        if (parentGroupId != null) {
            GroupDBModel itemByRemoteId3 = this.groupDBAdapter.getItemByRemoteId(parentGroupId.getId());
            groupDBModel.setParentGroupId(itemByRemoteId3 != null ? Long.valueOf(itemByRemoteId3.getIdInDatabase()) : null);
        }
        groupDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(groupFullData.getEncryptedWith()));
        groupDBModel.setIdOnServer(groupFullData.getId());
        groupDBModel.setUpdatedAtTime(groupFullData.getUpdatedAt());
        groupDBModel.setStatus(0);
        groupDBModel.setSharingMode(groupFullData.sharingMode);
        groupDBModel.setShared(t.b(groupFullData.getShared(), Boolean.TRUE));
        groupDBModel.setCredentialsMode(groupFullData.credentialsMode);
        Long localId = groupFullData.getLocalId();
        GroupDBModel itemByLocalId = localId != null ? this.groupDBAdapter.getItemByLocalId(localId.longValue()) : this.groupDBAdapter.getItemByRemoteId(groupFullData.getId());
        if (itemByLocalId != null && groupDBModel.isShared() && groupDBModel.getCredentialsMode() == null) {
            groupDBModel.setCredentialsMode(itemByLocalId.getCredentialsMode());
        }
        if (groupDBModel.isShared()) {
            this.wasDataSharedRepository.c();
        }
        if (localId == null) {
            this.groupDBAdapter.editByRemoteId(groupFullData.getId(), groupDBModel);
        } else {
            groupDBModel.setIdInDatabase(localId.longValue());
            this.groupDBAdapter.editByLocalId(localId.longValue(), groupDBModel);
        }
    }
}
