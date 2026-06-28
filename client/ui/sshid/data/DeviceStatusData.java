package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import com.server.auditor.ssh.client.ui.sshid.data.enums.DeviceStatus;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class DeviceStatusData {
    public static final int $stable = 8;
    private final long deviceId;
    private final String name;
    private DeviceStatus status;
    private final UserDeviceType type;

    public DeviceStatusData(UserDeviceType userDeviceType, String str, DeviceStatus deviceStatus, long j10) {
        t.f(userDeviceType, Column.TYPE);
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(deviceStatus, Column.STATUS);
        this.type = userDeviceType;
        this.name = str;
        this.status = deviceStatus;
        this.deviceId = j10;
    }

    public static /* synthetic */ DeviceStatusData copy$default(DeviceStatusData deviceStatusData, UserDeviceType userDeviceType, String str, DeviceStatus deviceStatus, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userDeviceType = deviceStatusData.type;
        }
        if ((i10 & 2) != 0) {
            str = deviceStatusData.name;
        }
        if ((i10 & 4) != 0) {
            deviceStatus = deviceStatusData.status;
        }
        if ((i10 & 8) != 0) {
            j10 = deviceStatusData.deviceId;
        }
        DeviceStatus deviceStatus2 = deviceStatus;
        return deviceStatusData.copy(userDeviceType, str, deviceStatus2, j10);
    }

    public final UserDeviceType component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final DeviceStatus component3() {
        return this.status;
    }

    public final long component4() {
        return this.deviceId;
    }

    public final DeviceStatusData copy(UserDeviceType userDeviceType, String str, DeviceStatus deviceStatus, long j10) {
        t.f(userDeviceType, Column.TYPE);
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(deviceStatus, Column.STATUS);
        return new DeviceStatusData(userDeviceType, str, deviceStatus, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceStatusData)) {
            return false;
        }
        DeviceStatusData deviceStatusData = (DeviceStatusData) obj;
        return this.type == deviceStatusData.type && t.b(this.name, deviceStatusData.name) && this.status == deviceStatusData.status && this.deviceId == deviceStatusData.deviceId;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final String getName() {
        return this.name;
    }

    public final DeviceStatus getStatus() {
        return this.status;
    }

    public final UserDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.deviceId);
    }

    public final void setStatus(DeviceStatus deviceStatus) {
        t.f(deviceStatus, "<set-?>");
        this.status = deviceStatus;
    }

    public String toString() {
        return "DeviceStatusData(type=" + this.type + ", name=" + this.name + ", status=" + this.status + ", deviceId=" + this.deviceId + ")";
    }
}
