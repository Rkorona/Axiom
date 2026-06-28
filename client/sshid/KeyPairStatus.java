package com.server.auditor.ssh.client.sshid;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class KeyPairStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KeyPairStatus[] $VALUES;
    public static final KeyPairStatus READY_TO_USE = new KeyPairStatus("READY_TO_USE", 0);
    public static final KeyPairStatus SKIPPED = new KeyPairStatus("SKIPPED", 1);
    public static final KeyPairStatus FAILED = new KeyPairStatus("FAILED", 2);

    private static final /* synthetic */ KeyPairStatus[] $values() {
        return new KeyPairStatus[]{READY_TO_USE, SKIPPED, FAILED};
    }

    static {
        KeyPairStatus[] keyPairStatusArr$values = $values();
        $VALUES = keyPairStatusArr$values;
        $ENTRIES = b.a(keyPairStatusArr$values);
    }

    private KeyPairStatus(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static KeyPairStatus valueOf(String str) {
        return (KeyPairStatus) Enum.valueOf(KeyPairStatus.class, str);
    }

    public static KeyPairStatus[] values() {
        return (KeyPairStatus[]) $VALUES.clone();
    }
}
