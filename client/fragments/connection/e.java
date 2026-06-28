package com.server.auditor.ssh.client.fragments.connection;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.w;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j3;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import gh.o1;
import qg.u0;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24659b;

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f24661b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.connection.e$a$a, reason: collision with other inner class name */
        static final class C0395a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f24663b;

            C0395a(String str, Context context) {
                this.f24662a = str;
                this.f24663b = context;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(-425210272, i10, -1, "com.server.auditor.ssh.client.fragments.connection.ConnectionLogsViewDelegate.setTroubleShootingContent.<anonymous>.<anonymous>.<anonymous> (ConnectionLogsViewDelegate.kt:59)");
                }
                String str = this.f24662a;
                String string = this.f24663b.getString(R.string.troubleshooting_start_segment);
                ju.t.e(string, "getString(...)");
                String string2 = this.f24663b.getString(R.string.troubleshooting_link_segment);
                ju.t.e(string2, "getString(...)");
                String string3 = this.f24663b.getString(R.string.troubleshooting_finish_segment);
                ju.t.e(string3, "getString(...)");
                o1.b(str, string, string2, string3, mVar, 0);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return m0.f82633a;
            }
        }

        a(String str, Context context) {
            this.f24660a = str;
            this.f24661b = context;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(1459194844, i10, -1, "com.server.auditor.ssh.client.fragments.connection.ConnectionLogsViewDelegate.setTroubleShootingContent.<anonymous>.<anonymous> (ConnectionLogsViewDelegate.kt:58)");
            }
            qk.d.d(false, q1.h.d(-425210272, true, new C0395a(this.f24660a, this.f24661b), mVar, 54), mVar, 48, 1);
            if (w.R()) {
                w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            e.this.f24658a.f74006d.fullScroll(130);
        }
    }

    public e(u0 u0Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(u0Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24658a = u0Var;
        this.f24659b = newConnectionFlowPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar, View view) {
        eVar.f24659b.w3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, View view) {
        eVar.f24659b.R2();
    }

    private final void g(ComposeView composeView) {
        Context context = composeView.getContext();
        String string = context.getString(R.string.connection_troubleshooting_page_url);
        ju.t.e(string, "getString(...)");
        composeView.setViewCompositionStrategy(j3.c.f6604b);
        composeView.setContent(q1.h.b(1459194844, true, new a(string, context)));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        c.a.b(this);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        MaterialButton materialButton = this.f24658a.f74007e;
        ju.t.e(materialButton, "editHostButton");
        materialButton.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        ju.t.f(aVar, "callback");
        aVar.a();
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        this.f24658a.f74010h.setOnClickListener(new View.OnClickListener() { // from class: gh.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.e.e(this.f51339a, view);
            }
        });
        this.f24658a.f74007e.setOnClickListener(new View.OnClickListener() { // from class: gh.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.e.f(this.f51342a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.g gVar) {
        ju.t.f(gVar, "step");
        this.f24658a.f74010h.setEnabled(gVar.a());
        this.f24658a.f74005c.setText(gVar.b());
        ComposeView composeView = this.f24658a.f74013k;
        ju.t.e(composeView, "troubleshootingDoc");
        g(composeView);
        this.f24659b.H3();
        ComposeView composeView2 = this.f24658a.f74013k;
        ju.t.e(composeView2, "troubleshootingDoc");
        if (!composeView2.isLaidOut() || composeView2.isLayoutRequested()) {
            composeView2.addOnLayoutChangeListener(new b());
        } else {
            this.f24658a.f74006d.fullScroll(130);
        }
        if (gVar.c()) {
            this.f24658a.f74007e.requestFocus();
        } else {
            this.f24658a.f74010h.requestFocus();
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        c.a.a(this);
    }
}
