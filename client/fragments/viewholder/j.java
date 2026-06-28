package com.server.auditor.ssh.client.fragments.viewholder;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.hostngroups.t0;
import ju.k;
import ju.t;
import qg.o5;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f27011w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f27012x = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o5 f27013v;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(int i10);

        void b(int i10);

        void onDismiss();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(o5 o5Var, final b bVar) {
        t.f(o5Var, "binding");
        t.f(bVar, "callback");
        ConstraintLayout constraintLayoutB = o5Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        this.f27013v = o5Var;
        o5Var.f73406p.setOnClickListener(new View.OnClickListener() { // from class: li.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.Y(bVar, view);
            }
        });
        o5Var.f73404n.setOnClickListener(new View.OnClickListener() { // from class: li.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.Z(bVar, view);
            }
        });
        o5Var.f73394d.setOnClickListener(new View.OnClickListener() { // from class: li.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.a0(bVar, view);
            }
        });
        o5Var.f73403m.setOnClickListener(new View.OnClickListener() { // from class: li.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.b0(bVar, view);
            }
        });
        o5Var.f73401k.setOnClickListener(new View.OnClickListener() { // from class: li.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.c0(bVar, view);
            }
        });
        o5Var.f73402l.setOnClickListener(new View.OnClickListener() { // from class: li.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.j.d0(bVar, view);
            }
        });
        o5Var.f73407q.setText(o5Var.b().getContext().getString(R.string.rate_us_bottom_dialog_subtitle));
        Drawable background = o5Var.b().getBackground();
        t.d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(b bVar, View view) {
        bVar.onDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(b bVar, View view) {
        bVar.b(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(b bVar, View view) {
        bVar.b(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(b bVar, View view) {
        bVar.b(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(b bVar, View view) {
        bVar.a(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(b bVar, View view) {
        bVar.a(5);
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void Q(t0 t0Var, boolean z10, boolean z11) {
        t.f(t0Var, "item");
    }
}
