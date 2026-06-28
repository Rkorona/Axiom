package com.server.auditor.ssh.client.vaults;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.k1;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.u;
import com.server.auditor.ssh.client.presenters.vaults.BusinessVaultsPromoPresenter;
import com.server.auditor.ssh.client.vaults.BusinessVaultsPromoFragment;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.f2;
import qu.k;
import tp.s;
import tp.t0;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class BusinessVaultsPromoFragment extends MvpAppCompatFragment implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MoxyKtxDelegate f46435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f2 f46436b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f46433d = {n0.g(new g0(BusinessVaultsPromoFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/BusinessVaultsPromoPresenter;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46432c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46434e = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46437a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(BusinessVaultsPromoFragment businessVaultsPromoFragment, View view) {
            businessVaultsPromoFragment.vf().q2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46437a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MaterialButton materialButton = BusinessVaultsPromoFragment.this.uf().f72426d;
            final BusinessVaultsPromoFragment businessVaultsPromoFragment = BusinessVaultsPromoFragment.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusinessVaultsPromoFragment.b.k(businessVaultsPromoFragment, view);
                }
            });
            s.a aVar = s.f81008a;
            String string = BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_promotion_title);
            t.e(string, "getString(...)");
            BusinessVaultsPromoFragment.this.uf().f72425c.setText(aVar.a(string, "Multiple Vaults", o1.j(rk.b.y()), o1.j(rk.b.x())));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46439a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(BusinessVaultsPromoFragment businessVaultsPromoFragment, View view) {
            businessVaultsPromoFragment.vf().s2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46439a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsPromoFragment.this.uf().f72424b.setText(BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_promotion_description_for_owner));
            BusinessVaultsPromoFragment.this.uf().f72427e.setText(BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_promotion_upgrade_label_for_owner));
            MaterialButton materialButton = BusinessVaultsPromoFragment.this.uf().f72427e;
            final BusinessVaultsPromoFragment businessVaultsPromoFragment = BusinessVaultsPromoFragment.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusinessVaultsPromoFragment.c.k(businessVaultsPromoFragment, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46441a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(BusinessVaultsPromoFragment businessVaultsPromoFragment, View view) {
            businessVaultsPromoFragment.vf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46441a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsPromoFragment.this.uf().f72424b.setText(BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_promotion_description_for_teammates));
            BusinessVaultsPromoFragment.this.uf().f72427e.setText(BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_promotion_upgrade_label_for_teammates));
            BusinessVaultsPromoFragment.this.uf().f72427e.setIcon(null);
            MaterialButton materialButton = BusinessVaultsPromoFragment.this.uf().f72427e;
            final BusinessVaultsPromoFragment businessVaultsPromoFragment = BusinessVaultsPromoFragment.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.vaults.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusinessVaultsPromoFragment.d.k(businessVaultsPromoFragment, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46443a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsPromoFragment.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46445a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = dq.c.a();
            t.e(k1VarA, "actionBusinessVaultsProm…aultsRequestSentInfo(...)");
            androidx.navigation.fragment.c.a(BusinessVaultsPromoFragment.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46447a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BusinessVaultsPromoFragment.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46447a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = BusinessVaultsPromoFragment.this.getString(R.string.business_vaults_upgrade_link);
            t.e(string, "getString(...)");
            t0.a aVar = t0.f81014a;
            Context contextRequireContext = BusinessVaultsPromoFragment.this.requireContext();
            t.e(contextRequireContext, "requireContext(...)");
            aVar.a(contextRequireContext, "https://account.termius.com/" + string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BusinessVaultsPromoFragment() {
        iu.a aVar = new iu.a() { // from class: dq.b
            @Override // iu.a
            public final Object a() {
                return BusinessVaultsPromoFragment.wf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f46435a = new MoxyKtxDelegate(mvpDelegate, BusinessVaultsPromoPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f2 uf() {
        f2 f2Var = this.f46436b;
        if (f2Var != null) {
            return f2Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BusinessVaultsPromoPresenter vf() {
        return (BusinessVaultsPromoPresenter) this.f46435a.getValue(this, f46433d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BusinessVaultsPromoPresenter wf() {
        return new BusinessVaultsPromoPresenter(null, 1, null);
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void Mb() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void Oe() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void b3() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46436b = f2.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = uf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46436b = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.u
    public void r5() {
        bh.a.b(this, new f(null));
    }
}
