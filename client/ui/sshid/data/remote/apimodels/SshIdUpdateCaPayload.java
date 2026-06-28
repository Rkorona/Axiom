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
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdUpdateCaPayload {

    @gg.a
    public String caEncryptedPrivateKey;
    private final String caPublicKey;
    private final String wizardId;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40901b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40900a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload", aVar, 3);
            i2Var.r("ca_encrypted_private_key", false);
            i2Var.r("ca_public_key", false);
            i2Var.r("wizard_id", false);
            descriptor = i2Var;
            f40901b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdUpdateCaPayload deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                strB2 = cVarD.B(fVar, 2);
                str = strB3;
                i10 = 7;
            } else {
                strB = null;
                String strB4 = null;
                String strB5 = null;
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
                        strB5 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iD != 2) {
                            throw new e0(iD);
                        }
                        strB4 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    }
                }
                strB2 = strB4;
                str = strB5;
                i10 = i11;
            }
            String str2 = strB;
            cVarD.b(fVar);
            return new SshIdUpdateCaPayload(i10, str2, str, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdUpdateCaPayload sshIdUpdateCaPayload) {
            t.f(fVar, "encoder");
            t.f(sshIdUpdateCaPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdUpdateCaPayload.write$Self$Termius_app_googleProductionRelease(sshIdUpdateCaPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var};
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
            return a.f40900a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshIdUpdateCaPayload(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, a.f40900a.getDescriptor());
        }
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.wizardId = str3;
    }

    public static /* synthetic */ SshIdUpdateCaPayload copy$default(SshIdUpdateCaPayload sshIdUpdateCaPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sshIdUpdateCaPayload.caEncryptedPrivateKey;
        }
        if ((i10 & 2) != 0) {
            str2 = sshIdUpdateCaPayload.caPublicKey;
        }
        if ((i10 & 4) != 0) {
            str3 = sshIdUpdateCaPayload.wizardId;
        }
        return sshIdUpdateCaPayload.copy(str, str2, str3);
    }

    @o("ca_encrypted_private_key")
    public static /* synthetic */ void getCaEncryptedPrivateKey$annotations() {
    }

    @o("ca_public_key")
    public static /* synthetic */ void getCaPublicKey$annotations() {
    }

    @o("wizard_id")
    public static /* synthetic */ void getWizardId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdUpdateCaPayload sshIdUpdateCaPayload, d dVar, f fVar) {
        dVar.f(fVar, 0, sshIdUpdateCaPayload.caEncryptedPrivateKey);
        dVar.f(fVar, 1, sshIdUpdateCaPayload.caPublicKey);
        dVar.f(fVar, 2, sshIdUpdateCaPayload.wizardId);
    }

    public final String component1() {
        return this.caEncryptedPrivateKey;
    }

    public final String component2() {
        return this.caPublicKey;
    }

    public final String component3() {
        return this.wizardId;
    }

    public final SshIdUpdateCaPayload copy(String str, String str2, String str3) {
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "wizardId");
        return new SshIdUpdateCaPayload(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdUpdateCaPayload)) {
            return false;
        }
        SshIdUpdateCaPayload sshIdUpdateCaPayload = (SshIdUpdateCaPayload) obj;
        return t.b(this.caEncryptedPrivateKey, sshIdUpdateCaPayload.caEncryptedPrivateKey) && t.b(this.caPublicKey, sshIdUpdateCaPayload.caPublicKey) && t.b(this.wizardId, sshIdUpdateCaPayload.wizardId);
    }

    public final String getCaPublicKey() {
        return this.caPublicKey;
    }

    public final String getWizardId() {
        return this.wizardId;
    }

    public int hashCode() {
        return (((this.caEncryptedPrivateKey.hashCode() * 31) + this.caPublicKey.hashCode()) * 31) + this.wizardId.hashCode();
    }

    public String toString() {
        return "SshIdUpdateCaPayload(caEncryptedPrivateKey=" + this.caEncryptedPrivateKey + ", caPublicKey=" + this.caPublicKey + ", wizardId=" + this.wizardId + ")";
    }

    public SshIdUpdateCaPayload(String str, String str2, String str3) {
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "wizardId");
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.wizardId = str3;
    }
}
