package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingRemoteDestinationHostScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingRemoteDestinationHostScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingRemoteDestinationHostScreenViewModel a() {
            return PortForwardingRemoteDestinationHostScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingRemoteDestinationHostScreenViewModel portForwardingRemoteDestinationHostScreenViewModel) {
            PortForwardingRemoteDestinationHostScreenViewModel.composeViewModel = portForwardingRemoteDestinationHostScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34414a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34414a = obj;
            }

            public final Object a() {
                return this.f34414a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34414a, ((a) obj).f34414a);
            }

            public int hashCode() {
                return this.f34414a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34414a + ")";
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
