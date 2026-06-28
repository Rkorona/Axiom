package com.server.auditor.ssh.client.keymanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.keymanager.CertificatePasteScreen;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshCertificateScreenViewModel;
import com.server.auditor.ssh.client.presenters.sshkey.CertificatePastePresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.c0;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class CertificatePasteScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.sshkey.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c0 f27739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f27740b = o.a(new iu.a() { // from class: lj.c
        @Override // iu.a
        public final Object a() {
            return CertificatePasteScreen.Nf();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f27741c = new x(n0.b(CertificatePasteScreenArgs.class), new i(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f27742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e0 f27743e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f27737u = {n0.g(new g0(CertificatePasteScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/sshkey/CertificatePastePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f27736f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f27738v = 8;

    public static final class PasteCertificateResultData implements Parcelable {
        private final String certificate;
        public static final Parcelable.Creator<PasteCertificateResultData> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PasteCertificateResultData createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PasteCertificateResultData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PasteCertificateResultData[] newArray(int i10) {
                return new PasteCertificateResultData[i10];
            }
        }

        public PasteCertificateResultData(String str) {
            t.f(str, Table.SSH_CERTIFICATE);
            this.certificate = str;
        }

        public static /* synthetic */ PasteCertificateResultData copy$default(PasteCertificateResultData pasteCertificateResultData, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pasteCertificateResultData.certificate;
            }
            return pasteCertificateResultData.copy(str);
        }

        public final String component1() {
            return this.certificate;
        }

        public final PasteCertificateResultData copy(String str) {
            t.f(str, Table.SSH_CERTIFICATE);
            return new PasteCertificateResultData(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasteCertificateResultData) && t.b(this.certificate, ((PasteCertificateResultData) obj).certificate);
        }

        public final String getCertificate() {
            return this.certificate;
        }

        public int hashCode() {
            return this.certificate.hashCode();
        }

        public String toString() {
            return "PasteCertificateResultData(certificate=" + this.certificate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.certificate);
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CertificatePasteScreen.this.Ef().t2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27745a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27745a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Jf();
            CertificatePasteScreen.this.Hf();
            CertificatePasteScreen.this.Gf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27747a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27747a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Ff().sendFragmentAction(SshCertificateScreenViewModel.b.a.f34651a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27749a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27749a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Df().f72064e.setError(null);
            CertificatePasteScreen.this.Df().f72067h.setEnabled(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27751a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f27753c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new f(this.f27753c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27751a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Ff().sendFragmentAction(new SshCertificateScreenViewModel.b.C0555b(new PasteCertificateResultData(this.f27753c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27754a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27754a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Df().f72064e.setError(CertificatePasteScreen.this.getString(R.string.clipboard_is_empty_error));
            CertificatePasteScreen.this.Df().f72067h.setEnabled(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27756a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Df().f72064e.setError("Unknown format");
            CertificatePasteScreen.this.Df().f72067h.setEnabled(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class i implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f27758a;

        public i(Fragment fragment) {
            this.f27758a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f27758a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f27758a + " has null arguments");
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27759a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f27761c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new j(this.f27761c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27759a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Df().f72063d.setText(this.f27761c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27762a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27764c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27764c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return CertificatePasteScreen.this.new k(this.f27764c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27762a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            CertificatePasteScreen.this.Df().f72067h.setEnabled(this.f27764c);
            MaterialButton materialButton = CertificatePasteScreen.this.Df().f72066g;
            t.e(materialButton, "saveAnyway");
            materialButton.setVisibility(this.f27764c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public CertificatePasteScreen() {
        iu.a aVar = new iu.a() { // from class: lj.d
            @Override // iu.a
            public final Object a() {
                return CertificatePasteScreen.Mf(this.f64213a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f27742d = new MoxyKtxDelegate(mvpDelegate, CertificatePastePresenter.class.getName() + ".presenter", aVar);
    }

    private final CertificatePasteScreenArgs Cf() {
        return (CertificatePasteScreenArgs) this.f27741c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 Df() {
        c0 c0Var = this.f27739a;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CertificatePastePresenter Ef() {
        return (CertificatePastePresenter) this.f27742d.getValue(this, f27737u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshCertificateScreenViewModel Ff() {
        return (SshCertificateScreenViewModel) this.f27740b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Gf() {
        Df().f72063d.setTypeface(c4.h.h(requireContext(), R.font.ibm_plex_mono_regular));
        TextInputEditText textInputEditText = Df().f72063d;
        t.e(textInputEditText, "editForCertificate");
        textInputEditText.addTextChangedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Df().f72066g.setOnClickListener(new View.OnClickListener() { // from class: lj.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificatePasteScreen.If(this.f64218a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(CertificatePasteScreen certificatePasteScreen, View view) {
        certificatePasteScreen.Ef().u2(String.valueOf(certificatePasteScreen.Df().f72063d.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Df().f72067h.setOnClickListener(new View.OnClickListener() { // from class: lj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificatePasteScreen.Kf(this.f64217a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(CertificatePasteScreen certificatePasteScreen, View view) {
        certificatePasteScreen.Ef().v2(String.valueOf(certificatePasteScreen.Df().f72063d.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(CertificatePasteScreen certificatePasteScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        certificatePasteScreen.Ef().s2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CertificatePastePresenter Mf(CertificatePasteScreen certificatePasteScreen) {
        String certificateText = certificatePasteScreen.Cf().getCertificateText();
        t.e(certificateText, "getCertificateText(...)");
        return new CertificatePastePresenter(certificateText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SshCertificateScreenViewModel Nf() {
        SshCertificateScreenViewModel sshCertificateScreenViewModelA = SshCertificateScreenViewModel.Companion.a();
        if (sshCertificateScreenViewModelA != null) {
            return sshCertificateScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void F0(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void K2() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void a8(String str) {
        t.f(str, Table.SSH_CERTIFICATE);
        bh.a.b(this, new j(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void c() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void c5(String str) {
        t.f(str, Table.SSH_CERTIFICATE);
        bh.a.b(this, new f(str, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: lj.e
            @Override // iu.l
            public final Object invoke(Object obj) {
                return CertificatePasteScreen.Lf(this.f64215a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f27743e = e0VarB;
        if (e0VarB != null) {
            e0VarB.j(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f27739a = c0.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = Df().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f27739a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f27743e;
        if (e0Var != null) {
            e0Var.h();
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = Df().f72062c;
        t.e(constraintLayout, "contentLayout");
        g6.a2(constraintLayout, getArguments(), null, 2, null);
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void tc() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void y2() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void z1() {
        bh.a.b(this, new d(null));
    }
}
