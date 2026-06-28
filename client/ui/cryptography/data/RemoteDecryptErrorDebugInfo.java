package com.server.auditor.ssh.client.ui.cryptography.data;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.ui.cryptography.data.DecryptionFailureCause;
import com.server.auditor.ssh.client.ui.cryptography.data.RemoteDecryptErrorDebugInfo;
import hv.e0;
import hv.m;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
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
import lv.w0;
import lv.w1;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RemoteDecryptErrorDebugInfo {
    private static final n[] $childSerializers;
    private final int cipherVersion;
    private final Integer ciphertextLength;
    private final Long cryptorKeyId;
    private final Long entityEncryptedWith;
    private final String entityFieldName;
    private final Long entityRemoteId;
    private final DecryptionFailureCause failureCause;
    private final boolean isKeyMismatch;
    private final boolean isSodiumEnabled;
    private final DecryptionSeverity severity;
    private final String vaultRole;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40171b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40170a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.cryptography.data.RemoteDecryptErrorDebugInfo", aVar, 11);
            i2Var.r("entity_remote_id", false);
            i2Var.r("entity_field_name", false);
            i2Var.r("entity_encrypted_with", false);
            i2Var.r("cryptor_key_id", false);
            i2Var.r("vault_role", false);
            i2Var.r("severity", false);
            i2Var.r("failure_cause", false);
            i2Var.r("is_sodium_enabled", false);
            i2Var.r("cipher_version", false);
            i2Var.r("ciphertext_length", false);
            i2Var.r("is_key_mismatch", true);
            descriptor = i2Var;
            f40171b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RemoteDecryptErrorDebugInfo deserialize(e eVar) {
            String str;
            DecryptionSeverity decryptionSeverity;
            boolean zH;
            Long l10;
            Long l11;
            Integer num;
            DecryptionFailureCause decryptionFailureCause;
            Long l12;
            int i10;
            boolean z10;
            int i11;
            String str2;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = RemoteDecryptErrorDebugInfo.$childSerializers;
            int i12 = 10;
            int i13 = 9;
            int i14 = 0;
            if (cVarD.l()) {
                h1 h1Var = h1.f64699a;
                Long l13 = (Long) cVarD.v(fVar, 0, h1Var, null);
                String strB = cVarD.B(fVar, 1);
                Long l14 = (Long) cVarD.v(fVar, 2, h1Var, null);
                Long l15 = (Long) cVarD.v(fVar, 3, h1Var, null);
                str = (String) cVarD.v(fVar, 4, x2.f64817a, null);
                decryptionSeverity = (DecryptionSeverity) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                DecryptionFailureCause decryptionFailureCause2 = (DecryptionFailureCause) cVarD.i(fVar, 6, (hv.b) nVarArr[6].getValue(), null);
                boolean zH2 = cVarD.H(fVar, 7);
                int iE = cVarD.e(fVar, 8);
                Integer num2 = (Integer) cVarD.v(fVar, 9, w0.f64808a, null);
                decryptionFailureCause = decryptionFailureCause2;
                l11 = l15;
                zH = cVarD.H(fVar, 10);
                num = num2;
                z10 = zH2;
                i11 = iE;
                l12 = l14;
                i10 = 2047;
                str2 = strB;
                l10 = l13;
            } else {
                int i15 = 6;
                int i16 = 5;
                boolean z11 = true;
                boolean zH3 = false;
                int iE2 = 0;
                str = null;
                decryptionSeverity = null;
                Long l16 = null;
                Integer num3 = null;
                DecryptionFailureCause decryptionFailureCause3 = null;
                Long l17 = null;
                Long l18 = null;
                String strB2 = null;
                boolean zH4 = false;
                while (z11) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z11 = false;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 0:
                            i14 |= 1;
                            l18 = (Long) cVarD.v(fVar, 0, h1.f64699a, l18);
                            i12 = 10;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 1:
                            strB2 = cVarD.B(fVar, 1);
                            i14 |= 2;
                            i12 = 10;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 2:
                            l17 = (Long) cVarD.v(fVar, 2, h1.f64699a, l17);
                            i14 |= 4;
                            i12 = 10;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 3:
                            l16 = (Long) cVarD.v(fVar, 3, h1.f64699a, l16);
                            i14 |= 8;
                            i12 = 10;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 4:
                            str = (String) cVarD.v(fVar, 4, x2.f64817a, str);
                            i14 |= 16;
                            i12 = 10;
                            i13 = 9;
                            i16 = 5;
                            i15 = 6;
                            break;
                        case 5:
                            decryptionSeverity = (DecryptionSeverity) cVarD.i(fVar, i16, (hv.b) nVarArr[i16].getValue(), decryptionSeverity);
                            i14 |= 32;
                            i12 = 10;
                            i13 = 9;
                            i15 = 6;
                            break;
                        case 6:
                            decryptionFailureCause3 = (DecryptionFailureCause) cVarD.i(fVar, i15, (hv.b) nVarArr[i15].getValue(), decryptionFailureCause3);
                            i14 |= 64;
                            i12 = 10;
                            i13 = 9;
                            break;
                        case 7:
                            zH4 = cVarD.H(fVar, 7);
                            i14 |= 128;
                            break;
                        case 8:
                            iE2 = cVarD.e(fVar, 8);
                            i14 |= 256;
                            break;
                        case 9:
                            num3 = (Integer) cVarD.v(fVar, i13, w0.f64808a, num3);
                            i14 |= File.FLAG_O_TRUNC;
                            break;
                        case 10:
                            zH3 = cVarD.H(fVar, i12);
                            i14 |= File.FLAG_O_APPEND;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                zH = zH3;
                l10 = l18;
                l11 = l16;
                num = num3;
                decryptionFailureCause = decryptionFailureCause3;
                l12 = l17;
                i10 = i14;
                z10 = zH4;
                i11 = iE2;
                str2 = strB2;
            }
            String str3 = str;
            DecryptionSeverity decryptionSeverity2 = decryptionSeverity;
            cVarD.b(fVar);
            return new RemoteDecryptErrorDebugInfo(i10, l10, str2, l12, l11, str3, decryptionSeverity2, decryptionFailureCause, z10, i11, num, zH, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo) {
            t.f(fVar, "encoder");
            t.f(remoteDecryptErrorDebugInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            RemoteDecryptErrorDebugInfo.write$Self$Termius_app_googleProductionRelease(remoteDecryptErrorDebugInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = RemoteDecryptErrorDebugInfo.$childSerializers;
            h1 h1Var = h1.f64699a;
            x2 x2Var = x2.f64817a;
            i iVar = i.f64704a;
            w0 w0Var = w0.f64808a;
            return new hv.c[]{iv.a.u(h1Var), x2Var, iv.a.u(h1Var), iv.a.u(h1Var), iv.a.u(x2Var), nVarArr[5].getValue(), nVarArr[6].getValue(), iVar, w0Var, iv.a.u(w0Var), iVar};
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
            return a.f40170a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{null, null, null, null, null, o.b(rVar, new iu.a() { // from class: go.f
            @Override // iu.a
            public final Object a() {
                return RemoteDecryptErrorDebugInfo._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new iu.a() { // from class: go.g
            @Override // iu.a
            public final Object a() {
                return RemoteDecryptErrorDebugInfo._childSerializers$_anonymous_$0();
            }
        }), null, null, null, null};
    }

    public /* synthetic */ RemoteDecryptErrorDebugInfo(int i10, Long l10, String str, Long l11, Long l12, String str2, DecryptionSeverity decryptionSeverity, DecryptionFailureCause decryptionFailureCause, boolean z10, int i11, Integer num, boolean z11, s2 s2Var) {
        if (1023 != (i10 & 1023)) {
            d2.a(i10, 1023, a.f40170a.getDescriptor());
        }
        this.entityRemoteId = l10;
        this.entityFieldName = str;
        this.entityEncryptedWith = l11;
        this.cryptorKeyId = l12;
        this.vaultRole = str2;
        this.severity = decryptionSeverity;
        this.failureCause = decryptionFailureCause;
        this.isSodiumEnabled = z10;
        this.cipherVersion = i11;
        this.ciphertextLength = num;
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.isKeyMismatch = (l11 == null || t.b(l11, l12)) ? false : true;
        } else {
            this.isKeyMismatch = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return DecryptionSeverity.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
        return new m("com.server.auditor.ssh.client.ui.cryptography.data.DecryptionFailureCause", ju.n0.b(DecryptionFailureCause.class), new qu.b[]{ju.n0.b(DecryptionFailureCause.CryptorReturnedNull.class), ju.n0.b(DecryptionFailureCause.MalformedCiphertext.class), ju.n0.b(DecryptionFailureCause.NotBase64.class), ju.n0.b(DecryptionFailureCause.Other.class), ju.n0.b(DecryptionFailureCause.ReflectionFailure.class), ju.n0.b(DecryptionFailureCause.UnsupportedVersion.class)}, new hv.c[]{DecryptionFailureCause.CryptorReturnedNull.a.f40152a, DecryptionFailureCause.MalformedCiphertext.a.f40154a, new w1("NotBase64", DecryptionFailureCause.NotBase64.INSTANCE, new Annotation[0]), DecryptionFailureCause.Other.a.f40156a, DecryptionFailureCause.ReflectionFailure.a.f40158a, DecryptionFailureCause.UnsupportedVersion.a.f40160a}, new Annotation[0]);
    }

    public static /* synthetic */ RemoteDecryptErrorDebugInfo copy$default(RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo, Long l10, String str, Long l11, Long l12, String str2, DecryptionSeverity decryptionSeverity, DecryptionFailureCause decryptionFailureCause, boolean z10, int i10, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l10 = remoteDecryptErrorDebugInfo.entityRemoteId;
        }
        if ((i11 & 2) != 0) {
            str = remoteDecryptErrorDebugInfo.entityFieldName;
        }
        if ((i11 & 4) != 0) {
            l11 = remoteDecryptErrorDebugInfo.entityEncryptedWith;
        }
        if ((i11 & 8) != 0) {
            l12 = remoteDecryptErrorDebugInfo.cryptorKeyId;
        }
        if ((i11 & 16) != 0) {
            str2 = remoteDecryptErrorDebugInfo.vaultRole;
        }
        if ((i11 & 32) != 0) {
            decryptionSeverity = remoteDecryptErrorDebugInfo.severity;
        }
        if ((i11 & 64) != 0) {
            decryptionFailureCause = remoteDecryptErrorDebugInfo.failureCause;
        }
        if ((i11 & 128) != 0) {
            z10 = remoteDecryptErrorDebugInfo.isSodiumEnabled;
        }
        if ((i11 & 256) != 0) {
            i10 = remoteDecryptErrorDebugInfo.cipherVersion;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            num = remoteDecryptErrorDebugInfo.ciphertextLength;
        }
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            z11 = remoteDecryptErrorDebugInfo.isKeyMismatch;
        }
        Integer num2 = num;
        boolean z12 = z11;
        boolean z13 = z10;
        int i12 = i10;
        DecryptionSeverity decryptionSeverity2 = decryptionSeverity;
        DecryptionFailureCause decryptionFailureCause2 = decryptionFailureCause;
        String str3 = str2;
        Long l13 = l11;
        return remoteDecryptErrorDebugInfo.copy(l10, str, l13, l12, str3, decryptionSeverity2, decryptionFailureCause2, z13, i12, num2, z12);
    }

    @hv.o("cipher_version")
    public static /* synthetic */ void getCipherVersion$annotations() {
    }

    @hv.o("ciphertext_length")
    public static /* synthetic */ void getCiphertextLength$annotations() {
    }

    @hv.o("cryptor_key_id")
    public static /* synthetic */ void getCryptorKeyId$annotations() {
    }

    @hv.o("entity_encrypted_with")
    public static /* synthetic */ void getEntityEncryptedWith$annotations() {
    }

    @hv.o("entity_field_name")
    public static /* synthetic */ void getEntityFieldName$annotations() {
    }

    @hv.o("entity_remote_id")
    public static /* synthetic */ void getEntityRemoteId$annotations() {
    }

    @hv.o("failure_cause")
    public static /* synthetic */ void getFailureCause$annotations() {
    }

    @hv.o("severity")
    public static /* synthetic */ void getSeverity$annotations() {
    }

    @hv.o("vault_role")
    public static /* synthetic */ void getVaultRole$annotations() {
    }

    @hv.o("is_key_mismatch")
    public static /* synthetic */ void isKeyMismatch$annotations() {
    }

    @hv.o("is_sodium_enabled")
    public static /* synthetic */ void isSodiumEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        h1 h1Var = h1.f64699a;
        boolean z10 = false;
        dVar.v(fVar, 0, h1Var, remoteDecryptErrorDebugInfo.entityRemoteId);
        dVar.f(fVar, 1, remoteDecryptErrorDebugInfo.entityFieldName);
        dVar.v(fVar, 2, h1Var, remoteDecryptErrorDebugInfo.entityEncryptedWith);
        dVar.v(fVar, 3, h1Var, remoteDecryptErrorDebugInfo.cryptorKeyId);
        dVar.v(fVar, 4, x2.f64817a, remoteDecryptErrorDebugInfo.vaultRole);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), remoteDecryptErrorDebugInfo.severity);
        dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), remoteDecryptErrorDebugInfo.failureCause);
        dVar.u(fVar, 7, remoteDecryptErrorDebugInfo.isSodiumEnabled);
        dVar.t(fVar, 8, remoteDecryptErrorDebugInfo.cipherVersion);
        dVar.v(fVar, 9, w0.f64808a, remoteDecryptErrorDebugInfo.ciphertextLength);
        if (!dVar.E(fVar, 10)) {
            boolean z11 = remoteDecryptErrorDebugInfo.isKeyMismatch;
            Long l10 = remoteDecryptErrorDebugInfo.entityEncryptedWith;
            if (l10 != null && !t.b(l10, remoteDecryptErrorDebugInfo.cryptorKeyId)) {
                z10 = true;
            }
            if (z11 == z10) {
                return;
            }
        }
        dVar.u(fVar, 10, remoteDecryptErrorDebugInfo.isKeyMismatch);
    }

    public final Long component1() {
        return this.entityRemoteId;
    }

    public final Integer component10() {
        return this.ciphertextLength;
    }

    public final boolean component11() {
        return this.isKeyMismatch;
    }

    public final String component2() {
        return this.entityFieldName;
    }

    public final Long component3() {
        return this.entityEncryptedWith;
    }

    public final Long component4() {
        return this.cryptorKeyId;
    }

    public final String component5() {
        return this.vaultRole;
    }

    public final DecryptionSeverity component6() {
        return this.severity;
    }

    public final DecryptionFailureCause component7() {
        return this.failureCause;
    }

    public final boolean component8() {
        return this.isSodiumEnabled;
    }

    public final int component9() {
        return this.cipherVersion;
    }

    public final RemoteDecryptErrorDebugInfo copy(Long l10, String str, Long l11, Long l12, String str2, DecryptionSeverity decryptionSeverity, DecryptionFailureCause decryptionFailureCause, boolean z10, int i10, Integer num, boolean z11) {
        t.f(str, "entityFieldName");
        t.f(decryptionSeverity, "severity");
        t.f(decryptionFailureCause, "failureCause");
        return new RemoteDecryptErrorDebugInfo(l10, str, l11, l12, str2, decryptionSeverity, decryptionFailureCause, z10, i10, num, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteDecryptErrorDebugInfo)) {
            return false;
        }
        RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo = (RemoteDecryptErrorDebugInfo) obj;
        return t.b(this.entityRemoteId, remoteDecryptErrorDebugInfo.entityRemoteId) && t.b(this.entityFieldName, remoteDecryptErrorDebugInfo.entityFieldName) && t.b(this.entityEncryptedWith, remoteDecryptErrorDebugInfo.entityEncryptedWith) && t.b(this.cryptorKeyId, remoteDecryptErrorDebugInfo.cryptorKeyId) && t.b(this.vaultRole, remoteDecryptErrorDebugInfo.vaultRole) && this.severity == remoteDecryptErrorDebugInfo.severity && t.b(this.failureCause, remoteDecryptErrorDebugInfo.failureCause) && this.isSodiumEnabled == remoteDecryptErrorDebugInfo.isSodiumEnabled && this.cipherVersion == remoteDecryptErrorDebugInfo.cipherVersion && t.b(this.ciphertextLength, remoteDecryptErrorDebugInfo.ciphertextLength) && this.isKeyMismatch == remoteDecryptErrorDebugInfo.isKeyMismatch;
    }

    public final int getCipherVersion() {
        return this.cipherVersion;
    }

    public final Integer getCiphertextLength() {
        return this.ciphertextLength;
    }

    public final Long getCryptorKeyId() {
        return this.cryptorKeyId;
    }

    public final Long getEntityEncryptedWith() {
        return this.entityEncryptedWith;
    }

    public final String getEntityFieldName() {
        return this.entityFieldName;
    }

    public final Long getEntityRemoteId() {
        return this.entityRemoteId;
    }

    public final DecryptionFailureCause getFailureCause() {
        return this.failureCause;
    }

    public final DecryptionSeverity getSeverity() {
        return this.severity;
    }

    public final String getVaultRole() {
        return this.vaultRole;
    }

    public int hashCode() {
        Long l10 = this.entityRemoteId;
        int iHashCode = (((l10 == null ? 0 : l10.hashCode()) * 31) + this.entityFieldName.hashCode()) * 31;
        Long l11 = this.entityEncryptedWith;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.cryptorKeyId;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.vaultRole;
        int iHashCode4 = (((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.severity.hashCode()) * 31) + this.failureCause.hashCode()) * 31) + Boolean.hashCode(this.isSodiumEnabled)) * 31) + Integer.hashCode(this.cipherVersion)) * 31;
        Integer num = this.ciphertextLength;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isKeyMismatch);
    }

    public final boolean isKeyMismatch() {
        return this.isKeyMismatch;
    }

    public final boolean isSodiumEnabled() {
        return this.isSodiumEnabled;
    }

    public String toString() {
        return "RemoteDecryptErrorDebugInfo(entityRemoteId=" + this.entityRemoteId + ", entityFieldName=" + this.entityFieldName + ", entityEncryptedWith=" + this.entityEncryptedWith + ", cryptorKeyId=" + this.cryptorKeyId + ", vaultRole=" + this.vaultRole + ", severity=" + this.severity + ", failureCause=" + this.failureCause + ", isSodiumEnabled=" + this.isSodiumEnabled + ", cipherVersion=" + this.cipherVersion + ", ciphertextLength=" + this.ciphertextLength + ", isKeyMismatch=" + this.isKeyMismatch + ")";
    }

    public RemoteDecryptErrorDebugInfo(Long l10, String str, Long l11, Long l12, String str2, DecryptionSeverity decryptionSeverity, DecryptionFailureCause decryptionFailureCause, boolean z10, int i10, Integer num, boolean z11) {
        t.f(str, "entityFieldName");
        t.f(decryptionSeverity, "severity");
        t.f(decryptionFailureCause, "failureCause");
        this.entityRemoteId = l10;
        this.entityFieldName = str;
        this.entityEncryptedWith = l11;
        this.cryptorKeyId = l12;
        this.vaultRole = str2;
        this.severity = decryptionSeverity;
        this.failureCause = decryptionFailureCause;
        this.isSodiumEnabled = z10;
        this.cipherVersion = i10;
        this.ciphertextLength = num;
        this.isKeyMismatch = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteDecryptErrorDebugInfo(Long l10, String str, Long l11, Long l12, String str2, DecryptionSeverity decryptionSeverity, DecryptionFailureCause decryptionFailureCause, boolean z10, int i10, Integer num, boolean z11, int i11, k kVar) {
        boolean z12;
        if ((i11 & File.FLAG_O_APPEND) != 0) {
            z12 = (l11 == null || t.b(l11, l12)) ? false : true;
        } else {
            z12 = z11;
        }
        this(l10, str, l11, l12, str2, decryptionSeverity, decryptionFailureCause, z10, i10, num, z12);
    }
}
