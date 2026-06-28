package com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels;

import androidx.annotation.Keep;
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
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdUpdatePropertiesPayload {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String defaultPasskeyType;
    private final Boolean isSetupCompleted;
    private final String wizardId;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40903b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40902a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload", aVar, 3);
            i2Var.r("default_passkey_type", true);
            i2Var.r("is_setup_completed", true);
            i2Var.r("wizard_id", false);
            descriptor = i2Var;
            f40903b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdUpdatePropertiesPayload deserialize(e eVar) {
            int i10;
            String str;
            Boolean bool;
            String strB;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            String str2 = null;
            if (cVarD.l()) {
                String str3 = (String) cVarD.v(fVar, 0, x2.f64817a, null);
                Boolean bool2 = (Boolean) cVarD.v(fVar, 1, i.f64704a, null);
                str = str3;
                strB = cVarD.B(fVar, 2);
                bool = bool2;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Boolean bool3 = null;
                String strB2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        str2 = (String) cVarD.v(fVar, 0, x2.f64817a, str2);
                        i11 |= 1;
                    } else if (iD == 1) {
                        bool3 = (Boolean) cVarD.v(fVar, 1, i.f64704a, bool3);
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
                str = str2;
                bool = bool3;
                strB = strB2;
            }
            cVarD.b(fVar);
            return new SshIdUpdatePropertiesPayload(i10, str, bool, strB, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload) {
            t.f(fVar, "encoder");
            t.f(sshIdUpdatePropertiesPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdUpdatePropertiesPayload.write$Self$Termius_app_googleProductionRelease(sshIdUpdatePropertiesPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{iv.a.u(x2Var), iv.a.u(i.f64704a), x2Var};
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
            return a.f40902a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshIdUpdatePropertiesPayload(int i10, String str, Boolean bool, String str2, s2 s2Var) {
        if (4 != (i10 & 4)) {
            d2.a(i10, 4, a.f40902a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.defaultPasskeyType = null;
        } else {
            this.defaultPasskeyType = str;
        }
        if ((i10 & 2) == 0) {
            this.isSetupCompleted = null;
        } else {
            this.isSetupCompleted = bool;
        }
        this.wizardId = str2;
    }

    public static /* synthetic */ SshIdUpdatePropertiesPayload copy$default(SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, String str, Boolean bool, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sshIdUpdatePropertiesPayload.defaultPasskeyType;
        }
        if ((i10 & 2) != 0) {
            bool = sshIdUpdatePropertiesPayload.isSetupCompleted;
        }
        if ((i10 & 4) != 0) {
            str2 = sshIdUpdatePropertiesPayload.wizardId;
        }
        return sshIdUpdatePropertiesPayload.copy(str, bool, str2);
    }

    @o("default_passkey_type")
    public static /* synthetic */ void getDefaultPasskeyType$annotations() {
    }

    @o("wizard_id")
    public static /* synthetic */ void getWizardId$annotations() {
    }

    @o("is_setup_completed")
    public static /* synthetic */ void isSetupCompleted$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshIdUpdatePropertiesPayload.defaultPasskeyType != null) {
            dVar.v(fVar, 0, x2.f64817a, sshIdUpdatePropertiesPayload.defaultPasskeyType);
        }
        if (dVar.E(fVar, 1) || sshIdUpdatePropertiesPayload.isSetupCompleted != null) {
            dVar.v(fVar, 1, i.f64704a, sshIdUpdatePropertiesPayload.isSetupCompleted);
        }
        dVar.f(fVar, 2, sshIdUpdatePropertiesPayload.wizardId);
    }

    public final String component1() {
        return this.defaultPasskeyType;
    }

    public final Boolean component2() {
        return this.isSetupCompleted;
    }

    public final String component3() {
        return this.wizardId;
    }

    public final SshIdUpdatePropertiesPayload copy(String str, Boolean bool, String str2) {
        t.f(str2, "wizardId");
        return new SshIdUpdatePropertiesPayload(str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdUpdatePropertiesPayload)) {
            return false;
        }
        SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload = (SshIdUpdatePropertiesPayload) obj;
        return t.b(this.defaultPasskeyType, sshIdUpdatePropertiesPayload.defaultPasskeyType) && t.b(this.isSetupCompleted, sshIdUpdatePropertiesPayload.isSetupCompleted) && t.b(this.wizardId, sshIdUpdatePropertiesPayload.wizardId);
    }

    public final String getDefaultPasskeyType() {
        return this.defaultPasskeyType;
    }

    public final String getWizardId() {
        return this.wizardId;
    }

    public int hashCode() {
        String str = this.defaultPasskeyType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isSetupCompleted;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.wizardId.hashCode();
    }

    public final Boolean isSetupCompleted() {
        return this.isSetupCompleted;
    }

    public String toString() {
        return "SshIdUpdatePropertiesPayload(defaultPasskeyType=" + this.defaultPasskeyType + ", isSetupCompleted=" + this.isSetupCompleted + ", wizardId=" + this.wizardId + ")";
    }

    public SshIdUpdatePropertiesPayload(String str, Boolean bool, String str2) {
        t.f(str2, "wizardId");
        this.defaultPasskeyType = str;
        this.isSetupCompleted = bool;
        this.wizardId = str2;
    }

    public /* synthetic */ SshIdUpdatePropertiesPayload(String str, Boolean bool, String str2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, str2);
    }
}
