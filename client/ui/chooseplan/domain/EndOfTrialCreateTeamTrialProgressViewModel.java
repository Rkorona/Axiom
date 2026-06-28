package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.synchronization.api.models.user.TrialResponse;
import hg.b2;
import hj.e;
import iu.p;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jg.h;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import tp.d1;
import ut.m0;
import ut.x;
import vt.v;
import wu.g0;
import wu.i0;
import wu.x0;
import yg.d;
import zn.a;

/* JADX INFO: loaded from: classes4.dex */
public final class EndOfTrialCreateTeamTrialProgressViewModel extends i1 implements e.a, h.a {
    private static final int DEFAULT_TEAM_TRIAL_DAYS_GRANTED = 14;
    private final yu.d _screenActionFlow;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final pl.b createEncryptionKeyRepository;
    private Calendar grantedUntilCalendar;
    private final AtomicInteger invitationsLeft;
    private final jg.h inviteTeamMembersInteractor;
    private final boolean isNeedCreateTeam;
    private final boolean isNeedShowSuccessScreen;
    private c lastStep;
    private final zu.f screenActionFlow;
    private final List<TeamMemberInvitation> teamMemberInvites;
    private final String teamName;
    private final hj.e teamTrialCreateInteractor;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39667a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new a(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.proceedToTeamCreation(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5.proceedToInviteTeamMembers(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r4.f39667a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                ut.x.b(r5)
                goto L3c
            L1b:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                boolean r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$isNeedCreateTeam$p(r5)
                if (r5 == 0) goto L31
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                r4.f39667a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$proceedToTeamCreation(r5, r4)
                if (r5 != r0) goto L3c
                goto L3b
            L31:
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                r4.f39667a = r2
                java.lang.Object r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$proceedToInviteTeamMembers(r5, r4)
                if (r5 != r0) goto L3c
            L3b:
                return r0
            L3c:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    private static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39669a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -67362324;
            }

            public String toString() {
                return "GenerateTeamEncryptionKeys";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f39670a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1777036639;
            }

            public String toString() {
                return "TeamCreation";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$c, reason: collision with other inner class name */
        public static final class C0611c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0611c f39671a = new C0611c();

            private C0611c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0611c);
            }

            public int hashCode() {
                return -1496963456;
            }

            public String toString() {
                return "TeamMemberInvitations";
            }
        }

        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39672a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39674c;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39672a = obj;
            this.f39674c |= RtlSpacingHelper.UNDEFINED;
            return EndOfTrialCreateTeamTrialProgressViewModel.this.generateTeamEncryptionKeys(this);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39675a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39675a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39676a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39676a;
            if (i10 == 0) {
                x.b(obj);
                EndOfTrialCreateTeamTrialProgressViewModel endOfTrialCreateTeamTrialProgressViewModel = EndOfTrialCreateTeamTrialProgressViewModel.this;
                this.f39676a = 1;
                if (endOfTrialCreateTeamTrialProgressViewModel.onInvitationResultReceived(this) == objF) {
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39678a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new g(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r6.proceedToTeamCreation(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r6.generateTeamEncryptionKeys(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r6.proceedToInviteTeamMembers(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f39678a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                ut.x.b(r6)
                goto L60
            L1e:
                ut.x.b(r6)
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$getLastStep$p(r6)
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$b r1 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.c.b.f39670a
                boolean r1 = ju.t.b(r6, r1)
                if (r1 == 0) goto L3a
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                r5.f39678a = r4
                java.lang.Object r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$proceedToTeamCreation(r6, r5)
                if (r6 != r0) goto L60
                goto L5f
            L3a:
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$a r1 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.c.a.f39669a
                boolean r1 = ju.t.b(r6, r1)
                if (r1 == 0) goto L4d
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                r5.f39678a = r3
                java.lang.Object r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$generateTeamEncryptionKeys(r6, r5)
                if (r6 != r0) goto L60
                goto L5f
            L4d:
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$c r1 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.c.C0611c.f39671a
                boolean r6 = ju.t.b(r6, r1)
                if (r6 == 0) goto L63
                com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.this
                r5.f39678a = r2
                java.lang.Object r6 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.access$proceedToInviteTeamMembers(r6, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            L63:
                ut.s r6 = new ut.s
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39680a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39680a;
            if (i10 == 0) {
                x.b(obj);
                EndOfTrialCreateTeamTrialProgressViewModel endOfTrialCreateTeamTrialProgressViewModel = EndOfTrialCreateTeamTrialProgressViewModel.this;
                this.f39680a = 1;
                if (endOfTrialCreateTeamTrialProgressViewModel.onInvitationResultReceived(this) == objF) {
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
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39682a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39682a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = EndOfTrialCreateTeamTrialProgressViewModel.this._screenActionFlow;
                a.b bVar = a.b.f88041a;
                this.f39682a = 1;
                if (dVar.b(bVar, this) == objF) {
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
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39684a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EndOfTrialCreateTeamTrialProgressViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39684a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = EndOfTrialCreateTeamTrialProgressViewModel.this._screenActionFlow;
                a.b bVar = a.b.f88041a;
                this.f39684a = 1;
                if (dVar.b(bVar, this) == objF) {
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

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TrialResponse f39687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTrialCreateTeamTrialProgressViewModel f39688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(TrialResponse trialResponse, EndOfTrialCreateTeamTrialProgressViewModel endOfTrialCreateTeamTrialProgressViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39687b = trialResponse;
            this.f39688c = endOfTrialCreateTeamTrialProgressViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f39687b, this.f39688c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39686a;
            if (i10 == 0) {
                x.b(obj);
                TrialResponse trialResponse = this.f39687b;
                if (trialResponse != null) {
                    EndOfTrialCreateTeamTrialProgressViewModel endOfTrialCreateTeamTrialProgressViewModel = this.f39688c;
                    Date dateE = d1.e(trialResponse.getValidUntil());
                    if (dateE != null) {
                        endOfTrialCreateTeamTrialProgressViewModel.grantedUntilCalendar.setTime(dateE);
                    }
                }
                EndOfTrialCreateTeamTrialProgressViewModel endOfTrialCreateTeamTrialProgressViewModel2 = this.f39688c;
                this.f39686a = 1;
                if (endOfTrialCreateTeamTrialProgressViewModel2.generateTeamEncryptionKeys(this) == objF) {
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
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39690b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39692d;

        l(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39690b = obj;
            this.f39692d |= RtlSpacingHelper.UNDEFINED;
            return EndOfTrialCreateTeamTrialProgressViewModel.this.proceedToInviteTeamMembers(this);
        }
    }

    public EndOfTrialCreateTeamTrialProgressViewModel(String str, List<TeamMemberInvitation> list, boolean z10, boolean z11) {
        t.f(str, "teamName");
        t.f(list, "teamMemberInvites");
        this.teamName = str;
        this.teamMemberInvites = list;
        this.isNeedCreateTeam = z10;
        this.isNeedShowSuccessScreen = z11;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        Calendar calendar = Calendar.getInstance();
        calendar.add(7, 14);
        this.grantedUntilCalendar = calendar;
        this.invitationsLeft = new AtomicInteger(list.size());
        this.lastStep = c.b.f39670a;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.avoAnalytics = aVarY;
        b2 b2Var = b2.f52944a;
        pl.p pVar = new pl.p(b2Var.O1(), b2Var.B1());
        g0 g0VarB = x0.b();
        t.e(aVarN, "termiusStorage");
        t.e(aVarY, "avoAnalytics");
        this.teamTrialCreateInteractor = new hj.e(pVar, new jl.e(g0VarB, aVarN, aVarY, new wn.m(b2Var.y1())), this);
        this.inviteTeamMembersInteractor = new jg.h(new pl.g(b2Var.O1(), b2Var.B1()), this);
        this.createEncryptionKeyRepository = new pl.b(b2Var.O1(), b2Var.B1(), new d.a(), null, null, 24, null);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (proceedToInviteTeamMembers(r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r8.b(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r8.b(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateTeamEncryptionKeys(zt.e<? super ut.m0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.d
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$d r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.d) r0
            int r1 = r0.f39674c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39674c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$d r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39672a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39674c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            ut.x.b(r8)
            goto L93
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            ut.x.b(r8)
            goto L83
        L3e:
            ut.x.b(r8)
            goto L73
        L42:
            ut.x.b(r8)
            goto L64
        L46:
            ut.x.b(r8)
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$a r8 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.c.a.f39669a
            r7.lastStep = r8
            com.server.auditor.ssh.client.app.a r8 = r7.termiusStorage
            java.lang.Integer r8 = r8.q()
            if (r8 == 0) goto L86
            pl.b r2 = r7.createEncryptionKeyRepository
            int r8 = r8.intValue()
            r0.f39674c = r6
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L64
            goto L92
        L64:
            pl.b$b r8 = (pl.b.AbstractC1082b) r8
            boolean r8 = r8 instanceof pl.b.AbstractC1082b.d
            if (r8 == 0) goto L76
            r0.f39674c = r5
            java.lang.Object r8 = r7.proceedToInviteTeamMembers(r0)
            if (r8 != r1) goto L73
            goto L92
        L73:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        L76:
            yu.d r8 = r7._screenActionFlow
            zn.a$b r2 = zn.a.b.f88041a
            r0.f39674c = r4
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L83
            goto L92
        L83:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        L86:
            yu.d r8 = r7._screenActionFlow
            zn.a$b r2 = zn.a.b.f88041a
            r0.f39674c = r3
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L93
        L92:
            return r1
        L93:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.generateTeamEncryptionKeys(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onInvitationResultReceived(zt.e<? super m0> eVar) {
        Object objOnInvitationsSent;
        return (this.invitationsLeft.decrementAndGet() > 0 || (objOnInvitationsSent = onInvitationsSent(eVar)) != au.b.f()) ? m0.f82633a : objOnInvitationsSent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onInvitationsSent(zt.e<? super m0> eVar) {
        if (!this.isNeedShowSuccessScreen) {
            Object objB = this._screenActionFlow.b(a.C1427a.f88040a, eVar);
            return objB == au.b.f() ? objB : m0.f82633a;
        }
        yu.d dVar = this._screenActionFlow;
        Calendar calendar = this.grantedUntilCalendar;
        t.e(calendar, "grantedUntilCalendar");
        Object objB2 = dVar.b(new a.c(calendar), eVar);
        return objB2 == au.b.f() ? objB2 : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (onInvitationsSent(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proceedToInviteTeamMembers(zt.e<? super ut.m0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.l
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$l r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.l) r0
            int r1 = r0.f39692d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39692d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$l r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39690b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39692d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.f39689a
            java.util.Iterator r2 = (java.util.Iterator) r2
            ut.x.b(r7)
            goto L5e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            ut.x.b(r7)
            goto L54
        L3c:
            ut.x.b(r7)
            com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel$c$c r7 = com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.c.C0611c.f39671a
            r6.lastStep = r7
            java.util.List<com.server.auditor.ssh.client.models.teams.TeamMemberInvitation> r7 = r6.teamMemberInvites
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L57
            r0.f39692d = r4
            java.lang.Object r7 = r6.onInvitationsSent(r0)
            if (r7 != r1) goto L54
            goto L82
        L54:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L57:
            java.util.List<com.server.auditor.ssh.client.models.teams.TeamMemberInvitation> r7 = r6.teamMemberInvites
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L5e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r2.next()
            com.server.auditor.ssh.client.models.teams.TeamMemberInvitation r7 = (com.server.auditor.ssh.client.models.teams.TeamMemberInvitation) r7
            jg.h r4 = r6.inviteTeamMembersInteractor
            java.lang.String r5 = r7.getEmail()
            com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole r7 = r7.getRole()
            java.lang.String r7 = r7.toString()
            r0.f39689a = r2
            r0.f39692d = r3
            java.lang.Object r7 = r4.a(r5, r7, r0)
            if (r7 != r1) goto L5e
        L82:
            return r1
        L83:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.EndOfTrialCreateTeamTrialProgressViewModel.proceedToInviteTeamMembers(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object proceedToTeamCreation(zt.e<? super m0> eVar) {
        this.lastStep = c.b.f39670a;
        Object objB = this.teamTrialCreateInteractor.b(this.teamName, v.o(), eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    @Override // jg.h.a
    public void onFailedInviteTeamMember(List<yj.a> list) {
        t.f(list, "list");
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    @Override // jg.h.a
    public void onInvitingTeamMember(List<yj.a> list) {
        t.f(list, "list");
    }

    public final void onRetryLastRequest() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    @Override // jg.h.a
    public void onSuccessInviteTeamMember(List<yj.a> list) {
        t.f(list, "list");
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationFailed() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationNetworkError() {
        wu.k.d(j1.a(this), null, null, new j(null), 3, null);
    }

    @Override // hj.e.a
    public void onTeamTrialCreationSuccess(TrialResponse trialResponse) {
        wu.k.d(j1.a(this), null, null, new k(trialResponse, this, null), 3, null);
    }
}
