package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.models.PackageItem;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetPackageDBAdapter extends DbAdapterAbstract<SnippetPackageDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final List<PackageItem> getAllPackageItems() {
        ArrayList arrayList = new ArrayList();
        for (SnippetPackageDBModel snippetPackageDBModel : getItemListWhichNotDeleted()) {
            String label = snippetPackageDBModel.getLabel();
            long idInDatabase = snippetPackageDBModel.getIdInDatabase();
            boolean zIsShared = snippetPackageDBModel.isShared();
            VaultKeyId vaultKeyId = snippetPackageDBModel.getVaultKeyId();
            t.e(vaultKeyId, "<get-vaultKeyId>(...)");
            arrayList.add(new PackageItem(label, idInDatabase, zIsShared, vaultKeyId, 0, 16, null));
        }
        return arrayList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "package";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetPackageDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SnippetPackageDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetPackageDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        this.localCryptor.h();
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        SnippetPackageDBModel snippetPackageDBModel = new SnippetPackageDBModel(cursor, sVar);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.SNIPPET_PACKAGE, snippetPackageDBModel.getIdOnServer());
        }
        return snippetPackageDBModel;
    }
}
