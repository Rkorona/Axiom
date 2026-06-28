package com.server.auditor.ssh.client.fragments.viewholder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.fragments.hostngroups.s0;
import ju.t;
import qg.f5;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public h(f5 f5Var, final l0 l0Var) {
        t.f(f5Var, "binding");
        t.f(l0Var, "interactListener");
        ConstraintLayout constraintLayoutB = f5Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        f5Var.f72446c.setOnClickListener(new View.OnClickListener() { // from class: li.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.h.U(this.f64182a, l0Var, view);
            }
        });
    }

    public static void S(boolean z10, long j10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(h hVar, l0 l0Var, View view) {
        int iK = hVar.k();
        if (iK >= 0) {
            l0Var.V8(iK, new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.k
                @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
                public final void a(boolean z10, long j10) {
                    com.server.auditor.ssh.client.fragments.viewholder.h.S(z10, j10);
                }
            });
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void Q(s0 s0Var, boolean z10, boolean z11) {
        t.f(s0Var, "item");
    }
}
