package com.server.auditor.ssh.client.synchronization.api.models.user;

import bu.a;
import bu.b;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction;
import hv.c;
import hv.o;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import lv.j0;
import ut.n;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p
public final class CustomerSurveyAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomerSurveyAction[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final Companion Companion;

    @o("rated")
    public static final CustomerSurveyAction RATED = new CustomerSurveyAction("RATED", 0);

    @o("dismissed")
    public static final CustomerSurveyAction DISMISSED = new CustomerSurveyAction("DISMISSED", 1);

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) CustomerSurveyAction.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ CustomerSurveyAction[] $values() {
        return new CustomerSurveyAction[]{RATED, DISMISSED};
    }

    static {
        CustomerSurveyAction[] customerSurveyActionArr$values = $values();
        $VALUES = customerSurveyActionArr$values;
        $ENTRIES = b.a(customerSurveyActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: gn.c
            @Override // iu.a
            public final Object a() {
                return CustomerSurveyAction._init_$_anonymous_();
            }
        });
    }

    private CustomerSurveyAction(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.a("com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction", values(), new String[]{"rated", "dismissed"}, new Annotation[][]{null, null}, null);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CustomerSurveyAction valueOf(String str) {
        return (CustomerSurveyAction) Enum.valueOf(CustomerSurveyAction.class, str);
    }

    public static CustomerSurveyAction[] values() {
        return (CustomerSurveyAction[]) $VALUES.clone();
    }
}
