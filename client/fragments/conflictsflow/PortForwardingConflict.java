package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.fragments.conflictsflow.PortForwardingConflict;
import com.server.auditor.ssh.client.fragments.conflictsflow.f;
import com.server.auditor.ssh.client.presenters.vaults.PortForwardingConflictsPresenter;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.widget.ConflictInfoItemView;
import iu.p;
import java.util.ArrayList;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.i4;
import qu.k;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingConflict extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.vaults.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f24444d = {n0.g(new g0(PortForwardingConflict.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/PortForwardingConflictsPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24445e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i4 f24446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f24447b = new x(n0.b(PortForwardingConflictArgs.class), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24448c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24449a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24449a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingConflict.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24451a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConflictsArgData[] conflictsData = PortForwardingConflict.this.wf().getConflictsData();
            t.e(conflictsData, "getConflictsData(...)");
            ArrayList<ConflictsArgData> arrayList = new ArrayList();
            for (ConflictsArgData conflictsArgData : conflictsData) {
                if (t.b(conflictsArgData.getEntityType(), RuleDBModel.class)) {
                    arrayList.add(conflictsArgData);
                }
            }
            PortForwardingConflict portForwardingConflict = PortForwardingConflict.this;
            for (ConflictsArgData conflictsArgData2 : arrayList) {
                Context contextRequireContext = portForwardingConflict.requireContext();
                t.e(contextRequireContext, "requireContext(...)");
                ConflictInfoItemView conflictInfoItemView = new ConflictInfoItemView(contextRequireContext, null, 0, 0, 14, null);
                conflictInfoItemView.setLayoutParams(new ConstraintLayout.b(-1, -2));
                t.c(conflictsArgData2);
                conflictInfoItemView.setParameters(conflictsArgData2);
                portForwardingConflict.xf().f72731e.addView(conflictInfoItemView);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24453a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(PortForwardingConflict portForwardingConflict, View view) {
            portForwardingConflict.yf().v2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(PortForwardingConflict portForwardingConflict, View view) {
            portForwardingConflict.yf().w2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24453a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingConflict.this.xf().f72733g;
            final PortForwardingConflict portForwardingConflict = PortForwardingConflict.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.conflictsflow.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingConflict.c.l(portForwardingConflict, view);
                }
            });
            AppCompatTextView appCompatTextView = PortForwardingConflict.this.xf().f72734h;
            final PortForwardingConflict portForwardingConflict2 = PortForwardingConflict.this;
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.conflictsflow.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingConflict.c.m(portForwardingConflict2, view);
                }
            });
            PortForwardingConflict.this.zf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24455a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingConflict portForwardingConflict, View view) {
            portForwardingConflict.yf().u2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24455a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatImageView appCompatImageView = PortForwardingConflict.this.xf().f72729c;
            final PortForwardingConflict portForwardingConflict = PortForwardingConflict.this;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.conflictsflow.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingConflict.d.k(portForwardingConflict, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24457a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingConflict portForwardingConflict, View view) {
            portForwardingConflict.yf().t2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24457a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingConflict.this.xf().f72729c.setImageResource(R.drawable.ic_action_back_button);
            AppCompatImageView appCompatImageView = PortForwardingConflict.this.xf().f72729c;
            final PortForwardingConflict portForwardingConflict = PortForwardingConflict.this;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.conflictsflow.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingConflict.e.k(portForwardingConflict, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24459a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24459a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(PortForwardingConflict.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f24463c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingConflict.this.new g(this.f24463c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24461a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            f.a aVarA = com.server.auditor.ssh.client.fragments.conflictsflow.f.a(PortForwardingConflict.this.wf().getWayToMove(), PortForwardingConflict.this.wf().getWizardId(), PortForwardingConflict.this.wf().getTargetDragAndDropIdArg(), PortForwardingConflict.this.wf().getOrdinaryConflictsResolveMethod(), this.f24463c, PortForwardingConflict.this.wf().getTargetVaultKeyId(), PortForwardingConflict.this.wf().getCredentialsMode(), PortForwardingConflict.this.wf().getSourceData());
            t.e(aVarA, "actionPfConflictScreenTo…ictsProcessingScreen(...)");
            androidx.navigation.fragment.c.a(PortForwardingConflict.this).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24464a;

        public h(Fragment fragment) {
            this.f24464a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24464a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24464a + " has null arguments");
        }
    }

    public PortForwardingConflict() {
        iu.a aVar = new iu.a() { // from class: fh.i
            @Override // iu.a
            public final Object a() {
                return PortForwardingConflict.Af(this.f50015a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24448c = new MoxyKtxDelegate(mvpDelegate, PortForwardingConflictsPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingConflictsPresenter Af(PortForwardingConflict portForwardingConflict) {
        String ordinaryConflictsResolveMethod = portForwardingConflict.wf().getOrdinaryConflictsResolveMethod();
        t.e(ordinaryConflictsResolveMethod, "getOrdinaryConflictsResolveMethod(...)");
        String wizardId = portForwardingConflict.wf().getWizardId();
        t.e(wizardId, "getWizardId(...)");
        return new PortForwardingConflictsPresenter(ordinaryConflictsResolveMethod, wizardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingConflictArgs wf() {
        return (PortForwardingConflictArgs) this.f24447b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i4 xf() {
        i4 i4Var = this.f24446a;
        if (i4Var != null) {
            return i4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingConflictsPresenter yf() {
        return (PortForwardingConflictsPresenter) this.f24448c.getValue(this, f24444d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void Ed(String str) {
        t.f(str, "pfConflictsResolveMethod");
        bh.a.b(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void K3() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void K6() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void Q4() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24446a = i4.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = xf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24446a = null;
        super.onDestroyView();
    }
}
