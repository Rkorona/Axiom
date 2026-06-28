package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingIntermediateHostForDynamicRuleScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingIntermediateHostForDynamicRuleScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingIntermediateHostForDynamicRuleScreenViewModel a() {
            return PortForwardingIntermediateHostForDynamicRuleScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingIntermediateHostForDynamicRuleScreenViewModel portForwardingIntermediateHostForDynamicRuleScreenViewModel) {
            PortForwardingIntermediateHostForDynamicRuleScreenViewModel.composeViewModel = portForwardingIntermediateHostForDynamicRuleScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34405a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34405a = obj;
            }

            public final Object a() {
                return this.f34405a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34405a, ((a) obj).f34405a);
            }

            public int hashCode() {
                return this.f34405a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34405a + ")";
            }
        }
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }
}
