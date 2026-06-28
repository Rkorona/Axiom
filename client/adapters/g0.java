package com.server.auditor.ssh.client.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;
import java.util.ArrayList;
import qg.k8;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f21311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f21312e;

    public interface a {
        void a(long j10);
    }

    public static final class b extends androidx.vectordrawable.graphics.drawable.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.models.x f21314c;

        b(com.server.auditor.ssh.client.models.x xVar) {
            this.f21314c = xVar;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            g0.this.f21311d.a(this.f21314c.c());
        }
    }

    public g0(a aVar) {
        ju.t.f(aVar, "onProviderClickListener");
        this.f21311d = aVar;
        this.f21312e = new ArrayList();
        I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(androidx.vectordrawable.graphics.drawable.c cVar, AppCompatImageView appCompatImageView, View view) {
        if (cVar != null) {
            appCompatImageView.setImageDrawable(cVar);
            cVar.start();
        }
    }

    public final ArrayList N() {
        return this.f21312e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void z(com.server.auditor.ssh.client.navigation.a aVar, int i10) {
        ju.t.f(aVar, "holder");
        k8 k8VarQ = aVar.Q();
        Context context = k8VarQ.b().getContext();
        Object obj = this.f21312e.get(i10);
        ju.t.e(obj, "get(...)");
        com.server.auditor.ssh.client.models.x xVar = (com.server.auditor.ssh.client.models.x) obj;
        final AppCompatImageView appCompatImageView = k8VarQ.f72993d;
        ju.t.e(appCompatImageView, "twoFactorProviderIcon");
        appCompatImageView.setImageDrawable(null);
        final androidx.vectordrawable.graphics.drawable.c cVarB = androidx.vectordrawable.graphics.drawable.c.b(context, R.drawable.ic_animated_checkmark);
        if (cVarB != null) {
            cVarB.d(new b(xVar));
        }
        appCompatImageView.setBackground(androidx.core.content.a.getDrawable(context, xVar.b()));
        k8VarQ.f72994e.setText(context.getString(xVar.d()));
        k8VarQ.f72992c.setText(context.getString(xVar.a()));
        k8VarQ.b().setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.P(cVarB, appCompatImageView, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public com.server.auditor.ssh.client.navigation.a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        k8 k8VarC = k8.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(k8VarC, "inflate(...)");
        return new com.server.auditor.ssh.client.navigation.a(k8VarC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21312e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long j(int i10) {
        try {
            return ((com.server.auditor.ssh.client.models.x) this.f21312e.get(i10)).c();
        } catch (IndexOutOfBoundsException unused) {
            return -1L;
        }
    }
}
