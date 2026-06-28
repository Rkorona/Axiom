package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContent;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.h7;
import iu.p;
import java.util.Iterator;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.m;
import mv.b;
import np.k;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;
import su.s;
import tp.d1;
import ut.m0;
import ut.x;
import wu.i0;
import wu.j;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeHosts extends BulkDataMergeService<HostFullData> {
    public static final int $stable = 8;
    private final GroupDBAdapter groupDBAdapter;
    private final vl.a hostInteractionDaoRepository;
    private final HostsDBAdapter hostsDBAdapter;
    private final b jsonConverter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.merge.BulkMergeHosts$deleteItems$1, reason: invalid class name */
    @f(c = "com.server.auditor.ssh.client.synchronization.merge.BulkMergeHosts$deleteItems$1", f = "BulkMergeHosts.kt", l = {161}, m = "invokeSuspend")
    static final class AnonymousClass1 extends m implements p {
        final /* synthetic */ long $remoteId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j10, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$remoteId = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e<m0> create(Object obj, e<?> eVar) {
            return BulkMergeHosts.this.new AnonymousClass1(this.$remoteId, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.label;
            if (i10 == 0) {
                x.b(obj);
                vl.a aVar = BulkMergeHosts.this.hostInteractionDaoRepository;
                long j10 = this.$remoteId;
                this.label = 1;
                if (aVar.c(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e<? super m0> eVar) {
            return ((AnonymousClass1) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeHosts(h hVar, v vVar, HostsDBAdapter hostsDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, vl.a aVar, b bVar) {
        super(hVar, vVar, HostFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(groupDBAdapter, "groupDBAdapter");
        t.f(aVar, "hostInteractionDaoRepository");
        t.f(bVar, "jsonConverter");
        this.hostsDBAdapter = hostsDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.groupDBAdapter = groupDBAdapter;
        this.hostInteractionDaoRepository = aVar;
        this.jsonConverter = bVar;
    }

    private final HostIconUtil.OsModelType readOsModelType(String str) {
        if (str == null || s.m0(str)) {
            return HostIconUtil.OsModelType.none;
        }
        try {
            return HostIconUtil.OsModelType.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return HostIconUtil.OsModelType.none;
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getHosts().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            j.b(null, new AnonymousClass1(jLongValue, null), 1, null);
            this.hostsDBAdapter.removeItemByRemoteId(jLongValue);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(HostFullData hostFullData) throws po.a {
        HostDBModel hostDBModel;
        GroupDBModel itemByRemoteId;
        t.f(hostFullData, "item");
        String str = hostFullData.content;
        Object[] objArr = str != null;
        WithRecourseId sshConfig = hostFullData.getSshConfig();
        WithRecourseId telnetConfig = hostFullData.getTelnetConfig();
        WithRecourseId group = hostFullData.getGroup();
        HostDBModel itemByRemoteId2 = null;
        if (objArr == true) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    HostContent hostContent = (HostContent) bVar.b(HostContent.Companion.serializer(), str2);
                    hostDBModel = new HostDBModel(hostContent.getLabel(), hostContent.getAddress());
                    hostDBModel.setOsModelType(readOsModelType(hostContent.getOsName()));
                    hostDBModel.setInteractionDate(d1.a(hostContent.getInteractionDate()));
                    hostDBModel.setBackspaceType(Boolean.valueOf(t.b(hostContent.getBackspace(), HostContentKt.BACKSPACE_TYPE_LEGACY)));
                    hostDBModel.setContent(str);
                    hostDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                io.sentry.f fVarB = y9.b.b("HostFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(HostContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(hostFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            hostDBModel = new HostDBModel(hostFullData.label, hostFullData.address);
            hostDBModel.setOsModelType(readOsModelType(hostFullData.getOsName()));
            hostDBModel.setInteractionDate(d1.a(hostFullData.getInteractionDate()));
            hostDBModel.setBackspaceType(Boolean.valueOf(t.b(hostFullData.getBackspaceType(), HostContentKt.BACKSPACE_TYPE_LEGACY)));
        }
        if (sshConfig != null) {
            SshRemoteConfigDBModel itemByRemoteId3 = this.sshConfigDBAdapter.getItemByRemoteId(sshConfig.getId());
            hostDBModel.setSshConfigId(itemByRemoteId3 != null ? Long.valueOf(itemByRemoteId3.getIdInDatabase()) : null);
        } else {
            hostDBModel.resetSshConfigId();
        }
        if (telnetConfig != null) {
            TelnetRemoteConfigDBModel itemByRemoteId4 = this.telnetConfigDBAdapter.getItemByRemoteId(telnetConfig.getId());
            hostDBModel.setTelnetConfigId(itemByRemoteId4 != null ? Long.valueOf(itemByRemoteId4.getIdInDatabase()) : null);
        } else {
            hostDBModel.resetTelnetConfigId();
        }
        if (group == null || (itemByRemoteId = this.groupDBAdapter.getItemByRemoteId(group.getId())) == null) {
            hostDBModel.resetGroupId();
        } else {
            hostDBModel.setGroupId(Long.valueOf(itemByRemoteId.getIdInDatabase()));
        }
        hostDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(hostFullData.getEncryptedWith()));
        hostDBModel.setIdOnServer(hostFullData.getId());
        hostDBModel.setUpdatedAtTime(hostFullData.getUpdatedAt());
        hostDBModel.setShared(t.b(hostFullData.getShared(), Boolean.TRUE));
        hostDBModel.setCredentialsMode(hostFullData.credentialsMode);
        Long localId = hostFullData.getLocalId();
        if (localId != null) {
            itemByRemoteId2 = this.hostsDBAdapter.getItemByLocalId(localId.longValue());
        } else if (hostFullData.getId() >= 0) {
            itemByRemoteId2 = this.hostsDBAdapter.getItemByRemoteId(hostFullData.getId());
        }
        if (itemByRemoteId2 != null && hostDBModel.isShared() && hostDBModel.getCredentialsMode() == null) {
            hostDBModel.setCredentialsMode(itemByRemoteId2.getCredentialsMode());
        }
        hostDBModel.setStatus(0);
        if (localId == null) {
            this.hostsDBAdapter.editByRemoteId(hostFullData.getId(), hostDBModel);
        } else {
            hostDBModel.setIdInDatabase(localId.longValue());
            this.hostsDBAdapter.editByLocalId(localId.longValue(), hostDBModel);
        }
    }
}
