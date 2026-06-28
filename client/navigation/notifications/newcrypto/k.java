package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.text.Editable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public interface a extends j {
        void c();
    }

    public interface b extends j {
        void g();

        void h();
    }

    public interface c extends j {
        void A5();

        void I5();

        void N2();

        void Ub(List list);

        void Ve();

        void c();

        void j4(List list);
    }

    public interface d extends j {
        void U4();

        void c();

        void n7();

        void s4();
    }

    public interface e extends j {
        void c();
    }

    public interface f extends b {
        void E(boolean z10);

        void E9(boolean z10);

        void G3();

        void O0(String str);

        void O9(String str);

        void Wd(boolean z10);

        void Xb(boolean z10);

        void c();

        void g9();

        void m2(Integer num);

        void r(boolean z10);
    }

    public interface g extends b {
        void Aa();

        void E(boolean z10);

        void Eb();

        void G(String str);

        void H4();

        void J2(boolean z10);

        void K(boolean z10);

        void L();

        void O0(String str);

        void Q(String str);

        void R5(String str);

        void S(boolean z10);

        void U();

        void U8(int i10);

        void V(int i10);

        void Yb(String str);

        void aa(String str);

        void bd(int i10);

        void c();

        void c2(boolean z10);

        void d0();

        void d5();

        void e1(boolean z10);

        void f0(boolean z10);

        void g8(boolean z10);

        void gc();

        void l4(boolean z10);

        void m2(Integer num);

        void n5();

        void r(boolean z10);

        void rd();

        void s3();

        void u0(String str);

        void v8();

        void z2(String str);
    }

    public interface h extends j {
        void c();
    }

    public interface i extends j {
        void Pa();

        void f1();

        void f6(j jVar);

        void n();

        void p4();
    }

    public interface j {
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.k$k, reason: collision with other inner class name */
    public interface InterfaceC0457k extends j {
        void c();
    }

    public interface l extends j {
        void c();
    }

    void onAlreadyMigratedViewCreated(a aVar);

    void onBack();

    void onBeforeProceedViewCreated(c cVar);

    void onCheckPasswordBreachButtonClicked();

    void onCheckingSetupViewCreated(d dVar);

    void onCloseErrorScreen();

    void onCodeCheck(String str);

    void onCodeEdit(String str);

    void onContinueBeforeProceed();

    void onContinueWithNewPassword();

    void onContinueWithPassword();

    void onDoItLaterClick();

    void onDoneClick();

    void onDoneViewCreated(e eVar);

    void onEnableNewEncryptionClick();

    void onEnterPasswordBack();

    void onEnterPasswordViewCreated(f fVar);

    void onEnterPasswordViewDestroyed();

    void onForgotPasswordBack();

    void onForgotPasswordClick();

    void onForgotPasswordViewCreated(g gVar);

    void onForgotPasswordViewDestroyed();

    void onHowDoWeKnowButtonClicked();

    void onLandingViewCreated(h hVar);

    void onLandingViewDestroyed();

    void onMainViewCreate(i iVar, int i10);

    void onNewEncryptionLinkClick();

    void onOfflineErrorViewCreated(InterfaceC0457k interfaceC0457k);

    void onOopsErrorViewCreated(l lVar);

    void onPasswordChanged(Editable editable);

    void onResendCodeClick();
}
