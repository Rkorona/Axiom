package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLocalPortForDynamicViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingLocalPortForDynamicViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingLocalPortForDynamicViewModel a() {
            return PortForwardingLocalPortForDynamicViewModel.composeViewModel;
        }

        public final void b(PortForwardingLocalPortForDynamicViewModel portForwardingLocalPortForDynamicViewModel) {
            PortForwardingLocalPortForDynamicViewModel.composeViewModel = portForwardingLocalPortForDynamicViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34412a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34412a = obj;
            }

            public final Object a() {
                return this.f34412a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34412a, ((a) obj).f34412a);
            }

            public int hashCode() {
                return this.f34412a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34412a + ")";
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
