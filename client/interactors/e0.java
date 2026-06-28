package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HostsDBAdapter f27358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GroupDBAdapter f27359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SnippetPackageDBAdapter f27360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SnippetDBAdapter f27361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IdentityDBAdapter f27362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PFRulesDBAdapter f27363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SshKeyDBAdapter f27364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final KnownHostsDBAdapter f27365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ProxyDBAdapter f27366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SnippetHostDBAdapter f27367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ChainHostsDBAdapter f27368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SshCertificateDBAdapter f27369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SshConfigIdentityDBAdapter f27370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SshConfigDBAdapter f27371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TelnetConfigDBAdapter f27372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final TelnetConfigIdentityDBAdapter f27373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SharedSshConfigIdentityDBAdapter f27374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SharedTelnetConfigIdentityDBAdapter f27375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final MultiKeyDBAdapter f27376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TagDBAdapter f27377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TagHostDBAdapter f27378u;

    public e0(HostsDBAdapter hostsDBAdapter, GroupDBAdapter groupDBAdapter, SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetDBAdapter snippetDBAdapter, IdentityDBAdapter identityDBAdapter, PFRulesDBAdapter pFRulesDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, KnownHostsDBAdapter knownHostsDBAdapter, ProxyDBAdapter proxyDBAdapter, SnippetHostDBAdapter snippetHostDBAdapter, ChainHostsDBAdapter chainHostsDBAdapter, SshCertificateDBAdapter sshCertificateDBAdapter, SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, MultiKeyDBAdapter multiKeyDBAdapter, TagDBAdapter tagDBAdapter, TagHostDBAdapter tagHostDBAdapter) {
        ju.t.f(hostsDBAdapter, "hostDBAdapter");
        ju.t.f(groupDBAdapter, "groupDBAdapter");
        ju.t.f(snippetPackageDBAdapter, "snippetPackageDBAdapter");
        ju.t.f(snippetDBAdapter, "snippetDBAdapter");
        ju.t.f(identityDBAdapter, "identityDBAdapter");
        ju.t.f(pFRulesDBAdapter, "portForwardingRulesDBAdapter");
        ju.t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        ju.t.f(knownHostsDBAdapter, "knownHostsDBAdapter");
        ju.t.f(proxyDBAdapter, "proxyDBAdapter");
        ju.t.f(snippetHostDBAdapter, "snippetHostDBAdapter");
        ju.t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        ju.t.f(sshCertificateDBAdapter, "sshCertificateDBAdapter");
        ju.t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
        ju.t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        ju.t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        ju.t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
        ju.t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        ju.t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        ju.t.f(multiKeyDBAdapter, "multiKeyDBAdapter");
        ju.t.f(tagDBAdapter, "tagDBAdapter");
        ju.t.f(tagHostDBAdapter, "tagHostsDBAdapter");
        this.f27358a = hostsDBAdapter;
        this.f27359b = groupDBAdapter;
        this.f27360c = snippetPackageDBAdapter;
        this.f27361d = snippetDBAdapter;
        this.f27362e = identityDBAdapter;
        this.f27363f = pFRulesDBAdapter;
        this.f27364g = sshKeyDBAdapter;
        this.f27365h = knownHostsDBAdapter;
        this.f27366i = proxyDBAdapter;
        this.f27367j = snippetHostDBAdapter;
        this.f27368k = chainHostsDBAdapter;
        this.f27369l = sshCertificateDBAdapter;
        this.f27370m = sshConfigIdentityDBAdapter;
        this.f27371n = sshConfigDBAdapter;
        this.f27372o = telnetConfigDBAdapter;
        this.f27373p = telnetConfigIdentityDBAdapter;
        this.f27374q = sharedSshConfigIdentityDBAdapter;
        this.f27375r = sharedTelnetConfigIdentityDBAdapter;
        this.f27376s = multiKeyDBAdapter;
        this.f27377t = tagDBAdapter;
        this.f27378u = tagHostDBAdapter;
    }

    public final DbAdapterAbstract a(Class cls) {
        ju.t.f(cls, "entityType");
        if (ju.t.b(cls, HostDBModel.class)) {
            return this.f27358a;
        }
        if (ju.t.b(cls, GroupDBModel.class)) {
            return this.f27359b;
        }
        if (ju.t.b(cls, SnippetPackageDBModel.class)) {
            return this.f27360c;
        }
        if (ju.t.b(cls, SnippetDBModel.class)) {
            return this.f27361d;
        }
        if (ju.t.b(cls, IdentityDBModel.class)) {
            return this.f27362e;
        }
        if (ju.t.b(cls, RuleDBModel.class)) {
            return this.f27363f;
        }
        if (ju.t.b(cls, SshKeyDBModel.class)) {
            return this.f27364g;
        }
        if (ju.t.b(cls, KnownHostsDBModel.class)) {
            return this.f27365h;
        }
        if (ju.t.b(cls, ProxyDBModel.class)) {
            return this.f27366i;
        }
        if (ju.t.b(cls, SnippetHostDBModel.class)) {
            return this.f27367j;
        }
        if (ju.t.b(cls, ChainHostsDBModel.class)) {
            return this.f27368k;
        }
        if (ju.t.b(cls, SshCertificateDBModel.class)) {
            return this.f27369l;
        }
        if (ju.t.b(cls, SshConfigIdentityDBModel.class)) {
            return this.f27370m;
        }
        if (ju.t.b(cls, SshRemoteConfigDBModel.class)) {
            return this.f27371n;
        }
        if (ju.t.b(cls, SharedSshConfigIdentityDBModel.class)) {
            return this.f27374q;
        }
        if (ju.t.b(cls, TelnetConfigIdentityDBModel.class)) {
            return this.f27373p;
        }
        if (ju.t.b(cls, TelnetRemoteConfigDBModel.class)) {
            return this.f27372o;
        }
        if (ju.t.b(cls, SharedTelnetConfigIdentityDBModel.class)) {
            return this.f27375r;
        }
        if (ju.t.b(cls, MultiKeyDBModel.class)) {
            return this.f27376s;
        }
        if (ju.t.b(cls, TagDBModel.class)) {
            return this.f27377t;
        }
        if (ju.t.b(cls, TagHostDBModel.class)) {
            return this.f27378u;
        }
        return null;
    }
}
