package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.contracts.portforwardingwizard.v;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dq.b0;
import eq.b0;
import iu.p;
import java.util.List;
import java.util.UUID;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingTypeSelectorPresenter extends MvpPresenter<v> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37713b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37714c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37715a = com.server.auditor.ssh.client.utils.analytics.a.y();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingTypeSelectorPresenter f37718c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, PortForwardingTypeSelectorPresenter portForwardingTypeSelectorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37717b = i10;
            this.f37718c = portForwardingTypeSelectorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f37717b, this.f37718c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37716a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int i10 = this.f37717b;
            if (i10 == 0) {
                this.f37718c.getViewState().He();
            } else if (i10 == 1) {
                this.f37718c.getViewState().D8();
            } else if (i10 == 2) {
                this.f37718c.getViewState().G6();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37719a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingTypeSelectorPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37719a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingTypeSelectorPresenter.this.getViewState().a();
            PortForwardingTypeSelectorPresenter.this.getViewState().L9();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingTypeSelectorPresenter f37723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, PortForwardingTypeSelectorPresenter portForwardingTypeSelectorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37722b = i10;
            this.f37723c = portForwardingTypeSelectorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f37722b, this.f37723c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37721a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().y3();
            int i10 = this.f37722b;
            if (i10 == 0) {
                this.f37723c.getViewState().A4(0);
            } else if (i10 == 1) {
                this.f37723c.getViewState().A4(1);
            } else if (i10 == 2) {
                this.f37723c.getViewState().A4(2);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingTypeSelectorPresenter f37726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, PortForwardingTypeSelectorPresenter portForwardingTypeSelectorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37725b = i10;
            this.f37726c = portForwardingTypeSelectorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f37725b, this.f37726c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37724a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int i10 = this.f37725b;
            if (i10 == 0) {
                this.f37726c.getViewState().L9();
            } else if (i10 == 1) {
                this.f37726c.getViewState().g7();
            } else if (i10 == 2) {
                this.f37726c.getViewState().Pc();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37727a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingTypeSelectorPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37727a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = UUID.randomUUID().toString();
            t.e(string, "toString(...)");
            PortForwardingTypeSelectorPresenter.this.f37715a.J0(new wp.a(Avo.ChangeVaultAction.MOVE, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.PORT_FORWARDING_RULE, string, Avo.ChangeToVault.NOT_MINUSPERSONAL, Avo.CurrentVault.PERSONAL));
            PortForwardingTypeSelectorPresenter.this.f37715a.V4();
            PortForwardingTypeSelectorPresenter.this.f37715a.L4(Avo.OpenedFrom.EDIT_PORT_FORWARDING, string);
            PortForwardingTypeSelectorPresenter.this.getViewState().R6(vt.v.o(), string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f37730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingTypeSelectorPresenter f37731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(VaultKeyId vaultKeyId, PortForwardingTypeSelectorPresenter portForwardingTypeSelectorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37730b = vaultKeyId;
            this.f37731c = portForwardingTypeSelectorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f37730b, this.f37731c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            this.f37731c.getViewState().B(b0.f48942a.d(com.server.auditor.ssh.client.ui.vaults.data.a.e(this.f37730b), "Move"));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37732a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f37734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f37734c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingTypeSelectorPresenter.this.new h(this.f37734c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37732a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingTypeSelectorPresenter.this.getViewState().p0(this.f37734c.f());
            PortForwardingTypeSelectorPresenter.this.getViewState().I();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37736b;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingTypeSelectorPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            v vVar;
            Object objF = au.b.f();
            int i10 = this.f37736b;
            if (i10 == 0) {
                x.b(obj);
                v viewState = PortForwardingTypeSelectorPresenter.this.getViewState();
                b0.a aVar = dq.b0.f47897a;
                this.f37735a = viewState;
                this.f37736b = 1;
                Object objD = aVar.d(this);
                if (objD == objF) {
                    return objF;
                }
                vVar = viewState;
                obj = objD;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = (v) this.f37735a;
                x.b(obj);
            }
            vVar.w2((List) obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void r2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(i10, this, null), 3, null);
    }

    public final void s2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(i10, this, null), 3, null);
    }

    public final void t2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(i10, this, null), 3, null);
    }

    public final void u2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void v2(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(vaultKeyId, this, null), 3, null);
    }

    public final void w2(qq.a aVar) {
        t.f(aVar, "vaultFlowData");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(aVar, null), 3, null);
    }

    public final void x2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }
}
