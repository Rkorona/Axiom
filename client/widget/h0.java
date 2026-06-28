package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import java.util.Iterator;
import java.util.List;
import qg.n5;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends com.google.android.material.bottomsheet.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f46762f = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46763u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.navigation.n0 f46764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n5 f46766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f46767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46768e;

    public interface a {
        void a(String str, h0 h0Var);

        void b(h0 h0Var);

        void onCanceled();
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            h0.this.Bf().f73327j.setEnabled(!TextUtils.isEmpty(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class d implements androidx.lifecycle.l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f46770a;

        d(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f46770a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f46770a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f46770a;
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

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46771a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f46771a.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f46772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f46773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar, Fragment fragment) {
            super(0);
            this.f46772a = aVar;
            this.f46773b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f46772a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f46773b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class g extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f46774a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46774a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f46774a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public h0(com.server.auditor.ssh.client.navigation.n0 n0Var, a aVar) {
        ju.t.f(aVar, "callback");
        this.f46764a = n0Var;
        this.f46765b = aVar;
        this.f46767d = androidx.fragment.app.t0.b(this, ju.n0.b(InAppMessageRouterViewModel.class), new e(this), new f(null, this), new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n5 Bf() {
        n5 n5Var = this.f46766c;
        if (n5Var != null) {
            return n5Var;
        }
        throw new IllegalStateException();
    }

    private final InAppMessageRouterViewModel Cf() {
        return (InAppMessageRouterViewModel) this.f46767d.getValue();
    }

    private final void Df() {
        TextInputEditText textInputEditText = Bf().f73324g;
        ju.t.e(textInputEditText, "feedbackInput");
        textInputEditText.addTextChangedListener(new c());
        Bf().f73321d.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.Ef(this.f46758a, view);
            }
        });
        Bf().f73327j.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.Ff(this.f46760a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(h0 h0Var, View view) {
        h0Var.f46765b.b(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(h0 h0Var, View view) {
        a aVar = h0Var.f46765b;
        Editable text = h0Var.Bf().f73324g.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        aVar.a(string, h0Var);
        h0Var.dismiss();
    }

    private final void Gf() {
        Cf().getCustomerSurveyInAppMessages().j(getViewLifecycleOwner(), new d(new iu.l() { // from class: com.server.auditor.ssh.client.widget.e0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return h0.Hf(this.f46680a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Hf(h0 h0Var, List list) {
        int i10;
        if (h0Var.f46764a == null) {
            return ut.m0.f82633a;
        }
        ju.t.c(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((com.server.auditor.ssh.client.navigation.n0) it.next()).g() == h0Var.f46764a.g() && (i10 = i10 + 1) < 0) {
                    vt.v.x();
                }
            }
        } else {
            i10 = 0;
        }
        if (!(i10 > 0)) {
            h0Var.dismiss();
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(h0 h0Var) {
        TextInputLayout textInputLayout = h0Var.Bf().f73325h;
        ju.t.e(textInputLayout, "feedbackLayout");
        h0Var.Jf(textInputLayout);
    }

    private final void Jf(View view) {
        view.requestFocus();
        if (this.f46768e) {
            return;
        }
        tp.z.e(view);
        this.f46768e = true;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        this.f46765b.onCanceled();
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
        this.f46766c = n5.c(getLayoutInflater());
        ConstraintLayout constraintLayoutB = Bf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f46766c = null;
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

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Bf().f73325h.post(new Runnable() { // from class: com.server.auditor.ssh.client.widget.d0
            @Override // java.lang.Runnable
            public final void run() {
                h0.If(this.f46675a);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        Bf().f73326i.setText(getString(R.string.rate_us_bottom_dialog_feedback_title));
        Bf().f73322e.setText(getString(R.string.rate_us_bottom_dialog_feedback_subtitle));
        Df();
        Gf();
    }
}
