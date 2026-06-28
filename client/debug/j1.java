package com.server.auditor.ssh.client.debug;

import moxy.MvpView;

/* JADX INFO: loaded from: classes3.dex */
public interface j1 extends MvpView {

    public static final class a {
        public static /* synthetic */ void a(j1 j1Var, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInfoSnackbar");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            j1Var.D6(str);
        }
    }

    void Ce(boolean z10);

    void D6(String str);

    void Fd(boolean z10);

    void H5(boolean z10);

    void H7(boolean z10);

    void Jb();

    void M8();

    void R8(boolean z10);

    void Sb(int i10);

    void Zc(boolean z10);

    void b6(boolean z10);

    void c();

    void d();

    void ef(boolean z10);

    void la(boolean z10);

    void n8();

    void o5();

    void qe();
}
