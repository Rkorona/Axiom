package com.server.auditor.ssh.client.vaults;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.contracts.w;
import com.server.auditor.ssh.client.presenters.vaults.BusinessVaultsRequestInfoPresenter;
import com.server.auditor.ssh.client.vaults.BusinessVaultsPromoRequestInfo;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.g2;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class BusinessVaultsPromoRequestInfo extends MvpAppCompatFragment implements w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f46449d = {n0.g(new g0(BusinessVaultsPromoRequestInfo.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/BusinessVaultsRequestInfoPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46450e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MoxyKtxDelegate f46451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g2 f46452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f46453c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46454a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(BusinessVaultsPromoRequestInfo businessVaultsPromoRequestInfo, View view) {
            businessVaultsPromoRequestInfo.wf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoRequestInfo.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46454a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MaterialButton materialButton = BusinessVaultsPromoRequestInfo.this.vf().f72518c;
            final BusinessVaultsPromoRequestInfo businessVaultsPromoRequestInfo = BusinessVaultsPromoRequestInfo.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusinessVaultsPromoRequestInfo.a.k(businessVaultsPromoRequestInfo, view);
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
        int f46456a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoRequestInfo.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46456a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsPromoRequestInfo.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BusinessVaultsPromoRequestInfo() {
        iu.a aVar = new iu.a() { // from class: dq.d
            @Override // iu.a
            public final Object a() {
                return BusinessVaultsPromoRequestInfo.yf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f46451a = new MoxyKtxDelegate(mvpDelegate, BusinessVaultsRequestInfoPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g2 vf() {
        g2 g2Var = this.f46452b;
        if (g2Var != null) {
            return g2Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BusinessVaultsRequestInfoPresenter wf() {
        return (BusinessVaultsRequestInfoPresenter) this.f46451a.getValue(this, f46449d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 xf(BusinessVaultsPromoRequestInfo businessVaultsPromoRequestInfo, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        businessVaultsPromoRequestInfo.wf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BusinessVaultsRequestInfoPresenter yf() {
        return new BusinessVaultsRequestInfoPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.w
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w
    public void j() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: dq.e
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BusinessVaultsPromoRequestInfo.xf(this.f47916a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f46453c = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46452b = g2.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = vf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46452b = null;
        super.onDestroyView();
    }
}
