package com.server.auditor.ssh.client.synchronization.api.models.telnet.config;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
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
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TelnetConfigFullData implements Shareable, CryptoErrorInterface {
    private String charset;
    private String colorScheme;

    @b
    public String content;
    private Long encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39067id;
    private WithRecourseId identityId;
    private Boolean isShared;
    private Long localId;
    private Integer port;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TelnetConfigFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TelnetConfigFullData(int i10, int i11, String str, Long l10, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, TelnetConfigFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39067id = (i10 & 1) == 0 ? 0 : i11;
        this.updatedAt = str;
        if ((i10 & 4) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 8) == 0) {
            this.identityId = null;
        } else {
            this.identityId = withRecourseId;
        }
        if ((i10 & 16) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str2;
        }
        if ((i10 & 32) == 0) {
            this.charset = null;
        } else {
            this.charset = str3;
        }
        if ((i10 & 64) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 128) == 0) {
            this.isShared = null;
        } else {
            this.isShared = bool;
        }
        if ((i10 & 256) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l11;
        }
    }

    private final int component1() {
        return this.f39067id;
    }

    public static /* synthetic */ TelnetConfigFullData copy$default(TelnetConfigFullData telnetConfigFullData, int i10, String str, Long l10, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = telnetConfigFullData.f39067id;
        }
        if ((i11 & 2) != 0) {
            str = telnetConfigFullData.updatedAt;
        }
        if ((i11 & 4) != 0) {
            l10 = telnetConfigFullData.localId;
        }
        if ((i11 & 8) != 0) {
            withRecourseId = telnetConfigFullData.identityId;
        }
        if ((i11 & 16) != 0) {
            str2 = telnetConfigFullData.colorScheme;
        }
        if ((i11 & 32) != 0) {
            str3 = telnetConfigFullData.charset;
        }
        if ((i11 & 64) != 0) {
            num = telnetConfigFullData.port;
        }
        if ((i11 & 128) != 0) {
            bool = telnetConfigFullData.isShared;
        }
        if ((i11 & 256) != 0) {
            str4 = telnetConfigFullData.content;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            l11 = telnetConfigFullData.encryptedWith;
        }
        String str5 = str4;
        Long l12 = l11;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str6 = str2;
        String str7 = str3;
        return telnetConfigFullData.copy(i10, str, l10, withRecourseId, str6, str7, num2, bool2, str5, l12);
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    private static /* synthetic */ void getId$annotations() {
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TelnetConfigFullData telnetConfigFullData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || telnetConfigFullData.f39067id != 0) {
            dVar.t(fVar, 0, telnetConfigFullData.f39067id);
        }
        dVar.f(fVar, 1, telnetConfigFullData.updatedAt);
        if (dVar.E(fVar, 2) || telnetConfigFullData.localId != null) {
            dVar.v(fVar, 2, h1.f64699a, telnetConfigFullData.localId);
        }
        if (dVar.E(fVar, 3) || telnetConfigFullData.identityId != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, telnetConfigFullData.identityId);
        }
        if (dVar.E(fVar, 4) || telnetConfigFullData.colorScheme != null) {
            dVar.v(fVar, 4, x2.f64817a, telnetConfigFullData.colorScheme);
        }
        if (dVar.E(fVar, 5) || telnetConfigFullData.charset != null) {
            dVar.v(fVar, 5, x2.f64817a, telnetConfigFullData.charset);
        }
        if (dVar.E(fVar, 6) || telnetConfigFullData.port != null) {
            dVar.v(fVar, 6, w0.f64808a, telnetConfigFullData.port);
        }
        if (dVar.E(fVar, 7) || telnetConfigFullData.isShared != null) {
            dVar.v(fVar, 7, i.f64704a, telnetConfigFullData.isShared);
        }
        if (dVar.E(fVar, 8) || telnetConfigFullData.content != null) {
            dVar.v(fVar, 8, x2.f64817a, telnetConfigFullData.content);
        }
        if (!dVar.E(fVar, 9) && telnetConfigFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 9, h1.f64699a, telnetConfigFullData.getEncryptedWith());
    }

    public final Long component10() {
        return this.encryptedWith;
    }

    public final String component2() {
        return this.updatedAt;
    }

    public final Long component3() {
        return this.localId;
    }

    public final WithRecourseId component4() {
        return this.identityId;
    }

    public final String component5() {
        return this.colorScheme;
    }

    public final String component6() {
        return this.charset;
    }

    public final Integer component7() {
        return this.port;
    }

    public final Boolean component8() {
        return this.isShared;
    }

    public final String component9() {
        return this.content;
    }

    public final TelnetConfigFullData copy(int i10, String str, Long l10, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11) {
        t.f(str, "updatedAt");
        return new TelnetConfigFullData(i10, str, l10, withRecourseId, str2, str3, num, bool, str4, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelnetConfigFullData)) {
            return false;
        }
        TelnetConfigFullData telnetConfigFullData = (TelnetConfigFullData) obj;
        return this.f39067id == telnetConfigFullData.f39067id && t.b(this.updatedAt, telnetConfigFullData.updatedAt) && t.b(this.localId, telnetConfigFullData.localId) && t.b(this.identityId, telnetConfigFullData.identityId) && t.b(this.colorScheme, telnetConfigFullData.colorScheme) && t.b(this.charset, telnetConfigFullData.charset) && t.b(this.port, telnetConfigFullData.port) && t.b(this.isShared, telnetConfigFullData.isShared) && t.b(this.content, telnetConfigFullData.content) && t.b(this.encryptedWith, telnetConfigFullData.encryptedWith);
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

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39067id;
    }

    public final WithRecourseId getIdentityId() {
        return this.identityId;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final Integer getPort() {
        return this.port;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return this.isShared;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f39067id) * 31) + this.updatedAt.hashCode()) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        WithRecourseId withRecourseId = this.identityId;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        String str = this.colorScheme;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.charset;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.port;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isShared;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.encryptedWith;
        return iHashCode8 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        this.isShared = Boolean.FALSE;
        setEncryptedWith(null);
    }

    public final void setCharset(String str) {
        this.charset = str;
    }

    public final void setColorScheme(String str) {
        this.colorScheme = str;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void setEncryptedWith(Long l10) {
        this.encryptedWith = l10;
    }

    public final void setIdentityId(WithRecourseId withRecourseId) {
        this.identityId = withRecourseId;
    }

    public final void setLocalId(Long l10) {
        this.localId = l10;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final void setShared(Boolean bool) {
        this.isShared = bool;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "TelnetConfigFullData(id=" + this.f39067id + ", updatedAt=" + this.updatedAt + ", localId=" + this.localId + ", identityId=" + this.identityId + ", colorScheme=" + this.colorScheme + ", charset=" + this.charset + ", port=" + this.port + ", isShared=" + this.isShared + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public TelnetConfigFullData(int i10, String str, Long l10, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11) {
        t.f(str, "updatedAt");
        this.f39067id = i10;
        this.updatedAt = str;
        this.localId = l10;
        this.identityId = withRecourseId;
        this.colorScheme = str2;
        this.charset = str3;
        this.port = num;
        this.isShared = bool;
        this.content = str4;
        this.encryptedWith = l11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TelnetConfigFullData(int r2, java.lang.String r3, java.lang.Long r4, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, java.lang.Boolean r9, java.lang.String r10, java.lang.Long r11, int r12, ju.k r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r2 = 0
        L5:
            r13 = r12 & 4
            r0 = 0
            if (r13 == 0) goto Lb
            r4 = r0
        Lb:
            r13 = r12 & 8
            if (r13 == 0) goto L10
            r5 = r0
        L10:
            r13 = r12 & 16
            if (r13 == 0) goto L15
            r6 = r0
        L15:
            r13 = r12 & 32
            if (r13 == 0) goto L1a
            r7 = r0
        L1a:
            r13 = r12 & 64
            if (r13 == 0) goto L1f
            r8 = r0
        L1f:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L24
            r9 = r0
        L24:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L29
            r10 = r0
        L29:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L39
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L44
        L39:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L44:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigFullData.<init>(int, java.lang.String, java.lang.Long, com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Long, int, ju.k):void");
    }
}
