package com.server.auditor.ssh.client.fragments;

import android.app.Application;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.f0;
import androidx.lifecycle.j1;
import androidx.lifecycle.k0;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.navigation.a2;
import com.server.auditor.ssh.client.navigation.n0;
import com.server.auditor.ssh.client.synchronization.retrofit.TeamMemberPublicKey;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import fj.b;
import fj.d;
import hg.b2;
import java.util.List;
import pl.d;
import ut.m0;
import wu.i0;
import yg.b;
import yg.d;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmAccessPopUpViewModel extends AndroidViewModel implements d.a, b.a, d.a {
    public static final int $stable = 8;
    private final k0 _uiState;
    private final il.c avatarsCacheRepository;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final fj.b confirmAccessToTeamMemberInteractor;
    private final pl.d encryptedEncryptionKeyInteractor;
    private final com.server.auditor.ssh.client.interactors.n getOrDownloadUserAvatarUseCase;
    private final com.server.auditor.ssh.client.interactors.o getUserAvatarColorUseCase;
    private final com.server.auditor.ssh.client.interactors.q getUserAvatarInitialsUseCase;
    private final a2 notificationsInteractor;
    private final fj.d requestTeamMemberPublicKeyInteractor;
    private ch.o teamMemberData;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final f0 uiState;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23863a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f23865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0 n0Var, zt.e eVar) {
            super(2, eVar);
            this.f23865c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmAccessPopUpViewModel.this.new a(this.f23865c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f23863a;
            if (i10 == 0) {
                ut.x.b(obj);
                ConfirmAccessPopUpViewModel confirmAccessPopUpViewModel = ConfirmAccessPopUpViewModel.this;
                n0 n0Var = this.f23865c;
                this.f23863a = 1;
                if (confirmAccessPopUpViewModel.prepareConfirmAccessData(n0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            com.server.auditor.ssh.client.utils.analytics.a aVar = ConfirmAccessPopUpViewModel.this.avoAnalytics;
            ch.o oVar = ConfirmAccessPopUpViewModel.this.teamMemberData;
            aVar.Q0(oVar != null ? oVar.i() : null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f23866a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
                this.f23866a = str;
            }

            public final String a() {
                return this.f23866a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f23866a, ((a) obj).f23866a);
            }

            public int hashCode() {
                return this.f23866a.hashCode();
            }

            public String toString() {
                return "ConfirmationError(errorMessage=" + this.f23866a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.ConfirmAccessPopUpViewModel$b$b, reason: collision with other inner class name */
        public static final class C0382b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0382b f23867a = new C0382b();

            private C0382b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0382b);
            }

            public int hashCode() {
                return 1500241914;
            }

            public String toString() {
                return "Confirmed";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f23868a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -737136665;
            }

            public String toString() {
                return "Confirming";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f23869a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
                this.f23869a = str;
            }

            public final String a() {
                return this.f23869a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && ju.t.b(this.f23869a, ((d) obj).f23869a);
            }

            public int hashCode() {
                return this.f23869a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f23869a + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f23870a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -724637545;
            }

            public String toString() {
                return "Loading";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ch.o f23871a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(ch.o oVar) {
                super(null);
                ju.t.f(oVar, "data");
                this.f23871a = oVar;
            }

            public final ch.o a() {
                return this.f23871a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && ju.t.b(this.f23871a, ((f) obj).f23871a);
            }

            public int hashCode() {
                return this.f23871a.hashCode();
            }

            public String toString() {
                return "Success(data=" + this.f23871a + ")";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23872a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmAccessPopUpViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f23872a;
            if (i10 == 0) {
                ut.x.b(obj);
                ch.o oVar = ConfirmAccessPopUpViewModel.this.teamMemberData;
                if (oVar != null) {
                    ConfirmAccessPopUpViewModel.this.avoAnalytics.N0(oVar.i());
                    ConfirmAccessPopUpViewModel.this._uiState.p(b.c.f23868a);
                    fj.d dVar = ConfirmAccessPopUpViewModel.this.requestTeamMemberPublicKeyInteractor;
                    int iH = oVar.h();
                    int iF = oVar.f();
                    this.f23872a = 1;
                    if (dVar.a(iH, iF, this) == objF) {
                        return objF;
                    }
                } else {
                    String string = ConfirmAccessPopUpViewModel.this.getApplication().getString(R.string.something_went_wrong_try_again_later);
                    ju.t.e(string, "getString(...)");
                    ConfirmAccessPopUpViewModel.this._uiState.p(new b.a(string));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f23878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11, String str, zt.e eVar) {
            super(2, eVar);
            this.f23876c = i10;
            this.f23877d = i11;
            this.f23878e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmAccessPopUpViewModel.this.new d(this.f23876c, this.f23877d, this.f23878e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f23874a;
            if (i10 == 0) {
                ut.x.b(obj);
                pl.d dVar = ConfirmAccessPopUpViewModel.this.encryptedEncryptionKeyInteractor;
                int i11 = this.f23876c;
                int i12 = this.f23877d;
                String str = this.f23878e;
                this.f23874a = 1;
                if (dVar.b(i11, i12, str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23879a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f23883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f23884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, int i11, String str, byte[] bArr, zt.e eVar) {
            super(2, eVar);
            this.f23881c = i10;
            this.f23882d = i11;
            this.f23883e = str;
            this.f23884f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmAccessPopUpViewModel.this.new e(this.f23881c, this.f23882d, this.f23883e, this.f23884f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f23879a;
            if (i10 == 0) {
                ut.x.b(obj);
                fj.b bVar = ConfirmAccessPopUpViewModel.this.confirmAccessToTeamMemberInteractor;
                int i11 = this.f23881c;
                int i12 = this.f23882d;
                String str = this.f23883e;
                byte[] bArr = this.f23884f;
                this.f23879a = 1;
                if (bVar.a(i11, i12, str, bArr, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23890f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f23891u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f23892v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f23894x;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23892v = obj;
            this.f23894x |= RtlSpacingHelper.UNDEFINED;
            return ConfirmAccessPopUpViewModel.this.prepareConfirmAccessData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAccessPopUpViewModel(Application application, n0 n0Var) {
        super(application);
        ju.t.f(application, "application");
        ju.t.f(n0Var, "inAppMessage");
        k0 k0Var = new k0(b.e.f23870a);
        this._uiState = k0Var;
        this.uiState = k0Var;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        il.c cVarR0 = b2Var.R0();
        this.avatarsCacheRepository = cVarR0;
        rl.b bVar = new rl.b(b2Var.P1(), b2Var.B1());
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.getOrDownloadUserAvatarUseCase = new com.server.auditor.ssh.client.interactors.n(cVarR0, bVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM));
        this.notificationsInteractor = b2Var.D1();
        this.requestTeamMemberPublicKeyInteractor = new fj.d(new pl.l(b2Var.O1(), b2Var.B1()), this);
        pl.a aVar = new pl.a(b2Var.O1(), b2Var.B1(), new b.a());
        ju.t.e(aVarN, "termiusStorage");
        this.confirmAccessToTeamMemberInteractor = new fj.b(aVar, aVarN, this);
        pl.e eVar = new pl.e(b2Var.O1(), b2Var.B1());
        ju.t.e(aVarN, "termiusStorage");
        this.encryptedEncryptionKeyInteractor = new pl.d(eVar, aVarN, new d.a(), this);
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.getUserAvatarColorUseCase = new com.server.auditor.ssh.client.interactors.o();
        this.getUserAvatarInitialsUseCase = new com.server.auditor.ssh.client.interactors.q();
        wu.k.d(j1.a(this), null, null, new a(n0Var, null), 3, null);
    }

    private final void postTeamMemberDataToUI(ch.o oVar) {
        this.teamMemberData = oVar;
        this._uiState.n(new b.f(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareConfirmAccessData(com.server.auditor.ssh.client.navigation.n0 r18, zt.e<? super ut.m0> r19) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.ConfirmAccessPopUpViewModel.prepareConfirmAccessData(com.server.auditor.ssh.client.navigation.n0, zt.e):java.lang.Object");
    }

    public final void confirmAccessToTeamMember() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final f0 getUiState() {
        return this.uiState;
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeyFailed(int i10) {
        onTeamMemberConfirmingAccessFailed(i10);
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeyNetworkError(int i10) {
        String string = getApplication().getString(R.string.toast_internet_available);
        ju.t.e(string, "getString(...)");
        this._uiState.p(new b.a(string));
    }

    @Override // fj.d.a
    public void onRequestTeamMemberPublicKeySuccess(int i10, List<TeamMemberPublicKey> list, int i11) {
        ju.t.f(list, "teamMembersPublicKeysCollection");
        if (list.isEmpty()) {
            onTeamMemberConfirmingAccessSuccess(i11);
            return;
        }
        TeamMemberPublicKey teamMemberPublicKey = list.get(0);
        String publicKey = teamMemberPublicKey.getPublicKey();
        if (publicKey == null || publicKey.length() == 0) {
            onTeamMemberConfirmingAccessFailed(i11);
        } else if (teamMemberPublicKey.getHasTeamKey()) {
            onTeamMemberConfirmingAccessSuccess(i11);
        } else {
            wu.k.d(j1.a(this), null, null, new d(i11, i10, publicKey, null), 3, null);
        }
    }

    @Override // pl.d.a
    public void onTeamKeyIncorrect(int i10) {
        String string = getApplication().getString(R.string.failed_granting_access_to_team_data);
        ju.t.e(string, "getString(...)");
        this._uiState.p(new b.a(string));
    }

    @Override // pl.d.a
    public void onTeamKeyReady(byte[] bArr, int i10, int i11, String str) {
        ju.t.f(bArr, "teamKeyAsByteArray");
        ju.t.f(str, Column.KEY_PUBLIC);
        wu.k.d(j1.a(this), null, null, new e(i10, i11, str, bArr, null), 3, null);
    }

    @Override // fj.b.a
    public void onTeamMemberConfirmingAccessFailed(int i10) {
        String string = getApplication().getString(R.string.failed_granting_access_to_team_data);
        ju.t.e(string, "getString(...)");
        this._uiState.p(new b.a(string));
    }

    @Override // fj.b.a
    public void onTeamMemberConfirmingAccessSuccess(int i10) {
        this._uiState.p(b.C0382b.f23867a);
        this.notificationsInteractor.l(i10);
        this.notificationsInteractor.v(true);
    }

    public final void sendNotificationSnoozedEvent() {
        com.server.auditor.ssh.client.utils.analytics.a aVar = this.avoAnalytics;
        ch.o oVar = this.teamMemberData;
        aVar.P0(oVar != null ? oVar.i() : null);
    }
}
