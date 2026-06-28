package com.server.auditor.ssh.client.ui.auth.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeBadRequest;
import hv.p;
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
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ValidateEmailCodeBadRequest implements Parcelable {
    private static final n[] $childSerializers;
    private final List<String> codeErrors;
    private final List<String> generalErrors;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ValidateEmailCodeBadRequest> CREATOR = new c();
    public static final int $stable = 8;

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f39253a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ValidateEmailCodeBadRequest createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ValidateEmailCodeBadRequest(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ValidateEmailCodeBadRequest[] newArray(int i10) {
            return new ValidateEmailCodeBadRequest[i10];
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: rn.d
            @Override // iu.a
            public final Object a() {
                return ValidateEmailCodeBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: rn.e
            @Override // iu.a
            public final Object a() {
                return ValidateEmailCodeBadRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidateEmailCodeBadRequest() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidateEmailCodeBadRequest copy$default(ValidateEmailCodeBadRequest validateEmailCodeBadRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = validateEmailCodeBadRequest.codeErrors;
        }
        if ((i10 & 2) != 0) {
            list2 = validateEmailCodeBadRequest.generalErrors;
        }
        return validateEmailCodeBadRequest.copy(list, list2);
    }

    @hv.o("code")
    public static /* synthetic */ void getCodeErrors$annotations() {
    }

    @hv.o("error")
    public static /* synthetic */ void getGeneralErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ValidateEmailCodeBadRequest validateEmailCodeBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || validateEmailCodeBadRequest.codeErrors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), validateEmailCodeBadRequest.codeErrors);
        }
        if (!dVar.E(fVar, 1) && validateEmailCodeBadRequest.generalErrors == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), validateEmailCodeBadRequest.generalErrors);
    }

    public final List<String> component1() {
        return this.codeErrors;
    }

    public final List<String> component2() {
        return this.generalErrors;
    }

    public final ValidateEmailCodeBadRequest copy(List<String> list, List<String> list2) {
        return new ValidateEmailCodeBadRequest(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateEmailCodeBadRequest)) {
            return false;
        }
        ValidateEmailCodeBadRequest validateEmailCodeBadRequest = (ValidateEmailCodeBadRequest) obj;
        return t.b(this.codeErrors, validateEmailCodeBadRequest.codeErrors) && t.b(this.generalErrors, validateEmailCodeBadRequest.generalErrors);
    }

    public final String getCodeError() {
        List<String> list = this.codeErrors;
        if (list != null) {
            return (String) v.r0(list);
        }
        return null;
    }

    public final List<String> getCodeErrors() {
        return this.codeErrors;
    }

    public final String getGeneralError() {
        List<String> list = this.generalErrors;
        if (list != null) {
            return (String) v.r0(list);
        }
        return null;
    }

    public final List<String> getGeneralErrors() {
        return this.generalErrors;
    }

    public int hashCode() {
        List<String> list = this.codeErrors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.generalErrors;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ValidateEmailCodeBadRequest(codeErrors=" + this.codeErrors + ", generalErrors=" + this.generalErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.codeErrors);
        parcel.writeStringList(this.generalErrors);
    }

    public /* synthetic */ ValidateEmailCodeBadRequest(int i10, List list, List list2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.codeErrors = null;
        } else {
            this.codeErrors = list;
        }
        if ((i10 & 2) == 0) {
            this.generalErrors = null;
        } else {
            this.generalErrors = list2;
        }
    }

    public ValidateEmailCodeBadRequest(List<String> list, List<String> list2) {
        this.codeErrors = list;
        this.generalErrors = list2;
    }

    public /* synthetic */ ValidateEmailCodeBadRequest(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
