package com.server.auditor.ssh.client.database.adapters.credentialssharing;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface;
import com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import fu.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import rg.s;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedSshConfigIdentityDBAdapter extends DbAdapterAbstract<SharedSshConfigIdentityDBModel> implements ConfigIdentityAdapterInterface<SharedSshConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSshConfigIdentityDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final SharedSshConfigIdentityDBModel findItemBySharedSshConfigId(long j10) throws IOException {
        SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel;
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and ssh_config_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                sharedSshConfigIdentityDBModel = new SharedSshConfigIdentityDBModel(cursorQuery, sVar);
            } else {
                sharedSshConfigIdentityDBModel = null;
            }
            c.a(cursorQuery, null);
            return sharedSshConfigIdentityDBModel;
        } finally {
        }
    }

    public final SharedSshConfigIdentityDBModel getBySshConfigId(long j10) {
        return findItemBySharedSshConfigId(j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return Table.SHARED_SSH_CONFIG_IDENTITY;
    }

    public final long insert(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "sharedSshConfigIdentity");
        return add(sharedSshConfigIdentityDBModel);
    }

    public final List<SharedSshConfigIdentityDBModel> listAllKindItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "identity_id=?", new String[]{String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new SharedSshConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final List<SharedSshConfigIdentityDBModel> listItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and identity_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new SharedSshConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final int removeBySshConfigId(long j10) {
        return remove("ssh_config_id=" + j10);
    }

    public final void update(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "sharedSshConfigIdentity");
        editByLocalId(sharedSshConfigIdentityDBModel.getIdInDatabase(), sharedSshConfigIdentityDBModel);
    }

    public final void updateOrInsert(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        t.f(sharedSshConfigIdentityDBModel, "sharedSshConfigIdentity");
        SharedSshConfigIdentityDBModel bySshConfigId = getBySshConfigId(sharedSshConfigIdentityDBModel.getSshConfigId());
        if (bySshConfigId == null) {
            insert(sharedSshConfigIdentityDBModel);
        } else {
            sharedSshConfigIdentityDBModel.setIdInDatabase(bySshConfigId.getIdInDatabase());
            update(sharedSshConfigIdentityDBModel);
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SharedSshConfigIdentityDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SharedSshConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SharedSshConfigIdentityDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        this.localCryptor.h();
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel = new SharedSshConfigIdentityDBModel(cursor, sVar);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.SSHCONFIG, sharedSshConfigIdentityDBModel.getIdOnServer());
        }
        return sharedSshConfigIdentityDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface
    public SharedSshConfigIdentityDBModel findModelByConfigId(long j10) {
        return findItemBySharedSshConfigId(j10);
    }
}
