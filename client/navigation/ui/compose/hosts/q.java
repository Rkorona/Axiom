package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.q;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f31921a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.q f31922b = q1.h.b(974614759, false, b.f31925a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f31923c = q1.h.b(-1410942830, false, a.f31924a);

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31924a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g() {
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(String str, String str2) {
            ju.t.f(str, "<unused var>");
            ju.t.f(str2, "<unused var>");
            return ut.m0.f82633a;
        }

        public final void e(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1410942830, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$CreateEnvironmentVariableDialogKt.lambda$-1410942830.<anonymous> (CreateEnvironmentVariableDialog.kt:148)");
            }
            a1.wc wcVarD = a1.u0.d(null, null, false, mVar, 0, 7);
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.o
                    @Override // iu.a
                    public final Object a() {
                        return q.a.g();
                    }
                };
                mVar.t(objD);
            }
            iu.a aVar2 = (iu.a) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.p
                    @Override // iu.p
                    public final Object invoke(Object obj, Object obj2) {
                        return q.a.h((String) obj, (String) obj2);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            o6.c(aVar2, wcVarD, null, null, (iu.p) objD2, mVar, 24582, 12);
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
        public static final b f31925a = new b();

        b() {
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$AccentTermiusButton");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(974614759, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ComposableSingletons$CreateEnvironmentVariableDialogKt.lambda$974614759.<anonymous> (CreateEnvironmentVariableDialog.kt:134)");
            }
            a1.lf.j(z2.h.b(R.string.save, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).e(), mVar, 0, 0, 131070);
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
        return f31922b;
    }
}
