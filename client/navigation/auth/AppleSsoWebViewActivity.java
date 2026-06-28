package com.server.auditor.ssh.client.navigation.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import java.util.UUID;
import ju.k;
import ju.t;
import su.s;

/* JADX INFO: loaded from: classes3.dex */
public final class AppleSsoWebViewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28981b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28982c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28983a;

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
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            t.f(webResourceRequest, "request");
            Uri url = webResourceRequest.getUrl();
            String scheme = url.getScheme();
            String host = url.getHost();
            String path = url.getPath();
            if (!s.F(scheme, "termius", false, 2, null) || !s.F(host, "app", false, 2, null) || !s.F(path, "/continue-sso", false, 2, null)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            AppleSsoWebViewActivity appleSsoWebViewActivity = AppleSsoWebViewActivity.this;
            t.c(url);
            appleSsoWebViewActivity.g0(url);
            return false;
        }
    }

    public AppleSsoWebViewActivity() {
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f28983a = string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(Uri uri) {
        if (!t.b(uri.getQueryParameter("requestId"), this.f28983a)) {
            setResult(-1);
            finish();
            return;
        }
        String queryParameter = uri.getQueryParameter("email");
        if (queryParameter == null || s.m0(queryParameter)) {
            setResult(-3);
            finish();
            return;
        }
        String queryParameter2 = uri.getQueryParameter("firebaseToken");
        if (queryParameter2 == null || s.m0(queryParameter2)) {
            setResult(-2);
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("apple_sso_firebase_token_key", queryParameter2);
        intent.putExtra("apple_sso_email_key", queryParameter);
        setResult(1, intent);
        finish();
    }

    private final WebViewClient h0() {
        return new b();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        t.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        webView.setWebViewClient(h0());
        setContentView(webView);
        webView.loadUrl("https://account.termius.com/sso/desktop?provider=apple&request=" + this.f28983a);
        setResult(0);
    }
}
