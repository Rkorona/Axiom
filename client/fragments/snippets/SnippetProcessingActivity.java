package com.server.auditor.ssh.client.fragments.snippets;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.snippets.SnippetProcessingActivity;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity;
import hi.e;
import java.util.ArrayList;
import ju.k;
import ju.t;
import o4.a2;
import o4.i0;
import o4.z0;
import qg.f1;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetProcessingActivity extends TransparentStatusBarActivity {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f26288u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f26289v = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f1 f26290f;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void r0() {
        f1 f1Var = this.f26290f;
        if (f1Var == null) {
            t.t("binding");
            f1Var = null;
        }
        z0.F0(f1Var.f72412d, new i0() { // from class: ci.b0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return SnippetProcessingActivity.s0(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 s0(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        t.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a2Var.s(a2.l.d()) ? a2Var.f(a2.l.d()).f47586d : a2Var.f(a2.l.g()).f47586d;
        return a2.f67518b;
    }

    private final void t0() {
        f1 f1Var = this.f26290f;
        if (f1Var == null) {
            t.t("binding");
            f1Var = null;
        }
        setSupportActionBar(f1Var.f72422n);
    }

    private final void v0(e eVar) {
        getSupportFragmentManager().s().p(R.id.content_frame, eVar).h();
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1 f1VarC = f1.c(getLayoutInflater());
        this.f26290f = f1VarC;
        if (f1VarC == null) {
            t.t("binding");
            f1VarC = null;
        }
        setContentView(f1VarC.b());
        r0();
        t0();
        Intent intent = getIntent();
        SnippetItem snippetItem = Build.VERSION.SDK_INT >= 33 ? (SnippetItem) intent.getParcelableExtra("snippet_processing_snippet_item", SnippetItem.class) : (SnippetItem) intent.getParcelableExtra("snippet_processing_snippet_item");
        boolean booleanExtra = intent.getBooleanExtra("snippet_processing_add_extension", false);
        ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("snippet_processing_host_ids_list");
        ArrayList<Integer> integerArrayListExtra2 = intent.getIntegerArrayListExtra("snippet_processing_session_ids_list");
        if (integerArrayListExtra != null) {
            e eVarGf = e.Gf(snippetItem, booleanExtra, integerArrayListExtra);
            t.e(eVarGf, "newInstance(...)");
            v0(eVarGf);
        } else if (integerArrayListExtra2 != null) {
            e eVarFf = e.Ff(snippetItem, integerArrayListExtra2);
            t.e(eVarFf, "newInstance(...)");
            v0(eVarFf);
        }
    }
}
