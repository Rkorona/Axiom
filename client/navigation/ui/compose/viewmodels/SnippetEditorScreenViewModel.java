package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import java.util.List;
import ut.m0;
import wu.i0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class SnippetEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static SnippetEditorScreenViewModel composeViewModel;
    private final zu.w _hasUnsavedChanges;
    private final zu.w _isSaveEnabled;
    private final List<SnippetHostDBModel> currentSnippetHosts;
    private SnippetDBModel existingSnippet;
    private final k0 hasUnsavedChanges;
    private VaultKeyId initialVaultKeyId;
    private boolean isCreateSnippetFromPackage;
    private boolean isInitialized;
    private boolean isNeedLockVaultSelectorOnStart;
    private int startModelHashCode;
    private VaultKeyId targetVaultKeyId;
    private String vaultWizardId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private long localPackageId = -1;
    private boolean isPanelTerminal = true;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final SnippetEditorScreenViewModel a() {
            return SnippetEditorScreenViewModel.composeViewModel;
        }

        public final void b(SnippetEditorScreenViewModel snippetEditorScreenViewModel) {
            SnippetEditorScreenViewModel.composeViewModel = snippetEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34506a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 22477045;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0550b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f34507a;

            public C0550b(List list) {
                ju.t.f(list, "selectedHostIds");
                this.f34507a = list;
            }

            public final List a() {
                return this.f34507a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0550b) && ju.t.b(this.f34507a, ((C0550b) obj).f34507a);
            }

            public int hashCode() {
                return this.f34507a.hashCode();
            }

            public String toString() {
                return "OnSelectDefaultHostResult(selectedHostIds=" + this.f34507a + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34508a;

            public c(long j10) {
                this.f34508a = j10;
            }

            public final long a() {
                return this.f34508a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f34508a == ((c) obj).f34508a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34508a);
            }

            public String toString() {
                return "OnSelectPackageResult(selectedPackageId=" + this.f34508a + ")";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34509a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1056417400;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f34510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f34511b;

            public b(VaultKeyId vaultKeyId, List list) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                ju.t.f(list, "currentHostIds");
                this.f34510a = vaultKeyId;
                this.f34511b = list;
            }

            public final List a() {
                return this.f34511b;
            }

            public final VaultKeyId b() {
                return this.f34510a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f34510a, bVar.f34510a) && ju.t.b(this.f34511b, bVar.f34511b);
            }

            public int hashCode() {
                return (this.f34510a.hashCode() * 31) + this.f34511b.hashCode();
            }

            public String toString() {
                return "ShowSelectDefaultHosts(targetVaultKeyId=" + this.f34510a + ", currentHostIds=" + this.f34511b + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.SnippetEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0551c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f34512a;

            public C0551c(VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f34512a = vaultKeyId;
            }

            public final VaultKeyId a() {
                return this.f34512a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0551c) && ju.t.b(this.f34512a, ((C0551c) obj).f34512a);
            }

            public int hashCode() {
                return this.f34512a.hashCode();
            }

            public String toString() {
                return "ShowSelectPackage(targetVaultKeyId=" + this.f34512a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34513a;

            public d(long j10) {
                this.f34513a = j10;
            }

            public final long a() {
                return this.f34513a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f34513a == ((d) obj).f34513a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34513a);
            }

            public String toString() {
                return "SnippetCreated(snippetId=" + this.f34513a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34516c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetEditorScreenViewModel.this.new d(this.f34516c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34514a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetEditorScreenViewModel.this._hasUnsavedChanges.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34516c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34517a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f34519c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetEditorScreenViewModel.this.new e(this.f34519c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SnippetEditorScreenViewModel.this._isSaveEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(this.f34519c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SnippetEditorScreenViewModel() {
        VaultKeyId.b bVar = VaultKeyId.Companion;
        this.initialVaultKeyId = bVar.a();
        this.targetVaultKeyId = bVar.a();
        this.currentSnippetHosts = new ArrayList();
        this.vaultWizardId = "";
        this._isSaveEnabled = zu.m0.a(Boolean.TRUE);
        zu.w wVarA = zu.m0.a(Boolean.FALSE);
        this._hasUnsavedChanges = wVarA;
        this.hasUnsavedChanges = zu.h.b(wVarA);
    }

    public static /* synthetic */ void updateHasUnsavedChanges$default(SnippetEditorScreenViewModel snippetEditorScreenViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        snippetEditorScreenViewModel.updateHasUnsavedChanges(z10);
    }

    public final List<SnippetHostDBModel> getCurrentSnippetHosts() {
        return this.currentSnippetHosts;
    }

    public final SnippetDBModel getExistingSnippet() {
        return this.existingSnippet;
    }

    public final k0 getHasUnsavedChanges() {
        return this.hasUnsavedChanges;
    }

    public final VaultKeyId getInitialVaultKeyId() {
        return this.initialVaultKeyId;
    }

    public final long getLocalPackageId() {
        return this.localPackageId;
    }

    public final int getStartModelHashCode() {
        return this.startModelHashCode;
    }

    public final VaultKeyId getTargetVaultKeyId() {
        return this.targetVaultKeyId;
    }

    public final String getVaultWizardId() {
        return this.vaultWizardId;
    }

    public final boolean isCreateSnippetFromPackage() {
        return this.isCreateSnippetFromPackage;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isNeedLockVaultSelectorOnStart() {
        return this.isNeedLockVaultSelectorOnStart;
    }

    public final boolean isPanelTerminal() {
        return this.isPanelTerminal;
    }

    public final k0 isSaveEnabled() {
        return this._isSaveEnabled;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setCreateSnippetFromPackage(boolean z10) {
        this.isCreateSnippetFromPackage = z10;
    }

    public final void setExistingSnippet(SnippetDBModel snippetDBModel) {
        this.existingSnippet = snippetDBModel;
    }

    public final void setInitialVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.initialVaultKeyId = vaultKeyId;
    }

    public final void setInitialized(boolean z10) {
        this.isInitialized = z10;
    }

    public final void setLocalPackageId(long j10) {
        this.localPackageId = j10;
    }

    public final void setNeedLockVaultSelectorOnStart(boolean z10) {
        this.isNeedLockVaultSelectorOnStart = z10;
    }

    public final void setPanelTerminal(boolean z10) {
        this.isPanelTerminal = z10;
    }

    public final void setStartModelHashCode(int i10) {
        this.startModelHashCode = i10;
    }

    public final void setTargetVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.targetVaultKeyId = vaultKeyId;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }

    public final void updateHasUnsavedChanges(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void updateSaveButton(boolean z10) {
        wu.k.d(j1.a(this), null, null, new e(z10, null), 3, null);
    }
}
