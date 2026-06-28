package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import iu.p;
import ju.t;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class NewCryptoActivity extends TransparentStatusBarActivity implements k.i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f29088u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f29089v = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f29090f;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29091a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoActivity.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoActivity.this.setResult(0);
            NewCryptoActivity.this.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29093a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoActivity.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29093a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoActivity.this.setResult(-1);
            NewCryptoActivity.this.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29095a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoActivity.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29095a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = NewCryptoActivity.this.getString(R.string.how_we_check_passwords);
            t.e(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(NewCryptoActivity.this.getPackageManager()) != null) {
                NewCryptoActivity.this.startActivity(intent);
            } else {
                new be.b(NewCryptoActivity.this).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29097a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoActivity.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29097a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = NewCryptoActivity.this.getString(R.string.new_crypto_new_encryption_link);
            t.e(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(NewCryptoActivity.this.getPackageManager()) != null) {
                NewCryptoActivity.this.startActivity(intent);
            } else {
                new be.b(NewCryptoActivity.this).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29099a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.j f29101c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k.j jVar, zt.e eVar) {
            super(2, eVar);
            this.f29101c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewCryptoActivity.this.new f(this.f29101c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29099a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            NewCryptoActivity.this.getSupportFragmentManager().s().s(R.anim.fragment_fade_enter, R.anim.fragment_fade_exit).p(R.id.fragment_container, (Fragment) this.f29101c).h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    private final void q0() {
        if (getResources().getBoolean(R.bool.isTablet)) {
            return;
        }
        setRequestedOrientation(1);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.i
    public void Pa() {
        a0.a(this).c(new b(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.i
    public void f1() {
        a0.a(this).c(new d(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.i
    public void f6(k.j jVar) {
        t.f(jVar, "view");
        if (jVar instanceof Fragment) {
            a0.a(this).c(new f(jVar, null));
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.i
    public void n() {
        a0.a(this).c(new c(null));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        k kVar = this.f29090f;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onBack();
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        q0();
        super.onCreate(bundle);
        setContentView(R.layout.new_crypto_activity_layout);
        int intExtra = getIntent().getIntExtra("action_id", 0);
        k kVar = (k) new l1(this).a(NewCryptoViewModel.class);
        this.f29090f = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onMainViewCreate(this, intExtra);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.i
    public void p4() {
        a0.a(this).c(new e(null));
    }
}
