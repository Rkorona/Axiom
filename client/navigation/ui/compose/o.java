package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import androidx.compose.runtime.m;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.navigation.ui.compose.o;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f32962a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.q f32963b = q1.h.b(807819228, false, d.f32970a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.q f32964c = q1.h.b(-1108320054, false, b.f32968a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static iu.p f32965d = q1.h.b(-1946628397, false, c.f32969a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static iu.p f32966e = q1.h.b(-1042108204, false, a.f32967a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32967a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g(TypedSessionId typedSessionId, String str) {
            ju.t.f(typedSessionId, "<unused var>");
            ju.t.f(str, "<unused var>");
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h() {
            return ut.m0.f82633a;
        }

        public final void e(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1042108204, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$RenameConnectionDialogKt.lambda$-1042108204.<anonymous> (RenameConnectionDialog.kt:122)");
            }
            b.C0568b c0568b = new b.C0568b(new TypedSessionId.Terminal(0, ConnectionType.ssh), "Initial value");
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.m
                    @Override // iu.p
                    public final Object invoke(Object obj, Object obj2) {
                        return o.a.g((TypedSessionId) obj, (String) obj2);
                    }
                };
                mVar.t(objD);
            }
            iu.p pVar = (iu.p) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.n
                    @Override // iu.a
                    public final Object a() {
                        return o.a.h();
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            v8.b(c0568b, pVar, (iu.a) objD2, mVar, 432);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32968a = new b();

        b() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$TransparentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1108320054, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$RenameConnectionDialogKt.lambda$-1108320054.<anonymous> (RenameConnectionDialog.kt:76)");
            }
            lf.j(z2.h.b(R.string.cancel, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((z.w0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32969a = new c();

        c() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1946628397, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$RenameConnectionDialogKt.lambda$-1946628397.<anonymous> (RenameConnectionDialog.kt:105)");
            }
            String strB = z2.h.b(R.string.change_page_title_menu_item, mVar, 6);
            qk.a aVar = qk.a.f74718a;
            e3.i3 i3VarJ = aVar.b(mVar, 6).j();
            lf.j(strB, androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), aVar.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, i3VarJ, mVar, 48, 0, 131064);
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

    static final class d implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32970a = new d();

        d() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$AccentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(807819228, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$RenameConnectionDialogKt.lambda$807819228.<anonymous> (RenameConnectionDialog.kt:68)");
            }
            lf.j(z2.h.b(R.string.ok, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((z.w0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    public final iu.q a() {
        return f32964c;
    }

    public final iu.p b() {
        return f32965d;
    }

    public final iu.q c() {
        return f32963b;
    }
}
