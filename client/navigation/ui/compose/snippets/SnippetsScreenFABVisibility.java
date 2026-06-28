package com.server.auditor.ssh.client.navigation.ui.compose.snippets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SnippetsScreenFABVisibility {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SnippetsScreenFABVisibility[] $VALUES;
    public static final SnippetsScreenFABVisibility HIDDEN = new SnippetsScreenFABVisibility("HIDDEN", 0);
    public static final SnippetsScreenFABVisibility VISIBLE_ADD = new SnippetsScreenFABVisibility("VISIBLE_ADD", 1);
    public static final SnippetsScreenFABVisibility VISIBLE_RUN = new SnippetsScreenFABVisibility("VISIBLE_RUN", 2);

    private static final /* synthetic */ SnippetsScreenFABVisibility[] $values() {
        return new SnippetsScreenFABVisibility[]{HIDDEN, VISIBLE_ADD, VISIBLE_RUN};
    }

    static {
        SnippetsScreenFABVisibility[] snippetsScreenFABVisibilityArr$values = $values();
        $VALUES = snippetsScreenFABVisibilityArr$values;
        $ENTRIES = bu.b.a(snippetsScreenFABVisibilityArr$values);
    }

    private SnippetsScreenFABVisibility(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SnippetsScreenFABVisibility valueOf(String str) {
        return (SnippetsScreenFABVisibility) Enum.valueOf(SnippetsScreenFABVisibility.class, str);
    }

    public static SnippetsScreenFABVisibility[] values() {
        return (SnippetsScreenFABVisibility[]) $VALUES.clone();
    }
}
