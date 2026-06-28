package com.server.auditor.ssh.client.models.webauthn;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.webauthn.Fido2AuthenticationResponse;
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
public final class Fido2AuthenticatorAssertionResponse {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String authenticatorAttachment;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f27972id;
    private final String rawId;
    private final Fido2AuthenticationResponse response;
    private final String type;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27974b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27973a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.webauthn.Fido2AuthenticatorAssertionResponse", aVar, 5);
            i2Var.r("rawId", false);
            i2Var.r("authenticatorAttachment", false);
            i2Var.r(Column.TYPE, false);
            i2Var.r("id", false);
            i2Var.r("response", false);
            descriptor = i2Var;
            f27974b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fido2AuthenticatorAssertionResponse deserialize(e eVar) {
            int i10;
            String str;
            String str2;
            String str3;
            String strB;
            Fido2AuthenticationResponse fido2AuthenticationResponse;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            String strB2 = null;
            if (cVarD.l()) {
                String strB3 = cVarD.B(fVar, 0);
                String strB4 = cVarD.B(fVar, 1);
                String strB5 = cVarD.B(fVar, 2);
                str = strB3;
                strB = cVarD.B(fVar, 3);
                fido2AuthenticationResponse = (Fido2AuthenticationResponse) cVarD.i(fVar, 4, Fido2AuthenticationResponse.a.f27970a, null);
                str3 = strB5;
                str2 = strB4;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strB6 = null;
                String strB7 = null;
                String strB8 = null;
                Fido2AuthenticationResponse fido2AuthenticationResponse2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB2 = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB6 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB7 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        strB8 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        fido2AuthenticationResponse2 = (Fido2AuthenticationResponse) cVarD.i(fVar, 4, Fido2AuthenticationResponse.a.f27970a, fido2AuthenticationResponse2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strB2;
                str2 = strB6;
                str3 = strB7;
                strB = strB8;
                fido2AuthenticationResponse = fido2AuthenticationResponse2;
            }
            cVarD.b(fVar);
            return new Fido2AuthenticatorAssertionResponse(i10, str, str2, str3, strB, fido2AuthenticationResponse, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, Fido2AuthenticatorAssertionResponse fido2AuthenticatorAssertionResponse) {
            t.f(fVar, "encoder");
            t.f(fido2AuthenticatorAssertionResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            Fido2AuthenticatorAssertionResponse.write$Self$Termius_app_googleProductionRelease(fido2AuthenticatorAssertionResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var, x2Var, Fido2AuthenticationResponse.a.f27970a};
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
            return a.f27973a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ Fido2AuthenticatorAssertionResponse(int i10, String str, String str2, String str3, String str4, Fido2AuthenticationResponse fido2AuthenticationResponse, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f27973a.getDescriptor());
        }
        this.rawId = str;
        this.authenticatorAttachment = str2;
        this.type = str3;
        this.f27972id = str4;
        this.response = fido2AuthenticationResponse;
    }

    public static /* synthetic */ Fido2AuthenticatorAssertionResponse copy$default(Fido2AuthenticatorAssertionResponse fido2AuthenticatorAssertionResponse, String str, String str2, String str3, String str4, Fido2AuthenticationResponse fido2AuthenticationResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fido2AuthenticatorAssertionResponse.rawId;
        }
        if ((i10 & 2) != 0) {
            str2 = fido2AuthenticatorAssertionResponse.authenticatorAttachment;
        }
        if ((i10 & 4) != 0) {
            str3 = fido2AuthenticatorAssertionResponse.type;
        }
        if ((i10 & 8) != 0) {
            str4 = fido2AuthenticatorAssertionResponse.f27972id;
        }
        if ((i10 & 16) != 0) {
            fido2AuthenticationResponse = fido2AuthenticatorAssertionResponse.response;
        }
        Fido2AuthenticationResponse fido2AuthenticationResponse2 = fido2AuthenticationResponse;
        String str5 = str3;
        return fido2AuthenticatorAssertionResponse.copy(str, str2, str5, str4, fido2AuthenticationResponse2);
    }

    @o("authenticatorAttachment")
    public static /* synthetic */ void getAuthenticatorAttachment$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("rawId")
    public static /* synthetic */ void getRawId$annotations() {
    }

    @o("response")
    public static /* synthetic */ void getResponse$annotations() {
    }

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Fido2AuthenticatorAssertionResponse fido2AuthenticatorAssertionResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, fido2AuthenticatorAssertionResponse.rawId);
        dVar.f(fVar, 1, fido2AuthenticatorAssertionResponse.authenticatorAttachment);
        dVar.f(fVar, 2, fido2AuthenticatorAssertionResponse.type);
        dVar.f(fVar, 3, fido2AuthenticatorAssertionResponse.f27972id);
        dVar.o(fVar, 4, Fido2AuthenticationResponse.a.f27970a, fido2AuthenticatorAssertionResponse.response);
    }

    public final String component1() {
        return this.rawId;
    }

    public final String component2() {
        return this.authenticatorAttachment;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.f27972id;
    }

    public final Fido2AuthenticationResponse component5() {
        return this.response;
    }

    public final Fido2AuthenticatorAssertionResponse copy(String str, String str2, String str3, String str4, Fido2AuthenticationResponse fido2AuthenticationResponse) {
        t.f(str, "rawId");
        t.f(str2, "authenticatorAttachment");
        t.f(str3, Column.TYPE);
        t.f(str4, "id");
        t.f(fido2AuthenticationResponse, "response");
        return new Fido2AuthenticatorAssertionResponse(str, str2, str3, str4, fido2AuthenticationResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fido2AuthenticatorAssertionResponse)) {
            return false;
        }
        Fido2AuthenticatorAssertionResponse fido2AuthenticatorAssertionResponse = (Fido2AuthenticatorAssertionResponse) obj;
        return t.b(this.rawId, fido2AuthenticatorAssertionResponse.rawId) && t.b(this.authenticatorAttachment, fido2AuthenticatorAssertionResponse.authenticatorAttachment) && t.b(this.type, fido2AuthenticatorAssertionResponse.type) && t.b(this.f27972id, fido2AuthenticatorAssertionResponse.f27972id) && t.b(this.response, fido2AuthenticatorAssertionResponse.response);
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final String getId() {
        return this.f27972id;
    }

    public final String getRawId() {
        return this.rawId;
    }

    public final Fido2AuthenticationResponse getResponse() {
        return this.response;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.rawId.hashCode() * 31) + this.authenticatorAttachment.hashCode()) * 31) + this.type.hashCode()) * 31) + this.f27972id.hashCode()) * 31) + this.response.hashCode();
    }

    public String toString() {
        return "Fido2AuthenticatorAssertionResponse(rawId=" + this.rawId + ", authenticatorAttachment=" + this.authenticatorAttachment + ", type=" + this.type + ", id=" + this.f27972id + ", response=" + this.response + ")";
    }

    public Fido2AuthenticatorAssertionResponse(String str, String str2, String str3, String str4, Fido2AuthenticationResponse fido2AuthenticationResponse) {
        t.f(str, "rawId");
        t.f(str2, "authenticatorAttachment");
        t.f(str3, Column.TYPE);
        t.f(str4, "id");
        t.f(fido2AuthenticationResponse, "response");
        this.rawId = str;
        this.authenticatorAttachment = str2;
        this.type = str3;
        this.f27972id = str4;
        this.response = fido2AuthenticationResponse;
    }
}
