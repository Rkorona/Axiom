package com.server.auditor.ssh.client.viewmodels;

import androidx.lifecycle.f0;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.interactors.y;
import com.server.auditor.ssh.client.navigation.a2;
import com.server.auditor.ssh.client.navigation.m0;
import com.server.auditor.ssh.client.navigation.n0;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import hg.b2;
import iu.a;
import iu.l;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageRouterViewModel extends i1 {
    public static final int $stable = 8;
    private final k0 _customerSurveyInAppMessages;
    private final f0 customerSurveyInAppMessages;
    private final f0 inAppMessagesLiveData;
    private final n notificationForceActionInteractor$delegate;
    private final n notificationsInteractor$delegate;

    public InAppMessageRouterViewModel() {
        r rVar = r.f82639c;
        this.notificationsInteractor$delegate = o.b(rVar, new a() { // from class: jq.a
            @Override // iu.a
            public final Object a() {
                return InAppMessageRouterViewModel.notificationsInteractor_delegate$lambda$0();
            }
        });
        this.notificationForceActionInteractor$delegate = o.b(rVar, new a() { // from class: jq.b
            @Override // iu.a
            public final Object a() {
                return InAppMessageRouterViewModel.notificationForceActionInteractor_delegate$lambda$1();
            }
        });
        k0 k0Var = new k0();
        this._customerSurveyInAppMessages = k0Var;
        this.customerSurveyInAppMessages = k0Var;
        this.inAppMessagesLiveData = h1.e(getNotificationsInteractor().n(), new l() { // from class: jq.c
            @Override // iu.l
            public final Object invoke(Object obj) {
                return InAppMessageRouterViewModel.inAppMessagesLiveData$lambda$3(this.f62791a, (m0) obj);
            }
        });
    }

    private final void filterCustomerSurveyInAppMessages(List<n0> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t.b(((n0) obj).a(), "termius-message://ces-survey")) {
                arrayList.add(obj);
            }
        }
        this._customerSurveyInAppMessages.n(arrayList);
    }

    private final y getNotificationForceActionInteractor() {
        return (y) this.notificationForceActionInteractor$delegate.getValue();
    }

    private final a2 getNotificationsInteractor() {
        return (a2) this.notificationsInteractor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List inAppMessagesLiveData$lambda$3(InAppMessageRouterViewModel inAppMessageRouterViewModel, m0 m0Var) {
        List listB = m0Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            n0 n0Var = (n0) obj;
            if (n0Var.f() && !inAppMessageRouterViewModel.getNotificationForceActionInteractor().a(n0Var.g())) {
                arrayList.add(obj);
            }
        }
        inAppMessageRouterViewModel.filterCustomerSurveyInAppMessages(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y notificationForceActionInteractor_delegate$lambda$1() {
        return b2.f52944a.o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 notificationsInteractor_delegate$lambda$0() {
        return b2.f52944a.D1();
    }

    public final f0 getCustomerSurveyInAppMessages() {
        return this.customerSurveyInAppMessages;
    }

    public final f0 getInAppMessagesLiveData() {
        return this.inAppMessagesLiveData;
    }

    public final void markInAppMessageAsForced(n0 n0Var) {
        t.f(n0Var, "inAppMessage");
        getNotificationForceActionInteractor().b(n0Var.g());
    }
}
