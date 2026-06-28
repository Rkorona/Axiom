package com.server.auditor.ssh.client.fragments.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.Host;
import java.util.Arrays;
import java.util.List;
import ju.k;
import ju.t;
import qg.m7;
import zp.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d implements ph.b {
    private String[] A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final m7 f26992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private v f26993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f26994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f26995z;

    public /* synthetic */ a(m7 m7Var, l0 l0Var, View.OnDragListener onDragListener, int i10, k kVar) {
        this(m7Var, l0Var, (i10 & 4) != 0 ? null : onDragListener);
    }

    private final void f0(Host host) {
        this.f26992w.f73228g.d().setImageDrawable(HostIconUtil.b(host.getOsModelType()).a(this.f10534a.getContext()));
        this.f26992w.f73223b.setVisibility(4);
    }

    public final void e0(String[] strArr) {
        t.f(strArr, "<set-?>");
        this.A = strArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.server.auditor.ssh.client.fragments.viewholder.d
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
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
        this.f26992w.f73226e.setText(spannableStringBuilder);
        this.f26992w.f73228g.d().setImageDrawable(HostIconUtil.b(hostE.getOsModelType()).a(context));
        v vVar = this.f26993x;
        List list = this.f26995z;
        List list2 = this.f26994y;
        String[] strArr2 = this.A;
        SpannableStringBuilder spannableStringBuilderE = vVar.e(hostE, list, list2, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        this.f26992w.f73225d.setText(spannableStringBuilderE);
        if (TextUtils.isEmpty(spannableStringBuilderE)) {
            this.f26992w.f73225d.setVisibility(8);
        } else {
            this.f26992w.f73225d.setVisibility(0);
        }
        f0(hostE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(m7 m7Var, l0 l0Var, View.OnDragListener onDragListener) {
        t.f(m7Var, "binding");
        t.f(l0Var, "interactListener");
        ConstraintLayout constraintLayoutB = m7Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB, l0Var);
        this.f26992w = m7Var;
        this.f26993x = new v();
        List<TagDBModel> itemListWhichNotDeleted = hg.f.p().a0().getItemListWhichNotDeleted();
        t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        this.f26994y = itemListWhichNotDeleted;
        List<TagHostDBModel> itemListWhichNotDeleted2 = hg.f.p().c0().getItemListWhichNotDeleted();
        t.e(itemListWhichNotDeleted2, "getItemListWhichNotDeleted(...)");
        this.f26995z = itemListWhichNotDeleted2;
        this.A = new String[0];
        this.f10534a.setOnDragListener(onDragListener);
    }
}
