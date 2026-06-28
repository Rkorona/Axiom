package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ae {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r38, v1.m r39, final boolean r40, final com.server.auditor.ssh.client.navigation.ui.compose.c r41, final java.util.List r42, boolean r43, final java.lang.String r44, boolean r45, iu.a r46, iu.a r47, final j3.t0 r48, final iu.l r49, final iu.a r50, final iu.a r51, iu.a r52, iu.a r53, final iu.l r54, final com.server.auditor.ssh.client.utils.sort.TermiusSortType r55, iu.a r56, final op.n r57, final iu.l r58, final boolean r59, final iu.a r60, final iu.l r61, final boolean r62, final iu.l r63, final iu.a r64, final bk.a r65, final iu.a r66, final iu.l r67, androidx.compose.runtime.m r68, final int r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instruction units count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ae.h(java.lang.String, v1.m, boolean, com.server.auditor.ssh.client.navigation.ui.compose.c, java.util.List, boolean, java.lang.String, boolean, iu.a, iu.a, j3.t0, iu.l, iu.a, iu.a, iu.a, iu.a, iu.l, com.server.auditor.ssh.client.utils.sort.TermiusSortType, iu.a, op.n, iu.l, boolean, iu.a, iu.l, boolean, iu.l, iu.a, bk.a, iu.a, iu.l, androidx.compose.runtime.m, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 i() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 j(boolean z10, iu.a aVar, List list, iu.a aVar2) {
        if (z10) {
            aVar.a();
        } else if (!list.isEmpty()) {
            aVar2.a();
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 k(String str, v1.m mVar, boolean z10, com.server.auditor.ssh.client.navigation.ui.compose.c cVar, List list, boolean z11, String str2, boolean z12, iu.a aVar, iu.a aVar2, j3.t0 t0Var, iu.l lVar, iu.a aVar3, iu.a aVar4, iu.a aVar5, iu.a aVar6, iu.l lVar2, TermiusSortType termiusSortType, iu.a aVar7, op.n nVar, iu.l lVar3, boolean z13, iu.a aVar8, iu.l lVar4, boolean z14, iu.l lVar5, iu.a aVar9, bk.a aVar10, iu.a aVar11, iu.l lVar6, int i10, int i11, int i12, int i13, androidx.compose.runtime.m mVar2, int i14) {
        h(str, mVar, z10, cVar, list, z11, str2, z12, aVar, aVar2, t0Var, lVar, aVar3, aVar4, aVar5, aVar6, lVar2, termiusSortType, aVar7, nVar, lVar3, z13, aVar8, lVar4, z14, lVar5, aVar9, aVar10, aVar11, lVar6, mVar2, androidx.compose.runtime.e3.a(i10 | 1), androidx.compose.runtime.e3.a(i11), androidx.compose.runtime.e3.a(i12), i13);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 l() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 n() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o() {
        return ut.m0.f82633a;
    }
}
