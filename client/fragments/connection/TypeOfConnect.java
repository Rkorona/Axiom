package com.server.auditor.ssh.client.fragments.connection;

import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeOfConnect {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ TypeOfConnect[] $VALUES;
    public static final TypeOfConnect Terminal = new TypeOfConnect("Terminal", 0);
    public static final TypeOfConnect SFTP = new TypeOfConnect(LibTermiusSshClient.SFTP_TAG, 1);

    private static final /* synthetic */ TypeOfConnect[] $values() {
        return new TypeOfConnect[]{Terminal, SFTP};
    }

    static {
        TypeOfConnect[] typeOfConnectArr$values = $values();
        $VALUES = typeOfConnectArr$values;
        $ENTRIES = bu.b.a(typeOfConnectArr$values);
    }

    private TypeOfConnect(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static TypeOfConnect valueOf(String str) {
        return (TypeOfConnect) Enum.valueOf(TypeOfConnect.class, str);
    }

    public static TypeOfConnect[] values() {
        return (TypeOfConnect[]) $VALUES.clone();
    }
}
