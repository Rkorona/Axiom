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
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.keymanager.SshPrivateKeyPasteScreen;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SshKeyPasteScreenViewModel;
import com.server.auditor.ssh.client.presenters.sshkey.SshPrivateKeyPastePresenter;
import io.split.android.client.dtos.SerializableEvent;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.n7;
import ut.m0;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class SshPrivateKeyPasteScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.sshkey.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n7 f27819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f27820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ut.n f27821c = o.a(new iu.a() { // from class: lj.c0
        @Override // iu.a
        public final Object a() {
            return SshPrivateKeyPasteScreen.Pf();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f27822d = new x(n0.b(SshPrivateKeyPasteScreenArgs.class), new j(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MoxyKtxDelegate f27823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e0 f27824f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f27817v = {n0.g(new g0(SshPrivateKeyPasteScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/sshkey/SshPrivateKeyPastePresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f27816u = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f27818w = 8;

    public static final class PastePrivateKeyResultData implements Parcelable {
        private final String privateKey;
        private final String publicKey;
        public static final Parcelable.Creator<PastePrivateKeyResultData> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PastePrivateKeyResultData createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PastePrivateKeyResultData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PastePrivateKeyResultData[] newArray(int i10) {
                return new PastePrivateKeyResultData[i10];
            }
        }

        public PastePrivateKeyResultData(String str, String str2) {
            t.f(str, Column.KEY_PRIVATE);
            this.privateKey = str;
            this.publicKey = str2;
        }

        public static /* synthetic */ PastePrivateKeyResultData copy$default(PastePrivateKeyResultData pastePrivateKeyResultData, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pastePrivateKeyResultData.privateKey;
            }
            if ((i10 & 2) != 0) {
                str2 = pastePrivateKeyResultData.publicKey;
            }
            return pastePrivateKeyResultData.copy(str, str2);
        }

        public final String component1() {
            return this.privateKey;
        }

        public final String component2() {
            return this.publicKey;
        }

        public final PastePrivateKeyResultData copy(String str, String str2) {
            t.f(str, Column.KEY_PRIVATE);
            return new PastePrivateKeyResultData(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PastePrivateKeyResultData)) {
                return false;
            }
            PastePrivateKeyResultData pastePrivateKeyResultData = (PastePrivateKeyResultData) obj;
            return t.b(this.privateKey, pastePrivateKeyResultData.privateKey) && t.b(this.publicKey, pastePrivateKeyResultData.publicKey);
        }

        public final String getPrivateKey() {
            return this.privateKey;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public int hashCode() {
            int iHashCode = this.privateKey.hashCode() * 31;
            String str = this.publicKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PastePrivateKeyResultData(privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.privateKey);
            parcel.writeString(this.publicKey);
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27825a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27825a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Ff().f73334d.setError(null);
            SshPrivateKeyPasteScreen.this.Ff().f73338h.setEnabled(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27827a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27827a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AlertDialog alertDialog = SshPrivateKeyPasteScreen.this.f27820b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            SshPrivateKeyPasteScreen.this.f27820b = null;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SshPrivateKeyPasteScreen.this.Gf().v2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27830a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Lf();
            SshPrivateKeyPasteScreen.this.Jf();
            SshPrivateKeyPasteScreen.this.If();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27832a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27832a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Hf().sendFragmentAction(SshKeyPasteScreenViewModel.b.a.f34803a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27834a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27837d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f27836c = str;
            this.f27837d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new g(this.f27836c, this.f27837d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Hf().sendFragmentAction(new SshKeyPasteScreenViewModel.b.C0561b(new PastePrivateKeyResultData(this.f27836c, this.f27837d)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27838a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27838a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Ff().f73334d.setError(SshPrivateKeyPasteScreen.this.getString(R.string.clipboard_is_empty_error));
            SshPrivateKeyPasteScreen.this.Ff().f73338h.setEnabled(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27840a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27840a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen sshPrivateKeyPasteScreen = SshPrivateKeyPasteScreen.this;
            Context contextRequireContext = SshPrivateKeyPasteScreen.this.requireContext();
            t.e(contextRequireContext, "requireContext(...)");
            sshPrivateKeyPasteScreen.f27820b = new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.validating_continuation_title).create();
            AlertDialog alertDialog = SshPrivateKeyPasteScreen.this.f27820b;
            if (alertDialog != null) {
                alertDialog.show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class j implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f27842a;

        public j(Fragment fragment) {
            this.f27842a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f27842a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f27842a + " has null arguments");
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27843a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27843a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AlertDialog alertDialog = SshPrivateKeyPasteScreen.this.f27820b;
            if (alertDialog != null) {
                alertDialog.setMessage(SshPrivateKeyPasteScreen.this.getText(R.string.validated));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27845a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27845a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Ff().f73334d.setError("Unknown format");
            SshPrivateKeyPasteScreen.this.Ff().f73338h.setEnabled(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27847a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f27849c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new m(this.f27849c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27847a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Ff().f73333c.setText(this.f27849c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27850a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27852c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshPrivateKeyPasteScreen.this.new n(this.f27852c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27850a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SshPrivateKeyPasteScreen.this.Ff().f73338h.setEnabled(this.f27852c);
            MaterialButton materialButton = SshPrivateKeyPasteScreen.this.Ff().f73336f;
            t.e(materialButton, "saveAnyway");
            materialButton.setVisibility(this.f27852c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshPrivateKeyPasteScreen() {
        iu.a aVar = new iu.a() { // from class: lj.d0
            @Override // iu.a
            public final Object a() {
                return SshPrivateKeyPasteScreen.Of(this.f64214a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f27823e = new MoxyKtxDelegate(mvpDelegate, SshPrivateKeyPastePresenter.class.getName() + ".presenter", aVar);
    }

    private final SshPrivateKeyPasteScreenArgs Ef() {
        return (SshPrivateKeyPasteScreenArgs) this.f27822d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n7 Ff() {
        n7 n7Var = this.f27819a;
        if (n7Var != null) {
            return n7Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshPrivateKeyPastePresenter Gf() {
        return (SshPrivateKeyPastePresenter) this.f27823e.getValue(this, f27817v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshKeyPasteScreenViewModel Hf() {
        return (SshKeyPasteScreenViewModel) this.f27821c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f73333c.setTypeface(c4.h.h(requireContext(), R.font.ibm_plex_mono_regular));
        TextInputEditText textInputEditText = Ff().f73333c;
        t.e(textInputEditText, "editForPrivateKey");
        textInputEditText.addTextChangedListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Ff().f73336f.setOnClickListener(new View.OnClickListener() { // from class: lj.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SshPrivateKeyPasteScreen.Kf(this.f64204a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(SshPrivateKeyPasteScreen sshPrivateKeyPasteScreen, View view) {
        sshPrivateKeyPasteScreen.Gf().w2(String.valueOf(sshPrivateKeyPasteScreen.Ff().f73333c.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Ff().f73338h.setOnClickListener(new View.OnClickListener() { // from class: lj.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SshPrivateKeyPasteScreen.Mf(this.f64212a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(SshPrivateKeyPasteScreen sshPrivateKeyPasteScreen, View view) {
        sshPrivateKeyPasteScreen.Gf().x2(String.valueOf(sshPrivateKeyPasteScreen.Ff().f73333c.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Nf(SshPrivateKeyPasteScreen sshPrivateKeyPasteScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        sshPrivateKeyPasteScreen.Gf().u2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SshPrivateKeyPastePresenter Of(SshPrivateKeyPasteScreen sshPrivateKeyPasteScreen) {
        String sshPrivateKeyText = sshPrivateKeyPasteScreen.Ef().getSshPrivateKeyText();
        t.e(sshPrivateKeyText, "getSshPrivateKeyText(...)");
        return new SshPrivateKeyPastePresenter(sshPrivateKeyText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SshKeyPasteScreenViewModel Pf() {
        SshKeyPasteScreenViewModel sshKeyPasteScreenViewModelA = SshKeyPasteScreenViewModel.Companion.a();
        if (sshKeyPasteScreenViewModelA != null) {
            return sshKeyPasteScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void A() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Ba() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Da() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void F0(boolean z10) {
        bh.a.b(this, new n(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void K2() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Vd(String str, String str2) {
        t.f(str, Column.KEY_PRIVATE);
        bh.a.b(this, new g(str, str2, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void c() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void g0() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void n9() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void od(String str) {
        t.f(str, SerializableEvent.KEY_FIELD);
        bh.a.b(this, new m(str, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: lj.e0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SshPrivateKeyPasteScreen.Nf(this.f64216a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f27824f = e0VarB;
        if (e0VarB != null) {
            e0VarB.j(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f27819a = n7.c(layoutInflater, viewGroup, false);
        return Ff().b();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f27819a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f27824f;
        if (e0Var != null) {
            e0Var.h();
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = Ff().f73332b;
        t.e(constraintLayout, "contentLayout");
        g6.a2(constraintLayout, getArguments(), null, 2, null);
    }

    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void z1() {
        bh.a.b(this, new f(null));
    }
}
