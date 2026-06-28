package com.server.auditor.ssh.client.fragments.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends RecyclerView.e0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26997u = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        t.f(view, "itemView");
    }

    public static /* synthetic */ void R(c cVar, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateViewHolder");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        cVar.Q(obj, z10, z11);
    }

    public abstract void Q(Object obj, boolean z10, boolean z11);
}
