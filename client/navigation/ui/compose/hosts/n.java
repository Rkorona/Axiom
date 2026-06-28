package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.R;
import u0.a;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f31743a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.p f31744b = q1.h.b(-314782114, false, b.f31747a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f31745c = q1.h.b(-1759897775, false, a.f31746a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31746a = new a();

        a() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1759897775, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$ComposeProxyEditorScreenKt.lambda$-1759897775.<anonymous> (ComposeProxyEditorScreen.kt:178)");
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

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31747a = new b();

        b() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-314782114, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$ComposeProxyEditorScreenKt.lambda$-314782114.<anonymous> (ComposeProxyEditorScreen.kt:170)");
            }
            a1.z4.e(v0.a.a(a.C1284a.f81264a.a()), z2.h.b(R.string.content_description_back, mVar, 6), null, 0L, mVar, 0, 12);
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
        return f31745c;
    }

    public final iu.p b() {
        return f31744b;
    }
}
