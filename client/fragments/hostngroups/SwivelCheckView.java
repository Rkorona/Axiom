package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import com.server.auditor.ssh.client.fragments.hostngroups.p1;
import qg.f3;

/* JADX INFO: loaded from: classes3.dex */
public final class SwivelCheckView extends ViewFlipper implements Checkable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f25038u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f25039v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu.a f25040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.l f25041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Animation f25042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animation f25043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f3 f25045f;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwivelCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        ju.t.f(attributeSet, "attrs");
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.q1
            @Override // iu.a
            public final Object a() {
                return Float.valueOf(SwivelCheckView.c(this.f25194a));
            }
        };
        this.f25040a = aVar;
        iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.r1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SwivelCheckView.e(this.f25195a, (DisplaySide) obj);
            }
        };
        this.f25041b = lVar;
        p1.a aVar2 = p1.f25180e;
        this.f25042c = aVar2.b(aVar, lVar);
        this.f25043d = aVar2.c(aVar, lVar);
        this.f25045f = f3.b(LayoutInflater.from(context), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(SwivelCheckView swivelCheckView) {
        return swivelCheckView.getWidth() * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(SwivelCheckView swivelCheckView, DisplaySide displaySide) {
        ju.t.f(displaySide, "it");
        swivelCheckView.setDisplaySide(displaySide);
        return ut.m0.f82633a;
    }

    private final f3 getBinding() {
        f3 f3Var = this.f25045f;
        if (f3Var != null) {
            return f3Var;
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ void setChecked$default(SwivelCheckView swivelCheckView, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        swivelCheckView.setChecked(z10, z11);
    }

    private final void setDisplaySide(DisplaySide displaySide) {
        if (getDisplayedChild() != displaySide.getViewFlipperChildIndex()) {
            setDisplayedChild(displaySide.getViewFlipperChildIndex());
        }
    }

    public final ImageView d() {
        AppCompatImageView appCompatImageView = getBinding().f72429b;
        ju.t.e(appCompatImageView, "imageView");
        return appCompatImageView;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25044e;
    }

    public final void setChecked(boolean z10, boolean z11) {
        if (z11) {
            setChecked(z10);
        } else {
            setDisplaySide(z10 ? DisplaySide.BACK : DisplaySide.FRONT);
            this.f25044e = z10;
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f25044e);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (z10 == this.f25044e) {
            return;
        }
        if (z10) {
            this.f25044e = true;
            startAnimation(this.f25042c);
        } else {
            this.f25044e = false;
            startAnimation(this.f25043d);
        }
    }
}
