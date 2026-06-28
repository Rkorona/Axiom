package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorSchemeManagerScreenViewModel extends FragmentWrapperViewModel<Object, b> {
    private static ColorSchemeManagerScreenViewModel composeViewModel;
    private boolean isInGroupEditor;
    private boolean isSettingsMode;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private String initialColorScheme = "";
    private String defaultColorScheme = "";

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ColorSchemeManagerScreenViewModel a() {
            return ColorSchemeManagerScreenViewModel.composeViewModel;
        }

        public final void b(ColorSchemeManagerScreenViewModel colorSchemeManagerScreenViewModel) {
            ColorSchemeManagerScreenViewModel.composeViewModel = colorSchemeManagerScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30734a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -727849684;
            }

            public String toString() {
                return "OnSavePressed";
            }
        }
    }

    public final String getDefaultColorScheme() {
        return this.defaultColorScheme;
    }

    public final String getInitialColorScheme() {
        return this.initialColorScheme;
    }

    public final boolean isInGroupEditor() {
        return this.isInGroupEditor;
    }

    public final boolean isSettingsMode() {
        return this.isSettingsMode;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setDefaultColorScheme(String str) {
        ju.t.f(str, "<set-?>");
        this.defaultColorScheme = str;
    }

    public final void setInGroupEditor(boolean z10) {
        this.isInGroupEditor = z10;
    }

    public final void setInitialColorScheme(String str) {
        ju.t.f(str, "<set-?>");
        this.initialColorScheme = str;
    }

    public final void setSettingsMode(boolean z10) {
        this.isSettingsMode = z10;
    }
}
