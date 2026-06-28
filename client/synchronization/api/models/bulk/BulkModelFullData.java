package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModelFullData;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostFullData;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.HostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.IdentityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.KnownHostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.PackageChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ProxyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.RuleChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SnippetChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshCertificateChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshKeyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.TagChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupFullData;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostFullData;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostFullData;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleFullData;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyFullData;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetFullData;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageFullData;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostFullData;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigFullData;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyFullData;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates.SshCertificateFullData;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates.SshCertificateFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyFullData;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagFullData;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostFullData;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostFullData$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigFullData;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigFullData$$serializer;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class BulkModelFullData {
    private static final n[] $childSerializers;
    private List<SshCertificateFullData> certificateSet;
    private List<ChainHostFullData> chainHosts;
    private DeleteSet deleteSet;
    private List<GroupFullData> groups;
    private List<HostFullData> hosts;
    private List<KnownHostFullData> knownHosts;
    private String lastSync;
    private List<MultiKeyFullData> multiKeySet;
    private List<PackageFullData> packages;
    private List<RuleFullData> pfRules;
    private List<ProxyFullData> proxies;
    private List<SharedSshConfigIdentityFullData> sharedSshConfigIdentitySet;
    private List<SharedTelnetConfigIdentityFullData> sharedTelnetConfigIdentitySet;
    private List<SnippetHostFullData> snippetHosts;
    private List<SnippetFullData> snippets;
    private List<SshConfigIdentityFullData> sshConfigIdentitySet;
    private List<SshConfigFullData> sshConfigs;
    private List<IdentityFullData> sshIdentities;
    private List<SshKeyFullData> sshKeys;
    private List<TagHostFullData> tagHosts;
    private List<TagFullData> tags;
    private List<TelnetConfigIdentityFullData> telnetConfigIdentitySet;
    private List<TelnetConfigFullData> telnetConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return BulkModelFullData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: ym.v
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: ym.x
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: ym.z
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$1();
            }
        }), o.b(rVar, new a() { // from class: ym.a0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$2();
            }
        }), o.b(rVar, new a() { // from class: ym.b0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$3();
            }
        }), o.b(rVar, new a() { // from class: ym.c0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$4();
            }
        }), o.b(rVar, new a() { // from class: ym.d0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$5();
            }
        }), o.b(rVar, new a() { // from class: ym.e0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$6();
            }
        }), o.b(rVar, new a() { // from class: ym.f0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$7();
            }
        }), o.b(rVar, new a() { // from class: ym.h0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$8();
            }
        }), o.b(rVar, new a() { // from class: ym.g0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$9();
            }
        }), o.b(rVar, new a() { // from class: ym.i0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$10();
            }
        }), o.b(rVar, new a() { // from class: ym.j0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$11();
            }
        }), o.b(rVar, new a() { // from class: ym.k0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$12();
            }
        }), o.b(rVar, new a() { // from class: ym.l0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$13();
            }
        }), o.b(rVar, new a() { // from class: ym.m0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$14();
            }
        }), o.b(rVar, new a() { // from class: ym.n0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$15();
            }
        }), o.b(rVar, new a() { // from class: ym.o0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$16();
            }
        }), o.b(rVar, new a() { // from class: ym.p0
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$17();
            }
        }), o.b(rVar, new a() { // from class: ym.w
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$18();
            }
        }), o.b(rVar, new a() { // from class: ym.y
            @Override // iu.a
            public final Object a() {
                return BulkModelFullData._childSerializers$_anonymous_$19();
            }
        }), null, null};
    }

    public BulkModelFullData() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (DeleteSet) null, (String) null, 8388607, (k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(HostFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(SshConfigFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$1() {
        return new f(TelnetConfigFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$10() {
        return new f(KnownHostFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$11() {
        return new f(RuleFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$12() {
        return new f(IdentityFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$13() {
        return new f(SshConfigIdentityFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$14() {
        return new f(SharedSshConfigIdentityFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$15() {
        return new f(TelnetConfigIdentityFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$16() {
        return new f(SharedTelnetConfigIdentityFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$17() {
        return new f(MultiKeyFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$18() {
        return new f(SshCertificateFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$19() {
        return new f(PackageFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$2() {
        return new f(ProxyFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$3() {
        return new f(SnippetFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$4() {
        return new f(SshKeyFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$5() {
        return new f(GroupFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$6() {
        return new f(TagFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$7() {
        return new f(TagHostFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$8() {
        return new f(SnippetHostFullData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$9() {
        return new f(ChainHostFullData$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkModelFullData copy$default(BulkModelFullData bulkModelFullData, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, DeleteSet deleteSet, String str, int i10, Object obj) {
        String str2;
        DeleteSet deleteSet2;
        List list22 = (i10 & 1) != 0 ? bulkModelFullData.hosts : list;
        List list23 = (i10 & 2) != 0 ? bulkModelFullData.sshConfigs : list2;
        List list24 = (i10 & 4) != 0 ? bulkModelFullData.telnetConfigs : list3;
        List list25 = (i10 & 8) != 0 ? bulkModelFullData.proxies : list4;
        List list26 = (i10 & 16) != 0 ? bulkModelFullData.snippets : list5;
        List list27 = (i10 & 32) != 0 ? bulkModelFullData.sshKeys : list6;
        List list28 = (i10 & 64) != 0 ? bulkModelFullData.groups : list7;
        List list29 = (i10 & 128) != 0 ? bulkModelFullData.tags : list8;
        List list30 = (i10 & 256) != 0 ? bulkModelFullData.tagHosts : list9;
        List list31 = (i10 & File.FLAG_O_TRUNC) != 0 ? bulkModelFullData.snippetHosts : list10;
        List list32 = (i10 & File.FLAG_O_APPEND) != 0 ? bulkModelFullData.chainHosts : list11;
        List list33 = (i10 & 2048) != 0 ? bulkModelFullData.knownHosts : list12;
        List list34 = (i10 & 4096) != 0 ? bulkModelFullData.pfRules : list13;
        List list35 = (i10 & 8192) != 0 ? bulkModelFullData.sshIdentities : list14;
        List list36 = list22;
        List list37 = (i10 & 16384) != 0 ? bulkModelFullData.sshConfigIdentitySet : list15;
        List list38 = (i10 & 32768) != 0 ? bulkModelFullData.sharedSshConfigIdentitySet : list16;
        List list39 = (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? bulkModelFullData.telnetConfigIdentitySet : list17;
        List list40 = (i10 & 131072) != 0 ? bulkModelFullData.sharedTelnetConfigIdentitySet : list18;
        List list41 = (i10 & 262144) != 0 ? bulkModelFullData.multiKeySet : list19;
        List list42 = (i10 & 524288) != 0 ? bulkModelFullData.certificateSet : list20;
        List list43 = (i10 & 1048576) != 0 ? bulkModelFullData.packages : list21;
        DeleteSet deleteSet3 = (i10 & 2097152) != 0 ? bulkModelFullData.deleteSet : deleteSet;
        if ((i10 & 4194304) != 0) {
            deleteSet2 = deleteSet3;
            str2 = bulkModelFullData.lastSync;
        } else {
            str2 = str;
            deleteSet2 = deleteSet3;
        }
        return bulkModelFullData.copy(list36, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list37, list38, list39, list40, list41, list42, list43, deleteSet2, str2);
    }

    @hv.o(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)
    public static /* synthetic */ void getCertificateSet$annotations() {
    }

    @hv.o("hostchain_set")
    public static /* synthetic */ void getChainHosts$annotations() {
    }

    @hv.o("deleted_sets")
    public static /* synthetic */ void getDeleteSet$annotations() {
    }

    @hv.o(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME)
    public static /* synthetic */ void getGroups$annotations() {
    }

    @hv.o(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME)
    public static /* synthetic */ void getHosts$annotations() {
    }

    @hv.o(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME)
    public static /* synthetic */ void getKnownHosts$annotations() {
    }

    @hv.o("now")
    public static /* synthetic */ void getLastSync$annotations() {
    }

    @hv.o("multikey_set")
    public static /* synthetic */ void getMultiKeySet$annotations() {
    }

    @hv.o(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME)
    public static /* synthetic */ void getPackages$annotations() {
    }

    @hv.o(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME)
    public static /* synthetic */ void getPfRules$annotations() {
    }

    @hv.o(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME)
    public static /* synthetic */ void getProxies$annotations() {
    }

    @hv.o("sharedsshconfigidentity_set")
    public static /* synthetic */ void getSharedSshConfigIdentitySet$annotations() {
    }

    @hv.o("sharedtelnetconfigidentity_set")
    public static /* synthetic */ void getSharedTelnetConfigIdentitySet$annotations() {
    }

    @hv.o("hostsnippet_set")
    public static /* synthetic */ void getSnippetHosts$annotations() {
    }

    @hv.o(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME)
    public static /* synthetic */ void getSnippets$annotations() {
    }

    @hv.o("sshconfigidentity_set")
    public static /* synthetic */ void getSshConfigIdentitySet$annotations() {
    }

    @hv.o("sshconfig_set")
    public static /* synthetic */ void getSshConfigs$annotations() {
    }

    @hv.o(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME)
    public static /* synthetic */ void getSshIdentities$annotations() {
    }

    @hv.o(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME)
    public static /* synthetic */ void getSshKeys$annotations() {
    }

    @hv.o("taghost_set")
    public static /* synthetic */ void getTagHosts$annotations() {
    }

    @hv.o(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME)
    public static /* synthetic */ void getTags$annotations() {
    }

    @hv.o("telnetconfigidentity_set")
    public static /* synthetic */ void getTelnetConfigIdentitySet$annotations() {
    }

    @hv.o("telnetconfig_set")
    public static /* synthetic */ void getTelnetConfigs$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(BulkModelFullData bulkModelFullData, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || !t.b(bulkModelFullData.hosts, v.o())) {
            dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), bulkModelFullData.hosts);
        }
        if (dVar.E(fVar, 1) || !t.b(bulkModelFullData.sshConfigs, v.o())) {
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), bulkModelFullData.sshConfigs);
        }
        if (dVar.E(fVar, 2) || !t.b(bulkModelFullData.telnetConfigs, v.o())) {
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), bulkModelFullData.telnetConfigs);
        }
        if (dVar.E(fVar, 3) || !t.b(bulkModelFullData.proxies, v.o())) {
            dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), bulkModelFullData.proxies);
        }
        if (dVar.E(fVar, 4) || !t.b(bulkModelFullData.snippets, v.o())) {
            dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), bulkModelFullData.snippets);
        }
        if (dVar.E(fVar, 5) || !t.b(bulkModelFullData.sshKeys, v.o())) {
            dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), bulkModelFullData.sshKeys);
        }
        if (dVar.E(fVar, 6) || !t.b(bulkModelFullData.groups, v.o())) {
            dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), bulkModelFullData.groups);
        }
        if (dVar.E(fVar, 7) || !t.b(bulkModelFullData.tags, v.o())) {
            dVar.o(fVar, 7, (hv.r) nVarArr[7].getValue(), bulkModelFullData.tags);
        }
        if (dVar.E(fVar, 8) || !t.b(bulkModelFullData.tagHosts, v.o())) {
            dVar.o(fVar, 8, (hv.r) nVarArr[8].getValue(), bulkModelFullData.tagHosts);
        }
        if (dVar.E(fVar, 9) || !t.b(bulkModelFullData.snippetHosts, v.o())) {
            dVar.o(fVar, 9, (hv.r) nVarArr[9].getValue(), bulkModelFullData.snippetHosts);
        }
        if (dVar.E(fVar, 10) || !t.b(bulkModelFullData.chainHosts, v.o())) {
            dVar.o(fVar, 10, (hv.r) nVarArr[10].getValue(), bulkModelFullData.chainHosts);
        }
        if (dVar.E(fVar, 11) || !t.b(bulkModelFullData.knownHosts, v.o())) {
            dVar.o(fVar, 11, (hv.r) nVarArr[11].getValue(), bulkModelFullData.knownHosts);
        }
        if (dVar.E(fVar, 12) || !t.b(bulkModelFullData.pfRules, v.o())) {
            dVar.o(fVar, 12, (hv.r) nVarArr[12].getValue(), bulkModelFullData.pfRules);
        }
        if (dVar.E(fVar, 13) || !t.b(bulkModelFullData.sshIdentities, v.o())) {
            dVar.o(fVar, 13, (hv.r) nVarArr[13].getValue(), bulkModelFullData.sshIdentities);
        }
        if (dVar.E(fVar, 14) || !t.b(bulkModelFullData.sshConfigIdentitySet, v.o())) {
            dVar.o(fVar, 14, (hv.r) nVarArr[14].getValue(), bulkModelFullData.sshConfigIdentitySet);
        }
        if (dVar.E(fVar, 15) || !t.b(bulkModelFullData.sharedSshConfigIdentitySet, v.o())) {
            dVar.o(fVar, 15, (hv.r) nVarArr[15].getValue(), bulkModelFullData.sharedSshConfigIdentitySet);
        }
        if (dVar.E(fVar, 16) || !t.b(bulkModelFullData.telnetConfigIdentitySet, v.o())) {
            dVar.o(fVar, 16, (hv.r) nVarArr[16].getValue(), bulkModelFullData.telnetConfigIdentitySet);
        }
        if (dVar.E(fVar, 17) || !t.b(bulkModelFullData.sharedTelnetConfigIdentitySet, v.o())) {
            dVar.o(fVar, 17, (hv.r) nVarArr[17].getValue(), bulkModelFullData.sharedTelnetConfigIdentitySet);
        }
        if (dVar.E(fVar, 18) || !t.b(bulkModelFullData.multiKeySet, v.o())) {
            dVar.o(fVar, 18, (hv.r) nVarArr[18].getValue(), bulkModelFullData.multiKeySet);
        }
        if (dVar.E(fVar, 19) || !t.b(bulkModelFullData.certificateSet, v.o())) {
            dVar.o(fVar, 19, (hv.r) nVarArr[19].getValue(), bulkModelFullData.certificateSet);
        }
        if (dVar.E(fVar, 20) || !t.b(bulkModelFullData.packages, v.o())) {
            dVar.o(fVar, 20, (hv.r) nVarArr[20].getValue(), bulkModelFullData.packages);
        }
        if (dVar.E(fVar, 21) || !t.b(bulkModelFullData.deleteSet, new DeleteSet((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 2097151, (k) null))) {
            dVar.o(fVar, 21, DeleteSet$$serializer.INSTANCE, bulkModelFullData.deleteSet);
        }
        if (!dVar.E(fVar, 22) && bulkModelFullData.lastSync == null) {
            return;
        }
        dVar.v(fVar, 22, x2.f64817a, bulkModelFullData.lastSync);
    }

    public final List<HostFullData> component1() {
        return this.hosts;
    }

    public final List<SnippetHostFullData> component10() {
        return this.snippetHosts;
    }

    public final List<ChainHostFullData> component11() {
        return this.chainHosts;
    }

    public final List<KnownHostFullData> component12() {
        return this.knownHosts;
    }

    public final List<RuleFullData> component13() {
        return this.pfRules;
    }

    public final List<IdentityFullData> component14() {
        return this.sshIdentities;
    }

    public final List<SshConfigIdentityFullData> component15() {
        return this.sshConfigIdentitySet;
    }

    public final List<SharedSshConfigIdentityFullData> component16() {
        return this.sharedSshConfigIdentitySet;
    }

    public final List<TelnetConfigIdentityFullData> component17() {
        return this.telnetConfigIdentitySet;
    }

    public final List<SharedTelnetConfigIdentityFullData> component18() {
        return this.sharedTelnetConfigIdentitySet;
    }

    public final List<MultiKeyFullData> component19() {
        return this.multiKeySet;
    }

    public final List<SshConfigFullData> component2() {
        return this.sshConfigs;
    }

    public final List<SshCertificateFullData> component20() {
        return this.certificateSet;
    }

    public final List<PackageFullData> component21() {
        return this.packages;
    }

    public final DeleteSet component22() {
        return this.deleteSet;
    }

    public final String component23() {
        return this.lastSync;
    }

    public final List<TelnetConfigFullData> component3() {
        return this.telnetConfigs;
    }

    public final List<ProxyFullData> component4() {
        return this.proxies;
    }

    public final List<SnippetFullData> component5() {
        return this.snippets;
    }

    public final List<SshKeyFullData> component6() {
        return this.sshKeys;
    }

    public final List<GroupFullData> component7() {
        return this.groups;
    }

    public final List<TagFullData> component8() {
        return this.tags;
    }

    public final List<TagHostFullData> component9() {
        return this.tagHosts;
    }

    public final BulkModelFullData copy(List<HostFullData> list, List<SshConfigFullData> list2, List<TelnetConfigFullData> list3, List<ProxyFullData> list4, List<SnippetFullData> list5, List<SshKeyFullData> list6, List<GroupFullData> list7, List<TagFullData> list8, List<TagHostFullData> list9, List<SnippetHostFullData> list10, List<ChainHostFullData> list11, List<KnownHostFullData> list12, List<RuleFullData> list13, List<IdentityFullData> list14, List<SshConfigIdentityFullData> list15, List<SharedSshConfigIdentityFullData> list16, List<TelnetConfigIdentityFullData> list17, List<SharedTelnetConfigIdentityFullData> list18, List<MultiKeyFullData> list19, List<SshCertificateFullData> list20, List<PackageFullData> list21, DeleteSet deleteSet, String str) {
        t.f(list, Table.HOSTS);
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, "proxies");
        t.f(list5, "snippets");
        t.f(list6, "sshKeys");
        t.f(list7, "groups");
        t.f(list8, Table.TAG);
        t.f(list9, "tagHosts");
        t.f(list10, "snippetHosts");
        t.f(list11, "chainHosts");
        t.f(list12, "knownHosts");
        t.f(list13, "pfRules");
        t.f(list14, "sshIdentities");
        t.f(list15, "sshConfigIdentitySet");
        t.f(list16, "sharedSshConfigIdentitySet");
        t.f(list17, "telnetConfigIdentitySet");
        t.f(list18, "sharedTelnetConfigIdentitySet");
        t.f(list19, "multiKeySet");
        t.f(list20, "certificateSet");
        t.f(list21, "packages");
        t.f(deleteSet, "deleteSet");
        return new BulkModelFullData(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, deleteSet, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkModelFullData)) {
            return false;
        }
        BulkModelFullData bulkModelFullData = (BulkModelFullData) obj;
        return t.b(this.hosts, bulkModelFullData.hosts) && t.b(this.sshConfigs, bulkModelFullData.sshConfigs) && t.b(this.telnetConfigs, bulkModelFullData.telnetConfigs) && t.b(this.proxies, bulkModelFullData.proxies) && t.b(this.snippets, bulkModelFullData.snippets) && t.b(this.sshKeys, bulkModelFullData.sshKeys) && t.b(this.groups, bulkModelFullData.groups) && t.b(this.tags, bulkModelFullData.tags) && t.b(this.tagHosts, bulkModelFullData.tagHosts) && t.b(this.snippetHosts, bulkModelFullData.snippetHosts) && t.b(this.chainHosts, bulkModelFullData.chainHosts) && t.b(this.knownHosts, bulkModelFullData.knownHosts) && t.b(this.pfRules, bulkModelFullData.pfRules) && t.b(this.sshIdentities, bulkModelFullData.sshIdentities) && t.b(this.sshConfigIdentitySet, bulkModelFullData.sshConfigIdentitySet) && t.b(this.sharedSshConfigIdentitySet, bulkModelFullData.sharedSshConfigIdentitySet) && t.b(this.telnetConfigIdentitySet, bulkModelFullData.telnetConfigIdentitySet) && t.b(this.sharedTelnetConfigIdentitySet, bulkModelFullData.sharedTelnetConfigIdentitySet) && t.b(this.multiKeySet, bulkModelFullData.multiKeySet) && t.b(this.certificateSet, bulkModelFullData.certificateSet) && t.b(this.packages, bulkModelFullData.packages) && t.b(this.deleteSet, bulkModelFullData.deleteSet) && t.b(this.lastSync, bulkModelFullData.lastSync);
    }

    public final List<SshCertificateFullData> getCertificateSet() {
        return this.certificateSet;
    }

    public final List<ChainHostFullData> getChainHosts() {
        return this.chainHosts;
    }

    public final DeleteSet getDeleteSet() {
        return this.deleteSet;
    }

    public final List<GroupFullData> getGroups() {
        return this.groups;
    }

    public final List<HostFullData> getHosts() {
        return this.hosts;
    }

    public final List<KnownHostFullData> getKnownHosts() {
        return this.knownHosts;
    }

    public final String getLastSync() {
        return this.lastSync;
    }

    public final List<MultiKeyFullData> getMultiKeySet() {
        return this.multiKeySet;
    }

    public final List<PackageFullData> getPackages() {
        return this.packages;
    }

    public final List<RuleFullData> getPfRules() {
        return this.pfRules;
    }

    public final List<ProxyFullData> getProxies() {
        return this.proxies;
    }

    public final List<SharedSshConfigIdentityFullData> getSharedSshConfigIdentitySet() {
        return this.sharedSshConfigIdentitySet;
    }

    public final List<SharedTelnetConfigIdentityFullData> getSharedTelnetConfigIdentitySet() {
        return this.sharedTelnetConfigIdentitySet;
    }

    public final List<SnippetHostFullData> getSnippetHosts() {
        return this.snippetHosts;
    }

    public final List<SnippetFullData> getSnippets() {
        return this.snippets;
    }

    public final List<SshConfigIdentityFullData> getSshConfigIdentitySet() {
        return this.sshConfigIdentitySet;
    }

    public final List<SshConfigFullData> getSshConfigs() {
        return this.sshConfigs;
    }

    public final List<IdentityFullData> getSshIdentities() {
        return this.sshIdentities;
    }

    public final List<SshKeyFullData> getSshKeys() {
        return this.sshKeys;
    }

    public final List<TagHostFullData> getTagHosts() {
        return this.tagHosts;
    }

    public final List<TagFullData> getTags() {
        return this.tags;
    }

    public final List<TelnetConfigIdentityFullData> getTelnetConfigIdentitySet() {
        return this.telnetConfigIdentitySet;
    }

    public final List<TelnetConfigFullData> getTelnetConfigs() {
        return this.telnetConfigs;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((this.hosts.hashCode() * 31) + this.sshConfigs.hashCode()) * 31) + this.telnetConfigs.hashCode()) * 31) + this.proxies.hashCode()) * 31) + this.snippets.hashCode()) * 31) + this.sshKeys.hashCode()) * 31) + this.groups.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.tagHosts.hashCode()) * 31) + this.snippetHosts.hashCode()) * 31) + this.chainHosts.hashCode()) * 31) + this.knownHosts.hashCode()) * 31) + this.pfRules.hashCode()) * 31) + this.sshIdentities.hashCode()) * 31) + this.sshConfigIdentitySet.hashCode()) * 31) + this.sharedSshConfigIdentitySet.hashCode()) * 31) + this.telnetConfigIdentitySet.hashCode()) * 31) + this.sharedTelnetConfigIdentitySet.hashCode()) * 31) + this.multiKeySet.hashCode()) * 31) + this.certificateSet.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.deleteSet.hashCode()) * 31;
        String str = this.lastSync;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCertificateSet(List<SshCertificateFullData> list) {
        t.f(list, "<set-?>");
        this.certificateSet = list;
    }

    public final void setChainHosts(List<ChainHostFullData> list) {
        t.f(list, "<set-?>");
        this.chainHosts = list;
    }

    public final void setDeleteSet(DeleteSet deleteSet) {
        t.f(deleteSet, "<set-?>");
        this.deleteSet = deleteSet;
    }

    public final void setGroups(List<GroupFullData> list) {
        t.f(list, "<set-?>");
        this.groups = list;
    }

    public final void setHosts(List<HostFullData> list) {
        t.f(list, "<set-?>");
        this.hosts = list;
    }

    public final void setKnownHosts(List<KnownHostFullData> list) {
        t.f(list, "<set-?>");
        this.knownHosts = list;
    }

    public final void setLastSync(String str) {
        this.lastSync = str;
    }

    public final void setMultiKeySet(List<MultiKeyFullData> list) {
        t.f(list, "<set-?>");
        this.multiKeySet = list;
    }

    public final void setPackages(List<PackageFullData> list) {
        t.f(list, "<set-?>");
        this.packages = list;
    }

    public final void setPfRules(List<RuleFullData> list) {
        t.f(list, "<set-?>");
        this.pfRules = list;
    }

    public final void setProxies(List<ProxyFullData> list) {
        t.f(list, "<set-?>");
        this.proxies = list;
    }

    public final void setSharedSshConfigIdentitySet(List<SharedSshConfigIdentityFullData> list) {
        t.f(list, "<set-?>");
        this.sharedSshConfigIdentitySet = list;
    }

    public final void setSharedTelnetConfigIdentitySet(List<SharedTelnetConfigIdentityFullData> list) {
        t.f(list, "<set-?>");
        this.sharedTelnetConfigIdentitySet = list;
    }

    public final void setSnippetHosts(List<SnippetHostFullData> list) {
        t.f(list, "<set-?>");
        this.snippetHosts = list;
    }

    public final void setSnippets(List<SnippetFullData> list) {
        t.f(list, "<set-?>");
        this.snippets = list;
    }

    public final void setSshConfigIdentitySet(List<SshConfigIdentityFullData> list) {
        t.f(list, "<set-?>");
        this.sshConfigIdentitySet = list;
    }

    public final void setSshConfigs(List<SshConfigFullData> list) {
        t.f(list, "<set-?>");
        this.sshConfigs = list;
    }

    public final void setSshIdentities(List<IdentityFullData> list) {
        t.f(list, "<set-?>");
        this.sshIdentities = list;
    }

    public final void setSshKeys(List<SshKeyFullData> list) {
        t.f(list, "<set-?>");
        this.sshKeys = list;
    }

    public final void setTagHosts(List<TagHostFullData> list) {
        t.f(list, "<set-?>");
        this.tagHosts = list;
    }

    public final void setTags(List<TagFullData> list) {
        t.f(list, "<set-?>");
        this.tags = list;
    }

    public final void setTelnetConfigIdentitySet(List<TelnetConfigIdentityFullData> list) {
        t.f(list, "<set-?>");
        this.telnetConfigIdentitySet = list;
    }

    public final void setTelnetConfigs(List<TelnetConfigFullData> list) {
        t.f(list, "<set-?>");
        this.telnetConfigs = list;
    }

    public String toString() {
        return "BulkModelFullData(hosts=" + this.hosts + ", sshConfigs=" + this.sshConfigs + ", telnetConfigs=" + this.telnetConfigs + ", proxies=" + this.proxies + ", snippets=" + this.snippets + ", sshKeys=" + this.sshKeys + ", groups=" + this.groups + ", tags=" + this.tags + ", tagHosts=" + this.tagHosts + ", snippetHosts=" + this.snippetHosts + ", chainHosts=" + this.chainHosts + ", knownHosts=" + this.knownHosts + ", pfRules=" + this.pfRules + ", sshIdentities=" + this.sshIdentities + ", sshConfigIdentitySet=" + this.sshConfigIdentitySet + ", sharedSshConfigIdentitySet=" + this.sharedSshConfigIdentitySet + ", telnetConfigIdentitySet=" + this.telnetConfigIdentitySet + ", sharedTelnetConfigIdentitySet=" + this.sharedTelnetConfigIdentitySet + ", multiKeySet=" + this.multiKeySet + ", certificateSet=" + this.certificateSet + ", packages=" + this.packages + ", deleteSet=" + this.deleteSet + ", lastSync=" + this.lastSync + ")";
    }

    public /* synthetic */ BulkModelFullData(int i10, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, DeleteSet deleteSet, String str, s2 s2Var) {
        this.hosts = (i10 & 1) == 0 ? v.o() : list;
        this.sshConfigs = (i10 & 2) == 0 ? v.o() : list2;
        this.telnetConfigs = (i10 & 4) == 0 ? v.o() : list3;
        this.proxies = (i10 & 8) == 0 ? v.o() : list4;
        this.snippets = (i10 & 16) == 0 ? v.o() : list5;
        this.sshKeys = (i10 & 32) == 0 ? v.o() : list6;
        this.groups = (i10 & 64) == 0 ? v.o() : list7;
        this.tags = (i10 & 128) == 0 ? v.o() : list8;
        this.tagHosts = (i10 & 256) == 0 ? v.o() : list9;
        this.snippetHosts = (i10 & File.FLAG_O_TRUNC) == 0 ? v.o() : list10;
        this.chainHosts = (i10 & File.FLAG_O_APPEND) == 0 ? v.o() : list11;
        this.knownHosts = (i10 & 2048) == 0 ? v.o() : list12;
        this.pfRules = (i10 & 4096) == 0 ? v.o() : list13;
        this.sshIdentities = (i10 & 8192) == 0 ? v.o() : list14;
        this.sshConfigIdentitySet = (i10 & 16384) == 0 ? v.o() : list15;
        this.sharedSshConfigIdentitySet = (32768 & i10) == 0 ? v.o() : list16;
        this.telnetConfigIdentitySet = (65536 & i10) == 0 ? v.o() : list17;
        this.sharedTelnetConfigIdentitySet = (131072 & i10) == 0 ? v.o() : list18;
        this.multiKeySet = (262144 & i10) == 0 ? v.o() : list19;
        this.certificateSet = (524288 & i10) == 0 ? v.o() : list20;
        this.packages = (1048576 & i10) == 0 ? v.o() : list21;
        if ((2097152 & i10) == 0) {
            this.deleteSet = new DeleteSet((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 2097151, (k) null);
        } else {
            this.deleteSet = deleteSet;
        }
        this.lastSync = (i10 & 4194304) == 0 ? null : str;
    }

    public BulkModelFullData(List<HostFullData> list, List<SshConfigFullData> list2, List<TelnetConfigFullData> list3, List<ProxyFullData> list4, List<SnippetFullData> list5, List<SshKeyFullData> list6, List<GroupFullData> list7, List<TagFullData> list8, List<TagHostFullData> list9, List<SnippetHostFullData> list10, List<ChainHostFullData> list11, List<KnownHostFullData> list12, List<RuleFullData> list13, List<IdentityFullData> list14, List<SshConfigIdentityFullData> list15, List<SharedSshConfigIdentityFullData> list16, List<TelnetConfigIdentityFullData> list17, List<SharedTelnetConfigIdentityFullData> list18, List<MultiKeyFullData> list19, List<SshCertificateFullData> list20, List<PackageFullData> list21, DeleteSet deleteSet, String str) {
        t.f(list, Table.HOSTS);
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, "proxies");
        t.f(list5, "snippets");
        t.f(list6, "sshKeys");
        t.f(list7, "groups");
        t.f(list8, Table.TAG);
        t.f(list9, "tagHosts");
        t.f(list10, "snippetHosts");
        t.f(list11, "chainHosts");
        t.f(list12, "knownHosts");
        t.f(list13, "pfRules");
        t.f(list14, "sshIdentities");
        t.f(list15, "sshConfigIdentitySet");
        t.f(list16, "sharedSshConfigIdentitySet");
        t.f(list17, "telnetConfigIdentitySet");
        t.f(list18, "sharedTelnetConfigIdentitySet");
        t.f(list19, "multiKeySet");
        t.f(list20, "certificateSet");
        t.f(list21, "packages");
        t.f(deleteSet, "deleteSet");
        this.hosts = list;
        this.sshConfigs = list2;
        this.telnetConfigs = list3;
        this.proxies = list4;
        this.snippets = list5;
        this.sshKeys = list6;
        this.groups = list7;
        this.tags = list8;
        this.tagHosts = list9;
        this.snippetHosts = list10;
        this.chainHosts = list11;
        this.knownHosts = list12;
        this.pfRules = list13;
        this.sshIdentities = list14;
        this.sshConfigIdentitySet = list15;
        this.sharedSshConfigIdentitySet = list16;
        this.telnetConfigIdentitySet = list17;
        this.sharedTelnetConfigIdentitySet = list18;
        this.multiKeySet = list19;
        this.certificateSet = list20;
        this.packages = list21;
        this.deleteSet = deleteSet;
        this.lastSync = str;
    }

    public /* synthetic */ BulkModelFullData(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, DeleteSet deleteSet, String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? v.o() : list, (i10 & 2) != 0 ? v.o() : list2, (i10 & 4) != 0 ? v.o() : list3, (i10 & 8) != 0 ? v.o() : list4, (i10 & 16) != 0 ? v.o() : list5, (i10 & 32) != 0 ? v.o() : list6, (i10 & 64) != 0 ? v.o() : list7, (i10 & 128) != 0 ? v.o() : list8, (i10 & 256) != 0 ? v.o() : list9, (i10 & File.FLAG_O_TRUNC) != 0 ? v.o() : list10, (i10 & File.FLAG_O_APPEND) != 0 ? v.o() : list11, (i10 & 2048) != 0 ? v.o() : list12, (i10 & 4096) != 0 ? v.o() : list13, (i10 & 8192) != 0 ? v.o() : list14, (i10 & 16384) != 0 ? v.o() : list15, (i10 & 32768) != 0 ? v.o() : list16, (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? v.o() : list17, (i10 & 131072) != 0 ? v.o() : list18, (i10 & 262144) != 0 ? v.o() : list19, (i10 & 524288) != 0 ? v.o() : list20, (i10 & 1048576) != 0 ? v.o() : list21, (i10 & 2097152) != 0 ? new DeleteSet((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 2097151, (k) null) : deleteSet, (i10 & 4194304) != 0 ? null : str);
    }
}
