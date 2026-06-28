package com.server.auditor.ssh.client.presenters.account;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.models.UserType;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.handleresponse.SyncCallbackResultReceiver;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import il.u0;
import jj.a;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountStartScreenPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.account.d> implements a.InterfaceC0928a, SyncCallbackResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncServiceHelper f36241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f36246f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final hg.d f36247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.f0 f36248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final jj.a f36249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final jl.c f36250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final zu.f f36251y;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36252a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.account.AccountStartScreenPresenter$a$a, reason: collision with other inner class name */
        static final class C0576a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f36254a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AccountStartScreenPresenter f36255b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.account.AccountStartScreenPresenter$a$a$a, reason: collision with other inner class name */
            static final class C0577a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ AccountStartScreenPresenter f36256a;

                C0577a(AccountStartScreenPresenter accountStartScreenPresenter) {
                    this.f36256a = accountStartScreenPresenter;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Boolean bool, zt.e eVar) {
                    if (bool.booleanValue()) {
                        this.f36256a.getViewState().T2(false);
                        this.f36256a.getViewState().m8(false);
                        this.f36256a.getViewState().e8();
                        return ut.m0.f82633a;
                    }
                    this.f36256a.getViewState().s5();
                    this.f36256a.getViewState().T2(true);
                    this.f36256a.getViewState().m8(true);
                    Object objA2 = this.f36256a.A2(eVar);
                    return objA2 == au.b.f() ? objA2 : ut.m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0576a(AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
                super(2, eVar);
                this.f36255b = accountStartScreenPresenter;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new C0576a(this.f36255b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f36254a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.f fVar = this.f36255b.f36251y;
                    C0577a c0577a = new C0577a(this.f36255b);
                    this.f36254a = 1;
                    if (fVar.collect(c0577a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((C0576a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36252a;
            if (i10 == 0) {
                ut.x.b(obj);
                AccountStartScreenPresenter.this.C2().addListener(AccountStartScreenPresenter.this);
                C0576a c0576a = new C0576a(AccountStartScreenPresenter.this, null);
                this.f36252a = 1;
                if (wu.j0.e(c0576a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36257a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, zt.e eVar) {
            super(2, eVar);
            this.f36259c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new a0(this.f36259c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().Q1(this.f36259c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f36260a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -377587536;
            }

            public String toString() {
                return "Contextual";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.account.AccountStartScreenPresenter$b$b, reason: collision with other inner class name */
        public static final class C0578b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0578b f36261a = new C0578b();

            private C0578b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0578b);
            }

            public int hashCode() {
                return 1418489154;
            }

            public String toString() {
                return VariablesConverter.CLIENT_COLOR_SCHEME_DEFAULT;
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f36262a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1263770222;
            }

            public String toString() {
                return "Invisible";
            }
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36263a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().Ca();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36266b = z10;
            this.f36267c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f36266b, this.f36267c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f36266b) {
                this.f36267c.getViewState().p5();
            } else {
                this.f36267c.getViewState().l6();
                this.f36267c.f36249w.m();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f36269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(Bundle bundle, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36269b = bundle;
            this.f36270c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c0(this.f36269b, this.f36270c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Bundle bundle = this.f36269b;
            if (bundle == null) {
                return ut.m0.f82633a;
            }
            String string = bundle.getString(SyncConstants.Bundle.ACTION);
            if (string == null) {
                string = "";
            }
            if (ju.t.b(string, SyncConstants.Actions.ACTION_LOGOUT)) {
                this.f36270c.getViewState().p();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36272b = z10;
            this.f36273c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f36272b, this.f36273c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f36272b) {
                this.f36273c.getViewState().Ad();
            } else {
                this.f36273c.getViewState().Qb();
                this.f36273c.f36249w.m();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36274a;

        d0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new d0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36274a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().Kb();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36277b = i10;
            this.f36278c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f36277b, this.f36278c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f36277b == 1001) {
                this.f36278c.getViewState().p();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36279a;

        e0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new e0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36279a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().q();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36281a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().p();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36283a;

        f0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new f0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36283a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().q();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36285a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36285a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.a(true);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36287a;

        g0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new g0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().r8();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36289a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().S9();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36291a;

        h0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new h0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36291a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().r6();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36294b = i10;
            this.f36295c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f36294b, this.f36295c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36293a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f36294b == 1001) {
                this.f36295c.f36249w.f();
                this.f36295c.f36249w.h();
                this.f36295c.d2(false);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36296a;

        i0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new i0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().vb();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36298a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36298a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (AccountStartScreenPresenter.this.f36246f.u0() || AccountStartScreenPresenter.this.f36246f.p0()) {
                AccountStartScreenPresenter.this.getViewState().C5();
            } else {
                AccountStartScreenPresenter.this.getViewState().u7(105);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36300a;

        j0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new j0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().f9();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36303b = i10;
            this.f36304c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f36303b, this.f36304c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f36303b == 1001) {
                this.f36304c.f36249w.g();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36305a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36307c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f36307c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new k0(this.f36307c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36305a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().gb(this.f36307c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36308a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f36310c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new l(this.f36310c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36308a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.n(this.f36310c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36311a;

        l0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new l0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (AccountStartScreenPresenter.this.f36246f.u0()) {
                hg.f.p().Y().startFullSync();
            } else {
                AccountStartScreenPresenter.this.getViewState().u7(105);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36313a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().l8();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36315a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f36317c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new m0(this.f36317c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36315a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.e(this.f36317c);
            int i10 = this.f36317c;
            if (i10 != 1001) {
                switch (i10) {
                    case 611834:
                        AccountStartScreenPresenter.this.getViewState().l6();
                        break;
                    case 611835:
                        AccountStartScreenPresenter.this.getViewState().Qb();
                        break;
                }
            } else {
                AccountStartScreenPresenter.this.getViewState().p();
            }
            AccountStartScreenPresenter.this.f36249w.m();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36318a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.j();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36320a;

        n0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new n0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36320a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.d();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36322a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36322a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().Ma();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36324a;

        o0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new o0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36324a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36245e.d6(Avo.From.ACCOUNT, com.server.auditor.ssh.client.app.a.N().r0());
            AccountStartScreenPresenter.this.f36245e.c6(Avo.UpgradeButtonLocation.ACCOUNT_PAGE);
            AccountStartScreenPresenter.this.getViewState().o();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36326a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DialogInterface f36328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(DialogInterface dialogInterface, zt.e eVar) {
            super(2, eVar);
            this.f36328c = dialogInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new p(this.f36328c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36326a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.l();
            AccountStartScreenPresenter.this.getViewState().Ya(this.f36328c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserType f36330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountStartScreenPresenter f36331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(UserType userType, AccountStartScreenPresenter accountStartScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36330b = userType;
            this.f36331c = accountStartScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p0(this.f36330b, this.f36331c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36329a;
            if (i10 == 0) {
                ut.x.b(obj);
                UserType userType = this.f36330b;
                if (userType instanceof UserType.Starter) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = true;
                    this.f36331c.getViewState().uc(((UserType.Starter) this.f36330b).getTitle());
                } else if (userType instanceof UserType.Pro) {
                    this.f36331c.f36244d = true;
                    boolean zIsExpired = ((UserType.Pro) this.f36330b).isExpired();
                    this.f36331c.f36243c = zIsExpired;
                    this.f36331c.getViewState().X2(((UserType.Pro) this.f36330b).getTitle(), !zIsExpired);
                } else if (userType instanceof UserType.BusinessTrialOwner) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = true;
                    this.f36331c.getViewState().x6(((UserType.BusinessTrialOwner) this.f36330b).getTitle(), ((UserType.BusinessTrialOwner) this.f36330b).getSubscriptionPeriod());
                } else if (userType instanceof UserType.ProTrial) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = true;
                    this.f36331c.getViewState().q6(((UserType.ProTrial) this.f36330b).getTitle(), ((UserType.ProTrial) this.f36330b).getSubscriptionPeriod());
                } else if (userType instanceof UserType.TeamMember) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = false;
                    this.f36331c.getViewState().R7(((UserType.TeamMember) this.f36330b).getTitle(), this.f36331c.f36248v.a());
                } else if (userType instanceof UserType.TeamOwner) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = false;
                    this.f36331c.getViewState().wb(((UserType.TeamOwner) this.f36330b).getTitle());
                } else if (userType instanceof UserType.BusinessTeamMember) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = false;
                    this.f36331c.getViewState().j3(((UserType.BusinessTeamMember) this.f36330b).getTitle(), this.f36331c.f36248v.a());
                } else if (userType instanceof UserType.BusinessTeamOwner) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = false;
                    this.f36331c.getViewState().A6(((UserType.BusinessTeamOwner) this.f36330b).getTitle());
                } else if (userType instanceof UserType.TrialWithPro) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = false;
                    this.f36331c.getViewState().U7(((UserType.TrialWithPro) this.f36330b).getTrialUserType().getTitle(), ((UserType.TrialWithPro) this.f36330b).getTrialUserType().getSubscriptionPeriod());
                } else if (userType instanceof UserType.GitHubStudent) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = true;
                    this.f36331c.getViewState().A3(((UserType.GitHubStudent) this.f36330b).getTitle());
                } else if (userType instanceof UserType.GitHubTeacher) {
                    this.f36331c.f36244d = true;
                    this.f36331c.f36243c = true;
                    this.f36331c.getViewState().nd(((UserType.GitHubTeacher) this.f36330b).getTitle());
                } else if (userType instanceof UserType.Enterprise) {
                    this.f36331c.f36243c = false;
                    this.f36331c.f36244d = false;
                    this.f36331c.getViewState().ee(((UserType.Enterprise) this.f36330b).getSubscriptionTitle(), ((UserType.Enterprise) this.f36330b).getOrganizationName());
                    this.f36331c.getViewState().R2(b.c.f36262a);
                } else {
                    if (!ju.t.b(userType, UserType.Undefined.INSTANCE)) {
                        throw new ut.s();
                    }
                    if (this.f36331c.f36246f.r0()) {
                        this.f36331c.f36244d = true;
                        this.f36331c.f36243c = false;
                        this.f36331c.getViewState().F6();
                    } else {
                        this.f36331c.f36244d = false;
                        this.f36331c.f36243c = false;
                    }
                }
                this.f36331c.h3();
                jj.a aVar = this.f36331c.f36249w;
                this.f36329a = 1;
                if (aVar.k(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36332a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36332a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().g5();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f36336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(Uri uri, zt.e eVar) {
            super(2, eVar);
            this.f36336c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new q0(this.f36336c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().K5(this.f36336c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36337a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36337a;
            if (i10 == 0) {
                ut.x.b(obj);
                AccountStartScreenPresenter.this.getViewState().a();
                AccountStartScreenPresenter.this.f36249w.h();
                AccountStartScreenPresenter.this.f36249w.a(false);
                AccountStartScreenPresenter.this.f36249w.i();
                jj.a aVar = AccountStartScreenPresenter.this.f36249w;
                this.f36337a = 1;
                if (aVar.k(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            AccountStartScreenPresenter.this.f36245e.m0();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36339a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(int i10, String str, zt.e eVar) {
            super(2, eVar);
            this.f36341c = i10;
            this.f36342d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new r0(this.f36341c, this.f36342d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().w7(this.f36341c, this.f36342d);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, zt.e eVar) {
            super(2, eVar);
            this.f36345c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new s(this.f36345c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36343a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().ge(this.f36345c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36346a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36346a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36249w.c();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36348a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36348a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
            AccountStartScreenPresenter.this.getViewState().X5(apiKey != null ? apiKey.getUsername() : null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36350a;

        v(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new v(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36242b = false;
            AccountStartScreenPresenter.this.h3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36352a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36242b = true;
            AccountStartScreenPresenter.this.h3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36354a;

        x(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new x(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36354a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.f36243c = false;
            AccountStartScreenPresenter.this.h3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36356a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, zt.e eVar) {
            super(2, eVar);
            this.f36358c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new y(this.f36358c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().S4(this.f36358c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36359a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, zt.e eVar) {
            super(2, eVar);
            this.f36361c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AccountStartScreenPresenter.this.new z(this.f36361c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36359a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AccountStartScreenPresenter.this.getViewState().S7(this.f36361c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountStartScreenPresenter(SyncServiceHelper syncServiceHelper) {
        ju.t.f(syncServiceHelper, "syncServiceHelper");
        this.f36241a = syncServiceHelper;
        this.f36244d = true;
        this.f36245e = com.server.auditor.ssh.client.utils.analytics.a.y();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f36246f = aVarN;
        hg.d dVarM = aVarN.M();
        this.f36247u = dVarM;
        ju.t.e(aVarN, "termiusStorage");
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        this.f36248v = new com.server.auditor.ssh.client.interactors.f0(aVarN, dVarM);
        ju.t.e(aVarN, "termiusStorage");
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        SshConfigDBAdapter sshConfigDBAdapterS = hg.f.p().S();
        ju.t.e(sshConfigDBAdapterS, "getSshConfigDBAdapter(...)");
        SshConfigIdentityDBAdapter sshConfigIdentityDBAdapterU = hg.f.p().U();
        ju.t.e(sshConfigIdentityDBAdapterU, "getSshConfigIdentityDBAdapter(...)");
        TelnetConfigDBAdapter telnetConfigDBAdapterE0 = hg.f.p().e0();
        ju.t.e(telnetConfigDBAdapterE0, "getTelnetConfigDBAdapter(...)");
        TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapterG0 = hg.f.p().g0();
        ju.t.e(telnetConfigIdentityDBAdapterG0, "getTelnetConfigIdentityDBAdapter(...)");
        ProxyDBAdapter proxyDBAdapterB = hg.f.p().B();
        ju.t.e(proxyDBAdapterB, "getProxyDBAdapter(...)");
        il.c cVar = new il.c();
        jl.a aVar = new jl.a(null, 1, 0 == true ? 1 : 0);
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        com.server.auditor.ssh.client.interactors.a0 a0Var = new com.server.auditor.ssh.client.interactors.a0(dVarM);
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        u0 u0Var = new u0(dVarM);
        com.server.auditor.ssh.client.interactors.o oVar = new com.server.auditor.ssh.client.interactors.o();
        com.server.auditor.ssh.client.interactors.q qVar = new com.server.auditor.ssh.client.interactors.q();
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        this.f36249w = new jj.a(aVarN, dVarM, syncServiceHelper, sshConfigDBAdapterS, sshConfigIdentityDBAdapterU, telnetConfigDBAdapterE0, telnetConfigIdentityDBAdapterG0, proxyDBAdapterB, cVar, aVar, a0Var, u0Var, oVar, qVar, new wn.j(dVarM), this);
        ju.t.e(aVarN, "termiusStorage");
        b2 b2Var = b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        hj.f fVar = new hj.f(dVarM);
        ju.t.e(dVarM, "insensitiveKeyValueRepository");
        this.f36250x = new jl.c(aVarN, g0VarY1, fVar, new il.m(dVarM, b2Var.s1()), new com.server.auditor.ssh.client.interactors.a(b2Var.y1()));
        androidx.lifecycle.k0 k0VarP = aVarN.P();
        ju.t.e(k0VarP, "getIsSyncingLiveData(...)");
        this.f36251y = zu.h.q(androidx.lifecycle.m.a(k0VarP));
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A2(zt.e eVar) {
        this.f36249w.d();
        this.f36249w.h();
        this.f36249w.a(false);
        this.f36249w.i();
        this.f36249w.b();
        Object objK = this.f36249w.k(eVar);
        return objK == au.b.f() ? objK : ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3() {
        getViewState().z6(this.f36242b && this.f36243c);
    }

    public final void B2() {
        if (this.f36246f.r0()) {
            return;
        }
        getViewState().p();
    }

    @Override // jj.a.InterfaceC0928a
    public void C1(int i10, String str) {
        ju.t.f(str, "avatarInitials");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r0(i10, str, null), 3, null);
    }

    public final SyncServiceHelper C2() {
        return this.f36241a;
    }

    public final androidx.lifecycle.f0 D2() {
        return this.f36250x.d();
    }

    public final void E2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(i10, this, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void F(String str) {
        ju.t.f(str, "lastTime");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(str, null), 3, null);
    }

    public final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void G2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void H0(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new y(str, null), 3, null);
    }

    public final void H2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void I2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(i10, this, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void J0(Uri uri) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q0(uri, null), 3, null);
    }

    public final void J2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    public final void K2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(i10, this, null), 3, null);
    }

    public final void L2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(z10, null), 3, null);
    }

    public final void M2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void O2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    public final void P2(DialogInterface dialogInterface) {
        ju.t.f(dialogInterface, "dialog");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(dialogInterface, null), 3, null);
    }

    public final void Q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    public final void R2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(null), 3, null);
    }

    public final void S2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new u(null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void T0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f0(null), 3, null);
    }

    public final void T2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new v(null), 3, null);
    }

    public final void U2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new w(null), 3, null);
    }

    public final void V2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new x(null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void W() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e0(null), 3, null);
    }

    public final void W2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b0(null), 3, null);
    }

    public final void X2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d0(null), 3, null);
    }

    public final void Y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g0(null), 3, null);
    }

    public final void Z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h0(null), 3, null);
    }

    public final void a3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i0(null), 3, null);
    }

    public final void b3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j0(null), 3, null);
    }

    public final void c3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l0(null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void d2(boolean z10) {
        getViewState().w6(!z10);
        getViewState().R2(this.f36244d ? z10 ? b.a.f36260a : b.C0578b.f36261a : b.c.f36262a);
        this.f36249w.m();
    }

    public final void d3(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m0(i10, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void e1(String str) {
        ju.t.f(str, "screenTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new z(str, null), 3, null);
    }

    public final void e3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n0(null), 3, null);
    }

    public final void f3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o0(null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void g0(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k0(z10, null), 3, null);
    }

    public final void g3(UserType userType) {
        ju.t.f(userType, "userType");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p0(userType, this, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void m2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(z10, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.synchronization.handleresponse.SyncCallbackResultReceiver
    public void onServiceCallback(int i10, Bundle bundle) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c0(bundle, this, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void p1(String str) {
        ju.t.f(str, "screenTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a0(str, null), 3, null);
    }

    @Override // jj.a.InterfaceC0928a
    public void v(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(z10, this, null), 3, null);
    }
}
