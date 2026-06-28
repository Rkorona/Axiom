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
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SecurityKeyBoundApiModel {
    private final String certificate;
    private final String createdAt;

    @gg.a
    public String encryptedMetadata;
    private final String label;
    private final String publicKey;
    private final long remoteId;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40892b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40891a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SecurityKeyBoundApiModel", aVar, 6);
            i2Var.r("label", false);
            i2Var.r("id", false);
            i2Var.r(Table.SSH_CERTIFICATE, false);
            i2Var.r(SyncConstants.Bundle.PUBLIC_KEY, false);
            i2Var.r("encrypted_metadata", false);
            i2Var.r(Column.CREATED_AT, false);
            descriptor = i2Var;
            f40892b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SecurityKeyBoundApiModel deserialize(e eVar) {
            String strB;
            String strB2;
            String str;
            String str2;
            String str3;
            long j10;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                long jO = cVarD.o(fVar, 1);
                String strB3 = cVarD.B(fVar, 2);
                String strB4 = cVarD.B(fVar, 3);
                String strB5 = cVarD.B(fVar, 4);
                strB2 = cVarD.B(fVar, 5);
                str = strB4;
                str2 = strB5;
                str3 = strB3;
                j10 = jO;
                i10 = 63;
            } else {
                strB = null;
                String strB6 = null;
                String strB7 = null;
                boolean z10 = true;
                int i11 = 0;
                long jO2 = 0;
                String strB8 = null;
                String strB9 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            jO2 = cVarD.o(fVar, 1);
                            i11 |= 2;
                            break;
                        case 2:
                            strB7 = cVarD.B(fVar, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            strB9 = cVarD.B(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            strB6 = cVarD.B(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            strB8 = cVarD.B(fVar, 5);
                            i11 |= 32;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                strB2 = strB8;
                str = strB9;
                str2 = strB6;
                str3 = strB7;
                j10 = jO2;
                i10 = i11;
            }
            String str4 = strB;
            cVarD.b(fVar);
            return new SecurityKeyBoundApiModel(i10, str4, j10, str3, str, str2, strB2, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SecurityKeyBoundApiModel securityKeyBoundApiModel) {
            t.f(fVar, "encoder");
            t.f(securityKeyBoundApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SecurityKeyBoundApiModel.write$Self$Termius_app_googleProductionRelease(securityKeyBoundApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, h1.f64699a, x2Var, x2Var, x2Var, x2Var};
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
            return a.f40891a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ SecurityKeyBoundApiModel(int i10, String str, long j10, String str2, String str3, String str4, String str5, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, a.f40891a.getDescriptor());
        }
        this.label = str;
        this.remoteId = j10;
        this.certificate = str2;
        this.publicKey = str3;
        this.encryptedMetadata = str4;
        this.createdAt = str5;
    }

    public static /* synthetic */ SecurityKeyBoundApiModel copy$default(SecurityKeyBoundApiModel securityKeyBoundApiModel, String str, long j10, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = securityKeyBoundApiModel.label;
        }
        if ((i10 & 2) != 0) {
            j10 = securityKeyBoundApiModel.remoteId;
        }
        if ((i10 & 4) != 0) {
            str2 = securityKeyBoundApiModel.certificate;
        }
        if ((i10 & 8) != 0) {
            str3 = securityKeyBoundApiModel.publicKey;
        }
        if ((i10 & 16) != 0) {
            str4 = securityKeyBoundApiModel.encryptedMetadata;
        }
        if ((i10 & 32) != 0) {
            str5 = securityKeyBoundApiModel.createdAt;
        }
        return securityKeyBoundApiModel.copy(str, j10, str2, str3, str4, str5);
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @o("encrypted_metadata")
    public static /* synthetic */ void getEncryptedMetadata$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SecurityKeyBoundApiModel securityKeyBoundApiModel, d dVar, f fVar) {
        dVar.f(fVar, 0, securityKeyBoundApiModel.label);
        dVar.q(fVar, 1, securityKeyBoundApiModel.remoteId);
        dVar.f(fVar, 2, securityKeyBoundApiModel.certificate);
        dVar.f(fVar, 3, securityKeyBoundApiModel.publicKey);
        dVar.f(fVar, 4, securityKeyBoundApiModel.encryptedMetadata);
        dVar.f(fVar, 5, securityKeyBoundApiModel.createdAt);
    }

    public final String component1() {
        return this.label;
    }

    public final long component2() {
        return this.remoteId;
    }

    public final String component3() {
        return this.certificate;
    }

    public final String component4() {
        return this.publicKey;
    }

    public final String component5() {
        return this.encryptedMetadata;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final bp.a convertToDbModel() {
        return new bp.a(0L, this.remoteId, this.publicKey, this.encryptedMetadata, this.label, this.createdAt, 1, null);
    }

    public final SecurityKeyBoundApiModel copy(String str, long j10, String str2, String str3, String str4, String str5) {
        t.f(str, "label");
        t.f(str2, Table.SSH_CERTIFICATE);
        t.f(str3, Column.KEY_PUBLIC);
        t.f(str4, "encryptedMetadata");
        t.f(str5, "createdAt");
        return new SecurityKeyBoundApiModel(str, j10, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityKeyBoundApiModel)) {
            return false;
        }
        SecurityKeyBoundApiModel securityKeyBoundApiModel = (SecurityKeyBoundApiModel) obj;
        return t.b(this.label, securityKeyBoundApiModel.label) && this.remoteId == securityKeyBoundApiModel.remoteId && t.b(this.certificate, securityKeyBoundApiModel.certificate) && t.b(this.publicKey, securityKeyBoundApiModel.publicKey) && t.b(this.encryptedMetadata, securityKeyBoundApiModel.encryptedMetadata) && t.b(this.createdAt, securityKeyBoundApiModel.createdAt);
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final long getRemoteId() {
        return this.remoteId;
    }

    public int hashCode() {
        return (((((((((this.label.hashCode() * 31) + Long.hashCode(this.remoteId)) * 31) + this.certificate.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.encryptedMetadata.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "SecurityKeyBoundApiModel(label=" + this.label + ", remoteId=" + this.remoteId + ", certificate=" + this.certificate + ", publicKey=" + this.publicKey + ", encryptedMetadata=" + this.encryptedMetadata + ", createdAt=" + this.createdAt + ")";
    }

    public SecurityKeyBoundApiModel(String str, long j10, String str2, String str3, String str4, String str5) {
        t.f(str, "label");
        t.f(str2, Table.SSH_CERTIFICATE);
        t.f(str3, Column.KEY_PUBLIC);
        t.f(str4, "encryptedMetadata");
        t.f(str5, "createdAt");
        this.label = str;
        this.remoteId = j10;
        this.certificate = str2;
        this.publicKey = str3;
        this.encryptedMetadata = str4;
        this.createdAt = str5;
    }
}
