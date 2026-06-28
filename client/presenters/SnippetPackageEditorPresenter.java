package com.server.auditor.ssh.client.presenters;

import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.k2;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.k0;
import com.server.auditor.ssh.client.interactors.z0;
import com.server.auditor.ssh.client.presenters.SnippetPackageEditorPresenter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import dq.h0;
import eq.b0;
import iq.b;
import java.util.List;
import java.util.UUID;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import tp.a1;
import ut.m0;
import ut.x;
import vp.a;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetPackageEditorPresenter extends MvpPresenter<k2> implements b.a {
    private final SnippetPackageDBAdapter A;
    private final z0 B;
    private final vl.g C;
    private final h0 D;
    private final ut.n E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35995b = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SnippetPackageDBModel f35998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f35999f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VaultKeyId f36001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private VaultKeyId f36002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f36003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final wn.j f36004y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final k0 f36005z;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36006a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36006a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageDBModel snippetPackageDBModelE = SnippetPackageEditorPresenter.this.B.e(SnippetPackageEditorPresenter.this.f35994a);
            if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(SnippetPackageEditorPresenter.this.f36002w)) {
                snippetPackageDBModelE.setVaultKeyId(SnippetPackageEditorPresenter.this.f36002w);
            }
            SnippetPackageEditorPresenter.this.Y2(snippetPackageDBModelE);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36008a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ eq.i f36010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f36011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f36012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f36013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(eq.i iVar, List list, VaultKeyId vaultKeyId, String str, zt.e eVar) {
            super(2, eVar);
            this.f36010c = iVar;
            this.f36011d = list;
            this.f36012e = vaultKeyId;
            this.f36013f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new b(this.f36010c, this.f36011d, this.f36012e, this.f36013f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.getViewState().I();
            SnippetPackageEditorPresenter.this.getViewState().G8();
            b0.a aVar = b0.f48942a;
            ConflictsArgData[] conflictsArgDataArrA = aVar.a(this.f36010c);
            boolean zB = SnippetPackageEditorPresenter.this.f36005z.b(conflictsArgDataArrA);
            SourceEntitiesArgData[] sourceEntitiesArgDataArrB = aVar.b(this.f36011d);
            if (zB) {
                SnippetPackageEditorPresenter.this.getViewState().v1(this.f36012e, this.f36013f, conflictsArgDataArrA, sourceEntitiesArgDataArrB, SnippetPackageEditorPresenter.this.f35997d);
            } else {
                SnippetPackageEditorPresenter.this.getViewState().Z1(this.f36012e, this.f36013f, conflictsArgDataArrA, sourceEntitiesArgDataArrB, SnippetPackageEditorPresenter.this.f35997d);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36014a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f36016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ eq.i f36017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f36018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f36019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, eq.i iVar, VaultKeyId vaultKeyId, String str, zt.e eVar) {
            super(2, eVar);
            this.f36016c = list;
            this.f36017d = iVar;
            this.f36018e = vaultKeyId;
            this.f36019f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new c(this.f36016c, this.f36017d, this.f36018e, this.f36019f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36014a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.getViewState().I();
            SnippetPackageEditorPresenter.this.getViewState().G8();
            SnippetPackageEditorPresenter.this.P2(this.f36016c, this.f36017d, this.f36018e, this.f36019f);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36020a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36020a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.getViewState().De(SnippetPackageEditorPresenter.this.f36002w);
            SnippetPackageEditorPresenter.this.getViewState().l3();
            hg.f.p().Y().startFullSync();
            SnippetPackageEditorPresenter.this.f3("Move");
            SnippetPackageEditorPresenter snippetPackageEditorPresenter = SnippetPackageEditorPresenter.this;
            SnippetPackageDBModel snippetPackageDBModel = snippetPackageEditorPresenter.f35998e;
            if (snippetPackageDBModel == null) {
                t.t("editSnippetPackageDBModel");
                snippetPackageDBModel = null;
            }
            snippetPackageEditorPresenter.f36000u = snippetPackageDBModel.getLabel().hashCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36022a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f36024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qq.a aVar, String str, zt.e eVar) {
            super(2, eVar);
            this.f36024c = aVar;
            this.f36025d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new e(this.f36024c, this.f36025d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.i3(this.f36024c.f());
            SnippetPackageEditorPresenter.this.g3(this.f36025d, this.f36024c.d());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36026a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36026a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.getViewState().a();
            SnippetPackageEditorPresenter.this.getViewState().X(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36028a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36028a;
            if (i10 == 0) {
                x.b(obj);
                SnippetPackageEditorPresenter snippetPackageEditorPresenter = SnippetPackageEditorPresenter.this;
                this.f36028a = 1;
                obj = snippetPackageEditorPresenter.j3(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                SnippetPackageEditorPresenter.this.getViewState().T3(SnippetPackageEditorPresenter.this.f35994a);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36030a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36032c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f36032c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new h(this.f36032c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!SnippetPackageEditorPresenter.this.f36003x || SnippetPackageEditorPresenter.S2(SnippetPackageEditorPresenter.this, false, 1, null)) {
                SnippetPackageEditorPresenter.this.getViewState().B(qq.b.b(b0.f48942a.d(com.server.auditor.ssh.client.ui.vaults.data.a.e(SnippetPackageEditorPresenter.this.f36002w), "Move"), null, true, null, false, false, this.f36032c.hashCode() != SnippetPackageEditorPresenter.this.f36000u && SnippetPackageEditorPresenter.this.f36003x, SnippetPackageEditorPresenter.this.f36001v, null, 149, null));
            } else {
                SnippetPackageEditorPresenter.this.getViewState().s8();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36034b;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            SnippetPackageDBModel itemByLocalId;
            Object objF = au.b.f();
            int i10 = this.f36034b;
            if (i10 == 0) {
                x.b(obj);
                String string = UUID.randomUUID().toString();
                t.e(string, "toString(...)");
                SnippetPackageEditorPresenter.this.f35995b.J0(new wp.a(Avo.ChangeVaultAction.MOVE, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.SNIPPET_PACKAGE, string, Avo.ChangeToVault.NOT_MINUSPERSONAL, Avo.CurrentVault.PERSONAL));
                SnippetPackageEditorPresenter.this.f35995b.X4();
                SnippetPackageEditorPresenter snippetPackageEditorPresenter = SnippetPackageEditorPresenter.this;
                this.f36033a = string;
                this.f36034b = 1;
                obj = snippetPackageEditorPresenter.j3(this);
                if (obj == objF) {
                    return objF;
                }
                str = string;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f36033a;
                x.b(obj);
            }
            if (((Boolean) obj).booleanValue() && (itemByLocalId = SnippetPackageEditorPresenter.this.A.getItemByLocalId(SnippetPackageEditorPresenter.this.f35994a)) != null) {
                SnippetPackageEditorPresenter.this.f35995b.L4(Avo.OpenedFrom.EDIT_SNIPPET_PACKAGE, str);
                SnippetPackageEditorPresenter.this.getViewState().o4(itemByLocalId, str);
                return m0.f82633a;
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36036a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f36038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f36039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f36040e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qq.a aVar, long j10, String str, zt.e eVar) {
            super(2, eVar);
            this.f36038c = aVar;
            this.f36039d = j10;
            this.f36040e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new j(this.f36038c, this.f36039d, this.f36040e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36036a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter snippetPackageEditorPresenter = SnippetPackageEditorPresenter.this;
            snippetPackageEditorPresenter.e3(snippetPackageEditorPresenter.O2(this.f36038c), com.server.auditor.ssh.client.ui.vaults.data.a.b(this.f36038c.f()));
            if (SnippetPackageEditorPresenter.this.T2(this.f36038c)) {
                SnippetPackageEditorPresenter.this.getViewState().I();
            } else if (this.f36039d == -1) {
                SnippetPackageEditorPresenter.this.getViewState().I();
                SnippetPackageEditorPresenter.this.i3(this.f36038c.f());
                SnippetPackageEditorPresenter.this.getViewState().De(this.f36038c.f());
            } else {
                z0 z0Var = SnippetPackageEditorPresenter.this.B;
                SnippetPackageDBModel snippetPackageDBModel = SnippetPackageEditorPresenter.this.f35998e;
                if (snippetPackageDBModel == null) {
                    t.t("editSnippetPackageDBModel");
                    snippetPackageDBModel = null;
                }
                if (!z0Var.f(snippetPackageDBModel.getIdInDatabase()) || com.server.auditor.ssh.client.ui.vaults.data.a.b(this.f36038c.f())) {
                    SnippetPackageEditorPresenter.this.i3(this.f36038c.f());
                    SnippetPackageEditorPresenter.this.g3(this.f36040e, this.f36038c.d());
                } else {
                    SnippetPackageEditorPresenter.this.getViewState().ic(this.f36038c);
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36041a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f36043c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new k(this.f36043c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36041a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageDBModel snippetPackageDBModel = SnippetPackageEditorPresenter.this.f35998e;
            SnippetPackageDBModel snippetPackageDBModel2 = null;
            if (snippetPackageDBModel == null) {
                t.t("editSnippetPackageDBModel");
                snippetPackageDBModel = null;
            }
            snippetPackageDBModel.setLabel(this.f36043c);
            SnippetPackageEditorPresenter.this.getViewState().ce(null);
            SnippetPackageEditorPresenter.this.getViewState().X(SnippetPackageEditorPresenter.S2(SnippetPackageEditorPresenter.this, false, 1, null));
            int i10 = SnippetPackageEditorPresenter.this.f36000u;
            SnippetPackageDBModel snippetPackageDBModel3 = SnippetPackageEditorPresenter.this.f35998e;
            if (snippetPackageDBModel3 == null) {
                t.t("editSnippetPackageDBModel");
            } else {
                snippetPackageDBModel2 = snippetPackageDBModel3;
            }
            if (i10 != snippetPackageDBModel2.getLabel().hashCode()) {
                SnippetPackageEditorPresenter.this.getViewState().W7(true);
            } else {
                SnippetPackageEditorPresenter.this.getViewState().W7(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36044a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36044a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter snippetPackageEditorPresenter = SnippetPackageEditorPresenter.this;
            SnippetPackageDBModel snippetPackageDBModel = snippetPackageEditorPresenter.f35998e;
            if (snippetPackageDBModel == null) {
                t.t("editSnippetPackageDBModel");
                snippetPackageDBModel = null;
            }
            snippetPackageEditorPresenter.f36000u = snippetPackageDBModel.getLabel().hashCode();
            SnippetPackageEditorPresenter.this.getViewState().De(SnippetPackageEditorPresenter.this.f36002w);
            hg.f.p().Y().startFullSync();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36048c = str;
            this.f36049d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new m(this.f36048c, this.f36049d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.N2().j(v.e(SnippetPackageEditorPresenter.this.B.d(SnippetPackageEditorPresenter.this.f35994a, this.f36048c)), SnippetPackageEditorPresenter.this.f36002w, this.f36049d, "editor_screen", SnippetPackageEditorPresenter.this);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36050a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f36052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f36052c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new n(this.f36052c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36050a;
            if (i10 == 0) {
                x.b(obj);
                h0 h0Var = SnippetPackageEditorPresenter.this.D;
                VaultKeyId vaultKeyId = this.f36052c;
                this.f36050a = 1;
                obj = h0Var.c(vaultKeyId, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                SnippetPackageEditorPresenter.this.getViewState().V6();
            } else if (a1.f80840a.c()) {
                SnippetPackageEditorPresenter.this.getViewState().D7();
            } else {
                SnippetPackageEditorPresenter.this.getViewState().j8();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36053a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f36055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f36055c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetPackageEditorPresenter.this.new o(this.f36055c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36053a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetPackageEditorPresenter.this.f36002w = this.f36055c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36056a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36058c;

        p(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36056a = obj;
            this.f36058c |= RtlSpacingHelper.UNDEFINED;
            return SnippetPackageEditorPresenter.this.j3(this);
        }
    }

    public SnippetPackageEditorPresenter(long j10) {
        this.f35994a = j10;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f35996c = aVarN;
        this.f35997d = "";
        this.f35999f = aVarN.z0();
        VaultKeyId.b bVar = VaultKeyId.Companion;
        this.f36001v = bVar.a();
        this.f36002w = bVar.a();
        this.f36003x = this.f35994a != -1;
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        wn.j jVar = new wn.j(dVarM);
        this.f36004y = jVar;
        this.f36005z = new k0();
        this.A = hg.f.p().O();
        this.B = new z0(null, null, null, null, jVar, 15, null);
        vl.g gVarB = vl.g.f83702b.b();
        this.C = gVarB;
        this.D = new h0(gVarB, null, null, 6, null);
        this.E = ut.o.a(new iu.a() { // from class: zk.f
            @Override // iu.a
            public final Object a() {
                return SnippetPackageEditorPresenter.U2(this.f88022a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iq.b N2() {
        return (iq.b) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String O2(qq.a aVar) {
        return this.f35994a == -1 ? "Create" : aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(iVar, list, vaultKeyId, str, null), 3, null);
    }

    private final Object Q2(VaultKeyId vaultKeyId, zt.e eVar) {
        return new h0(null, null, null, 7, null).c(vaultKeyId, eVar);
    }

    private final boolean R2(boolean z10) {
        SnippetPackageDBModel snippetPackageDBModel = this.f35998e;
        if (snippetPackageDBModel == null) {
            t.t("editSnippetPackageDBModel");
            snippetPackageDBModel = null;
        }
        boolean zM0 = s.m0(snippetPackageDBModel.getLabel());
        boolean z11 = !zM0;
        if (z10 && zM0) {
            getViewState().ce(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    static /* synthetic */ boolean S2(SnippetPackageEditorPresenter snippetPackageEditorPresenter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return snippetPackageEditorPresenter.R2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T2(qq.a aVar) {
        return t.b(this.f36002w, aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b U2(SnippetPackageEditorPresenter snippetPackageEditorPresenter) {
        return new iq.b(snippetPackageEditorPresenter.f36004y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(SnippetPackageDBModel snippetPackageDBModel) {
        k2 viewState = getViewState();
        boolean z10 = this.f36003x;
        VaultKeyId vaultKeyId = snippetPackageDBModel.getVaultKeyId();
        t.e(vaultKeyId, "<get-vaultKeyId>(...)");
        viewState.H8(z10, vaultKeyId);
        this.f35998e = snippetPackageDBModel;
        VaultKeyId vaultKeyId2 = snippetPackageDBModel.getVaultKeyId();
        t.e(vaultKeyId2, "<get-vaultKeyId>(...)");
        this.f36001v = vaultKeyId2;
        SnippetPackageDBModel snippetPackageDBModel2 = this.f35998e;
        SnippetPackageDBModel snippetPackageDBModel3 = null;
        if (snippetPackageDBModel2 == null) {
            t.t("editSnippetPackageDBModel");
            snippetPackageDBModel2 = null;
        }
        VaultKeyId vaultKeyId3 = snippetPackageDBModel2.getVaultKeyId();
        t.e(vaultKeyId3, "<get-vaultKeyId>(...)");
        this.f36002w = vaultKeyId3;
        if (this.f36000u == 0) {
            SnippetPackageDBModel snippetPackageDBModel4 = this.f35998e;
            if (snippetPackageDBModel4 == null) {
                t.t("editSnippetPackageDBModel");
                snippetPackageDBModel4 = null;
            }
            this.f36000u = snippetPackageDBModel4.getLabel().hashCode();
        }
        getViewState().u9(new SpannableStringBuilder(snippetPackageDBModel.getLabel()));
        if (this.f35999f) {
            SnippetPackageDBModel snippetPackageDBModel5 = this.f35998e;
            if (snippetPackageDBModel5 == null) {
                t.t("editSnippetPackageDBModel");
            } else {
                snippetPackageDBModel3 = snippetPackageDBModel5;
            }
            VaultKeyId vaultKeyId4 = snippetPackageDBModel3.getVaultKeyId();
            t.e(vaultKeyId4, "<get-vaultKeyId>(...)");
            h3(vaultKeyId4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(String str, String str2) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(str, str2, null), 3, null);
    }

    private final void h3(VaultKeyId vaultKeyId) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(vaultKeyId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r9 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r9 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j3(zt.e r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.SnippetPackageEditorPresenter.j3(zt.e):java.lang.Object");
    }

    @Override // iq.b.a
    public void J3(dq.t tVar) {
        t.f(tVar, "recreatedCredentialsInfo");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: M2, reason: merged with bridge method [inline-methods] */
    public void attachView(k2 k2Var) {
        super.attachView(k2Var);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void V2(qq.a aVar, String str) {
        t.f(aVar, "vaultFlowData");
        t.f(str, Column.MULTI_KEY_NAME);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(aVar, str, null), 3, null);
    }

    public final void W2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void X2(int i10) {
        if (i10 == 1000) {
            i3(VaultKeyId.Companion.b());
            getViewState().T3(this.f35994a);
        }
    }

    public final void Z2(String str) {
        t.f(str, "currentNameValue");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    public final void a3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void b3(qq.a aVar, String str, long j10) {
        t.f(aVar, "vaultFlowData");
        t.f(str, Column.MULTI_KEY_NAME);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(aVar, j10, str, null), 3, null);
    }

    public final void c3(String str) {
        t.f(str, "updatedName");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, null), 3, null);
    }

    public final void d3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    public final void e3(String str, boolean z10) {
        t.f(str, "actionType");
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f35997d = string;
        com.server.auditor.ssh.client.utils.analytics.a.y().J0(new wp.a(changeVaultActionC, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.SNIPPET_PACKAGE, this.f35997d, c1341a.b(z10), c1341a.a(this.f36001v)));
    }

    public final void f3(String str) {
        t.f(str, "actionType");
        Avo.ChangeVaultAction changeVaultActionC = vp.a.f83866a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().K0(new wp.b(changeVaultActionC, this.f35997d, Avo.Entity.SNIPPET_PACKAGE, Avo.ChangeVaultSource.EDIT_FORM));
    }

    public final void i3(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(vaultKeyId, null), 3, null);
    }

    @Override // iq.b.a
    public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        t.f(list, "sourceEntitiesToMove");
        t.f(iVar, "conflictsEntities");
        t.f(vaultKeyId, "targetVaultKeyId");
        t.f(str, "credentialsMode");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(list, iVar, vaultKeyId, str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }
}
