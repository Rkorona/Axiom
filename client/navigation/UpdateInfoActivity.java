package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateInfoActivity extends TransparentStatusBarActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28655f = TransparentStatusBarActivity.f28654e;

    private final void q0() {
        if (getResources().getBoolean(R.bool.isTablet)) {
            return;
        }
        setRequestedOrientation(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        q0();
        tp.c1.e(this, com.server.auditor.ssh.client.app.a.N().F());
        super.onCreate(bundle);
        setContentView(R.layout.activity_update_info);
        androidx.navigation.m0 m0VarC = androidx.navigation.e2.c(this, R.id.main_content);
        m0VarC.w().W(R.id.updateTheAppFragment);
        m0VarC.J(R.id.updateTheAppFragment);
    }
}
