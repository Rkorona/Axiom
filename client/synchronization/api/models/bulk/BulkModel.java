package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.google.android.flexbox.FlexItem;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModel;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk$$serializer;
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
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulk;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk$$serializer;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class BulkModel {
    private static final n[] $childSerializers;
    private final List<CertificateBulk> certificates;
    private final List<ChainHostBulk> chainHosts;
    private final DeleteSet deleteSet;
    private final boolean fullDataSet;
    private final List<GroupBulk> groups;
    private final List<HostBulk> hosts;
    private final List<KnownHostBulk> knownHosts;
    private final String lastSync;
    private final List<MultiKeyBulk> multiKeys;
    private final List<PackageBulk> packages;
    private final List<RuleBulk> pfRules;
    private final List<ProxyBulk> proxies;
    private final List<SharedSshConfigIdentityBulk> sharedSshConfigIdentities;
    private final List<SharedTelnetConfigIdentityBulk> sharedTelnetConfigIdentities;
    private final List<SnippetBulk> snippetBulks;
    private final List<SnippetHostBulk> snippetHosts;
    private final List<SshConfigIdentityBulk> sshConfigIdentities;
    private final List<SshConfigBulk> sshConfigs;
    private final List<IdentityBulk> sshIdentities;
    private final List<SshKeyBulk> sshKeys;
    private final List<TagHostBulk> tagHosts;
    private final List<TagBulk> tags;
    private final List<TelnetConfigIdentityBulk> telnetConfigIdentities;
    private final List<TelnetConfigBulk> telnetConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return BulkModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{null, o.b(rVar, new a() { // from class: ym.a
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: ym.c
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: ym.e
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$1();
            }
        }), o.b(rVar, new a() { // from class: ym.f
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$2();
            }
        }), o.b(rVar, new a() { // from class: ym.g
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$3();
            }
        }), o.b(rVar, new a() { // from class: ym.h
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$4();
            }
        }), o.b(rVar, new a() { // from class: ym.i
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$5();
            }
        }), o.b(rVar, new a() { // from class: ym.j
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$6();
            }
        }), o.b(rVar, new a() { // from class: ym.k
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$7();
            }
        }), o.b(rVar, new a() { // from class: ym.m
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$8();
            }
        }), o.b(rVar, new a() { // from class: ym.l
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$9();
            }
        }), o.b(rVar, new a() { // from class: ym.n
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$10();
            }
        }), o.b(rVar, new a() { // from class: ym.o
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$11();
            }
        }), o.b(rVar, new a() { // from class: ym.p
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$12();
            }
        }), o.b(rVar, new a() { // from class: ym.q
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$13();
            }
        }), o.b(rVar, new a() { // from class: ym.r
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$14();
            }
        }), o.b(rVar, new a() { // from class: ym.s
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$15();
            }
        }), o.b(rVar, new a() { // from class: ym.t
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$16();
            }
        }), o.b(rVar, new a() { // from class: ym.u
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$17();
            }
        }), o.b(rVar, new a() { // from class: ym.b
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$18();
            }
        }), o.b(rVar, new a() { // from class: ym.d
            @Override // iu.a
            public final Object a() {
                return BulkModel._childSerializers$_anonymous_$19();
            }
        }), null, null};
    }

    public /* synthetic */ BulkModel(int i10, boolean z10, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, DeleteSet deleteSet, String str, s2 s2Var) {
        if (16777215 != (i10 & FlexItem.MAX_SIZE)) {
            d2.a(i10, FlexItem.MAX_SIZE, BulkModel$$serializer.INSTANCE.getDescriptor());
        }
        this.fullDataSet = z10;
        this.hosts = list;
        this.sshConfigs = list2;
        this.telnetConfigs = list3;
        this.proxies = list4;
        this.packages = list5;
        this.snippetBulks = list6;
        this.sshKeys = list7;
        this.certificates = list8;
        this.groups = list9;
        this.tags = list10;
        this.tagHosts = list11;
        this.snippetHosts = list12;
        this.chainHosts = list13;
        this.knownHosts = list14;
        this.pfRules = list15;
        this.sshIdentities = list16;
        this.sshConfigIdentities = list17;
        this.telnetConfigIdentities = list18;
        this.multiKeys = list19;
        this.sharedSshConfigIdentities = list20;
        this.sharedTelnetConfigIdentities = list21;
        this.deleteSet = deleteSet;
        this.lastSync = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(HostBulk.Companion.HostBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(SshConfigBulk.Companion.SshConfigBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$1() {
        return new f(TelnetConfigBulk.Companion.TelnetConfigBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$10() {
        return new f(SnippetHostBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$11() {
        return new f(ChainHostBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$12() {
        return new f(KnownHostBulk.Companion.KnownHostBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$13() {
        return new f(RuleBulk.Companion.RuleBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$14() {
        return new f(IdentityBulk.Companion.IdentityBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$15() {
        return new f(SshConfigIdentityBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$16() {
        return new f(TelnetConfigIdentityBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$17() {
        return new f(MultiKeyBulk.Companion.MultiKeyBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$18() {
        return new f(SharedSshConfigIdentityBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$19() {
        return new f(SharedTelnetConfigIdentityBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$2() {
        return new f(ProxyBulk.Companion.ProxyBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$3() {
        return new f(PackageBulk.Companion.PackageBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$4() {
        return new f(SnippetBulk.Companion.SnippetBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$5() {
        return new f(SshKeyBulk.Companion.SshKeyBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$6() {
        return new f(CertificateBulk.Companion.CertificateBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$7() {
        return new f(GroupBulk.Companion.GroupBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$8() {
        return new f(TagBulk.Companion.TagBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$9() {
        return new f(TagHostBulk$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkModel copy$default(BulkModel bulkModel, boolean z10, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, DeleteSet deleteSet, String str, int i10, Object obj) {
        String str2;
        DeleteSet deleteSet2;
        boolean z11 = (i10 & 1) != 0 ? bulkModel.fullDataSet : z10;
        List list22 = (i10 & 2) != 0 ? bulkModel.hosts : list;
        List list23 = (i10 & 4) != 0 ? bulkModel.sshConfigs : list2;
        List list24 = (i10 & 8) != 0 ? bulkModel.telnetConfigs : list3;
        List list25 = (i10 & 16) != 0 ? bulkModel.proxies : list4;
        List list26 = (i10 & 32) != 0 ? bulkModel.packages : list5;
        List list27 = (i10 & 64) != 0 ? bulkModel.snippetBulks : list6;
        List list28 = (i10 & 128) != 0 ? bulkModel.sshKeys : list7;
        List list29 = (i10 & 256) != 0 ? bulkModel.certificates : list8;
        List list30 = (i10 & File.FLAG_O_TRUNC) != 0 ? bulkModel.groups : list9;
        List list31 = (i10 & File.FLAG_O_APPEND) != 0 ? bulkModel.tags : list10;
        List list32 = (i10 & 2048) != 0 ? bulkModel.tagHosts : list11;
        List list33 = (i10 & 4096) != 0 ? bulkModel.snippetHosts : list12;
        List list34 = (i10 & 8192) != 0 ? bulkModel.chainHosts : list13;
        boolean z12 = z11;
        List list35 = (i10 & 16384) != 0 ? bulkModel.knownHosts : list14;
        List list36 = (i10 & 32768) != 0 ? bulkModel.pfRules : list15;
        List list37 = (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? bulkModel.sshIdentities : list16;
        List list38 = (i10 & 131072) != 0 ? bulkModel.sshConfigIdentities : list17;
        List list39 = (i10 & 262144) != 0 ? bulkModel.telnetConfigIdentities : list18;
        List list40 = (i10 & 524288) != 0 ? bulkModel.multiKeys : list19;
        List list41 = (i10 & 1048576) != 0 ? bulkModel.sharedSshConfigIdentities : list20;
        List list42 = (i10 & 2097152) != 0 ? bulkModel.sharedTelnetConfigIdentities : list21;
        DeleteSet deleteSet3 = (i10 & 4194304) != 0 ? bulkModel.deleteSet : deleteSet;
        if ((i10 & 8388608) != 0) {
            deleteSet2 = deleteSet3;
            str2 = bulkModel.lastSync;
        } else {
            str2 = str;
            deleteSet2 = deleteSet3;
        }
        return bulkModel.copy(z12, list22, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list38, list39, list40, list41, list42, deleteSet2, str2);
    }

    @hv.o(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)
    public static /* synthetic */ void getCertificates$annotations() {
    }

    @hv.o("hostchain_set")
    public static /* synthetic */ void getChainHosts$annotations() {
    }

    @hv.o("delete_sets")
    public static /* synthetic */ void getDeleteSet$annotations() {
    }

    @hv.o("full_dataset")
    public static /* synthetic */ void getFullDataSet$annotations() {
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

    @hv.o("last_synced")
    public static /* synthetic */ void getLastSync$annotations() {
    }

    @hv.o("multikey_set")
    public static /* synthetic */ void getMultiKeys$annotations() {
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
    public static /* synthetic */ void getSharedSshConfigIdentities$annotations() {
    }

    @hv.o("sharedtelnetconfigidentity_set")
    public static /* synthetic */ void getSharedTelnetConfigIdentities$annotations() {
    }

    @hv.o(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME)
    public static /* synthetic */ void getSnippetBulks$annotations() {
    }

    @hv.o("hostsnippet_set")
    public static /* synthetic */ void getSnippetHosts$annotations() {
    }

    @hv.o("sshconfigidentity_set")
    public static /* synthetic */ void getSshConfigIdentities$annotations() {
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
    public static /* synthetic */ void getTelnetConfigIdentities$annotations() {
    }

    @hv.o("telnetconfig_set")
    public static /* synthetic */ void getTelnetConfigs$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(BulkModel bulkModel, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.u(fVar, 0, bulkModel.fullDataSet);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), bulkModel.hosts);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), bulkModel.sshConfigs);
        dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), bulkModel.telnetConfigs);
        dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), bulkModel.proxies);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), bulkModel.packages);
        dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), bulkModel.snippetBulks);
        dVar.o(fVar, 7, (hv.r) nVarArr[7].getValue(), bulkModel.sshKeys);
        dVar.o(fVar, 8, (hv.r) nVarArr[8].getValue(), bulkModel.certificates);
        dVar.o(fVar, 9, (hv.r) nVarArr[9].getValue(), bulkModel.groups);
        dVar.o(fVar, 10, (hv.r) nVarArr[10].getValue(), bulkModel.tags);
        dVar.o(fVar, 11, (hv.r) nVarArr[11].getValue(), bulkModel.tagHosts);
        dVar.o(fVar, 12, (hv.r) nVarArr[12].getValue(), bulkModel.snippetHosts);
        dVar.o(fVar, 13, (hv.r) nVarArr[13].getValue(), bulkModel.chainHosts);
        dVar.o(fVar, 14, (hv.r) nVarArr[14].getValue(), bulkModel.knownHosts);
        dVar.o(fVar, 15, (hv.r) nVarArr[15].getValue(), bulkModel.pfRules);
        dVar.o(fVar, 16, (hv.r) nVarArr[16].getValue(), bulkModel.sshIdentities);
        dVar.o(fVar, 17, (hv.r) nVarArr[17].getValue(), bulkModel.sshConfigIdentities);
        dVar.o(fVar, 18, (hv.r) nVarArr[18].getValue(), bulkModel.telnetConfigIdentities);
        dVar.o(fVar, 19, (hv.r) nVarArr[19].getValue(), bulkModel.multiKeys);
        dVar.o(fVar, 20, (hv.r) nVarArr[20].getValue(), bulkModel.sharedSshConfigIdentities);
        dVar.o(fVar, 21, (hv.r) nVarArr[21].getValue(), bulkModel.sharedTelnetConfigIdentities);
        dVar.o(fVar, 22, DeleteSet$$serializer.INSTANCE, bulkModel.deleteSet);
        dVar.f(fVar, 23, bulkModel.lastSync);
    }

    public final boolean component1() {
        return this.fullDataSet;
    }

    public final List<GroupBulk> component10() {
        return this.groups;
    }

    public final List<TagBulk> component11() {
        return this.tags;
    }

    public final List<TagHostBulk> component12() {
        return this.tagHosts;
    }

    public final List<SnippetHostBulk> component13() {
        return this.snippetHosts;
    }

    public final List<ChainHostBulk> component14() {
        return this.chainHosts;
    }

    public final List<KnownHostBulk> component15() {
        return this.knownHosts;
    }

    public final List<RuleBulk> component16() {
        return this.pfRules;
    }

    public final List<IdentityBulk> component17() {
        return this.sshIdentities;
    }

    public final List<SshConfigIdentityBulk> component18() {
        return this.sshConfigIdentities;
    }

    public final List<TelnetConfigIdentityBulk> component19() {
        return this.telnetConfigIdentities;
    }

    public final List<HostBulk> component2() {
        return this.hosts;
    }

    public final List<MultiKeyBulk> component20() {
        return this.multiKeys;
    }

    public final List<SharedSshConfigIdentityBulk> component21() {
        return this.sharedSshConfigIdentities;
    }

    public final List<SharedTelnetConfigIdentityBulk> component22() {
        return this.sharedTelnetConfigIdentities;
    }

    public final DeleteSet component23() {
        return this.deleteSet;
    }

    public final String component24() {
        return this.lastSync;
    }

    public final List<SshConfigBulk> component3() {
        return this.sshConfigs;
    }

    public final List<TelnetConfigBulk> component4() {
        return this.telnetConfigs;
    }

    public final List<ProxyBulk> component5() {
        return this.proxies;
    }

    public final List<PackageBulk> component6() {
        return this.packages;
    }

    public final List<SnippetBulk> component7() {
        return this.snippetBulks;
    }

    public final List<SshKeyBulk> component8() {
        return this.sshKeys;
    }

    public final List<CertificateBulk> component9() {
        return this.certificates;
    }

    public final BulkModel copy(boolean z10, List<? extends HostBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, List<? extends ProxyBulk> list4, List<? extends PackageBulk> list5, List<? extends SnippetBulk> list6, List<? extends SshKeyBulk> list7, List<? extends CertificateBulk> list8, List<? extends GroupBulk> list9, List<? extends TagBulk> list10, List<TagHostBulk> list11, List<SnippetHostBulk> list12, List<ChainHostBulk> list13, List<? extends KnownHostBulk> list14, List<? extends RuleBulk> list15, List<? extends IdentityBulk> list16, List<SshConfigIdentityBulk> list17, List<TelnetConfigIdentityBulk> list18, List<? extends MultiKeyBulk> list19, List<SharedSshConfigIdentityBulk> list20, List<SharedTelnetConfigIdentityBulk> list21, DeleteSet deleteSet, String str) {
        t.f(list, Table.HOSTS);
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, "proxies");
        t.f(list5, "packages");
        t.f(list6, "snippetBulks");
        t.f(list7, "sshKeys");
        t.f(list8, "certificates");
        t.f(list9, "groups");
        t.f(list10, Table.TAG);
        t.f(list11, "tagHosts");
        t.f(list12, "snippetHosts");
        t.f(list13, "chainHosts");
        t.f(list14, "knownHosts");
        t.f(list15, "pfRules");
        t.f(list16, "sshIdentities");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        t.f(list19, "multiKeys");
        t.f(list20, "sharedSshConfigIdentities");
        t.f(list21, "sharedTelnetConfigIdentities");
        t.f(deleteSet, "deleteSet");
        t.f(str, "lastSync");
        return new BulkModel(z10, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, deleteSet, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkModel)) {
            return false;
        }
        BulkModel bulkModel = (BulkModel) obj;
        return this.fullDataSet == bulkModel.fullDataSet && t.b(this.hosts, bulkModel.hosts) && t.b(this.sshConfigs, bulkModel.sshConfigs) && t.b(this.telnetConfigs, bulkModel.telnetConfigs) && t.b(this.proxies, bulkModel.proxies) && t.b(this.packages, bulkModel.packages) && t.b(this.snippetBulks, bulkModel.snippetBulks) && t.b(this.sshKeys, bulkModel.sshKeys) && t.b(this.certificates, bulkModel.certificates) && t.b(this.groups, bulkModel.groups) && t.b(this.tags, bulkModel.tags) && t.b(this.tagHosts, bulkModel.tagHosts) && t.b(this.snippetHosts, bulkModel.snippetHosts) && t.b(this.chainHosts, bulkModel.chainHosts) && t.b(this.knownHosts, bulkModel.knownHosts) && t.b(this.pfRules, bulkModel.pfRules) && t.b(this.sshIdentities, bulkModel.sshIdentities) && t.b(this.sshConfigIdentities, bulkModel.sshConfigIdentities) && t.b(this.telnetConfigIdentities, bulkModel.telnetConfigIdentities) && t.b(this.multiKeys, bulkModel.multiKeys) && t.b(this.sharedSshConfigIdentities, bulkModel.sharedSshConfigIdentities) && t.b(this.sharedTelnetConfigIdentities, bulkModel.sharedTelnetConfigIdentities) && t.b(this.deleteSet, bulkModel.deleteSet) && t.b(this.lastSync, bulkModel.lastSync);
    }

    public final List<CertificateBulk> getCertificates() {
        return this.certificates;
    }

    public final List<ChainHostBulk> getChainHosts() {
        return this.chainHosts;
    }

    public final DeleteSet getDeleteSet() {
        return this.deleteSet;
    }

    public final boolean getFullDataSet() {
        return this.fullDataSet;
    }

    public final List<GroupBulk> getGroups() {
        return this.groups;
    }

    public final List<HostBulk> getHosts() {
        return this.hosts;
    }

    public final List<KnownHostBulk> getKnownHosts() {
        return this.knownHosts;
    }

    public final String getLastSync() {
        return this.lastSync;
    }

    public final List<MultiKeyBulk> getMultiKeys() {
        return this.multiKeys;
    }

    public final List<PackageBulk> getPackages() {
        return this.packages;
    }

    public final List<RuleBulk> getPfRules() {
        return this.pfRules;
    }

    public final List<ProxyBulk> getProxies() {
        return this.proxies;
    }

    public final List<SharedSshConfigIdentityBulk> getSharedSshConfigIdentities() {
        return this.sharedSshConfigIdentities;
    }

    public final List<SharedTelnetConfigIdentityBulk> getSharedTelnetConfigIdentities() {
        return this.sharedTelnetConfigIdentities;
    }

    public final List<SnippetBulk> getSnippetBulks() {
        return this.snippetBulks;
    }

    public final List<SnippetHostBulk> getSnippetHosts() {
        return this.snippetHosts;
    }

    public final List<SshConfigIdentityBulk> getSshConfigIdentities() {
        return this.sshConfigIdentities;
    }

    public final List<SshConfigBulk> getSshConfigs() {
        return this.sshConfigs;
    }

    public final List<IdentityBulk> getSshIdentities() {
        return this.sshIdentities;
    }

    public final List<SshKeyBulk> getSshKeys() {
        return this.sshKeys;
    }

    public final List<TagHostBulk> getTagHosts() {
        return this.tagHosts;
    }

    public final List<TagBulk> getTags() {
        return this.tags;
    }

    public final List<TelnetConfigIdentityBulk> getTelnetConfigIdentities() {
        return this.telnetConfigIdentities;
    }

    public final List<TelnetConfigBulk> getTelnetConfigs() {
        return this.telnetConfigs;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.fullDataSet) * 31) + this.hosts.hashCode()) * 31) + this.sshConfigs.hashCode()) * 31) + this.telnetConfigs.hashCode()) * 31) + this.proxies.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.snippetBulks.hashCode()) * 31) + this.sshKeys.hashCode()) * 31) + this.certificates.hashCode()) * 31) + this.groups.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.tagHosts.hashCode()) * 31) + this.snippetHosts.hashCode()) * 31) + this.chainHosts.hashCode()) * 31) + this.knownHosts.hashCode()) * 31) + this.pfRules.hashCode()) * 31) + this.sshIdentities.hashCode()) * 31) + this.sshConfigIdentities.hashCode()) * 31) + this.telnetConfigIdentities.hashCode()) * 31) + this.multiKeys.hashCode()) * 31) + this.sharedSshConfigIdentities.hashCode()) * 31) + this.sharedTelnetConfigIdentities.hashCode()) * 31) + this.deleteSet.hashCode()) * 31) + this.lastSync.hashCode();
    }

    public String toString() {
        return "BulkModel(fullDataSet=" + this.fullDataSet + ", hosts=" + this.hosts + ", sshConfigs=" + this.sshConfigs + ", telnetConfigs=" + this.telnetConfigs + ", proxies=" + this.proxies + ", packages=" + this.packages + ", snippetBulks=" + this.snippetBulks + ", sshKeys=" + this.sshKeys + ", certificates=" + this.certificates + ", groups=" + this.groups + ", tags=" + this.tags + ", tagHosts=" + this.tagHosts + ", snippetHosts=" + this.snippetHosts + ", chainHosts=" + this.chainHosts + ", knownHosts=" + this.knownHosts + ", pfRules=" + this.pfRules + ", sshIdentities=" + this.sshIdentities + ", sshConfigIdentities=" + this.sshConfigIdentities + ", telnetConfigIdentities=" + this.telnetConfigIdentities + ", multiKeys=" + this.multiKeys + ", sharedSshConfigIdentities=" + this.sharedSshConfigIdentities + ", sharedTelnetConfigIdentities=" + this.sharedTelnetConfigIdentities + ", deleteSet=" + this.deleteSet + ", lastSync=" + this.lastSync + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulkModel(boolean z10, List<? extends HostBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, List<? extends ProxyBulk> list4, List<? extends PackageBulk> list5, List<? extends SnippetBulk> list6, List<? extends SshKeyBulk> list7, List<? extends CertificateBulk> list8, List<? extends GroupBulk> list9, List<? extends TagBulk> list10, List<TagHostBulk> list11, List<SnippetHostBulk> list12, List<ChainHostBulk> list13, List<? extends KnownHostBulk> list14, List<? extends RuleBulk> list15, List<? extends IdentityBulk> list16, List<SshConfigIdentityBulk> list17, List<TelnetConfigIdentityBulk> list18, List<? extends MultiKeyBulk> list19, List<SharedSshConfigIdentityBulk> list20, List<SharedTelnetConfigIdentityBulk> list21, DeleteSet deleteSet, String str) {
        t.f(list, Table.HOSTS);
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, "proxies");
        t.f(list5, "packages");
        t.f(list6, "snippetBulks");
        t.f(list7, "sshKeys");
        t.f(list8, "certificates");
        t.f(list9, "groups");
        t.f(list10, Table.TAG);
        t.f(list11, "tagHosts");
        t.f(list12, "snippetHosts");
        t.f(list13, "chainHosts");
        t.f(list14, "knownHosts");
        t.f(list15, "pfRules");
        t.f(list16, "sshIdentities");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        t.f(list19, "multiKeys");
        t.f(list20, "sharedSshConfigIdentities");
        t.f(list21, "sharedTelnetConfigIdentities");
        t.f(deleteSet, "deleteSet");
        t.f(str, "lastSync");
        this.fullDataSet = z10;
        this.hosts = list;
        this.sshConfigs = list2;
        this.telnetConfigs = list3;
        this.proxies = list4;
        this.packages = list5;
        this.snippetBulks = list6;
        this.sshKeys = list7;
        this.certificates = list8;
        this.groups = list9;
        this.tags = list10;
        this.tagHosts = list11;
        this.snippetHosts = list12;
        this.chainHosts = list13;
        this.knownHosts = list14;
        this.pfRules = list15;
        this.sshIdentities = list16;
        this.sshConfigIdentities = list17;
        this.telnetConfigIdentities = list18;
        this.multiKeys = list19;
        this.sharedSshConfigIdentities = list20;
        this.sharedTelnetConfigIdentities = list21;
        this.deleteSet = deleteSet;
        this.lastSync = str;
    }
}
