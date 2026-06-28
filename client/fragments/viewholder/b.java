package com.server.auditor.ssh.client.fragments.viewholder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.fragments.hostngroups.u0;
import ju.t;
import qg.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l f26996v;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(l lVar, final iu.a aVar) {
        t.f(lVar, "binding");
        t.f(aVar, "onClick");
        ConstraintLayout constraintLayoutB = lVar.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        this.f26996v = lVar;
        this.f10534a.setOnClickListener(new View.OnClickListener() { // from class: li.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.b.T(aVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(iu.a aVar, View view) {
        aVar.a();
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void Q(u0 u0Var, boolean z10, boolean z11) {
        t.f(u0Var, "item");
    }
}
