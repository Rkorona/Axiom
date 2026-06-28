package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.knownhost.KnownHostContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class KnownHostBulkCreator extends BaseBulkApiCreator<KnownHostBulk, KnownHostBulkV3, KnownHostBulkV5, KnownHostsDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnownHostBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public KnownHostBulkV3 createV3(KnownHostsDBModel knownHostsDBModel) {
        t.f(knownHostsDBModel, "dbModel");
        return new KnownHostBulkV3(knownHostsDBModel.getHostname(), knownHostsDBModel.getPublicKey(), Long.valueOf(knownHostsDBModel.getIdInDatabase()), prepareIdOnServer(knownHostsDBModel.getIdOnServer()), knownHostsDBModel.getUpdatedAtTime(), knownHostsDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public KnownHostBulkV5 createV5(KnownHostsDBModel knownHostsDBModel) throws JSONException {
        t.f(knownHostsDBModel, "dbModel");
        String hostname = knownHostsDBModel.getHostname();
        t.e(hostname, "getHostname(...)");
        String publicKey = knownHostsDBModel.getPublicKey();
        t.e(publicKey, "getPublicKey(...)");
        KnownHostContent knownHostContent = new KnownHostContent(hostname, publicKey, 0, 4, (k) null);
        String content = knownHostsDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(KnownHostContent.Companion.serializer(), knownHostContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new KnownHostBulkV5(strC, Long.valueOf(knownHostsDBModel.getIdInDatabase()), prepareIdOnServer(knownHostsDBModel.getIdOnServer()), knownHostsDBModel.getUpdatedAtTime(), knownHostsDBModel.getVaultKeyId().getId());
    }
}
