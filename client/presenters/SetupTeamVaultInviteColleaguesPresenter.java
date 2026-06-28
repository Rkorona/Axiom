package com.server.auditor.ssh.client.presenters;

import android.text.Editable;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.contracts.e2;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.interactors.e0;
import com.server.auditor.ssh.client.interactors.g0;
import com.server.auditor.ssh.client.interactors.y0;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.user.TrialResponse;
import com.server.auditor.ssh.client.widget.ProgressButton;
import hg.b2;
import hj.e;
import il.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jg.h;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.x0;
import yg.d;

/* JADX INFO: loaded from: classes4.dex */
public final class SetupTeamVaultInviteColleaguesPresenter extends MvpPresenter<e2> implements e.a, h.a {
    public static final a I = new a(null);
    public static final int J = 8;
    private final r0 A;
    private final y0 B;
    private final hj.e C;
    private final jg.h D;
    private final pl.b E;
    private final g0 F;
    private final e0 G;
    private final ut.n H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f35921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f35922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35923f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicInteger f35925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f35926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final SyncServiceHelper f35929z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35930a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -2116973418;
            }

            public String toString() {
                return "GenerateTeamEncryptionKeys";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$b, reason: collision with other inner class name */
        public static final class C0575b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0575b f35931a = new C0575b();

            private C0575b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0575b);
            }

            public int hashCode() {
                return -258642885;
            }

            public String toString() {
                return "MoveEntitiesToTeamVault";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f35932a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1716885111;
            }

            public String toString() {
                return "TeamCreation";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f35933a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1406191210;
            }

            public String toString() {
                return "TeamMemberInvitations";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35934a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35936c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35934a = obj;
            this.f35936c |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultInviteColleaguesPresenter.this.J2(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35939c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f35941e;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35939c = obj;
            this.f35941e |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultInviteColleaguesPresenter.this.N2(null, 0, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35942a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35942a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SetupTeamVaultInviteColleaguesPresenter.this.f35921d.get()) {
                return m0.f82633a;
            }
            SetupTeamVaultInviteColleaguesPresenter.this.X2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35944a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35944a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SetupTeamVaultInviteColleaguesPresenter.this.f35921d.get()) {
                return m0.f82633a;
            }
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35946a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35948c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list, zt.e eVar) {
            super(2, eVar);
            this.f35948c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new g(this.f35948c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35946a;
            if (i10 == 0) {
                x.b(obj);
                SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter = SetupTeamVaultInviteColleaguesPresenter.this;
                List list = this.f35948c;
                this.f35946a = 1;
                if (setupTeamVaultInviteColleaguesPresenter.T2(list, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35950b;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter;
            Object objF = au.b.f();
            int i10 = this.f35950b;
            if (i10 == 0) {
                x.b(obj);
                SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter2 = SetupTeamVaultInviteColleaguesPresenter.this;
                y0 y0Var = setupTeamVaultInviteColleaguesPresenter2.B;
                this.f35949a = setupTeamVaultInviteColleaguesPresenter2;
                this.f35950b = 1;
                Object objJ = y0Var.j(this);
                if (objJ == objF) {
                    return objF;
                }
                setupTeamVaultInviteColleaguesPresenter = setupTeamVaultInviteColleaguesPresenter2;
                obj = objJ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setupTeamVaultInviteColleaguesPresenter = (SetupTeamVaultInviteColleaguesPresenter) this.f35949a;
                x.b(obj);
            }
            setupTeamVaultInviteColleaguesPresenter.f35923f = ((Number) obj).intValue();
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().a();
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().c8(SetupTeamVaultInviteColleaguesPresenter.this.f35923f > 0);
            SetupTeamVaultInviteColleaguesPresenter.this.X2();
            SetupTeamVaultInviteColleaguesPresenter.this.f35927x.M4();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35952a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35952a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SetupTeamVaultInviteColleaguesPresenter.this.f35921d.get()) {
                return m0.f82633a;
            }
            SetupTeamVaultInviteColleaguesPresenter.this.a3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35954a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, zt.e eVar) {
            super(2, eVar);
            this.f35956c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new j(this.f35956c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35954a;
            if (i10 == 0) {
                x.b(obj);
                SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter = SetupTeamVaultInviteColleaguesPresenter.this;
                List list = this.f35956c;
                this.f35954a = 1;
                if (setupTeamVaultInviteColleaguesPresenter.T2(list, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35957a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamMemberInvitation f35959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Editable f35960d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(TeamMemberInvitation teamMemberInvitation, Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f35959c = teamMemberInvitation;
            this.f35960d = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new k(this.f35959c, this.f35960d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35957a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SetupTeamVaultInviteColleaguesPresenter.this.f35921d.get()) {
                return m0.f82633a;
            }
            this.f35959c.setEmail(String.valueOf(this.f35960d));
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().T(SetupTeamVaultInviteColleaguesPresenter.this.M2());
            boolean zB = t.b(v.B0(SetupTeamVaultInviteColleaguesPresenter.this.f35922e), this.f35959c);
            Editable editable = this.f35960d;
            if (editable != null && !s.m0(editable) && zB) {
                SetupTeamVaultInviteColleaguesPresenter.this.X2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35961a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35961a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SetupTeamVaultInviteColleaguesPresenter.this.b3(true);
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().C0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35963a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35963a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SetupTeamVaultInviteColleaguesPresenter.this.b3(true);
            SetupTeamVaultInviteColleaguesPresenter.this.getViewState().U0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35965a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35965a;
            if (i10 == 0) {
                x.b(obj);
                SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter = SetupTeamVaultInviteColleaguesPresenter.this;
                this.f35965a = 1;
                if (setupTeamVaultInviteColleaguesPresenter.J2(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35968b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35970d;

        o(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35968b = obj;
            this.f35970d |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultInviteColleaguesPresenter.this.Y2(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35971a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInviteColleaguesPresenter.this.new p(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r7.Z2(r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (r7.J2(r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        
            if (r7.Y2(r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r7.N2(r1, r3, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f35971a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L21
                if (r1 == r5) goto L1d
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                ut.x.b(r7)
                goto L80
            L21:
                ut.x.b(r7)
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.v2(r7)
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$c r1 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.c.f35932a
                boolean r1 = ju.t.b(r7, r1)
                if (r1 == 0) goto L3d
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                r6.f35971a = r5
                java.lang.Object r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.F2(r7, r6)
                if (r7 != r0) goto L80
                goto L7f
            L3d:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$a r1 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.a.f35930a
                boolean r1 = ju.t.b(r7, r1)
                if (r1 == 0) goto L50
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                r6.f35971a = r4
                java.lang.Object r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.r2(r7, r6)
                if (r7 != r0) goto L80
                goto L7f
            L50:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$d r1 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.d.f35933a
                boolean r1 = ju.t.b(r7, r1)
                if (r1 == 0) goto L63
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                r6.f35971a = r3
                java.lang.Object r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.E2(r7, r6)
                if (r7 != r0) goto L80
                goto L7f
            L63:
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$b r1 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.C0575b.f35931a
                boolean r7 = ju.t.b(r7, r1)
                if (r7 == 0) goto L83
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                java.util.List r1 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.y2(r7)
                com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter r3 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.this
                int r3 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.u2(r3)
                r6.f35971a = r2
                java.lang.Object r7 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.B2(r7, r1, r3, r6)
                if (r7 != r0) goto L80
            L7f:
                return r0
            L80:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            L83:
                ut.s r7 = new ut.s
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SetupTeamVaultInviteColleaguesPresenter(List list, boolean z10, String str) {
        t.f(list, "typedEntityToShareIdentifiers");
        t.f(str, "analyticsFunnelId");
        this.f35918a = list;
        this.f35919b = z10;
        this.f35920c = str;
        this.f35921d = new AtomicBoolean(false);
        this.f35922e = new ArrayList();
        this.f35925v = new AtomicInteger(0);
        this.f35926w = b.c.f35932a;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f35927x = aVarY;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f35928y = aVarN;
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        this.f35929z = syncServiceHelperY;
        t.e(syncServiceHelperY, "syncServiceHelper");
        this.A = new r0(syncServiceHelperY);
        wu.g0 g0VarB = x0.b();
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        PFRulesDBAdapter pFRulesDBAdapterZ = hg.f.p().z();
        t.e(pFRulesDBAdapterZ, "getPFRulesDBAdapter(...)");
        SnippetPackageDBAdapter snippetPackageDBAdapterO = hg.f.p().O();
        t.e(snippetPackageDBAdapterO, "getSnippetPackageDBAdapter(...)");
        SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
        t.e(snippetDBAdapterJ, "getSnippetDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        KnownHostsDBAdapter knownHostsDBAdapterR = hg.f.p().r();
        t.e(knownHostsDBAdapterR, "getKnownHostsDBAdapter(...)");
        this.B = new y0(g0VarB, groupDBAdapterH, hostsDBAdapterI, snippetDBAdapterJ, snippetPackageDBAdapterO, pFRulesDBAdapterZ, identityDBAdapterN, sshKeyDBAdapterW, knownHostsDBAdapterR);
        b2 b2Var = b2.f52944a;
        pl.p pVar = new pl.p(b2Var.O1(), b2Var.B1());
        wu.g0 g0VarB2 = x0.b();
        t.e(aVarN, "termiusStorage");
        t.e(aVarY, "avoAnalytics");
        this.C = new hj.e(pVar, new jl.e(g0VarB2, aVarN, aVarY, new wn.m(b2Var.y1())), this);
        this.D = new jg.h(new pl.g(b2Var.O1(), b2Var.B1()), this);
        this.E = new pl.b(b2Var.O1(), b2Var.B1(), new d.a(), null, null, 24, null);
        this.F = new g0(vl.g.f83702b.b(), new pp.i(null, 1, null));
        this.G = b2Var.E1();
        this.H = ut.o.a(new iu.a() { // from class: zk.d
            @Override // iu.a
            public final Object a() {
                return SetupTeamVaultInviteColleaguesPresenter.O2(this.f88019a);
            }
        });
    }

    private final List I2(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SyncableModel syncableModel = (SyncableModel) it.next();
            if (syncableModel instanceof HostDBModel) {
                arrayList.add(syncableModel);
            } else if (syncableModel instanceof GroupDBModel) {
                arrayList2.add(syncableModel);
            } else if (syncableModel instanceof SnippetDBModel) {
                arrayList3.add(syncableModel);
            } else if (syncableModel instanceof SnippetPackageDBModel) {
                arrayList4.add(syncableModel);
            } else if (syncableModel instanceof RuleDBModel) {
                arrayList5.add(syncableModel);
            } else if (syncableModel instanceof SshKeyDBModel) {
                arrayList6.add(syncableModel);
            } else if (syncableModel instanceof IdentityDBModel) {
                arrayList7.add(syncableModel);
            } else if (syncableModel instanceof KnownHostsDBModel) {
                arrayList8.add(syncableModel);
            }
        }
        return v.r(new SetupTeamVaultShareEntitiesSectionType.Hosts(arrayList), new SetupTeamVaultShareEntitiesSectionType.Groups(arrayList2), new SetupTeamVaultShareEntitiesSectionType.Snippets(arrayList3), new SetupTeamVaultShareEntitiesSectionType.SnippetPackages(arrayList4), new SetupTeamVaultShareEntitiesSectionType.PortForwardings(arrayList5), new SetupTeamVaultShareEntitiesSectionType.SshKeys(arrayList6), new SetupTeamVaultShareEntitiesSectionType.Identities(arrayList7), new SetupTeamVaultShareEntitiesSectionType.KnownHosts(arrayList8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (Y2(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.c
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$c r0 = (com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.c) r0
            int r1 = r0.f35936c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35936c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$c r0 = new com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35934a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f35936c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L5a
        L38:
            ut.x.b(r6)
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$a r6 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.a.f35930a
            r5.f35926w = r6
            r6 = 0
            r5.b3(r6)
            com.server.auditor.ssh.client.app.a r6 = r5.f35928y
            java.lang.Integer r6 = r6.q()
            if (r6 == 0) goto L70
            pl.b r2 = r5.E
            int r6 = r6.intValue()
            r0.f35936c = r4
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L5a
            goto L68
        L5a:
            pl.b$b r6 = (pl.b.AbstractC1082b) r6
            boolean r6 = r6 instanceof pl.b.AbstractC1082b.d
            if (r6 == 0) goto L6c
            r0.f35936c = r3
            java.lang.Object r6 = r5.Y2(r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        L6c:
            r5.S2()
            goto L73
        L70:
            r5.S2()
        L73:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.J2(zt.e):java.lang.Object");
    }

    private final String K2() {
        return this.f35919b ? "credentials_sharing" : "no_credentials_sharing";
    }

    private final iq.b L2() {
        return (iq.b) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M2() {
        List list = this.f35922e;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!s.m0(((TeamMemberInvitation) it.next()).getEmail())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(java.util.List r10, int r11, zt.e r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.N2(java.util.List, int, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b O2(SetupTeamVaultInviteColleaguesPresenter setupTeamVaultInviteColleaguesPresenter) {
        hg.d dVarM = setupTeamVaultInviteColleaguesPresenter.f35928y.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new wn.j(dVarM));
    }

    private final void R2(List list, int i10) {
        this.f35929z.startFullSync();
        getViewState().m4(I2(list), i10);
    }

    private final void S2() {
        b3(true);
        getViewState().C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T2(List list, zt.e eVar) {
        if (this.f35925v.decrementAndGet() <= 0) {
            this.f35924u = list.size();
            if (!this.f35918a.isEmpty()) {
                Object objN2 = N2(this.f35918a, this.f35924u, eVar);
                return objN2 == au.b.f() ? objN2 : m0.f82633a;
            }
            if (this.f35923f > 0) {
                this.f35929z.startFullSync();
                getViewState().ya(this.f35924u, v.o(), this.f35920c);
            } else {
                this.f35929z.startFullSync();
                getViewState().m4(v.o(), this.f35924u);
            }
        }
        return m0.f82633a;
    }

    private final void W2() {
        b3(true);
        getViewState().C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2() {
        TeamMemberInvitation teamMemberInvitation = new TeamMemberInvitation(null, null, 3, null);
        this.f35922e.add(teamMemberInvitation);
        getViewState().i0(teamMemberInvitation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (T2(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y2(zt.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.o
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$o r0 = (com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.o) r0
            int r1 = r0.f35970d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35970d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$o r0 = new com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35968b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f35970d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.f35967a
            java.util.Iterator r2 = (java.util.Iterator) r2
            ut.x.b(r8)
            goto L9a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            ut.x.b(r8)
            goto L89
        L3c:
            ut.x.b(r8)
            com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter$b$d r8 = com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.b.d.f35933a
            r7.f35926w = r8
            r8 = 0
            r7.b3(r8)
            java.util.List r8 = r7.f35922e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L52:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.server.auditor.ssh.client.models.teams.TeamMemberInvitation r6 = (com.server.auditor.ssh.client.models.teams.TeamMemberInvitation) r6
            java.lang.String r6 = r6.getEmail()
            boolean r6 = su.s.m0(r6)
            if (r6 != 0) goto L52
            r2.add(r5)
            goto L52
        L6d:
            com.server.auditor.ssh.client.utils.analytics.a r8 = r7.f35927x
            int r5 = r2.size()
            r8.d4(r5)
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L8c
            java.util.List r8 = vt.v.o()
            r0.f35970d = r4
            java.lang.Object r8 = r7.T2(r8, r0)
            if (r8 != r1) goto L89
            goto Lbe
        L89:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        L8c:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f35925v
            int r4 = r2.size()
            r8.set(r4)
            java.util.Iterator r8 = r2.iterator()
            r2 = r8
        L9a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto Lbf
            java.lang.Object r8 = r2.next()
            com.server.auditor.ssh.client.models.teams.TeamMemberInvitation r8 = (com.server.auditor.ssh.client.models.teams.TeamMemberInvitation) r8
            jg.h r4 = r7.D
            java.lang.String r5 = r8.getEmail()
            com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole r8 = r8.getRole()
            java.lang.String r8 = r8.toString()
            r0.f35967a = r2
            r0.f35970d = r3
            java.lang.Object r8 = r4.a(r5, r8, r0)
            if (r8 != r1) goto L9a
        Lbe:
            return r1
        Lbf:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SetupTeamVaultInviteColleaguesPresenter.Y2(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z2(zt.e eVar) {
        this.f35926w = b.c.f35932a;
        b3(false);
        if (this.f35928y.m()) {
            Object objY2 = Y2(eVar);
            return objY2 == au.b.f() ? objY2 : m0.f82633a;
        }
        Object objB = this.C.b("My Team", v.o(), eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3(boolean z10) {
        getViewState().A1(z10 ? ProgressButton.b.C0663b.f46550a : ProgressButton.b.c.f46551a);
        getViewState().r(z10);
        getViewState().B2(z10);
        getViewState().P1(z10);
        this.f35921d.set(!z10);
    }

    public final void P2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void Q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void U2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void V2(TeamMemberInvitation teamMemberInvitation, Editable editable) {
        t.f(teamMemberInvitation, "colleagueInvitation");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(teamMemberInvitation, editable, null), 3, null);
    }

    public final void a3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    @Override // jg.h.a
    public void onFailedInviteTeamMember(List list) {
        t.f(list, "list");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(list, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // jg.h.a
    public void onInvitingTeamMember(List list) {
        t.f(list, "list");
    }

    @Override // jg.h.a
    public void onSuccessInviteTeamMember(List list) {
        t.f(list, "list");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(list, null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationFailed() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationNetworkError() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationSuccess(TrialResponse trialResponse) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }
}
