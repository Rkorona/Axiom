package com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.database.Column;
import e3.g3;
import iu.p;
import iu.q;
import j3.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes3.dex */
public final class SftpSelectEditorDialogViewModel extends AndroidViewModel {
    private final w _customCommand;
    private final yu.d _onConfirmedCommandWithFilePath;
    private final w _options;
    private final w _selectedCommand;
    private final k0 customCommand;
    private final String filePath;
    private final zu.f onConfirmedCommandWithFilePath;
    private final k0 options;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private static final String VI_EDITOR_NAME = "vi";
    private static final String VIM_EDITOR_NAME = "vim";
    private static final String EMACS_EDITOR_NAME = "emacs";
    private static final String NANO_EDITOR_NAME = "nano";
    private static final String CUSTOM_EDITOR = "custom command";
    private static final List<String> DEFAULT_OPTIONS = v.r(VI_EDITOR_NAME, VIM_EDITOR_NAME, EMACS_EDITOR_NAME, NANO_EDITOR_NAME, CUSTOM_EDITOR);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements l1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33329b;

        public b(String str) {
            t.f(str, "filePath");
            this.f33329b = str;
        }

        @Override // androidx.lifecycle.l1.c
        public i1 a(Class cls, i5.a aVar) {
            t.f(cls, "modelClass");
            t.f(aVar, "extras");
            Object objA = aVar.a(l1.a.f8762h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new SftpSelectEditorDialogViewModel(this.f33329b, (Application) objA);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33330a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpSelectEditorDialogViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SftpSelectEditorDialogViewModel.this.onOptionSelected((String) v.p0(SftpSelectEditorDialogViewModel.DEFAULT_OPTIONS));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33332a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpSelectEditorDialogViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f33332a;
            if (i10 == 0) {
                x.b(obj);
                if (!s.m0(((t0) SftpSelectEditorDialogViewModel.this._customCommand.getValue()).m())) {
                    yu.d dVar = SftpSelectEditorDialogViewModel.this._onConfirmedCommandWithFilePath;
                    String strM = ((t0) SftpSelectEditorDialogViewModel.this._customCommand.getValue()).m();
                    this.f33332a = 1;
                    if (dVar.b(strM, this) == objF) {
                        return objF;
                    }
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
        int f33334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f33336c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpSelectEditorDialogViewModel.this.new e(this.f33336c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object value;
            au.b.f();
            if (this.f33334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Iterable iterable = (Iterable) SftpSelectEditorDialogViewModel.this.getOptions().getValue();
            String str = this.f33336c;
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (t.b(((lk.h) next).a(), str)) {
                    break;
                }
            }
            lk.h hVar = (lk.h) next;
            if (hVar != null) {
                w wVar = SftpSelectEditorDialogViewModel.this._selectedCommand;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, hVar));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33339c;

        f(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lk.h hVar, List list, zt.e eVar) {
            f fVar = new f(eVar);
            fVar.f33338b = hVar;
            fVar.f33339c = list;
            return fVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            lk.h hVar = (lk.h) this.f33338b;
            List<String> list = (List) this.f33339c;
            ArrayList arrayList = new ArrayList(v.z(list, 10));
            for (String str : list) {
                arrayList.add(new lk.h(str, t.b(hVar.a(), str)));
            }
            return arrayList;
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33340a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SftpSelectEditorDialogViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f33340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SftpSelectEditorDialogViewModel.this.initDefaultOption();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((g) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33343b;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            h hVar = SftpSelectEditorDialogViewModel.this.new h(eVar);
            hVar.f33343b = obj;
            return hVar;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, zt.e eVar) {
            return ((h) create(list, eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            String strA;
            Object value;
            t0 t0Var;
            au.b.f();
            if (this.f33342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Iterator it = ((List) this.f33343b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((lk.h) next).b()) {
                    break;
                }
            }
            lk.h hVar = (lk.h) next;
            if (hVar != null && (strA = hVar.a()) != null) {
                SftpSelectEditorDialogViewModel sftpSelectEditorDialogViewModel = SftpSelectEditorDialogViewModel.this;
                if (!t.b(strA, v.B0(SftpSelectEditorDialogViewModel.DEFAULT_OPTIONS))) {
                    w wVar = sftpSelectEditorDialogViewModel._customCommand;
                    do {
                        value = wVar.getValue();
                        t0Var = (t0) value;
                    } while (!wVar.g(value, t0.i(t0Var, sftpSelectEditorDialogViewModel.buildCommand(strA, sftpSelectEditorDialogViewModel.filePath, t0Var.m()), 0L, null, 6, null)));
                }
            }
            return m0.f82633a;
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f33346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SftpSelectEditorDialogViewModel f33347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(t0 t0Var, SftpSelectEditorDialogViewModel sftpSelectEditorDialogViewModel, zt.e eVar) {
            super(2, eVar);
            this.f33346b = t0Var;
            this.f33347c = sftpSelectEditorDialogViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f33346b, this.f33347c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f33345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!s.m0(this.f33346b.m())) {
                w wVar = this.f33347c._customCommand;
                t0 t0Var = this.f33346b;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, t0Var));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SftpSelectEditorDialogViewModel(String str, Application application) {
        super(application);
        t.f(str, "filePath");
        t.f(application, "application");
        this.filePath = str;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._onConfirmedCommandWithFilePath = dVarB;
        this.onConfirmedCommandWithFilePath = zu.h.M(dVarB);
        List<String> list = DEFAULT_OPTIONS;
        w wVarA = zu.m0.a(new lk.h((String) v.p0(list), true));
        this._selectedCommand = wVarA;
        w wVarA2 = zu.m0.a(list);
        this._options = wVarA2;
        w wVarA3 = zu.m0.a(new t0("", 0L, (g3) null, 6, (k) null));
        this._customCommand = wVarA3;
        this.customCommand = zu.h.b(wVarA3);
        this.options = zu.h.P(zu.h.K(zu.h.L(zu.h.h(wVarA, wVarA2, new f(null)), new g(null)), new h(null)), j1.a(this), g0.a.b(g0.f88389a, 5000L, 0L, 2, null), v.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildCommand(String str, String str2, String str3) {
        if (t.b(str, v.B0(DEFAULT_OPTIONS))) {
            return str3;
        }
        return str + " " + str2 + " ; exit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDefaultOption() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final k0 getCustomCommand() {
        return this.customCommand;
    }

    public final zu.f getOnConfirmedCommandWithFilePath() {
        return this.onConfirmedCommandWithFilePath;
    }

    public final k0 getOptions() {
        return this.options;
    }

    public final void onConfirmClick() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onOptionSelected(String str) {
        t.f(str, "option");
        wu.k.d(j1.a(this), null, null, new e(str, null), 3, null);
    }

    public final void updateCustomCommand(t0 t0Var) {
        t.f(t0Var, Column.COMMAND);
        wu.k.d(j1.a(this), null, null, new i(t0Var, this, null), 3, null);
    }
}
