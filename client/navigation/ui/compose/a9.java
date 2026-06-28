package com.server.auditor.ssh.client.navigation.ui.compose;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.a9;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dk.b;
import v1.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a9 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dk.b f30249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f30251c;

        a(dk.b bVar, String str, iu.a aVar) {
            this.f30249a = bVar;
            this.f30250b = str;
            this.f30251c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.a aVar) {
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1285491666, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectParametersDialog.<anonymous> (SerialConnectParameters.kt:44)");
            }
            Avo.ConnectionOrigin connectionOriginA = ((b.C0693b) this.f30249a).a();
            m.a aVar = v1.m.f83247a;
            float f10 = 25;
            v1.m mVarA = z.k1.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.i0.w(z1.n.b(aVar, q3.h.m(8), g0.g.c(q3.h.m(f10)), false, 0L, 0L, 28, null), 0.0f, z2.e.b(R.dimen.max_width_tablet_land_alt, mVar, 6), 1, null).h(f1.c0.l(this.f30250b, f1.c0.f49444b.c()) ? androidx.compose.foundation.layout.i0.c(aVar, 0.8f) : androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null)), qk.a.f74718a.a(mVar, 6).j(), g0.g.c(q3.h.m(f10))));
            mVar.W(5004770);
            boolean zV = mVar.V(this.f30251c);
            final iu.a aVar2 = this.f30251c;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.z8
                    @Override // iu.a
                    public final Object a() {
                        return a9.a.e(aVar2);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            c9.b(false, connectionOriginA, (iu.a) objD, this.f30251c, mVarA, mVar, 0, 1);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    public static final void b(final dk.b bVar, final iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        ju.t.f(bVar, "dialogState");
        ju.t.f(aVar, "onDismissRequest");
        androidx.compose.runtime.m mVarG = mVar.g(-40633532);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? mVarG.V(bVar) : mVarG.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-40633532, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectParametersDialog (SerialConnectParameters.kt:31)");
            }
            String strA = f1.i.f49478a.a(b1.b.b(mVarG, 0));
            if (bVar instanceof b.C0693b) {
                androidx.compose.ui.window.b.a(aVar, new androidx.compose.ui.window.l(true, true, null, false, false, null, 36, null), q1.h.d(1285491666, true, new a(bVar, strA, aVar), mVarG, 54), mVarG, ((i11 >> 3) & 14) | 432, 0);
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.y8
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return a9.c(bVar, aVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 c(dk.b bVar, iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        b(bVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }
}
