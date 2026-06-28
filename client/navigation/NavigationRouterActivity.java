package com.server.auditor.ssh.client.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationRouterActivity extends TransparentStatusBarActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28307f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28308u = TransparentStatusBarActivity.f28654e;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void q0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        q0();
        super.onCreate(bundle);
        setContentView(R.layout.navigation_router_activity);
        String action = getIntent().getAction();
        Bundle extras = getIntent().getExtras();
        Fragment fragmentN0 = getSupportFragmentManager().n0(R.id.main_navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        androidx.navigation.m0 m0VarWf = ((NavHostFragment) fragmentN0).wf();
        if (action != null) {
            switch (action.hashCode()) {
                case -705953362:
                    if (action.equals("showOrdinaryConflictsScreen")) {
                        androidx.navigation.m1 m1VarB = m0VarWf.y().b(R.navigation.conflicts_flow);
                        m1VarB.W(R.id.ordinaryConflictsScreen);
                        m0VarWf.f0(m1VarB, extras);
                        break;
                    }
                    break;
                case -491336640:
                    if (action.equals("quickImportFlow")) {
                        m0VarWf.f0(m0VarWf.y().b(R.navigation.quick_import_flow), extras);
                        break;
                    }
                    break;
                case -191156102:
                    if (action.equals("showPFConflictsScreen")) {
                        androidx.navigation.m1 m1VarB2 = m0VarWf.y().b(R.navigation.conflicts_flow);
                        m1VarB2.W(R.id.pf_conflict_screen);
                        m0VarWf.f0(m1VarB2, extras);
                        break;
                    }
                    break;
                case 15484478:
                    if (action.equals("backupAndSyncFlow")) {
                        m0VarWf.f0(m0VarWf.y().b(R.navigation.backup_and_sync_flow), extras);
                        break;
                    }
                    break;
                case 49584313:
                    if (action.equals("backUpAndSyncDevicesScreen")) {
                        androidx.navigation.m1 m1VarB3 = m0VarWf.y().b(R.navigation.backup_and_sync_flow);
                        m1VarB3.W(R.id.backUpAndSyncDevicesScreen);
                        m0VarWf.f0(m1VarB3, extras);
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
}
