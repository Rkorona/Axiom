package com.server.auditor.ssh.client.contracts.trials;

import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.models.SubscriptionPeriod;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends MvpView {
    void A0(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction);

    void D4(String str);

    void Dc(String str);

    void F3(EndOfTrialScreen.a... aVarArr);

    void G7(String str, String str2, String str3, int i10);

    void G9();

    void L2(int i10);

    void M5(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction);

    void N4();

    void N8(boolean z10);

    void Ne();

    void O2(int i10);

    void Rc(int i10);

    void Ta();

    void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction);

    void W9();

    void Z6();

    void Zd();

    void a();

    void a0(String str);

    void b();

    void ca();

    void d4(SubscriptionPeriod subscriptionPeriod);

    void f();

    void fd();

    void g4();

    void h6();

    void hc(SubscriptionPeriod subscriptionPeriod);

    void ib();

    void id(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo);

    void jc(EndOfTrialScreen.d... dVarArr);

    void k6();

    void n3(EndOfTrialScreen.e... eVarArr);

    void q9();

    void qd();

    void r2();

    void r7();

    void t5(boolean z10, boolean z11);

    void u8();

    void vc(EndOfTrialScreen.c... cVarArr);

    void wa();

    void ze(SubscriptionPeriod subscriptionPeriod);
}
