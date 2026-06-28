package com.server.auditor.ssh.client.models.account;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes3.dex */
@p
public final class EnterpriseSingleSignOnAuthentication implements AuthenticationModel {
    private final String domainToken;
    private final String email;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<EnterpriseSingleSignOnAuthentication> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27891b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27890a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication", aVar, 2);
            i2Var.r("email", false);
            i2Var.r("domainToken", false);
            descriptor = i2Var;
            f27891b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnterpriseSingleSignOnAuthentication deserialize(e eVar) {
            String strB;
            String strB2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                strB2 = cVarD.B(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strB = null;
                String strB3 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        strB3 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    }
                }
                strB2 = strB3;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new EnterpriseSingleSignOnAuthentication(i10, strB, strB2, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication) {
            t.f(fVar, "encoder");
            t.f(enterpriseSingleSignOnAuthentication, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            EnterpriseSingleSignOnAuthentication.write$Self$Termius_app_googleProductionRelease(enterpriseSingleSignOnAuthentication, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var};
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
            return a.f27890a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnterpriseSingleSignOnAuthentication createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new EnterpriseSingleSignOnAuthentication(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnterpriseSingleSignOnAuthentication[] newArray(int i10) {
            return new EnterpriseSingleSignOnAuthentication[i10];
        }
    }

    public /* synthetic */ EnterpriseSingleSignOnAuthentication(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f27890a.getDescriptor());
        }
        this.email = str;
        this.domainToken = str2;
    }

    public static /* synthetic */ EnterpriseSingleSignOnAuthentication copy$default(EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = enterpriseSingleSignOnAuthentication.email;
        }
        if ((i10 & 2) != 0) {
            str2 = enterpriseSingleSignOnAuthentication.domainToken;
        }
        return enterpriseSingleSignOnAuthentication.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, d dVar, f fVar) {
        dVar.f(fVar, 0, enterpriseSingleSignOnAuthentication.email);
        dVar.f(fVar, 1, enterpriseSingleSignOnAuthentication.domainToken);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.domainToken;
    }

    public final EnterpriseSingleSignOnAuthentication copy(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "domainToken");
        return new EnterpriseSingleSignOnAuthentication(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterpriseSingleSignOnAuthentication)) {
            return false;
        }
        EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication = (EnterpriseSingleSignOnAuthentication) obj;
        return t.b(this.email, enterpriseSingleSignOnAuthentication.email) && t.b(this.domainToken, enterpriseSingleSignOnAuthentication.domainToken);
    }

    public final String getDomainToken() {
        return this.domainToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.domainToken.hashCode();
    }

    public String toString() {
        return "EnterpriseSingleSignOnAuthentication(email=" + this.email + ", domainToken=" + this.domainToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.email);
        parcel.writeString(this.domainToken);
    }

    public EnterpriseSingleSignOnAuthentication(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "domainToken");
        this.email = str;
        this.domainToken = str2;
    }
}
