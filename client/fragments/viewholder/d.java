package com.server.auditor.ssh.client.fragments.viewholder;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.hostngroups.SwivelCheckView;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SwivelCheckView f26998v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, final l0 l0Var) {
        super(view);
        t.f(view, "itemView");
        t.f(l0Var, "onItemInteractListener");
        SwivelCheckView swivelCheckView = (SwivelCheckView) view.findViewById(R.id.swivel_check);
        this.f26998v = swivelCheckView;
        if (swivelCheckView != null) {
            swivelCheckView.setOnClickListener(new View.OnClickListener() { // from class: li.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.server.auditor.ssh.client.fragments.viewholder.d.Z(this.f64167a, l0Var, view2);
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.clickable_layout);
        final Point point = new Point(0, 0);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: li.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return com.server.auditor.ssh.client.fragments.viewholder.d.a0(point, view2, motionEvent);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: li.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.server.auditor.ssh.client.fragments.viewholder.d.b0(this.f64174a, l0Var, view2);
            }
        });
        viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: li.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return com.server.auditor.ssh.client.fragments.viewholder.d.c0(this.f64176a, l0Var, point, view2);
            }
        });
    }

    public static void S(d dVar, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = dVar.f26998v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    public static void V(d dVar, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = dVar.f26998v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    public static void X(d dVar, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = dVar.f26998v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(final d dVar, l0 l0Var, View view) {
        l0Var.Ga(dVar.k(), new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.h
            @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
            public final void a(boolean z10, long j10) {
                com.server.auditor.ssh.client.fragments.viewholder.d.S(this.f64180a, z10, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(Point point, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        point.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(final d dVar, l0 l0Var, View view) {
        int iK = dVar.k();
        if (iK >= 0) {
            l0Var.V8(iK, new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.i
                @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
                public final void a(boolean z10, long j10) {
                    com.server.auditor.ssh.client.fragments.viewholder.d.X(this.f64181a, z10, j10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(final d dVar, l0 l0Var, Point point, View view) {
        int iK = dVar.k();
        return iK != -1 && l0Var.hb(iK, point, new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.g
            @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
            public final void a(boolean z10, long j10) {
                com.server.auditor.ssh.client.fragments.viewholder.d.V(this.f64179a, z10, j10);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    public void Q(Object obj, boolean z10, boolean z11) {
        d0(obj, z10);
        SwivelCheckView swivelCheckView = this.f26998v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10, false);
        }
        this.f10534a.setBackgroundResource(z11 ? R.drawable.selected_clickable_layout_bg : R.drawable.clickable_layout_bg);
    }

    protected abstract void d0(Object obj, boolean z10);
}
