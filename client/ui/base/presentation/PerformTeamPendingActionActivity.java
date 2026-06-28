package com.server.auditor.ssh.client.ui.base.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.team.TeamTrialOwnerAwaitingDowngradeScreenArgs;
import com.server.auditor.ssh.client.ui.base.data.PerformTeamPendingActionsNavFlow;
import com.server.auditor.ssh.client.ui.base.presentation.PerformTeamPendingActionActivity;
import ju.k;
import ju.t;
import ut.n;
import ut.o;
import ut.s;
import zu.h;
import zu.k0;
import zu.m0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class PerformTeamPendingActionActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39657b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39658c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w f39659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k0 f39660e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f39661a = o.a(new iu.a() { // from class: xn.d
        @Override // iu.a
        public final Object a() {
            return PerformTeamPendingActionActivity.l0(this.f85893a);
        }
    });

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private final boolean a() {
            return !((Boolean) b().getValue()).booleanValue();
        }

        public final k0 b() {
            return PerformTeamPendingActionActivity.f39660e;
        }

        public final void c(Context context, PerformTeamPendingActionsNavFlow performTeamPendingActionsNavFlow) {
            Object value;
            t.f(context, "context");
            t.f(performTeamPendingActionsNavFlow, "performTeamPendingActionsNavFlow");
            if (a()) {
                w wVar = PerformTeamPendingActionActivity.f39659d;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, Boolean.TRUE));
                Intent intent = new Intent(context, (Class<?>) PerformTeamPendingActionActivity.class);
                intent.putExtra("NAVIGATION_DESTINATION_KEY", performTeamPendingActionsNavFlow);
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    static {
        w wVarA = m0.a(Boolean.FALSE);
        f39659d = wVarA;
        f39660e = h.b(wVarA);
    }

    private final androidx.navigation.m0 i0() {
        return (androidx.navigation.m0) this.f39661a.getValue();
    }

    private final Bundle j0() {
        return getIntent().getExtras();
    }

    private final void k0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.navigation.m0 l0(PerformTeamPendingActionActivity performTeamPendingActionActivity) {
        Fragment fragmentN0 = performTeamPendingActionActivity.getSupportFragmentManager().n0(R.id.navigation_container);
        t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) fragmentN0).wf();
    }

    private final void m0(PerformTeamPendingActionsNavFlow.TeamTrialOwnerAwaitingDowngradeFlow teamTrialOwnerAwaitingDowngradeFlow) {
        m1 m1VarB = i0().y().b(R.navigation.team_pending_actions_flow);
        Bundle bundle = new TeamTrialOwnerAwaitingDowngradeScreenArgs.a(teamTrialOwnerAwaitingDowngradeFlow.getDowngradeToPlanType()).a().toBundle();
        t.e(bundle, "toBundle(...)");
        n0(bundle);
        m1VarB.W(R.id.teamTrialOwnerAwaitingDowngradeScreen);
        i0().f0(m1VarB, j0());
    }

    private final void n0(Bundle bundle) {
        getIntent().putExtras(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        k0();
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
        setFinishOnTouchOutside(false);
        setContentView(R.layout.perform_team_pending_action_activity);
        Bundle extras = getIntent().getExtras();
        PerformTeamPendingActionsNavFlow performTeamPendingActionsNavFlow = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (extras != null) {
                performTeamPendingActionsNavFlow = (PerformTeamPendingActionsNavFlow) extras.getParcelable("NAVIGATION_DESTINATION_KEY", PerformTeamPendingActionsNavFlow.class);
            }
        } else if (extras != null) {
            performTeamPendingActionsNavFlow = (PerformTeamPendingActionsNavFlow) extras.getParcelable("NAVIGATION_DESTINATION_KEY");
        }
        if (performTeamPendingActionsNavFlow == null) {
            throw new NullPointerException("Cannot retrieve the 'NAVIGATION_DESTINATION_KEY' from activity arguments!");
        }
        if (!(performTeamPendingActionsNavFlow instanceof PerformTeamPendingActionsNavFlow.TeamTrialOwnerAwaitingDowngradeFlow)) {
            throw new s();
        }
        m0((PerformTeamPendingActionsNavFlow.TeamTrialOwnerAwaitingDowngradeFlow) performTeamPendingActionsNavFlow);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Object value;
        super.onDestroy();
        w wVar = f39659d;
        do {
            value = wVar.getValue();
            ((Boolean) value).getClass();
        } while (!wVar.g(value, Boolean.FALSE));
    }
}
