package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static IdentityEditorScreenViewModel composeViewModel;
    private int actualModelHashCode;
    private boolean isAlreadyPinUnlocked;
    private boolean isNeedLockVaultSelectorOnStart;
    private final String uniqueId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private Identity currentIdentity = new Identity();
    private VaultKeyId targetVaultKeyId = VaultKeyId.Companion.a();
    private String vaultWizardId = "";
    private boolean isSavingToVaultPermitted = true;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final IdentityEditorScreenViewModel a() {
            return IdentityEditorScreenViewModel.composeViewModel;
        }

        public final void b(IdentityEditorScreenViewModel identityEditorScreenViewModel) {
            IdentityEditorScreenViewModel.composeViewModel = identityEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34152a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1009897794;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.IdentityEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0536b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34153a;

            public C0536b(long j10) {
                this.f34153a = j10;
            }

            public final long a() {
                return this.f34153a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0536b) && this.f34153a == ((C0536b) obj).f34153a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34153a);
            }

            public String toString() {
                return "OnSelectSshKeyResult(selectedSshKeyId=" + this.f34153a + ")";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34154a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -882431537;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34155a;

            public b(long j10) {
                this.f34155a = j10;
            }

            public final long a() {
                return this.f34155a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f34155a == ((b) obj).f34155a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34155a);
            }

            public String toString() {
                return "IdentityCreated(identityId=" + this.f34155a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.IdentityEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0537c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f34156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelectPurpose f34157b;

            public C0537c(VaultKeyId vaultKeyId, SelectPurpose selectPurpose) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                ju.t.f(selectPurpose, "selectPurpose");
                this.f34156a = vaultKeyId;
                this.f34157b = selectPurpose;
            }

            public final SelectPurpose a() {
                return this.f34157b;
            }

            public final VaultKeyId b() {
                return this.f34156a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0537c)) {
                    return false;
                }
                C0537c c0537c = (C0537c) obj;
                return ju.t.b(this.f34156a, c0537c.f34156a) && this.f34157b == c0537c.f34157b;
            }

            public int hashCode() {
                return (this.f34156a.hashCode() * 31) + this.f34157b.hashCode();
            }

            public String toString() {
                return "ShowSelectSshKey(targetVaultKeyId=" + this.f34156a + ", selectPurpose=" + this.f34157b + ")";
            }
        }
    }

    public IdentityEditorScreenViewModel() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.uniqueId = string;
    }

    public final int getActualModelHashCode() {
        return this.actualModelHashCode;
    }

    public final Identity getCurrentIdentity() {
        return this.currentIdentity;
    }

    public final VaultKeyId getTargetVaultKeyId() {
        return this.targetVaultKeyId;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final String getVaultWizardId() {
        return this.vaultWizardId;
    }

    public final boolean isAlreadyPinUnlocked() {
        return this.isAlreadyPinUnlocked;
    }

    public final boolean isNeedLockVaultSelectorOnStart() {
        return this.isNeedLockVaultSelectorOnStart;
    }

    public final boolean isSavingToVaultPermitted() {
        return this.isSavingToVaultPermitted;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setActualModelHashCode(int i10) {
        this.actualModelHashCode = i10;
    }

    public final void setAlreadyPinUnlocked(boolean z10) {
        this.isAlreadyPinUnlocked = z10;
    }

    public final void setCurrentIdentity(Identity identity) {
        this.currentIdentity = identity;
    }

    public final void setNeedLockVaultSelectorOnStart(boolean z10) {
        this.isNeedLockVaultSelectorOnStart = z10;
    }

    public final void setSavingToVaultPermitted(boolean z10) {
        this.isSavingToVaultPermitted = z10;
    }

    public final void setTargetVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.targetVaultKeyId = vaultKeyId;
    }

    public final void setVaultWizardId(String str) {
        ju.t.f(str, "<set-?>");
        this.vaultWizardId = str;
    }
}
