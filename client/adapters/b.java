package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.adapters.b;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.c;
import io.split.android.client.dtos.SerializableEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends RecyclerView.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0318b f21261f = new C0318b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21262g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iu.a f21263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.server.auditor.ssh.client.models.c f21264e;

    public final class a extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final qg.i f21265u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b f21266v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, qg.i iVar, final iu.a aVar) {
            super(iVar.b());
            ju.t.f(iVar, "binding");
            ju.t.f(aVar, "onRetryClicked");
            this.f21266v = bVar;
            this.f21265u = iVar;
            iVar.f72681f.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.R(aVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void R(iu.a aVar, View view) {
            aVar.a();
        }

        public final void S(com.server.auditor.ssh.client.models.c cVar) {
            ju.t.f(cVar, "fetchingState");
            if (ju.t.b(cVar, c.a.f27898a)) {
                ProgressBar progressBar = this.f21265u.f72678c;
                ju.t.e(progressBar, "contentLoadingProgress");
                progressBar.setVisibility(8);
                AppCompatImageView appCompatImageView = this.f21265u.f72680e;
                ju.t.e(appCompatImageView, Column.ICON);
                appCompatImageView.setVisibility(8);
                AppCompatTextView appCompatTextView = this.f21265u.f72679d;
                ju.t.e(appCompatTextView, "description");
                appCompatTextView.setVisibility(8);
                MaterialButton materialButton = this.f21265u.f72681f;
                ju.t.e(materialButton, "tryAgainButton");
                materialButton.setVisibility(8);
                return;
            }
            if (ju.t.b(cVar, c.b.f27899a)) {
                ProgressBar progressBar2 = this.f21265u.f72678c;
                ju.t.e(progressBar2, "contentLoadingProgress");
                progressBar2.setVisibility(8);
                AppCompatImageView appCompatImageView2 = this.f21265u.f72680e;
                ju.t.e(appCompatImageView2, Column.ICON);
                appCompatImageView2.setVisibility(0);
                AppCompatTextView appCompatTextView2 = this.f21265u.f72679d;
                ju.t.e(appCompatTextView2, "description");
                appCompatTextView2.setVisibility(0);
                MaterialButton materialButton2 = this.f21265u.f72681f;
                ju.t.e(materialButton2, "tryAgainButton");
                materialButton2.setVisibility(0);
                return;
            }
            if (!ju.t.b(cVar, c.C0447c.f27900a)) {
                throw new ut.s();
            }
            AppCompatImageView appCompatImageView3 = this.f21265u.f72680e;
            ju.t.e(appCompatImageView3, Column.ICON);
            appCompatImageView3.setVisibility(8);
            AppCompatTextView appCompatTextView3 = this.f21265u.f72679d;
            ju.t.e(appCompatTextView3, "description");
            appCompatTextView3.setVisibility(8);
            MaterialButton materialButton3 = this.f21265u.f72681f;
            ju.t.e(materialButton3, "tryAgainButton");
            materialButton3.setVisibility(8);
            ProgressBar progressBar3 = this.f21265u.f72678c;
            ju.t.e(progressBar3, "contentLoadingProgress");
            progressBar3.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.adapters.b$b, reason: collision with other inner class name */
    public static final class C0318b {
        public /* synthetic */ C0318b(ju.k kVar) {
            this();
        }

        private C0318b() {
        }
    }

    public b(iu.a aVar) {
        ju.t.f(aVar, "onRetryClicked");
        this.f21263d = aVar;
        this.f21264e = c.C0447c.f27900a;
    }

    private final boolean L(com.server.auditor.ssh.client.models.c cVar) {
        return (cVar instanceof c.C0447c) || (cVar instanceof c.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(a aVar, int i10) {
        ju.t.f(aVar, "holder");
        aVar.S(this.f21264e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public a B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        qg.i iVarC = qg.i.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(iVarC, "inflate(...)");
        return new a(this, iVarC, this.f21263d);
    }

    public final void O(com.server.auditor.ssh.client.models.c cVar) {
        ju.t.f(cVar, SerializableEvent.VALUE_FIELD);
        if (ju.t.b(this.f21264e, cVar)) {
            return;
        }
        boolean zL = L(this.f21264e);
        boolean zL2 = L(cVar);
        if (zL && !zL2) {
            x(0);
        } else if (zL2 && !zL) {
            r(0);
        } else if (zL && zL2) {
            o();
        }
        this.f21264e = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return L(this.f21264e) ? 1 : 0;
    }
}
