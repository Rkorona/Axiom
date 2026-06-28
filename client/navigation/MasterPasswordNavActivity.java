package com.server.auditor.ssh.client.navigation;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.MasterPasswordNavActivity;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterPasswordNavActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28298c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28299d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f28300e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.d3 f28301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ut.n f28302b = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.q1
        @Override // iu.a
        public final Object a() {
            return MasterPasswordNavActivity.i0(this.f29576a);
        }
    });

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MasterPasswordNavActivity masterPasswordNavActivity, Boolean bool) {
            ju.t.c(bool);
            masterPasswordNavActivity.m0(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(MasterPasswordNavActivity masterPasswordNavActivity, Boolean bool) {
            ju.t.c(bool);
            masterPasswordNavActivity.m0(bool.booleanValue());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ju.t.f(view, "v");
            WindowManager windowManager = MasterPasswordNavActivity.this.getWindowManager();
            final MasterPasswordNavActivity masterPasswordNavActivity = MasterPasswordNavActivity.this;
            windowManager.addCrossWindowBlurEnabledListener(new Consumer() { // from class: com.server.auditor.ssh.client.navigation.u1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    MasterPasswordNavActivity.b.c(masterPasswordNavActivity, (Boolean) obj);
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ju.t.f(view, "v");
            WindowManager windowManager = MasterPasswordNavActivity.this.getWindowManager();
            final MasterPasswordNavActivity masterPasswordNavActivity = MasterPasswordNavActivity.this;
            windowManager.removeCrossWindowBlurEnabledListener(new Consumer() { // from class: com.server.auditor.ssh.client.navigation.t1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    MasterPasswordNavActivity.b.d(masterPasswordNavActivity, (Boolean) obj);
                }
            });
        }
    }

    static {
        f28300e = Build.VERSION.SDK_INT >= 31;
    }

    private final void h0() {
        getWindow().setBackgroundDrawable(j0());
        boolean z10 = getResources().getBoolean(R.bool.isTablet);
        if (!f28300e || !z10) {
            m0(false);
        } else {
            getWindow().addFlags(4);
            l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable i0(MasterPasswordNavActivity masterPasswordNavActivity) {
        return masterPasswordNavActivity.getWindow().getDecorView().getBackground().mutate();
    }

    private final Drawable j0() {
        return (Drawable) this.f28302b.getValue();
    }

    private final void k0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    private final void l0() {
        getWindow().getDecorView().addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean z10) {
        if (!z10 || !f28300e) {
            j0().setAlpha(255);
        } else {
            j0().setAlpha(0);
            getWindow().setBackgroundBlurRadius(20);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        k0();
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
        setFinishOnTouchOutside(false);
        qg.d3 d3VarC = qg.d3.c(getLayoutInflater());
        this.f28301a = d3VarC;
        if (d3VarC == null) {
            ju.t.t("binding");
            d3VarC = null;
        }
        setContentView(d3VarC.b());
        h0();
        Bundle extras = getIntent().getExtras();
        Fragment fragmentN0 = getSupportFragmentManager().n0(R.id.main_navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        androidx.navigation.m0 m0VarWf = ((NavHostFragment) fragmentN0).wf();
        m0VarWf.f0(m0VarWf.y().b(R.navigation.master_password_flow), extras);
    }
}
