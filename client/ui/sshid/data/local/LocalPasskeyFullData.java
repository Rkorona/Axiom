package com.server.auditor.ssh.client.ui.sshid.data.local;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.SshAuthKeyPair;
import com.server.auditor.ssh.client.database.Column;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class LocalPasskeyFullData {
    public static final int $stable = 8;
    private final String biometricAlias;
    private final SshAuthKeyPair sshAuthKeyPair;
    private final String type;

    public LocalPasskeyFullData(SshAuthKeyPair sshAuthKeyPair, String str, String str2) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        t.f(str, Column.TYPE);
        this.sshAuthKeyPair = sshAuthKeyPair;
        this.type = str;
        this.biometricAlias = str2;
    }

    public static /* synthetic */ LocalPasskeyFullData copy$default(LocalPasskeyFullData localPasskeyFullData, SshAuthKeyPair sshAuthKeyPair, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sshAuthKeyPair = localPasskeyFullData.sshAuthKeyPair;
        }
        if ((i10 & 2) != 0) {
            str = localPasskeyFullData.type;
        }
        if ((i10 & 4) != 0) {
            str2 = localPasskeyFullData.biometricAlias;
        }
        return localPasskeyFullData.copy(sshAuthKeyPair, str, str2);
    }

    public final SshAuthKeyPair component1() {
        return this.sshAuthKeyPair;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.biometricAlias;
    }

    public final LocalPasskeyFullData copy(SshAuthKeyPair sshAuthKeyPair, String str, String str2) {
        t.f(sshAuthKeyPair, "sshAuthKeyPair");
        t.f(str, Column.TYPE);
        return new LocalPasskeyFullData(sshAuthKeyPair, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPasskeyFullData)) {
            return false;
        }
        LocalPasskeyFullData localPasskeyFullData = (LocalPasskeyFullData) obj;
        return t.b(this.sshAuthKeyPair, localPasskeyFullData.sshAuthKeyPair) && t.b(this.type, localPasskeyFullData.type) && t.b(this.biometricAlias, localPasskeyFullData.biometricAlias);
    }

    public final String getBiometricAlias() {
        return this.biometricAlias;
    }

    public final SshAuthKeyPair getSshAuthKeyPair() {
        return this.sshAuthKeyPair;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.sshAuthKeyPair.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.biometricAlias;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocalPasskeyFullData(sshAuthKeyPair=" + this.sshAuthKeyPair + ", type=" + this.type + ", biometricAlias=" + this.biometricAlias + ")";
    }
}
