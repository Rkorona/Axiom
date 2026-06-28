package com.server.auditor.ssh.client.ui.sshid.data.enums;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class DeviceStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DeviceStatus[] $VALUES;
    public static final DeviceStatus READY = new DeviceStatus("READY", 0);
    public static final DeviceStatus GENERATING = new DeviceStatus("GENERATING", 1);
    public static final DeviceStatus GENERATE_SUCCESS_MESSAGE = new DeviceStatus("GENERATE_SUCCESS_MESSAGE", 2);
    public static final DeviceStatus GENERATE_ERROR_MESSAGE = new DeviceStatus("GENERATE_ERROR_MESSAGE", 3);
    public static final DeviceStatus WAITING_FOR_COMPLETING = new DeviceStatus("WAITING_FOR_COMPLETING", 4);
    public static final DeviceStatus WAITING_FOR_MAIN_DEVICE = new DeviceStatus("WAITING_FOR_MAIN_DEVICE", 5);
    public static final DeviceStatus LOGOUT_IS_IN_PROGRESS = new DeviceStatus("LOGOUT_IS_IN_PROGRESS", 6);
    public static final DeviceStatus RETRY_GENERATION = new DeviceStatus("RETRY_GENERATION", 7);

    private static final /* synthetic */ DeviceStatus[] $values() {
        return new DeviceStatus[]{READY, GENERATING, GENERATE_SUCCESS_MESSAGE, GENERATE_ERROR_MESSAGE, WAITING_FOR_COMPLETING, WAITING_FOR_MAIN_DEVICE, LOGOUT_IS_IN_PROGRESS, RETRY_GENERATION};
    }

    static {
        DeviceStatus[] deviceStatusArr$values = $values();
        $VALUES = deviceStatusArr$values;
        $ENTRIES = b.a(deviceStatusArr$values);
    }

    private DeviceStatus(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DeviceStatus valueOf(String str) {
        return (DeviceStatus) Enum.valueOf(DeviceStatus.class, str);
    }

    public static DeviceStatus[] values() {
        return (DeviceStatus[]) $VALUES.clone();
    }
}
