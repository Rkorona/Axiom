package com.server.auditor.ssh.client.navigation.ui.compose;

import android.view.Menu;
import android.view.MenuItem;
import com.server.auditor.ssh.client.navigation.ui.compose.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final a.b a(Menu menu, int i10, String str, Integer num) {
        ju.t.f(menu, "<this>");
        ju.t.f(str, "text");
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            if (!menuItemFindItem.isVisible()) {
                menuItemFindItem = null;
            }
            if (menuItemFindItem != null) {
                return new a.b(i10, str, num);
            }
        }
        return null;
    }

    public static /* synthetic */ a.b b(Menu menu, int i10, String str, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return a(menu, i10, str, num);
    }

    public static final boolean c(List list, int i10) {
        ju.t.f(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) list.get(i11);
            if ((aVar instanceof a.b) && ((a.b) aVar).b() == i10) {
                return true;
            }
        }
        return false;
    }
}
