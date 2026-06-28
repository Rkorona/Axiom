package com.server.auditor.ssh.client.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class EmailAuthentication implements AuthenticationModel {
    private final String email;
    private final String emailVerificationCode;
    private final String otpToken;
    private final SecurityToken securityToken;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<EmailAuthentication> CREATOR = new c();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, o.b(r.f82638b, new iu.a() { // from class: oj.a
        @Override // iu.a
        public final Object a() {
            return EmailAuthentication._childSerializers$_anonymous_();
        }
    }), null};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27889b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27888a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.account.EmailAuthentication", aVar, 4);
            i2Var.r("email", false);
            i2Var.r("otpToken", true);
            i2Var.r("securityToken", true);
            i2Var.r("emailVerificationCode", true);
            descriptor = i2Var;
            f27889b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmailAuthentication deserialize(e eVar) {
            int i10;
            String str;
            String str2;
            SecurityToken securityToken;
            String str3;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            n[] nVarArr = EmailAuthentication.$childSerializers;
            String strB = null;
            if (cVarD.l()) {
                String strB2 = cVarD.B(fVar, 0);
                x2 x2Var = x2.f64817a;
                String str4 = (String) cVarD.v(fVar, 1, x2Var, null);
                securityToken = (SecurityToken) cVarD.v(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                str = strB2;
                str3 = (String) cVarD.v(fVar, 3, x2Var, null);
                i10 = 15;
                str2 = str4;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str5 = null;
                SecurityToken securityToken2 = null;
                String str6 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        str5 = (String) cVarD.v(fVar, 1, x2.f64817a, str5);
                        i11 |= 2;
                    } else if (iD == 2) {
                        securityToken2 = (SecurityToken) cVarD.v(fVar, 2, (hv.b) nVarArr[2].getValue(), securityToken2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        str6 = (String) cVarD.v(fVar, 3, x2.f64817a, str6);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                str = strB;
                str2 = str5;
                securityToken = securityToken2;
                str3 = str6;
            }
            cVarD.b(fVar);
            return new EmailAuthentication(i10, str, str2, securityToken, str3, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, EmailAuthentication emailAuthentication) {
            t.f(fVar, "encoder");
            t.f(emailAuthentication, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            EmailAuthentication.write$Self$Termius_app_googleProductionRelease(emailAuthentication, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = EmailAuthentication.$childSerializers;
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, iv.a.u(x2Var), iv.a.u((hv.c) nVarArr[2].getValue()), iv.a.u(x2Var)};
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
            return a.f27888a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmailAuthentication createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new EmailAuthentication(parcel.readString(), parcel.readString(), (SecurityToken) parcel.readParcelable(EmailAuthentication.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EmailAuthentication[] newArray(int i10) {
            return new EmailAuthentication[i10];
        }
    }

    public /* synthetic */ EmailAuthentication(int i10, String str, String str2, SecurityToken securityToken, String str3, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27888a.getDescriptor());
        }
        this.email = str;
        if ((i10 & 2) == 0) {
            this.otpToken = null;
        } else {
            this.otpToken = str2;
        }
        if ((i10 & 4) == 0) {
            this.securityToken = null;
        } else {
            this.securityToken = securityToken;
        }
        if ((i10 & 8) == 0) {
            this.emailVerificationCode = null;
        } else {
            this.emailVerificationCode = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return SecurityToken.Companion.serializer();
    }

    public static /* synthetic */ EmailAuthentication copy$default(EmailAuthentication emailAuthentication, String str, String str2, SecurityToken securityToken, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailAuthentication.email;
        }
        if ((i10 & 2) != 0) {
            str2 = emailAuthentication.otpToken;
        }
        if ((i10 & 4) != 0) {
            securityToken = emailAuthentication.securityToken;
        }
        if ((i10 & 8) != 0) {
            str3 = emailAuthentication.emailVerificationCode;
        }
        return emailAuthentication.copy(str, str2, securityToken, str3);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EmailAuthentication emailAuthentication, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, emailAuthentication.email);
        if (dVar.E(fVar, 1) || emailAuthentication.otpToken != null) {
            dVar.v(fVar, 1, x2.f64817a, emailAuthentication.otpToken);
        }
        if (dVar.E(fVar, 2) || emailAuthentication.securityToken != null) {
            dVar.v(fVar, 2, (hv.r) nVarArr[2].getValue(), emailAuthentication.securityToken);
        }
        if (!dVar.E(fVar, 3) && emailAuthentication.emailVerificationCode == null) {
            return;
        }
        dVar.v(fVar, 3, x2.f64817a, emailAuthentication.emailVerificationCode);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.otpToken;
    }

    public final SecurityToken component3() {
        return this.securityToken;
    }

    public final String component4() {
        return this.emailVerificationCode;
    }

    public final EmailAuthentication copy(String str, String str2, SecurityToken securityToken, String str3) {
        t.f(str, "email");
        return new EmailAuthentication(str, str2, securityToken, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailAuthentication)) {
            return false;
        }
        EmailAuthentication emailAuthentication = (EmailAuthentication) obj;
        return t.b(this.email, emailAuthentication.email) && t.b(this.otpToken, emailAuthentication.otpToken) && t.b(this.securityToken, emailAuthentication.securityToken) && t.b(this.emailVerificationCode, emailAuthentication.emailVerificationCode);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEmailVerificationCode() {
        return this.emailVerificationCode;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final SecurityToken getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        String str = this.otpToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SecurityToken securityToken = this.securityToken;
        int iHashCode3 = (iHashCode2 + (securityToken == null ? 0 : securityToken.hashCode())) * 31;
        String str2 = this.emailVerificationCode;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EmailAuthentication(email=" + this.email + ", otpToken=" + this.otpToken + ", securityToken=" + this.securityToken + ", emailVerificationCode=" + this.emailVerificationCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.email);
        parcel.writeString(this.otpToken);
        parcel.writeParcelable(this.securityToken, i10);
        parcel.writeString(this.emailVerificationCode);
    }

    public EmailAuthentication(String str, String str2, SecurityToken securityToken, String str3) {
        t.f(str, "email");
        this.email = str;
        this.otpToken = str2;
        this.securityToken = securityToken;
        this.emailVerificationCode = str3;
    }

    public /* synthetic */ EmailAuthentication(String str, String str2, SecurityToken securityToken, String str3, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : securityToken, (i10 & 8) != 0 ? null : str3);
    }
}
