package com.server.auditor.ssh.client.synchronization.api.models.sso;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.sso.FirebaseBadRequestModel;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class FirebaseBadRequestModel implements Parcelable {
    private final List<String> firebaseToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FirebaseBadRequestModel> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: en.a
        @Override // iu.a
        public final Object a() {
            return FirebaseBadRequestModel._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return FirebaseBadRequestModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<FirebaseBadRequestModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FirebaseBadRequestModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new FirebaseBadRequestModel(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FirebaseBadRequestModel[] newArray(int i10) {
            return new FirebaseBadRequestModel[i10];
        }
    }

    public /* synthetic */ FirebaseBadRequestModel(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, FirebaseBadRequestModel$$serializer.INSTANCE.getDescriptor());
        }
        this.firebaseToken = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FirebaseBadRequestModel copy$default(FirebaseBadRequestModel firebaseBadRequestModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = firebaseBadRequestModel.firebaseToken;
        }
        return firebaseBadRequestModel.copy(list);
    }

    @hv.o("firebase_token")
    public static /* synthetic */ void getFirebaseToken$annotations() {
    }

    public final List<String> component1() {
        return this.firebaseToken;
    }

    public final FirebaseBadRequestModel copy(List<String> list) {
        t.f(list, "firebaseToken");
        return new FirebaseBadRequestModel(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseBadRequestModel) && t.b(this.firebaseToken, ((FirebaseBadRequestModel) obj).firebaseToken);
    }

    public final String getErrorMessage() {
        if (this.firebaseToken.isEmpty()) {
            return null;
        }
        return this.firebaseToken.get(0);
    }

    public final List<String> getFirebaseToken() {
        return this.firebaseToken;
    }

    public int hashCode() {
        return this.firebaseToken.hashCode();
    }

    public String toString() {
        return "FirebaseBadRequestModel(firebaseToken=" + this.firebaseToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.firebaseToken);
    }

    public FirebaseBadRequestModel(List<String> list) {
        t.f(list, "firebaseToken");
        this.firebaseToken = list;
    }
}
