package com.server.auditor.ssh.client.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import moxy.MvpBottomSheetDialogFragment;
import moxy.MvpView;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends MvpBottomSheetDialogFragment implements MvpView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46775f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46776u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f46777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qq.a f46778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f46780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qg.c1 f46781e;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46782a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return i.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f46782a;
            if (i10 == 0) {
                ut.x.b(obj);
                w6.y.b(i.this.Af().b(), new w6.b());
                i.this.Af().f72078k.setVisibility(4);
                i.this.Af().f72082o.setVisibility(4);
                ConstraintLayout constraintLayout = i.this.Af().f72074g;
                ju.t.e(constraintLayout, "multikeyModeInfoLayout");
                if (constraintLayout.getVisibility() == 0) {
                    i.this.Af().f72074g.setVisibility(4);
                }
                i.this.Af().f72069b.setVisibility(4);
                ConstraintLayout constraintLayout2 = i.this.Af().f72084q;
                ju.t.e(constraintLayout2, "successLayout");
                constraintLayout2.setVisibility(0);
                this.f46782a = 1;
                if (wu.s0.b(2000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            i.this.dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public i(k kVar, qq.a aVar, boolean z10) {
        ju.t.f(kVar, "callback");
        ju.t.f(aVar, "vaultFlowData");
        this.f46777a = kVar;
        this.f46778b = aVar;
        this.f46779c = z10;
        this.f46780d = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.c1 Af() {
        qg.c1 c1Var = this.f46781e;
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(i iVar, View view) {
        iVar.Ef("no_credentials_sharing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(i iVar, View view) {
        iVar.Ef("credentials_sharing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(i iVar, View view) {
        iVar.Ef("multikey");
    }

    private final void Ef(String str) {
        this.f46777a.O8(qq.a.b(this.f46778b, null, false, null, false, false, false, null, str, 127, null));
    }

    public final void Z2() {
        bh.a.b(this, new b(null));
    }

    public void a() {
        if (this.f46779c) {
            this.f46779c = this.f46780d.a();
        }
        Af().f72078k.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.Bf(this.f46757a, view);
            }
        });
        Af().f72082o.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.Cf(this.f46759a, view);
            }
        });
        if (!this.f46779c) {
            ConstraintLayout constraintLayout = Af().f72074g;
            ju.t.e(constraintLayout, "multikeyModeInfoLayout");
            constraintLayout.setVisibility(8);
        } else {
            Af().f72074g.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.Df(this.f46761a, view);
                }
            });
            ConstraintLayout constraintLayout2 = Af().f72074g;
            ju.t.e(constraintLayout2, "multikeyModeInfoLayout");
            constraintLayout2.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.d, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        ju.t.e(dialogOnCreateDialog, "onCreateDialog(...)");
        BottomSheetBehavior bottomSheetBehaviorI = ((com.google.android.material.bottomsheet.c) dialogOnCreateDialog).i();
        ju.t.e(bottomSheetBehaviorI, "getBehavior(...)");
        bottomSheetBehaviorI.Y0(3);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f46781e = qg.c1.c(getLayoutInflater(), viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = Af().b();
        ju.t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f46781e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        a();
    }
}
