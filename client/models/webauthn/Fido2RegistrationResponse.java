package com.server.auditor.ssh.client.models.webauthn;

import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.webauthn.Fido2RegistrationResponse;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
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
import lv.w0;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class Fido2RegistrationResponse {
    private final String attestationObject;
    private final String authenticatorData;
    private final Fido2ClientData clientData;
    private final String publicKey;
    private final int publicKeyAlgorithm;
    private final List<String> transports;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, o.b(r.f82638b, new iu.a() { // from class: qj.a
        @Override // iu.a
        public final Object a() {
            return Fido2RegistrationResponse._childSerializers$_anonymous_();
        }
    }), null, null, null};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27981b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27980a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.webauthn.Fido2RegistrationResponse", aVar, 6);
            i2Var.r("clientDataJSON", false);
            i2Var.r("attestationObject", false);
            i2Var.r("transports", true);
            i2Var.r("authenticatorData", false);
            i2Var.r("publicKeyAlgorithm", false);
            i2Var.r(Column.KEY_PUBLIC, false);
            descriptor = i2Var;
            f27981b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fido2RegistrationResponse deserialize(e eVar) {
            int i10;
            int i11;
            Fido2ClientData fido2ClientData;
            String str;
            List list;
            String str2;
            String strB;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = Fido2RegistrationResponse.$childSerializers;
            int i12 = 5;
            if (cVarD.l()) {
                Fido2ClientData fido2ClientData2 = (Fido2ClientData) cVarD.i(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, null);
                String strB2 = cVarD.B(fVar, 1);
                List list2 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                String strB3 = cVarD.B(fVar, 3);
                int iE = cVarD.e(fVar, 4);
                list = list2;
                fido2ClientData = fido2ClientData2;
                strB = cVarD.B(fVar, 5);
                str2 = strB3;
                i10 = iE;
                i11 = 63;
                str = strB2;
            } else {
                boolean z10 = true;
                int iE2 = 0;
                Fido2ClientData fido2ClientData3 = null;
                String strB4 = null;
                List list3 = null;
                String strB5 = null;
                String strB6 = null;
                int i13 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            i12 = 5;
                            break;
                        case 0:
                            fido2ClientData3 = (Fido2ClientData) cVarD.i(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, fido2ClientData3);
                            i13 |= 1;
                            i12 = 5;
                            break;
                        case 1:
                            strB4 = cVarD.B(fVar, 1);
                            i13 |= 2;
                            break;
                        case 2:
                            list3 = (List) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), list3);
                            i13 |= 4;
                            break;
                        case 3:
                            strB5 = cVarD.B(fVar, 3);
                            i13 |= 8;
                            break;
                        case 4:
                            iE2 = cVarD.e(fVar, 4);
                            i13 |= 16;
                            break;
                        case 5:
                            strB6 = cVarD.B(fVar, i12);
                            i13 |= 32;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = iE2;
                i11 = i13;
                fido2ClientData = fido2ClientData3;
                str = strB4;
                list = list3;
                str2 = strB5;
                strB = strB6;
            }
            cVarD.b(fVar);
            return new Fido2RegistrationResponse(i11, fido2ClientData, str, list, str2, i10, strB, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, Fido2RegistrationResponse fido2RegistrationResponse) {
            t.f(fVar, "encoder");
            t.f(fido2RegistrationResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            Fido2RegistrationResponse.write$Self$Termius_app_googleProductionRelease(fido2RegistrationResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = Fido2RegistrationResponse.$childSerializers;
            x2 x2Var = x2.f64817a;
            return new hv.c[]{com.server.auditor.ssh.client.models.webauthn.a.f27982a, x2Var, nVarArr[2].getValue(), x2Var, w0.f64808a, x2Var};
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
            return a.f27980a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ Fido2RegistrationResponse(int i10, Fido2ClientData fido2ClientData, String str, List list, String str2, int i11, String str3, s2 s2Var) {
        if (59 != (i10 & 59)) {
            d2.a(i10, 59, a.f27980a.getDescriptor());
        }
        this.clientData = fido2ClientData;
        this.attestationObject = str;
        if ((i10 & 4) == 0) {
            this.transports = v.o();
        } else {
            this.transports = list;
        }
        this.authenticatorData = str2;
        this.publicKeyAlgorithm = i11;
        this.publicKey = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fido2RegistrationResponse copy$default(Fido2RegistrationResponse fido2RegistrationResponse, Fido2ClientData fido2ClientData, String str, List list, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fido2ClientData = fido2RegistrationResponse.clientData;
        }
        if ((i11 & 2) != 0) {
            str = fido2RegistrationResponse.attestationObject;
        }
        if ((i11 & 4) != 0) {
            list = fido2RegistrationResponse.transports;
        }
        if ((i11 & 8) != 0) {
            str2 = fido2RegistrationResponse.authenticatorData;
        }
        if ((i11 & 16) != 0) {
            i10 = fido2RegistrationResponse.publicKeyAlgorithm;
        }
        if ((i11 & 32) != 0) {
            str3 = fido2RegistrationResponse.publicKey;
        }
        int i12 = i10;
        String str4 = str3;
        return fido2RegistrationResponse.copy(fido2ClientData, str, list, str2, i12, str4);
    }

    @hv.o("attestationObject")
    public static /* synthetic */ void getAttestationObject$annotations() {
    }

    @hv.o("authenticatorData")
    public static /* synthetic */ void getAuthenticatorData$annotations() {
    }

    @p(with = com.server.auditor.ssh.client.models.webauthn.a.class)
    @hv.o("clientDataJSON")
    public static /* synthetic */ void getClientData$annotations() {
    }

    @hv.o(Column.KEY_PUBLIC)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @hv.o("publicKeyAlgorithm")
    public static /* synthetic */ void getPublicKeyAlgorithm$annotations() {
    }

    @hv.o("transports")
    public static /* synthetic */ void getTransports$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Fido2RegistrationResponse fido2RegistrationResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, com.server.auditor.ssh.client.models.webauthn.a.f27982a, fido2RegistrationResponse.clientData);
        dVar.f(fVar, 1, fido2RegistrationResponse.attestationObject);
        if (dVar.E(fVar, 2) || !t.b(fido2RegistrationResponse.transports, v.o())) {
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), fido2RegistrationResponse.transports);
        }
        dVar.f(fVar, 3, fido2RegistrationResponse.authenticatorData);
        dVar.t(fVar, 4, fido2RegistrationResponse.publicKeyAlgorithm);
        dVar.f(fVar, 5, fido2RegistrationResponse.publicKey);
    }

    public final Fido2ClientData component1() {
        return this.clientData;
    }

    public final String component2() {
        return this.attestationObject;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final String component4() {
        return this.authenticatorData;
    }

    public final int component5() {
        return this.publicKeyAlgorithm;
    }

    public final String component6() {
        return this.publicKey;
    }

    public final Fido2RegistrationResponse copy(Fido2ClientData fido2ClientData, String str, List<String> list, String str2, int i10, String str3) {
        t.f(fido2ClientData, SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA);
        t.f(str, "attestationObject");
        t.f(list, "transports");
        t.f(str2, "authenticatorData");
        t.f(str3, Column.KEY_PUBLIC);
        return new Fido2RegistrationResponse(fido2ClientData, str, list, str2, i10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fido2RegistrationResponse)) {
            return false;
        }
        Fido2RegistrationResponse fido2RegistrationResponse = (Fido2RegistrationResponse) obj;
        return t.b(this.clientData, fido2RegistrationResponse.clientData) && t.b(this.attestationObject, fido2RegistrationResponse.attestationObject) && t.b(this.transports, fido2RegistrationResponse.transports) && t.b(this.authenticatorData, fido2RegistrationResponse.authenticatorData) && this.publicKeyAlgorithm == fido2RegistrationResponse.publicKeyAlgorithm && t.b(this.publicKey, fido2RegistrationResponse.publicKey);
    }

    public final String getAttestationObject() {
        return this.attestationObject;
    }

    public final String getAuthenticatorData() {
        return this.authenticatorData;
    }

    public final Fido2ClientData getClientData() {
        return this.clientData;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final int getPublicKeyAlgorithm() {
        return this.publicKeyAlgorithm;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public int hashCode() {
        return (((((((((this.clientData.hashCode() * 31) + this.attestationObject.hashCode()) * 31) + this.transports.hashCode()) * 31) + this.authenticatorData.hashCode()) * 31) + Integer.hashCode(this.publicKeyAlgorithm)) * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "Fido2RegistrationResponse(clientData=" + this.clientData + ", attestationObject=" + this.attestationObject + ", transports=" + this.transports + ", authenticatorData=" + this.authenticatorData + ", publicKeyAlgorithm=" + this.publicKeyAlgorithm + ", publicKey=" + this.publicKey + ")";
    }

    public Fido2RegistrationResponse(Fido2ClientData fido2ClientData, String str, List<String> list, String str2, int i10, String str3) {
        t.f(fido2ClientData, SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA);
        t.f(str, "attestationObject");
        t.f(list, "transports");
        t.f(str2, "authenticatorData");
        t.f(str3, Column.KEY_PUBLIC);
        this.clientData = fido2ClientData;
        this.attestationObject = str;
        this.transports = list;
        this.authenticatorData = str2;
        this.publicKeyAlgorithm = i10;
        this.publicKey = str3;
    }

    public /* synthetic */ Fido2RegistrationResponse(Fido2ClientData fido2ClientData, String str, List list, String str2, int i10, String str3, int i11, k kVar) {
        this(fido2ClientData, str, (i11 & 4) != 0 ? v.o() : list, str2, i10, str3);
    }
}
