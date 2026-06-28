package com.server.auditor.ssh.client.navigation;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransparentStatusBarActivity extends TermiusBasicActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28653d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28654e = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private final boolean a(int i10) {
            return ((double) 1.0f) - d4.c.d(i10) >= 0.5d;
        }

        public final void b(Window window, int i10, boolean z10) {
            ju.t.f(window, "win");
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            window.setAttributes(attributes);
        }

        public final void c(AppCompatActivity appCompatActivity, int i10) {
            ju.t.f(appCompatActivity, "activity");
            o4.z2 z2VarA = o4.m1.a(appCompatActivity.getWindow(), appCompatActivity.getWindow().getDecorView());
            ju.t.e(z2VarA, "getInsetsController(...)");
            if (Build.VERSION.SDK_INT >= 29) {
                appCompatActivity.getWindow().setNavigationBarContrastEnforced(false);
            }
            if (a(i10)) {
                z2VarA.d(false);
            } else {
                z2VarA.d(true);
            }
        }

        private a() {
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        tp.c1.e(this, p0());
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
    }

    protected int p0() {
        return com.server.auditor.ssh.client.app.a.N().F();
    }
}
