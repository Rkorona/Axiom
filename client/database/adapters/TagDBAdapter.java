package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TagDBAdapter extends DbAdapterAbstract<TagDBModel> {
    private static final String TABLE = "tags";

    public TagDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    private TagDBModel createTagModel(String str, VaultKeyId vaultKeyId) {
        TagDBModel tagDBModel = new TagDBModel(str);
        tagDBModel.setVaultKeyId(vaultKeyId);
        tagDBModel.setShared(!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId));
        tagDBModel.setIdInDatabase(add(tagDBModel));
        return tagDBModel;
    }

    public List<TagDBModel> createTagIfNeeded(List<String> list, final VaultKeyId vaultKeyId) {
        return (List) list.stream().map(new Function() { // from class: com.server.auditor.ssh.client.database.adapters.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f23541a.lambda$createTagIfNeeded$0(vaultKeyId, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    public List<com.server.auditor.ssh.client.models.s> getAllTagsItems() {
        ArrayList arrayList = new ArrayList();
        Iterator<TagDBModel> it = getItemListWhichNotDeleted().iterator();
        while (it.hasNext()) {
            arrayList.add(new com.server.auditor.ssh.client.models.s(it.next().getTitle()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: getOrCreateByLabel, reason: merged with bridge method [inline-methods] */
    public TagDBModel lambda$createTagIfNeeded$0(String str, VaultKeyId vaultKeyId) {
        TagDBModel tagByLabelAndVault = getTagByLabelAndVault(str, vaultKeyId);
        return tagByLabelAndVault != null ? tagByLabelAndVault : createTagModel(str, vaultKeyId);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "tags";
    }

    public TagDBModel getTagByLabelAndVault(String str, VaultKeyId vaultKeyId) {
        for (TagDBModel tagDBModel : getItemListWhichNotDeleted()) {
            if (Objects.equals(tagDBModel.getTitle(), str) && tagDBModel.getVaultKeyId().equals(vaultKeyId)) {
                return tagDBModel;
            }
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TagDBModel createItemFromCursor(Cursor cursor) {
        return new TagDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TagDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        TagDBModel tagDBModel = new TagDBModel(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.TAG, tagDBModel.getIdOnServer());
        }
        return tagDBModel;
    }
}
