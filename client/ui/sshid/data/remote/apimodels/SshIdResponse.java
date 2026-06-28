package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdDeviceDetailsApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdResponse {
    private static final n[] $childSerializers;

    @gg.a
    public String caEncryptedPrivateKey;
    private final String caPublicKey;
    private final String defaultPasskeyType;
    private final List<DeviceKeyBoundApiModel> deviceBoundKeys;
    private final List<SshIdDeviceDetailsApiModel> devices;
    private final boolean isSetupCompleted;
    private final boolean isSkPasskeysEnabled;
    private final List<SecurityKeyBoundApiModel> securityKeyBoundKeys;
    private final String username;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40899b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40898a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse", aVar, 9);
            i2Var.r("device_bound_keys", false);
            i2Var.r("security_key_bound_keys", false);
            i2Var.r("ca_encrypted_private_key", false);
            i2Var.r("ca_public_key", false);
            i2Var.r("username", false);
            i2Var.r("default_passkey_type", false);
            i2Var.r("is_setup_completed", false);
            i2Var.r("sk_passkeys_enabled", false);
            i2Var.r("devices", true);
            descriptor = i2Var;
            f40899b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdResponse deserialize(e eVar) {
            boolean z10;
            List list;
            List list2;
            boolean z11;
            int i10;
            List list3;
            String str;
            String str2;
            String str3;
            String str4;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = SshIdResponse.$childSerializers;
            int i11 = 7;
            int i12 = 6;
            if (cVarD.l()) {
                List list4 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                List list5 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                String strB = cVarD.B(fVar, 2);
                String strB2 = cVarD.B(fVar, 3);
                String strB3 = cVarD.B(fVar, 4);
                String strB4 = cVarD.B(fVar, 5);
                boolean zH = cVarD.H(fVar, 6);
                boolean zH2 = cVarD.H(fVar, 7);
                list = (List) cVarD.v(fVar, 8, (hv.b) nVarArr[8].getValue(), null);
                list3 = list4;
                z10 = zH2;
                z11 = zH;
                str4 = strB4;
                str2 = strB2;
                str3 = strB3;
                str = strB;
                i10 = 511;
                list2 = list5;
            } else {
                int i13 = 1;
                boolean z12 = true;
                boolean zH3 = false;
                int i14 = 0;
                List list6 = null;
                List list7 = null;
                String strB5 = null;
                String strB6 = null;
                String strB7 = null;
                String strB8 = null;
                boolean zH4 = false;
                List list8 = null;
                while (z12) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z12 = false;
                            i12 = 6;
                            i13 = 1;
                            break;
                        case 0:
                            list7 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list7);
                            i14 |= 1;
                            i11 = 7;
                            i12 = 6;
                            i13 = 1;
                            break;
                        case 1:
                            list8 = (List) cVarD.i(fVar, i13, (hv.b) nVarArr[i13].getValue(), list8);
                            i14 |= 2;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 2:
                            strB5 = cVarD.B(fVar, 2);
                            i14 |= 4;
                            break;
                        case 3:
                            strB6 = cVarD.B(fVar, 3);
                            i14 |= 8;
                            break;
                        case 4:
                            strB7 = cVarD.B(fVar, 4);
                            i14 |= 16;
                            break;
                        case 5:
                            strB8 = cVarD.B(fVar, 5);
                            i14 |= 32;
                            break;
                        case 6:
                            zH4 = cVarD.H(fVar, i12);
                            i14 |= 64;
                            break;
                        case 7:
                            zH3 = cVarD.H(fVar, i11);
                            i14 |= 128;
                            break;
                        case 8:
                            list6 = (List) cVarD.v(fVar, 8, (hv.b) nVarArr[8].getValue(), list6);
                            i14 |= 256;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                z10 = zH3;
                list = list6;
                list2 = list8;
                z11 = zH4;
                i10 = i14;
                list3 = list7;
                str = strB5;
                str2 = strB6;
                str3 = strB7;
                str4 = strB8;
            }
            cVarD.b(fVar);
            return new SshIdResponse(i10, list3, list2, str, str2, str3, str4, z11, z10, list, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdResponse sshIdResponse) {
            t.f(fVar, "encoder");
            t.f(sshIdResponse, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdResponse.write$Self$Termius_app_googleProductionRelease(sshIdResponse, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = SshIdResponse.$childSerializers;
            x2 x2Var = x2.f64817a;
            i iVar = i.f64704a;
            return new hv.c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), x2Var, x2Var, x2Var, x2Var, iVar, iVar, iv.a.u((hv.c) nVarArr[8].getValue())};
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
            return a.f40898a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: dp.b
            @Override // iu.a
            public final Object a() {
                return SshIdResponse._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: dp.c
            @Override // iu.a
            public final Object a() {
                return SshIdResponse._childSerializers$_anonymous_$0();
            }
        }), null, null, null, null, null, null, o.b(rVar, new iu.a() { // from class: dp.d
            @Override // iu.a
            public final Object a() {
                return SshIdResponse._childSerializers$_anonymous_$1();
            }
        })};
    }

    public /* synthetic */ SshIdResponse(int i10, List list, List list2, String str, String str2, String str3, String str4, boolean z10, boolean z11, List list3, s2 s2Var) {
        if (255 != (i10 & 255)) {
            d2.a(i10, 255, a.f40898a.getDescriptor());
        }
        this.deviceBoundKeys = list;
        this.securityKeyBoundKeys = list2;
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.username = str3;
        this.defaultPasskeyType = str4;
        this.isSetupCompleted = z10;
        this.isSkPasskeysEnabled = z11;
        if ((i10 & 256) == 0) {
            this.devices = null;
        } else {
            this.devices = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(DeviceKeyBoundApiModel.a.f40887a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new lv.f(SecurityKeyBoundApiModel.a.f40891a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$1() {
        return new lv.f(SshIdDeviceDetailsApiModel.a.f40896a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SshIdResponse copy$default(SshIdResponse sshIdResponse, List list, List list2, String str, String str2, String str3, String str4, boolean z10, boolean z11, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sshIdResponse.deviceBoundKeys;
        }
        if ((i10 & 2) != 0) {
            list2 = sshIdResponse.securityKeyBoundKeys;
        }
        if ((i10 & 4) != 0) {
            str = sshIdResponse.caEncryptedPrivateKey;
        }
        if ((i10 & 8) != 0) {
            str2 = sshIdResponse.caPublicKey;
        }
        if ((i10 & 16) != 0) {
            str3 = sshIdResponse.username;
        }
        if ((i10 & 32) != 0) {
            str4 = sshIdResponse.defaultPasskeyType;
        }
        if ((i10 & 64) != 0) {
            z10 = sshIdResponse.isSetupCompleted;
        }
        if ((i10 & 128) != 0) {
            z11 = sshIdResponse.isSkPasskeysEnabled;
        }
        if ((i10 & 256) != 0) {
            list3 = sshIdResponse.devices;
        }
        boolean z12 = z11;
        List list4 = list3;
        String str5 = str4;
        boolean z13 = z10;
        String str6 = str3;
        String str7 = str;
        return sshIdResponse.copy(list, list2, str7, str2, str6, str5, z13, z12, list4);
    }

    @hv.o("ca_encrypted_private_key")
    public static /* synthetic */ void getCaEncryptedPrivateKey$annotations() {
    }

    @hv.o("ca_public_key")
    public static /* synthetic */ void getCaPublicKey$annotations() {
    }

    @hv.o("default_passkey_type")
    public static /* synthetic */ void getDefaultPasskeyType$annotations() {
    }

    @hv.o("device_bound_keys")
    public static /* synthetic */ void getDeviceBoundKeys$annotations() {
    }

    @hv.o("devices")
    public static /* synthetic */ void getDevices$annotations() {
    }

    @hv.o("security_key_bound_keys")
    public static /* synthetic */ void getSecurityKeyBoundKeys$annotations() {
    }

    @hv.o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @hv.o("is_setup_completed")
    public static /* synthetic */ void isSetupCompleted$annotations() {
    }

    @hv.o("sk_passkeys_enabled")
    public static /* synthetic */ void isSkPasskeysEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdResponse sshIdResponse, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), sshIdResponse.deviceBoundKeys);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), sshIdResponse.securityKeyBoundKeys);
        dVar.f(fVar, 2, sshIdResponse.caEncryptedPrivateKey);
        dVar.f(fVar, 3, sshIdResponse.caPublicKey);
        dVar.f(fVar, 4, sshIdResponse.username);
        dVar.f(fVar, 5, sshIdResponse.defaultPasskeyType);
        dVar.u(fVar, 6, sshIdResponse.isSetupCompleted);
        dVar.u(fVar, 7, sshIdResponse.isSkPasskeysEnabled);
        if (!dVar.E(fVar, 8) && sshIdResponse.devices == null) {
            return;
        }
        dVar.v(fVar, 8, (hv.r) nVarArr[8].getValue(), sshIdResponse.devices);
    }

    public final List<DeviceKeyBoundApiModel> component1() {
        return this.deviceBoundKeys;
    }

    public final List<SecurityKeyBoundApiModel> component2() {
        return this.securityKeyBoundKeys;
    }

    public final String component3() {
        return this.caEncryptedPrivateKey;
    }

    public final String component4() {
        return this.caPublicKey;
    }

    public final String component5() {
        return this.username;
    }

    public final String component6() {
        return this.defaultPasskeyType;
    }

    public final boolean component7() {
        return this.isSetupCompleted;
    }

    public final boolean component8() {
        return this.isSkPasskeysEnabled;
    }

    public final List<SshIdDeviceDetailsApiModel> component9() {
        return this.devices;
    }

    public final SshIdResponse copy(List<DeviceKeyBoundApiModel> list, List<SecurityKeyBoundApiModel> list2, String str, String str2, String str3, String str4, boolean z10, boolean z11, List<SshIdDeviceDetailsApiModel> list3) {
        t.f(list, "deviceBoundKeys");
        t.f(list2, "securityKeyBoundKeys");
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "username");
        t.f(str4, "defaultPasskeyType");
        return new SshIdResponse(list, list2, str, str2, str3, str4, z10, z11, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdResponse)) {
            return false;
        }
        SshIdResponse sshIdResponse = (SshIdResponse) obj;
        return t.b(this.deviceBoundKeys, sshIdResponse.deviceBoundKeys) && t.b(this.securityKeyBoundKeys, sshIdResponse.securityKeyBoundKeys) && t.b(this.caEncryptedPrivateKey, sshIdResponse.caEncryptedPrivateKey) && t.b(this.caPublicKey, sshIdResponse.caPublicKey) && t.b(this.username, sshIdResponse.username) && t.b(this.defaultPasskeyType, sshIdResponse.defaultPasskeyType) && this.isSetupCompleted == sshIdResponse.isSetupCompleted && this.isSkPasskeysEnabled == sshIdResponse.isSkPasskeysEnabled && t.b(this.devices, sshIdResponse.devices);
    }

    public final String getCaPublicKey() {
        return this.caPublicKey;
    }

    public final String getDefaultPasskeyType() {
        return this.defaultPasskeyType;
    }

    public final List<DeviceKeyBoundApiModel> getDeviceBoundKeys() {
        return this.deviceBoundKeys;
    }

    public final List<SshIdDeviceDetailsApiModel> getDevices() {
        return this.devices;
    }

    public final List<SecurityKeyBoundApiModel> getSecurityKeyBoundKeys() {
        return this.securityKeyBoundKeys;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.deviceBoundKeys.hashCode() * 31) + this.securityKeyBoundKeys.hashCode()) * 31) + this.caEncryptedPrivateKey.hashCode()) * 31) + this.caPublicKey.hashCode()) * 31) + this.username.hashCode()) * 31) + this.defaultPasskeyType.hashCode()) * 31) + Boolean.hashCode(this.isSetupCompleted)) * 31) + Boolean.hashCode(this.isSkPasskeysEnabled)) * 31;
        List<SshIdDeviceDetailsApiModel> list = this.devices;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isSetupCompleted() {
        return this.isSetupCompleted;
    }

    public final boolean isSkPasskeysEnabled() {
        return this.isSkPasskeysEnabled;
    }

    public String toString() {
        return "SshIdResponse(deviceBoundKeys=" + this.deviceBoundKeys + ", securityKeyBoundKeys=" + this.securityKeyBoundKeys + ", caEncryptedPrivateKey=" + this.caEncryptedPrivateKey + ", caPublicKey=" + this.caPublicKey + ", username=" + this.username + ", defaultPasskeyType=" + this.defaultPasskeyType + ", isSetupCompleted=" + this.isSetupCompleted + ", isSkPasskeysEnabled=" + this.isSkPasskeysEnabled + ", devices=" + this.devices + ")";
    }

    public SshIdResponse(List<DeviceKeyBoundApiModel> list, List<SecurityKeyBoundApiModel> list2, String str, String str2, String str3, String str4, boolean z10, boolean z11, List<SshIdDeviceDetailsApiModel> list3) {
        t.f(list, "deviceBoundKeys");
        t.f(list2, "securityKeyBoundKeys");
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "username");
        t.f(str4, "defaultPasskeyType");
        this.deviceBoundKeys = list;
        this.securityKeyBoundKeys = list2;
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.username = str3;
        this.defaultPasskeyType = str4;
        this.isSetupCompleted = z10;
        this.isSkPasskeysEnabled = z11;
        this.devices = list3;
    }

    public /* synthetic */ SshIdResponse(List list, List list2, String str, String str2, String str3, String str4, boolean z10, boolean z11, List list3, int i10, k kVar) {
        this(list, list2, str, str2, str3, str4, z10, z11, (i10 & 256) != 0 ? null : list3);
    }
}
