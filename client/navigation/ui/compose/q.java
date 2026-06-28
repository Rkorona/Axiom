package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import a1.wc;
import androidx.compose.runtime.m;
import androidx.compose.ui.node.c;
import com.crystalnix.termius.libtermius.sftp.FileAttributes;
import com.server.auditor.ssh.client.navigation.ui.compose.q;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f33016a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.q f33017b = q1.h.b(-444763042, false, a.f33019a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f33018c = q1.h.b(1948334088, false, b.f33020a);

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33019a = new a();

        a() {
        }

        public final void b(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(eVar, "$this$item");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-444763042, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$SftpDeleteConfirmationBottomSheetKt.lambda$-444763042.<anonymous> (SftpDeleteConfirmationBottomSheet.kt:88)");
            }
            qk.a aVar = qk.a.f74718a;
            lf.j(", ", androidx.compose.foundation.layout.c0.p(v1.m.f83247a, 0.0f, q3.h.m(10), 1, null), aVar.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.b(mVar, 6).b(), mVar, 54, 0, 131064);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33020a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g() {
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
                androidx.compose.runtime.w.b0(1948334088, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$SftpDeleteConfirmationBottomSheetKt.lambda$1948334088.<anonymous> (SftpDeleteConfirmationBottomSheet.kt:165)");
            }
            wc wcVarD = a1.u0.d(null, null, false, mVar, 0, 7);
            v1.m mVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null), qk.a.f74718a.a(mVar, 6).j(), null, 2, null);
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(v1.e.f83199a.o(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarD);
            c.a aVar = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB, e0VarI, aVar.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar.e());
            iu.p pVarB = aVar.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            List listR = vt.v.r(new p9.a("file1.txt", "", new FileAttributes(0, 0, 0, 0L, 0, 0, 0)), new p9.a("folder", "", new FileAttributes(0, 0, 0, 0L, 0, 0, 0)), new p9.a("file2.py", "", new FileAttributes(0, 0, 0, 0L, 0, 0, 0)));
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar2 = androidx.compose.runtime.m.f5359a;
            if (objD == aVar2.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.r
                    @Override // iu.a
                    public final Object a() {
                        return q.b.g();
                    }
                };
                mVar.t(objD);
            }
            iu.a aVar3 = (iu.a) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar2.a()) {
                objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.s
                    @Override // iu.a
                    public final Object a() {
                        return q.b.h();
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            j9.c(wcVarD, listR, aVar3, (iu.a) objD2, null, mVar, 3456, 16);
            mVar.w();
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
        return f33017b;
    }
}
