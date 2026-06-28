package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey$$serializer;
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
public final class AuthResponseModel implements Parcelable {
    private final ApiKey apiKey;
    private final BulkAccountResponse bulkAccountResponse;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthResponseModel> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AuthResponseModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AuthResponseModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthResponseModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AuthResponseModel(parcel.readInt() == 0 ? null : ApiKey.CREATOR.createFromParcel(parcel), BulkAccountResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthResponseModel[] newArray(int i10) {
            return new AuthResponseModel[i10];
        }
    }

    public /* synthetic */ AuthResponseModel(int i10, ApiKey apiKey, BulkAccountResponse bulkAccountResponse, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, AuthResponseModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.apiKey = null;
        } else {
            this.apiKey = apiKey;
        }
        this.bulkAccountResponse = bulkAccountResponse;
    }

    public static /* synthetic */ AuthResponseModel copy$default(AuthResponseModel authResponseModel, ApiKey apiKey, BulkAccountResponse bulkAccountResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiKey = authResponseModel.apiKey;
        }
        if ((i10 & 2) != 0) {
            bulkAccountResponse = authResponseModel.bulkAccountResponse;
        }
        return authResponseModel.copy(apiKey, bulkAccountResponse);
    }

    @o("credentials")
    public static /* synthetic */ void getApiKey$annotations() {
    }

    @o("bulk_account")
    public static /* synthetic */ void getBulkAccountResponse$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AuthResponseModel authResponseModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || authResponseModel.apiKey != null) {
            dVar.v(fVar, 0, ApiKey$$serializer.INSTANCE, authResponseModel.apiKey);
        }
        dVar.o(fVar, 1, BulkAccountResponse$$serializer.INSTANCE, authResponseModel.bulkAccountResponse);
    }

    public final ApiKey component1() {
        return this.apiKey;
    }

    public final BulkAccountResponse component2() {
        return this.bulkAccountResponse;
    }

    public final AuthResponseModel copy(ApiKey apiKey, BulkAccountResponse bulkAccountResponse) {
        t.f(bulkAccountResponse, "bulkAccountResponse");
        return new AuthResponseModel(apiKey, bulkAccountResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResponseModel)) {
            return false;
        }
        AuthResponseModel authResponseModel = (AuthResponseModel) obj;
        return t.b(this.apiKey, authResponseModel.apiKey) && t.b(this.bulkAccountResponse, authResponseModel.bulkAccountResponse);
    }

    public final ApiKey getApiKey() {
        return this.apiKey;
    }

    public final BulkAccountResponse getBulkAccountResponse() {
        return this.bulkAccountResponse;
    }

    public int hashCode() {
        ApiKey apiKey = this.apiKey;
        return ((apiKey == null ? 0 : apiKey.hashCode()) * 31) + this.bulkAccountResponse.hashCode();
    }

    public String toString() {
        return "AuthResponseModel(apiKey=" + this.apiKey + ", bulkAccountResponse=" + this.bulkAccountResponse + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        ApiKey apiKey = this.apiKey;
        if (apiKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            apiKey.writeToParcel(parcel, i10);
        }
        this.bulkAccountResponse.writeToParcel(parcel, i10);
    }

    public AuthResponseModel(ApiKey apiKey, BulkAccountResponse bulkAccountResponse) {
        t.f(bulkAccountResponse, "bulkAccountResponse");
        this.apiKey = apiKey;
        this.bulkAccountResponse = bulkAccountResponse;
    }

    public /* synthetic */ AuthResponseModel(ApiKey apiKey, BulkAccountResponse bulkAccountResponse, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : apiKey, bulkAccountResponse);
    }
}
