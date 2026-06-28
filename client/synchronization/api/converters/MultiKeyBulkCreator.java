package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key.MultiKeyContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiKeyBulkCreator extends BaseBulkApiCreator<MultiKeyBulk, MultiKeyBulkV3, MultiKeyBulkV5, MultiKeyDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiKeyBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public MultiKeyBulkV3 createV3(MultiKeyDBModel multiKeyDBModel) {
        t.f(multiKeyDBModel, "dbModel");
        String name = multiKeyDBModel.getName();
        if (name == null) {
            name = "";
        }
        String username = multiKeyDBModel.getUsername();
        if (username == null) {
            username = "";
        }
        return new MultiKeyBulkV3(name, username, multiKeyDBModel.getIdInDatabase(), prepareIdOnServer(multiKeyDBModel.getIdOnServer()), multiKeyDBModel.getUpdatedAtTime(), multiKeyDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public MultiKeyBulkV5 createV5(MultiKeyDBModel multiKeyDBModel) throws JSONException {
        t.f(multiKeyDBModel, "dbModel");
        String name = multiKeyDBModel.getName();
        if (name == null) {
            name = "";
        }
        String username = multiKeyDBModel.getUsername();
        if (username == null) {
            username = "";
        }
        MultiKeyContent multiKeyContent = new MultiKeyContent(name, username, 0, 4, (k) null);
        String content = multiKeyDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(MultiKeyContent.Companion.serializer(), multiKeyContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new MultiKeyBulkV5(strC, multiKeyDBModel.getIdInDatabase(), prepareIdOnServer(multiKeyDBModel.getIdOnServer()), multiKeyDBModel.getUpdatedAtTime(), multiKeyDBModel.getVaultKeyId().getId());
    }
}
