package com.server.auditor.ssh.client.navigation.ui.compose.components;

import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BellState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BellState[] $VALUES;
    public static final BellState HIDDEN = new BellState("HIDDEN", 0);
    public static final BellState VISIBLE = new BellState("VISIBLE", 1);
    public static final BellState MEDIUM = new BellState("MEDIUM", 2);
    public static final BellState CRITICAL = new BellState("CRITICAL", 3);

    private static final /* synthetic */ BellState[] $values() {
        return new BellState[]{HIDDEN, VISIBLE, MEDIUM, CRITICAL};
    }

    static {
        BellState[] bellStateArr$values = $values();
        $VALUES = bellStateArr$values;
        $ENTRIES = b.a(bellStateArr$values);
    }

    private BellState(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static BellState valueOf(String str) {
        return (BellState) Enum.valueOf(BellState.class, str);
    }

    public static BellState[] values() {
        return (BellState[]) $VALUES.clone();
    }
}
