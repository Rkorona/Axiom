package com.server.auditor.ssh.client.fragments.connection;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.OneTimeCodeSelectViewDelegate;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import java.util.List;
import qg.z5;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class OneTimeCodeSelectViewDelegate implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z5 f24611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rh.l f24613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OneTimeCodeSelectManager f24614d;

    public static final class OneTimeCodeSelectManager extends LinearLayoutManager {
        private boolean W;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneTimeCodeSelectManager(Context context) {
            super(context);
            ju.t.f(context, "context");
            this.W = true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public boolean z() {
            return this.W;
        }
    }

    public OneTimeCodeSelectViewDelegate(z5 z5Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(z5Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24611a = z5Var;
        this.f24612b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 d(OneTimeCodeSelectViewDelegate oneTimeCodeSelectViewDelegate, rq.c cVar) {
        ju.t.f(cVar, "it");
        NewConnectionFlowPresenter newConnectionFlowPresenter = oneTimeCodeSelectViewDelegate.f24612b;
        String strA = cVar.a();
        ju.t.e(strA, "getCode(...)");
        newConnectionFlowPresenter.W2(strA);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(OneTimeCodeSelectViewDelegate oneTimeCodeSelectViewDelegate, View view) {
        oneTimeCodeSelectViewDelegate.f24612b.c3();
    }

    private final void f(List list) {
        if (list.isEmpty()) {
            Flow flow = this.f24611a.f74561d;
            ju.t.e(flow, "connectMessageFlow");
            flow.setVisibility(0);
            ProgressWheel progressWheel = this.f24611a.f74563f;
            ju.t.e(progressWheel, "connectProgress");
            progressWheel.setVisibility(0);
            AppCompatTextView appCompatTextView = this.f24611a.f74562e;
            ju.t.e(appCompatTextView, "connectMessageView");
            appCompatTextView.setVisibility(0);
            RecyclerView recyclerView = this.f24611a.f74560c;
            ju.t.e(recyclerView, "codesList");
            recyclerView.setVisibility(8);
        } else {
            rh.l lVar = this.f24613c;
            rh.l lVar2 = null;
            if (lVar == null) {
                ju.t.t("adapter");
                lVar = null;
            }
            lVar.L().clear();
            rh.l lVar3 = this.f24613c;
            if (lVar3 == null) {
                ju.t.t("adapter");
            } else {
                lVar2 = lVar3;
            }
            lVar2.L().addAll(list);
            Flow flow2 = this.f24611a.f74561d;
            ju.t.e(flow2, "connectMessageFlow");
            flow2.setVisibility(8);
            ProgressWheel progressWheel2 = this.f24611a.f74563f;
            ju.t.e(progressWheel2, "connectProgress");
            progressWheel2.setVisibility(8);
            AppCompatTextView appCompatTextView2 = this.f24611a.f74562e;
            ju.t.e(appCompatTextView2, "connectMessageView");
            appCompatTextView2.setVisibility(8);
            RecyclerView recyclerView2 = this.f24611a.f74560c;
            ju.t.e(recyclerView2, "codesList");
            recyclerView2.setVisibility(0);
        }
        B1();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        this.f24611a.f74559b.setEnabled(true);
        this.f24611a.f74560c.setEnabled(true);
        rh.l lVar = this.f24613c;
        rh.l lVar2 = null;
        if (lVar == null) {
            ju.t.t("adapter");
            lVar = null;
        }
        lVar.O(true);
        rh.l lVar3 = this.f24613c;
        if (lVar3 == null) {
            ju.t.t("adapter");
        } else {
            lVar2 = lVar3;
        }
        lVar2.o();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        ju.t.f(aVar, "callback");
        aVar.a();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        this.f24613c = new rh.l(new iu.l() { // from class: gh.k0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return OneTimeCodeSelectViewDelegate.d(this.f51312a, (rq.c) obj);
            }
        });
        this.f24611a.f74560c.setHasFixedSize(true);
        this.f24611a.f74559b.setOnClickListener(new View.OnClickListener() { // from class: gh.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneTimeCodeSelectViewDelegate.e(this.f51316a, view);
            }
        });
        RecyclerView recyclerView = this.f24611a.f74560c;
        rh.l lVar = this.f24613c;
        if (lVar == null) {
            ju.t.t("adapter");
            lVar = null;
        }
        recyclerView.setAdapter(lVar);
        Context context = this.f24611a.b().getContext();
        ju.t.e(context, "getContext(...)");
        OneTimeCodeSelectManager oneTimeCodeSelectManager = new OneTimeCodeSelectManager(context);
        this.f24614d = oneTimeCodeSelectManager;
        this.f24611a.f74560c.setLayoutManager(oneTimeCodeSelectManager);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.m mVar) {
        ju.t.f(mVar, "step");
        f(mVar.a());
        if (mVar.a().isEmpty()) {
            this.f24612b.b3();
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        this.f24611a.f74559b.setEnabled(false);
        this.f24611a.f74560c.setEnabled(false);
        rh.l lVar = this.f24613c;
        rh.l lVar2 = null;
        if (lVar == null) {
            ju.t.t("adapter");
            lVar = null;
        }
        lVar.O(false);
        rh.l lVar3 = this.f24613c;
        if (lVar3 == null) {
            ju.t.t("adapter");
            lVar3 = null;
        }
        rh.l lVar4 = this.f24613c;
        if (lVar4 == null) {
            ju.t.t("adapter");
        } else {
            lVar2 = lVar4;
        }
        lVar3.t(0, lVar2.i());
    }
}
