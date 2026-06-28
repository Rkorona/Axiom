package com.server.auditor.ssh.client.models.webauthn;

import com.server.auditor.ssh.client.database.Column;
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
public final class Fido2ClientData {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String androidPackageName;
    private final String challenge;
    private final String origin;
    private final String type;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27979b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27978a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.webauthn.Fido2ClientData", aVar, 4);
            i2Var.r(Column.TYPE, false);
            i2Var.r("challenge", false);
            i2Var.r("origin", false);
            i2Var.r("androidPackageName", false);
            descriptor = i2Var;
            f27979b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fido2ClientData deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            String str2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                String strB4 = cVarD.B(fVar, 2);
                strB2 = cVarD.B(fVar, 3);
                str = strB4;
                str2 = strB3;
                i10 = 15;
            } else {
                strB = null;
                String strB5 = null;
                String strB6 = null;
                String strB7 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB7 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB6 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        strB5 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    }
                }
                strB2 = strB5;
                str = strB6;
                str2 = strB7;
                i10 = i11;
            }
            String str3 = strB;
            cVarD.b(fVar);
            return new Fido2ClientData(i10, str3, str2, str, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, Fido2ClientData fido2ClientData) {
            t.f(fVar, "encoder");
            t.f(fido2ClientData, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            Fido2ClientData.write$Self$Termius_app_googleProductionRelease(fido2ClientData, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var, x2Var};
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
            return a.f27978a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ Fido2ClientData(int i10, String str, String str2, String str3, String str4, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, a.f27978a.getDescriptor());
        }
        this.type = str;
        this.challenge = str2;
        this.origin = str3;
        this.androidPackageName = str4;
    }

    public static /* synthetic */ Fido2ClientData copy$default(Fido2ClientData fido2ClientData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fido2ClientData.type;
        }
        if ((i10 & 2) != 0) {
            str2 = fido2ClientData.challenge;
        }
        if ((i10 & 4) != 0) {
            str3 = fido2ClientData.origin;
        }
        if ((i10 & 8) != 0) {
            str4 = fido2ClientData.androidPackageName;
        }
        return fido2ClientData.copy(str, str2, str3, str4);
    }

    @o("androidPackageName")
    public static /* synthetic */ void getAndroidPackageName$annotations() {
    }

    @o("challenge")
    public static /* synthetic */ void getChallenge$annotations() {
    }

    @o("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Fido2ClientData fido2ClientData, d dVar, f fVar) {
        dVar.f(fVar, 0, fido2ClientData.type);
        dVar.f(fVar, 1, fido2ClientData.challenge);
        dVar.f(fVar, 2, fido2ClientData.origin);
        dVar.f(fVar, 3, fido2ClientData.androidPackageName);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.challenge;
    }

    public final String component3() {
        return this.origin;
    }

    public final String component4() {
        return this.androidPackageName;
    }

    public final Fido2ClientData copy(String str, String str2, String str3, String str4) {
        t.f(str, Column.TYPE);
        t.f(str2, "challenge");
        t.f(str3, "origin");
        t.f(str4, "androidPackageName");
        return new Fido2ClientData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fido2ClientData)) {
            return false;
        }
        Fido2ClientData fido2ClientData = (Fido2ClientData) obj;
        return t.b(this.type, fido2ClientData.type) && t.b(this.challenge, fido2ClientData.challenge) && t.b(this.origin, fido2ClientData.origin) && t.b(this.androidPackageName, fido2ClientData.androidPackageName);
    }

    public final String getAndroidPackageName() {
        return this.androidPackageName;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.challenge.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.androidPackageName.hashCode();
    }

    public String toString() {
        return "Fido2ClientData(type=" + this.type + ", challenge=" + this.challenge + ", origin=" + this.origin + ", androidPackageName=" + this.androidPackageName + ")";
    }

    public Fido2ClientData(String str, String str2, String str3, String str4) {
        t.f(str, Column.TYPE);
        t.f(str2, "challenge");
        t.f(str3, "origin");
        t.f(str4, "androidPackageName");
        this.type = str;
        this.challenge = str2;
        this.origin = str3;
        this.androidPackageName = str4;
    }
}
