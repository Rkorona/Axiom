package com.server.auditor.ssh.client.vaults;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.s1;
import com.server.auditor.ssh.client.presenters.MultikeyPromotionPresenter;
import com.server.auditor.ssh.client.vaults.MultikeyPromotionFragment;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.h2;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class MultikeyPromotionFragment extends MvpAppCompatFragment implements s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ k[] f46458c = {n0.g(new g0(MultikeyPromotionFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/MultikeyPromotionPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46459d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MoxyKtxDelegate f46460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2 f46461b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46462a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(MultikeyPromotionFragment multikeyPromotionFragment, View view) {
            multikeyPromotionFragment.vf().q2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(MultikeyPromotionFragment multikeyPromotionFragment, View view) {
            multikeyPromotionFragment.vf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MultikeyPromotionFragment.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46462a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = MultikeyPromotionFragment.this.uf().f72601b;
            final MultikeyPromotionFragment multikeyPromotionFragment = MultikeyPromotionFragment.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultikeyPromotionFragment.a.l(multikeyPromotionFragment, view);
                }
            });
            MaterialButton materialButton = MultikeyPromotionFragment.this.uf().f72602c;
            final MultikeyPromotionFragment multikeyPromotionFragment2 = MultikeyPromotionFragment.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultikeyPromotionFragment.a.m(multikeyPromotionFragment2, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46464a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MultikeyPromotionFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46464a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MultikeyPromotionFragment.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46466a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MultikeyPromotionFragment.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46466a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Intent intent = new Intent("android.intent.action.VIEW");
            String string = MultikeyPromotionFragment.this.getString(R.string.credentials_sharing_link_learn_more_multikey);
            t.e(string, "getString(...)");
            intent.setData(Uri.parse(string));
            MultikeyPromotionFragment.this.startActivity(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public MultikeyPromotionFragment() {
        iu.a aVar = new iu.a() { // from class: dq.o
            @Override // iu.a
            public final Object a() {
                return MultikeyPromotionFragment.wf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f46460a = new MoxyKtxDelegate(mvpDelegate, MultikeyPromotionPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h2 uf() {
        h2 h2Var = this.f46461b;
        if (h2Var != null) {
            return h2Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultikeyPromotionPresenter vf() {
        return (MultikeyPromotionPresenter) this.f46460a.getValue(this, f46458c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultikeyPromotionPresenter wf() {
        return new MultikeyPromotionPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.s1
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.s1
    public void da() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.s1
    public void j() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46461b = h2.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = uf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46461b = null;
        super.onDestroyView();
    }
}
