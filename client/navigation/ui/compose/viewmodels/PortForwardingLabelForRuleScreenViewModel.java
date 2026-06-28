package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import wu.i0;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLabelForRuleScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingLabelForRuleScreenViewModel composeViewModel;
    private final zu.w _screenTitle = m0.a("");
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingLabelForRuleScreenViewModel a() {
            return PortForwardingLabelForRuleScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingLabelForRuleScreenViewModel portForwardingLabelForRuleScreenViewModel) {
            PortForwardingLabelForRuleScreenViewModel.composeViewModel = portForwardingLabelForRuleScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34406a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34406a = obj;
            }

            public final Object a() {
                return this.f34406a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34406a, ((a) obj).f34406a);
            }

            public int hashCode() {
                return this.f34406a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34406a + ")";
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34407a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34409c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f34409c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLabelForRuleScreenViewModel.this.new c(this.f34409c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34407a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLabelForRuleScreenViewModel.this._screenTitle.setValue(this.f34409c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public final k0 getScreenTitle() {
        return this._screenTitle;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateTitle(String str) {
        ju.t.f(str, "title");
        wu.k.d(j1.a(this), null, null, new c(str, null), 3, null);
    }
}
