package com.server.auditor.ssh.client;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity;
import com.server.auditor.ssh.client.utils.analytics.a;
import ju.t;
import qg.f1;
import tp.c1;

/* JADX INFO: loaded from: classes2.dex */
public final class ManageShortcutsActivity extends TransparentStatusBarActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f1 f21250f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f21251u = a.y();

    private final void q0() {
        View viewFindViewById = findViewById(R.id.toolbar);
        t.d(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        setSupportActionBar((Toolbar) viewFindViewById);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c1.e(this, com.server.auditor.ssh.client.app.a.N().F());
        super.onCreate(bundle);
        f1 f1VarC = f1.c(getLayoutInflater());
        this.f21250f = f1VarC;
        f1 f1Var = null;
        if (f1VarC == null) {
            t.t("binding");
            f1VarC = null;
        }
        DrawerLayout drawerLayoutB = f1VarC.b();
        t.e(drawerLayoutB, "getRoot(...)");
        setContentView(drawerLayoutB);
        f1 f1Var2 = this.f21250f;
        if (f1Var2 == null) {
            t.t("binding");
        } else {
            f1Var = f1Var2;
        }
        f1Var.f72413e.setDrawerLockMode(1);
        q0();
        getSupportFragmentManager().s().p(R.id.content_frame, new bi.t()).h();
        this.f21251u.C1();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        t.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }
}
