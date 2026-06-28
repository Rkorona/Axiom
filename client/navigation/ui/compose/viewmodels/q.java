package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;

/* JADX INFO: loaded from: classes3.dex */
public interface q {

    public static final class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HostsNavGraphRoute f34976a;

        public a(HostsNavGraphRoute hostsNavGraphRoute) {
            ju.t.f(hostsNavGraphRoute, "route");
            this.f34976a = hostsNavGraphRoute;
        }

        public final HostsNavGraphRoute a() {
            return this.f34976a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ju.t.b(this.f34976a, ((a) obj).f34976a);
        }

        public int hashCode() {
            return this.f34976a.hashCode();
        }

        public String toString() {
            return "OnRouteRequest(route=" + this.f34976a + ")";
        }
    }

    public static final class b implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.server.auditor.ssh.client.navigation.ui.compose.c f34977a;

        public b(com.server.auditor.ssh.client.navigation.ui.compose.c cVar) {
            ju.t.f(cVar, "mode");
            this.f34977a = cVar;
        }

        public final com.server.auditor.ssh.client.navigation.ui.compose.c a() {
            return this.f34977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ju.t.b(this.f34977a, ((b) obj).f34977a);
        }

        public int hashCode() {
            return this.f34977a.hashCode();
        }

        public String toString() {
            return "OnTopBarModeChange(mode=" + this.f34977a + ")";
        }
    }
}
