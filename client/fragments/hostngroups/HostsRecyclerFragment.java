package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CombinedVibration;
import android.os.Handler;
import android.os.VibrationEffect;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.fragments.conflictsflow.OrdinaryConflictsScreenArgs;
import com.server.auditor.ssh.client.fragments.conflictsflow.PortForwardingConflictArgs;
import com.server.auditor.ssh.client.fragments.containers.MultiSwipeRefreshLayout;
import com.server.auditor.ssh.client.fragments.hostngroups.q0;
import com.server.auditor.ssh.client.fragments.viewholder.j;
import com.server.auditor.ssh.client.interactors.survey.b;
import com.server.auditor.ssh.client.models.ActiveConnection;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.connections.HostType;
import com.server.auditor.ssh.client.navigation.MainActivity;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.NavigationRouterActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.c;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResultWrapper;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.q;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import com.server.auditor.ssh.client.widget.TeamOnlineWidget;
import com.server.auditor.ssh.client.widget.c0;
import com.server.auditor.ssh.client.widget.h0;
import com.server.auditor.ssh.client.widget.k0;
import com.server.auditor.ssh.client.widget.x;
import eq.b0;
import hg.b2;
import iq.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import oh.c;
import tp.n;
import vp.a;

/* JADX INFO: loaded from: classes3.dex */
public class HostsRecyclerFragment extends Fragment implements c.a, l0, com.server.auditor.ssh.client.widget.b1, b.a, com.server.auditor.ssh.client.widget.k {
    private zp.c A;
    protected oh.c B;
    private SelectionMode C;
    private MultiSwipeRefreshLayout D;
    private boolean E;
    private final SparseArray F;
    private com.server.auditor.ssh.client.widget.a1 G;
    private com.server.auditor.ssh.client.widget.i H;
    private com.server.auditor.ssh.client.widget.i I;
    private g.b J;
    private final hg.d K;
    private final wn.j L;
    private final iq.b M;
    private final com.server.auditor.ssh.client.interactors.k0 N;
    private final TeamMembersOnlineCacheRepository O;
    private final tp.n P;
    public final dq.h0 Q;
    private final com.server.auditor.ssh.client.interactors.o R;
    private final com.server.auditor.ssh.client.interactors.q S;
    private final j.b T;
    private final View.OnDragListener U;
    private final View.OnClickListener V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HostsScreenViewModel f25002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f25003b = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f25004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected RecyclerView f25005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected CoordinatorLayout f25006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.server.auditor.ssh.client.fragments.hostngroups.k f25007f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected ch.r0 f25008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final GroupDBAdapter f25009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final HostsDBAdapter f25010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final il.s f25011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected q0 f25012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private kj.b f25013z;

    public enum SelectionMode {
        Common,
        SFTP,
        PortForwarding,
        ExportSshKey
    }

    class a implements c0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.interactors.survey.b f25014a;

        a(com.server.auditor.ssh.client.interactors.survey.b bVar) {
            this.f25014a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(com.server.auditor.ssh.client.widget.c0 c0Var, int i10) {
            c0Var.dismiss();
            HostsRecyclerFragment.this.ph(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(com.server.auditor.ssh.client.widget.c0 c0Var, int i10) {
            c0Var.dismiss();
            HostsRecyclerFragment.this.qh(i10);
        }

        @Override // com.server.auditor.ssh.client.widget.c0.a
        public void a(final int i10, final com.server.auditor.ssh.client.widget.c0 c0Var) {
            this.f25014a.p(new b.e() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.e0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.e
                public final void a() {
                    this.f25069a.e(c0Var, i10);
                }
            });
        }

        @Override // com.server.auditor.ssh.client.widget.c0.a
        public void b(final int i10, final com.server.auditor.ssh.client.widget.c0 c0Var) {
            this.f25014a.r(new b.g() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.d0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.g
                public final void a() {
                    this.f25064a.f(c0Var, i10);
                }
            });
        }

        @Override // com.server.auditor.ssh.client.widget.c0.a
        public void onCanceled() {
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
            this.f25014a.s();
        }
    }

    class b implements h0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.interactors.survey.b f25016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25017b;

        b(com.server.auditor.ssh.client.interactors.survey.b bVar, int i10) {
            this.f25016a = bVar;
            this.f25017b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(com.server.auditor.ssh.client.widget.h0 h0Var) {
            h0Var.dismiss();
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(com.server.auditor.ssh.client.widget.h0 h0Var) {
            h0Var.dismiss();
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
            HostsRecyclerFragment.this.uh();
        }

        @Override // com.server.auditor.ssh.client.widget.h0.a
        public void a(String str, final com.server.auditor.ssh.client.widget.h0 h0Var) {
            this.f25016a.m(this.f25017b, str, new b.h() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.g0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.h
                public final void a() {
                    this.f25077a.f(h0Var);
                }
            });
        }

        @Override // com.server.auditor.ssh.client.widget.h0.a
        public void b(final com.server.auditor.ssh.client.widget.h0 h0Var) {
            this.f25016a.l(this.f25017b, new b.InterfaceC0443b() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.f0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.InterfaceC0443b
                public final void a() {
                    this.f25073a.e(h0Var);
                }
            });
        }

