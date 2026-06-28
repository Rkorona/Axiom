package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AccessObjectResponse implements Parcelable {
    public static final int $stable = 0;
    private final AccessObjectPeriodResponse period;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccessObjectResponse> CREATOR = new Creator();

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AccessObjectResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AccessObjectResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessObjectResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AccessObjectResponse(parcel.readInt() == 0 ? null : AccessObjectPeriodResponse.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessObjectResponse[] newArray(int i10) {
            return new AccessObjectResponse[i10];
        }
    }

    public /* synthetic */ AccessObjectResponse(int i10, AccessObjectPeriodResponse accessObjectPeriodResponse, String str, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, AccessObjectResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.period = null;
        } else {
            this.period = accessObjectPeriodResponse;
        }
        this.title = str;
    }

    public static /* synthetic */ AccessObjectResponse copy$default(AccessObjectResponse accessObjectResponse, AccessObjectPeriodResponse accessObjectPeriodResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            accessObjectPeriodResponse = accessObjectResponse.period;
        }
        if ((i10 & 2) != 0) {
            str = accessObjectResponse.title;
        }
        return accessObjectResponse.copy(accessObjectPeriodResponse, str);
    }

    @o("period")
    public static /* synthetic */ void getPeriod$annotations() {
    }

    @o("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AccessObjectResponse accessObjectResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || accessObjectResponse.period != null) {
            dVar.v(fVar, 0, AccessObjectPeriodResponse$$serializer.INSTANCE, accessObjectResponse.period);
        }
        dVar.f(fVar, 1, accessObjectResponse.title);
    }

    public final AccessObjectPeriodResponse component1() {
        return this.period;
    }

    public final String component2() {
        return this.title;
    }

    public final AccessObjectResponse copy(AccessObjectPeriodResponse accessObjectPeriodResponse, String str) {
        t.f(str, "title");
        return new AccessObjectResponse(accessObjectPeriodResponse, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessObjectResponse)) {
            return false;
        }
        AccessObjectResponse accessObjectResponse = (AccessObjectResponse) obj;
        return t.b(this.period, accessObjectResponse.period) && t.b(this.title, accessObjectResponse.title);
    }

    public final AccessObjectPeriodResponse getPeriod() {
        return this.period;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        AccessObjectPeriodResponse accessObjectPeriodResponse = this.period;
        return ((accessObjectPeriodResponse == null ? 0 : accessObjectPeriodResponse.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "AccessObjectResponse(period=" + this.period + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        AccessObjectPeriodResponse accessObjectPeriodResponse = this.period;
        if (accessObjectPeriodResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accessObjectPeriodResponse.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.title);
    }

    public AccessObjectResponse(AccessObjectPeriodResponse accessObjectPeriodResponse, String str) {
        t.f(str, "title");
        this.period = accessObjectPeriodResponse;
        this.title = str;
    }

    public /* synthetic */ AccessObjectResponse(AccessObjectPeriodResponse accessObjectPeriodResponse, String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : accessObjectPeriodResponse, str);
    }
}
