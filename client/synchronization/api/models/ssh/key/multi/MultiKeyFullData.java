package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import gg.a;
import gg.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class MultiKeyFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private Long encryptedWith;
    private boolean isShared;
    private Long localId;

    @a
    public String name;
    private int remoteId;
    private String updatedAt;

    @a
    public String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return MultiKeyFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ MultiKeyFullData(int i10, int i11, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11, s2 s2Var) {
        if (96 != (i10 & 96)) {
            d2.a(i10, 96, MultiKeyFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.remoteId = (i10 & 1) == 0 ? 0 : i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i10 & 8) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        if ((i10 & 16) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        this.updatedAt = str4;
        this.isShared = z10;
        if ((i10 & 128) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    public static /* synthetic */ MultiKeyFullData copy$default(MultiKeyFullData multiKeyFullData, int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = multiKeyFullData.remoteId;
        }
        if ((i11 & 2) != 0) {
            l10 = multiKeyFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = multiKeyFullData.name;
        }
        if ((i11 & 8) != 0) {
            str2 = multiKeyFullData.username;
        }
        if ((i11 & 16) != 0) {
            str3 = multiKeyFullData.content;
        }
        if ((i11 & 32) != 0) {
            str4 = multiKeyFullData.updatedAt;
        }
        if ((i11 & 64) != 0) {
            z10 = multiKeyFullData.isShared;
        }
        if ((i11 & 128) != 0) {
            l11 = multiKeyFullData.encryptedWith;
        }
        boolean z11 = z10;
        Long l12 = l11;
        String str5 = str3;
        String str6 = str4;
        return multiKeyFullData.copy(i10, l10, str, str2, str5, str6, z11, l12);
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

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MultiKeyFullData multiKeyFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || multiKeyFullData.remoteId != 0) {
            dVar.t(fVar, 0, multiKeyFullData.remoteId);
        }
        if (dVar.E(fVar, 1) || multiKeyFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, multiKeyFullData.localId);
        }
        if (dVar.E(fVar, 2) || multiKeyFullData.name != null) {
            dVar.v(fVar, 2, x2.f64817a, multiKeyFullData.name);
        }
        if (dVar.E(fVar, 3) || multiKeyFullData.username != null) {
            dVar.v(fVar, 3, x2.f64817a, multiKeyFullData.username);
        }
        if (dVar.E(fVar, 4) || multiKeyFullData.content != null) {
            dVar.v(fVar, 4, x2.f64817a, multiKeyFullData.content);
        }
        dVar.f(fVar, 5, multiKeyFullData.updatedAt);
        dVar.u(fVar, 6, multiKeyFullData.isShared);
        if (!dVar.E(fVar, 7) && multiKeyFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 7, h1.f64699a, multiKeyFullData.getEncryptedWith());
    }

    public final int component1() {
        return this.remoteId;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.username;
    }

    public final String component5() {
        return this.content;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final boolean component7() {
        return this.isShared;
    }

    public final Long component8() {
        return this.encryptedWith;
    }

    public final MultiKeyFullData copy(int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11) {
        t.f(str4, "updatedAt");
        return new MultiKeyFullData(i10, l10, str, str2, str3, str4, z10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiKeyFullData)) {
            return false;
        }
        MultiKeyFullData multiKeyFullData = (MultiKeyFullData) obj;
        return this.remoteId == multiKeyFullData.remoteId && t.b(this.localId, multiKeyFullData.localId) && t.b(this.name, multiKeyFullData.name) && t.b(this.username, multiKeyFullData.username) && t.b(this.content, multiKeyFullData.content) && t.b(this.updatedAt, multiKeyFullData.updatedAt) && this.isShared == multiKeyFullData.isShared && t.b(this.encryptedWith, multiKeyFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.remoteId;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final int getRemoteId() {
        return this.remoteId;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(this.isShared);
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.remoteId) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode5 = (((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.updatedAt.hashCode()) * 31) + Boolean.hashCode(this.isShared)) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode5 + (l11 != null ? l11.hashCode() : 0);
    }

    public final boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = false;
        setEncryptedWith(null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setRemoteId(int i10) {
        this.remoteId = i10;
    }

    public final void setShared(boolean z10) {
        this.isShared = z10;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "MultiKeyFullData(remoteId=" + this.remoteId + ", localId=" + this.localId + ", name=" + this.name + ", username=" + this.username + ", content=" + this.content + ", updatedAt=" + this.updatedAt + ", isShared=" + this.isShared + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public MultiKeyFullData(int i10, Long l10, String str, String str2, String str3, String str4, boolean z10, Long l11) {
        t.f(str4, "updatedAt");
        this.remoteId = i10;
        this.localId = l10;
        this.name = str;
        this.username = str2;
        this.content = str3;
        this.updatedAt = str4;
        this.isShared = z10;
        this.encryptedWith = l11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ MultiKeyFullData(int r2, java.lang.Long r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.Long r9, int r10, ju.k r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 0
        L5:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 8
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r11 = r10 & 16
            if (r11 == 0) goto L1a
            r6 = r0
        L1a:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L28
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L31
        L28:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L31:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyFullData.<init>(int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Long, int, ju.k):void");
    }
}
