package com.server.auditor.ssh.client.synchronization.api.models.ssh.config;

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
public final class SshConfigBulkV5 extends SshConfigBulk {
    public static final String CONTENT_SERIAL_NAME = "content";

    @b
    public String content;
    private Long encryptedWith;
    private final Long localId;
    private Object proxyId;
    private final long remoteId;
    private Object snippetId;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SshConfigBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SshConfigBulkV5() {
        this((String) null, (Object) null, (Object) null, (Long) null, 0L, (String) null, (Long) null, 127, (k) null);
    }

    public static /* synthetic */ SshConfigBulkV5 copy$default(SshConfigBulkV5 sshConfigBulkV5, String str, Object obj, Object obj2, Long l10, long j10, String str2, Long l11, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            str = sshConfigBulkV5.content;
        }
        if ((i10 & 2) != 0) {
            obj = sshConfigBulkV5.proxyId;
        }
        if ((i10 & 4) != 0) {
            obj2 = sshConfigBulkV5.snippetId;
        }
        if ((i10 & 8) != 0) {
            l10 = sshConfigBulkV5.localId;
        }
        if ((i10 & 16) != 0) {
            j10 = sshConfigBulkV5.remoteId;
        }
        if ((i10 & 32) != 0) {
            str2 = sshConfigBulkV5.updatedAt;
        }
        if ((i10 & 64) != 0) {
            l11 = sshConfigBulkV5.encryptedWith;
        }
        long j11 = j10;
        Object obj4 = obj2;
        Long l12 = l10;
        return sshConfigBulkV5.copy(str, obj, obj4, l12, j11, str2, l11);
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

    @o(SshConfigBulk.PROXY_ID_SERIAL_NAME)
    public static /* synthetic */ void getProxyId$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @o(SshConfigBulk.STARTUP_SNIPPET_ID_SERIAL_NAME)
    public static /* synthetic */ void getSnippetId$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshConfigBulkV5 sshConfigBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshConfigBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, sshConfigBulkV5.content);
        }
        if (dVar.E(fVar, 1) || sshConfigBulkV5.getProxyId() != null) {
            dVar.v(fVar, 1, tp.b.f80841a, sshConfigBulkV5.getProxyId());
        }
        if (dVar.E(fVar, 2) || sshConfigBulkV5.getSnippetId() != null) {
            dVar.v(fVar, 2, tp.b.f80841a, sshConfigBulkV5.getSnippetId());
        }
        if (dVar.E(fVar, 3) || sshConfigBulkV5.getLocalId() != null) {
            dVar.v(fVar, 3, h1.f64699a, sshConfigBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 4) || sshConfigBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 4, sshConfigBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 5) || !t.b(sshConfigBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 5, x2.f64817a, sshConfigBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 6) && sshConfigBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 6, h1.f64699a, sshConfigBulkV5.getEncryptedWith());
    }

    public final String component1() {
        return this.content;
    }

    public final Object component2() {
        return this.proxyId;
    }

    public final Object component3() {
        return this.snippetId;
    }

    public final Long component4() {
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

    public final SshConfigBulkV5 copy(String str, Object obj, Object obj2, Long l10, long j10, String str2, Long l11) {
        return new SshConfigBulkV5(str, obj, obj2, l10, j10, str2, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshConfigBulkV5)) {
            return false;
        }
        SshConfigBulkV5 sshConfigBulkV5 = (SshConfigBulkV5) obj;
        return t.b(this.content, sshConfigBulkV5.content) && t.b(this.proxyId, sshConfigBulkV5.proxyId) && t.b(this.snippetId, sshConfigBulkV5.snippetId) && t.b(this.localId, sshConfigBulkV5.localId) && this.remoteId == sshConfigBulkV5.remoteId && t.b(this.updatedAt, sshConfigBulkV5.updatedAt) && t.b(this.encryptedWith, sshConfigBulkV5.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getLocalId() {
        return this.localId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public Object getProxyId() {
        return this.proxyId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public Long getRemoteId() {
        return Long.valueOf(this.remoteId);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public Object getSnippetId() {
        return this.snippetId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.proxyId;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.snippetId;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Long l10 = this.localId;
        int iHashCode4 = (((iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31) + Long.hashCode(this.remoteId)) * 31;
        String str2 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode5 + (l11 != null ? l11.hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public void setProxyId(Object obj) {
        this.proxyId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk
    public void setSnippetId(Object obj) {
        this.snippetId = obj;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        return "SshConfigBulkV5(content=" + this.content + ", proxyId=" + this.proxyId + ", snippetId=" + this.snippetId + ", localId=" + this.localId + ", remoteId=" + this.remoteId + ", updatedAt=" + this.updatedAt + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public /* synthetic */ SshConfigBulkV5(int i10, String str, Object obj, Object obj2, Long l10, long j10, String str2, Long l11, s2 s2Var) {
        super(null);
        if ((i10 & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 2) == 0) {
            this.proxyId = null;
        } else {
            this.proxyId = obj;
        }
        if ((i10 & 4) == 0) {
            this.snippetId = null;
        } else {
            this.snippetId = obj2;
        }
        if ((i10 & 8) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 16) == 0) {
            this.remoteId = 0L;
        } else {
            this.remoteId = j10;
        }
        if ((i10 & 32) == 0) {
            this.updatedAt = CommonBulkShareable.Companion.getDefaultUpdatedAt();
        } else {
            this.updatedAt = str2;
        }
        if ((i10 & 64) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public /* synthetic */ SshConfigBulkV5(String str, Object obj, Object obj2, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? 0L : j10, (i10 & 32) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 64) != 0 ? null : l11);
    }

    public SshConfigBulkV5(String str, Object obj, Object obj2, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.content = str;
        this.proxyId = obj;
        this.snippetId = obj2;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
