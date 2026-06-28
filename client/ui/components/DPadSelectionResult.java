package com.server.auditor.ssh.client.ui.components;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class DPadSelectionResult {
    public static final int $stable = 0;
    private final int anchorPosition;
    private final int selectionEnd;
    private final int selectionStart;

    public DPadSelectionResult(int i10, int i11, int i12) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
        this.anchorPosition = i12;
    }

    public static /* synthetic */ DPadSelectionResult copy$default(DPadSelectionResult dPadSelectionResult, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = dPadSelectionResult.selectionStart;
        }
        if ((i13 & 2) != 0) {
            i11 = dPadSelectionResult.selectionEnd;
        }
        if ((i13 & 4) != 0) {
            i12 = dPadSelectionResult.anchorPosition;
        }
        return dPadSelectionResult.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.selectionStart;
    }

    public final int component2() {
        return this.selectionEnd;
    }

    public final int component3() {
        return this.anchorPosition;
    }

    public final DPadSelectionResult copy(int i10, int i11, int i12) {
        return new DPadSelectionResult(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DPadSelectionResult)) {
            return false;
        }
        DPadSelectionResult dPadSelectionResult = (DPadSelectionResult) obj;
        return this.selectionStart == dPadSelectionResult.selectionStart && this.selectionEnd == dPadSelectionResult.selectionEnd && this.anchorPosition == dPadSelectionResult.anchorPosition;
    }

    public final int getAnchorPosition() {
        return this.anchorPosition;
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.selectionStart) * 31) + Integer.hashCode(this.selectionEnd)) * 31) + Integer.hashCode(this.anchorPosition);
    }

    public String toString() {
        return "DPadSelectionResult(selectionStart=" + this.selectionStart + ", selectionEnd=" + this.selectionEnd + ", anchorPosition=" + this.anchorPosition + ")";
    }
}
