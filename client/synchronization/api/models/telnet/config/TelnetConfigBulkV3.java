package com.server.auditor.ssh.client.synchronization.api.models.telnet.config;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TelnetConfigBulkV3 extends TelnetConfigBulk {
    private final String charset;
    private final String colorScheme;
    private Long encryptedWith;
    private final long localId;
    private final Integer port;
    private final long remoteId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TelnetConfigBulkV3$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TelnetConfigBulkV3() {
        this((Integer) null, (String) null, (String) null, 0L, 0L, (String) null, (Long) null, 127, (k) null);
    }

    public static /* synthetic */ TelnetConfigBulkV3 copy$default(TelnetConfigBulkV3 telnetConfigBulkV3, Integer num, String str, String str2, long j10, long j11, String str3, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = telnetConfigBulkV3.port;
        }
        if ((i10 & 2) != 0) {
            str = telnetConfigBulkV3.charset;
        }
        if ((i10 & 4) != 0) {
            str2 = telnetConfigBulkV3.colorScheme;
        }
        if ((i10 & 8) != 0) {
            j10 = telnetConfigBulkV3.localId;
        }
        if ((i10 & 16) != 0) {
            j11 = telnetConfigBulkV3.remoteId;
        }
        if ((i10 & 32) != 0) {
            str3 = telnetConfigBulkV3.updatedAt;
        }
        if ((i10 & 64) != 0) {
            l10 = telnetConfigBulkV3.encryptedWith;
        }
        long j12 = j11;
        long j13 = j10;
        String str4 = str2;
        return telnetConfigBulkV3.copy(num, str, str4, j13, j12, str3, l10);
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TelnetConfigBulkV3 telnetConfigBulkV3, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || telnetConfigBulkV3.port != null) {
            dVar.v(fVar, 0, w0.f64808a, telnetConfigBulkV3.port);
        }
        if (dVar.E(fVar, 1) || telnetConfigBulkV3.charset != null) {
            dVar.v(fVar, 1, x2.f64817a, telnetConfigBulkV3.charset);
        }
        if (dVar.E(fVar, 2) || telnetConfigBulkV3.colorScheme != null) {
            dVar.v(fVar, 2, x2.f64817a, telnetConfigBulkV3.colorScheme);
        }
        if (dVar.E(fVar, 3) || telnetConfigBulkV3.getLocalId().longValue() != 0) {
            dVar.q(fVar, 3, telnetConfigBulkV3.getLocalId().longValue());
        }
        if (dVar.E(fVar, 4) || telnetConfigBulkV3.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 4, telnetConfigBulkV3.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 5) || !t.b(telnetConfigBulkV3.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 5, x2.f64817a, telnetConfigBulkV3.getUpdatedAt());
        }
        if (!dVar.E(fVar, 6) && telnetConfigBulkV3.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, telnetConfigBulkV3.getEncryptedWith());
    }

    public final Integer component1() {
        return this.port;
    }

    public final String component2() {
        return this.charset;
    }

    public final String component3() {
        return this.colorScheme;
    }

    public final long component4() {
        return this.localId;
    }

    public final long component5() {
        return this.remoteId;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final Long component7() {
        return this.encryptedWith;
    }

    public final TelnetConfigBulkV3 copy(Integer num, String str, String str2, long j10, long j11, String str3, Long l10) {
        return new TelnetConfigBulkV3(num, str, str2, j10, j11, str3, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelnetConfigBulkV3)) {
            return false;
        }
        TelnetConfigBulkV3 telnetConfigBulkV3 = (TelnetConfigBulkV3) obj;
        return t.b(this.port, telnetConfigBulkV3.port) && t.b(this.charset, telnetConfigBulkV3.charset) && t.b(this.colorScheme, telnetConfigBulkV3.colorScheme) && this.localId == telnetConfigBulkV3.localId && this.remoteId == telnetConfigBulkV3.remoteId && t.b(this.updatedAt, telnetConfigBulkV3.updatedAt) && t.b(this.encryptedWith, telnetConfigBulkV3.encryptedWith);
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return Long.valueOf(this.localId);
    }

    public final Integer getPort() {
        return this.port;
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
        Integer num = this.port;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.charset;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorScheme;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.localId)) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str3 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.encryptedWith;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
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
        return "TelnetConfigBulkV3(port=" + this.port + ", charset=" + this.charset + ", colorScheme=" + this.colorScheme + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ TelnetConfigBulkV3(int i10, Integer num, String str, String str2, long j10, long j11, String str3, Long l10, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 2) == 0) {
            this.charset = null;
        } else {
            this.charset = str;
        }
        if ((i10 & 4) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str2;
        }
        if ((i10 & 8) == 0) {
            this.localId = 0L;
        } else {
            this.localId = j10;
        }
        if ((i10 & 16) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j11;
        }
        if ((i10 & 32) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str3;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l10;
        }
    }

    public /* synthetic */ TelnetConfigBulkV3(Integer num, String str, String str2, long j10, long j11, String str3, Long l10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? 0L : j11, (i10 & 32) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str3, (i10 & 64) != 0 ? null : l10);
    }

    public TelnetConfigBulkV3(Integer num, String str, String str2, long j10, long j11, String str3, Long l10) {
        super(null);
        this.port = num;
        this.charset = str;
        this.colorScheme = str2;
        this.localId = j10;
        this.remoteId = j11;
        this.updatedAt = str3;
        this.encryptedWith = l10;
    }
}
