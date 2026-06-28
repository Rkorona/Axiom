package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.synchronization.CryptoErrorCollector;
import com.server.auditor.ssh.client.ui.cryptography.data.DecryptionSeverity;
import com.server.auditor.ssh.client.ui.cryptography.data.RemoteDecryptErrorDebugInfo;
import com.server.auditor.ssh.client.ui.cryptography.data.RemoteEncryptErrorDebugInfo;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoErrorCollector {
    public static final int $stable = 8;
    private final List<CryptoError> cryptoErrors = new ArrayList();

    public static abstract class CryptoError {
        public static final int $stable = 0;

        public static final class LocalDecryptError extends CryptoError {
            public static final int $stable = 0;
            private final long remoteId;
            private final Avo.Entity type;

            public LocalDecryptError(Avo.Entity entity, long j10) {
                super(null);
                this.type = entity;
                this.remoteId = j10;
            }

            public static /* synthetic */ LocalDecryptError copy$default(LocalDecryptError localDecryptError, Avo.Entity entity, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    entity = localDecryptError.type;
                }
                if ((i10 & 2) != 0) {
                    j10 = localDecryptError.remoteId;
                }
                return localDecryptError.copy(entity, j10);
            }

            public final Avo.Entity component1() {
                return this.type;
            }

            public final long component2() {
                return this.remoteId;
            }

            public final LocalDecryptError copy(Avo.Entity entity, long j10) {
                return new LocalDecryptError(entity, j10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LocalDecryptError)) {
                    return false;
                }
                LocalDecryptError localDecryptError = (LocalDecryptError) obj;
                return this.type == localDecryptError.type && this.remoteId == localDecryptError.remoteId;
            }

            public final long getRemoteId() {
                return this.remoteId;
            }

            public final Avo.Entity getType() {
                return this.type;
            }

            public int hashCode() {
                Avo.Entity entity = this.type;
                return ((entity == null ? 0 : entity.hashCode()) * 31) + Long.hashCode(this.remoteId);
            }

            public String toString() {
                return "LocalDecryptError(type=" + this.type + ", remoteId=" + this.remoteId + ")";
            }
        }

        public static final class RemoteDecryptError extends CryptoError {
            public static final int $stable = 8;
            private final RemoteDecryptErrorDebugInfo debugInfo;
            private final Long remoteId;
            private final DecryptionSeverity severity;
            private final Avo.Entity type;
            private final int version;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteDecryptError(Avo.Entity entity, Long l10, int i10, DecryptionSeverity decryptionSeverity, RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo) {
                super(null);
                t.f(decryptionSeverity, "severity");
                t.f(remoteDecryptErrorDebugInfo, "debugInfo");
                this.type = entity;
                this.remoteId = l10;
                this.version = i10;
                this.severity = decryptionSeverity;
                this.debugInfo = remoteDecryptErrorDebugInfo;
            }

            public static /* synthetic */ RemoteDecryptError copy$default(RemoteDecryptError remoteDecryptError, Avo.Entity entity, Long l10, int i10, DecryptionSeverity decryptionSeverity, RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    entity = remoteDecryptError.type;
                }
                if ((i11 & 2) != 0) {
                    l10 = remoteDecryptError.remoteId;
                }
                if ((i11 & 4) != 0) {
                    i10 = remoteDecryptError.version;
                }
                if ((i11 & 8) != 0) {
                    decryptionSeverity = remoteDecryptError.severity;
                }
                if ((i11 & 16) != 0) {
                    remoteDecryptErrorDebugInfo = remoteDecryptError.debugInfo;
                }
                RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo2 = remoteDecryptErrorDebugInfo;
                int i12 = i10;
                return remoteDecryptError.copy(entity, l10, i12, decryptionSeverity, remoteDecryptErrorDebugInfo2);
            }

            public final Avo.Entity component1() {
                return this.type;
            }

            public final Long component2() {
                return this.remoteId;
            }

            public final int component3() {
                return this.version;
            }

            public final DecryptionSeverity component4() {
                return this.severity;
            }

            public final RemoteDecryptErrorDebugInfo component5() {
                return this.debugInfo;
            }

            public final RemoteDecryptError copy(Avo.Entity entity, Long l10, int i10, DecryptionSeverity decryptionSeverity, RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo) {
                t.f(decryptionSeverity, "severity");
                t.f(remoteDecryptErrorDebugInfo, "debugInfo");
                return new RemoteDecryptError(entity, l10, i10, decryptionSeverity, remoteDecryptErrorDebugInfo);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RemoteDecryptError)) {
                    return false;
                }
                RemoteDecryptError remoteDecryptError = (RemoteDecryptError) obj;
                return this.type == remoteDecryptError.type && t.b(this.remoteId, remoteDecryptError.remoteId) && this.version == remoteDecryptError.version && this.severity == remoteDecryptError.severity && t.b(this.debugInfo, remoteDecryptError.debugInfo);
            }

            public final RemoteDecryptErrorDebugInfo getDebugInfo() {
                return this.debugInfo;
            }

            public final Long getRemoteId() {
                return this.remoteId;
            }

            public final DecryptionSeverity getSeverity() {
                return this.severity;
            }

            public final Avo.Entity getType() {
                return this.type;
            }

            public final int getVersion() {
                return this.version;
            }

            public int hashCode() {
                Avo.Entity entity = this.type;
                int iHashCode = (entity == null ? 0 : entity.hashCode()) * 31;
                Long l10 = this.remoteId;
                return ((((((iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31) + Integer.hashCode(this.version)) * 31) + this.severity.hashCode()) * 31) + this.debugInfo.hashCode();
            }

            public String toString() {
                return "RemoteDecryptError(type=" + this.type + ", remoteId=" + this.remoteId + ", version=" + this.version + ", severity=" + this.severity + ", debugInfo=" + this.debugInfo + ")";
            }
        }

        public static final class RemoteEncryptError extends CryptoError {
            public static final int $stable = 8;
            private final RemoteEncryptErrorDebugInfo debugInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteEncryptError(RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo) {
                super(null);
                t.f(remoteEncryptErrorDebugInfo, "debugInfo");
                this.debugInfo = remoteEncryptErrorDebugInfo;
            }

            public static /* synthetic */ RemoteEncryptError copy$default(RemoteEncryptError remoteEncryptError, RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    remoteEncryptErrorDebugInfo = remoteEncryptError.debugInfo;
                }
                return remoteEncryptError.copy(remoteEncryptErrorDebugInfo);
            }

            public final RemoteEncryptErrorDebugInfo component1() {
                return this.debugInfo;
            }

            public final RemoteEncryptError copy(RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo) {
                t.f(remoteEncryptErrorDebugInfo, "debugInfo");
                return new RemoteEncryptError(remoteEncryptErrorDebugInfo);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoteEncryptError) && t.b(this.debugInfo, ((RemoteEncryptError) obj).debugInfo);
            }

            public final RemoteEncryptErrorDebugInfo getDebugInfo() {
                return this.debugInfo;
            }

            public int hashCode() {
                return this.debugInfo.hashCode();
            }

            public String toString() {
                return "RemoteEncryptError(debugInfo=" + this.debugInfo + ")";
            }
        }

        public /* synthetic */ CryptoError(ju.k kVar) {
            this();
        }

        private CryptoError() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLocalDecryptErrors$lambda$0(CryptoError cryptoError) {
        t.f(cryptoError, "it");
        return cryptoError instanceof CryptoError.LocalDecryptError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearRemoteDecryptErrors$lambda$1(CryptoError cryptoError) {
        t.f(cryptoError, "it");
        return cryptoError instanceof CryptoError.RemoteDecryptError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearRemoteEncryptErrors$lambda$2(CryptoError cryptoError) {
        t.f(cryptoError, "it");
        return cryptoError instanceof CryptoError.RemoteEncryptError;
    }

    public final void clearLocalDecryptErrors() {
        v.L(this.cryptoErrors, new iu.l() { // from class: com.server.auditor.ssh.client.synchronization.b
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CryptoErrorCollector.clearLocalDecryptErrors$lambda$0((CryptoErrorCollector.CryptoError) obj));
            }
        });
    }

    public final void clearRemoteDecryptErrors() {
        v.L(this.cryptoErrors, new iu.l() { // from class: com.server.auditor.ssh.client.synchronization.c
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CryptoErrorCollector.clearRemoteDecryptErrors$lambda$1((CryptoErrorCollector.CryptoError) obj));
            }
        });
    }

    public final void clearRemoteEncryptErrors() {
        v.L(this.cryptoErrors, new iu.l() { // from class: com.server.auditor.ssh.client.synchronization.d
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CryptoErrorCollector.clearRemoteEncryptErrors$lambda$2((CryptoErrorCollector.CryptoError) obj));
            }
        });
    }

    public final List<CryptoError.LocalDecryptError> getLocalDecryptErrors() {
        List<CryptoError> list = this.cryptoErrors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CryptoError.LocalDecryptError) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<CryptoError.RemoteDecryptError> getRemoteDecryptErrors() {
        List<CryptoError> list = this.cryptoErrors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CryptoError.RemoteDecryptError) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<CryptoError.RemoteEncryptError> getRemoteEncryptErrors() {
        List<CryptoError> list = this.cryptoErrors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CryptoError.RemoteEncryptError) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void logLocalDecryptError(Avo.Entity entity, long j10) {
        this.cryptoErrors.add(new CryptoError.LocalDecryptError(entity, j10));
    }

    public final void logRemoteDecryptError(Avo.Entity entity, Long l10, int i10, DecryptionSeverity decryptionSeverity, RemoteDecryptErrorDebugInfo remoteDecryptErrorDebugInfo) {
        t.f(decryptionSeverity, "severity");
        t.f(remoteDecryptErrorDebugInfo, "debugInfo");
        this.cryptoErrors.add(new CryptoError.RemoteDecryptError(entity, l10, i10, decryptionSeverity, remoteDecryptErrorDebugInfo));
    }

    public final void logRemoteEncryptError(RemoteEncryptErrorDebugInfo remoteEncryptErrorDebugInfo) {
        t.f(remoteEncryptErrorDebugInfo, "debugInfo");
        this.cryptoErrors.add(new CryptoError.RemoteEncryptError(remoteEncryptErrorDebugInfo));
    }
}
