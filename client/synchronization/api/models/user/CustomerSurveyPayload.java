package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyPayload;
import hv.c;
import hv.p;
import iu.a;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CustomerSurveyPayload {
    public static final int $stable = 0;
    private final CustomerSurveyAction action;
    private final String feedback;
    private final String interactedAt;
    private final Integer score;
    public static final Companion Companion = new Companion(null);
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: gn.d
        @Override // iu.a
        public final Object a() {
            return CustomerSurveyPayload._childSerializers$_anonymous_();
        }
    }), null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CustomerSurveyPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CustomerSurveyPayload(int i10, CustomerSurveyAction customerSurveyAction, Integer num, String str, String str2, s2 s2Var) {
        if (5 != (i10 & 5)) {
            d2.a(i10, 5, CustomerSurveyPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.action = customerSurveyAction;
        if ((i10 & 2) == 0) {
            this.score = null;
        } else {
            this.score = num;
        }
        this.interactedAt = str;
        if ((i10 & 8) == 0) {
            this.feedback = null;
        } else {
            this.feedback = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return CustomerSurveyAction.Companion.serializer();
    }

    public static /* synthetic */ CustomerSurveyPayload copy$default(CustomerSurveyPayload customerSurveyPayload, CustomerSurveyAction customerSurveyAction, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customerSurveyAction = customerSurveyPayload.action;
        }
        if ((i10 & 2) != 0) {
            num = customerSurveyPayload.score;
        }
        if ((i10 & 4) != 0) {
            str = customerSurveyPayload.interactedAt;
        }
        if ((i10 & 8) != 0) {
            str2 = customerSurveyPayload.feedback;
        }
        return customerSurveyPayload.copy(customerSurveyAction, num, str, str2);
    }

    @hv.o("action")
    public static /* synthetic */ void getAction$annotations() {
    }

    @hv.o(Column.COMMENT)
    public static /* synthetic */ void getFeedback$annotations() {
    }

    @hv.o("interacted_at")
    public static /* synthetic */ void getInteractedAt$annotations() {
    }

    @hv.o("score")
    public static /* synthetic */ void getScore$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CustomerSurveyPayload customerSurveyPayload, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), customerSurveyPayload.action);
        if (dVar.E(fVar, 1) || customerSurveyPayload.score != null) {
            dVar.v(fVar, 1, w0.f64808a, customerSurveyPayload.score);
        }
        dVar.f(fVar, 2, customerSurveyPayload.interactedAt);
        if (!dVar.E(fVar, 3) && customerSurveyPayload.feedback == null) {
            return;
        }
        dVar.v(fVar, 3, x2.f64817a, customerSurveyPayload.feedback);
    }

    public final CustomerSurveyAction component1() {
        return this.action;
    }

    public final Integer component2() {
        return this.score;
    }

    public final String component3() {
        return this.interactedAt;
    }

    public final String component4() {
        return this.feedback;
    }

    public final CustomerSurveyPayload copy(CustomerSurveyAction customerSurveyAction, Integer num, String str, String str2) {
        t.f(customerSurveyAction, "action");
        t.f(str, "interactedAt");
        return new CustomerSurveyPayload(customerSurveyAction, num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSurveyPayload)) {
            return false;
        }
        CustomerSurveyPayload customerSurveyPayload = (CustomerSurveyPayload) obj;
        return this.action == customerSurveyPayload.action && t.b(this.score, customerSurveyPayload.score) && t.b(this.interactedAt, customerSurveyPayload.interactedAt) && t.b(this.feedback, customerSurveyPayload.feedback);
    }

    public final CustomerSurveyAction getAction() {
        return this.action;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final String getInteractedAt() {
        return this.interactedAt;
    }

    public final Integer getScore() {
        return this.score;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        Integer num = this.score;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.interactedAt.hashCode()) * 31;
        String str = this.feedback;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CustomerSurveyPayload(action=" + this.action + ", score=" + this.score + ", interactedAt=" + this.interactedAt + ", feedback=" + this.feedback + ")";
    }

    public CustomerSurveyPayload(CustomerSurveyAction customerSurveyAction, Integer num, String str, String str2) {
        t.f(customerSurveyAction, "action");
        t.f(str, "interactedAt");
        this.action = customerSurveyAction;
        this.score = num;
        this.interactedAt = str;
        this.feedback = str2;
    }

    public /* synthetic */ CustomerSurveyPayload(CustomerSurveyAction customerSurveyAction, Integer num, String str, String str2, int i10, k kVar) {
        this(customerSurveyAction, (i10 & 2) != 0 ? null : num, str, (i10 & 8) != 0 ? null : str2);
    }
}
