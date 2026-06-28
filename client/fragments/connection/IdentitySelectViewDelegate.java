package com.server.auditor.ssh.client.fragments.connection;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.IdentitySelectViewDelegate;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import qg.y5;
import rh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentitySelectViewDelegate implements c, l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5 f24473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rh.h f24475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IdentitySelectManager f24476d;

    public static final class IdentitySelectManager extends LinearLayoutManager {
        private boolean W;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentitySelectManager(Context context) {
            super(context);
            ju.t.f(context, "context");
            this.W = true;
        }

        public final void W2(boolean z10) {
            this.W = z10;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public boolean z() {
            return this.W;
        }
    }

    public IdentitySelectViewDelegate(y5 y5Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(y5Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24473a = y5Var;
        this.f24474b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(IdentitySelectViewDelegate identitySelectViewDelegate, View view) {
        identitySelectViewDelegate.f24474b.U2();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24473a.f74468b.setEnabled(true);
        this.f24473a.f74471e.setEnabled(true);
        this.f24473a.f74470d.setEnabled(true);
        IdentitySelectManager identitySelectManager = this.f24476d;
        rh.h hVar = null;
        if (identitySelectManager == null) {
            ju.t.t("layoutManager");
            identitySelectManager = null;
        }
        identitySelectManager.W2(true);
        rh.h hVar2 = this.f24475c;
        if (hVar2 == null) {
            ju.t.t("adapter");
            hVar2 = null;
        }
        hVar2.O(true);
        rh.h hVar3 = this.f24475c;
        if (hVar3 == null) {
            ju.t.t("adapter");
        } else {
            hVar = hVar3;
        }
        hVar.o();
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
        NewConnectionFlowPresenter newConnectionFlowPresenter = this.f24474b;
        rh.h hVar = this.f24475c;
        if (hVar == null) {
            ju.t.t("adapter");
            hVar = null;
        }
        Object obj = hVar.L().get(i10);
        ju.t.e(obj, "get(...)");
        newConnectionFlowPresenter.V2((z.a) obj, this.f24473a.f74471e.isChecked());
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        ju.t.f(aVar, "callback");
        aVar.a();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        this.f24475c = new rh.h(this);
        this.f24473a.f74470d.setHasFixedSize(true);
        this.f24473a.f74468b.setOnClickListener(new View.OnClickListener() { // from class: gh.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdentitySelectViewDelegate.b(this.f51350a, view);
            }
        });
        RecyclerView recyclerView = this.f24473a.f74470d;
        rh.h hVar = this.f24475c;
        if (hVar == null) {
            ju.t.t("adapter");
            hVar = null;
        }
        recyclerView.setAdapter(hVar);
        Context context = this.f24473a.b().getContext();
        ju.t.e(context, "getContext(...)");
        IdentitySelectManager identitySelectManager = new IdentitySelectManager(context);
        this.f24476d = identitySelectManager;
        this.f24473a.f74470d.setLayoutManager(identitySelectManager);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.l lVar) {
        ju.t.f(lVar, "step");
        String string = this.f24473a.b().getContext().getString(R.string.connection_flow_host_select_identity_request, lVar.b());
        ju.t.e(string, "getString(...)");
        this.f24473a.f74472f.setText(m4.b.a(string, 0));
        this.f24473a.f74471e.setChecked(lVar.a());
        MaterialSwitch materialSwitch = this.f24473a.f74471e;
        ju.t.e(materialSwitch, "saveToHostSwitch");
        materialSwitch.setVisibility(lVar.d() ? 0 : 8);
        rh.h hVar = this.f24475c;
        rh.h hVar2 = null;
        if (hVar == null) {
            ju.t.t("adapter");
            hVar = null;
        }
        hVar.L().clear();
        rh.h hVar3 = this.f24475c;
        if (hVar3 == null) {
            ju.t.t("adapter");
        } else {
            hVar2 = hVar3;
        }
        hVar2.L().addAll(lVar.c());
        B1();
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24473a.f74468b.setEnabled(false);
        this.f24473a.f74471e.setEnabled(false);
        this.f24473a.f74470d.setEnabled(false);
        rh.h hVar = this.f24475c;
        rh.h hVar2 = null;
        if (hVar == null) {
            ju.t.t("adapter");
            hVar = null;
        }
        hVar.O(false);
        rh.h hVar3 = this.f24475c;
        if (hVar3 == null) {
            ju.t.t("adapter");
            hVar3 = null;
        }
        rh.h hVar4 = this.f24475c;
        if (hVar4 == null) {
            ju.t.t("adapter");
        } else {
            hVar2 = hVar4;
        }
        hVar3.t(0, hVar2.i());
    }
}
