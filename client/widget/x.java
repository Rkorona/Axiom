package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import java.util.Iterator;
import java.util.List;
import qg.l5;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends com.google.android.material.bottomsheet.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f46872e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46873f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.navigation.n0 f46874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l5 f46876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f46877d;

    public interface a {
        void a(x xVar);

        void b(x xVar);

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
        private final /* synthetic */ iu.l f46878a;

        c(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f46878a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f46878a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f46878a;
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
        final /* synthetic */ Fragment f46879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f46879a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f46879a.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f46880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f46881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iu.a aVar, Fragment fragment) {
            super(0);
            this.f46880a = aVar;
            this.f46881b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f46880a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f46881b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f46882a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f46882a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public x(com.server.auditor.ssh.client.navigation.n0 n0Var, a aVar) {
        ju.t.f(aVar, "callback");
        this.f46874a = n0Var;
        this.f46875b = aVar;
        this.f46877d = androidx.fragment.app.t0.b(this, ju.n0.b(InAppMessageRouterViewModel.class), new d(this), new e(null, this), new f(this));
    }

    private final InAppMessageRouterViewModel Af() {
        return (InAppMessageRouterViewModel) this.f46877d.getValue();
    }

    private final void Bf() {
        zf().f73066h.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.Cf(this.f46867a, view);
            }
        });
        zf().f73067i.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.Df(this.f46869a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(x xVar, View view) {
        xVar.f46875b.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(x xVar, View view) {
        xVar.f46875b.b(xVar);
    }

    private final void Ef() {
        Af().getCustomerSurveyInAppMessages().j(getViewLifecycleOwner(), new c(new iu.l() { // from class: com.server.auditor.ssh.client.widget.w
            @Override // iu.l
            public final Object invoke(Object obj) {
                return x.Ff(this.f46870a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Ff(x xVar, List list) {
        int i10;
        if (xVar.f46874a == null) {
            return ut.m0.f82633a;
        }
        ju.t.c(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((com.server.auditor.ssh.client.navigation.n0) it.next()).g() == xVar.f46874a.g() && (i10 = i10 + 1) < 0) {
                    vt.v.x();
                }
            }
        } else {
            i10 = 0;
        }
        if (!(i10 > 0)) {
            xVar.dismiss();
        }
        return ut.m0.f82633a;
    }

    private final l5 zf() {
        l5 l5Var = this.f46876c;
        if (l5Var != null) {
            return l5Var;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        this.f46875b.onCanceled();
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
        this.f46876c = l5.c(getLayoutInflater());
        ConstraintLayout constraintLayoutB = zf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46876c = null;
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
        zf().f73065g.setText(getString(R.string.rate_us_bottom_dialog_review_title));
        zf().f73063e.setText(getString(R.string.rate_us_bottom_dialog_review_subtitle));
        zf().f73066h.setText(getString(R.string.rate_us_leave_review));
        zf().f73067i.setText(getString(R.string.rate_us_no_thank_you));
        Bf();
        Ef();
    }
}
