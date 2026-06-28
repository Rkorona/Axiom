package com.server.auditor.ssh.client.presenters.connection;

import com.crystalnix.termius.libtermius.Webauthn;
import com.crystalnix.termius.libtermius.WebauthnException;
import com.crystalnix.termius.libtermius.wrappers.WebAuthnAuth;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.g1;
import com.server.auditor.ssh.client.models.webauthn.Fido2AuthenticatorAssertionResponse;
import com.server.auditor.ssh.client.models.webauthn.Fido2ClientData;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import tp.c0;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionFlowWebAuthnAuthPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.connection.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mv.b f37251a = b2.f52944a.s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37252b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37253a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConnectionFlowWebAuthnAuthPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37253a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ConnectionFlowWebAuthnAuthPresenter.this.f37252b = false;
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().Ae(false);
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().x7(1, 2, new a0.a(R.string.connection_log_message_fido2_user_presence_was_canceled, new Object[0]));
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().be();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37255a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConnectionFlowWebAuthnAuthPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37255a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ConnectionFlowWebAuthnAuthPresenter.this.f37252b = false;
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().Ae(false);
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().L6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37257a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, e eVar) {
            super(2, eVar);
            this.f37259c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConnectionFlowWebAuthnAuthPresenter.this.new c(this.f37259c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            try {
                mv.b bVar = ConnectionFlowWebAuthnAuthPresenter.this.f37251a;
                String str = this.f37259c;
                bVar.a();
                Fido2AuthenticatorAssertionResponse fido2AuthenticatorAssertionResponse = (Fido2AuthenticatorAssertionResponse) bVar.b(Fido2AuthenticatorAssertionResponse.Companion.serializer(), str);
                mv.b bVar2 = ConnectionFlowWebAuthnAuthPresenter.this.f37251a;
                Fido2ClientData clientData = fido2AuthenticatorAssertionResponse.getResponse().getClientData();
                bVar2.a();
                try {
                    byte[] bArrGenerateSignatureOnAuthentication = Webauthn.generateSignatureOnAuthentication(c0.d(fido2AuthenticatorAssertionResponse.getResponse().getAuthenticatorData()), c0.d(fido2AuthenticatorAssertionResponse.getResponse().getSignature()), bVar2.c(Fido2ClientData.Companion.serializer(), clientData), fido2AuthenticatorAssertionResponse.getResponse().getClientData().getOrigin());
                    com.server.auditor.ssh.client.contracts.connection.b viewState = ConnectionFlowWebAuthnAuthPresenter.this.getViewState();
                    t.c(bArrGenerateSignatureOnAuthentication);
                    viewState.R4(bArrGenerateSignatureOnAuthentication);
                    ConnectionFlowWebAuthnAuthPresenter.this.getViewState().Ae(false);
                    ConnectionFlowWebAuthnAuthPresenter.this.f37252b = false;
                    return m0.f82633a;
                } catch (WebauthnException e10) {
                    com.server.auditor.ssh.client.contracts.connection.b viewState2 = ConnectionFlowWebAuthnAuthPresenter.this.getViewState();
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    viewState2.x7(2, 3, new a0.a(R.string.connection_log_message_cannot_create_fido2_signature, message, kotlin.coroutines.jvm.internal.b.d(e10.getCode())));
                    ConnectionFlowWebAuthnAuthPresenter.this.u2();
                    return m0.f82633a;
                }
            } catch (IllegalArgumentException unused) {
                ConnectionFlowWebAuthnAuthPresenter.this.getViewState().x7(2, 3, new a0.a(R.string.connection_log_message_platform_authenticator_returned_unsupported_format, new Object[0]));
                ConnectionFlowWebAuthnAuthPresenter.this.u2();
                return m0.f82633a;
            }
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37260a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebAuthnAuth f37262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(WebAuthnAuth webAuthnAuth, e eVar) {
            super(2, eVar);
            this.f37262c = webAuthnAuth;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConnectionFlowWebAuthnAuthPresenter.this.new d(this.f37262c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37260a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (ConnectionFlowWebAuthnAuthPresenter.this.f37252b) {
                return m0.f82633a;
            }
            ConnectionFlowWebAuthnAuthPresenter.this.f37252b = true;
            if (!g1.f27417b.a().contains(this.f37262c.getRelyingPartyId())) {
                ConnectionFlowWebAuthnAuthPresenter.this.getViewState().x7(1, 2, new a0.a(R.string.connection_log_message_detected_unknown_relying_party_id, this.f37262c.getRelyingPartyId()));
            }
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().x7(1, 1, new a0.a(R.string.connection_log_message_requesting_fido2_user_presence, new Object[0]));
            ConnectionFlowWebAuthnAuthPresenter.this.getViewState().m3(this.f37262c.getRelyingPartyId(), this.f37262c.getKeyHandle(), c0.d(this.f37262c.getEncodedChallenge()));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void v2(String str) {
        t.f(str, "authenticatorAssertionResponseJson");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    public final void w2(WebAuthnAuth webAuthnAuth) {
        t.f(webAuthnAuth, "webAuthnAuth");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(webAuthnAuth, null), 3, null);
    }
}
