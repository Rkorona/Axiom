package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f32990a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.p f32991b = q1.h.b(1403053600, false, a.f32992a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32992a = new a();

        a() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1403053600, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$SerialConnectScreenKt.lambda$1403053600.<anonymous> (SerialConnectScreen.kt:45)");
            }
            lf.j(z2.h.b(R.string.serial_connection_title, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).j(), mVar, 0, 0, 131070);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    public final iu.p a() {
        return f32991b;
    }
}
