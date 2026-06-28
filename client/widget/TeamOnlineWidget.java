package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.server.auditor.ssh.client.R;
import java.util.List;
import qg.s7;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamOnlineWidget extends ConstraintLayout {
    public static final a Q = new a(null);
    public static final int R = 8;
    private s7 N;
    private final com.server.auditor.ssh.client.app.a O;
    private final ut.n P;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f46560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f46561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f46562d;

        public b(int i10, String str, boolean z10, Uri uri) {
            ju.t.f(str, "avatarInitials");
            this.f46559a = i10;
            this.f46560b = str;
            this.f46561c = z10;
            this.f46562d = uri;
        }

        public final int a() {
            return this.f46559a;
        }

        public final String b() {
            return this.f46560b;
        }

        public final Uri c() {
            return this.f46562d;
        }

        public final boolean d() {
            return this.f46561c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46559a == bVar.f46559a && ju.t.b(this.f46560b, bVar.f46560b) && this.f46561c == bVar.f46561c && ju.t.b(this.f46562d, bVar.f46562d);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.f46559a) * 31) + this.f46560b.hashCode()) * 31) + Boolean.hashCode(this.f46561c)) * 31;
            Uri uri = this.f46562d;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public String toString() {
            return "OnlineEntity(avatarColorResId=" + this.f46559a + ", avatarInitials=" + this.f46560b + ", isOnline=" + this.f46561c + ", imageUri=" + this.f46562d + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamOnlineWidget(Context context) {
        this(context, null, 0, 6, null);
        ju.t.f(context, "context");
    }

    private final s7 getBinding() {
        s7 s7Var = this.N;
        if (s7Var != null) {
            return s7Var;
        }
        throw new IllegalStateException();
    }

    private final int getOnlinePresenceColor() {
        return ((Number) this.P.getValue()).intValue();
    }

    private final boolean x() {
        return this.O.m() ? this.O.j() : this.O.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(Context context) {
        return tp.c0.i(context, R.attr.colorPrimary);
    }

    public final void z(List list) {
        ju.t.f(list, "onlineList");
        List listR = vt.v.r(getBinding().f73869h, getBinding().f73867f, getBinding().f73865d);
        List listR2 = vt.v.r(getBinding().f73870i, getBinding().f73868g, getBinding().f73866e);
        getBinding().f73864c.setText(String.valueOf(list.size()));
        boolean z10 = list.size() > listR.size();
        AppCompatTextView appCompatTextView = getBinding().f73864c;
        ju.t.e(appCompatTextView, "counter");
        appCompatTextView.setVisibility(z10 ? 0 : 8);
        boolean z11 = x() && !z10 && list.size() == 1;
        AppCompatTextView appCompatTextView2 = getBinding().f73863b;
        ju.t.e(appCompatTextView2, "addMember");
        appCompatTextView2.setVisibility(z11 ? 0 : 8);
        int i10 = 0;
        for (Object obj : listR) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                vt.v.y();
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) obj;
            if (i10 <= vt.v.q(list)) {
                b bVar = (b) list.get(i10);
                if (bVar.c() != null) {
                    simpleDraweeView.setImageURI(bVar.c(), getContext());
                    ((AppCompatTextView) listR2.get(i10)).setVisibility(8);
                } else {
                    ((AppCompatTextView) listR2.get(i10)).setText(bVar.b());
                    ((AppCompatTextView) listR2.get(i10)).setVisibility(0);
                    simpleDraweeView.setActualImageResource(bVar.a());
                }
                simpleDraweeView.setVisibility(0);
                int onlinePresenceColor = bVar.d() ? getOnlinePresenceColor() : 0;
                gb.e eVarP = simpleDraweeView.getHierarchy().p();
                if (eVarP != null) {
                    eVarP.l(onlinePresenceColor);
                }
                simpleDraweeView.getHierarchy().v(eVarP);
            } else {
                ju.t.c(simpleDraweeView);
                simpleDraweeView.setVisibility(8);
            }
            i10 = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamOnlineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ TeamOnlineWidget(Context context, AttributeSet attributeSet, int i10, int i11, ju.k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamOnlineWidget(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ju.t.f(context, "context");
        this.O = com.server.auditor.ssh.client.app.a.N();
        this.P = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.widget.r0
            @Override // iu.a
            public final Object a() {
                return Integer.valueOf(TeamOnlineWidget.y(context));
            }
        });
        this.N = s7.b(LayoutInflater.from(context), this, true);
    }
}
