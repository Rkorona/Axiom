package com.server.auditor.ssh.client.interactors.survey;

import android.content.SharedPreferences;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowQueue;
import com.server.auditor.ssh.client.interactors.survey.CustomerSurveyCachedDataInteractor;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction;
import il.e0;
import il.f0;
import il.j;
import il.k;
import il.l;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f27640k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27641l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.d f27643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f27644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f27645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f27646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f27647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f27648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CustomerSurveyCachedDataInteractor f27649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.survey.c f27650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NewConnectionFlowQueue f27651j;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.survey.b$b, reason: collision with other inner class name */
    public interface InterfaceC0443b {
        void a();
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void a();
    }

    public interface e {
        void a();
    }

    public interface f {
        void a();
    }

    public interface g {
        void a();
    }

    public interface h {
        void a();
    }

    public b(com.server.auditor.ssh.client.app.a aVar, hg.d dVar, f0 f0Var, e0 e0Var, k kVar, j jVar, l lVar, CustomerSurveyCachedDataInteractor customerSurveyCachedDataInteractor, com.server.auditor.ssh.client.interactors.survey.c cVar, NewConnectionFlowQueue newConnectionFlowQueue) {
        t.f(aVar, "termiusStorage");
        t.f(dVar, "insensitiveKeyValueRepository");
        t.f(f0Var, "rateUsRemoteConfigRepository");
        t.f(e0Var, "rateUsPresentationVariantRepository");
        t.f(kVar, "currentTimeRepository");
        t.f(jVar, "currentAppVersionRepository");
        t.f(lVar, "customerSurveyAnalyticsRepository");
        t.f(customerSurveyCachedDataInteractor, "customerSurveyCachedDataInteractor");
        t.f(cVar, "customerSurveySendDataTriggerInteractor");
        t.f(newConnectionFlowQueue, "newConnectionFlowQueue");
        this.f27642a = aVar;
        this.f27643b = dVar;
        this.f27644c = f0Var;
        this.f27645d = e0Var;
        this.f27646e = kVar;
        this.f27647f = jVar;
        this.f27648g = lVar;
        this.f27649h = customerSurveyCachedDataInteractor;
        this.f27650i = cVar;
        this.f27651j = newConnectionFlowQueue;
    }

    private final void a(CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData customerSurveyInteractionData) {
        this.f27649h.a(customerSurveyInteractionData);
        if (this.f27642a.r0()) {
            this.f27650i.a(customerSurveyInteractionData);
        }
    }

    private final boolean b(f0.b bVar) {
        return e() && f(bVar) && d(bVar) && g(bVar) && h(bVar);
    }

    private final int c(f0.b bVar) {
        return this.f27643b.getInt("remain_count_of_show_review_per_cycle", bVar.d());
    }

    private final boolean d(f0.b bVar) {
        return this.f27643b.getInt("count_of_successful_connections", 0) >= bVar.c();
    }

    private final boolean e() {
        String string = this.f27643b.getString("customer_survey_reviewed_on_version", "");
        return t.b("", string) || !t.b(string, this.f27647f.a());
    }

    private final boolean f(f0.b bVar) {
        return (this.f27646e.a() - this.f27643b.getLong("time_of_last_review_rated", 0L)) / 86400000 >= ((long) bVar.b());
    }

    private final boolean g(f0.b bVar) {
        return (this.f27646e.a() - this.f27643b.getLong("time_of_last_review_show", 0L)) / 86400000 >= ((long) bVar.a());
    }

    private final boolean h(f0.b bVar) {
        return c(bVar) > 0;
    }

    private final boolean j(f0.b bVar) {
        return !this.f27643b.getBoolean("enable_count_of_successful_connections", false) && f(bVar) && g(bVar) && h(bVar);
    }

    public final void i(d dVar) {
        f0.b bVarA;
        t.f(dVar, "callback");
        if (this.f27651j.terminalSessionQueueSize() != 0 || u() || (bVarA = this.f27644c.a()) == null) {
            return;
        }
        if (j(bVarA)) {
            SharedPreferences.Editor editorEdit = this.f27643b.edit();
            editorEdit.putInt("count_of_successful_connections", 0);
            editorEdit.putBoolean("enable_count_of_successful_connections", true);
            editorEdit.apply();
            return;
        }
        if (b(bVarA)) {
            boolean zA = this.f27645d.a();
            this.f27648g.a(zA);
            this.f27648g.f();
            if (!zA) {
                dVar.a();
                return;
            }
            SharedPreferences.Editor editorEdit2 = this.f27643b.edit();
            editorEdit2.putBoolean("show_rate_us_hosts_item", true);
            editorEdit2.apply();
        }
    }

    public final void k(int i10) {
        this.f27648g.b(i10);
        long jA = this.f27646e.a();
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), this.f27646e.a(), (String) null, 8, (ju.k) null));
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putLong("time_of_last_review_rated", jA);
        editorEdit.remove("time_of_last_review_show");
        editorEdit.remove("remain_count_of_show_review_per_cycle");
        editorEdit.apply();
    }

    public final void l(int i10, InterfaceC0443b interfaceC0443b) {
        t.f(interfaceC0443b, "callback");
        this.f27648g.b(i10);
        long jA = this.f27646e.a();
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), this.f27646e.a(), (String) null, 8, (ju.k) null));
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putLong("time_of_last_review_rated", jA);
        editorEdit.remove("time_of_last_review_show");
        editorEdit.remove("remain_count_of_show_review_per_cycle");
        editorEdit.apply();
        interfaceC0443b.a();
    }

    public final void m(int i10, String str, h hVar) {
        t.f(str, "feedback");
        t.f(hVar, "callback");
        this.f27648g.d(i10, str);
        long jA = this.f27646e.a();
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), jA, str));
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putLong("time_of_last_review_rated", jA);
        editorEdit.remove("time_of_last_review_show");
        editorEdit.remove("remain_count_of_show_review_per_cycle");
        editorEdit.apply();
        hVar.a();
    }

    public final void n(int i10) {
        this.f27648g.b(i10);
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), this.f27646e.a(), (String) null, 8, (ju.k) null));
    }

    public final void o(int i10, c cVar) {
        t.f(cVar, "callback");
        this.f27648g.e(i10);
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), this.f27646e.a(), (String) null, 8, (ju.k) null));
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putString("customer_survey_reviewed_on_version", this.f27647f.a());
        editorEdit.apply();
        if (this.f27642a.m() && this.f27642a.j()) {
            cVar.b();
        } else {
            cVar.a();
        }
    }

    public final void p(e eVar) {
        t.f(eVar, "callback");
        long jA = this.f27646e.a();
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putLong("time_of_last_review_rated", jA);
        editorEdit.remove("time_of_last_review_show");
        editorEdit.remove("remain_count_of_show_review_per_cycle");
        editorEdit.remove("count_of_successful_connections");
        editorEdit.putBoolean("enable_count_of_successful_connections", false);
        editorEdit.apply();
        eVar.a();
    }

    public final void q(int i10, f fVar) {
        t.f(fVar, "callback");
        this.f27648g.b(i10);
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.RATED, Integer.valueOf(i10), this.f27646e.a(), (String) null, 8, (ju.k) null));
        fVar.a();
    }

    public final void r(g gVar) {
        t.f(gVar, "callback");
        long jA = this.f27646e.a();
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        editorEdit.putLong("time_of_last_review_rated", jA);
        editorEdit.remove("time_of_last_review_show");
        editorEdit.remove("remain_count_of_show_review_per_cycle");
        editorEdit.remove("count_of_successful_connections");
        editorEdit.putBoolean("enable_count_of_successful_connections", false);
        editorEdit.apply();
        gVar.a();
    }

    public final void s() {
        f0.b bVarA = this.f27644c.a();
        if (bVarA == null) {
            return;
        }
        int iC = c(bVarA) - 1;
        long jA = this.f27646e.a();
        this.f27648g.c();
        a(new CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData(CustomerSurveyAction.DISMISSED, (Integer) null, this.f27646e.a(), (String) null, 10, (ju.k) null));
        SharedPreferences.Editor editorEdit = this.f27643b.edit();
        if (iC <= 0) {
            editorEdit.putLong("time_of_last_review_rated", jA);
            editorEdit.remove("time_of_last_review_show");
            editorEdit.remove("remain_count_of_show_review_per_cycle");
        } else {
            editorEdit.putInt("remain_count_of_show_review_per_cycle", iC);
            editorEdit.putLong("time_of_last_review_show", jA);
        }
        editorEdit.remove("count_of_successful_connections");
        editorEdit.putBoolean("enable_count_of_successful_connections", false);
        editorEdit.apply();
    }

    public final void t() {
        if (this.f27643b.getBoolean("enable_count_of_successful_connections", false)) {
            int i10 = this.f27643b.getInt("count_of_successful_connections", 0);
            SharedPreferences.Editor editorEdit = this.f27643b.edit();
            editorEdit.putInt("count_of_successful_connections", i10 + 1);
            editorEdit.apply();
        }
    }

    public final boolean u() {
        return this.f27643b.getBoolean("show_rate_us_hosts_item", false);
    }
}
