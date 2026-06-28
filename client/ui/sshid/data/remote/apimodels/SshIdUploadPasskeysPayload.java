package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundPublicApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload;
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
public final class SshIdUploadPasskeysPayload {
    private static final n[] $childSerializers;
    private final List<DeviceKeyBoundPublicApiModel> deviceBoundKeys;
    private final List<SecurityKeyBoundApiModel> securityKeyBoundKeys;
    private final String wizardId;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40905b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40904a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload", aVar, 3);
            i2Var.r("device_bound_keys", false);
            i2Var.r("security_key_bound_keys", false);
            i2Var.r("wizard_id", false);
            descriptor = i2Var;
            f40905b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdUploadPasskeysPayload deserialize(e eVar) {
            int i10;
            List list;
            List list2;
            String strB;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = SshIdUploadPasskeysPayload.$childSerializers;
            List list3 = null;
            if (cVarD.l()) {
                List list4 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                list = list4;
                strB = cVarD.B(fVar, 2);
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list5 = null;
                String strB2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        list3 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list3);
                        i11 |= 1;
                    } else if (iD == 1) {
                        list5 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list5);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        strB2 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                list = list3;
                list2 = list5;
                strB = strB2;
            }
            cVarD.b(fVar);
            return new SshIdUploadPasskeysPayload(i10, list, list2, strB, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload) {
            t.f(fVar, "encoder");
            t.f(sshIdUploadPasskeysPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdUploadPasskeysPayload.write$Self$Termius_app_googleProductionRelease(sshIdUploadPasskeysPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = SshIdUploadPasskeysPayload.$childSerializers;
            return new hv.c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), x2.f64817a};
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
            return a.f40904a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new iu.a() { // from class: dp.f
            @Override // iu.a
            public final Object a() {
                return SshIdUploadPasskeysPayload._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: dp.g
            @Override // iu.a
            public final Object a() {
                return SshIdUploadPasskeysPayload._childSerializers$_anonymous_$0();
            }
        }), null};
    }

    public /* synthetic */ SshIdUploadPasskeysPayload(int i10, List list, List list2, String str, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40904a.getDescriptor());
        }
        this.deviceBoundKeys = list;
        this.securityKeyBoundKeys = list2;
        this.wizardId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(DeviceKeyBoundPublicApiModel.a.f40889a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new lv.f(SecurityKeyBoundApiModel.a.f40891a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SshIdUploadPasskeysPayload copy$default(SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload, List list, List list2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sshIdUploadPasskeysPayload.deviceBoundKeys;
        }
        if ((i10 & 2) != 0) {
            list2 = sshIdUploadPasskeysPayload.securityKeyBoundKeys;
        }
        if ((i10 & 4) != 0) {
            str = sshIdUploadPasskeysPayload.wizardId;
        }
        return sshIdUploadPasskeysPayload.copy(list, list2, str);
    }

    @hv.o("device_bound_keys")
    public static /* synthetic */ void getDeviceBoundKeys$annotations() {
    }

    @hv.o("security_key_bound_keys")
    public static /* synthetic */ void getSecurityKeyBoundKeys$annotations() {
    }

    @hv.o("wizard_id")
    public static /* synthetic */ void getWizardId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), sshIdUploadPasskeysPayload.deviceBoundKeys);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), sshIdUploadPasskeysPayload.securityKeyBoundKeys);
        dVar.f(fVar, 2, sshIdUploadPasskeysPayload.wizardId);
    }

    public final List<DeviceKeyBoundPublicApiModel> component1() {
        return this.deviceBoundKeys;
    }

    public final List<SecurityKeyBoundApiModel> component2() {
        return this.securityKeyBoundKeys;
    }

    public final String component3() {
        return this.wizardId;
    }

    public final SshIdUploadPasskeysPayload copy(List<DeviceKeyBoundPublicApiModel> list, List<SecurityKeyBoundApiModel> list2, String str) {
        t.f(list, "deviceBoundKeys");
        t.f(list2, "securityKeyBoundKeys");
        t.f(str, "wizardId");
        return new SshIdUploadPasskeysPayload(list, list2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdUploadPasskeysPayload)) {
            return false;
        }
        SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload = (SshIdUploadPasskeysPayload) obj;
        return t.b(this.deviceBoundKeys, sshIdUploadPasskeysPayload.deviceBoundKeys) && t.b(this.securityKeyBoundKeys, sshIdUploadPasskeysPayload.securityKeyBoundKeys) && t.b(this.wizardId, sshIdUploadPasskeysPayload.wizardId);
    }

    public final List<DeviceKeyBoundPublicApiModel> getDeviceBoundKeys() {
        return this.deviceBoundKeys;
    }

    public final List<SecurityKeyBoundApiModel> getSecurityKeyBoundKeys() {
        return this.securityKeyBoundKeys;
    }

    public final String getWizardId() {
        return this.wizardId;
    }

    public int hashCode() {
        return (((this.deviceBoundKeys.hashCode() * 31) + this.securityKeyBoundKeys.hashCode()) * 31) + this.wizardId.hashCode();
    }

    public String toString() {
        return "SshIdUploadPasskeysPayload(deviceBoundKeys=" + this.deviceBoundKeys + ", securityKeyBoundKeys=" + this.securityKeyBoundKeys + ", wizardId=" + this.wizardId + ")";
    }

    public SshIdUploadPasskeysPayload(List<DeviceKeyBoundPublicApiModel> list, List<SecurityKeyBoundApiModel> list2, String str) {
        t.f(list, "deviceBoundKeys");
        t.f(list2, "securityKeyBoundKeys");
        t.f(str, "wizardId");
        this.deviceBoundKeys = list;
        this.securityKeyBoundKeys = list2;
        this.wizardId = str;
    }
}
