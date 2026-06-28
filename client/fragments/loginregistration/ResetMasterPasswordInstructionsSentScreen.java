package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.fragments.loginregistration.ResetMasterPasswordInstructionsSentScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.o;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.presenters.account.ResetMasterPasswordInstructionsSentPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.s5;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMasterPasswordInstructionsSentScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25345d = {ju.n0.g(new ju.g0(ResetMasterPasswordInstructionsSentScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/ResetMasterPasswordInstructionsSentPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25346e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s5 f25347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25348b = new androidx.navigation.x(ju.n0.b(ResetMasterPasswordInstructionsSentScreenArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25349c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25350a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f25352c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen, View view) {
            resetMasterPasswordInstructionsSentScreen.xf().s2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen, View view) {
            resetMasterPasswordInstructionsSentScreen.xf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordInstructionsSentScreen.this.new a(this.f25352c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = ResetMasterPasswordInstructionsSentScreen.this.wf().f73833e;
            final ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen = ResetMasterPasswordInstructionsSentScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetMasterPasswordInstructionsSentScreen.a.l(resetMasterPasswordInstructionsSentScreen, view);
                }
            });
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = ResetMasterPasswordInstructionsSentScreen.this.wf().f73830b.f72288b;
            final ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen2 = ResetMasterPasswordInstructionsSentScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetMasterPasswordInstructionsSentScreen.a.m(resetMasterPasswordInstructionsSentScreen2, view);
                }
            });
            ResetMasterPasswordInstructionsSentScreen.this.wf().f73840l.setText(this.f25352c);
            TextView textView = ResetMasterPasswordInstructionsSentScreen.this.wf().f73840l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25353a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordInstructionsSentScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25353a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ResetMasterPasswordInstructionsSentScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ResetMasterPasswordInstructionsSentScreen f25357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EmailAuthentication emailAuthentication, ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen, zt.e eVar) {
            super(2, eVar);
            this.f25356b = emailAuthentication;
            this.f25357c = resetMasterPasswordInstructionsSentScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f25356b, this.f25357c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25355a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            o.a aVarA = o.a(this.f25356b);
            ju.t.e(aVarA, "actionResetMasterPasswor…dEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25357c).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25358a;

        public d(Fragment fragment) {
            this.f25358a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25358a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25358a + " has null arguments");
        }
    }

    public ResetMasterPasswordInstructionsSentScreen() {
        iu.a aVar = new iu.a() { // from class: th.x
            @Override // iu.a
            public final Object a() {
                return ResetMasterPasswordInstructionsSentScreen.yf(this.f79541a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25349c = new MoxyKtxDelegate(mvpDelegate, ResetMasterPasswordInstructionsSentPresenter.class.getName() + ".presenter", aVar);
    }

    private final void uf() {
        z0.F0(wf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final ResetMasterPasswordInstructionsSentScreenArgs vf() {
        return (ResetMasterPasswordInstructionsSentScreenArgs) this.f25348b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s5 wf() {
        s5 s5Var = this.f25347a;
        if (s5Var != null) {
            return s5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResetMasterPasswordInstructionsSentPresenter xf() {
        return (ResetMasterPasswordInstructionsSentPresenter) this.f25349c.getValue(this, f25345d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResetMasterPasswordInstructionsSentPresenter yf(ResetMasterPasswordInstructionsSentScreen resetMasterPasswordInstructionsSentScreen) {
        EmailAuthentication emailAuthentication = resetMasterPasswordInstructionsSentScreen.vf().getEmailAuthentication();
        ju.t.e(emailAuthentication, "getEmailAuthentication(...)");
        return new ResetMasterPasswordInstructionsSentPresenter(emailAuthentication);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void S3(EmailAuthentication emailAuthentication) {
        ju.t.f(emailAuthentication, "authentication");
        bh.a.b(this, new c(emailAuthentication, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void b() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25347a = s5.c(layoutInflater, viewGroup, false);
        uf();
        return wf().b();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25347a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void u(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new a(str, null));
    }
}
