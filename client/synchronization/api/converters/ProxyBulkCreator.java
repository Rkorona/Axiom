package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.proxycommand.ProxyCommandContent;
import iu.a;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ProxyBulkCreator extends BaseBulkApiCreator<ProxyBulk, ProxyBulkV3, ProxyBulkV5, ProxyDBModel> {
    private static final String sshConfigIdPrefix = "identity_set/";
    private final ContentPatcher contentPatcher;
    private final IdentityDBAdapter identityDBAdapter;
    private final a isIdentitySynced;
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
    public ProxyBulkCreator(IdentityDBAdapter identityDBAdapter, com.server.auditor.ssh.client.app.a aVar, ContentPatcher contentPatcher, a aVar2, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(aVar2, "isIdentitySynced");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.identityDBAdapter = identityDBAdapter;
        this.contentPatcher = contentPatcher;
        this.isIdentitySynced = aVar2;
    }

    private final Object prepareIdentityId(Long l10) {
        if (l10 == null) {
            return null;
        }
        IdentityDBModel itemByRemoteId = this.identityDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return sshConfigIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public ProxyBulkV3 createV3(ProxyDBModel proxyDBModel) {
        t.f(proxyDBModel, "dbModel");
        return new ProxyBulkV3(proxyDBModel.getType(), proxyDBModel.getHost(), Integer.valueOf(proxyDBModel.getPort()), prepareIdentityId(proxyDBModel.getIdentityId()), Long.valueOf(proxyDBModel.getIdInDatabase()), prepareIdOnServer(proxyDBModel.getIdOnServer()), proxyDBModel.getUpdatedAtTime(), proxyDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public ProxyBulkV5 createV5(ProxyDBModel proxyDBModel) throws JSONException {
        t.f(proxyDBModel, "dbModel");
        String type = proxyDBModel.getType();
        t.e(type, "getType(...)");
        String host = proxyDBModel.getHost();
        t.e(host, "getHost(...)");
        ProxyCommandContent proxyCommandContent = new ProxyCommandContent(type, host, proxyDBModel.getPort(), 0, 8, (k) null);
        String content = proxyDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(ProxyCommandContent.Companion.serializer(), proxyCommandContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new ProxyBulkV5(strC, prepareIdentityId(proxyDBModel.getIdentityId()), Long.valueOf(proxyDBModel.getIdInDatabase()), prepareIdOnServer(proxyDBModel.getIdOnServer()), proxyDBModel.getUpdatedAtTime(), proxyDBModel.getVaultKeyId().getId());
    }
}
