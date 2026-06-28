package com.server.auditor.ssh.client.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.o1;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.server.auditor.ssh.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import w6.w;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionProgressView extends ConstraintLayout {
    public static final a S = new a(null);
    public static final int T = 8;
    private final ArrayList N;
    private final Flow O;
    private final View P;
    private AppCompatImageView Q;
    private long R;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccelerateDecelerateInterpolator b() {
            return new AccelerateDecelerateInterpolator();
        }

        private a() {
        }
    }

    public static final class c implements w.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f46515a;

        c(iu.a aVar) {
            this.f46515a = aVar;
        }

        @Override // w6.w.f
        public void a(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void b(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void c(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void d(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void e(w6.w wVar) {
            ju.t.f(wVar, "transition");
            this.f46515a.a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionProgressView(Context context) {
        this(context, null, 0, 6, null);
        ju.t.f(context, "context");
    }

    static /* synthetic */ CircularProgressIndicator A(ConnectionProgressView connectionProgressView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8;
        }
        return connectionProgressView.z(i10, i11);
    }

    private final void B() {
        CircularProgressIndicator circularProgressIndicatorZ = z(this.O.getId(), 4);
        if (circularProgressIndicatorZ.isInEditMode()) {
            circularProgressIndicatorZ.setVisibility(0);
        }
    }

    private final void C() {
        AppCompatImageView appCompatImageViewF = F();
        this.N.add(new b(appCompatImageViewF, A(this, appCompatImageViewF.getId(), 0, 2, null)));
        appCompatImageViewF.setImageResource(R.drawable.ic_connection_initialized);
        appCompatImageViewF.setBackground(androidx.core.content.a.getDrawable(getContext(), R.drawable.connection_progress_active_circle));
        this.O.h(appCompatImageViewF);
        R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D() {
        AppCompatImageView appCompatImageViewF = F();
        this.N.add(new b(appCompatImageViewF, null, 2, 0 == true ? 1 : 0));
        appCompatImageViewF.setImageResource(R.drawable.ic_terminal_is_ready);
        appCompatImageViewF.setBackground(androidx.core.content.a.getDrawable(getContext(), R.drawable.connection_progress_not_started_circle));
        this.O.h(appCompatImageViewF);
        R();
    }

    private final AppCompatImageView F() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(View.generateViewId());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.connection_progress_icon_size);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(dimensionPixelSize, dimensionPixelSize));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(appCompatImageView);
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(int i10, int i11, int i12, ConnectionProgressView connectionProgressView, ValueAnimator valueAnimator) {
        ju.t.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int iC = d4.c.c(i10, i11, ((Float) animatedValue).floatValue());
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        int iC2 = d4.c.c(i12, i11, ((Float) animatedValue2).floatValue());
        connectionProgressView.P.setBackgroundColor(iC);
        int i13 = 0;
        for (Object obj : connectionProgressView.N) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            if (i13 < vt.v.q(connectionProgressView.N)) {
                bVar.b().getBackground().mutate().setTint(iC);
            } else {
                bVar.b().getBackground().mutate().setTint(iC2);
            }
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(int i10, int i11, int i12, ConnectionProgressView connectionProgressView, ValueAnimator valueAnimator) {
        ju.t.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int iC = d4.c.c(i10, i11, ((Float) animatedValue).floatValue());
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        int iC2 = d4.c.c(i12, i11, ((Float) animatedValue2).floatValue());
        connectionProgressView.P.setBackgroundColor(iC);
        int i13 = 0;
        for (Object obj : connectionProgressView.N) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            if (i13 < vt.v.q(connectionProgressView.N)) {
                bVar.b().getBackground().mutate().setTint(iC);
            } else {
                bVar.b().getBackground().mutate().setTint(iC2);
            }
            i13 = i14;
        }
    }

    private final AppCompatImageView M(int i10) {
        AppCompatImageView appCompatImageViewF = F();
        CircularProgressIndicator circularProgressIndicatorA = A(this, appCompatImageViewF.getId(), 0, 2, null);
        appCompatImageViewF.setImageResource(i10);
        appCompatImageViewF.setBackground(androidx.core.content.a.getDrawable(getContext(), R.drawable.connection_progress_active_circle));
        Object obj = this.N.get(vt.v.q(r7) - 1);
        ju.t.e(obj, "get(...)");
        b bVar = (b) obj;
        AppCompatImageView appCompatImageViewB = bVar.b();
        appCompatImageViewF.setLeft(appCompatImageViewB.getLeft());
        appCompatImageViewF.setTop(appCompatImageViewB.getTop());
        appCompatImageViewF.setRight(appCompatImageViewB.getRight());
        appCompatImageViewF.setBottom(appCompatImageViewB.getBottom());
        ArrayList arrayList = this.N;
        arrayList.add(vt.v.q(arrayList), new b(appCompatImageViewF, circularProgressIndicatorA));
        appCompatImageViewB.setElevation(appCompatImageViewB.getElevation() + 0.1f);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.s(appCompatImageViewF.getId(), 6, appCompatImageViewB.getId(), 6);
        cVar.s(appCompatImageViewF.getId(), 3, appCompatImageViewB.getId(), 3);
        cVar.n(this.P.getId(), 7);
        cVar.s(this.P.getId(), 7, appCompatImageViewF.getId(), 6);
        cVar.i(this);
        CircularProgressIndicator circularProgressIndicatorA2 = bVar.a();
        if (circularProgressIndicatorA2 != null) {
            circularProgressIndicatorA2.j();
        }
        return appCompatImageViewF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(int i10, int i11, int i12, ConnectionProgressView connectionProgressView, ValueAnimator valueAnimator) {
        ju.t.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int iC = d4.c.c(i10, i11, ((Float) animatedValue).floatValue());
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        ju.t.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        int iC2 = d4.c.c(i12, i11, ((Float) animatedValue2).floatValue());
        connectionProgressView.P.setBackgroundColor(iC);
        int i13 = 0;
        for (Object obj : connectionProgressView.N) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            if (i13 < vt.v.q(connectionProgressView.N)) {
                bVar.b().getBackground().mutate().setTint(iC);
            } else {
                bVar.b().getBackground().mutate().setTint(iC2);
            }
            i13 = i14;
        }
    }

    private final w6.a0 Q() {
        w6.a0 a0Var = new w6.a0();
        a0Var.q0(0);
        a0Var.Z(S.b());
        a0Var.X(this.R);
        Iterator it = this.N.iterator();
        ju.t.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            ju.t.e(next, "next(...)");
            b bVar = (b) next;
            w6.d dVar = new w6.d();
            dVar.d(bVar.b());
            a0Var.i0(dVar);
            CircularProgressIndicator circularProgressIndicatorA = bVar.a();
            if (circularProgressIndicatorA != null) {
                w6.d dVar2 = new w6.d();
                dVar2.d(circularProgressIndicatorA);
                a0Var.i0(dVar2);
            }
        }
        w6.d dVar3 = new w6.d();
        dVar3.d(this.P);
        a0Var.i0(dVar3);
        return a0Var;
    }

    private final void R() {
        Flow flow = this.O;
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((b) it.next()).b().getId()));
        }
        flow.setReferencedIds(vt.v.c1(arrayList2));
    }

    private final CircularProgressIndicator z(int i10, int i11) {
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(getContext());
        circularProgressIndicator.setId(View.generateViewId());
        circularProgressIndicator.setTrackThickness(circularProgressIndicator.getResources().getDimensionPixelSize(R.dimen.connection_progress_circle_indicator_width));
        circularProgressIndicator.setIndicatorSize(circularProgressIndicator.getResources().getDimensionPixelSize(R.dimen.connection_progress_circle_indicator_size));
        circularProgressIndicator.setTrackCornerRadius(circularProgressIndicator.getResources().getDimensionPixelSize(R.dimen.connection_progress_circle_indicator_corner_round));
        circularProgressIndicator.setIndicatorInset(0);
        circularProgressIndicator.setLayoutParams(new ConstraintLayout.b(circularProgressIndicator.getIndicatorSize(), circularProgressIndicator.getIndicatorSize()));
        circularProgressIndicator.setIndicatorColor(androidx.core.content.a.getColor(circularProgressIndicator.getContext(), R.color.palette_blue));
        circularProgressIndicator.setIndeterminate(true);
        circularProgressIndicator.setShowAnimationBehavior(1);
        circularProgressIndicator.setHideAnimationBehavior(2);
        circularProgressIndicator.setVisibility(i11);
        addView(circularProgressIndicator);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.s(circularProgressIndicator.getId(), 6, i10, 6);
        cVar.s(circularProgressIndicator.getId(), 7, i10, 7);
        cVar.s(circularProgressIndicator.getId(), 3, i10, 3);
        cVar.s(circularProgressIndicator.getId(), 4, i10, 4);
        cVar.i(this);
        return circularProgressIndicator;
    }

    public final void E(int i10) {
        AppCompatImageView appCompatImageViewM = M(i10);
        w6.a0 a0VarQ = Q();
        requestLayout();
        w6.y.b(this, a0VarQ);
        this.O.h(appCompatImageViewM);
        R();
    }

    public final void G() {
        AppCompatImageView appCompatImageView = this.Q;
        if (appCompatImageView != null) {
            this.Q = null;
            this.O.h(appCompatImageView);
            R();
        }
    }

    public final void H() {
        CircularProgressIndicator circularProgressIndicatorA = ((b) this.N.get(vt.v.q(r0) - 1)).a();
        if (circularProgressIndicatorA != null) {
            circularProgressIndicatorA.j();
        }
    }

    public final void I() {
        w6.b bVar = new w6.b();
        bVar.q0(0);
        bVar.Z(S.b());
        bVar.X(this.R);
        w6.y.b(this, bVar);
        CircularProgressIndicator circularProgressIndicatorA = ((b) this.N.get(vt.v.q(r0) - 1)).a();
        if (circularProgressIndicatorA != null) {
            circularProgressIndicatorA.j();
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.n(this.P.getId(), 7);
        cVar.s(this.P.getId(), 7, ((b) vt.v.B0(this.N)).b().getId(), 6);
        cVar.i(this);
        final int iJ = o1.j(rk.b.d());
        final int iJ2 = o1.j(rk.b.Z());
        final int iJ3 = o1.j(rk.b.D());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.server.auditor.ssh.client.widget.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConnectionProgressView.J(iJ, iJ2, iJ3, this, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.R);
        valueAnimatorOfFloat.start();
    }

    public final void K(iu.a aVar) {
        ju.t.f(aVar, "onFinishTransition");
        w6.b bVar = new w6.b();
        bVar.b(new c(aVar));
        bVar.q0(0);
        bVar.Z(S.b());
        bVar.X(this.R);
        w6.y.b(this, bVar);
        CircularProgressIndicator circularProgressIndicatorA = ((b) this.N.get(vt.v.q(r5) - 1)).a();
        if (circularProgressIndicatorA != null) {
            circularProgressIndicatorA.j();
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.n(this.P.getId(), 7);
        cVar.s(this.P.getId(), 7, ((b) vt.v.B0(this.N)).b().getId(), 6);
        cVar.i(this);
        final int iJ = o1.j(rk.b.d());
        final int iJ2 = o1.j(rk.b.z());
        final int iJ3 = o1.j(rk.b.D());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.server.auditor.ssh.client.widget.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConnectionProgressView.L(iJ, iJ2, iJ3, this, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.R);
        valueAnimatorOfFloat.start();
    }

    public final w6.a0 N() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.n(this.P.getId(), 7);
        cVar.s(this.P.getId(), 7, ((b) vt.v.B0(this.N)).b().getId(), 6);
        cVar.i(this);
        final int iJ = o1.j(rk.b.d());
        final int iJ2 = o1.j(rk.b.Z());
        final int iJ3 = o1.j(rk.b.D());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.server.auditor.ssh.client.widget.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConnectionProgressView.O(iJ, iJ2, iJ3, this, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.R);
        valueAnimatorOfFloat.start();
        w6.a0 a0Var = new w6.a0();
        a0Var.q0(0);
        a0Var.Z(S.b());
        a0Var.X(this.R);
        CircularProgressIndicator circularProgressIndicatorA = ((b) this.N.get(vt.v.q(r1) - 1)).a();
        if (circularProgressIndicatorA != null) {
            circularProgressIndicatorA.j();
        }
        Iterator it = this.N.iterator();
        ju.t.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            ju.t.e(next, "next(...)");
            b bVar = (b) next;
            w6.d dVar = new w6.d();
            dVar.d(bVar.b());
            a0Var.i0(dVar);
            CircularProgressIndicator circularProgressIndicatorA2 = bVar.a();
            if (circularProgressIndicatorA2 != null) {
                w6.d dVar2 = new w6.d();
                dVar2.d(circularProgressIndicatorA2);
                a0Var.i0(dVar2);
            }
        }
        w6.d dVar3 = new w6.d();
        dVar3.d(this.P);
        a0Var.i0(dVar3);
        return a0Var;
    }

    public final w6.a0 P(int i10) {
        AppCompatImageView appCompatImageViewM = M(i10);
        w6.a0 a0VarQ = Q();
        this.Q = appCompatImageViewM;
        requestLayout();
        return a0VarQ;
    }

    public final void S() {
        int iJ = o1.j(rk.b.d());
        int iJ2 = o1.j(rk.b.D());
        this.P.setBackgroundColor(iJ);
        int i10 = 0;
        for (Object obj : this.N) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            if (i10 < vt.v.q(this.N)) {
                bVar.b().getBackground().mutate().setTint(iJ);
            } else {
                bVar.b().getBackground().mutate().setTint(iJ2);
            }
            i10 = i11;
        }
        for (int iQ = vt.v.q(this.N) - 1; iQ > 0; iQ--) {
            Object obj2 = this.N.get(iQ);
            ju.t.e(obj2, "get(...)");
            b bVar2 = (b) obj2;
            this.O.r(bVar2.b());
            removeView(bVar2.b());
            removeView(bVar2.a());
            this.N.remove(iQ);
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.s(this.P.getId(), 6, this.O.getId(), 6);
        cVar.s(this.P.getId(), 3, 0, 3);
        cVar.s(this.P.getId(), 7, ((b) vt.v.p0(this.N)).b().getId(), 6);
        cVar.s(this.P.getId(), 4, 0, 4);
        cVar.i(this);
        requestLayout();
        R();
    }

    public final void T() {
        int iJ = o1.j(rk.b.d());
        this.P.setBackgroundColor(iJ);
        int i10 = 0;
        for (Object obj : this.N) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            bVar.b().getBackground().mutate().setTint(iJ);
            CircularProgressIndicator circularProgressIndicatorA = bVar.a();
            if (circularProgressIndicatorA != null) {
                circularProgressIndicatorA.setIndicatorColor(iJ);
            }
            i10 = i11;
        }
    }

    public final void U() {
        CircularProgressIndicator circularProgressIndicatorA = ((b) this.N.get(vt.v.q(r0) - 1)).a();
        if (circularProgressIndicatorA != null) {
            circularProgressIndicatorA.p();
        }
    }

    public final long getAnimationDuration() {
        return this.R;
    }

    public final void setAnimationDuration(long j10) {
        this.R = j10;
    }

    public final void setColorForSshId() {
        int iJ = o1.j(rk.b.W());
        this.P.setBackgroundColor(iJ);
        int i10 = 0;
        for (Object obj : this.N) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            b bVar = (b) obj;
            bVar.b().getBackground().mutate().setTint(iJ);
            CircularProgressIndicator circularProgressIndicatorA = bVar.a();
            if (circularProgressIndicatorA != null) {
                circularProgressIndicatorA.setIndicatorColor(iJ);
            }
            i10 = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ju.t.f(context, "context");
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppCompatImageView f46513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CircularProgressIndicator f46514b;

        public b(AppCompatImageView appCompatImageView, CircularProgressIndicator circularProgressIndicator) {
            ju.t.f(appCompatImageView, "stepView");
            this.f46513a = appCompatImageView;
            this.f46514b = circularProgressIndicator;
        }

        public final CircularProgressIndicator a() {
            return this.f46514b;
        }

        public final AppCompatImageView b() {
            return this.f46513a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ju.t.b(this.f46513a, bVar.f46513a) && ju.t.b(this.f46514b, bVar.f46514b);
        }

        public int hashCode() {
            int iHashCode = this.f46513a.hashCode() * 31;
            CircularProgressIndicator circularProgressIndicator = this.f46514b;
            return iHashCode + (circularProgressIndicator == null ? 0 : circularProgressIndicator.hashCode());
        }

        public String toString() {
            return "StepViewHolder(stepView=" + this.f46513a + ", progressCircle=" + this.f46514b + ")";
        }

        public /* synthetic */ b(AppCompatImageView appCompatImageView, CircularProgressIndicator circularProgressIndicator, int i10, ju.k kVar) {
            this(appCompatImageView, (i10 & 2) != 0 ? null : circularProgressIndicator);
        }
    }

    public /* synthetic */ ConnectionProgressView(Context context, AttributeSet attributeSet, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        this.R = 285L;
        LayoutInflater.from(context).inflate(R.layout.simple_connection_progress, (ViewGroup) this, true);
        Flow flow = new Flow(context);
        flow.setId(View.generateViewId());
        flow.setLayoutParams(new ConstraintLayout.b(0, flow.getResources().getDimensionPixelSize(R.dimen.connection_progress_circle_indicator_size)));
        flow.setHorizontalStyle(1);
        flow.setOrientation(0);
        this.O = flow;
        addView(flow);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(this);
        cVar.n(flow.getId(), 7);
        cVar.n(flow.getId(), 6);
        cVar.n(flow.getId(), 3);
        cVar.n(flow.getId(), 4);
        cVar.s(flow.getId(), 6, 0, 6);
        cVar.s(flow.getId(), 7, 0, 7);
        cVar.s(flow.getId(), 3, 0, 3);
        cVar.s(flow.getId(), 4, 0, 4);
        cVar.i(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.connection_progress_start_end_margin);
        ViewGroup.LayoutParams layoutParams = flow.getLayoutParams();
        ju.t.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMarginStart(dimensionPixelSize);
        bVar.setMarginEnd(dimensionPixelSize);
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, view.getResources().getDimensionPixelSize(R.dimen.connection_progress_bar_height)));
        view.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.palette_light_grey_3));
        addView(view);
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.p(this);
        cVar2.s(view.getId(), 6, flow.getId(), 6);
        cVar2.s(view.getId(), 3, 0, 3);
        cVar2.s(view.getId(), 7, flow.getId(), 7);
        cVar2.s(view.getId(), 4, 0, 4);
        cVar2.i(this);
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setLayoutParams(new ConstraintLayout.b(0, view2.getResources().getDimensionPixelSize(R.dimen.connection_progress_bar_height)));
        view2.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.palette_blue));
        this.P = view2;
        addView(view2);
        B();
        C();
        androidx.constraintlayout.widget.c cVar3 = new androidx.constraintlayout.widget.c();
        cVar3.p(this);
        cVar3.s(view2.getId(), 6, view.getId(), 6);
        cVar3.s(view2.getId(), 3, 0, 3);
        cVar3.s(view2.getId(), 7, ((b) arrayList.get(vt.v.q(arrayList))).b().getId(), 6);
        cVar3.s(view2.getId(), 4, 0, 4);
        cVar3.i(this);
        D();
    }
}
