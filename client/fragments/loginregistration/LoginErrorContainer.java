package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import io.split.android.client.dtos.SerializableEvent;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class LoginErrorContainer implements Parcelable {
    private final LoginErrorType typedError;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<LoginErrorContainer> CREATOR = new c();
    public static final int $stable = 8;
    private static final ut.n[] $childSerializers = {ut.o.b(ut.r.f82638b, new iu.a() { // from class: th.r
        @Override // iu.a
        public final Object a() {
            return LoginErrorContainer._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25302b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f25301a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer", aVar, 1);
            i2Var.r("typedError", false);
            descriptor = i2Var;
            f25302b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoginErrorContainer deserialize(kv.e eVar) {
            LoginErrorType loginErrorType;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            ut.n[] nVarArr = LoginErrorContainer.$childSerializers;
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                loginErrorType = (LoginErrorType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                LoginErrorType loginErrorType2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new hv.e0(iD);
                        }
                        loginErrorType2 = (LoginErrorType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), loginErrorType2);
                        i11 = 1;
                    }
                }
                loginErrorType = loginErrorType2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new LoginErrorContainer(i10, loginErrorType, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, LoginErrorContainer loginErrorContainer) {
            ju.t.f(fVar, "encoder");
            ju.t.f(loginErrorContainer, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            LoginErrorContainer.write$Self$Termius_app_googleProductionRelease(loginErrorContainer, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{LoginErrorContainer.$childSerializers[0].getValue()};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f25301a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoginErrorContainer createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new LoginErrorContainer((LoginErrorType) parcel.readParcelable(LoginErrorContainer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LoginErrorContainer[] newArray(int i10) {
            return new LoginErrorContainer[i10];
        }
    }

    public /* synthetic */ LoginErrorContainer(int i10, LoginErrorType loginErrorType, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f25301a.getDescriptor());
        }
        this.typedError = loginErrorType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return LoginErrorType.Companion.serializer();
    }

    public static /* synthetic */ LoginErrorContainer copy$default(LoginErrorContainer loginErrorContainer, LoginErrorType loginErrorType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loginErrorType = loginErrorContainer.typedError;
        }
        return loginErrorContainer.copy(loginErrorType);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(LoginErrorContainer loginErrorContainer, kv.d dVar, jv.f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), loginErrorContainer.typedError);
    }

    public final LoginErrorType component1() {
        return this.typedError;
    }

    public final LoginErrorContainer copy(LoginErrorType loginErrorType) {
        ju.t.f(loginErrorType, "typedError");
        return new LoginErrorContainer(loginErrorType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginErrorContainer) && ju.t.b(this.typedError, ((LoginErrorContainer) obj).typedError);
    }

    public final LoginErrorType getTypedError() {
        return this.typedError;
    }

    public int hashCode() {
        return this.typedError.hashCode();
    }

    public String toString() {
        return "LoginErrorContainer(typedError=" + this.typedError + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        parcel.writeParcelable(this.typedError, i10);
    }

    public LoginErrorContainer(LoginErrorType loginErrorType) {
        ju.t.f(loginErrorType, "typedError");
        this.typedError = loginErrorType;
    }
}
