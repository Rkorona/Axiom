package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import java.util.Iterator;
import java.util.List;
import qg.m5;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends com.google.android.material.bottomsheet.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f46657e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46658f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.navigation.n0 f46659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m5 f46661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f46662d;

    public interface a {
        void a(int i10, c0 c0Var);

        void b(int i10, c0 c0Var);

        void onCanceled();
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
        private final /* synthetic */ iu.l f46663a;

        c(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f46663a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f46663a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f46663a;
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
        final /* synthetic */ Fragment f46664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46664a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f46664a.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f46665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f46666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iu.a aVar, Fragment fragment) {
            super(0);
            this.f46665a = aVar;
            this.f46666b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f46665a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f46666b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46667a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f46667a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c0(com.server.auditor.ssh.client.navigation.n0 n0Var, a aVar) {
        ju.t.f(aVar, "callback");
        this.f46659a = n0Var;
        this.f46660b = aVar;
        this.f46662d = androidx.fragment.app.t0.b(this, ju.n0.b(InAppMessageRouterViewModel.class), new d(this), new e(null, this), new f(this));
    }

    private final m5 Af() {
        m5 m5Var = this.f46661c;
        if (m5Var != null) {
            return m5Var;
        }
        throw new IllegalStateException();
    }

    private final InAppMessageRouterViewModel Bf() {
        return (InAppMessageRouterViewModel) this.f46662d.getValue();
    }

    private final void Cf() {
        Af().f73208p.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.Df(this.f46884a, view);
            }
        });
        Af().f73205m.setOnClickListener(Gf(1));
        Af().f73195c.setOnClickListener(Gf(2));
        Af().f73204l.setOnClickListener(Gf(3));
        Af().f73202j.setOnClickListener(If(4));
        Af().f73203k.setOnClickListener(If(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(c0 c0Var, View view) {
        c0Var.dismiss();
        c0Var.f46660b.onCanceled();
    }

    private final void Ef() {
        Bf().getCustomerSurveyInAppMessages().j(getViewLifecycleOwner(), new c(new iu.l() { // from class: com.server.auditor.ssh.client.widget.z
            @Override // iu.l
            public final Object invoke(Object obj) {
                return c0.Ff(this.f46886a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Ff(c0 c0Var, List list) {
        int i10;
        if (c0Var.f46659a == null) {
            return ut.m0.f82633a;
        }
        ju.t.c(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((com.server.auditor.ssh.client.navigation.n0) it.next()).g() == c0Var.f46659a.g() && (i10 = i10 + 1) < 0) {
                    vt.v.x();
                }
            }
        } else {
            i10 = 0;
        }
        if (!(i10 > 0)) {
            c0Var.dismiss();
        }
        return ut.m0.f82633a;
    }

    private final View.OnClickListener Gf(final int i10) {
        return new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.Hf(this.f46603a, i10, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hf(c0 c0Var, int i10, View view) {
        c0Var.f46660b.a(i10, c0Var);
    }

    private final View.OnClickListener If(final int i10) {
        return new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.Jf(this.f46651a, i10, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(c0 c0Var, int i10, View view) {
        c0Var.f46660b.b(i10, c0Var);
    }

    private final void c() {
        String string;
        String string2;
        AppCompatTextView appCompatTextView = Af().f73210r;
        com.server.auditor.ssh.client.navigation.n0 n0Var = this.f46659a;
        if (n0Var == null || (string = n0Var.h()) == null) {
            string = getString(R.string.rate_us_bottom_dialog_title);
            ju.t.e(string, "getString(...)");
        }
        appCompatTextView.setText(string);
        AppCompatTextView appCompatTextView2 = Af().f73209q;
        com.server.auditor.ssh.client.navigation.n0 n0Var2 = this.f46659a;
        if (n0Var2 == null || (string2 = n0Var2.c()) == null) {
            string2 = getString(R.string.rate_us_bottom_dialog_subtitle);
            ju.t.e(string2, "getString(...)");
        }
        appCompatTextView2.setText(string2);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        this.f46660b.onCanceled();
    }

    @Override // com.google.android.material.bottomsheet.d, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        ju.t.e(dialogOnCreateDialog, "onCreateDialog(...)");
        com.google.android.material.bottomsheet.c cVar = dialogOnCreateDialog instanceof com.google.android.material.bottomsheet.c ? (com.google.android.material.bottomsheet.c) dialogOnCreateDialog : null;
        if (cVar != null) {
            cVar.i().X0(false);
            cVar.i().Y0(3);
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46661c = m5.c(getLayoutInflater());
        ConstraintLayout constraintLayoutB = Af().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46661c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Configuration configuration = requireActivity().getResources().getConfiguration();
        int dimension = (int) requireActivity().getResources().getDimension(R.dimen.max_width_view_tablet_land);
        int iA = tp.p.a(configuration.screenWidthDp);
        if (configuration.orientation != 2 || iA <= dimension || (window = requireDialog().getWindow()) == null) {
            return;
        }
        window.setLayout(dimension, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        c();
        Cf();
        Ef();
    }
}
