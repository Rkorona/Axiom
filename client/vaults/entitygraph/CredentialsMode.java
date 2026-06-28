package com.server.auditor.ssh.client.vaults.entitygraph;

import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CredentialsMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CredentialsMode[] $VALUES;
    private final String value;
    public static final CredentialsMode ShareCredentials = new CredentialsMode("ShareCredentials", 0, "credentials_sharing");
    public static final CredentialsMode DoNotShareCredentials = new CredentialsMode("DoNotShareCredentials", 1, "no_credentials_sharing");
    public static final CredentialsMode Multikey = new CredentialsMode("Multikey", 2, "multikey");

    private static final /* synthetic */ CredentialsMode[] $values() {
        return new CredentialsMode[]{ShareCredentials, DoNotShareCredentials, Multikey};
    }

    static {
        CredentialsMode[] credentialsModeArr$values = $values();
        $VALUES = credentialsModeArr$values;
        $ENTRIES = b.a(credentialsModeArr$values);
    }

    private CredentialsMode(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CredentialsMode valueOf(String str) {
        return (CredentialsMode) Enum.valueOf(CredentialsMode.class, str);
    }

    public static CredentialsMode[] values() {
        return (CredentialsMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
