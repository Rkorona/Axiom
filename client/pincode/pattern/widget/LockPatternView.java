package com.server.auditor.ssh.client.pincode.pattern.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.server.auditor.ssh.client.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public class LockPatternView extends View {
    private ArrayList A;
    private boolean[][] B;
    private float C;
    private float D;
    private long E;
    private DisplayMode F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private float K;
    private float L;
    private float M;
    private final Path N;
    private final Rect O;
    private final Rect P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private Interpolator V;
    private Interpolator W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[][] f35204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f35209f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f35210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f35211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Paint f35212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Paint f35213x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Paint f35214y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f35215z;

    public static class Cell implements Parcelable {
        public static final Parcelable.Creator<Cell> CREATOR;
        static Cell[][] sCells = (Cell[][]) Array.newInstance((Class<?>) Cell.class, 3, 3);
        public final int column;
        public final int row;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Cell createFromParcel(Parcel parcel) {
                return new Cell(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Cell[] newArray(int i10) {
                return new Cell[i10];
            }
        }

        static {
            for (int i10 = 0; i10 < 3; i10++) {
                for (int i11 = 0; i11 < 3; i11++) {
                    sCells[i10][i11] = new Cell(i10, i11);
                }
            }
            CREATOR = new a();
        }

        private static void checkRange(int i10, int i11) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("row must be in range 0-2");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("column must be in range 0-2");
            }
        }

        public static synchronized Cell of(int i10, int i11) {
            checkRange(i10, i11);
            return sCells[i10][i11];
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Cell)) {
                return super.equals(obj);
            }
            Cell cell = (Cell) obj;
            return this.column == cell.column && this.row == cell.row;
        }

        public int getId() {
            return (this.row * 3) + this.column;
        }

        public String toString() {
            return "(ROW=" + this.row + ",COL=" + this.column + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.column);
            parcel.writeInt(this.row);
        }

        private Cell(int i10, int i11) {
            checkRange(i10, i11);
            this.row = i10;
            this.column = i11;
        }

        public static synchronized Cell of(int i10) {
            return of(i10 / 3, i10 % 3);
        }

        private Cell(Parcel parcel) {
            this.column = parcel.readInt();
            this.row = parcel.readInt();
        }
    }

    public enum DisplayMode {
        Correct,
        Animate,
        Wrong
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35216a;

        a(f fVar) {
            this.f35216a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            LockPatternView.this.D(r0.f35206c, LockPatternView.this.f35205b, 192L, LockPatternView.this.V, this.f35216a, null);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f35219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f35220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f35221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f35222e;

        b(f fVar, float f10, float f11, float f12, float f13) {
            this.f35218a = fVar;
            this.f35219b = f10;
            this.f35220c = f11;
            this.f35221d = f12;
            this.f35222e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f fVar = this.f35218a;
            float f10 = 1.0f - fFloatValue;
            fVar.f35234e = (this.f35219b * f10) + (this.f35220c * fFloatValue);
            fVar.f35235f = (f10 * this.f35221d) + (fFloatValue * this.f35222e);
            LockPatternView.this.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35224a;

        c(f fVar) {
            this.f35224a = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35224a.f35236g = null;
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35226a;

        d(f fVar) {
            this.f35226a = fVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35226a.f35233d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LockPatternView.this.invalidate();
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f35228a;

        e(Runnable runnable) {
            this.f35228a = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f35228a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f35233d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ValueAnimator f35236g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f35230a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f35231b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f35232c = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f35234e = Float.MIN_VALUE;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f35235f = Float.MIN_VALUE;
    }

    public interface g {
        void a(List list);

        void b();

        void c(List list);

        void d();
    }

    public LockPatternView(Context context) {
        this(context, null);
    }

    private void A(int i10) {
        announceForAccessibility(getContext().getString(i10));
    }

    private void B(Cell cell) {
        f fVar = this.f35204a[cell.row][cell.column];
        D(this.f35205b, this.f35206c, 96L, this.W, fVar, new a(fVar));
        C(fVar, this.C, this.D, l(cell.column), m(cell.row));
    }

    private void C(f fVar, float f10, float f11, float f12, float f13) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(fVar, f10, f12, f11, f13));
        valueAnimatorOfFloat.addListener(new c(fVar));
        valueAnimatorOfFloat.setInterpolator(this.V);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        fVar.f35236g = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(float f10, float f11, long j10, Interpolator interpolator, f fVar, Runnable runnable) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.addUpdateListener(new d(fVar));
        if (runnable != null) {
            valueAnimatorOfFloat.addListener(new e(runnable));
        }
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.start();
    }

    private void e(Cell cell) {
        this.B[cell.row][cell.column] = true;
        this.A.add(cell);
        if (!this.H) {
            B(cell);
        }
        u();
    }

    private void f() {
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                f fVar = this.f35204a[i10][i11];
                ValueAnimator valueAnimator = fVar.f35236g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    fVar.f35234e = Float.MIN_VALUE;
                    fVar.f35235f = Float.MIN_VALUE;
                }
            }
        }
    }

    private Cell g(float f10, float f11) {
        int iN;
        int iP = p(f11);
        if (iP >= 0 && (iN = n(f10)) >= 0 && !this.B[iP][iN]) {
            return Cell.of(iP, iN);
        }
        return null;
    }

    private Paint getCurrentPathPaint() {
        if (this.H) {
            return this.f35214y;
        }
        DisplayMode displayMode = this.F;
        if (displayMode == DisplayMode.Wrong) {
            return this.f35213x;
        }
        if (displayMode == DisplayMode.Correct || displayMode == DisplayMode.Animate) {
            return this.f35212w;
        }
        throw new IllegalStateException("unknown display mode " + this.F);
    }

    private void i() {
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                this.B[i10][i11] = false;
            }
        }
    }

    private Cell j(float f10, float f11) {
        Cell cellG = g(f10, f11);
        Cell cellOf = null;
        if (cellG == null) {
            return null;
        }
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            Cell cell = (Cell) arrayList.get(arrayList.size() - 1);
            int i10 = cellG.row;
            int i11 = cell.row;
            int i12 = i10 - i11;
            int i13 = cellG.column;
            int i14 = cell.column;
            int i15 = i13 - i14;
            if (Math.abs(i12) == 2 && Math.abs(i15) != 1) {
                i11 = cell.row + (i12 > 0 ? 1 : -1);
            }
            if (Math.abs(i15) == 2 && Math.abs(i12) != 1) {
                i14 = cell.column + (i15 > 0 ? 1 : -1);
            }
            cellOf = Cell.of(i11, i14);
        }
        if (cellOf != null && !this.B[cellOf.row][cellOf.column]) {
            e(cellOf);
        }
        e(cellG);
        if (this.I) {
            performHapticFeedback(1, 3);
        }
        return cellG;
    }

    private void k(Canvas canvas, float f10, float f11, float f12, boolean z10, float f13) {
        Paint paintO = o(z10);
        if (paintO.getAlpha() != 250.0f * f13) {
            paintO.setAlpha((int) (f13 * 255.0f));
        }
        canvas.drawCircle(f10, f11, f12 / 2.0f, paintO);
    }

    private float l(int i10) {
        float paddingLeft = getPaddingLeft();
        float f10 = this.L;
        return paddingLeft + (i10 * f10) + (f10 / 2.0f);
    }

    private float m(int i10) {
        float paddingTop = getPaddingTop();
        float f10 = this.M;
        return paddingTop + (i10 * f10) + (f10 / 2.0f);
    }

    private int n(float f10) {
        float f11 = this.L;
        float f12 = this.K * f11;
        float paddingLeft = getPaddingLeft() + ((f11 - f12) / 2.0f);
        for (int i10 = 0; i10 < 3; i10++) {
            float f13 = (i10 * f11) + paddingLeft;
            if (f10 >= f13 && f10 <= f13 + f12) {
                return i10;
            }
        }
        return -1;
    }

    private Paint o(boolean z10) {
        if (!z10 || this.H) {
            return this.f35209f;
        }
        DisplayMode displayMode = this.F;
        if (displayMode == DisplayMode.Wrong) {
            return this.f35210u;
        }
        if (displayMode == DisplayMode.Correct || displayMode == DisplayMode.Animate) {
            return this.f35211v;
        }
        throw new IllegalStateException("unknown display mode " + this.F);
    }

    private int p(float f10) {
        float f11 = this.M;
        float f12 = this.K * f11;
        float paddingTop = getPaddingTop() + ((f11 - f12) / 2.0f);
        for (int i10 = 0; i10 < 3; i10++) {
            float f13 = (i10 * f11) + paddingTop;
            if (f10 >= f13 && f10 <= f13 + f12) {
                return i10;
            }
        }
        return -1;
    }

    private void q(MotionEvent motionEvent) {
        y();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        Cell cellJ = j(x10, y10);
        if (cellJ != null) {
            this.J = true;
            this.F = DisplayMode.Correct;
            x();
        } else {
            this.J = false;
            v();
        }
        if (cellJ != null) {
            float fL = l(cellJ.column);
            float fM = m(cellJ.row);
            float f10 = this.L / 2.0f;
            float f11 = this.M / 2.0f;
            invalidate((int) (fL - f10), (int) (fM - f11), (int) (fL + f10), (int) (fM + f11));
        }
        this.C = x10;
        this.D = y10;
    }

    private void r(MotionEvent motionEvent) {
        float f10 = this.f35207d;
        int historySize = motionEvent.getHistorySize();
        this.P.setEmpty();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < historySize + 1) {
            float historicalX = i10 < historySize ? motionEvent.getHistoricalX(i10) : motionEvent.getX();
            float historicalY = i10 < historySize ? motionEvent.getHistoricalY(i10) : motionEvent.getY();
            Cell cellJ = j(historicalX, historicalY);
            int size = this.A.size();
            if (cellJ != null && size == 1) {
                this.J = true;
                x();
            }
            float fAbs = Math.abs(historicalX - this.C);
            float fAbs2 = Math.abs(historicalY - this.D);
            if (fAbs > 0.0f || fAbs2 > 0.0f) {
                z10 = true;
            }
            if (this.J && size > 0) {
                Cell cell = (Cell) this.A.get(size - 1);
                float fL = l(cell.column);
                float fM = m(cell.row);
                float fMin = Math.min(fL, historicalX) - f10;
                float fMax = Math.max(fL, historicalX) + f10;
                float fMin2 = Math.min(fM, historicalY) - f10;
                float fMax2 = Math.max(fM, historicalY) + f10;
                if (cellJ != null) {
                    float f11 = this.L * 0.5f;
                    float f12 = this.M * 0.5f;
                    float fL2 = l(cellJ.column);
                    float fM2 = m(cellJ.row);
                    fMin = Math.min(fL2 - f11, fMin);
                    fMax = Math.max(fL2 + f11, fMax);
                    fMin2 = Math.min(fM2 - f12, fMin2);
                    fMax2 = Math.max(fM2 + f12, fMax2);
                }
                this.P.union(Math.round(fMin), Math.round(fMin2), Math.round(fMax), Math.round(fMax2));
            }
            i10++;
        }
        this.C = motionEvent.getX();
        this.D = motionEvent.getY();
        if (z10) {
            this.O.union(this.P);
            invalidate(this.O);
            this.O.set(this.P);
        }
    }

    private void s(MotionEvent motionEvent) {
        if (this.A.isEmpty()) {
            return;
        }
        this.J = false;
        f();
        w();
        invalidate();
    }

    private void t() {
        this.f35209f.setAntiAlias(true);
        this.f35209f.setDither(true);
        this.f35209f.setColor(this.S);
        this.f35211v.setAntiAlias(true);
        this.f35211v.setDither(true);
        this.f35211v.setColor(this.U);
        this.f35210u.setAntiAlias(true);
        this.f35210u.setDither(true);
        this.f35210u.setColor(this.T);
        this.f35212w.setColor(this.U);
        Paint paint = this.f35212w;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f35212w;
        Paint.Join join = Paint.Join.ROUND;
        paint2.setStrokeJoin(join);
        Paint paint3 = this.f35212w;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.f35212w.setStrokeWidth(this.f35207d);
        this.f35212w.setAntiAlias(true);
        this.f35212w.setDither(true);
        this.f35214y.setColor(this.S);
        this.f35214y.setStyle(style);
        this.f35214y.setStrokeJoin(join);
        this.f35214y.setStrokeCap(cap);
        this.f35214y.setStrokeWidth(this.f35207d);
        this.f35214y.setAntiAlias(true);
        this.f35214y.setDither(true);
        this.f35213x.setColor(this.T);
        this.f35213x.setStyle(style);
        this.f35213x.setStrokeJoin(join);
        this.f35213x.setStrokeCap(cap);
        this.f35213x.setStrokeWidth(this.f35207d);
        this.f35214y.setAntiAlias(true);
        this.f35214y.setDither(true);
    }

    private void u() {
        A(R.string.alp_42447968_lockscreen_access_pattern_cell_added);
        g gVar = this.f35215z;
        if (gVar != null) {
            gVar.c(this.A);
        }
    }

    private void v() {
        A(R.string.alp_42447968_lockscreen_access_pattern_cleared);
        g gVar = this.f35215z;
        if (gVar != null) {
            gVar.b();
        }
    }

    private void w() {
        A(R.string.alp_42447968_lockscreen_access_pattern_detected);
        g gVar = this.f35215z;
        if (gVar != null) {
            gVar.a(this.A);
        }
    }

    private void x() {
        A(R.string.alp_42447968_lockscreen_access_pattern_start);
        g gVar = this.f35215z;
        if (gVar != null) {
            gVar.d();
        }
    }

    private void y() {
        this.A.clear();
        i();
        this.F = DisplayMode.Correct;
        invalidate();
    }

    private int z(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : i11 : Math.max(size, i11);
    }

    public f[][] getCellStates() {
        return this.f35204a;
    }

    public DisplayMode getDisplayMode() {
        return this.F;
    }

    public List<Cell> getPattern() {
        return (List) this.A.clone();
    }

    public void h() {
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.pincode.pattern.widget.LockPatternView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7) {
                motionEvent.setAction(2);
            } else if (action == 9) {
                motionEvent.setAction(0);
            } else if (action == 10) {
                motionEvent.setAction(1);
            }
            onTouchEvent(motionEvent);
            motionEvent.setAction(action);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int iZ = z(i10, suggestedMinimumWidth);
        int iZ2 = z(i11, suggestedMinimumHeight);
        int i12 = this.Q;
        if (i12 == 0) {
            iZ = Math.min(iZ, iZ2);
            iZ2 = iZ;
        } else if (i12 == 1) {
            iZ2 = Math.min(iZ, iZ2);
        } else if (i12 == 2) {
            iZ = Math.min(iZ, iZ2);
        }
        setMeasuredDimension(iZ, iZ2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setPattern(DisplayMode.Correct, com.server.auditor.ssh.client.pincode.pattern.widget.a.c(savedState.getSerializedPattern()));
        this.F = DisplayMode.values()[savedState.getDisplayMode()];
        this.G = savedState.isInputEnabled();
        this.H = savedState.isInStealthMode();
        this.I = savedState.isTactileFeedbackEnabled();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), com.server.auditor.ssh.client.pincode.pattern.widget.a.b(this.A), this.F.ordinal(), this.G, this.H, this.I);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.L = ((i10 - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.M = ((i11 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            q(motionEvent);
            return true;
        }
        if (action == 1) {
            s(motionEvent);
            return true;
        }
        if (action == 2) {
            r(motionEvent);
            return true;
        }
        if (action != 3) {
            return false;
        }
        this.J = false;
        y();
        v();
        return true;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.F = displayMode;
        if (displayMode == DisplayMode.Animate) {
            if (this.A.size() == 0) {
                throw new IllegalStateException("you must have a pattern to animate if you want to set the display mode to animate");
            }
            this.E = SystemClock.elapsedRealtime();
            Cell cell = (Cell) this.A.get(0);
            this.C = l(cell.column);
            this.D = m(cell.row);
            i();
        }
        invalidate();
    }

    public void setInStealthMode(boolean z10) {
        this.H = z10;
    }

    public void setOnPatternListener(g gVar) {
        this.f35215z = gVar;
    }

    public void setPattern(DisplayMode displayMode, List<Cell> list) {
        this.A.clear();
        this.A.addAll(list);
        i();
        for (Cell cell : list) {
            this.B[cell.row][cell.column] = true;
        }
        setDisplayMode(displayMode);
    }

    public void setTactileFeedbackEnabled(boolean z10) {
        this.I = z10;
    }

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private final int mDisplayMode;
        private final boolean mInStealthMode;
        private final boolean mInputEnabled;
        private final String mSerializedPattern;
        private final boolean mTactileFeedbackEnabled;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public int getDisplayMode() {
            return this.mDisplayMode;
        }

        public String getSerializedPattern() {
            return this.mSerializedPattern;
        }

        public boolean isInStealthMode() {
            return this.mInStealthMode;
        }

        public boolean isInputEnabled() {
            return this.mInputEnabled;
        }

        public boolean isTactileFeedbackEnabled() {
            return this.mTactileFeedbackEnabled;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.mSerializedPattern);
            parcel.writeInt(this.mDisplayMode);
            parcel.writeValue(Boolean.valueOf(this.mInputEnabled));
            parcel.writeValue(Boolean.valueOf(this.mInStealthMode));
            parcel.writeValue(Boolean.valueOf(this.mTactileFeedbackEnabled));
        }

        private SavedState(Parcelable parcelable, String str, int i10, boolean z10, boolean z11, boolean z12) {
            super(parcelable);
            this.mSerializedPattern = str;
            this.mDisplayMode = i10;
            this.mInputEnabled = z10;
            this.mInStealthMode = z11;
            this.mTactileFeedbackEnabled = z12;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mSerializedPattern = parcel.readString();
            this.mDisplayMode = parcel.readInt();
            this.mInputEnabled = ((Boolean) parcel.readValue(null)).booleanValue();
            this.mInStealthMode = ((Boolean) parcel.readValue(null)).booleanValue();
            this.mTactileFeedbackEnabled = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public LockPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35208e = false;
        this.f35209f = new Paint();
        this.f35210u = new Paint();
        this.f35211v = new Paint();
        this.f35212w = new Paint();
        this.f35213x = new Paint();
        this.f35214y = new Paint();
        this.A = new ArrayList(9);
        this.B = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
        this.C = -1.0f;
        this.D = -1.0f;
        this.F = DisplayMode.Correct;
        this.G = true;
        this.H = false;
        this.I = true;
        this.J = false;
        this.K = 0.6f;
        this.N = new Path();
        this.O = new Rect();
        this.P = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg.b.Alp_42447968_LockPatternView);
        String string = typedArrayObtainStyledAttributes.getString(0);
        if ("square".equals(string)) {
            this.Q = 0;
        } else if ("lock_width".equals(string)) {
            this.Q = 1;
        } else if ("lock_height".equals(string)) {
            this.Q = 2;
        } else {
            this.Q = 0;
        }
        setClickable(true);
        this.S = androidx.core.content.a.getColor(getContext(), yk.a.a(getContext(), R.attr.colorInactive));
        this.R = typedArrayObtainStyledAttributes.getColor(3, yk.a.a(getContext(), android.R.attr.textColor));
        this.T = typedArrayObtainStyledAttributes.getColor(1, androidx.core.content.a.getColor(getContext(), R.color.palette_red));
        this.U = typedArrayObtainStyledAttributes.getColor(4, c0.i(getContext(), R.attr.colorPrimary));
        typedArrayObtainStyledAttributes.getColor(2, this.R);
        this.f35207d = getResources().getDimensionPixelSize(R.dimen.alp_42447968_lock_pattern_dot_line_width);
        this.f35205b = getResources().getDimensionPixelSize(R.dimen.alp_42447968_lock_pattern_dot_size);
        this.f35206c = getResources().getDimensionPixelSize(R.dimen.alp_42447968_lock_pattern_dot_size_activated);
        t();
        this.f35204a = (f[][]) Array.newInstance((Class<?>) f.class, 3, 3);
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                this.f35204a[i10][i11] = new f();
                this.f35204a[i10][i11].f35233d = this.f35205b;
            }
        }
        this.V = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.W = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
    }
}
