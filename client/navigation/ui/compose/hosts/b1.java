package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import u0.a;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f30871a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.p f30872b = q1.h.b(-1733803904, false, a.f30873a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30873a = new a();

        a() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1733803904, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$LocalHostEditorScreenKt.lambda$-1733803904.<anonymous> (LocalHostEditorScreen.kt:296)");
            }
            a1.z4.e(w0.c.a(a.b.f81267a), "Save", null, 0L, mVar, 48, 12);
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
        return f30872b;
    }
}
