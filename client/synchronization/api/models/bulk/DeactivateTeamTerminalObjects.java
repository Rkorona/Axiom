package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeactivateTeamTerminalObjects;
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
public final class DeactivateTeamTerminalObjects {
    private static final n[] $childSerializers;
    private List<? extends CertificateBulk> certificates;
    private List<ChainHostBulk> chainHosts;
    private List<? extends GroupBulk> groups;
    private List<? extends HostBulk> hosts;
    private List<? extends KnownHostBulk> knownHosts;
    private List<? extends SnippetBulk> mSnippetBulks;
    private List<? extends PackageBulk> packages;
    private List<? extends RuleBulk> pfRules;
    private List<? extends ProxyBulk> proxies;
    private List<SnippetHostBulk> snippetHosts;
    private List<SshConfigIdentityBulk> sshConfigIdentities;
    private List<? extends SshConfigBulk> sshConfigs;
    private List<? extends IdentityBulk> sshIdentities;
    private List<? extends SshKeyBulk> sshKeys;
    private List<TagHostBulk> tagHosts;
    private List<? extends TagBulk> tags;
    private List<TelnetConfigIdentityBulk> telnetConfigIdentities;
    private List<? extends TelnetConfigBulk> telnetConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DeactivateTeamTerminalObjects$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: ym.q0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: ym.h1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: ym.r0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$1();
            }
        }), o.b(rVar, new a() { // from class: ym.s0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$2();
            }
        }), o.b(rVar, new a() { // from class: ym.t0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$3();
            }
        }), o.b(rVar, new a() { // from class: ym.u0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$4();
            }
        }), o.b(rVar, new a() { // from class: ym.v0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$5();
            }
        }), o.b(rVar, new a() { // from class: ym.w0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$6();
            }
        }), o.b(rVar, new a() { // from class: ym.x0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$7();
            }
        }), o.b(rVar, new a() { // from class: ym.y0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$8();
            }
        }), o.b(rVar, new a() { // from class: ym.z0
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$9();
            }
        }), o.b(rVar, new a() { // from class: ym.a1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$10();
            }
        }), o.b(rVar, new a() { // from class: ym.b1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$11();
            }
        }), o.b(rVar, new a() { // from class: ym.c1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$12();
            }
        }), o.b(rVar, new a() { // from class: ym.d1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$13();
            }
        }), o.b(rVar, new a() { // from class: ym.e1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$14();
            }
        }), o.b(rVar, new a() { // from class: ym.f1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$15();
            }
        }), o.b(rVar, new a() { // from class: ym.g1
            @Override // iu.a
            public final Object a() {
                return DeactivateTeamTerminalObjects._childSerializers$_anonymous_$16();
            }
        })};
    }

    public /* synthetic */ DeactivateTeamTerminalObjects(int i10, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, s2 s2Var) {
        if (262143 != (i10 & 262143)) {
            d2.a(i10, 262143, DeactivateTeamTerminalObjects$$serializer.INSTANCE.getDescriptor());
        }
        this.groups = list;
        this.sshConfigs = list2;
        this.telnetConfigs = list3;
        this.hosts = list4;
        this.sshIdentities = list5;
        this.pfRules = list6;
        this.tags = list7;
        this.tagHosts = list8;
        this.snippetHosts = list9;
        this.proxies = list10;
        this.packages = list11;
        this.mSnippetBulks = list12;
        this.knownHosts = list13;
        this.chainHosts = list14;
        this.sshKeys = list15;
        this.certificates = list16;
        this.sshConfigIdentities = list17;
        this.telnetConfigIdentities = list18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(GroupBulk.Companion.GroupBulkSerializer.INSTANCE);
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
        return new f(SnippetBulk.Companion.SnippetBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$11() {
        return new f(KnownHostBulk.Companion.KnownHostBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$12() {
        return new f(ChainHostBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$13() {
        return new f(SshKeyBulk.Companion.SshKeyBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$14() {
        return new f(CertificateBulk.Companion.CertificateBulkSerializer.INSTANCE);
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
    public static final /* synthetic */ c _childSerializers$_anonymous_$2() {
        return new f(HostBulk.Companion.HostBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$3() {
        return new f(IdentityBulk.Companion.IdentityBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$4() {
        return new f(RuleBulk.Companion.RuleBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$5() {
        return new f(TagBulk.Companion.TagBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$6() {
        return new f(TagHostBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$7() {
        return new f(SnippetHostBulk$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$8() {
        return new f(ProxyBulk.Companion.ProxyBulkSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$9() {
        return new f(PackageBulk.Companion.PackageBulkSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeactivateTeamTerminalObjects copy$default(DeactivateTeamTerminalObjects deactivateTeamTerminalObjects, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, int i10, Object obj) {
        List list19;
        List list20;
        List list21 = (i10 & 1) != 0 ? deactivateTeamTerminalObjects.groups : list;
        List list22 = (i10 & 2) != 0 ? deactivateTeamTerminalObjects.sshConfigs : list2;
        List list23 = (i10 & 4) != 0 ? deactivateTeamTerminalObjects.telnetConfigs : list3;
        List list24 = (i10 & 8) != 0 ? deactivateTeamTerminalObjects.hosts : list4;
        List list25 = (i10 & 16) != 0 ? deactivateTeamTerminalObjects.sshIdentities : list5;
        List list26 = (i10 & 32) != 0 ? deactivateTeamTerminalObjects.pfRules : list6;
        List list27 = (i10 & 64) != 0 ? deactivateTeamTerminalObjects.tags : list7;
        List list28 = (i10 & 128) != 0 ? deactivateTeamTerminalObjects.tagHosts : list8;
        List list29 = (i10 & 256) != 0 ? deactivateTeamTerminalObjects.snippetHosts : list9;
        List list30 = (i10 & File.FLAG_O_TRUNC) != 0 ? deactivateTeamTerminalObjects.proxies : list10;
        List list31 = (i10 & File.FLAG_O_APPEND) != 0 ? deactivateTeamTerminalObjects.packages : list11;
        List list32 = (i10 & 2048) != 0 ? deactivateTeamTerminalObjects.mSnippetBulks : list12;
        List list33 = (i10 & 4096) != 0 ? deactivateTeamTerminalObjects.knownHosts : list13;
        List list34 = (i10 & 8192) != 0 ? deactivateTeamTerminalObjects.chainHosts : list14;
        List list35 = list21;
        List list36 = (i10 & 16384) != 0 ? deactivateTeamTerminalObjects.sshKeys : list15;
        List list37 = (i10 & 32768) != 0 ? deactivateTeamTerminalObjects.certificates : list16;
        List list38 = (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? deactivateTeamTerminalObjects.sshConfigIdentities : list17;
        if ((i10 & 131072) != 0) {
            list20 = list38;
            list19 = deactivateTeamTerminalObjects.telnetConfigIdentities;
        } else {
            list19 = list18;
            list20 = list38;
        }
        return deactivateTeamTerminalObjects.copy(list35, list22, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list36, list37, list20, list19);
    }

    @hv.o(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)
    public static /* synthetic */ void getCertificates$annotations() {
    }

    @hv.o("hostchain_set")
    public static /* synthetic */ void getChainHosts$annotations() {
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

    @hv.o(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME)
    public static /* synthetic */ void getMSnippetBulks$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DeactivateTeamTerminalObjects deactivateTeamTerminalObjects, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), deactivateTeamTerminalObjects.groups);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), deactivateTeamTerminalObjects.sshConfigs);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), deactivateTeamTerminalObjects.telnetConfigs);
        dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), deactivateTeamTerminalObjects.hosts);
        dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), deactivateTeamTerminalObjects.sshIdentities);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), deactivateTeamTerminalObjects.pfRules);
        dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), deactivateTeamTerminalObjects.tags);
        dVar.o(fVar, 7, (hv.r) nVarArr[7].getValue(), deactivateTeamTerminalObjects.tagHosts);
        dVar.o(fVar, 8, (hv.r) nVarArr[8].getValue(), deactivateTeamTerminalObjects.snippetHosts);
        dVar.o(fVar, 9, (hv.r) nVarArr[9].getValue(), deactivateTeamTerminalObjects.proxies);
        dVar.o(fVar, 10, (hv.r) nVarArr[10].getValue(), deactivateTeamTerminalObjects.packages);
        dVar.o(fVar, 11, (hv.r) nVarArr[11].getValue(), deactivateTeamTerminalObjects.mSnippetBulks);
        dVar.o(fVar, 12, (hv.r) nVarArr[12].getValue(), deactivateTeamTerminalObjects.knownHosts);
        dVar.o(fVar, 13, (hv.r) nVarArr[13].getValue(), deactivateTeamTerminalObjects.chainHosts);
        dVar.o(fVar, 14, (hv.r) nVarArr[14].getValue(), deactivateTeamTerminalObjects.sshKeys);
        dVar.o(fVar, 15, (hv.r) nVarArr[15].getValue(), deactivateTeamTerminalObjects.certificates);
        dVar.o(fVar, 16, (hv.r) nVarArr[16].getValue(), deactivateTeamTerminalObjects.sshConfigIdentities);
        dVar.o(fVar, 17, (hv.r) nVarArr[17].getValue(), deactivateTeamTerminalObjects.telnetConfigIdentities);
    }

    public final List<GroupBulk> component1() {
        return this.groups;
    }

    public final List<ProxyBulk> component10() {
        return this.proxies;
    }

    public final List<PackageBulk> component11() {
        return this.packages;
    }

    public final List<SnippetBulk> component12() {
        return this.mSnippetBulks;
    }

    public final List<KnownHostBulk> component13() {
        return this.knownHosts;
    }

    public final List<ChainHostBulk> component14() {
        return this.chainHosts;
    }

    public final List<SshKeyBulk> component15() {
        return this.sshKeys;
    }

    public final List<CertificateBulk> component16() {
        return this.certificates;
    }

    public final List<SshConfigIdentityBulk> component17() {
        return this.sshConfigIdentities;
    }

    public final List<TelnetConfigIdentityBulk> component18() {
        return this.telnetConfigIdentities;
    }

    public final List<SshConfigBulk> component2() {
        return this.sshConfigs;
    }

    public final List<TelnetConfigBulk> component3() {
        return this.telnetConfigs;
    }

    public final List<HostBulk> component4() {
        return this.hosts;
    }

    public final List<IdentityBulk> component5() {
        return this.sshIdentities;
    }

    public final List<RuleBulk> component6() {
        return this.pfRules;
    }

    public final List<TagBulk> component7() {
        return this.tags;
    }

    public final List<TagHostBulk> component8() {
        return this.tagHosts;
    }

    public final List<SnippetHostBulk> component9() {
        return this.snippetHosts;
    }

    public final DeactivateTeamTerminalObjects copy(List<? extends GroupBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, List<? extends HostBulk> list4, List<? extends IdentityBulk> list5, List<? extends RuleBulk> list6, List<? extends TagBulk> list7, List<TagHostBulk> list8, List<SnippetHostBulk> list9, List<? extends ProxyBulk> list10, List<? extends PackageBulk> list11, List<? extends SnippetBulk> list12, List<? extends KnownHostBulk> list13, List<ChainHostBulk> list14, List<? extends SshKeyBulk> list15, List<? extends CertificateBulk> list16, List<SshConfigIdentityBulk> list17, List<TelnetConfigIdentityBulk> list18) {
        t.f(list, "groups");
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, Table.HOSTS);
        t.f(list5, "sshIdentities");
        t.f(list6, "pfRules");
        t.f(list7, Table.TAG);
        t.f(list8, "tagHosts");
        t.f(list9, "snippetHosts");
        t.f(list10, "proxies");
        t.f(list11, "packages");
        t.f(list12, "mSnippetBulks");
        t.f(list13, "knownHosts");
        t.f(list14, "chainHosts");
        t.f(list15, "sshKeys");
        t.f(list16, "certificates");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        return new DeactivateTeamTerminalObjects(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeactivateTeamTerminalObjects)) {
            return false;
        }
        DeactivateTeamTerminalObjects deactivateTeamTerminalObjects = (DeactivateTeamTerminalObjects) obj;
        return t.b(this.groups, deactivateTeamTerminalObjects.groups) && t.b(this.sshConfigs, deactivateTeamTerminalObjects.sshConfigs) && t.b(this.telnetConfigs, deactivateTeamTerminalObjects.telnetConfigs) && t.b(this.hosts, deactivateTeamTerminalObjects.hosts) && t.b(this.sshIdentities, deactivateTeamTerminalObjects.sshIdentities) && t.b(this.pfRules, deactivateTeamTerminalObjects.pfRules) && t.b(this.tags, deactivateTeamTerminalObjects.tags) && t.b(this.tagHosts, deactivateTeamTerminalObjects.tagHosts) && t.b(this.snippetHosts, deactivateTeamTerminalObjects.snippetHosts) && t.b(this.proxies, deactivateTeamTerminalObjects.proxies) && t.b(this.packages, deactivateTeamTerminalObjects.packages) && t.b(this.mSnippetBulks, deactivateTeamTerminalObjects.mSnippetBulks) && t.b(this.knownHosts, deactivateTeamTerminalObjects.knownHosts) && t.b(this.chainHosts, deactivateTeamTerminalObjects.chainHosts) && t.b(this.sshKeys, deactivateTeamTerminalObjects.sshKeys) && t.b(this.certificates, deactivateTeamTerminalObjects.certificates) && t.b(this.sshConfigIdentities, deactivateTeamTerminalObjects.sshConfigIdentities) && t.b(this.telnetConfigIdentities, deactivateTeamTerminalObjects.telnetConfigIdentities);
    }

    public final List<CertificateBulk> getCertificates() {
        return this.certificates;
    }

    public final List<ChainHostBulk> getChainHosts() {
        return this.chainHosts;
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

    public final List<SnippetBulk> getMSnippetBulks() {
        return this.mSnippetBulks;
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
        return (((((((((((((((((((((((((((((((((this.groups.hashCode() * 31) + this.sshConfigs.hashCode()) * 31) + this.telnetConfigs.hashCode()) * 31) + this.hosts.hashCode()) * 31) + this.sshIdentities.hashCode()) * 31) + this.pfRules.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.tagHosts.hashCode()) * 31) + this.snippetHosts.hashCode()) * 31) + this.proxies.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.mSnippetBulks.hashCode()) * 31) + this.knownHosts.hashCode()) * 31) + this.chainHosts.hashCode()) * 31) + this.sshKeys.hashCode()) * 31) + this.certificates.hashCode()) * 31) + this.sshConfigIdentities.hashCode()) * 31) + this.telnetConfigIdentities.hashCode();
    }

    public final void setCertificates(List<? extends CertificateBulk> list) {
        t.f(list, "<set-?>");
        this.certificates = list;
    }

    public final void setChainHosts(List<ChainHostBulk> list) {
        t.f(list, "<set-?>");
        this.chainHosts = list;
    }

    public final void setGroups(List<? extends GroupBulk> list) {
        t.f(list, "<set-?>");
        this.groups = list;
    }

    public final void setHosts(List<? extends HostBulk> list) {
        t.f(list, "<set-?>");
        this.hosts = list;
    }

    public final void setKnownHosts(List<? extends KnownHostBulk> list) {
        t.f(list, "<set-?>");
        this.knownHosts = list;
    }

    public final void setMSnippetBulks(List<? extends SnippetBulk> list) {
        t.f(list, "<set-?>");
        this.mSnippetBulks = list;
    }

    public final void setPackages(List<? extends PackageBulk> list) {
        t.f(list, "<set-?>");
        this.packages = list;
    }

    public final void setPfRules(List<? extends RuleBulk> list) {
        t.f(list, "<set-?>");
        this.pfRules = list;
    }

    public final void setProxies(List<? extends ProxyBulk> list) {
        t.f(list, "<set-?>");
        this.proxies = list;
    }

    public final void setSnippetHosts(List<SnippetHostBulk> list) {
        t.f(list, "<set-?>");
        this.snippetHosts = list;
    }

    public final void setSshConfigIdentities(List<SshConfigIdentityBulk> list) {
        t.f(list, "<set-?>");
        this.sshConfigIdentities = list;
    }

    public final void setSshConfigs(List<? extends SshConfigBulk> list) {
        t.f(list, "<set-?>");
        this.sshConfigs = list;
    }

    public final void setSshIdentities(List<? extends IdentityBulk> list) {
        t.f(list, "<set-?>");
        this.sshIdentities = list;
    }

    public final void setSshKeys(List<? extends SshKeyBulk> list) {
        t.f(list, "<set-?>");
        this.sshKeys = list;
    }

    public final void setTagHosts(List<TagHostBulk> list) {
        t.f(list, "<set-?>");
        this.tagHosts = list;
    }

    public final void setTags(List<? extends TagBulk> list) {
        t.f(list, "<set-?>");
        this.tags = list;
    }

    public final void setTelnetConfigIdentities(List<TelnetConfigIdentityBulk> list) {
        t.f(list, "<set-?>");
        this.telnetConfigIdentities = list;
    }

    public final void setTelnetConfigs(List<? extends TelnetConfigBulk> list) {
        t.f(list, "<set-?>");
        this.telnetConfigs = list;
    }

    public String toString() {
        return "DeactivateTeamTerminalObjects(groups=" + this.groups + ", sshConfigs=" + this.sshConfigs + ", telnetConfigs=" + this.telnetConfigs + ", hosts=" + this.hosts + ", sshIdentities=" + this.sshIdentities + ", pfRules=" + this.pfRules + ", tags=" + this.tags + ", tagHosts=" + this.tagHosts + ", snippetHosts=" + this.snippetHosts + ", proxies=" + this.proxies + ", packages=" + this.packages + ", mSnippetBulks=" + this.mSnippetBulks + ", knownHosts=" + this.knownHosts + ", chainHosts=" + this.chainHosts + ", sshKeys=" + this.sshKeys + ", certificates=" + this.certificates + ", sshConfigIdentities=" + this.sshConfigIdentities + ", telnetConfigIdentities=" + this.telnetConfigIdentities + ")";
    }

    public DeactivateTeamTerminalObjects(List<? extends GroupBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, List<? extends HostBulk> list4, List<? extends IdentityBulk> list5, List<? extends RuleBulk> list6, List<? extends TagBulk> list7, List<TagHostBulk> list8, List<SnippetHostBulk> list9, List<? extends ProxyBulk> list10, List<? extends PackageBulk> list11, List<? extends SnippetBulk> list12, List<? extends KnownHostBulk> list13, List<ChainHostBulk> list14, List<? extends SshKeyBulk> list15, List<? extends CertificateBulk> list16, List<SshConfigIdentityBulk> list17, List<TelnetConfigIdentityBulk> list18) {
        t.f(list, "groups");
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, Table.HOSTS);
        t.f(list5, "sshIdentities");
        t.f(list6, "pfRules");
        t.f(list7, Table.TAG);
        t.f(list8, "tagHosts");
        t.f(list9, "snippetHosts");
        t.f(list10, "proxies");
        t.f(list11, "packages");
        t.f(list12, "mSnippetBulks");
        t.f(list13, "knownHosts");
        t.f(list14, "chainHosts");
        t.f(list15, "sshKeys");
        t.f(list16, "certificates");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        this.groups = list;
        this.sshConfigs = list2;
        this.telnetConfigs = list3;
        this.hosts = list4;
        this.sshIdentities = list5;
        this.pfRules = list6;
        this.tags = list7;
        this.tagHosts = list8;
        this.snippetHosts = list9;
        this.proxies = list10;
        this.packages = list11;
        this.mSnippetBulks = list12;
        this.knownHosts = list13;
        this.chainHosts = list14;
        this.sshKeys = list15;
        this.certificates = list16;
        this.sshConfigIdentities = list17;
        this.telnetConfigIdentities = list18;
    }
}
