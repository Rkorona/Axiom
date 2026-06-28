package com.server.auditor.ssh.client.synchronization.api.models.ssh.key;

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
public final class SshKeyBulkV5 extends SshKeyBulk {
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
            return SshKeyBulkV5$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SshKeyBulkV5() {
        this((String) null, (Long) null, 0L, (String) null, (Long) null, 31, (k) null);
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeyBulkV5 sshKeyBulkV5, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || sshKeyBulkV5.content != null) {
            dVar.v(fVar, 0, x2.f64817a, sshKeyBulkV5.content);
        }
        if (dVar.E(fVar, 1) || sshKeyBulkV5.getLocalId() != null) {
            dVar.v(fVar, 1, h1.f64699a, sshKeyBulkV5.getLocalId());
        }
        if (dVar.E(fVar, 2) || sshKeyBulkV5.getRemoteId().longValue() != 0) {
            dVar.q(fVar, 2, sshKeyBulkV5.getRemoteId().longValue());
        }
        if (dVar.E(fVar, 3) || !t.b(sshKeyBulkV5.getUpdatedAt(), CommonBulkShareable.Companion.getDefaultUpdatedAt())) {
            dVar.v(fVar, 3, x2.f64817a, sshKeyBulkV5.getUpdatedAt());
        }
        if (!dVar.E(fVar, 4) && sshKeyBulkV5.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 4, h1.f64699a, sshKeyBulkV5.getEncryptedWith());
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

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable
    public void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public /* synthetic */ SshKeyBulkV5(int i10, String str, Long l10, long j10, String str2, Long l11, s2 s2Var) {
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

    public /* synthetic */ SshKeyBulkV5(String str, Long l10, long j10, String str2, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? CommonBulkShareable.Companion.getDefaultUpdatedAt() : str2, (i10 & 16) != 0 ? null : l11);
    }

    public SshKeyBulkV5(String str, Long l10, long j10, String str2, Long l11) {
        super(null);
        this.content = str;
        this.localId = l10;
        this.remoteId = j10;
        this.updatedAt = str2;
        this.encryptedWith = l11;
    }
}
