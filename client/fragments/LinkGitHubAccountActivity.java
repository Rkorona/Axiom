package com.server.auditor.ssh.client.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkGitHubAccountActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24030a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24031b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f24032c = su.s.H0(su.s.G0("https://api.termius.com/", "https://"), "/");

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
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
            ju.t.f(str, "url");
            super.onPageFinished(webView, str);
            if (su.s.Y(str, LinkGitHubAccountActivity.f24032c, false, 2, null) && su.s.Y(str, "/complete/github/", false, 2, null)) {
                LinkGitHubAccountActivity.this.setResult(99);
                LinkGitHubAccountActivity.this.finish();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            ju.t.f(webResourceRequest, "request");
            Uri url = webResourceRequest.getUrl();
            String host = url.getHost();
            String path = url.getPath();
            if (!su.s.F(host, LinkGitHubAccountActivity.f24032c, false, 2, null) || !su.s.F(path, "/complete/github/", false, 2, null)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            LinkGitHubAccountActivity linkGitHubAccountActivity = LinkGitHubAccountActivity.this;
            ju.t.c(url);
            linkGitHubAccountActivity.h0(url);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (su.s.m0(queryParameter)) {
            return;
        }
        setResult(ju.t.b(queryParameter, "access_denied") ? -99 : -2);
        finish();
    }

    private final WebViewClient i0() {
        return new b();
    }

    private final String j0(String str) {
        if (str == null || su.s.m0(str)) {
            String string = getString(R.string.link_github_account_site_url, "https://account.termius.com/");
            ju.t.c(string);
            return string;
        }
        String string2 = getString(R.string.link_github_account_site_with_email_url, "https://account.termius.com/", Uri.encode(str));
        ju.t.c(string2);
        return string2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        ju.t.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        webView.setWebViewClient(i0());
        setContentView(webView);
        webView.loadUrl(j0(getIntent().getStringExtra("LINK_GITHUB_ACCOUNT_USER_EMAIL_EXTRA")));
        setResult(0);
    }
}
