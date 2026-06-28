package com.server.auditor.ssh.client.fragments;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.ConfirmAccessPopUpViewModel;
import com.server.auditor.ssh.client.navigation.n0;
import i5.a;
import qg.q0;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.google.android.material.bottomsheet.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f24275e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24276f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f24277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0388a f24278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q0 f24279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f24280d;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.a$a, reason: collision with other inner class name */
    public interface InterfaceC0388a {
        void a(n0 n0Var);

        void b(n0 n0Var);

        void c(n0 n0Var);
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends com.google.android.material.bottomsheet.c {
        c(Context context, int i10) {
            super(context, i10);
        }

        @Override // androidx.activity.q, android.app.Dialog
        public void onBackPressed() {
        }
    }

    static final class d implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f24281a;

        d(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f24281a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f24281a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f24281a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f24282a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment a() {
            return this.f24282a;
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f24283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar) {
            super(0);
            this.f24283a = aVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n1 a() {
            return (n1) this.f24283a.a();
        }
    }

    public static final class g extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ut.n f24284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ut.n nVar) {
            super(0);
            this.f24284a = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return t0.c(this.f24284a).getViewModelStore();
        }
    }

    public static final class h extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f24285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ut.n f24286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, ut.n nVar) {
            super(0);
            this.f24285a = aVar;
            this.f24286b = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f24285a;
            if (aVar2 != null && (aVar = (i5.a) aVar2.a()) != null) {
                return aVar;
            }
            n1 n1VarC = t0.c(this.f24286b);
            androidx.lifecycle.o oVar = n1VarC instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) n1VarC : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.b.f55949c;
        }
    }

    public a(n0 n0Var, InterfaceC0388a interfaceC0388a) {
        ju.t.f(n0Var, "inAppMessage");
        ju.t.f(interfaceC0388a, "callback");
        this.f24277a = n0Var;
        this.f24278b = interfaceC0388a;
        iu.a aVar = new iu.a() { // from class: ch.n
            @Override // iu.a
            public final Object a() {
                return com.server.auditor.ssh.client.fragments.a.Of(this.f15570a);
            }
        };
        ut.n nVarB = ut.o.b(ut.r.f82639c, new f(new e(this)));
        this.f24280d = t0.b(this, ju.n0.b(ConfirmAccessPopUpViewModel.class), new g(nVarB), new h(null, nVarB), aVar);
    }

    private final ConfirmAccessPopUpViewModel Bf() {
        return (ConfirmAccessPopUpViewModel) this.f24280d.getValue();
    }

    private final void Cf() {
        q0 q0Var = this.f24279c;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        q0Var.f73593b.setVisibility(8);
        q0 q0Var2 = this.f24279c;
        if (q0Var2 == null) {
            ju.t.t("binding");
            q0Var2 = null;
        }
        q0Var2.f73593b.setText((CharSequence) null);
    }

    private final void Df() {
        q0 q0Var = this.f24279c;
        q0 q0Var2 = null;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        q0Var.f73595d.setOnClickListener(new View.OnClickListener() { // from class: ch.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.a.Ef(this.f15542a, view);
            }
        });
        q0 q0Var3 = this.f24279c;
        if (q0Var3 == null) {
            ju.t.t("binding");
            q0Var3 = null;
        }
        q0Var3.f73603l.setOnClickListener(new View.OnClickListener() { // from class: ch.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.a.Ff(this.f15549a, view);
            }
        });
        q0 q0Var4 = this.f24279c;
        if (q0Var4 == null) {
            ju.t.t("binding");
        } else {
            q0Var2 = q0Var4;
        }
        q0Var2.f73595d.setOnCompleteListener(new iu.a() { // from class: ch.l
            @Override // iu.a
            public final Object a() {
                return com.server.auditor.ssh.client.fragments.a.Gf(this.f15556a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(a aVar, View view) {
        aVar.Bf().confirmAccessToTeamMember();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(a aVar, View view) {
        aVar.Bf().sendNotificationSnoozedEvent();
        aVar.f24278b.b(aVar.f24277a);
        aVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gf(a aVar) {
        aVar.f24278b.a(aVar.f24277a);
        aVar.dismiss();
        return m0.f82633a;
    }

    private final void Hf() {
        Bf().getUiState().j(this, new d(new iu.l() { // from class: ch.m
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.fragments.a.If(this.f15564a, (ConfirmAccessPopUpViewModel.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 If(a aVar, ConfirmAccessPopUpViewModel.b bVar) {
        if (ju.t.b(bVar, ConfirmAccessPopUpViewModel.b.e.f23870a)) {
            aVar.Lf(true);
            aVar.t(false);
            aVar.Cf();
        } else if (bVar instanceof ConfirmAccessPopUpViewModel.b.f) {
            aVar.Lf(false);
            aVar.t(true);
            aVar.Nf(((ConfirmAccessPopUpViewModel.b.f) bVar).a());
            aVar.Cf();
        } else if (bVar instanceof ConfirmAccessPopUpViewModel.b.d) {
            aVar.Lf(false);
            aVar.t(false);
            aVar.showErrorMessage(((ConfirmAccessPopUpViewModel.b.d) bVar).a());
        } else {
            q0 q0Var = null;
            if (bVar instanceof ConfirmAccessPopUpViewModel.b.a) {
                aVar.Mf(true);
                q0 q0Var2 = aVar.f24279c;
                if (q0Var2 == null) {
                    ju.t.t("binding");
                } else {
                    q0Var = q0Var2;
                }
                q0Var.f73595d.setDefaultButtonState();
                aVar.showErrorMessage(((ConfirmAccessPopUpViewModel.b.a) bVar).a());
            } else if (ju.t.b(bVar, ConfirmAccessPopUpViewModel.b.C0382b.f23867a)) {
                aVar.Mf(false);
                q0 q0Var3 = aVar.f24279c;
                if (q0Var3 == null) {
                    ju.t.t("binding");
                } else {
                    q0Var = q0Var3;
                }
                q0Var.f73595d.setCompleteButtonState(false);
                aVar.Cf();
            } else {
                if (!ju.t.b(bVar, ConfirmAccessPopUpViewModel.b.c.f23868a)) {
                    throw new ut.s();
                }
                aVar.Mf(false);
                q0 q0Var4 = aVar.f24279c;
                if (q0Var4 == null) {
                    ju.t.t("binding");
                } else {
                    q0Var = q0Var4;
                }
                q0Var.f73595d.setIndeterminateButtonState();
                aVar.Cf();
            }
        }
        return m0.f82633a;
    }

    private final void Jf(Uri uri, int i10, String str) {
        q0 q0Var = null;
        if (uri != null) {
            q0 q0Var2 = this.f24279c;
            if (q0Var2 == null) {
                ju.t.t("binding");
                q0Var2 = null;
            }
            q0Var2.f73602k.setImageURI(uri, getContext());
            q0 q0Var3 = this.f24279c;
            if (q0Var3 == null) {
                ju.t.t("binding");
            } else {
                q0Var = q0Var3;
            }
            q0Var.f73597f.setVisibility(8);
            return;
        }
        q0 q0Var4 = this.f24279c;
        if (q0Var4 == null) {
            ju.t.t("binding");
            q0Var4 = null;
        }
        q0Var4.f73597f.setText(str);
        q0 q0Var5 = this.f24279c;
        if (q0Var5 == null) {
            ju.t.t("binding");
            q0Var5 = null;
        }
        q0Var5.f73597f.setVisibility(0);
        q0 q0Var6 = this.f24279c;
        if (q0Var6 == null) {
            ju.t.t("binding");
        } else {
            q0Var = q0Var6;
        }
        q0Var.f73602k.setActualImageResource(i10);
    }

    private final void Kf(Configuration configuration) {
        int dimension = (int) getResources().getDimension(R.dimen.confirm_access_pop_up_landscape_width);
        int iA = tp.p.a(configuration.screenWidthDp);
        if (configuration.orientation != 2 || iA <= dimension) {
            dimension = iA;
        }
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setLayout(dimension, -1);
        }
    }

    private final void Lf(boolean z10) {
        q0 q0Var = this.f24279c;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        ProgressBar progressBar = q0Var.f73601j;
        ju.t.e(progressBar, "memberEmailProgress");
        progressBar.setVisibility(z10 ? 0 : 8);
    }

    private final void Mf(boolean z10) {
        q0 q0Var = this.f24279c;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        MaterialButton materialButton = q0Var.f73603l;
        ju.t.e(materialButton, "remindLaterButton");
        materialButton.setVisibility(z10 ? 0 : 8);
    }

    private final void Nf(ch.o oVar) {
        String strG = oVar.g();
        q0 q0Var = null;
        if (su.s.m0(strG)) {
            strG = null;
        }
        q0 q0Var2 = this.f24279c;
        if (q0Var2 == null) {
            ju.t.t("binding");
            q0Var2 = null;
        }
        q0Var2.f73606o.setText(strG != null ? strG : oVar.i());
        q0 q0Var3 = this.f24279c;
        if (q0Var3 == null) {
            ju.t.t("binding");
            q0Var3 = null;
        }
        q0Var3.f73605n.setText(oVar.i());
        q0 q0Var4 = this.f24279c;
        if (q0Var4 == null) {
            ju.t.t("binding");
        } else {
            q0Var = q0Var4;
        }
        AppCompatTextView appCompatTextView = q0Var.f73605n;
        ju.t.e(appCompatTextView, "subtitle");
        appCompatTextView.setVisibility(strG == null || su.s.m0(strG) ? 8 : 0);
        Jf(oVar.e(), oVar.c(), oVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1.c Of(a aVar) {
        Application application = aVar.requireActivity().getApplication();
        ju.t.e(application, "getApplication(...)");
        return new ch.p(application, aVar.f24277a);
    }

    private final void a() {
        Hf();
        Df();
    }

    private final void showErrorMessage(String str) {
        q0 q0Var = this.f24279c;
        q0 q0Var2 = null;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        q0Var.f73593b.setText(str);
        q0 q0Var3 = this.f24279c;
        if (q0Var3 == null) {
            ju.t.t("binding");
        } else {
            q0Var2 = q0Var3;
        }
        q0Var2.f73593b.setVisibility(0);
    }

    private final void t(boolean z10) {
        q0 q0Var = this.f24279c;
        if (q0Var == null) {
            ju.t.t("binding");
            q0Var = null;
        }
        q0Var.f73595d.setEnabled(z10);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ju.t.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Kf(configuration);
    }

    @Override // com.google.android.material.bottomsheet.d, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        c cVar = new c(requireContext(), getTheme());
        cVar.setCancelable(false);
        cVar.setCanceledOnTouchOutside(false);
        BottomSheetBehavior bottomSheetBehaviorI = cVar.i();
        ju.t.e(bottomSheetBehaviorI, "getBehavior(...)");
        bottomSheetBehaviorI.L0(false);
        bottomSheetBehaviorI.Q0(false);
        bottomSheetBehaviorI.X0(false);
        bottomSheetBehaviorI.Y0(3);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        q0 q0VarC = q0.c(getLayoutInflater());
        this.f24279c = q0VarC;
        if (q0VarC == null) {
            ju.t.t("binding");
            q0VarC = null;
        }
        ConstraintLayout constraintLayoutB = q0VarC.b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        this.f24278b.c(this.f24277a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (com.server.auditor.ssh.client.app.a.N().o0() || !com.server.auditor.ssh.client.app.a.N().j()) {
            dismiss();
            return;
        }
        Configuration configuration = requireActivity().getResources().getConfiguration();
        ju.t.e(configuration, "getConfiguration(...)");
        Kf(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        a();
    }
}
