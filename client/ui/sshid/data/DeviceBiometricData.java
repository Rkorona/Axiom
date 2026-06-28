package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class DeviceBiometricData {
    public static final int $stable = 8;
    private BiometricType biometricType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f40837id;
    private final String name;
    private final UserDeviceType type;

    public DeviceBiometricData(long j10, UserDeviceType userDeviceType, String str, BiometricType biometricType) {
        t.f(userDeviceType, Column.TYPE);
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(biometricType, "biometricType");
        this.f40837id = j10;
        this.type = userDeviceType;
        this.name = str;
        this.biometricType = biometricType;
    }

    public static /* synthetic */ DeviceBiometricData copy$default(DeviceBiometricData deviceBiometricData, long j10, UserDeviceType userDeviceType, String str, BiometricType biometricType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = deviceBiometricData.f40837id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            userDeviceType = deviceBiometricData.type;
        }
        UserDeviceType userDeviceType2 = userDeviceType;
        if ((i10 & 4) != 0) {
            str = deviceBiometricData.name;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            biometricType = deviceBiometricData.biometricType;
        }
        return deviceBiometricData.copy(j11, userDeviceType2, str2, biometricType);
    }

    public final long component1() {
        return this.f40837id;
    }

    public final UserDeviceType component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final BiometricType component4() {
        return this.biometricType;
    }

    public final DeviceBiometricData copy(long j10, UserDeviceType userDeviceType, String str, BiometricType biometricType) {
        t.f(userDeviceType, Column.TYPE);
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(biometricType, "biometricType");
        return new DeviceBiometricData(j10, userDeviceType, str, biometricType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceBiometricData)) {
            return false;
        }
        DeviceBiometricData deviceBiometricData = (DeviceBiometricData) obj;
        return this.f40837id == deviceBiometricData.f40837id && this.type == deviceBiometricData.type && t.b(this.name, deviceBiometricData.name) && this.biometricType == deviceBiometricData.biometricType;
    }

    public final BiometricType getBiometricType() {
        return this.biometricType;
    }

    public final long getId() {
        return this.f40837id;
    }

    public final String getName() {
        return this.name;
    }

    public final UserDeviceType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f40837id) * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31) + this.biometricType.hashCode();
    }

    public final void setBiometricType(BiometricType biometricType) {
        t.f(biometricType, "<set-?>");
        this.biometricType = biometricType;
    }

    public String toString() {
        return "DeviceBiometricData(id=" + this.f40837id + ", type=" + this.type + ", name=" + this.name + ", biometricType=" + this.biometricType + ")";
    }
}
