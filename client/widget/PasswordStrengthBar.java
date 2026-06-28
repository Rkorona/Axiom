package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import c2.o1;
import com.server.auditor.ssh.client.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PasswordStrengthBar extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f46532w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f46533x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f46534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46539f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f46540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46541v;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasswordStrengthBar(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        ju.t.f(context, "context");
    }

    private final View b() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f46540u, 1.0f));
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R.drawable.pass_strength_bg);
        view.setBackground(drawable != null ? drawable.mutate() : null);
        view.setBackgroundTintList(ColorStateList.valueOf(this.f46535b));
        return view;
    }

    private final List c() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.f46541v;
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(PasswordStrengthBar passwordStrengthBar) {
        return passwordStrengthBar.c();
    }

    private final List<View> getStrengthBars() {
        return (List) this.f46534a.getValue();
    }

    public final void setStrength(int i10) {
        int i11 = 0;
        ut.u uVar = (i10 < 0 || i10 >= 3) ? (3 > i10 || i10 >= 4) ? (4 > i10 || i10 > Integer.MAX_VALUE) ? new ut.u(0, Integer.valueOf(this.f46535b)) : new ut.u(3, Integer.valueOf(this.f46538e)) : new ut.u(2, Integer.valueOf(this.f46537d)) : new ut.u(1, Integer.valueOf(this.f46536c));
        int iIntValue = ((Number) uVar.a()).intValue();
        int iIntValue2 = ((Number) uVar.b()).intValue();
        int size = getStrengthBars().size();
        while (i11 < size) {
            getStrengthBars().get(i11).setBackgroundTintList(ColorStateList.valueOf(i11 < iIntValue ? iIntValue2 : this.f46535b));
            i11++;
        }
    }

    public /* synthetic */ PasswordStrengthBar(Context context, AttributeSet attributeSet, int i10, ju.k kVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordStrengthBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        this.f46534a = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.widget.p
            @Override // iu.a
            public final Object a() {
                return PasswordStrengthBar.d(this.f46835a);
            }
        });
        this.f46535b = o1.j(rk.b.E());
        this.f46536c = o1.j(rk.b.Z());
        this.f46537d = o1.j(rk.b.r0());
        this.f46538e = o1.j(rk.b.t());
        this.f46539f = context.getResources().getDimensionPixelSize(R.dimen.password_strength_bars_gap);
        this.f46540u = context.getResources().getDimensionPixelSize(R.dimen.password_strength_bar_height);
        this.f46541v = 3;
        int i10 = 0;
        setOrientation(0);
        int[] iArr = cg.b.PasswordStrengthView;
        ju.t.e(iArr, "PasswordStrengthView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f46539f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f46539f);
        this.f46540u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f46540u);
        this.f46541v = typedArrayObtainStyledAttributes.getInteger(1, this.f46541v);
        this.f46535b = typedArrayObtainStyledAttributes.getColor(6, this.f46535b);
        this.f46536c = typedArrayObtainStyledAttributes.getColor(4, this.f46536c);
        this.f46537d = typedArrayObtainStyledAttributes.getColor(5, this.f46537d);
        this.f46538e = typedArrayObtainStyledAttributes.getColor(3, this.f46538e);
        typedArrayObtainStyledAttributes.recycle();
        for (Object obj : getStrengthBars()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            addView((View) obj);
            if (i10 != vt.v.q(getStrengthBars())) {
                Space space = new Space(context);
                space.setMinimumWidth(this.f46539f);
                addView(space);
            }
            i10 = i11;
        }
    }
}
