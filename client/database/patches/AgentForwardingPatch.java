package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class AgentForwardingPatch extends AbsPatch {
    private static final String CONFIG = "ssh_config";
    private static final String IS_USE_AGENT_FORWARDING = "is_use_agent_forwarding";

    private void alterAgentForwardingColumns(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("alter table %s add column %s boolean default 1", "ssh_config", "is_use_agent_forwarding"));
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        alterAgentForwardingColumns(sQLiteDatabase);
    }
}
