package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.m0;
import com.server.auditor.ssh.client.fragments.editors.choisemanagers.TypefaceModel;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorSchemeManagerScreenPresenter extends MvpPresenter<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k9.d f35432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.d f35433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f35435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypefaceModel f35436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35437f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f35439v;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.ColorSchemeManagerScreenPresenter$a$a, reason: collision with other inner class name */
        public static final class C0571a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0571a f35440a = new C0571a();

            private C0571a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0571a);
            }

            public int hashCode() {
                return -1373521068;
            }

            public String toString() {
                return "GroupEditorMode";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f35441a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1386620653;
            }

            public String toString() {
                return "HostEditorMode";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f35442a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 960869313;
            }

            public String toString() {
                return "SettingsMode";
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35443a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ColorSchemeManagerScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int iIndexOf = ColorSchemeManagerScreenPresenter.this.f35435d.indexOf(ColorSchemeManagerScreenPresenter.this.f35434c);
            if (iIndexOf != -1) {
                ColorSchemeManagerScreenPresenter.this.getViewState().X6(iIndexOf);
                ColorSchemeManagerScreenPresenter.this.C2(iIndexOf);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35445a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35447c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ColorSchemeManagerScreenPresenter.this.new c(this.f35447c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String str = (String) ColorSchemeManagerScreenPresenter.this.f35435d.get(this.f35447c);
            k9.b bVarG = ColorSchemeManagerScreenPresenter.this.f35432a.g(str);
            ColorSchemeManagerScreenPresenter.this.getViewState().Kd(bVarG.f(), bVarG.g(false));
            ColorSchemeManagerScreenPresenter.this.f35437f = str;
            if (t.b(ColorSchemeManagerScreenPresenter.this.f35437f, ColorSchemeManagerScreenPresenter.this.f35434c)) {
                ColorSchemeManagerScreenPresenter.this.f35437f = null;
            }
            String string = ColorSchemeManagerScreenPresenter.this.f35433b.getString("color_scheme_settings", k9.d.f63270c.a().getName());
            if (string != null) {
                ColorSchemeManagerScreenPresenter colorSchemeManagerScreenPresenter = ColorSchemeManagerScreenPresenter.this;
                t.c(str);
                colorSchemeManagerScreenPresenter.G2(str, string);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35448a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35450c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ColorSchemeManagerScreenPresenter.this.new d(this.f35450c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35448a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ColorSchemeManagerScreenPresenter.this.f35438u = this.f35450c;
            ColorSchemeManagerScreenPresenter.this.getViewState().Hc(this.f35450c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35451a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ColorSchemeManagerScreenPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ColorSchemeManagerScreenPresenter.this.getViewState().w5(kotlin.coroutines.jvm.internal.b.d(ColorSchemeManagerScreenPresenter.this.f35438u), ColorSchemeManagerScreenPresenter.this.f35437f, ColorSchemeManagerScreenPresenter.this.f35436e);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f35454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String[] f35456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ColorSchemeManagerScreenPresenter f35457e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String[] strArr, int i10, String[] strArr2, ColorSchemeManagerScreenPresenter colorSchemeManagerScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35454b = strArr;
            this.f35455c = i10;
            this.f35456d = strArr2;
            this.f35457e = colorSchemeManagerScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f35454b, this.f35455c, this.f35456d, this.f35457e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35453a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String[] strArr = this.f35454b;
            int i10 = this.f35455c;
            String str = strArr[i10];
            String str2 = this.f35456d[i10];
            this.f35457e.f35436e = new TypefaceModel(str, str2);
            this.f35457e.getViewState().Oa(this.f35457e.f35436e);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ColorSchemeManagerScreenPresenter(k9.d dVar, hg.d dVar2, String str, String str2, boolean z10, boolean z11) {
        t.f(dVar, "terminalSchemesRepository");
        t.f(dVar2, "sharedPreferences");
        t.f(str, "defaultColorScheme");
        t.f(str2, "initialColorScheme");
        this.f35432a = dVar;
        this.f35433b = dVar2;
        this.f35434c = str;
        LinkedHashSet linkedHashSetH = dVar.h();
        ArrayList arrayList = new ArrayList(v.z(linkedHashSetH, 10));
        Iterator it = linkedHashSetH.iterator();
        while (it.hasNext()) {
            arrayList.add(((k9.b) it.next()).h());
        }
        this.f35435d = arrayList;
        this.f35436e = new TypefaceModel("fonts/SourceCodePro-Medium.ttf", "fonts/SourceCodePro-Medium.ttf");
        this.f35438u = 8;
        a aVar = a.b.f35441a;
        this.f35439v = aVar;
        if (z10) {
            aVar = a.c.f35442a;
        } else if (z11) {
            aVar = a.C0571a.f35440a;
        }
        this.f35439v = aVar;
        this.f35437f = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(String str, String str2) {
        a aVar = this.f35439v;
        if (t.b(aVar, a.c.f35442a)) {
            com.server.auditor.ssh.client.utils.analytics.a.y().Q5(str);
        } else if (t.b(aVar, a.C0571a.f35440a)) {
            com.server.auditor.ssh.client.utils.analytics.a.y().R5(str, str2);
        } else {
            if (!t.b(aVar, a.b.f35441a)) {
                throw new s();
            }
            com.server.auditor.ssh.client.utils.analytics.a.y().S5(str, str2);
        }
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void C2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(i10, null), 3, null);
    }

    public final void D2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(i10, null), 3, null);
    }

    public final void E2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void F2(int i10, String[] strArr, String[] strArr2) {
        t.f(strArr, "typefaceTitles");
        t.f(strArr2, "typefacePaths");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(strArr, i10, strArr2, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        String string = this.f35433b.getString("fontTerminal", "fonts/SourceCodePro-Medium.ttf");
        String string2 = this.f35433b.getString("fontSize", "8");
        this.f35438u = string2 != null ? Integer.parseInt(string2) : 8;
        getViewState().L8(this.f35435d, string, this.f35438u, t.b(this.f35439v, a.c.f35442a));
        int iIndexOf = this.f35435d.indexOf(this.f35437f);
        if (iIndexOf != -1) {
            getViewState().X6(iIndexOf);
            C2(iIndexOf);
        }
    }
}
