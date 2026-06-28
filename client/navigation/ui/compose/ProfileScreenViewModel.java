package com.server.auditor.ssh.client.navigation.ui.compose;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.fragments.editors.choisemanagers.TypefaceModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import k9.d;
import zu.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileScreenViewModel extends FragmentWrapperViewModel<Object, b> {
    private static ProfileScreenViewModel composeViewModel;
    private final zu.w _currentColorScheme;
    private final zu.w _showDebugPanel;
    private final zu.w _showFontStyleDialog;
    private final zu.w _showHelpAndFeedback;
    private final zu.w _showNotificationsDialog;
    private final androidx.lifecycle.f0 isShowBellLiveData = androidx.lifecycle.m.c(new e(hg.b2.f52944a.Q0().c(), this), androidx.lifecycle.j1.a(this).getCoroutineContext(), 0, 2, null);
    private boolean isTablet;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ProfileScreenViewModel a() {
            return ProfileScreenViewModel.composeViewModel;
        }

        public final void b(ProfileScreenViewModel profileScreenViewModel) {
            ProfileScreenViewModel.composeViewModel = profileScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30182a;

            public a(String str) {
                this.f30182a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f30182a, ((a) obj).f30182a);
            }

            public int hashCode() {
                String str = this.f30182a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "OnColorSchemeResult(colorScheme=" + this.f30182a + ")";
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30183a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30183a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProfileScreenViewModel.this.loadData();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((c) create(gVar, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30185a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30185a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = ProfileScreenViewModel.this._currentColorScheme;
            d.a aVar = k9.d.f63270c;
            Context contextF = TermiusApplication.F();
            ju.t.e(contextF, "getTermiusAppContext(...)");
            k9.d dVarB = aVar.b(contextF);
            String string = com.server.auditor.ssh.client.app.a.N().M().getString("color_scheme_settings", aVar.a().getName());
            if (string == null) {
                string = aVar.a().getName();
            }
            String strH = dVarB.g(string).h();
            ju.t.e(strH, "getName(...)");
            wVar.setValue(strH);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements zu.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.f f30187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProfileScreenViewModel f30188b;

        public static final class a implements zu.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zu.g f30189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProfileScreenViewModel f30190b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel$e$a$a, reason: collision with other inner class name */
            public static final class C0461a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f30191a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f30192b;

                public C0461a(zt.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f30191a = obj;
                    this.f30192b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(zu.g gVar, ProfileScreenViewModel profileScreenViewModel) {
                this.f30189a = gVar;
                this.f30190b = profileScreenViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, zt.e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel.e.a.C0461a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel$e$a$a r0 = (com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel.e.a.C0461a) r0
                    int r1 = r0.f30192b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30192b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel$e$a$a r0 = new com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f30191a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f30192b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r7)
                    goto L56
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    ut.x.b(r7)
                    zu.g r7 = r5.f30189a
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel r2 = r5.f30190b
                    boolean r2 = r2.isTablet()
                    r4 = 0
                    if (r2 == 0) goto L46
                    goto L49
                L46:
                    if (r6 == 0) goto L49
                    r4 = r3
                L49:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r0.f30192b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L56
                    return r1
                L56:
                    ut.m0 r6 = ut.m0.f82633a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel.e.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public e(zu.f fVar, ProfileScreenViewModel profileScreenViewModel) {
            this.f30187a = fVar;
            this.f30188b = profileScreenViewModel;
        }

        @Override // zu.f
        public Object collect(zu.g gVar, zt.e eVar) {
            Object objCollect = this.f30187a.collect(new a(gVar, this.f30188b), eVar);
            return objCollect == au.b.f() ? objCollect : ut.m0.f82633a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f30195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TypefaceModel f30197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ProfileScreenViewModel f30198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Integer num, String str, TypefaceModel typefaceModel, ProfileScreenViewModel profileScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f30195b = num;
            this.f30196c = str;
            this.f30197d = typefaceModel;
            this.f30198e = profileScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f30195b, this.f30196c, this.f30197d, this.f30198e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            au.b.f();
            if (this.f30194a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Integer num = this.f30195b;
            if (num == null || (string = num.toString()) == null) {
                string = "8";
            }
            String name = this.f30196c;
            if (name == null) {
                name = k9.d.f63270c.a().getName();
            }
            TypefaceModel typefaceModel = this.f30197d;
            if (typefaceModel == null) {
                typefaceModel = new TypefaceModel("fonts/SourceCodePro-Medium.ttf", "fonts/SourceCodePro-Medium.ttf");
            }
            hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
            ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
            SharedPreferences.Editor editorEdit = dVarM.edit();
            editorEdit.putString(TermiusApplication.F().getString(R.string.settings_key_font_settings), name);
            editorEdit.putString("fontSize", string);
            editorEdit.putString("fontTerminal", typefaceModel.getTypefacePath());
            editorEdit.apply();
            hg.f.p().Y().putAppSettings();
            this.f30198e.loadData();
            this.f30198e.sendComposeAction(new b.a(name));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30199a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30201c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new g(this.f30201c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30199a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProfileScreenViewModel.this._showDebugPanel.setValue(kotlin.coroutines.jvm.internal.b.a(this.f30201c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30202a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30204c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new h(this.f30204c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30202a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProfileScreenViewModel.this._showFontStyleDialog.setValue(kotlin.coroutines.jvm.internal.b.a(this.f30204c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30205a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30207c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new i(this.f30207c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProfileScreenViewModel.this._showHelpAndFeedback.setValue(kotlin.coroutines.jvm.internal.b.a(this.f30207c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30210c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProfileScreenViewModel.this.new j(this.f30210c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30208a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProfileScreenViewModel.this._showNotificationsDialog.setValue(kotlin.coroutines.jvm.internal.b.a(this.f30210c));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ProfileScreenViewModel() {
        Boolean bool = Boolean.FALSE;
        this._showFontStyleDialog = zu.m0.a(bool);
        this._showDebugPanel = zu.m0.a(bool);
        this._showHelpAndFeedback = zu.m0.a(bool);
        this._showNotificationsDialog = zu.m0.a(bool);
        this._currentColorScheme = zu.m0.a(k9.d.f63270c.a().getName());
    }

    public final zu.k0 getCurrentColorScheme() {
        return zu.h.P(zu.h.L(this._currentColorScheme, new c(null)), androidx.lifecycle.j1.a(this), g0.a.b(zu.g0.f88389a, 5000L, 0L, 2, null), k9.d.f63270c.a().getName());
    }

    public final zu.k0 getShowDebugPanel() {
        return this._showDebugPanel;
    }

    public final zu.k0 getShowFontStyleDialog() {
        return this._showFontStyleDialog;
    }

    public final zu.k0 getShowHelpAndFeedback() {
        return this._showHelpAndFeedback;
    }

    public final zu.k0 getShowNotificationsDialog() {
        return this._showNotificationsDialog;
    }

    public final androidx.lifecycle.f0 isShowBellLiveData() {
        return this.isShowBellLiveData;
    }

    public final boolean isTablet() {
        return this.isTablet;
    }

    public final void loadData() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(null), 3, null);
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setTablet(boolean z10) {
        this.isTablet = z10;
    }

    public final void updateData(Integer num, String str, TypefaceModel typefaceModel) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new f(num, str, typefaceModel, this, null), 3, null);
    }

    public final void updateShowDebugPanel(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new g(z10, null), 3, null);
    }

    public final void updateShowFontStyleDialog(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new h(z10, null), 3, null);
    }

    public final void updateShowHelpAndFeedback(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new i(z10, null), 3, null);
    }

    public final void updateShowNotificationsDialog(boolean z10) {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new j(z10, null), 3, null);
    }
}
