package com.server.auditor.ssh.client.interactors.survey;

import com.server.auditor.ssh.client.interactors.survey.CustomerSurveyCachedDataInteractor;
import hg.d;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0442a f27634e = new C0442a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27635f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f27637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CustomerSurveyCachedDataInteractor f27638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f27639d;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.survey.a$a, reason: collision with other inner class name */
    public static final class C0442a {
        public /* synthetic */ C0442a(k kVar) {
            this();
        }

        private C0442a() {
        }
    }

    public a(com.server.auditor.ssh.client.app.a aVar, d dVar, CustomerSurveyCachedDataInteractor customerSurveyCachedDataInteractor, c cVar) {
        t.f(aVar, "termiusStorage");
        t.f(dVar, "insensitiveKeyValueRepository");
        t.f(customerSurveyCachedDataInteractor, "customerSurveyCachedDataInteractor");
        t.f(cVar, "customerSurveySendDataTriggerInteractor");
        this.f27636a = aVar;
        this.f27637b = dVar;
        this.f27638c = customerSurveyCachedDataInteractor;
        this.f27639d = cVar;
    }

    private final boolean a() {
        return this.f27636a.r0();
    }

    public final void b() {
        CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData customerSurveyInteractionDataC;
        if (a() && (customerSurveyInteractionDataC = this.f27638c.c()) != null) {
            this.f27639d.a(customerSurveyInteractionDataC);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(com.server.auditor.ssh.client.app.a aVar, d dVar, CustomerSurveyCachedDataInteractor customerSurveyCachedDataInteractor, c cVar, int i10, k kVar) {
        aVar = (i10 & 1) != 0 ? com.server.auditor.ssh.client.app.a.N() : aVar;
        this(aVar, (i10 & 2) != 0 ? aVar.M() : dVar, customerSurveyCachedDataInteractor, cVar);
    }
}
