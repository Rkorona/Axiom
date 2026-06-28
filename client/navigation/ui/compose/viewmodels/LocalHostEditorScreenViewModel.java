package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.fragments.editors.local.base.LocalType;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalHostEditorScreenViewModel extends FragmentWrapperViewModel<c, b> {
    private static LocalHostEditorScreenViewModel composeViewModel;
    private com.server.auditor.ssh.client.fragments.editors.base.r hostEditModel = new com.server.auditor.ssh.client.fragments.editors.base.r();
    private LocalType localType = LocalType.SH;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final LocalHostEditorScreenViewModel a() {
            return LocalHostEditorScreenViewModel.composeViewModel;
        }

        public final void b(LocalHostEditorScreenViewModel localHostEditorScreenViewModel) {
            LocalHostEditorScreenViewModel.composeViewModel = localHostEditorScreenViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34292a;

            public a(String str) {
                this.f34292a = str;
            }

            public final String a() {
                return this.f34292a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34292a, ((a) obj).f34292a);
            }

            public int hashCode() {
                String str = this.f34292a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "OnCharsetResult(charset=" + this.f34292a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0541b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34293a;

            public C0541b(String str) {
                this.f34293a = str;
            }

            public final String a() {
                return this.f34293a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0541b) && ju.t.b(this.f34293a, ((C0541b) obj).f34293a);
            }

            public int hashCode() {
                String str = this.f34293a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "OnColorSchemeResult(colorScheme=" + this.f34293a + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34294a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1121805451;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f34295a;

            public d(Long l10) {
                this.f34295a = l10;
            }

            public final Long a() {
                return this.f34295a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && ju.t.b(this.f34295a, ((d) obj).f34295a);
            }

            public int hashCode() {
                Long l10 = this.f34295a;
                if (l10 == null) {
                    return 0;
                }
                return l10.hashCode();
            }

            public String toString() {
                return "OnSelectGroupResult(selectedGroupId=" + this.f34295a + ")";
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f34296a;

            public e(long j10) {
                this.f34296a = j10;
            }

            public final long a() {
                return this.f34296a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f34296a == ((e) obj).f34296a;
            }

            public int hashCode() {
                return Long.hashCode(this.f34296a);
            }

            public String toString() {
                return "OnSelectSnippetResult(selectedSnippetId=" + this.f34296a + ")";
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f34297a;

            public f(List list) {
                ju.t.f(list, "selectedTags");
                this.f34297a = list;
            }

            public final List a() {
                return this.f34297a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && ju.t.b(this.f34297a, ((f) obj).f34297a);
            }

            public int hashCode() {
                return this.f34297a.hashCode();
            }

            public String toString() {
                return "OnSelectTagsResult(selectedTags=" + this.f34297a + ")";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34298a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 775859618;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34299a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34300b;

            public b(String str, String str2) {
                ju.t.f(str, "initialCharset");
                ju.t.f(str2, "defaultCharset");
                this.f34299a = str;
                this.f34300b = str2;
            }

            public final String a() {
                return this.f34300b;
            }

            public final String b() {
                return this.f34299a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return ju.t.b(this.f34299a, bVar.f34299a) && ju.t.b(this.f34300b, bVar.f34300b);
            }

            public int hashCode() {
                return (this.f34299a.hashCode() * 31) + this.f34300b.hashCode();
            }

            public String toString() {
                return "ShowCharsetManager(initialCharset=" + this.f34299a + ", defaultCharset=" + this.f34300b + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0542c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34302b;

            public C0542c(String str, String str2) {
                ju.t.f(str, "initialColorScheme");
                ju.t.f(str2, "defaultColorScheme");
                this.f34301a = str;
                this.f34302b = str2;
            }

            public final String a() {
                return this.f34302b;
            }

            public final String b() {
                return this.f34301a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0542c)) {
                    return false;
                }
                C0542c c0542c = (C0542c) obj;
                return ju.t.b(this.f34301a, c0542c.f34301a) && ju.t.b(this.f34302b, c0542c.f34302b);
            }

            public int hashCode() {
                return (this.f34301a.hashCode() * 31) + this.f34302b.hashCode();
            }

            public String toString() {
                return "ShowColorSchemeManager(initialColorScheme=" + this.f34301a + ", defaultColorScheme=" + this.f34302b + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f34303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyIdSpecification f34304b;

            public d(Long l10, VaultKeyIdSpecification vaultKeyIdSpecification) {
                ju.t.f(vaultKeyIdSpecification, "vaultKeyIdSpecification");
                this.f34303a = l10;
                this.f34304b = vaultKeyIdSpecification;
            }

            public final Long a() {
                return this.f34303a;
            }

            public final VaultKeyIdSpecification b() {
                return this.f34304b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return ju.t.b(this.f34303a, dVar.f34303a) && ju.t.b(this.f34304b, dVar.f34304b);
            }

            public int hashCode() {
                Long l10 = this.f34303a;
                return ((l10 == null ? 0 : l10.hashCode()) * 31) + this.f34304b.hashCode();
            }

            public String toString() {
                return "ShowSelectGroup(groupIdToFilterInSelector=" + this.f34303a + ", vaultKeyIdSpecification=" + this.f34304b + ")";
            }
        }

        public static final class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f34305a;

            public e(VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f34305a = vaultKeyId;
            }

            public final VaultKeyId a() {
                return this.f34305a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f34305a, ((e) obj).f34305a);
            }

            public int hashCode() {
                return this.f34305a.hashCode();
            }

            public String toString() {
                return "ShowSelectSnippet(targetVaultKeyId=" + this.f34305a + ")";
            }
        }

        public static final class f implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f34306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyId f34307b;

            public f(List list, VaultKeyId vaultKeyId) {
                ju.t.f(list, "chosenTagIds");
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f34306a = list;
                this.f34307b = vaultKeyId;
            }

            public final List a() {
                return this.f34306a;
            }

            public final VaultKeyId b() {
                return this.f34307b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return ju.t.b(this.f34306a, fVar.f34306a) && ju.t.b(this.f34307b, fVar.f34307b);
            }

            public int hashCode() {
                return (this.f34306a.hashCode() * 31) + this.f34307b.hashCode();
            }

            public String toString() {
                return "ShowSelectTags(chosenTagIds=" + this.f34306a + ", targetVaultKeyId=" + this.f34307b + ")";
            }
        }
    }

    public final com.server.auditor.ssh.client.fragments.editors.base.r getHostEditModel() {
        return this.hostEditModel;
    }

    public final LocalType getLocalType() {
        return this.localType;
    }

    public final boolean isInCompose() {
        return composeViewModel != null;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }

    public final void setHostEditModel(com.server.auditor.ssh.client.fragments.editors.base.r rVar) {
        ju.t.f(rVar, "<set-?>");
        this.hostEditModel = rVar;
    }

    public final void setLocalType(LocalType localType) {
        ju.t.f(localType, "<set-?>");
        this.localType = localType;
    }
}
