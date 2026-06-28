package com.server.auditor.ssh.client.fragments;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c2.o1;
import com.crystalnix.terminal.utils.CustomTypefaceSpan;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.q0;
import com.server.auditor.ssh.client.fragments.EnabledOpenAiAndGotTrialScreen;
import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import com.server.auditor.ssh.client.presenters.EnabledOpenAiAndGotTrialPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.j1;
import tp.c0;
import tp.c1;
import tp.w0;
import ut.m0;
import wu.i0;
import wu.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class EnabledOpenAiAndGotTrialScreen extends MvpAppCompatFragment implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j1 f23898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f23899b = new androidx.navigation.x(n0.b(EnabledOpenAiAndGotTrialScreenArgs.class), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f23900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f23901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f23902e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f23896u = {n0.g(new g0(EnabledOpenAiAndGotTrialScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/EnabledOpenAiAndGotTrialPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23895f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f23897v = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23903a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f23905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f23905c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(TextView textView, EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, ObjectAnimator objectAnimator) {
            ju.t.c(textView);
            c0.r(textView, enabledOpenAiAndGotTrialScreen.Pf());
            objectAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(iu.a aVar) {
            aVar.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new b(this.f23905c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23903a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final TextView textView = EnabledOpenAiAndGotTrialScreen.this.Of().f72805f;
            final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen = EnabledOpenAiAndGotTrialScreen.this;
            final iu.a aVar = this.f23905c;
            ju.t.c(textView);
            final ObjectAnimator objectAnimatorVf = enabledOpenAiAndGotTrialScreen.Vf(textView);
            textView.animate().setDuration(200L).setInterpolator(new LinearInterpolator()).rotation(2.5f).withStartAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.b
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.b.l(textView, enabledOpenAiAndGotTrialScreen, objectAnimatorVf);
                }
            }).withEndAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.c
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.b.m(aVar);
                }
            }).start();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23906a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f23908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f23908c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(TextView textView, EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, ObjectAnimator objectAnimator) {
            ju.t.c(textView);
            c0.r(textView, enabledOpenAiAndGotTrialScreen.Pf());
            objectAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(iu.a aVar) {
            aVar.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new c(this.f23908c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final TextView textView = EnabledOpenAiAndGotTrialScreen.this.Of().f72806g;
            final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen = EnabledOpenAiAndGotTrialScreen.this;
            final iu.a aVar = this.f23908c;
            ju.t.c(textView);
            final ObjectAnimator objectAnimatorVf = enabledOpenAiAndGotTrialScreen.Vf(textView);
            textView.animate().setDuration(200L).setInterpolator(new LinearInterpolator()).rotation(4.0f).withStartAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.d
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.c.l(textView, enabledOpenAiAndGotTrialScreen, objectAnimatorVf);
                }
            }).withEndAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.e
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.c.m(aVar);
                }
            }).start();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23909a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f23911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f23911c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(TextView textView, EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, ObjectAnimator objectAnimator) {
            ju.t.c(textView);
            c0.r(textView, enabledOpenAiAndGotTrialScreen.Pf());
            objectAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(iu.a aVar) {
            aVar.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new d(this.f23911c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23909a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final TextView textView = EnabledOpenAiAndGotTrialScreen.this.Of().f72807h;
            final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen = EnabledOpenAiAndGotTrialScreen.this;
            final iu.a aVar = this.f23911c;
            ju.t.c(textView);
            final ObjectAnimator objectAnimatorVf = enabledOpenAiAndGotTrialScreen.Vf(textView);
            textView.animate().setDuration(200L).setInterpolator(new LinearInterpolator()).rotation(-2.5f).withStartAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.f
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.d.l(textView, enabledOpenAiAndGotTrialScreen, objectAnimatorVf);
                }
            }).withEndAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.g
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.d.m(aVar);
                }
            }).start();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23912a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f23914c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(iu.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f23914c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(TextView textView, EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, ObjectAnimator objectAnimator) {
            ju.t.c(textView);
            c0.r(textView, enabledOpenAiAndGotTrialScreen.Pf());
            objectAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(iu.a aVar) {
            aVar.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new e(this.f23914c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23912a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final TextView textView = EnabledOpenAiAndGotTrialScreen.this.Of().f72810k;
            final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen = EnabledOpenAiAndGotTrialScreen.this;
            final iu.a aVar = this.f23914c;
            ju.t.c(textView);
            final ObjectAnimator objectAnimatorVf = enabledOpenAiAndGotTrialScreen.Vf(textView);
            textView.animate().setDuration(200L).setInterpolator(new LinearInterpolator()).rotation(-4.5f).withStartAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.h
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.e.l(textView, enabledOpenAiAndGotTrialScreen, objectAnimatorVf);
                }
            }).withEndAction(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.i
                @Override // java.lang.Runnable
                public final void run() {
                    EnabledOpenAiAndGotTrialScreen.e.m(aVar);
                }
            }).start();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23915a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, zt.e eVar) {
            super(2, eVar);
            this.f23917c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new f(this.f23917c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23915a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = EnabledOpenAiAndGotTrialScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(this.f23917c);
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23918a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionPeriodInfo f23920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SubscriptionPeriodInfo subscriptionPeriodInfo, zt.e eVar) {
            super(2, eVar);
            this.f23920c = subscriptionPeriodInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new g(this.f23920c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23918a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnabledOpenAiAndGotTrialScreen.this.Xf();
            EnabledOpenAiAndGotTrialScreen.this.Tf(this.f23920c);
            EnabledOpenAiAndGotTrialScreen.this.Rf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f23921a;

        public h(Fragment fragment) {
            this.f23921a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f23921a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f23921a + " has null arguments");
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23922a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 m(final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen) {
            enabledOpenAiAndGotTrialScreen.Jf(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.k
                @Override // iu.a
                public final Object a() {
                    return EnabledOpenAiAndGotTrialScreen.i.n(enabledOpenAiAndGotTrialScreen);
                }
            });
            return m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 n(final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen) {
            enabledOpenAiAndGotTrialScreen.Kf(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.l
                @Override // iu.a
                public final Object a() {
                    return EnabledOpenAiAndGotTrialScreen.i.o(enabledOpenAiAndGotTrialScreen);
                }
            });
            return m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 o(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen) {
            EnabledOpenAiAndGotTrialScreen.Hf(enabledOpenAiAndGotTrialScreen, null, 1, null);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiAndGotTrialScreen.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f23922a;
            if (i10 == 0) {
                ut.x.b(obj);
                this.f23922a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            final EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen = EnabledOpenAiAndGotTrialScreen.this;
            enabledOpenAiAndGotTrialScreen.Ff(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.j
                @Override // iu.a
                public final Object a() {
                    return EnabledOpenAiAndGotTrialScreen.i.m(enabledOpenAiAndGotTrialScreen);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnabledOpenAiAndGotTrialScreen() {
        iu.a aVar = new iu.a() { // from class: ch.s
            @Override // iu.a
            public final Object a() {
                return EnabledOpenAiAndGotTrialScreen.Wf(this.f15628a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f23900c = new MoxyKtxDelegate(mvpDelegate, EnabledOpenAiAndGotTrialPresenter.class.getName() + ".presenter", aVar);
        this.f23902e = ut.o.a(new iu.a() { // from class: ch.t
            @Override // iu.a
            public final Object a() {
                return EnabledOpenAiAndGotTrialScreen.Mf(this.f15632a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff(iu.a aVar) {
        bh.a.b(this, new b(aVar, null));
    }

    private final void Gf(iu.a aVar) {
        bh.a.b(this, new c(aVar, null));
    }

    static /* synthetic */ void Hf(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, iu.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new iu.a() { // from class: ch.v
                @Override // iu.a
                public final Object a() {
                    return EnabledOpenAiAndGotTrialScreen.If();
                }
            };
        }
        enabledOpenAiAndGotTrialScreen.Gf(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 If() {
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf(iu.a aVar) {
        bh.a.b(this, new d(aVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf(iu.a aVar) {
        bh.a.b(this, new e(aVar, null));
    }

    private final void Lf() {
        z0.F0(Of().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable Mf(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen) {
        return androidx.core.content.a.getDrawable(enabledOpenAiAndGotTrialScreen.requireContext(), R.drawable.ic_circle_checkbox_checked);
    }

    private final EnabledOpenAiAndGotTrialScreenArgs Nf() {
        return (EnabledOpenAiAndGotTrialScreenArgs) this.f23899b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j1 Of() {
        j1 j1Var = this.f23898a;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable Pf() {
        return (Drawable) this.f23902e.getValue();
    }

    private final EnabledOpenAiAndGotTrialPresenter Qf() {
        return (EnabledOpenAiAndGotTrialPresenter) this.f23900c.getValue(this, f23896u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        Of().f72802c.setOnClickListener(new View.OnClickListener() { // from class: ch.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnabledOpenAiAndGotTrialScreen.Sf(this.f15639a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sf(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, View view) {
        enabledOpenAiAndGotTrialScreen.Qf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Tf(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        Typeface typeface;
        boolean z10 = true;
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        if (!(subscriptionPeriodInfo instanceof SubscriptionPeriodInfo.Days)) {
            throw new ut.s();
        }
        SubscriptionPeriodInfo.Days days = (SubscriptionPeriodInfo.Days) subscriptionPeriodInfo;
        String quantityString = getResources().getQuantityString(R.plurals.subscription_n_days_period, days.getDays(), Integer.valueOf(days.getDays()));
        ju.t.c(quantityString);
        try {
            typeface = c4.h.h(contextRequireContext, R.font.circularxx_black);
        } catch (Resources.NotFoundException unused) {
            typeface = null;
        }
        if (typeface == null) {
            typeface = Of().f72809j.getPaint().getTypeface();
        }
        int iJ = o1.j(rk.b.y());
        int iJ2 = o1.j(rk.b.x());
        int iA = c1.a(contextRequireContext, android.R.attr.textColorSecondary);
        String string = getString(R.string.you_have_enabled_open_ai_in_termius_and_got_n_days_trial, quantityString);
        ju.t.e(string, "getString(...)");
        Rect rect = new Rect();
        Of().f72811l.getPaint().getTextBounds(string, 0, string.length(), rect);
        TextView textView = Of().f72811l;
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        String string2 = getString(R.string.you_have_enabled_open_ai_in_termius_and_got_n_days_trial_highlight_helper);
        ju.t.e(string2, "getString(...)");
        textView.setText(aVar.a(aVar.a(spannableStringBuilder, string2, new pq.b(iJ, iJ2, rect)), quantityString, new pq.b(iJ, iJ2, rect)));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.enabled_open_ai_subscription_info_title_text_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.enabled_open_ai_subscription_info_description_text_size);
        TextView textView2 = Of().f72809j;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Object[] objArr = {new AbsoluteSizeSpan(dimensionPixelSize, false), new CustomTypefaceSpan("", typeface)};
        int length = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getString(R.string.how_your_free_trial_works));
        for (int i10 = 0; i10 < 2; i10++) {
            spannableStringBuilder2.setSpan(objArr[i10], length, spannableStringBuilder2.length(), 17);
        }
        SpannableStringBuilder spannableStringBuilderA = c0.a(spannableStringBuilder2);
        Object[] objArr2 = {new AbsoluteSizeSpan(dimensionPixelSize2, false), new CustomTypefaceSpan("", typeface)};
        int length2 = spannableStringBuilderA.length();
        spannableStringBuilderA.append((CharSequence) getString(R.string.today_colon));
        int i11 = 0;
        while (i11 < 2) {
            spannableStringBuilderA.setSpan(objArr2[i11], length2, spannableStringBuilderA.length(), 17);
            i11++;
            z10 = z10;
        }
        SpannableStringBuilder spannableStringBuilderB = c0.b(spannableStringBuilderA);
        Object[] objArr3 = {new AbsoluteSizeSpan(dimensionPixelSize2, false), new ForegroundColorSpan(iA)};
        int length3 = spannableStringBuilderB.length();
        spannableStringBuilderB.append((CharSequence) getString(R.string.enjoy_all_benefits_of_termius));
        for (int i12 = 0; i12 < 2; i12++) {
            spannableStringBuilderB.setSpan(objArr3[i12], length3, spannableStringBuilderB.length(), 17);
        }
        SpannableStringBuilder spannableStringBuilderA2 = c0.a(spannableStringBuilderB);
        Object[] objArr4 = {new AbsoluteSizeSpan(dimensionPixelSize2, false), new CustomTypefaceSpan("", typeface)};
        int length4 = spannableStringBuilderA2.length();
        spannableStringBuilderA2.append((CharSequence) getString(R.string.in_n_period_colon, quantityString));
        for (int i13 = 0; i13 < 2; i13++) {
            spannableStringBuilderA2.setSpan(objArr4[i13], length4, spannableStringBuilderA2.length(), 17);
        }
        SpannableStringBuilder spannableStringBuilderB2 = c0.b(spannableStringBuilderA2);
        Object[] objArr5 = {new AbsoluteSizeSpan(dimensionPixelSize2, false), new ForegroundColorSpan(iA)};
        int length5 = spannableStringBuilderB2.length();
        spannableStringBuilderB2.append((CharSequence) getString(R.string.choose_best_paid_plan_or_switch_to_free_starter_plan));
        for (int i14 = 0; i14 < 2; i14++) {
            spannableStringBuilderB2.setSpan(objArr5[i14], length5, spannableStringBuilderB2.length(), 17);
        }
        textView2.setText(spannableStringBuilderB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Uf(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        enabledOpenAiAndGotTrialScreen.Qf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObjectAnimator Vf(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X.getName(), 1.1f), PropertyValuesHolder.ofFloat(View.SCALE_Y.getName(), 1.1f));
        ju.t.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(1);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnabledOpenAiAndGotTrialPresenter Wf(EnabledOpenAiAndGotTrialScreen enabledOpenAiAndGotTrialScreen) {
        SubscriptionPeriodInfo subscriptionPeriodInfo = enabledOpenAiAndGotTrialScreen.Nf().getSubscriptionPeriodInfo();
        ju.t.e(subscriptionPeriodInfo, "getSubscriptionPeriodInfo(...)");
        return new EnabledOpenAiAndGotTrialPresenter(subscriptionPeriodInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xf() {
        boolean z10 = getResources().getBoolean(R.bool.isTablet);
        AppCompatImageView appCompatImageView = Of().f72812m;
        ju.t.e(appCompatImageView, "titleIcon");
        appCompatImageView.setVisibility(!z10 ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.contracts.q0
    public void N1() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.q0
    public void fa(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        ju.t.f(subscriptionPeriodInfo, "subscriptionInfo");
        bh.a.b(this, new g(subscriptionPeriodInfo, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        this.f23901d = h0.a(requireActivity().getOnBackPressedDispatcher(), this, true, new iu.l() { // from class: ch.r
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EnabledOpenAiAndGotTrialScreen.Uf(this.f15615a, (androidx.activity.e0) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ju.t.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Xf();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f23898a = j1.c(layoutInflater, viewGroup, false);
        Lf();
        ConstraintLayout constraintLayoutB = Of().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23898a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e0 e0Var = this.f23901d;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }

    @Override // com.server.auditor.ssh.client.contracts.q0
    public void x(int i10) {
        bh.a.b(this, new f(i10, null));
    }
}
