package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
import lv.x2;
import tp.b;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TelnetConfigIdentityBulk extends CommonBulkShareable {
    private Long encryptedWith;
    private Object identityId;
    private final Long localId;
    private final Long remoteId;
    private Object telnetConfigId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TelnetConfigIdentityBulk$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TelnetConfigIdentityBulk() {
        this((Object) null, (Object) null, (Long) null, (Long) null, (String) null, (Long) null, 63, (k) null);
    }

    public static /* synthetic */ TelnetConfigIdentityBulk copy$default(TelnetConfigIdentityBulk telnetConfigIdentityBulk, Object obj, Object obj2, Long l10, Long l11, String str, Long l12, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = telnetConfigIdentityBulk.identityId;
        }
        if ((i10 & 2) != 0) {
            obj2 = telnetConfigIdentityBulk.telnetConfigId;
        }
        if ((i10 & 4) != 0) {
            l10 = telnetConfigIdentityBulk.localId;
        }
        if ((i10 & 8) != 0) {
            l11 = telnetConfigIdentityBulk.remoteId;
        }
        if ((i10 & 16) != 0) {
            str = telnetConfigIdentityBulk.updatedAt;
        }
        if ((i10 & 32) != 0) {
            l12 = telnetConfigIdentityBulk.encryptedWith;
        }
        String str2 = str;
        Long l13 = l12;
        return telnetConfigIdentityBulk.copy(obj, obj2, l10, l11, str2, l13);
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o("telnet_config")
    public static /* synthetic */ void getTelnetConfigId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TelnetConfigIdentityBulk telnetConfigIdentityBulk, d dVar, f fVar) {
        CommonBulkShareable.write$Self(telnetConfigIdentityBulk, dVar, fVar);
        if (dVar.E(fVar, 0) || telnetConfigIdentityBulk.identityId != null) {
            dVar.v(fVar, 0, b.f80841a, telnetConfigIdentityBulk.identityId);
        }
        if (dVar.E(fVar, 1) || telnetConfigIdentityBulk.telnetConfigId != null) {
            dVar.v(fVar, 1, b.f80841a, telnetConfigIdentityBulk.telnetConfigId);
        }
        if (dVar.E(fVar, 2) || telnetConfigIdentityBulk.getLocalId() != null) {
            dVar.v(fVar, 2, h1.f64699a, telnetConfigIdentityBulk.getLocalId());
        }
        if (dVar.E(fVar, 3) || telnetConfigIdentityBulk.getRemoteId() != null) {
            dVar.v(fVar, 3, h1.f64699a, telnetConfigIdentityBulk.getRemoteId());
        }
        if (dVar.E(fVar, 4) || telnetConfigIdentityBulk.getUpdatedAt() != null) {
            dVar.v(fVar, 4, x2.f64817a, telnetConfigIdentityBulk.getUpdatedAt());
        }
        if (!dVar.E(fVar, 5) && telnetConfigIdentityBulk.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 5, h1.f64699a, telnetConfigIdentityBulk.getEncryptedWith());
    }

    public final Object component1() {
        return this.identityId;
    }

    public final Object component2() {
        return this.telnetConfigId;
    }

    public final Long component3() {
        return this.localId;
    }

    public final Long component4() {
        return this.remoteId;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Long component6() {
        return this.encryptedWith;
    }

    public final TelnetConfigIdentityBulk copy(Object obj, Object obj2, Long l10, Long l11, String str, Long l12) {
        return new TelnetConfigIdentityBulk(obj, obj2, l10, l11, str, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelnetConfigIdentityBulk)) {
            return false;
        }
        TelnetConfigIdentityBulk telnetConfigIdentityBulk = (TelnetConfigIdentityBulk) obj;
        return t.b(this.identityId, telnetConfigIdentityBulk.identityId) && t.b(this.telnetConfigId, telnetConfigIdentityBulk.telnetConfigId) && t.b(this.localId, telnetConfigIdentityBulk.localId) && t.b(this.remoteId, telnetConfigIdentityBulk.remoteId) && t.b(this.updatedAt, telnetConfigIdentityBulk.updatedAt) && t.b(this.encryptedWith, telnetConfigIdentityBulk.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Object getIdentityId() {
        return this.identityId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return this.remoteId;
    }

    public final Object getTelnetConfigId() {
        return this.telnetConfigId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Object obj = this.identityId;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.telnetConfigId;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.remoteId;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.encryptedWith;
        return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setIdentityId(Object obj) {
        this.identityId = obj;
    }

    public final void setTelnetConfigId(Object obj) {
        this.telnetConfigId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "TelnetConfigIdentityBulk(identityId=" + this.identityId + ", telnetConfigId=" + this.telnetConfigId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ TelnetConfigIdentityBulk(int i10, Object obj, Object obj2, Long l10, Long l11, String str, Long l12, s2 s2Var) {
        super(i10, s2Var);
        if ((i10 & 1) == 0) {
            this.identityId = null;
        } else {
            this.identityId = obj;
        }
        if ((i10 & 2) == 0) {
            this.telnetConfigId = null;
        } else {
            this.telnetConfigId = obj2;
        }
        if ((i10 & 4) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 8) == 0) {
            this.remoteId = null;
        } else {
            this.remoteId = l11;
        }
        if ((i10 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str;
        }
        if ((i10 & 32) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l12;
        }
    }

    public /* synthetic */ TelnetConfigIdentityBulk(Object obj, Object obj2, Long l10, Long l11, String str, Long l12, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : l11, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : l12);
    }

    public TelnetConfigIdentityBulk(Object obj, Object obj2, Long l10, Long l11, String str, Long l12) {
        this.identityId = obj;
        this.telnetConfigId = obj2;
        this.localId = l10;
        this.remoteId = l11;
        this.updatedAt = str;
        this.encryptedWith = l12;
    }
}
