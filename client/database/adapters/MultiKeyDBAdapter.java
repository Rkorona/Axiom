package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.keymanager.SshMultiKeyItem;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiKeyDBAdapter extends DbAdapterAbstract<MultiKeyDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiKeyDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final List<SshMultiKeyItem> getItemsForBaseAdapter(String str) {
        t.f(str, "teamName");
        List<MultiKeyDBModel> itemListWhichNotDeleted = getItemListWhichNotDeleted();
        t.c(itemListWhichNotDeleted);
        ArrayList arrayList = new ArrayList();
        for (MultiKeyDBModel multiKeyDBModel : itemListWhichNotDeleted) {
            SshMultiKeyItem.b bVar = SshMultiKeyItem.Companion;
            t.c(multiKeyDBModel);
            SshMultiKeyItem sshMultiKeyItemA = bVar.a(multiKeyDBModel, str);
            if (sshMultiKeyItemA != null) {
                arrayList.add(sshMultiKeyItemA);
            }
        }
        return arrayList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return Table.MULTIKEY;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public MultiKeyDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "c");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new MultiKeyDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public MultiKeyDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "c");
        this.localCryptor.h();
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        MultiKeyDBModel multiKeyDBModel = new MultiKeyDBModel(cursor, sVar);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.MULTI_KEY, multiKeyDBModel.getIdOnServer());
        }
        return multiKeyDBModel;
    }
}
