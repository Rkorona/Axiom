package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingRemoteHostScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static PortForwardingRemoteHostScreenViewModel composeViewModel;
    public PortForwardingWizardData wizardData;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingRemoteHostScreenViewModel a() {
            return PortForwardingRemoteHostScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingRemoteHostScreenViewModel portForwardingRemoteHostScreenViewModel) {
            PortForwardingRemoteHostScreenViewModel.composeViewModel = portForwardingRemoteHostScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34415a;

            public a(Object obj) {
                ju.t.f(obj, "route");
                this.f34415a = obj;
            }

            public final Object a() {
                return this.f34415a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34415a, ((a) obj).f34415a);
            }

            public int hashCode() {
                return this.f34415a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34415a + ")";
            }
        }
    }

    public final PortForwardingWizardData getWizardData() {
        PortForwardingWizardData portForwardingWizardData = this.wizardData;
        if (portForwardingWizardData != null) {
            return portForwardingWizardData;
        }
        ju.t.t("wizardData");
        return null;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setWizardData(PortForwardingWizardData portForwardingWizardData) {
        ju.t.f(portForwardingWizardData, "<set-?>");
        this.wizardData = portForwardingWizardData;
    }
}
