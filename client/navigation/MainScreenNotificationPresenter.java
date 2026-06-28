package com.server.auditor.ssh.client.navigation;

/* JADX INFO: loaded from: classes3.dex */
public final class MainScreenNotificationPresenter extends androidx.lifecycle.i1 {
    public static final int $stable = 8;
    private final og.d authorizedFeaturesRepository;
    private final a2 notificationsInteractor;

    public MainScreenNotificationPresenter() {
        hg.b2 b2Var = hg.b2.f52944a;
        this.notificationsInteractor = b2Var.D1();
        this.authorizedFeaturesRepository = b2Var.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onToggleCreated$lambda$0(MainScreenNotificationPresenter mainScreenNotificationPresenter, m0 m0Var) {
        return !mainScreenNotificationPresenter.authorizedFeaturesRepository.b() ? "" : m0Var.a();
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        this.notificationsInteractor.j();
        super.onCleared();
    }

    public final androidx.lifecycle.f0 onToggleCreated() {
        androidx.lifecycle.f0 f0VarN = this.notificationsInteractor.n();
        this.notificationsInteractor.m();
        return androidx.lifecycle.h1.e(f0VarN, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.a1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return MainScreenNotificationPresenter.onToggleCreated$lambda$0(this.f28675a, (m0) obj);
            }
        });
    }
}
