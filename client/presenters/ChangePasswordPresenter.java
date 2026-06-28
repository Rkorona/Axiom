package com.server.auditor.ssh.client.presenters;

import android.text.Editable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.contracts.g0;
import com.server.auditor.ssh.client.interactors.d1;
import com.server.auditor.ssh.client.models.a0;
import com.server.auditor.ssh.client.presenters.ChangePasswordPresenter;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.retrofit.PasswordBreachApiClientFactory;
import hg.b2;
import ig.d;
import il.c0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jg.l;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.s;
import ut.x;
import vl.b;
import vt.v;
import wu.i0;
import wu.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class ChangePasswordPresenter extends MvpPresenter<g0> implements d.a {
    public static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f35341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f35342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u1 f35344f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private u1 f35345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d1 f35346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final jg.m f35347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final jg.l f35348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final vl.b f35349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ig.d f35350z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35351a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35351a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.I2();
            ChangePasswordPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35353a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f35355c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new c(this.f35355c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35353a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().Cd(this.f35355c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35356a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().E1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35358a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(ChangePasswordPresenter changePasswordPresenter, boolean z10) {
            if (z10) {
                changePasswordPresenter.getViewState().d();
                changePasswordPresenter.getViewState().M9(false);
                changePasswordPresenter.f35350z.O(changePasswordPresenter.f35342d, changePasswordPresenter.f35341c, null);
            } else {
                changePasswordPresenter.getViewState().g();
                changePasswordPresenter.f35340b = false;
            }
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35358a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!ChangePasswordPresenter.this.L2()) {
                ChangePasswordPresenter.this.f35340b = false;
                return m0.f82633a;
            }
            final ChangePasswordPresenter changePasswordPresenter = ChangePasswordPresenter.this;
            tp.d.a(new iu.l() { // from class: com.server.auditor.ssh.client.presenters.a
                @Override // iu.l
                public final Object invoke(Object obj2) {
                    return ChangePasswordPresenter.e.k(changePasswordPresenter, ((Boolean) obj2).booleanValue());
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35360a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35360a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().S1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35362a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35364c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f35364c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new g(this.f35364c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35362a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            if (this.f35364c.length() == 0) {
                ChangePasswordPresenter.this.getViewState().S1();
            } else {
                ChangePasswordPresenter.this.getViewState().k(this.f35364c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35365a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35365a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35367a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35367a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            byte[] bArr = ChangePasswordPresenter.this.f35341c;
            Charset charset = su.d.f78241b;
            ChangePasswordPresenter.this.getViewState().M1(new String(bArr, charset), new String(ChangePasswordPresenter.this.f35342d, charset));
            ChangePasswordPresenter.this.I2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35369a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.I2();
            ChangePasswordPresenter.this.getViewState().n();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35371a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35373c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35373c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new k(this.f35373c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35371a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().m(this.f35373c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35374a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35374a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().e();
            ChangePasswordPresenter.this.getViewState().M9(true);
            ChangePasswordPresenter.this.f35340b = false;
            ChangePasswordPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35376a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35376a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.T2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35378a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35378a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().f1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35380a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f35382c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f35382c = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new o(this.f35382c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter changePasswordPresenter = ChangePasswordPresenter.this;
            changePasswordPresenter.f35342d = changePasswordPresenter.K2(this.f35382c);
            ChangePasswordPresenter.this.U2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35383a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f35385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f35385c = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new p(this.f35385c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35383a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordPresenter.this.getViewState().Hd(null);
            ChangePasswordPresenter changePasswordPresenter = ChangePasswordPresenter.this;
            changePasswordPresenter.f35341c = changePasswordPresenter.K2(this.f35385c);
            ChangePasswordPresenter.this.U2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35386a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35386a;
            if (i10 == 0) {
                x.b(obj);
                ChangePasswordPresenter.this.getViewState().c2(false);
                ChangePasswordPresenter.this.getViewState().f0(false);
                ChangePasswordPresenter.this.getViewState().e1(false);
                ChangePasswordPresenter.this.getViewState().J2(false);
                ChangePasswordPresenter.this.getViewState().K(false);
                ChangePasswordPresenter.this.getViewState().S(true);
                jg.l lVar = ChangePasswordPresenter.this.f35348x;
                byte[] bArr = ChangePasswordPresenter.this.f35342d;
                this.f35386a = 1;
                obj = lVar.d(bArr, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            l.b bVar = (l.b) obj;
            if (t.b(bVar, l.b.a.f61688a)) {
                ChangePasswordPresenter.this.f35343e = 0;
                ChangePasswordPresenter.this.getViewState().V(ChangePasswordPresenter.this.f35343e);
                ChangePasswordPresenter.this.getViewState().E(false);
                ChangePasswordPresenter.this.getViewState().d0();
                ChangePasswordPresenter.this.getViewState().c2(true);
            } else if (t.b(bVar, l.b.d.f61691a)) {
                ChangePasswordPresenter.this.getViewState().U();
                ChangePasswordPresenter.this.getViewState().c2(true);
            } else {
                if (!t.b(bVar, l.b.C0925b.f61689a) && !t.b(bVar, l.b.c.f61690a)) {
                    throw new s();
                }
                ChangePasswordPresenter.this.getViewState().L();
            }
            ChangePasswordPresenter.this.getViewState().S(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35388a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordPresenter.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35388a;
            boolean z10 = false;
            if (i10 == 0) {
                x.b(obj);
                ChangePasswordPresenter.this.getViewState().c2(false);
                ChangePasswordPresenter.this.getViewState().S(false);
                jg.m mVar = ChangePasswordPresenter.this.f35347w;
                byte[] bArr = ChangePasswordPresenter.this.f35342d;
                String str = ChangePasswordPresenter.this.f35339a;
                ChangePasswordPresenter changePasswordPresenter = ChangePasswordPresenter.this;
                List listR = v.r(str, changePasswordPresenter.J2(changePasswordPresenter.f35341c));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listR) {
                    if (!su.s.m0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                this.f35388a = 1;
                obj = mVar.e(bArr, arrayList, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            com.server.auditor.ssh.client.models.n nVar = (com.server.auditor.ssh.client.models.n) obj;
            ChangePasswordPresenter.this.f35343e = nVar.a();
            ChangePasswordPresenter.this.getViewState().V(ChangePasswordPresenter.this.f35343e);
            ChangePasswordPresenter.this.getViewState().E(ChangePasswordPresenter.this.L2());
            String str2 = (String) v.r0(nVar.c());
            if (str2 != null) {
                ChangePasswordPresenter.this.getViewState().Q(str2);
            }
            ChangePasswordPresenter.this.getViewState().f0(str2 != null);
            String str3 = (String) v.s0(nVar.b(), 0);
            String str4 = (String) v.s0(nVar.b(), 1);
            if (str3 != null) {
                ChangePasswordPresenter.this.getViewState().u0(str3);
            }
            if (str4 != null) {
                ChangePasswordPresenter.this.getViewState().z2(str4);
            }
            ChangePasswordPresenter.this.getViewState().e1(str3 != null);
            ChangePasswordPresenter.this.getViewState().J2(str4 != null);
            g0 viewState = ChangePasswordPresenter.this.getViewState();
            if (nVar.c().isEmpty() && nVar.b().isEmpty() && ChangePasswordPresenter.this.M2()) {
                z10 = true;
            }
            viewState.K(z10);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangePasswordPresenter() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        String username = apiKey != null ? apiKey.getUsername() : null;
        this.f35339a = username == null ? "" : username;
        this.f35341c = new byte[0];
        this.f35342d = new byte[0];
        this.f35346v = new d1();
        this.f35347w = new jg.m();
        c0 c0Var = new c0(new PasswordBreachApiClientFactory(), b2.f52944a.B1());
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.f35348x = new jg.l(c0Var, aVarY);
        this.f35349y = b.a.b(vl.b.f83635b, null, 1, null);
        this.f35350z = new ig.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        getViewState().M();
        Arrays.fill(this.f35341c, (byte) 0);
        Arrays.fill(this.f35342d, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J2(byte[] bArr) {
        char[] cArrB = rg.l.b(rg.l.j(new String(bArr, su.d.f78241b)));
        t.c(cArrB);
        return new String(cArrB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] K2(Editable editable) {
        if (editable == null || su.s.m0(editable)) {
            return new byte[0];
        }
        char[] cArr = new char[editable.length()];
        editable.getChars(0, editable.length(), cArr, 0);
        byte[] bArrE = rg.l.e(cArr);
        Arrays.fill(cArr, (char) 0);
        char[] cArrD = rg.l.d(bArrE);
        Arrays.fill(bArrE, (byte) 0);
        byte[] bArrE2 = rg.l.e(cArrD);
        Arrays.fill(cArrD, (char) 0);
        t.c(bArrE2);
        return bArrE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L2() {
        List listR = v.r(this.f35346v.a(this.f35341c), this.f35346v.a(this.f35342d));
        if (listR == null || !listR.isEmpty()) {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if (!((a0) it.next()).b()) {
                    return false;
                }
            }
        }
        return M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M2() {
        return this.f35343e >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2() {
        u1 u1Var = this.f35345u;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f35345u = wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        u1 u1Var = this.f35345u;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        u1 u1Var2 = this.f35344f;
        if (u1Var2 != null) {
            u1.a.a(u1Var2, null, 1, null);
        }
        this.f35344f = wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(null), 3, null);
    }

    @Override // ig.d.a
    public void C() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void O2() {
        if (this.f35340b) {
            return;
        }
        this.f35340b = true;
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void P2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    public final void Q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void R2(Editable editable) {
        if (this.f35340b) {
            return;
        }
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(editable, null), 3, null);
    }

    @Override // ig.d.a
    public void S0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void S2(Editable editable) {
        if (this.f35340b) {
            return;
        }
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(editable, null), 3, null);
    }

    @Override // ig.d.a
    public void V1(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(i10, null), 3, null);
    }

    @Override // ig.d.a
    public void a1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // ig.d.a
    public void b1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    @Override // ig.d.a
    public void i1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // ig.d.a
    public void n1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        I2();
        this.f35350z.f();
        super.onDestroy();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // ig.d.a
    public void v1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    @Override // ig.d.a
    public void x0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }
}
