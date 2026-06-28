package com.server.auditor.ssh.client.fragments.connection;

import androidx.compose.runtime.l5;
import androidx.compose.runtime.w;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j3;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import com.server.auditor.ssh.client.ui.authbanner.domain.AuthBannerViewModel;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg.s f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AuthBannerViewModel f24617c;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.connection.a$a, reason: collision with other inner class name */
    static final class C0392a implements iu.p {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.connection.a$a$a, reason: collision with other inner class name */
        static final class C0393a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f24619a;

            C0393a(a aVar) {
                this.f24619a = aVar;
            }

            private static final String d(l5 l5Var) {
                return (String) l5Var.getValue();
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(-1799683294, i10, -1, "com.server.auditor.ssh.client.fragments.connection.AuthBannerViewDelegate.initViews.<anonymous>.<anonymous>.<anonymous> (AuthBannerViewDelegate.kt:72)");
                }
                gh.k.e(d(f5.a.b(this.f24619a.f24617c.getBannerMessage(), null, null, null, mVar, 0, 7)), mVar, 0);
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

        C0392a() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(-1601984730, i10, -1, "com.server.auditor.ssh.client.fragments.connection.AuthBannerViewDelegate.initViews.<anonymous>.<anonymous> (AuthBannerViewDelegate.kt:71)");
            }
            qk.d.d(false, q1.h.d(-1799683294, true, new C0393a(a.this), mVar, 54), mVar, 48, 1);
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

    public a(qg.s sVar, NewConnectionFlowPresenter newConnectionFlowPresenter, AuthBannerViewModel authBannerViewModel) {
        ju.t.f(sVar, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        ju.t.f(authBannerViewModel, "viewModel");
        this.f24615a = sVar;
        this.f24616b = newConnectionFlowPresenter;
        this.f24617c = authBannerViewModel;
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
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.c cVar) {
        ju.t.f(cVar, "step");
        this.f24617c.updateBannerMessage(cVar.a());
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        ComposeView composeView = this.f24615a.f73756c;
        composeView.setViewCompositionStrategy(j3.c.f6604b);
        composeView.setContent(q1.h.b(-1601984730, true, new C0392a()));
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        c.a.a(this);
    }

    public /* synthetic */ a(qg.s sVar, NewConnectionFlowPresenter newConnectionFlowPresenter, AuthBannerViewModel authBannerViewModel, int i10, ju.k kVar) {
        this(sVar, newConnectionFlowPresenter, (i10 & 4) != 0 ? new AuthBannerViewModel() : authBannerViewModel);
    }
}
