package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter;
import java.util.List;
import moxy.MvpBottomSheetDialogFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.p8;
import tp.s0;
import tp.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends MvpBottomSheetDialogFragment implements com.server.auditor.ssh.client.contracts.vaults.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qq.b f46607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f46609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p8 f46610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MoxyKtxDelegate f46611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46612f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f46613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ut.n f46615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final m f46616x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f46606z = {ju.n0.g(new ju.g0(a1.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/VaultsSelectorPresenter;", 0))};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f46605y = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46617a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46617a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46619a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46619a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.Sf();
            a1.this.Qf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46621a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46621a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.f46609c.U5();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46623a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f46625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f46625c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new e(this.f46625c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46623a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.f46609c.na(this.f46625c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46626a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f46628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f46628c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new f(this.f46628c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46626a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.Nf().f73575g.f73873c.setEnabled(this.f46628c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class g extends BottomSheetBehavior.g {
        g() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            ju.t.f(view, "bottomSheet");
            a1.this.f46614v = (int) (r3.f46613u + (a1.this.f46613u * f10));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            ju.t.f(view, "bottomSheet");
            a1.this.f46612f = i10;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46630a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46630a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            s0.a aVar = tp.s0.f81013a;
            Context contextRequireContext = a1.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            aVar.a(contextRequireContext);
            a1.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46632a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f46632a;
            if (i10 == 0) {
                ut.x.b(obj);
                a1.this.Mf();
                w6.y.b(a1.this.Nf().b(), new w6.b());
                a1.this.Nf().f73575g.f73872b.setVisibility(4);
                a1.this.Nf().f73576h.setVisibility(4);
                a1.this.Nf().f73575g.f73873c.setVisibility(4);
                a1.this.Nf().f73573e.setVisibility(0);
                this.f46632a = 1;
                if (wu.s0.b(2000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            a1.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46634a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46634a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.f46609c.bb();
            a1.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46636a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46636a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = a1.this.requireContext().getString(R.string.business_vaults_new_vault_link);
            ju.t.e(string, "getString(...)");
            t0.a aVar = tp.t0.f81014a;
            Context contextRequireContext = a1.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            aVar.a(contextRequireContext, "https://account.termius.com/" + string);
            a1.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46638a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f46640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List list, zt.e eVar) {
            super(2, eVar);
            this.f46640c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a1.this.new l(this.f46640c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f46638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a1.this.Pf().O(this.f46640c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class m implements gl.c {

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a1 f46643b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a1 a1Var, zt.e eVar) {
                super(2, eVar);
                this.f46643b = a1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f46643b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f46642a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f46643b.Of().S2();
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a1 f46645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ dq.z f46646c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a1 a1Var, dq.z zVar, zt.e eVar) {
                super(2, eVar);
                this.f46645b = a1Var;
                this.f46646c = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(this.f46645b, this.f46646c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f46644a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f46645b.Of().T2(this.f46646c);
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        m() {
        }

        @Override // gl.b
        public void a() {
            a1 a1Var = a1.this;
            bh.a.b(a1Var, new a(a1Var, null));
        }

        @Override // gl.c
        public void b(dq.z zVar) {
            ju.t.f(zVar, "vaultContainer");
            a1 a1Var = a1.this;
            bh.a.b(a1Var, new b(a1Var, zVar, null));
        }
    }

    public /* synthetic */ a1(qq.b bVar, boolean z10, b1 b1Var, int i10, ju.k kVar) {
        this(bVar, (i10 & 2) != 0 ? false : z10, b1Var);
    }

    private final void Kf(Dialog dialog) {
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.server.auditor.ssh.client.widget.z0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                a1.Lf(this.f46887a, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(a1 a1Var, DialogInterface dialogInterface) {
        ju.t.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.c) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            int i10 = (int) (a1Var.requireActivity().getResources().getDisplayMetrics().heightPixels * 0.5f);
            a1Var.f46613u = i10;
            a1Var.f46614v = i10;
            BottomSheetBehavior.q0(frameLayout).T0(a1Var.f46613u);
            BottomSheetBehavior.q0(frameLayout).Q0(false);
            a1Var.Uf(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        boolean z10 = Nf().f73573e.getHeight() < Nf().f73576h.getHeight();
        int height = Nf().f73576h.getHeight();
        int i10 = this.f46613u;
        boolean z11 = height > i10;
        int height2 = i10 - Nf().f73575g.b().getHeight();
        if (z10 && this.f46612f == 3) {
            Vf(Nf().f73576h.getHeight());
        } else if (z10 || z11) {
            Vf(height2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p8 Nf() {
        p8 p8Var = this.f46610d;
        if (p8Var != null) {
            return p8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VaultsSelectorPresenter Of() {
        return (VaultsSelectorPresenter) this.f46611e.getValue(this, f46606z[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dq.c0 Pf() {
        return (dq.c0) this.f46615w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf() {
        Nf().f73575g.f73873c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.Rf(this.f46871a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rf(a1 a1Var, View view) {
        a1Var.Of().R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Sf() {
        Nf().f73576h.setAdapter(Pf());
        Nf().f73576h.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VaultsSelectorPresenter Tf(a1 a1Var) {
        return new VaultsSelectorPresenter(a1Var.f46607a, a1Var.f46608b);
    }

    private final void Uf(View view) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(view);
        ju.t.e(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.c0(new g());
    }

    private final void Vf(int i10) {
        ViewGroup.LayoutParams layoutParams = Nf().f73573e.getLayoutParams();
        layoutParams.height = i10;
        Nf().f73573e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dq.c0 Wf(a1 a1Var) {
        return new dq.c0(a1Var.f46616x);
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void E3() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void Ja(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        bh.a.b(this, new e(aVar, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void Z2() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void eb(boolean z10) {
        bh.a.b(this, new f(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void me() {
        bh.a.b(this, new h(null));
    }

    @Override // com.google.android.material.bottomsheet.d, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        ju.t.e(dialogOnCreateDialog, "onCreateDialog(...)");
        Kf(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46610d = p8.c(getLayoutInflater(), viewGroup, false);
        LinearLayoutCompat linearLayoutCompatB = Nf().b();
        ju.t.e(linearLayoutCompatB, "getRoot(...)");
        return linearLayoutCompatB;
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f46610d = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void r1() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void t3() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void t4() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void y7(List list) {
        ju.t.f(list, "vaultContainers");
        bh.a.b(this, new l(list, null));
    }

    public a1(qq.b bVar, boolean z10, b1 b1Var) {
        ju.t.f(bVar, "vaultSelectorFlowData");
        ju.t.f(b1Var, "callback");
        this.f46607a = bVar;
        this.f46608b = z10;
        this.f46609c = b1Var;
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.widget.x0
            @Override // iu.a
            public final Object a() {
                return a1.Tf(this.f46883a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f46611e = new MoxyKtxDelegate(mvpDelegate, VaultsSelectorPresenter.class.getName() + ".presenter", aVar);
        this.f46615w = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.widget.y0
            @Override // iu.a
            public final Object a() {
                return a1.Wf(this.f46885a);
            }
        });
        this.f46616x = new m();
    }
}
