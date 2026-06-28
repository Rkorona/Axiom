package com.server.auditor.ssh.client.pincode;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.biometric.f;
import androidx.fragment.app.o0;
import androidx.lifecycle.k1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity;
import com.server.auditor.ssh.client.pincode.PinScreenActivity;
import io.split.android.client.service.sseclient.EventStreamParser;
import iu.p;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import ju.n0;
import ju.t;
import ju.u;
import kotlin.coroutines.jvm.internal.m;
import qg.k4;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vk.f0;
import vk.i0;
import vk.s;
import vk.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class PinScreenActivity extends TransparentStatusBarActivity implements i0 {
    private static final float[] A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f35147x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f35148y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final boolean f35149z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k4 f35150f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.biometric.f f35152v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final n f35151u = new k1(n0.b(PinScreenViewModel.class), new j(this), new i(this), new k(null, this));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final n f35153w = o.a(new iu.a() { // from class: vk.z
        @Override // iu.a
        public final Object a() {
            return PinScreenActivity.B0(this.f83630a);
        }
    });

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35154a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PinScreenActivity.this.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(PinScreenActivity pinScreenActivity, Boolean bool) {
            t.c(bool);
            pinScreenActivity.J0(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(PinScreenActivity pinScreenActivity, Boolean bool) {
            t.c(bool);
            pinScreenActivity.J0(bool.booleanValue());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            t.f(view, "v");
            WindowManager windowManager = PinScreenActivity.this.getWindowManager();
            final PinScreenActivity pinScreenActivity = PinScreenActivity.this;
            windowManager.addCrossWindowBlurEnabledListener(new Consumer() { // from class: vk.d0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PinScreenActivity.c.c(pinScreenActivity, (Boolean) obj);
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            t.f(view, "v");
            WindowManager windowManager = PinScreenActivity.this.getWindowManager();
            final PinScreenActivity pinScreenActivity = PinScreenActivity.this;
            windowManager.removeCrossWindowBlurEnabledListener(new Consumer() { // from class: vk.c0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PinScreenActivity.c.d(pinScreenActivity, (Boolean) obj);
                }
            });
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35157a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            o0 o0VarS = PinScreenActivity.this.getSupportFragmentManager().s().s(R.anim.fadein, R.anim.fadeout);
            k4 k4Var = PinScreenActivity.this.f35150f;
            if (k4Var == null) {
                t.t("binding");
                k4Var = null;
            }
            o0VarS.p(k4Var.f72950b.getId(), new s0()).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35159a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            o0 o0VarS = PinScreenActivity.this.getSupportFragmentManager().s().s(R.anim.fadein, R.anim.fadeout);
            k4 k4Var = PinScreenActivity.this.f35150f;
            if (k4Var == null) {
                t.t("binding");
                k4Var = null;
            }
            o0VarS.p(k4Var.f72950b.getId(), new vk.j()).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35161a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35161a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            o0 o0VarS = PinScreenActivity.this.getSupportFragmentManager().s().s(R.anim.fadein, R.anim.fadeout);
            k4 k4Var = PinScreenActivity.this.f35150f;
            if (k4Var == null) {
                t.t("binding");
                k4Var = null;
            }
            o0VarS.p(k4Var.f72950b.getId(), new wk.o()).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35163a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35163a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            o0 o0VarS = PinScreenActivity.this.getSupportFragmentManager().s().s(R.anim.fadein, R.anim.fadeout);
            k4 k4Var = PinScreenActivity.this.f35150f;
            if (k4Var == null) {
                t.t("binding");
                k4Var = null;
            }
            o0VarS.p(k4Var.f72950b.getId(), new wk.i()).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35165a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenActivity.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35165a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            o0 o0VarS = PinScreenActivity.this.getSupportFragmentManager().s().s(R.anim.fadein, R.anim.fadeout);
            k4 k4Var = PinScreenActivity.this.f35150f;
            if (k4Var == null) {
                t.t("binding");
                k4Var = null;
            }
            o0VarS.p(k4Var.f72950b.getId(), new s()).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class i extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f35167a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f35167a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f35167a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f35168a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f35168a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f35168a.getViewModelStore();
        }
    }

    public static final class k extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f35169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f35170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f35169a = aVar;
            this.f35170b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f35169a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f35170b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class l extends f.a {
        l() {
        }

        @Override // androidx.biometric.f.a
        public void a(int i10, CharSequence charSequence) {
            t.f(charSequence, "errString");
            super.a(i10, charSequence);
            PinScreenActivity.this.f35152v = null;
            if (PinScreenActivity.this.isFinishing() || PinScreenActivity.this.isDestroyed()) {
                return;
            }
            PinScreenActivity.this.E0().onBiometricAuthenticationError();
        }

        @Override // androidx.biometric.f.a
        public void b() {
            super.b();
            if (PinScreenActivity.this.isFinishing() || PinScreenActivity.this.isDestroyed()) {
                return;
            }
            PinScreenActivity.this.E0().onBiometricAuthenticationError();
        }

        @Override // androidx.biometric.f.a
        public void c(f.b bVar) {
            t.f(bVar, "result");
            super.c(bVar);
            PinScreenActivity.this.f35152v = null;
            if (PinScreenActivity.this.isFinishing() || PinScreenActivity.this.isDestroyed()) {
                return;
            }
            PinScreenActivity.this.E0().onBiometricAuthenticationSuccess();
        }
    }

    static {
        f35149z = Build.VERSION.SDK_INT >= 31;
        A = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    }

    private final void A0() {
        androidx.biometric.f fVar = this.f35152v;
        if (fVar == null) {
            return;
        }
        this.f35152v = null;
        fVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable B0(PinScreenActivity pinScreenActivity) {
        Drawable drawableMutate;
        Drawable drawable = pinScreenActivity.getDrawable(R.drawable.pop_up_when_large_protected_background);
        return (drawable == null || (drawableMutate = drawable.mutate()) == null) ? new ShapeDrawable(new RoundRectShape(A, null, null)) : drawableMutate;
    }

    private final void C0() {
        getWindow().clearFlags(8192);
    }

    private final Drawable D0() {
        return (Drawable) this.f35153w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinScreenViewModel E0() {
        return (PinScreenViewModel) this.f35151u.getValue();
    }

    private final void F0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 G0(PinScreenActivity pinScreenActivity, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        pinScreenActivity.E0().onBackPressed();
        return m0.f82633a;
    }

    private final void H0() {
        getWindow().getDecorView().addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(PinScreenActivity pinScreenActivity) {
        if (pinScreenActivity.isFinishing() || pinScreenActivity.isDestroyed()) {
            return;
        }
        wk.a aVar = wk.a.f84969a;
        String string = pinScreenActivity.getString(R.string.use_your_biometrics_to_continue);
        t.e(string, "getString(...)");
        Executor mainExecutor = androidx.core.content.a.getMainExecutor(pinScreenActivity);
        t.e(mainExecutor, "getMainExecutor(...)");
        pinScreenActivity.f35152v = aVar.a(pinScreenActivity, string, mainExecutor, pinScreenActivity.new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(boolean z10) {
        if (!z10 || !f35149z) {
            D0().setAlpha(255);
        } else {
            D0().setAlpha(0);
            getWindow().setBackgroundBlurRadius(20);
        }
    }

    private final void y0() {
        getWindow().setBackgroundDrawable(D0());
        boolean z10 = getResources().getBoolean(R.bool.isTablet);
        if (!f35149z || !z10) {
            J0(false);
        } else {
            getWindow().addFlags(4);
            H0();
        }
    }

    private final void z0() {
        if (com.server.auditor.ssh.client.app.a.N().w0()) {
            getWindow().setFlags(8192, 8192);
        }
    }

    @Override // vk.i0
    public void a() {
        bh.a.b(this, new f(null));
    }

    @Override // vk.i0
    public void b() {
        bh.a.b(this, new e(null));
    }

    @Override // vk.i0
    public void close() {
        bh.a.b(this, new b(null));
    }

    @Override // vk.i0
    public void f() {
        bh.a.b(this, new g(null));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        f0.a(this);
    }

    @Override // vk.i0
    public void j() {
        bh.a.b(this, new d(null));
    }

    @Override // vk.i0
    public void k() {
        bh.a.b(this, new h(null));
    }

    @Override // vk.i0
    public void m() {
        k4 k4Var = this.f35150f;
        if (k4Var == null) {
            t.t("binding");
            k4Var = null;
        }
        k4Var.b().post(new Runnable() { // from class: vk.a0
            @Override // java.lang.Runnable
            public final void run() {
                PinScreenActivity.I0(this.f83479a);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String action;
        F0();
        z0();
        setFinishOnTouchOutside(false);
        super.onCreate(bundle);
        setTheme(R.style.Theme_Termius_PopUpWhenLarge_Protected);
        k4 k4VarC = k4.c(getLayoutInflater());
        this.f35150f = k4VarC;
        if (k4VarC == null) {
            t.t("binding");
            k4VarC = null;
        }
        setContentView(k4VarC.b());
        y0();
        f0.b(this);
        h0.b(getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: vk.b0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return PinScreenActivity.G0(this.f83481a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        Intent intent = getIntent();
        if (intent == null || (action = intent.getAction()) == null) {
            action = "";
        }
        E0().onCreate(this, action);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        C0();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        t.f(keyEvent, EventStreamParser.EVENT_FIELD);
        return E0().onKeyDown(i10, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        t.f(intent, "intent");
        super.onNewIntent(intent);
        f0.b(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        A0();
        super.onPause();
    }

    @Override // vk.i0
    public void s() {
        setResult(-1);
    }

    @Override // vk.i0
    public void x() {
        setResult(0);
    }
}
