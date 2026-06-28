package com.server.auditor.ssh.client.ui.auth.signup.data;

import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TriggerSendEmailCodeRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String email;
    private final String recaptchaToken;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39252b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f39251a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.signup.data.TriggerSendEmailCodeRequest", aVar, 2);
            i2Var.r("recaptcha", false);
            i2Var.r("email", false);
            descriptor = i2Var;
            f39252b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TriggerSendEmailCodeRequest deserialize(e eVar) {
            String str;
            String strB;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                str = (String) cVarD.v(fVar, 0, x2.f64817a, null);
                strB = cVarD.B(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                String strB2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        str = (String) cVarD.v(fVar, 0, x2.f64817a, str);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    }
                }
                strB = strB2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new TriggerSendEmailCodeRequest(i10, str, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, TriggerSendEmailCodeRequest triggerSendEmailCodeRequest) {
            t.f(fVar, "encoder");
            t.f(triggerSendEmailCodeRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            TriggerSendEmailCodeRequest.write$Self$Termius_app_googleProductionRelease(triggerSendEmailCodeRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{iv.a.u(x2Var), x2Var};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
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
            return a.f39251a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ TriggerSendEmailCodeRequest(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f39251a.getDescriptor());
        }
        this.recaptchaToken = str;
        this.email = str2;
    }

    public static /* synthetic */ TriggerSendEmailCodeRequest copy$default(TriggerSendEmailCodeRequest triggerSendEmailCodeRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = triggerSendEmailCodeRequest.recaptchaToken;
        }
        if ((i10 & 2) != 0) {
            str2 = triggerSendEmailCodeRequest.email;
        }
        return triggerSendEmailCodeRequest.copy(str, str2);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("recaptcha")
    public static /* synthetic */ void getRecaptchaToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TriggerSendEmailCodeRequest triggerSendEmailCodeRequest, d dVar, f fVar) {
        dVar.v(fVar, 0, x2.f64817a, triggerSendEmailCodeRequest.recaptchaToken);
        dVar.f(fVar, 1, triggerSendEmailCodeRequest.email);
    }

    public final String component1() {
        return this.recaptchaToken;
    }

    public final String component2() {
        return this.email;
    }

    public final TriggerSendEmailCodeRequest copy(String str, String str2) {
        t.f(str2, "email");
        return new TriggerSendEmailCodeRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerSendEmailCodeRequest)) {
            return false;
        }
        TriggerSendEmailCodeRequest triggerSendEmailCodeRequest = (TriggerSendEmailCodeRequest) obj;
        return t.b(this.recaptchaToken, triggerSendEmailCodeRequest.recaptchaToken) && t.b(this.email, triggerSendEmailCodeRequest.email);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRecaptchaToken() {
        return this.recaptchaToken;
    }

    public int hashCode() {
        String str = this.recaptchaToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "TriggerSendEmailCodeRequest(recaptchaToken=" + this.recaptchaToken + ", email=" + this.email + ")";
    }

    public TriggerSendEmailCodeRequest(String str, String str2) {
        t.f(str2, "email");
        this.recaptchaToken = str;
        this.email = str2;
    }
}
