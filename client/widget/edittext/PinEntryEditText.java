package com.server.auditor.ssh.client.widget.edittext;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.f0;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.widget.edittext.PinEntryEditText;
import ju.k;
import ju.t;
import pu.m;

/* JADX INFO: loaded from: classes4.dex */
public final class PinEntryEditText extends AppCompatEditText {
    private static final Paint A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f46745x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f46746y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Paint f46747z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f46751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f46752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46753f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f46754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f46755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnClickListener f46756w;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements ActionMode.Callback {
        b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    static {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        f46747z = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        A = paint2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PinEntryEditText(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PinEntryEditText pinEntryEditText, View view) {
        Editable text = pinEntryEditText.getText();
        pinEntryEditText.setSelection(text != null ? text.length() : 0);
        View.OnClickListener onClickListener = pinEntryEditText.f46756w;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final void c() {
        super.setCustomSelectionActionModeCallback(new b());
    }

    private final void d(Canvas canvas, String str, int i10, float f10, float f11) {
        canvas.drawText(str, i10, i10 + 1, f10, f11, (Paint) getPaint());
    }

    private final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14 = this.f46755v;
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, A);
    }

    private final void f(Canvas canvas, float f10, float f11) {
        canvas.drawCircle(f10, f11, this.f46751d, f46747z);
    }

    private final void g() {
        InputFilter[] filters = getFilters();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.f46748a);
        if (filters == null) {
            super.setFilters(new InputFilter[]{lengthFilter});
            return;
        }
        for (int i10 = 0; i10 < filters.length; i10++) {
            if (filters[i10] instanceof InputFilter.LengthFilter) {
                filters[i10] = lengthFilter;
                super.setFilters(filters);
                return;
            }
        }
        InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
        System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
        inputFilterArr[filters.length] = lengthFilter;
        super.setFilters(inputFilterArr);
    }

    private final void h() {
        Paint paint = A;
        paint.setColor(this.f46749b);
        paint.setStrokeWidth(this.f46750c);
    }

    private final void i() {
        f46747z.setColor(getTextColors().getDefaultColor());
    }

    private final void j() {
        setText((CharSequence) null);
    }

    public final int getNumberOfPins() {
        return this.f46748a;
    }

    public final int getPinCellColor() {
        return this.f46749b;
    }

    public final float getPinCellStrokeWidth() {
        return this.f46750c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        int i10;
        float f10;
        Canvas canvas2 = canvas;
        t.f(canvas2, "canvas");
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        float height2 = getHeight() / 2;
        Editable text = getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = string;
        int length = str2.length();
        float[] fArr = new float[length];
        int i11 = 0;
        getPaint().getTextWidths(str2, 0, length, fArr);
        getPaint().getTextBounds(str2, 0, length, new Rect());
        float fHeight = (r4.height() / 2) + height2;
        int i12 = this.f46748a;
        while (i11 < i12) {
            e(canvas2, paddingLeft, paddingTop, this.f46754u + paddingLeft, height);
            float f11 = paddingLeft;
            float f12 = paddingTop;
            float f13 = height;
            if (length > i11) {
                float f14 = 2;
                float f15 = f11 + (this.f46754u / f14);
                if (this.f46753f) {
                    f(canvas2, f15, height2);
                    str = str2;
                    i10 = i11;
                    f10 = fHeight;
                } else {
                    float f16 = f15 - (fArr[i11] / f14);
                    str = str2;
                    i10 = i11;
                    f10 = fHeight;
                    d(canvas2, str, i10, f16, f10);
                }
            } else {
                str = str2;
                i10 = i11;
                f10 = fHeight;
            }
            float f17 = this.f46752e;
            i11 = i10 + 1;
            str2 = str;
            fHeight = f10;
            paddingTop = f12;
            height = f13;
            paddingLeft = f11 + (f17 < 0.0f ? this.f46754u : f17 + this.f46754u);
            canvas2 = canvas;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (this.f46754u * this.f46748a) + (this.f46752e * (r2 - 1)));
        int paddingTop = (int) (getPaddingTop() + getPaddingBottom() + this.f46754u);
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = m.i(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = m.i(paddingTop, size2);
        } else if (mode2 == 1073741824) {
            paddingTop = size2;
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new IllegalStateException("setCustomSelectionActionModeCallback() not supported.");
    }

    public final void setNumberOfPins(int i10) {
        this.f46748a = i10;
        j();
        g();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f46756w = onClickListener;
    }

    public final void setPinCellColor(int i10) {
        this.f46749b = i10;
        h();
    }

    public final void setPinCellStrokeWidth(float f10) {
        this.f46750c = f10;
        h();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        i();
    }

    public /* synthetic */ PinEntryEditText(Context context, AttributeSet attributeSet, int i10, k kVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t.f(context, "context");
        this.f46748a = 4;
        this.f46749b = androidx.core.content.a.getColor(context, R.color.palette_black);
        this.f46750c = f0.g(context, 1);
        this.f46751d = f0.g(context, 5);
        this.f46752e = f0.g(context, 10);
        this.f46753f = true;
        this.f46754u = f0.g(context, 45);
        this.f46755v = f0.g(context, 5);
        setBackgroundResource(0);
        int[] iArr = cg.b.PinEntryEditText;
        t.e(iArr, "PinEntryEditText");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setNumberOfPins(typedArrayObtainStyledAttributes.getInteger(0, this.f46748a));
        this.f46752e = typedArrayObtainStyledAttributes.getDimension(1, this.f46752e);
        this.f46753f = typedArrayObtainStyledAttributes.getBoolean(7, this.f46753f);
        this.f46751d = typedArrayObtainStyledAttributes.getDimension(6, this.f46751d);
        this.f46754u = typedArrayObtainStyledAttributes.getDimension(4, this.f46754u);
        this.f46755v = typedArrayObtainStyledAttributes.getDimension(3, this.f46755v);
        setPinCellColor(typedArrayObtainStyledAttributes.getColor(2, this.f46749b));
        setPinCellStrokeWidth(typedArrayObtainStyledAttributes.getDimension(5, this.f46750c));
        typedArrayObtainStyledAttributes.recycle();
        c();
        super.setOnClickListener(new View.OnClickListener() { // from class: nq.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinEntryEditText.b(this.f67122a, view);
            }
        });
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        i();
    }
}
