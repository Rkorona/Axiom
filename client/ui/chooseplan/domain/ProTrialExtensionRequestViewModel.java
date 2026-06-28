package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.interactors.t0;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import hg.b2;
import iu.p;
import java.util.Calendar;
import java.util.Date;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import tp.d1;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zn.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ProTrialExtensionRequestViewModel extends i1 implements t0.a {
    public static final int $stable = 8;
    private final yu.d _screenActionFlow;
    private Calendar extendedUntilCalendar;
    private final t0 requestProTrialExtensionInteractor;
    private final zu.f screenActionFlow;
    private final SyncServiceHelper syncServiceHelper;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39699a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39699a;
            if (i10 == 0) {
                x.b(obj);
                ProTrialExtensionRequestViewModel proTrialExtensionRequestViewModel = ProTrialExtensionRequestViewModel.this;
                this.f39699a = 1;
                if (proTrialExtensionRequestViewModel.requestProTrialExtension(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39701a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39701a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39702a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39702a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ProTrialExtensionRequestViewModel.this._screenActionFlow;
                d.b bVar = d.b.f88046a;
                this.f39702a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39704a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39704a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ProTrialExtensionRequestViewModel.this._screenActionFlow;
                d.b bVar = d.b.f88046a;
                this.f39704a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39706a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39706a;
            if (i10 == 0) {
                x.b(obj);
                ProTrialExtensionRequestViewModel.this.syncServiceHelper.startProfileAndBulkSync();
                yu.d dVar = ProTrialExtensionRequestViewModel.this._screenActionFlow;
                d.c cVar = d.c.f88047a;
                this.f39706a = 1;
                if (dVar.b(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProTrialExtensionRequestViewModel f39710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, ProTrialExtensionRequestViewModel proTrialExtensionRequestViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39709b = str;
            this.f39710c = proTrialExtensionRequestViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f39709b, this.f39710c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39708a;
            if (i10 == 0) {
                x.b(obj);
                Date dateE = d1.e(this.f39709b);
                if (dateE != null) {
                    this.f39710c.extendedUntilCalendar.setTime(dateE);
                }
                this.f39710c.syncServiceHelper.startProfileAndBulkSync();
                yu.d dVar = this.f39710c._screenActionFlow;
                Calendar calendar = this.f39710c.extendedUntilCalendar;
                t.e(calendar, "access$getExtendedUntilCalendar$p(...)");
                d.C1428d c1428d = new d.C1428d(calendar);
                this.f39708a = 1;
                if (dVar.b(c1428d, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39711a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39711a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ProTrialExtensionRequestViewModel.this._screenActionFlow;
                d.b bVar = d.b.f88046a;
                this.f39711a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39713a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRequestViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39713a;
            if (i10 == 0) {
                x.b(obj);
                ProTrialExtensionRequestViewModel proTrialExtensionRequestViewModel = ProTrialExtensionRequestViewModel.this;
                this.f39713a = 1;
                if (proTrialExtensionRequestViewModel.requestProTrialExtension(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ProTrialExtensionRequestViewModel() {
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        this.extendedUntilCalendar = Calendar.getInstance();
        this.syncServiceHelper = hg.f.p().Y();
        this.requestProTrialExtensionInteractor = new t0(new jl.d(b2.f52944a.O1()), this);
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestProTrialExtension(zt.e<? super m0> eVar) {
        Object objB = this.requestProTrialExtensionInteractor.b(eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.t0.a
    public void onRequestProTrialExtensionFailed(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.t0.a
    public void onRequestProTrialExtensionNetworkError() {
        k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.t0.a
    public void onRequestProTrialExtensionNotAllowed() {
        k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.t0.a
    public void onRequestProTrialExtensionSuccess(String str) {
        t.f(str, "validUntil");
        k.d(j1.a(this), null, null, new f(str, this, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.t0.a
    public void onRequestProTrialExtensionUnknownError() {
        k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void onRetryLastRequest() {
        k.d(j1.a(this), null, null, new h(null), 3, null);
    }
}
