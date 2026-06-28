package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceTypeSerializer;
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
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdDeviceDetailsApiModel {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final boolean hasPasskeys;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f40895id;
    private final boolean isCurrentDevice;
    private final UserDeviceType mobileType;
    private final String name;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40897b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40896a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdDeviceDetailsApiModel", aVar, 5);
            i2Var.r("id", false);
            i2Var.r("mobile_type", false);
            i2Var.r(Column.MULTI_KEY_NAME, false);
            i2Var.r("is_current_device", false);
            i2Var.r("has_passkeys", false);
            descriptor = i2Var;
            f40897b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdDeviceDetailsApiModel deserialize(e eVar) {
            boolean zH;
            boolean zH2;
            int i10;
            UserDeviceType userDeviceType;
            String str;
            long j10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                UserDeviceType userDeviceType2 = (UserDeviceType) cVarD.i(fVar, 1, UserDeviceTypeSerializer.INSTANCE, null);
                String strB = cVarD.B(fVar, 2);
                userDeviceType = userDeviceType2;
                zH = cVarD.H(fVar, 3);
                zH2 = cVarD.H(fVar, 4);
                str = strB;
                i10 = 31;
                j10 = jO;
            } else {
                boolean z10 = true;
                boolean zH3 = false;
                String strB2 = null;
                long jO2 = 0;
                boolean zH4 = false;
                int i11 = 0;
                UserDeviceType userDeviceType3 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        jO2 = cVarD.o(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        userDeviceType3 = (UserDeviceType) cVarD.i(fVar, 1, UserDeviceTypeSerializer.INSTANCE, userDeviceType3);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB2 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        zH3 = cVarD.H(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        zH4 = cVarD.H(fVar, 4);
                        i11 |= 16;
                    }
                }
                zH = zH3;
                zH2 = zH4;
                i10 = i11;
                userDeviceType = userDeviceType3;
                str = strB2;
                j10 = jO2;
            }
            cVarD.b(fVar);
            return new SshIdDeviceDetailsApiModel(i10, j10, userDeviceType, str, zH, zH2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdDeviceDetailsApiModel sshIdDeviceDetailsApiModel) {
            t.f(fVar, "encoder");
            t.f(sshIdDeviceDetailsApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdDeviceDetailsApiModel.write$Self$Termius_app_googleProductionRelease(sshIdDeviceDetailsApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            i iVar = i.f64704a;
            return new hv.c[]{h1.f64699a, UserDeviceTypeSerializer.INSTANCE, x2.f64817a, iVar, iVar};
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
            return a.f40896a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshIdDeviceDetailsApiModel(int i10, long j10, UserDeviceType userDeviceType, String str, boolean z10, boolean z11, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f40896a.getDescriptor());
        }
        this.f40895id = j10;
        this.mobileType = userDeviceType;
        this.name = str;
        this.isCurrentDevice = z10;
        this.hasPasskeys = z11;
    }

    public static /* synthetic */ SshIdDeviceDetailsApiModel copy$default(SshIdDeviceDetailsApiModel sshIdDeviceDetailsApiModel, long j10, UserDeviceType userDeviceType, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sshIdDeviceDetailsApiModel.f40895id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            userDeviceType = sshIdDeviceDetailsApiModel.mobileType;
        }
        UserDeviceType userDeviceType2 = userDeviceType;
        if ((i10 & 4) != 0) {
            str = sshIdDeviceDetailsApiModel.name;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = sshIdDeviceDetailsApiModel.isCurrentDevice;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = sshIdDeviceDetailsApiModel.hasPasskeys;
        }
        return sshIdDeviceDetailsApiModel.copy(j11, userDeviceType2, str2, z12, z11);
    }

    @o("has_passkeys")
    public static /* synthetic */ void getHasPasskeys$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("mobile_type")
    public static /* synthetic */ void getMobileType$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("is_current_device")
    public static /* synthetic */ void isCurrentDevice$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdDeviceDetailsApiModel sshIdDeviceDetailsApiModel, d dVar, f fVar) {
        dVar.q(fVar, 0, sshIdDeviceDetailsApiModel.f40895id);
        dVar.o(fVar, 1, UserDeviceTypeSerializer.INSTANCE, sshIdDeviceDetailsApiModel.mobileType);
        dVar.f(fVar, 2, sshIdDeviceDetailsApiModel.name);
        dVar.u(fVar, 3, sshIdDeviceDetailsApiModel.isCurrentDevice);
        dVar.u(fVar, 4, sshIdDeviceDetailsApiModel.hasPasskeys);
    }

    public final long component1() {
        return this.f40895id;
    }

    public final UserDeviceType component2() {
        return this.mobileType;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.isCurrentDevice;
    }

    public final boolean component5() {
        return this.hasPasskeys;
    }

    public final bp.e convertToDbModel() {
        return new bp.e(0L, this.f40895id, this.mobileType, this.name, this.isCurrentDevice, this.hasPasskeys, 1, null);
    }

    public final SshIdDeviceDetailsApiModel copy(long j10, UserDeviceType userDeviceType, String str, boolean z10, boolean z11) {
        t.f(userDeviceType, "mobileType");
        t.f(str, Column.MULTI_KEY_NAME);
        return new SshIdDeviceDetailsApiModel(j10, userDeviceType, str, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdDeviceDetailsApiModel)) {
            return false;
        }
        SshIdDeviceDetailsApiModel sshIdDeviceDetailsApiModel = (SshIdDeviceDetailsApiModel) obj;
        return this.f40895id == sshIdDeviceDetailsApiModel.f40895id && this.mobileType == sshIdDeviceDetailsApiModel.mobileType && t.b(this.name, sshIdDeviceDetailsApiModel.name) && this.isCurrentDevice == sshIdDeviceDetailsApiModel.isCurrentDevice && this.hasPasskeys == sshIdDeviceDetailsApiModel.hasPasskeys;
    }

    public final boolean getHasPasskeys() {
        return this.hasPasskeys;
    }

    public final long getId() {
        return this.f40895id;
    }

    public final UserDeviceType getMobileType() {
        return this.mobileType;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f40895id) * 31) + this.mobileType.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isCurrentDevice)) * 31) + Boolean.hashCode(this.hasPasskeys);
    }

    public final boolean isCurrentDevice() {
        return this.isCurrentDevice;
    }

    public String toString() {
        return "SshIdDeviceDetailsApiModel(id=" + this.f40895id + ", mobileType=" + this.mobileType + ", name=" + this.name + ", isCurrentDevice=" + this.isCurrentDevice + ", hasPasskeys=" + this.hasPasskeys + ")";
    }

    public SshIdDeviceDetailsApiModel(long j10, UserDeviceType userDeviceType, String str, boolean z10, boolean z11) {
        t.f(userDeviceType, "mobileType");
        t.f(str, Column.MULTI_KEY_NAME);
        this.f40895id = j10;
        this.mobileType = userDeviceType;
        this.name = str;
        this.isCurrentDevice = z10;
        this.hasPasskeys = z11;
    }
}
