package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.navigation.fragment.NavHostFragment;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreenArgs;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.ui.base.presentation.PerformTeamPendingActionActivity;
import com.server.auditor.ssh.client.utils.analytics.Avo;

/* JADX INFO: loaded from: classes3.dex */
public final class EndOfTrialActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28139c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28140d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zu.w f28141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zu.k0 f28142f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f28143a = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.b0
        @Override // iu.a
        public final Object a() {
            return EndOfTrialActivity.p0(this.f28989a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ut.n f28144b = new androidx.lifecycle.k1(ju.n0.b(EndOfTrialViewModel.class), new d(this), new c(this), new e(null, this));

    public static abstract class ExpiredSubscriptionFlow implements Parcelable {
        public static final int $stable = 0;

        public static final class EndOfTrialFlow extends ExpiredSubscriptionFlow {
            public static final EndOfTrialFlow INSTANCE = new EndOfTrialFlow();
            public static final Parcelable.Creator<EndOfTrialFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EndOfTrialFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return EndOfTrialFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EndOfTrialFlow[] newArray(int i10) {
                    return new EndOfTrialFlow[i10];
                }
            }

            private EndOfTrialFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof EndOfTrialFlow);
            }

            public int hashCode() {
                return -1643085184;
            }

            public String toString() {
                return "EndOfTrialFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ExpiredEnterpriseFlow extends ExpiredSubscriptionFlow {
            public static final ExpiredEnterpriseFlow INSTANCE = new ExpiredEnterpriseFlow();
            public static final Parcelable.Creator<ExpiredEnterpriseFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExpiredEnterpriseFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ExpiredEnterpriseFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ExpiredEnterpriseFlow[] newArray(int i10) {
                    return new ExpiredEnterpriseFlow[i10];
                }
            }

            private ExpiredEnterpriseFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ExpiredEnterpriseFlow);
            }

            public int hashCode() {
                return -1698740762;
            }

            public String toString() {
                return "ExpiredEnterpriseFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ExpiredTeamMemberFlow extends ExpiredSubscriptionFlow {
            public static final ExpiredTeamMemberFlow INSTANCE = new ExpiredTeamMemberFlow();
            public static final Parcelable.Creator<ExpiredTeamMemberFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExpiredTeamMemberFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ExpiredTeamMemberFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ExpiredTeamMemberFlow[] newArray(int i10) {
                    return new ExpiredTeamMemberFlow[i10];
                }
            }

            private ExpiredTeamMemberFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ExpiredTeamMemberFlow);
            }

            public int hashCode() {
                return 1252845276;
            }

            public String toString() {
                return "ExpiredTeamMemberFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ExpiredTeamOwnerFlow extends ExpiredSubscriptionFlow {
            public static final ExpiredTeamOwnerFlow INSTANCE = new ExpiredTeamOwnerFlow();
            public static final Parcelable.Creator<ExpiredTeamOwnerFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExpiredTeamOwnerFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ExpiredTeamOwnerFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ExpiredTeamOwnerFlow[] newArray(int i10) {
                    return new ExpiredTeamOwnerFlow[i10];
                }
            }

            private ExpiredTeamOwnerFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ExpiredTeamOwnerFlow);
            }

            public int hashCode() {
                return 2040579085;
            }

            public String toString() {
                return "ExpiredTeamOwnerFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class PromoFlow extends ExpiredSubscriptionFlow {
            public static final PromoFlow INSTANCE = new PromoFlow();
            public static final Parcelable.Creator<PromoFlow> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PromoFlow createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return PromoFlow.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PromoFlow[] newArray(int i10) {
                    return new PromoFlow[i10];
                }
            }

            private PromoFlow() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof PromoFlow);
            }

            public int hashCode() {
                return -1562279665;
            }

            public String toString() {
                return "PromoFlow";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ ExpiredSubscriptionFlow(ju.k kVar) {
            this();
        }

        private ExpiredSubscriptionFlow() {
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private final boolean a() {
            return (((Boolean) b().getValue()).booleanValue() || ((Boolean) PerformTeamPendingActionActivity.f39657b.b().getValue()).booleanValue()) ? false : true;
        }

        public final zu.k0 b() {
            return EndOfTrialActivity.f28142f;
        }

        public final void c(Context context, ExpiredSubscriptionFlow expiredSubscriptionFlow, Avo.ChoosePlanSource choosePlanSource) {
            Object value;
            ju.t.f(context, "context");
            ju.t.f(expiredSubscriptionFlow, "expiredSubscriptionFlow");
            ju.t.f(choosePlanSource, "avoChoosePlanSource");
            if (a()) {
                zu.w wVar = EndOfTrialActivity.f28141e;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, Boolean.TRUE));
                Intent intent = new Intent(context, (Class<?>) EndOfTrialActivity.class);
                intent.putExtra("NAVIGATION_DESTINATION_KEY", expiredSubscriptionFlow);
                Bundle bundle = new EndOfTrialScreenArgs.a(expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.PromoFlow, choosePlanSource.name()).a().toBundle();
                ju.t.e(bundle, "toBundle(...)");
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    static final class b implements androidx.lifecycle.l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f28145a;

        b(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f28145a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f28145a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f28145a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class c extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f28146a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f28146a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28147a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f28147a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.m1 a() {
            return this.f28147a.getViewModelStore();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f28148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f28148a = aVar;
            this.f28149b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f28148a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f28149b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    static {
        zu.w wVarA = zu.m0.a(Boolean.FALSE);
        f28141e = wVarA;
        f28142f = zu.h.b(wVarA);
    }

    private final androidx.navigation.m0 j0() {
        return (androidx.navigation.m0) this.f28143a.getValue();
    }

    private final Bundle k0() {
        return getIntent().getExtras();
    }

    private final EndOfTrialViewModel l0() {
        return (EndOfTrialViewModel) this.f28144b.getValue();
    }

    private final void m0() {
        l0().getBulkAccountLiveData().j(this, new b(new iu.l() { // from class: com.server.auditor.ssh.client.navigation.c0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialActivity.n0(this.f28992a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ut.m0 n0(com.server.auditor.ssh.client.navigation.EndOfTrialActivity r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L50
            int r0 = r3.hashCode()
            r1 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r1) goto L40
            r1 = -1548612125(0xffffffffa3b20de3, float:-1.930468E-17)
            if (r0 == r1) goto L2f
            r1 = -1281977283(0xffffffffb396943d, float:-7.011884E-8)
            if (r0 == r1) goto L26
            if (r0 == 0) goto L23
            r2 = 422194963(0x192a2f13, float:8.7983006E-24)
            if (r0 == r2) goto L1d
            goto L50
        L1d:
            java.lang.String r2 = "processing"
        L1f:
            r3.equals(r2)
            goto L50
        L23:
            java.lang.String r2 = ""
            goto L1f
        L26:
            java.lang.String r0 = "failed"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto L50
        L2f:
            java.lang.String r0 = "offline"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto L50
        L38:
            com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel r2 = r2.l0()
            r2.onFetchAccountDetailsFailed()
            goto L50
        L40:
            java.lang.String r0 = "success"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L49
            goto L50
        L49:
            com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel r2 = r2.l0()
            r2.onFetchAccountDetailsSuccess()
        L50:
            ut.m0 r2 = ut.m0.f82633a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.EndOfTrialActivity.n0(com.server.auditor.ssh.client.navigation.EndOfTrialActivity, java.lang.String):ut.m0");
    }

    private final void o0() {
        setRequestedOrientation(!getResources().getBoolean(R.bool.isTablet) ? 1 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.navigation.m0 p0(EndOfTrialActivity endOfTrialActivity) {
        Fragment fragmentN0 = endOfTrialActivity.getSupportFragmentManager().n0(R.id.navigation_container);
        ju.t.d(fragmentN0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) fragmentN0).wf();
    }

    private final void q0(ExpiredSubscriptionFlow.EndOfTrialFlow endOfTrialFlow) {
        j0().f0(j0().y().b(R.navigation.end_of_trial_flow), k0());
    }

    private final void r0(ExpiredSubscriptionFlow.ExpiredEnterpriseFlow expiredEnterpriseFlow) {
        androidx.navigation.m1 m1VarB = j0().y().b(R.navigation.end_of_trial_flow);
        m1VarB.W(R.id.expiredEnterpriseBasicScreen);
        j0().f0(m1VarB, k0());
    }

    private final void s0(ExpiredSubscriptionFlow.ExpiredTeamMemberFlow expiredTeamMemberFlow) {
        androidx.navigation.m1 m1VarB = j0().y().b(R.navigation.end_of_trial_flow);
        m1VarB.W(R.id.expiredTeamMemberScreen);
        j0().f0(m1VarB, k0());
    }

    private final void t0(ExpiredSubscriptionFlow.ExpiredTeamOwnerFlow expiredTeamOwnerFlow) {
        androidx.navigation.m1 m1VarB = j0().y().b(R.navigation.end_of_trial_flow);
        m1VarB.W(R.id.expiredTeamOwnerScreen);
        j0().f0(m1VarB, k0());
    }

    private final void v0(ExpiredSubscriptionFlow.PromoFlow promoFlow) {
        j0().f0(j0().y().b(R.navigation.end_of_trial_flow), k0());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        o0();
        super.onCreate(bundle);
        o4.m1.b(getWindow(), false);
        setFinishOnTouchOutside(false);
        setContentView(R.layout.end_of_trial_activity);
        m0();
        Bundle extras = getIntent().getExtras();
        ExpiredSubscriptionFlow expiredSubscriptionFlow = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (extras != null) {
                expiredSubscriptionFlow = (ExpiredSubscriptionFlow) extras.getParcelable("NAVIGATION_DESTINATION_KEY", ExpiredSubscriptionFlow.class);
            }
        } else if (extras != null) {
            expiredSubscriptionFlow = (ExpiredSubscriptionFlow) extras.getParcelable("NAVIGATION_DESTINATION_KEY");
        }
        if (expiredSubscriptionFlow == null) {
            throw new NullPointerException("Cannot retrieve the 'NAVIGATION_DESTINATION_KEY' from activity arguments!");
        }
        if (expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.PromoFlow) {
            v0((ExpiredSubscriptionFlow.PromoFlow) expiredSubscriptionFlow);
            return;
        }
        if (expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.EndOfTrialFlow) {
            q0((ExpiredSubscriptionFlow.EndOfTrialFlow) expiredSubscriptionFlow);
            return;
        }
        if (expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.ExpiredTeamOwnerFlow) {
            t0((ExpiredSubscriptionFlow.ExpiredTeamOwnerFlow) expiredSubscriptionFlow);
        } else if (expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.ExpiredTeamMemberFlow) {
            s0((ExpiredSubscriptionFlow.ExpiredTeamMemberFlow) expiredSubscriptionFlow);
        } else {
            if (!(expiredSubscriptionFlow instanceof ExpiredSubscriptionFlow.ExpiredEnterpriseFlow)) {
                throw new ut.s();
            }
            r0((ExpiredSubscriptionFlow.ExpiredEnterpriseFlow) expiredSubscriptionFlow);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Object value;
        super.onDestroy();
        zu.w wVar = f28141e;
        do {
            value = wVar.getValue();
            ((Boolean) value).getClass();
        } while (!wVar.g(value, Boolean.FALSE));
    }
}
