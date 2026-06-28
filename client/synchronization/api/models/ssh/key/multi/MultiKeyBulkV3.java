package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.a;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class MultiKeyBulkV3 extends MultiKeyBulk {
    private Long encryptedWith;
    private final long localId;

    @a
    public String name;
    private final long remoteId;
    private String updatedAt;

    @a
    public String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return MultiKeyBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public MultiKeyBulkV3() {
        this((String) null, (String) null, 0L, 0L, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ MultiKeyBulkV3 copy$default(MultiKeyBulkV3 multiKeyBulkV3, String str, String str2, long j10, long j11, String str3, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = multiKeyBulkV3.name;
        }
        if ((i10 & 2) != 0) {
            str2 = multiKeyBulkV3.username;
        }
        if ((i10 & 4) != 0) {
            j10 = multiKeyBulkV3.localId;
        }
        if ((i10 & 8) != 0) {
            j11 = multiKeyBulkV3.remoteId;
        }
        if ((i10 & 16) != 0) {
            str3 = multiKeyBulkV3.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l10 = multiKeyBulkV3.encryptedWith;
        }
        long j12 = j11;
        long j13 = j10;
        return multiKeyBulkV3.copy(str, str2, j13, j12, str3, l10);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MultiKeyBulkV3 multiKeyBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || multiKeyBulkV3.name != null) {
            dVar.v(fVar, 0, x2.f64817a, multiKeyBulkV3.name);
        }
        if (dVar.E(fVar, 1) || multiKeyBulkV3.username != null) {
            dVar.v(fVar, 1, x2.f64817a, multiKeyBulkV3.username);
        }
        if (dVar.E(fVar, 2) || multiKeyBulkV3.getLocalId().longValue() != 0) {
            dVar.q(fVar, 2, multiKeyBulkV3.getLocalId().longValue());
        }
        if (dVar.E(fVar, 3) || multiKeyBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 3, multiKeyBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 4) || !t.b(multiKeyBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 4, x2.f64817a, multiKeyBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && multiKeyBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, multiKeyBulkV3.getEncryptedWith());
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.username;
    }

    public final long component3() {
        return this.localId;
    }

    public final long component4() {
        return this.remoteId;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Long component6() {
        return this.encryptedWith;
    }

    public final MultiKeyBulkV3 copy(String str, String str2, long j10, long j11, String str3, Long l10) {
        return new MultiKeyBulkV3(str, str2, j10, j11, str3, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiKeyBulkV3)) {
            return false;
        }
        MultiKeyBulkV3 multiKeyBulkV3 = (MultiKeyBulkV3) obj;
        return t.b(this.name, multiKeyBulkV3.name) && t.b(this.username, multiKeyBulkV3.username) && this.localId == multiKeyBulkV3.localId && this.remoteId == multiKeyBulkV3.remoteId && t.b(this.updatedAt, multiKeyBulkV3.updatedAt) && t.b(this.encryptedWith, multiKeyBulkV3.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return Long.valueOf(this.localId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.localId)) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.encryptedWith;
        return iHashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "MultiKeyBulkV3(name=" + this.name + ", username=" + this.username + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ MultiKeyBulkV3(int i10, String str, String str2, long j10, long j11, String str3, Long l10, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i10 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i10 & 4) == 0) {
            this.localId = 0L;
        } else {
            this.localId = j10;
        }
        if ((i10 & 8) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j11;
        }
        if ((i10 & 16) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str3;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
    }

    public /* synthetic */ MultiKeyBulkV3(String str, String str2, long j10, long j11, String str3, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? 0L : j11, (i10 & 16) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str3, (i10 & 32) != 0 ? null : l10);
    }

    public MultiKeyBulkV3(String str, String str2, long j10, long j11, String str3, Long l10) {
        super(null);
        this.name = str;
        this.username = str2;
        this.localId = j10;
        this.remoteId = j11;
        this.updatedAt = str3;
        this.encryptedWith = l10;
    }
}
