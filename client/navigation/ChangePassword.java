package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.r;
import com.server.auditor.ssh.client.presenters.ChangePasswordPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangePassword extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.f0 f28031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f28032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.activity.e0 f28033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f28034d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28029f = {ju.n0.g(new ju.g0(ChangePassword.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ChangePasswordPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28028e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28030u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28035a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28037c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new a0(this.f28037c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            LinearLayout linearLayout = ChangePassword.this.If().f72406m.f72436g;
            ju.t.e(linearLayout, "passwordBreachProgressLayout");
            linearLayout.setVisibility(this.f28037c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28038a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28038a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72404k.setText((CharSequence) null);
            ChangePassword.this.If().f72402i.setText((CharSequence) null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28040a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28042c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new b0(this.f28042c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28040a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72399f.setEnabled(this.f28042c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28043a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.u0 u0VarJ;
            au.b.f();
            if (this.f28043a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.l();
            boolean zT = androidx.navigation.fragment.c.a(ChangePassword.this).T();
            androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(ChangePassword.this).s();
            if (d0VarS != null && (u0VarJ = d0VarS.j()) != null) {
                u0VarJ.h("is_password_changed_successful", kotlin.coroutines.jvm.internal.b.a(true));
            }
            if (!zT) {
                ChangePassword.this.x(1001);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28045a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, zt.e eVar) {
            super(2, eVar);
            this.f28047c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new c0(this.f28047c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28045a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72405l.setError(this.f28047c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28048a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28048a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72395b.f72288b.setEnabled(true);
            ChangePassword.this.If().f72399f.setDefaultButtonState();
            ChangePassword.this.If().f72399f.setEnabled(true);
            ChangePassword.this.If().f72405l.setEnabled(true);
            ChangePassword.this.If().f72403j.setEnabled(true);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28050a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28052c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new d0(this.f28052c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28050a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = ChangePassword.this.If().f72406m.f72433d;
            ju.t.e(appCompatTextView, "passwordBreachFaq");
            appCompatTextView.setVisibility(this.f28052c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChangePassword.this.Jf().S2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28056c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new e0(this.f28056c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = ChangePassword.this.If().f72406m.f72432c;
            ju.t.e(appCompatTextView, "firstSuggestion");
            appCompatTextView.setVisibility(this.f28056c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChangePassword.this.Jf().R2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f28060c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new f0(this.f28060c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72406m.f72437h.setStrength(this.f28060c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28061a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.Kf();
            ChangePassword.this.Mf();
            ChangePassword.this.Pf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28063a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28065c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new g0(this.f28065c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = ChangePassword.this.If().f72406m.f72441l;
            ju.t.e(appCompatTextView, "secondSuggestion");
            appCompatTextView.setVisibility(this.f28065c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28066a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28066a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(ChangePassword.this).T()) {
                ChangePassword.this.x(1000);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28068a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28070c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new h0(this.f28070c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28068a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = ChangePassword.this.If().f72406m.f72443n;
            ju.t.e(appCompatTextView, "warning");
            appCompatTextView.setVisibility(this.f28070c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28071a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28071a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = ChangePassword.this.getString(R.string.how_we_check_passwords);
            ju.t.e(string, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(ChangePassword.this.requireActivity().getPackageManager()) != null) {
                ChangePassword.this.startActivity(intent);
            } else {
                new be.b(ChangePassword.this.requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f28075c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new j(this.f28075c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28073a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72406m.f72432c.setText(this.f28075c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28076a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f28078c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new k(this.f28078c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72406m.f72441l.setText(this.f28078c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28079a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28081c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f28081c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new l(this.f28081c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28079a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72406m.f72443n.setText(this.f28081c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28082a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28082a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.new_crypto_migration_security_token_throttled_later);
            ju.t.e(string, "getString(...)");
            changePassword.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28084a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.password_change_failed);
            ju.t.e(string, "getString(...)");
            changePassword.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28086a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, zt.e eVar) {
            super(2, eVar);
            this.f28088c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new o(this.f28088c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28086a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = ChangePassword.this.getView();
            if (view != null) {
                String str = this.f28088c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28089a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, zt.e eVar) {
            super(2, eVar);
            this.f28091c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new p(this.f28091c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28089a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.Hd(this.f28091c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28092a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28092a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = ChangePassword.this.getString(R.string.toast_internet_available);
            ju.t.e(string, "getString(...)");
            ChangePassword.this.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28094a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28094a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.e1(true);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.password_is_not_pwned_message);
            ju.t.e(string, "getString(...)");
            changePassword.u0(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28096a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28096a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.f0(true);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.password_was_breached_message);
            ju.t.e(string, "getString(...)");
            changePassword.Q(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28098a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28098a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72395b.f72288b.setEnabled(false);
            ChangePassword.this.If().f72399f.setIndeterminateButtonState();
            ChangePassword.this.If().f72399f.setEnabled(false);
            ChangePassword.this.If().f72405l.setEnabled(false);
            ChangePassword.this.If().f72403j.setEnabled(false);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28100a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i10, zt.e eVar) {
            super(2, eVar);
            this.f28102c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new u(this.f28102c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28100a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = ChangePassword.this.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f28102c));
            ju.t.e(string, "getString(...)");
            ChangePassword.this.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChangePassword f28106d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, String str2, ChangePassword changePassword, zt.e eVar) {
            super(2, eVar);
            this.f28104b = str;
            this.f28105c = str2;
            this.f28106d = changePassword;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new v(this.f28104b, this.f28105c, this.f28106d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28103a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            r.a aVarA = com.server.auditor.ssh.client.navigation.r.a(this.f28104b, this.f28105c);
            ju.t.e(aVarA, "actionChangePasswordToRequireTwoFactorCode(...)");
            androidx.navigation.fragment.c.a(this.f28106d).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28107a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28107a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.f0(true);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.hibp_checking_something_went_wrong);
            ju.t.e(string, "getString(...)");
            changePassword.Q(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28109a;

        x(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new x(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28109a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword changePassword = ChangePassword.this;
            String string = changePassword.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            changePassword.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28111a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28113c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new y(this.f28113c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28111a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePassword.this.If().f72406m.f72431b.setEnabled(this.f28113c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28114a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28116c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePassword.this.new z(this.f28116c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28114a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = ChangePassword.this.If().f72406m.f72431b;
            ju.t.e(appCompatTextView, "checkPasswordBreach");
            appCompatTextView.setVisibility(this.f28116c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ChangePassword() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.m
            @Override // iu.a
            public final Object a() {
                return ChangePassword.Uf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28032b = new MoxyKtxDelegate(mvpDelegate, ChangePasswordPresenter.class.getName() + ".presenter", aVar);
        this.f28034d = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.n
            @Override // iu.a
            public final Object a() {
                return ChangePassword.Vf(this.f29074a);
            }
        });
    }

    private final void Gf() {
        o4.z0.F0(If().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final void Hf() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.clearFlags(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.f0 If() {
        qg.f0 f0Var = this.f28031a;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChangePasswordPresenter Jf() {
        return (ChangePasswordPresenter) this.f28032b.getValue(this, f28029f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        If().f72395b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangePassword.Lf(this.f29064a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(ChangePassword changePassword, View view) {
        changePassword.Jf().N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        ProgressButton progressButton = If().f72399f;
        ju.t.e(progressButton, "continueButton");
        tp.o.b(progressButton, 0L, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.j
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangePassword.Nf(this.f29058a, (View) obj);
            }
        }, 1, null);
        If().f72402i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.server.auditor.ssh.client.navigation.k
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return ChangePassword.Of(this.f29060a, textView, i10, keyEvent);
            }
        });
        TextInputEditText textInputEditText = If().f72404k;
        ju.t.e(textInputEditText, "oldPasswordEditText");
        textInputEditText.addTextChangedListener(new e());
        TextInputEditText textInputEditText2 = If().f72402i;
        ju.t.e(textInputEditText2, "newPasswordEditText");
        textInputEditText2.addTextChangedListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Nf(ChangePassword changePassword, View view) {
        ju.t.f(view, "it");
        changePassword.Jf().O2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Of(ChangePassword changePassword, TextView textView, int i10, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if (((i10 & 6) == 0 && i10 != 0) || !changePassword.If().f72399f.isEnabled()) {
            return false;
        }
        textView.clearFocus();
        changePassword.If().f72399f.callOnClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf() {
        If().f72406m.f72431b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangePassword.Qf(this.f29331a, view);
            }
        });
        If().f72406m.f72433d.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangePassword.Rf(this.f29574a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qf(ChangePassword changePassword, View view) {
        changePassword.Jf().P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rf(ChangePassword changePassword, View view) {
        changePassword.Jf().Q2();
    }

    private final void Sf() {
        Window window;
        if (com.server.auditor.ssh.client.app.a.N().w0() && (window = requireActivity().getWindow()) != null) {
            window.setFlags(8192, 8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Tf(ChangePassword changePassword, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        if (changePassword.If().f72395b.f72288b.isEnabled()) {
            changePassword.Jf().N2();
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangePasswordPresenter Uf() {
        return new ChangePasswordPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Vf(ChangePassword changePassword) {
        Context contextRequireContext = changePassword.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setTitle(R.string.dialog_changing_password_title).setMessage(R.string.dialog_changing_password_message).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        xl.a.a(requireActivity(), requireActivity().getCurrentFocus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Cd(String str) {
        ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        bh.a.b(this, new p(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void E(boolean z10) {
        bh.a.b(this, new b0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void E1() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Hd(String str) {
        bh.a.b(this, new c0(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void J2(boolean z10) {
        bh.a.b(this, new g0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void K(boolean z10) {
        bh.a.b(this, new z(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void L() {
        bh.a.b(this, new w(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M1(String str, String str2) {
        ju.t.f(str, "encodedOldPasswordHex");
        ju.t.f(str2, "encodedNewPasswordHex");
        bh.a.b(this, new v(str, str2, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M9(boolean z10) {
        bh.a.b(this, new y(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Q(String str) {
        ju.t.f(str, "warning");
        bh.a.b(this, new l(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void S(boolean z10) {
        bh.a.b(this, new a0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void S1() {
        bh.a.b(this, new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void U() {
        bh.a.b(this, new r(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void V(int i10) {
        bh.a.b(this, new f0(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void a() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void c2(boolean z10) {
        bh.a.b(this, new d0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void d() {
        bh.a.b(this, new t(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void d0() {
        bh.a.b(this, new s(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void e() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void e1(boolean z10) {
        bh.a.b(this, new e0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void f0(boolean z10) {
        bh.a.b(this, new h0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void f1() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void g() {
        bh.a.b(this, new q(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void h() {
        bh.a.b(this, new x(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void j() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void k(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this, new o(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void m(int i10) {
        bh.a.b(this, new u(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void n() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.o
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangePassword.Tf(this.f29328a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f28033c = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28031a = qg.f0.c(layoutInflater, viewGroup, false);
        Gf();
        Sf();
        ConstraintLayout constraintLayoutB = If().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28031a = null;
        e();
        Hf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        androidx.activity.e0 e0Var = this.f28033c;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void u0(String str) {
        ju.t.f(str, "suggestion");
        bh.a.b(this, new j(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.g0
    public void z2(String str) {
        ju.t.f(str, "suggestion");
        bh.a.b(this, new k(str, null));
    }
}
