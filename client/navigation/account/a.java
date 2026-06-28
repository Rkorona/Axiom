package com.server.auditor.ssh.client.navigation.account;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f28966f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28967g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f28968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0450a f28969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupWindow f28970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f28971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qg.b f28972e;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.account.a$a, reason: collision with other inner class name */
    public interface InterfaceC0450a {
        void C8();

        void Ka();

        void x3();
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    public a(View view, InterfaceC0450a interfaceC0450a) {
        t.f(view, "view");
        t.f(interfaceC0450a, "clickListener");
        this.f28968a = view;
        this.f28969b = interfaceC0450a;
        this.f28972e = qg.b.c(LayoutInflater.from(view.getContext()));
        CardView cardViewB = j().b();
        t.e(cardViewB, "getRoot(...)");
        this.f28971d = cardViewB;
        PopupWindow popupWindow = new PopupWindow(this.f28971d, -2, -2, true);
        this.f28970c = popupWindow;
        popupWindow.setElevation(20.0f);
        this.f28970c.setAnimationStyle(R.style.AccountContextMenuAnimation);
        this.f28971d.setOnTouchListener(new View.OnTouchListener() { // from class: rj.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return com.server.auditor.ssh.client.navigation.account.a.e(this.f77002a, view2, motionEvent);
            }
        });
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(a aVar, View view, MotionEvent motionEvent) {
        aVar.f28970c.dismiss();
        return true;
    }

    private final qg.b j() {
        qg.b bVar = this.f28972e;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException();
    }

    private final void k() {
        j().f71934b.setOnClickListener(new View.OnClickListener() { // from class: rj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.account.a.l(this.f77004a, view);
            }
        });
        j().f71936d.setOnClickListener(new View.OnClickListener() { // from class: rj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.account.a.m(this.f77006a, view);
            }
        });
        j().f71938f.setOnClickListener(new View.OnClickListener() { // from class: rj.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.account.a.n(this.f77007a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar, View view) {
        aVar.f28969b.x3();
        aVar.f28970c.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a aVar, View view) {
        aVar.f28969b.C8();
        aVar.f28970c.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(a aVar, View view) {
        aVar.f28969b.Ka();
        aVar.f28970c.dismiss();
    }

    public final void f() {
        ConstraintLayout constraintLayout = j().f71938f;
        t.e(constraintLayout, "twoFaItem");
        constraintLayout.setVisibility(8);
    }

    public final void g() {
        AppCompatTextView appCompatTextView = j().f71934b;
        t.e(appCompatTextView, "changeEmailItem");
        appCompatTextView.setVisibility(8);
    }

    public final void h() {
        ConstraintLayout constraintLayout = j().f71938f;
        t.e(constraintLayout, "twoFaItem");
        constraintLayout.setVisibility(0);
    }

    public final void i() {
        AppCompatTextView appCompatTextView = j().f71934b;
        t.e(appCompatTextView, "changeEmailItem");
        appCompatTextView.setVisibility(0);
    }

    public final void o() {
        this.f28972e = null;
    }

    public final void p(String str) {
        t.f(str, "syncDate");
        j().f71935c.setText(str);
        AppCompatTextView appCompatTextView = j().f71935c;
        t.e(appCompatTextView, "lastSyncDateItem");
        appCompatTextView.setVisibility(str.length() > 0 ? 0 : 8);
    }

    public final void q() {
        this.f28970c.showAtLocation(this.f28968a, 8388661, 20, 20);
    }
}
