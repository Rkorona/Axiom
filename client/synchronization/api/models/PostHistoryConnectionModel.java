package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.h1;
import lv.s2;
import so.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PostHistoryConnectionModel {

    @gg.a
    public String command;
    private final Long encryptedWith;
    private final Long hostRemoteId;
    private final long localId;
    private final SessionLogProtocol protocol;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return PostHistoryConnectionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ PostHistoryConnectionModel(int i10, long j10, Long l10, String str, String str2, Long l11, SessionLogProtocol sessionLogProtocol, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, PostHistoryConnectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.localId = j10;
        this.hostRemoteId = l10;
        this.command = str;
        this.timestamp = str2;
        this.encryptedWith = l11;
        this.protocol = sessionLogProtocol;
    }

    public static /* synthetic */ PostHistoryConnectionModel copy$default(PostHistoryConnectionModel postHistoryConnectionModel, long j10, Long l10, String str, String str2, Long l11, SessionLogProtocol sessionLogProtocol, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = postHistoryConnectionModel.localId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            l10 = postHistoryConnectionModel.hostRemoteId;
        }
        Long l12 = l10;
        if ((i10 & 4) != 0) {
            str = postHistoryConnectionModel.command;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = postHistoryConnectionModel.timestamp;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            l11 = postHistoryConnectionModel.encryptedWith;
        }
        Long l13 = l11;
        if ((i10 & 32) != 0) {
            sessionLogProtocol = postHistoryConnectionModel.protocol;
        }
        return postHistoryConnectionModel.copy(j11, l12, str3, str4, l13, sessionLogProtocol);
    }

    @o(Column.COMMAND)
    public static /* synthetic */ void getCommand$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("host")
    public static /* synthetic */ void getHostRemoteId$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PostHistoryConnectionModel postHistoryConnectionModel, kv.d dVar, jv.f fVar) {
        dVar.q(fVar, 0, postHistoryConnectionModel.localId);
        h1 h1Var = h1.f64699a;
        dVar.v(fVar, 1, h1Var, postHistoryConnectionModel.hostRemoteId);
        dVar.f(fVar, 2, postHistoryConnectionModel.command);
        dVar.f(fVar, 3, postHistoryConnectionModel.timestamp);
        dVar.v(fVar, 4, h1Var, postHistoryConnectionModel.encryptedWith);
        dVar.v(fVar, 5, r.f78184b, postHistoryConnectionModel.protocol);
    }

    public final long component1() {
        return this.localId;
    }

    public final Long component2() {
        return this.hostRemoteId;
    }

    public final String component3() {
        return this.command;
    }

    public final String component4() {
        return this.timestamp;
    }

    public final Long component5() {
        return this.encryptedWith;
    }

    public final SessionLogProtocol component6() {
        return this.protocol;
    }

    public final PostHistoryConnectionModel copy(long j10, Long l10, String str, String str2, Long l11, SessionLogProtocol sessionLogProtocol) {
        t.f(str, Column.COMMAND);
        t.f(str2, "timestamp");
        return new PostHistoryConnectionModel(j10, l10, str, str2, l11, sessionLogProtocol);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostHistoryConnectionModel)) {
            return false;
        }
        PostHistoryConnectionModel postHistoryConnectionModel = (PostHistoryConnectionModel) obj;
        return this.localId == postHistoryConnectionModel.localId && t.b(this.hostRemoteId, postHistoryConnectionModel.hostRemoteId) && t.b(this.command, postHistoryConnectionModel.command) && t.b(this.timestamp, postHistoryConnectionModel.timestamp) && t.b(this.encryptedWith, postHistoryConnectionModel.encryptedWith) && this.protocol == postHistoryConnectionModel.protocol;
    }

    public final Long getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Long getHostRemoteId() {
        return this.hostRemoteId;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final SessionLogProtocol getProtocol() {
        return this.protocol;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.localId) * 31;
        Long l10 = this.hostRemoteId;
        int iHashCode2 = (((((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.command.hashCode()) * 31) + this.timestamp.hashCode()) * 31;
        Long l11 = this.encryptedWith;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        SessionLogProtocol sessionLogProtocol = this.protocol;
        return iHashCode3 + (sessionLogProtocol != null ? sessionLogProtocol.hashCode() : 0);
    }

    public String toString() {
        return "PostHistoryConnectionModel(localId=" + this.localId + ", hostRemoteId=" + this.hostRemoteId + ", command=" + this.command + ", timestamp=" + this.timestamp + ", encryptedWith=" + this.encryptedWith + ", protocol=" + this.protocol + ")";
    }

    public PostHistoryConnectionModel(long j10, Long l10, String str, String str2, Long l11, SessionLogProtocol sessionLogProtocol) {
        t.f(str, Column.COMMAND);
        t.f(str2, "timestamp");
        this.localId = j10;
        this.hostRemoteId = l10;
        this.command = str;
        this.timestamp = str2;
        this.encryptedWith = l11;
        this.protocol = sessionLogProtocol;
    }
}
