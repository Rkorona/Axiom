package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulk;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.tag.TagContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class TagBulkCreator extends BaseBulkApiCreator<TagBulk, TagBulkV3, TagBulkV5, TagDBModel> {
    public static final int $stable = 8;
    private final ContentPatcher contentPatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagBulkCreator(a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.contentPatcher = contentPatcher;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TagBulkV3 createV3(TagDBModel tagDBModel) {
        t.f(tagDBModel, "dbModel");
        return new TagBulkV3(tagDBModel.getTitle(), Long.valueOf(tagDBModel.getIdInDatabase()), prepareIdOnServer(tagDBModel.getIdOnServer()), tagDBModel.getUpdatedAtTime(), tagDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public TagBulkV5 createV5(TagDBModel tagDBModel) throws JSONException {
        t.f(tagDBModel, "dbModel");
        String title = tagDBModel.getTitle();
        t.e(title, "getTitle(...)");
        TagContent tagContent = new TagContent(title, 0, 2, (k) null);
        String content = tagDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(TagContent.Companion.serializer(), tagContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new TagBulkV5(strC, Long.valueOf(tagDBModel.getIdInDatabase()), prepareIdOnServer(tagDBModel.getIdOnServer()), tagDBModel.getUpdatedAtTime(), tagDBModel.getVaultKeyId().getId());
    }
}
