package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.ViewLogsOnDesktopPromoViewModel;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import so.n0;
import uo.b6;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;
import wu.k;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewLogsOnDesktopPromoViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final yu.d _screenActionFlow;
    private final w _uiState;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final n copyToClipboardUseCase$delegate;
    private final zu.f screenActionFlow;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40590a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f40590a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = ViewLogsOnDesktopPromoViewModel.this._uiState;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, b6.b((b6) value, false, null, 2, null)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40592a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f40592a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = ViewLogsOnDesktopPromoViewModel.this._uiState;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, b6.b((b6) value, true, null, 2, null)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40594a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40594a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ViewLogsOnDesktopPromoViewModel.this._screenActionFlow;
                n0.b bVar = n0.b.f78160a;
                this.f40594a = 1;
                if (dVar.b(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            ViewLogsOnDesktopPromoViewModel.this.avoAnalytics.k6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40596a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40596a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ViewLogsOnDesktopPromoViewModel.this._screenActionFlow;
                n0.a aVar = n0.a.f78159a;
                this.f40596a = 1;
                if (dVar.b(aVar, this) == objF) {
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
        int f40598a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40598a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = ViewLogsOnDesktopPromoViewModel.this._screenActionFlow;
                n0.a aVar = n0.a.f78159a;
                this.f40598a = 1;
                if (dVar.b(aVar, this) == objF) {
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
        int f40600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40602c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f40602c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new f(this.f40602c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40600a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wn.a copyToClipboardUseCase = ViewLogsOnDesktopPromoViewModel.this.getCopyToClipboardUseCase();
            String str = this.f40602c;
            copyToClipboardUseCase.a(str, str);
            ViewLogsOnDesktopPromoViewModel.this.avoAnalytics.l6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40603a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ViewLogsOnDesktopPromoViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40603a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ViewLogsOnDesktopPromoViewModel.this.avoAnalytics.m6(ViewLogsOnDesktopPromoViewModel.this.termiusStorage.r0());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLogsOnDesktopPromoViewModel(final Application application) {
        super(application);
        t.f(application, "application");
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        boolean zR0 = aVarN.r0();
        String string = application.getString(R.string.termius_download_link);
        t.e(string, "getString(...)");
        w wVarA = zu.m0.a(new b6(zR0, string));
        this._uiState = wVarA;
        this.uiState = h.b(wVarA);
        this.copyToClipboardUseCase$delegate = o.a(new iu.a() { // from class: to.p2
            @Override // iu.a
            public final Object a() {
                return ViewLogsOnDesktopPromoViewModel.copyToClipboardUseCase_delegate$lambda$0(application);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn.a copyToClipboardUseCase_delegate$lambda$0(Application application) {
        return new wn.a(new com.server.auditor.ssh.client.help.c(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wn.a getCopyToClipboardUseCase() {
        return (wn.a) this.copyToClipboardUseCase$delegate.getValue();
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final void onAuthenticationFailed() {
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onAuthenticationSuccess() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onAuthorizeButtonClicked() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onCloseButtonClicked() {
        k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onLogLinkClicked(String str) {
        t.f(str, "logLinkUrl");
        k.d(j1.a(this), null, null, new f(str, null), 3, null);
    }

    public final void onScreenOpened() {
        k.d(j1.a(this), null, null, new g(null), 3, null);
    }
}
