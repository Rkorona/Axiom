package com.server.auditor.ssh.client.utils.analytics;

import androidx.annotation.Keep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HostCreationOriginVariant {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ HostCreationOriginVariant[] $VALUES;
    public static final HostCreationOriginVariant CONNECTIONS_SCREEN = new HostCreationOriginVariant("CONNECTIONS_SCREEN", 0);
    public static final HostCreationOriginVariant HOSTS_SCREEN = new HostCreationOriginVariant("HOSTS_SCREEN", 1);

    private static final /* synthetic */ HostCreationOriginVariant[] $values() {
        return new HostCreationOriginVariant[]{CONNECTIONS_SCREEN, HOSTS_SCREEN};
    }

    static {
        HostCreationOriginVariant[] hostCreationOriginVariantArr$values = $values();
        $VALUES = hostCreationOriginVariantArr$values;
        $ENTRIES = bu.b.a(hostCreationOriginVariantArr$values);
    }

    private HostCreationOriginVariant(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static HostCreationOriginVariant valueOf(String str) {
        return (HostCreationOriginVariant) Enum.valueOf(HostCreationOriginVariant.class, str);
    }

    public static HostCreationOriginVariant[] values() {
        return (HostCreationOriginVariant[]) $VALUES.clone();
    }
}
