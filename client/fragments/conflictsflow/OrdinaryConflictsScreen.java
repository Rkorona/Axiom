package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.server.auditor.ssh.client.fragments.conflictsflow.OrdinaryConflictsScreen;
import com.server.auditor.ssh.client.fragments.conflictsflow.a;
import com.server.auditor.ssh.client.presenters.vaults.OrdinaryConflictsPresenter;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.widget.CopyMoveConflictsSectionView;
import eq.b0;
import iu.p;
import java.util.ArrayList;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.c4;
import qu.k;
import ut.m0;
import vt.n;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class OrdinaryConflictsScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.vaults.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f24427d = {n0.g(new g0(OrdinaryConflictsScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/OrdinaryConflictsPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24428e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c4 f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f24430b = new x(n0.b(OrdinaryConflictsScreenArgs.class), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24431c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24432a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return OrdinaryConflictsScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24432a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity activity = OrdinaryConflictsScreen.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24434a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return OrdinaryConflictsScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24434a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            OrdinaryConflictsScreen.this.Ff();
            OrdinaryConflictsScreen.this.Bf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24436a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f24438c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return OrdinaryConflictsScreen.this.new c(this.f24438c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24436a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.b bVarB = com.server.auditor.ssh.client.fragments.conflictsflow.a.b(OrdinaryConflictsScreen.this.yf().getWayToMove(), OrdinaryConflictsScreen.this.yf().getWizardId(), OrdinaryConflictsScreen.this.yf().getTargetDragAndDropIdArg(), this.f24438c, OrdinaryConflictsScreen.this.yf().getTargetVaultKeyId(), OrdinaryConflictsScreen.this.yf().getCredentialsMode(), OrdinaryConflictsScreen.this.yf().getSourceData(), OrdinaryConflictsScreen.this.yf().getConflictsData());
            t.e(bVarB, "actionDependenciesConfli…enToPfConflictScreen(...)");
            androidx.navigation.fragment.c.a(OrdinaryConflictsScreen.this).O(bVarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24439a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f24441c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return OrdinaryConflictsScreen.this.new d(this.f24441c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24439a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.C0390a c0390aA = com.server.auditor.ssh.client.fragments.conflictsflow.a.a(OrdinaryConflictsScreen.this.yf().getWayToMove(), OrdinaryConflictsScreen.this.yf().getWizardId(), OrdinaryConflictsScreen.this.yf().getTargetDragAndDropIdArg(), this.f24441c, "No resolution", OrdinaryConflictsScreen.this.yf().getTargetVaultKeyId(), OrdinaryConflictsScreen.this.yf().getCredentialsMode(), OrdinaryConflictsScreen.this.yf().getSourceData());
            t.e(c0390aA, "actionDependenciesConfli…ictsProcessingScreen(...)");
            androidx.navigation.fragment.c.a(OrdinaryConflictsScreen.this).O(c0390aA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24442a;

        public e(Fragment fragment) {
            this.f24442a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24442a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24442a + " has null arguments");
        }
    }

    public OrdinaryConflictsScreen() {
        iu.a aVar = new iu.a() { // from class: fh.c
            @Override // iu.a
            public final Object a() {
                return OrdinaryConflictsScreen.Gf(this.f50011a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24431c = new MoxyKtxDelegate(mvpDelegate, OrdinaryConflictsPresenter.class.getName() + ".presenter", aVar);
    }

    private final OrdinaryConflictsPresenter Af() {
        return (OrdinaryConflictsPresenter) this.f24431c.getValue(this, f24427d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bf() {
        zf().f72122c.setOnClickListener(new View.OnClickListener() { // from class: fh.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrdinaryConflictsScreen.Cf(this.f50012a, view);
            }
        });
        zf().f72127h.setOnClickListener(new View.OnClickListener() { // from class: fh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrdinaryConflictsScreen.Df(this.f50013a, view);
            }
        });
        zf().f72123d.setOnClickListener(new View.OnClickListener() { // from class: fh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrdinaryConflictsScreen.Ef(this.f50014a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(OrdinaryConflictsScreen ordinaryConflictsScreen, View view) {
        ordinaryConflictsScreen.Af().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(OrdinaryConflictsScreen ordinaryConflictsScreen, View view) {
        OrdinaryConflictsPresenter ordinaryConflictsPresenterAf = ordinaryConflictsScreen.Af();
        ConflictsArgData[] conflictsData = ordinaryConflictsScreen.yf().getConflictsData();
        t.e(conflictsData, "getConflictsData(...)");
        ordinaryConflictsPresenterAf.v2(conflictsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(OrdinaryConflictsScreen ordinaryConflictsScreen, View view) {
        OrdinaryConflictsPresenter ordinaryConflictsPresenterAf = ordinaryConflictsScreen.Af();
        ConflictsArgData[] conflictsData = ordinaryConflictsScreen.yf().getConflictsData();
        t.e(conflictsData, "getConflictsData(...)");
        ordinaryConflictsPresenterAf.u2(conflictsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Ff() {
        ConflictsArgData[] conflictsData = yf().getConflictsData();
        t.e(conflictsData, "getConflictsData(...)");
        List listG1 = n.g1(conflictsData);
        ConflictsArgData[] conflictsData2 = yf().getConflictsData();
        t.e(conflictsData2, "getConflictsData(...)");
        ArrayList arrayList = new ArrayList(conflictsData2.length);
        for (ConflictsArgData conflictsArgData : conflictsData2) {
            arrayList.add(conflictsArgData.getEntityType());
        }
        for (Class cls : v.i1(arrayList)) {
            if (!b0.f48942a.l().contains(cls)) {
                Context contextRequireContext = requireContext();
                t.e(contextRequireContext, "requireContext(...)");
                CopyMoveConflictsSectionView copyMoveConflictsSectionView = new CopyMoveConflictsSectionView(contextRequireContext, null, 0, 0, 14, null);
                copyMoveConflictsSectionView.setLayoutParams(new ConstraintLayout.b(-1, -2));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listG1) {
                    if (t.b(((ConflictsArgData) obj).getEntityType(), cls)) {
                        arrayList2.add(obj);
                    }
                }
                copyMoveConflictsSectionView.setParameters(arrayList2);
                zf().f72125f.addView(copyMoveConflictsSectionView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrdinaryConflictsPresenter Gf(OrdinaryConflictsScreen ordinaryConflictsScreen) {
        ConflictsArgData[] conflictsData = ordinaryConflictsScreen.yf().getConflictsData();
        t.e(conflictsData, "getConflictsData(...)");
        List listG1 = n.g1(conflictsData);
        String wizardId = ordinaryConflictsScreen.yf().getWizardId();
        t.e(wizardId, "getWizardId(...)");
        return new OrdinaryConflictsPresenter(listG1, wizardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrdinaryConflictsScreenArgs yf() {
        return (OrdinaryConflictsScreenArgs) this.f24430b.getValue();
    }

    private final c4 zf() {
        c4 c4Var = this.f24429a;
        if (c4Var != null) {
            return c4Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void Bb(String str) {
        t.f(str, "conflictsResolveMethod");
        bh.a.b(this, new c(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void Rd(String str) {
        t.f(str, "conflictsResolveMethod");
        bh.a.b(this, new d(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24429a = c4.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = zf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24429a = null;
    }
}
