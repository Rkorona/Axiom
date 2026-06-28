package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import java.util.UUID;
import ut.m0;
import wu.i0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingRuleEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static PortForwardingRuleEditorScreenViewModel composeViewModel;
    private final zu.w _isSaveEnabled;
    private final String uniqueId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PortForwardingRuleEditorScreenViewModel a() {
            return PortForwardingRuleEditorScreenViewModel.composeViewModel;
        }

        public final void b(PortForwardingRuleEditorScreenViewModel portForwardingRuleEditorScreenViewModel) {
            PortForwardingRuleEditorScreenViewModel.composeViewModel = portForwardingRuleEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34416a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1040787779;
            }

            public String toString() {
                return "OnInfoPressed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingRuleEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0546b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0546b f34417a = new C0546b();

            private C0546b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0546b);
            }

            public int hashCode() {
                return -591882860;
            }

            public String toString() {
                return "OnSavePressed";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34418a;

            public c(long j10) {
                this.f34418a = j10;
            }

            public final long a() {
                return this.f34418a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f34418a == ((c) obj).f34418a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34418a);
            }

            public String toString() {
                return "OnSelectedHostResult(selectedHostId=" + this.f34418a + ")";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34419a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -2014689710;
            }

            public String toString() {
                return "OnFinishFlow";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34420a;

            public b(Object obj) {
                ju.t.f(obj, "route");
                this.f34420a = obj;
            }

            public final Object a() {
                return this.f34420a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f34420a, ((b) obj).f34420a);
            }

            public int hashCode() {
                return this.f34420a.hashCode();
            }

            public String toString() {
                return "OnRouteRequest(route=" + this.f34420a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34421a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34423c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRuleEditorScreenViewModel.this.new d(this.f34423c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f34421a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.w wVar = PortForwardingRuleEditorScreenViewModel.this._isSaveEnabled;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(this.f34423c);
                this.f34421a = 1;
                if (wVar.emit(boolA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingRuleEditorScreenViewModel() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.uniqueId = string;
        this._isSaveEnabled = zu.m0.a(Boolean.FALSE);
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final k0 isSaveEnabled() {
        return this._isSaveEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void updateSaveButtonState(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }
}
