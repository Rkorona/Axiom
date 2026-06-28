package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import android.text.TextUtils;
import cj.b;
import com.crystalnix.termius.libtermius.Keygen;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.List;
import lj.y;
import rg.s;
import u9.a;

/* JADX INFO: loaded from: classes3.dex */
public class SshKeyDBAdapter extends DbAdapterAbstract<SshKeyDBModel> {
    public static final String TABLE = "ssh_key";
    private final b detectKeyTypeInteractor;

    public SshKeyDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        this.detectKeyTypeInteractor = new b();
    }

    public List<SshKeyDBModel> getSshKeysWithSpecificTitle(String str) {
        return getItemList("title = ? AND status != 2", new String[]{str});
    }

    public List<SshKeyDBModel> getSshKeysWithSpecificTitleRegex(String str) {
        return getItemList("title REGEXP ? AND status != 2", new String[]{str});
    }

    public SshKeyDBModel getStorageKeysByLabel(String str) {
        List<SshKeyDBModel> itemList = getItemList(String.format("%s=?", "title"), new String[]{str});
        if (itemList.size() == 1) {
            return itemList.get(0);
        }
        return null;
    }

    public List<y> getStorageKeysItemListView() {
        ArrayList arrayList = new ArrayList();
        List<SshKeyDBModel> itemListWhichNotDeleted = getItemListWhichNotDeleted();
        ArrayList<SshKeyDBModel> arrayList2 = new ArrayList();
        try {
            for (SshKeyDBModel sshKeyDBModel : itemListWhichNotDeleted) {
                String privateKey = sshKeyDBModel.getPrivateKey();
                if (TextUtils.isEmpty(sshKeyDBModel.getKeyType()) && !TextUtils.isEmpty(privateKey)) {
                    u9.a aVarB = this.detectKeyTypeInteractor.b(Keygen.getKeyTypeFromPrivateKey(privateKey));
                    if (!(aVarB instanceof a.e)) {
                        sshKeyDBModel.setKeyType(aVarB.a());
                        arrayList2.add(sshKeyDBModel);
                    }
                }
                arrayList.add(new y(sshKeyDBModel));
            }
            for (SshKeyDBModel sshKeyDBModel2 : arrayList2) {
                editByLocalId(sshKeyDBModel2.getIdInDatabase(), sshKeyDBModel2);
            }
        } catch (Exception e10) {
            y9.a.f86838a.i(e10);
        }
        return arrayList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "ssh_key";
    }

    public boolean isSshKeyExists(String str) {
        return !getSshKeysWithSpecificTitle(str).isEmpty();
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshKeyDBModel createItemFromCursor(Cursor cursor) {
        return new SshKeyDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshKeyDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        SshKeyDBModel sshKeyDBModel = new SshKeyDBModel(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.PRIVATE_KEY, sshKeyDBModel.getIdOnServer());
        }
        return sshKeyDBModel;
    }
}
