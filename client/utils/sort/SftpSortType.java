package com.server.auditor.ssh.client.utils.sort;

import bu.a;
import bu.b;
import com.server.auditor.ssh.client.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class SftpSortType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SftpSortType[] $VALUES;
    private final int iconId;
    public static final SftpSortType ByNameAscending = new SftpSortType("ByNameAscending", 0, R.drawable.sort_icon_a_z);
    public static final SftpSortType ByNameDescending = new SftpSortType("ByNameDescending", 1, R.drawable.sort_icon_z_a);
    public static final SftpSortType ByDateOldestToNewest = new SftpSortType("ByDateOldestToNewest", 2, R.drawable.sort_icon_new_old);
    public static final SftpSortType ByDateNewestToOldest = new SftpSortType("ByDateNewestToOldest", 3, R.drawable.sort_icon_old_new);
    public static final SftpSortType BySizeSmallestToLargest = new SftpSortType("BySizeSmallestToLargest", 4, R.drawable.sort_icon_big_small);
    public static final SftpSortType BySizeLargestToSmallest = new SftpSortType("BySizeLargestToSmallest", 5, R.drawable.sort_icon_big_small);
    public static final SftpSortType ByKindAscending = new SftpSortType("ByKindAscending", 6, R.drawable.sort_icon_kind);
    public static final SftpSortType ByKindDescending = new SftpSortType("ByKindDescending", 7, R.drawable.sort_icon_kind);

    private static final /* synthetic */ SftpSortType[] $values() {
        return new SftpSortType[]{ByNameAscending, ByNameDescending, ByDateOldestToNewest, ByDateNewestToOldest, BySizeSmallestToLargest, BySizeLargestToSmallest, ByKindAscending, ByKindDescending};
    }

    static {
        SftpSortType[] sftpSortTypeArr$values = $values();
        $VALUES = sftpSortTypeArr$values;
        $ENTRIES = b.a(sftpSortTypeArr$values);
    }

    private SftpSortType(String str, int i10, int i11) {
        this.iconId = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SftpSortType valueOf(String str) {
        return (SftpSortType) Enum.valueOf(SftpSortType.class, str);
    }

    public static SftpSortType[] values() {
        return (SftpSortType[]) $VALUES.clone();
    }

    public final int getIconId() {
        return this.iconId;
    }
}
