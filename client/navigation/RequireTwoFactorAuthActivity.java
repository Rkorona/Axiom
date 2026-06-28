package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ConfigureTwoFactorAuthFragmentArgs;
import com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragmentArgs;
import com.server.auditor.ssh.client.navigation.totp.ChooseTwoFactorProviderArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class RequireTwoFactorAuthActivity extends TransparentStatusBarActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28500f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28501u = TransparentStatusBarActivity.f28654e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f28502v;

    public interface TwoFactorFlowDestination extends Parcelable {

        public static final class Configure implements TwoFactorFlowDestination {
            public static final Configure INSTANCE = new Configure();
            public static final Parcelable.Creator<Configure> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Configure createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return Configure.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Configure[] newArray(int i10) {
                    return new Configure[i10];
                }
            }

            private Configure() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Configure);
            }

            public int hashCode() {
                return -1930706861;
            }

            public String toString() {
                return "Configure";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class Disable implements TwoFactorFlowDestination {
            public static final Disable INSTANCE = new Disable();
            public static final Parcelable.Creator<Disable> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Disable createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return Disable.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Disable[] newArray(int i10) {
                    return new Disable[i10];
                }
            }

            private Disable() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Disable);
            }

            public int hashCode() {
                return -1923156075;
            }

            public String toString() {
                return "Disable";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class Enable implements TwoFactorFlowDestination {
            public static final Enable INSTANCE = new Enable();
            public static final Parcelable.Creator<Enable> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Enable createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return Enable.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Enable[] newArray(int i10) {
                    return new Enable[i10];
                }
            }

            private Enable() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Enable);
            }

            public int hashCode() {
                return -29325514;
            }

            public String toString() {
                return "Enable";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private final Intent a(Context context, TwoFactorFlowDestination twoFactorFlowDestination) {
            Intent intent = new Intent(context, (Class<?>) RequireTwoFactorAuthActivity.class);
            if (twoFactorFlowDestination instanceof TwoFactorFlowDestination.Configure) {
                intent.setFlags(67108864);
            }
            intent.putExtra("NAVIGATION_DESTINATION_KEY", twoFactorFlowDestination);
            return intent;
        }

        public final boolean b() {
            return RequireTwoFactorAuthActivity.f28502v;
        }

        public final void c(g.b bVar, Context context, TwoFactorFlowDestination twoFactorFlowDestination) {
            ju.t.f(bVar, "activityLauncher");
            ju.t.f(context, "context");
            ju.t.f(twoFactorFlowDestination, "destination");
            bVar.a(a(context, twoFactorFlowDestination));
        }

        private a() {
        }
    }

    private final Bundle r0() {
        return getIntent().getExtras();
    }

    private final void s0() {
        if (getResources().getBoolean(R.bool.isTablet)) {
            return;
        }
        setRequestedOrientation(1);
    }

    private final void t0(Bundle bundle) {
        getIntent().putExtras(bundle);
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        s0();
        tp.c1.e(this, com.server.auditor.ssh.client.app.a.N().F());
        super.onCreate(bundle);
        setContentView(R.layout.activity_require_two_factor_auth);
        Bundle extras = getIntent().getExtras();
        androidx.navigation.m0 m0VarC = androidx.navigation.e2.c(this, R.id.main_content);
        androidx.navigation.m1 m1VarB = m0VarC.y().b(R.navigation.two_auth_set_up);
        TwoFactorFlowDestination twoFactorFlowDestination = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (extras != null) {
                twoFactorFlowDestination = (TwoFactorFlowDestination) extras.getParcelable("NAVIGATION_DESTINATION_KEY", TwoFactorFlowDestination.class);
            }
        } else if (extras != null) {
            twoFactorFlowDestination = (TwoFactorFlowDestination) extras.getParcelable("NAVIGATION_DESTINATION_KEY");
        }
        if (twoFactorFlowDestination == null) {
            throw new NullPointerException("Cannot retrieve the 'NAVIGATION_DESTINATION_KEY' from activity arguments!");
        }
        if (ju.t.b(twoFactorFlowDestination, TwoFactorFlowDestination.Enable.INSTANCE)) {
            Bundle bundle2 = new ChooseTwoFactorProviderArgs.a("actionTwoFactorEnable").a().toBundle();
            ju.t.e(bundle2, "toBundle(...)");
            t0(bundle2);
            m1VarB.W(R.id.chooseTwoFactorProvider);
        } else if (ju.t.b(twoFactorFlowDestination, TwoFactorFlowDestination.Disable.INSTANCE)) {
            Bundle bundle3 = new RequireTwoFactorAuthPasswordFragmentArgs.a("actionTwoFactorDisable").a().toBundle();
            ju.t.e(bundle3, "toBundle(...)");
            t0(bundle3);
            m1VarB.W(R.id.enter_password);
        } else {
            if (!ju.t.b(twoFactorFlowDestination, TwoFactorFlowDestination.Configure.INSTANCE)) {
                throw new ut.s();
            }
            Bundle bundle4 = new ConfigureTwoFactorAuthFragmentArgs.a("actionTwoFactorEnable").a().toBundle();
            ju.t.e(bundle4, "toBundle(...)");
            t0(bundle4);
            m1VarB.W(R.id.configure_two_factor_auth);
            f28502v = true;
        }
        m0VarC.f0(m1VarB, r0());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        f28502v = false;
        super.onDestroy();
    }
}
