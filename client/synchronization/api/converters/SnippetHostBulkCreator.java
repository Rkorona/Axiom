package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk;
import java.util.Arrays;
import ju.k;
import ju.r0;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetHostBulkCreator extends BaseBulkApiCreator<SnippetHostBulk, SnippetHostBulk, SnippetHostBulk, SnippetHostDBModel> {
    private static final String FORMAT = "%s/%s";
    private static final String HOST_SET = "host_set";
    private static final String SNIPPET_SET = "snippet_set";
    private final HostsDBAdapter hostDBAdapter;
    private final SnippetDBAdapter snippetDBAdapter;
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
    public SnippetHostBulkCreator(HostsDBAdapter hostsDBAdapter, SnippetDBAdapter snippetDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(hostsDBAdapter, "hostDBAdapter");
        t.f(snippetDBAdapter, "snippetDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.hostDBAdapter = hostsDBAdapter;
        this.snippetDBAdapter = snippetDBAdapter;
    }

    private final SnippetHostBulk create(SnippetHostDBModel snippetHostDBModel) {
        return new SnippetHostBulk(prepareSnippetId(Long.valueOf(snippetHostDBModel.getSnippetId())), prepareHostId(Long.valueOf(snippetHostDBModel.getHostId())), Long.valueOf(snippetHostDBModel.getIdInDatabase()), prepareIdOnServer(snippetHostDBModel.getIdOnServer()), snippetHostDBModel.getUpdatedAtTime(), snippetHostDBModel.getVaultKeyId().getId());
    }

    private final boolean isNotEmptyServerId(Long l10) {
        return l10 == null || -1 != l10.longValue();
    }

    private final Object prepareHostId(Long l10) {
        if (l10 == null) {
            return null;
        }
        HostDBModel itemByLocalId = this.hostDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        r0 r0Var = r0.f62955a;
        String str = String.format(FORMAT, Arrays.copyOf(new Object[]{"host_set", l10}, 2));
        t.e(str, "format(...)");
        return str;
    }

    private final Object prepareSnippetId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SnippetDBModel itemByLocalId = this.snippetDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        r0 r0Var = r0.f62955a;
        String str = String.format(FORMAT, Arrays.copyOf(new Object[]{"snippet_set", l10}, 2));
        t.e(str, "format(...)");
        return str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SnippetHostBulk createV3(SnippetHostDBModel snippetHostDBModel) {
        t.f(snippetHostDBModel, "dbModel");
        return create(snippetHostDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public SnippetHostBulk createV5(SnippetHostDBModel snippetHostDBModel) {
        t.f(snippetHostDBModel, "dbModel");
        return create(snippetHostDBModel);
    }
}
