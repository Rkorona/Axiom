package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f30426a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.p f30427b = q1.h.b(19087911, false, a.f30429a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f30428c = q1.h.b(507771591, false, b.f30430a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30429a = new a();

        a() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(19087911, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$DebugPanelDialogKt.lambda$19087911.<anonymous> (DebugPanelDialog.kt:87)");
            }
            lf.j(z2.h.b(R.string.debug_screen_label, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).j(), mVar, 0, 0, 131070);
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

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30430a = new b();

        b() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(507771591, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$DebugPanelDialogKt.lambda$507771591.<anonymous> (DebugPanelDialog.kt:94)");
            }
            a1.z4.e(w0.e.a(u0.a.f81262a.a()), "Dismiss quick connect", null, 0L, mVar, 48, 12);
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
        return f30427b;
    }

    public final iu.p b() {
        return f30428c;
    }
}
