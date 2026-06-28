package com.server.auditor.ssh.client.ssh.terminal;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.crystalnix.terminal.transport.mosh.MoshClientSessionTransport;
import com.crystalnix.terminal.view.TerminalView;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.ActiveConnection;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import io.split.android.client.service.sseclient.EventStreamParser;
import java.util.Iterator;
import ju.k;
import ju.q;
import ju.t;
import k9.d;
import nk.y;
import o4.a2;
import o4.i0;
import o4.z0;
import pw.m;
import qg.e8;
import su.s;
import tp.g;
import ut.i;
import ut.n;
import ut.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Fragment {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f38931u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f38932v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e8 f38933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f38934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TerminalFragmentViewModel f38935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mm.b f38936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f38937e = o.a(new iu.a() { // from class: nm.w0
        @Override // iu.a
        public final Object a() {
            return com.server.auditor.ssh.client.ssh.terminal.b.If(this.f66988a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g.b f38938f;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final Fragment a(TypedSessionId typedSessionId) {
            t.f(typedSessionId, "sessionId");
            Bundle bundle = new Bundle();
            bundle.putInt("session_id_key", typedSessionId.getSessionId());
            Fragment bVar = typedSessionId instanceof TypedSessionId.Terminal ? new b() : new y();
            bVar.setArguments(bundle);
            return bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ssh.terminal.b$b, reason: collision with other inner class name */
    public static final class C0601b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38939a;

        public C0601b(String str) {
            t.f(str, "text");
            this.f38939a = str;
        }

        public final String a() {
            return this.f38939a;
        }
    }

    /* synthetic */ class c implements g.a, ju.n {
        c() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ActivityResult activityResult) {
            t.f(activityResult, "p0");
            b.this.Df(activityResult);
        }

        @Override // ju.n
        public final i c() {
            return new q(1, b.this, b.class, "onSessionLogsPromotionScreenResultReceived", "onSessionLogsPromotionScreenResultReceived(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof ju.n)) {
                return t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    private final void Af() {
        mm.b bVar;
        Iterator<ActiveConnection> it = SessionManager.getInstance().getActiveTerminalConnection().iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            ActiveConnection next = it.next();
            long id2 = next.getId();
            TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
            if (terminalFragmentViewModel == null) {
                t.t("terminalFragmentViewModel");
                terminalFragmentViewModel = null;
            }
            if (id2 == terminalFragmentViewModel.getTerminalSessionId()) {
                TerminalFragmentViewModel terminalFragmentViewModel2 = this.f38935c;
                if (terminalFragmentViewModel2 == null) {
                    t.t("terminalFragmentViewModel");
                    terminalFragmentViewModel2 = null;
                }
                terminalFragmentViewModel2.setConnection(next);
            }
        }
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        AssetManager assets = wf().f72390g.getContext().getAssets();
        TerminalFragmentViewModel terminalFragmentViewModel3 = this.f38935c;
        if (terminalFragmentViewModel3 == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel3 = null;
        }
        Connection connection = terminalFragmentViewModel3.getConnection();
        Integer numValueOf = Integer.valueOf(wf().f72390g.getWidth());
        Integer numValueOf2 = Integer.valueOf(wf().f72390g.getHeight());
        Integer numValueOf3 = Integer.valueOf(wf().f72390g.getColumns());
        Integer numValueOf4 = Integer.valueOf(wf().f72390g.getRows());
        d dVar = this.f38934b;
        if (dVar == null) {
            t.t("terminalPresenter");
            dVar = null;
        }
        this.f38936d = new mm.b(dVarM, assets, connection, numValueOf, numValueOf2, numValueOf3, numValueOf4, dVar.getScaledScreenDensity());
        TerminalFragmentViewModel terminalFragmentViewModel4 = this.f38935c;
        if (terminalFragmentViewModel4 == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel4 = null;
        }
        g9.a terminalSession = terminalFragmentViewModel4.getTerminalSession();
        if (terminalSession != null) {
            d9.a aVarS = terminalSession.S();
            t.e(aVarS, "getTerminalDisplay(...)");
            mm.b bVar2 = this.f38936d;
            if (bVar2 == null) {
                t.t("terminalSessionParameters");
                bVar2 = null;
            }
            String strH = bVar2.h();
            t.e(strH, "getColorScheme(...)");
            Ff(aVarS, strH);
            k9.d dVarYf = yf();
            mm.b bVar3 = this.f38936d;
            if (bVar3 == null) {
                t.t("terminalSessionParameters");
                bVar3 = null;
            }
            int iC = dVarYf.g(bVar3.h()).c(-1);
            wf().f72389f.setBackgroundColor(iC);
            wf().b().setBackgroundColor(iC);
            wf().f72390g.setTerminalSession(terminalSession);
            wf().f72390g.setAttachedView(true);
            TerminalView terminalView = wf().f72390g;
            mm.b bVar4 = this.f38936d;
            if (bVar4 == null) {
                t.t("terminalSessionParameters");
                bVar4 = null;
            }
            terminalView.setSwipeDetectorTimerTick(bVar4.j());
            mm.b bVar5 = this.f38936d;
            if (bVar5 == null) {
                t.t("terminalSessionParameters");
                bVar5 = null;
            }
            k9.e eVarN = bVar5.n();
            mm.b bVar6 = this.f38936d;
            if (bVar6 == null) {
                t.t("terminalSessionParameters");
                bVar6 = null;
            }
            float fL = bVar6.l();
            d dVar2 = this.f38934b;
            if (dVar2 == null) {
                t.t("terminalPresenter");
                dVar2 = null;
            }
            eVarN.v((int) (fL * dVar2.getScaledScreenDensity()));
            TerminalView terminalView2 = wf().f72390g;
            mm.b bVar7 = this.f38936d;
            if (bVar7 == null) {
                t.t("terminalSessionParameters");
                bVar7 = null;
            }
            terminalView2.setTerminalSettings(bVar7.n());
            TerminalFragmentViewModel terminalFragmentViewModel5 = this.f38935c;
            if (terminalFragmentViewModel5 == null) {
                t.t("terminalFragmentViewModel");
                terminalFragmentViewModel5 = null;
            }
            g9.a terminalSession2 = terminalFragmentViewModel5.getTerminalSession();
            if (terminalSession2 != null) {
                mm.b bVar8 = this.f38936d;
                if (bVar8 == null) {
                    t.t("terminalSessionParameters");
                } else {
                    bVar = bVar8;
                }
                terminalSession2.d0(bVar.l());
            }
            wf().b().post(new Runnable() { // from class: nm.v0
                @Override // java.lang.Runnable
                public final void run() {
                    com.server.auditor.ssh.client.ssh.terminal.b.Bf(this.f66986a);
                }
            });
            wf().f72388e.setTerminalSession(terminalSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(b bVar) {
        if (bVar.Hf() && bVar.isAdded()) {
            bVar.wf().f72390g.requestFocus();
        } else if (bVar.isAdded() && bVar.wf().f72390g.isFocused()) {
            bVar.wf().f72390g.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df(ActivityResult activityResult) {
        activityResult.getResultCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        int i10 = a2Var.f(a2.l.h()).f47584b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        t.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i10;
        return a2Var;
    }

    private final void Ff(d9.a aVar, String str) {
        boolean zE = s.E(aVar.t().h(), str, true);
        k9.b bVarG = yf().g(str);
        if (zE) {
            return;
        }
        aVar.V0(bVarG);
    }

    private final boolean Hf() {
        FragmentActivity activity = getActivity();
        TerminalActivity terminalActivity = activity instanceof TerminalActivity ? (TerminalActivity) activity : null;
        return terminalActivity != null && terminalActivity.r2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k9.d If(b bVar) {
        d.a aVar = k9.d.f63270c;
        Context contextRequireContext = bVar.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return aVar.b(contextRequireContext);
    }

    private final void Jf() {
        String host;
        k9.b bVarE;
        d9.a aVarS;
        TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
        mm.b bVar = null;
        if (terminalFragmentViewModel == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel = null;
        }
        g9.a terminalSession = terminalFragmentViewModel.getTerminalSession();
        if (terminalSession != null && terminalSession.isConnected()) {
            wf().f72385b.setVisibility(8);
            Kf();
            return;
        }
        wf().f72385b.setVisibility(0);
        TextView textView = wf().f72385b;
        TerminalFragmentViewModel terminalFragmentViewModel2 = this.f38935c;
        if (terminalFragmentViewModel2 == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel2 = null;
        }
        Connection connection = terminalFragmentViewModel2.getConnection();
        if (connection == null || (host = connection.getHost()) == null) {
            host = "";
        }
        textView.setText(getString(R.string.connecting_to, host));
        TerminalFragmentViewModel terminalFragmentViewModel3 = this.f38935c;
        if (terminalFragmentViewModel3 == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel3 = null;
        }
        g9.a terminalSession2 = terminalFragmentViewModel3.getTerminalSession();
        if (terminalSession2 == null || (aVarS = terminalSession2.S()) == null || (bVarE = aVarS.t()) == null) {
            bVarE = yf().e(k9.d.f63270c.a());
        }
        wf().f72385b.setTextColor(bVarE.g(false));
        TerminalFragmentViewModel terminalFragmentViewModel4 = this.f38935c;
        if (terminalFragmentViewModel4 == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel4 = null;
        }
        if (terminalFragmentViewModel4.getTerminalSession() != null) {
            wf().f72385b.setTextSize(r0.N());
            return;
        }
        TextView textView2 = wf().f72385b;
        mm.b bVar2 = this.f38936d;
        if (bVar2 == null) {
            t.t("terminalSessionParameters");
        } else {
            bVar = bVar2;
        }
        textView2.setTextSize(bVar.l());
    }

    private final void Kf() {
        if (isVisible()) {
            TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
            if (terminalFragmentViewModel == null) {
                t.t("terminalFragmentViewModel");
                terminalFragmentViewModel = null;
            }
            g9.a terminalSession = terminalFragmentViewModel.getTerminalSession();
            if (terminalSession == null || !terminalSession.Y()) {
                wf().f72386c.setVisibility(8);
            } else {
                wf().f72386c.setVisibility(0);
                wf().f72386c.setText(R.string.mosh_banner_network_is_unreachable);
            }
        }
    }

    private final e8 wf() {
        e8 e8Var = this.f38933a;
        if (e8Var != null) {
            return e8Var;
        }
        throw new IllegalStateException();
    }

    private final k9.d yf() {
        return (k9.d) this.f38937e.getValue();
    }

    public final boolean Cf() {
        return this.f38933a != null;
    }

    public final void Gf(z9.c cVar) {
        t.f(cVar, "onTerminalStatusChanged");
        wf().f72390g.setOnTerminalStatusChangedListener(cVar);
    }

    public final void Lf() {
        Af();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38935c = (TerminalFragmentViewModel) new l1(this).a(TerminalFragmentViewModel.class);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f38934b = (d) new l1(activity).a(TerminalActivityViewModel.class);
        }
        TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
        if (terminalFragmentViewModel == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel = null;
        }
        Bundle arguments = getArguments();
        terminalFragmentViewModel.setTerminalSessionId(arguments != null ? arguments.getInt("session_id_key") : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        g.a().o(this);
        this.f38933a = e8.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = wf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        g.a().q(this);
        super.onDestroyView();
        this.f38933a = null;
    }

    @m
    public final void onMoshEvent(MoshClientSessionTransport.OnPauseResumeMoshEvent onPauseResumeMoshEvent) {
        t.f(onPauseResumeMoshEvent, EventStreamParser.EVENT_FIELD);
        if (isVisible()) {
            Kf();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        wf().f72390g.setAttachedView(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
        TerminalFragmentViewModel terminalFragmentViewModel2 = null;
        if (terminalFragmentViewModel == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel = null;
        }
        SessionManager sessionManager = SessionManager.getInstance();
        TerminalFragmentViewModel terminalFragmentViewModel3 = this.f38935c;
        if (terminalFragmentViewModel3 == null) {
            t.t("terminalFragmentViewModel");
        } else {
            terminalFragmentViewModel2 = terminalFragmentViewModel3;
        }
        terminalFragmentViewModel.setTerminalSession(sessionManager.getTerminalSession(terminalFragmentViewModel2.getTerminalSessionId()));
        Af();
        Jf();
    }

    @m
    public final void onSessionConnected(yl.a aVar) {
        t.f(aVar, EventStreamParser.EVENT_FIELD);
        if (aVar.f87003d == h9.a.Terminal) {
            int i10 = aVar.f87002c;
            TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
            TerminalFragmentViewModel terminalFragmentViewModel2 = null;
            if (terminalFragmentViewModel == null) {
                t.t("terminalFragmentViewModel");
                terminalFragmentViewModel = null;
            }
            if (i10 == terminalFragmentViewModel.getTerminalSessionId()) {
                TerminalFragmentViewModel terminalFragmentViewModel3 = this.f38935c;
                if (terminalFragmentViewModel3 == null) {
                    t.t("terminalFragmentViewModel");
                    terminalFragmentViewModel3 = null;
                }
                g9.a terminalSession = terminalFragmentViewModel3.getTerminalSession();
                if (terminalSession != null && !terminalSession.isConnected()) {
                    TerminalFragmentViewModel terminalFragmentViewModel4 = this.f38935c;
                    if (terminalFragmentViewModel4 == null) {
                        t.t("terminalFragmentViewModel");
                        terminalFragmentViewModel4 = null;
                    }
                    SessionManager sessionManager = SessionManager.getInstance();
                    TerminalFragmentViewModel terminalFragmentViewModel5 = this.f38935c;
                    if (terminalFragmentViewModel5 == null) {
                        t.t("terminalFragmentViewModel");
                    } else {
                        terminalFragmentViewModel2 = terminalFragmentViewModel5;
                    }
                    terminalFragmentViewModel4.setTerminalSession(sessionManager.getTerminalSession(terminalFragmentViewModel2.getTerminalSessionId()));
                    Af();
                }
                Jf();
            }
        }
    }

    @m
    public final void onUpdateTerminalTextForAccessibilityService(C0601b c0601b) {
        t.f(c0601b, EventStreamParser.EVENT_FIELD);
        wf().f72390g.setContentDescription(c0601b.a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        wf().f72390g.setOnCreateContextMenuListener(this);
        wf().f72390g.setTerminalScrollerView(wf().f72388e);
        wf().f72390g.setPinchEnabled(com.server.auditor.ssh.client.app.a.N().M().getBoolean("is_pinch_to_zoon_enabled", true));
        z0.F0(wf().f72389f, new i0() { // from class: nm.x0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view2, a2 a2Var) {
                return com.server.auditor.ssh.client.ssh.terminal.b.Ef(view2, a2Var);
            }
        });
        this.f38938f = registerForActivityResult(new h.c(), new c());
    }

    public final e8 vf() {
        return this.f38933a;
    }

    public final Connection xf() {
        TerminalFragmentViewModel terminalFragmentViewModel = this.f38935c;
        if (terminalFragmentViewModel == null) {
            t.t("terminalFragmentViewModel");
            terminalFragmentViewModel = null;
        }
        return terminalFragmentViewModel.getConnection();
    }

    public final int zf() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("session_id_key");
        }
        return 0;
    }
}
