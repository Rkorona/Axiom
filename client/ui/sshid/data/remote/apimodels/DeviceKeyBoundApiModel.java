package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.ui.sshid.data.BiometricType;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceInfoApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundApiModel;
import gp.z;
import hv.e0;
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
import lv.j0;
import lv.n0;
import lv.s2;
import lv.x2;
import u9.a;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class DeviceKeyBoundApiModel {
    public static final int $stable = 0;
    private final BiometricType biometricType;
    private final String certificate;
    private final String createdAt;
    private final DeviceInfoApiModel device;
    private final String publicKey;
    public static final b Companion = new b(null);
    private static final n[] $childSerializers = {null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: dp.a
        @Override // iu.a
        public final Object a() {
            return DeviceKeyBoundApiModel._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40888b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40887a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundApiModel", aVar, 5);
            i2Var.r("device", false);
            i2Var.r(Table.SSH_CERTIFICATE, false);
            i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, false);
            i2Var.r(Column.CREATED_AT, false);
            i2Var.r("biometric_type", false);
            descriptor = i2Var;
            f40888b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceKeyBoundApiModel deserialize(e eVar) {
            int i10;
            DeviceInfoApiModel deviceInfoApiModel;
            String str;
            String str2;
            String str3;
            BiometricType biometricType;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = DeviceKeyBoundApiModel.$childSerializers;
            DeviceInfoApiModel deviceInfoApiModel2 = null;
            if (cVarD.l()) {
                DeviceInfoApiModel deviceInfoApiModel3 = (DeviceInfoApiModel) cVarD.i(fVar, 0, DeviceInfoApiModel.a.f40885a, null);
                String strB = cVarD.B(fVar, 1);
                String strB2 = cVarD.B(fVar, 2);
                String strB3 = cVarD.B(fVar, 3);
                biometricType = (BiometricType) cVarD.v(fVar, 4, (hv.b) nVarArr[4].getValue(), null);
                deviceInfoApiModel = deviceInfoApiModel3;
                str3 = strB3;
                str2 = strB2;
                i10 = 31;
                str = strB;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strB4 = null;
                String strB5 = null;
                String strB6 = null;
                BiometricType biometricType2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        deviceInfoApiModel2 = (DeviceInfoApiModel) cVarD.i(fVar, 0, DeviceInfoApiModel.a.f40885a, deviceInfoApiModel2);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB4 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB5 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        strB6 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        biometricType2 = (BiometricType) cVarD.v(fVar, 4, (hv.b) nVarArr[4].getValue(), biometricType2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                deviceInfoApiModel = deviceInfoApiModel2;
                str = strB4;
                str2 = strB5;
                str3 = strB6;
                biometricType = biometricType2;
            }
            cVarD.b(fVar);
            return new DeviceKeyBoundApiModel(i10, deviceInfoApiModel, str, str2, str3, biometricType, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, DeviceKeyBoundApiModel deviceKeyBoundApiModel) {
            t.f(fVar, "encoder");
            t.f(deviceKeyBoundApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            DeviceKeyBoundApiModel.write$Self$Termius_app_googleProductionRelease(deviceKeyBoundApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            hv.c cVarU = iv.a.u((hv.c) DeviceKeyBoundApiModel.$childSerializers[4].getValue());
            x2 x2Var = x2.f64817a;
            return new hv.c[]{DeviceInfoApiModel.a.f40885a, x2Var, x2Var, x2Var, cVarU};
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
            return a.f40887a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ DeviceKeyBoundApiModel(int i10, DeviceInfoApiModel deviceInfoApiModel, String str, String str2, String str3, BiometricType biometricType, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f40887a.getDescriptor());
        }
        this.device = deviceInfoApiModel;
        this.certificate = str;
        this.publicKey = str2;
        this.createdAt = str3;
        this.biometricType = biometricType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return j0.b("com.server.auditor.ssh.client.ui.sshid.data.BiometricType", BiometricType.values());
    }

    public static /* synthetic */ DeviceKeyBoundApiModel copy$default(DeviceKeyBoundApiModel deviceKeyBoundApiModel, DeviceInfoApiModel deviceInfoApiModel, String str, String str2, String str3, BiometricType biometricType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceInfoApiModel = deviceKeyBoundApiModel.device;
        }
        if ((i10 & 2) != 0) {
            str = deviceKeyBoundApiModel.certificate;
        }
        if ((i10 & 4) != 0) {
            str2 = deviceKeyBoundApiModel.publicKey;
        }
        if ((i10 & 8) != 0) {
            str3 = deviceKeyBoundApiModel.createdAt;
        }
        if ((i10 & 16) != 0) {
            biometricType = deviceKeyBoundApiModel.biometricType;
        }
        BiometricType biometricType2 = biometricType;
        String str4 = str2;
        return deviceKeyBoundApiModel.copy(deviceInfoApiModel, str, str4, str3, biometricType2);
    }

    @hv.o("biometric_type")
    public static /* synthetic */ void getBiometricType$annotations() {
    }

    @hv.o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
    }

    @hv.o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @hv.o("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @hv.o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DeviceKeyBoundApiModel deviceKeyBoundApiModel, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, DeviceInfoApiModel.a.f40885a, deviceKeyBoundApiModel.device);
        dVar.f(fVar, 1, deviceKeyBoundApiModel.certificate);
        dVar.f(fVar, 2, deviceKeyBoundApiModel.publicKey);
        dVar.f(fVar, 3, deviceKeyBoundApiModel.createdAt);
        dVar.v(fVar, 4, (hv.r) nVarArr[4].getValue(), deviceKeyBoundApiModel.biometricType);
    }

    public final DeviceInfoApiModel component1() {
        return this.device;
    }

    public final String component2() {
        return this.certificate;
    }

    public final String component3() {
        return this.publicKey;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final BiometricType component5() {
        return this.biometricType;
    }

    public final bp.c convertToRemoteDbModel(z zVar) {
        t.f(zVar, "sshIdKeyTypeChecker");
        return new bp.c(0L, this.device.getId(), this.publicKey, this.biometricType, this.biometricType != null ? a.g.f81658b.a() : zVar.a(this.publicKey), this.createdAt, 1, null);
    }

    public final DeviceKeyBoundApiModel copy(DeviceInfoApiModel deviceInfoApiModel, String str, String str2, String str3, BiometricType biometricType) {
        t.f(deviceInfoApiModel, "device");
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, Column.KEY_PUBLIC);
        t.f(str3, "createdAt");
        return new DeviceKeyBoundApiModel(deviceInfoApiModel, str, str2, str3, biometricType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceKeyBoundApiModel)) {
            return false;
        }
        DeviceKeyBoundApiModel deviceKeyBoundApiModel = (DeviceKeyBoundApiModel) obj;
        return t.b(this.device, deviceKeyBoundApiModel.device) && t.b(this.certificate, deviceKeyBoundApiModel.certificate) && t.b(this.publicKey, deviceKeyBoundApiModel.publicKey) && t.b(this.createdAt, deviceKeyBoundApiModel.createdAt) && this.biometricType == deviceKeyBoundApiModel.biometricType;
    }

    public final BiometricType getBiometricType() {
        return this.biometricType;
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final DeviceInfoApiModel getDevice() {
        return this.device;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int iHashCode = ((((((this.device.hashCode() * 31) + this.certificate.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        BiometricType biometricType = this.biometricType;
        return iHashCode + (biometricType == null ? 0 : biometricType.hashCode());
    }

    public String toString() {
        return "DeviceKeyBoundApiModel(device=" + this.device + ", certificate=" + this.certificate + ", publicKey=" + this.publicKey + ", createdAt=" + this.createdAt + ", biometricType=" + this.biometricType + ")";
    }

    public DeviceKeyBoundApiModel(DeviceInfoApiModel deviceInfoApiModel, String str, String str2, String str3, BiometricType biometricType) {
        t.f(deviceInfoApiModel, "device");
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, Column.KEY_PUBLIC);
        t.f(str3, "createdAt");
        this.device = deviceInfoApiModel;
        this.certificate = str;
        this.publicKey = str2;
        this.createdAt = str3;
        this.biometricType = biometricType;
    }
}
