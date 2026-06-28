package com.server.auditor.ssh.client.fragments.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.hostngroups.HostsRecyclerFragment;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.widget.DashRectangleView;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import qg.x3;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends d implements ph.b {
    public static final a D = new a(null);
    public static final int E = 8;
    private String[] A;
    private List B;
    private List C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final x3 f27005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private HostsRecyclerFragment.SelectionMode f27006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f27007y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ko.b f27008z;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(x3 x3Var, l0 l0Var, HostsRecyclerFragment.SelectionMode selectionMode, boolean z10, View.OnDragListener onDragListener, int i10, k kVar) {
        this(x3Var, l0Var, selectionMode, z10, (i10 & 16) != 0 ? null : onDragListener);
    }

    private final void h0(com.server.auditor.ssh.client.fragments.hostngroups.i iVar) {
        Context context = this.f10534a.getContext();
        int iB = iVar.b();
        boolean zD = iVar.d();
        boolean zC = iVar.c();
        oi.b bVarB = HostIconUtil.b(iVar.e().getOsModelType());
        if (iB == 0) {
            DashRectangleView dashRectangleView = this.f27005w.f74344f;
            t.e(dashRectangleView, "roundRectProgress");
            if (dashRectangleView.getVisibility() == 0) {
                this.f27005w.f74344f.setIndeterminate(false);
                DashRectangleView dashRectangleView2 = this.f27005w.f74344f;
                t.e(dashRectangleView2, "roundRectProgress");
                dashRectangleView2.setVisibility(8);
            }
            this.f27005w.f74345g.d().setImageDrawable(bVarB.a(context));
        } else {
            if (zD && !this.f27005w.f74344f.n()) {
                DashRectangleView dashRectangleView3 = this.f27005w.f74344f;
                t.e(dashRectangleView3, "roundRectProgress");
                if (dashRectangleView3.getVisibility() != 0) {
                    DashRectangleView dashRectangleView4 = this.f27005w.f74344f;
                    t.e(dashRectangleView4, "roundRectProgress");
                    dashRectangleView4.setVisibility(0);
                }
                this.f27005w.f74344f.setIndeterminate(true);
            } else if (zC) {
                DashRectangleView dashRectangleView5 = this.f27005w.f74344f;
                t.e(dashRectangleView5, "roundRectProgress");
                if (dashRectangleView5.getVisibility() == 0) {
                    this.f27005w.f74344f.setIndeterminate(false);
                    DashRectangleView dashRectangleView6 = this.f27005w.f74344f;
                    t.e(dashRectangleView6, "roundRectProgress");
                    dashRectangleView6.setVisibility(8);
                }
            }
            this.f27005w.f74345g.d().setImageDrawable(bVarB.a(context));
            this.f27005w.f74342d.setText(R.string.active);
        }
        if (iB == 0 || this.f27006x == HostsRecyclerFragment.SelectionMode.SFTP) {
            this.f27005w.f74340b.setVisibility(4);
            return;
        }
        String strValueOf = String.valueOf(iB);
        SpannableString spannableString = new SpannableString(strValueOf + "a");
        Drawable drawable = androidx.core.content.a.getDrawable(this.f10534a.getContext(), R.drawable.ic_arrow_drop_down_black_24dp);
        t.c(drawable);
        drawable.setBounds(0, 10, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(drawable), strValueOf.length(), strValueOf.length() + 1, 17);
        this.f27005w.f74340b.setText(spannableString);
        this.f27005w.f74340b.setVisibility(0);
        this.f27005w.f74340b.setOnClickListener(new com.server.auditor.ssh.client.fragments.hostngroups.b(iVar.e()));
    }

    public final void e0(String[] strArr) {
        t.f(strArr, "<set-?>");
        this.A = strArr;
    }

    public final void f0(List list) {
        t.f(list, "<set-?>");
        this.B = list;
    }

    public final void g0(List list) {
        t.f(list, "<set-?>");
        this.C = list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.server.auditor.ssh.client.fragments.viewholder.d
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void d0(com.server.auditor.ssh.client.fragments.hostngroups.i iVar, boolean z10) {
        t.f(iVar, "item");
        Context context = this.f10534a.getContext();
        Host hostE = iVar.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hostE.getHeaderText());
        String[] strArr = this.A;
        if (!(strArr.length == 0)) {
            spannableStringBuilder = tp.t.a(strArr, spannableStringBuilder);
            t.e(spannableStringBuilder, "getSpannableStringBuilder(...)");
        }
        this.f27005w.f74343e.setText(spannableStringBuilder);
        this.f27005w.f74345g.d().setImageDrawable(HostIconUtil.b(hostE.getOsModelType()).a(context));
        ko.b bVar = this.f27008z;
        t.c(context);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bVar.b(context, hostE, this.B, this.C));
        String[] strArr2 = this.A;
        if (!(strArr2.length == 0)) {
            spannableStringBuilder2 = tp.t.a(strArr2, spannableStringBuilder2);
            t.e(spannableStringBuilder2, "getSpannableStringBuilder(...)");
        }
        this.f27005w.f74342d.setText(spannableStringBuilder2);
        if (TextUtils.isEmpty(spannableStringBuilder2)) {
            this.f27005w.f74342d.setVisibility(8);
        } else {
            this.f27005w.f74342d.setVisibility(0);
        }
        if (this.f27007y) {
            return;
        }
        h0(iVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(x3 x3Var, l0 l0Var, HostsRecyclerFragment.SelectionMode selectionMode, boolean z10, View.OnDragListener onDragListener) {
        t.f(x3Var, "binding");
        t.f(l0Var, "interactListener");
        t.f(selectionMode, "selectionMode");
        ConstraintLayout constraintLayoutB = x3Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB, l0Var);
        this.f27005w = x3Var;
        this.f27006x = selectionMode;
        this.f27007y = z10;
        this.f27008z = new ko.b();
        this.A = new String[0];
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.f10534a.setOnDragListener(onDragListener);
    }
}
