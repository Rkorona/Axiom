package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import hv.c;
import hv.p;
import iu.a;
import java.util.Arrays;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.q2;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class MinimalVersionErrorModel implements Parcelable {
    private static final n[] $childSerializers;
    public static final int $stable;
    public static final Parcelable.Creator<MinimalVersionErrorModel> CREATOR;
    public static final Companion Companion;
    private static final c serializer;
    private final String[] error;
    private final String requiredAppVersion;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return MinimalVersionErrorModel.serializer;
        }

        public final c serializer() {
            return MinimalVersionErrorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<MinimalVersionErrorModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinimalVersionErrorModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new MinimalVersionErrorModel(parcel.createStringArray(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinimalVersionErrorModel[] newArray(int i10) {
            return new MinimalVersionErrorModel[i10];
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        CREATOR = new Creator();
        $stable = 8;
        $childSerializers = new n[]{o.b(r.f82638b, new a() { // from class: hn.g
            @Override // iu.a
            public final Object a() {
                return MinimalVersionErrorModel._childSerializers$_anonymous_();
            }
        }), null};
        serializer = companion.serializer();
    }

    public /* synthetic */ MinimalVersionErrorModel(int i10, String[] strArr, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, MinimalVersionErrorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.error = strArr;
        if ((i10 & 2) == 0) {
            this.requiredAppVersion = null;
        } else {
            this.requiredAppVersion = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new q2(n0.b(String.class), x2.f64817a);
    }

    public static /* synthetic */ MinimalVersionErrorModel copy$default(MinimalVersionErrorModel minimalVersionErrorModel, String[] strArr, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            strArr = minimalVersionErrorModel.error;
        }
        if ((i10 & 2) != 0) {
            str = minimalVersionErrorModel.requiredAppVersion;
        }
        return minimalVersionErrorModel.copy(strArr, str);
    }

    @hv.o("error")
    public static /* synthetic */ void getError$annotations() {
    }

    @hv.o("required")
    public static /* synthetic */ void getRequiredAppVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MinimalVersionErrorModel minimalVersionErrorModel, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), minimalVersionErrorModel.error);
        if (!dVar.E(fVar, 1) && minimalVersionErrorModel.requiredAppVersion == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, minimalVersionErrorModel.requiredAppVersion);
    }

    public final String[] component1() {
        return this.error;
    }

    public final String component2() {
        return this.requiredAppVersion;
    }

    public final MinimalVersionErrorModel copy(String[] strArr, String str) {
        t.f(strArr, "error");
        return new MinimalVersionErrorModel(strArr, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.b(MinimalVersionErrorModel.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.d(obj, "null cannot be cast to non-null type com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel");
        return Arrays.equals(this.error, ((MinimalVersionErrorModel) obj).error);
    }

    public final String[] getError() {
        return this.error;
    }

    public final String getRequiredAppVersion() {
        return this.requiredAppVersion;
    }

    public int hashCode() {
        return Arrays.hashCode(this.error);
    }

    public String toString() {
        String str = (String) vt.n.t0(this.error, 0);
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringArray(this.error);
        parcel.writeString(this.requiredAppVersion);
    }

    public MinimalVersionErrorModel(String[] strArr, String str) {
        t.f(strArr, "error");
        this.error = strArr;
        this.requiredAppVersion = str;
    }

    public /* synthetic */ MinimalVersionErrorModel(String[] strArr, String str, int i10, k kVar) {
        this(strArr, (i10 & 2) != 0 ? null : str);
    }
}
