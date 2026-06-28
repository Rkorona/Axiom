package com.server.auditor.ssh.client.fragments.connection;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.a6;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements c, l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24696d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24697e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a6 f24698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ei.p f24700c;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public r(a6 a6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(a6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24698a = a6Var;
        this.f24699b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r rVar, View view) {
        rVar.f24698a.f71901h.setVisibility(4);
        rVar.f24698a.f71902i.setVisibility(0);
        rVar.f24699b.q3();
    }

    private final void d(View view) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.3f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.3f, 1.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(1);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(1000L);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setRepeatMode(1);
        objectAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        ei.p pVar = this.f24700c;
        if (pVar == null) {
            ju.t.t("hardwarePasskeysAdapter");
            pVar = null;
        }
        pVar.o();
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean Ga(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public void V8(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        NewConnectionFlowPresenter newConnectionFlowPresenter = this.f24699b;
        ei.p pVar = this.f24700c;
        if (pVar == null) {
            ju.t.t("hardwarePasskeysAdapter");
            pVar = null;
        }
        newConnectionFlowPresenter.y3(pVar.j(i10));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        Context context = this.f24698a.b().getContext();
        this.f24700c = new ei.p(this);
        ei.p pVar = null;
        this.f24698a.f71898e.setItemAnimator(null);
        RecyclerView recyclerView = this.f24698a.f71898e;
        ei.p pVar2 = this.f24700c;
        if (pVar2 == null) {
            ju.t.t("hardwarePasskeysAdapter");
        } else {
            pVar = pVar2;
        }
        recyclerView.setAdapter(pVar);
        this.f24698a.f71898e.setLayoutManager(new LinearLayoutManager(context));
        this.f24698a.f71903j.setOnClickListener(new View.OnClickListener() { // from class: gh.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.r.b(this.f51285a, view);
            }
        });
        AppCompatImageView appCompatImageView = this.f24698a.f71904k;
        ju.t.e(appCompatImageView, "smallCircle");
        d(appCompatImageView);
        AppCompatImageView appCompatImageView2 = this.f24698a.f71895b;
        ju.t.e(appCompatImageView2, "bigCircle");
        d(appCompatImageView2);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.n nVar) {
        ju.t.f(nVar, "step");
        ei.p pVar = this.f24700c;
        if (pVar == null) {
            ju.t.t("hardwarePasskeysAdapter");
            pVar = null;
        }
        pVar.N(nVar.a());
        this.f24698a.f71901h.setVisibility(0);
        this.f24698a.f71902i.setVisibility(4);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        ei.p pVar = this.f24700c;
        if (pVar == null) {
            ju.t.t("hardwarePasskeysAdapter");
            pVar = null;
        }
        pVar.o();
    }
}
