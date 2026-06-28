package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryPostRemote {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39048id;
    private final long localId;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HistoryPostRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ HistoryPostRemote(int i10, long j10, long j11, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, HistoryPostRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f39048id = j10;
        this.localId = j11;
    }

    public static /* synthetic */ HistoryPostRemote copy$default(HistoryPostRemote historyPostRemote, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = historyPostRemote.f39048id;
        }
        if ((i10 & 2) != 0) {
            j11 = historyPostRemote.localId;
        }
        return historyPostRemote.copy(j10, j11);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryPostRemote historyPostRemote, d dVar, f fVar) {
        dVar.q(fVar, 0, historyPostRemote.f39048id);
        dVar.q(fVar, 1, historyPostRemote.localId);
    }

    public final long component1() {
        return this.f39048id;
    }

    public final long component2() {
        return this.localId;
    }

    public final HistoryPostRemote copy(long j10, long j11) {
        return new HistoryPostRemote(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryPostRemote)) {
            return false;
        }
        HistoryPostRemote historyPostRemote = (HistoryPostRemote) obj;
        return this.f39048id == historyPostRemote.f39048id && this.localId == historyPostRemote.localId;
    }

    public final long getId() {
        return this.f39048id;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public int hashCode() {
        return (Long.hashCode(this.f39048id) * 31) + Long.hashCode(this.localId);
    }

    public String toString() {
        return "HistoryPostRemote(id=" + this.f39048id + ", localId=" + this.localId + ")";
    }

    public HistoryPostRemote(long j10, long j11) {
        this.f39048id = j10;
        this.localId = j11;
    }
}
