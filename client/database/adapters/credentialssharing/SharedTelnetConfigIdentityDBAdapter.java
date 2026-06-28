package com.server.auditor.ssh.client.database.adapters.credentialssharing;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface;
import com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import fu.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import rg.s;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedTelnetConfigIdentityDBAdapter extends DbAdapterAbstract<SharedTelnetConfigIdentityDBModel> implements ConfigIdentityAdapterInterface<SharedTelnetConfigIdentityDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTelnetConfigIdentityDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final SharedTelnetConfigIdentityDBModel findItemBySharedTelnetConfigId(long j10) throws IOException {
        SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel;
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and telnet_config_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                sharedTelnetConfigIdentityDBModel = new SharedTelnetConfigIdentityDBModel(cursorQuery, sVar);
            } else {
                sharedTelnetConfigIdentityDBModel = null;
            }
            c.a(cursorQuery, null);
            return sharedTelnetConfigIdentityDBModel;
        } finally {
        }
    }

    public final SharedTelnetConfigIdentityDBModel getByTelnetConfigId(long j10) {
        return findItemBySharedTelnetConfigId(j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return Table.SHARED_TELNET_CONFIG_IDENTITY;
    }

    public final long insert(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        t.f(sharedTelnetConfigIdentityDBModel, "sharedTelnetConfigIdentity");
        return add(sharedTelnetConfigIdentityDBModel);
    }

    public final List<SharedTelnetConfigIdentityDBModel> listAllKindItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "identity_id=?", new String[]{String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new SharedTelnetConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final List<SharedTelnetConfigIdentityDBModel> listItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and identity_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new SharedTelnetConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final int removeByTelnetConfigId(long j10) {
        return remove("telnet_config_id=" + j10);
    }

    public final void update(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        t.f(sharedTelnetConfigIdentityDBModel, "sharedTelnetConfigIdentity");
        editByLocalId(sharedTelnetConfigIdentityDBModel.getIdInDatabase(), sharedTelnetConfigIdentityDBModel);
    }

    public final void updateOrInsert(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        t.f(sharedTelnetConfigIdentityDBModel, "sharedTelnetConfigIdentity");
        SharedTelnetConfigIdentityDBModel byTelnetConfigId = getByTelnetConfigId(sharedTelnetConfigIdentityDBModel.getTelnetConfigId());
        if (byTelnetConfigId == null) {
            insert(sharedTelnetConfigIdentityDBModel);
        } else {
            sharedTelnetConfigIdentityDBModel.setIdInDatabase(byTelnetConfigId.getIdInDatabase());
            update(sharedTelnetConfigIdentityDBModel);
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SharedTelnetConfigIdentityDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SharedTelnetConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SharedTelnetConfigIdentityDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        this.localCryptor.h();
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = new SharedTelnetConfigIdentityDBModel(cursor, sVar);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.TELNET_CONFIG, sharedTelnetConfigIdentityDBModel.getIdOnServer());
        }
        return sharedTelnetConfigIdentityDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface
    public SharedTelnetConfigIdentityDBModel findModelByConfigId(long j10) {
        return findItemBySharedTelnetConfigId(j10);
    }
}
