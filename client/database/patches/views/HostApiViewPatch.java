package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class HostApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS host_api;");
        sQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS host_api AS SELECT hosts._id AS _id, address, hosts.title AS title, host_os, icon, interaction_date, backspace_type, ssh_config.id_on_server AS ssh_config_id, group_t.id_on_server AS group_id, hosts.id_on_server AS id_on_server FROM hosts LEFT JOIN ssh_config ON hosts.ssh_config_id = ssh_config._id LEFT JOIN group_t ON hosts.group_id = group_t._id;");
    }
}
