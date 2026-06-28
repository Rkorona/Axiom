package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import java.util.Iterator;
import java.util.List;
import qg.p5;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends com.google.android.material.bottomsheet.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f46787e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46788f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.navigation.n0 f46789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p5 f46791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f46792d;

    public interface a {
        void a(k0 k0Var);
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c implements androidx.lifecycle.l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f46793a;

        c(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f46793a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f46793a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f46793a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class d extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46794a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f46794a.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f46795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f46796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iu.a aVar, Fragment fragment) {
            super(0);
            this.f46795a = aVar;
            this.f46796b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f46795a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f46796b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46797a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f46797a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public k0(com.server.auditor.ssh.client.navigation.n0 n0Var, a aVar) {
        ju.t.f(aVar, "callback");
        this.f46789a = n0Var;
        this.f46790b = aVar;
        this.f46792d = androidx.fragment.app.t0.b(this, ju.n0.b(InAppMessageRouterViewModel.class), new d(this), new e(null, this), new f(this));
    }

    private final void Af() {
        yf().f73527c.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.Bf(this.f46784a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(k0 k0Var, View view) {
        k0Var.f46790b.a(k0Var);
    }

    private final void Cf() {
        zf().getCustomerSurveyInAppMessages().j(getViewLifecycleOwner(), new c(new iu.l() { // from class: com.server.auditor.ssh.client.widget.j0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return k0.Df(this.f46786a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Df(k0 k0Var, List list) {
        int i10;
        if (k0Var.f46789a == null) {
            return ut.m0.f82633a;
        }
        ju.t.c(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((com.server.auditor.ssh.client.navigation.n0) it.next()).g() == k0Var.f46789a.g() && (i10 = i10 + 1) < 0) {
                    vt.v.x();
                }
            }
        } else {
            i10 = 0;
        }
        if (!(i10 > 0)) {
            k0Var.dismiss();
        }
        return ut.m0.f82633a;
    }

    private final p5 yf() {
        p5 p5Var = this.f46791c;
        if (p5Var != null) {
            return p5Var;
        }
        throw new IllegalArgumentException();
    }

    private final InAppMessageRouterViewModel zf() {
        return (InAppMessageRouterViewModel) this.f46792d.getValue();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        this.f46790b.a(this);
    }

    @Override // com.google.android.material.bottomsheet.d, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        ju.t.e(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46791c = p5.c(getLayoutInflater());
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46791c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        yf().f73531g.setText(getString(R.string.rate_us_thanks_for_feedback_title));
        yf().f73529e.setText(getString(R.string.rate_us_thanks_for_feedback_message));
        Af();
        Cf();
    }
}
