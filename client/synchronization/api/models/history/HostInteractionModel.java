package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HostInteractionModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long hostId;
    private final String lastInteractedAt;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HostInteractionModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ HostInteractionModel(int i10, long j10, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, HostInteractionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.hostId = j10;
        this.lastInteractedAt = str;
    }

    public static /* synthetic */ HostInteractionModel copy$default(HostInteractionModel hostInteractionModel, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = hostInteractionModel.hostId;
        }
        if ((i10 & 2) != 0) {
            str = hostInteractionModel.lastInteractedAt;
        }
        return hostInteractionModel.copy(j10, str);
    }

    @o("host")
    public static /* synthetic */ void getHostId$annotations() {
    }

    @o("last_interacted_at")
    public static /* synthetic */ void getLastInteractedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HostInteractionModel hostInteractionModel, d dVar, f fVar) {
        dVar.q(fVar, 0, hostInteractionModel.hostId);
        dVar.f(fVar, 1, hostInteractionModel.lastInteractedAt);
    }

    public final long component1() {
        return this.hostId;
    }

    public final String component2() {
        return this.lastInteractedAt;
    }

    public final HostInteractionModel copy(long j10, String str) {
        t.f(str, "lastInteractedAt");
        return new HostInteractionModel(j10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostInteractionModel)) {
            return false;
        }
        HostInteractionModel hostInteractionModel = (HostInteractionModel) obj;
        return this.hostId == hostInteractionModel.hostId && t.b(this.lastInteractedAt, hostInteractionModel.lastInteractedAt);
    }

    public final long getHostId() {
        return this.hostId;
    }

    public final String getLastInteractedAt() {
        return this.lastInteractedAt;
    }

    public int hashCode() {
        return (Long.hashCode(this.hostId) * 31) + this.lastInteractedAt.hashCode();
    }

    public String toString() {
        return "HostInteractionModel(hostId=" + this.hostId + ", lastInteractedAt=" + this.lastInteractedAt + ")";
    }

    public HostInteractionModel(long j10, String str) {
        t.f(str, "lastInteractedAt");
        this.hostId = j10;
        this.lastInteractedAt = str;
    }
}
