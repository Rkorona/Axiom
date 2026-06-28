package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.ui.sessionlogs.data.HistoryConnectionDeviceInfo;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import gg.a;
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
import so.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ResponseHistoryConnectionModel {
    private final Long actorId;

    @a
    public String command;
    private final String createdAt;
    private final HistoryConnectionDeviceInfo device;
    private final Long encryptedWith;
    private final HistoryHostInfo host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39049id;
    private final Long localId;
    private final SessionLogProtocol protocol;
    private final String timestamp;
    private final String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ResponseHistoryConnectionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ResponseHistoryConnectionModel(int i10, long j10, Long l10, HistoryConnectionDeviceInfo historyConnectionDeviceInfo, HistoryHostInfo historyHostInfo, String str, String str2, String str3, Long l11, String str4, SessionLogProtocol sessionLogProtocol, Long l12, s2 s2Var) {
        if (373 != (i10 & 373)) {
            d2.a(i10, 373, ResponseHistoryConnectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f39049id = j10;
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        this.device = historyConnectionDeviceInfo;
        if ((i10 & 8) == 0) {
            this.host = null;
        } else {
            this.host = historyHostInfo;
        }
        this.updatedAt = str;
        this.createdAt = str2;
        this.timestamp = str3;
        if ((i10 & 128) == 0) {
            this.actorId = null;
        } else {
            this.actorId = l11;
        }
        this.command = str4;
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.protocol = null;
        } else {
            this.protocol = sessionLogProtocol;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.encryptedWith = null;
        } else {
            this.encryptedWith = l12;
        }
    }

    public static /* synthetic */ ResponseHistoryConnectionModel copy$default(ResponseHistoryConnectionModel responseHistoryConnectionModel, long j10, Long l10, HistoryConnectionDeviceInfo historyConnectionDeviceInfo, HistoryHostInfo historyHostInfo, String str, String str2, String str3, Long l11, String str4, SessionLogProtocol sessionLogProtocol, Long l12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = responseHistoryConnectionModel.f39049id;
        }
        return responseHistoryConnectionModel.copy(j10, (i10 & 2) != 0 ? responseHistoryConnectionModel.localId : l10, (i10 & 4) != 0 ? responseHistoryConnectionModel.device : historyConnectionDeviceInfo, (i10 & 8) != 0 ? responseHistoryConnectionModel.host : historyHostInfo, (i10 & 16) != 0 ? responseHistoryConnectionModel.updatedAt : str, (i10 & 32) != 0 ? responseHistoryConnectionModel.createdAt : str2, (i10 & 64) != 0 ? responseHistoryConnectionModel.timestamp : str3, (i10 & 128) != 0 ? responseHistoryConnectionModel.actorId : l11, (i10 & 256) != 0 ? responseHistoryConnectionModel.command : str4, (i10 & File.FLAG_O_TRUNC) != 0 ? responseHistoryConnectionModel.protocol : sessionLogProtocol, (i10 & File.FLAG_O_APPEND) != 0 ? responseHistoryConnectionModel.encryptedWith : l12);
    }

    @o("actor_id")
    public static /* synthetic */ void getActorId$annotations() {
    }

    @o(Column.COMMAND)
    public static /* synthetic */ void getCommand$annotations() {
    }

    @o(Column.CREATED_AT)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @o("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("protocol")
    public static /* synthetic */ void getProtocol$annotations() {
    }

    @o("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ResponseHistoryConnectionModel responseHistoryConnectionModel, d dVar, f fVar) {
        dVar.q(fVar, 0, responseHistoryConnectionModel.f39049id);
        if (dVar.E(fVar, 1) || responseHistoryConnectionModel.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, responseHistoryConnectionModel.localId);
        }
        dVar.o(fVar, 2, HistoryConnectionDeviceInfo.a.f40371a, responseHistoryConnectionModel.device);
        if (dVar.E(fVar, 3) || responseHistoryConnectionModel.host != null) {
            dVar.v(fVar, 3, HistoryHostInfo$$serializer.INSTANCE, responseHistoryConnectionModel.host);
        }
        dVar.f(fVar, 4, responseHistoryConnectionModel.updatedAt);
        dVar.f(fVar, 5, responseHistoryConnectionModel.createdAt);
        dVar.f(fVar, 6, responseHistoryConnectionModel.timestamp);
        if (dVar.E(fVar, 7) || responseHistoryConnectionModel.actorId != null) {
            dVar.v(fVar, 7, h1.f64699a, responseHistoryConnectionModel.actorId);
        }
        dVar.f(fVar, 8, responseHistoryConnectionModel.command);
        if (dVar.E(fVar, 9) || responseHistoryConnectionModel.protocol != null) {
            dVar.v(fVar, 9, r.f78184b, responseHistoryConnectionModel.protocol);
        }
        if (!dVar.E(fVar, 10) && responseHistoryConnectionModel.encryptedWith == null) {
            return;
        }
        dVar.v(fVar, 10, h1.f64699a, responseHistoryConnectionModel.encryptedWith);
    }

    public final long component1() {
        return this.f39049id;
    }

    public final SessionLogProtocol component10() {
        return this.protocol;
    }

    public final Long component11() {
        return this.encryptedWith;
    }

    public final Long component2() {
        return this.localId;
    }

    public final HistoryConnectionDeviceInfo component3() {
        return this.device;
    }

    public final HistoryHostInfo component4() {
        return this.host;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final String component7() {
        return this.timestamp;
    }

    public final Long component8() {
        return this.actorId;
    }

    public final String component9() {
        return this.command;
    }

    public final ResponseHistoryConnectionModel copy(long j10, Long l10, HistoryConnectionDeviceInfo historyConnectionDeviceInfo, HistoryHostInfo historyHostInfo, String str, String str2, String str3, Long l11, String str4, SessionLogProtocol sessionLogProtocol, Long l12) {
        t.f(historyConnectionDeviceInfo, "device");
        t.f(str, "updatedAt");
        t.f(str2, "createdAt");
        t.f(str3, "timestamp");
        t.f(str4, Column.COMMAND);
        return new ResponseHistoryConnectionModel(j10, l10, historyConnectionDeviceInfo, historyHostInfo, str, str2, str3, l11, str4, sessionLogProtocol, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseHistoryConnectionModel)) {
            return false;
        }
        ResponseHistoryConnectionModel responseHistoryConnectionModel = (ResponseHistoryConnectionModel) obj;
        return this.f39049id == responseHistoryConnectionModel.f39049id && t.b(this.localId, responseHistoryConnectionModel.localId) && t.b(this.device, responseHistoryConnectionModel.device) && t.b(this.host, responseHistoryConnectionModel.host) && t.b(this.updatedAt, responseHistoryConnectionModel.updatedAt) && t.b(this.createdAt, responseHistoryConnectionModel.createdAt) && t.b(this.timestamp, responseHistoryConnectionModel.timestamp) && t.b(this.actorId, responseHistoryConnectionModel.actorId) && t.b(this.command, responseHistoryConnectionModel.command) && this.protocol == responseHistoryConnectionModel.protocol && t.b(this.encryptedWith, responseHistoryConnectionModel.encryptedWith);
    }

    public final Long getActorId() {
        return this.actorId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final HistoryConnectionDeviceInfo getDevice() {
        return this.device;
    }

    public final Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final HistoryHostInfo getHost() {
        return this.host;
    }

    public final long getId() {
        return this.f39049id;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final SessionLogProtocol getProtocol() {
        return this.protocol;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f39049id) * 31;
        Long l10 = this.localId;
        int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.device.hashCode()) * 31;
        HistoryHostInfo historyHostInfo = this.host;
        int iHashCode3 = (((((((iHashCode2 + (historyHostInfo == null ? 0 : historyHostInfo.hashCode())) * 31) + this.updatedAt.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.timestamp.hashCode()) * 31;
        Long l11 = this.actorId;
        int iHashCode4 = (((iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31) + this.command.hashCode()) * 31;
        SessionLogProtocol sessionLogProtocol = this.protocol;
        int iHashCode5 = (iHashCode4 + (sessionLogProtocol == null ? 0 : sessionLogProtocol.hashCode())) * 31;
        Long l12 = this.encryptedWith;
        return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "ResponseHistoryConnectionModel(id=" + this.f39049id + ", localId=" + this.localId + ", device=" + this.device + ", host=" + this.host + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", timestamp=" + this.timestamp + ", actorId=" + this.actorId + ", command=" + this.command + ", protocol=" + this.protocol + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public ResponseHistoryConnectionModel(long j10, Long l10, HistoryConnectionDeviceInfo historyConnectionDeviceInfo, HistoryHostInfo historyHostInfo, String str, String str2, String str3, Long l11, String str4, SessionLogProtocol sessionLogProtocol, Long l12) {
        t.f(historyConnectionDeviceInfo, "device");
        t.f(str, "updatedAt");
        t.f(str2, "createdAt");
        t.f(str3, "timestamp");
        t.f(str4, Column.COMMAND);
        this.f39049id = j10;
        this.localId = l10;
        this.device = historyConnectionDeviceInfo;
        this.host = historyHostInfo;
        this.updatedAt = str;
        this.createdAt = str2;
        this.timestamp = str3;
        this.actorId = l11;
        this.command = str4;
        this.protocol = sessionLogProtocol;
        this.encryptedWith = l12;
    }

    public /* synthetic */ ResponseHistoryConnectionModel(long j10, Long l10, HistoryConnectionDeviceInfo historyConnectionDeviceInfo, HistoryHostInfo historyHostInfo, String str, String str2, String str3, Long l11, String str4, SessionLogProtocol sessionLogProtocol, Long l12, int i10, k kVar) {
        this(j10, (i10 & 2) != 0 ? null : l10, historyConnectionDeviceInfo, (i10 & 8) != 0 ? null : historyHostInfo, str, str2, str3, (i10 & 128) != 0 ? null : l11, str4, (i10 & File.FLAG_O_TRUNC) != 0 ? null : sessionLogProtocol, (i10 & File.FLAG_O_APPEND) != 0 ? null : l12);
    }
}
