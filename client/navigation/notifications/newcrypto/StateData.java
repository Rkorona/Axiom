package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.Arrays;
import ju.t;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class StateData {
    private String code;
    private byte[] encodedPassword;
    private int passwordStrengthScore;
    private long resendCoolDownUntil;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29141b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f29140a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.notifications.newcrypto.StateData", aVar, 4);
            i2Var.r("password", true);
            i2Var.r("code", true);
            i2Var.r("passwordIsStrengthEnough", false);
            i2Var.r("resendCoolDownUntil", true);
            descriptor = i2Var;
            f29141b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateData deserialize(kv.e eVar) {
            int i10;
            int iE;
            long jO;
            byte[] bArr;
            String str;
            t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                byte[] bArr2 = (byte[]) cVarD.i(fVar, 0, lv.k.f64731c, null);
                String strB = cVarD.B(fVar, 1);
                bArr = bArr2;
                i10 = 15;
                iE = cVarD.e(fVar, 2);
                str = strB;
                jO = cVarD.o(fVar, 3);
            } else {
                long jO2 = 0;
                boolean z10 = true;
                int i11 = 0;
                byte[] bArr3 = null;
                String strB2 = null;
                int iE2 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        bArr3 = (byte[]) cVarD.i(fVar, 0, lv.k.f64731c, bArr3);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        iE2 = cVarD.e(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        jO2 = cVarD.o(fVar, 3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                iE = iE2;
                jO = jO2;
                bArr = bArr3;
                str = strB2;
            }
            cVarD.b(fVar);
            return new StateData(i10, bArr, str, iE, jO, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, StateData stateData) {
            t.f(fVar, "encoder");
            t.f(stateData, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            StateData.write$Self$Termius_app_googleProductionRelease(stateData, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{lv.k.f64731c, x2.f64817a, w0.f64808a, h1.f64699a};
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
            return a.f29140a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ StateData(int i10, byte[] bArr, String str, int i11, long j10, s2 s2Var) {
        if (4 != (i10 & 4)) {
            d2.a(i10, 4, a.f29140a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.encodedPassword = new byte[0];
        } else {
            this.encodedPassword = bArr;
        }
        if ((i10 & 2) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        this.passwordStrengthScore = i11;
        if ((i10 & 8) == 0) {
            this.resendCoolDownUntil = 0L;
        } else {
            this.resendCoolDownUntil = j10;
        }
    }

    public static /* synthetic */ StateData copy$default(StateData stateData, byte[] bArr, String str, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = stateData.encodedPassword;
        }
        if ((i11 & 2) != 0) {
            str = stateData.code;
        }
        if ((i11 & 4) != 0) {
            i10 = stateData.passwordStrengthScore;
        }
        if ((i11 & 8) != 0) {
            j10 = stateData.resendCoolDownUntil;
        }
        int i12 = i10;
        return stateData.copy(bArr, str, i12, j10);
    }

    @o("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @o("password")
    public static /* synthetic */ void getEncodedPassword$annotations() {
    }

    @o("passwordIsStrengthEnough")
    public static /* synthetic */ void getPasswordStrengthScore$annotations() {
    }

    @o("resendCoolDownUntil")
    public static /* synthetic */ void getResendCoolDownUntil$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(StateData stateData, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || !t.b(stateData.encodedPassword, new byte[0])) {
            dVar.o(fVar, 0, lv.k.f64731c, stateData.encodedPassword);
        }
        if (dVar.E(fVar, 1) || !t.b(stateData.code, "")) {
            dVar.f(fVar, 1, stateData.code);
        }
        dVar.t(fVar, 2, stateData.passwordStrengthScore);
        if (!dVar.E(fVar, 3) && stateData.resendCoolDownUntil == 0) {
            return;
        }
        dVar.q(fVar, 3, stateData.resendCoolDownUntil);
    }

    public final byte[] component1() {
        return this.encodedPassword;
    }

    public final String component2() {
        return this.code;
    }

    public final int component3() {
        return this.passwordStrengthScore;
    }

    public final long component4() {
        return this.resendCoolDownUntil;
    }

    public final StateData copy(byte[] bArr, String str, int i10, long j10) {
        t.f(bArr, "encodedPassword");
        t.f(str, "code");
        return new StateData(bArr, str, i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateData)) {
            return false;
        }
        StateData stateData = (StateData) obj;
        return t.b(this.encodedPassword, stateData.encodedPassword) && t.b(this.code, stateData.code) && this.passwordStrengthScore == stateData.passwordStrengthScore && this.resendCoolDownUntil == stateData.resendCoolDownUntil;
    }

    public final String getCode() {
        return this.code;
    }

    public final byte[] getEncodedPassword() {
        return this.encodedPassword;
    }

    public final int getPasswordStrengthScore() {
        return this.passwordStrengthScore;
    }

    public final long getResendCoolDownUntil() {
        return this.resendCoolDownUntil;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.encodedPassword) * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.passwordStrengthScore)) * 31) + Long.hashCode(this.resendCoolDownUntil);
    }

    public final void setCode(String str) {
        t.f(str, "<set-?>");
        this.code = str;
    }

    public final void setEncodedPassword(byte[] bArr) {
        t.f(bArr, "<set-?>");
        this.encodedPassword = bArr;
    }

    public final void setPasswordStrengthScore(int i10) {
        this.passwordStrengthScore = i10;
    }

    public final void setResendCoolDownUntil(long j10) {
        this.resendCoolDownUntil = j10;
    }

    public String toString() {
        return "StateData(encodedPassword=" + Arrays.toString(this.encodedPassword) + ", code=" + this.code + ", passwordStrengthScore=" + this.passwordStrengthScore + ", resendCoolDownUntil=" + this.resendCoolDownUntil + ")";
    }

    public StateData(byte[] bArr, String str, int i10, long j10) {
        t.f(bArr, "encodedPassword");
        t.f(str, "code");
        this.encodedPassword = bArr;
        this.code = str;
        this.passwordStrengthScore = i10;
        this.resendCoolDownUntil = j10;
    }

    public /* synthetic */ StateData(byte[] bArr, String str, int i10, long j10, int i11, ju.k kVar) {
        this((i11 & 1) != 0 ? new byte[0] : bArr, (i11 & 2) != 0 ? "" : str, i10, (i11 & 8) != 0 ? 0L : j10);
    }
}
