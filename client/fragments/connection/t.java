package com.server.auditor.ssh.client.fragments.connection;

import android.graphics.Point;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import lj.y;
import qg.c6;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements c, l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c6 f24708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ei.s f24710c;

    public t(c6 c6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(c6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24708a = c6Var;
        this.f24709b = newConnectionFlowPresenter;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24708a.f72144e.setEnabled(true);
        this.f24708a.f72142c.setEnabled(true);
        this.f24708a.f72144e.setEnabled(true);
        ei.s sVar = this.f24710c;
        ei.s sVar2 = null;
        if (sVar == null) {
            ju.t.t("adapter");
            sVar = null;
        }
        sVar.O(true);
        ei.s sVar3 = this.f24710c;
        if (sVar3 == null) {
            ju.t.t("adapter");
        } else {
            sVar2 = sVar3;
        }
        sVar2.o();
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean Ga(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public void V8(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        NewConnectionFlowPresenter newConnectionFlowPresenter = this.f24709b;
        ei.s sVar = this.f24710c;
        if (sVar == null) {
            ju.t.t("adapter");
            sVar = null;
        }
        Object obj = sVar.L().get(i10);
        ju.t.e(obj, "get(...)");
        newConnectionFlowPresenter.v3((y) obj, this.f24708a.f72142c.isChecked());
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.p pVar) {
        ju.t.f(pVar, "step");
        String string = this.f24708a.b().getContext().getString(R.string.connection_flow_host_select_ssh_key_request, pVar.b());
        ju.t.e(string, "getString(...)");
        this.f24708a.f72143d.setText(m4.b.a(string, 0));
        this.f24708a.f72142c.setChecked(pVar.a());
        MaterialSwitch materialSwitch = this.f24708a.f72142c;
        ju.t.e(materialSwitch, "saveToHostSwitch");
        materialSwitch.setVisibility(pVar.c() ? 0 : 8);
        ei.s sVar = this.f24710c;
        ei.s sVar2 = null;
        if (sVar == null) {
            ju.t.t("adapter");
            sVar = null;
        }
        sVar.L().clear();
        ei.s sVar3 = this.f24710c;
        if (sVar3 == null) {
            ju.t.t("adapter");
        } else {
            sVar2 = sVar3;
        }
        sVar2.L().addAll(pVar.d());
        B1();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        ei.s sVar = new ei.s(this);
        this.f24710c = sVar;
        this.f24708a.f72144e.setAdapter(sVar);
        c6 c6Var = this.f24708a;
        c6Var.f72144e.setLayoutManager(new LinearLayoutManager(c6Var.b().getContext()));
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24708a.f72144e.setEnabled(false);
        this.f24708a.f72142c.setEnabled(false);
        this.f24708a.f72144e.setEnabled(false);
        ei.s sVar = this.f24710c;
        ei.s sVar2 = null;
        if (sVar == null) {
            ju.t.t("adapter");
            sVar = null;
        }
        sVar.O(false);
        ei.s sVar3 = this.f24710c;
        if (sVar3 == null) {
            ju.t.t("adapter");
        } else {
            sVar2 = sVar3;
        }
        sVar2.o();
    }
}
