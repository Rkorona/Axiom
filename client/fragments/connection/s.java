package com.server.auditor.ssh.client.fragments.connection;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.fragments.connection.c;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import com.server.auditor.ssh.client.sshid.KeyPairStatus;
import com.server.auditor.ssh.client.sshid.SshIdAuthData;
import ei.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import qg.b6;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements com.server.auditor.ssh.client.fragments.connection.c, l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24701d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24702e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b6 f24703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewConnectionFlowPresenter f24704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ei.r f24705c;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f24706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f24707b;

        b(ConstraintLayout constraintLayout, MaterialButton materialButton) {
            this.f24706a = constraintLayout;
            this.f24707b = materialButton;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f24706a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f24706a.getWidth() / this.f24706a.getResources().getDisplayMetrics().density < 368.0f) {
                ViewGroup.LayoutParams layoutParams = this.f24707b.getLayoutParams();
                layoutParams.width = -2;
                this.f24707b.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f24707b.getLayoutParams();
                ju.t.d(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                this.f24707b.setLayoutParams(bVar);
            }
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            KeyPairStatus keyPairStatus = ((SshIdAuthData) obj).getKeyPairStatus();
            KeyPairStatus keyPairStatus2 = KeyPairStatus.FAILED;
            return yt.a.e(Boolean.valueOf(keyPairStatus != keyPairStatus2), Boolean.valueOf(((SshIdAuthData) obj2).getKeyPairStatus() != keyPairStatus2));
        }
    }

    public s(b6 b6Var, NewConnectionFlowPresenter newConnectionFlowPresenter) {
        ju.t.f(b6Var, "binding");
        ju.t.f(newConnectionFlowPresenter, "presenter");
        this.f24703a = b6Var;
        this.f24704b = newConnectionFlowPresenter;
    }

    private final void h(MaterialButton materialButton) {
        ConstraintLayout constraintLayout = this.f24703a.f72002f;
        ju.t.e(constraintLayout, "failedButtonsContainer");
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new b(constraintLayout, materialButton));
    }

    private final void i(Context context) {
        int color = context.getColor(R.color.ssh_id_passkey_divider_bg);
        int color2 = context.getColor(R.color.ssh_id_passkey_divider);
        RecyclerView recyclerView = this.f24703a.f72012p;
        Context context2 = this.f24703a.f72012p.getContext();
        ju.t.e(context2, "getContext(...)");
        recyclerView.i(new gh.n(context2, color, color2, 15.0f, 1.0f, false, new iu.p() { // from class: gh.j1
            @Override // iu.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(com.server.auditor.ssh.client.fragments.connection.s.j(((Integer) obj).intValue(), (RecyclerView) obj2));
            }
        }, 32, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(int i10, RecyclerView recyclerView) {
        ju.t.f(recyclerView, "parent");
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter instanceof ei.r) {
            return ((ei.r) adapter).Q(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(s sVar, View view) {
        sVar.f24704b.t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(s sVar, View view) {
        sVar.f24704b.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(s sVar, View view) {
        sVar.f24704b.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(s sVar, View view) {
        sVar.f24704b.w3();
    }

    private final boolean o(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((SshIdAuthData) it.next()).getKeyPairStatus() != KeyPairStatus.FAILED) {
                return true;
            }
        }
        return false;
    }

    private final List p(List list) {
        List<SshIdAuthData> listR0 = vt.v.R0(list, new c());
        for (SshIdAuthData sshIdAuthData : listR0) {
            if (sshIdAuthData.getKeyPairStatus() == KeyPairStatus.SKIPPED) {
                sshIdAuthData.setKeyPairStatus(KeyPairStatus.READY_TO_USE);
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (SshIdAuthData sshIdAuthData2 : listR0) {
            if (sshIdAuthData2.getKeyPairStatus() != KeyPairStatus.FAILED && !z10) {
                arrayList.add(r.d.a.f48775a);
                z10 = true;
            }
            arrayList.add(new r.d.b(sshIdAuthData2));
        }
        return arrayList;
    }

    private final void q(View view) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.3f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.3f, 1.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(1);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(1000L);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setRepeatMode(1);
        objectAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(s sVar) {
        sVar.f24703a.f72000d.fullScroll(130);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void B1() {
        ei.r rVar = this.f24705c;
        ei.r rVar2 = null;
        if (rVar == null) {
            ju.t.t("passkeysAdapter");
            rVar = null;
        }
        rVar.T(true);
        ei.r rVar3 = this.f24705c;
        if (rVar3 == null) {
            ju.t.t("passkeysAdapter");
        } else {
            rVar2 = rVar3;
        }
        rVar2.o();
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean Ga(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void J1(iu.l lVar) {
        c.a.d(this, lVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void L1(boolean z10) {
        c.a.e(this, z10);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public void V8(int i10, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        ei.r rVar = this.f24705c;
        ei.r rVar2 = null;
        if (rVar == null) {
            ju.t.t("passkeysAdapter");
            rVar = null;
        }
        rVar.U(i10);
        MaterialButton materialButton = this.f24703a.f72017u;
        ei.r rVar3 = this.f24705c;
        if (rVar3 == null) {
            ju.t.t("passkeysAdapter");
        } else {
            rVar2 = rVar3;
        }
        materialButton.setEnabled(rVar2.L());
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void b1(iu.a aVar) {
        c.a.c(this, aVar);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void c() {
        Context context = this.f24703a.b().getContext();
        this.f24705c = new ei.r(this);
        ei.r rVar = null;
        this.f24703a.f72012p.setItemAnimator(null);
        RecyclerView recyclerView = this.f24703a.f72012p;
        ei.r rVar2 = this.f24705c;
        if (rVar2 == null) {
            ju.t.t("passkeysAdapter");
        } else {
            rVar = rVar2;
        }
        recyclerView.setAdapter(rVar);
        this.f24703a.f72012p.setLayoutManager(new LinearLayoutManager(context));
        ju.t.c(context);
        i(context);
        this.f24703a.f72017u.setOnClickListener(new View.OnClickListener() { // from class: gh.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.s.k(this.f51288a, view);
            }
        });
        this.f24703a.f72006j.setOnClickListener(new View.OnClickListener() { // from class: gh.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.s.l(this.f51291a, view);
            }
        });
        this.f24703a.f72005i.setOnClickListener(new View.OnClickListener() { // from class: gh.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.s.m(this.f51294a, view);
            }
        });
        this.f24703a.f72014r.setOnClickListener(new View.OnClickListener() { // from class: gh.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.connection.s.n(this.f51298a, view);
            }
        });
        AppCompatImageView appCompatImageView = this.f24703a.f72011o;
        ju.t.e(appCompatImageView, "smallCircle");
        q(appCompatImageView);
        AppCompatImageView appCompatImageView2 = this.f24703a.f71998b;
        ju.t.e(appCompatImageView2, "bigCircle");
        q(appCompatImageView2);
    }

    @Override // com.server.auditor.ssh.client.fragments.hostngroups.l0
    public boolean hb(int i10, Point point, com.server.auditor.ssh.client.fragments.hostngroups.c cVar) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void O0(NewConnectionFlowDialog.b.o oVar) {
        ju.t.f(oVar, "step");
        List listB = oVar.b();
        if (!o(listB)) {
            MaterialButton materialButton = this.f24703a.f72014r;
            ju.t.e(materialButton, "startOverButton");
            h(materialButton);
            this.f24704b.S2();
            this.f24703a.f72008l.setVisibility(8);
            this.f24703a.f72010n.setVisibility(4);
            this.f24703a.f72009m.setVisibility(0);
            this.f24703a.f71999c.setText(oVar.a());
            this.f24703a.f71999c.post(new Runnable() { // from class: gh.i1
                @Override // java.lang.Runnable
                public final void run() {
                    com.server.auditor.ssh.client.fragments.connection.s.s(this.f51300a);
                }
            });
            return;
        }
        MaterialButton materialButton2 = this.f24703a.f72017u;
        ju.t.e(materialButton2, "tryAgainButton");
        h(materialButton2);
        List listP = p(listB);
        ei.r rVar = this.f24705c;
        if (rVar == null) {
            ju.t.t("passkeysAdapter");
            rVar = null;
        }
        rVar.V(listP);
        B1();
        this.f24703a.f72008l.setVisibility(0);
        this.f24703a.f72010n.setVisibility(4);
    }

    @Override // com.server.auditor.ssh.client.fragments.connection.c
    public void z0() {
        ei.r rVar = this.f24705c;
        ei.r rVar2 = null;
        if (rVar == null) {
            ju.t.t("passkeysAdapter");
            rVar = null;
        }
        rVar.T(false);
        ei.r rVar3 = this.f24705c;
        if (rVar3 == null) {
            ju.t.t("passkeysAdapter");
        } else {
            rVar2 = rVar3;
        }
        rVar2.o();
    }
}
