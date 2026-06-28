package com.server.auditor.ssh.client.ui.sshid.data.local;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.SshAuthKeyPair;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HardwarePasskeyFullData {
    public static final int $stable = 8;
    private final SshAuthKeyPair sshAuthKeyPair;

    public HardwarePasskeyFullData(SshAuthKeyPair sshAuthKeyPair) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        this.sshAuthKeyPair = sshAuthKeyPair;
    }

    public static /* synthetic */ HardwarePasskeyFullData copy$default(HardwarePasskeyFullData hardwarePasskeyFullData, SshAuthKeyPair sshAuthKeyPair, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sshAuthKeyPair = hardwarePasskeyFullData.sshAuthKeyPair;
        }
        return hardwarePasskeyFullData.copy(sshAuthKeyPair);
    }

    public final SshAuthKeyPair component1() {
        return this.sshAuthKeyPair;
    }

    public final HardwarePasskeyFullData copy(SshAuthKeyPair sshAuthKeyPair) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        return new HardwarePasskeyFullData(sshAuthKeyPair);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HardwarePasskeyFullData) && t.b(this.sshAuthKeyPair, ((HardwarePasskeyFullData) obj).sshAuthKeyPair);
    }

    public final SshAuthKeyPair getSshAuthKeyPair() {
        return this.sshAuthKeyPair;
    }

    public int hashCode() {
        return this.sshAuthKeyPair.hashCode();
    }

    public String toString() {
        return "HardwarePasskeyFullData(sshAuthKeyPair=" + this.sshAuthKeyPair + ")";
    }
}
