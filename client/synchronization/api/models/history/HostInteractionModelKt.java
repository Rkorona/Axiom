package com.server.auditor.ssh.client.synchronization.api.models.history;

import tl.t;

/* JADX INFO: loaded from: classes4.dex */
public final class HostInteractionModelKt {
    public static final t toDbModel(HostInteractionModel hostInteractionModel) {
        ju.t.f(hostInteractionModel, "<this>");
        return new t(hostInteractionModel.getHostId(), hostInteractionModel.getLastInteractedAt());
    }
}
