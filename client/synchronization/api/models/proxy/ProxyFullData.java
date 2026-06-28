package com.server.auditor.ssh.client.synchronization.api.models.proxy;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.Shareable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId$$serializer;
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
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ProxyFullData implements Shareable, CryptoErrorInterface {

    @b
    public String content;
    private Long encryptedWith;

    @a
    public String hostname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39059id;
    private WithRecourseId identityId;
    private Boolean isShared;
    private Long localId;
    private Integer port;
    private String type;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ProxyFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ProxyFullData(int i10, int i11, Long l10, String str, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11, s2 s2Var) {
        if (5 != (i10 & 5)) {
            d2.a(i10, 5, ProxyFullData$$serializer.INSTANCE.getDescriptor());
        }
        this.f39059id = i11;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.updatedAt = str;
        if ((i10 & 8) == 0) {
            this.identityId = null;
        } else {
            this.identityId = withRecourseId;
        }
        if ((i10 & 16) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i10 & 32) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str3;
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
        return this.f39059id;
    }

    public static /* synthetic */ ProxyFullData copy$default(ProxyFullData proxyFullData, int i10, Long l10, String str, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = proxyFullData.f39059id;
        }
        if ((i11 & 2) != 0) {
            l10 = proxyFullData.localId;
        }
        if ((i11 & 4) != 0) {
            str = proxyFullData.updatedAt;
        }
        if ((i11 & 8) != 0) {
            withRecourseId = proxyFullData.identityId;
        }
        if ((i11 & 16) != 0) {
            str2 = proxyFullData.type;
        }
        if ((i11 & 32) != 0) {
            str3 = proxyFullData.hostname;
        }
        if ((i11 & 64) != 0) {
            num = proxyFullData.port;
        }
        if ((i11 & 128) != 0) {
            bool = proxyFullData.isShared;
        }
        if ((i11 & 256) != 0) {
            str4 = proxyFullData.content;
        }
        if ((i11 & File.FLAG_O_TRUNC) != 0) {
            l11 = proxyFullData.encryptedWith;
        }
        String str5 = str4;
        Long l12 = l11;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str6 = str2;
        String str7 = str3;
        return proxyFullData.copy(i10, l10, str, withRecourseId, str6, str7, num2, bool2, str5, l12);
    }

    @o("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("hostname")
    public static /* synthetic */ void getHostname$annotations() {
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

    @o(Column.TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @o(Column.IS_SHARED)
    public static /* synthetic */ void isShared$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyFullData proxyFullData, d dVar, f fVar) {
        dVar.t(fVar, 0, proxyFullData.f39059id);
        if (dVar.E(fVar, 1) || proxyFullData.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, proxyFullData.localId);
        }
        dVar.f(fVar, 2, proxyFullData.updatedAt);
        if (dVar.E(fVar, 3) || proxyFullData.identityId != null) {
            dVar.v(fVar, 3, WithRecourseId$$serializer.INSTANCE, proxyFullData.identityId);
        }
        if (dVar.E(fVar, 4) || proxyFullData.type != null) {
            dVar.v(fVar, 4, x2.f64817a, proxyFullData.type);
        }
        if (dVar.E(fVar, 5) || proxyFullData.hostname != null) {
            dVar.v(fVar, 5, x2.f64817a, proxyFullData.hostname);
        }
        if (dVar.E(fVar, 6) || proxyFullData.port != null) {
            dVar.v(fVar, 6, w0.f64808a, proxyFullData.port);
        }
        if (dVar.E(fVar, 7) || proxyFullData.isShared != null) {
            dVar.v(fVar, 7, i.f64704a, proxyFullData.isShared);
        }
        if (dVar.E(fVar, 8) || proxyFullData.content != null) {
            dVar.v(fVar, 8, x2.f64817a, proxyFullData.content);
        }
        if (!dVar.E(fVar, 9) && proxyFullData.getEncryptedWith() == null) {
            return;
        }
        dVar.v(fVar, 9, h1.f64699a, proxyFullData.getEncryptedWith());
    }

    public final Long component10() {
        return this.encryptedWith;
    }

    public final Long component2() {
        return this.localId;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final WithRecourseId component4() {
        return this.identityId;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.hostname;
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

    public final ProxyFullData copy(int i10, Long l10, String str, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11) {
        t.f(str, "updatedAt");
        return new ProxyFullData(i10, l10, str, withRecourseId, str2, str3, num, bool, str4, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyFullData)) {
            return false;
        }
        ProxyFullData proxyFullData = (ProxyFullData) obj;
        return this.f39059id == proxyFullData.f39059id && t.b(this.localId, proxyFullData.localId) && t.b(this.updatedAt, proxyFullData.updatedAt) && t.b(this.identityId, proxyFullData.identityId) && t.b(this.type, proxyFullData.type) && t.b(this.hostname, proxyFullData.hostname) && t.b(this.port, proxyFullData.port) && t.b(this.isShared, proxyFullData.isShared) && t.b(this.content, proxyFullData.content) && t.b(this.encryptedWith, proxyFullData.encryptedWith);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Long getEncryptedWith() {
        return this.encryptedWith;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.CryptoErrorInterface
    public int getId() {
        return this.f39059id;
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

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39059id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        WithRecourseId withRecourseId = this.identityId;
        int iHashCode3 = (iHashCode2 + (withRecourseId == null ? 0 : withRecourseId.hashCode())) * 31;
        String str = this.type;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hostname;
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

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUpdatedAt(String str) {
        t.f(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        return "ProxyFullData(id=" + this.f39059id + ", localId=" + this.localId + ", updatedAt=" + this.updatedAt + ", identityId=" + this.identityId + ", type=" + this.type + ", hostname=" + this.hostname + ", port=" + this.port + ", isShared=" + this.isShared + ", content=" + this.content + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public ProxyFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11) {
        t.f(str, "updatedAt");
        this.f39059id = i10;
        this.localId = l10;
        this.updatedAt = str;
        this.identityId = withRecourseId;
        this.type = str2;
        this.hostname = str3;
        this.port = num;
        this.isShared = bool;
        this.content = str4;
        this.encryptedWith = l11;
    }

    public /* synthetic */ ProxyFullData(int i10, Long l10, String str, WithRecourseId withRecourseId, String str2, String str3, Integer num, Boolean bool, String str4, Long l11, int i11, k kVar) {
        this(i10, (i11 & 2) != 0 ? null : l10, str, (i11 & 8) != 0 ? null : withRecourseId, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : bool, (i11 & 256) != 0 ? null : str4, (i11 & File.FLAG_O_TRUNC) != 0 ? null : l11);
    }
}
