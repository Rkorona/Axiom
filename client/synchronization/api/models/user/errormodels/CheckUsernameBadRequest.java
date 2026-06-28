package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.CheckUsernameBadRequest;
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
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CheckUsernameBadRequest implements Parcelable {
    private static final n[] $childSerializers;
    private final List<String> emailErrors;
    private final List<String> recaptchaErrors;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckUsernameBadRequest> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CheckUsernameBadRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<CheckUsernameBadRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUsernameBadRequest createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CheckUsernameBadRequest(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUsernameBadRequest[] newArray(int i10) {
            return new CheckUsernameBadRequest[i10];
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: hn.e
            @Override // iu.a
            public final Object a() {
                return CheckUsernameBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: hn.f
            @Override // iu.a
            public final Object a() {
                return CheckUsernameBadRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckUsernameBadRequest() {
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
    public static /* synthetic */ CheckUsernameBadRequest copy$default(CheckUsernameBadRequest checkUsernameBadRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = checkUsernameBadRequest.emailErrors;
        }
        if ((i10 & 2) != 0) {
            list2 = checkUsernameBadRequest.recaptchaErrors;
        }
        return checkUsernameBadRequest.copy(list, list2);
    }

    @hv.o("username")
    public static /* synthetic */ void getEmailErrors$annotations() {
    }

    @hv.o("recaptcha")
    public static /* synthetic */ void getRecaptchaErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CheckUsernameBadRequest checkUsernameBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || checkUsernameBadRequest.emailErrors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), checkUsernameBadRequest.emailErrors);
        }
        if (!dVar.E(fVar, 1) && checkUsernameBadRequest.recaptchaErrors == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), checkUsernameBadRequest.recaptchaErrors);
    }

    public final List<String> component1() {
        return this.emailErrors;
    }

    public final List<String> component2() {
        return this.recaptchaErrors;
    }

    public final CheckUsernameBadRequest copy(List<String> list, List<String> list2) {
        return new CheckUsernameBadRequest(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUsernameBadRequest)) {
            return false;
        }
        CheckUsernameBadRequest checkUsernameBadRequest = (CheckUsernameBadRequest) obj;
        return t.b(this.emailErrors, checkUsernameBadRequest.emailErrors) && t.b(this.recaptchaErrors, checkUsernameBadRequest.recaptchaErrors);
    }

    public final List<String> getEmailErrors() {
        return this.emailErrors;
    }

    public final List<String> getRecaptchaErrors() {
        return this.recaptchaErrors;
    }

    public final String getRecaptchaRequired() {
        List<String> list = this.recaptchaErrors;
        if (list != null) {
            return (String) v.r0(list);
        }
        return null;
    }

    public final String getUsernameError() {
        List<String> list = this.emailErrors;
        if (list != null) {
            return (String) v.r0(list);
        }
        return null;
    }

    public int hashCode() {
        List<String> list = this.emailErrors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.recaptchaErrors;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "CheckUsernameBadRequest(emailErrors=" + this.emailErrors + ", recaptchaErrors=" + this.recaptchaErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.emailErrors);
        parcel.writeStringList(this.recaptchaErrors);
    }

    public /* synthetic */ CheckUsernameBadRequest(int i10, List list, List list2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.emailErrors = null;
        } else {
            this.emailErrors = list;
        }
        if ((i10 & 2) == 0) {
            this.recaptchaErrors = null;
        } else {
            this.recaptchaErrors = list2;
        }
    }

    public CheckUsernameBadRequest(List<String> list, List<String> list2) {
        this.emailErrors = list;
        this.recaptchaErrors = list2;
    }

    public /* synthetic */ CheckUsernameBadRequest(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
