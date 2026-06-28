package com.server.auditor.ssh.client.navigation.ui.compose.knownhosts;

import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.KnownHost;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class KnownHostInfoViewScreenViewModel extends FragmentWrapperViewModel<b, Object> {
    private static KnownHostInfoViewScreenViewModel composeViewModel;
    public KnownHost knownHost;
    private final List<Host> targetHosts = new ArrayList();
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final KnownHostInfoViewScreenViewModel a() {
            return KnownHostInfoViewScreenViewModel.composeViewModel;
        }

        public final void b(KnownHostInfoViewScreenViewModel knownHostInfoViewScreenViewModel) {
            KnownHostInfoViewScreenViewModel.composeViewModel = knownHostInfoViewScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f32554a;

            public a(long j10) {
                this.f32554a = j10;
            }

            public final long a() {
                return this.f32554a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f32554a == ((a) obj).f32554a;
            }

            public int hashCode() {
                return Long.hashCode(this.f32554a);
            }

            public String toString() {
                return "OnShowHostEditorRequest(hostId=" + this.f32554a + ")";
            }
        }
    }

    public final KnownHost getKnownHost() {
        KnownHost knownHost = this.knownHost;
        if (knownHost != null) {
            return knownHost;
        }
        ju.t.t("knownHost");
        return null;
    }

    public final List<Host> getTargetHosts() {
        return this.targetHosts;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setKnownHost(KnownHost knownHost) {
        ju.t.f(knownHost, "<set-?>");
        this.knownHost = knownHost;
    }
}
