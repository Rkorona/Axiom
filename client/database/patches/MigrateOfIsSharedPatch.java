package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Table;
import ju.k;
import ju.t;
import su.s;

/* JADX INFO: loaded from: classes3.dex */
public final class MigrateOfIsSharedPatch extends AbsPatch {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String[] tableNamesArray = {Table.GROUP, Table.HOSTS, "ssh_config", "telnet_config", Table.MULTIKEY, "ssh_key", Table.SSH_CERTIFICATE, "identity", Table.PROXY, "package", Table.SNIPPET, "port_forwarding", Table.CHAIN_HOSTS, Table.KNOWN_HOSTS, Table.SNIPPET_HOST, Table.TAG_HOST, Table.TAG, Table.SHARED_TELNET_CONFIG_IDENTITY, Table.SHARED_SSH_CONFIG_IDENTITY};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void markEntitiesToReSync(SQLiteDatabase sQLiteDatabase) {
        for (String str : tableNamesArray) {
            sQLiteDatabase.execSQL(s.p("\n                UPDATE " + str + " SET encrypted_with = -2048 WHERE is_shared = 1 AND encrypted_with IS NULL\n                ", null, 1, null));
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        markEntitiesToReSync(sQLiteDatabase);
    }
}
