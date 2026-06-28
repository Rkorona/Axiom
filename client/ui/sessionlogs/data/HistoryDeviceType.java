package com.server.auditor.ssh.client.ui.sessionlogs.data;

import bu.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import so.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p(with = d.class)
public final class HistoryDeviceType {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ HistoryDeviceType[] $VALUES;
    public static final a Companion;

    @o("iPhone")
    public static final HistoryDeviceType IPHONE = new HistoryDeviceType("IPHONE", 0);

    @o("Google")
    public static final HistoryDeviceType GOOGLE = new HistoryDeviceType("GOOGLE", 1);

    @o("Desktop")
    public static final HistoryDeviceType DESKTOP = new HistoryDeviceType("DESKTOP", 2);

    @o("Unknown")
    public static final HistoryDeviceType UNKNOWN = new HistoryDeviceType("UNKNOWN", 3);

    public static final class a {
        private a() {
        }

        public final c serializer() {
            return d.f78128a;
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ HistoryDeviceType[] $values() {
        return new HistoryDeviceType[]{IPHONE, GOOGLE, DESKTOP, UNKNOWN};
    }

    static {
        HistoryDeviceType[] historyDeviceTypeArr$values = $values();
        $VALUES = historyDeviceTypeArr$values;
        $ENTRIES = b.a(historyDeviceTypeArr$values);
        Companion = new a(null);
    }

    private HistoryDeviceType(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static HistoryDeviceType valueOf(String str) {
        return (HistoryDeviceType) Enum.valueOf(HistoryDeviceType.class, str);
    }

    public static HistoryDeviceType[] values() {
        return (HistoryDeviceType[]) $VALUES.clone();
    }
}
