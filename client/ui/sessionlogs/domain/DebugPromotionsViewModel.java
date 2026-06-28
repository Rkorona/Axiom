package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import android.content.SharedPreferences;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.DebugPromotionsViewModel;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.c;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugPromotionsViewModel extends i1 {
    public static final int $stable = 8;
    private final w _uiState;
    private final hg.d insensitiveKeyValueRepository;
    private final n sessionLogsPromoBannerRepository$delegate;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40405a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DebugPromotionsViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            hg.d dVar = DebugPromotionsViewModel.this.insensitiveKeyValueRepository;
            t.e(dVar, "access$getInsensitiveKeyValueRepository$p(...)");
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.remove("KEY_DISMISSED_SESSION_LOGS_PROMOTIONS");
            editorEdit.apply();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40407a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DebugPromotionsViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f40407a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = DebugPromotionsViewModel.this._uiState;
            DebugPromotionsViewModel debugPromotionsViewModel = DebugPromotionsViewModel.this;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, ((com.server.auditor.ssh.client.ui.sessionlogs.domain.b) value).a(new c.b(debugPromotionsViewModel.getSessionLogsPromoBannerRepository().b()))));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40409a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DebugPromotionsViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f40409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = DebugPromotionsViewModel.this._uiState;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, ((com.server.auditor.ssh.client.ui.sessionlogs.domain.b) value).a(c.a.f40633a)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionLogsPromoBannerRepository.SessionLogsPromoBannerType f40413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType, e eVar) {
            super(2, eVar);
            this.f40413c = sessionLogsPromoBannerType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DebugPromotionsViewModel.this.new d(this.f40413c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40411a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DebugPromotionsViewModel.this.getSessionLogsPromoBannerRepository().d(this.f40413c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public DebugPromotionsViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        this.insensitiveKeyValueRepository = aVarN.M();
        this.sessionLogsPromoBannerRepository$delegate = o.a(new iu.a() { // from class: to.n
            @Override // iu.a
            public final Object a() {
                return DebugPromotionsViewModel.sessionLogsPromoBannerRepository_delegate$lambda$0();
            }
        });
        w wVarA = zu.m0.a(new com.server.auditor.ssh.client.ui.sessionlogs.domain.b(null, 1, null));
        this._uiState = wVarA;
        this.uiState = h.b(wVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionLogsPromoBannerRepository getSessionLogsPromoBannerRepository() {
        return (SessionLogsPromoBannerRepository) this.sessionLogsPromoBannerRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionLogsPromoBannerRepository sessionLogsPromoBannerRepository_delegate$lambda$0() {
        return new SessionLogsPromoBannerRepository(null, 1, null);
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final void onClearDismissedSessionLogsPromotions() {
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onSetSessionLogsPromotionClick() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onSetSessionLogsPromotionDialogDismissRequest() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onSetSessionLogsPromotions(SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType) {
        k.d(j1.a(this), null, null, new d(sessionLogsPromoBannerType, null), 3, null);
    }
}
