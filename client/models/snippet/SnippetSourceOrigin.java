package com.server.auditor.ssh.client.models.snippet;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class SnippetSourceOrigin {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnippetSourceOrigin[] $VALUES;
    public static final SnippetSourceOrigin STARTUP = new SnippetSourceOrigin("STARTUP", 0);
    public static final SnippetSourceOrigin AUTOCOMPLETE = new SnippetSourceOrigin("AUTOCOMPLETE", 1);
    public static final SnippetSourceOrigin SNIPPETS_SCREEN = new SnippetSourceOrigin("SNIPPETS_SCREEN", 2);
    public static final SnippetSourceOrigin SNIPPETS_PANEL = new SnippetSourceOrigin("SNIPPETS_PANEL", 3);
    public static final SnippetSourceOrigin TERMINAL_HISTORY = new SnippetSourceOrigin("TERMINAL_HISTORY", 4);

    private static final /* synthetic */ SnippetSourceOrigin[] $values() {
        return new SnippetSourceOrigin[]{STARTUP, AUTOCOMPLETE, SNIPPETS_SCREEN, SNIPPETS_PANEL, TERMINAL_HISTORY};
    }

    static {
        SnippetSourceOrigin[] snippetSourceOriginArr$values = $values();
        $VALUES = snippetSourceOriginArr$values;
        $ENTRIES = b.a(snippetSourceOriginArr$values);
    }

    private SnippetSourceOrigin(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SnippetSourceOrigin valueOf(String str) {
        return (SnippetSourceOrigin) Enum.valueOf(SnippetSourceOrigin.class, str);
    }

    public static SnippetSourceOrigin[] values() {
        return (SnippetSourceOrigin[]) $VALUES.clone();
    }
}
