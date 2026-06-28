package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.CheckEmailHasESSOBadRequest;
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
public final class CheckEmailHasESSOBadRequest implements Parcelable {
    private final List<String> emailErrors;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckEmailHasESSOBadRequest> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: hn.d
        @Override // iu.a
        public final Object a() {
            return CheckEmailHasESSOBadRequest._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CheckEmailHasESSOBadRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<CheckEmailHasESSOBadRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckEmailHasESSOBadRequest createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CheckEmailHasESSOBadRequest(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckEmailHasESSOBadRequest[] newArray(int i10) {
            return new CheckEmailHasESSOBadRequest[i10];
        }
    }

    public /* synthetic */ CheckEmailHasESSOBadRequest(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CheckEmailHasESSOBadRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.emailErrors = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckEmailHasESSOBadRequest copy$default(CheckEmailHasESSOBadRequest checkEmailHasESSOBadRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = checkEmailHasESSOBadRequest.emailErrors;
        }
        return checkEmailHasESSOBadRequest.copy(list);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmailErrors$annotations() {
    }

    public final List<String> component1() {
        return this.emailErrors;
    }

    public final CheckEmailHasESSOBadRequest copy(List<String> list) {
        t.f(list, "emailErrors");
        return new CheckEmailHasESSOBadRequest(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckEmailHasESSOBadRequest) && t.b(this.emailErrors, ((CheckEmailHasESSOBadRequest) obj).emailErrors);
    }

    public final List<String> getEmailErrors() {
        return this.emailErrors;
    }

    public int hashCode() {
        return this.emailErrors.hashCode();
    }

    public String toString() {
        return "CheckEmailHasESSOBadRequest(emailErrors=" + this.emailErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeStringList(this.emailErrors);
    }

    public CheckEmailHasESSOBadRequest(List<String> list) {
        t.f(list, "emailErrors");
        this.emailErrors = list;
    }
}
