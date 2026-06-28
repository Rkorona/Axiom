package com.server.auditor.ssh.client.ssh.terminal.bottompanel.copypastewidget;

import android.content.Context;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.crystalnix.terminal.view.TerminalView;
import com.crystalnix.termius.libtermius.Keygen;
import com.server.auditor.ssh.client.R;
import f9.g;
import fw.l;
import sm.a;
import sm.c;
import sm.d;

/* JADX INFO: loaded from: classes4.dex */
public class CopyPasteModeManager implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Menu f39009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f39010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MODE f39011c = MODE.Copy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TerminalView.b f39012d = TerminalView.b.f16928a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f39013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f39014f;

    public enum MODE {
        Copy,
        Paste
    }

    public CopyPasteModeManager(Context context, Window window) {
        this.f39010b = new a(context, window).C(this);
    }

    private void m() {
        g gVar = this.f39013e;
        if (gVar != null) {
            Rect rectP = gVar.p(this.f39011c == MODE.Copy);
            if (this.f39010b == null || gVar.o() == 0) {
                return;
            }
            this.f39010b.D(gVar.o());
            this.f39010b.A(rectP);
            this.f39010b.F();
        }
    }

    public void a() {
        g gVar = this.f39013e;
        if (gVar != null) {
            gVar.h();
        }
    }

    public void b(MODE mode) {
        this.f39011c = mode;
        this.f39009a.setGroupVisible(R.id.copy_menu, mode == MODE.Copy);
        this.f39009a.setGroupVisible(R.id.paste_menu, mode == MODE.Paste);
    }

    public void c() {
        this.f39010b.s();
        this.f39010b.r();
        this.f39010b = null;
    }

    public void d() {
        this.f39010b.s();
        this.f39012d = TerminalView.b.f16928a;
    }

    public TerminalView.b e() {
        return this.f39012d;
    }

    public g f() {
        return this.f39013e;
    }

    public void g() {
        this.f39010b.x();
    }

    public boolean h() {
        return this.f39010b.z();
    }

    public void i(Menu menu) {
        this.f39009a = menu;
        this.f39010b.B(menu);
    }

    public void j(c cVar) {
        this.f39014f = cVar;
    }

    public void k(g gVar) {
        this.f39013e = gVar;
    }

    public void l(TerminalView terminalView) {
        this.f39010b.E(terminalView);
    }

    public void n() {
        m();
        this.f39012d = TerminalView.b.f16929b;
    }

    public void o() {
        m();
        this.f39012d = TerminalView.b.f16930c;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        l.f(this.f39014f);
        StringBuilder sb2 = new StringBuilder();
        switch (menuItem.getItemId()) {
            case R.id.copy /* 2131362444 */:
                int i10 = this.f39013e.i(sb2);
                d dVar = new d();
                if (!dVar.b(sb2)) {
                    this.f39014f.b(i10, sb2);
                } else {
                    String strA = dVar.a(sb2.toString());
                    if (!Keygen.validatePrivateKeyFormat(strA)) {
                        this.f39014f.b(i10, sb2);
                    } else {
                        this.f39014f.b(i10, new StringBuilder(strA));
                    }
                }
                break;
            case R.id.google /* 2131362855 */:
                this.f39014f.c(this.f39013e.i(sb2), sb2.toString());
                break;
            case R.id.paste /* 2131363407 */:
                this.f39014f.d();
                break;
            case R.id.select_all /* 2131363655 */:
                this.f39013e.z();
                break;
            case R.id.serverfault /* 2131363694 */:
                this.f39014f.a(this.f39013e.i(sb2), sb2.toString());
                break;
        }
        return false;
    }
}
