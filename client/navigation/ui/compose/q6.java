package com.server.auditor.ssh.client.navigation.ui.compose;

import io.split.android.client.dtos.SerializableEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q6 {
    public static final Object a(androidx.navigation.d0 d0Var, String str, androidx.compose.runtime.m mVar, int i10) {
        ju.t.f(d0Var, "<this>");
        ju.t.f(str, SerializableEvent.KEY_FIELD);
        mVar.W(-1742609238);
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.b0(-1742609238, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.consumeSavedState (NavBackStackEntryExtensions.kt:15)");
        }
        mVar.W(5004770);
        boolean zV = mVar.V(d0Var);
        Object objD = mVar.D();
        if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
            objD = d0Var.j().c(str);
            d0Var.j().f(str);
            mVar.t(objD);
        }
        mVar.Q();
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.a0();
        }
        mVar.Q();
        return objD;
    }
}
