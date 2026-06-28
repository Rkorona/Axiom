package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CharsetManagerScreenViewModel extends FragmentWrapperViewModel<Object, Object> {
    private static CharsetManagerScreenViewModel composeViewModel;
    private String defaultCharset = "";
    private String initialCharset;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final CharsetManagerScreenViewModel a() {
            return CharsetManagerScreenViewModel.composeViewModel;
        }

        public final void b(CharsetManagerScreenViewModel charsetManagerScreenViewModel) {
            CharsetManagerScreenViewModel.composeViewModel = charsetManagerScreenViewModel;
        }

        private a() {
        }
    }

    public final String getDefaultCharset() {
        return this.defaultCharset;
    }

    public final String getInitialCharset() {
        return this.initialCharset;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(this, composeViewModel)) {
            composeViewModel = null;
        }
    }

    public final void setDefaultCharset(String str) {
        ju.t.f(str, "<set-?>");
        this.defaultCharset = str;
    }

    public final void setInitialCharset(String str) {
        this.initialCharset = str;
    }
}
