package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import a1.wc;
import androidx.compose.ui.node.c;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.ConflictResolve;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.z9;
import v1.e;
import v1.m;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z9 {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SftpTransferTask f35082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f35083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.p f35084c;

        a(SftpTransferTask sftpTransferTask, androidx.compose.runtime.e2 e2Var, iu.p pVar) {
            this.f35082a = sftpTransferTask;
            this.f35083b = e2Var;
            this.f35084c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(iu.p pVar, SftpTransferTask sftpTransferTask, androidx.compose.runtime.e2 e2Var) {
            z9.e(e2Var, false);
            pVar.invoke(sftpTransferTask, ConflictResolve.Rename);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 i(iu.p pVar, SftpTransferTask sftpTransferTask, androidx.compose.runtime.e2 e2Var) {
            z9.e(e2Var, false);
            pVar.invoke(sftpTransferTask, ConflictResolve.Overwrite);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(iu.p pVar, SftpTransferTask sftpTransferTask, androidx.compose.runtime.e2 e2Var) {
            z9.e(e2Var, false);
            pVar.invoke(sftpTransferTask, ConflictResolve.Cancel);
            return ut.m0.f82633a;
        }

        public final void g(z.p pVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(pVar, "$this$ModalBottomSheet");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(2035348113, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SftpTransferConflictResolveBottomSheet.<anonymous> (SftpTransferConflictResolveDialog.kt:63)");
            }
            e.f fVarO = z.e.f87467a.o(q3.h.m(0));
            m.a aVar = v1.m.f83247a;
            float f10 = 20;
            v1.m mVarP = androidx.compose.foundation.layout.c0.p(androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(aVar, null, false, 3, null), 0.0f, 0.0f, 0.0f, q3.h.m(f10), 7, null), q3.h.m(25), 0.0f, 2, null);
            final SftpTransferTask sftpTransferTask = this.f35082a;
            final androidx.compose.runtime.e2 e2Var = this.f35083b;
            final iu.p pVar2 = this.f35084c;
            e.a aVar2 = v1.e.f83199a;
            s2.e0 e0VarA = z.m.a(fVarO, aVar2.k(), mVar, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarP);
            c.a aVar3 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar3.a();
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
            androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar3.e());
            iu.p pVarB = aVar3.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar3.d());
            z.q qVar = z.q.f87592a;
            String strC = z2.h.c(R.string.new_sftp_an_item_already_exists, new Object[]{z9.k(sftpTransferTask)}, mVar, 6);
            qk.a aVar4 = qk.a.f74718a;
            float f11 = 10;
            lf.j(strC, androidx.compose.foundation.layout.c0.p(aVar, 0.0f, q3.h.m(f11), 1, null), aVar4.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVar, 6).m(), mVar, 48, 0, 131064);
            float f12 = 15;
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f12)), mVar, 6);
            float f13 = 5;
            v1.m mVarD = androidx.compose.foundation.b.d(z1.g.a(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), g0.g.d(q3.h.m(f12), q3.h.m(f12), q3.h.m(f13), q3.h.m(f13))), aVar4.a(mVar, 6).i(), null, 2, null);
            boolean zD = z9.d(e2Var);
            mVar.W(-1746271574);
            boolean zV = mVar.V(e2Var) | mVar.V(pVar2) | mVar.V(sftpTransferTask);
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.w9
                    @Override // iu.a
                    public final Object a() {
                        return z9.a.h(pVar2, sftpTransferTask, e2Var);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            v1.m mVarN = androidx.compose.foundation.layout.c0.n(androidx.compose.foundation.e.j(mVarD, zD, null, null, null, (iu.a) objD, 14, null), q3.h.m(f12));
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(aVar2.o(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR2 = mVar.r();
            v1.m mVarE2 = v1.k.e(mVar, mVarN);
            iu.a aVarA2 = aVar3.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA2);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB2 = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB2, e0VarI, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB2, i0VarR2, aVar3.e());
            iu.p pVarB2 = aVar3.b();
            if (mVarB2.e() || !ju.t.b(mVarB2.D(), Integer.valueOf(iHashCode2))) {
                mVarB2.t(Integer.valueOf(iHashCode2));
                mVarB2.m(Integer.valueOf(iHashCode2), pVarB2);
            }
            androidx.compose.runtime.q5.e(mVarB2, mVarE2, aVar3.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            lf.j(z2.h.b(R.string.sftp_tab_conflict_keep_both_action, mVar, 6), null, aVar4.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVar, 6).k(), mVar, 0, 0, 131066);
            mVar.w();
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(2)), mVar, 6);
            v1.m mVarD2 = androidx.compose.foundation.b.d(z1.g.a(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), g0.g.d(q3.h.m(f13), q3.h.m(f13), q3.h.m(f12), q3.h.m(f12))), aVar4.a(mVar, 6).i(), null, 2, null);
            boolean zD2 = z9.d(e2Var);
            mVar.W(-1746271574);
            boolean zV2 = mVar.V(e2Var) | mVar.V(pVar2) | mVar.V(sftpTransferTask);
            Object objD2 = mVar.D();
            if (zV2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.x9
                    @Override // iu.a
                    public final Object a() {
                        return z9.a.i(pVar2, sftpTransferTask, e2Var);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            v1.m mVarN2 = androidx.compose.foundation.layout.c0.n(androidx.compose.foundation.e.j(mVarD2, zD2, null, null, null, (iu.a) objD2, 14, null), q3.h.m(f12));
            s2.e0 e0VarI2 = androidx.compose.foundation.layout.i.i(aVar2.o(), false);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR3 = mVar.r();
            v1.m mVarE3 = v1.k.e(mVar, mVarN2);
            iu.a aVarA3 = aVar3.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA3);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB3 = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB3, e0VarI2, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB3, i0VarR3, aVar3.e());
            iu.p pVarB3 = aVar3.b();
            if (mVarB3.e() || !ju.t.b(mVarB3.D(), Integer.valueOf(iHashCode3))) {
                mVarB3.t(Integer.valueOf(iHashCode3));
                mVarB3.m(Integer.valueOf(iHashCode3), pVarB3);
            }
            androidx.compose.runtime.q5.e(mVarB3, mVarE3, aVar3.d());
            lf.j(z2.h.b(R.string.sftp_tab_conflict_replace_action, mVar, 6), null, aVar4.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVar, 6).k(), mVar, 0, 0, 131066);
            mVar.w();
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f11)), mVar, 6);
            v1.m mVarD3 = androidx.compose.foundation.b.d(z1.g.a(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), g0.g.d(q3.h.m(f12), q3.h.m(f12), q3.h.m(f12), q3.h.m(f12))), aVar4.a(mVar, 6).i(), null, 2, null);
            boolean zD3 = z9.d(e2Var);
            mVar.W(-1746271574);
            boolean zV3 = mVar.V(e2Var) | mVar.V(pVar2) | mVar.V(sftpTransferTask);
            Object objD3 = mVar.D();
            if (zV3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.y9
                    @Override // iu.a
                    public final Object a() {
                        return z9.a.k(pVar2, sftpTransferTask, e2Var);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            v1.m mVarN3 = androidx.compose.foundation.layout.c0.n(androidx.compose.foundation.e.j(mVarD3, zD3, null, null, null, (iu.a) objD3, 14, null), q3.h.m(f12));
            s2.e0 e0VarI3 = androidx.compose.foundation.layout.i.i(aVar2.o(), false);
            int iHashCode4 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR4 = mVar.r();
            v1.m mVarE4 = v1.k.e(mVar, mVarN3);
            iu.a aVarA4 = aVar3.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA4);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB4 = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB4, e0VarI3, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB4, i0VarR4, aVar3.e());
            iu.p pVarB4 = aVar3.b();
            if (mVarB4.e() || !ju.t.b(mVarB4.D(), Integer.valueOf(iHashCode4))) {
                mVarB4.t(Integer.valueOf(iHashCode4));
                mVarB4.m(Integer.valueOf(iHashCode4), pVarB4);
            }
            androidx.compose.runtime.q5.e(mVarB4, mVarE4, aVar3.d());
            lf.j(z2.h.b(R.string.sftp_tab_conflict_stop_transfer_action, mVar, 6), null, aVar4.a(mVar, 6).s(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVar, 6).k(), mVar, 0, 0, 131066);
            mVar.w();
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f10)), mVar, 6);
            mVar.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            g((z.p) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(a1.wc r28, final com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask r29, final iu.p r30, v1.m r31, androidx.compose.runtime.m r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.z9.c(a1.wc, com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask, iu.p, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f(iu.p pVar, SftpTransferTask sftpTransferTask) {
        pVar.invoke(sftpTransferTask, ConflictResolve.Cancel);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(wc wcVar, SftpTransferTask sftpTransferTask, iu.p pVar, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        c(wcVar, sftpTransferTask, pVar, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(SftpTransferTask sftpTransferTask) {
        if (sftpTransferTask instanceof SftpTransferTask.Download) {
            SftpTransferTask.Download download = (SftpTransferTask.Download) sftpTransferTask;
            String str = (String) vt.v.C0(su.s.Q0(download.getRemotePath(), new String[]{"/"}, false, 0, 6, null));
            return str == null ? download.getRemotePath() : str;
        }
        if (sftpTransferTask instanceof SftpTransferTask.Upload) {
            SftpTransferTask.Upload upload = (SftpTransferTask.Upload) sftpTransferTask;
            String str2 = (String) vt.v.C0(su.s.Q0(upload.getRemotePath(), new String[]{"/"}, false, 0, 6, null));
            return str2 == null ? upload.getRemotePath() : str2;
        }
        if (sftpTransferTask instanceof SftpTransferTask.UploadFolder) {
            SftpTransferTask.UploadFolder uploadFolder = (SftpTransferTask.UploadFolder) sftpTransferTask;
            String str3 = (String) vt.v.C0(su.s.Q0(uploadFolder.getRemotePath(), new String[]{"/"}, false, 0, 6, null));
            return str3 == null ? uploadFolder.getRemotePath() : str3;
        }
        if (sftpTransferTask instanceof SftpTransferTask.Transfer) {
            SftpTransferTask.Transfer transfer = (SftpTransferTask.Transfer) sftpTransferTask;
            String str4 = (String) vt.v.C0(su.s.Q0(transfer.getDestinationPath(), new String[]{"/"}, false, 0, 6, null));
            return str4 == null ? transfer.getDestinationPath() : str4;
        }
        if (sftpTransferTask instanceof SftpTransferTask.DownloadFolder) {
            SftpTransferTask.DownloadFolder downloadFolder = (SftpTransferTask.DownloadFolder) sftpTransferTask;
            String str5 = (String) vt.v.C0(su.s.Q0(downloadFolder.getRemotePath(), new String[]{"/"}, false, 0, 6, null));
            return str5 == null ? downloadFolder.getRemotePath() : str5;
        }
        if (!(sftpTransferTask instanceof SftpTransferTask.TransferFolder)) {
            throw new ut.s();
        }
        SftpTransferTask.TransferFolder transferFolder = (SftpTransferTask.TransferFolder) sftpTransferTask;
        String str6 = (String) vt.v.C0(su.s.Q0(transferFolder.getDestinationPath(), new String[]{"/"}, false, 0, 6, null));
        return str6 == null ? transferFolder.getDestinationPath() : str6;
    }
}
