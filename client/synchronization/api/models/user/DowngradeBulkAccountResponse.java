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
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DowngradeBulkAccountResponse implements Parcelable {
    private final BulkAccountResponse bulkAccount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DowngradeBulkAccountResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DowngradeBulkAccountResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<DowngradeBulkAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DowngradeBulkAccountResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new DowngradeBulkAccountResponse(parcel.readInt() == 0 ? null : BulkAccountResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DowngradeBulkAccountResponse[] newArray(int i10) {
            return new DowngradeBulkAccountResponse[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DowngradeBulkAccountResponse() {
        this((BulkAccountResponse) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ DowngradeBulkAccountResponse copy$default(DowngradeBulkAccountResponse downgradeBulkAccountResponse, BulkAccountResponse bulkAccountResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bulkAccountResponse = downgradeBulkAccountResponse.bulkAccount;
        }
        return downgradeBulkAccountResponse.copy(bulkAccountResponse);
    }

    @o("bulk_account")
    public static /* synthetic */ void getBulkAccount$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DowngradeBulkAccountResponse downgradeBulkAccountResponse, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && downgradeBulkAccountResponse.bulkAccount == null) {
            return;
        }
        dVar.v(fVar, 0, BulkAccountResponse$$serializer.INSTANCE, downgradeBulkAccountResponse.bulkAccount);
    }

    public final BulkAccountResponse component1() {
        return this.bulkAccount;
    }

    public final DowngradeBulkAccountResponse copy(BulkAccountResponse bulkAccountResponse) {
        return new DowngradeBulkAccountResponse(bulkAccountResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DowngradeBulkAccountResponse) && t.b(this.bulkAccount, ((DowngradeBulkAccountResponse) obj).bulkAccount);
    }

    public final BulkAccountResponse getBulkAccount() {
        return this.bulkAccount;
    }

    public int hashCode() {
        BulkAccountResponse bulkAccountResponse = this.bulkAccount;
        if (bulkAccountResponse == null) {
            return 0;
        }
        return bulkAccountResponse.hashCode();
    }

    public String toString() {
        return "DowngradeBulkAccountResponse(bulkAccount=" + this.bulkAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        BulkAccountResponse bulkAccountResponse = this.bulkAccount;
        if (bulkAccountResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bulkAccountResponse.writeToParcel(parcel, i10);
        }
    }

    public /* synthetic */ DowngradeBulkAccountResponse(int i10, BulkAccountResponse bulkAccountResponse, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.bulkAccount = null;
        } else {
            this.bulkAccount = bulkAccountResponse;
        }
    }

    public DowngradeBulkAccountResponse(BulkAccountResponse bulkAccountResponse) {
        this.bulkAccount = bulkAccountResponse;
    }

    public /* synthetic */ DowngradeBulkAccountResponse(BulkAccountResponse bulkAccountResponse, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : bulkAccountResponse);
    }
}
