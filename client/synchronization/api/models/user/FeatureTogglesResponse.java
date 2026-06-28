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
public final class FeatureTogglesResponse implements Parcelable {
    private final String encryptionSchema;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FeatureTogglesResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return FeatureTogglesResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<FeatureTogglesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureTogglesResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new FeatureTogglesResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureTogglesResponse[] newArray(int i10) {
            return new FeatureTogglesResponse[i10];
        }
    }

    public /* synthetic */ FeatureTogglesResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, FeatureTogglesResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.encryptionSchema = str;
    }

    public static /* synthetic */ FeatureTogglesResponse copy$default(FeatureTogglesResponse featureTogglesResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = featureTogglesResponse.encryptionSchema;
        }
        return featureTogglesResponse.copy(str);
    }

    @o("encryption_schema")
    public static /* synthetic */ void getEncryptionSchema$annotations() {
    }

    public final String component1() {
        return this.encryptionSchema;
    }

    public final FeatureTogglesResponse copy(String str) {
        t.f(str, "encryptionSchema");
        return new FeatureTogglesResponse(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureTogglesResponse) && t.b(this.encryptionSchema, ((FeatureTogglesResponse) obj).encryptionSchema);
    }

    public final String getEncryptionSchema() {
        return this.encryptionSchema;
    }

    public int hashCode() {
        return this.encryptionSchema.hashCode();
    }

    public String toString() {
        return "FeatureTogglesResponse(encryptionSchema=" + this.encryptionSchema + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.encryptionSchema);
    }

    public FeatureTogglesResponse(String str) {
        t.f(str, "encryptionSchema");
        this.encryptionSchema = str;
    }
}
