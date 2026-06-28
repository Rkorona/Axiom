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
public final class SshIdCreationPayload {

    @gg.a
    public String caEncryptedPrivateKey;
    private final String caPublicKey;
    private final String defaultPasskeyType;
    private final String username;
    private final String wizardId;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40894b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40893a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload", aVar, 5);
            i2Var.r("ca_encrypted_private_key", false);
            i2Var.r("ca_public_key", false);
            i2Var.r("username", false);
            i2Var.r("default_passkey_type", false);
            i2Var.r("wizard_id", false);
            descriptor = i2Var;
            f40894b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdCreationPayload deserialize(e eVar) {
            String strB;
            String strB2;
            String strB3;
            String str;
            String str2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                String strB4 = cVarD.B(fVar, 1);
                String strB5 = cVarD.B(fVar, 2);
                strB2 = cVarD.B(fVar, 3);
                strB3 = cVarD.B(fVar, 4);
                str = strB5;
                str2 = strB4;
                i10 = 31;
            } else {
                strB = null;
                String strB6 = null;
                String strB7 = null;
                String strB8 = null;
                String strB9 = null;
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
                        strB9 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB8 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        strB6 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        strB7 = cVarD.B(fVar, 4);
                        i11 |= 16;
                    }
                }
                strB2 = strB6;
                strB3 = strB7;
                str = strB8;
                str2 = strB9;
                i10 = i11;
            }
            String str3 = strB;
            cVarD.b(fVar);
            return new SshIdCreationPayload(i10, str3, str2, str, strB2, strB3, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdCreationPayload sshIdCreationPayload) {
            t.f(fVar, "encoder");
            t.f(sshIdCreationPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshIdCreationPayload.write$Self$Termius_app_googleProductionRelease(sshIdCreationPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var, x2Var, x2Var, x2Var};
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
            return a.f40893a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SshIdCreationPayload(int i10, String str, String str2, String str3, String str4, String str5, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f40893a.getDescriptor());
        }
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.username = str3;
        this.defaultPasskeyType = str4;
        this.wizardId = str5;
    }

    public static /* synthetic */ SshIdCreationPayload copy$default(SshIdCreationPayload sshIdCreationPayload, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sshIdCreationPayload.caEncryptedPrivateKey;
        }
        if ((i10 & 2) != 0) {
            str2 = sshIdCreationPayload.caPublicKey;
        }
        if ((i10 & 4) != 0) {
            str3 = sshIdCreationPayload.username;
        }
        if ((i10 & 8) != 0) {
            str4 = sshIdCreationPayload.defaultPasskeyType;
        }
        if ((i10 & 16) != 0) {
            str5 = sshIdCreationPayload.wizardId;
        }
        String str6 = str5;
        String str7 = str3;
        return sshIdCreationPayload.copy(str, str2, str7, str4, str6);
    }

    @o("ca_encrypted_private_key")
    public static /* synthetic */ void getCaEncryptedPrivateKey$annotations() {
    }

    @o("ca_public_key")
    public static /* synthetic */ void getCaPublicKey$annotations() {
    }

    @o("default_passkey_type")
    public static /* synthetic */ void getDefaultPasskeyType$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @o("wizard_id")
    public static /* synthetic */ void getWizardId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdCreationPayload sshIdCreationPayload, d dVar, f fVar) {
        dVar.f(fVar, 0, sshIdCreationPayload.caEncryptedPrivateKey);
        dVar.f(fVar, 1, sshIdCreationPayload.caPublicKey);
        dVar.f(fVar, 2, sshIdCreationPayload.username);
        dVar.f(fVar, 3, sshIdCreationPayload.defaultPasskeyType);
        dVar.f(fVar, 4, sshIdCreationPayload.wizardId);
    }

    public final String component1() {
        return this.caEncryptedPrivateKey;
    }

    public final String component2() {
        return this.caPublicKey;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.defaultPasskeyType;
    }

    public final String component5() {
        return this.wizardId;
    }

    public final SshIdCreationPayload copy(String str, String str2, String str3, String str4, String str5) {
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "username");
        t.f(str4, "defaultPasskeyType");
        t.f(str5, "wizardId");
        return new SshIdCreationPayload(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdCreationPayload)) {
            return false;
        }
        SshIdCreationPayload sshIdCreationPayload = (SshIdCreationPayload) obj;
        return t.b(this.caEncryptedPrivateKey, sshIdCreationPayload.caEncryptedPrivateKey) && t.b(this.caPublicKey, sshIdCreationPayload.caPublicKey) && t.b(this.username, sshIdCreationPayload.username) && t.b(this.defaultPasskeyType, sshIdCreationPayload.defaultPasskeyType) && t.b(this.wizardId, sshIdCreationPayload.wizardId);
    }

    public final String getCaPublicKey() {
        return this.caPublicKey;
    }

    public final String getDefaultPasskeyType() {
        return this.defaultPasskeyType;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWizardId() {
        return this.wizardId;
    }

    public int hashCode() {
        return (((((((this.caEncryptedPrivateKey.hashCode() * 31) + this.caPublicKey.hashCode()) * 31) + this.username.hashCode()) * 31) + this.defaultPasskeyType.hashCode()) * 31) + this.wizardId.hashCode();
    }

    public String toString() {
        return "SshIdCreationPayload(caEncryptedPrivateKey=" + this.caEncryptedPrivateKey + ", caPublicKey=" + this.caPublicKey + ", username=" + this.username + ", defaultPasskeyType=" + this.defaultPasskeyType + ", wizardId=" + this.wizardId + ")";
    }

    public SshIdCreationPayload(String str, String str2, String str3, String str4, String str5) {
        t.f(str, "caEncryptedPrivateKey");
        t.f(str2, "caPublicKey");
        t.f(str3, "username");
        t.f(str4, "defaultPasskeyType");
        t.f(str5, "wizardId");
        this.caEncryptedPrivateKey = str;
        this.caPublicKey = str2;
        this.username = str3;
        this.defaultPasskeyType = str4;
        this.wizardId = str5;
    }
}