        @Override // com.server.auditor.ssh.client.widget.h0.a
        public void onCanceled() {
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
            this.f25016a.k(this.f25017b);
        }
    }

    class c implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.interactors.survey.b f25019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25020b;

        class a implements b.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.server.auditor.ssh.client.widget.x f25022a;

            a(com.server.auditor.ssh.client.widget.x xVar) {
                this.f25022a = xVar;
            }

            @Override // com.server.auditor.ssh.client.interactors.survey.b.c
            public void a() {
                this.f25022a.dismiss();
                HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
                HostsRecyclerFragment.this.ah();
            }

            @Override // com.server.auditor.ssh.client.interactors.survey.b.c
            public void b() {
                this.f25022a.dismiss();
                HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
                HostsRecyclerFragment.this.Zg();
            }
        }

        c(com.server.auditor.ssh.client.interactors.survey.b bVar, int i10) {
            this.f25019a = bVar;
            this.f25020b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.server.auditor.ssh.client.widget.x xVar) {
            xVar.dismiss();
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
        }

        @Override // com.server.auditor.ssh.client.widget.x.a
        public void a(com.server.auditor.ssh.client.widget.x xVar) {
            this.f25019a.o(this.f25020b, new a(xVar));
        }

        @Override // com.server.auditor.ssh.client.widget.x.a
        public void b(final com.server.auditor.ssh.client.widget.x xVar) {
            this.f25019a.q(this.f25020b, new b.f() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.h0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.f
                public final void a() {
                    this.f25082a.d(xVar);
                }
            });
        }

        @Override // com.server.auditor.ssh.client.widget.x.a
        public void onCanceled() {
            HostsRecyclerFragment.this.kg().setRateUsBottomSheetDialogShowing(false);
            this.f25019a.n(this.f25020b);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25024a;

        static {
            int[] iArr = new int[HostType.values().length];
            f25024a = iArr;
            try {
                iArr[HostType.local.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25024a[HostType.remote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class e extends p0 {
        e() {
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.p0
        public void c(List list, Long l10, boolean z10) {
            HostsRecyclerFragment.this.A.r(list, l10, z10);
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.p0
        public void d(GroupDBModel groupDBModel) {
            com.server.auditor.ssh.client.utils.analytics.a.y().T1();
            HostsRecyclerFragment.this.kg().sendFragmentAction(new q.a(new HostsNavGraphRoute.EditGroupRoute(Long.valueOf(groupDBModel.getIdInDatabase()), null)));
        }
    }

    class f implements q0.b {
        f() {
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.q0.b
        public void a(Long l10) {
            HostsRecyclerFragment.this.Ah();
        }
    }

    class g implements q0.b {
        g() {
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.q0.b
        public void a(Long l10) {
            HostsRecyclerFragment.this.Ah();
        }
    }

    class h implements q0.a {
        h() {
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.q0.a
        public void a(Long l10) {
            HostsRecyclerFragment.this.Ah();
        }
    }

    class i implements kj.e {
        i() {
        }
    }

    class j extends q0 {
        j(Context context, q0.b bVar, q0.a aVar, zp.e eVar, kj.e eVar2, il.r rVar) {
            super(context, bVar, aVar, eVar, eVar2, rVar);
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.q0
        public void d(long j10, Host host) {
            int i10 = d.f25024a[host.getHostType().ordinal()];
            if (i10 == 1) {
                com.server.auditor.ssh.client.utils.analytics.a.y().U1();
                HostsRecyclerFragment.this.kg().sendFragmentAction(new q.a(new HostsNavGraphRoute.EditLocalHostRoute(Long.valueOf(j10), HostsRecyclerFragment.this.kg().getCurrentGroupId())));
            } else {
                if (i10 != 2) {
                    return;
                }
                com.server.auditor.ssh.client.utils.analytics.a.y().U1();
                HostsRecyclerFragment.this.kg().sendFragmentAction(new q.a(new HostsNavGraphRoute.EditHostRoute(Long.valueOf(j10), HostsRecyclerFragment.this.kg().getCurrentGroupId(), null, new NsdSearchResultWrapper(null), false, HostCreationOriginVariant.HOSTS_SCREEN)));
            }
        }

        @Override // com.server.auditor.ssh.client.fragments.hostngroups.q0
        public void e() {
            com.server.auditor.ssh.client.utils.analytics.a.y().z5(Boolean.valueOf(!com.server.auditor.ssh.client.app.a.N().m()), UUID.randomUUID().toString());
            NavigationPopUpWhenLargeActivity.f28304b.b(HostsRecyclerFragment.this.requireActivity(), new NavigationPopUpWhenLargeActivity.NavigationDestination.TeamPresenceFlow(NavigationPopUpWhenLargeActivity.TeamPresenceFlowStartDestination.Default.INSTANCE));
        }
    }

    class k implements j.b {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i10) {
            if (HostsRecyclerFragment.this.getActivity() instanceof MainActivity) {
                HostsRecyclerFragment.this.ph(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(int i10) {
            if (HostsRecyclerFragment.this.getActivity() instanceof MainActivity) {
                HostsRecyclerFragment.this.qh(i10);
            }
        }

        @Override // com.server.auditor.ssh.client.fragments.viewholder.j.b
        public void a(final int i10) {
            HostsRecyclerFragment.this.K.edit().putBoolean("show_rate_us_hosts_item", false).apply();
            b2.f52944a.f1().r(new b.g() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.j0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.g
                public final void a() {
                    this.f25095a.f(i10);
                }
            });
            HostsRecyclerFragment.this.yh();
        }

        @Override // com.server.auditor.ssh.client.fragments.viewholder.j.b
        public void b(final int i10) {
            HostsRecyclerFragment.this.K.edit().putBoolean("show_rate_us_hosts_item", false).apply();
            b2.f52944a.f1().p(new b.e() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.i0
                @Override // com.server.auditor.ssh.client.interactors.survey.b.e
                public final void a() {
                    this.f25089a.e(i10);
                }
            });
            HostsRecyclerFragment.this.yh();
        }

        @Override // com.server.auditor.ssh.client.fragments.viewholder.j.b
        public void onDismiss() {
            HostsRecyclerFragment.this.K.edit().putBoolean("show_rate_us_hosts_item", false).apply();
            b2.f52944a.f1().s();
            HostsRecyclerFragment.this.yh();
        }
    }

    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HostsRecyclerFragment.this.B.c()) {
                HostsRecyclerFragment.this.Vf();
            }
            HostsRecyclerFragment.this.f25012y.e();
        }
    }

    class m implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GroupDBModel f25033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f25034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f25035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f25036d;

        m(GroupDBModel groupDBModel, ArrayList arrayList, ArrayList arrayList2, VaultKeyId vaultKeyId) {
            this.f25033a = groupDBModel;
            this.f25034b = arrayList;
            this.f25035c = arrayList2;
            this.f25036d = vaultKeyId;
        }

        @Override // iq.b.a
        public void J3(dq.t tVar) {
            HostsRecyclerFragment.this.Pf(this.f25034b, this.f25033a.getIdInDatabase());
            HostsRecyclerFragment.this.th(this.f25035c.size(), this.f25036d);
            HostsRecyclerFragment hostsRecyclerFragment = HostsRecyclerFragment.this;
            hostsRecyclerFragment.zh(hostsRecyclerFragment.kg().getCurrentGroupId());
            hg.f.p().Y().startFullSync();
        }

        @Override // iq.b.a
        public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
            HostsRecyclerFragment.this.mg(list, iVar, vaultKeyId, str, "drag_and_drop", this.f25033a.getIdInDatabase());
        }
    }

    public HostsRecyclerFragment() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f25004c = aVarN;
        this.f25008u = new ch.r0();
        this.f25009v = hg.f.p().h();
        this.f25010w = hg.f.p().i();
        this.f25011x = new il.s();
        this.B = new oh.c();
        this.C = SelectionMode.Common;
        this.E = true;
        this.F = new SparseArray();
        hg.d dVarM = aVarN.M();
        this.K = dVarM;
        wn.j jVar = new wn.j(dVarM);
        this.L = jVar;
        this.M = new iq.b(jVar);
        this.N = new com.server.auditor.ssh.client.interactors.k0();
        b2 b2Var = b2.f52944a;
        this.O = b2Var.Q1();
        this.P = new tp.n();
        this.Q = new dq.h0(vl.g.f83702b.b(), b2Var.g1(), com.server.auditor.ssh.client.app.a.N());
        this.R = new com.server.auditor.ssh.client.interactors.o();
        this.S = new com.server.auditor.ssh.client.interactors.q();
        this.T = new k();
        this.U = new View.OnDragListener() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.a0
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                return this.f25049a.Ag(view, dragEvent);
            }
        };
        this.V = new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Ag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        RecyclerView.e0 e0VarY = this.f25005d.Y(view);
        switch (action) {
            case 2:
                ih(view.getY() + dragEvent.getY());
            case 1:
                return true;
            case 3:
                List listTf = Tf(this.f25007f.R());
                if (!(e0VarY instanceof com.server.auditor.ssh.client.fragments.viewholder.e)) {
                    return false;
                }
                int iJ0 = this.f25005d.j0(view);
                Vf();
                Xg(listTf, iJ0);
                return true;
            case 4:
                if (e0VarY instanceof com.server.auditor.ssh.client.fragments.viewholder.e) {
                    this.f25007f.l0((com.server.auditor.ssh.client.fragments.viewholder.e) e0VarY);
                }
                return true;
            case 5:
                if (!(e0VarY instanceof com.server.auditor.ssh.client.fragments.viewholder.e)) {
                    return false;
                }
                this.f25007f.m0((com.server.auditor.ssh.client.fragments.viewholder.e) e0VarY);
                return true;
            case 6:
                if (!(e0VarY instanceof com.server.auditor.ssh.client.fragments.viewholder.e)) {
                    return false;
                }
                this.f25007f.l0((com.server.auditor.ssh.client.fragments.viewholder.e) e0VarY);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Bg(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            this.D.setRefreshing(false);
            Ah();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Cg(Menu menu, List list) {
        kg().sendFragmentAction(new q.b(new c.a(new ArrayList(k0.a(requireContext(), menu)), list.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ch(List list) {
        List listHg = Hg(new ArrayList(list));
        this.f25007f.p0(vg());
        this.f25007f.r0(listHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Dg(com.google.android.play.core.review.b bVar, Task task) {
        if (task.isSuccessful()) {
            bVar.b(requireActivity(), (ReviewInfo) task.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Eg(List list, DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            Uf(list);
            this.B.a(this);
        }
        dialogInterface.cancel();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Fg(List list, GroupDBModel groupDBModel, qq.a aVar) {
        boolean z10 = this.K.getBoolean("authorized_feature_show_multikey_promotion", true);
        if (aVar.d().equals("multikey") && z10) {
            p9();
        } else {
            Kg(list, groupDBModel, aVar.d());
            this.I.dismiss();
        }
    }

    private void G8() {
        com.server.auditor.ssh.client.widget.i iVar = this.H;
        if (iVar != null) {
            iVar.dismiss();
            this.H = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Gg(List list, DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            Uf(list);
            this.B.a(this);
        }
        dialogInterface.cancel();
        dialogInterface.dismiss();
    }

    private List Hg(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TeamMembersOnlineCacheRepository.TeamUser teamUser = (TeamMembersOnlineCacheRepository.TeamUser) list.get(i10);
            if (teamUser != null) {
                arrayList.add(new TeamOnlineWidget.b(this.R.a(teamUser.getUserId(), teamUser.getUsername()), this.S.e(teamUser.getUsername(), teamUser.getFullName()), teamUser.isOnline(), teamUser.getAvatarUri()));
            }
        }
        return arrayList;
    }

    private void I() {
        com.server.auditor.ssh.client.widget.a1 a1Var = this.G;
        if (a1Var != null) {
            a1Var.dismiss();
            this.G = null;
        }
    }

    private void Ig() {
        if ("android.intent.action.VIEW".equals(requireActivity().getIntent().getAction())) {
            return;
        }
        b2.f52944a.f1().i(new b.d() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.x
            @Override // com.server.auditor.ssh.client.interactors.survey.b.d
            public final void a() {
                this.f25205a.rh();
            }
        });
    }

    private void Jg(GroupDBModel groupDBModel, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((Long) it.next()).longValue());
            if (itemByLocalId != null) {
                itemByLocalId.setGroupId(Long.valueOf(groupDBModel.getIdInDatabase()));
                hg.f.p().l().putItem(itemByLocalId);
            }
        }
        zh(kg().getCurrentGroupId());
        hg.f.p().Y().startFullSync();
    }

    private void Kg(List list, GroupDBModel groupDBModel, String str) {
        List listFg = fg(list);
        ArrayList arrayListAg = ag(listFg, groupDBModel);
        ArrayList arrayListBg = bg(listFg, groupDBModel);
        VaultKeyId vaultKeyId = groupDBModel.getVaultKeyId();
        this.M.j(arrayListAg, vaultKeyId, str, "drag_and_drop", new m(groupDBModel, arrayListBg, arrayListAg, vaultKeyId));
    }

    private void Lg(List list, GroupDBModel groupDBModel) {
        if (Nf(list, groupDBModel.getVaultKeyId())) {
            Jg(groupDBModel, list);
        } else {
            Kg(list, groupDBModel, "item_depended");
        }
    }

    private void Mg(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= 0 && num.intValue() < filteredContainers.size()) {
                com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(num.intValue());
                if (dVar.a() == 0) {
                    Host hostE = ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e();
                    if (hostE.getHostType() == HostType.local) {
                        z10 = true;
                    }
                    arrayList.add(Long.valueOf(hostE.getId()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        VaultKeyIdSpecification vaultKeyIdSpecificationB = VaultKeyIdSpecification.NotSpecified.INSTANCE;
        if (z10) {
            vaultKeyIdSpecificationB = VaultKeyIdSpecification.Companion.b();
        }
        kg().getHostsToChangeGroup().clear();
        kg().getHostsToChangeGroup().addAll(arrayList);
        kg().sendFragmentAction(new q.a(new HostsNavGraphRoute.GroupSelectRoute(null, vaultKeyIdSpecificationB, false)));
    }

    private boolean Nf(List list, VaultKeyId vaultKeyId) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((Long) it.next()).longValue());
            if (itemByLocalId != null) {
                arrayList.add(itemByLocalId);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        return com.server.auditor.ssh.client.ui.vaults.data.a.a(arrayList, vaultKeyId);
    }

    private void Ng(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2, long j10) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showOrdinaryConflictsScreen");
        intent.putExtras(new OrdinaryConflictsScreenArgs.a(str2, kg().getVaultWizardId(), j10, vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle());
        this.J.a(intent);
    }

    private boolean Of(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.server.auditor.ssh.client.fragments.hostngroups.d dVar = (com.server.auditor.ssh.client.fragments.hostngroups.d) it.next();
            if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.i) {
                if (com.server.auditor.ssh.client.ui.vaults.data.a.b(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getVaultKeyId())) {
                    return true;
                }
            } else if ((dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) && com.server.auditor.ssh.client.ui.vaults.data.a.b(((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getVaultKeyId())) {
                return true;
            }
        }
        return false;
    }

    private void Og(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2, long j10) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showPFConflictsScreen");
        intent.putExtras(new PortForwardingConflictArgs.a(str2, kg().getVaultWizardId(), j10, "No conflicts", vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle());
        this.J.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pf(ArrayList arrayList, long j10) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HostDBModel hostDBModel = (HostDBModel) it.next();
            hostDBModel.setGroupId(Long.valueOf(j10));
            hg.f.p().l().putItem(hostDBModel);
        }
    }

    private void Pg() {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("quickImportFlow");
        startActivity(intent);
    }

    private List Qf() {
        HostDBModel itemByLocalId;
        ArrayList arrayList = new ArrayList();
        List listR = this.f25007f.R();
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < filteredContainers.size()) {
                com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(iIntValue);
                if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) {
                    GroupDBModel groupDBModelB = ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b();
                    arrayList.add(new TypedEntityIdentifier(groupDBModelB.getIdInDatabase(), groupDBModelB.getClass()));
                } else if ((dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.i) && (itemByLocalId = this.f25010w.getItemByLocalId(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId())) != null) {
                    arrayList.add(new TypedEntityIdentifier(itemByLocalId.getIdInDatabase(), itemByLocalId.getClass()));
                }
            }
        }
        return arrayList;
    }

    private void Qg(List list, Avo.OpenedFrom openedFrom) {
        String string = UUID.randomUUID().toString();
        this.f25003b.L4(openedFrom, string);
        NavigationPopUpWhenLargeActivity.f28304b.b(requireActivity(), new NavigationPopUpWhenLargeActivity.NavigationDestination.SetupTeamVaultFlow(new NavigationPopUpWhenLargeActivity.SetupTeamVaultFlowStartDestination.Onboarding(list, string)));
    }

    private List Sf(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.server.auditor.ssh.client.fragments.hostngroups.d dVar = (com.server.auditor.ssh.client.fragments.hostngroups.d) it.next();
            if (dVar.a() == 0) {
                HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId());
                if (itemByLocalId != null) {
                    arrayList.add(itemByLocalId);
                }
            } else if (dVar.a() == 1) {
                GroupDBModel itemByLocalId2 = this.f25009v.getItemByLocalId(((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase());
                if (itemByLocalId2 != null) {
                    arrayList.add(itemByLocalId2);
                }
            }
        }
        return arrayList;
    }

    private void Sg() {
        List<Integer> listR = this.f25007f.R();
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        for (Integer num : listR) {
            if (num.intValue() >= 0 && num.intValue() < filteredContainers.size()) {
                Host hostE = ((com.server.auditor.ssh.client.fragments.hostngroups.i) filteredContainers.get(num.intValue())).e();
                SessionManager.getInstance().disconnectTerminalSession(hostE);
                SessionManager.getInstance().disconnectHostSftpSession(hostE.getHostId().longValue());
            }
        }
        SessionManager.getInstance().terminalSessionHelper.notifyConnectionsChanged();
    }

    private List Tf(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.server.auditor.ssh.client.fragments.hostngroups.d dVar = kg().getFilteredContainers().get(((Integer) it.next()).intValue());
            if (dVar.a() == 0) {
                arrayList.add(Long.valueOf(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId()));
            }
        }
        return arrayList;
    }

    private void Tg() {
        List listR = this.f25007f.R();
        if (listR.isEmpty()) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        int iIntValue = ((Integer) listR.get(0)).intValue();
        if (iIntValue < 0 || iIntValue >= filteredContainers.size()) {
            return;
        }
        Host hostE = ((com.server.auditor.ssh.client.fragments.hostngroups.i) filteredContainers.get(iIntValue)).e();
        Vf();
        kg().duplicateHost(hostE);
    }

    private void Wf() {
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        List listR = this.f25007f.R();
        for (int i10 = 0; i10 < listR.size(); i10++) {
            if (i10 < filteredContainers.size() && (filteredContainers.get(i10) instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) && this.f25007f.W(i10)) {
                this.f25007f.a0(i10);
                this.f25007f.p(i10);
                this.B.b(this);
            }
        }
    }

    private void Wg(List list, GroupDBModel groupDBModel) {
        if (groupDBModel == null) {
            if (!xg(list)) {
                sh();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((Long) it.next()).longValue());
                if (itemByLocalId != null) {
                    itemByLocalId.setGroupId(null);
                    hg.f.p().l().putItem(itemByLocalId);
                }
            }
            zh(kg().getCurrentGroupId());
            hg.f.p().Y().startFullSync();
            return;
        }
        if (!wg(list, groupDBModel)) {
            sh();
            return;
        }
        hh(list);
        if (list.isEmpty()) {
            return;
        }
        boolean zTg = tg(list, groupDBModel);
        if (ug(list, groupDBModel)) {
            mh(list, groupDBModel);
        } else if (zTg) {
            Kg(list, groupDBModel, "no_credentials_sharing");
        } else {
            og(list, groupDBModel);
        }
    }

    private void Xg(List list, int i10) {
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        if (i10 < 0 || i10 >= filteredContainers.size()) {
            return;
        }
        com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(i10);
        if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) {
            GroupDBModel groupDBModelB = ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l10 = (Long) it.next();
                HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(l10.longValue());
                if (itemByLocalId.getGroupId() != null && itemByLocalId.getGroupId().longValue() == groupDBModelB.getIdInDatabase()) {
                    arrayList.add(l10);
                }
            }
            if (arrayList.size() != list.size()) {
                Wg(list, groupDBModelB);
            }
        }
    }

    private List Yf(List list, Long l10) {
        ArrayList arrayList = new ArrayList(list.size());
        if (l10 == null) {
            arrayList.addAll(list);
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Host host = (Host) it.next();
            if (host.getGroup() != null && l10.equals(Long.valueOf(host.getGroup().getIdInDatabase()))) {
                arrayList.add(host);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zg() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.g2.com/products/termius/reviews/start")));
        } catch (ActivityNotFoundException e10) {
            y9.a.f86838a.i(e10);
        }
    }

    private ArrayList ag(List list, GroupDBModel groupDBModel) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel hostDBModel = (HostDBModel) it.next();
            if (hostDBModel != null) {
                hostDBModel.setGroupId(Long.valueOf(groupDBModel.getIdInDatabase()));
                arrayList.add(hostDBModel);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        final com.google.android.play.core.review.b bVarA = com.google.android.play.core.review.c.a(requireActivity());
        bVarA.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f25201a.Dg(bVarA, task);
            }
        });
    }

    private ArrayList bg(List list, GroupDBModel groupDBModel) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel hostDBModel = (HostDBModel) it.next();
            if (hostDBModel != null && lg(hostDBModel, groupDBModel)) {
                hostDBModel.setGroupId(Long.valueOf(groupDBModel.getIdInDatabase()));
                arrayList.add(hostDBModel);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bh(ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            zh(kg().getCurrentGroupId());
            hg.f.p().Y().startFullSync();
        }
    }

    private Long cg(Host host) {
        zl.d terminalConnectionHolder;
        Long lValueOf = null;
        for (ActiveConnection activeConnection : SessionManager.getInstance().getActiveTerminalConnection()) {
            if (activeConnection.getHostId() != null && activeConnection.getHostId().equals(Long.valueOf(host.getId())) && (terminalConnectionHolder = SessionManager.getInstance().getTerminalConnectionHolder((int) activeConnection.getId())) != null && (terminalConnectionHolder.b() == null || !terminalConnectionHolder.b().isConnected())) {
                lValueOf = Long.valueOf(activeConnection.getId());
            }
        }
        return lValueOf;
    }

    private void ch(String str, boolean z10) {
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        kg().setVaultWizardId(UUID.randomUUID().toString());
        List listSf = Sf(jg());
        if (listSf.isEmpty()) {
            return;
        }
        SyncableModel syncableModel = (SyncableModel) listSf.get(0);
        Avo.ChangeToVault changeToVaultB = c1341a.b(z10);
        Avo.CurrentVault currentVaultA = c1341a.a(syncableModel.getVaultKeyId());
        com.server.auditor.ssh.client.utils.analytics.a.y().J0(new wp.a(changeVaultActionC, Avo.ChangeVaultSource.CONTEXT_MENU, c1341a.h(listSf), kg().getVaultWizardId(), changeToVaultB, currentVaultA));
    }

    private VaultKeyId dg(com.server.auditor.ssh.client.fragments.hostngroups.d dVar) {
        return dVar.a() == 0 ? ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getVaultKeyId() : dVar.a() == 1 ? ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getVaultKeyId() : VaultKeyId.Companion.a();
    }

    private void dh(String str) {
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().K0(new wp.b(changeVaultActionC, kg().getVaultWizardId(), c1341a.h(Sf(jg())), Avo.ChangeVaultSource.CONTEXT_MENU));
    }

    private HomeScreenViewModel eg() {
        return (HomeScreenViewModel) new androidx.lifecycle.l1(requireActivity()).a(HomeScreenViewModel.class);
    }

    private void eh(String str) {
        com.server.auditor.ssh.client.utils.analytics.a.y().r1(vp.a.f83866a.e(str), kg().getVaultWizardId());
    }

    private List fg(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((Long) it.next()).longValue());
            if (itemByLocalId != null) {
                arrayList.add(itemByLocalId);
            }
        }
        return arrayList;
    }

    private void fh() {
        com.server.auditor.ssh.client.utils.analytics.a.y().s1(kg().getVaultWizardId());
    }

    private Host gh(long j10) {
        return hg.f.p().j().s(Long.valueOf(j10));
    }

    private void hh(final List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            if (this.f25010w.getItemByLocalId(l10.longValue()).hasLocalConfig()) {
                arrayList.add(l10);
            }
        }
        arrayList.forEach(new Consumer() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.y
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                list.remove((Long) obj);
            }
        });
    }

    private void ic(qq.a aVar) {
        I();
        fh();
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(this, aVar, true);
        this.H = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    private int ig() {
        return this.B.c() ? gg() : R.menu.bottom_app_bar;
    }

    private void ih(float f10) {
        RecyclerView.p layoutManager = this.f25005d.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        float fK0 = layoutManager.k0();
        if (f10 < 0.15f * fK0) {
            if (this.f25005d.canScrollVertically(-100)) {
                this.f25005d.y1(0, -100);
            }
        } else {
            if (f10 <= fK0 * 0.85f || !this.f25005d.canScrollVertically(100)) {
                return;
            }
            this.f25005d.y1(0, 100);
        }
    }

    private List jg() {
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        if (filteredContainers.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> listR = this.f25007f.R();
        ArrayList arrayList = new ArrayList(listR.size());
        for (Integer num : listR) {
            if (num.intValue() >= 0 && num.intValue() < filteredContainers.size()) {
                arrayList.add(filteredContainers.get(num.intValue()));
            }
        }
        return arrayList;
    }

    private void jh(List list) {
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        for (int i10 = 0; i10 < this.f25007f.i(); i10++) {
            if (!list.contains(Integer.valueOf(i10)) && i10 < filteredContainers.size() && filteredContainers.get(i10).a() == 0) {
                this.f25007f.a0(i10);
            }
        }
        this.f25007f.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HostsScreenViewModel kg() {
        HostsScreenViewModel hostsScreenViewModel = HostsScreenViewModel.composeViewModel;
        if (hostsScreenViewModel == null) {
            if (this.f25002a == null) {
                this.f25002a = (HostsScreenViewModel) new androidx.lifecycle.l1(requireActivity()).a(HostsScreenViewModel.class);
            }
            return this.f25002a;
        }
        if (this.f25002a != null) {
            this.f25002a = null;
        }
        return hostsScreenViewModel;
    }

    private void kh(long[] jArr) {
        for (long j10 : jArr) {
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(j10);
            if (itemByLocalId != null) {
                com.server.auditor.ssh.client.utils.analytics.a.y().E2(itemByLocalId.isShared(), com.server.auditor.ssh.client.app.a.N().j(), com.server.auditor.ssh.client.app.a.N().h0(), com.server.auditor.ssh.client.app.a.N().m());
            }
        }
    }

    private boolean lg(HostDBModel hostDBModel, GroupDBModel groupDBModel) {
        return hostDBModel.getVaultKeyId().equals(groupDBModel.getVaultKeyId());
    }

    private void lh(final List list) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || list.size() == 0) {
            return;
        }
        be.b bVar = new be.b(activity, R.style.ThemeOverlay_App_MaterialAlertDialog);
        bVar.setTitle(R.string.dialog_title_delete_group_and_host).setMessage(R.string.dialog_message_delete_group_and_host).setIcon(2131231766).setCancelable(true);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f25196a.Eg(list, dialogInterface, i10);
            }
        };
        bVar.setPositiveButton(R.string.delete, onClickListener).setNegativeButton(R.string.cancel, onClickListener).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mg(List list, eq.i iVar, VaultKeyId vaultKeyId, String str, String str2, long j10) {
        this.B.a(this);
        I();
        G8();
        b0.a aVar = eq.b0.f48942a;
        ConflictsArgData[] conflictsArgDataArrA = aVar.a(iVar);
        boolean zB = this.N.b(conflictsArgDataArrA);
        SourceEntitiesArgData[] sourceEntitiesArgDataArrB = aVar.b(list);
        if (zB) {
            Og(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB, str2, j10);
        } else {
            Ng(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB, str2, j10);
        }
    }

    private void mh(final List list, final GroupDBModel groupDBModel) {
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(new com.server.auditor.ssh.client.widget.k() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.b0
            @Override // com.server.auditor.ssh.client.widget.k
            public final void O8(qq.a aVar) {
                this.f25055a.Fg(list, groupDBModel, aVar);
            }
        }, eq.b0.f48942a.c(groupDBModel.getVaultKeyId(), "Move"), true);
        this.I = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    private void ng(qq.a aVar, Boolean bool) {
        if (bool.booleanValue()) {
            ic(aVar);
        } else {
            xh(aVar);
        }
    }

    private void og(List list, GroupDBModel groupDBModel) {
        if (sg(list, groupDBModel)) {
            Lg(list, groupDBModel);
        } else {
            Jg(groupDBModel, list);
        }
    }

    private void oh(String str) {
        com.server.auditor.ssh.client.widget.a1 a1Var = this.G;
        if (a1Var != null) {
            a1Var.Z2();
        }
        com.server.auditor.ssh.client.widget.i iVar = this.H;
        if (iVar != null) {
            iVar.Z2();
        }
        dh(str);
        this.B.a(this);
    }

    private void p9() {
        NavigationPopUpWhenLargeActivity.f28304b.b(requireActivity(), NavigationPopUpWhenLargeActivity.NavigationDestination.MultikeyPromotionFlow.INSTANCE);
    }

    private void pg() {
        this.O.j().j(getViewLifecycleOwner(), new androidx.lifecycle.l0() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.q
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                this.f25187a.Ch((List) obj);
            }
        });
    }

    private void qg(View view) {
        ((LinearLayout) view.findViewById(R.id.gird_path_layout_parent)).setOnDragListener(this.U);
        this.f25006e = (CoordinatorLayout) view.findViewById(R.id.snackbar_zone);
        this.f25005d = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f25005d.i(new o1(getResources().getDimensionPixelSize(R.dimen.horizontal_space_grid), getResources().getDimensionPixelSize(R.dimen.vertical_space_grid)));
        this.f25005d.setDescendantFocusability(393216);
        this.f25005d.setFocusable(false);
        this.f25005d.setFocusableInTouchMode(false);
        this.B.d(kg().getActionMode().getValue() instanceof c.a);
        com.server.auditor.ssh.client.fragments.hostngroups.k kVar = new com.server.auditor.ssh.client.fragments.hostngroups.k(kg().getSelectedItems(), kg().getFilteredContainers(), this, this.U, this.T, this.V);
        this.f25007f = kVar;
        kVar.Y(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.r
            @Override // iu.a
            public final Object a() {
                return HostsRecyclerFragment.sf();
            }
        });
        this.f25007f.o0(this.C);
        this.f25005d.setItemAnimator(null);
        this.f25005d.setAdapter(this.f25007f);
    }

    private boolean rg(List list, VaultKeyId vaultKeyId) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.server.auditor.ssh.client.fragments.hostngroups.d dVar = (com.server.auditor.ssh.client.fragments.hostngroups.d) it.next();
            if (dVar.a() == 0) {
                arrayList.add(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e());
            } else if (dVar.a() == 1) {
                arrayList.add(((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b());
            }
        }
        return com.server.auditor.ssh.client.ui.vaults.data.a.a(arrayList, vaultKeyId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rh() {
        if (kg().isRateUsBottomSheetDialogShowing()) {
            return;
        }
        new com.server.auditor.ssh.client.widget.c0(null, new a(b2.f52944a.f1())).show(requireActivity().getSupportFragmentManager(), "rateUsBottomSheet");
        kg().setRateUsBottomSheetDialogShowing(true);
    }

    public static /* synthetic */ Boolean sf() {
        return (Boolean) SessionManager.getInstance().terminalSessionHelper.isTabletLayout().getValue();
    }

    private boolean sg(List list, GroupDBModel groupDBModel) {
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(groupDBModel.getVaultKeyId())) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(((Long) it.next()).longValue());
            if (itemByLocalId != null && com.server.auditor.ssh.client.ui.vaults.data.a.b(itemByLocalId.getVaultKeyId())) {
                return false;
            }
        }
        return true;
    }

    private void sh() {
        new be.b(requireContext()).setMessage(R.string.alert_edit_only_owner).setPositiveButton(R.string.ok, null).show();
    }

    private boolean tg(List list, GroupDBModel groupDBModel) {
        if (groupDBModel.isShared()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this.f25010w.getItemByLocalId(((Long) it.next()).longValue()).isShared()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void th(int i10, VaultKeyId vaultKeyId) {
        tp.u0.f81015a.e(requireContext(), this.f25006e, getResources().getQuantityString(R.plurals.drag_and_drop_hosts_plurals, i10, vl.g.f83702b.f(vaultKeyId)), 0).Y();
    }

    private boolean ug(List list, GroupDBModel groupDBModel) {
        if (!groupDBModel.isShared()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f25010w.getItemByLocalId(((Long) it.next()).longValue()).isShared()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uh() {
        new com.server.auditor.ssh.client.widget.k0(null, new k0.a() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.w
            @Override // com.server.auditor.ssh.client.widget.k0.a
            public final void a(com.server.auditor.ssh.client.widget.k0 k0Var) {
                k0Var.dismiss();
            }
        }).show(requireActivity().getSupportFragmentManager(), "RateUsThanksForFeedbackBottomSheetDialog");
    }

    private boolean vg() {
        return this.f25004c.r0() && kg().getCurrentGroupId() == null;
    }

    private void vh(VaultKeyIdSpecification vaultKeyIdSpecification, String str) {
        com.server.auditor.ssh.client.widget.a1 a1Var = new com.server.auditor.ssh.client.widget.a1(eq.b0.f48942a.d(vaultKeyIdSpecification, str), false, this);
        this.G = a1Var;
        a1Var.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    private boolean wg(List list, GroupDBModel groupDBModel) {
        if (groupDBModel == null) {
            return false;
        }
        return this.Q.d(groupDBModel.getVaultKeyId()) && xg(list);
    }

    private void wh(String str) {
        List listJg = jg();
        if (listJg.isEmpty()) {
            return;
        }
        VaultKeyId vaultKeyIdDg = dg((com.server.auditor.ssh.client.fragments.hostngroups.d) listJg.get(0));
        if (listJg.size() == 1) {
            vh(com.server.auditor.ssh.client.ui.vaults.data.a.e(vaultKeyIdDg), str);
            return;
        }
        VaultKeyIdSpecification vaultKeyIdSpecificationE = com.server.auditor.ssh.client.ui.vaults.data.a.e(vaultKeyIdDg);
        if (!rg(listJg, vaultKeyIdDg)) {
            vaultKeyIdSpecificationE = VaultKeyIdSpecification.NotSpecified.INSTANCE;
        }
        vh(vaultKeyIdSpecificationE, str);
    }

    private boolean xg(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!this.Q.d(this.f25010w.getItemByLocalId(((Long) it.next()).longValue()).getVaultKeyId())) {
                z10 = false;
            }
        }
        return z10;
    }

    private void xh(qq.a aVar) {
        List listC = fq.b.f50427s.c(Sf(jg()), aVar.f());
        String strC = aVar.c();
        strC.getClass();
        if (strC.equals("Copy")) {
            hq.g.f54628a.a(listC, aVar.f(), aVar.d());
            oh(strC);
        } else if (strC.equals("Move")) {
            this.M.j(listC, aVar.f(), aVar.d(), "context_menu", this);
        }
        Ah();
        hg.f.p().Y().startFullSync();
    }

    private boolean yg(VaultKeyId vaultKeyId, VaultKeyId vaultKeyId2) {
        return vaultKeyId.equals(vaultKeyId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yh() {
        if (Build.VERSION.SDK_INT >= 31) {
            com.server.auditor.ssh.client.fragments.hostngroups.l.a(requireActivity().getSystemService("vibrator_manager")).vibrate(CombinedVibration.createParallel(VibrationEffect.createPredefined(2)));
        }
    }

    private boolean zg(com.server.auditor.ssh.client.fragments.hostngroups.d dVar) {
        return dVar.a() == 0 || dVar.a() == 1;
    }

    public void Ah() {
        zh(kg().getCurrentGroupId());
    }

    public void Bh() {
        com.server.auditor.ssh.client.fragments.hostngroups.k kVar = this.f25007f;
        if (kVar != null) {
            kVar.p0(vg());
        }
    }

    @Override // oh.c.a
    public void C7() {
        com.server.auditor.ssh.client.utils.analytics.a.y().c4(Avo.OnScreen.HOSTS);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean Ga(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        if (!this.f25007f.U()) {
            if (this.B.c()) {
                V8(i10, cVar);
                return true;
            }
            if (!this.f25007f.a0(i10)) {
                return true;
            }
            cVar.a(this.f25007f.W(i10), this.f25007f.c0());
            this.B.e(this);
            return true;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        if (i10 < 0 || i10 >= filteredContainers.size()) {
            return false;
        }
        com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(i10);
        if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.i) {
            int id2 = (int) ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId();
            Xf(Collections.singletonList(this.f25007f.P(("host" + id2).hashCode())));
            return true;
        }
        if (!(dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e)) {
            return true;
        }
        int idInDatabase = (int) ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase();
        Xf(Collections.singletonList(this.f25007f.P((HostBulk.GROUP_ID_SERIAL_NAME + idInDatabase).hashCode())));
        return true;
    }

    @Override // oh.c.a
    public void I8() {
        final List listR = this.f25007f.R();
        if (listR.isEmpty()) {
            return;
        }
        final MenuBuilder menuBuilder = new MenuBuilder(requireContext());
        requireActivity().getMenuInflater().inflate(ig(), menuBuilder);
        this.P.D(kg().getFilteredContainers());
        this.P.z(getViewLifecycleOwner(), menuBuilder, listR, new n.a() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.c0
            @Override // tp.n.a
            public final void a() {
                this.f25059a.Cg(menuBuilder, listR);
            }
        });
    }

    @Override // iq.b.a
    public void J3(dq.t tVar) {
        oh("Move");
    }

    @Override // com.server.auditor.ssh.client.widget.k
    public void O8(qq.a aVar) {
        boolean z10 = this.K.getBoolean("authorized_feature_show_multikey_promotion", true);
        if (aVar.d().equals("multikey") && z10) {
            p9();
        } else {
            eh(aVar.d());
            xh(aVar);
        }
    }

    public void Rf(boolean z10) {
        List<Integer> listR = this.f25007f.R();
        HashSet hashSet = new HashSet();
        List listB = this.f25011x.b(this.f25010w.getItemListWhichNotDeleted());
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        for (Integer num : listR) {
            if (num.intValue() >= 0 && num.intValue() < filteredContainers.size()) {
                com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(num.intValue());
                if (dVar.a() == 0) {
                    Host hostGh = gh(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getHostId().longValue());
                    if (hostGh != null) {
                        if (z10) {
                            hostGh.setConnectionOrigin(Avo.ConnectionOrigin.FAB);
                        } else {
                            hostGh.setConnectionOrigin(Avo.ConnectionOrigin.CONNECT_IN_CONTEXT_MENU);
                        }
                        TerminalConnectionManager.enqueueStartTerminalSession(hostGh);
                    }
                } else if (dVar.a() == 1) {
                    GroupDBModel groupDBModelB = ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b();
                    hashSet.add(Avo.SelectedItems.GROUP);
                    for (Host host : Yf(listB, Long.valueOf(groupDBModelB.getIdInDatabase()))) {
                        if (z10) {
                            host.setConnectionOrigin(Avo.ConnectionOrigin.FAB);
                        } else {
                            host.setConnectionOrigin(Avo.ConnectionOrigin.CONNECT_IN_CONTEXT_MENU);
                        }
                        TerminalConnectionManager.enqueueStartTerminalSession(host);
                    }
                }
            }
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().a3(new ArrayList(hashSet), listR.size());
        Vf();
    }

    public boolean Rg(int i10) {
        List<Integer> listR = this.f25007f.R();
        boolean z10 = false;
        switch (i10) {
            case R.id.change_group /* 2131362319 */:
                Mg(listR);
                this.B.a(this);
                return true;
            case R.id.clear_selections /* 2131362353 */:
                this.f25007f.N();
                this.B.a(this);
                return true;
            case R.id.close_host /* 2131362363 */:
                Sg();
                this.B.a(this);
                return true;
            case R.id.connect /* 2131362407 */:
                Rf(false);
                this.B.a(this);
                return true;
            case R.id.connect_via_sftp /* 2131362412 */:
                List<Integer> listR2 = this.f25007f.R();
                if (listR2.isEmpty()) {
                    return true;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
                for (Integer num : listR2) {
                    if (num.intValue() >= 0 && num.intValue() < filteredContainers.size()) {
                        com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(num.intValue());
                        if (dVar.a() == 0) {
                            arrayList.add(gh(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getHostId().longValue()));
                        }
                    }
                }
                eg().onStartSFTPConnectionsFromContextMenu(arrayList);
                this.B.a(this);
                return true;
            case R.id.copy_to_vault /* 2131362453 */:
                wh("Copy");
                return true;
            case R.id.delete /* 2131362509 */:
                if (listR.isEmpty()) {
                    return true;
                }
                ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers2 = kg().getFilteredContainers();
                boolean z11 = false;
                for (Integer num2 : listR) {
                    if (num2.intValue() >= 0 && num2.intValue() < filteredContainers2.size()) {
                        com.server.auditor.ssh.client.fragments.hostngroups.d dVar2 = filteredContainers2.get(num2.intValue());
                        if (dVar2.a() == 0) {
                            z11 = true;
                        }
                        if (dVar2.a() == 1) {
                            z10 = true;
                        }
                    }
                }
                if (z10 && z11) {
                    lh(listR);
                    this.B.a(this);
                } else {
                    if (z10) {
                        Uf(listR);
                    } else if (z11) {
                        nh(listR);
                        this.B.a(this);
                    } else {
                        y9.a.f86838a.g("UX fault. No Groups and no hosts to remove.");
                    }
                    this.B.a(this);
                }
                return true;
            case R.id.duplicate /* 2131362580 */:
                Tg();
                this.B.a(this);
                return true;
            case R.id.edit /* 2131362590 */:
                Xf(listR);
                this.B.a(this);
                return true;
            case R.id.move_to_vault /* 2131363217 */:
                wh("Move");
                return true;
            case R.id.select_all /* 2131363655 */:
                jh(listR);
                this.B.b(this);
                return true;
            case R.id.sort_type /* 2131363789 */:
                return true;
            default:
                return false;
        }
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void U5() {
    }

    public void Uf(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        if (filteredContainers.isEmpty()) {
            return;
        }
        long[] jArr = new long[list.size()];
        long[] jArr2 = new long[list.size()];
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < list.size(); i10++) {
            jArr[i10] = -1;
            jArr2[i10] = -1;
            int iIntValue = ((Integer) list.get(i10)).intValue();
            if (iIntValue >= 0 && iIntValue < filteredContainers.size()) {
                com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(iIntValue);
                if (dVar.a() == 0) {
                    jArr[i10] = ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId();
                    z10 = true;
                } else if (dVar.a() == 1) {
                    jArr2[i10] = ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase();
                    z11 = true;
                }
            }
        }
        if (z10) {
            kh(jArr);
        }
        if (z11) {
            this.f25012y.c(jArr);
        } else {
            this.f25012y.a(jArr, false);
        }
        this.f25013z.a(jArr2, !z10);
        zh(kg().getCurrentGroupId());
    }

    public void Ug(boolean z10, GroupDBModel groupDBModel) {
        if (!z10) {
            kg().getHostsToChangeGroup().clear();
            return;
        }
        Vg(new ArrayList(kg().getHostsToChangeGroup()), groupDBModel);
        kg().getHostsToChangeGroup().clear();
        kg().onGroupSelected(false, null);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public void V8(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        if (b2.f52944a.C1().d()) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        if (i10 < 0 || i10 >= filteredContainers.size()) {
            return;
        }
        com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(i10);
        int iA = dVar.a();
        if (this.f25007f.U()) {
            if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.i) {
                int id2 = (int) ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId();
                Xf(Collections.singletonList(this.f25007f.P(("host" + id2).hashCode())));
                return;
            }
            if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) {
                int idInDatabase = (int) ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase();
                Xf(Collections.singletonList(this.f25007f.P((HostBulk.GROUP_ID_SERIAL_NAME + idInDatabase).hashCode())));
                return;
            }
            return;
        }
        if (this.B.c()) {
            if (zg(dVar) && this.f25007f.a0(i10)) {
                cVar.a(this.f25007f.W(i10), this.f25007f.c0());
                if (this.f25007f.Q() == 0) {
                    this.B.a(this);
                    return;
                } else {
                    this.B.b(this);
                    return;
                }
            }
            return;
        }
        if (iA != 0) {
            if (iA == 1) {
                zh(Long.valueOf(((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase()));
                return;
            } else {
                if (iA == 5) {
                    com.server.auditor.ssh.client.utils.analytics.a.y().O3();
                    Pg();
                    return;
                }
                return;
            }
        }
        Host hostGh = gh(((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getHostId().longValue());
        if (hostGh == null) {
            return;
        }
        Long lCg = cg(hostGh);
        hostGh.setConnectionOrigin(Avo.ConnectionOrigin.HOSTS_SCREEN);
        if (lCg != null) {
            SessionManager.getInstance().disconnectTerminalSession(hostGh);
        } else {
            TerminalConnectionManager.openLastActiveTerminalSession(requireContext(), hostGh);
        }
    }

    protected void Vf() {
        this.f25007f.N();
        this.B.a(this);
    }

    public void Vg(List list, GroupDBModel groupDBModel) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            HostDBModel itemByLocalId = this.f25010w.getItemByLocalId(l10.longValue());
            if (itemByLocalId.getGroupId() != null && groupDBModel != null && itemByLocalId.getGroupId().longValue() == groupDBModel.getIdInDatabase()) {
                arrayList.add(l10);
            }
        }
        if (arrayList.size() != list.size()) {
            Wg(list, groupDBModel);
        }
    }

    public void Xf(List list) {
        if (list == null || list.size() != 1) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue < 0 || iIntValue >= filteredContainers.size()) {
            return;
        }
        com.server.auditor.ssh.client.fragments.hostngroups.d dVar = filteredContainers.get(iIntValue);
        if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.i) {
            this.f25012y.b((int) ((com.server.auditor.ssh.client.fragments.hostngroups.i) dVar).e().getId());
        } else if (dVar instanceof com.server.auditor.ssh.client.fragments.hostngroups.e) {
            this.f25013z.b((int) ((com.server.auditor.ssh.client.fragments.hostngroups.e) dVar).b().getIdInDatabase());
        }
    }

    public void Yg() {
    }

    public void Zf() {
        this.B.a(this);
        zh(kg().getCurrentGroupId());
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void bb() {
        Avo.OpenedFrom openedFrom = Avo.OpenedFrom.VAULT_PICKER;
        List listQf = Qf();
        if (!listQf.isEmpty()) {
            openedFrom = Avo.OpenedFrom.CONTEXT_MULTISELECT_HOSTS;
            Avo.SharingButtonLocation sharingButtonLocation = Avo.SharingButtonLocation.HOSTS_MULTIMINUSSELECT_CONTEXT_MENU;
            Avo.SharedEntity sharedEntity = Avo.SharedEntity.HOSTS_MULTIMINUSSELECT;
            if (listQf.size() == 1) {
                if (((TypedEntityIdentifier) listQf.get(0)).getType() == GroupDBModel.class) {
                    openedFrom = Avo.OpenedFrom.CONTEXT_GROUP;
                    sharingButtonLocation = Avo.SharingButtonLocation.GROUP_CONTEXT_MENU;
                    sharedEntity = Avo.SharedEntity.GROUP;
                } else {
                    openedFrom = Avo.OpenedFrom.CONTEXT_HOST;
                    sharingButtonLocation = Avo.SharingButtonLocation.HOST_CONTEXT_MENU;
                    sharedEntity = Avo.SharedEntity.HOST;
                }
            }
            this.f25003b.R4(sharingButtonLocation, sharedEntity);
        }
        this.B.a(this);
        Qg(listQf, openedFrom);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.o
    public l1.c getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    public int gg() {
        return R.menu.hosts_contextual_menu;
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        if (!this.f25007f.W(i10)) {
            Ga(i10, cVar);
            return true;
        }
        RecyclerView.e0 e0VarD0 = this.f25005d.d0(i10);
        if (!(e0VarD0 instanceof ph.b) || point == null) {
            return false;
        }
        Wf();
        List listR = this.f25007f.R();
        if (!listR.contains(Integer.valueOf(e0VarD0.l()))) {
            listR.clear();
            listR.add(Integer.valueOf(e0VarD0.k()));
        }
        ClipData clipDataNewPlainText = ClipData.newPlainText("id", e0VarD0.f10534a.getId() + "");
        View.DragShadowBuilder cVar2 = new ph.c(e0VarD0.f10534a, listR.size(), point);
        View view = e0VarD0.f10534a;
        view.startDragAndDrop(clipDataNewPlainText, cVar2, view, 0);
        return true;
    }

    protected SwipeRefreshLayout.j hg() {
        return new SwipeRefreshLayout.j() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.s
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                hg.f.p().Y().startFullSync();
            }
        };
    }

    @Override // iq.b.a
    public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        I();
        mg(list, iVar, vaultKeyId, str, "context_menu", -1L);
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void na(qq.a aVar) {
        List listJg = jg();
        if (listJg.isEmpty()) {
            I();
            return;
        }
        VaultKeyId vaultKeyIdDg = dg((com.server.auditor.ssh.client.fragments.hostngroups.d) listJg.get(0));
        VaultKeyId vaultKeyIdF = aVar.f();
        if (rg(listJg, vaultKeyIdDg) && yg(vaultKeyIdDg, vaultKeyIdF)) {
            I();
            return;
        }
        ch(aVar.c(), com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f()));
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyIdF)) {
            xh(aVar);
        } else {
            ng(aVar, Boolean.valueOf(Of(listJg)));
        }
    }

    public void nh(final List list) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || list.size() == 0) {
            return;
        }
        ArrayList<com.server.auditor.ssh.client.fragments.hostngroups.d> filteredContainers = kg().getFilteredContainers();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= 0 && num.intValue() < filteredContainers.size() && filteredContainers.get(num.intValue()).a() == 1) {
                Uf(list);
                this.B.a(this);
                return;
            }
        }
        be.b bVar = new be.b(activity);
        bVar.setTitle(R.string.title_promt_remove_hosts).setMessage(R.string.promt_remove_hosts).setCancelable(false);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f25199a.Gg(list, dialogInterface, i10);
            }
        };
        bVar.setPositiveButton(R.string.ok, onClickListener).setNegativeButton(R.string.cancel, onClickListener).create().show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Runnable runnable = (Runnable) this.F.get(i10);
        this.F.remove(i10);
        if (i11 != -1 || runnable == null) {
            return;
        }
        new Handler().post(runnable);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b2.f52944a.f1().u()) {
            this.f25005d.setAdapter(this.f25007f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kg();
        com.server.auditor.ssh.client.fragments.editors.base.i0.b(this, kg().getComposeActions());
        this.J = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.z
            @Override // g.a
            public final void a(Object obj) {
                this.f25211a.bh((ActivityResult) obj);
            }
        });
        if (this.f25012y == null && this.f25013z == null) {
            this.f25013z = new e();
            this.A = new zp.c(requireContext(), new f(), hg.f.p().Y());
            this.f25012y = new j(requireActivity(), new g(), new h(), hg.f.p().k(hg.f.p().Y()), new i(), hg.f.p().j());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.grid_view_layout, viewGroup, false);
        layoutInflater.inflate(R.layout.swipable_recycler_fragment, (FrameLayout) viewInflate.findViewById(R.id.content_frame));
        qg(viewInflate);
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = (MultiSwipeRefreshLayout) viewInflate.findViewById(R.id.swipeRefreshLayout);
        this.D = multiSwipeRefreshLayout;
        com.server.auditor.ssh.client.widget.q0.a(multiSwipeRefreshLayout);
        this.D.setSwipeableChildren(R.id.recycler_view);
        this.D.setOnRefreshListener(hg());
        this.f25008u.g(getActivity(), this.f25005d);
        com.server.auditor.ssh.client.app.a.N().P().j(getViewLifecycleOwner(), new androidx.lifecycle.l0() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.p
            @Override // androidx.lifecycle.l0
            public final void a(Object obj) {
                this.f25179a.Bg((Boolean) obj);
            }
        });
        pg();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25008u.i();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.E = true;
        Ig();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = this.D;
        if (multiSwipeRefreshLayout != null) {
            multiSwipeRefreshLayout.setEnabled(com.server.auditor.ssh.client.app.a.N().u0());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.server.auditor.ssh.client.fragments.editors.base.i0.a(this, kg(), this.f25007f);
        com.server.auditor.ssh.client.fragments.editors.base.i0.c(this, kg().getOnGroupSelected());
    }

    @Override // oh.c.a
    public void p8() {
        this.B.a(this);
        kg().sendFragmentAction(new q.b(c.b.f30351a));
        if (this.f25007f.Q() > 0) {
            this.f25007f.N();
            this.f25007f.o();
        }
    }

    public void ph(int i10) {
        new com.server.auditor.ssh.client.widget.h0(null, new b(b2.f52944a.f1(), i10)).show(requireActivity().getSupportFragmentManager(), "textFeedbackBottomSheet");
    }

    public void qh(int i10) {
        new com.server.auditor.ssh.client.widget.x(null, new c(b2.f52944a.f1(), i10)).show(requireActivity().getSupportFragmentManager(), "RateUsAskLeaveReviewBottomSheetDialog");
    }

    public void zh(Long l10) {
        kg().updateList(l10);
    }
}
