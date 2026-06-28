package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KnownHostsNavGraphRoute;
import hv.c;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface KnownHostsNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class KnownHostsRoute implements KnownHostsNavGraphRoute, NavigationRailsRoute {
        public static final KnownHostsRoute INSTANCE = new KnownHostsRoute();
        public static final Parcelable.Creator<KnownHostsRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.p
            @Override // iu.a
            public final Object a() {
                return KnownHostsNavGraphRoute.KnownHostsRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KnownHostsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return KnownHostsRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KnownHostsRoute[] newArray(int i10) {
                return new KnownHostsRoute[i10];
            }
        }

        private KnownHostsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KnownHostsNavGraphRoute.KnownHostsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KnownHostsRoute);
        }

        public int hashCode() {
            return 996088058;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "KnownHostsRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class ViewKnownHostRoute implements KnownHostsNavGraphRoute {
        private final long knownHostId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ViewKnownHostRoute> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32921b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32920a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KnownHostsNavGraphRoute.ViewKnownHostRoute", aVar, 1);
                i2Var.r("knownHostId", false);
                descriptor = i2Var;
                f32921b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewKnownHostRoute deserialize(e eVar) {
                long jO;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    jO = cVarD.o(fVar, 0);
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            jO2 = cVarD.o(fVar, 0);
                            i11 = 1;
                        }
                    }
                    jO = jO2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ViewKnownHostRoute(i10, jO, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ViewKnownHostRoute viewKnownHostRoute) {
                t.f(fVar, "encoder");
                t.f(viewKnownHostRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ViewKnownHostRoute.write$Self$Termius_app_googleProductionRelease(viewKnownHostRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{h1.f64699a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f32920a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewKnownHostRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new ViewKnownHostRoute(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ViewKnownHostRoute[] newArray(int i10) {
                return new ViewKnownHostRoute[i10];
            }
        }

        public /* synthetic */ ViewKnownHostRoute(int i10, long j10, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32920a.getDescriptor());
            }
            this.knownHostId = j10;
        }

        public static /* synthetic */ ViewKnownHostRoute copy$default(ViewKnownHostRoute viewKnownHostRoute, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = viewKnownHostRoute.knownHostId;
            }
            return viewKnownHostRoute.copy(j10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ViewKnownHostRoute viewKnownHostRoute, d dVar, f fVar) {
            dVar.q(fVar, 0, viewKnownHostRoute.knownHostId);
        }

        public final long component1() {
            return this.knownHostId;
        }

        public final ViewKnownHostRoute copy(long j10) {
            return new ViewKnownHostRoute(j10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewKnownHostRoute) && this.knownHostId == ((ViewKnownHostRoute) obj).knownHostId;
        }

        public final long getKnownHostId() {
            return this.knownHostId;
        }

        public int hashCode() {
            return Long.hashCode(this.knownHostId);
        }

        public String toString() {
            return "ViewKnownHostRoute(knownHostId=" + this.knownHostId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeLong(this.knownHostId);
        }

        public ViewKnownHostRoute(long j10) {
            this.knownHostId = j10;
        }
    }
}
