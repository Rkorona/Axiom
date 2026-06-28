package com.server.auditor.ssh.client.fragments.hostngroups;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes3.dex */
public class o1 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25178b;

    public o1(int i10, int i11) {
        this.f25177a = i10;
        this.f25178b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int dimensionPixelSize = recyclerView.getContext().getResources().getDisplayMetrics().widthPixels / recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.host_column_width);
        int i10 = this.f25177a;
        rect.left = i10;
        rect.right = i10;
        int i11 = this.f25178b;
        rect.bottom = i11;
        rect.top = i11;
    }
}
