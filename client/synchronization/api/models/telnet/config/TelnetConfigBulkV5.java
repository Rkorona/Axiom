package com.server.auditor.ssh.client.synchronization.api.models.telnet.config;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import gg.b;
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
public final class TelnetConfigBulkV5 extends TelnetConfigBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final Long localId;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return TelnetConfigBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TelnetConfigBulkV5() {
        this((String) null, (Long) null, 0L, (String) null, (Long) null, 31, (k) null);
    }

    public static /* synthetic */ TelnetConfigBulkV5 copy$default(TelnetConfigBulkV5 telnetConfigBulkV5, String str, Long l10, long j10, String str2, Long l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = telnetConfigBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            l10 = telnetConfigBulkV5.localId;
        }
        if ((i10 & 4) != 0) {
            j10 = telnetConfigBulkV5.remoteId;
        }
        if ((i10 & 8) != 0) {
            str2 = telnetConfigBulkV5.updatedAt;
        }
        if ((i10 & 16) != 0) {
            l11 = telnetConfigBulkV5.encryptedWith;
        }
        long j11 = j10;
        return telnetConfigBulkV5.copy(str, l10, j11, str2, l11);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TelnetConfigBulkV5 telnetConfigBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || telnetConfigBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, telnetConfigBulkV5.content);
        }
        if (dVar.E(fVar, 1) || telnetConfigBulkV5.getLocalId() != null) {
            dVar.v(fVar, 1, h1.f64699a, telnetConfigBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 2) || telnetConfigBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 2, telnetConfigBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 3) || !t.b(telnetConfigBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 3, x2.f64817a, telnetConfigBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 4) && telnetConfigBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 4, h1.f64699a, telnetConfigBulkV5.getEncryptedWith());
    }

    public final String component1() {
        return this.content;
    }

    public final Long component2() {
        return this.localId;
    }

    public final long component3() {
        return this.remoteId;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final Long component5() {
        return this.encryptedWith;
    }

    public final TelnetConfigBulkV5 copy(String str, Long l10, long j10, String str2, Long l11) {
        return new TelnetConfigBulkV5(str, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelnetConfigBulkV5)) {
            return false;
        }
        TelnetConfigBulkV5 telnetConfigBulkV5 = (TelnetConfigBulkV5) obj;
        return t.b(this.content, telnetConfigBulkV5.content) && t.b(this.localId, telnetConfigBulkV5.localId) && this.remoteId == telnetConfigBulkV5.remoteId && t.b(this.updatedAt, telnetConfigBulkV5.updatedAt) && t.b(this.encryptedWith, telnetConfigBulkV5.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
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
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
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
        return "TelnetConfigBulkV5(content=" + this.content + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ TelnetConfigBulkV5(int i10, String str, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 8) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 16) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ TelnetConfigBulkV5(String str, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 16) != 0 ? null : l11);
    }

    public TelnetConfigBulkV5(String str, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.content = str;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
