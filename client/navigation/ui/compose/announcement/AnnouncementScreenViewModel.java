package com.server.auditor.ssh.client.navigation.ui.compose.announcement;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import au.b;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnouncementScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final w _animationState;
    private final k0 animationStage;
    private int currentPage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30252a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, e eVar) {
            super(2, eVar);
            this.f30254c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return AnnouncementScreenViewModel.this.new a(this.f30254c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f30252a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AnnouncementScreenViewModel.this._animationState.setValue(kotlin.coroutines.jvm.internal.b.d(this.f30254c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public AnnouncementScreenViewModel() {
        w wVarA = zu.m0.a(0);
        this._animationState = wVarA;
        this.animationStage = h.b(wVarA);
    }

    public final k0 getAnimationStage() {
        return this.animationStage;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final void setCurrentPage(int i10) {
        this.currentPage = i10;
    }

    public final void updateAnimationStage(int i10) {
        k.d(j1.a(this), null, null, new a(i10, null), 3, null);
    }

    public final void updateCurrentPage(int i10) {
        this.currentPage = i10;
    }
}
