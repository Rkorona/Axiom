package com.server.auditor.ssh.client.ui.auth.base.data;

import hv.c;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PasswordStrengthState {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String error;
    private final boolean isAllowContinuing;
    private final boolean isCheckingPassword;
    private final boolean showCheckPassword;
    private final boolean showCheckingHint;
    private final int strengthScore;
    private final String suggestion;
    private final String suggestion2;

    public static final class b {
        private b() {
        }

        public final c serializer() {
            return a.f39084a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public PasswordStrengthState() {
        this(0, (String) null, (String) null, (String) null, false, false, false, false, 255, (k) null);
    }

    public static /* synthetic */ PasswordStrengthState copy$default(PasswordStrengthState passwordStrengthState, int i10, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = passwordStrengthState.strengthScore;
        }
        if ((i11 & 2) != 0) {
            str = passwordStrengthState.error;
        }
        if ((i11 & 4) != 0) {
            str2 = passwordStrengthState.suggestion;
        }
        if ((i11 & 8) != 0) {
            str3 = passwordStrengthState.suggestion2;
        }
        if ((i11 & 16) != 0) {
            z10 = passwordStrengthState.isCheckingPassword;
        }
        if ((i11 & 32) != 0) {
            z11 = passwordStrengthState.showCheckPassword;
        }
        if ((i11 & 64) != 0) {
            z12 = passwordStrengthState.showCheckingHint;
        }
        if ((i11 & 128) != 0) {
            z13 = passwordStrengthState.isAllowContinuing;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        boolean z16 = z10;
        boolean z17 = z11;
        return passwordStrengthState.copy(i10, str, str2, str3, z16, z17, z14, z15);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PasswordStrengthState passwordStrengthState, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || passwordStrengthState.strengthScore != -1) {
            dVar.t(fVar, 0, passwordStrengthState.strengthScore);
        }
        if (dVar.E(fVar, 1) || !t.b(passwordStrengthState.error, "")) {
            dVar.f(fVar, 1, passwordStrengthState.error);
        }
        if (dVar.E(fVar, 2) || !t.b(passwordStrengthState.suggestion, "")) {
            dVar.f(fVar, 2, passwordStrengthState.suggestion);
        }
        if (dVar.E(fVar, 3) || !t.b(passwordStrengthState.suggestion2, "")) {
            dVar.f(fVar, 3, passwordStrengthState.suggestion2);
        }
        if (dVar.E(fVar, 4) || passwordStrengthState.isCheckingPassword) {
            dVar.u(fVar, 4, passwordStrengthState.isCheckingPassword);
        }
        if (dVar.E(fVar, 5) || passwordStrengthState.showCheckPassword) {
            dVar.u(fVar, 5, passwordStrengthState.showCheckPassword);
        }
        if (dVar.E(fVar, 6) || passwordStrengthState.showCheckingHint) {
            dVar.u(fVar, 6, passwordStrengthState.showCheckingHint);
        }
        if (dVar.E(fVar, 7) || passwordStrengthState.isAllowContinuing) {
            dVar.u(fVar, 7, passwordStrengthState.isAllowContinuing);
        }
    }

    public final int component1() {
        return this.strengthScore;
    }

    public final String component2() {
        return this.error;
    }

    public final String component3() {
        return this.suggestion;
    }

    public final String component4() {
        return this.suggestion2;
    }

    public final boolean component5() {
        return this.isCheckingPassword;
    }

    public final boolean component6() {
        return this.showCheckPassword;
    }

    public final boolean component7() {
        return this.showCheckingHint;
    }

    public final boolean component8() {
        return this.isAllowContinuing;
    }

    public final PasswordStrengthState copy(int i10, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        t.f(str, "error");
        t.f(str2, "suggestion");
        t.f(str3, "suggestion2");
        return new PasswordStrengthState(i10, str, str2, str3, z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordStrengthState)) {
            return false;
        }
        PasswordStrengthState passwordStrengthState = (PasswordStrengthState) obj;
        return this.strengthScore == passwordStrengthState.strengthScore && t.b(this.error, passwordStrengthState.error) && t.b(this.suggestion, passwordStrengthState.suggestion) && t.b(this.suggestion2, passwordStrengthState.suggestion2) && this.isCheckingPassword == passwordStrengthState.isCheckingPassword && this.showCheckPassword == passwordStrengthState.showCheckPassword && this.showCheckingHint == passwordStrengthState.showCheckingHint && this.isAllowContinuing == passwordStrengthState.isAllowContinuing;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getShowCheckPassword() {
        return this.showCheckPassword;
    }

    public final boolean getShowCheckingHint() {
        return this.showCheckingHint;
    }

    public final int getStrengthScore() {
        return this.strengthScore;
    }

    public final String getSuggestion() {
        return this.suggestion;
    }

    public final String getSuggestion2() {
        return this.suggestion2;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.strengthScore) * 31) + this.error.hashCode()) * 31) + this.suggestion.hashCode()) * 31) + this.suggestion2.hashCode()) * 31) + Boolean.hashCode(this.isCheckingPassword)) * 31) + Boolean.hashCode(this.showCheckPassword)) * 31) + Boolean.hashCode(this.showCheckingHint)) * 31) + Boolean.hashCode(this.isAllowContinuing);
    }

    public final boolean isAllowContinuing() {
        return this.isAllowContinuing;
    }

    public final boolean isCheckingPassword() {
        return this.isCheckingPassword;
    }

    public String toString() {
        return "PasswordStrengthState(strengthScore=" + this.strengthScore + ", error=" + this.error + ", suggestion=" + this.suggestion + ", suggestion2=" + this.suggestion2 + ", isCheckingPassword=" + this.isCheckingPassword + ", showCheckPassword=" + this.showCheckPassword + ", showCheckingHint=" + this.showCheckingHint + ", isAllowContinuing=" + this.isAllowContinuing + ")";
    }

    public /* synthetic */ PasswordStrengthState(int i10, int i11, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, s2 s2Var) {
        this.strengthScore = (i10 & 1) == 0 ? -1 : i11;
        if ((i10 & 2) == 0) {
            this.error = "";
        } else {
            this.error = str;
        }
        if ((i10 & 4) == 0) {
            this.suggestion = "";
        } else {
            this.suggestion = str2;
        }
        if ((i10 & 8) == 0) {
            this.suggestion2 = "";
        } else {
            this.suggestion2 = str3;
        }
        if ((i10 & 16) == 0) {
            this.isCheckingPassword = false;
        } else {
            this.isCheckingPassword = z10;
        }
        if ((i10 & 32) == 0) {
            this.showCheckPassword = false;
        } else {
            this.showCheckPassword = z11;
        }
        if ((i10 & 64) == 0) {
            this.showCheckingHint = false;
        } else {
            this.showCheckingHint = z12;
        }
        if ((i10 & 128) == 0) {
            this.isAllowContinuing = false;
        } else {
            this.isAllowContinuing = z13;
        }
    }

    public PasswordStrengthState(int i10, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        t.f(str, "error");
        t.f(str2, "suggestion");
        t.f(str3, "suggestion2");
        this.strengthScore = i10;
        this.error = str;
        this.suggestion = str2;
        this.suggestion2 = str3;
        this.isCheckingPassword = z10;
        this.showCheckPassword = z11;
        this.showCheckingHint = z12;
        this.isAllowContinuing = z13;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PasswordStrengthState(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, ju.k r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = -1
        L5:
            r11 = r10 & 2
            java.lang.String r0 = ""
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            r0 = 0
            if (r11 == 0) goto L1c
            r6 = r0
        L1c:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            r7 = r0
        L21:
            r11 = r10 & 64
            if (r11 == 0) goto L26
            r8 = r0
        L26:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L34
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3d
        L34:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.base.data.PasswordStrengthState.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, ju.k):void");
    }
}
