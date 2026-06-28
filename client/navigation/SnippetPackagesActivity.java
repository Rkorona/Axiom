package com.server.auditor.ssh.client.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.MasterPasswordEnterEmailScreenArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetPackagesActivity extends TransparentStatusBarActivity implements ch.y0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f28649u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28650v = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g.b f28651f = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.navigation.z2
        @Override // g.a
        public final void a(Object obj) {
            SnippetPackagesActivity.s0(this.f35129a, (ActivityResult) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void r0(int i10) {
        if (i10 == 1001) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(SnippetPackagesActivity snippetPackagesActivity, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        snippetPackagesActivity.r0(activityResult.getResultCode());
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.navigation_snippet_packages_activity);
        Fragment fragmentN0 = getSupportFragmentManager().n0(R.id.main_navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        androidx.navigation.m0 m0VarWf = ((NavHostFragment) fragmentN0).wf();
        androidx.navigation.s1 s1VarY = m0VarWf.y();
        String action = getIntent().getAction();
        Bundle extras = getIntent().getExtras();
        androidx.navigation.m1 m1VarB = s1VarY.b(R.navigation.snippets_flow);
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -2082821434) {
                if (iHashCode != 836320532) {
                    if (iHashCode == 1104809451 && action.equals("actionCreateSnippet")) {
                        m1VarB.W(R.id.create_snippet_fragment);
                    }
                } else if (action.equals("actionSelectPackage")) {
                    m1VarB.W(R.id.package_selector_fragment);
                }
            } else if (action.equals("actionEditPackage")) {
                m1VarB.W(R.id.snippet_package_editor_screen);
            }
        }
        m0VarWf.f0(m1VarB, extras);
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
        this.f28651f.a(intent);
    }
}
