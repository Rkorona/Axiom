package com.server.auditor.ssh.client.models.account;

import com.server.auditor.ssh.client.models.account.AccountSubscriptionPeriod;
import hv.c;
import hv.e0;
import hv.o;
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
public final class AccountAccessObject {
    public static final int $stable = 0;
    public static final b Companion;
    private static final c serializer;
    private final AccountSubscriptionPeriod subscriptionPeriod;
    private final String subscriptionTitle;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27882b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27881a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.account.AccountAccessObject", aVar, 2);
            i2Var.r("subscriptionTitle", false);
            i2Var.r("subscriptionPeriod", true);
            descriptor = i2Var;
            f27882b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountAccessObject deserialize(e eVar) {
            String strB;
            AccountSubscriptionPeriod accountSubscriptionPeriod;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                accountSubscriptionPeriod = (AccountSubscriptionPeriod) cVarD.v(fVar, 1, AccountSubscriptionPeriod.a.f27883a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strB = null;
                AccountSubscriptionPeriod accountSubscriptionPeriod2 = null;
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
                        accountSubscriptionPeriod2 = (AccountSubscriptionPeriod) cVarD.v(fVar, 1, AccountSubscriptionPeriod.a.f27883a, accountSubscriptionPeriod2);
                        i11 |= 2;
                    }
                }
                accountSubscriptionPeriod = accountSubscriptionPeriod2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new AccountAccessObject(i10, strB, accountSubscriptionPeriod, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, AccountAccessObject accountAccessObject) {
            t.f(fVar, "encoder");
            t.f(accountAccessObject, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            AccountAccessObject.write$Self$Termius_app_googleProductionRelease(accountAccessObject, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final c[] childSerializers() {
            return new c[]{x2.f64817a, iv.a.u(AccountSubscriptionPeriod.a.f27883a)};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final c a() {
            return AccountAccessObject.serializer;
        }

        public final c serializer() {
            return a.f27881a;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        serializer = bVar.serializer();
    }

    public /* synthetic */ AccountAccessObject(int i10, String str, AccountSubscriptionPeriod accountSubscriptionPeriod, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27881a.getDescriptor());
        }
        this.subscriptionTitle = str;
        if ((i10 & 2) == 0) {
            this.subscriptionPeriod = null;
        } else {
            this.subscriptionPeriod = accountSubscriptionPeriod;
        }
    }

    public static /* synthetic */ AccountAccessObject copy$default(AccountAccessObject accountAccessObject, String str, AccountSubscriptionPeriod accountSubscriptionPeriod, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountAccessObject.subscriptionTitle;
        }
        if ((i10 & 2) != 0) {
            accountSubscriptionPeriod = accountAccessObject.subscriptionPeriod;
        }
        return accountAccessObject.copy(str, accountSubscriptionPeriod);
    }

    @o("subscriptionPeriod")
    public static /* synthetic */ void getSubscriptionPeriod$annotations() {
    }

    @o("subscriptionTitle")
    public static /* synthetic */ void getSubscriptionTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AccountAccessObject accountAccessObject, d dVar, f fVar) {
        dVar.f(fVar, 0, accountAccessObject.subscriptionTitle);
        if (!dVar.E(fVar, 1) && accountAccessObject.subscriptionPeriod == null) {
            return;
        }
        dVar.v(fVar, 1, AccountSubscriptionPeriod.a.f27883a, accountAccessObject.subscriptionPeriod);
    }

    public final String component1() {
        return this.subscriptionTitle;
    }

    public final AccountSubscriptionPeriod component2() {
        return this.subscriptionPeriod;
    }

    public final AccountAccessObject copy(String str, AccountSubscriptionPeriod accountSubscriptionPeriod) {
        t.f(str, "subscriptionTitle");
        return new AccountAccessObject(str, accountSubscriptionPeriod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAccessObject)) {
            return false;
        }
        AccountAccessObject accountAccessObject = (AccountAccessObject) obj;
        return t.b(this.subscriptionTitle, accountAccessObject.subscriptionTitle) && t.b(this.subscriptionPeriod, accountAccessObject.subscriptionPeriod);
    }

    public final AccountSubscriptionPeriod getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public int hashCode() {
        int iHashCode = this.subscriptionTitle.hashCode() * 31;
        AccountSubscriptionPeriod accountSubscriptionPeriod = this.subscriptionPeriod;
        return iHashCode + (accountSubscriptionPeriod == null ? 0 : accountSubscriptionPeriod.hashCode());
    }

    public String toString() {
        return "AccountAccessObject(subscriptionTitle=" + this.subscriptionTitle + ", subscriptionPeriod=" + this.subscriptionPeriod + ")";
    }

    public AccountAccessObject(String str, AccountSubscriptionPeriod accountSubscriptionPeriod) {
        t.f(str, "subscriptionTitle");
        this.subscriptionTitle = str;
        this.subscriptionPeriod = accountSubscriptionPeriod;
    }

    public /* synthetic */ AccountAccessObject(String str, AccountSubscriptionPeriod accountSubscriptionPeriod, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : accountSubscriptionPeriod);
    }
}
