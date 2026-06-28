package com.server.auditor.ssh.client.models.account;

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
public final class AccountSubscriptionPeriod {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String endDate;
    private final String startDate;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27884b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27883a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.account.AccountSubscriptionPeriod", aVar, 2);
            i2Var.r("startDate", false);
            i2Var.r("endDate", false);
            descriptor = i2Var;
            f27884b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountSubscriptionPeriod deserialize(e eVar) {
            String strB;
            String strB2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
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
            return new AccountSubscriptionPeriod(i10, strB, strB2, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, AccountSubscriptionPeriod accountSubscriptionPeriod) {
            t.f(fVar, "encoder");
            t.f(accountSubscriptionPeriod, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            AccountSubscriptionPeriod.write$Self$Termius_app_googleProductionRelease(accountSubscriptionPeriod, dVarD, fVar2);
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
            return a.f27883a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ AccountSubscriptionPeriod(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f27883a.getDescriptor());
        }
        this.startDate = str;
        this.endDate = str2;
    }

    public static /* synthetic */ AccountSubscriptionPeriod copy$default(AccountSubscriptionPeriod accountSubscriptionPeriod, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountSubscriptionPeriod.startDate;
        }
        if ((i10 & 2) != 0) {
            str2 = accountSubscriptionPeriod.endDate;
        }
        return accountSubscriptionPeriod.copy(str, str2);
    }

    @o("endDate")
    public static /* synthetic */ void getEndDate$annotations() {
    }

    @o("startDate")
    public static /* synthetic */ void getStartDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AccountSubscriptionPeriod accountSubscriptionPeriod, d dVar, f fVar) {
        dVar.f(fVar, 0, accountSubscriptionPeriod.startDate);
        dVar.f(fVar, 1, accountSubscriptionPeriod.endDate);
    }

    public final String component1() {
        return this.startDate;
    }

    public final String component2() {
        return this.endDate;
    }

    public final AccountSubscriptionPeriod copy(String str, String str2) {
        t.f(str, "startDate");
        t.f(str2, "endDate");
        return new AccountSubscriptionPeriod(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSubscriptionPeriod)) {
            return false;
        }
        AccountSubscriptionPeriod accountSubscriptionPeriod = (AccountSubscriptionPeriod) obj;
        return t.b(this.startDate, accountSubscriptionPeriod.startDate) && t.b(this.endDate, accountSubscriptionPeriod.endDate);
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (this.startDate.hashCode() * 31) + this.endDate.hashCode();
    }

    public String toString() {
        return "AccountSubscriptionPeriod(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }

    public AccountSubscriptionPeriod(String str, String str2) {
        t.f(str, "startDate");
        t.f(str2, "endDate");
        this.startDate = str;
        this.endDate = str2;
    }
}
