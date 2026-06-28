package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.r;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f32069a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.q f32070b = q1.h.b(-940675548, false, a.f32073a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.q f32071c = q1.h.b(1658530706, false, c.f32075a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static iu.p f32072d = q1.h.b(1471166844, false, b.f32074a);

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32073a = new a();

        a() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$AccentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-940675548, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$CreateTagDialogKt.lambda$-940675548.<anonymous> (CreateTagDialog.kt:55)");
            }
            a1.lf.j(z2.h.b(R.string.ok, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
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

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32074a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g() {
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(String str) {
            ju.t.f(str, "it");
            return ut.m0.f82633a;
        }

        public final void e(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1471166844, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$CreateTagDialogKt.lambda$1471166844.<anonymous> (CreateTagDialog.kt:116)");
            }
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.s
                    @Override // iu.a
                    public final Object a() {
                        return r.b.g();
                    }
                };
                mVar.t(objD);
            }
            iu.a aVar2 = (iu.a) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.t
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return r.b.h((String) obj);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            r6.b(aVar2, "", (iu.l) objD2, null, mVar, 438, 8);
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

    static final class c implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32075a = new c();

        c() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$TransparentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1658530706, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$CreateTagDialogKt.lambda$1658530706.<anonymous> (CreateTagDialog.kt:63)");
            }
            a1.lf.j(z2.h.b(R.string.cancel, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
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
        return f32070b;
    }

    public final iu.q b() {
        return f32071c;
    }
}
