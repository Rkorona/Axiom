package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.e2;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginActivity;
import o4.m1;
import qg.z2;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25299a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25300b = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void g0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets h0(View view, WindowInsets windowInsets) {
        ju.t.f(view, "v");
        ju.t.f(windowInsets, "insets");
        if (Build.VERSION.SDK_INT < 30) {
            return windowInsets;
        }
        Insets insets = view.getRootWindowInsets().getInsets(WindowInsets.Type.ime() + WindowInsets.Type.systemBars());
        ju.t.e(insets, "getInsets(...)");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return l4.l.a().setInsets(WindowInsets.Type.ime(), insets).build();
    }

    private final void i0() {
        Intent intent = getIntent();
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("extraTheme", 2)) : null;
        getDelegate().setLocalNightMode((numValueOf == null || numValueOf.intValue() != 1) ? (numValueOf != null && numValueOf.intValue() == 0) ? 1 : -1 : 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        g0();
        i0();
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        z2 z2VarC = z2.c(getLayoutInflater());
        ju.t.e(z2VarC, "inflate(...)");
        setContentView(z2VarC.b());
        m1.b(getWindow(), false);
        z2VarC.b().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: th.o
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return LoginActivity.h0(view, windowInsets);
            }
        });
        String action = getIntent().getAction();
        Bundle extras = getIntent().getExtras();
        androidx.navigation.m0 m0VarC = e2.c(this, R.id.authentication_nav_container);
        androidx.navigation.m1 m1VarB = m0VarC.y().b(R.navigation.authentication_flow);
        if (ju.t.b(action, "registrationFlowAction")) {
            m1VarB.W(R.id.signUpChooserScreen);
        } else if (ju.t.b(action, "loginFlowAction")) {
            m1VarB.W(R.id.signInChooserScreen);
        } else {
            y9.a.f86838a.g("Unexpected navigation action detected: " + action);
            m1VarB.W(R.id.signInChooserScreen);
        }
        m0VarC.f0(m1VarB, extras);
    }
}
