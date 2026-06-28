package com.server.auditor.ssh.client.ui.sshid.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ClearingStep {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ ClearingStep[] $VALUES;
    public static final ClearingStep RESET_SSHID_MODE = new ClearingStep("RESET_SSHID_MODE", 0);
    public static final ClearingStep CLEAR_TABLES = new ClearingStep("CLEAR_TABLES", 1);

    private static final /* synthetic */ ClearingStep[] $values() {
        return new ClearingStep[]{RESET_SSHID_MODE, CLEAR_TABLES};
    }

    static {
        ClearingStep[] clearingStepArr$values = $values();
        $VALUES = clearingStepArr$values;
        $ENTRIES = bu.b.a(clearingStepArr$values);
    }

    private ClearingStep(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static ClearingStep valueOf(String str) {
        return (ClearingStep) Enum.valueOf(ClearingStep.class, str);
    }

    public static ClearingStep[] values() {
        return (ClearingStep[]) $VALUES.clone();
    }
}
