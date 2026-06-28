package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.m;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import iu.p;
import ju.k;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import vk.q0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseConfigEditorPresenter<T extends m> extends MvpPresenter<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35237d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35238e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35240b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VaultKeyId f35239a = VaultKeyId.Companion.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35241c = com.server.auditor.ssh.client.app.a.N();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35242a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35242a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BaseConfigEditorPresenter.this.f35240b = false;
            BaseConfigEditorPresenter.this.B2(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35244a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35244a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BaseConfigEditorPresenter.this.f35240b = true;
            BaseConfigEditorPresenter.this.B2(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseConfigEditorPresenter f35248c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, BaseConfigEditorPresenter baseConfigEditorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35247b = z10;
            this.f35248c = baseConfigEditorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f35247b, this.f35248c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35246a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!this.f35247b) {
                ((m) this.f35248c.getViewState()).I0();
            } else if (this.f35248c.f35240b || !this.f35248c.y2()) {
                ((m) this.f35248c.getViewState()).de();
            } else {
                ((m) this.f35248c.getViewState()).h2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35249a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f35251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f35251c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f35251c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35249a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BaseConfigEditorPresenter.this.C2(this.f35251c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y2() {
        q0 q0Var = q0.f83536a;
        ug.c cVarQ = this.f35241c.Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        return q0Var.i(cVarQ);
    }

    public final void A2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void B2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(z10, this, null), 3, null);
    }

    protected final void C2(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<set-?>");
        this.f35239a = vaultKeyId;
    }

    public final void D2(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(vaultKeyId, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void t2(m mVar) {
        super.attachView(mVar);
        this.f35240b = false;
    }

    protected final String u2(String str) {
        t.f(str, "password");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("•");
        }
        String string = sb2.toString();
        t.e(string, "toString(...)");
        return string;
    }

    protected final VaultKeyId v2() {
        return this.f35239a;
    }

    public final boolean w2() {
        return x2();
    }

    protected abstract boolean x2();

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}
