package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.a2;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import tp.c0;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SetupTeamVaultCredentialsModePresenter extends MvpPresenter<a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f35894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f35897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35898f;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.SetupTeamVaultCredentialsModePresenter$a$a, reason: collision with other inner class name */
        public static final class C0573a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0573a f35899a = new C0573a();

            private C0573a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0573a);
            }

            public int hashCode() {
                return -1023027492;
            }

            public String toString() {
                return "PersonalCredentials";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f35900a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2112489367;
            }

            public String toString() {
                return "SharedCredentials";
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35901a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 610224153;
            }

            public String toString() {
                return "PreselectedEntitiesFlow";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.SetupTeamVaultCredentialsModePresenter$b$b, reason: collision with other inner class name */
        public static final class C0574b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0574b f35902a = new C0574b();

            private C0574b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0574b);
            }

            public int hashCode() {
                return 1676406657;
            }

            public String toString() {
                return "SelectEntitiesToShareFlow";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f35903a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1378824422;
            }

            public String toString() {
                return "TeamPresenceFlow";
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35904a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35904a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SetupTeamVaultCredentialsModePresenter.this.getViewState().oc(SetupTeamVaultCredentialsModePresenter.this.f35893a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35906a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!SetupTeamVaultCredentialsModePresenter.this.f35894b.isEmpty()) {
                SetupTeamVaultCredentialsModePresenter.this.getViewState().b();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35908a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModePresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            au.b.f();
            if (this.f35908a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            a aVar = SetupTeamVaultCredentialsModePresenter.this.f35897e;
            if (t.b(aVar, a.b.f35900a)) {
                SetupTeamVaultCredentialsModePresenter.this.f35898f.Z4(Avo.CredentialsSharingMode.CREDENTIALS, SetupTeamVaultCredentialsModePresenter.this.f35896d);
                z10 = true;
            } else {
                if (!t.b(aVar, a.C0573a.f35899a) && aVar != null) {
                    throw new s();
                }
                SetupTeamVaultCredentialsModePresenter.this.f35898f.Z4(Avo.CredentialsSharingMode.NO_CREDENTIALS, SetupTeamVaultCredentialsModePresenter.this.f35896d);
                z10 = false;
            }
            boolean zBooleanValue = ((Boolean) c0.g(kotlin.coroutines.jvm.internal.b.a(z10))).booleanValue();
            if (SetupTeamVaultCredentialsModePresenter.this.f35894b.isEmpty()) {
                SetupTeamVaultCredentialsModePresenter.this.getViewState().xa(SetupTeamVaultCredentialsModePresenter.this.f35893a, zBooleanValue, SetupTeamVaultCredentialsModePresenter.this.f35895c);
            } else {
                SetupTeamVaultCredentialsModePresenter.this.getViewState().c7(SetupTeamVaultCredentialsModePresenter.this.f35894b, zBooleanValue, SetupTeamVaultCredentialsModePresenter.this.f35896d);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35910a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModePresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35910a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SetupTeamVaultCredentialsModePresenter.this.f35897e = a.C0573a.f35899a;
            SetupTeamVaultCredentialsModePresenter.this.getViewState().o3(SetupTeamVaultCredentialsModePresenter.this.A2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35912a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35912a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SetupTeamVaultCredentialsModePresenter.this.f35897e = a.b.f35900a;
            SetupTeamVaultCredentialsModePresenter.this.getViewState().o3(SetupTeamVaultCredentialsModePresenter.this.A2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SetupTeamVaultCredentialsModePresenter(int i10, List list, String str, String str2) {
        t.f(list, "typedEntityToShareIdentifiers");
        t.f(str2, "analyticsFunnelId");
        this.f35893a = i10;
        this.f35894b = list;
        this.f35895c = str;
        this.f35896d = str2;
        this.f35898f = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A2() {
        return this.f35897e != null;
    }

    private final void y2() {
        b bVar = t.b(this.f35895c, "TEAM_PRESENCE_SETUP_TEAM_VAULT_PROMOTION_CALLER_FEATURE") ? b.c.f35903a : this.f35894b.isEmpty() ? b.C0574b.f35902a : b.a.f35901a;
        getViewState().q7(bVar);
        getViewState().l0(t.b(bVar, b.C0574b.f35902a) || t.b(bVar, b.c.f35903a));
        getViewState().Y6(t.b(bVar, b.a.f35901a));
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void E2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        y2();
        this.f35898f.K4();
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}
