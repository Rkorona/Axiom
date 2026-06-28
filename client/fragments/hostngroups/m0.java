package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.Context;
import android.view.Menu;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {
    public static final List a(Context context, Menu menu) {
        ju.t.f(context, "context");
        ju.t.f(menu, "menu");
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.identities_context_menu_item_select_identities);
        ju.t.e(string, "getString(...)");
        Integer numValueOf = Integer.valueOf(R.drawable.ic_select_all);
        a.b bVarA = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.select_identities, string, numValueOf);
        if (bVarA != null) {
            arrayList.add(bVarA);
        }
        String string2 = context.getString(R.string.identities_context_menu_item_select_ssh_keys);
        ju.t.e(string2, "getString(...)");
        a.b bVarA2 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.select_ssh_keys, string2, numValueOf);
        if (bVarA2 != null) {
            arrayList.add(bVarA2);
        }
        ArrayList arrayList2 = new ArrayList();
        String string3 = context.getString(R.string.move_to_vault_option);
        ju.t.e(string3, "getString(...)");
        a.b bVarA3 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.move_to_vault, string3, Integer.valueOf(R.drawable.ic_move_to_vault));
        if (bVarA3 != null) {
            arrayList2.add(bVarA3);
        }
        String string4 = context.getString(R.string.copy_to_vault_option);
        ju.t.e(string4, "getString(...)");
        a.b bVarA4 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.copy_to_vault, string4, Integer.valueOf(R.drawable.copy_vault_action_icon));
        if (bVarA4 != null) {
            arrayList2.add(bVarA4);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(a.C0462a.f30215a);
            arrayList.addAll(arrayList2);
        }
        String string5 = context.getString(R.string.edit);
        ju.t.e(string5, "getString(...)");
        a.b bVarB = com.server.auditor.ssh.client.navigation.ui.compose.b.b(menu, R.id.edit, string5, null, 4, null);
        if (bVarB != null) {
            arrayList.add(bVarB);
        }
        ArrayList arrayList3 = new ArrayList();
        String string6 = context.getString(R.string.remove);
        ju.t.e(string6, "getString(...)");
        a.b bVarA5 = com.server.auditor.ssh.client.navigation.ui.compose.b.a(menu, R.id.delete, string6, Integer.valueOf(R.drawable.ic_remove));
        if (bVarA5 != null) {
            arrayList3.add(bVarA5);
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(a.C0462a.f30215a);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
