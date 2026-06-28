package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ProgressButton extends MaterialButton {
    private String F;
    private String G;
    private String H;
    private Drawable I;
    private Drawable J;
    private long K;
    private int L;
    private int M;
    private final Interpolator N;
    private final Transformation O;
    private final AlphaAnimation P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private Drawable W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f46545a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Runnable f46546b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private iu.a f46547c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final mu.c f46548d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f46543f0 = {ju.n0.e(new ju.a0(ProgressButton.class, "buttonState", "getButtonState()Lcom/server/auditor/ssh/client/widget/ProgressButton$ProgressButtonState;", 0))};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final a f46542e0 = new a(null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f46544g0 = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46549a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.widget.ProgressButton$b$b, reason: collision with other inner class name */
        public static final class C0663b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0663b f46550a = new C0663b();

            private C0663b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f46551a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends mu.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressButton f46552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, ProgressButton progressButton) {
            super(obj);
            this.f46552b = progressButton;
        }

        @Override // mu.b
        protected void c(qu.k kVar, Object obj, Object obj2) {
            ju.t.f(kVar, "property");
            b bVar = (b) obj2;
            if (ju.t.b((b) obj, bVar)) {
                return;
            }
            if (ju.t.b(bVar, b.a.f46549a)) {
                this.f46552b.z();
                this.f46552b.A(true);
                this.f46552b.w();
            } else {
                if (ju.t.b(bVar, b.C0663b.f46550a)) {
                    this.f46552b.y();
                    this.f46552b.z();
                    this.f46552b.v();
                    this.f46552b.A(true);
                    return;
                }
                if (!ju.t.b(bVar, b.c.f46551a)) {
                    throw new ut.s();
                }
                this.f46552b.y();
                this.f46552b.x();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context) {
        this(context, null, 0, 6, null);
        ju.t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        if (this.T) {
            setEnabled(z10);
        }
    }

    private final b getButtonState() {
        return (b) this.f46548d0.a(this, f46543f0[0]);
    }

    private final Drawable getDefaultProgressIndicator() {
        Drawable drawableMutate = new androidx.swiperefreshlayout.widget.b(getContext()).mutate();
        ju.t.d(drawableMutate, "null cannot be cast to non-null type androidx.swiperefreshlayout.widget.CircularProgressDrawable");
        androidx.swiperefreshlayout.widget.b bVar = (androidx.swiperefreshlayout.widget.b) drawableMutate;
        bVar.f(this.M);
        bVar.l(1);
        return bVar;
    }

    private final void q() {
        Drawable drawable = this.I;
        if (drawable instanceof androidx.swiperefreshlayout.widget.b) {
            ju.t.d(drawable, "null cannot be cast to non-null type androidx.swiperefreshlayout.widget.CircularProgressDrawable");
            ((androidx.swiperefreshlayout.widget.b) drawable).f(this.M);
        } else {
            drawable.setTint(this.M);
        }
        postInvalidate();
    }

    private final void r() {
        Runnable runnable = this.f46546b0;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
            this.f46546b0 = null;
        }
        this.f46546b0 = new Runnable() { // from class: com.server.auditor.ssh.client.widget.q
            @Override // java.lang.Runnable
            public final void run() {
                ProgressButton.s(this.f46843a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ProgressButton progressButton) {
        progressButton.f46546b0 = null;
        progressButton.setButtonState(b.C0663b.f46550a);
        iu.a aVar = progressButton.f46547c0;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void setButtonState(b bVar) {
        this.f46548d0.b(this, f46543f0[0], bVar);
    }

    public static /* synthetic */ void setCompleteButtonState$default(ProgressButton progressButton, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        progressButton.setCompleteButtonState(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(Canvas canvas) {
        Drawable drawable = this.I;
        int iSave = canvas.save();
        long drawingTime = getDrawingTime();
        if (this.S) {
            this.P.getTransformation(drawingTime, this.O);
            drawable.setLevel((int) (this.O.getAlpha() * 10000));
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave);
        if (this.U) {
            CharSequence charSequence = this.G;
            String str = null;
            if (charSequence == null) {
                ju.t.t("progressText");
                charSequence = null;
            }
            setText(charSequence);
            setIcon(drawable);
            String str2 = this.G;
            if (str2 == null) {
                ju.t.t("progressText");
            } else {
                str = str2;
            }
            setIconPadding(su.s.m0(str) ? this.L : getIconPadding() + this.f46545a0 + this.L);
            this.U = false;
        }
        if (this.Q && (drawable instanceof Animatable)) {
            ((Animatable) drawable).start();
            this.Q = false;
        }
    }

    private final void u() {
        setIconPadding(this.f46545a0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        u();
        setIcon(this.W);
        String str = this.F;
        if (str == null) {
            ju.t.t("defaultText");
            str = null;
        }
        setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        if (getVisibility() == 0 && getWindowVisibility() == 0) {
            r();
            this.R = true;
            this.V = true;
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (getVisibility() == 0 && getWindowVisibility() == 0) {
            if (this.I instanceof Animatable) {
                this.Q = true;
                this.S = false;
            } else {
                this.S = true;
                this.O.clear();
                this.P.reset();
                this.P.setRepeatMode(1);
                this.P.setRepeatCount(-1);
                this.P.setDuration(10000L);
                this.P.setInterpolator(this.N);
                this.P.setStartTime(-1L);
            }
            this.U = true;
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        Runnable runnable = this.f46546b0;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
            this.f46546b0 = null;
        }
        this.R = false;
        this.V = false;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.S = false;
        Object obj = this.I;
        if (obj instanceof Animatable) {
            ju.t.d(obj, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
            ((Animatable) obj).stop();
            this.Q = false;
            this.U = false;
        }
        postInvalidate();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b buttonState = getButtonState();
        if (ju.t.b(buttonState, b.c.f46551a)) {
            x();
        } else if (ju.t.b(buttonState, b.a.f46549a)) {
            w();
        } else if (!ju.t.b(buttonState, b.C0663b.f46550a)) {
            throw new ut.s();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (ju.t.b(getButtonState(), b.c.f46551a)) {
            z();
        } else if (ju.t.b(getButtonState(), b.a.f46549a)) {
            y();
        }
        v();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        ju.t.f(canvas, "canvas");
        super.onDraw(canvas);
        b buttonState = getButtonState();
        if (!ju.t.b(buttonState, b.a.f46549a)) {
            if (ju.t.b(buttonState, b.C0663b.f46550a)) {
                return;
            }
            if (!ju.t.b(buttonState, b.c.f46551a)) {
                throw new ut.s();
            }
            A(false);
            t(canvas);
            invalidate();
            return;
        }
        if (this.V) {
            u();
            String str = this.H;
            if (str == null) {
                ju.t.t("completeText");
                str = null;
            }
            setText(str);
            Drawable drawable = this.J;
            if (drawable == null) {
                drawable = this.W;
            }
            setIcon(drawable);
            this.V = false;
        }
        if (this.R) {
            Runnable runnable = this.f46546b0;
            if (runnable != null) {
                getHandler().postDelayed(runnable, this.K);
            }
            this.R = false;
        }
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setButtonState(savedState.getButtonState());
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        ju.t.e(parcelableOnSaveInstanceState, "onSaveInstanceState(...)");
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.setButtonState(getButtonState());
        return savedState;
    }

    public final void setCompleteButtonState(boolean z10) {
        setButtonState(b.a.f46549a);
        setClickable(z10);
    }

    public final void setDefaultButtonState() {
        setButtonState(b.C0663b.f46550a);
    }

    public final void setIndeterminateButtonState() {
        setButtonState(b.c.f46551a);
    }

    public final void setNormalText(CharSequence charSequence) {
        this.F = String.valueOf(charSequence);
        setText(charSequence);
    }

    public final void setOnCompleteListener(iu.a aVar) {
        ju.t.f(aVar, "onComplete");
        this.f46547c0 = aVar;
    }

    public final void setProgressIndicatorTint(int i10) {
        this.M = i10;
        q();
    }

    public static final class SavedState extends AbsSavedState {
        private b buttonState;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();

        public static final class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "source");
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                ju.t.f(parcel, "source");
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return newArray(i10);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
            ju.t.f(parcelable, "superState");
            this.buttonState = b.C0663b.f46550a;
        }

        private final void readFromParcel(Parcel parcel) {
            if (parcel == null) {
                return;
            }
            String string = parcel.readString();
            b bVar = b.c.f46551a;
            if (!ju.t.b(string, bVar.toString())) {
                bVar = b.a.f46549a;
                if (!ju.t.b(string, bVar.toString())) {
                    bVar = b.C0663b.f46550a;
                }
            }
            this.buttonState = bVar;
        }

        public final b getButtonState() {
            return this.buttonState;
        }

        public final void setButtonState(b bVar) {
            ju.t.f(bVar, "<set-?>");
            this.buttonState = bVar;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.buttonState.toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ju.t.f(parcel, "source");
            this.buttonState = b.C0663b.f46550a;
            readFromParcel(parcel);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ ProgressButton(Context context, AttributeSet attributeSet, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setNormalText(int i10) {
        this.F = getContext().getString(i10);
        setText(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawableMutate;
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
        this.I = getDefaultProgressIndicator();
        this.K = 1500L;
        this.L = tp.p.a(10);
        this.M = tp.c1.a(context, R.attr.colorAccent);
        this.N = new LinearInterpolator();
        this.O = new Transformation();
        this.P = new AlphaAnimation(0.0f, 1.0f);
        this.T = true;
        mu.a aVar = mu.a.f65969a;
        b bVar = b.C0663b.f46550a;
        this.f46548d0 = new c(bVar, this);
        int[] iArr = cg.b.ProgressButton;
        ju.t.e(iArr, "ProgressButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.W = typedArrayObtainStyledAttributes.getDrawable(5);
        this.f46545a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.f46545a0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(8);
        this.I = (drawable == null || (drawableMutate = drawable.mutate()) == null) ? this.I : drawableMutate;
        setProgressIndicatorTint(typedArrayObtainStyledAttributes.getColor(10, this.M));
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, this.L);
        String string = typedArrayObtainStyledAttributes.getString(0);
        this.F = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(11);
        if (string2 == null && (string2 = this.F) == null) {
            ju.t.t("defaultText");
            string2 = null;
        }
        this.G = string2;
        String string3 = typedArrayObtainStyledAttributes.getString(4);
        if (string3 == null && (string3 = this.F) == null) {
            ju.t.t("defaultText");
            string3 = null;
        }
        this.H = string3;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        this.J = drawable2 != null ? drawable2.mutate() : null;
        this.K = typedArrayObtainStyledAttributes.getInteger(2, (int) this.K);
        this.T = typedArrayObtainStyledAttributes.getBoolean(1, this.T);
        setButtonState(typedArrayObtainStyledAttributes.getBoolean(7, false) ? b.c.f46551a : bVar);
        typedArrayObtainStyledAttributes.recycle();
    }
}
