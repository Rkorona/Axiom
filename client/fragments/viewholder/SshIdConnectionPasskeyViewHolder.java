package com.server.auditor.ssh.client.fragments.viewholder;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.hostngroups.SwivelCheckView;
import com.server.auditor.ssh.client.fragments.hostngroups.l0;
import com.server.auditor.ssh.client.fragments.viewholder.SshIdConnectionPasskeyViewHolder;
import ju.t;
import ut.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SshIdConnectionPasskeyViewHolder extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SwivelCheckView f26990v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    public static final class ItemBackgroundState {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ ItemBackgroundState[] $VALUES;
        public static final ItemBackgroundState FIRST = new ItemBackgroundState("FIRST", 0);
        public static final ItemBackgroundState LAST = new ItemBackgroundState("LAST", 1);
        public static final ItemBackgroundState UNIQUE = new ItemBackgroundState("UNIQUE", 2);
        public static final ItemBackgroundState MIDDLE = new ItemBackgroundState("MIDDLE", 3);

        private static final /* synthetic */ ItemBackgroundState[] $values() {
            return new ItemBackgroundState[]{FIRST, LAST, UNIQUE, MIDDLE};
        }

        static {
            ItemBackgroundState[] itemBackgroundStateArr$values = $values();
            $VALUES = itemBackgroundStateArr$values;
            $ENTRIES = bu.b.a(itemBackgroundStateArr$values);
        }

        private ItemBackgroundState(String str, int i10) {
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static ItemBackgroundState valueOf(String str) {
            return (ItemBackgroundState) Enum.valueOf(ItemBackgroundState.class, str);
        }

        public static ItemBackgroundState[] values() {
            return (ItemBackgroundState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26991a;

        static {
            int[] iArr = new int[ItemBackgroundState.values().length];
            try {
                iArr[ItemBackgroundState.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemBackgroundState.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemBackgroundState.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemBackgroundState.UNIQUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26991a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshIdConnectionPasskeyViewHolder(View view, final l0 l0Var) {
        super(view);
        t.f(view, "itemView");
        t.f(l0Var, "onItemInteractListener");
        SwivelCheckView swivelCheckView = (SwivelCheckView) view.findViewById(R.id.swivel_check);
        this.f26990v = swivelCheckView;
        if (swivelCheckView != null) {
            swivelCheckView.setOnClickListener(new View.OnClickListener() { // from class: li.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SshIdConnectionPasskeyViewHolder.Z(this.f64192a, l0Var, view2);
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.clickable_layout);
        final Point point = new Point(0, 0);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: li.t
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return SshIdConnectionPasskeyViewHolder.a0(point, view2, motionEvent);
                }
            });
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: li.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SshIdConnectionPasskeyViewHolder.b0(this.f64195a, l0Var, view2);
                }
            });
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: li.v
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return SshIdConnectionPasskeyViewHolder.c0(this.f64197a, l0Var, point, view2);
                }
            });
        }
    }

    public static void S(SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = sshIdConnectionPasskeyViewHolder.f26990v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    public static void T(SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = sshIdConnectionPasskeyViewHolder.f26990v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    public static void X(SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, boolean z10, long j10) {
        SwivelCheckView swivelCheckView = sshIdConnectionPasskeyViewHolder.f26990v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(final SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, l0 l0Var, View view) {
        l0Var.Ga(sshIdConnectionPasskeyViewHolder.k(), new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.w
            @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
            public final void a(boolean z10, long j10) {
                SshIdConnectionPasskeyViewHolder.T(this.f64200a, z10, j10);
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
    public static final void b0(final SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, l0 l0Var, View view) {
        int iK = sshIdConnectionPasskeyViewHolder.k();
        if (iK >= 0) {
            l0Var.V8(iK, new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.x
                @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
                public final void a(boolean z10, long j10) {
                    SshIdConnectionPasskeyViewHolder.X(this.f64201a, z10, j10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(final SshIdConnectionPasskeyViewHolder sshIdConnectionPasskeyViewHolder, l0 l0Var, Point point, View view) {
        int iK = sshIdConnectionPasskeyViewHolder.k();
        return iK != -1 && l0Var.hb(iK, point, new com.server.auditor.ssh.client.fragments.hostngroups.c() { // from class: li.y
            @Override // com.server.auditor.ssh.client.fragments.hostngroups.c
            public final void a(boolean z10, long j10) {
                SshIdConnectionPasskeyViewHolder.S(this.f64202a, z10, j10);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    public void Q(Object obj, boolean z10, boolean z11) {
        e0(obj, z10);
        SwivelCheckView swivelCheckView = this.f26990v;
        if (swivelCheckView != null) {
            swivelCheckView.setChecked(z10, false);
        }
        this.f10534a.setBackgroundResource(z11 ? R.drawable.selected_clickable_layout_bg : R.drawable.clickable_layout_bg);
    }

    public final void d0(ItemBackgroundState itemBackgroundState) {
        t.f(itemBackgroundState, "state");
        int i10 = a.f26991a[itemBackgroundState.ordinal()];
        if (i10 == 1) {
            this.f10534a.setBackgroundResource(R.drawable.ssh_id_passkey_clickable_layout_bg_first);
            return;
        }
        if (i10 == 2) {
            this.f10534a.setBackgroundResource(R.drawable.ssh_id_passkey_clickable_layout_bg_last);
        } else if (i10 == 3) {
            this.f10534a.setBackgroundResource(R.drawable.ssh_id_passkey_clickable_layout_bg_middle);
        } else {
            if (i10 != 4) {
                throw new s();
            }
            this.f10534a.setBackgroundResource(R.drawable.ssh_id_passkey_clickable_layout_bg);
        }
    }

    protected abstract void e0(Object obj, boolean z10);
}
