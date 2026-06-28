package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import fu.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import rg.s;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class SshConfigIdentityDBAdapter extends DbAdapterAbstract<SshConfigIdentityDBModel> implements ConfigIdentityAdapterInterface<SshConfigIdentityDBModel> {
    private static final String TABLE = "ssh_config_identity";
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
    public SshConfigIdentityDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final SshConfigIdentityDBModel findItemBySshConfigId(long j10) throws IOException {
        SshConfigIdentityDBModel sshConfigIdentityDBModel;
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and ssh_config_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                sshConfigIdentityDBModel = new SshConfigIdentityDBModel(cursorQuery, sVar);
            } else {
                sshConfigIdentityDBModel = null;
            }
            c.a(cursorQuery, null);
            return sshConfigIdentityDBModel;
        } finally {
        }
    }

    public final SshConfigIdentityDBModel getBySshConfigId(long j10) {
        return findItemBySshConfigId(j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "ssh_config_identity";
    }

    public final long insert(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        t.f(sshConfigIdentityDBModel, "sshConfigIdentity");
        return add(sshConfigIdentityDBModel);
    }

    public final List<SshConfigIdentityDBModel> listItemsByIdentityId(long j10) throws IOException {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "status!=? and identity_id=?", new String[]{"2", String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return v.o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                s sVar = this.localCryptor;
                t.e(sVar, "localCryptor");
                arrayList.add(new SshConfigIdentityDBModel(cursorQuery, sVar));
            }
            c.a(cursorQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final int removeBySshConfigId(long j10) {
        return remove("ssh_config_id=" + j10);
    }

    public final void update(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        t.f(sshConfigIdentityDBModel, "sshConfigIdentity");
        editByLocalId(sshConfigIdentityDBModel.getIdInDatabase(), sshConfigIdentityDBModel);
    }

    public final void updateOrInsert(SshConfigIdentityDBModel sshConfigIdentityDBModel) {
        t.f(sshConfigIdentityDBModel, "sshConfigIdentity");
        SshConfigIdentityDBModel bySshConfigId = getBySshConfigId(sshConfigIdentityDBModel.getSshConfigId());
        if (bySshConfigId == null) {
            insert(sshConfigIdentityDBModel);
        } else {
            sshConfigIdentityDBModel.setIdInDatabase(bySshConfigId.getIdInDatabase());
            update(sshConfigIdentityDBModel);
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshConfigIdentityDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SshConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshConfigIdentityDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SshConfigIdentityDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.ConfigIdentityAdapterInterface
    public SshConfigIdentityDBModel findModelByConfigId(long j10) {
        return findItemBySshConfigId(j10);
    }
}
