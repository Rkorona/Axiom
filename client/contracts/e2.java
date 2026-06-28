package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.List;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface e2 extends MvpView {
    void A1(ProgressButton.b bVar);

    void B2(boolean z10);

    void C0();

    void P1(boolean z10);

    void T(boolean z10);

    void U0();

    void a();

    void b();

    void c8(boolean z10);

    void i0(TeamMemberInvitation teamMemberInvitation);

    void m4(List list, int i10);

    void r(boolean z10);

    void x(int i10);

    void ya(int i10, List list, String str);
}
