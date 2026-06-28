package com.server.auditor.ssh.client.navigation.auth;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.server.auditor.ssh.client.navigation.auth.EnterpriseSsoWebViewActivity;
import ju.k;
import ju.t;
import qg.y1;
import su.s;

/* JADX INFO: loaded from: classes3.dex */
public final class EnterpriseSsoWebViewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28985b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28986c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y1 f28987a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView != null) {
                webView.setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            EnterpriseSsoWebViewActivity.this.getIntent().putExtra("web_client_error_result_code", i10);
            EnterpriseSsoWebViewActivity.this.finish();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            t.f(webResourceRequest, "request");
            String string = webResourceRequest.getUrl().toString();
            t.e(string, "toString(...)");
            if (!s.Y(string, "/enterprise/sso/mobile?code=", false, 2, null)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            String strM0 = EnterpriseSsoWebViewActivity.this.m0(string);
            if (strM0 != null) {
                EnterpriseSsoWebViewActivity enterpriseSsoWebViewActivity = EnterpriseSsoWebViewActivity.this;
                enterpriseSsoWebViewActivity.getIntent().putExtra("one_token", strM0);
                enterpriseSsoWebViewActivity.setResult(-1, enterpriseSsoWebViewActivity.getIntent());
            }
            EnterpriseSsoWebViewActivity.this.j0();
            EnterpriseSsoWebViewActivity.this.finish();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: sj.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                EnterpriseSsoWebViewActivity.k0((Boolean) obj);
            }
        });
        cookieManager.removeSessionCookies(new ValueCallback() { // from class: sj.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                EnterpriseSsoWebViewActivity.l0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m0(String str) {
        String strSubstring = str.substring(s.k0(str, "/enterprise/sso/mobile?code=", 0, false, 6, null) + 28);
        t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final y1 n0() {
        y1 y1Var = this.f28987a;
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException();
    }

    private final WebViewClient o0() {
        return new b();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("auth_url")) == null) {
            string = "";
        }
        this.f28987a = y1.c(getLayoutInflater());
        n0().f74425b.setWebViewClient(o0());
        n0().f74425b.getSettings().setJavaScriptEnabled(true);
        n0().f74425b.getSettings().setCacheMode(2);
        j0();
        n0().f74425b.loadUrl(string);
        setResult(0);
        setContentView(n0().b());
    }
}
