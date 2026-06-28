package com.server.auditor.ssh.client.viewmodels;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
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
import com.server.auditor.ssh.client.interactors.g0;
import com.server.auditor.ssh.client.interactors.y0;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.p;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.b0;
import ut.m0;
import ut.n;
import ut.o;
import ut.s;
import ut.x;
import vt.c1;
import vt.s0;
import wn.j;
import wu.i0;
import wu.x0;
import zu.a0;
import zu.c0;
import zu.k0;
import zu.v;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SetupTeamVaultEntitiesToShareScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final v _navigationEvent;
    private final w _uiState;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final String callerFeature;
    private final int invitedColleaguesCount;
    private final boolean isSharedCredentials;
    private final n moveStrategy$delegate;
    private final a0 navigationEvent;
    private final g0 obtainTeamVaultKeyIdInteractor;
    private final y0 setupTeamVaultEntitiesToShareInteractor;
    private final SyncServiceHelper syncServiceHelper;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46474a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f46474a;
            if (i10 == 0) {
                x.b(obj);
                SetupTeamVaultEntitiesToShareScreenViewModel setupTeamVaultEntitiesToShareScreenViewModel = SetupTeamVaultEntitiesToShareScreenViewModel.this;
                this.f46474a = 1;
                if (setupTeamVaultEntitiesToShareScreenViewModel.initUiState(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            SetupTeamVaultEntitiesToShareScreenViewModel.this.selectAllEntities();
            if (t.b(SetupTeamVaultEntitiesToShareScreenViewModel.this.callerFeature, "TEAM_PRESENCE_SETUP_TEAM_VAULT_PROMOTION_CALLER_FEATURE")) {
                SetupTeamVaultEntitiesToShareScreenViewModel.this.avoAnalytics.y5();
            } else {
                SetupTeamVaultEntitiesToShareScreenViewModel.this.avoAnalytics.O4();
            }
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
            public static final a f46476a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1286209543;
            }

            public String toString() {
                return VariablesConverter.CLIENT_COLOR_SCHEME_DEFAULT;
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0661b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0661b f46477a = new C0661b();

            private C0661b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0661b);
            }

            public int hashCode() {
                return -304524018;
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

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f46483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f46484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f46485c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46487e;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46485c = obj;
            this.f46487e |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.initUiState(this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f46488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f46489b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f46491d;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46489b = obj;
            this.f46491d |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.moveEntitiesToTeamVault(null, this);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46492a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f46492a;
            if (i10 == 0) {
                x.b(obj);
                if (((c) SetupTeamVaultEntitiesToShareScreenViewModel.this._uiState.getValue()).f()) {
                    return m0.f82633a;
                }
                v vVar = SetupTeamVaultEntitiesToShareScreenViewModel.this._navigationEvent;
                p.b bVar = p.b.f27925a;
                this.f46492a = 1;
                if (vVar.emit(bVar, this) == objF) {
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

    static final class g extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46494a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.new g(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.emit(r2, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r1.moveEntitiesToTeamVault(r6, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
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
                int r1 = r5.f46494a
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
                goto L80
            L1e:
                ut.x.b(r6)
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r6 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                java.util.List r6 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$getSelectedSectionsItems(r6)
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$sendShareButtonClickedAnalytics(r1, r6)
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L4c
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                zu.v r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$get_navigationEvent$p(r1)
                com.server.auditor.ssh.client.models.p$d r2 = new com.server.auditor.ssh.client.models.p$d
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r3 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                int r3 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$getInvitedColleaguesCount$p(r3)
                r2.<init>(r3, r6)
                r5.f46494a = r4
                java.lang.Object r6 = r1.emit(r2, r5)
                if (r6 != r0) goto L80
                goto L7f
            L4c:
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                com.server.auditor.ssh.client.app.a r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$getTermiusStorage$p(r1)
                boolean r1 = r1.m()
                if (r1 == 0) goto L6f
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                com.server.auditor.ssh.client.app.a r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$getTermiusStorage$p(r1)
                boolean r1 = r1.z()
                if (r1 == 0) goto L6f
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                r5.f46494a = r3
                java.lang.Object r6 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$moveEntitiesToTeamVault(r1, r6, r5)
                if (r6 != r0) goto L80
                goto L7f
            L6f:
                com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel r6 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.this
                zu.v r6 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.access$get_navigationEvent$p(r6)
                com.server.auditor.ssh.client.models.p$a r1 = com.server.auditor.ssh.client.models.p.a.f27924a
                r5.f46494a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L80
            L7f:
                return r0
            L80:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f46496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f46498c;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46496a = obj;
            this.f46498c |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.onTeamVaultNotFoundError(this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f46499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f46501c;

        i(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46499a = obj;
            this.f46501c |= RtlSpacingHelper.UNDEFINED;
            return SetupTeamVaultEntitiesToShareScreenViewModel.this.prepareExpandableSections(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetupTeamVaultEntitiesToShareScreenViewModel(int i10, boolean z10, String str) {
        this.invitedColleaguesCount = i10;
        this.isSharedCredentials = z10;
        this.callerFeature = str;
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
        this.setupTeamVaultEntitiesToShareInteractor = new y0(g0VarB, groupDBAdapterH, hostsDBAdapterI, snippetDBAdapterJ, snippetPackageDBAdapterO, pFRulesDBAdapterZ, identityDBAdapterN, sshKeyDBAdapterW, knownHostsDBAdapterR);
        this.obtainTeamVaultKeyIdInteractor = new g0(vl.g.f83702b.b(), new pp.i(null, 1, 0 == true ? 1 : 0));
        this.termiusStorage = com.server.auditor.ssh.client.app.a.N();
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.syncServiceHelper = hg.f.p().Y();
        this.moveStrategy$delegate = o.a(new iu.a() { // from class: jq.d
            @Override // iu.a
            public final Object a() {
                return SetupTeamVaultEntitiesToShareScreenViewModel.moveStrategy_delegate$lambda$0(this.f62792a);
            }
        });
        w wVarA = zu.m0.a(new c(null, null, null, false, 15, null));
        this._uiState = wVarA;
        this.uiState = zu.h.b(wVarA);
        v vVarB = c0.b(0, 0, null, 7, null);
        this._navigationEvent = vVarB;
        this.navigationEvent = zu.h.a(vVarB);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    private final String getCredentialsMode() {
        return this.isSharedCredentials ? "credentials_sharing" : "no_credentials_sharing";
    }

    private final iq.b getMoveStrategy() {
        return (iq.b) this.moveStrategy$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SetupTeamVaultShareEntitiesSectionType<?>> getSelectedSectionsItems() {
        Object objCopy;
        List listC = ((c) this._uiState.getValue()).c();
        Map mapD = ((c) this._uiState.getValue()).d();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapD.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            Set set = (Set) entry.getValue();
            SetupTeamVaultShareEntitiesSectionType setupTeamVaultShareEntitiesSectionType = (SetupTeamVaultShareEntitiesSectionType) vt.v.s0(listC, iIntValue);
            Object obj = null;
            if (setupTeamVaultShareEntitiesSectionType != null) {
                List items = setupTeamVaultShareEntitiesSectionType.getItems();
                ArrayList<SyncableModel> arrayList2 = new ArrayList();
                int i10 = 0;
                for (Object obj2 : items) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        vt.v.y();
                    }
                    if (set.contains(Integer.valueOf(i10))) {
                        arrayList2.add(obj2);
                    }
                    i10 = i11;
                }
                if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Groups) {
                    SetupTeamVaultShareEntitiesSectionType.Groups groups = (SetupTeamVaultShareEntitiesSectionType.Groups) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList3 = new ArrayList();
                    for (SyncableModel syncableModel : arrayList2) {
                        GroupDBModel groupDBModel = syncableModel instanceof GroupDBModel ? (GroupDBModel) syncableModel : null;
                        if (groupDBModel != null) {
                            arrayList3.add(groupDBModel);
                        }
                    }
                    objCopy = groups.copy(arrayList3);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Hosts) {
                    SetupTeamVaultShareEntitiesSectionType.Hosts hosts = (SetupTeamVaultShareEntitiesSectionType.Hosts) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList4 = new ArrayList();
                    for (SyncableModel syncableModel2 : arrayList2) {
                        HostDBModel hostDBModel = syncableModel2 instanceof HostDBModel ? (HostDBModel) syncableModel2 : null;
                        if (hostDBModel != null) {
                            arrayList4.add(hostDBModel);
                        }
                    }
                    objCopy = hosts.copy(arrayList4);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.PortForwardings) {
                    SetupTeamVaultShareEntitiesSectionType.PortForwardings portForwardings = (SetupTeamVaultShareEntitiesSectionType.PortForwardings) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList5 = new ArrayList();
                    for (SyncableModel syncableModel3 : arrayList2) {
                        RuleDBModel ruleDBModel = syncableModel3 instanceof RuleDBModel ? (RuleDBModel) syncableModel3 : null;
                        if (ruleDBModel != null) {
                            arrayList5.add(ruleDBModel);
                        }
                    }
                    objCopy = portForwardings.copy(arrayList5);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.SnippetPackages) {
                    SetupTeamVaultShareEntitiesSectionType.SnippetPackages snippetPackages = (SetupTeamVaultShareEntitiesSectionType.SnippetPackages) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList6 = new ArrayList();
                    for (SyncableModel syncableModel4 : arrayList2) {
                        SnippetPackageDBModel snippetPackageDBModel = syncableModel4 instanceof SnippetPackageDBModel ? (SnippetPackageDBModel) syncableModel4 : null;
                        if (snippetPackageDBModel != null) {
                            arrayList6.add(snippetPackageDBModel);
                        }
                    }
                    objCopy = snippetPackages.copy(arrayList6);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Snippets) {
                    SetupTeamVaultShareEntitiesSectionType.Snippets snippets = (SetupTeamVaultShareEntitiesSectionType.Snippets) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList7 = new ArrayList();
                    for (SyncableModel syncableModel5 : arrayList2) {
                        SnippetDBModel snippetDBModel = syncableModel5 instanceof SnippetDBModel ? (SnippetDBModel) syncableModel5 : null;
                        if (snippetDBModel != null) {
                            arrayList7.add(snippetDBModel);
                        }
                    }
                    objCopy = snippets.copy(arrayList7);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Identities) {
                    SetupTeamVaultShareEntitiesSectionType.Identities identities = (SetupTeamVaultShareEntitiesSectionType.Identities) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList8 = new ArrayList();
                    for (SyncableModel syncableModel6 : arrayList2) {
                        IdentityDBModel identityDBModel = syncableModel6 instanceof IdentityDBModel ? (IdentityDBModel) syncableModel6 : null;
                        if (identityDBModel != null) {
                            arrayList8.add(identityDBModel);
                        }
                    }
                    objCopy = identities.copy(arrayList8);
                } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.SshKeys) {
                    SetupTeamVaultShareEntitiesSectionType.SshKeys sshKeys = (SetupTeamVaultShareEntitiesSectionType.SshKeys) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList9 = new ArrayList();
                    for (SyncableModel syncableModel7 : arrayList2) {
                        SshKeyDBModel sshKeyDBModel = syncableModel7 instanceof SshKeyDBModel ? (SshKeyDBModel) syncableModel7 : null;
                        if (sshKeyDBModel != null) {
                            arrayList9.add(sshKeyDBModel);
                        }
                    }
                    objCopy = sshKeys.copy(arrayList9);
                } else {
                    if (!(setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.KnownHosts)) {
                        throw new s();
                    }
                    SetupTeamVaultShareEntitiesSectionType.KnownHosts knownHosts = (SetupTeamVaultShareEntitiesSectionType.KnownHosts) setupTeamVaultShareEntitiesSectionType;
                    ArrayList arrayList10 = new ArrayList();
                    for (SyncableModel syncableModel8 : arrayList2) {
                        KnownHostsDBModel knownHostsDBModel = syncableModel8 instanceof KnownHostsDBModel ? (KnownHostsDBModel) syncableModel8 : null;
                        if (knownHostsDBModel != null) {
                            arrayList10.add(knownHostsDBModel);
                        }
                    }
                    objCopy = knownHosts.copy(arrayList10);
                }
                obj = objCopy;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList11 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((SetupTeamVaultShareEntitiesSectionType) obj3).getItems().isEmpty()) {
                arrayList11.add(obj3);
            }
        }
        return arrayList11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r2.emit(r4, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initUiState(zt.e<? super ut.m0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.d
            if (r0 == 0) goto L13
            r0 = r12
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$d r0 = (com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.d) r0
            int r1 = r0.f46487e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46487e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$d r0 = new com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f46485c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f46487e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r12)
            goto L83
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            java.lang.Object r2 = r0.f46484b
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$b r2 = (com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.b) r2
            java.lang.Object r4 = r0.f46483a
            zu.w r4 = (zu.w) r4
            ut.x.b(r12)
            r5 = r2
            r2 = r4
            goto L68
        L42:
            ut.x.b(r12)
            java.lang.String r12 = r11.callerFeature
            java.lang.String r2 = "TEAM_PRESENCE_SETUP_TEAM_VAULT_PROMOTION_CALLER_FEATURE"
            boolean r12 = ju.t.b(r12, r2)
            if (r12 == 0) goto L53
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$b$b r12 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.b.C0661b.f46477a
        L51:
            r2 = r12
            goto L56
        L53:
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$b$a r12 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.b.a.f46476a
            goto L51
        L56:
            zu.w r12 = r11._uiState
            r0.f46483a = r12
            r0.f46484b = r2
            r0.f46487e = r4
            java.lang.Object r4 = r11.prepareExpandableSections(r0)
            if (r4 != r1) goto L65
            goto L82
        L65:
            r5 = r2
            r2 = r12
            r12 = r4
        L68:
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$c r4 = new com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$c
            r8 = 0
            r7 = 0
            r9 = 12
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0.f46483a = r12
            r0.f46484b = r12
            r0.f46487e = r3
            java.lang.Object r12 = r2.emit(r4, r0)
            if (r12 != r1) goto L83
        L82:
            return r1
        L83:
            ut.m0 r12 = ut.m0.f82633a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.initUiState(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (onEntitiesMovedSuccessfully(r3, r8) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        if (onTeamVaultNotFoundError(r8) == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object moveEntitiesToTeamVault(java.util.List<? extends com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType<?>> r22, zt.e<? super ut.m0> r23) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.moveEntitiesToTeamVault(java.util.List, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b moveStrategy_delegate$lambda$0(SetupTeamVaultEntitiesToShareScreenViewModel setupTeamVaultEntitiesToShareScreenViewModel) {
        hg.d dVarM = setupTeamVaultEntitiesToShareScreenViewModel.termiusStorage.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new j(dVarM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onEntitiesMovedSuccessfully(List<? extends SetupTeamVaultShareEntitiesSectionType<?>> list, zt.e<? super m0> eVar) {
        this.syncServiceHelper.startFullSync();
        Object objEmit = this._navigationEvent.emit(new p.d(this.invitedColleaguesCount, list), eVar);
        return objEmit == au.b.f() ? objEmit : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onTeamVaultNotFoundError(zt.e<? super ut.m0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.h
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$h r0 = (com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.h) r0
            int r1 = r0.f46498c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46498c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$h r0 = new com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46496a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f46498c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            ut.x.b(r9)
            zu.v r9 = r8._navigationEvent
            com.server.auditor.ssh.client.models.p$c r2 = com.server.auditor.ssh.client.models.p.c.f27926a
            r0.f46498c = r3
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            zu.w r9 = r8._uiState
        L43:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$c r1 = (com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.c) r1
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$c r1 = com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.c.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r9.g(r0, r1)
            if (r0 == 0) goto L43
            ut.m0 r9 = ut.m0.f82633a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.onTeamVaultNotFoundError(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareExpandableSections(zt.e<? super java.util.List<? extends com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType<?>>> r11) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r11 instanceof com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.i
            if (r1 == 0) goto L14
            r1 = r11
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$i r1 = (com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.i) r1
            int r2 = r1.f46501c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f46501c = r2
            goto L19
        L14:
            com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$i r1 = new com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel$i
            r1.<init>(r11)
        L19:
            java.lang.Object r11 = r1.f46499a
            java.lang.Object r2 = au.b.f()
            int r3 = r1.f46501c
            if (r3 == 0) goto L31
            if (r3 != r0) goto L29
            ut.x.b(r11)
            goto L3f
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            ut.x.b(r11)
            com.server.auditor.ssh.client.interactors.y0 r11 = r10.setupTeamVaultEntitiesToShareInteractor
            r1.f46501c = r0
            java.lang.Object r11 = r11.i(r1)
            if (r11 != r2) goto L3f
            return r2
        L3f:
            com.server.auditor.ssh.client.interactors.y0$a r11 = (com.server.auditor.ssh.client.interactors.y0.a) r11
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Groups r1 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Groups
            java.util.List r2 = r11.a()
            r1.<init>(r2)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Hosts r2 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Hosts
            java.util.List r3 = r11.b()
            r2.<init>(r3)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$SnippetPackages r3 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$SnippetPackages
            java.util.List r4 = r11.f()
            r3.<init>(r4)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Snippets r4 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Snippets
            java.util.List r5 = r11.g()
            r4.<init>(r5)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$PortForwardings r5 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$PortForwardings
            java.util.List r6 = r11.e()
            r5.<init>(r6)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Identities r6 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$Identities
            java.util.List r7 = r11.c()
            r6.<init>(r7)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$SshKeys r7 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$SshKeys
            java.util.List r8 = r11.h()
            r7.<init>(r8)
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$KnownHosts r8 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType$KnownHosts
            java.util.List r11 = r11.d()
            r8.<init>(r11)
            r11 = 8
            com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType[] r11 = new com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType[r11]
            r9 = 0
            r11[r9] = r1
            r11[r0] = r2
            r0 = 2
            r11[r0] = r3
            r0 = 3
            r11[r0] = r4
            r0 = 4
            r11[r0] = r5
            r0 = 5
            r11[r0] = r6
            r0 = 6
            r11[r0] = r7
            r0 = 7
            r11[r0] = r8
            java.util.List r11 = vt.v.r(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultEntitiesToShareScreenViewModel.prepareExpandableSections(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectAllEntities() {
        Object value;
        List listC = ((c) this._uiState.getValue()).c();
        int size = listC.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Integer numValueOf = Integer.valueOf(i10);
            int size2 = ((SetupTeamVaultShareEntitiesSectionType) listC.get(i10)).getItems().size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(Integer.valueOf(i11));
            }
            arrayList.add(b0.a(numValueOf, vt.v.i1(arrayList2)));
        }
        Map mapS = s0.s(arrayList);
        w wVar = this._uiState;
        do {
            value = wVar.getValue();
        } while (!wVar.g(value, c.b((c) value, null, null, mapS, false, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShareButtonClickedAnalytics(List<? extends SetupTeamVaultShareEntitiesSectionType<?>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        int size2 = 0;
        int size3 = 0;
        int size4 = 0;
        int size5 = 0;
        int size6 = 0;
        int size7 = 0;
        int size8 = 0;
        while (it.hasNext()) {
            SetupTeamVaultShareEntitiesSectionType setupTeamVaultShareEntitiesSectionType = (SetupTeamVaultShareEntitiesSectionType) it.next();
            if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Groups) {
                size = ((SetupTeamVaultShareEntitiesSectionType.Groups) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Hosts) {
                size2 = ((SetupTeamVaultShareEntitiesSectionType.Hosts) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.PortForwardings) {
                size5 = ((SetupTeamVaultShareEntitiesSectionType.PortForwardings) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.SnippetPackages) {
                size4 = ((SetupTeamVaultShareEntitiesSectionType.SnippetPackages) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Snippets) {
                size3 = ((SetupTeamVaultShareEntitiesSectionType.Snippets) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.Identities) {
                size8 = ((SetupTeamVaultShareEntitiesSectionType.Identities) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else if (setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.SshKeys) {
                size7 = ((SetupTeamVaultShareEntitiesSectionType.SshKeys) setupTeamVaultShareEntitiesSectionType).getItems().size();
            } else {
                if (!(setupTeamVaultShareEntitiesSectionType instanceof SetupTeamVaultShareEntitiesSectionType.KnownHosts)) {
                    throw new s();
                }
                size6 = ((SetupTeamVaultShareEntitiesSectionType.KnownHosts) setupTeamVaultShareEntitiesSectionType).getItems().size();
            }
        }
        this.avoAnalytics.P4(size, size2, size3, size4, size5, size6, size7, size8);
    }

    public final a0 getNavigationEvent() {
        return this.navigationEvent;
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final void onBackButtonPressed() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void onShareButtonClicked() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void retryLastRequest() {
        onShareButtonClicked();
    }

    public final void toggleSectionItemSelection(int i10, int i11) {
        Object value;
        c cVar;
        Map mapW;
        w wVar = this._uiState;
        do {
            value = wVar.getValue();
            cVar = (c) value;
            mapW = s0.w(cVar.d());
            Integer numValueOf = Integer.valueOf(i10);
            Set setH1 = vt.v.h1((Iterable) mapW.getOrDefault(Integer.valueOf(i10), c1.e()));
            if (setH1.contains(Integer.valueOf(i11))) {
                setH1.remove(Integer.valueOf(i11));
            } else {
                setH1.add(Integer.valueOf(i11));
            }
            mapW.put(numValueOf, setH1);
            m0 m0Var = m0.f82633a;
        } while (!wVar.g(value, c.b(cVar, null, null, mapW, false, 11, null)));
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f46478e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f46479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f46480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f46481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f46482d;

        public c(b bVar, List list, Map map, boolean z10) {
            t.f(bVar, "setupStepInfo");
            t.f(list, "expandableSections");
            t.f(map, "selectedSectionsItemsIndexes");
            this.f46479a = bVar;
            this.f46480b = list;
            this.f46481c = map;
            this.f46482d = z10;
        }

        public static /* synthetic */ c b(c cVar, b bVar, List list, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = cVar.f46479a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f46480b;
            }
            if ((i10 & 4) != 0) {
                map = cVar.f46481c;
            }
            if ((i10 & 8) != 0) {
                z10 = cVar.f46482d;
            }
            return cVar.a(bVar, list, map, z10);
        }

        public final c a(b bVar, List list, Map map, boolean z10) {
            t.f(bVar, "setupStepInfo");
            t.f(list, "expandableSections");
            t.f(map, "selectedSectionsItemsIndexes");
            return new c(bVar, list, map, z10);
        }

        public final List c() {
            return this.f46480b;
        }

        public final Map d() {
            return this.f46481c;
        }

        public final b e() {
            return this.f46479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return t.b(this.f46479a, cVar.f46479a) && t.b(this.f46480b, cVar.f46480b) && t.b(this.f46481c, cVar.f46481c) && this.f46482d == cVar.f46482d;
        }

        public final boolean f() {
            return this.f46482d;
        }

        public int hashCode() {
            return (((((this.f46479a.hashCode() * 31) + this.f46480b.hashCode()) * 31) + this.f46481c.hashCode()) * 31) + Boolean.hashCode(this.f46482d);
        }

        public String toString() {
            return "SetupTeamVaultEntitiesToShareUiState(setupStepInfo=" + this.f46479a + ", expandableSections=" + this.f46480b + ", selectedSectionsItemsIndexes=" + this.f46481c + ", isProgress=" + this.f46482d + ")";
        }

        public /* synthetic */ c(b bVar, List list, Map map, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? b.a.f46476a : bVar, (i10 & 2) != 0 ? vt.v.o() : list, (i10 & 4) != 0 ? s0.h() : map, (i10 & 8) != 0 ? false : z10);
        }
    }
}
