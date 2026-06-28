package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.w1;
import qu.b;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@p
@Keep
public abstract class HomeScreenBottomNavItem implements NavigationRoute {
    public static final int $stable = 0;
    private final int iconResId;
    private final int titleResId;
    public static final a Companion = new a(null);
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.a
        @Override // iu.a
        public final Object a() {
            return HomeScreenBottomNavItem._init_$_anonymous_();
        }
    });

    @p
    @Keep
    public static final class Connections extends HomeScreenBottomNavItem {
        public static final Connections INSTANCE = new Connections();
        public static final Parcelable.Creator<Connections> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.b
            @Override // iu.a
            public final Object a() {
                return HomeScreenBottomNavItem.Connections._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Connections createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return Connections.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Connections[] newArray(int i10) {
                return new Connections[i10];
            }
        }

        private Connections() {
            super(R.string.connections_fragment, R.drawable.ic_nav_connections, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Connections", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connections);
        }

        public int hashCode() {
            return 2058625784;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Connections";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class Settings extends HomeScreenBottomNavItem implements NavigationRailsRoute {
        public static final Settings INSTANCE = new Settings();
        public static final Parcelable.Creator<Settings> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.c
            @Override // iu.a
            public final Object a() {
                return HomeScreenBottomNavItem.Settings._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Settings createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return Settings.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Settings[] newArray(int i10) {
                return new Settings[i10];
            }
        }

        private Settings() {
            super(R.string.preferences, R.drawable.ic_nav_settings, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Settings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Settings);
        }

        public int hashCode() {
            return 348754272;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Settings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class Vaults extends HomeScreenBottomNavItem {
        public static final Vaults INSTANCE = new Vaults();
        public static final Parcelable.Creator<Vaults> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.d
            @Override // iu.a
            public final Object a() {
                return HomeScreenBottomNavItem.Vaults._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Vaults createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return Vaults.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Vaults[] newArray(int i10) {
                return new Vaults[i10];
            }
        }

        private Vaults() {
            super(R.string.filter_vault_title, R.drawable.ic_one_vault_new, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Vaults", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Vaults);
        }

        public int hashCode() {
            return -1687251714;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Vaults";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) HomeScreenBottomNavItem.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public /* synthetic */ HomeScreenBottomNavItem(int i10, int i11, k kVar) {
        this(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return new m("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem", n0.b(HomeScreenBottomNavItem.class), new b[]{n0.b(Connections.class), n0.b(Settings.class), n0.b(Vaults.class)}, new c[]{new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Connections", Connections.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Settings", Settings.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HomeScreenBottomNavItem.Vaults", Vaults.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(HomeScreenBottomNavItem homeScreenBottomNavItem, d dVar, f fVar) {
        dVar.t(fVar, 0, homeScreenBottomNavItem.titleResId);
        dVar.t(fVar, 1, homeScreenBottomNavItem.iconResId);
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public /* synthetic */ HomeScreenBottomNavItem(int i10, int i11, int i12, s2 s2Var) {
        this.titleResId = i11;
        this.iconResId = i12;
    }

    private HomeScreenBottomNavItem(int i10, int i11) {
        this.titleResId = i10;
        this.iconResId = i11;
    }
}
