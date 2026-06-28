package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.LogsNavGraphRoute;
import hv.c;
import hv.p;
import java.lang.annotation.Annotation;
import ju.t;
import lv.w1;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface LogsNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class LogsRoute implements LogsNavGraphRoute, NavigationRailsRoute {
        public static final LogsRoute INSTANCE = new LogsRoute();
        public static final Parcelable.Creator<LogsRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.q
            @Override // iu.a
            public final Object a() {
                return LogsNavGraphRoute.LogsRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LogsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return LogsRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LogsRoute[] newArray(int i10) {
                return new LogsRoute[i10];
            }
        }

        private LogsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.LogsNavGraphRoute.LogsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LogsRoute);
        }

        public int hashCode() {
            return -1531007444;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "LogsRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
