package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.je;
import a1.lf;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.crystalnix.termius.libtermius.wrappers.SelectedConnectionData;
import com.crystalnix.termius.libtermius.wrappers.SelectedConnectionTab;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.ConflictResolve;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.NavigationRouterActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.components.BellState;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResultWrapper;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.oe;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.qd;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KnownHostsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.LogsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.NavigationRailsRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.d;
import com.server.auditor.ssh.client.onboarding.OnboardingActivity;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hk.xb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.runtime.z2 f30507a = androidx.compose.runtime.h0.h(null, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.k2
        @Override // iu.a
        public final Object a() {
            return g6.n1();
        }
    }, 1, null);

    static final class a implements iu.p {
        final /* synthetic */ androidx.compose.runtime.l5 A;
        final /* synthetic */ androidx.compose.runtime.l5 B;
        final /* synthetic */ androidx.compose.runtime.l5 C;
        final /* synthetic */ androidx.compose.runtime.l5 D;
        final /* synthetic */ androidx.compose.runtime.l5 E;
        final /* synthetic */ androidx.compose.runtime.l5 F;
        final /* synthetic */ androidx.compose.runtime.l5 G;
        final /* synthetic */ androidx.compose.runtime.l5 H;
        final /* synthetic */ List I;
        final /* synthetic */ androidx.compose.runtime.l5 J;
        final /* synthetic */ f1.g K;
        final /* synthetic */ androidx.navigation.r1 L;
        final /* synthetic */ androidx.compose.runtime.e2 M;
        final /* synthetic */ String N;
        final /* synthetic */ androidx.compose.runtime.e2 O;
        final /* synthetic */ androidx.compose.runtime.l5 P;
        final /* synthetic */ iu.l Q;
        final /* synthetic */ androidx.compose.runtime.e2 R;
        final /* synthetic */ androidx.compose.runtime.l5 S;
        final /* synthetic */ androidx.compose.runtime.l5 T;
        final /* synthetic */ androidx.compose.runtime.l5 U;
        final /* synthetic */ androidx.compose.runtime.l5 V;
        final /* synthetic */ androidx.compose.runtime.l5 W;
        final /* synthetic */ androidx.compose.runtime.e2 X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f30508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeScreenViewModel f30509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q3.d f30512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TypedSessionId f30513f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ wu.i0 f30514u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ iu.l f30515v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30516w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30517x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30518y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30519z;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.g6$a$a, reason: collision with other inner class name */
        static final class C0473a implements iu.p {
            final /* synthetic */ androidx.compose.runtime.l5 A;
            final /* synthetic */ androidx.compose.runtime.l5 B;
            final /* synthetic */ androidx.compose.runtime.l5 C;
            final /* synthetic */ androidx.compose.runtime.l5 D;
            final /* synthetic */ androidx.compose.runtime.l5 E;
            final /* synthetic */ androidx.compose.runtime.l5 F;
            final /* synthetic */ androidx.compose.runtime.l5 G;
            final /* synthetic */ List H;
            final /* synthetic */ androidx.compose.runtime.l5 I;
            final /* synthetic */ f1.g J;
            final /* synthetic */ androidx.navigation.r1 K;
            final /* synthetic */ androidx.compose.runtime.e2 L;
            final /* synthetic */ String M;
            final /* synthetic */ androidx.compose.runtime.e2 N;
            final /* synthetic */ androidx.compose.runtime.l5 O;
            final /* synthetic */ iu.l P;
            final /* synthetic */ androidx.compose.runtime.e2 Q;
            final /* synthetic */ androidx.compose.runtime.l5 R;
            final /* synthetic */ androidx.compose.runtime.l5 S;
            final /* synthetic */ androidx.compose.runtime.l5 T;
            final /* synthetic */ androidx.compose.runtime.l5 U;
            final /* synthetic */ androidx.compose.runtime.l5 V;
            final /* synthetic */ androidx.compose.runtime.e2 W;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeScreenViewModel f30520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q3.d f30523d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TypedSessionId f30524e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ wu.i0 f30525f;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ iu.l f30526u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30527v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30528w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30529x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30530y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f30531z;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.g6$a$a$a, reason: collision with other inner class name */
            static final class C0474a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f30532a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ iu.l f30533b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f30534c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0474a(iu.l lVar, long j10, zt.e eVar) {
                    super(2, eVar);
                    this.f30533b = lVar;
                    this.f30534c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new C0474a(this.f30533b, this.f30534c, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    au.b.f();
                    if (this.f30532a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    this.f30533b.invoke(kotlin.coroutines.jvm.internal.b.d((int) this.f30534c));
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((C0474a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.g6$a$a$b */
            static final class b implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f30535a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ iu.l f30536b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.e2 f30537c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.l5 f30538d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.e2 f30539e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.e2 f30540f;

                b(androidx.navigation.r1 r1Var, iu.l lVar, androidx.compose.runtime.e2 e2Var, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.e2 e2Var2, androidx.compose.runtime.e2 e2Var3) {
                    this.f30535a = r1Var;
                    this.f30536b = lVar;
                    this.f30537c = e2Var;
                    this.f30538d = l5Var;
                    this.f30539e = e2Var2;
                    this.f30540f = e2Var3;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.compose.runtime.e2 e2Var) {
                    g6.y0(e2Var, false);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.compose.runtime.e2 e2Var) {
                    g6.n0(e2Var, null);
                    return ut.m0.f82633a;
                }

                public final void e(androidx.compose.runtime.m mVar, int i10) {
                    if ((i10 & 3) == 2 && mVar.h()) {
                        mVar.M();
                        return;
                    }
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-1906146823, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:588)");
                    }
                    NavigationRailsRoute navigationRailsRouteQ0 = g6.Q0(this.f30537c);
                    boolean zF0 = g6.f0(this.f30538d);
                    boolean zX0 = g6.x0(this.f30539e);
                    oe oeVarM0 = g6.m0(this.f30540f);
                    androidx.navigation.r1 r1Var = this.f30535a;
                    iu.l lVar = this.f30536b;
                    mVar.W(5004770);
                    final androidx.compose.runtime.e2 e2Var = this.f30539e;
                    Object objD = mVar.D();
                    m.a aVar = androidx.compose.runtime.m.f5359a;
                    if (objD == aVar.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.h6
                            @Override // iu.a
                            public final Object a() {
                                return g6.a.C0473a.b.g(e2Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar2 = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    final androidx.compose.runtime.e2 e2Var2 = this.f30540f;
                    Object objD2 = mVar.D();
                    if (objD2 == aVar.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.i6
                            @Override // iu.a
                            public final Object a() {
                                return g6.a.C0473a.b.h(e2Var2);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    g6.e1(r1Var, navigationRailsRouteQ0, null, zF0, lVar, zX0, aVar2, oeVarM0, (iu.a) objD2, mVar, 102260736, 4);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    e((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                    return ut.m0.f82633a;
                }
            }

            C0473a(HomeScreenViewModel homeScreenViewModel, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, q3.d dVar, TypedSessionId typedSessionId, wu.i0 i0Var, iu.l lVar, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, androidx.compose.runtime.l5 l5Var5, androidx.compose.runtime.l5 l5Var6, androidx.compose.runtime.l5 l5Var7, androidx.compose.runtime.l5 l5Var8, androidx.compose.runtime.l5 l5Var9, androidx.compose.runtime.l5 l5Var10, androidx.compose.runtime.l5 l5Var11, androidx.compose.runtime.l5 l5Var12, androidx.compose.runtime.l5 l5Var13, androidx.compose.runtime.l5 l5Var14, List list, androidx.compose.runtime.l5 l5Var15, f1.g gVar, androidx.navigation.r1 r1Var, androidx.compose.runtime.e2 e2Var, String str, androidx.compose.runtime.e2 e2Var2, androidx.compose.runtime.l5 l5Var16, iu.l lVar2, androidx.compose.runtime.e2 e2Var3, androidx.compose.runtime.l5 l5Var17, androidx.compose.runtime.l5 l5Var18, androidx.compose.runtime.l5 l5Var19, androidx.compose.runtime.l5 l5Var20, androidx.compose.runtime.l5 l5Var21, androidx.compose.runtime.e2 e2Var4) {
                this.f30520a = homeScreenViewModel;
                this.f30521b = l5Var;
                this.f30522c = l5Var2;
                this.f30523d = dVar;
                this.f30524e = typedSessionId;
                this.f30525f = i0Var;
                this.f30526u = lVar;
                this.f30527v = l5Var3;
                this.f30528w = l5Var4;
                this.f30529x = l5Var5;
                this.f30530y = l5Var6;
                this.f30531z = l5Var7;
                this.A = l5Var8;
                this.B = l5Var9;
                this.C = l5Var10;
                this.D = l5Var11;
                this.E = l5Var12;
                this.F = l5Var13;
                this.G = l5Var14;
                this.H = list;
                this.I = l5Var15;
                this.J = gVar;
                this.K = r1Var;
                this.L = e2Var;
                this.M = str;
                this.N = e2Var2;
                this.O = l5Var16;
                this.P = lVar2;
                this.Q = e2Var3;
                this.R = l5Var17;
                this.S = l5Var18;
                this.T = l5Var19;
                this.U = l5Var20;
                this.V = l5Var21;
                this.W = e2Var4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 A0(HomeScreenViewModel homeScreenViewModel, long j10) {
                homeScreenViewModel.onStartNewSFTPConnection(j10);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 B0(HomeScreenViewModel homeScreenViewModel, NsdSearchResult nsdSearchResult) {
                ju.t.f(nsdSearchResult, "result");
                homeScreenViewModel.onStartNewSFTPConnection(nsdSearchResult);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 C0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.dismissStartNewTerminalConnection();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 D0(HomeScreenViewModel homeScreenViewModel, long j10) {
                homeScreenViewModel.onStartTerminalConnection(j10, Avo.ConnectionOrigin.QUICK_CONNECT);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 E0(HomeScreenViewModel homeScreenViewModel, long j10) {
                homeScreenViewModel.onStartTerminalConnection(j10, Avo.ConnectionOrigin.QUICK_CONNECT_RECENT);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 F0(HomeScreenViewModel homeScreenViewModel, long j10) {
                homeScreenViewModel.onStartRecentTerminalConnection(j10, Avo.ConnectionOrigin.QUICK_CONNECT_RECENT);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 G0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.onSerialPromotionClick();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 H0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.onLocalConnectClick();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 I0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.dismissStartNewTerminalConnection();
                homeScreenViewModel.onNewConnectionVariantSelected("sftp");
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 J0(HomeScreenViewModel homeScreenViewModel, NsdSearchResult nsdSearchResult) {
                ju.t.f(nsdSearchResult, "result");
                homeScreenViewModel.onStartTerminalConnection(nsdSearchResult);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 K0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.dismissSerialConnectParameters();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 L0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateShowNotificationsDialog(false);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 M0(HomeScreenViewModel homeScreenViewModel, TypedSessionId typedSessionId, String str) {
                ju.t.f(typedSessionId, "typedSessionId");
                ju.t.f(str, "newName");
                homeScreenViewModel.renameConnection(typedSessionId, str);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 N0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.dismissRenameConnectionDialog();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 O0(androidx.compose.runtime.e2 e2Var) {
                g6.Z0(e2Var, null);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 X(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.onTermiusXAnnouncementShown();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 Y(HomeScreenViewModel homeScreenViewModel, int i10) {
                homeScreenViewModel.dismissTermiusXAnnouncement(i10);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 Z(HomeScreenViewModel homeScreenViewModel, boolean z10) {
                homeScreenViewModel.updateIsMorePopupShows(z10);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 a0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateIsNewConnectionVariantsPopupVisible(true);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 b0(HomeScreenViewModel homeScreenViewModel, TypedSessionId typedSessionId) {
                ju.t.f(typedSessionId, "it");
                homeScreenViewModel.onCloneAsTerminalConnectionClick(typedSessionId);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 c0(HomeScreenViewModel homeScreenViewModel, TypedSessionId typedSessionId) {
                ju.t.f(typedSessionId, "it");
                homeScreenViewModel.onCloneAsSftpConnectionClick(typedSessionId);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 d0(HomeScreenViewModel homeScreenViewModel, TypedSessionId typedSessionId) {
                ju.t.f(typedSessionId, "it");
                homeScreenViewModel.showRenameConnectionDialog(typedSessionId);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e0(long j10) {
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 f0(HomeScreenViewModel homeScreenViewModel, TypedSessionId typedSessionId) {
                ju.t.f(typedSessionId, "it");
                homeScreenViewModel.onCloseConnectionClick(typedSessionId);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 g0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateTransferBottomSheetVisibility(true);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 h0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateShowNotificationsDialog(true);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 i0(HomeScreenViewModel homeScreenViewModel, String str) {
                ju.t.f(str, "action");
                homeScreenViewModel.onNewConnectionVariantSelected(str);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 j0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateIsNewConnectionVariantsPopupVisible(false);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 k0(HomeScreenViewModel homeScreenViewModel) {
                SelectedConnectionTab selectedConnectionTab = (SelectedConnectionTab) SessionManager.getInstance().terminalSessionHelper.getSelectedConnectionTab().getValue();
                SelectedConnectionTab.VaultsTabSelected vaultsTabSelected = SelectedConnectionTab.VaultsTabSelected.INSTANCE;
                if (ju.t.b(selectedConnectionTab, vaultsTabSelected)) {
                    homeScreenViewModel.onVaultsButtonClick();
                } else {
                    homeScreenViewModel.updateSelectedTab(vaultsTabSelected);
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 l0(HomeScreenViewModel homeScreenViewModel, wu.i0 i0Var, iu.l lVar, long j10) {
                homeScreenViewModel.updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(j10));
                wu.k.d(i0Var, null, null, new C0474a(lVar, j10, null), 3, null);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 m0(HomeScreenViewModel homeScreenViewModel, op.l lVar) {
                ju.t.f(lVar, "it");
                homeScreenViewModel.onVaultSelectorItemClick(lVar);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 n0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateVaultsPopupVisibility(false);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 o0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateTransferBottomSheetVisibility(false);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 p0(HomeScreenViewModel homeScreenViewModel, SftpTransferTask sftpTransferTask) {
                ju.t.f(sftpTransferTask, "it");
                homeScreenViewModel.onTransferTaskItemClick(sftpTransferTask);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 q0(HomeScreenViewModel homeScreenViewModel, SftpTransferTask sftpTransferTask) {
                ju.t.f(sftpTransferTask, "it");
                homeScreenViewModel.onDismissTransferTaskItemClick(sftpTransferTask);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 r0(HomeScreenViewModel homeScreenViewModel, SftpTransferTask sftpTransferTask, ConflictResolve conflictResolve) {
                ju.t.f(sftpTransferTask, "resolvingTask");
                ju.t.f(conflictResolve, "resolve");
                if (conflictResolve == ConflictResolve.Cancel) {
                    homeScreenViewModel.onDismissTransferTaskItemClick(sftpTransferTask);
                } else {
                    homeScreenViewModel.onResolvingConflictClick(sftpTransferTask, conflictResolve);
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 s0(HomeScreenViewModel homeScreenViewModel, op.l lVar) {
                ju.t.f(lVar, "it");
                homeScreenViewModel.onVaultSelectorItemClick(lVar);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 t0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.updateVaultsPopupVisibility(false);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 u0(List list, f1.g gVar, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, final androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, final androidx.navigation.r1 r1Var, final androidx.compose.runtime.e2 e2Var, final androidx.compose.runtime.e2 e2Var2, f1.a0 a0Var) {
                ju.t.f(a0Var, "$this$NavigationSuiteScaffold");
                if (g6.f0(l5Var)) {
                    g6.e2(a0Var, g6.Q0(e2Var2), gVar, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.x5
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return g6.a.C0473a.y0(e2Var2, (NavigationRailsRoute) obj);
                        }
                    });
                } else {
                    List listA = g6.A0(l5Var2).a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listA) {
                        if (obj instanceof d.a) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((d.a) it.next()).a());
                    }
                    g6.c2(a0Var, list, new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.y(arrayList2), g6.u0(l5Var3), gVar, g6.C0(l5Var4), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.w5
                        @Override // iu.l
                        public final Object invoke(Object obj2) {
                            return g6.a.C0473a.v0(r1Var, l5Var3, e2Var, (HomeScreenBottomNavItem) obj2);
                        }
                    });
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 v0(final androidx.navigation.r1 r1Var, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.e2 e2Var, HomeScreenBottomNavItem homeScreenBottomNavItem) {
                ju.t.f(homeScreenBottomNavItem, "it");
                if (ju.t.b(g6.u0(l5Var), HomeScreenBottomNavItem.Vaults.INSTANCE) && ju.t.b(g6.u0(l5Var), homeScreenBottomNavItem)) {
                    g6.y0(e2Var, true);
                } else {
                    r1Var.Q(homeScreenBottomNavItem, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.y5
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return g6.a.C0473a.w0(r1Var, (androidx.navigation.v1) obj);
                        }
                    });
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 w0(androidx.navigation.r1 r1Var, androidx.navigation.v1 v1Var) {
                ju.t.f(v1Var, "$this$navigate");
                v1Var.d(androidx.navigation.m1.f10115w.d(r1Var.w()).q(), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.z5
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return g6.a.C0473a.x0((androidx.navigation.k2) obj);
                    }
                });
                v1Var.h(true);
                v1Var.l(true);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 x0(androidx.navigation.k2 k2Var) {
                ju.t.f(k2Var, "$this$popUpTo");
                k2Var.d(true);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 y0(androidx.compose.runtime.e2 e2Var, NavigationRailsRoute navigationRailsRoute) {
                ju.t.f(navigationRailsRoute, "it");
                g6.a1(e2Var, navigationRailsRoute);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 z0(HomeScreenViewModel homeScreenViewModel) {
                homeScreenViewModel.dismissStartNewConnectionSFTP();
                return ut.m0.f82633a;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x03de  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0403  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0428  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0445  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x044e  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x04db  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x055c  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x056d  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x05f1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void W(androidx.compose.runtime.m r73, int r74) {
                /*
                    Method dump skipped, instruction units count: 2835
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.g6.a.C0473a.W(androidx.compose.runtime.m, int):void");
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                W((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return ut.m0.f82633a;
            }
        }

        a(long j10, HomeScreenViewModel homeScreenViewModel, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, q3.d dVar, TypedSessionId typedSessionId, wu.i0 i0Var, iu.l lVar, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, androidx.compose.runtime.l5 l5Var5, androidx.compose.runtime.l5 l5Var6, androidx.compose.runtime.l5 l5Var7, androidx.compose.runtime.l5 l5Var8, androidx.compose.runtime.l5 l5Var9, androidx.compose.runtime.l5 l5Var10, androidx.compose.runtime.l5 l5Var11, androidx.compose.runtime.l5 l5Var12, androidx.compose.runtime.l5 l5Var13, androidx.compose.runtime.l5 l5Var14, List list, androidx.compose.runtime.l5 l5Var15, f1.g gVar, androidx.navigation.r1 r1Var, androidx.compose.runtime.e2 e2Var, String str, androidx.compose.runtime.e2 e2Var2, androidx.compose.runtime.l5 l5Var16, iu.l lVar2, androidx.compose.runtime.e2 e2Var3, androidx.compose.runtime.l5 l5Var17, androidx.compose.runtime.l5 l5Var18, androidx.compose.runtime.l5 l5Var19, androidx.compose.runtime.l5 l5Var20, androidx.compose.runtime.l5 l5Var21, androidx.compose.runtime.e2 e2Var4) {
            this.f30508a = j10;
            this.f30509b = homeScreenViewModel;
            this.f30510c = l5Var;
            this.f30511d = l5Var2;
            this.f30512e = dVar;
            this.f30513f = typedSessionId;
            this.f30514u = i0Var;
            this.f30515v = lVar;
            this.f30516w = l5Var3;
            this.f30517x = l5Var4;
            this.f30518y = l5Var5;
            this.f30519z = l5Var6;
            this.A = l5Var7;
            this.B = l5Var8;
            this.C = l5Var9;
            this.D = l5Var10;
            this.E = l5Var11;
            this.F = l5Var12;
            this.G = l5Var13;
            this.H = l5Var14;
            this.I = list;
            this.J = l5Var15;
            this.K = gVar;
            this.L = r1Var;
            this.M = e2Var;
            this.N = str;
            this.O = e2Var2;
            this.P = l5Var16;
            this.Q = lVar2;
            this.R = e2Var3;
            this.S = l5Var17;
            this.T = l5Var18;
            this.U = l5Var19;
            this.V = l5Var20;
            this.W = l5Var21;
            this.X = e2Var4;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(369685872, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.HomeScreen.<anonymous> (HomeScreen.kt:369)");
            }
            je.c(androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null), null, this.f30508a, 0L, 0.0f, 0.0f, null, q1.h.d(-1514550539, true, new C0473a(this.f30509b, this.f30510c, this.f30511d, this.f30512e, this.f30513f, this.f30514u, this.f30515v, this.f30516w, this.f30517x, this.f30518y, this.f30519z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X), mVar, 54), mVar, 12582918, 122);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f30542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.l5 l5Var, zt.e eVar) {
            super(2, eVar);
            this.f30542b = l5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f30542b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30541a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SessionManager.getInstance().terminalSessionHelper.updateUpdateIsTabletLayout(g6.f0(this.f30542b));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f30544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, int i10, zt.e eVar) {
            super(2, eVar);
            this.f30544b = activity;
            this.f30545c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f30544b, this.f30545c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TerminalConnectionManager.openActiveTerminalSession(this.f30544b, this.f30545c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f30546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f30548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ oe f30549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f30550e;

        d(iu.l lVar, boolean z10, iu.a aVar, oe oeVar, iu.a aVar2) {
            this.f30546a = lVar;
            this.f30547b = z10;
            this.f30548c = aVar;
            this.f30549d = oeVar;
            this.f30550e = aVar2;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1503898920, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.HomeScreenNavGraph.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:718)");
            }
            tk.l.f(null, this.f30546a, this.f30547b, this.f30548c, this.f30549d, this.f30550e, mVar, 0, 1);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class e implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f30551a;

        e(iu.l lVar) {
            this.f30551a = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1990260687, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.HomeScreenNavGraph.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:731)");
            }
            c1.g(this.f30551a, null, mVar, 0, 2);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class f implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.p f30552a;

        f(iu.p pVar) {
            this.f30552a = pVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1877196019, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ProvideScreenMetrics.<anonymous> (HomeScreen.kt:1243)");
            }
            this.f30552a.invoke(mVar, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    public static final class g implements androidx.compose.runtime.w0 {
        @Override // androidx.compose.runtime.w0
        public void dispose() {
        }
    }

    static final class h implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeScreenBottomNavItem f30553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.y f30554b;

        h(HomeScreenBottomNavItem homeScreenBottomNavItem, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.y yVar) {
            this.f30553a = homeScreenBottomNavItem;
            this.f30554b = yVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1321123440, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.homeScreenBottomNavBar.<anonymous>.<anonymous> (HomeScreen.kt:918)");
            }
            HomeScreenBottomNavItem homeScreenBottomNavItem = this.f30553a;
            if (ju.t.b(homeScreenBottomNavItem, HomeScreenBottomNavItem.Connections.INSTANCE)) {
                mVar.W(1710697085);
                bk.q2.b(this.f30554b, mVar, 0);
                mVar.Q();
            } else if (ju.t.b(homeScreenBottomNavItem, HomeScreenBottomNavItem.Settings.INSTANCE)) {
                mVar.W(1710702356);
                bk.u2.d(this.f30553a, mVar, 0);
                mVar.Q();
            } else {
                if (!ju.t.b(homeScreenBottomNavItem, HomeScreenBottomNavItem.Vaults.INSTANCE)) {
                    mVar.W(1710694746);
                    mVar.Q();
                    throw new ut.s();
                }
                mVar.W(1710705268);
                bk.u2.d(this.f30553a, mVar, 0);
                mVar.Q();
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class i implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeScreenBottomNavItem f30555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30556b;

        i(HomeScreenBottomNavItem homeScreenBottomNavItem, boolean z10) {
            this.f30555a = homeScreenBottomNavItem;
            this.f30556b = z10;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            e3.i3 i3VarB;
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1939093357, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.homeScreenBottomNavBar.<anonymous>.<anonymous> (HomeScreen.kt:928)");
            }
            String strB = z2.h.b(this.f30555a.getTitleResId(), mVar, 0);
            if (this.f30556b) {
                mVar.W(-219925515);
                i3VarB = qk.a.f74718a.b(mVar, 6).d();
                mVar.Q();
            } else {
                mVar.W(-219830407);
                i3VarB = qk.a.f74718a.b(mVar, 6).b();
                mVar.Q();
            }
            lf.j(strB, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, p3.v.f69845a.b(), false, 1, 0, null, i3VarB, mVar, 0, 24960, 110590);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class j implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeScreenBottomNavItem f30557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BellState f30558b;

        j(HomeScreenBottomNavItem homeScreenBottomNavItem, BellState bellState) {
            this.f30557a = homeScreenBottomNavItem;
            this.f30558b = bellState;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            BellState bellState;
            BellState bellState2;
            long jN;
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(512238229, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.homeScreenBottomNavBar.<anonymous>.<anonymous> (HomeScreen.kt:904)");
            }
            if (ju.t.b(this.f30557a, HomeScreenBottomNavItem.Settings.INSTANCE) && ((bellState = this.f30558b) == (bellState2 = BellState.CRITICAL) || bellState == BellState.MEDIUM)) {
                if (bellState == bellState2) {
                    mVar.W(70583113);
                    jN = qk.a.f74718a.a(mVar, 6).s();
                    mVar.Q();
                } else {
                    mVar.W(70688203);
                    jN = qk.a.f74718a.a(mVar, 6).n();
                    mVar.Q();
                }
                a1.k0.f(null, jN, 0L, null, mVar, 0, 13);
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class k implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NavigationRailsRoute f30559a;

        k(NavigationRailsRoute navigationRailsRoute) {
            this.f30559a = navigationRailsRoute;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(256592541, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.homeScreenRailsNavBar.<anonymous>.<anonymous> (HomeScreen.kt:803)");
            }
            NavigationRailsRoute navigationRailsRoute = this.f30559a;
            if (ju.t.b(navigationRailsRoute, HostsNavGraphRoute.HostsRoute.INSTANCE)) {
                mVar.W(1772299011);
                bk.u2.f(R.drawable.ic_nav_hosts, R.string.vaults_navigation_hosts, mVar, 54);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, SnippetsNavGraphRoute.SnippetsRoute.INSTANCE)) {
                mVar.W(1772306281);
                bk.u2.f(R.drawable.ic_nav_snippets, R.string.vaults_navigation_snippets, mVar, 54);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, PortForwardingNavGraphRoute.PortForwardingRoute.INSTANCE)) {
                mVar.W(1772314135);
                bk.u2.f(R.drawable.ic_nav_port_forwarding, R.string.vaults_navigation_port_forwarding, mVar, 54);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, KeychainNavGraphRoute.KeychainRoute.INSTANCE)) {
                mVar.W(1772322025);
                bk.u2.f(R.drawable.ic_nav_keychain, R.string.vaults_navigation_keychain, mVar, 54);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, KnownHostsNavGraphRoute.KnownHostsRoute.INSTANCE)) {
                mVar.W(1772329615);
                bk.u2.f(R.drawable.ic_nav_known_hosts, R.string.vaults_navigation_known_hosts, mVar, 54);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, LogsNavGraphRoute.LogsRoute.INSTANCE)) {
                mVar.W(1772336996);
                bk.u2.f(R.drawable.ic_nav_history, R.string.vaults_navigation_logs, mVar, 54);
                mVar.Q();
            } else {
                if (!ju.t.b(navigationRailsRoute, HomeScreenBottomNavItem.Settings.INSTANCE)) {
                    mVar.W(1772298262);
                    mVar.Q();
                    throw new ut.s();
                }
                mVar.W(1772344186);
                bk.u2.f(R.drawable.ic_nav_settings, R.string.preferences, mVar, 54);
                mVar.Q();
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class l implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NavigationRailsRoute f30560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30561b;

        l(NavigationRailsRoute navigationRailsRoute, boolean z10) {
            this.f30560a = navigationRailsRoute;
            this.f30561b = z10;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1276443936, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.homeScreenRailsNavBar.<anonymous>.<anonymous> (HomeScreen.kt:841)");
            }
            NavigationRailsRoute navigationRailsRoute = this.f30560a;
            if (ju.t.b(navigationRailsRoute, HostsNavGraphRoute.HostsRoute.INSTANCE)) {
                mVar.W(1698027116);
                bk.u2.h(R.string.vaults_navigation_hosts, this.f30561b, mVar, 6);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, KeychainNavGraphRoute.KeychainRoute.INSTANCE)) {
                mVar.W(1698033551);
                bk.u2.h(R.string.vaults_navigation_keychain, this.f30561b, mVar, 6);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, PortForwardingNavGraphRoute.PortForwardingRoute.INSTANCE)) {
                mVar.W(1698040476);
                bk.u2.h(R.string.vaults_navigation_port_forwarding_short, this.f30561b, mVar, 6);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, SnippetsNavGraphRoute.SnippetsRoute.INSTANCE)) {
                mVar.W(1698047407);
                bk.u2.h(R.string.vaults_navigation_snippets, this.f30561b, mVar, 6);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, KnownHostsNavGraphRoute.KnownHostsRoute.INSTANCE)) {
                mVar.W(1698054066);
                bk.u2.h(R.string.vaults_navigation_known_hosts, this.f30561b, mVar, 6);
                mVar.Q();
            } else if (ju.t.b(navigationRailsRoute, LogsNavGraphRoute.LogsRoute.INSTANCE)) {
                mVar.W(1698060427);
                bk.u2.h(R.string.vaults_navigation_logs, this.f30561b, mVar, 6);
                mVar.Q();
            } else {
                if (!ju.t.b(navigationRailsRoute, HomeScreenBottomNavItem.Settings.INSTANCE)) {
                    mVar.W(1698026190);
                    mVar.Q();
                    throw new ut.s();
                }
                mVar.W(1698066720);
                bk.u2.h(R.string.preferences, this.f30561b, mVar, 6);
                mVar.Q();
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class m implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ oe f30563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f30564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.l f30566e;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ oe f30568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.a f30569c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a2.h f30570d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.d3 f30571e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f30572f;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ iu.l f30573u;

            a(boolean z10, oe oeVar, iu.a aVar, a2.h hVar, androidx.compose.ui.platform.d3 d3Var, androidx.navigation.r1 r1Var, iu.l lVar) {
                this.f30567a = z10;
                this.f30568b = oeVar;
                this.f30569c = aVar;
                this.f30570d = hVar;
                this.f30571e = d3Var;
                this.f30572f = r1Var;
                this.f30573u = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 g(a2.h hVar, androidx.compose.ui.platform.d3 d3Var, androidx.navigation.r1 r1Var) {
                hVar.v(true);
                if (d3Var != null) {
                    d3Var.a();
                }
                if (r1Var.A() != null) {
                    r1Var.S();
                } else {
                    r1Var.Q(HomeScreenBottomNavItem.Vaults.INSTANCE, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.k6
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return g6.m.a.h((androidx.navigation.v1) obj);
                        }
                    });
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 h(androidx.navigation.v1 v1Var) {
                ju.t.f(v1Var, "$this$navigate");
                androidx.navigation.v1.f(v1Var, 0, null, 2, null);
                return ut.m0.f82633a;
            }

            public final void e(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(kVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(832309552, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerHostsScreenComposable.<anonymous>.<anonymous> (HomeScreen.kt:975)");
                }
                boolean z10 = !this.f30567a;
                oe oeVar = this.f30568b;
                iu.a aVar = this.f30569c;
                mVar.W(-1746271574);
                boolean zF = mVar.F(this.f30570d) | mVar.V(this.f30571e) | mVar.F(this.f30572f);
                final a2.h hVar = this.f30570d;
                final androidx.compose.ui.platform.d3 d3Var = this.f30571e;
                final androidx.navigation.r1 r1Var = this.f30572f;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.j6
                        @Override // iu.a
                        public final Object a() {
                            return g6.m.a.g(hVar, d3Var, r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                qd.u0(z10, oeVar, aVar, (iu.a) objD, kVar.a(), this.f30573u, null, null, null, mVar, 0, 448);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        m(boolean z10, oe oeVar, iu.a aVar, androidx.navigation.r1 r1Var, iu.l lVar) {
            this.f30562a = z10;
            this.f30563b = oeVar;
            this.f30564c = aVar;
            this.f30565d = r1Var;
            this.f30566e = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1498520358, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerHostsScreenComposable.<anonymous> (HomeScreen.kt:972)");
            }
            androidx.compose.ui.platform.d3 d3Var = (androidx.compose.ui.platform.d3) mVar.n(androidx.compose.ui.platform.s1.q());
            z.j.c(null, null, false, q1.h.d(832309552, true, new a(this.f30562a, this.f30563b, this.f30564c, (a2.h) mVar.n(androidx.compose.ui.platform.s1.h()), d3Var, this.f30565d, this.f30566e), mVar, 54), mVar, 3072, 7);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class n implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f30576c;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30577a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f30578b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f30579c;

            a(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
                this.f30577a = z10;
                this.f30578b = r1Var;
                this.f30579c = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(androidx.navigation.r1 r1Var) {
                r1Var.S();
                return ut.m0.f82633a;
            }

            public final void d(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(kVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(1374306479, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerKeychainScreenComposable.<anonymous>.<anonymous> (HomeScreen.kt:1093)");
                }
                boolean z10 = !this.f30577a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f30578b);
                final androidx.navigation.r1 r1Var = this.f30578b;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.l6
                        @Override // iu.a
                        public final Object a() {
                            return g6.n.a.e(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                xb.Z(z10, (iu.a) objD, kVar.a(), this.f30579c, null, null, null, mVar, 0, 112);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        n(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
            this.f30574a = z10;
            this.f30575b = r1Var;
            this.f30576c = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(854814021, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerKeychainScreenComposable.<anonymous> (HomeScreen.kt:1092)");
            }
            z.j.c(null, null, false, q1.h.d(1374306479, true, new a(this.f30574a, this.f30575b, this.f30576c), mVar, 54), mVar, 3072, 7);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class o implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f30582c;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f30584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f30585c;

            a(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
                this.f30583a = z10;
                this.f30584b = r1Var;
                this.f30585c = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(androidx.navigation.r1 r1Var) {
                r1Var.S();
                return ut.m0.f82633a;
            }

            public final void d(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(kVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-412984652, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerKnownHostScreenComposable.<anonymous>.<anonymous> (HomeScreen.kt:1129)");
                }
                boolean z10 = !this.f30583a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f30584b);
                final androidx.navigation.r1 r1Var = this.f30584b;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.m6
                        @Override // iu.a
                        public final Object a() {
                            return g6.o.a.e(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                com.server.auditor.ssh.client.navigation.ui.compose.knownhosts.p0.E(z10, (iu.a) objD, kVar.a(), this.f30585c, null, null, mVar, 0, 48);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        o(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
            this.f30580a = z10;
            this.f30581b = r1Var;
            this.f30582c = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(662618334, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerKnownHostScreenComposable.<anonymous> (HomeScreen.kt:1128)");
            }
            z.j.c(null, null, false, q1.h.d(-412984652, true, new a(this.f30580a, this.f30581b, this.f30582c), mVar, 54), mVar, 3072, 7);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class p implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30587b;

        p(boolean z10, androidx.navigation.r1 r1Var) {
            this.f30586a = z10;
            this.f30587b = r1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(androidx.navigation.r1 r1Var) {
            r1Var.S();
            return ut.m0.f82633a;
        }

        public final void d(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(136629221, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerLogsScreenComposable.<anonymous> (HomeScreen.kt:1163)");
            }
            boolean z10 = !this.f30586a;
            mVar.W(5004770);
            boolean zF = mVar.F(this.f30587b);
            final androidx.navigation.r1 r1Var = this.f30587b;
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.n6
                    @Override // iu.a
                    public final Object a() {
                        return g6.p.e(r1Var);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            uo.i5.e(z10, (iu.a) objD, null, null, null, mVar, 0, 28);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            d((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class q implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f30590c;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30591a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f30592b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f30593c;

            a(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
                this.f30591a = z10;
                this.f30592b = r1Var;
                this.f30593c = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(androidx.navigation.r1 r1Var) {
                r1Var.S();
                return ut.m0.f82633a;
            }

            public final void d(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(kVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1539158658, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerPortForwardingsScreenComposable.<anonymous>.<anonymous> (HomeScreen.kt:1057)");
                }
                boolean z10 = !this.f30591a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f30592b);
                final androidx.navigation.r1 r1Var = this.f30592b;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.o6
                        @Override // iu.a
                        public final Object a() {
                            return g6.q.a.e(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                jk.q6.C(z10, (iu.a) objD, kVar.a(), this.f30593c, null, null, null, mVar, 0, 112);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        q(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
            this.f30588a = z10;
            this.f30589b = r1Var;
            this.f30590c = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-926946264, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerPortForwardingsScreenComposable.<anonymous> (HomeScreen.kt:1056)");
            }
            z.j.c(null, null, false, q1.h.d(-1539158658, true, new a(this.f30588a, this.f30589b, this.f30590c), mVar, 54), mVar, 3072, 7);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class r implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f30595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f30596c;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f30598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f30599c;

            a(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
                this.f30597a = z10;
                this.f30598b = r1Var;
                this.f30599c = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(androidx.navigation.r1 r1Var) {
                r1Var.S();
                return ut.m0.f82633a;
            }

            public final void d(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i10 |= mVar.V(kVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1744101917, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerSnippetsScreenComposable.<anonymous>.<anonymous> (HomeScreen.kt:1021)");
                }
                boolean z10 = !this.f30597a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f30598b);
                final androidx.navigation.r1 r1Var = this.f30598b;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.p6
                        @Override // iu.a
                        public final Object a() {
                            return g6.r.a.e(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                ok.k9.P(z10, (iu.a) objD, kVar.a(), this.f30599c, null, null, mVar, 0, 48);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        r(boolean z10, androidx.navigation.r1 r1Var, iu.l lVar) {
            this.f30594a = z10;
            this.f30595b = r1Var;
            this.f30596c = lVar;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(2031372921, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.registerSnippetsScreenComposable.<anonymous> (HomeScreen.kt:1020)");
            }
            z.j.c(null, null, false, q1.h.d(-1744101917, true, new a(this.f30594a, this.f30595b, this.f30596c), mVar, 54), mVar, 3072, 7);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z A0(androidx.compose.runtime.l5 l5Var) {
        return (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z) l5Var.getValue();
    }

    public static final void A2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10, iu.l lVar) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        ju.t.f(lVar, "onUpdateNavBarMustBeHidden");
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.j3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.B2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.k3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.C2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.l3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.D2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.m3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.E2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(-926946264, true, new q(z10, r1Var, lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(PortForwardingNavGraphRoute.PortForwardingRoute.class), vt.s0.h(), vt.v.o(), lVar2, lVar3, lVar4, lVar5, null, bVarB);
    }

    private static final SelectedConnectionData B0(androidx.compose.runtime.l5 l5Var) {
        return (SelectedConnectionData) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h B2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BellState C0(androidx.compose.runtime.l5 l5Var) {
        return (BellState) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j C2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h D2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j E2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    public static final void F2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10, iu.l lVar) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        ju.t.f(lVar, "onUpdateNavBarMustBeHidden");
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.n3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.G2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.o3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.H2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.p3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.I2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.q3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.J2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(2031372921, true, new r(z10, r1Var, lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(SnippetsNavGraphRoute.SnippetsRoute.class), vt.s0.h(), vt.v.o(), lVar2, lVar3, lVar4, lVar5, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h G2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.b H0(androidx.compose.runtime.l5 l5Var) {
        return (dk.b) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j H2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 I0(Activity activity, wu.i0 i0Var, int i10) {
        if (activity != null) {
            wu.k.d(i0Var, null, null, new c(activity, i10, null), 3, null);
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h I2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 J0(iu.l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j J2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.e2 K0() {
        return androidx.compose.runtime.f5.e(HostsNavGraphRoute.HostsRoute.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 L0(Activity activity, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        if (activity != null) {
            OnboardingActivity.C.a(activity, 118);
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 M0(Activity activity, final androidx.navigation.r1 r1Var, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        if (activity != null) {
            r1Var.Q(HomeScreenBottomNavItem.Connections.INSTANCE, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.u2
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return g6.N0(r1Var, (androidx.navigation.v1) obj);
                }
            });
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 N0(androidx.navigation.r1 r1Var, androidx.navigation.v1 v1Var) {
        ju.t.f(v1Var, "$this$navigate");
        v1Var.d(androidx.navigation.m1.f10115w.d(r1Var.w()).q(), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.x2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.O0((androidx.navigation.k2) obj);
            }
        });
        v1Var.h(true);
        v1Var.l(true);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 O0(androidx.navigation.k2 k2Var) {
        ju.t.f(k2Var, "$this$popUpTo");
        k2Var.d(true);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationRailsRoute Q0(androidx.compose.runtime.e2 e2Var) {
        return (NavigationRailsRoute) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b R0(androidx.compose.runtime.l5 l5Var) {
        return (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a V0(androidx.compose.runtime.l5 l5Var) {
        return (com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List X0(androidx.compose.runtime.l5 l5Var) {
        return (List) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Y0(androidx.compose.runtime.e2 e2Var) {
        return (String) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(androidx.compose.runtime.e2 e2Var, String str) {
        e2Var.setValue(str);
    }

    public static final void Z1(View view, Bundle bundle, Boolean bool) {
        ju.t.f(view, "<this>");
        view.setBackgroundColor(tp.c1.a(view.getContext(), bool != null ? bool.booleanValue() : bundle != null && bundle.getBoolean("isInPanel", false) ? R.attr.termius_background_foreground : R.attr.termius_background_background));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(androidx.compose.runtime.e2 e2Var, NavigationRailsRoute navigationRailsRoute) {
        e2Var.setValue(navigationRailsRoute);
    }

    public static /* synthetic */ void a2(View view, Bundle bundle, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        Z1(view, bundle, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 b1(androidx.compose.runtime.e2 e2Var, String str) {
        ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        Z0(e2Var, str);
        return ut.m0.f82633a;
    }

    public static final androidx.compose.runtime.z2 b2() {
        return f30507a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 c1(HomeScreenViewModel homeScreenViewModel, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        e0(homeScreenViewModel, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(f1.a0 a0Var, List list, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.y yVar, Object obj, f1.g gVar, BellState bellState, final iu.l lVar) {
        Object obj2 = obj;
        if (!vt.v.e0(list, obj2)) {
            obj2 = HomeScreenBottomNavItem.Vaults.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final HomeScreenBottomNavItem homeScreenBottomNavItem = (HomeScreenBottomNavItem) it.next();
            boolean zB = ju.t.b(obj2, homeScreenBottomNavItem);
            f1.a0.b(a0Var, zB, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.b3
                @Override // iu.a
                public final Object a() {
                    return g6.d2(lVar, homeScreenBottomNavItem);
                }
            }, q1.h.b(-1321123440, true, new h(homeScreenBottomNavItem, yVar)), null, false, q1.h.b(-1939093357, true, new i(homeScreenBottomNavItem, zB)), true, q1.h.b(512238229, true, new j(homeScreenBottomNavItem, bellState)), gVar, null, 536, null);
        }
    }

    private static final boolean d1(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 d2(iu.l lVar, HomeScreenBottomNavItem homeScreenBottomNavItem) {
        lVar.invoke(homeScreenBottomNavItem);
        return ut.m0.f82633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x015e A[EDGE_INSN: B:175:0x015e->B:66:0x015e BREAK  A[LOOP:0: B:53:0x0126->B:64:0x0156], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156 A[LOOP:0: B:53:0x0126->B:64:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e0(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel r94, androidx.compose.runtime.m r95, final int r96, final int r97) {
        /*
            Method dump skipped, instruction units count: 1813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.g6.e0(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e1(final androidx.navigation.r1 r19, final java.lang.Object r20, v1.m r21, final boolean r22, final iu.l r23, final boolean r24, final iu.a r25, final com.server.auditor.ssh.client.navigation.ui.compose.hosts.oe r26, final iu.a r27, androidx.compose.runtime.m r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.g6.e1(androidx.navigation.r1, java.lang.Object, v1.m, boolean, iu.l, boolean, iu.a, com.server.auditor.ssh.client.navigation.ui.compose.hosts.oe, iu.a, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(f1.a0 a0Var, NavigationRailsRoute navigationRailsRoute, f1.g gVar, final iu.l lVar) {
        int i10 = 0;
        for (Object obj : vt.v.r(HostsNavGraphRoute.HostsRoute.INSTANCE, KeychainNavGraphRoute.KeychainRoute.INSTANCE, PortForwardingNavGraphRoute.PortForwardingRoute.INSTANCE, SnippetsNavGraphRoute.SnippetsRoute.INSTANCE, KnownHostsNavGraphRoute.KnownHostsRoute.INSTANCE, LogsNavGraphRoute.LogsRoute.INSTANCE, HomeScreenBottomNavItem.Settings.INSTANCE)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            final NavigationRailsRoute navigationRailsRoute2 = (NavigationRailsRoute) obj;
            boolean z10 = navigationRailsRoute.getClass() == navigationRailsRoute2.getClass();
            f1.a0.b(a0Var, z10, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.y2
                @Override // iu.a
                public final Object a() {
                    return g6.f2(lVar, navigationRailsRoute2);
                }
            }, q1.h.b(256592541, true, new k(navigationRailsRoute2)), androidx.compose.foundation.layout.c0.r(v1.m.f83247a, 0.0f, q3.h.m(i10 == 0 ? 20 : 10), 0.0f, 0.0f, 13, null), false, q1.h.b(-1276443936, true, new l(navigationRailsRoute2, z10)), true, null, gVar, null, 656, null);
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f1(androidx.navigation.r1 r1Var, boolean z10, iu.l lVar, oe oeVar, iu.a aVar, boolean z11, iu.a aVar2, androidx.navigation.o1 o1Var) {
        ju.t.f(o1Var, "$this$NavHost");
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.c3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.g1((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.d3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.h1((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(-1503898920, true, new d(lVar, z11, aVar2, oeVar, aVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HomeScreenBottomNavItem.Vaults.class), vt.s0.h(), vt.v.o(), lVar2, lVar3, lVar2, lVar3, null, bVarB);
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.e3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.i1((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.f3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.j1((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB2 = q1.h.b(1990260687, true, new e(lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HomeScreenBottomNavItem.Connections.class), vt.s0.h(), vt.v.o(), lVar4, lVar5, lVar4, lVar5, null, bVarB2);
        iu.l lVar6 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.h3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.k1((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar7 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.i3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.l1((androidx.compose.animation.d) obj);
            }
        };
        iu.r rVarA = com.server.auditor.ssh.client.navigation.ui.compose.i.f32480a.a();
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HomeScreenBottomNavItem.Settings.class), vt.s0.h(), vt.v.o(), lVar6, lVar7, lVar6, lVar7, null, rVarA);
        g2(o1Var, r1Var, z10, lVar, oeVar, aVar);
        F2(o1Var, r1Var, z10, lVar);
        A2(o1Var, r1Var, z10, lVar);
        l2(o1Var, r1Var, z10, lVar);
        q2(o1Var, r1Var, z10, lVar);
        v2(o1Var, r1Var, z10);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f2(iu.l lVar, NavigationRailsRoute navigationRailsRoute) {
        lVar.invoke(navigationRailsRoute);
        return ut.m0.f82633a;
    }

    private static final androidx.navigation.d0 g0(androidx.compose.runtime.l5 l5Var) {
        return (androidx.navigation.d0) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h g1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    public static final void g2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10, iu.l lVar, oe oeVar, iu.a aVar) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        ju.t.f(lVar, "onUpdateNavBarMustBeHidden");
        ju.t.f(aVar, "onOpenHostEditorOneTimeSignalHandled");
        Map mapF = vt.s0.f(NsdSearchResultWrapper.Companion.a());
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.a4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.h2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.b4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.i2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.d4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.j2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.e4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.k2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(-1498520358, true, new m(z10, oeVar, aVar, r1Var, lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HostsNavGraphRoute.HostsRoute.class), mapF, vt.v.o(), lVar2, lVar3, lVar4, lVar5, null, bVarB);
    }

    private static final void h0(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j h1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h h2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final op.n i0(androidx.compose.runtime.l5 l5Var) {
        return (op.n) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h i1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j i2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j j1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h j2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h k1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j k2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 l0(androidx.compose.runtime.e2 e2Var, boolean z10) {
        h0(e2Var, z10);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j l1(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.b();
    }

    public static final void l2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10, iu.l lVar) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        ju.t.f(lVar, "onUpdateNavBarMustBeHidden");
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.s3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.o2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.t3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.p2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.u3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.m2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.v3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.n2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(854814021, true, new n(z10, r1Var, lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(KeychainNavGraphRoute.KeychainRoute.class), vt.s0.h(), vt.v.o(), lVar2, lVar3, lVar4, lVar5, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oe m0(androidx.compose.runtime.e2 e2Var) {
        return (oe) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m1(androidx.navigation.r1 r1Var, Object obj, v1.m mVar, boolean z10, iu.l lVar, boolean z11, iu.a aVar, oe oeVar, iu.a aVar2, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        e1(r1Var, obj, mVar, z10, lVar, z11, aVar, oeVar, aVar2, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h m2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(androidx.compose.runtime.e2 e2Var, oe oeVar) {
        e2Var.setValue(oeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ja n1() {
        throw new IllegalStateException("TermiusScreenMetrics not provided");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j n2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o0(androidx.navigation.r1 r1Var, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.e2 e2Var, androidx.compose.runtime.e2 e2Var2, long j10) {
        if (f0(l5Var)) {
            NavigationRailsRoute navigationRailsRouteQ0 = Q0(e2Var);
            HostsNavGraphRoute.HostsRoute hostsRoute = HostsNavGraphRoute.HostsRoute.INSTANCE;
            if (ju.t.b(navigationRailsRouteQ0, hostsRoute)) {
                r1Var.Q(hostsRoute, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.s2
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return g6.r0((androidx.navigation.v1) obj);
                    }
                });
            } else {
                a1(e2Var, hostsRoute);
            }
        } else {
            r1Var.Q(HomeScreenBottomNavItem.Vaults.INSTANCE, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.r2
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return g6.p0((androidx.navigation.v1) obj);
                }
            });
        }
        n0(e2Var2, new oe(Long.valueOf(j10), null, false, 2, null));
        return ut.m0.f82633a;
    }

    public static final void o1(final boolean z10, final iu.p pVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        ju.t.f(pVar, "content");
        androidx.compose.runtime.m mVarG = mVar.g(-1267617843);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1267617843, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ProvideScreenMetrics (HomeScreen.kt:1231)");
            }
            androidx.compose.runtime.h0.c(f30507a.d(new ja(z10, z10 ? 240 : 180, 140)), q1.h.d(-1877196019, true, new f(pVar), mVarG, 54), mVarG, androidx.compose.runtime.a3.f5133i | 48);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.t2
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return g6.p1(z10, pVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h o2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 p0(androidx.navigation.v1 v1Var) {
        ju.t.f(v1Var, "$this$navigate");
        v1Var.e(ju.n0.b(HomeScreenBottomNavItem.Vaults.class), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.w2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.q0((androidx.navigation.k2) obj);
            }
        });
        v1Var.h(true);
        v1Var.l(true);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 p1(boolean z10, iu.p pVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        o1(z10, pVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j p2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 q0(androidx.navigation.k2 k2Var) {
        ju.t.f(k2Var, "$this$popUpTo");
        k2Var.d(true);
        return ut.m0.f82633a;
    }

    public static final void q1(final boolean z10, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        androidx.compose.runtime.m mVarG = mVar.g(285765854);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(285765854, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SetSystemBarAppearance (HomeScreen.kt:1173)");
            }
            Context context = (Context) mVarG.n(AndroidCompositionLocals_androidKt.g());
            Activity activity = context instanceof Activity ? (Activity) context : null;
            final Window window = activity != null ? activity.getWindow() : null;
            Boolean boolValueOf = Boolean.valueOf(z10);
            mVarG.W(-1633490746);
            int i12 = i11 & 14;
            boolean zF = (i12 == 4) | mVarG.F(window);
            Object objD = mVarG.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.p2
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return g6.r1(z10, window, (androidx.compose.runtime.x0) obj);
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            androidx.compose.runtime.a1.a(boolValueOf, (iu.l) objD, mVarG, i12);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.q2
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return g6.s1(z10, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void q2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10, iu.l lVar) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        ju.t.f(lVar, "onUpdateNavBarMustBeHidden");
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.f4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.r2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.g4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.s2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.h4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.t2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.i4
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.u2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(662618334, true, new o(z10, r1Var, lVar));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(KnownHostsNavGraphRoute.KnownHostsRoute.class), vt.s0.h(), vt.v.o(), lVar2, lVar3, lVar4, lVar5, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 r0(androidx.navigation.v1 v1Var) {
        ju.t.f(v1Var, "$this$navigate");
        androidx.navigation.v1.f(v1Var, 0, null, 2, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.w0 r1(boolean z10, Window window, androidx.compose.runtime.x0 x0Var) {
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        ju.t.f(x0Var, "$this$DisposableEffect");
        if (Build.VERSION.SDK_INT >= 30) {
            if (z10) {
                if (window != null && (insetsController2 = window.getInsetsController()) != null) {
                    insetsController2.setSystemBarsAppearance(0, 8);
                }
            } else if (window != null && (insetsController = window.getInsetsController()) != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h r2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 s0(iu.l lVar, long j10) {
        lVar.invoke(Long.valueOf(j10));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 s1(boolean z10, int i10, androidx.compose.runtime.m mVar, int i11) {
        q1(z10, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j s2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 t0(Context context, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        tp.s0.f81013a.a(context);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h t2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeScreenBottomNavItem u0(androidx.compose.runtime.l5 l5Var) {
        return (HomeScreenBottomNavItem) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j u2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 v0(String str, Context context, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        tp.t0.f81014a.a(context, "https://account.termius.com/" + str);
        return ut.m0.f82633a;
    }

    public static final void v2(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, final boolean z10) {
        ju.t.f(o1Var, "<this>");
        ju.t.f(r1Var, "navController");
        iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.w3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.w2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.x3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.x2(z10, (androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.y3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.y2((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.z3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return g6.z2((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(136629221, true, new p(z10, r1Var));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(LogsNavGraphRoute.LogsRoute.class), vt.s0.h(), vt.v.o(), lVar, lVar2, lVar3, lVar4, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 w0(Context context, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        com.server.auditor.ssh.client.utils.analytics.a.y().d6(Avo.From.NAV_PANEL, false);
        com.server.auditor.ssh.client.utils.analytics.a.y().x0();
        Intent intent = new Intent(context, (Class<?>) NavigationRouterActivity.class);
        intent.setAction("backupAndSyncFlow");
        context.startActivity(intent);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h w2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.a() : ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x0(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j x2(boolean z10, androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return z10 ? h1.f30620a.b() : ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h y2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j z2(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return ca.f30377a.f();
    }
}
