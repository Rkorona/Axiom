package com.server.auditor.ssh.client.fragments.connection;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentActivity;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.g1;
import com.server.auditor.ssh.client.presenters.connection.ConnectionFlowWebAuthnAuthPresenter;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpDelegate;
import moxy.MvpDelegateHolder;
import moxy.ktx.MoxyKtxDelegate;
import qg.t8;
import tp.c0;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.server.auditor.ssh.client.fragments.connection.c, MvpDelegateHolder, com.server.auditor.ssh.client.contracts.connection.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FragmentActivity f24626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8 f24627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MvpDelegate f24629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MoxyKtxDelegate f24630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ut.n f24631f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g.b f24632u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24624w = {n0.g(new g0(d.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/connection/ConnectionFlowWebAuthnAuthPresenter;", 0))};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f24623v = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f24625x = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b implements g.a, ju.n {
        b() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ActivityResult activityResult) {
            ju.t.f(activityResult, "p0");
            d.this.u3(activityResult);
        }

        @Override // ju.n
        public final ut.i c() {
            return new ju.q(1, d.this, d.class, "onFido2SignInResultReceived", "onFido2SignInResultReceived(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24634a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24634a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            d.this.f24628c.E3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.connection.d$d, reason: collision with other inner class name */
    static final class C0394d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24636a;

        C0394d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d.this.new C0394d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24636a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            d.this.f24628c.E3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((C0394d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24638a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f24640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(byte[] bArr, zt.e eVar) {
            super(2, eVar);
            this.f24640c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d.this.new e(this.f24640c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            d.this.f24628c.F3(this.f24640c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24642b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f24644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f24645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f24646f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, byte[] bArr, zt.e eVar) {
            super(2, eVar);
            this.f24644d = str;
            this.f24645e = str2;
            this.f24646f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            f fVar = d.this.new f(this.f24644d, this.f24645e, this.f24646f, eVar);
            fVar.f24642b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24641a;
            if (i10 == 0) {
                x.b(obj);
                i0 i0Var = (i0) this.f24642b;
                g1 g1VarS3 = d.this.s3();
                String str = this.f24644d;
                String str2 = this.f24645e;
                byte[] bArr = this.f24646f;
                this.f24642b = i0Var;
                this.f24641a = 1;
                obj = g1VarS3.c(str, str2, bArr, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            if (pendingIntent == null) {
                d.this.k3().u2();
                return m0.f82633a;
            }
            try {
                d.this.f24632u.a(new IntentSenderRequest.a(pendingIntent).a());
            } catch (IntentSender.SendIntentException e10) {
                y9.a.f86838a.i(e10);
                d.this.k3().u2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24647a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f24650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a0 f24651e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, a0 a0Var, zt.e eVar) {
            super(2, eVar);
            this.f24649c = i10;
            this.f24650d = i11;
            this.f24651e = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d.this.new g(this.f24649c, this.f24650d, this.f24651e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24647a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            d.this.f24628c.G3(this.f24649c, this.f24650d, this.f24651e.a(d.this.f24626a));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowDialog.b.C0391b f24653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f24654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NewConnectionFlowDialog.b.C0391b c0391b, d dVar, zt.e eVar) {
            super(2, eVar);
            this.f24653b = c0391b;
            this.f24654c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f24653b, this.f24654c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24652a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f24653b.a() == null) {
                y9.a.f86838a.g("[Developer Error] Passed nullable WebAuthnAuth model");
                this.f24654c.x7(2, 3, new a0.a(R.string.connection_log_message_detected_unsupported_ssh_key_format, new Object[0]));
                this.f24654c.k3().u2();
                return m0.f82633a;
            }
            this.f24654c.f24627b.f73994d.f74122c.setImageResource(R.drawable.ic_fido_key_oval);
            this.f24654c.f24627b.f73994d.f74124e.setText(this.f24653b.a().getKeyTitle());
            this.f24654c.f24627b.f73994d.f74121b.setText(this.f24654c.f24626a.getString(R.string.key_footer_with_certificate, this.f24653b.a().getKeyType(), c0.e()));
            this.f24654c.k3().w2(this.f24653b.a());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24655a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24657c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d.this.new i(this.f24657c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24655a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressBar progressBar = d.this.f24627b.f73995e;
            ju.t.e(progressBar, "progressBar");
            progressBar.setVisibility(this.f24657c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public d(MvpDelegate mvpDelegate, FragmentActivity fragmentActivity, t8 t8Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(mvpDelegate, "parentMvpDelegate");
        ju.t.f(fragmentActivity, "activity");
        ju.t.f(t8Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "parentPresenter");
        this.f24626a = fragmentActivity;
        this.f24627b = t8Var;
        this.f24628c = newConnectionFlowPresenter;
        MvpDelegate mvpDelegate2 = new MvpDelegate(this);
        this.f24629d = mvpDelegate2;
        iu.a aVar = new iu.a() { // from class: gh.o
            @Override // iu.a
            public final Object a() {
                return com.server.auditor.ssh.client.fragments.connection.d.x3();
            }
        };
        MvpDelegate mvpDelegate3 = getMvpDelegate();
        ju.t.e(mvpDelegate3, "mvpDelegate");
        this.f24630e = new MoxyKtxDelegate(mvpDelegate3, ConnectionFlowWebAuthnAuthPresenter.class.getName() + ".presenter", aVar);
        this.f24631f = ut.o.a(new iu.a() { // from class: gh.p
            @Override // iu.a
            public final Object a() {
                return com.server.auditor.ssh.client.fragments.connection.d.D3(this.f51336a);
            }
        });
        this.f24632u = fragmentActivity.registerForActivityResult(new h.d(), new b());
        mvpDelegate2.setParentDelegate(mvpDelegate, d.class.getSimpleName());
        mvpDelegate2.onCreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 D3(d dVar) {
        qd.a aVarA = pd.a.a(dVar.f24626a.getApplicationContext());
        ju.t.e(aVarA, "getFido2ApiClient(...)");
        return new g1(aVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectionFlowWebAuthnAuthPresenter k3() {
        return (ConnectionFlowWebAuthnAuthPresenter) this.f24630e.getValue(this, f24624w[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g1 s3() {
        return (g1) this.f24631f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u3(ActivityResult activityResult) {
        byte[] byteArrayExtra;
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode == 0) {
                k3().t2();
                return;
            } else {
                y9.a.f86838a.g("FIDO2 API client returned unexpected error");
                k3().u2();
                return;
            }
        }
        Intent data = activityResult.getData();
        if (data == null || (byteArrayExtra = data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) == null) {
            y9.a.f86838a.g("Fido2ApiClient doesn't returned the 'FIDO2_KEY_CREDENTIAL_EXTRA'");
            x7(2, 3, new a0.a(R.string.connection_log_message_detected_unsupported_ssh_key_format, new Object[0]));
            k3().u2();
            return;
        }
        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        ju.t.e(publicKeyCredentialDeserializeFromBytes, "deserializeFromBytes(...)");
        AuthenticatorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
        ju.t.e(response, "getResponse(...)");
        if (response instanceof AuthenticatorAssertionResponse) {
            ConnectionFlowWebAuthnAuthPresenter connectionFlowWebAuthnAuthPresenterK3 = k3();
            String json = publicKeyCredentialDeserializeFromBytes.toJson();
            ju.t.e(json, "toJson(...)");
            connectionFlowWebAuthnAuthPresenterK3.v2(json);
            return;
        }
        if (response instanceof AuthenticatorErrorResponse) {
            x7(2, 3, new a0.a(R.string.connection_log_message_platform_authenticator_returned_error_code, Integer.valueOf(((AuthenticatorErrorResponse) response).getErrorCode().getCode())));
            k3().u2();
        } else {
            y9.a.f86838a.g("FIDO2 API client returned unexpected error");
            k3().u2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionFlowWebAuthnAuthPresenter x3() {
        return new ConnectionFlowWebAuthnAuthPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void Ae(boolean z10) {
        bh.a.b(this.f24626a, new i(z10, null));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        c.a.b(this);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void L6() {
        bh.a.b(this.f24626a, new C0394d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void R4(byte[] bArr) {
        ju.t.f(bArr, "signature");
        bh.a.b(this.f24626a, new e(bArr, null));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void be() {
        bh.a.b(this.f24626a, new c(null));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
    }

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        return this.f24629d;
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void m3(String str, String str2, byte[] bArr) {
        ju.t.f(str, "relyingPartyId");
        ju.t.f(str2, SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE);
        ju.t.f(bArr, "challenge");
        wu.k.d(androidx.lifecycle.a0.a(this.f24626a), null, null, new f(str, str2, bArr, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void x7(int i10, int i11, a0 a0Var) {
        ju.t.f(a0Var, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this.f24626a, new g(i10, i11, a0Var, null));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: y3, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.C0391b c0391b) {
        ju.t.f(c0391b, "step");
        bh.a.b(this.f24626a, new h(c0391b, this, null));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        c.a.a(this);
    }
}
