package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.compose.runtime.m;
import androidx.compose.runtime.w;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdSetupErrorDetails;
import ju.t;
import su.s;
import z2.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final String a(SshIdSetupErrorDetails sshIdSetupErrorDetails, m mVar, int i10) {
        String strC;
        t.f(sshIdSetupErrorDetails, "<this>");
        mVar.W(507957535);
        if (w.R()) {
            w.b0(507957535, i10, -1, "com.server.auditor.ssh.client.ui.sshid.domain.toErrorMessage (SshIdSetupErrorDetails.kt:24)");
        }
        if (sshIdSetupErrorDetails instanceof SshIdSetupErrorDetails.b) {
            mVar.W(1393290582);
            SshIdSetupErrorDetails.b bVar = (SshIdSetupErrorDetails.b) sshIdSetupErrorDetails;
            String strB = h.b(wo.a.f85136a.a(bVar.b()), mVar, 0);
            String strA = bVar.a();
            if (strA == null) {
                strA = "";
            }
            strC = s.p1(strB + " " + strA).toString();
            mVar.Q();
        } else if (sshIdSetupErrorDetails instanceof SshIdSetupErrorDetails.a) {
            mVar.W(1393619957);
            SshIdSetupErrorDetails.a aVar = (SshIdSetupErrorDetails.a) sshIdSetupErrorDetails;
            String strB2 = aVar.b();
            if (strB2 != null) {
                strC = strB2;
            } else if (aVar.a() == -1) {
                mVar.W(-1479061806);
                strC = h.b(R.string.ssh_id_setup_error_network, mVar, 6);
                mVar.Q();
            } else {
                mVar.W(-1479059247);
                strC = h.b(R.string.ssh_id_setup_error_common, mVar, 6);
                mVar.Q();
            }
            mVar.Q();
        } else {
            if (!(sshIdSetupErrorDetails instanceof SshIdSetupErrorDetails.c)) {
                mVar.W(-1479077270);
                mVar.Q();
                throw new ut.s();
            }
            mVar.W(1393948154);
            strC = h.c(R.string.ssh_id_setup_error_throttled, new Object[]{Integer.valueOf(((SshIdSetupErrorDetails.c) sshIdSetupErrorDetails).a())}, mVar, 6);
            mVar.Q();
        }
        if (w.R()) {
            w.a0();
        }
        mVar.Q();
        return strC;
    }
}
