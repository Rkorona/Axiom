package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.ChangeEmailErrorModel;
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
public final class ChangeEmailErrorModel implements Parcelable {
    private static final n[] $childSerializers;
    private final List<String> emailErrors;
    private final List<String> passwordErrors;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChangeEmailErrorModel> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ChangeEmailErrorModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<ChangeEmailErrorModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangeEmailErrorModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ChangeEmailErrorModel(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangeEmailErrorModel[] newArray(int i10) {
            return new ChangeEmailErrorModel[i10];
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: hn.b
            @Override // iu.a
            public final Object a() {
                return ChangeEmailErrorModel._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: hn.c
            @Override // iu.a
            public final Object a() {
                return ChangeEmailErrorModel._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeEmailErrorModel() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeEmailErrorModel copy$default(ChangeEmailErrorModel changeEmailErrorModel, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = changeEmailErrorModel.emailErrors;
        }
        if ((i10 & 2) != 0) {
            list2 = changeEmailErrorModel.passwordErrors;
        }
        return changeEmailErrorModel.copy(list, list2);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmailErrors$annotations() {
    }

    @hv.o("password")
    public static /* synthetic */ void getPasswordErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChangeEmailErrorModel changeEmailErrorModel, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || changeEmailErrorModel.emailErrors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), changeEmailErrorModel.emailErrors);
        }
        if (!dVar.E(fVar, 1) && changeEmailErrorModel.passwordErrors == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), changeEmailErrorModel.passwordErrors);
    }

    public final List<String> component1() {
        return this.emailErrors;
    }

    public final List<String> component2() {
        return this.passwordErrors;
    }

    public final ChangeEmailErrorModel copy(List<String> list, List<String> list2) {
        return new ChangeEmailErrorModel(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeEmailErrorModel)) {
            return false;
        }
        ChangeEmailErrorModel changeEmailErrorModel = (ChangeEmailErrorModel) obj;
        return t.b(this.emailErrors, changeEmailErrorModel.emailErrors) && t.b(this.passwordErrors, changeEmailErrorModel.passwordErrors);
    }

    public final List<String> getEmailErrors() {
        return this.emailErrors;
    }

    public final List<String> getPasswordErrors() {
        return this.passwordErrors;
    }

    public int hashCode() {
        List<String> list = this.emailErrors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.passwordErrors;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ChangeEmailErrorModel(emailErrors=" + this.emailErrors + ", passwordErrors=" + this.passwordErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.emailErrors);
        parcel.writeStringList(this.passwordErrors);
    }

    public /* synthetic */ ChangeEmailErrorModel(int i10, List list, List list2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.emailErrors = null;
        } else {
            this.emailErrors = list;
        }
        if ((i10 & 2) == 0) {
            this.passwordErrors = null;
        } else {
            this.passwordErrors = list2;
        }
    }

    public ChangeEmailErrorModel(List<String> list, List<String> list2) {
        this.emailErrors = list;
        this.passwordErrors = list2;
    }

    public /* synthetic */ ChangeEmailErrorModel(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
