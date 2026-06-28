package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import wu.i0;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static PackageEditorScreenViewModel composeViewModel;
    private final zu.w _hasUnsavedChanges;
    private final zu.w _isSaveEnabled = m0.a(Boolean.TRUE);
    private final k0 hasUnsavedChanges;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final PackageEditorScreenViewModel a() {
            return PackageEditorScreenViewModel.composeViewModel;
        }

        public final void b(PackageEditorScreenViewModel packageEditorScreenViewModel) {
            PackageEditorScreenViewModel.composeViewModel = packageEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34308a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -227154402;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34309a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1907777135;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34310a;

            public b(long j10) {
                this.f34310a = j10;
            }

            public final long a() {
                return this.f34310a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34310a == ((b) obj).f34310a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34310a);
            }

            public String toString() {
                return "PackageCreated(packageId=" + this.f34310a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34313c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageEditorScreenViewModel.this.new d(this.f34313c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PackageEditorScreenViewModel.this._hasUnsavedChanges.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34313c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34314a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34316c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PackageEditorScreenViewModel.this.new e(this.f34316c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34314a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PackageEditorScreenViewModel.this._isSaveEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34316c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public PackageEditorScreenViewModel() {
        zu.w wVarA = m0.a(Boolean.FALSE);
        this._hasUnsavedChanges = wVarA;
        this.hasUnsavedChanges = zu.h.b(wVarA);
    }

    public static /* synthetic */ void updateHasUnsavedChanges$default(PackageEditorScreenViewModel packageEditorScreenViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        packageEditorScreenViewModel.updateHasUnsavedChanges(z10);
    }

    public final k0 getHasUnsavedChanges() {
        return this.hasUnsavedChanges;
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

    public final void updateHasUnsavedChanges(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void updateSaveButton(boolean z10) {
        wu.k.d(j1.a(this), null, null, new e(z10, null), 3, null);
    }
}
