package com.server.auditor.ssh.client.debug;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.synchronization.api.adapters.GroupApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.HostsApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.IdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.ProxyApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshConfigApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshKeyApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TelnetConfigApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TelnetConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing.SharedSshConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing.SharedTelnetConfigIdentityApiAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f23760w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f23761x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f23762y = "-----BEGIN OPENSSH PRIVATE KEY-----\nb3BlbnNzaC1rZXktdjEAAAAABG5vbmUAAAAEbm9uZQAAAAAAAAABAAAAMwAAAAtzc2gtZW\nQyNTUxOQAAACCPbPTbk+fBbcKVkzmpRmI3FLz7r2tXODPqFgnHHkL+BwAAAIjQCtz20Arc\n9gAAAAtzc2gtZWQyNTUxOQAAACCPbPTbk+fBbcKVkzmpRmI3FLz7r2tXODPqFgnHHkL+Bw\nAAAECz6xVRrnswp8RuL/ivp+5v6OiPTnZztu1fPSgMOfFjvI9s9NuT58FtwpWTOalGYjcU\nvPuva1c4M+oWCcceQv4HAAAAAAECAwQF\n-----END OPENSSH PRIVATE KEY-----";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f23763z = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAII9s9NuT58FtwpWTOalGYjcUvPuva1c4M+oWCcceQv4H";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GroupApiAdapter f23764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HostsApiAdapter f23765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SshConfigApiAdapter f23766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TelnetConfigApiAdapter f23767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IdentityApiAdapter f23768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SshKeyApiAdapter f23769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SshConfigIdentityApiAdapter f23770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SharedSshConfigIdentityApiAdapter f23771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TelnetConfigIdentityApiAdapter f23772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SharedTelnetConfigIdentityApiAdapter f23773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ProxyApiAdapter f23774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final GroupDBAdapter f23775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HostsDBAdapter f23776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SshConfigDBAdapter f23777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TelnetConfigDBAdapter f23778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final IdentityDBAdapter f23779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SshKeyDBAdapter f23780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SshConfigIdentityDBAdapter f23781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SharedSshConfigIdentityDBAdapter f23782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TelnetConfigIdentityDBAdapter f23783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SharedTelnetConfigIdentityDBAdapter f23784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ProxyDBAdapter f23785v;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public o(GroupApiAdapter groupApiAdapter, HostsApiAdapter hostsApiAdapter, SshConfigApiAdapter sshConfigApiAdapter, TelnetConfigApiAdapter telnetConfigApiAdapter, IdentityApiAdapter identityApiAdapter, SshKeyApiAdapter sshKeyApiAdapter, SshConfigIdentityApiAdapter sshConfigIdentityApiAdapter, SharedSshConfigIdentityApiAdapter sharedSshConfigIdentityApiAdapter, TelnetConfigIdentityApiAdapter telnetConfigIdentityApiAdapter, SharedTelnetConfigIdentityApiAdapter sharedTelnetConfigIdentityApiAdapter, ProxyApiAdapter proxyApiAdapter, GroupDBAdapter groupDBAdapter, HostsDBAdapter hostsDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, IdentityDBAdapter identityDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter, TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, ProxyDBAdapter proxyDBAdapter) {
        ju.t.f(groupApiAdapter, "groupApiAdapter");
        ju.t.f(hostsApiAdapter, "hostsApiAdapter");
        ju.t.f(sshConfigApiAdapter, "sshConfigApiAdapter");
        ju.t.f(telnetConfigApiAdapter, "telnetConfigApiAdapter");
        ju.t.f(identityApiAdapter, "identityApiAdapter");
        ju.t.f(sshKeyApiAdapter, "keyApiAdapter");
        ju.t.f(sshConfigIdentityApiAdapter, "sshConfigIdentityApiAdapter");
        ju.t.f(sharedSshConfigIdentityApiAdapter, "sharedSshConfigIdentityApiAdapter");
        ju.t.f(telnetConfigIdentityApiAdapter, "telnetConfigIdentityApiAdapter");
        ju.t.f(sharedTelnetConfigIdentityApiAdapter, "sharedTelnetConfigIdentityApiAdapter");
        ju.t.f(proxyApiAdapter, "proxyApiAdapter");
        ju.t.f(groupDBAdapter, "groupDBAdapter");
        ju.t.f(hostsDBAdapter, "hostsDBAdapter");
        ju.t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        ju.t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        ju.t.f(identityDBAdapter, "identityDBAdapter");
        ju.t.f(sshKeyDBAdapter, "keyDBAdapter");
        ju.t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
        ju.t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        ju.t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
        ju.t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        ju.t.f(proxyDBAdapter, "proxyDBAdapter");
        this.f23764a = groupApiAdapter;
        this.f23765b = hostsApiAdapter;
        this.f23766c = sshConfigApiAdapter;
        this.f23767d = telnetConfigApiAdapter;
        this.f23768e = identityApiAdapter;
        this.f23769f = sshKeyApiAdapter;
        this.f23770g = sshConfigIdentityApiAdapter;
        this.f23771h = sharedSshConfigIdentityApiAdapter;
        this.f23772i = telnetConfigIdentityApiAdapter;
        this.f23773j = sharedTelnetConfigIdentityApiAdapter;
        this.f23774k = proxyApiAdapter;
        this.f23775l = groupDBAdapter;
        this.f23776m = hostsDBAdapter;
        this.f23777n = sshConfigDBAdapter;
        this.f23778o = telnetConfigDBAdapter;
        this.f23779p = identityDBAdapter;
        this.f23780q = sshKeyDBAdapter;
        this.f23781r = sshConfigIdentityDBAdapter;
        this.f23782s = sharedSshConfigIdentityDBAdapter;
        this.f23783t = telnetConfigIdentityDBAdapter;
        this.f23784u = sharedTelnetConfigIdentityDBAdapter;
        this.f23785v = proxyDBAdapter;
    }

    private final GroupDBModel b(String str, Identity identity, Identity identity2, Long l10, Long l11) {
        GroupDBModel groupDBModel = new GroupDBModel(str);
        groupDBModel.setSshConfigId(Long.valueOf(l(identity, l11).getIdInDatabase()));
        groupDBModel.setTelnetConfigId(Long.valueOf(o(identity2).getIdInDatabase()));
        groupDBModel.setParentGroupId(l10);
        Long lPostItem = this.f23764a.postItem(groupDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        groupDBModel.setIdInDatabase(lPostItem.longValue());
        return groupDBModel;
    }

    static /* synthetic */ GroupDBModel c(o oVar, String str, Identity identity, Identity identity2, Long l10, Long l11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l10 = null;
        }
        if ((i10 & 16) != 0) {
            l11 = null;
        }
        return oVar.b(str, identity, identity2, l10, l11);
    }

    private final HostDBModel d(String str, String str2, Identity identity, Identity identity2, Long l10, Long l11) {
        HostDBModel hostDBModel = new HostDBModel(str, str2);
        hostDBModel.setSshConfigId(Long.valueOf(l(identity, l11).getIdInDatabase()));
        hostDBModel.setTelnetConfigId(Long.valueOf(o(identity2).getIdInDatabase()));
        hostDBModel.setGroupId(l10);
        Long lPostItem = this.f23765b.postItem(hostDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        hostDBModel.setIdInDatabase(lPostItem.longValue());
        return hostDBModel;
    }

    static /* synthetic */ HostDBModel e(o oVar, String str, String str2, Identity identity, Identity identity2, Long l10, Long l11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            l10 = null;
        }
        if ((i10 & 32) != 0) {
            l11 = null;
        }
        return oVar.d(str, str2, identity, identity2, l10, l11);
    }

    private final Identity f(boolean z10, String str, String str2, String str3, SshKeyDBModel sshKeyDBModel) {
        IdentityDBModel identityDBModel = new IdentityDBModel();
        identityDBModel.setVisible(z10);
        identityDBModel.setTitle(str);
        identityDBModel.setUsername(str2);
        identityDBModel.setPassword(str3);
        identityDBModel.setSshKeyId(sshKeyDBModel != null ? Long.valueOf(sshKeyDBModel.getIdInDatabase()) : null);
        Long lPostItem = this.f23768e.postItem(identityDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        identityDBModel.setIdInDatabase(lPostItem.longValue());
        Identity identityConvertToIdentity = identityDBModel.convertToIdentity();
        ju.t.e(identityConvertToIdentity, "convertToIdentity(...)");
        return identityConvertToIdentity;
    }

    static /* synthetic */ Identity g(o oVar, boolean z10, String str, String str2, String str3, SshKeyDBModel sshKeyDBModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        if ((i10 & 16) != 0) {
            sshKeyDBModel = null;
        }
        SshKeyDBModel sshKeyDBModel2 = sshKeyDBModel;
        String str4 = str2;
        return oVar.f(z10, str, str4, str3, sshKeyDBModel2);
    }

    private final SshKeyDBModel h(String str) {
        SshKeyDBModel sshKeyDBModel = new SshKeyDBModel(str, "", f23762y, f23763z);
        Long lPostItem = this.f23769f.postItem(sshKeyDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        sshKeyDBModel.setIdInDatabase(lPostItem.longValue());
        return sshKeyDBModel;
    }

    private final ProxyDBModel i(Long l10) {
        ProxyDBModel proxyDBModel = new ProxyDBModel("http", Column.ADDRESS, 3128, l10);
        Long lPostItem = this.f23774k.postItem(proxyDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        proxyDBModel.setIdInDatabase(lPostItem.longValue());
        return proxyDBModel;
    }

    private final GroupDBModel j() {
        return c(this, "group with identity", f(true, "group ssh identity", "username", "", h("group ssh identity key")), g(this, true, "group telnet identity", "username", "pass", null, 16, null), null, null, 24, null);
    }

    private final GroupDBModel k() {
        return c(this, "group with key", f(false, "invisible", "group ssh login", "group ssh pass", h("group key")), g(this, false, "invisible", "group telnet login", "group telnet pass", null, 16, null), null, null, 24, null);
    }

    private final SshRemoteConfigDBModel l(Identity identity, Long l10) {
        SshRemoteConfigDBModel sshRemoteConfigDBModel = new SshRemoteConfigDBModel();
        Boolean bool = Boolean.FALSE;
        sshRemoteConfigDBModel.setUseMosh(bool);
        sshRemoteConfigDBModel.setUseAgentForwarding(bool);
        Boolean bool2 = Boolean.TRUE;
        sshRemoteConfigDBModel.setStrictCheckHostKey(bool2);
        sshRemoteConfigDBModel.setUseSshKey(bool2);
        sshRemoteConfigDBModel.setIsPortForwarding(bool);
        sshRemoteConfigDBModel.setIsCursorBlink(bool);
        sshRemoteConfigDBModel.setTimeout(0);
        sshRemoteConfigDBModel.setKeepAlivePackages(0);
        sshRemoteConfigDBModel.setProxyId(l10);
        Long lPostItem = this.f23766c.postItem(sshRemoteConfigDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        sshRemoteConfigDBModel.setIdInDatabase(lPostItem.longValue());
        if (identity != null) {
            this.f23770g.postItem(new SshConfigIdentityDBModel(sshRemoteConfigDBModel.getIdInDatabase(), identity.getId()));
        }
        return sshRemoteConfigDBModel;
    }

    private final GroupDBModel m(long j10) {
        return c(this, "subgroup with identity", f(true, "identity ssh group", "user", "", h("subgroup identity key")), g(this, true, "identity tel group", "user", "pass", null, 16, null), Long.valueOf(j10), null, 16, null);
    }

    private final GroupDBModel n(long j10) {
        return c(this, "subgroup with key", f(false, "", "login ssh sbgr", "pass ssh sbgr", h("key subgroup")), g(this, false, "", "login tel sbgr", "pass tel sbgr", null, 16, null), Long.valueOf(j10), null, 16, null);
    }

    private final TelnetRemoteConfigDBModel o(Identity identity) {
        TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = new TelnetRemoteConfigDBModel();
        telnetRemoteConfigDBModel.setIsCursorBlink(Boolean.FALSE);
        Long lPostItem = this.f23767d.postItem(telnetRemoteConfigDBModel);
        ju.t.e(lPostItem, "postItem(...)");
        telnetRemoteConfigDBModel.setIdInDatabase(lPostItem.longValue());
        if (identity != null) {
            this.f23772i.postItem(new TelnetConfigIdentityDBModel(telnetRemoteConfigDBModel.getIdInDatabase(), identity.getId()));
        }
        return telnetRemoteConfigDBModel;
    }

    public final void a() {
        e(this, "host with key", "hostwithkey", f(false, "", "login ssh hst", "pass ssh hst", h("key host")), g(this, false, "", "login tel hst", "pass tel hst", null, 16, null), Long.valueOf(n(k().getIdInDatabase()).getIdInDatabase()), null, 32, null);
        e(this, "host with identity", "hostwithidentity", f(true, "host ssh identity", "user", "", h("host identity key")), g(this, false, "host telnet identity", "user", "pass", null, 16, null), Long.valueOf(m(j().getIdInDatabase()).getIdInDatabase()), null, 32, null);
        d("host with proxy", "hostwithproxy", null, null, Long.valueOf(b("group with proxy", null, null, null, Long.valueOf(i(Long.valueOf(g(this, false, "", "login proxy gr", "login proxy gr", null, 16, null).getId())).getIdInDatabase())).getIdInDatabase()), Long.valueOf(i(Long.valueOf(f(true, "identity proxy hst", "username", "", h("host proxy key")).getId())).getIdInDatabase()));
    }

    public final void p() {
        List<GroupDBModel> itemListWhichNotDeleted = this.f23775l.getItemListWhichNotDeleted();
        List<HostDBModel> itemListWhichNotDeleted2 = this.f23776m.getItemListWhichNotDeleted();
        List<SshRemoteConfigDBModel> itemListWhichNotDeleted3 = this.f23777n.getItemListWhichNotDeleted();
        List<TelnetRemoteConfigDBModel> itemListWhichNotDeleted4 = this.f23778o.getItemListWhichNotDeleted();
        List<SshConfigIdentityDBModel> itemListWhichNotDeleted5 = this.f23781r.getItemListWhichNotDeleted();
        List<SharedSshConfigIdentityDBModel> itemListWhichNotDeleted6 = this.f23782s.getItemListWhichNotDeleted();
        List<TelnetConfigIdentityDBModel> itemListWhichNotDeleted7 = this.f23783t.getItemListWhichNotDeleted();
        List<SharedTelnetConfigIdentityDBModel> itemListWhichNotDeleted8 = this.f23784u.getItemListWhichNotDeleted();
        List<IdentityDBModel> itemListWhichNotDeleted9 = this.f23779p.getItemListWhichNotDeleted();
        List<SshKeyDBModel> itemListWhichNotDeleted10 = this.f23780q.getItemListWhichNotDeleted();
        List<ProxyDBModel> itemListWhichNotDeleted11 = this.f23785v.getItemListWhichNotDeleted();
        ju.t.c(itemListWhichNotDeleted);
        Iterator<T> it = itemListWhichNotDeleted.iterator();
        while (it.hasNext()) {
            this.f23764a.deleteItem((GroupDBModel) it.next());
        }
        ju.t.c(itemListWhichNotDeleted2);
        Iterator<T> it2 = itemListWhichNotDeleted2.iterator();
        while (it2.hasNext()) {
            this.f23765b.deleteItem((HostDBModel) it2.next());
        }
        ju.t.c(itemListWhichNotDeleted3);
        Iterator<T> it3 = itemListWhichNotDeleted3.iterator();
        while (it3.hasNext()) {
            this.f23766c.deleteItem((SshRemoteConfigDBModel) it3.next());
        }
        ju.t.c(itemListWhichNotDeleted4);
        Iterator<T> it4 = itemListWhichNotDeleted4.iterator();
        while (it4.hasNext()) {
            this.f23767d.deleteItem((TelnetRemoteConfigDBModel) it4.next());
        }
        ju.t.c(itemListWhichNotDeleted5);
        Iterator<T> it5 = itemListWhichNotDeleted5.iterator();
        while (it5.hasNext()) {
            this.f23770g.deleteItem((SshConfigIdentityDBModel) it5.next());
        }
        ju.t.c(itemListWhichNotDeleted6);
        Iterator<T> it6 = itemListWhichNotDeleted6.iterator();
        while (it6.hasNext()) {
            this.f23771h.deleteItem((SharedSshConfigIdentityDBModel) it6.next());
        }
        ju.t.c(itemListWhichNotDeleted7);
        Iterator<T> it7 = itemListWhichNotDeleted7.iterator();
        while (it7.hasNext()) {
            this.f23772i.deleteItem((TelnetConfigIdentityDBModel) it7.next());
        }
        ju.t.c(itemListWhichNotDeleted8);
        Iterator<T> it8 = itemListWhichNotDeleted8.iterator();
        while (it8.hasNext()) {
            this.f23773j.deleteItem((SharedTelnetConfigIdentityDBModel) it8.next());
        }
        ju.t.c(itemListWhichNotDeleted9);
        Iterator<T> it9 = itemListWhichNotDeleted9.iterator();
        while (it9.hasNext()) {
            this.f23768e.deleteItem((IdentityDBModel) it9.next());
        }
        ju.t.c(itemListWhichNotDeleted10);
        Iterator<T> it10 = itemListWhichNotDeleted10.iterator();
        while (it10.hasNext()) {
            this.f23769f.deleteItem((SshKeyDBModel) it10.next());
        }
        ju.t.c(itemListWhichNotDeleted11);
        Iterator<T> it11 = itemListWhichNotDeleted11.iterator();
        while (it11.hasNext()) {
            this.f23774k.deleteItem((ProxyDBModel) it11.next());
        }
    }
}
