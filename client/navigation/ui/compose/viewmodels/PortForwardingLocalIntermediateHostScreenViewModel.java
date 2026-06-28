package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLocalIntermediateHostScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingLocalIntermediateHostScreenViewModel composeViewModel;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingLocalIntermediateHostScreenViewModel a() {
            return PortForwardingLocalIntermediateHostScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingLocalIntermediateHostScreenViewModel portForwardingLocalIntermediateHostScreenViewModel) {
            PortForwardingLocalIntermediateHostScreenViewModel.composeViewModel = portForwardingLocalIntermediateHostScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34411a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34411a = obj;
            }

            public final Object a() {
                return this.f34411a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34411a, ((a) obj).f34411a);
            }

            public int hashCode() {
                return this.f34411a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34411a + ")";
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
