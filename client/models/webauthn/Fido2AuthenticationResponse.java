package com.server.auditor.ssh.client.models.webauthn;

import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class Fido2AuthenticationResponse {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String authenticatorData;
    private final Fido2ClientData clientData;
    private final String signature;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27971b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27970a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.webauthn.Fido2AuthenticationResponse", aVar, 3);
            i2Var.r("clientDataJSON", false);
            i2Var.r("authenticatorData", false);
            i2Var.r("signature", false);
            descriptor = i2Var;
            f27971b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fido2AuthenticationResponse deserialize(e eVar) {
            int i10;
            Fido2ClientData fido2ClientData;
            String str;
            String strB;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            Fido2ClientData fido2ClientData2 = null;
            if (cVarD.l()) {
                Fido2ClientData fido2ClientData3 = (Fido2ClientData) cVarD.i(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, null);
                String strB2 = cVarD.B(fVar, 1);
                fido2ClientData = fido2ClientData3;
                strB = cVarD.B(fVar, 2);
                str = strB2;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strB3 = null;
                String strB4 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        fido2ClientData2 = (Fido2ClientData) cVarD.i(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, fido2ClientData2);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB3 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        strB4 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                fido2ClientData = fido2ClientData2;
                str = strB3;
                strB = strB4;
            }
            cVarD.b(fVar);
            return new Fido2AuthenticationResponse(i10, fido2ClientData, str, strB, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, Fido2AuthenticationResponse fido2AuthenticationResponse) {
            t.f(fVar, "encoder");
            t.f(fido2AuthenticationResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            Fido2AuthenticationResponse.write$Self$Termius_app_googleProductionRelease(fido2AuthenticationResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{com.server.auditor.ssh.client.models.webauthn.a.f27982a, x2Var, x2Var};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f27970a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ Fido2AuthenticationResponse(int i10, Fido2ClientData fido2ClientData, String str, String str2, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f27970a.getDescriptor());
        }
        this.clientData = fido2ClientData;
        this.authenticatorData = str;
        this.signature = str2;
    }

    public static /* synthetic */ Fido2AuthenticationResponse copy$default(Fido2AuthenticationResponse fido2AuthenticationResponse, Fido2ClientData fido2ClientData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fido2ClientData = fido2AuthenticationResponse.clientData;
        }
        if ((i10 & 2) != 0) {
            str = fido2AuthenticationResponse.authenticatorData;
        }
        if ((i10 & 4) != 0) {
            str2 = fido2AuthenticationResponse.signature;
        }
        return fido2AuthenticationResponse.copy(fido2ClientData, str, str2);
    }

    @o("authenticatorData")
    public static /* synthetic */ void getAuthenticatorData$annotations() {
    }

    @p(with = com.server.auditor.ssh.client.models.webauthn.a.class)
    @o("clientDataJSON")
    public static /* synthetic */ void getClientData$annotations() {
    }

    @o("signature")
    public static /* synthetic */ void getSignature$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Fido2AuthenticationResponse fido2AuthenticationResponse, d dVar, f fVar) {
        dVar.o(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, fido2AuthenticationResponse.clientData);
        dVar.f(fVar, 1, fido2AuthenticationResponse.authenticatorData);
        dVar.f(fVar, 2, fido2AuthenticationResponse.signature);
    }

    public final Fido2ClientData component1() {
        return this.clientData;
    }

    public final String component2() {
        return this.authenticatorData;
    }

    public final String component3() {
        return this.signature;
    }

    public final Fido2AuthenticationResponse copy(Fido2ClientData fido2ClientData, String str, String str2) {
        t.f(fido2ClientData, SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA);
        t.f(str, "authenticatorData");
        t.f(str2, "signature");
        return new Fido2AuthenticationResponse(fido2ClientData, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fido2AuthenticationResponse)) {
            return false;
        }
        Fido2AuthenticationResponse fido2AuthenticationResponse = (Fido2AuthenticationResponse) obj;
        return t.b(this.clientData, fido2AuthenticationResponse.clientData) && t.b(this.authenticatorData, fido2AuthenticationResponse.authenticatorData) && t.b(this.signature, fido2AuthenticationResponse.signature);
    }

    public final String getAuthenticatorData() {
        return this.authenticatorData;
    }

    public final Fido2ClientData getClientData() {
        return this.clientData;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((this.clientData.hashCode() * 31) + this.authenticatorData.hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return "Fido2AuthenticationResponse(clientData=" + this.clientData + ", authenticatorData=" + this.authenticatorData + ", signature=" + this.signature + ")";
    }

    public Fido2AuthenticationResponse(Fido2ClientData fido2ClientData, String str, String str2) {
        t.f(fido2ClientData, SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA);
        t.f(str, "authenticatorData");
        t.f(str2, "signature");
        this.clientData = fido2ClientData;
        this.authenticatorData = str;
        this.signature = str2;
    }
}
