package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TelnetConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkModelCreatorInteractor {
    private static final long DEFAULT_REMOTE_ID = 0;
    private final SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter;
    private final SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter;
    private final SshConfigIdentityApiAdapter sshConfigIdentityApiAdapter;
    private final BulkApiAdapter<SshConfigIdentityBulk, SshConfigIdentityDBModel> sshConfigIdentityBulkApiAdapter;
    private final TelnetConfigIdentityApiAdapter telnetConfigIdentityApiAdapter;
    private final BulkApiAdapter<TelnetConfigIdentityBulk, TelnetConfigIdentityDBModel> telnetConfigIdentityBulkApiAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(ju.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public BulkModelCreatorInteractor(hg.f fVar, BulkApiAdapter<SshConfigIdentityBulk, SshConfigIdentityDBModel> bulkApiAdapter, BulkApiAdapter<TelnetConfigIdentityBulk, TelnetConfigIdentityDBModel> bulkApiAdapter2) {
        t.f(fVar, "saFactory");
        t.f(bulkApiAdapter, "sshConfigIdentityBulkApiAdapter");
        t.f(bulkApiAdapter2, "telnetConfigIdentityBulkApiAdapter");
        this.sshConfigIdentityBulkApiAdapter = bulkApiAdapter;
        this.telnetConfigIdentityBulkApiAdapter = bulkApiAdapter2;
        this.sharedSshConfigIdentityDBAdapter = fVar.E();
        this.sshConfigIdentityApiAdapter = fVar.T();
        this.sharedTelnetConfigIdentityDBAdapter = fVar.G();
        this.telnetConfigIdentityApiAdapter = fVar.f0();
    }

    private final List<SshConfigIdentityBulk> collectRelevantSshConfigIdentities() {
        if (!SyncServiceHelper.isIdentitySynced()) {
            return v.o();
        }
        List<SshConfigIdentityBulk> updateModels = this.sshConfigIdentityBulkApiAdapter.getUpdateModels();
        t.c(updateModels);
        return updateModels;
    }

    private final List<TelnetConfigIdentityBulk> collectRelevantTelnetConfigIdentities() {
        if (!SyncServiceHelper.isIdentitySynced()) {
            return v.o();
        }
        List<TelnetConfigIdentityBulk> updateModels = this.telnetConfigIdentityBulkApiAdapter.getUpdateModels();
        t.c(updateModels);
        return updateModels;
    }

    private final void convertSharedSshConfigIdentityToPersonal(SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk) {
        long jLongValue;
        SharedSshConfigIdentityDBModel itemByLocalId;
        Long localId = sharedSshConfigIdentityBulk.getLocalId();
        if (localId == null || (itemByLocalId = this.sharedSshConfigIdentityDBAdapter.getItemByLocalId((jLongValue = localId.longValue()))) == null) {
            return;
        }
        this.sshConfigIdentityApiAdapter.postItem(new SshConfigIdentityDBModel(itemByLocalId.getSshConfigId(), itemByLocalId.getIdentityId()));
        this.sharedSshConfigIdentityDBAdapter.removeItemByLocalId(jLongValue);
    }

    private final void convertSharedTelnetConfigIdentityToPersonal(SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk) {
        long jLongValue;
        SharedTelnetConfigIdentityDBModel itemByLocalId;
        Long localId = sharedTelnetConfigIdentityBulk.getLocalId();
        if (localId == null || (itemByLocalId = this.sharedTelnetConfigIdentityDBAdapter.getItemByLocalId((jLongValue = localId.longValue()))) == null) {
            return;
        }
        this.telnetConfigIdentityApiAdapter.postItem(new TelnetConfigIdentityDBModel(itemByLocalId.getTelnetConfigId(), itemByLocalId.getIdentityId()));
        this.sharedTelnetConfigIdentityDBAdapter.removeItemByLocalId(jLongValue);
    }

    private final void processCorrectSharedSshConfigIdentities(List<SharedSshConfigIdentityBulk> list, ArrayList<SharedSshConfigIdentityBulk> arrayList) {
        list.clear();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            list.add((SharedSshConfigIdentityBulk) it.next());
        }
    }

    private final void processCorrectSharedTelnetConfigIdentities(List<SharedTelnetConfigIdentityBulk> list, ArrayList<SharedTelnetConfigIdentityBulk> arrayList) {
        list.clear();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            list.add((SharedTelnetConfigIdentityBulk) it.next());
        }
    }

    private final void processOfSharedSshConfigsToRemove(List<SharedSshConfigIdentityBulk> list) {
        for (SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk : list) {
            if (sharedSshConfigIdentityBulk.getRemoteId().longValue() == 0) {
                convertSharedSshConfigIdentityToPersonal(sharedSshConfigIdentityBulk);
            } else {
                resetStatusForSharedSshConfigIdentity(sharedSshConfigIdentityBulk);
            }
        }
    }

    private final void processOfSharedTelnetConfigsToRemove(List<SharedTelnetConfigIdentityBulk> list) {
        for (SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk : list) {
            if (sharedTelnetConfigIdentityBulk.getRemoteId().longValue() == 0) {
                convertSharedTelnetConfigIdentityToPersonal(sharedTelnetConfigIdentityBulk);
            } else {
                resetStatusForSharedTelnetConfigIdentity(sharedTelnetConfigIdentityBulk);
            }
        }
    }

    private final void resetStatusForSharedSshConfigIdentity(SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk) {
        SharedSshConfigIdentityDBModel itemByRemoteId = this.sharedSshConfigIdentityDBAdapter.getItemByRemoteId(sharedSshConfigIdentityBulk.getRemoteId().longValue());
        if (itemByRemoteId != null) {
            itemByRemoteId.setStatus(0);
            this.sharedSshConfigIdentityDBAdapter.editByRemoteId((int) sharedSshConfigIdentityBulk.getRemoteId().longValue(), itemByRemoteId);
        }
    }

    private final void resetStatusForSharedTelnetConfigIdentity(SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk) {
        SharedTelnetConfigIdentityDBModel itemByRemoteId = this.sharedTelnetConfigIdentityDBAdapter.getItemByRemoteId(sharedTelnetConfigIdentityBulk.getRemoteId().longValue());
        if (itemByRemoteId != null) {
            itemByRemoteId.setStatus(0);
            this.sharedTelnetConfigIdentityDBAdapter.editByRemoteId((int) sharedTelnetConfigIdentityBulk.getRemoteId().longValue(), itemByRemoteId);
        }
    }

    public final Long getEncryptedWithOfBulkModel(Object obj) {
        if (obj instanceof Shareable) {
            return ((Shareable) obj).getEncryptedWith();
        }
        return null;
    }

    public final boolean isKeyInsideCryptorForViewOnly(rg.h hVar) {
        t.f(hVar, "cryptor");
        return t.b(hVar.V(), "Member");
    }

    public final boolean isSharedBulkModel(Object obj) {
        Boolean shared;
        if (!(obj instanceof Shareable) || (shared = ((Shareable) obj).getShared()) == null) {
            return false;
        }
        return shared.booleanValue();
    }

    public final void resetSharedParametersForBulkModel(Object obj) {
        SnippetBulk snippetBulk;
        Long remoteId;
        if (obj instanceof HostBulk) {
            ((HostBulk) obj).setCredentialsMode(null);
        } else if (obj instanceof GroupBulk) {
            ((GroupBulk) obj).setCredentialsMode(null);
        } else if (obj instanceof IdentityBulk) {
            IdentityBulk identityBulk = (IdentityBulk) obj;
            Long remoteId2 = identityBulk.getRemoteId();
            if (remoteId2 != null && remoteId2.longValue() == 0) {
                identityBulk.setSshKeyId(null);
            }
        } else if ((obj instanceof SnippetBulk) && (remoteId = (snippetBulk = (SnippetBulk) obj).getRemoteId()) != null && remoteId.longValue() == 0) {
            snippetBulk.setPackageId(null);
        }
        if (obj instanceof Shareable) {
            ((Shareable) obj).resetSharingBeforeSync();
        }
    }

    public final List<SshConfigIdentityBulk> updateSshConfigIdentitiesDependsOfTeamKeys(List<SharedSshConfigIdentityBulk> list, HashMap<Long, rg.h> map) {
        t.f(list, "sharedSshConfigIdentitySets");
        t.f(map, "teamCryptors");
        ArrayList arrayList = new ArrayList();
        ArrayList<SharedSshConfigIdentityBulk> arrayList2 = new ArrayList<>();
        for (SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk : list) {
            rg.h hVar = map.get(sharedSshConfigIdentityBulk.getEncryptedWith());
            if (hVar == null || isKeyInsideCryptorForViewOnly(hVar)) {
                arrayList.add(sharedSshConfigIdentityBulk);
            } else {
                arrayList2.add(sharedSshConfigIdentityBulk);
            }
        }
        processOfSharedSshConfigsToRemove(arrayList);
        processCorrectSharedSshConfigIdentities(list, arrayList2);
        return collectRelevantSshConfigIdentities();
    }

    public final List<TelnetConfigIdentityBulk> updateTelnetConfigIdentitiesDependsOfTeamKeys(List<SharedTelnetConfigIdentityBulk> list, HashMap<Long, rg.h> map) {
        t.f(list, "sharedTelnetConfigIdentitySets");
        t.f(map, "teamCryptors");
        ArrayList arrayList = new ArrayList();
        ArrayList<SharedTelnetConfigIdentityBulk> arrayList2 = new ArrayList<>();
        for (SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk : list) {
            rg.h hVar = map.get(sharedTelnetConfigIdentityBulk.getEncryptedWith());
            if (hVar == null || isKeyInsideCryptorForViewOnly(hVar)) {
                arrayList.add(sharedTelnetConfigIdentityBulk);
            } else {
                arrayList2.add(sharedTelnetConfigIdentityBulk);
            }
        }
        processOfSharedTelnetConfigsToRemove(arrayList);
        processCorrectSharedTelnetConfigIdentities(list, arrayList2);
        return collectRelevantTelnetConfigIdentities();
    }

    public /* synthetic */ BulkModelCreatorInteractor(hg.f fVar, BulkApiAdapter bulkApiAdapter, BulkApiAdapter bulkApiAdapter2, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? hg.f.p() : fVar, bulkApiAdapter, bulkApiAdapter2);
    }
}
