package com.server.auditor.ssh.client.sshid;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.database.Column;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HardwareSshIdKeyData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39028id;
    private final String label;
    private final String publicKey;
    private KeyPairStatus status;

    public HardwareSshIdKeyData(long j10, String str, String str2, KeyPairStatus keyPairStatus) {
        t.f(str, "label");
        t.f(str2, Column.KEY_PUBLIC);
        t.f(keyPairStatus, Column.STATUS);
        this.f39028id = j10;
        this.label = str;
        this.publicKey = str2;
        this.status = keyPairStatus;
    }

    public static /* synthetic */ HardwareSshIdKeyData copy$default(HardwareSshIdKeyData hardwareSshIdKeyData, long j10, String str, String str2, KeyPairStatus keyPairStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = hardwareSshIdKeyData.f39028id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = hardwareSshIdKeyData.label;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = hardwareSshIdKeyData.publicKey;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            keyPairStatus = hardwareSshIdKeyData.status;
        }
        return hardwareSshIdKeyData.copy(j11, str3, str4, keyPairStatus);
    }

    public final long component1() {
        return this.f39028id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.publicKey;
    }

    public final KeyPairStatus component4() {
        return this.status;
    }

    public final HardwareSshIdKeyData copy(long j10, String str, String str2, KeyPairStatus keyPairStatus) {
        t.f(str, "label");
        t.f(str2, Column.KEY_PUBLIC);
        t.f(keyPairStatus, Column.STATUS);
        return new HardwareSshIdKeyData(j10, str, str2, keyPairStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HardwareSshIdKeyData)) {
            return false;
        }
        HardwareSshIdKeyData hardwareSshIdKeyData = (HardwareSshIdKeyData) obj;
        return this.f39028id == hardwareSshIdKeyData.f39028id && t.b(this.label, hardwareSshIdKeyData.label) && t.b(this.publicKey, hardwareSshIdKeyData.publicKey) && this.status == hardwareSshIdKeyData.status;
    }

    public final long getId() {
        return this.f39028id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final KeyPairStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f39028id) * 31) + this.label.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setStatus(KeyPairStatus keyPairStatus) {
        t.f(keyPairStatus, "<set-?>");
        this.status = keyPairStatus;
    }

    public String toString() {
        return "HardwareSshIdKeyData(id=" + this.f39028id + ", label=" + this.label + ", publicKey=" + this.publicKey + ", status=" + this.status + ")";
    }
}
