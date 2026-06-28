package com.server.auditor.ssh.client.adapters;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends RecyclerView.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f21275f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21276g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.models.d f21277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final iu.a f21278e;

    public final class a extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final qg.j f21279u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final Context f21280v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ d f21281w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, qg.j jVar, final iu.a aVar) {
            super(jVar.b());
            ju.t.f(jVar, "binding");
            ju.t.f(aVar, "onGetTermiusClicked");
            this.f21281w = dVar;
            this.f21279u = jVar;
            this.f21280v = jVar.b().getContext();
            jVar.f72791e.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.R(aVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void R(iu.a aVar, View view) {
            aVar.a();
        }

        public final void S() {
            if (this.f21281w.f21277d.a()) {
                this.f21279u.f72790d.setImageDrawable(androidx.core.content.a.getDrawable(this.f21280v, R.drawable.ic_desktop_and_android_static));
            }
        }

        public final void T() {
            Drawable drawable = this.f21279u.f72790d.getDrawable();
            Animatable animatableB = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
            if (animatableB == null) {
                animatableB = androidx.vectordrawable.graphics.drawable.c.b(this.f21280v, R.drawable.ic_animated_desktop_and_mobile);
            }
            if (animatableB == null) {
                return;
            }
            if (animatableB.isRunning()) {
                animatableB.stop();
            }
            animatableB.start();
            this.f21281w.f21277d.b(true);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public d(com.server.auditor.ssh.client.models.d dVar, iu.a aVar) {
        ju.t.f(dVar, "activeDevicesHeaderState");
        ju.t.f(aVar, "onGetTermiusClicked");
        this.f21277d = dVar;
        this.f21278e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i10) {
        ju.t.f(aVar, "holder");
        aVar.S();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void A(a aVar, int i10, List list) {
        ju.t.f(aVar, "holder");
        ju.t.f(list, "payloads");
        if (list.isEmpty()) {
            super.A(aVar, i10, list);
        }
        if (list.contains("AnimateEventPayload")) {
            aVar.T();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        qg.j jVarC = qg.j.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(jVarC, "inflate(...)");
        return new a(this, jVarC, this.f21278e);
    }

    public final void P() {
        q(0, "AnimateEventPayload");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return 1;
    }
}
