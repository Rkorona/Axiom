package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentWrapperViewModel<F, C> extends i1 {
    public static final int $stable = 8;
    private boolean isInPanel;
    private final zu.v _fragmentActions = zu.c0.b(0, 0, null, 7, null);
    private final zu.v _composeActions = zu.c0.b(0, 0, null, 7, null);
    private final tp.a fragmentActionDebouncer = new tp.a(0, 1, null);

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33847a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f33849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f33849c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f33849c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33847a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.v vVar = FragmentWrapperViewModel.this._composeActions;
                Object obj2 = this.f33849c;
                this.f33847a = 1;
                if (vVar.emit(obj2, this) == objF) {
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33850a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f33852c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FragmentWrapperViewModel f33854b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f33855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FragmentWrapperViewModel fragmentWrapperViewModel, Object obj, zt.e eVar) {
                super(1, eVar);
                this.f33854b = fragmentWrapperViewModel;
                this.f33855c = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(zt.e eVar) {
                return new a(this.f33854b, this.f33855c, eVar);
            }

            @Override // iu.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt.e eVar) {
                return ((a) create(eVar)).invokeSuspend(m0.f82633a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f33853a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.v vVar = this.f33854b._fragmentActions;
                    Object obj2 = this.f33855c;
                    this.f33853a = 1;
                    if (vVar.emit(obj2, this) == objF) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, zt.e eVar) {
            super(2, eVar);
            this.f33852c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f33852c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33850a;
            if (i10 == 0) {
                ut.x.b(obj);
                tp.a aVar = FragmentWrapperViewModel.this.fragmentActionDebouncer;
                Object obj2 = this.f33852c;
                ju.t.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                a aVar2 = new a(FragmentWrapperViewModel.this, this.f33852c, null);
                this.f33850a = 1;
                if (aVar.a(obj2, aVar2, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public final zu.a0 getComposeActions() {
        return this._composeActions;
    }

    public final zu.a0 getFragmentActions() {
        return this._fragmentActions;
    }

    public final boolean isInPanel() {
        return this.isInPanel;
    }

    public final void sendComposeAction(C c10) {
        wu.k.d(j1.a(this), null, null, new a(c10, null), 3, null);
    }

    public final void sendFragmentAction(F f10) {
        wu.k.d(j1.a(this), null, null, new b(f10, null), 3, null);
    }

    public final void setInPanel(boolean z10) {
        this.isInPanel = z10;
    }
}
