package com.server.auditor.ssh.client.sshid;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.SshAuthKeyPair;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SshIdAuthData {
    public static final int $stable = 8;
    private final boolean isSshId;
    private KeyPairStatus keyPairStatus;
    private final KeyPairType keyPairType;
    private final String keyType;
    private final SshAuthKeyPair sshAuthKeyPair;
    private final String uuid;

    public SshIdAuthData(SshAuthKeyPair sshAuthKeyPair, KeyPairType keyPairType, String str, String str2, KeyPairStatus keyPairStatus, boolean z10) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        t.f(keyPairType, "keyPairType");
        t.f(str, "uuid");
        t.f(str2, "keyType");
        t.f(keyPairStatus, "keyPairStatus");
        this.sshAuthKeyPair = sshAuthKeyPair;
        this.keyPairType = keyPairType;
        this.uuid = str;
        this.keyType = str2;
        this.keyPairStatus = keyPairStatus;
        this.isSshId = z10;
    }

    public static /* synthetic */ SshIdAuthData copy$default(SshIdAuthData sshIdAuthData, SshAuthKeyPair sshAuthKeyPair, KeyPairType keyPairType, String str, String str2, KeyPairStatus keyPairStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sshAuthKeyPair = sshIdAuthData.sshAuthKeyPair;
        }
        if ((i10 & 2) != 0) {
            keyPairType = sshIdAuthData.keyPairType;
        }
        if ((i10 & 4) != 0) {
            str = sshIdAuthData.uuid;
        }
        if ((i10 & 8) != 0) {
            str2 = sshIdAuthData.keyType;
        }
        if ((i10 & 16) != 0) {
            keyPairStatus = sshIdAuthData.keyPairStatus;
        }
        if ((i10 & 32) != 0) {
            z10 = sshIdAuthData.isSshId;
        }
        KeyPairStatus keyPairStatus2 = keyPairStatus;
        boolean z11 = z10;
        return sshIdAuthData.copy(sshAuthKeyPair, keyPairType, str, str2, keyPairStatus2, z11);
    }

    public final SshAuthKeyPair component1() {
        return this.sshAuthKeyPair;
    }

    public final KeyPairType component2() {
        return this.keyPairType;
    }

    public final String component3() {
        return this.uuid;
    }

    public final String component4() {
        return this.keyType;
    }

    public final KeyPairStatus component5() {
        return this.keyPairStatus;
    }

    public final boolean component6() {
        return this.isSshId;
    }

    public final SshIdAuthData copy(SshAuthKeyPair sshAuthKeyPair, KeyPairType keyPairType, String str, String str2, KeyPairStatus keyPairStatus, boolean z10) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        t.f(keyPairType, "keyPairType");
        t.f(str, "uuid");
        t.f(str2, "keyType");
        t.f(keyPairStatus, "keyPairStatus");
        return new SshIdAuthData(sshAuthKeyPair, keyPairType, str, str2, keyPairStatus, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdAuthData)) {
            return false;
        }
        SshIdAuthData sshIdAuthData = (SshIdAuthData) obj;
        return t.b(this.sshAuthKeyPair, sshIdAuthData.sshAuthKeyPair) && this.keyPairType == sshIdAuthData.keyPairType && t.b(this.uuid, sshIdAuthData.uuid) && t.b(this.keyType, sshIdAuthData.keyType) && this.keyPairStatus == sshIdAuthData.keyPairStatus && this.isSshId == sshIdAuthData.isSshId;
    }

    public final KeyPairStatus getKeyPairStatus() {
        return this.keyPairStatus;
    }

    public final KeyPairType getKeyPairType() {
        return this.keyPairType;
    }

    public final String getKeyType() {
        return this.keyType;
    }

    public final SshAuthKeyPair getSshAuthKeyPair() {
        return this.sshAuthKeyPair;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((this.sshAuthKeyPair.hashCode() * 31) + this.keyPairType.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.keyType.hashCode()) * 31) + this.keyPairStatus.hashCode()) * 31) + Boolean.hashCode(this.isSshId);
    }

    public final boolean isSshId() {
        return this.isSshId;
    }

    public final void setKeyPairStatus(KeyPairStatus keyPairStatus) {
        t.f(keyPairStatus, "<set-?>");
        this.keyPairStatus = keyPairStatus;
    }

    public String toString() {
        return "SshIdAuthData(sshAuthKeyPair=" + this.sshAuthKeyPair + ", keyPairType=" + this.keyPairType + ", uuid=" + this.uuid + ", keyType=" + this.keyType + ", keyPairStatus=" + this.keyPairStatus + ", isSshId=" + this.isSshId + ")";
    }

    public /* synthetic */ SshIdAuthData(SshAuthKeyPair sshAuthKeyPair, KeyPairType keyPairType, String str, String str2, KeyPairStatus keyPairStatus, boolean z10, int i10, k kVar) {
        this(sshAuthKeyPair, keyPairType, str, str2, keyPairStatus, (i10 & 32) != 0 ? false : z10);
    }
}
