package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import fu.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import rg.s;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class TelnetConfigIdentityDBAdapter extends DbAdapterAbstract<TelnetConfigIdentityDBModel> implements ConfigIdentityAdapterInterface<TelnetConfigIdentityDBModel> {
    private static final String TABLE = "telnet_config_identity";
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelnetConfigIdentityDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final TelnetConfigIdentityDBModel findItemByTelnetConfigId(long j10) throws IOException {
        TelnetConfigIdentityDBModel telnetConfigIdentityDBModel;
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and telnet_config_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                telnetConfigIdentityDBModel = new TelnetConfigIdentityDBModel(cursorQuery, sVar);
            } else {
                telnetConfigIdentityDBModel = null;
            }
            c.a(cursorQuery, null);
            return telnetConfigIdentityDBModel;
        } finally {
        }
    }

    public final TelnetConfigIdentityDBModel getByTelnetConfigId(long j10) {
        return findItemByTelnetConfigId(j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "telnet_config_identity";
    }

    public final long insert(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "telnetConfigIdentity");
        return add(telnetConfigIdentityDBModel);
    }

    public final List<TelnetConfigIdentityDBModel> listItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and identity_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new TelnetConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final int removeByTelnetConfigId(long j10) {
        return remove("telnet_config_id=" + j10);
    }

    public final void update(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "sshConfigIdentity");
        editByLocalId(telnetConfigIdentityDBModel.getIdInDatabase(), telnetConfigIdentityDBModel);
    }

    public final void updateOrInsert(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel) {
        t.f(telnetConfigIdentityDBModel, "telnetConfigIdentity");
        TelnetConfigIdentityDBModel byTelnetConfigId = getByTelnetConfigId(telnetConfigIdentityDBModel.getTelnetConfigId());
        if (byTelnetConfigId == null) {
            insert(telnetConfigIdentityDBModel);
        } else {
            telnetConfigIdentityDBModel.setIdInDatabase(byTelnetConfigId.getIdInDatabase());
            update(telnetConfigIdentityDBModel);
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TelnetConfigIdentityDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new TelnetConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TelnetConfigIdentityDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new TelnetConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface
    public TelnetConfigIdentityDBModel findModelByConfigId(long j10) {
        return findItemByTelnetConfigId(j10);
    }
}
