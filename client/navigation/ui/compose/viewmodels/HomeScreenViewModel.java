package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.crystalnix.termius.libtermius.wrappers.SelectedConnectionTab;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalSessionHelper;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.ConflictResolve;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.fragments.terminals.ConnectionsScreenViewModel;
import com.server.auditor.ssh.client.interactors.b1;
import com.server.auditor.ssh.client.models.ActiveConnection;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.UsedHost;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetDialogState;
import com.server.auditor.ssh.client.navigation.ui.compose.components.BellState;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dk.b;
import hg.b2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import tl.l2;
import vl.b;
import zu.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final zu.k0 _bellState;
    private final zu.k0 _isBellFeatureEnabled;
    private final zu.w _isMorePopupShows;
    private final zu.w _isNewConnectionVariantsPopupVisible;
    private final zu.w _isSnippetsDialogVisible;
    private final zu.w _isTermiusXAnnouncementVisible;
    private final zu.w _isVaultsPopupVisible;
    private final yu.d _openConnectionsPageViaDeeplink;
    private final yu.d _openCreateNewVaultWebPage;
    private final yu.d _openDownloadedItemIntent;
    private final yu.d _openHostEditorRequest;
    private final yu.d _openSerialPromotion;
    private final yu.d _openTerminalScreen;
    private final zu.w _serialConnectParametersDialogState;
    private final yu.d _showBusinessVaultsPromoFlow;
    private final yu.d _showInviteTeamMember;
    private final zu.w _showNotificationsDialog;
    private final zu.w _showRenameConnectionDialog;
    private final zu.w _showStartNewConnectionSFTP;
    private final zu.w _showStartNewTerminalConnection;
    private final yu.d _showSyncPersonalPromo;
    private final zu.w _showTransferBottomSheet;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final ek.a cloneConnectionUseCase;
    private final zu.k0 conflictDialogState;
    private final zu.k0 connectionTabBarItems;
    private final ek.b createLocalHostUseCase;
    private final ek.c dismissSftpTransferTaskUseCase;
    private final kp.c getTeamAccessStatusUseCase;
    private final List<String> historyCommands;
    private final il.r hostDBRepository;
    private final jn.g isAppInLockedStateUseCase;
    private final zu.k0 isMorePopupShows;
    private final zu.k0 isNewConnectionVariantsPopupVisible;
    private final zu.k0 isProModeActiveFlow;
    private final zu.k0 isProgress;
    private final zu.k0 isSnippetsDialogVisible;
    private final tp.g0 liveSharedPreferences;
    private final zu.f openConnectionsPageViaDeeplink;
    private final zu.f openCreateNewVaultWebPage;
    private final zu.f openDownloadedItemIntent;
    private final zu.f openHostEditorRequest;
    private final zu.f openSerialPromotion;
    private final zu.f openTerminalScreen;
    private final ek.d parseNsdResultUseCase;
    private final com.server.auditor.ssh.client.interactors.p0 prepareVaultsSelectorStateUseCase;
    private final og.s promotionsRepository;
    private final mk.p resolveConflictSftpTransferTaskUseCase;
    private final ek.f resolveSftpTransferClickUseCase;
    private final zu.k0 selectedConnectionStyle;
    private final zu.k0 serialConnectParametersDialogState;
    private final SessionManager sessionManager;
    private final zu.k0 sftpTransferTasks;
    private final zu.f showBusinessVaultsPromoFlow;
    private final zu.f showInviteTeamMember;
    private final zu.k0 showProgressButton;
    private final zu.k0 showRenameConnectionDialog;
    private final zu.k0 showStartNewConnectionSFTP;
    private final zu.k0 showStartNewTerminalConnection;
    private final zu.f showSyncPersonalPromo;
    private final zu.k0 showTransferBottomSheet;
    private final zu.k0 showTransferError;
    private final ek.g startSftpConnectionsUseCase;
    private final mk.q startSftpTransferWorkerUseCase;
    private final ek.h startTerminalConnectionsUseCase;
    private final in.c teamStateRepository;
    private final TerminalSessionHelper terminalSessionHelper;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final b1 termiusXAnnouncementInteractor;
    private final zu.k0 vaultsFlow;
    private final gj.b vaultsInteractor;
    private final zu.k0 vaultsSelectorStateFlow;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f33858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f33859d;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k() {
            List<Integer> terminalSessionIds = SessionManager.getInstance().getTerminalSessionIds();
            ju.t.e(terminalSessionIds, "getTerminalSessionIds(...)");
            if (!terminalSessionIds.isEmpty()) {
                return true;
            }
            List<Integer> sFTPSessionIds = SessionManager.getInstance().getSFTPSessionIds();
            ju.t.e(sFTPSessionIds, "getSFTPSessionIds(...)");
            if (!sFTPSessionIds.isEmpty()) {
                return true;
            }
            List<Integer> pFSessionsIds = SessionManager.getInstance().getPFSessionsIds();
            ju.t.e(pFSessionsIds, "getPFSessionsIds(...)");
            return !pFSessionsIds.isEmpty();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new a(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004d -> B:12:0x0050). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
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
                int r1 = r6.f33859d
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r6.f33858c
                java.lang.Object r3 = r6.f33857b
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r3 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel) r3
                java.lang.Object r4 = r6.f33856a
                zu.w r4 = (zu.w) r4
                ut.x.b(r7)
                goto L50
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                ut.x.b(r7)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.this
                zu.w r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.access$get_isTermiusXAnnouncementVisible$p(r7)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.this
                r4 = r7
                r3 = r1
            L2e:
                java.lang.Object r1 = r4.getValue()
                r7 = r1
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                r7.getClass()
                com.server.auditor.ssh.client.interactors.b1 r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.access$getTermiusXAnnouncementInteractor$p(r3)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.h r5 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.h
                r5.<init>()
                r6.f33856a = r4
                r6.f33857b = r3
                r6.f33858c = r1
                r6.f33859d = r2
                java.lang.Object r7 = r7.b(r5, r6)
                if (r7 != r0) goto L50
                return r0
            L50:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
                boolean r7 = r4.g(r1, r7)
                if (r7 == 0) goto L2e
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ op.l f33862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(op.l lVar, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33862b = lVar;
            this.f33863c = homeScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a0(this.f33862b, this.f33863c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        
            if (r5.f(Long.MIN_VALUE, r4) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        
            if (r5.b(r1, r4) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            if (r5.b(r1, r4) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        
            if (r5.f(r1, r4) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
        
            if (r5.b(r1, r4) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
        
            if (r5.b(r1, r4) == r0) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class a1 extends kotlin.coroutines.jvm.internal.m implements iu.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f33865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f33866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33868e;

        a1(zt.e eVar) {
            super(5, eVar);
        }

        public final Object i(boolean z10, boolean z11, jp.a aVar, List list, zt.e eVar) {
            a1 a1Var = HomeScreenViewModel.this.new a1(eVar);
            a1Var.f33865b = z10;
            a1Var.f33866c = z11;
            a1Var.f33867d = aVar;
            a1Var.f33868e = list;
            return a1Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33864a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            boolean z10 = this.f33865b;
            boolean z11 = this.f33866c;
            jp.a aVar = (jp.a) this.f33867d;
            List list = (List) this.f33868e;
            com.server.auditor.ssh.client.interactors.p0 p0Var = HomeScreenViewModel.this.prepareVaultsSelectorStateUseCase;
            this.f33867d = null;
            this.f33864a = 1;
            Object objB = p0Var.b(z10, z11, aVar, list, this);
            return objB == objF ? objF : objB;
        }

        @Override // iu.s
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (jp.a) obj3, (List) obj4, (zt.e) obj5);
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f33870a;

            public a(String str) {
                ju.t.f(str, Column.URI);
                this.f33870a = str;
            }

            public final String a() {
                return this.f33870a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f33870a, ((a) obj).f33870a);
            }

            public int hashCode() {
                return this.f33870a.hashCode();
            }

            public String toString() {
                return "SimpleFile(uri=" + this.f33870a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0526b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f33871a;

            public C0526b(String str) {
                ju.t.f(str, Column.URI);
                this.f33871a = str;
            }

            public final String a() {
                return this.f33871a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0526b) && ju.t.b(this.f33871a, ((C0526b) obj).f33871a);
            }

            public int hashCode() {
                return this.f33871a.hashCode();
            }

            public String toString() {
                return "SimpleFolder(uri=" + this.f33871a + ")";
            }
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33872a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33872a;
            if (i10 == 0) {
                ut.x.b(obj);
                HomeScreenViewModel.this.avoAnalytics.i6();
                op.n nVar = (op.n) HomeScreenViewModel.this.getVaultsSelectorStateFlow().getValue();
                if (nVar.d() || !nVar.b().isEmpty()) {
                    HomeScreenViewModel.this.updateVaultsPopupVisibility(true);
                } else {
                    yu.d dVar = HomeScreenViewModel.this._showSyncPersonalPromo;
                    ut.m0 m0Var = ut.m0.f82633a;
                    this.f33872a = 1;
                    if (dVar.b(m0Var, this) == objF) {
                        return objF;
                    }
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
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Integer.valueOf(((SftpTransferTask) obj).getId()), Integer.valueOf(((SftpTransferTask) obj2).getId()));
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33876c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f33876c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new c0(this.f33876c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33874a;
            if (i10 == 0) {
                ut.x.b(obj);
                if (!HomeScreenViewModel.this.isAppInLockedStateUseCase.a()) {
                    yu.d dVar = HomeScreenViewModel.this._openTerminalScreen;
                    Integer numD = kotlin.coroutines.jvm.internal.b.d(this.f33876c);
                    this.f33874a = 1;
                    if (dVar.b(numD, this) == objF) {
                        return objF;
                    }
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
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33877a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33877a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showRenameConnectionDialog;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, b.a.f34947a));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f33880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(TypedSessionId typedSessionId, HomeScreenViewModel homeScreenViewModel, String str, zt.e eVar) {
            super(2, eVar);
            this.f33880b = typedSessionId;
            this.f33881c = homeScreenViewModel;
            this.f33882d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d0(this.f33880b, this.f33881c, this.f33882d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            zl.b libTermiusSftpSession;
            au.b.f();
            if (this.f33879a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TypedSessionId typedSessionId = this.f33880b;
            Connection connectionA = typedSessionId instanceof TypedSessionId.Terminal ? this.f33881c.sessionManager.getTerminalConnectionHolder(this.f33880b.getSessionId()).a() : (!(typedSessionId instanceof TypedSessionId.Sftp) || (libTermiusSftpSession = this.f33881c.sessionManager.getLibTermiusSftpSession(this.f33880b.getSessionId())) == null) ? null : libTermiusSftpSession.c();
            if (connectionA == null) {
                return ut.m0.f82633a;
            }
            connectionA.setAlias(this.f33882d);
            this.f33881c.sessionManager.updateNotification((int) connectionA.getId());
            this.f33881c.terminalSessionHelper.notifyConnectionsChanged();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33883a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._serialConnectParametersDialogState;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, b.a.f47873a));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33885a;

        e0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new e0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33885a;
            boolean z10 = true;
            if (i10 == 0) {
                ut.x.b(obj);
                gj.b bVar = HomeScreenViewModel.this.vaultsInteractor;
                this.f33885a = 1;
                obj = bVar.c(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            List list = (List) obj;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (sp.a.f((l2) it.next())) {
                        break;
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
            HomeScreenViewModel.this.avoAnalytics.j6(list.size(), z10);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33887a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showStartNewConnectionSFTP;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33889a;

        f0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new f0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33889a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = HomeScreenViewModel.this._openConnectionsPageViaDeeplink;
                ut.m0 m0Var = ut.m0.f82633a;
                this.f33889a = 1;
                if (dVar.b(m0Var, this) == objF) {
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
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33891a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33891a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showStartNewTerminalConnection;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33893a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f33895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(long j10, zt.e eVar) {
            super(2, eVar);
            this.f33895c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new g0(this.f33895c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33893a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = HomeScreenViewModel.this._openHostEditorRequest;
                Long lE = kotlin.coroutines.jvm.internal.b.e(this.f33895c);
                this.f33893a = 1;
                if (dVar.b(lE, this) == objF) {
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
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33896a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, zt.e eVar) {
            super(2, eVar);
            this.f33898c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new h(this.f33898c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33896a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._isTermiusXAnnouncementVisible;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            com.server.auditor.ssh.client.utils.analytics.a.y().V5(this.f33898c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class h0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Integer.valueOf(((SftpTransferTask) obj2).getId()), Integer.valueOf(((SftpTransferTask) obj).getId()));
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f33900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(TypedSessionId typedSessionId, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33900b = typedSessionId;
            this.f33901c = homeScreenViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel._openTerminalScreen.c(Integer.valueOf(i10));
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f33900b, this.f33901c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33899a;
            if (i10 == 0) {
                ut.x.b(obj);
                Avo.ConnectionOrigin connectionOrigin = this.f33900b instanceof TypedSessionId.Sftp ? Avo.ConnectionOrigin.DUPLICATED_TAB : Avo.ConnectionOrigin.TAB_CONTEXT_MENU;
                Connection connectionA = this.f33901c.cloneConnectionUseCase.a(this.f33900b.getSessionId());
                if (connectionA == null) {
                    return ut.m0.f82633a;
                }
                connectionA.setConnectionOrigin(connectionOrigin);
                ek.g gVar = this.f33901c.startSftpConnectionsUseCase;
                List listE = vt.v.e(connectionA);
                final HomeScreenViewModel homeScreenViewModel = this.f33901c;
                iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.i
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return HomeScreenViewModel.i.k(homeScreenViewModel, ((Integer) obj2).intValue());
                    }
                };
                this.f33899a = 1;
                if (gVar.d(listE, lVar, this) == objF) {
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
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f33903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33904c;

        i0(zt.e eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, com.server.auditor.ssh.client.navigation.m0 m0Var, zt.e eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f33903b = z10;
            i0Var.f33904c = m0Var;
            return i0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (com.server.auditor.ssh.client.navigation.m0) obj2, (zt.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33902a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            boolean z10 = this.f33903b;
            com.server.auditor.ssh.client.navigation.m0 m0Var = (com.server.auditor.ssh.client.navigation.m0) this.f33904c;
            if (z10 && m0Var != null) {
                return ju.t.b(m0Var.a(), "medium") ? BellState.MEDIUM : ju.t.b(m0Var.a(), "critical") ? BellState.CRITICAL : BellState.VISIBLE;
            }
            return BellState.HIDDEN;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f33906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TypedSessionId typedSessionId, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33906b = typedSessionId;
            this.f33907c = homeScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f33906b, this.f33907c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33905a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Avo.ConnectionOrigin connectionOrigin = this.f33906b instanceof TypedSessionId.Terminal ? Avo.ConnectionOrigin.DUPLICATED_TAB : Avo.ConnectionOrigin.TAB_CONTEXT_MENU;
            Connection connectionA = this.f33907c.cloneConnectionUseCase.a(this.f33906b.getSessionId());
            if (connectionA == null) {
                return ut.m0.f82633a;
            }
            connectionA.setConnectionOrigin(connectionOrigin);
            ek.h.b(this.f33907c.startTerminalConnectionsUseCase, vt.v.e(connectionA), null, 2, null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f33909b;

        j0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            j0 j0Var = HomeScreenViewModel.this.new j0(eVar);
            j0Var.f33909b = ((Boolean) obj).booleanValue();
            return j0Var;
        }

        public final Object i(boolean z10, zt.e eVar) {
            return ((j0) create(Boolean.valueOf(z10), eVar)).invokeSuspend(ut.m0.f82633a);
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (zt.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33908a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!this.f33909b) {
                zu.w wVar = HomeScreenViewModel.this._showTransferBottomSheet;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            }
            return ut.m0.f82633a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33911a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SftpTransferTask f33913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(SftpTransferTask sftpTransferTask, zt.e eVar) {
            super(2, eVar);
            this.f33913c = sftpTransferTask;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new k(this.f33913c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33911a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HomeScreenViewModel.this.dismissSftpTransferTaskUseCase.a(this.f33913c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f33916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33917d;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f33919b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, zt.e eVar) {
                super(2, eVar);
                this.f33919b = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f33919b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f33918a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                HostDBModel itemByLocalId = hg.f.p().i().getItemByLocalId(this.f33919b);
                if (itemByLocalId != null) {
                    return itemByLocalId.getTitle();
                }
                return null;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f33921b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, zt.e eVar) {
                super(2, eVar);
                this.f33921b = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(this.f33921b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f33920a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                HostDBModel itemByLocalId = hg.f.p().i().getItemByLocalId(this.f33921b);
                if (itemByLocalId != null) {
                    return itemByLocalId.getTitle();
                }
                return null;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(TypedSessionId typedSessionId, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33916c = typedSessionId;
            this.f33917d = homeScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k0(this.f33916c, this.f33917d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            ActiveConnection activeConnection;
            ActiveConnection activeConnection2;
            ActiveConnection activeConnectionA;
            ActiveConnection activeConnection3;
            String strA;
            zu.w wVar;
            TypedSessionId typedSessionId;
            Object value;
            String strA2;
            zu.w wVar2;
            TypedSessionId typedSessionId2;
            Object value2;
            Object objF = au.b.f();
            int i10 = this.f33915b;
            if (i10 == 0) {
                ut.x.b(obj);
                str = null;
                if (this.f33916c instanceof TypedSessionId.Terminal) {
                    activeConnectionA = this.f33917d.sessionManager.getTerminalConnectionHolder(this.f33916c.getSessionId()).a();
                    if (activeConnectionA == null) {
                        return ut.m0.f82633a;
                    }
                    Long hostId = activeConnectionA.getHostId();
                    if (hostId != null) {
                        long jLongValue = hostId.longValue();
                        wu.g0 g0VarB = wu.x0.b();
                        a aVar = new a(jLongValue, null);
                        this.f33914a = activeConnectionA;
                        this.f33915b = 1;
                        Object objG = wu.i.g(g0VarB, aVar, this);
                        if (objG != objF) {
                            activeConnection3 = activeConnectionA;
                            obj = objG;
                            str = (String) obj;
                            activeConnectionA = activeConnection3;
                        }
                    }
                    strA = nm.y0.a(activeConnectionA, str);
                    wVar = this.f33917d._showRenameConnectionDialog;
                    typedSessionId = this.f33916c;
                    do {
                        value = wVar.getValue();
                    } while (!wVar.g(value, new b.C0568b(typedSessionId, strA)));
                } else {
                    zl.b libTermiusSftpSession = this.f33917d.sessionManager.getLibTermiusSftpSession(this.f33916c.getSessionId());
                    Connection connectionC = libTermiusSftpSession != null ? libTermiusSftpSession.c() : null;
                    activeConnection = connectionC instanceof ActiveConnection ? (ActiveConnection) connectionC : null;
                    if (activeConnection == null) {
                        return ut.m0.f82633a;
                    }
                    Long hostId2 = activeConnection.getHostId();
                    if (hostId2 != null) {
                        long jLongValue2 = hostId2.longValue();
                        wu.g0 g0VarB2 = wu.x0.b();
                        b bVar = new b(jLongValue2, null);
                        this.f33914a = activeConnection;
                        this.f33915b = 2;
                        Object objG2 = wu.i.g(g0VarB2, bVar, this);
                        if (objG2 != objF) {
                            activeConnection2 = activeConnection;
                            obj = objG2;
                            str = (String) obj;
                            activeConnection = activeConnection2;
                        }
                    }
                    strA2 = nm.y0.a(activeConnection, str);
                    wVar2 = this.f33917d._showRenameConnectionDialog;
                    typedSessionId2 = this.f33916c;
                    do {
                        value2 = wVar2.getValue();
                    } while (!wVar2.g(value2, new b.C0568b(typedSessionId2, strA2)));
                }
                return objF;
            }
            if (i10 == 1) {
                activeConnection3 = (ActiveConnection) this.f33914a;
                ut.x.b(obj);
                str = (String) obj;
                activeConnectionA = activeConnection3;
                strA = nm.y0.a(activeConnectionA, str);
                wVar = this.f33917d._showRenameConnectionDialog;
                typedSessionId = this.f33916c;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, new b.C0568b(typedSessionId, strA)));
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activeConnection2 = (ActiveConnection) this.f33914a;
                ut.x.b(obj);
                str = (String) obj;
                activeConnection = activeConnection2;
                strA2 = nm.y0.a(activeConnection, str);
                wVar2 = this.f33917d._showRenameConnectionDialog;
                typedSessionId2 = this.f33916c;
                do {
                    value2 = wVar2.getValue();
                } while (!wVar2.g(value2, new b.C0568b(typedSessionId2, strA2)));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33922a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f33924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(TypedSessionId typedSessionId, zt.e eVar) {
            super(2, eVar);
            this.f33924c = typedSessionId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel._openTerminalScreen.c(Integer.valueOf(i10));
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new l(this.f33924c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33922a;
            if (i10 == 0) {
                ut.x.b(obj);
                Connection connectionA = HomeScreenViewModel.this.cloneConnectionUseCase.a(this.f33924c.getSessionId());
                if (connectionA == null) {
                    return ut.m0.f82633a;
                }
                connectionA.setConnectionOrigin(Avo.ConnectionOrigin.CONNECTIONS_SCREEN);
                TypedSessionId typedSessionId = this.f33924c;
                if (typedSessionId instanceof TypedSessionId.Terminal) {
                    ek.h.b(HomeScreenViewModel.this.startTerminalConnectionsUseCase, vt.v.e(connectionA), null, 2, null);
                } else if (typedSessionId instanceof TypedSessionId.Sftp) {
                    ek.g gVar = HomeScreenViewModel.this.startSftpConnectionsUseCase;
                    List listE = vt.v.e(connectionA);
                    final HomeScreenViewModel homeScreenViewModel = HomeScreenViewModel.this;
                    iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.j
                        @Override // iu.l
                        public final Object invoke(Object obj2) {
                            return HomeScreenViewModel.l.k(homeScreenViewModel, ((Integer) obj2).intValue());
                        }
                    };
                    this.f33922a = 1;
                    if (gVar.d(listE, lVar, this) == objF) {
                        return objF;
                    }
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
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f33926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f33927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33928d;

        l0(zt.e eVar) {
            super(4, eVar);
        }

        public final Object i(boolean z10, boolean z11, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a aVar, zt.e eVar) {
            l0 l0Var = new l0(eVar);
            l0Var.f33926b = z10;
            l0Var.f33927c = z11;
            l0Var.f33928d = aVar;
            return l0Var.invokeSuspend(ut.m0.f82633a);
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a) obj3, (zt.e) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f33926b && this.f33927c && !(((com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a) this.f33928d) instanceof a.b));
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33929a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33929a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ek.h.b(HomeScreenViewModel.this.startTerminalConnectionsUseCase, vt.v.e(HomeScreenViewModel.this.createLocalHostUseCase.a(ConnectionsScreenViewModel.LOCAL_CONNECTION_ALIAS)), null, 2, null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f33932b;

        m0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            m0 m0Var = new m0(eVar);
            m0Var.f33932b = ((Boolean) obj).booleanValue();
            return m0Var;
        }

        public final Object i(boolean z10, zt.e eVar) {
            return ((m0) create(Boolean.valueOf(z10), eVar)).invokeSuspend(ut.m0.f82633a);
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (zt.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33931a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f33932b) {
                com.server.auditor.ssh.client.utils.analytics.a.y().Z3();
            }
            return ut.m0.f82633a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33935c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33934b = str;
            this.f33935c = homeScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new n(this.f33934b, this.f33935c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f33933a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String str = this.f33934b;
            int iHashCode = str.hashCode();
            if (iHashCode != -1181248900) {
                if (iHashCode != -905839116) {
                    if (iHashCode == 3527695 && str.equals("sftp")) {
                        zu.w wVar = this.f33935c._showStartNewConnectionSFTP;
                        do {
                            value2 = wVar.getValue();
                            ((Boolean) value2).getClass();
                        } while (!wVar.g(value2, kotlin.coroutines.jvm.internal.b.a(true)));
                    }
                } else if (str.equals("serial")) {
                    this.f33935c.onStartSerialConnectClick(Avo.ConnectionOrigin.NEW_TAB_BUTTON);
                }
            } else if (str.equals("terminal")) {
                zu.w wVar2 = this.f33935c._showStartNewTerminalConnection;
                do {
                    value = wVar2.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar2.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class n0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33936a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33937a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$n0$a$a, reason: collision with other inner class name */
            public static final class C0527a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33938a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33939b;

                public C0527a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33938a = obj;
                    this.f33939b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33937a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zt.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.n0.a.C0527a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$n0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.n0.a.C0527a) r0
                    int r1 = r0.f33939b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33939b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$n0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$n0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33938a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33939b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f33937a
                    java.util.List r5 = (java.util.List) r5
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$h0 r2 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$h0
                    r2.<init>()
                    java.util.List r5 = vt.v.R0(r5, r2)
                    r0.f33939b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.n0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public n0(zu.f fVar) {
            this.f33936a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33936a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33941a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SftpTransferTask f33943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ConflictResolve f33944d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(SftpTransferTask sftpTransferTask, ConflictResolve conflictResolve, zt.e eVar) {
            super(2, eVar);
            this.f33943c = sftpTransferTask;
            this.f33944d = conflictResolve;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new o(this.f33943c, this.f33944d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33941a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            mk.p pVar = HomeScreenViewModel.this.resolveConflictSftpTransferTaskUseCase;
            SftpTransferTask sftpTransferTask = this.f33943c;
            ConflictResolve conflictResolve = this.f33944d;
            Context contextF = TermiusApplication.F();
            ju.t.e(contextF, "getTermiusAppContext(...)");
            pVar.a(sftpTransferTask, conflictResolve, contextF);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class o0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33945a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33946a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$o0$a$a, reason: collision with other inner class name */
            public static final class C0528a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33947a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33948b;

                public C0528a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33947a = obj;
                    this.f33948b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33946a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zt.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.o0.a.C0528a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$o0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.o0.a.C0528a) r0
                    int r1 = r0.f33948b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33948b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$o0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$o0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33947a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33948b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f33946a
                    java.util.List r5 = (java.util.List) r5
                    boolean r5 = r5.isEmpty()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f33948b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.o0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public o0(zu.f fVar) {
            this.f33945a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33945a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33950a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33950a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.d dVar = HomeScreenViewModel.this._openSerialPromotion;
                ut.m0 m0Var = ut.m0.f82633a;
                this.f33950a = 1;
                if (dVar.b(m0Var, this) == objF) {
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
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class p0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33952a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33953a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$p0$a$a, reason: collision with other inner class name */
            public static final class C0529a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33954a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33955b;

                public C0529a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33954a = obj;
                    this.f33955b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33953a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, zt.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.p0.a.C0529a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$p0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.p0.a.C0529a) r0
                    int r1 = r0.f33955b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33955b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$p0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$p0$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f33954a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33955b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r8)
                    goto L75
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    ut.x.b(r8)
                    zu.g r8 = r6.f33953a
                    java.util.List r7 = (java.util.List) r7
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$c r2 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$c
                    r2.<init>()
                    java.util.List r7 = vt.v.R0(r7, r2)
                    java.util.Iterator r7 = r7.iterator()
                L45:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L5f
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r4 = (com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask) r4
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus r4 = r4.getStatus()
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus$Conflict r5 = com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus.Conflict.INSTANCE
                    boolean r4 = ju.t.b(r4, r5)
                    if (r4 == 0) goto L45
                    goto L60
                L5f:
                    r2 = 0
                L60:
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r2 = (com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask) r2
                    if (r2 == 0) goto L6a
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a$b r7 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a$b
                    r7.<init>(r2)
                    goto L6c
                L6a:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a$a r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a.C0567a.f34945a
                L6c:
                    r0.f33955b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L75
                    return r1
                L75:
                    ut.m0 r7 = ut.m0.f82633a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.p0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public p0(zu.f fVar) {
            this.f33952a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33952a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33957a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NsdSearchResult f33959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(NsdSearchResult nsdSearchResult, zt.e eVar) {
            super(2, eVar);
            this.f33959c = nsdSearchResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.openTerminalActivityIfNotLocked(i10);
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new q(this.f33959c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33957a;
            if (i10 == 0) {
                ut.x.b(obj);
                ActiveConnection activeConnectionA = HomeScreenViewModel.this.parseNsdResultUseCase.a(this.f33959c);
                activeConnectionA.setConnectionOrigin(Avo.ConnectionOrigin.DISCOVER_NEW_DEVICE);
                ek.g gVar = HomeScreenViewModel.this.startSftpConnectionsUseCase;
                List listE = vt.v.e(activeConnectionA);
                final HomeScreenViewModel homeScreenViewModel = HomeScreenViewModel.this;
                iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.k
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return HomeScreenViewModel.q.k(homeScreenViewModel, ((Integer) obj2).intValue());
                    }
                };
                this.f33957a = 1;
                if (gVar.d(listE, lVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            HomeScreenViewModel.this.dismissStartNewConnectionSFTP();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class q0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33960a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33961a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$q0$a$a, reason: collision with other inner class name */
            public static final class C0530a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33962a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33963b;

                public C0530a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33962a = obj;
                    this.f33963b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33961a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, zt.e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.q0.a.C0530a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$q0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.q0.a.C0530a) r0
                    int r1 = r0.f33963b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33963b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$q0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$q0$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f33962a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33963b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r7)
                    goto L68
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    ut.x.b(r7)
                    zu.g r7 = r5.f33961a
                    java.util.List r6 = (java.util.List) r6
                    r2 = 0
                    if (r6 == 0) goto L42
                    boolean r4 = r6.isEmpty()
                    if (r4 == 0) goto L42
                    goto L5b
                L42:
                    java.util.Iterator r6 = r6.iterator()
                L46:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L5b
                    java.lang.Object r4 = r6.next()
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r4 = (com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask) r4
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus r4 = r4.getStatus()
                    boolean r4 = r4 instanceof com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus.InProgress
                    if (r4 == 0) goto L46
                    r2 = r3
                L5b:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f33963b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L68
                    return r1
                L68:
                    ut.m0 r6 = ut.m0.f82633a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.q0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public q0(zu.f fVar) {
            this.f33960a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33960a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33966b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f33968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j10, zt.e eVar) {
            super(2, eVar);
            this.f33968d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.openTerminalActivityIfNotLocked(i10);
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new r(this.f33968d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33966b;
            if (i10 == 0) {
                ut.x.b(obj);
                Host hostS = HomeScreenViewModel.this.hostDBRepository.s(kotlin.coroutines.jvm.internal.b.e(this.f33968d));
                if (hostS != null) {
                    final HomeScreenViewModel homeScreenViewModel = HomeScreenViewModel.this;
                    hostS.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT);
                    ek.g gVar = homeScreenViewModel.startSftpConnectionsUseCase;
                    List listE = vt.v.e(hostS);
                    iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.l
                        @Override // iu.l
                        public final Object invoke(Object obj2) {
                            return HomeScreenViewModel.r.k(homeScreenViewModel, ((Integer) obj2).intValue());
                        }
                    };
                    this.f33965a = hostS;
                    this.f33966b = 1;
                    if (gVar.d(listE, lVar, this) == objF) {
                        return objF;
                    }
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
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class r0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33969a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33970a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$r0$a$a, reason: collision with other inner class name */
            public static final class C0531a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33971a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33972b;

                public C0531a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33971a = obj;
                    this.f33972b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33970a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, zt.e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.r0.a.C0531a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$r0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.r0.a.C0531a) r0
                    int r1 = r0.f33972b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33972b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$r0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$r0$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f33971a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33972b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r7)
                    goto L68
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    ut.x.b(r7)
                    zu.g r7 = r5.f33970a
                    java.util.List r6 = (java.util.List) r6
                    r2 = 0
                    if (r6 == 0) goto L42
                    boolean r4 = r6.isEmpty()
                    if (r4 == 0) goto L42
                    goto L5b
                L42:
                    java.util.Iterator r6 = r6.iterator()
                L46:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L5b
                    java.lang.Object r4 = r6.next()
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r4 = (com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask) r4
                    com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus r4 = r4.getStatus()
                    boolean r4 = r4 instanceof com.crystalnix.termius.libtermius.wrappers.sftp.modern.TransferTaskStatus.Failed
                    if (r4 == 0) goto L46
                    r2 = r3
                L5b:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f33972b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L68
                    return r1
                L68:
                    ut.m0 r6 = ut.m0.f82633a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.r0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public r0(zu.f fVar) {
            this.f33969a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33969a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f33975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Avo.ConnectionOrigin f33976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33977d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(long j10, Avo.ConnectionOrigin connectionOrigin, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33975b = j10;
            this.f33976c = connectionOrigin;
            this.f33977d = homeScreenViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.dismissStartNewTerminalConnection();
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new s(this.f33975b, this.f33976c, this.f33977d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33974a;
            if (i10 == 0) {
                ut.x.b(obj);
                vl.b bVarB = b.a.b(vl.b.f83635b, null, 1, null);
                long j10 = this.f33975b;
                this.f33974a = 1;
                obj = bVarB.h(j10, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            tl.u uVar = (tl.u) obj;
            if (uVar != null) {
                Avo.ConnectionOrigin connectionOrigin = this.f33976c;
                final HomeScreenViewModel homeScreenViewModel = this.f33977d;
                UsedHost usedHost = new UsedHost(uVar);
                usedHost.setConnectionOrigin(connectionOrigin);
                homeScreenViewModel.startTerminalConnectionsUseCase.a(vt.v.e(usedHost), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.m
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return HomeScreenViewModel.s.k(homeScreenViewModel, ((Integer) obj2).intValue());
                    }
                });
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class s0 implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f33978a;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f33979a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$s0$a$a, reason: collision with other inner class name */
            public static final class C0532a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33980a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33981b;

                public C0532a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33980a = obj;
                    this.f33981b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar) {
                this.f33979a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zt.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.s0.a.C0532a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$s0$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.s0.a.C0532a) r0
                    int r1 = r0.f33981b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33981b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$s0$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$s0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33980a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f33981b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L4d
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f33979a
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
                    boolean r5 = ju.t.b(r5, r2)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f33981b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.s0.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public s0(zu.f fVar) {
            this.f33978a = fVar;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f33978a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f33984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f33985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(List list, HomeScreenViewModel homeScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33984b = list;
            this.f33985c = homeScreenViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.openTerminalActivityIfNotLocked(i10);
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new t(this.f33984b, this.f33985c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33983a;
            if (i10 == 0) {
                ut.x.b(obj);
                Iterator it = this.f33984b.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).setConnectionOrigin(Avo.ConnectionOrigin.CONNECT_IN_CONTEXT_MENU);
                }
                ek.g gVar = this.f33985c.startSftpConnectionsUseCase;
                List list = this.f33984b;
                final HomeScreenViewModel homeScreenViewModel = this.f33985c;
                iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.n
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return HomeScreenViewModel.t.k(homeScreenViewModel, ((Integer) obj2).intValue());
                    }
                };
                this.f33983a = 1;
                if (gVar.d(list, lVar, this) == objF) {
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
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33988c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new t0(this.f33988c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33986a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._isMorePopupShows;
            boolean z10 = this.f33988c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33989a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Avo.ConnectionOrigin f33991c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Avo.ConnectionOrigin connectionOrigin, zt.e eVar) {
            super(2, eVar);
            this.f33991c = connectionOrigin;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new u(this.f33991c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33989a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (((Boolean) HomeScreenViewModel.this.isProModeActiveFlow.getValue()).booleanValue()) {
                zu.w wVar = HomeScreenViewModel.this._serialConnectParametersDialogState;
                Avo.ConnectionOrigin connectionOrigin = this.f33991c;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, new b.C0693b(connectionOrigin)));
            } else {
                HomeScreenViewModel.this.onSerialPromotionClick();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33992a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f33994c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new u0(this.f33994c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33992a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._isNewConnectionVariantsPopupVisible;
            boolean z10 = this.f33994c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33995a;

        v(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new v(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33995a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HomeScreenViewModel.this.onStartSerialConnectClick(Avo.ConnectionOrigin.CONNECTIONS_SCREEN);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33997a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f34000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v0(boolean z10, Long l10, zt.e eVar) {
            super(2, eVar);
            this.f33999c = z10;
            this.f34000d = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new v0(this.f33999c, this.f34000d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33997a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._isSnippetsDialogVisible;
            boolean z10 = this.f33999c;
            Long l10 = this.f34000d;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, z10 ? new TerminalSnippetDialogState.Presented(l10) : TerminalSnippetDialogState.Hidden.INSTANCE));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NsdSearchResult f34003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(NsdSearchResult nsdSearchResult, zt.e eVar) {
            super(2, eVar);
            this.f34003c = nsdSearchResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.dismissStartNewTerminalConnection();
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new w(this.f34003c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ActiveConnection activeConnectionA = HomeScreenViewModel.this.parseNsdResultUseCase.a(this.f34003c);
            activeConnectionA.setConnectionOrigin(Avo.ConnectionOrigin.DISCOVER_NEW_DEVICE);
            ek.h hVar = HomeScreenViewModel.this.startTerminalConnectionsUseCase;
            List listE = vt.v.e(activeConnectionA);
            final HomeScreenViewModel homeScreenViewModel = HomeScreenViewModel.this;
            hVar.a(listE, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.o
                @Override // iu.l
                public final Object invoke(Object obj2) {
                    return HomeScreenViewModel.w.k(homeScreenViewModel, ((Integer) obj2).intValue());
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34004a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34006c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new w0(this.f34006c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34004a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showNotificationsDialog;
            boolean z10 = this.f34006c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34007a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Avo.ConnectionOrigin f34010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(long j10, Avo.ConnectionOrigin connectionOrigin, zt.e eVar) {
            super(2, eVar);
            this.f34009c = j10;
            this.f34010d = connectionOrigin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(HomeScreenViewModel homeScreenViewModel, int i10) {
            homeScreenViewModel.dismissStartNewTerminalConnection();
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new x(this.f34009c, this.f34010d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34007a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Host hostS = HomeScreenViewModel.this.hostDBRepository.s(kotlin.coroutines.jvm.internal.b.e(this.f34009c));
            if (hostS != null) {
                Avo.ConnectionOrigin connectionOrigin = this.f34010d;
                final HomeScreenViewModel homeScreenViewModel = HomeScreenViewModel.this;
                hostS.setConnectionOrigin(connectionOrigin);
                homeScreenViewModel.startTerminalConnectionsUseCase.a(vt.v.e(hostS), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.p
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return HomeScreenViewModel.x.k(homeScreenViewModel, ((Integer) obj2).intValue());
                    }
                });
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34011a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34013c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34013c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new x0(this.f34013c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34011a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showStartNewTerminalConnection;
            boolean z10 = this.f34013c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34014a;

        y(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new y(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34014a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            HomeScreenViewModel.this.termiusXAnnouncementInteractor.d();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34016a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34018c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new y0(this.f34018c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34016a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._showTransferBottomSheet;
            boolean z10 = this.f34018c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34019a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SftpTransferTask f34021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(SftpTransferTask sftpTransferTask, zt.e eVar) {
            super(2, eVar);
            this.f34021c = sftpTransferTask;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new z(this.f34021c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r1.b(r2, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (r1.b(r3, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
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
                int r1 = r4.f34019a
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
                goto L68
            L1b:
                ut.x.b(r5)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r5 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.this
                ek.f r5 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.access$getResolveSftpTransferClickUseCase$p(r5)
                com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r1 = r4.f34021c
                ek.f$a r5 = r5.a(r1)
                boolean r1 = r5 instanceof ek.f.a.C0721a
                if (r1 == 0) goto L48
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.this
                yu.d r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.access$get_openDownloadedItemIntent$p(r1)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$b$a r2 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$b$a
                ek.f$a$a r5 = (ek.f.a.C0721a) r5
                java.lang.String r5 = r5.a()
                r2.<init>(r5)
                r4.f34019a = r3
                java.lang.Object r5 = r1.b(r2, r4)
                if (r5 != r0) goto L68
                goto L65
            L48:
                boolean r1 = r5 instanceof ek.f.a.b
                if (r1 == 0) goto L66
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.this
                yu.d r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.access$get_openDownloadedItemIntent$p(r1)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$b$b r3 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel$b$b
                ek.f$a$b r5 = (ek.f.a.b) r5
                java.lang.String r5 = r5.a()
                r3.<init>(r5)
                r4.f34019a = r2
                java.lang.Object r5 = r1.b(r3, r4)
                if (r5 != r0) goto L68
            L65:
                return r0
            L66:
                if (r5 != 0) goto L6b
            L68:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            L6b:
                ut.s r5 = new ut.s
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34022a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34024c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34024c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return HomeScreenViewModel.this.new z0(this.f34024c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = HomeScreenViewModel.this._isVaultsPopupVisible;
            boolean z10 = this.f34024c;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(z10)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public HomeScreenViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        SessionManager sessionManager = SessionManager.getInstance();
        this.sessionManager = sessionManager;
        ju.t.e(sessionManager, "sessionManager");
        this.startSftpConnectionsUseCase = new ek.g(sessionManager);
        this.hostDBRepository = hg.f.p().j();
        TerminalSessionHelper terminalSessionHelper = SessionManager.getInstance().terminalSessionHelper;
        this.terminalSessionHelper = terminalSessionHelper;
        this.startTerminalConnectionsUseCase = new ek.h();
        this.createLocalHostUseCase = new ek.b();
        ju.t.e(sessionManager, "sessionManager");
        this.cloneConnectionUseCase = new ek.a(sessionManager);
        this.resolveSftpTransferClickUseCase = new ek.f();
        ju.t.e(sessionManager, "sessionManager");
        this.dismissSftpTransferTaskUseCase = new ek.c(sessionManager);
        ju.t.e(sessionManager, "sessionManager");
        mk.q qVar = new mk.q(sessionManager);
        this.startSftpTransferWorkerUseCase = qVar;
        ju.t.e(sessionManager, "sessionManager");
        this.resolveConflictSftpTransferTaskUseCase = new mk.p(qVar, sessionManager);
        gj.b bVar = new gj.b(vl.g.f83702b.b());
        this.vaultsInteractor = bVar;
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        og.s sVar = new og.s(dVarM);
        this.promotionsRepository = sVar;
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        in.c cVar = new in.c(g0VarY1);
        this.teamStateRepository = cVar;
        kp.c cVar2 = new kp.c(cVar);
        this.getTeamAccessStatusUseCase = cVar2;
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        ju.t.e(cVarQ, "getKeyValueStorage(...)");
        this.isAppInLockedStateUseCase = new jn.g(cVarQ);
        this.parseNsdResultUseCase = new ek.d();
        ju.t.e(aVarN, "termiusStorage");
        ju.t.e(aVarN, "termiusStorage");
        this.prepareVaultsSelectorStateUseCase = new com.server.auditor.ssh.client.interactors.p0(aVarN, bVar, sVar, new kp.e(aVarN, sVar, cVar2));
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._showBusinessVaultsPromoFlow = dVarB;
        this.showBusinessVaultsPromoFlow = zu.h.M(dVarB);
        zu.w wVarA = zu.m0.a(b.a.f34947a);
        this._showRenameConnectionDialog = wVarA;
        this.showRenameConnectionDialog = zu.h.b(wVarA);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._showInviteTeamMember = dVarB2;
        this.showInviteTeamMember = zu.h.M(dVarB2);
        yu.d dVarB3 = yu.g.b(-2, null, null, 6, null);
        this._showSyncPersonalPromo = dVarB3;
        this.showSyncPersonalPromo = zu.h.M(dVarB3);
        yu.d dVarB4 = yu.g.b(-2, null, null, 6, null);
        this._openCreateNewVaultWebPage = dVarB4;
        this.openCreateNewVaultWebPage = zu.h.M(dVarB4);
        yu.d dVarB5 = yu.g.b(-2, null, null, 6, null);
        this._openHostEditorRequest = dVarB5;
        this.openHostEditorRequest = zu.h.M(dVarB5);
        zu.w wVarA2 = zu.m0.a(TerminalSnippetDialogState.Hidden.INSTANCE);
        this._isSnippetsDialogVisible = wVarA2;
        this.isSnippetsDialogVisible = zu.h.b(wVarA2);
        this.historyCommands = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this._isVaultsPopupVisible = zu.m0.a(bool);
        zu.w wVarA3 = zu.m0.a(bool);
        this._showStartNewConnectionSFTP = wVarA3;
        this.showStartNewConnectionSFTP = zu.h.b(wVarA3);
        zu.w wVarA4 = zu.m0.a(bool);
        this._showStartNewTerminalConnection = wVarA4;
        this.showStartNewTerminalConnection = zu.h.b(wVarA4);
        yu.d dVarB6 = yu.g.b(-2, null, null, 6, null);
        this._openTerminalScreen = dVarB6;
        this.openTerminalScreen = zu.h.M(dVarB6);
        zu.w wVarA5 = zu.m0.a(bool);
        this._isNewConnectionVariantsPopupVisible = wVarA5;
        this.isNewConnectionVariantsPopupVisible = zu.h.b(wVarA5);
        zu.w wVarA6 = zu.m0.a(b.a.f47873a);
        this._serialConnectParametersDialogState = wVarA6;
        this.serialConnectParametersDialogState = zu.h.b(wVarA6);
        yu.d dVarB7 = yu.g.b(-2, null, null, 6, null);
        this._openSerialPromotion = dVarB7;
        this.openSerialPromotion = zu.h.M(dVarB7);
        yu.d dVarB8 = yu.g.b(-2, null, null, 6, null);
        this._openConnectionsPageViaDeeplink = dVarB8;
        this.openConnectionsPageViaDeeplink = zu.h.M(dVarB8);
        this._isTermiusXAnnouncementVisible = zu.m0.a(bool);
        zu.w wVarA7 = zu.m0.a(bool);
        this._showTransferBottomSheet = wVarA7;
        yu.d dVarB9 = yu.g.b(-2, null, null, 6, null);
        this._openDownloadedItemIntent = dVarB9;
        this.openDownloadedItemIntent = zu.h.M(dVarB9);
        n0 n0Var = new n0(SessionManager.getInstance().sftpTaskManager.getSftpTransferTasks());
        wu.i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        zu.k0 k0VarP = zu.h.P(n0Var, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), vt.v.o());
        this.sftpTransferTasks = k0VarP;
        zu.k0 k0VarP2 = zu.h.P(zu.h.K(new o0(k0VarP), new j0(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this.showProgressButton = k0VarP2;
        zu.k0 k0VarP3 = zu.h.P(new p0(k0VarP), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), a.C0567a.f34945a);
        this.conflictDialogState = k0VarP3;
        this.showTransferBottomSheet = zu.h.P(zu.h.K(zu.h.i(wVarA7, k0VarP2, k0VarP3, new l0(null)), new m0(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this.isProgress = zu.h.P(new q0(k0VarP), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this.showTransferError = zu.h.P(new r0(k0VarP), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), bool);
        this.connectionTabBarItems = terminalSessionHelper.getConnectionTabBarItems();
        this.selectedConnectionStyle = terminalSessionHelper.getSelectedConnectionStyle();
        zu.w wVarA8 = zu.m0.a(bool);
        this._isMorePopupShows = wVarA8;
        this.isMorePopupShows = zu.h.b(wVarA8);
        this._isBellFeatureEnabled = zu.h.P(b2Var.Q0().c(), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), Boolean.valueOf(TermiusApplication.T()));
        this._bellState = zu.h.P(androidx.lifecycle.m.a(b2Var.D1().n()), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), null);
        this._showNotificationsDialog = zu.m0.a(bool);
        hg.d dVarM2 = com.server.auditor.ssh.client.app.a.N().M();
        ju.t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVar2 = null;
        this.termiusXAnnouncementInteractor = new b1(dVarM2, aVar2, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.g
            @Override // iu.a
            public final Object a() {
                return Boolean.valueOf(HomeScreenViewModel.termiusXAnnouncementInteractor$lambda$11());
            }
        }, 2, null);
        androidx.lifecycle.k0 k0VarO = aVarN.O();
        ju.t.e(k0VarO, "getIsProModeActiveLiveData(...)");
        zu.k0 k0VarP4 = zu.h.P(new s0(androidx.lifecycle.m.a(k0VarO)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), Boolean.valueOf(aVarN.u0()));
        this.isProModeActiveFlow = k0VarP4;
        zu.k0 k0VarP5 = zu.h.P(bVar.a(), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), vt.v.o());
        this.vaultsFlow = k0VarP5;
        this.vaultsSelectorStateFlow = zu.h.P(zu.h.j(k0VarP4, cVar.a(), cVar2.a(), k0VarP5, new a1(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), new op.n(false, null, 3, null));
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartSerialConnectClick(Avo.ConnectionOrigin connectionOrigin) {
        wu.k.d(j1.a(this), null, null, new u(connectionOrigin, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openTerminalActivityIfNotLocked(int i10) {
        wu.k.d(j1.a(this), null, null, new c0(i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalyticsAboutSelectedVaults() {
        wu.k.d(j1.a(this), null, null, new e0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean termiusXAnnouncementInteractor$lambda$11() {
        return com.server.auditor.ssh.client.app.a.N().B0();
    }

    public static /* synthetic */ void updateIsSnippetsDialogVisible$default(HomeScreenViewModel homeScreenViewModel, boolean z10, Long l10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        homeScreenViewModel.updateIsSnippetsDialogVisible(z10, l10);
    }

    public final void dismissRenameConnectionDialog() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void dismissSerialConnectParameters() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void dismissStartNewConnectionSFTP() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void dismissStartNewTerminalConnection() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void dismissTermiusXAnnouncement(int i10) {
        wu.k.d(j1.a(this), null, null, new h(i10, null), 3, null);
    }

    public final zu.k0 getConflictDialogState() {
        return this.conflictDialogState;
    }

    public final zu.k0 getConnectionTabBarItems() {
        return this.connectionTabBarItems;
    }

    public final List<String> getHistoryCommands() {
        return this.historyCommands;
    }

    public final zu.f getOpenConnectionsPageViaDeeplink() {
        return this.openConnectionsPageViaDeeplink;
    }

    public final zu.f getOpenCreateNewVaultWebPage() {
        return this.openCreateNewVaultWebPage;
    }

    public final zu.f getOpenDownloadedItemIntent() {
        return this.openDownloadedItemIntent;
    }

    public final zu.f getOpenHostEditorRequest() {
        return this.openHostEditorRequest;
    }

    public final zu.f getOpenSerialPromotion() {
        return this.openSerialPromotion;
    }

    public final zu.f getOpenTerminalScreen() {
        return this.openTerminalScreen;
    }

    public final zu.k0 getSelectedConnectionStyle() {
        return this.selectedConnectionStyle;
    }

    public final zu.k0 getSerialConnectParametersDialogState() {
        return this.serialConnectParametersDialogState;
    }

    public final zu.k0 getSftpTransferTasks() {
        return this.sftpTransferTasks;
    }

    public final zu.k0 getShowBell() {
        return zu.h.P(zu.h.h(this._isBellFeatureEnabled, this._bellState, new i0(null)), j1.a(this), g0.a.b(zu.g0.f88389a, 5000L, 0L, 2, null), BellState.HIDDEN);
    }

    public final zu.f getShowBusinessVaultsPromoFlow() {
        return this.showBusinessVaultsPromoFlow;
    }

    public final zu.f getShowInviteTeamMember() {
        return this.showInviteTeamMember;
    }

    public final zu.k0 getShowNotificationsDialog() {
        return this._showNotificationsDialog;
    }

    public final zu.k0 getShowProgressButton() {
        return this.showProgressButton;
    }

    public final zu.k0 getShowRenameConnectionDialog() {
        return this.showRenameConnectionDialog;
    }

    public final zu.k0 getShowStartNewConnectionSFTP() {
        return this.showStartNewConnectionSFTP;
    }

    public final zu.k0 getShowStartNewTerminalConnection() {
        return this.showStartNewTerminalConnection;
    }

    public final zu.f getShowSyncPersonalPromo() {
        return this.showSyncPersonalPromo;
    }

    public final zu.k0 getShowTransferBottomSheet() {
        return this.showTransferBottomSheet;
    }

    public final zu.k0 getShowTransferError() {
        return this.showTransferError;
    }

    public final zu.k0 getVaultsSelectorStateFlow() {
        return this.vaultsSelectorStateFlow;
    }

    public final zu.k0 isMorePopupShows() {
        return this.isMorePopupShows;
    }

    public final zu.k0 isNewConnectionVariantsPopupVisible() {
        return this.isNewConnectionVariantsPopupVisible;
    }

    public final zu.k0 isProgress() {
        return this.isProgress;
    }

    public final zu.k0 isSnippetsDialogVisible() {
        return this.isSnippetsDialogVisible;
    }

    public final zu.k0 isTermiusXAnnouncementVisible() {
        return this._isTermiusXAnnouncementVisible;
    }

    public final zu.k0 isVaultsPopupVisible() {
        return this._isVaultsPopupVisible;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (this.terminalSessionHelper.getSelectedConnectionTab().getValue() instanceof SelectedConnectionTab.ConnectionTabSelected) {
            this.terminalSessionHelper.updateSelectedConnectionTab(SelectedConnectionTab.VaultsTabSelected.INSTANCE);
        }
    }

    public final void onCloneAsSftpConnectionClick(TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "connectionId");
        wu.k.d(j1.a(this), null, null, new i(typedSessionId, this, null), 3, null);
    }

    public final void onCloneAsTerminalConnectionClick(TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "connectionId");
        wu.k.d(j1.a(this), null, null, new j(typedSessionId, this, null), 3, null);
    }

    public final void onCloseConnectionClick(TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "connectionId");
        if (typedSessionId instanceof TypedSessionId.Terminal) {
            this.sessionManager.disconnectTerminalSession(typedSessionId.getSessionId());
        } else if (typedSessionId instanceof TypedSessionId.Sftp) {
            this.sessionManager.disconnectSftpSession(typedSessionId.getSessionId(), true);
        } else if (!(typedSessionId instanceof TypedSessionId.PortForwarding)) {
            throw new ut.s();
        }
    }

    public final void onDismissTransferTaskItemClick(SftpTransferTask sftpTransferTask) {
        ju.t.f(sftpTransferTask, "task");
        wu.k.d(j1.a(this), null, null, new k(sftpTransferTask, null), 3, null);
    }

    public final void onDuplicateFromConnectionsScreen(TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "connectionId");
        wu.k.d(j1.a(this), null, null, new l(typedSessionId, null), 3, null);
    }

    public final void onLocalConnectClick() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    public final void onNewConnectionVariantSelected(String str) {
        ju.t.f(str, "action");
        wu.k.d(j1.a(this), null, null, new n(str, this, null), 3, null);
    }

    public final void onResolvingConflictClick(SftpTransferTask sftpTransferTask, ConflictResolve conflictResolve) {
        ju.t.f(sftpTransferTask, "task");
        ju.t.f(conflictResolve, "conflictResolve");
        wu.k.d(j1.a(this), null, null, new o(sftpTransferTask, conflictResolve, null), 3, null);
    }

    public final void onSerialPromotionClick() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onStartNewSFTPConnection(NsdSearchResult nsdSearchResult) {
        ju.t.f(nsdSearchResult, "nsdSearchResult");
        wu.k.d(j1.a(this), null, null, new q(nsdSearchResult, null), 3, null);
    }

    public final void onStartRecentTerminalConnection(long j10, Avo.ConnectionOrigin connectionOrigin) {
        ju.t.f(connectionOrigin, "connectionOrigin");
        wu.k.d(j1.a(this), null, null, new s(j10, connectionOrigin, this, null), 3, null);
    }

    public final void onStartSFTPConnectionsFromContextMenu(List<? extends Connection> list) {
        ju.t.f(list, "connections");
        wu.k.d(j1.a(this), null, null, new t(list, this, null), 3, null);
    }

    public final void onStartSerialConnectFromConnectionsEmptyScreenClick() {
        wu.k.d(j1.a(this), null, null, new v(null), 3, null);
    }

    public final void onStartTerminalConnection(NsdSearchResult nsdSearchResult) {
        ju.t.f(nsdSearchResult, "nsdSearchResult");
        wu.k.d(j1.a(this), null, null, new w(nsdSearchResult, null), 3, null);
    }

    public final void onTermiusXAnnouncementShown() {
        wu.k.d(j1.a(this), null, null, new y(null), 3, null);
    }

    public final void onTransferTaskItemClick(SftpTransferTask sftpTransferTask) {
        ju.t.f(sftpTransferTask, "task");
        wu.k.d(j1.a(this), null, null, new z(sftpTransferTask, null), 3, null);
    }

    public final void onVaultSelectorItemClick(op.l lVar) {
        ju.t.f(lVar, "vaultSelectorItem");
        wu.k.d(j1.a(this), null, null, new a0(lVar, this, null), 3, null);
    }

    public final void onVaultsButtonClick() {
        wu.k.d(j1.a(this), null, null, new b0(null), 3, null);
    }

    public final void renameConnection(TypedSessionId typedSessionId, String str) {
        ju.t.f(typedSessionId, "typedSessionId");
        ju.t.f(str, "newName");
        wu.k.d(j1.a(this), null, null, new d0(typedSessionId, this, str, null), 3, null);
    }

    public final void sendOpenConnectionsViaDeeplink() {
        wu.k.d(j1.a(this), null, null, new f0(null), 3, null);
    }

    public final void sendOpenHostEditorRequest(long j10) {
        wu.k.d(j1.a(this), null, null, new g0(j10, null), 3, null);
    }

    public final void showRenameConnectionDialog(TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "connectionId");
        wu.k.d(j1.a(this), null, null, new k0(typedSessionId, this, null), 3, null);
    }

    public final void updateIsMorePopupShows(boolean z10) {
        wu.k.d(j1.a(this), null, null, new t0(z10, null), 3, null);
    }

    public final void updateIsNewConnectionVariantsPopupVisible(boolean z10) {
        wu.k.d(j1.a(this), null, null, new u0(z10, null), 3, null);
    }

    public final void updateIsSnippetsDialogVisible(boolean z10, Long l10) {
        wu.k.d(j1.a(this), null, null, new v0(z10, l10, null), 3, null);
    }

    public final void updateSelectedTab(SelectedConnectionTab selectedConnectionTab) {
        ju.t.f(selectedConnectionTab, "tab");
        this.terminalSessionHelper.updateSelectedConnectionTab(selectedConnectionTab);
    }

    public final void updateShowNotificationsDialog(boolean z10) {
        wu.k.d(j1.a(this), null, null, new w0(z10, null), 3, null);
    }

    public final void updateShowStartNewTerminalConnectionVisible(boolean z10) {
        wu.k.d(j1.a(this), null, null, new x0(z10, null), 3, null);
    }

    public final void updateTransferBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new y0(z10, null), 3, null);
    }

    public final void updateVaultsPopupVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new z0(z10, null), 3, null);
    }

    public final void onStartNewSFTPConnection(long j10) {
        wu.k.d(j1.a(this), null, null, new r(j10, null), 3, null);
    }

    public final void onStartTerminalConnection(long j10, Avo.ConnectionOrigin connectionOrigin) {
        ju.t.f(connectionOrigin, "connectionOrigin");
        wu.k.d(j1.a(this), null, null, new x(j10, connectionOrigin, null), 3, null);
    }
}
