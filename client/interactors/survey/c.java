package com.server.auditor.ssh.client.interactors.survey;

import com.server.auditor.ssh.client.interactors.survey.CustomerSurveyCachedDataInteractor;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncServiceHelper f27652a;

    public c(SyncServiceHelper syncServiceHelper) {
        t.f(syncServiceHelper, "syncServiceHelper");
        this.f27652a = syncServiceHelper;
    }

    public final void a(CustomerSurveyCachedDataInteractor.CustomerSurveyInteractionData customerSurveyInteractionData) {
        t.f(customerSurveyInteractionData, "customerSurveyInteractionData");
        this.f27652a.planToSendCustomerSurveyInteractionData(customerSurveyInteractionData.getSurveyAction(), customerSurveyInteractionData.getRatedScore(), customerSurveyInteractionData.getRatedAtInMillis(), customerSurveyInteractionData.getFeedback());
    }
}
