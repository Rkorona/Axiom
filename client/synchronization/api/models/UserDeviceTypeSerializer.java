package com.server.auditor.ssh.client.synchronization.api.models;

import tp.q;

/* JADX INFO: loaded from: classes4.dex */
public final class UserDeviceTypeSerializer extends q {
    public static final UserDeviceTypeSerializer INSTANCE = new UserDeviceTypeSerializer();
    public static final int $stable = 8;

    private UserDeviceTypeSerializer() {
        super((Enum[]) UserDeviceType.getEntries().toArray(new UserDeviceType[0]), UserDeviceType.UNKNOWN);
    }
}
