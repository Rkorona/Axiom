package com.server.auditor.ssh.client.fragments.hostngroups;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class DisplaySide {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ DisplaySide[] $VALUES;
    private final int viewFlipperChildIndex;
    public static final DisplaySide FRONT = new DisplaySide("FRONT", 0, 0);
    public static final DisplaySide BACK = new DisplaySide("BACK", 1, 1);

    private static final /* synthetic */ DisplaySide[] $values() {
        return new DisplaySide[]{FRONT, BACK};
    }

    static {
        DisplaySide[] displaySideArr$values = $values();
        $VALUES = displaySideArr$values;
        $ENTRIES = bu.b.a(displaySideArr$values);
    }

    private DisplaySide(String str, int i10, int i11) {
        this.viewFlipperChildIndex = i11;
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static DisplaySide valueOf(String str) {
        return (DisplaySide) Enum.valueOf(DisplaySide.class, str);
    }

    public static DisplaySide[] values() {
        return (DisplaySide[]) $VALUES.clone();
    }

    public final int getViewFlipperChildIndex() {
        return this.viewFlipperChildIndex;
    }
}
