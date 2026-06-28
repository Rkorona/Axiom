package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.facebook.drawee.view.SimpleDraweeView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.conflictsflow.ConflictsProcessingScreen;
import com.server.auditor.ssh.client.presenters.vaults.ConflictsProcessingPresenter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import iu.l;
import iu.p;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.a5;
import qu.k;
import ut.m0;
import vt.n;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConflictsProcessingScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.vaults.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a5 f24416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f24417b = new x(n0.b(ConflictsProcessingScreenArgs.class), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f24419d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f24414f = {n0.g(new g0(ConflictsProcessingScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/vaults/ConflictsProcessingPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24413e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f24415u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24420a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f24422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l10, zt.e eVar) {
            super(2, eVar);
            this.f24422c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConflictsProcessingScreen.this.new b(this.f24422c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ConflictsProcessingScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            if (this.f24422c != null) {
                Intent intent = new Intent();
                intent.putExtra("recreatedId", this.f24422c.longValue());
                fragmentActivityRequireActivity.setResult(1001, intent);
            } else {
                fragmentActivityRequireActivity.setResult(1001);
            }
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24423a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24424a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConflictsProcessingScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24424a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ConflictsProcessingScreen.this.vf().b().getContext(), R.anim.conflict_alpha_in);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(ConflictsProcessingScreen.this.vf().b().getContext(), R.anim.conflict_alpha_out);
            ConflictsProcessingScreen.this.vf().f71890i.setText(ConflictsProcessingScreen.this.getString(R.string.conflicts_success_title));
            ConflictsProcessingScreen.this.vf().f71884c.setProgress(100.0f);
            SimpleDraweeView simpleDraweeView = ConflictsProcessingScreen.this.vf().f71892k;
            t.e(simpleDraweeView, "successImage");
            simpleDraweeView.setVisibility(0);
            ConflictsProcessingScreen.this.vf().f71892k.startAnimation(animationLoadAnimation);
            ConflictsProcessingScreen.this.vf().f71887f.startAnimation(animationLoadAnimation2);
            ConflictsProcessingScreen.this.vf().f71887f.setVisibility(4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24426a;

        public e(Fragment fragment) {
            this.f24426a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24426a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24426a + " has null arguments");
        }
    }

    public ConflictsProcessingScreen() {
        iu.a aVar = new iu.a() { // from class: fh.b
            @Override // iu.a
            public final Object a() {
                return ConflictsProcessingScreen.yf(this.f50010a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24418c = new MoxyKtxDelegate(mvpDelegate, ConflictsProcessingPresenter.class.getName() + ".presenter", aVar);
    }

    private final ConflictsProcessingScreenArgs uf() {
        return (ConflictsProcessingScreenArgs) this.f24417b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a5 vf() {
        a5 a5Var = this.f24416a;
        if (a5Var != null) {
            return a5Var;
        }
        throw new IllegalStateException();
    }

    private final ConflictsProcessingPresenter wf() {
        return (ConflictsProcessingPresenter) this.f24418c.getValue(this, f24414f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 xf(ConflictsProcessingScreen conflictsProcessingScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        conflictsProcessingScreen.wf().B2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConflictsProcessingPresenter yf(ConflictsProcessingScreen conflictsProcessingScreen) {
        SourceEntitiesArgData[] sourceData = conflictsProcessingScreen.uf().getSourceData();
        t.e(sourceData, "getSourceData(...)");
        List listG1 = n.g1(sourceData);
        VaultKeyId targetVaultKeyId = conflictsProcessingScreen.uf().getTargetVaultKeyId();
        t.e(targetVaultKeyId, "getTargetVaultKeyId(...)");
        String ordinaryConflictsResolveMethod = conflictsProcessingScreen.uf().getOrdinaryConflictsResolveMethod();
        t.e(ordinaryConflictsResolveMethod, "getOrdinaryConflictsResolveMethod(...)");
        String pfConflictsResolveMethod = conflictsProcessingScreen.uf().getPfConflictsResolveMethod();
        t.e(pfConflictsResolveMethod, "getPfConflictsResolveMethod(...)");
        String credentialsMode = conflictsProcessingScreen.uf().getCredentialsMode();
        t.e(credentialsMode, "getCredentialsMode(...)");
        long targetDragAndDropIdArg = conflictsProcessingScreen.uf().getTargetDragAndDropIdArg();
        String wizardId = conflictsProcessingScreen.uf().getWizardId();
        t.e(wizardId, "getWizardId(...)");
        String wayToMove = conflictsProcessingScreen.uf().getWayToMove();
        t.e(wayToMove, "getWayToMove(...)");
        return new ConflictsProcessingPresenter(listG1, targetVaultKeyId, ordinaryConflictsResolveMethod, pfConflictsResolveMethod, credentialsMode, targetDragAndDropIdArg, wizardId, wayToMove);
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void h3(Long l10) {
        bh.a.b(this, new b(l10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void jd() {
        bh.a.b(this, new d(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fh.a
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ConflictsProcessingScreen.xf(this.f50009a, (e0) obj);
            }
        }, 2, null);
        this.f24419d = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24416a = a5.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = vf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24416a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24419d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}
