package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
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
@Keep
public final class DeviceKeyBoundPublicApiModel {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String biometricType;
    private final String certificate;
    private final String createdAt;
    private final String publicKey;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40890b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40889a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundPublicApiModel", aVar, 4);
            i2Var.r(Table.SSH_CERTIFICATE, false);
            i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, false);
            i2Var.r(Column.CREATED_AT, false);
            i2Var.r("biometric_type", false);
            descriptor = i2Var;
            f40890b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceKeyBoundPublicApiModel deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            String str2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                String strB4 = cVarD.B(fVar, 2);
                strB2 = cVarD.B(fVar, 3);
                str = strB4;
                str2 = strB3;
                i10 = 15;
            } else {
                strB = null;
                String strB5 = null;
                String strB6 = null;
                String strB7 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB7 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB6 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iD != 3) {
                            throw new e0(iD);
                        }
                        strB5 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    }
                }
                strB2 = strB5;
                str = strB6;
                str2 = strB7;
                i10 = i11;
            }
            String str3 = strB;
            cVarD.b(fVar);
            return new DeviceKeyBoundPublicApiModel(i10, str3, str2, str, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, DeviceKeyBoundPublicApiModel deviceKeyBoundPublicApiModel) {
            t.f(fVar, "encoder");
            t.f(deviceKeyBoundPublicApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            DeviceKeyBoundPublicApiModel.write$Self$Termius_app_googleProductionRelease(deviceKeyBoundPublicApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var, x2Var};
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
            return a.f40889a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ DeviceKeyBoundPublicApiModel(int i10, String str, String str2, String str3, String str4, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, a.f40889a.getDescriptor());
        }
        this.certificate = str;
        this.publicKey = str2;
        this.createdAt = str3;
        this.biometricType = str4;
    }

    public static /* synthetic */ DeviceKeyBoundPublicApiModel copy$default(DeviceKeyBoundPublicApiModel deviceKeyBoundPublicApiModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceKeyBoundPublicApiModel.certificate;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceKeyBoundPublicApiModel.publicKey;
        }
        if ((i10 & 4) != 0) {
            str3 = deviceKeyBoundPublicApiModel.createdAt;
        }
        if ((i10 & 8) != 0) {
            str4 = deviceKeyBoundPublicApiModel.biometricType;
        }
        return deviceKeyBoundPublicApiModel.copy(str, str2, str3, str4);
    }

    @o("biometric_type")
    public static /* synthetic */ void getBiometricType$annotations() {
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DeviceKeyBoundPublicApiModel deviceKeyBoundPublicApiModel, d dVar, f fVar) {
        dVar.f(fVar, 0, deviceKeyBoundPublicApiModel.certificate);
        dVar.f(fVar, 1, deviceKeyBoundPublicApiModel.publicKey);
        dVar.f(fVar, 2, deviceKeyBoundPublicApiModel.createdAt);
        dVar.f(fVar, 3, deviceKeyBoundPublicApiModel.biometricType);
    }

    public final String component1() {
        return this.certificate;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final String component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.biometricType;
    }

    public final DeviceKeyBoundPublicApiModel copy(String str, String str2, String str3, String str4) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, Column.KEY_PUBLIC);
        t.f(str3, "createdAt");
        t.f(str4, "biometricType");
        return new DeviceKeyBoundPublicApiModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceKeyBoundPublicApiModel)) {
            return false;
        }
        DeviceKeyBoundPublicApiModel deviceKeyBoundPublicApiModel = (DeviceKeyBoundPublicApiModel) obj;
        return t.b(this.certificate, deviceKeyBoundPublicApiModel.certificate) && t.b(this.publicKey, deviceKeyBoundPublicApiModel.publicKey) && t.b(this.createdAt, deviceKeyBoundPublicApiModel.createdAt) && t.b(this.biometricType, deviceKeyBoundPublicApiModel.biometricType);
    }

    public final String getBiometricType() {
        return this.biometricType;
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((((this.certificate.hashCode() * 31) + this.publicKey.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.biometricType.hashCode();
    }

    public String toString() {
        return "DeviceKeyBoundPublicApiModel(certificate=" + this.certificate + ", publicKey=" + this.publicKey + ", createdAt=" + this.createdAt + ", biometricType=" + this.biometricType + ")";
    }

    public DeviceKeyBoundPublicApiModel(String str, String str2, String str3, String str4) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, Column.KEY_PUBLIC);
        t.f(str3, "createdAt");
        t.f(str4, "biometricType");
        this.certificate = str;
        this.publicKey = str2;
        this.createdAt = str3;
        this.biometricType = str4;
    }
}
