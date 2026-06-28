package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

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
import lv.x2;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class UserLoginErrorModel implements Parcelable {
    public static final int $stable;
    private static final String AUTH_BLOCKED = "Authentication blocked!";
    public static final Parcelable.Creator<UserLoginErrorModel> CREATOR;
    public static final Companion Companion;
    private static final c serializer;
    private final String detail;
    private final String error;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return UserLoginErrorModel.serializer;
        }

        public final c serializer() {
            return UserLoginErrorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<UserLoginErrorModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLoginErrorModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new UserLoginErrorModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserLoginErrorModel[] newArray(int i10) {
            return new UserLoginErrorModel[i10];
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        CREATOR = new Creator();
        $stable = 8;
        serializer = companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserLoginErrorModel() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    @o("detail")
    public static /* synthetic */ void getDetail$annotations() {
    }

    @o("error")
    public static /* synthetic */ void getError$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UserLoginErrorModel userLoginErrorModel, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || userLoginErrorModel.detail != null) {
            dVar.v(fVar, 0, x2.f64817a, userLoginErrorModel.detail);
        }
        if (!dVar.E(fVar, 1) && userLoginErrorModel.error == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, userLoginErrorModel.error);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isAuthBlocked() {
        String str = this.error;
        return (str == null || s.m0(str) || !t.b(this.error, AUTH_BLOCKED)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.detail);
        parcel.writeString(this.error);
    }

    public /* synthetic */ UserLoginErrorModel(int i10, String str, String str2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.detail = null;
        } else {
            this.detail = str;
        }
        if ((i10 & 2) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
    }

    public UserLoginErrorModel(String str, String str2) {
        this.detail = str;
        this.error = str2;
    }

    public /* synthetic */ UserLoginErrorModel(String str, String str2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
