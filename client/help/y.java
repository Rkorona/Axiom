package com.server.auditor.ssh.client.help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.database.Column;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.b5;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends MvpAppCompatFragment implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b5 f27125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f27126b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f27123d = {n0.g(new g0(y.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/help/ProductBoardWebViewPresenter;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27122c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27124e = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27127a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return y.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27127a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.this.xf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27129a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f27131c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return y.this.new c(this.f27131c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27129a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.this.vf().f71994i.loadUrl(this.f27131c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d extends WebViewClient {
        d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            y.this.wf().r2();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            y.this.wf().q2();
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27133a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27135c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return y.this.new e(this.f27135c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27133a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConstraintLayout constraintLayout = y.this.vf().f71993h;
            ju.t.e(constraintLayout, "networkErrorLayout");
            constraintLayout.setVisibility(this.f27135c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27136a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27138c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return y.this.new f(this.f27138c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27136a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConstraintLayout constraintLayout = y.this.vf().f71990e;
            ju.t.e(constraintLayout, "loadingLayout");
            constraintLayout.setVisibility(this.f27138c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public y() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.help.x
            @Override // iu.a
            public final Object a() {
                return y.zf(this.f27121a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f27126b = new MoxyKtxDelegate(mvpDelegate, ProductBoardWebViewPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b5 vf() {
        b5 b5Var = this.f27125a;
        if (b5Var != null) {
            return b5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductBoardWebViewPresenter wf() {
        return (ProductBoardWebViewPresenter) this.f27126b.getValue(this, f27123d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xf() {
        WebSettings settings = vf().f71994i.getSettings();
        ju.t.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        vf().f71994i.setWebViewClient(yf());
    }

    private final WebViewClient yf() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductBoardWebViewPresenter zf(y yVar) {
        String string;
        Bundle arguments = yVar.getArguments();
        if (arguments == null || (string = arguments.getString(Column.ADDRESS)) == null) {
            string = "";
        }
        return new ProductBoardWebViewPresenter(string);
    }

    @Override // com.server.auditor.ssh.client.help.w
    public void Re(boolean z10) {
        bh.a.b(this, new f(z10, null));
    }

    @Override // com.server.auditor.ssh.client.help.w
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.help.w
    public void e9(String str) {
        ju.t.f(str, "url");
        bh.a.b(this, new c(str, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f27125a = b5.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = vf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f27125a = null;
        super.onDestroy();
    }

    @Override // com.server.auditor.ssh.client.help.w
    public void ra(boolean z10) {
        bh.a.b(this, new e(z10, null));
    }
}
