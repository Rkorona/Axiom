package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import hg.b2;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes2.dex */
public final class MigrateToAccountAccessObjectsPatch implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f21432a = new a(null);

    @hv.p
    private static final class MigrationAccountAccessObject {
        public static final b Companion = new b(null);
        private final MigrationAccountSubscriptionPeriod subscriptionPeriod;
        private final String subscriptionTitle;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21434b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f21433a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.preferencesmigration.MigrateToAccountAccessObjectsPatch.MigrationAccountAccessObject", aVar, 2);
                i2Var.r("subscriptionTitle", false);
                i2Var.r("subscriptionPeriod", true);
                descriptor = i2Var;
                f21434b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MigrationAccountAccessObject deserialize(kv.e eVar) {
                String strB;
                MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    migrationAccountSubscriptionPeriod = (MigrationAccountSubscriptionPeriod) cVarD.v(fVar, 1, MigrationAccountSubscriptionPeriod.a.f21435a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod2 = null;
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
                            migrationAccountSubscriptionPeriod2 = (MigrationAccountSubscriptionPeriod) cVarD.v(fVar, 1, MigrationAccountSubscriptionPeriod.a.f21435a, migrationAccountSubscriptionPeriod2);
                            i11 |= 2;
                        }
                    }
                    migrationAccountSubscriptionPeriod = migrationAccountSubscriptionPeriod2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new MigrationAccountAccessObject(i10, strB, migrationAccountSubscriptionPeriod, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, MigrationAccountAccessObject migrationAccountAccessObject) {
                ju.t.f(fVar, "encoder");
                ju.t.f(migrationAccountAccessObject, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                MigrationAccountAccessObject.write$Self$Termius_app_googleProductionRelease(migrationAccountAccessObject, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, iv.a.u(MigrationAccountSubscriptionPeriod.a.f21435a)};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f21433a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ MigrationAccountAccessObject(int i10, String str, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f21433a.getDescriptor());
            }
            this.subscriptionTitle = str;
            if ((i10 & 2) == 0) {
                this.subscriptionPeriod = null;
            } else {
                this.subscriptionPeriod = migrationAccountSubscriptionPeriod;
            }
        }

        public static /* synthetic */ MigrationAccountAccessObject copy$default(MigrationAccountAccessObject migrationAccountAccessObject, String str, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = migrationAccountAccessObject.subscriptionTitle;
            }
            if ((i10 & 2) != 0) {
                migrationAccountSubscriptionPeriod = migrationAccountAccessObject.subscriptionPeriod;
            }
            return migrationAccountAccessObject.copy(str, migrationAccountSubscriptionPeriod);
        }

        @hv.o("subscriptionPeriod")
        public static /* synthetic */ void getSubscriptionPeriod$annotations() {
        }

        @hv.o("subscriptionTitle")
        public static /* synthetic */ void getSubscriptionTitle$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MigrationAccountAccessObject migrationAccountAccessObject, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, migrationAccountAccessObject.subscriptionTitle);
            if (!dVar.E(fVar, 1) && migrationAccountAccessObject.subscriptionPeriod == null) {
                return;
            }
            dVar.v(fVar, 1, MigrationAccountSubscriptionPeriod.a.f21435a, migrationAccountAccessObject.subscriptionPeriod);
        }

        public final String component1() {
            return this.subscriptionTitle;
        }

        public final MigrationAccountSubscriptionPeriod component2() {
            return this.subscriptionPeriod;
        }

        public final MigrationAccountAccessObject copy(String str, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod) {
            ju.t.f(str, "subscriptionTitle");
            return new MigrationAccountAccessObject(str, migrationAccountSubscriptionPeriod);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrationAccountAccessObject)) {
                return false;
            }
            MigrationAccountAccessObject migrationAccountAccessObject = (MigrationAccountAccessObject) obj;
            return ju.t.b(this.subscriptionTitle, migrationAccountAccessObject.subscriptionTitle) && ju.t.b(this.subscriptionPeriod, migrationAccountAccessObject.subscriptionPeriod);
        }

        public final MigrationAccountSubscriptionPeriod getSubscriptionPeriod() {
            return this.subscriptionPeriod;
        }

        public final String getSubscriptionTitle() {
            return this.subscriptionTitle;
        }

        public int hashCode() {
            int iHashCode = this.subscriptionTitle.hashCode() * 31;
            MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod = this.subscriptionPeriod;
            return iHashCode + (migrationAccountSubscriptionPeriod == null ? 0 : migrationAccountSubscriptionPeriod.hashCode());
        }

        public String toString() {
            return "MigrationAccountAccessObject(subscriptionTitle=" + this.subscriptionTitle + ", subscriptionPeriod=" + this.subscriptionPeriod + ")";
        }

        public MigrationAccountAccessObject(String str, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod) {
            ju.t.f(str, "subscriptionTitle");
            this.subscriptionTitle = str;
            this.subscriptionPeriod = migrationAccountSubscriptionPeriod;
        }

        public /* synthetic */ MigrationAccountAccessObject(String str, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod, int i10, ju.k kVar) {
            this(str, (i10 & 2) != 0 ? null : migrationAccountSubscriptionPeriod);
        }
    }

    @hv.p
    private static final class MigrationAccountSubscriptionPeriod {
        public static final b Companion = new b(null);
        private final String endDate;
        private final String startDate;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21435a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21436b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f21435a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.preferencesmigration.MigrateToAccountAccessObjectsPatch.MigrationAccountSubscriptionPeriod", aVar, 2);
                i2Var.r("startDate", false);
                i2Var.r("endDate", false);
                descriptor = i2Var;
                f21436b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MigrationAccountSubscriptionPeriod deserialize(kv.e eVar) {
                String strB;
                String strB2;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
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
                return new MigrationAccountSubscriptionPeriod(i10, strB, strB2, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod) {
                ju.t.f(fVar, "encoder");
                ju.t.f(migrationAccountSubscriptionPeriod, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                MigrationAccountSubscriptionPeriod.write$Self$Termius_app_googleProductionRelease(migrationAccountSubscriptionPeriod, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{x2Var, x2Var};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f21435a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ MigrationAccountSubscriptionPeriod(int i10, String str, String str2, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f21435a.getDescriptor());
            }
            this.startDate = str;
            this.endDate = str2;
        }

        public static /* synthetic */ MigrationAccountSubscriptionPeriod copy$default(MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = migrationAccountSubscriptionPeriod.startDate;
            }
            if ((i10 & 2) != 0) {
                str2 = migrationAccountSubscriptionPeriod.endDate;
            }
            return migrationAccountSubscriptionPeriod.copy(str, str2);
        }

        @hv.o("endDate")
        public static /* synthetic */ void getEndDate$annotations() {
        }

        @hv.o("startDate")
        public static /* synthetic */ void getStartDate$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, migrationAccountSubscriptionPeriod.startDate);
            dVar.f(fVar, 1, migrationAccountSubscriptionPeriod.endDate);
        }

        public final String component1() {
            return this.startDate;
        }

        public final String component2() {
            return this.endDate;
        }

        public final MigrationAccountSubscriptionPeriod copy(String str, String str2) {
            ju.t.f(str, "startDate");
            ju.t.f(str2, "endDate");
            return new MigrationAccountSubscriptionPeriod(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrationAccountSubscriptionPeriod)) {
                return false;
            }
            MigrationAccountSubscriptionPeriod migrationAccountSubscriptionPeriod = (MigrationAccountSubscriptionPeriod) obj;
            return ju.t.b(this.startDate, migrationAccountSubscriptionPeriod.startDate) && ju.t.b(this.endDate, migrationAccountSubscriptionPeriod.endDate);
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
            return "MigrationAccountSubscriptionPeriod(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        }

        public MigrationAccountSubscriptionPeriod(String str, String str2) {
            ju.t.f(str, "startDate");
            ju.t.f(str2, "endDate");
            this.startDate = str;
            this.endDate = str2;
        }
    }

    private static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean b(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getBoolean("key_account_has_personal_subscription", false);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    private final boolean c(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getBoolean("key_account_has_team", false);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    private final boolean d(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getBoolean("IS_TRIAL_PROMO_SHOWED", false);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    private final String e(SharedPreferences sharedPreferences) {
        String string = null;
        try {
            string = sharedPreferences.getString("key_current_plan_type", null);
        } catch (ClassCastException unused) {
        }
        return string == null ? WelcomeFlowViewModel.planTypeFree : string;
    }

    private final ut.u f(SharedPreferences sharedPreferences) {
        try {
            String string = sharedPreferences.getString("key_user_account_period_from", null);
            String string2 = sharedPreferences.getString("key_user_account_period_until", null);
            if (string != null && string2 != null) {
                return new ut.u(string, string2);
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    private final String g(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString("key_account_user_type", null);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    private final String i(List list) {
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            bVarS1.a();
            return bVarS1.c(new lv.f(MigrationAccountAccessObject.Companion.serializer()), list);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        String strH = h(g(sharedPreferences), f(sharedPreferences), e(sharedPreferences), d(sharedPreferences), c(sharedPreferences), b(sharedPreferences));
        if (strH == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("key_bulk_account_access_objects", strH);
        editorEdit.apply();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(java.lang.String r9, ut.u r10, java.lang.String r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.app.preferencesmigration.MigrateToAccountAccessObjectsPatch.h(java.lang.String, ut.u, java.lang.String, boolean, boolean, boolean):java.lang.String");
    }
}
