package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f31013a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.q f31014b = q1.h.b(-678765300, false, a.f31016a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f31015c = q1.h.b(2052568715, false, b.f31017a);

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31016a = new a();

        a() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$AccentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-678765300, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$SftpRenameDialogKt.lambda$-678765300.<anonymous> (SftpRenameDialog.kt:130)");
            }
            a1.lf.j(z2.h.b(R.string.confirm, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
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
        public static final b f31017a = new b();

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
                androidx.compose.runtime.w.b0(2052568715, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$SftpRenameDialogKt.lambda$2052568715.<anonymous> (SftpRenameDialog.kt:149)");
            }
            a1.wc wcVarD = a1.u0.d(null, null, false, mVar, 0, 7);
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.d1
                    @Override // iu.a
                    public final Object a() {
                        return c1.b.g();
                    }
                };
                mVar.t(objD);
            }
            iu.a aVar2 = (iu.a) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.e1
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return c1.b.h((String) obj);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            ve.d("Create new folder", aVar2, wcVarD, "", "New folder", null, (iu.l) objD2, mVar, 1600566, 32);
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

    public final iu.q a() {
        return f31014b;
    }
}
