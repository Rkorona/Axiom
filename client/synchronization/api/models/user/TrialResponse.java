package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TrialResponse implements Parcelable {
    private final String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TrialResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TrialResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<TrialResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrialResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new TrialResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrialResponse[] newArray(int i10) {
            return new TrialResponse[i10];
        }
    }

    public /* synthetic */ TrialResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TrialResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.validUntil = str;
    }

    public static /* synthetic */ TrialResponse copy$default(TrialResponse trialResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = trialResponse.validUntil;
        }
        return trialResponse.copy(str);
    }

    @o("valid_until")
    public static /* synthetic */ void getValidUntil$annotations() {
    }

    public final String component1() {
        return this.validUntil;
    }

    public final TrialResponse copy(String str) {
        t.f(str, "validUntil");
        return new TrialResponse(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrialResponse) && t.b(this.validUntil, ((TrialResponse) obj).validUntil);
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        return this.validUntil.hashCode();
    }

    public String toString() {
        return "TrialResponse(validUntil=" + this.validUntil + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.validUntil);
    }

    public TrialResponse(String str) {
        t.f(str, "validUntil");
        this.validUntil = str;
    }
}
