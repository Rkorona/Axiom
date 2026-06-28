package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.m;
import java.util.Stack;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Stack f29318a = new Stack();

    private final void i(k.i iVar, m mVar) {
        iVar.f6(mVar.a());
    }

    public final void a(k.i iVar) {
        t.f(iVar, "mainView");
        if (!this.f29318a.isEmpty()) {
            this.f29318a.pop();
        }
        if (this.f29318a.isEmpty()) {
            iVar.Pa();
            return;
        }
        Object objPeek = this.f29318a.peek();
        t.e(objPeek, "peek(...)");
        i(iVar, (m) objPeek);
    }

    public final void b(k.i iVar) {
        t.f(iVar, "mainView");
        this.f29318a.clear();
        this.f29318a.push(m.g.f29325a);
        Object objPeek = this.f29318a.peek();
        t.e(objPeek, "peek(...)");
        i(iVar, (m) objPeek);
    }

    public final void c(k.i iVar) {
        t.f(iVar, "mainView");
        iVar.Pa();
    }

    public final void d(k.i iVar) {
        t.f(iVar, "mainView");
        iVar.n();
    }

    public final void e(k.i iVar, m mVar) {
        t.f(iVar, "mainView");
        t.f(mVar, "screen");
        this.f29318a.push(mVar);
        i(iVar, mVar);
    }

    public final void f(k.i iVar, m mVar) {
        t.f(iVar, "mainView");
        t.f(mVar, "screen");
        this.f29318a.clear();
        this.f29318a.push(mVar);
        Object objPeek = this.f29318a.peek();
        t.e(objPeek, "peek(...)");
        i(iVar, (m) objPeek);
    }

    public final void g(k.i iVar, m mVar) {
        t.f(iVar, "mainView");
        t.f(mVar, "screen");
        if (!this.f29318a.isEmpty()) {
            this.f29318a.pop();
        }
        this.f29318a.push(mVar);
        i(iVar, mVar);
    }

    public final boolean h(k.i iVar) {
        t.f(iVar, "mainView");
        if (this.f29318a.isEmpty()) {
            return false;
        }
        Object objPeek = this.f29318a.peek();
        t.e(objPeek, "peek(...)");
        i(iVar, (m) objPeek);
        return true;
    }
}
