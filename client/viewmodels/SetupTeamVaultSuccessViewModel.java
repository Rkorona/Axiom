package com.server.auditor.ssh.client.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import iu.p;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SetupTeamVaultSuccessViewModel extends i1 {
    public static final int $stable = 8;
    private final w _uiState;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46502a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f46504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f46505d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, int i10, e eVar) {
            super(2, eVar);
            this.f46504c = list;
            this.f46505d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return SetupTeamVaultSuccessViewModel.this.new a(this.f46504c, this.f46505d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f46502a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = SetupTeamVaultSuccessViewModel.this._uiState;
                Object cVar = !this.f46504c.isEmpty() ? new b.c(this.f46504c) : this.f46505d > 0 ? new b.a(this.f46505d) : b.C0662b.f46507a;
                this.f46502a = 1;
                if (wVar.emit(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            SetupTeamVaultSuccessViewModel.this.avoAnalytics.Q4();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f46506a;

            public a(int i10) {
                super(null);
                this.f46506a = i10;
            }

            public final int a() {
                return this.f46506a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f46506a == ((a) obj).f46506a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f46506a);
            }

            public String toString() {
                return "InvitedColleaguesInfo(invitedColleaguesCount=" + this.f46506a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.viewmodels.SetupTeamVaultSuccessViewModel$b$b, reason: collision with other inner class name */
        public static final class C0662b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0662b f46507a = new C0662b();

            private C0662b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0662b);
            }

            public int hashCode() {
                return -1676158093;
            }

            public String toString() {
                return "NoInfo";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f46508a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list) {
                super(null);
                t.f(list, "sharedEntities");
                this.f46508a = list;
            }

            public final List a() {
                return this.f46508a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f46508a, ((c) obj).f46508a);
            }

            public int hashCode() {
                return this.f46508a.hashCode();
            }

            public String toString() {
                return "SharedEntitiesInfo(sharedEntities=" + this.f46508a + ")";
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    public SetupTeamVaultSuccessViewModel(int i10, List<? extends SetupTeamVaultShareEntitiesSectionType<?>> list) {
        t.f(list, "sharedEntities");
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        w wVarA = zu.m0.a(b.C0662b.f46507a);
        this._uiState = wVarA;
        this.uiState = h.b(wVarA);
        wu.k.d(j1.a(this), null, null, new a(list, i10, null), 3, null);
    }

    public final k0 getUiState() {
        return this.uiState;
    }
}
