package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.Context;
import android.view.Menu;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    public static final List a(Context context, Menu menu) {
        ju.t.f(context, "context");
        ju.t.f(menu, "menu");
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.select_all);
        ju.t.e(string, "getString(...)");
        a.b bVarA = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.select_all, string, Integer.valueOf(R.drawable.ic_select_all));
        if (bVarA != null) {
            arrayList.add(bVarA);
        }
        String string2 = context.getString(R.string.connect);
        ju.t.e(string2, "getString(...)");
        a.b bVarA2 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.connect, string2, Integer.valueOf(R.drawable.ic_connect));
        if (bVarA2 != null) {
            arrayList.add(bVarA2);
        }
        String string3 = context.getString(R.string.connect_via_sftp);
        ju.t.e(string3, "getString(...)");
        a.b bVarA3 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.connect_via_sftp, string3, Integer.valueOf(R.drawable.ic_sftp_file_folder));
        if (bVarA3 != null) {
            arrayList.add(bVarA3);
        }
        String string4 = context.getString(R.string.disconnect);
        ju.t.e(string4, "getString(...)");
        a.b bVarA4 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.close_host, string4, Integer.valueOf(R.drawable.ic_disconnect));
        if (bVarA4 != null) {
            arrayList.add(bVarA4);
        }
        ArrayList arrayList2 = new ArrayList();
        String string5 = context.getString(R.string.move_to_vault_option);
        ju.t.e(string5, "getString(...)");
        a.b bVarA5 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.move_to_vault, string5, Integer.valueOf(R.drawable.ic_move_to_vault));
        if (bVarA5 != null) {
            arrayList2.add(bVarA5);
        }
        String string6 = context.getString(R.string.copy_to_vault_option);
        ju.t.e(string6, "getString(...)");
        a.b bVarA6 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.copy_to_vault, string6, Integer.valueOf(R.drawable.copy_vault_action_icon));
        if (bVarA6 != null) {
            arrayList2.add(bVarA6);
        }
        String string7 = context.getString(R.string.move_to);
        ju.t.e(string7, "getString(...)");
        a.b bVarA7 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.change_group, string7, Integer.valueOf(R.drawable.ic_move_to_group));
        if (bVarA7 != null) {
            arrayList2.add(bVarA7);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(a.C0462a.f30215a);
            arrayList.addAll(arrayList2);
        }
        String string8 = context.getString(R.string.edit);
        ju.t.e(string8, "getString(...)");
        a.b bVarB = com.server.auditor.ssh.client.navigation.ui.compose.b.b(menu, R.id.edit, string8, null, 4, null);
        if (bVarB != null) {
            arrayList.add(bVarB);
        }
        ArrayList arrayList3 = new ArrayList();
        String string9 = context.getString(R.string.duplicate);
        ju.t.e(string9, "getString(...)");
        a.b bVarA8 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.duplicate, string9, Integer.valueOf(R.drawable.ic_duplicate));
        if (bVarA8 != null) {
            arrayList3.add(bVarA8);
        }
        String string10 = context.getString(R.string.remove);
        ju.t.e(string10, "getString(...)");
        a.b bVarA9 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.delete, string10, Integer.valueOf(R.drawable.ic_remove));
        if (bVarA9 != null) {
            arrayList3.add(bVarA9);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(a.C0462a.f30215a);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
