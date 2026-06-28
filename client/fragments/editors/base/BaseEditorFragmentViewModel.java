package com.server.auditor.ssh.client.fragments.editors.base;

import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.navigation.chainhosts.ChainingHostResult;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.FragmentWrapperViewModel;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdHostParameters;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import java.util.UUID;
import ut.m0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseEditorFragmentViewModel extends FragmentWrapperViewModel<c, b> {
    private static BaseEditorFragmentViewModel composeViewModel;
    private final zu.w _envVariableEditModel;
    private final zu.w _isAddVariableBottomSheetVisible;
    private r editModel = new r();
    private Avo.HostCreationMethod hostCreationMethod;
    private Avo.HostCreationOrigin hostCreationOrigin;
    private int initialEditorDataHashCode;
    private VaultKeyId initialVaultKeyId;
    private boolean isHideSshLayout;
    private boolean isNeedLockVaultSelectorOnStart;
    private boolean isSavingToVaultPermitted;
    private Host mEditedHost;
    private GroupDBModel mGroupDBModel;
    private boolean mIsFirstLaunch;
    private boolean mIsFirstOpenOfScreen;
    private boolean startConnectionOnSave;
    private int startModelHashCode;
    private VaultKeyId targetVaultKeyId;
    private final String uniqueId;
    private String vaultWizardId;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final BaseEditorFragmentViewModel a() {
            return BaseEditorFragmentViewModel.composeViewModel;
        }

        public final void b(BaseEditorFragmentViewModel baseEditorFragmentViewModel) {
            BaseEditorFragmentViewModel.composeViewModel = baseEditorFragmentViewModel;
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f24728c;

            public a(String str, String str2, int i10) {
                ju.t.f(str, Column.MULTI_KEY_NAME);
                ju.t.f(str2, SerializableEvent.VALUE_FIELD);
                this.f24726a = str;
                this.f24727b = str2;
                this.f24728c = i10;
            }

            public final int a() {
                return this.f24728c;
            }

            public final String b() {
                return this.f24726a;
            }

            public final String c() {
                return this.f24727b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return ju.t.b(this.f24726a, aVar.f24726a) && ju.t.b(this.f24727b, aVar.f24727b) && this.f24728c == aVar.f24728c;
            }

            public int hashCode() {
                return (((this.f24726a.hashCode() * 31) + this.f24727b.hashCode()) * 31) + Integer.hashCode(this.f24728c);
            }

            public String toString() {
                return "OnAddEnvironmentVariable(name=" + this.f24726a + ", value=" + this.f24727b + ", index=" + this.f24728c + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.BaseEditorFragmentViewModel$b$b, reason: collision with other inner class name */
        public static final class C0396b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelectPurpose f24730b;

            public C0396b(String str, SelectPurpose selectPurpose) {
                ju.t.f(selectPurpose, "charsetPurpose");
                this.f24729a = str;
                this.f24730b = selectPurpose;
            }

            public final String a() {
                return this.f24729a;
            }

            public final SelectPurpose b() {
                return this.f24730b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0396b)) {
                    return false;
                }
                C0396b c0396b = (C0396b) obj;
                return ju.t.b(this.f24729a, c0396b.f24729a) && this.f24730b == c0396b.f24730b;
            }

            public int hashCode() {
                String str = this.f24729a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24730b.hashCode();
            }

            public String toString() {
                return "OnCharsetResult(charset=" + this.f24729a + ", charsetPurpose=" + this.f24730b + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelectPurpose f24732b;

            public c(String str, SelectPurpose selectPurpose) {
                ju.t.f(selectPurpose, "colorSchemePurpose");
                this.f24731a = str;
                this.f24732b = selectPurpose;
            }

            public final String a() {
                return this.f24731a;
            }

            public final SelectPurpose b() {
                return this.f24732b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return ju.t.b(this.f24731a, cVar.f24731a) && this.f24732b == cVar.f24732b;
            }

            public int hashCode() {
                String str = this.f24731a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24732b.hashCode();
            }

            public String toString() {
                return "OnColorSchemeResult(colorScheme=" + this.f24731a + ", colorSchemePurpose=" + this.f24732b + ")";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f24733a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1024189764;
            }

            public String toString() {
                return "OnSaveClick";
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ChainingHostResult f24734a;

            public e(ChainingHostResult chainingHostResult) {
                this.f24734a = chainingHostResult;
            }

            public final ChainingHostResult a() {
                return this.f24734a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && ju.t.b(this.f24734a, ((e) obj).f24734a);
            }

            public int hashCode() {
                ChainingHostResult chainingHostResult = this.f24734a;
                if (chainingHostResult == null) {
                    return 0;
                }
                return chainingHostResult.hashCode();
            }

            public String toString() {
                return "OnSelectChainHostResult(result=" + this.f24734a + ")";
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f24735a;

            public f(Long l10) {
                this.f24735a = l10;
            }

            public final Long a() {
                return this.f24735a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && ju.t.b(this.f24735a, ((f) obj).f24735a);
            }

            public int hashCode() {
                Long l10 = this.f24735a;
                if (l10 == null) {
                    return 0;
                }
                return l10.hashCode();
            }

            public String toString() {
                return "OnSelectGroupResult(selectedGroupId=" + this.f24735a + ")";
            }
        }

        public static final class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f24736a;

            public g(long j10) {
                this.f24736a = j10;
            }

            public final long a() {
                return this.f24736a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f24736a == ((g) obj).f24736a;
            }

            public int hashCode() {
                return Long.hashCode(this.f24736a);
            }

            public String toString() {
                return "OnSelectSnippetResult(selectedSnippetId=" + this.f24736a + ")";
            }
        }

        public static final class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f24737a;

            public h(long j10) {
                this.f24737a = j10;
            }

            public final long a() {
                return this.f24737a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f24737a == ((h) obj).f24737a;
            }

            public int hashCode() {
                return Long.hashCode(this.f24737a);
            }

            public String toString() {
                return "OnSelectSshIdentityResult(selectedIdentityId=" + this.f24737a + ")";
            }
        }

        public static final class i implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f24738a;

            public i(long j10) {
                this.f24738a = j10;
            }

            public final long a() {
                return this.f24738a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f24738a == ((i) obj).f24738a;
            }

            public int hashCode() {
                return Long.hashCode(this.f24738a);
            }

            public String toString() {
                return "OnSelectSshKeyResult(selectedSshKeyId=" + this.f24738a + ")";
            }
        }

        public static final class j implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f24739a;

            public j(List list) {
                ju.t.f(list, "selectedTags");
                this.f24739a = list;
            }

            public final List a() {
                return this.f24739a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && ju.t.b(this.f24739a, ((j) obj).f24739a);
            }

            public int hashCode() {
                return this.f24739a.hashCode();
            }

            public String toString() {
                return "OnSelectTagsResult(selectedTags=" + this.f24739a + ")";
            }
        }

        public static final class k implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f24740a;

            public k(long j10) {
                this.f24740a = j10;
            }

            public final long a() {
                return this.f24740a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && this.f24740a == ((k) obj).f24740a;
            }

            public int hashCode() {
                return Long.hashCode(this.f24740a);
            }

            public String toString() {
                return "OnSelectTelnetIdentityResult(selectedIdentityId=" + this.f24740a + ")";
            }
        }

        public static final class l implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final NsdSearchResult f24741a;

            public l(NsdSearchResult nsdSearchResult) {
                ju.t.f(nsdSearchResult, "selectedNsdResult");
                this.f24741a = nsdSearchResult;
            }

            public final NsdSearchResult a() {
                return this.f24741a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && ju.t.b(this.f24741a, ((l) obj).f24741a);
            }

            public int hashCode() {
                return this.f24741a.hashCode();
            }

            public String toString() {
                return "OnSelectedNsdResult(selectedNsdResult=" + this.f24741a + ")";
            }
        }

        public static final class m implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final m f24742a = new m();

            private m() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public int hashCode() {
                return 1546400824;
            }

            public String toString() {
                return "OnSshIdAttached";
            }
        }

        public static final class n implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final n f24743a = new n();

            private n() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public int hashCode() {
                return -911832424;
            }

            public String toString() {
                return "OnSshIdCleared";
            }
        }

        public static final class o implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdHostParameters f24744a;

            public o(SshIdHostParameters sshIdHostParameters) {
                ju.t.f(sshIdHostParameters, "sshIdParameters");
                this.f24744a = sshIdHostParameters;
            }

            public final SshIdHostParameters a() {
                return this.f24744a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && ju.t.b(this.f24744a, ((o) obj).f24744a);
            }

            public int hashCode() {
                return this.f24744a.hashCode();
            }

            public String toString() {
                return "OnSshIdParametersUpdated(sshIdParameters=" + this.f24744a + ")";
            }
        }

        public static final class p implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ProxyDataMediator f24745a;

            public p(ProxyDataMediator proxyDataMediator) {
                this.f24745a = proxyDataMediator;
            }

            public final ProxyDataMediator a() {
                return this.f24745a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && ju.t.b(this.f24745a, ((p) obj).f24745a);
            }

            public int hashCode() {
                ProxyDataMediator proxyDataMediator = this.f24745a;
                if (proxyDataMediator == null) {
                    return 0;
                }
                return proxyDataMediator.hashCode();
            }

            public String toString() {
                return "OnUpdatedProxyResult(updatedProxy=" + this.f24745a + ")";
            }
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24746a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1325482607;
            }

            public String toString() {
                return "CloseEditor";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.server.auditor.ssh.client.models.properties.b f24747a;

            public b(com.server.auditor.ssh.client.models.properties.b bVar) {
                this.f24747a = bVar;
            }

            public final com.server.auditor.ssh.client.models.properties.b a() {
                return this.f24747a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f24747a, ((b) obj).f24747a);
            }

            public int hashCode() {
                com.server.auditor.ssh.client.models.properties.b bVar = this.f24747a;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            public String toString() {
                return "ShowAddEnvironmentVariable(envVariable=" + this.f24747a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.BaseEditorFragmentViewModel$c$c, reason: collision with other inner class name */
        public static final class C0397c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24749b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final SelectPurpose f24750c;

            public C0397c(String str, String str2, SelectPurpose selectPurpose) {
                ju.t.f(str, "initialCharset");
                ju.t.f(str2, "defaultCharset");
                ju.t.f(selectPurpose, "selectPurpose");
                this.f24748a = str;
                this.f24749b = str2;
                this.f24750c = selectPurpose;
            }

            public final String a() {
                return this.f24749b;
            }

            public final String b() {
                return this.f24748a;
            }

            public final SelectPurpose c() {
                return this.f24750c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0397c)) {
                    return false;
                }
                C0397c c0397c = (C0397c) obj;
                return ju.t.b(this.f24748a, c0397c.f24748a) && ju.t.b(this.f24749b, c0397c.f24749b) && this.f24750c == c0397c.f24750c;
            }

            public int hashCode() {
                return (((this.f24748a.hashCode() * 31) + this.f24749b.hashCode()) * 31) + this.f24750c.hashCode();
            }

            public String toString() {
                return "ShowCharsetManager(initialCharset=" + this.f24748a + ", defaultCharset=" + this.f24749b + ", selectPurpose=" + this.f24750c + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final SelectPurpose f24753c;

            public d(String str, String str2, SelectPurpose selectPurpose) {
                ju.t.f(str, "initialColorScheme");
                ju.t.f(str2, "defaultColorScheme");
                ju.t.f(selectPurpose, "selectPurpose");
                this.f24751a = str;
                this.f24752b = str2;
                this.f24753c = selectPurpose;
            }

            public final String a() {
                return this.f24752b;
            }

            public final String b() {
                return this.f24751a;
            }

            public final SelectPurpose c() {
                return this.f24753c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return ju.t.b(this.f24751a, dVar.f24751a) && ju.t.b(this.f24752b, dVar.f24752b) && this.f24753c == dVar.f24753c;
            }

            public int hashCode() {
                return (((this.f24751a.hashCode() * 31) + this.f24752b.hashCode()) * 31) + this.f24753c.hashCode();
            }

            public String toString() {
                return "ShowColorSchemeManager(initialColorScheme=" + this.f24751a + ", defaultColorScheme=" + this.f24752b + ", selectPurpose=" + this.f24753c + ")";
            }
        }

        public static final class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f24754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Long f24755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f24756c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Long f24757d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final List f24758e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f24759f;

            public e(VaultKeyId vaultKeyId, Long l10, String str, Long l11, List list, String str2) {
                ju.t.f(vaultKeyId, "vaultKeyId");
                ju.t.f(str, "finalHostForChain");
                ju.t.f(str2, "chainingType");
                this.f24754a = vaultKeyId;
                this.f24755b = l10;
                this.f24756c = str;
                this.f24757d = l11;
                this.f24758e = list;
                this.f24759f = str2;
            }

            public final String a() {
                return this.f24759f;
            }

            public final Long b() {
                return this.f24755b;
            }

            public final String c() {
                return this.f24756c;
            }

            public final List d() {
                return this.f24758e;
            }

            public final Long e() {
                return this.f24757d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return ju.t.b(this.f24754a, eVar.f24754a) && ju.t.b(this.f24755b, eVar.f24755b) && ju.t.b(this.f24756c, eVar.f24756c) && ju.t.b(this.f24757d, eVar.f24757d) && ju.t.b(this.f24758e, eVar.f24758e) && ju.t.b(this.f24759f, eVar.f24759f);
            }

            public final VaultKeyId f() {
                return this.f24754a;
            }

            public int hashCode() {
                int iHashCode = this.f24754a.hashCode() * 31;
                Long l10 = this.f24755b;
                int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.f24756c.hashCode()) * 31;
                Long l11 = this.f24757d;
                int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
                List list = this.f24758e;
                return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f24759f.hashCode();
            }

            public String toString() {
                return "ShowEditChainHost(vaultKeyId=" + this.f24754a + ", editedHostId=" + this.f24755b + ", finalHostForChain=" + this.f24756c + ", sshConfigId=" + this.f24757d + ", hostIds=" + this.f24758e + ", chainingType=" + this.f24759f + ")";
            }
        }

        public static final class f implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Proxy f24760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyId f24761b;

            public f(Proxy proxy, VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "vaultKeyId");
                this.f24760a = proxy;
                this.f24761b = vaultKeyId;
            }

            public final Proxy a() {
                return this.f24760a;
            }

            public final VaultKeyId b() {
                return this.f24761b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return ju.t.b(this.f24760a, fVar.f24760a) && ju.t.b(this.f24761b, fVar.f24761b);
            }

            public int hashCode() {
                Proxy proxy = this.f24760a;
                return ((proxy == null ? 0 : proxy.hashCode()) * 31) + this.f24761b.hashCode();
            }

            public String toString() {
                return "ShowEditProxy(proxy=" + this.f24760a + ", vaultKeyId=" + this.f24761b + ")";
            }
        }

        public static final class g implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f24762a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 952171606;
            }

            public String toString() {
                return "ShowNsdSearch";
            }
        }

        public static final class h implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f24763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyIdSpecification f24764b;

            public h(Long l10, VaultKeyIdSpecification vaultKeyIdSpecification) {
                ju.t.f(vaultKeyIdSpecification, "vaultKeyIdSpecification");
                this.f24763a = l10;
                this.f24764b = vaultKeyIdSpecification;
            }

            public final Long a() {
                return this.f24763a;
            }

            public final VaultKeyIdSpecification b() {
                return this.f24764b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return ju.t.b(this.f24763a, hVar.f24763a) && ju.t.b(this.f24764b, hVar.f24764b);
            }

            public int hashCode() {
                Long l10 = this.f24763a;
                return ((l10 == null ? 0 : l10.hashCode()) * 31) + this.f24764b.hashCode();
            }

            public String toString() {
                return "ShowSelectGroup(groupIdToFilterInSelector=" + this.f24763a + ", vaultKeyIdSpecification=" + this.f24764b + ")";
            }
        }

        public static final class i implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f24765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelectPurpose f24766b;

            public i(VaultKeyId vaultKeyId, SelectPurpose selectPurpose) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                ju.t.f(selectPurpose, "selectPurpose");
                this.f24765a = vaultKeyId;
                this.f24766b = selectPurpose;
            }

            public final SelectPurpose a() {
                return this.f24766b;
            }

            public final VaultKeyId b() {
                return this.f24765a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return ju.t.b(this.f24765a, iVar.f24765a) && this.f24766b == iVar.f24766b;
            }

            public int hashCode() {
                return (this.f24765a.hashCode() * 31) + this.f24766b.hashCode();
            }

            public String toString() {
                return "ShowSelectIdentity(targetVaultKeyId=" + this.f24765a + ", selectPurpose=" + this.f24766b + ")";
            }
        }

        public static final class j implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f24767a;

            public j(VaultKeyId vaultKeyId) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f24767a = vaultKeyId;
            }

            public final VaultKeyId a() {
                return this.f24767a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && ju.t.b(this.f24767a, ((j) obj).f24767a);
            }

            public int hashCode() {
                return this.f24767a.hashCode();
            }

            public String toString() {
                return "ShowSelectSnippet(targetVaultKeyId=" + this.f24767a + ")";
            }
        }

        public static final class k implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VaultKeyId f24768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelectPurpose f24769b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24770c;

            public k(VaultKeyId vaultKeyId, SelectPurpose selectPurpose, boolean z10) {
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                ju.t.f(selectPurpose, "selectPurpose");
                this.f24768a = vaultKeyId;
                this.f24769b = selectPurpose;
                this.f24770c = z10;
            }

            public final SelectPurpose a() {
                return this.f24769b;
            }

            public final VaultKeyId b() {
                return this.f24768a;
            }

            public final boolean c() {
                return this.f24770c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return ju.t.b(this.f24768a, kVar.f24768a) && this.f24769b == kVar.f24769b && this.f24770c == kVar.f24770c;
            }

            public int hashCode() {
                return (((this.f24768a.hashCode() * 31) + this.f24769b.hashCode()) * 31) + Boolean.hashCode(this.f24770c);
            }

            public String toString() {
                return "ShowSelectSshKey(targetVaultKeyId=" + this.f24768a + ", selectPurpose=" + this.f24769b + ", isPrivateCredentials=" + this.f24770c + ")";
            }
        }

        public static final class l implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f24771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final VaultKeyId f24772b;

            public l(List list, VaultKeyId vaultKeyId) {
                ju.t.f(list, "chosenTagIds");
                ju.t.f(vaultKeyId, "targetVaultKeyId");
                this.f24771a = list;
                this.f24772b = vaultKeyId;
            }

            public final List a() {
                return this.f24771a;
            }

            public final VaultKeyId b() {
                return this.f24772b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return ju.t.b(this.f24771a, lVar.f24771a) && ju.t.b(this.f24772b, lVar.f24772b);
            }

            public int hashCode() {
                return (this.f24771a.hashCode() * 31) + this.f24772b.hashCode();
            }

            public String toString() {
                return "ShowSelectTags(chosenTagIds=" + this.f24771a + ", targetVaultKeyId=" + this.f24772b + ")";
            }
        }

        public static final class m implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SshIdSettingsData f24773a;

            public m(SshIdSettingsData sshIdSettingsData) {
                ju.t.f(sshIdSettingsData, "sshIdSettings");
                this.f24773a = sshIdSettingsData;
            }

            public final SshIdSettingsData a() {
                return this.f24773a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && ju.t.b(this.f24773a, ((m) obj).f24773a);
            }

            public int hashCode() {
                return this.f24773a.hashCode();
            }

            public String toString() {
                return "ShowSshIdParameters(sshIdSettings=" + this.f24773a + ")";
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24774a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24776c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BaseEditorFragmentViewModel.this.new d(this.f24776c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24774a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.w wVar = BaseEditorFragmentViewModel.this._isAddVariableBottomSheetVisible;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(this.f24776c);
                this.f24774a = 1;
                if (wVar.emit(boolA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24777a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.models.properties.b f24779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.server.auditor.ssh.client.models.properties.b bVar, zt.e eVar) {
            super(2, eVar);
            this.f24779c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BaseEditorFragmentViewModel.this.new e(this.f24779c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24777a;
            if (i10 == 0) {
                ut.x.b(obj);
                zu.w wVar = BaseEditorFragmentViewModel.this._envVariableEditModel;
                com.server.auditor.ssh.client.models.properties.b bVar = this.f24779c;
                this.f24777a = 1;
                if (wVar.emit(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BaseEditorFragmentViewModel() {
        VaultKeyId.b bVar = VaultKeyId.Companion;
        this.initialVaultKeyId = bVar.a();
        this.targetVaultKeyId = bVar.a();
        this.mIsFirstLaunch = true;
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.uniqueId = string;
        this.hostCreationOrigin = Avo.HostCreationOrigin.HOSTS_SCREEN;
        this.hostCreationMethod = Avo.HostCreationMethod.ADD_EMPTY_HOST;
        this.mIsFirstOpenOfScreen = true;
        this.vaultWizardId = "";
        this.isSavingToVaultPermitted = true;
        this._isAddVariableBottomSheetVisible = zu.m0.a(Boolean.FALSE);
        this._envVariableEditModel = zu.m0.a(null);
    }

    public final r getEditModel() {
        return this.editModel;
    }

    public final k0 getEnvVariableEditModel() {
        return this._envVariableEditModel;
    }

    public final Avo.HostCreationMethod getHostCreationMethod() {
        return this.hostCreationMethod;
    }

    public final Avo.HostCreationOrigin getHostCreationOrigin() {
        return this.hostCreationOrigin;
    }

    public final int getInitialEditorDataHashCode() {
        return this.initialEditorDataHashCode;
    }

    public final VaultKeyId getInitialVaultKeyId() {
        return this.initialVaultKeyId;
    }

    public final Host getMEditedHost() {
        return this.mEditedHost;
    }

    public final GroupDBModel getMGroupDBModel() {
        return this.mGroupDBModel;
    }

    public final boolean getMIsFirstLaunch() {
        return this.mIsFirstLaunch;
    }

    public final boolean getMIsFirstOpenOfScreen() {
        return this.mIsFirstOpenOfScreen;
    }

    public final boolean getStartConnectionOnSave() {
        return this.startConnectionOnSave;
    }

    public final int getStartModelHashCode() {
        return this.startModelHashCode;
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

    public final k0 isAddVariableBottomSheetVisible() {
        return this._isAddVariableBottomSheetVisible;
    }

    public final boolean isHideSshLayout() {
        return this.isHideSshLayout;
    }

    public final boolean isInCompose() {
        return composeViewModel != null;
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

    public final void setEditModel(r rVar) {
        ju.t.f(rVar, "<set-?>");
        this.editModel = rVar;
    }

    public final void setHideSshLayout(boolean z10) {
        this.isHideSshLayout = z10;
    }

    public final void setHostCreationMethod(Avo.HostCreationMethod hostCreationMethod) {
        ju.t.f(hostCreationMethod, "<set-?>");
        this.hostCreationMethod = hostCreationMethod;
    }

    public final void setHostCreationOrigin(Avo.HostCreationOrigin hostCreationOrigin) {
        ju.t.f(hostCreationOrigin, "<set-?>");
        this.hostCreationOrigin = hostCreationOrigin;
    }

    public final void setInitialEditorDataHashCode(int i10) {
        this.initialEditorDataHashCode = i10;
    }

    public final void setInitialVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.initialVaultKeyId = vaultKeyId;
    }

    public final void setMEditedHost(Host host) {
        this.mEditedHost = host;
    }

    public final void setMGroupDBModel(GroupDBModel groupDBModel) {
        this.mGroupDBModel = groupDBModel;
    }

    public final void setMIsFirstLaunch(boolean z10) {
        this.mIsFirstLaunch = z10;
    }

    public final void setMIsFirstOpenOfScreen(boolean z10) {
        this.mIsFirstOpenOfScreen = z10;
    }

    public final void setNeedLockVaultSelectorOnStart(boolean z10) {
        this.isNeedLockVaultSelectorOnStart = z10;
    }

    public final void setSavingToVaultPermitted(boolean z10) {
        this.isSavingToVaultPermitted = z10;
    }

    public final void setStartConnectionOnSave(boolean z10) {
        this.startConnectionOnSave = z10;
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

    public final void updateAddVariableBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void updateEnvVariableEditModel(com.server.auditor.ssh.client.models.properties.b bVar) {
        wu.k.d(j1.a(this), null, null, new e(bVar, null), 3, null);
    }
}
