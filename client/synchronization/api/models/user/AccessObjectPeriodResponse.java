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
public final class AccessObjectPeriodResponse implements Parcelable {
    private final String end;
    private final String start;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccessObjectPeriodResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AccessObjectPeriodResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AccessObjectPeriodResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessObjectPeriodResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AccessObjectPeriodResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessObjectPeriodResponse[] newArray(int i10) {
            return new AccessObjectPeriodResponse[i10];
        }
    }

    public /* synthetic */ AccessObjectPeriodResponse(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, AccessObjectPeriodResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.start = str;
        this.end = str2;
    }

    public static /* synthetic */ AccessObjectPeriodResponse copy$default(AccessObjectPeriodResponse accessObjectPeriodResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accessObjectPeriodResponse.start;
        }
        if ((i10 & 2) != 0) {
            str2 = accessObjectPeriodResponse.end;
        }
        return accessObjectPeriodResponse.copy(str, str2);
    }

    @o("end")
    public static /* synthetic */ void getEnd$annotations() {
    }

    @o("start")
    public static /* synthetic */ void getStart$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AccessObjectPeriodResponse accessObjectPeriodResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, accessObjectPeriodResponse.start);
        dVar.f(fVar, 1, accessObjectPeriodResponse.end);
    }

    public final String component1() {
        return this.start;
    }

    public final String component2() {
        return this.end;
    }

    public final AccessObjectPeriodResponse copy(String str, String str2) {
        t.f(str, "start");
        t.f(str2, "end");
        return new AccessObjectPeriodResponse(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessObjectPeriodResponse)) {
            return false;
        }
        AccessObjectPeriodResponse accessObjectPeriodResponse = (AccessObjectPeriodResponse) obj;
        return t.b(this.start, accessObjectPeriodResponse.start) && t.b(this.end, accessObjectPeriodResponse.end);
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "AccessObjectPeriodResponse(start=" + this.start + ", end=" + this.end + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.start);
        parcel.writeString(this.end);
    }

    public AccessObjectPeriodResponse(String str, String str2) {
        t.f(str, "start");
        t.f(str2, "end");
        this.start = str;
        this.end = str2;
    }
}
