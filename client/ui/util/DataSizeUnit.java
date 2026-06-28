package com.server.auditor.ssh.client.ui.util;

import android.support.v4.media.session.PlaybackStateCompat;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class DataSizeUnit {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DataSizeUnit[] $VALUES;
    private final long bytes;
    public static final DataSizeUnit BYTES = new DataSizeUnit("BYTES", 0, 1);
    public static final DataSizeUnit KB = new DataSizeUnit("KB", 1, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    public static final DataSizeUnit MB = new DataSizeUnit("MB", 2, 1048576);
    public static final DataSizeUnit GB = new DataSizeUnit("GB", 3, 1073741824);

    private static final /* synthetic */ DataSizeUnit[] $values() {
        return new DataSizeUnit[]{BYTES, KB, MB, GB};
    }

    static {
        DataSizeUnit[] dataSizeUnitArr$values = $values();
        $VALUES = dataSizeUnitArr$values;
        $ENTRIES = b.a(dataSizeUnitArr$values);
    }

    private DataSizeUnit(String str, int i10, long j10) {
        this.bytes = j10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DataSizeUnit valueOf(String str) {
        return (DataSizeUnit) Enum.valueOf(DataSizeUnit.class, str);
    }

    public static DataSizeUnit[] values() {
        return (DataSizeUnit[]) $VALUES.clone();
    }

    public final long getBytes() {
        return this.bytes;
    }
}
