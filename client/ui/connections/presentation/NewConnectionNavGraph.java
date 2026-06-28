package com.server.auditor.ssh.client.ui.connections.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.ui.connections.presentation.NewConnectionNavGraph;
import java.lang.annotation.Annotation;
import lv.w1;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface NewConnectionNavGraph extends Parcelable {

    @hv.p
    @Keep
    public static final class BonjourSearch implements NewConnectionNavGraph {
        public static final BonjourSearch INSTANCE = new BonjourSearch();
        public static final Parcelable.Creator<BonjourSearch> CREATOR = new a();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: fo.b
            @Override // iu.a
            public final Object a() {
                return NewConnectionNavGraph.BonjourSearch._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BonjourSearch createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return BonjourSearch.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BonjourSearch[] newArray(int i10) {
                return new BonjourSearch[i10];
            }
        }

        private BonjourSearch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.connections.presentation.NewConnectionNavGraph.BonjourSearch", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BonjourSearch);
        }

        public int hashCode() {
            return -1812356554;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "BonjourSearch";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @hv.p
    @Keep
    public static final class NewConnection implements NewConnectionNavGraph {
        public static final NewConnection INSTANCE = new NewConnection();
        public static final Parcelable.Creator<NewConnection> CREATOR = new a();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: fo.c
            @Override // iu.a
            public final Object a() {
                return NewConnectionNavGraph.NewConnection._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NewConnection createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return NewConnection.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NewConnection[] newArray(int i10) {
                return new NewConnection[i10];
            }
        }

        private NewConnection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.connections.presentation.NewConnectionNavGraph.NewConnection", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NewConnection);
        }

        public int hashCode() {
            return -303435927;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NewConnection";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @hv.p
    @Keep
    public static final class SerialConnectParameters implements NewConnectionNavGraph {
        public static final SerialConnectParameters INSTANCE = new SerialConnectParameters();
        public static final Parcelable.Creator<SerialConnectParameters> CREATOR = new a();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: fo.d
            @Override // iu.a
            public final Object a() {
                return NewConnectionNavGraph.SerialConnectParameters._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SerialConnectParameters createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return SerialConnectParameters.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialConnectParameters[] newArray(int i10) {
                return new SerialConnectParameters[i10];
            }
        }

        private SerialConnectParameters() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.connections.presentation.NewConnectionNavGraph.SerialConnectParameters", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SerialConnectParameters);
        }

        public int hashCode() {
            return -1905290261;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SerialConnectParameters";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
