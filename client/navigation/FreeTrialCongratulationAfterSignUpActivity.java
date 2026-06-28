package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FreeTrialCongratulationAfterSignUpActivity extends TermiusBasicActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28184d = TermiusBasicActivity.f28652c;

    private final void p0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    @Override // com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        p0();
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
        setFinishOnTouchOutside(false);
        setContentView(R.layout.free_trial_congratulation_after_sign_up_activity);
        if (bundle == null) {
            getSupportFragmentManager().s().p(R.id.fragment_container, new ch.i0()).h();
        }
    }
}
