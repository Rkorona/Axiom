package com.server.auditor.ssh.client.interactors;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.q;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.models.GracePeriodSubscription;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27583c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27584d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f27585e = vt.v.e("stripe");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f27587b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f27589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GracePeriodSubscription f27590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FragmentActivity fragmentActivity, GracePeriodSubscription gracePeriodSubscription, zt.e eVar) {
            super(2, eVar);
            this.f27589b = fragmentActivity;
            this.f27590c = gracePeriodSubscription;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f27589b, this.f27590c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27588a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f27589b.getLifecycle().b().c(q.b.f8799d)) {
                if (TermiusApplication.Q()) {
                    return ut.m0.f82633a;
                }
                NavigationPopUpWhenLargeActivity.f28304b.b(this.f27589b, new NavigationPopUpWhenLargeActivity.NavigationDestination.GracePeriodFlow(this.f27590c));
                TermiusApplication.a0(true);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public s(com.server.auditor.ssh.client.app.a aVar, SharedPreferences sharedPreferences) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(sharedPreferences, "sharedPreferences");
        this.f27586a = aVar;
        this.f27587b = sharedPreferences;
    }

    private final boolean b() {
        Date dateE;
        if (f27585e.contains(this.f27586a.W()) && ju.t.b(this.f27586a.X(), "RETRYING") && (dateE = tp.d1.e(this.f27586a.Y())) != null) {
            try {
                return dateE.after(d());
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }

    private final boolean c() {
        Date dateE;
        if (f27585e.contains(this.f27586a.e0()) && ju.t.b(this.f27586a.f0(), "RETRYING") && (dateE = tp.d1.e(this.f27586a.g0())) != null) {
            try {
                return dateE.after(d());
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }

    private final Date d() {
        Date dateE;
        Date date = new Date(Long.MIN_VALUE);
        String string = null;
        try {
            string = this.f27587b.getString("key_last_grace_period_granted_date", null);
        } catch (ClassCastException unused) {
        }
        return (string == null || (dateE = tp.d1.e(string)) == null) ? date : dateE;
    }

    private final void f(FragmentActivity fragmentActivity, GracePeriodSubscription gracePeriodSubscription) {
        wu.k.d(androidx.lifecycle.a0.a(fragmentActivity), null, null, new b(fragmentActivity, gracePeriodSubscription, null), 3, null);
    }

    private final void h(String str) {
        SharedPreferences.Editor editorEdit = this.f27587b.edit();
        editorEdit.putString("key_last_grace_period_granted_date", str);
        editorEdit.apply();
    }

    public final GracePeriodSubscription a() {
        if (this.f27586a.o0()) {
            return null;
        }
        if (!this.f27586a.m()) {
            if (b()) {
                return GracePeriodSubscription.Personal.INSTANCE;
            }
            return null;
        }
        if (this.f27586a.j() && c()) {
            return GracePeriodSubscription.Team.INSTANCE;
        }
        return null;
    }

    public final void e(GracePeriodSubscription gracePeriodSubscription) {
        String strG0;
        ju.t.f(gracePeriodSubscription, "gracePeriodSubscription");
        if (ju.t.b(gracePeriodSubscription, GracePeriodSubscription.Personal.INSTANCE)) {
            strG0 = this.f27586a.Y();
        } else {
            if (!ju.t.b(gracePeriodSubscription, GracePeriodSubscription.Team.INSTANCE)) {
                throw new ut.s();
            }
            strG0 = this.f27586a.g0();
        }
        h(strG0);
    }

    public final void g(FragmentActivity fragmentActivity) {
        ju.t.f(fragmentActivity, "activity");
        GracePeriodSubscription gracePeriodSubscriptionA = a();
        if (gracePeriodSubscriptionA == null) {
            return;
        }
        f(fragmentActivity, gracePeriodSubscriptionA);
    }
}
