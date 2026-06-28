package com.server.auditor.ssh.client.ui.auth.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.ui.auth.signup.data.SendEmailCodeBadRequest;
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
public final class SendEmailCodeBadRequest implements Parcelable {
    private static final n[] $childSerializers;
    private final List<String> emailErrors;
    private final List<String> recaptchaErrors;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SendEmailCodeBadRequest> CREATOR = new c();
    public static final int $stable = 8;

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f39238a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SendEmailCodeBadRequest createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SendEmailCodeBadRequest(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SendEmailCodeBadRequest[] newArray(int i10) {
            return new SendEmailCodeBadRequest[i10];
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: rn.a
            @Override // iu.a
            public final Object a() {
                return SendEmailCodeBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: rn.b
            @Override // iu.a
            public final Object a() {
                return SendEmailCodeBadRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendEmailCodeBadRequest() {
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
    public static /* synthetic */ SendEmailCodeBadRequest copy$default(SendEmailCodeBadRequest sendEmailCodeBadRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sendEmailCodeBadRequest.emailErrors;
        }
        if ((i10 & 2) != 0) {
            list2 = sendEmailCodeBadRequest.recaptchaErrors;
        }
        return sendEmailCodeBadRequest.copy(list, list2);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmailErrors$annotations() {
    }

    @hv.o("recaptcha")
    public static /* synthetic */ void getRecaptchaErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SendEmailCodeBadRequest sendEmailCodeBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || sendEmailCodeBadRequest.emailErrors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), sendEmailCodeBadRequest.emailErrors);
        }
        if (!dVar.E(fVar, 1) && sendEmailCodeBadRequest.recaptchaErrors == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), sendEmailCodeBadRequest.recaptchaErrors);
    }

    public final List<String> component1() {
        return this.emailErrors;
    }

    public final List<String> component2() {
        return this.recaptchaErrors;
    }

    public final SendEmailCodeBadRequest copy(List<String> list, List<String> list2) {
        return new SendEmailCodeBadRequest(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailCodeBadRequest)) {
            return false;
        }
        SendEmailCodeBadRequest sendEmailCodeBadRequest = (SendEmailCodeBadRequest) obj;
        return t.b(this.emailErrors, sendEmailCodeBadRequest.emailErrors) && t.b(this.recaptchaErrors, sendEmailCodeBadRequest.recaptchaErrors);
    }

    public final String getEmailError() {
        List<String> list = this.emailErrors;
        if (list != null) {
            return (String) v.r0(list);
        }
        return null;
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

    public int hashCode() {
        List<String> list = this.emailErrors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.recaptchaErrors;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "SendEmailCodeBadRequest(emailErrors=" + this.emailErrors + ", recaptchaErrors=" + this.recaptchaErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.emailErrors);
        parcel.writeStringList(this.recaptchaErrors);
    }

    public /* synthetic */ SendEmailCodeBadRequest(int i10, List list, List list2, s2 s2Var) {
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

    public SendEmailCodeBadRequest(List<String> list, List<String> list2) {
        this.emailErrors = list;
        this.recaptchaErrors = list2;
    }

    public /* synthetic */ SendEmailCodeBadRequest(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
