package com.server.auditor.ssh.client.navigation;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.navigation.z1;
import com.server.auditor.ssh.client.synchronization.retrofit.TeamMemberPublicKey;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import com.server.auditor.ssh.client.widget.ProgressButton;
import fj.b;
import fj.d;
import java.util.List;
import pl.d;
import yg.b;
import yg.d;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsFragmentViewModel extends androidx.lifecycle.i1 implements z1, b.a, d.a, d.a {
    private static final long delayBeforeDeletingNotification = 700;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final il.d bellNotificationsWrapper;
    private final fj.b confirmAccessToTeamMemberInteractor;
    private final pl.d encryptedEncryptionKeyInteractor;
    private final com.server.auditor.ssh.client.interactors.y forceActionInteractor;
    private final il.z newCryptoAnalyticsRepository;
    private z1.a notificationsView;
    private final fj.d requestTeamMemberPublicKeyInteractor;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28309a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28312d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, zt.e eVar) {
            super(2, eVar);
            this.f28311c = i10;
            this.f28312d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NotificationsFragmentViewModel.this.new b(this.f28311c, this.f28312d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28309a;
            if (i10 == 0) {
                ut.x.b(obj);
                fj.d dVar = NotificationsFragmentViewModel.this.requestTeamMemberPublicKeyInteractor;
                int i11 = this.f28311c;
                int i12 = this.f28312d;
                this.f28309a = 1;
                if (dVar.a(i11, i12, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28313a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28317e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, String str, zt.e eVar) {
            super(2, eVar);
            this.f28315c = i10;
            this.f28316d = i11;
            this.f28317e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NotificationsFragmentViewModel.this.new c(this.f28315c, this.f28316d, this.f28317e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28313a;
            if (i10 == 0) {
                ut.x.b(obj);
                pl.d dVar = NotificationsFragmentViewModel.this.encryptedEncryptionKeyInteractor;
                int i11 = this.f28315c;
                int i12 = this.f28316d;
                String str = this.f28317e;
                this.f28313a = 1;
                if (dVar.b(i11, i12, str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28318a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f28323f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11, String str, byte[] bArr, zt.e eVar) {
            super(2, eVar);
            this.f28320c = i10;
            this.f28321d = i11;
            this.f28322e = str;
            this.f28323f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NotificationsFragmentViewModel.this.new d(this.f28320c, this.f28321d, this.f28322e, this.f28323f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28318a;
            if (i10 == 0) {
                ut.x.b(obj);
                fj.b bVar = NotificationsFragmentViewModel.this.confirmAccessToTeamMemberInteractor;
                int i11 = this.f28320c;
                int i12 = this.f28321d;
                String str = this.f28322e;
                byte[] bArr = this.f28323f;
                this.f28318a = 1;
                if (bVar.a(i11, i12, str, bArr, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, zt.e eVar) {
            super(2, eVar);
            this.f28326c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NotificationsFragmentViewModel.this.new e(this.f28326c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28324a;
            if (i10 == 0) {
                ut.x.b(obj);
                this.f28324a = 1;
                if (wu.s0.b(NotificationsFragmentViewModel.delayBeforeDeletingNotification, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            NotificationsFragmentViewModel.this.bellNotificationsWrapper.d(this.f28326c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public NotificationsFragmentViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        this.newCryptoAnalyticsRepository = new il.z(aVarY);
        hg.b2 b2Var = hg.b2.f52944a;
        a2 a2VarD1 = b2Var.D1();
        com.server.auditor.ssh.client.interactors.o oVar = new com.server.auditor.ssh.client.interactors.o();
        com.server.auditor.ssh.client.interactors.q qVar = new com.server.auditor.ssh.client.interactors.q();
        il.c cVarR0 = b2Var.R0();
        rl.b bVar = new rl.b(b2Var.P1(), b2Var.B1());
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.bellNotificationsWrapper = new il.d(a2VarD1, oVar, qVar, new com.server.auditor.ssh.client.interactors.n(cVarR0, bVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM)), androidx.lifecycle.j1.a(this));
        this.forceActionInteractor = b2Var.o1();
        this.requestTeamMemberPublicKeyInteractor = new fj.d(new pl.l(b2Var.O1(), b2Var.B1()), this);
        pl.a aVar = new pl.a(b2Var.O1(), b2Var.B1(), new b.a());
        com.server.auditor.ssh.client.app.a aVarN2 = com.server.auditor.ssh.client.app.a.N();
        ju.t.e(aVarN2, "getInstance(...)");
        this.confirmAccessToTeamMemberInteractor = new fj.b(aVar, aVarN2, this);
        pl.e eVar = new pl.e(b2Var.O1(), b2Var.B1());
        com.server.auditor.ssh.client.app.a aVarN3 = com.server.auditor.ssh.client.app.a.N();
        ju.t.e(aVarN3, "getInstance(...)");
        this.encryptedEncryptionKeyInteractor = new pl.d(eVar, aVarN3, new d.a(), this);
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    private final void confirmAccessToTeamMember(com.server.auditor.ssh.client.adapters.m mVar) {
        int iC = mVar.c();
        int iN = mVar.n();
        this.avoAnalytics.M0(mVar.b());
        z1.a aVar = this.notificationsView;
        if (aVar == null) {
            ju.t.t("notificationsView");
            aVar = null;
        }
        aVar.kb(iC);
        z1.a aVar2 = this.notificationsView;
        if (aVar2 == null) {
            ju.t.t("notificationsView");
            aVar2 = null;
        }
        aVar2.sb(iC, ProgressButton.b.c.f46551a);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new b(iN, iC, null), 3, null);
    }

    private final void forceToRefreshNotifications() {
        this.bellNotificationsWrapper.g();
    }

    private final void removeNotificationById(int i10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new e(i10, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.navigation.z1
    public zu.k0 getNotifications() {
        return this.bellNotificationsWrapper.e();
    }

    @Override // com.server.auditor.ssh.client.navigation.z1
    public void onActionButtonClicked(com.server.auditor.ssh.client.adapters.h hVar, Integer num) {
        ju.t.f(hVar, "notification");
        String strG = hVar.g();
        z1.a aVar = null;
        if (!ju.t.b(strG, "termius-message://migrate-to-new-crypto")) {
            if (ju.t.b(strG, "termius-message://kex")) {
                com.server.auditor.ssh.client.adapters.m mVar = hVar instanceof com.server.auditor.ssh.client.adapters.m ? (com.server.auditor.ssh.client.adapters.m) hVar : null;
                if (mVar == null) {
                    return;
                }
                confirmAccessToTeamMember(mVar);
                return;
            }
            return;
        }
        this.forceActionInteractor.b(hVar.c());
        this.newCryptoAnalyticsRepository.g();
        z1.a aVar2 = this.notificationsView;
        if (aVar2 == null) {
            ju.t.t("notificationsView");
        } else {
            aVar = aVar2;
        }
        aVar.Qc(hVar.c());
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeyFailed(int i10) {
        onTeamMemberConfirmingAccessFailed(i10);
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeyNetworkError(int i10) {
        z1.a aVar = this.notificationsView;
        z1.a aVar2 = null;
        if (aVar == null) {
            ju.t.t("notificationsView");
            aVar = null;
        }
        aVar.sb(i10, ProgressButton.b.C0663b.f46550a);
        z1.a aVar3 = this.notificationsView;
        if (aVar3 == null) {
            ju.t.t("notificationsView");
        } else {
            aVar2 = aVar3;
        }
        aVar2.n0();
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeySuccess(int i10, List<TeamMemberPublicKey> list, int i11) {
        ju.t.f(list, "teamMembersPublicKeysCollection");
        if (list.isEmpty()) {
            z1.a aVar = this.notificationsView;
            if (aVar == null) {
                ju.t.t("notificationsView");
                aVar = null;
            }
            aVar.sb(i11, ProgressButton.b.C0663b.f46550a);
            removeNotificationById(i11);
            return;
        }
        TeamMemberPublicKey teamMemberPublicKey = list.get(0);
        String publicKey = teamMemberPublicKey.getPublicKey();
        if (publicKey == null || publicKey.length() == 0) {
            onTeamMemberConfirmingAccessFailed(i11);
        } else if (teamMemberPublicKey.getHasTeamKey()) {
            onTeamMemberConfirmingAccessSuccess(i11);
        } else {
            wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c(i11, i10, publicKey, null), 3, null);
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.z1
    public void onResume() {
        forceToRefreshNotifications();
    }

    @Override // com.server.auditor.ssh.client.navigation.z1
    public void onSwipeToRefreshGesture() {
        forceToRefreshNotifications();
    }

    @Override // pl.d.a
    public void onTeamKeyIncorrect(int i10) {
        z1.a aVar = this.notificationsView;
        z1.a aVar2 = null;
        if (aVar == null) {
            ju.t.t("notificationsView");
            aVar = null;
        }
        aVar.sb(i10, ProgressButton.b.C0663b.f46550a);
        z1.a aVar3 = this.notificationsView;
        if (aVar3 == null) {
            ju.t.t("notificationsView");
        } else {
            aVar2 = aVar3;
        }
        aVar2.lc(i10);
    }

    @Override // pl.d.a
    public void onTeamKeyReady(byte[] bArr, int i10, int i11, String str) {
        ju.t.f(bArr, "teamKeyAsByteArray");
        ju.t.f(str, Column.KEY_PUBLIC);
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(i10, i11, str, bArr, null), 3, null);
    }

    @Override // fj.b.a
    public void onTeamMemberConfirmingAccessFailed(int i10) {
        z1.a aVar = this.notificationsView;
        z1.a aVar2 = null;
        if (aVar == null) {
            ju.t.t("notificationsView");
            aVar = null;
        }
        aVar.sb(i10, ProgressButton.b.C0663b.f46550a);
        z1.a aVar3 = this.notificationsView;
        if (aVar3 == null) {
            ju.t.t("notificationsView");
        } else {
            aVar2 = aVar3;
        }
        aVar2.lc(i10);
    }

    @Override // fj.b.a
    public void onTeamMemberConfirmingAccessSuccess(int i10) {
        z1.a aVar = this.notificationsView;
        if (aVar == null) {
            ju.t.t("notificationsView");
            aVar = null;
        }
        aVar.sb(i10, ProgressButton.b.a.f46549a);
        removeNotificationById(i10);
    }

    @Override // com.server.auditor.ssh.client.navigation.z1
    public void onViewCreated(z1.a aVar) {
        ju.t.f(aVar, "view");
        this.notificationsView = aVar;
        aVar.c();
        this.avoAnalytics.p3();
    }
}
