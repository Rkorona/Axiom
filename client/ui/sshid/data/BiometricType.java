package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class BiometricType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BiometricType[] $VALUES;
    public static final BiometricType TOUCHID = new BiometricType("TOUCHID", 0);
    public static final BiometricType FACEID = new BiometricType("FACEID", 1);
    public static final BiometricType WINHELLO = new BiometricType("WINHELLO", 2);

    private static final /* synthetic */ BiometricType[] $values() {
        return new BiometricType[]{TOUCHID, FACEID, WINHELLO};
    }

    static {
        BiometricType[] biometricTypeArr$values = $values();
        $VALUES = biometricTypeArr$values;
        $ENTRIES = b.a(biometricTypeArr$values);
    }

    private BiometricType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static BiometricType valueOf(String str) {
        return (BiometricType) Enum.valueOf(BiometricType.class, str);
    }

    public static BiometricType[] values() {
        return (BiometricType[]) $VALUES.clone();
    }
}
