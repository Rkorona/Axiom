package com.server.auditor.ssh.client.navigation.ui.compose;

import com.server.auditor.ssh.client.synchronization.SyncConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ca f30377a = new ca();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.animation.h f30378b = androidx.compose.animation.f.A(r.l.l(SyncConstants.ResultCode.MULTIPLE_CHOICES, 0, r.g0.d(), 2, null), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.aa
        @Override // iu.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(ca.c(((Integer) obj).intValue()));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.animation.j f30379c = androidx.compose.animation.f.D(r.l.l(SyncConstants.ResultCode.MULTIPLE_CHOICES, 0, r.g0.d(), 2, null), new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.ba
        @Override // iu.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(ca.d(((Integer) obj).intValue()));
        }
    });

    private ca() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i10) {
        return i10;
    }

    public final androidx.compose.animation.h e() {
        return f30378b;
    }

    public final androidx.compose.animation.j f() {
        return f30379c;
    }
}
