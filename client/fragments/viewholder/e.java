package com.server.auditor.ssh.client.fragments.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import java.text.MessageFormat;
import ju.k;
import ju.t;
import qg.x3;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements ph.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final x3 f27000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String[] f27001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f27002y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f26999z = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(x3 x3Var, l0 l0Var, View.OnDragListener onDragListener, int i10, k kVar) {
        this(x3Var, l0Var, (i10 & 4) != 0 ? null : onDragListener);
    }

    private final void f0(View view, float f10, float f11) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(200L);
        this.f27002y = f11;
        view.startAnimation(scaleAnimation);
    }

    @Override // ph.a
    public void a(float f10) {
        if (f10 != 1.0f) {
            View view = this.f10534a;
            t.e(view, "itemView");
            f0(view, this.f27002y, 1.05f);
            this.f10534a.setAlpha(f10);
            return;
        }
        if (this.f27002y != 1.0f) {
            View view2 = this.f10534a;
            t.e(view2, "itemView");
            f0(view2, this.f27002y, 1.0f);
        }
        this.f10534a.setAlpha(f10);
    }

    public final String[] e0() {
        String[] strArr = this.f27001x;
        if (strArr != null) {
            return strArr;
        }
        t.t("searchSequence");
        return null;
    }

    public final void g0(String[] strArr) {
        t.f(strArr, "<set-?>");
        this.f27001x = strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.server.auditor.ssh.client.fragments.viewholder.d
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(com.server.auditor.ssh.client.fragments.hostngroups.e eVar, boolean z10) {
        t.f(eVar, "item");
        Context context = this.f10534a.getContext();
        GroupDBModel groupDBModelB = eVar.b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(groupDBModelB.getTitle());
        if (!(e0().length == 0)) {
            spannableStringBuilder = tp.t.a(e0(), spannableStringBuilder);
            t.e(spannableStringBuilder, "getSpannableStringBuilder(...)");
        }
        this.f27000w.f74343e.setText(spannableStringBuilder);
        String string = context.getResources().getString(R.string.hosts_plurals);
        t.e(string, "getString(...)");
        this.f27000w.f74342d.setText(MessageFormat.format(string, Integer.valueOf(groupDBModelB.getCountAllNestedHosts())));
        this.f27000w.f74345g.d().setImageDrawable(HostIconUtil.B.a(context));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(x3 x3Var, l0 l0Var, View.OnDragListener onDragListener) {
        t.f(x3Var, "binding");
        t.f(l0Var, "interactListener");
        ConstraintLayout constraintLayoutB = x3Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB, l0Var);
        this.f27000w = x3Var;
        this.f27002y = 1.0f;
        this.f10534a.setOnDragListener(onDragListener);
    }
}
