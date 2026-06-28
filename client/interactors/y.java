package com.server.auditor.ssh.client.interactors;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.d f27686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mv.b f27687b;

    public y(hg.d dVar, mv.b bVar) {
        ju.t.f(dVar, "keyValueRepository");
        ju.t.f(bVar, "jsonConverter");
        this.f27686a = dVar;
        this.f27687b = bVar;
    }

    private final List c() {
        List<Integer> list = null;
        try {
            String string = this.f27686a.getString("key_notifications_forced_action_ids", null);
            if (string == null) {
                string = "";
            }
            mv.b bVar = this.f27687b;
            bVar.a();
            list = ((InAppMessageForceActionIds) bVar.b(InAppMessageForceActionIds.Companion.serializer(), string)).getList();
        } catch (ClassCastException | IllegalArgumentException | NullPointerException unused) {
        }
        return list == null ? vt.v.o() : list;
    }

    private final void d(List list) {
        String strC;
        InAppMessageForceActionIds inAppMessageForceActionIds = new InAppMessageForceActionIds(list);
        try {
            mv.b bVar = this.f27687b;
            bVar.a();
            strC = bVar.c(InAppMessageForceActionIds.Companion.serializer(), inAppMessageForceActionIds);
        } catch (IllegalArgumentException unused) {
            strC = null;
        }
        if (strC == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f27686a.edit();
        editorEdit.putString("key_notifications_forced_action_ids", strC);
        editorEdit.apply();
    }

    public final boolean a(int i10) {
        return c().contains(Integer.valueOf(i10));
    }

    public final void b(int i10) {
        if (a(i10)) {
            return;
        }
        List listG1 = vt.v.g1(c());
        listG1.add(Integer.valueOf(i10));
        d(listG1);
    }
}
