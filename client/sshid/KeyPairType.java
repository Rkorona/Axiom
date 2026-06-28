package com.server.auditor.ssh.client.sshid;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class KeyPairType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KeyPairType[] $VALUES;
    public static final KeyPairType SOFTWARE = new KeyPairType("SOFTWARE", 0);
    public static final KeyPairType HARDWARE = new KeyPairType("HARDWARE", 1);
    public static final KeyPairType BIOMETRIC = new KeyPairType("BIOMETRIC", 2);

    private static final /* synthetic */ KeyPairType[] $values() {
        return new KeyPairType[]{SOFTWARE, HARDWARE, BIOMETRIC};
    }

    static {
        KeyPairType[] keyPairTypeArr$values = $values();
        $VALUES = keyPairTypeArr$values;
        $ENTRIES = b.a(keyPairTypeArr$values);
    }

    private KeyPairType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static KeyPairType valueOf(String str) {
        return (KeyPairType) Enum.valueOf(KeyPairType.class, str);
    }

    public static KeyPairType[] values() {
        return (KeyPairType[]) $VALUES.clone();
    }
}
