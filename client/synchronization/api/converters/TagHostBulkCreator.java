package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk;
import java.util.Arrays;
import ju.k;
import ju.r0;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class TagHostBulkCreator extends BaseBulkApiCreator<TagHostBulk, TagHostBulk, TagHostBulk, TagHostDBModel> {
    private static final String FORMAT = "%s/%s";
    private static final String HOST_SET = "host_set";
    private static final String TAG_SET = "tag_set";
    private final HostsDBAdapter hostDBAdapter;
    private final TagDBAdapter tagDBAdapter;
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
    public TagHostBulkCreator(HostsDBAdapter hostsDBAdapter, TagDBAdapter tagDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(hostsDBAdapter, "hostDBAdapter");
        t.f(tagDBAdapter, "tagDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.hostDBAdapter = hostsDBAdapter;
        this.tagDBAdapter = tagDBAdapter;
    }

    private final TagHostBulk create(TagHostDBModel tagHostDBModel) {
        return new TagHostBulk(prepareTagId(Long.valueOf(tagHostDBModel.getTagId())), prepareHostId(Long.valueOf(tagHostDBModel.getHostId())), Long.valueOf(tagHostDBModel.getIdInDatabase()), prepareIdOnServer(tagHostDBModel.getIdOnServer()), tagHostDBModel.getUpdatedAtTime(), tagHostDBModel.getVaultKeyId().getId());
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

    private final Object prepareTagId(Long l10) {
        if (l10 == null) {
            return null;
        }
        TagDBModel itemByLocalId = this.tagDBAdapter.getItemByLocalId(l10.longValue());
        Long lValueOf = itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null;
        if (isNotEmptyServerId(lValueOf)) {
            return lValueOf;
        }
        r0 r0Var = r0.f62955a;
        String str = String.format(FORMAT, Arrays.copyOf(new Object[]{"tag_set", l10}, 2));
        t.e(str, "format(...)");
        return str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TagHostBulk createV3(TagHostDBModel tagHostDBModel) {
        t.f(tagHostDBModel, "dbModel");
        return create(tagHostDBModel);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TagHostBulk createV5(TagHostDBModel tagHostDBModel) {
        t.f(tagHostDBModel, "dbModel");
        return create(tagHostDBModel);
    }
}
