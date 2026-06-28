package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
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
public final class EnterpriseResponse implements Parcelable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f39068id;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EnterpriseResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return EnterpriseResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<EnterpriseResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnterpriseResponse createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new EnterpriseResponse(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnterpriseResponse[] newArray(int i10) {
            return new EnterpriseResponse[i10];
        }
    }

    public /* synthetic */ EnterpriseResponse(int i10, int i11, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, EnterpriseResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f39068id = i11;
        this.name = str;
    }

    public static /* synthetic */ EnterpriseResponse copy$default(EnterpriseResponse enterpriseResponse, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = enterpriseResponse.f39068id;
        }
        if ((i11 & 2) != 0) {
            str = enterpriseResponse.name;
        }
        return enterpriseResponse.copy(i10, str);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EnterpriseResponse enterpriseResponse, d dVar, f fVar) {
        dVar.t(fVar, 0, enterpriseResponse.f39068id);
        dVar.f(fVar, 1, enterpriseResponse.name);
    }

    public final int component1() {
        return this.f39068id;
    }

    public final String component2() {
        return this.name;
    }

    public final EnterpriseResponse copy(int i10, String str) {
        t.f(str, Column.MULTI_KEY_NAME);
        return new EnterpriseResponse(i10, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterpriseResponse)) {
            return false;
        }
        EnterpriseResponse enterpriseResponse = (EnterpriseResponse) obj;
        return this.f39068id == enterpriseResponse.f39068id && t.b(this.name, enterpriseResponse.name);
    }

    public final int getId() {
        return this.f39068id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f39068id) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "EnterpriseResponse(id=" + this.f39068id + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeInt(this.f39068id);
        parcel.writeString(this.name);
    }

    public EnterpriseResponse(int i10, String str) {
        t.f(str, Column.MULTI_KEY_NAME);
        this.f39068id = i10;
        this.name = str;
    }
}
