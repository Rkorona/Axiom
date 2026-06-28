package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.keymanager.SshMultiKeyItem;
import io.split.android.client.dtos.SerializableEvent;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeMultiKeyEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static ComposeMultiKeyEditorScreenViewModel composeViewModel;
    private final zu.w _isUsernameEmpty;
    private final boolean isSaveEnabled;
    private final k0 isUsernameEmpty;
    public SshMultiKeyItem multiKey;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final ComposeMultiKeyEditorScreenViewModel a() {
            return ComposeMultiKeyEditorScreenViewModel.composeViewModel;
        }

        public final void b(ComposeMultiKeyEditorScreenViewModel composeMultiKeyEditorScreenViewModel) {
            ComposeMultiKeyEditorScreenViewModel.composeViewModel = composeMultiKeyEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33830a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1791371280;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33831a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 661694173;
            }

            public String toString() {
                return "CloseEditor";
            }
        }
    }

    public ComposeMultiKeyEditorScreenViewModel() {
        zu.w wVarA = m0.a(Boolean.TRUE);
        this._isUsernameEmpty = wVarA;
        this.isUsernameEmpty = zu.h.b(wVarA);
        this.isSaveEnabled = com.server.auditor.ssh.client.app.a.N().z();
    }

    public final SshMultiKeyItem getMultiKey() {
        SshMultiKeyItem sshMultiKeyItem = this.multiKey;
        if (sshMultiKeyItem != null) {
            return sshMultiKeyItem;
        }
        ju.t.t("multiKey");
        return null;
    }

    public final boolean isSaveEnabled() {
        return this.isSaveEnabled;
    }

    public final k0 isUsernameEmpty() {
        return this.isUsernameEmpty;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setMultiKey(SshMultiKeyItem sshMultiKeyItem) {
        ju.t.f(sshMultiKeyItem, "<set-?>");
        this.multiKey = sshMultiKeyItem;
    }

    public final void updateUsernameStatus(String str) {
        Object value;
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        zu.w wVar = this._isUsernameEmpty;
        do {
            value = wVar.getValue();
            ((Boolean) value).getClass();
        } while (!wVar.g(value, Boolean.valueOf(str.length() == 0)));
    }
}
