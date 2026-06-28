package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingPortAndAddressViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingPortAndAddressViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingPortAndAddressViewModel a() {
            return PortForwardingPortAndAddressViewModel.composeViewModel;
        }

        public final void b(PortForwardingPortAndAddressViewModel portForwardingPortAndAddressViewModel) {
            PortForwardingPortAndAddressViewModel.composeViewModel = portForwardingPortAndAddressViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34413a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34413a = obj;
            }

            public final Object a() {
                return this.f34413a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34413a, ((a) obj).f34413a);
            }

            public int hashCode() {
                return this.f34413a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34413a + ")";
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
