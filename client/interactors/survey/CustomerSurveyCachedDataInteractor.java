package com.server.auditor.ssh.client.interactors.survey;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.interactors.survey.CustomerSurveyCachedDataInteractor;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction;
import hg.d;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerSurveyCachedDataInteractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27628c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27629d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f27630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mv.b f27631b;

    @p
    public static final class CustomerSurveyInteractionData {
        public static final int $stable = 0;
        private final String feedback;
        private final long ratedAtInMillis;
        private final Integer ratedScore;
        private final CustomerSurveyAction surveyAction;
        public static final b Companion = new b(null);
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: dj.a
            @Override // iu.a
            public final Object a() {
                return CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27633b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f27632a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.interactors.survey.CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData", aVar, 4);
                i2Var.r("surveyAction", false);
                i2Var.r("ratedScore", true);
                i2Var.r("ratedAtInMillis", false);
                i2Var.r("feedback", true);
                descriptor = i2Var;
                f27633b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomerSurveyInteractionData deserialize(e eVar) {
                int i10;
                CustomerSurveyAction customerSurveyAction;
                long j10;
                Integer num;
                String str;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = CustomerSurveyInteractionData.$childSerializers;
                CustomerSurveyAction customerSurveyAction2 = null;
                if (cVarD.l()) {
                    CustomerSurveyAction customerSurveyAction3 = (CustomerSurveyAction) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    Integer num2 = (Integer) cVarD.v(fVar, 1, w0.f64808a, null);
                    long jO = cVarD.o(fVar, 2);
                    customerSurveyAction = customerSurveyAction3;
                    num = num2;
                    str = (String) cVarD.v(fVar, 3, x2.f64817a, null);
                    j10 = jO;
                    i10 = 15;
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    Integer num3 = null;
                    String str2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            customerSurveyAction2 = (CustomerSurveyAction) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), customerSurveyAction2);
                            i11 |= 1;
                        } else if (iD == 1) {
                            num3 = (Integer) cVarD.v(fVar, 1, w0.f64808a, num3);
                            i11 |= 2;
                        } else if (iD == 2) {
                            jO2 = cVarD.o(fVar, 2);
                            i11 |= 4;
                        } else {
                            if (iD != 3) {
                                throw new e0(iD);
                            }
                            str2 = (String) cVarD.v(fVar, 3, x2.f64817a, str2);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    customerSurveyAction = customerSurveyAction2;
                    j10 = jO2;
                    num = num3;
                    str = str2;
                }
                cVarD.b(fVar);
                return new CustomerSurveyInteractionData(i10, customerSurveyAction, num, j10, str, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, CustomerSurveyInteractionData customerSurveyInteractionData) {
                t.f(fVar, "encoder");
                t.f(customerSurveyInteractionData, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                CustomerSurveyInteractionData.write$Self$Termius_app_googleProductionRelease(customerSurveyInteractionData, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{CustomerSurveyInteractionData.$childSerializers[0].getValue(), iv.a.u(w0.f64808a), h1.f64699a, iv.a.u(x2.f64817a)};
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
                return a.f27632a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ CustomerSurveyInteractionData(int i10, CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str, s2 s2Var) {
            if (5 != (i10 & 5)) {
                d2.a(i10, 5, a.f27632a.getDescriptor());
            }
            this.surveyAction = customerSurveyAction;
            if ((i10 & 2) == 0) {
                this.ratedScore = null;
            } else {
                this.ratedScore = num;
            }
            this.ratedAtInMillis = j10;
            if ((i10 & 8) == 0) {
                this.feedback = null;
            } else {
                this.feedback = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return CustomerSurveyAction.Companion.serializer();
        }

        public static /* synthetic */ CustomerSurveyInteractionData copy$default(CustomerSurveyInteractionData customerSurveyInteractionData, CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerSurveyAction = customerSurveyInteractionData.surveyAction;
            }
            if ((i10 & 2) != 0) {
                num = customerSurveyInteractionData.ratedScore;
            }
            if ((i10 & 4) != 0) {
                j10 = customerSurveyInteractionData.ratedAtInMillis;
            }
            if ((i10 & 8) != 0) {
                str = customerSurveyInteractionData.feedback;
            }
            String str2 = str;
            return customerSurveyInteractionData.copy(customerSurveyAction, num, j10, str2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CustomerSurveyInteractionData customerSurveyInteractionData, kv.d dVar, f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), customerSurveyInteractionData.surveyAction);
            if (dVar.E(fVar, 1) || customerSurveyInteractionData.ratedScore != null) {
                dVar.v(fVar, 1, w0.f64808a, customerSurveyInteractionData.ratedScore);
            }
            dVar.q(fVar, 2, customerSurveyInteractionData.ratedAtInMillis);
            if (!dVar.E(fVar, 3) && customerSurveyInteractionData.feedback == null) {
                return;
            }
            dVar.v(fVar, 3, x2.f64817a, customerSurveyInteractionData.feedback);
        }

        public final CustomerSurveyAction component1() {
            return this.surveyAction;
        }

        public final Integer component2() {
            return this.ratedScore;
        }

        public final long component3() {
            return this.ratedAtInMillis;
        }

        public final String component4() {
            return this.feedback;
        }

        public final CustomerSurveyInteractionData copy(CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str) {
            t.f(customerSurveyAction, "surveyAction");
            return new CustomerSurveyInteractionData(customerSurveyAction, num, j10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerSurveyInteractionData)) {
                return false;
            }
            CustomerSurveyInteractionData customerSurveyInteractionData = (CustomerSurveyInteractionData) obj;
            return this.surveyAction == customerSurveyInteractionData.surveyAction && t.b(this.ratedScore, customerSurveyInteractionData.ratedScore) && this.ratedAtInMillis == customerSurveyInteractionData.ratedAtInMillis && t.b(this.feedback, customerSurveyInteractionData.feedback);
        }

        public final String getFeedback() {
            return this.feedback;
        }

        public final long getRatedAtInMillis() {
            return this.ratedAtInMillis;
        }

        public final Integer getRatedScore() {
            return this.ratedScore;
        }

        public final CustomerSurveyAction getSurveyAction() {
            return this.surveyAction;
        }

        public int hashCode() {
            int iHashCode = this.surveyAction.hashCode() * 31;
            Integer num = this.ratedScore;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.ratedAtInMillis)) * 31;
            String str = this.feedback;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "CustomerSurveyInteractionData(surveyAction=" + this.surveyAction + ", ratedScore=" + this.ratedScore + ", ratedAtInMillis=" + this.ratedAtInMillis + ", feedback=" + this.feedback + ")";
        }

        public CustomerSurveyInteractionData(CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str) {
            t.f(customerSurveyAction, "surveyAction");
            this.surveyAction = customerSurveyAction;
            this.ratedScore = num;
            this.ratedAtInMillis = j10;
            this.feedback = str;
        }

        public /* synthetic */ CustomerSurveyInteractionData(CustomerSurveyAction customerSurveyAction, Integer num, long j10, String str, int i10, k kVar) {
            this(customerSurveyAction, (i10 & 2) != 0 ? null : num, j10, (i10 & 8) != 0 ? null : str);
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public CustomerSurveyCachedDataInteractor(d dVar, mv.b bVar) {
        t.f(dVar, "insensitiveKeyValueRepository");
        t.f(bVar, "jsonConverter");
        this.f27630a = dVar;
        this.f27631b = bVar;
    }

    public final void a(CustomerSurveyInteractionData customerSurveyInteractionData) {
        String strC;
        t.f(customerSurveyInteractionData, "customerSurveyInteractionData");
        try {
            mv.b bVar = this.f27631b;
            bVar.a();
            strC = bVar.c(CustomerSurveyInteractionData.Companion.serializer(), customerSurveyInteractionData);
        } catch (IllegalArgumentException unused) {
            strC = null;
        }
        SharedPreferences.Editor editorEdit = this.f27630a.edit();
        editorEdit.putString(SyncConstants.Bundle.CUSTOMER_SURVEY_INTERACTION_DATA_KEY, strC);
        editorEdit.apply();
    }

    public final void b() {
        SharedPreferences.Editor editorEdit = this.f27630a.edit();
        editorEdit.remove(SyncConstants.Bundle.CUSTOMER_SURVEY_INTERACTION_DATA_KEY);
        editorEdit.apply();
    }

    public final CustomerSurveyInteractionData c() {
        try {
            String string = this.f27630a.getString(SyncConstants.Bundle.CUSTOMER_SURVEY_INTERACTION_DATA_KEY, null);
            if (string == null) {
                string = "";
            }
            mv.b bVar = this.f27631b;
            bVar.a();
            return (CustomerSurveyInteractionData) bVar.b(CustomerSurveyInteractionData.Companion.serializer(), string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            return null;
        }
    }
}
