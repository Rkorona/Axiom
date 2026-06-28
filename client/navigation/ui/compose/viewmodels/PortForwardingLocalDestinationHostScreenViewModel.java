package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLocalDestinationHostScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingLocalDestinationHostScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingLocalDestinationHostScreenViewModel a() {
            return PortForwardingLocalDestinationHostScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingLocalDestinationHostScreenViewModel portForwardingLocalDestinationHostScreenViewModel) {
            PortForwardingLocalDestinationHostScreenViewModel.composeViewModel = portForwardingLocalDestinationHostScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34410a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34410a = obj;
            }

            public final Object a() {
                return this.f34410a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34410a, ((a) obj).f34410a);
            }

            public int hashCode() {
                return this.f34410a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34410a + ")";
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
