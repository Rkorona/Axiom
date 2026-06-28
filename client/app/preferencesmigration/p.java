package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        sharedPreferences.edit().remove("use_new_algorithm").remove("should_send_sidebar_open_event").remove("should_send_purchase_dialog_open_event").remove("should_send_fist_terminal_connection_event").remove("should_send_fist_host_event").remove("should_send_fist_ssh_session_event").remove("should_send_fist_telnet_session_event").remove("should_send_fist_local_session_event").remove("should_send_first_group_created_event").remove("com.server.auditor.ssh.client.utils.MigrationUtils.already_migrated").apply();
    }
}
