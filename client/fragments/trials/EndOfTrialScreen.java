package com.server.auditor.ssh.client.fragments.trials;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.navigation.k1;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import com.server.auditor.ssh.client.billing.ProSubscriptionType;
import com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen;
import com.server.auditor.ssh.client.fragments.trials.b;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.models.SubscriptionPeriod;
import com.server.auditor.ssh.client.navigation.k2;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.trials.EndOfTrialScreenPresenter;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import java.util.List;
import java.util.Locale;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import qg.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class EndOfTrialScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.trials.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s1 f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ut.n f26819b = androidx.fragment.app.t0.b(this, ju.n0.b(EndOfTrialViewModel.class), new o0(this), new p0(null, this), new q0(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f26820c = new androidx.navigation.x(ju.n0.b(EndOfTrialScreenArgs.class), new r0(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.billing.b f26822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.adapters.p f26823f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.activity.e0 f26824u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f26816w = {ju.n0.g(new ju.g0(EndOfTrialScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/trials/EndOfTrialScreenPresenter;", 0))};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f26815v = new b(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f26817x = 8;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen$a$a, reason: collision with other inner class name */
        public static final class C0423a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0423a f26825a = new C0423a();

            private C0423a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0423a);
            }

            public int hashCode() {
                return -153185339;
            }

            public String toString() {
                return "Buy";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26826a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1173584885;
            }

            public String toString() {
                return "Later";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f26827a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 761812102;
            }

            public String toString() {
                return "TryFree";
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26828a;

        a0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new a0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26828a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.gg();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class a1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26830a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e[] f26832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(e[] eVarArr, zt.e eVar) {
            super(2, eVar);
            this.f26832c = eVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new a1(this.f26832c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = EndOfTrialScreen.this.eg().f73777m.f74119j;
            ju.t.e(materialButton, "yourCurrentPlanButton");
            materialButton.setVisibility(vt.n.d0(this.f26832c, e.b.f26853a) ? 0 : 8);
            MaterialButton materialButton2 = EndOfTrialScreen.this.eg().f73777m.f74113d;
            ju.t.e(materialButton2, "buyTeamButton");
            materialButton2.setVisibility(vt.n.d0(this.f26832c, e.a.f26852a) ? 0 : 8);
            MaterialButton materialButton3 = EndOfTrialScreen.this.eg().f73777m.f74118i;
            ju.t.e(materialButton3, "tryFreeButton");
            materialButton3.setVisibility(vt.n.d0(this.f26832c, e.d.f26855a) ? 0 : 8);
            MaterialButton materialButton4 = EndOfTrialScreen.this.eg().f73777m.f74115f;
            ju.t.e(materialButton4, "laterButton");
            materialButton4.setVisibility(vt.n.d0(this.f26832c, e.c.f26854a) ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26833a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26833a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            w6.y.b(EndOfTrialScreen.this.eg().f73768d, EndOfTrialScreen.this.Mg());
            EndOfTrialScreen.this.gg();
            ConstraintLayout constraintLayoutB = EndOfTrialScreen.this.eg().f73769e.b();
            ju.t.e(constraintLayoutB, "getRoot(...)");
            constraintLayoutB.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26837c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b1(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26837c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new b1(this.f26837c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26835a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73777m.f74118i.setText(EndOfTrialScreen.this.getString(R.string.end_of_trial_try_free_for_n_days, kotlin.coroutines.jvm.internal.b.d(this.f26837c)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26838a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -157957527;
            }

            public String toString() {
                return "BuyMonthly";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26839a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 328830126;
            }

            public String toString() {
                return "BuyYearly";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen$c$c, reason: collision with other inner class name */
        public static final class C0424c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0424c f26840a = new C0424c();

            private C0424c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0424c);
            }

            public int hashCode() {
                return 1437234368;
            }

            public String toString() {
                return "CurrentPlan";
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f26841a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 536782078;
            }

            public String toString() {
                return "Included";
            }
        }

        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f26842a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 1743558026;
            }

            public String toString() {
                return "Later";
            }
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f26843a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 472112027;
            }

            public String toString() {
                return "Stay";
            }
        }

        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        private c() {
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26844a;

        c0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new c0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26844a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73778n.setText(EndOfTrialScreen.this.getString(R.string.end_of_trial_screen_title));
            AppCompatImageView appCompatImageView = EndOfTrialScreen.this.eg().f73779o;
            ju.t.e(appCompatImageView, "upgradeImage");
            appCompatImageView.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26846a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -407140523;
            }

            public String toString() {
                return "Downgrade";
            }
        }

        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26847a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -796357156;
            }

            public String toString() {
                return "Included";
            }
        }

        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f26848a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1298172268;
            }

            public String toString() {
                return "Later";
            }
        }

        public /* synthetic */ d(ju.k kVar) {
            this();
        }

        private d() {
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionPeriod f26850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(SubscriptionPeriod subscriptionPeriod, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26850b = subscriptionPeriod;
            this.f26851c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d0(this.f26850b, this.f26851c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26849a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SubscriptionPeriod subscriptionPeriod = this.f26850b;
            int iA = subscriptionPeriod != null ? com.server.auditor.ssh.client.models.r.a(subscriptionPeriod) : 0;
            SubscriptionPeriod subscriptionPeriod2 = this.f26850b;
            int iB = subscriptionPeriod2 != null ? com.server.auditor.ssh.client.models.r.b(subscriptionPeriod2) : 0;
            SubscriptionPeriod subscriptionPeriod3 = this.f26850b;
            int iC = subscriptionPeriod3 != null ? com.server.auditor.ssh.client.models.r.c(subscriptionPeriod3) : 0;
            String string = iA > 0 ? this.f26851c.getString(R.string.you_have_n_days_left_on_your_free_team_trial, kotlin.coroutines.jvm.internal.b.d(iA)) : iB > 0 ? this.f26851c.getString(R.string.you_have_n_hours_left_on_your_free_team_trial, kotlin.coroutines.jvm.internal.b.d(iB)) : iC > 0 ? this.f26851c.getString(R.string.you_have_n_minutes_left_on_your_free_team_trial, kotlin.coroutines.jvm.internal.b.d(iC)) : this.f26851c.getString(R.string.your_free_trial_has_expired_title);
            ju.t.c(string);
            this.f26851c.eg().f73772h.setText(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static abstract class e {

        public static final class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26852a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 97251682;
            }

            public String toString() {
                return "Buy";
            }
        }

        public static final class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26853a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1545851106;
            }

            public String toString() {
                return "CurrentPlan";
            }
        }

        public static final class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f26854a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1021776280;
            }

            public String toString() {
                return "Later";
            }
        }

        public static final class d extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f26855a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 620993443;
            }

            public String toString() {
                return "TryFree";
            }
        }

        public /* synthetic */ e(ju.k kVar) {
            this();
        }

        private e() {
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionPeriod f26857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26858c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(SubscriptionPeriod subscriptionPeriod, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26857b = subscriptionPeriod;
            this.f26858c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e0(this.f26857b, this.f26858c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26856a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SubscriptionPeriod subscriptionPeriod = this.f26857b;
            int iA = subscriptionPeriod != null ? com.server.auditor.ssh.client.models.r.a(subscriptionPeriod) : 0;
            SubscriptionPeriod subscriptionPeriod2 = this.f26857b;
            int iB = subscriptionPeriod2 != null ? com.server.auditor.ssh.client.models.r.b(subscriptionPeriod2) : 0;
            SubscriptionPeriod subscriptionPeriod3 = this.f26857b;
            int iC = subscriptionPeriod3 != null ? com.server.auditor.ssh.client.models.r.c(subscriptionPeriod3) : 0;
            String string = iA > 0 ? this.f26858c.getString(R.string.you_have_n_days_left_on_your_free_trial, kotlin.coroutines.jvm.internal.b.d(iA)) : iB > 0 ? this.f26858c.getString(R.string.you_have_n_hours_left_on_your_free_trial, kotlin.coroutines.jvm.internal.b.d(iB)) : iC > 0 ? this.f26858c.getString(R.string.you_have_n_minutes_left_on_your_free_trial, kotlin.coroutines.jvm.internal.b.d(iC)) : this.f26858c.getString(R.string.your_free_trial_has_expired_title);
            ju.t.c(string);
            this.f26858c.eg().f73772h.setText(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26859a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f26859a;
            if (i10 == 0) {
                ut.x.b(obj);
                EndOfTrialScreen endOfTrialScreen = EndOfTrialScreen.this;
                BillingSubscriptionType.Pro pro = new BillingSubscriptionType.Pro(ProSubscriptionType.Monthly.INSTANCE);
                this.f26859a = 1;
                if (endOfTrialScreen.Og(pro, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26861a;

        f0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new f0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26861a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73772h.setText(EndOfTrialScreen.this.getString(R.string.your_subscription_has_expired_title));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26863a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f26863a;
            if (i10 == 0) {
                ut.x.b(obj);
                EndOfTrialScreen endOfTrialScreen = EndOfTrialScreen.this;
                BillingSubscriptionType.Pro pro = new BillingSubscriptionType.Pro(ProSubscriptionType.Annual.INSTANCE);
                this.f26863a = 1;
                if (endOfTrialScreen.Og(pro, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26865a;

        g0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new g0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26865a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73772h.setText(EndOfTrialScreen.this.getString(R.string.your_free_trial_has_expired_title));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26867a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26867a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = EndOfTrialScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26869a;

        h0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new h0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26869a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73772h.setText(EndOfTrialScreen.this.getString(R.string.choose_the_right_plan_for_you));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class i extends ViewPager2.i {
        i() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            super.c(i10);
            EndOfTrialScreen.this.fg().f3(EndOfTrialScreen.this.f26823f.L(i10));
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26872a;

        i0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new i0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26872a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            w6.y.b(EndOfTrialScreen.this.eg().f73768d, EndOfTrialScreen.this.Mg());
            EndOfTrialScreen.this.gg();
            ConstraintLayout constraintLayoutB = EndOfTrialScreen.this.eg().f73774j.b();
            ju.t.e(constraintLayoutB, "getRoot(...)");
            constraintLayoutB.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26874a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26874a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.ng();
            EndOfTrialScreen.this.sg();
            EndOfTrialScreen.this.og();
            EndOfTrialScreen.this.Pg();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26876a;

        j0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new j0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26876a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            w6.y.b(EndOfTrialScreen.this.eg().f73768d, EndOfTrialScreen.this.Mg());
            EndOfTrialScreen.this.gg();
            ConstraintLayout constraintLayoutB = EndOfTrialScreen.this.eg().f73776l.b();
            ju.t.e(constraintLayoutB, "getRoot(...)");
            constraintLayoutB.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26878a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.u0 u0VarJ;
            au.b.f();
            if (this.f26878a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(EndOfTrialScreen.this);
            androidx.navigation.d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("CHOOSE_PLAN_RESULT_CODE_KEY", kotlin.coroutines.jvm.internal.b.a(false));
            }
            if (!m0VarA.T()) {
                EndOfTrialScreen.this.f();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionPeriod f26881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26882c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(SubscriptionPeriod subscriptionPeriod, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26881b = subscriptionPeriod;
            this.f26882c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k0(this.f26881b, this.f26882c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SubscriptionPeriod subscriptionPeriod = this.f26881b;
            int iA = subscriptionPeriod != null ? com.server.auditor.ssh.client.models.r.a(subscriptionPeriod) : 0;
            SubscriptionPeriod subscriptionPeriod2 = this.f26881b;
            int iB = subscriptionPeriod2 != null ? com.server.auditor.ssh.client.models.r.b(subscriptionPeriod2) : 0;
            SubscriptionPeriod subscriptionPeriod3 = this.f26881b;
            int iC = subscriptionPeriod3 != null ? com.server.auditor.ssh.client.models.r.c(subscriptionPeriod3) : 0;
            String string = iA > 0 ? this.f26882c.getString(R.string.you_still_have_n_days_left, kotlin.coroutines.jvm.internal.b.d(iA)) : iB > 0 ? this.f26882c.getString(R.string.you_still_have_n_hours_left, kotlin.coroutines.jvm.internal.b.d(iB)) : iC > 0 ? this.f26882c.getString(R.string.you_still_have_n_minutes_left, kotlin.coroutines.jvm.internal.b.d(iC)) : this.f26882c.getString(R.string.switch_to_starter_plan);
            ju.t.c(string);
            new be.b(this.f26882c.requireActivity()).setTitle(string).setMessage(R.string.you_will_be_able_to_switch_to_the_starter_plan_after_the_trial_ends).setPositiveButton(R.string.back_to_plans, null).show();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, boolean z11, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26884b = z10;
            this.f26885c = z11;
            this.f26886d = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new l(this.f26884b, this.f26885c, this.f26886d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.a aVarA = com.server.auditor.ssh.client.fragments.trials.b.a(this.f26884b, this.f26885c);
            ju.t.e(aVarA, "actionEndOfTrialScreenTo…viteColleaguesScreen(...)");
            androidx.navigation.fragment.c.a(this.f26886d).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26887a;

        l0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new l0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            w6.y.b(EndOfTrialScreen.this.eg().f73768d, EndOfTrialScreen.this.Mg());
            EndOfTrialScreen.this.gg();
            ConstraintLayout constraintLayoutB = EndOfTrialScreen.this.eg().f73777m.b();
            ju.t.e(constraintLayoutB, "getRoot(...)");
            constraintLayoutB.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26889a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26889a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarB = com.server.auditor.ssh.client.fragments.trials.b.b();
            ju.t.e(k1VarB, "actionEndOfTrialScreenTo…PaidRenewPromoScreen(...)");
            androidx.navigation.fragment.c.a(EndOfTrialScreen.this).O(k1VarB);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26891a;

        m0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new m0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26891a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73778n.setText(EndOfTrialScreen.this.getString(R.string.get_more_from_termius));
            AppCompatImageView appCompatImageView = EndOfTrialScreen.this.eg().f73779o;
            ju.t.e(appCompatImageView, "upgradeImage");
            appCompatImageView.setVisibility(8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26893a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26893a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarC = com.server.auditor.ssh.client.fragments.trials.b.c();
            ju.t.e(k1VarC, "actionEndOfTrialScreenTo…llyDeactivatedScreen(...)");
            androidx.navigation.fragment.c.a(EndOfTrialScreen.this).O(k1VarC);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26895a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26897c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new n0(this.f26897c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26895a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73773i.setCurrentItem(this.f26897c, false);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26898a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26898a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarD = com.server.auditor.ssh.client.fragments.trials.b.d();
            ju.t.e(k1VarD, "actionEndOfTrialScreenTo…alExtensionPromotion(...)");
            androidx.navigation.fragment.c.a(EndOfTrialScreen.this).O(k1VarD);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class o0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(Fragment fragment) {
            super(0);
            this.f26900a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26900a.requireActivity().getViewModelStore();
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AcknowledgeSubscriptionInfo f26902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26902b = acknowledgeSubscriptionInfo;
            this.f26903c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p(this.f26902b, this.f26903c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26901a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.C0426b c0426bE = com.server.auditor.ssh.client.fragments.trials.b.e(this.f26902b);
            ju.t.e(c0426bE, "actionEndOfTrialScreenTo…essingPurchaseScreen(...)");
            androidx.navigation.fragment.c.a(this.f26903c).O(c0426bE);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class p0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26904a = aVar;
            this.f26905b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26904a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26905b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26907b = endOfTeamTrialTargetAction;
            this.f26908c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new q(this.f26907b, this.f26908c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.c cVarF = com.server.auditor.ssh.client.fragments.trials.b.f(this.f26907b);
            ju.t.e(cVarF, "actionEndOfTrialScreenTo…rsConfirmationScreen(...)");
            androidx.navigation.fragment.c.a(this.f26908c).O(cVarF);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class q0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(Fragment fragment) {
            super(0);
            this.f26909a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26909a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26910a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26910a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarG = com.server.auditor.ssh.client.fragments.trials.b.g();
            ju.t.e(k1VarG, "actionEndOfTrialScreenTo…toringPurchaseScreen(...)");
            androidx.navigation.fragment.c.a(EndOfTrialScreen.this).O(k1VarG);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class r0 implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26912a;

        public r0(Fragment fragment) {
            this.f26912a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26912a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26912a + " has null arguments");
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26914b = endOfTeamTrialTargetAction;
            this.f26915c = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new s(this.f26914b, this.f26915c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26913a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.d dVarH = com.server.auditor.ssh.client.fragments.trials.b.h(this.f26914b);
            ju.t.e(dVarH, "actionEndOfTrialScreenTo…vationProgressScreen(...)");
            androidx.navigation.fragment.c.a(this.f26915c).O(dVarH);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26916a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f26918c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new s0(this.f26918c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26916a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73766b.setVisibility(this.f26918c ? 0 : 4);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26922d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, EndOfTrialScreen endOfTrialScreen, zt.e eVar) {
            super(2, eVar);
            this.f26920b = z10;
            this.f26921c = endOfTeamTrialTargetAction;
            this.f26922d = endOfTrialScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new t(this.f26920b, this.f26921c, this.f26922d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26919a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.e eVarI = com.server.auditor.ssh.client.fragments.trials.b.i(this.f26920b, this.f26921c);
            ju.t.e(eVarI, "actionEndOfTrialScreenTo…PromoExtensionScreen(...)");
            androidx.navigation.fragment.c.a(this.f26922d).O(eVarI);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26923a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a[] f26925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(a[] aVarArr, zt.e eVar) {
            super(2, eVar);
            this.f26925c = aVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new t0(this.f26925c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26923a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = EndOfTrialScreen.this.eg().f73769e.f73009d;
            ju.t.e(materialButton, "buyBusinessButton");
            materialButton.setVisibility(vt.n.d0(this.f26925c, a.C0423a.f26825a) ? 0 : 8);
            MaterialButton materialButton2 = EndOfTrialScreen.this.eg().f73769e.f73014i;
            ju.t.e(materialButton2, "tryFreeButton");
            materialButton2.setVisibility(vt.n.d0(this.f26925c, a.c.f26827a) ? 0 : 8);
            MaterialButton materialButton3 = EndOfTrialScreen.this.eg().f73769e.f73011f;
            ju.t.e(materialButton3, "laterButton");
            materialButton3.setVisibility(vt.n.d0(this.f26925c, a.b.f26826a) ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26926a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26926a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarJ = com.server.auditor.ssh.client.fragments.trials.b.j();
            ju.t.e(k1VarJ, "actionEndOfTrialScreenTo…seSubscriptionScreen(...)");
            androidx.navigation.fragment.c.a(EndOfTrialScreen.this).O(k1VarJ);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26928a;

        u0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new u0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26928a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73769e.f73009d.setText(EndOfTrialScreen.this.getString(R.string.buy_business_plan));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26932c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, zt.e eVar) {
            super(2, eVar);
            this.f26932c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new v(this.f26932c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26930a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = EndOfTrialScreen.this.getString(R.string.business_plan_name);
            ju.t.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            ju.t.e(lowerCase, "toLowerCase(...)");
            EndOfTrialScreen.this.Qg(EndOfTrialScreen.this.Lg(this.f26932c, lowerCase));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26933a;

        v0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new v0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26933a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73769e.f73009d.setText(EndOfTrialScreen.this.getString(R.string.upgrade_now));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26935a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, zt.e eVar) {
            super(2, eVar);
            this.f26937c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new w(this.f26937c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26935a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = EndOfTrialScreen.this.getString(R.string.pro_plan_name);
            ju.t.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            ju.t.e(lowerCase, "toLowerCase(...)");
            EndOfTrialScreen.this.Qg(EndOfTrialScreen.this.Lg(this.f26937c, lowerCase));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26938a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26940c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new w0(this.f26940c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26938a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTrialScreen.this.eg().f73769e.f73014i.setText(EndOfTrialScreen.this.getString(R.string.end_of_trial_try_free_for_n_days, kotlin.coroutines.jvm.internal.b.d(this.f26940c)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26941a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, zt.e eVar) {
            super(2, eVar);
            this.f26943c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new x(this.f26943c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26941a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = EndOfTrialScreen.this.getString(R.string.team_plan_name);
            ju.t.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            ju.t.e(lowerCase, "toLowerCase(...)");
            EndOfTrialScreen.this.Qg(EndOfTrialScreen.this.Lg(this.f26943c, lowerCase));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26944a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c[] f26946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(c[] cVarArr, zt.e eVar) {
            super(2, eVar);
            this.f26946c = cVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new x0(this.f26946c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26944a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = EndOfTrialScreen.this.eg().f73774j.f73615i;
            ju.t.e(materialButton, "includedButton");
            materialButton.setVisibility(vt.n.d0(this.f26946c, c.d.f26841a) ? 0 : 8);
            MaterialButton materialButton2 = EndOfTrialScreen.this.eg().f73774j.f73620n;
            ju.t.e(materialButton2, "yourCurrentPlanButton");
            materialButton2.setVisibility(vt.n.d0(this.f26946c, c.C0424c.f26840a) ? 0 : 8);
            MaterialButton materialButton3 = EndOfTrialScreen.this.eg().f73774j.f73618l;
            ju.t.e(materialButton3, "stayOnProButton");
            materialButton3.setVisibility(vt.n.d0(this.f26946c, c.f.f26843a) ? 0 : 8);
            boolean zD0 = vt.n.d0(this.f26946c, c.b.f26839a);
            MaterialButton materialButton4 = EndOfTrialScreen.this.eg().f73774j.f73613g;
            ju.t.e(materialButton4, "buyYearlyButton");
            materialButton4.setVisibility(zD0 ? 0 : 8);
            TextView textView = EndOfTrialScreen.this.eg().f73774j.f73612f;
            ju.t.e(textView, "buyProDiscountLabel");
            textView.setVisibility(zD0 ? 0 : 8);
            boolean zD02 = vt.n.d0(this.f26946c, c.a.f26838a);
            MaterialButton materialButton5 = EndOfTrialScreen.this.eg().f73774j.f73611e;
            ju.t.e(materialButton5, "buyMonthlyButton");
            materialButton5.setVisibility(zD02 ? 0 : 8);
            Flow flow = EndOfTrialScreen.this.eg().f73774j.f73610d;
            ju.t.e(flow, "buyButtonsFlow");
            flow.setVisibility(zD0 || zD02 ? 0 : 8);
            MaterialButton materialButton6 = EndOfTrialScreen.this.eg().f73774j.f73616j;
            ju.t.e(materialButton6, "laterButton");
            materialButton6.setVisibility(vt.n.d0(this.f26946c, c.e.f26842a) ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26948b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26950d;

        y(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26948b = obj;
            this.f26950d |= RtlSpacingHelper.UNDEFINED;
            return EndOfTrialScreen.this.Og(null, this);
        }
    }

    static final class y0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ EndOfTrialScreen f26955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f26956f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(String str, String str2, String str3, EndOfTrialScreen endOfTrialScreen, int i10, zt.e eVar) {
            super(2, eVar);
            this.f26952b = str;
            this.f26953c = str2;
            this.f26954d = str3;
            this.f26955e = endOfTrialScreen;
            this.f26956f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new y0(this.f26952b, this.f26953c, this.f26954d, this.f26955e, this.f26956f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k2 k2Var = k2.f29063a;
            String strA = k2Var.a(this.f26952b, this.f26953c);
            String strA2 = k2Var.a(this.f26952b, this.f26954d);
            this.f26955e.eg().f73774j.f73613g.setText(this.f26955e.getString(R.string.price_per_year, strA));
            this.f26955e.eg().f73774j.f73611e.setText(this.f26955e.getString(R.string.price_per_month, strA2));
            this.f26955e.eg().f73774j.f73612f.setText(this.f26955e.getString(R.string.discount_label, kotlin.coroutines.jvm.internal.b.d(this.f26956f)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z implements androidx.lifecycle.l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f26957a;

        z(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f26957a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26957a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26957a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    static final class z0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26958a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d[] f26960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(d[] dVarArr, zt.e eVar) {
            super(2, eVar);
            this.f26960c = dVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialScreen.this.new z0(this.f26960c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26958a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = EndOfTrialScreen.this.eg().f73776l.f73914e;
            ju.t.e(materialButton, "includedButton");
            materialButton.setVisibility(vt.n.d0(this.f26960c, d.b.f26847a) ? 0 : 8);
            MaterialButton materialButton2 = EndOfTrialScreen.this.eg().f73776l.f73912c;
            ju.t.e(materialButton2, "downgradeButton");
            materialButton2.setVisibility(vt.n.d0(this.f26960c, d.a.f26846a) ? 0 : 8);
            MaterialButton materialButton3 = EndOfTrialScreen.this.eg().f73776l.f73915f;
            ju.t.e(materialButton3, "laterButton");
            materialButton3.setVisibility(vt.n.d0(this.f26960c, d.c.f26848a) ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public EndOfTrialScreen() {
        iu.a aVar = new iu.a() { // from class: ii.q
            @Override // iu.a
            public final Object a() {
                return EndOfTrialScreen.Ng(this.f56207a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f26821d = new MoxyKtxDelegate(mvpDelegate, EndOfTrialScreenPresenter.class.getName() + ".presenter", aVar);
        b2 b2Var = b2.f52944a;
        com.server.auditor.ssh.client.billing.a aVarL1 = b2Var.l1();
        com.server.auditor.ssh.client.billing.c cVar = new com.server.auditor.ssh.client.billing.c(b2Var.P1(), b2Var.B1());
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        ol.a aVar2 = new ol.a(dVarM);
        hg.d dVarM2 = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        hj.f fVar = new hj.f(dVarM2);
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        this.f26822e = new com.server.auditor.ssh.client.billing.b(aVarL1, cVar, aVar2, fVar, aVarY);
        this.f26823f = new com.server.auditor.ssh.client.adapters.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ag(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().b3();
    }

    private final void Cg() {
        cg().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new z(new iu.l() { // from class: ii.u
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialScreen.Dg(this.f56213a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Dg(EndOfTrialScreen endOfTrialScreen, EndOfTrialViewModel.a aVar) {
        if (ju.t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            endOfTrialScreen.fg().j3();
        } else {
            if (!ju.t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new ut.s();
            }
            endOfTrialScreen.fg().l3();
        }
        return ut.m0.f82633a;
    }

    private final void Eg() {
        final androidx.lifecycle.u0 u0VarJ;
        androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("TEAM_DEACTIVATION_RESULT_KEY").j(getViewLifecycleOwner(), new z(new iu.l() { // from class: ii.r
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialScreen.Fg(this.f56208a, u0VarJ, (EndOfTeamTrialTargetAction) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Fg(EndOfTrialScreen endOfTrialScreen, androidx.lifecycle.u0 u0Var, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        EndOfTrialScreenPresenter endOfTrialScreenPresenterFg = endOfTrialScreen.fg();
        ju.t.c(endOfTeamTrialTargetAction);
        endOfTrialScreenPresenterFg.m3(endOfTeamTrialTargetAction);
        u0Var.f("TEAM_DEACTIVATION_RESULT_KEY");
        return ut.m0.f82633a;
    }

    private final void Gg() {
        eg().f73777m.f74118i.setOnClickListener(new View.OnClickListener() { // from class: ii.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.Hg(this.f56199a, view);
            }
        });
        eg().f73777m.f74113d.setOnClickListener(new View.OnClickListener() { // from class: ii.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.Ig(this.f56210a, view);
            }
        });
        eg().f73777m.f74115f.setOnClickListener(new View.OnClickListener() { // from class: ii.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.Jg(this.f56214a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().o3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ig(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().Z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Kg(EndOfTrialScreen endOfTrialScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        endOfTrialScreen.fg().U2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Lg(String str, String str2) {
        if (str == null || su.s.m0(str)) {
            String string = getString(R.string.billing_purchase_url, "https://account.termius.com/");
            ju.t.c(string);
            return string;
        }
        String string2 = getString(R.string.billing_purchase_plan_url, "https://account.termius.com/", Uri.encode(str), str2);
        ju.t.c(string2);
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w6.b Mg() {
        w6.b bVar = new w6.b();
        bVar.q0(0);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EndOfTrialScreenPresenter Ng(EndOfTrialScreen endOfTrialScreen) {
        boolean isPromoMode = endOfTrialScreen.dg().getIsPromoMode();
        String avoChoosePlanSource = endOfTrialScreen.dg().getAvoChoosePlanSource();
        ju.t.e(avoChoosePlanSource, "getAvoChoosePlanSource(...)");
        return new EndOfTrialScreenPresenter(isPromoMode, Avo.ChoosePlanSource.valueOf(avoChoosePlanSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Og(com.server.auditor.ssh.client.billing.BillingSubscriptionType r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen.y
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen$y r0 = (com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen.y) r0
            int r1 = r0.f26950d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26950d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen$y r0 = new com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen$y
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26948b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f26950d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r8)
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f26947a
            com.server.auditor.ssh.client.billing.BillingSubscriptionType r7 = (com.server.auditor.ssh.client.billing.BillingSubscriptionType) r7
            ut.x.b(r8)
            goto L4c
        L3c:
            ut.x.b(r8)
            com.server.auditor.ssh.client.billing.b r8 = r6.f26822e
            r0.f26947a = r7
            r0.f26950d = r4
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L4c
            goto L74
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            com.server.auditor.ssh.client.presenters.trials.EndOfTrialScreenPresenter r7 = r6.fg()
            r7.g3()
            goto Lc0
        L5c:
            com.server.auditor.ssh.client.billing.b r8 = r6.f26822e
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r4 = "requireActivity(...)"
            ju.t.e(r2, r4)
            com.server.auditor.ssh.client.utils.analytics.Avo$BuyNowButtonLocation r4 = com.server.auditor.ssh.client.utils.analytics.Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN
            r5 = 0
            r0.f26947a = r5
            r0.f26950d = r3
            java.lang.Object r8 = r8.c(r2, r7, r4, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            com.server.auditor.ssh.client.billing.b$a r8 = (com.server.auditor.ssh.client.billing.b.a) r8
            boolean r7 = r8 instanceof com.server.auditor.ssh.client.billing.b.a.d
            if (r7 == 0) goto L89
            com.server.auditor.ssh.client.presenters.trials.EndOfTrialScreenPresenter r7 = r6.fg()
            com.server.auditor.ssh.client.billing.b$a$d r8 = (com.server.auditor.ssh.client.billing.b.a.d) r8
            com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo r8 = r8.a()
            r7.h3(r8)
            goto Lc0
        L89:
            com.server.auditor.ssh.client.billing.b$a$a r7 = com.server.auditor.ssh.client.billing.b.a.C0331a.f21557a
            boolean r7 = ju.t.b(r8, r7)
            if (r7 == 0) goto L99
            com.server.auditor.ssh.client.presenters.trials.EndOfTrialScreenPresenter r7 = r6.fg()
            r7.g3()
            goto Lc0
        L99:
            com.server.auditor.ssh.client.billing.b$a$b r7 = com.server.auditor.ssh.client.billing.b.a.C0332b.f21558a
            boolean r7 = ju.t.b(r8, r7)
            if (r7 != 0) goto Lc0
            com.server.auditor.ssh.client.billing.b$a$e r7 = com.server.auditor.ssh.client.billing.b.a.e.f21561a
            boolean r7 = ju.t.b(r8, r7)
            if (r7 == 0) goto Lb1
            com.server.auditor.ssh.client.presenters.trials.EndOfTrialScreenPresenter r7 = r6.fg()
            r7.V2()
            goto Lc0
        Lb1:
            com.server.auditor.ssh.client.billing.b$a$c r7 = com.server.auditor.ssh.client.billing.b.a.c.f21559a
            boolean r7 = ju.t.b(r8, r7)
            if (r7 == 0) goto Lba
            goto Lc0
        Lba:
            ut.s r7 = new ut.s
            r7.<init>()
            throw r7
        Lc0:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen.Og(com.server.auditor.ssh.client.billing.BillingSubscriptionType, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pg() {
        r.e eVarD = this.f26822e.d(new BillingSubscriptionType.Pro(ProSubscriptionType.Annual.INSTANCE));
        r.e eVarD2 = this.f26822e.d(new BillingSubscriptionType.Pro(ProSubscriptionType.Monthly.INSTANCE));
        if (eVarD == null || eVarD2 == null) {
            fg().c3();
        } else {
            fg().d3(eVarD, eVarD2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qg(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    private final void Zf() {
        o4.z0.F0(eg().b(), new o4.i0() { // from class: ii.b0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return EndOfTrialScreen.ag(view, a2Var);
            }
        });
        o4.z0.F0(eg().f73768d, new o4.i0() { // from class: ii.c0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return EndOfTrialScreen.bg(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 ag(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 bg(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final EndOfTrialViewModel cg() {
        return (EndOfTrialViewModel) this.f26819b.getValue();
    }

    private final EndOfTrialScreenArgs dg() {
        return (EndOfTrialScreenArgs) this.f26820c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s1 eg() {
        s1 s1Var = this.f26818a;
        if (s1Var != null) {
            return s1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EndOfTrialScreenPresenter fg() {
        return (EndOfTrialScreenPresenter) this.f26821d.getValue(this, f26816w[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gg() {
        eg().f73776l.b().setVisibility(4);
        eg().f73774j.b().setVisibility(4);
        eg().f73777m.b().setVisibility(4);
        eg().f73769e.b().setVisibility(4);
    }

    private final void hg() {
        eg().f73766b.setOnClickListener(new View.OnClickListener() { // from class: ii.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.ig(this.f56215a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ig(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().U2();
    }

    private final void jg() {
        eg().f73769e.f73014i.setOnClickListener(new View.OnClickListener() { // from class: ii.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.kg(this.f56200a, view);
            }
        });
        eg().f73769e.f73009d.setOnClickListener(new View.OnClickListener() { // from class: ii.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.lg(this.f56201a, view);
            }
        });
        eg().f73769e.f73011f.setOnClickListener(new View.OnClickListener() { // from class: ii.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.mg(this.f56202a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().n3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().W2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ng() {
        hg();
        zg();
        ug();
        Gg();
        jg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void og() {
        Cg();
        fg().R2().j(getViewLifecycleOwner(), new z(new iu.l() { // from class: ii.x
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialScreen.pg(this.f56216a, (List) obj);
            }
        }));
        Eg();
        qg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 pg(EndOfTrialScreen endOfTrialScreen, List list) {
        com.server.auditor.ssh.client.adapters.p pVar = endOfTrialScreen.f26823f;
        ju.t.c(list);
        pVar.O(list);
        return ut.m0.f82633a;
    }

    private final void qg() {
        final androidx.lifecycle.u0 u0VarJ;
        androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("PRO_PAID_RENEW_RESULT_KEY").j(getViewLifecycleOwner(), new androidx.lifecycle.l0() { // from class: ii.t
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                EndOfTrialScreen.rg(this.f56211a, u0VarJ, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rg(EndOfTrialScreen endOfTrialScreen, androidx.lifecycle.u0 u0Var, Object obj) {
        endOfTrialScreen.fg().e3();
        u0Var.f("PRO_PAID_RENEW_RESULT_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sg() {
        eg().f73773i.setAdapter(this.f26823f);
        eg().f73773i.setClipToPadding(false);
        eg().f73773i.setClipChildren(false);
        ViewPager2 viewPager2 = eg().f73773i;
        ju.t.e(viewPager2, "planCardsCarousel");
        tp.c0.s(viewPager2, R.dimen.end_of_trial_plan_card_carousel_next_visible_size, R.dimen.end_of_trial_plan_card_carousel_horizontal_margin);
        eg().f73773i.h(new i());
        new com.google.android.material.tabs.d(eg().f73770f, eg().f73773i, true, new d.b() { // from class: ii.i
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.g gVar, int i10) {
                EndOfTrialScreen.tg(gVar, i10);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tg(TabLayout.g gVar, int i10) {
        ju.t.f(gVar, "<unused var>");
    }

    private final void ug() {
        eg().f73774j.f73613g.setOnClickListener(new View.OnClickListener() { // from class: ii.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.vg(this.f56203a, view);
            }
        });
        eg().f73774j.f73611e.setOnClickListener(new View.OnClickListener() { // from class: ii.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.wg(this.f56204a, view);
            }
        });
        eg().f73774j.f73618l.setOnClickListener(new View.OnClickListener() { // from class: ii.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.xg(this.f56205a, view);
            }
        });
        eg().f73774j.f73616j.setOnClickListener(new View.OnClickListener() { // from class: ii.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.yg(this.f56206a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().X2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().i3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yg(EndOfTrialScreen endOfTrialScreen, View view) {
        endOfTrialScreen.fg().b3();
    }

    private final void zg() {
        eg().f73776l.f73912c.setOnClickListener(new View.OnClickListener() { // from class: ii.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.Ag(this.f56218a, view);
            }
        });
        eg().f73776l.f73915f.setOnClickListener(new View.OnClickListener() { // from class: ii.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialScreen.Bg(this.f56193a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void A0(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        ju.t.f(endOfTeamTrialTargetAction, "targetAction");
        bh.a.b(this, new q(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void D4(String str) {
        bh.a.b(this, new v(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Dc(String str) {
        bh.a.b(this, new w(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void F3(a... aVarArr) {
        ju.t.f(aVarArr, "visibleButtons");
        bh.a.b(this, new t0(aVarArr, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void G7(String str, String str2, String str3, int i10) {
        ju.t.f(str, "currencySymbol");
        ju.t.f(str2, "rawPricePerYear");
        ju.t.f(str3, "rawPricePerMonth");
        bh.a.b(this, new y0(str, str2, str3, this, i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void G9() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void L2(int i10) {
        bh.a.b(this, new b1(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void M5(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        ju.t.f(endOfTeamTrialTargetAction, "targetAction");
        bh.a.b(this, new t(z10, endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void N4() {
        bh.a.b(this, new c0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void N8(boolean z10) {
        bh.a.b(this, new s0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Ne() {
        bh.a.b(this, new v0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void O2(int i10) {
        bh.a.b(this, new n0(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Rc(int i10) {
        bh.a.b(this, new w0(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Ta() {
        bh.a.b(this, new j0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        ju.t.f(endOfTeamTrialTargetAction, "targetAction");
        bh.a.b(this, new s(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void W9() {
        bh.a.b(this, new h0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Z6() {
        bh.a.b(this, new g0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Zd() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void a() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void a0(String str) {
        bh.a.b(this, new x(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void b() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ca() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void d4(SubscriptionPeriod subscriptionPeriod) {
        bh.a.b(this, new k0(subscriptionPeriod, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void f() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void fd() {
        bh.a.b(this, new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void g4() {
        bh.a.b(this, new u0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void h6() {
        bh.a.b(this, new f0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void hc(SubscriptionPeriod subscriptionPeriod) {
        bh.a.b(this, new e0(subscriptionPeriod, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ib() {
        bh.a.b(this, new m0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void id(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
        ju.t.f(acknowledgeSubscriptionInfo, "purchasedSubscriptionInfo");
        bh.a.b(this, new p(acknowledgeSubscriptionInfo, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void jc(d... dVarArr) {
        ju.t.f(dVarArr, "visibleButtons");
        bh.a.b(this, new z0(dVarArr, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void k6() {
        bh.a.b(this, new a0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void n3(e... eVarArr) {
        ju.t.f(eVarArr, "visibleButtons");
        bh.a.b(this, new a1(eVarArr, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ii.y
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialScreen.Kg(this.f56217a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26824u = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26818a = s1.c(layoutInflater, viewGroup, false);
        Zf();
        ConstraintLayout constraintLayoutB = eg().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26818a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f26824u;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void q9() {
        bh.a.b(this, new b0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void qd() {
        bh.a.b(this, new l0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void r2() {
        bh.a.b(this, new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void r7() {
        bh.a.b(this, new u(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void t5(boolean z10, boolean z11) {
        bh.a.b(this, new l(z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void u8() {
        bh.a.b(this, new i0(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void vc(c... cVarArr) {
        ju.t.f(cVarArr, "visibleButtons");
        bh.a.b(this, new x0(cVarArr, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void wa() {
        bh.a.b(this, new r(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ze(SubscriptionPeriod subscriptionPeriod) {
        bh.a.b(this, new d0(subscriptionPeriod, this, null));
    }
}
