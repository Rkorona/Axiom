package com.server.auditor.ssh.client.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.MasterPasswordEnterEmailScreenArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNavigationContainerActivity extends TransparentStatusBarActivity implements ch.y0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f28181u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28182v = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g.b f28183f = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.navigation.k0
        @Override // g.a
        public final void a(Object obj) {
            FragmentNavigationContainerActivity.t0(this.f29061a, (ActivityResult) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void r0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    private final void s0(int i10) {
        if (i10 == 1001) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(FragmentNavigationContainerActivity fragmentNavigationContainerActivity, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        fragmentNavigationContainerActivity.s0(activityResult.getResultCode());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        r0();
        super.onCreate(bundle);
        setContentView(R.layout.navigation_router_activity);
        String action = getIntent().getAction();
        Bundle extras = getIntent().getExtras();
        Fragment fragmentN0 = getSupportFragmentManager().n0(R.id.main_navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        androidx.navigation.m0 m0VarWf = ((NavHostFragment) fragmentN0).wf();
        if (action != null) {
            switch (action.hashCode()) {
                case -1359118979:
                    if (action.equals("sshKeyGenerationFlow")) {
                        androidx.navigation.m1 m1VarB = m0VarWf.y().b(R.navigation.ssh_key_flow);
                        m1VarB.W(R.id.ssh_key_generation_screen);
                        m0VarWf.f0(m1VarB, extras);
                        break;
                    }
                    break;
                case -1110618875:
                    if (action.equals("sshKeyFlow")) {
                        androidx.navigation.m1 m1VarB2 = m0VarWf.y().b(R.navigation.ssh_key_flow);
                        m1VarB2.W(R.id.edit_ssh_key_fragment);
                        m0VarWf.f0(m1VarB2, extras);
                        break;
                    }
                    break;
                case 703764565:
                    if (action.equals("biometricKeyFlow")) {
                        androidx.navigation.m1 m1VarB3 = m0VarWf.y().b(R.navigation.ssh_key_flow);
                        m1VarB3.W(R.id.biometric_key_edit_screen);
                        m0VarWf.f0(m1VarB3, extras);
                        break;
                    }
                    break;
                case 865739003:
                    if (action.equals("accountFlow")) {
                        m0VarWf.f0(m0VarWf.y().b(R.navigation.account_flow), extras);
                        break;
                    }
                    break;
                case 1323412403:
                    if (action.equals("GENERATE_FIDO2_KEY_FLOW")) {
                        androidx.navigation.m1 m1VarB4 = m0VarWf.y().b(R.navigation.ssh_key_flow);
                        m1VarB4.W(R.id.generateWebAuthnKey);
                        m0VarWf.f0(m1VarB4, extras);
                        break;
                    }
                    break;
                case 2025383117:
                    if (action.equals("biometricKeyGenerationFlow")) {
                        androidx.navigation.m1 m1VarB5 = m0VarWf.y().b(R.navigation.ssh_key_flow);
                        m1VarB5.W(R.id.biometric_key_generation_screen);
                        m0VarWf.f0(m1VarB5, extras);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity
    protected int p0() {
        int iP0 = super.p0();
        Intent intent = getIntent();
        return intent != null ? intent.getIntExtra("extraTheme", iP0) : iP0;
    }

    @Override // ch.y0
    public void q(String str) {
        ju.t.f(str, "username");
        Intent intent = new Intent(this, (Class<?>) MasterPasswordNavActivity.class);
        intent.setFlags(67108864);
        Bundle bundle = new MasterPasswordEnterEmailScreenArgs.a(str).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        intent.putExtras(bundle);
        this.f28183f.a(intent);
    }
}
