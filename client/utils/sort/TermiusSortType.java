package com.server.auditor.ssh.client.utils.sort;

import bu.a;
import bu.b;
import com.server.auditor.ssh.client.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class TermiusSortType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TermiusSortType[] $VALUES;
    private final int iconId;
    private final int textId;
    public static final TermiusSortType ByNameAscending = new TermiusSortType("ByNameAscending", 0, R.drawable.sort_icon_a_z, R.string.sort_type_a_to_z);
    public static final TermiusSortType ByNameDescending = new TermiusSortType("ByNameDescending", 1, R.drawable.sort_icon_z_a, R.string.sort_type_z_to_a);
    public static final TermiusSortType ByDateDescending = new TermiusSortType("ByDateDescending", 2, R.drawable.sort_icon_new_old, R.string.sort_type_new_to_old);
    public static final TermiusSortType ByDateAscending = new TermiusSortType("ByDateAscending", 3, R.drawable.sort_icon_old_new, R.string.sort_type_old_to_new);

    private static final /* synthetic */ TermiusSortType[] $values() {
        return new TermiusSortType[]{ByNameAscending, ByNameDescending, ByDateDescending, ByDateAscending};
    }

    static {
        TermiusSortType[] termiusSortTypeArr$values = $values();
        $VALUES = termiusSortTypeArr$values;
        $ENTRIES = b.a(termiusSortTypeArr$values);
    }

    private TermiusSortType(String str, int i10, int i11, int i12) {
        this.iconId = i11;
        this.textId = i12;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TermiusSortType valueOf(String str) {
        return (TermiusSortType) Enum.valueOf(TermiusSortType.class, str);
    }

    public static TermiusSortType[] values() {
        return (TermiusSortType[]) $VALUES.clone();
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final int getTextId() {
        return this.textId;
    }
}
