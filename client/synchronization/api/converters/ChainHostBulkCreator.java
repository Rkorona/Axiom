package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ju.k;
import ju.r0;
import ju.t;
import tp.h;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainHostBulkCreator extends BaseBulkApiCreator<ChainHostBulk, ChainHostBulk, ChainHostBulk, ChainHostsDBModel> {
    private static final String FORMAT = "%s/%s";
    private static final String HOST_SET = "host_set";
    private static final String SSH_CONFIG_SET = "sshconfig_set";
    private final HostsDBAdapter hostDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainHostBulkCreator(HostsDBAdapter hostsDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(hostsDBAdapter, "hostDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.hostDBAdapter = hostsDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
    }

    private final ChainHostBulk create(ChainHostsDBModel chainHostsDBModel) {
        Object objPrepareSshConfigId = prepareSshConfigId(Long.valueOf(chainHostsDBModel.getSshConfigId()));
        String chainigHosts = chainHostsDBModel.getChainigHosts();
        t.e(chainigHosts, "getChainigHosts(...)");
        return new ChainHostBulk(objPrepareSshConfigId, prepareChainingHostsIds(chainigHosts), Long.valueOf(chainHostsDBModel.getIdInDatabase()), prepareIdOnServer(chainHostsDBModel.getIdOnServer()), chainHostsDBModel.getUpdatedAtTime(), chainHostsDBModel.getVaultKeyId().getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.lang.String] */
    private final List<Object> prepareChainingHostsIds(String str) {
        ArrayList<??> arrayListD = h.d(str);
        t.c(arrayListD);
        ArrayList arrayList = new ArrayList(v.z(arrayListD, 10));
        for (?? r12 : arrayListD) {
            HostsDBAdapter hostsDBAdapter = this.hostDBAdapter;
            t.c(r12);
            if (hostsDBAdapter.getItemByRemoteId(r12.longValue()) == null) {
                r0 r0Var = r0.f62955a;
                r12 = String.format(FORMAT, Arrays.copyOf(new Object[]{"host_set", r12}, 2));
                t.e(r12, "format(...)");
            }
            arrayList.add(r12);
        }
        return arrayList;
    }

    private final Object prepareSshConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        if (this.sshConfigDBAdapter.getItemByRemoteId(l10.longValue()) != null) {
            return l10;
        }
        r0 r0Var = r0.f62955a;
        String str = String.format(FORMAT, Arrays.copyOf(new Object[]{SSH_CONFIG_SET, l10}, 2));
        t.e(str, "format(...)");
        return str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public ChainHostBulk createV3(ChainHostsDBModel chainHostsDBModel) {
        t.f(chainHostsDBModel, "dbModel");
        return create(chainHostsDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public ChainHostBulk createV5(ChainHostsDBModel chainHostsDBModel) {
        t.f(chainHostsDBModel, "dbModel");
        return create(chainHostsDBModel);
    }
}
