package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.AuthyTokenErrorModel;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AuthyTokenErrorModel implements Parcelable {
    private static final n[] $childSerializers;
    public static final int $stable;
    public static final Parcelable.Creator<AuthyTokenErrorModel> CREATOR;
    public static final Companion Companion;
    private static final c serializer;
    private final List<String> authyErrors;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return AuthyTokenErrorModel.serializer;
        }

        public final c serializer() {
            return AuthyTokenErrorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<AuthyTokenErrorModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthyTokenErrorModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AuthyTokenErrorModel(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthyTokenErrorModel[] newArray(int i10) {
            return new AuthyTokenErrorModel[i10];
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        CREATOR = new Creator();
        $stable = 8;
        $childSerializers = new n[]{o.b(r.f82638b, new a() { // from class: hn.a
            @Override // iu.a
            public final Object a() {
                return AuthyTokenErrorModel._childSerializers$_anonymous_();
            }
        })};
        serializer = companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthyTokenErrorModel() {
        this((List) null, 1, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthyTokenErrorModel copy$default(AuthyTokenErrorModel authyTokenErrorModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = authyTokenErrorModel.authyErrors;
        }
        return authyTokenErrorModel.copy(list);
    }

    @hv.o("authy_token")
    public static /* synthetic */ void getAuthyErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AuthyTokenErrorModel authyTokenErrorModel, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (!dVar.E(fVar, 0) && authyTokenErrorModel.authyErrors == null) {
            return;
        }
        dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), authyTokenErrorModel.authyErrors);
    }

    public final List<String> component1() {
        return this.authyErrors;
    }

    public final AuthyTokenErrorModel copy(List<String> list) {
        return new AuthyTokenErrorModel(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthyTokenErrorModel) && t.b(this.authyErrors, ((AuthyTokenErrorModel) obj).authyErrors);
    }

    public final List<String> getAuthyErrors() {
        return this.authyErrors;
    }

    public int hashCode() {
        List<String> list = this.authyErrors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "AuthyTokenErrorModel(authyErrors=" + this.authyErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.authyErrors);
    }

    public /* synthetic */ AuthyTokenErrorModel(int i10, List list, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.authyErrors = null;
        } else {
            this.authyErrors = list;
        }
    }

    public AuthyTokenErrorModel(List<String> list) {
        this.authyErrors = list;
    }

    public /* synthetic */ AuthyTokenErrorModel(List list, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list);
    }
}
