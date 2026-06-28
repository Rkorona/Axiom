package com.server.auditor.ssh.client.ui.cryptography.data;

import com.server.auditor.ssh.client.ui.cryptography.data.EncryptionFailureCause;
import com.server.auditor.ssh.client.ui.cryptography.data.RemoteEncryptErrorDebugInfo;
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
import lv.w1;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RemoteEncryptErrorDebugInfo {
    private final Long cryptorKeyId;
    private final Long entityEncryptedWith;
    private final String entityFieldName;
    private final Long entityRemoteId;
    private final EncryptionFailureCause failureCause;
    private final boolean isKeyMismatch;
    private final boolean isSodiumEnabled;
    private final String vaultRole;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: go.i
        @Override // iu.a
        public final Object a() {
            return RemoteEncryptErrorDebugInfo._childSerializers$_anonymous_();
        }
    }), null, null};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40173b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40172a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.cryptography.data.RemoteEncryptErrorDebugInfo", aVar, 8);
            i2Var.r("entity_remote_id", false);
            i2Var.r("entity_field_name", false);
            i2Var.r("entity_encrypted_with", false);
            i2Var.r("cryptor_key_id", false);
            i2Var.r("vault_role", false);
            i2Var.r("failure_cause", false);
            i2Var.r("is_sodium_enabled", false);
            i2Var.r("is_key_mismatch", true);
            descriptor = i2Var;
            f40173b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RemoteEncryptErrorDebugInfo deserialize(e eVar) {
            boolean zH;
            EncryptionFailureCause encryptionFailureCause;
            String str;
            Long l10;
            Long l11;
            boolean z10;
            int i10;
            Long l12;
            String str2;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = RemoteEncryptErrorDebugInfo.$childSerializers;
            int i11 = 7;
            int i12 = 6;
            if (cVarD.l()) {
                h1 h1Var = h1.f64699a;
                Long l13 = (Long) cVarD.v(fVar, 0, h1Var, null);
                String strB = cVarD.B(fVar, 1);
                Long l14 = (Long) cVarD.v(fVar, 2, h1Var, null);
                Long l15 = (Long) cVarD.v(fVar, 3, h1Var, null);
                String str3 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
                EncryptionFailureCause encryptionFailureCause2 = (EncryptionFailureCause) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                boolean zH2 = cVarD.H(fVar, 6);
                encryptionFailureCause = encryptionFailureCause2;
                l10 = l15;
                zH = cVarD.H(fVar, 7);
                z10 = zH2;
                str = str3;
                i10 = 255;
                l11 = l14;
                str2 = strB;
                l12 = l13;
            } else {
                boolean z11 = true;
                boolean zH3 = false;
                int i13 = 0;
                EncryptionFailureCause encryptionFailureCause3 = null;
                String str4 = null;
                Long l16 = null;
                Long l17 = null;
                String strB2 = null;
                boolean zH4 = false;
                Long l18 = null;
                while (z11) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            l17 = (Long) cVarD.v(fVar, 0, h1.f64699a, l17);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 1:
                            strB2 = cVarD.B(fVar, 1);
                            i13 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            l18 = (Long) cVarD.v(fVar, 2, h1.f64699a, l18);
                            i13 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            l16 = (Long) cVarD.v(fVar, 3, h1.f64699a, l16);
                            i13 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            str4 = (String) cVarD.v(fVar, 4, x2.f64817a, str4);
                            i13 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            encryptionFailureCause3 = (EncryptionFailureCause) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), encryptionFailureCause3);
                            i13 |= 32;
                            break;
                        case 6:
                            zH4 = cVarD.H(fVar, i12);
                            i13 |= 64;
                            break;
                        case 7:
                            zH3 = cVarD.H(fVar, i11);
                            i13 |= 128;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                zH = zH3;
                encryptionFailureCause = encryptionFailureCause3;
                str = str4;
                l10 = l16;
                l11 = l18;
                z10 = zH4;
                i10 = i13;
                l12 = l17;
                str2 = strB2;
            }
            cVarD.b(fVar);
            return new RemoteEncryptErrorDebugInfo(i10, l12, str2, l11, l10, str, encryptionFailureCause, z10, zH, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo) {
            t.f(fVar, "encoder");
            t.f(remoteEncryptErrorDebugInfo, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            RemoteEncryptErrorDebugInfo.write$Self$Termius_app_googleProductionRelease(remoteEncryptErrorDebugInfo, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = RemoteEncryptErrorDebugInfo.$childSerializers;
            h1 h1Var = h1.f64699a;
            x2 x2Var = x2.f64817a;
            i iVar = i.f64704a;
            return new hv.c[]{iv.a.u(h1Var), x2Var, iv.a.u(h1Var), iv.a.u(h1Var), iv.a.u(x2Var), nVarArr[5].getValue(), iVar, iVar};
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
            return a.f40172a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ RemoteEncryptErrorDebugInfo(int i10, Long l10, String str, Long l11, Long l12, String str2, EncryptionFailureCause encryptionFailureCause, boolean z10, boolean z11, s2 s2Var) {
        if (127 != (i10 & 127)) {
            d2.a(i10, 127, a.f40172a.getDescriptor());
        }
        this.entityRemoteId = l10;
        this.entityFieldName = str;
        this.entityEncryptedWith = l11;
        this.cryptorKeyId = l12;
        this.vaultRole = str2;
        this.failureCause = encryptionFailureCause;
        this.isSodiumEnabled = z10;
        if ((i10 & 128) == 0) {
            this.isKeyMismatch = (l11 == null || t.b(l11, l12)) ? false : true;
        } else {
            this.isKeyMismatch = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new m("com.server.auditor.ssh.client.ui.cryptography.data.EncryptionFailureCause", ju.n0.b(EncryptionFailureCause.class), new qu.b[]{ju.n0.b(EncryptionFailureCause.CryptorReturnedNull.class), ju.n0.b(EncryptionFailureCause.FailedToEncrypt.class), ju.n0.b(EncryptionFailureCause.InputStringIsNull.class), ju.n0.b(EncryptionFailureCause.LibsodiumReturnedNull.class), ju.n0.b(EncryptionFailureCause.Other.class)}, new hv.c[]{new w1("CryptorReturnedNull", EncryptionFailureCause.CryptorReturnedNull.INSTANCE, new Annotation[0]), EncryptionFailureCause.FailedToEncrypt.a.f40163a, new w1("InputStringIsNull", EncryptionFailureCause.InputStringIsNull.INSTANCE, new Annotation[0]), new w1("LibsodiumReturnedNull", EncryptionFailureCause.LibsodiumReturnedNull.INSTANCE, new Annotation[0]), EncryptionFailureCause.Other.a.f40165a}, new Annotation[0]);
    }

    public static /* synthetic */ RemoteEncryptErrorDebugInfo copy$default(RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo, Long l10, String str, Long l11, Long l12, String str2, EncryptionFailureCause encryptionFailureCause, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = remoteEncryptErrorDebugInfo.entityRemoteId;
        }
        if ((i10 & 2) != 0) {
            str = remoteEncryptErrorDebugInfo.entityFieldName;
        }
        if ((i10 & 4) != 0) {
            l11 = remoteEncryptErrorDebugInfo.entityEncryptedWith;
        }
        if ((i10 & 8) != 0) {
            l12 = remoteEncryptErrorDebugInfo.cryptorKeyId;
        }
        if ((i10 & 16) != 0) {
            str2 = remoteEncryptErrorDebugInfo.vaultRole;
        }
        if ((i10 & 32) != 0) {
            encryptionFailureCause = remoteEncryptErrorDebugInfo.failureCause;
        }
        if ((i10 & 64) != 0) {
            z10 = remoteEncryptErrorDebugInfo.isSodiumEnabled;
        }
        if ((i10 & 128) != 0) {
            z11 = remoteEncryptErrorDebugInfo.isKeyMismatch;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        String str3 = str2;
        EncryptionFailureCause encryptionFailureCause2 = encryptionFailureCause;
        return remoteEncryptErrorDebugInfo.copy(l10, str, l11, l12, str3, encryptionFailureCause2, z12, z13);
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

    @hv.o("vault_role")
    public static /* synthetic */ void getVaultRole$annotations() {
    }

    @hv.o("is_key_mismatch")
    public static /* synthetic */ void isKeyMismatch$annotations() {
    }

    @hv.o("is_sodium_enabled")
    public static /* synthetic */ void isSodiumEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        h1 h1Var = h1.f64699a;
        boolean z10 = false;
        dVar.v(fVar, 0, h1Var, remoteEncryptErrorDebugInfo.entityRemoteId);
        dVar.f(fVar, 1, remoteEncryptErrorDebugInfo.entityFieldName);
        dVar.v(fVar, 2, h1Var, remoteEncryptErrorDebugInfo.entityEncryptedWith);
        dVar.v(fVar, 3, h1Var, remoteEncryptErrorDebugInfo.cryptorKeyId);
        dVar.v(fVar, 4, x2.f64817a, remoteEncryptErrorDebugInfo.vaultRole);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), remoteEncryptErrorDebugInfo.failureCause);
        dVar.u(fVar, 6, remoteEncryptErrorDebugInfo.isSodiumEnabled);
        if (!dVar.E(fVar, 7)) {
            boolean z11 = remoteEncryptErrorDebugInfo.isKeyMismatch;
            Long l10 = remoteEncryptErrorDebugInfo.entityEncryptedWith;
            if (l10 != null && !t.b(l10, remoteEncryptErrorDebugInfo.cryptorKeyId)) {
                z10 = true;
            }
            if (z11 == z10) {
                return;
            }
        }
        dVar.u(fVar, 7, remoteEncryptErrorDebugInfo.isKeyMismatch);
    }

    public final Long component1() {
        return this.entityRemoteId;
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

    public final EncryptionFailureCause component6() {
        return this.failureCause;
    }

    public final boolean component7() {
        return this.isSodiumEnabled;
    }

    public final boolean component8() {
        return this.isKeyMismatch;
    }

    public final RemoteEncryptErrorDebugInfo copy(Long l10, String str, Long l11, Long l12, String str2, EncryptionFailureCause encryptionFailureCause, boolean z10, boolean z11) {
        t.f(str, "entityFieldName");
        t.f(encryptionFailureCause, "failureCause");
        return new RemoteEncryptErrorDebugInfo(l10, str, l11, l12, str2, encryptionFailureCause, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteEncryptErrorDebugInfo)) {
            return false;
        }
        RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo = (RemoteEncryptErrorDebugInfo) obj;
        return t.b(this.entityRemoteId, remoteEncryptErrorDebugInfo.entityRemoteId) && t.b(this.entityFieldName, remoteEncryptErrorDebugInfo.entityFieldName) && t.b(this.entityEncryptedWith, remoteEncryptErrorDebugInfo.entityEncryptedWith) && t.b(this.cryptorKeyId, remoteEncryptErrorDebugInfo.cryptorKeyId) && t.b(this.vaultRole, remoteEncryptErrorDebugInfo.vaultRole) && t.b(this.failureCause, remoteEncryptErrorDebugInfo.failureCause) && this.isSodiumEnabled == remoteEncryptErrorDebugInfo.isSodiumEnabled && this.isKeyMismatch == remoteEncryptErrorDebugInfo.isKeyMismatch;
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

    public final EncryptionFailureCause getFailureCause() {
        return this.failureCause;
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
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.failureCause.hashCode()) * 31) + Boolean.hashCode(this.isSodiumEnabled)) * 31) + Boolean.hashCode(this.isKeyMismatch);
    }

    public final boolean isKeyMismatch() {
        return this.isKeyMismatch;
    }

    public final boolean isSodiumEnabled() {
        return this.isSodiumEnabled;
    }

    public String toString() {
        return "RemoteEncryptErrorDebugInfo(entityRemoteId=" + this.entityRemoteId + ", entityFieldName=" + this.entityFieldName + ", entityEncryptedWith=" + this.entityEncryptedWith + ", cryptorKeyId=" + this.cryptorKeyId + ", vaultRole=" + this.vaultRole + ", failureCause=" + this.failureCause + ", isSodiumEnabled=" + this.isSodiumEnabled + ", isKeyMismatch=" + this.isKeyMismatch + ")";
    }

    public RemoteEncryptErrorDebugInfo(Long l10, String str, Long l11, Long l12, String str2, EncryptionFailureCause encryptionFailureCause, boolean z10, boolean z11) {
        t.f(str, "entityFieldName");
        t.f(encryptionFailureCause, "failureCause");
        this.entityRemoteId = l10;
        this.entityFieldName = str;
        this.entityEncryptedWith = l11;
        this.cryptorKeyId = l12;
        this.vaultRole = str2;
        this.failureCause = encryptionFailureCause;
        this.isSodiumEnabled = z10;
        this.isKeyMismatch = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteEncryptErrorDebugInfo(Long l10, String str, Long l11, Long l12, String str2, EncryptionFailureCause encryptionFailureCause, boolean z10, boolean z11, int i10, k kVar) {
        boolean z12;
        if ((i10 & 128) != 0) {
            z12 = (l11 == null || t.b(l11, l12)) ? false : true;
        } else {
            z12 = z11;
        }
        this(l10, str, l11, l12, str2, encryptionFailureCause, z10, z12);
    }
}
