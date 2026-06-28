package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
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
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.f;
import lv.h1;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DeleteSet {
    private static final n[] $childSerializers;
    private final List<Long> certificates;
    private final List<Long> groups;
    private final List<Long> hostChains;
    private final List<Long> hosts;
    private final List<Long> identities;
    private final List<Long> knownHosts;
    private final List<Long> multiKeys;
    private final List<Long> packages;
    private final List<Long> pfRules;
    private final List<Long> proxies;
    private final List<Long> sharedSshConfigIdentities;
    private final List<Long> sharedTelnetConfigIdentities;
    private final List<Long> snippetHosts;
    private final List<Long> snippets;
    private final List<Long> sshConfigIdentities;
    private final List<Long> sshConfigs;
    private final List<Long> sshKeys;
    private final List<Long> tagHosts;
    private final List<Long> tags;
    private final List<Long> telnetConfigIdentities;
    private final List<Long> telnetConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DeleteSet$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: ym.i1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: ym.k1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: ym.m1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$1();
            }
        }), o.b(rVar, new a() { // from class: ym.n1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$2();
            }
        }), o.b(rVar, new a() { // from class: ym.o1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$3();
            }
        }), o.b(rVar, new a() { // from class: ym.p1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$4();
            }
        }), o.b(rVar, new a() { // from class: ym.q1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$5();
            }
        }), o.b(rVar, new a() { // from class: ym.r1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$6();
            }
        }), o.b(rVar, new a() { // from class: ym.s1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$7();
            }
        }), o.b(rVar, new a() { // from class: ym.u1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$8();
            }
        }), o.b(rVar, new a() { // from class: ym.t1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$9();
            }
        }), o.b(rVar, new a() { // from class: ym.v1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$10();
            }
        }), o.b(rVar, new a() { // from class: ym.w1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$11();
            }
        }), o.b(rVar, new a() { // from class: ym.x1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$12();
            }
        }), o.b(rVar, new a() { // from class: ym.y1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$13();
            }
        }), o.b(rVar, new a() { // from class: ym.z1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$14();
            }
        }), o.b(rVar, new a() { // from class: ym.a2
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$15();
            }
        }), o.b(rVar, new a() { // from class: ym.b2
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$16();
            }
        }), o.b(rVar, new a() { // from class: ym.c2
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$17();
            }
        }), o.b(rVar, new a() { // from class: ym.j1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$18();
            }
        }), o.b(rVar, new a() { // from class: ym.l1
            @Override // iu.a
            public final Object a() {
                return DeleteSet._childSerializers$_anonymous_$19();
            }
        })};
    }

    public DeleteSet() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 2097151, (k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$1() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$10() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$11() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$12() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$13() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$14() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$15() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$16() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$17() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$18() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$19() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$2() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$3() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$4() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$5() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$6() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$7() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$8() {
        return new f(h1.f64699a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$9() {
        return new f(h1.f64699a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteSet copy$default(DeleteSet deleteSet, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, int i10, Object obj) {
        List list22;
        List list23;
        List list24 = (i10 & 1) != 0 ? deleteSet.sshKeys : list;
        List list25 = (i10 & 2) != 0 ? deleteSet.certificates : list2;
        List list26 = (i10 & 4) != 0 ? deleteSet.tagHosts : list3;
        List list27 = (i10 & 8) != 0 ? deleteSet.identities : list4;
        List list28 = (i10 & 16) != 0 ? deleteSet.hosts : list5;
        List list29 = (i10 & 32) != 0 ? deleteSet.sshConfigs : list6;
        List list30 = (i10 & 64) != 0 ? deleteSet.telnetConfigs : list7;
        List list31 = (i10 & 128) != 0 ? deleteSet.proxies : list8;
        List list32 = (i10 & 256) != 0 ? deleteSet.packages : list9;
        List list33 = (i10 & File.FLAG_O_TRUNC) != 0 ? deleteSet.snippets : list10;
        List list34 = (i10 & File.FLAG_O_APPEND) != 0 ? deleteSet.pfRules : list11;
        List list35 = (i10 & 2048) != 0 ? deleteSet.groups : list12;
        List list36 = (i10 & 4096) != 0 ? deleteSet.tags : list13;
        List list37 = (i10 & 8192) != 0 ? deleteSet.knownHosts : list14;
        List list38 = list24;
        List list39 = (i10 & 16384) != 0 ? deleteSet.snippetHosts : list15;
        List list40 = (i10 & 32768) != 0 ? deleteSet.hostChains : list16;
        List list41 = (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? deleteSet.sshConfigIdentities : list17;
        List list42 = (i10 & 131072) != 0 ? deleteSet.telnetConfigIdentities : list18;
        List list43 = (i10 & 262144) != 0 ? deleteSet.multiKeys : list19;
        List list44 = (i10 & 524288) != 0 ? deleteSet.sharedSshConfigIdentities : list20;
        if ((i10 & 1048576) != 0) {
            list23 = list44;
            list22 = deleteSet.sharedTelnetConfigIdentities;
        } else {
            list22 = list21;
            list23 = list44;
        }
        return deleteSet.copy(list38, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list39, list40, list41, list42, list43, list23, list22);
    }

    @hv.o(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)
    public static /* synthetic */ void getCertificates$annotations() {
    }

    @hv.o(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME)
    public static /* synthetic */ void getGroups$annotations() {
    }

    @hv.o("hostchain_set")
    public static /* synthetic */ void getHostChains$annotations() {
    }

    @hv.o(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME)
    public static /* synthetic */ void getHosts$annotations() {
    }

    @hv.o(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME)
    public static /* synthetic */ void getIdentities$annotations() {
    }

    @hv.o(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME)
    public static /* synthetic */ void getKnownHosts$annotations() {
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

    @hv.o("hostsnippet_set")
    public static /* synthetic */ void getSnippetHosts$annotations() {
    }

    @hv.o(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME)
    public static /* synthetic */ void getSnippets$annotations() {
    }

    @hv.o("sshconfigidentity_set")
    public static /* synthetic */ void getSshConfigIdentities$annotations() {
    }

    @hv.o("sshconfig_set")
    public static /* synthetic */ void getSshConfigs$annotations() {
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

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DeleteSet deleteSet, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || !t.b(deleteSet.sshKeys, v.o())) {
            dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), deleteSet.sshKeys);
        }
        if (dVar.E(fVar, 1) || !t.b(deleteSet.certificates, v.o())) {
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), deleteSet.certificates);
        }
        if (dVar.E(fVar, 2) || !t.b(deleteSet.tagHosts, v.o())) {
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), deleteSet.tagHosts);
        }
        if (dVar.E(fVar, 3) || !t.b(deleteSet.identities, v.o())) {
            dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), deleteSet.identities);
        }
        if (dVar.E(fVar, 4) || !t.b(deleteSet.hosts, v.o())) {
            dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), deleteSet.hosts);
        }
        if (dVar.E(fVar, 5) || !t.b(deleteSet.sshConfigs, v.o())) {
            dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), deleteSet.sshConfigs);
        }
        if (dVar.E(fVar, 6) || !t.b(deleteSet.telnetConfigs, v.o())) {
            dVar.o(fVar, 6, (hv.r) nVarArr[6].getValue(), deleteSet.telnetConfigs);
        }
        if (dVar.E(fVar, 7) || !t.b(deleteSet.proxies, v.o())) {
            dVar.o(fVar, 7, (hv.r) nVarArr[7].getValue(), deleteSet.proxies);
        }
        if (dVar.E(fVar, 8) || !t.b(deleteSet.packages, v.o())) {
            dVar.o(fVar, 8, (hv.r) nVarArr[8].getValue(), deleteSet.packages);
        }
        if (dVar.E(fVar, 9) || !t.b(deleteSet.snippets, v.o())) {
            dVar.o(fVar, 9, (hv.r) nVarArr[9].getValue(), deleteSet.snippets);
        }
        if (dVar.E(fVar, 10) || !t.b(deleteSet.pfRules, v.o())) {
            dVar.o(fVar, 10, (hv.r) nVarArr[10].getValue(), deleteSet.pfRules);
        }
        if (dVar.E(fVar, 11) || !t.b(deleteSet.groups, v.o())) {
            dVar.o(fVar, 11, (hv.r) nVarArr[11].getValue(), deleteSet.groups);
        }
        if (dVar.E(fVar, 12) || !t.b(deleteSet.tags, v.o())) {
            dVar.o(fVar, 12, (hv.r) nVarArr[12].getValue(), deleteSet.tags);
        }
        if (dVar.E(fVar, 13) || !t.b(deleteSet.knownHosts, v.o())) {
            dVar.o(fVar, 13, (hv.r) nVarArr[13].getValue(), deleteSet.knownHosts);
        }
        if (dVar.E(fVar, 14) || !t.b(deleteSet.snippetHosts, v.o())) {
            dVar.o(fVar, 14, (hv.r) nVarArr[14].getValue(), deleteSet.snippetHosts);
        }
        if (dVar.E(fVar, 15) || !t.b(deleteSet.hostChains, v.o())) {
            dVar.o(fVar, 15, (hv.r) nVarArr[15].getValue(), deleteSet.hostChains);
        }
        if (dVar.E(fVar, 16) || !t.b(deleteSet.sshConfigIdentities, v.o())) {
            dVar.o(fVar, 16, (hv.r) nVarArr[16].getValue(), deleteSet.sshConfigIdentities);
        }
        if (dVar.E(fVar, 17) || !t.b(deleteSet.telnetConfigIdentities, v.o())) {
            dVar.o(fVar, 17, (hv.r) nVarArr[17].getValue(), deleteSet.telnetConfigIdentities);
        }
        if (dVar.E(fVar, 18) || !t.b(deleteSet.multiKeys, v.o())) {
            dVar.o(fVar, 18, (hv.r) nVarArr[18].getValue(), deleteSet.multiKeys);
        }
        if (dVar.E(fVar, 19) || !t.b(deleteSet.sharedSshConfigIdentities, v.o())) {
            dVar.o(fVar, 19, (hv.r) nVarArr[19].getValue(), deleteSet.sharedSshConfigIdentities);
        }
        if (!dVar.E(fVar, 20) && t.b(deleteSet.sharedTelnetConfigIdentities, v.o())) {
            return;
        }
        dVar.o(fVar, 20, (hv.r) nVarArr[20].getValue(), deleteSet.sharedTelnetConfigIdentities);
    }

    public final List<Long> component1() {
        return this.sshKeys;
    }

    public final List<Long> component10() {
        return this.snippets;
    }

    public final List<Long> component11() {
        return this.pfRules;
    }

    public final List<Long> component12() {
        return this.groups;
    }

    public final List<Long> component13() {
        return this.tags;
    }

    public final List<Long> component14() {
        return this.knownHosts;
    }

    public final List<Long> component15() {
        return this.snippetHosts;
    }

    public final List<Long> component16() {
        return this.hostChains;
    }

    public final List<Long> component17() {
        return this.sshConfigIdentities;
    }

    public final List<Long> component18() {
        return this.telnetConfigIdentities;
    }

    public final List<Long> component19() {
        return this.multiKeys;
    }

    public final List<Long> component2() {
        return this.certificates;
    }

    public final List<Long> component20() {
        return this.sharedSshConfigIdentities;
    }

    public final List<Long> component21() {
        return this.sharedTelnetConfigIdentities;
    }

    public final List<Long> component3() {
        return this.tagHosts;
    }

    public final List<Long> component4() {
        return this.identities;
    }

    public final List<Long> component5() {
        return this.hosts;
    }

    public final List<Long> component6() {
        return this.sshConfigs;
    }

    public final List<Long> component7() {
        return this.telnetConfigs;
    }

    public final List<Long> component8() {
        return this.proxies;
    }

    public final List<Long> component9() {
        return this.packages;
    }

    public final DeleteSet copy(List<Long> list, List<Long> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<Long> list6, List<Long> list7, List<Long> list8, List<Long> list9, List<Long> list10, List<Long> list11, List<Long> list12, List<Long> list13, List<Long> list14, List<Long> list15, List<Long> list16, List<Long> list17, List<Long> list18, List<Long> list19, List<Long> list20, List<Long> list21) {
        t.f(list, "sshKeys");
        t.f(list2, "certificates");
        t.f(list3, "tagHosts");
        t.f(list4, "identities");
        t.f(list5, Table.HOSTS);
        t.f(list6, "sshConfigs");
        t.f(list7, "telnetConfigs");
        t.f(list8, "proxies");
        t.f(list9, "packages");
        t.f(list10, "snippets");
        t.f(list11, "pfRules");
        t.f(list12, "groups");
        t.f(list13, Table.TAG);
        t.f(list14, "knownHosts");
        t.f(list15, "snippetHosts");
        t.f(list16, "hostChains");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        t.f(list19, "multiKeys");
        t.f(list20, "sharedSshConfigIdentities");
        t.f(list21, "sharedTelnetConfigIdentities");
        return new DeleteSet(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSet)) {
            return false;
        }
        DeleteSet deleteSet = (DeleteSet) obj;
        return t.b(this.sshKeys, deleteSet.sshKeys) && t.b(this.certificates, deleteSet.certificates) && t.b(this.tagHosts, deleteSet.tagHosts) && t.b(this.identities, deleteSet.identities) && t.b(this.hosts, deleteSet.hosts) && t.b(this.sshConfigs, deleteSet.sshConfigs) && t.b(this.telnetConfigs, deleteSet.telnetConfigs) && t.b(this.proxies, deleteSet.proxies) && t.b(this.packages, deleteSet.packages) && t.b(this.snippets, deleteSet.snippets) && t.b(this.pfRules, deleteSet.pfRules) && t.b(this.groups, deleteSet.groups) && t.b(this.tags, deleteSet.tags) && t.b(this.knownHosts, deleteSet.knownHosts) && t.b(this.snippetHosts, deleteSet.snippetHosts) && t.b(this.hostChains, deleteSet.hostChains) && t.b(this.sshConfigIdentities, deleteSet.sshConfigIdentities) && t.b(this.telnetConfigIdentities, deleteSet.telnetConfigIdentities) && t.b(this.multiKeys, deleteSet.multiKeys) && t.b(this.sharedSshConfigIdentities, deleteSet.sharedSshConfigIdentities) && t.b(this.sharedTelnetConfigIdentities, deleteSet.sharedTelnetConfigIdentities);
    }

    public final List<Long> getCertificates() {
        return this.certificates;
    }

    public final List<Long> getGroups() {
        return this.groups;
    }

    public final List<Long> getHostChains() {
        return this.hostChains;
    }

    public final List<Long> getHosts() {
        return this.hosts;
    }

    public final List<Long> getIdentities() {
        return this.identities;
    }

    public final List<Long> getKnownHosts() {
        return this.knownHosts;
    }

    public final List<Long> getMultiKeys() {
        return this.multiKeys;
    }

    public final List<Long> getPackages() {
        return this.packages;
    }

    public final List<Long> getPfRules() {
        return this.pfRules;
    }

    public final List<Long> getProxies() {
        return this.proxies;
    }

    public final List<Long> getSharedSshConfigIdentities() {
        return this.sharedSshConfigIdentities;
    }

    public final List<Long> getSharedTelnetConfigIdentities() {
        return this.sharedTelnetConfigIdentities;
    }

    public final List<Long> getSnippetHosts() {
        return this.snippetHosts;
    }

    public final List<Long> getSnippets() {
        return this.snippets;
    }

    public final List<Long> getSshConfigIdentities() {
        return this.sshConfigIdentities;
    }

    public final List<Long> getSshConfigs() {
        return this.sshConfigs;
    }

    public final List<Long> getSshKeys() {
        return this.sshKeys;
    }

    public final List<Long> getTagHosts() {
        return this.tagHosts;
    }

    public final List<Long> getTags() {
        return this.tags;
    }

    public final List<Long> getTelnetConfigIdentities() {
        return this.telnetConfigIdentities;
    }

    public final List<Long> getTelnetConfigs() {
        return this.telnetConfigs;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.sshKeys.hashCode() * 31) + this.certificates.hashCode()) * 31) + this.tagHosts.hashCode()) * 31) + this.identities.hashCode()) * 31) + this.hosts.hashCode()) * 31) + this.sshConfigs.hashCode()) * 31) + this.telnetConfigs.hashCode()) * 31) + this.proxies.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.snippets.hashCode()) * 31) + this.pfRules.hashCode()) * 31) + this.groups.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.knownHosts.hashCode()) * 31) + this.snippetHosts.hashCode()) * 31) + this.hostChains.hashCode()) * 31) + this.sshConfigIdentities.hashCode()) * 31) + this.telnetConfigIdentities.hashCode()) * 31) + this.multiKeys.hashCode()) * 31) + this.sharedSshConfigIdentities.hashCode()) * 31) + this.sharedTelnetConfigIdentities.hashCode();
    }

    public String toString() {
        return "DeleteSet(sshKeys=" + this.sshKeys + ", certificates=" + this.certificates + ", tagHosts=" + this.tagHosts + ", identities=" + this.identities + ", hosts=" + this.hosts + ", sshConfigs=" + this.sshConfigs + ", telnetConfigs=" + this.telnetConfigs + ", proxies=" + this.proxies + ", packages=" + this.packages + ", snippets=" + this.snippets + ", pfRules=" + this.pfRules + ", groups=" + this.groups + ", tags=" + this.tags + ", knownHosts=" + this.knownHosts + ", snippetHosts=" + this.snippetHosts + ", hostChains=" + this.hostChains + ", sshConfigIdentities=" + this.sshConfigIdentities + ", telnetConfigIdentities=" + this.telnetConfigIdentities + ", multiKeys=" + this.multiKeys + ", sharedSshConfigIdentities=" + this.sharedSshConfigIdentities + ", sharedTelnetConfigIdentities=" + this.sharedTelnetConfigIdentities + ")";
    }

    public /* synthetic */ DeleteSet(int i10, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, s2 s2Var) {
        this.sshKeys = (i10 & 1) == 0 ? v.o() : list;
        if ((i10 & 2) == 0) {
            this.certificates = v.o();
        } else {
            this.certificates = list2;
        }
        if ((i10 & 4) == 0) {
            this.tagHosts = v.o();
        } else {
            this.tagHosts = list3;
        }
        if ((i10 & 8) == 0) {
            this.identities = v.o();
        } else {
            this.identities = list4;
        }
        if ((i10 & 16) == 0) {
            this.hosts = v.o();
        } else {
            this.hosts = list5;
        }
        if ((i10 & 32) == 0) {
            this.sshConfigs = v.o();
        } else {
            this.sshConfigs = list6;
        }
        if ((i10 & 64) == 0) {
            this.telnetConfigs = v.o();
        } else {
            this.telnetConfigs = list7;
        }
        if ((i10 & 128) == 0) {
            this.proxies = v.o();
        } else {
            this.proxies = list8;
        }
        if ((i10 & 256) == 0) {
            this.packages = v.o();
        } else {
            this.packages = list9;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.snippets = v.o();
        } else {
            this.snippets = list10;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.pfRules = v.o();
        } else {
            this.pfRules = list11;
        }
        if ((i10 & 2048) == 0) {
            this.groups = v.o();
        } else {
            this.groups = list12;
        }
        if ((i10 & 4096) == 0) {
            this.tags = v.o();
        } else {
            this.tags = list13;
        }
        this.knownHosts = (i10 & 8192) == 0 ? v.o() : list14;
        this.snippetHosts = (i10 & 16384) == 0 ? v.o() : list15;
        this.hostChains = (32768 & i10) == 0 ? v.o() : list16;
        this.sshConfigIdentities = (65536 & i10) == 0 ? v.o() : list17;
        this.telnetConfigIdentities = (131072 & i10) == 0 ? v.o() : list18;
        this.multiKeys = (262144 & i10) == 0 ? v.o() : list19;
        this.sharedSshConfigIdentities = (524288 & i10) == 0 ? v.o() : list20;
        this.sharedTelnetConfigIdentities = (i10 & 1048576) == 0 ? v.o() : list21;
    }

    public DeleteSet(List<Long> list, List<Long> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<Long> list6, List<Long> list7, List<Long> list8, List<Long> list9, List<Long> list10, List<Long> list11, List<Long> list12, List<Long> list13, List<Long> list14, List<Long> list15, List<Long> list16, List<Long> list17, List<Long> list18, List<Long> list19, List<Long> list20, List<Long> list21) {
        t.f(list, "sshKeys");
        t.f(list2, "certificates");
        t.f(list3, "tagHosts");
        t.f(list4, "identities");
        t.f(list5, Table.HOSTS);
        t.f(list6, "sshConfigs");
        t.f(list7, "telnetConfigs");
        t.f(list8, "proxies");
        t.f(list9, "packages");
        t.f(list10, "snippets");
        t.f(list11, "pfRules");
        t.f(list12, "groups");
        t.f(list13, Table.TAG);
        t.f(list14, "knownHosts");
        t.f(list15, "snippetHosts");
        t.f(list16, "hostChains");
        t.f(list17, "sshConfigIdentities");
        t.f(list18, "telnetConfigIdentities");
        t.f(list19, "multiKeys");
        t.f(list20, "sharedSshConfigIdentities");
        t.f(list21, "sharedTelnetConfigIdentities");
        this.sshKeys = list;
        this.certificates = list2;
        this.tagHosts = list3;
        this.identities = list4;
        this.hosts = list5;
        this.sshConfigs = list6;
        this.telnetConfigs = list7;
        this.proxies = list8;
        this.packages = list9;
        this.snippets = list10;
        this.pfRules = list11;
        this.groups = list12;
        this.tags = list13;
        this.knownHosts = list14;
        this.snippetHosts = list15;
        this.hostChains = list16;
        this.sshConfigIdentities = list17;
        this.telnetConfigIdentities = list18;
        this.multiKeys = list19;
        this.sharedSshConfigIdentities = list20;
        this.sharedTelnetConfigIdentities = list21;
    }

    public /* synthetic */ DeleteSet(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, int i10, k kVar) {
        this((i10 & 1) != 0 ? v.o() : list, (i10 & 2) != 0 ? v.o() : list2, (i10 & 4) != 0 ? v.o() : list3, (i10 & 8) != 0 ? v.o() : list4, (i10 & 16) != 0 ? v.o() : list5, (i10 & 32) != 0 ? v.o() : list6, (i10 & 64) != 0 ? v.o() : list7, (i10 & 128) != 0 ? v.o() : list8, (i10 & 256) != 0 ? v.o() : list9, (i10 & File.FLAG_O_TRUNC) != 0 ? v.o() : list10, (i10 & File.FLAG_O_APPEND) != 0 ? v.o() : list11, (i10 & 2048) != 0 ? v.o() : list12, (i10 & 4096) != 0 ? v.o() : list13, (i10 & 8192) != 0 ? v.o() : list14, (i10 & 16384) != 0 ? v.o() : list15, (i10 & 32768) != 0 ? v.o() : list16, (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? v.o() : list17, (i10 & 131072) != 0 ? v.o() : list18, (i10 & 262144) != 0 ? v.o() : list19, (i10 & 524288) != 0 ? v.o() : list20, (i10 & 1048576) != 0 ? v.o() : list21);
    }
}
