package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.viewmodels.InAppMessageRouterViewModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppMessageRouterActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f28185a = new androidx.lifecycle.k1(ju.n0.b(InAppMessageRouterViewModel.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ut.n f28186b = ut.o.b(ut.r.f82639c, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.p0
        @Override // iu.a
        public final Object a() {
            return InAppMessageRouterActivity.o0(this.f29332a);
        }
    });

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28187a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f28189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0 n0Var, zt.e eVar) {
            super(2, eVar);
            this.f28189c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return InAppMessageRouterActivity.this.new a(this.f28189c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28187a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            InAppMessageRouterActivity.this.j0().markInAppMessageAsForced(this.f28189c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b implements androidx.lifecycle.l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f28190a;

        b(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f28190a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f28190a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f28190a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class c extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f28191a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f28191a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f28192a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.m1 a() {
            return this.f28192a.getViewModelStore();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f28193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f28193a = aVar;
            this.f28194b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f28193a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f28194b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppMessageRouterViewModel j0() {
        return (InAppMessageRouterViewModel) this.f28185a.getValue();
    }

    private final nj.f k0() {
        return (nj.f) this.f28186b.getValue();
    }

    private final void l0() {
        j0().getInAppMessagesLiveData().j(this, new b(new iu.l() { // from class: com.server.auditor.ssh.client.navigation.o0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return InAppMessageRouterActivity.m0(this.f29329a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m0(InAppMessageRouterActivity inAppMessageRouterActivity, List list) {
        ju.t.c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            inAppMessageRouterActivity.k0().l((n0) it.next());
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nj.f o0(InAppMessageRouterActivity inAppMessageRouterActivity) {
        return inAppMessageRouterActivity.i0();
    }

    public nj.f i0() {
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        il.z zVar = new il.z(aVarY);
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        ju.t.e(cVarQ, "getKeyValueStorage(...)");
        return new nj.f(this, zVar, new wn.g(new jn.g(cVarQ)));
    }

    public final void n0(n0 n0Var) {
        ju.t.f(n0Var, "inAppMessage");
        androidx.lifecycle.a0.a(this).d(new a(n0Var, null));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l0();
    }
}
