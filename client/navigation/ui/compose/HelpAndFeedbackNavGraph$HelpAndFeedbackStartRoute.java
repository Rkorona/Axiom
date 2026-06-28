package com.server.auditor.ssh.client.navigation.ui.compose;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute {
    public static final HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute INSTANCE = new HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute();
    private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.t1
        @Override // iu.a
        public final Object a() {
            return HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute._init_$_anonymous_();
        }
    });
    public static final int $stable = 8;

    private HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_() {
        return new lv.w1("com.server.auditor.ssh.client.navigation.ui.compose.HelpAndFeedbackNavGraph.HelpAndFeedbackStartRoute", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ hv.c get$cachedSerializer() {
        return (hv.c) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HelpAndFeedbackNavGraph$HelpAndFeedbackStartRoute);
    }

    public int hashCode() {
        return -296904337;
    }

    public final hv.c serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "HelpAndFeedbackStartRoute";
    }
}
