package com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import mk.i;
import mk.o;
import ut.m0;
import ut.x;
import wu.i0;
import wu.s0;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes3.dex */
public final class SftpAnnouncementViewModel extends AndroidViewModel {
    private static final long BULK_ACCOUNT_TIMEOUT_VALUE = 1500;
    private final w _showSftpOnboarding;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final i determineInitialSftpOnboardingStateUseCase;
    private boolean isFirstSessionOpen;
    private final o rememberNewSftpOnboardingShownUseCase;
    private final k0 showSftpOnboarding;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33312a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33314c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ bu.a f33315a = bu.b.a(Avo.SFTPOnboardingSlideName.values());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, zt.e eVar) {
            super(2, eVar);
            this.f33314c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpAnnouncementViewModel.this.new b(this.f33314c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33312a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a aVar = SftpAnnouncementViewModel.this.avoAnalytics;
            Object[] array = a.f33315a.toArray(new Avo.SFTPOnboardingSlideName[0]);
            int i10 = this.f33314c;
            aVar.b4((Avo.SFTPOnboardingSlideName) ((i10 < 0 || i10 >= array.length) ? Avo.SFTPOnboardingSlideName.COPY : array[i10]), SftpAnnouncementViewModel.this.isFirstSessionOpen ? Avo.SFTPSOnboardingSource.ON_FIRST_SESSION : Avo.SFTPSOnboardingSource.HELP_BUTTON);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33316a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpAnnouncementViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33316a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SftpAnnouncementViewModel.this.rememberNewSftpOnboardingShownUseCase.a();
            SftpAnnouncementViewModel.this.isFirstSessionOpen = false;
            w wVar = SftpAnnouncementViewModel.this._showSftpOnboarding;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33318a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpAnnouncementViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SftpAnnouncementViewModel.this.isFirstSessionOpen = false;
            w wVar = SftpAnnouncementViewModel.this._showSftpOnboarding;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33320a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpAnnouncementViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f33320a;
            if (i10 == 0) {
                x.b(obj);
                if (((Boolean) SftpAnnouncementViewModel.this._showSftpOnboarding.getValue()).booleanValue()) {
                    return m0.f82633a;
                }
                if (SftpAnnouncementViewModel.this.determineInitialSftpOnboardingStateUseCase.a()) {
                    this.f33320a = 1;
                    if (s0.b(SftpAnnouncementViewModel.BULK_ACCOUNT_TIMEOUT_VALUE, this) == objF) {
                        return objF;
                    }
                }
                return m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SftpAnnouncementViewModel.this.isFirstSessionOpen = true;
            w wVar = SftpAnnouncementViewModel.this._showSftpOnboarding;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SftpAnnouncementViewModel(Application application) {
        super(application);
        t.f(application, "application");
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.rememberNewSftpOnboardingShownUseCase = new o(dVarM);
        hg.d dVarM2 = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        this.determineInitialSftpOnboardingStateUseCase = new i(dVarM2);
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        w wVarA = zu.m0.a(Boolean.FALSE);
        this._showSftpOnboarding = wVarA;
        this.showSftpOnboarding = h.b(wVarA);
    }

    public final k0 getShowSftpOnboarding() {
        return this.showSftpOnboarding;
    }

    public final void onCurrentPageChanged(int i10) {
        wu.k.d(j1.a(this), null, null, new b(i10, null), 3, null);
    }

    public final void onDismissSftpOnboarding() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onRequestShowSftpOnboarding() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onSftpTabFocused() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }
}
