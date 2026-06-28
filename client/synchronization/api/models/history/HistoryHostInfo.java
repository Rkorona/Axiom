package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryHostInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39047id;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HistoryHostInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ HistoryHostInfo(int i10, long j10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, HistoryHostInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f39047id = j10;
    }

    public static /* synthetic */ HistoryHostInfo copy$default(HistoryHostInfo historyHostInfo, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = historyHostInfo.f39047id;
        }
        return historyHostInfo.copy(j10);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    public final long component1() {
        return this.f39047id;
    }

    public final HistoryHostInfo copy(long j10) {
        return new HistoryHostInfo(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HistoryHostInfo) && this.f39047id == ((HistoryHostInfo) obj).f39047id;
    }

    public final long getId() {
        return this.f39047id;
    }

    public int hashCode() {
        return Long.hashCode(this.f39047id);
    }

    public String toString() {
        return "HistoryHostInfo(id=" + this.f39047id + ")";
    }

    public HistoryHostInfo(long j10) {
        this.f39047id = j10;
    }
}
