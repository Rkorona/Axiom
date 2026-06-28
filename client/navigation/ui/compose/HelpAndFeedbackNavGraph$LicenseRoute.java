package com.server.auditor.ssh.client.navigation.ui.compose;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class HelpAndFeedbackNavGraph$LicenseRoute {
    public static final HelpAndFeedbackNavGraph$LicenseRoute INSTANCE = new HelpAndFeedbackNavGraph$LicenseRoute();
    private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.u1
        @Override // iu.a
        public final Object a() {
            return HelpAndFeedbackNavGraph$LicenseRoute._init_$_anonymous_();
        }
    });
    public static final int $stable = 8;

    private HelpAndFeedbackNavGraph$LicenseRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_() {
        return new lv.w1("com.server.auditor.ssh.client.navigation.ui.compose.HelpAndFeedbackNavGraph.LicenseRoute", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ hv.c get$cachedSerializer() {
        return (hv.c) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof HelpAndFeedbackNavGraph$LicenseRoute);
    }

    public int hashCode() {
        return -634812965;
    }

    public final hv.c serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "LicenseRoute";
    }
}
