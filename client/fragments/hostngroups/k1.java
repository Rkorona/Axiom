package com.server.auditor.ssh.client.fragments.hostngroups;

import android.util.LongSparseArray;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.ChainHostApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.GroupApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.HostsApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.IdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.KnownHostsApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.PFApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.ProxyApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetPackageApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshCertificateApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshConfigApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshKeyApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TelnetConfigApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing.SharedSshConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.credentialssharing.SharedTelnetConfigIdentityApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.entitygraph.CredentialsMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import wu.s2;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {
    private final IdentityApiAdapter A;
    private final ChainHostApiAdapter B;
    private final SharedSshConfigIdentityApiAdapter C;
    private final SharedTelnetConfigIdentityApiAdapter D;
    private final SshKeyApiAdapter E;
    private final SshCertificateApiAdapter F;
    private final KnownHostsApiAdapter G;
    private final PFApiAdapter H;
    private final wu.z I;
    private final wu.i0 J;
    private boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshConfigDBAdapter f25114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TelnetConfigDBAdapter f25115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GroupDBAdapter f25116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostsDBAdapter f25117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TagDBAdapter f25118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TagHostDBAdapter f25119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ProxyDBAdapter f25120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SnippetPackageDBAdapter f25121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SnippetDBAdapter f25122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IdentityDBAdapter f25123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ChainHostsDBAdapter f25124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SharedSshConfigIdentityDBAdapter f25125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SharedTelnetConfigIdentityDBAdapter f25126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SshKeyDBAdapter f25127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final SshCertificateDBAdapter f25128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final KnownHostsDBAdapter f25129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PFRulesDBAdapter f25130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SshConfigApiAdapter f25131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TelnetConfigApiAdapter f25132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GroupApiAdapter f25133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HostsApiAdapter f25134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TagApiAdapter f25135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TagHostApiAdapter f25136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ProxyApiAdapter f25137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SnippetPackageApiAdapter f25138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final SnippetApiAdapter f25139z;

    public k1(SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, HostsDBAdapter hostsDBAdapter, TagDBAdapter tagDBAdapter, TagHostDBAdapter tagHostDBAdapter, ProxyDBAdapter proxyDBAdapter, SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetDBAdapter snippetDBAdapter, IdentityDBAdapter identityDBAdapter, ChainHostsDBAdapter chainHostsDBAdapter, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, SshCertificateDBAdapter sshCertificateDBAdapter, KnownHostsDBAdapter knownHostsDBAdapter, PFRulesDBAdapter pFRulesDBAdapter, SshConfigApiAdapter sshConfigApiAdapter, TelnetConfigApiAdapter telnetConfigApiAdapter, GroupApiAdapter groupApiAdapter, HostsApiAdapter hostsApiAdapter, TagApiAdapter tagApiAdapter, TagHostApiAdapter tagHostApiAdapter, ProxyApiAdapter proxyApiAdapter, SnippetPackageApiAdapter snippetPackageApiAdapter, SnippetApiAdapter snippetApiAdapter, IdentityApiAdapter identityApiAdapter, ChainHostApiAdapter chainHostApiAdapter, SharedSshConfigIdentityApiAdapter sharedSshConfigIdentityApiAdapter, SharedTelnetConfigIdentityApiAdapter sharedTelnetConfigIdentityApiAdapter, SshKeyApiAdapter sshKeyApiAdapter, SshCertificateApiAdapter sshCertificateApiAdapter, KnownHostsApiAdapter knownHostsApiAdapter, PFApiAdapter pFApiAdapter) {
        ju.t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        ju.t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        ju.t.f(groupDBAdapter, "groupDBAdapter");
        ju.t.f(hostsDBAdapter, "hostDBAdapter");
        ju.t.f(tagDBAdapter, "tagDBAdapter");
        ju.t.f(tagHostDBAdapter, "tagHostDBAdapter");
        ju.t.f(proxyDBAdapter, "proxyDBAdapter");
        ju.t.f(snippetPackageDBAdapter, "packageDBAdapter");
        ju.t.f(snippetDBAdapter, "snippetDBAdapter");
        ju.t.f(identityDBAdapter, "identityDBAdapter");
        ju.t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        ju.t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        ju.t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        ju.t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        ju.t.f(sshCertificateDBAdapter, "sshCertificateDBAdapter");
        ju.t.f(knownHostsDBAdapter, "knownHostDBAdapter");
        ju.t.f(pFRulesDBAdapter, "pfRulesDBAdapter");
        ju.t.f(sshConfigApiAdapter, "sshConfigApiAdapter");
        ju.t.f(telnetConfigApiAdapter, "telnetConfigApiAdapter");
        ju.t.f(groupApiAdapter, "groupApiAdapter");
        ju.t.f(hostsApiAdapter, "hostApiAdapter");
        ju.t.f(tagApiAdapter, "tagApiAdapter");
        ju.t.f(tagHostApiAdapter, "tagHostApiAdapter");
        ju.t.f(proxyApiAdapter, "proxyApiAdapter");
        ju.t.f(snippetPackageApiAdapter, "packageApiAdapter");
        ju.t.f(snippetApiAdapter, "snippetApiAdapter");
        ju.t.f(identityApiAdapter, "identityApiAdapter");
        ju.t.f(chainHostApiAdapter, "chainHostApiAdapter");
        ju.t.f(sharedSshConfigIdentityApiAdapter, "sharedSshConfigIdentityApiAdapter");
        ju.t.f(sharedTelnetConfigIdentityApiAdapter, "sharedTelnetConfigIdentityApiAdapter");
        ju.t.f(sshKeyApiAdapter, "sshKeyApiAdapter");
        ju.t.f(sshCertificateApiAdapter, "sshCertificateApiAdapter");
        ju.t.f(knownHostsApiAdapter, "knownHostApiAdapter");
        ju.t.f(pFApiAdapter, "pfRulesApiAdapter");
        this.f25114a = sshConfigDBAdapter;
        this.f25115b = telnetConfigDBAdapter;
        this.f25116c = groupDBAdapter;
        this.f25117d = hostsDBAdapter;
        this.f25118e = tagDBAdapter;
        this.f25119f = tagHostDBAdapter;
        this.f25120g = proxyDBAdapter;
        this.f25121h = snippetPackageDBAdapter;
        this.f25122i = snippetDBAdapter;
        this.f25123j = identityDBAdapter;
        this.f25124k = chainHostsDBAdapter;
        this.f25125l = sharedSshConfigIdentityDBAdapter;
        this.f25126m = sharedTelnetConfigIdentityDBAdapter;
        this.f25127n = sshKeyDBAdapter;
        this.f25128o = sshCertificateDBAdapter;
        this.f25129p = knownHostsDBAdapter;
        this.f25130q = pFRulesDBAdapter;
        this.f25131r = sshConfigApiAdapter;
        this.f25132s = telnetConfigApiAdapter;
        this.f25133t = groupApiAdapter;
        this.f25134u = hostsApiAdapter;
        this.f25135v = tagApiAdapter;
        this.f25136w = tagHostApiAdapter;
        this.f25137x = proxyApiAdapter;
        this.f25138y = snippetPackageApiAdapter;
        this.f25139z = snippetApiAdapter;
        this.A = identityApiAdapter;
        this.B = chainHostApiAdapter;
        this.C = sharedSshConfigIdentityApiAdapter;
        this.D = sharedTelnetConfigIdentityApiAdapter;
        this.E = sshKeyApiAdapter;
        this.F = sshCertificateApiAdapter;
        this.G = knownHostsApiAdapter;
        this.H = pFApiAdapter;
        wu.z zVarB = s2.b(null, 1, null);
        this.I = zVarB;
        this.J = wu.j0.a(wu.x0.a().r0(zVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(long j10, ProxyDBModel proxyDBModel) {
        ju.t.f(proxyDBModel, "it");
        Long identityId = proxyDBModel.getIdentityId();
        return identityId != null && identityId.longValue() == j10 && proxyDBModel.isShared();
    }

    private final void B(m1 m1Var, m1 m1Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LongSparseArray longSparseArrayN = m1Var2.n();
        int size = longSparseArrayN.size();
        for (int i10 = 0; i10 < size; i10++) {
            final long jKeyAt = longSparseArrayN.keyAt(i10);
            int size2 = l1.b(m1Var.m(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.v0
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(k1.C(jKeyAt, (TagHostDBModel) obj));
                }
            }).size();
            List listB = l1.b(m1Var2.m(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.b1
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(k1.D(jKeyAt, (TagHostDBModel) obj));
                }
            });
            if (size2 > listB.size()) {
                linkedHashSet.add(Long.valueOf(jKeyAt));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    m1Var2.m().remove(((TagHostDBModel) it.next()).getIdInDatabase());
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m1Var2.n().delete(((Number) it2.next()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(long j10, TagHostDBModel tagHostDBModel) {
        ju.t.f(tagHostDBModel, "it");
        return tagHostDBModel.getTagId() == j10 && tagHostDBModel.isShared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(long j10, TagHostDBModel tagHostDBModel) {
        ju.t.f(tagHostDBModel, "it");
        return tagHostDBModel.getTagId() == j10 && tagHostDBModel.isShared();
    }

    private final ChainHostsDBModel E(long j10, m1 m1Var) {
        LongSparseArray longSparseArrayA = m1Var.a();
        int size = longSparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayA.keyAt(i10);
            ChainHostsDBModel chainHostsDBModel = (ChainHostsDBModel) longSparseArrayA.valueAt(i10);
            if (chainHostsDBModel.getSshConfigId() == j10) {
                return chainHostsDBModel;
            }
        }
        return null;
    }

    private final HostDBModel F(m1 m1Var, long j10) {
        LongSparseArray longSparseArrayC = m1Var.c();
        int size = longSparseArrayC.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayC.keyAt(i10);
            HostDBModel hostDBModel = (HostDBModel) longSparseArrayC.valueAt(i10);
            Long sshConfigId = hostDBModel.getSshConfigId();
            if (sshConfigId != null && sshConfigId.longValue() == j10) {
                return hostDBModel;
            }
        }
        throw new IllegalStateException("Cannot find the host by its ssh config.");
    }

    private final boolean H(m1 m1Var, long j10) {
        LongSparseArray longSparseArrayB = m1Var.b();
        int size = longSparseArrayB.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayB.keyAt(i10);
            Long sshConfigId = ((GroupDBModel) longSparseArrayB.valueAt(i10)).getSshConfigId();
            if (sshConfigId != null && sshConfigId.longValue() == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean I(m1 m1Var, final long j10) {
        List listB = l1.b(m1Var.g(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.i1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.J(j10, (SharedSshConfigIdentityDBModel) obj));
            }
        });
        List listB2 = l1.b(m1Var.h(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.j1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.K(j10, (SharedTelnetConfigIdentityDBModel) obj));
            }
        });
        int size = listB.size();
        int size2 = listB2.size();
        if (size == 1 && size2 == 1) {
            return M(m1Var, ((SharedSshConfigIdentityDBModel) listB.get(0)).getSshConfigId(), ((SharedTelnetConfigIdentityDBModel) listB2.get(0)).getTelnetConfigId());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(long j10, SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel) {
        ju.t.f(sharedSshConfigIdentityDBModel, "sshConfigIdentity");
        return sharedSshConfigIdentityDBModel.getIdentityId() == j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(long j10, SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel) {
        ju.t.f(sharedTelnetConfigIdentityDBModel, "telnetConfigIdentity");
        return sharedTelnetConfigIdentityDBModel.getIdentityId() == j10;
    }

    private final boolean L(long j10, m1 m1Var, m1 m1Var2) {
        SnippetPackageDBModel snippetPackageDBModel = (SnippetPackageDBModel) m1Var.e().get(j10);
        return (snippetPackageDBModel != null ? snippetPackageDBModel.isShared() : false) || (m1Var2.e().indexOfKey(j10) >= 0);
    }

    private final boolean M(m1 m1Var, final long j10, final long j11) {
        return l1.b(m1Var.b(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.y0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.N(j10, j11, (GroupDBModel) obj));
            }
        }).size() == 1 || l1.b(m1Var.c(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.z0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.O(j10, j11, (HostDBModel) obj));
            }
        }).size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(long j10, long j11, GroupDBModel groupDBModel) {
        Long telnetConfigId;
        ju.t.f(groupDBModel, HostBulk.GROUP_ID_SERIAL_NAME);
        Long sshConfigId = groupDBModel.getSshConfigId();
        return sshConfigId != null && sshConfigId.longValue() == j10 && (telnetConfigId = groupDBModel.getTelnetConfigId()) != null && telnetConfigId.longValue() == j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(long j10, long j11, HostDBModel hostDBModel) {
        Long telnetConfigId;
        ju.t.f(hostDBModel, "host");
        Long sshConfigId = hostDBModel.getSshConfigId();
        return sshConfigId != null && sshConfigId.longValue() == j10 && (telnetConfigId = hostDBModel.getTelnetConfigId()) != null && telnetConfigId.longValue() == j11;
    }

    private final void P(final SshKeyDBModel sshKeyDBModel, m1 m1Var, m1 m1Var2) {
        for (SshCertificateDBModel sshCertificateDBModel : l1.b(m1Var2.j(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.g1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.Q(sshKeyDBModel, (SshCertificateDBModel) obj));
            }
        })) {
            if (m1Var.j().indexOfKey(sshCertificateDBModel.getIdInDatabase()) < 0) {
                m1Var.j().put(sshCertificateDBModel.getIdInDatabase(), sshCertificateDBModel);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(SshKeyDBModel sshKeyDBModel, SshCertificateDBModel sshCertificateDBModel) {
        ju.t.f(sshCertificateDBModel, "it");
        return sshCertificateDBModel.getKeyId() == sshKeyDBModel.getIdInDatabase();
    }

    private final void U(HostDBModel hostDBModel, m1 m1Var, m1 m1Var2) {
        if (m1Var.c().indexOfKey(hostDBModel.getIdInDatabase()) >= 0) {
            return;
        }
        m1Var.c().put(hostDBModel.getIdInDatabase(), hostDBModel);
        if (hostDBModel.getSshConfigId() != null) {
            LongSparseArray longSparseArrayK = m1Var2.k();
            Long sshConfigId = hostDBModel.getSshConfigId();
            ju.t.e(sshConfigId, "getSshConfigId(...)");
            SshRemoteConfigDBModel sshRemoteConfigDBModel = (SshRemoteConfigDBModel) longSparseArrayK.get(sshConfigId.longValue());
            if (sshRemoteConfigDBModel != null) {
                a0(sshRemoteConfigDBModel, m1Var, m1Var2);
            }
        }
        if (hostDBModel.getTelnetConfigId() != null) {
            LongSparseArray longSparseArrayO = m1Var2.o();
            Long telnetConfigId = hostDBModel.getTelnetConfigId();
            ju.t.e(telnetConfigId, "getTelnetConfigId(...)");
            TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = (TelnetRemoteConfigDBModel) longSparseArrayO.get(telnetConfigId.longValue());
            if (telnetRemoteConfigDBModel != null) {
                d0(telnetRemoteConfigDBModel, m1Var, m1Var2);
            }
        }
        LongSparseArray longSparseArrayM = m1Var2.m();
        int size = longSparseArrayM.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayM.keyAt(i10);
            TagHostDBModel tagHostDBModel = (TagHostDBModel) longSparseArrayM.valueAt(i10);
            if (tagHostDBModel.getHostId() == hostDBModel.getIdInDatabase()) {
                c0(tagHostDBModel, m1Var, m1Var2);
            }
        }
    }

    private final void V(IdentityDBModel identityDBModel, m1 m1Var, m1 m1Var2) {
        if (m1Var.d().indexOfKey(identityDBModel.getIdInDatabase()) >= 0) {
            return;
        }
        m1Var.d().put(identityDBModel.getIdInDatabase(), identityDBModel);
        if (m1Var2.l().size() <= 0 || identityDBModel.getSshKeyId() == null) {
            return;
        }
        W(identityDBModel, m1Var, m1Var2);
    }

    private final void W(IdentityDBModel identityDBModel, m1 m1Var, m1 m1Var2) {
        LongSparseArray longSparseArrayL = m1Var2.l();
        Long sshKeyId = identityDBModel.getSshKeyId();
        ju.t.e(sshKeyId, "getSshKeyId(...)");
        SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) longSparseArrayL.get(sshKeyId.longValue());
        if (sshKeyDBModel != null) {
            int iQ = q(m1Var2, identityDBModel.getIdInDatabase(), t(m1Var2, sshKeyDBModel.getIdInDatabase()));
            int iR = r(m1Var2, sshKeyDBModel.getIdInDatabase());
            Long sshKeyId2 = identityDBModel.getSshKeyId();
            ju.t.e(sshKeyId2, "getSshKeyId(...)");
            p(m1Var, sshKeyDBModel, sshKeyId2.longValue(), iQ, iR, m1Var2);
        }
    }

    private final void Y(ProxyDBModel proxyDBModel, m1 m1Var, m1 m1Var2) {
        if (m1Var.f().indexOfKey(proxyDBModel.getIdInDatabase()) < 0) {
            m1Var.f().put(proxyDBModel.getIdInDatabase(), proxyDBModel);
        }
        if (proxyDBModel.getIdentityId() != null) {
            LongSparseArray longSparseArrayD = m1Var2.d();
            Long identityId = proxyDBModel.getIdentityId();
            ju.t.e(identityId, "getIdentityId(...)");
            if (longSparseArrayD.indexOfKey(identityId.longValue()) >= 0) {
                LongSparseArray longSparseArrayD2 = m1Var2.d();
                Long identityId2 = proxyDBModel.getIdentityId();
                ju.t.e(identityId2, "getIdentityId(...)");
                IdentityDBModel identityDBModel = (IdentityDBModel) longSparseArrayD2.get(identityId2.longValue());
                if (identityDBModel != null) {
                    V(identityDBModel, m1Var, m1Var2);
                }
            }
        }
    }

    private final void Z(SnippetDBModel snippetDBModel, m1 m1Var, m1 m1Var2) {
        if (m1Var.i().indexOfKey(snippetDBModel.getIdInDatabase()) >= 0) {
            return;
        }
        if (snippetDBModel.getPackageId() != null) {
            Long packageId = snippetDBModel.getPackageId();
            ju.t.e(packageId, "getPackageId(...)");
            if (!L(packageId.longValue(), m1Var2, m1Var)) {
                LongSparseArray longSparseArrayE = m1Var2.e();
                Long packageId2 = snippetDBModel.getPackageId();
                ju.t.e(packageId2, "getPackageId(...)");
                SnippetPackageDBModel snippetPackageDBModel = (SnippetPackageDBModel) longSparseArrayE.get(packageId2.longValue());
                ju.t.c(snippetPackageDBModel);
                X(snippetPackageDBModel, m1Var, m1Var2);
                return;
            }
        }
        m1Var.i().put(snippetDBModel.getIdInDatabase(), snippetDBModel);
    }

    private final void a0(SshRemoteConfigDBModel sshRemoteConfigDBModel, m1 m1Var, m1 m1Var2) {
        IdentityDBModel identityDBModel;
        if (m1Var.k().indexOfKey(sshRemoteConfigDBModel.getIdInDatabase()) < 0) {
            m1Var.k().put(sshRemoteConfigDBModel.getIdInDatabase(), sshRemoteConfigDBModel);
        }
        LongSparseArray longSparseArrayG = m1Var2.g();
        int size = longSparseArrayG.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayG.keyAt(i10);
            SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel = (SharedSshConfigIdentityDBModel) longSparseArrayG.valueAt(i10);
            if (sharedSshConfigIdentityDBModel.getSshConfigId() == sshRemoteConfigDBModel.getIdInDatabase() && (identityDBModel = (IdentityDBModel) m1Var2.d().get(sharedSshConfigIdentityDBModel.getIdentityId())) != null) {
                V(identityDBModel, m1Var, m1Var2);
                if (m1Var.g().indexOfKey(sharedSshConfigIdentityDBModel.getIdInDatabase()) < 0) {
                    m1Var.g().put(sharedSshConfigIdentityDBModel.getIdInDatabase(), sharedSshConfigIdentityDBModel);
                }
            }
        }
        if (sshRemoteConfigDBModel.getProxyId() != null) {
            LongSparseArray longSparseArrayF = m1Var2.f();
            Long proxyId = sshRemoteConfigDBModel.getProxyId();
            ju.t.e(proxyId, "getProxyId(...)");
            ProxyDBModel proxyDBModel = (ProxyDBModel) longSparseArrayF.get(proxyId.longValue());
            if (proxyDBModel != null) {
                Y(proxyDBModel, m1Var, m1Var2);
            }
        }
        if (sshRemoteConfigDBModel.getStartupSnippetId() != null) {
            LongSparseArray longSparseArrayI = m1Var2.i();
            Long startupSnippetId = sshRemoteConfigDBModel.getStartupSnippetId();
            ju.t.e(startupSnippetId, "getStartupSnippetId(...)");
            SnippetDBModel snippetDBModel = (SnippetDBModel) longSparseArrayI.get(startupSnippetId.longValue());
            if (snippetDBModel != null) {
                Z(snippetDBModel, m1Var, m1Var2);
            }
        }
    }

    private final void b0(TagDBModel tagDBModel, m1 m1Var) {
        if (m1Var.n().indexOfKey(tagDBModel.getIdInDatabase()) >= 0) {
            return;
        }
        m1Var.n().put(tagDBModel.getIdInDatabase(), tagDBModel);
    }

    private final void c0(TagHostDBModel tagHostDBModel, m1 m1Var, m1 m1Var2) {
        if (m1Var.m().indexOfKey(tagHostDBModel.getIdInDatabase()) >= 0) {
            return;
        }
        m1Var.m().put(tagHostDBModel.getIdInDatabase(), tagHostDBModel);
        TagDBModel tagDBModel = (TagDBModel) m1Var2.n().get(tagHostDBModel.getTagId());
        if (tagDBModel != null) {
            b0(tagDBModel, m1Var);
        }
    }

    private final void d0(TelnetRemoteConfigDBModel telnetRemoteConfigDBModel, m1 m1Var, m1 m1Var2) {
        IdentityDBModel identityDBModel;
        if (m1Var.o().indexOfKey(telnetRemoteConfigDBModel.getIdInDatabase()) < 0) {
            m1Var.o().put(telnetRemoteConfigDBModel.getIdInDatabase(), telnetRemoteConfigDBModel);
        }
        LongSparseArray longSparseArrayH = m1Var2.h();
        int size = longSparseArrayH.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayH.keyAt(i10);
            SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = (SharedTelnetConfigIdentityDBModel) longSparseArrayH.valueAt(i10);
            if (sharedTelnetConfigIdentityDBModel.getTelnetConfigId() == telnetRemoteConfigDBModel.getIdInDatabase() && (identityDBModel = (IdentityDBModel) m1Var2.d().get(sharedTelnetConfigIdentityDBModel.getIdentityId())) != null) {
                V(identityDBModel, m1Var, m1Var2);
                if (m1Var.h().indexOfKey(sharedTelnetConfigIdentityDBModel.getIdInDatabase()) < 0) {
                    m1Var.h().put(sharedTelnetConfigIdentityDBModel.getIdInDatabase(), sharedTelnetConfigIdentityDBModel);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f0(m1 m1Var, final TagHostDBModel tagHostDBModel) {
        ju.t.f(tagHostDBModel, "tagHost");
        return tagHostDBModel.isShared() && l1.b(m1Var.c(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.a1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.g0(tagHostDBModel, (HostDBModel) obj));
            }
        }).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g0(TagHostDBModel tagHostDBModel, HostDBModel hostDBModel) {
        ju.t.f(hostDBModel, "host");
        return tagHostDBModel.getHostId() == hostDBModel.getIdInDatabase() && hostDBModel.isShared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h0(final m1 m1Var, final TagDBModel tagDBModel) {
        ju.t.f(tagDBModel, "tag");
        return tagDBModel.isShared() && l1.b(m1Var.m(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.x0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.i0(tagDBModel, m1Var, (TagHostDBModel) obj));
            }
        }).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i0(TagDBModel tagDBModel, m1 m1Var, TagHostDBModel tagHostDBModel) {
        ju.t.f(tagHostDBModel, "tagHost");
        return tagHostDBModel.isShared() && tagHostDBModel.getTagId() == tagDBModel.getIdInDatabase() && m1Var.c().indexOfKey(tagHostDBModel.getHostId()) >= 0 && ((HostDBModel) m1Var.c().get(tagHostDBModel.getHostId())).isShared();
    }

    private final n1 j0(m1 m1Var, boolean z10) {
        boolean z11 = this.K;
        n1 n1Var = new n1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        LongSparseArray longSparseArrayB = m1Var.b();
        int size = longSparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayB.keyAt(i10);
            GroupDBModel groupDBModel = (GroupDBModel) longSparseArrayB.valueAt(i10);
            if (groupDBModel.isShared() != z10) {
                groupDBModel.setShared(z10);
                if (!groupDBModel.isShared()) {
                    groupDBModel.setSharingMode(null);
                    groupDBModel.setCredentialsMode(null);
                } else if (groupDBModel.getCredentialsMode() == null) {
                    groupDBModel.setCredentialsMode(v(z11, groupDBModel.getParentGroupId(), CredentialsMode.DoNotShareCredentials.getValue()));
                }
                if (this.f25133t.putItem(groupDBModel) > 0) {
                    n1Var.b().add(Long.valueOf(groupDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayC = m1Var.c();
        int size2 = longSparseArrayC.size();
        for (int i11 = 0; i11 < size2; i11++) {
            longSparseArrayC.keyAt(i11);
            HostDBModel hostDBModel = (HostDBModel) longSparseArrayC.valueAt(i11);
            if (hostDBModel.isShared() != z10) {
                hostDBModel.setShared(z10);
                if (z10) {
                    hostDBModel.setCredentialsMode(v(z11, hostDBModel.getGroupId(), CredentialsMode.DoNotShareCredentials.getValue()));
                } else {
                    hostDBModel.setCredentialsMode(null);
                }
                if (this.f25134u.putItem(hostDBModel) > 0) {
                    n1Var.c().add(Long.valueOf(hostDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayK = m1Var.k();
        int size3 = longSparseArrayK.size();
        for (int i12 = 0; i12 < size3; i12++) {
            longSparseArrayK.keyAt(i12);
            SshRemoteConfigDBModel sshRemoteConfigDBModel = (SshRemoteConfigDBModel) longSparseArrayK.valueAt(i12);
            if (sshRemoteConfigDBModel.isShared() != z10) {
                sshRemoteConfigDBModel.setShared(z10);
                if (this.f25131r.putItem(sshRemoteConfigDBModel) > 0) {
                    n1Var.k().add(Long.valueOf(sshRemoteConfigDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayO = m1Var.o();
        int size4 = longSparseArrayO.size();
        for (int i13 = 0; i13 < size4; i13++) {
            longSparseArrayO.keyAt(i13);
            TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = (TelnetRemoteConfigDBModel) longSparseArrayO.valueAt(i13);
            if (telnetRemoteConfigDBModel.isShared() != z10) {
                telnetRemoteConfigDBModel.setShared(z10);
                if (this.f25132s.putItem(telnetRemoteConfigDBModel) > 0) {
                    n1Var.o().add(Long.valueOf(telnetRemoteConfigDBModel.getIdInDatabase()));
                }
            }
        }
        if (z10) {
            LongSparseArray longSparseArrayE = m1Var.e();
            int size5 = longSparseArrayE.size();
            for (int i14 = 0; i14 < size5; i14++) {
                longSparseArrayE.keyAt(i14);
                SnippetPackageDBModel snippetPackageDBModel = (SnippetPackageDBModel) longSparseArrayE.valueAt(i14);
                if (!snippetPackageDBModel.isShared()) {
                    snippetPackageDBModel.setShared(true);
                    if (this.f25138y.putItem(snippetPackageDBModel) > 0) {
                        n1Var.e().add(Long.valueOf(snippetPackageDBModel.getIdInDatabase()));
                    }
                }
            }
            LongSparseArray longSparseArrayI = m1Var.i();
            int size6 = longSparseArrayI.size();
            for (int i15 = 0; i15 < size6; i15++) {
                longSparseArrayI.keyAt(i15);
                SnippetDBModel snippetDBModel = (SnippetDBModel) longSparseArrayI.valueAt(i15);
                if (!snippetDBModel.isShared()) {
                    snippetDBModel.setShared(true);
                    if (this.f25139z.putItem(snippetDBModel) > 0) {
                        n1Var.i().add(Long.valueOf(snippetDBModel.getIdInDatabase()));
                    }
                }
            }
        }
        LongSparseArray longSparseArrayF = m1Var.f();
        int size7 = longSparseArrayF.size();
        for (int i16 = 0; i16 < size7; i16++) {
            longSparseArrayF.keyAt(i16);
            ProxyDBModel proxyDBModel = (ProxyDBModel) longSparseArrayF.valueAt(i16);
            if (proxyDBModel.isShared() != z10) {
                proxyDBModel.setShared(z10);
                if (this.f25137x.putItem(proxyDBModel) > 0) {
                    n1Var.f().add(Long.valueOf(proxyDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayD = m1Var.d();
        int size8 = longSparseArrayD.size();
        for (int i17 = 0; i17 < size8; i17++) {
            longSparseArrayD.keyAt(i17);
            IdentityDBModel identityDBModel = (IdentityDBModel) longSparseArrayD.valueAt(i17);
            if (identityDBModel.isShared() != z10) {
                identityDBModel.setShared(z10);
                if (this.A.putItem(identityDBModel) > 0) {
                    n1Var.d().add(Long.valueOf(identityDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayN = m1Var.n();
        int size9 = longSparseArrayN.size();
        for (int i18 = 0; i18 < size9; i18++) {
            longSparseArrayN.keyAt(i18);
            TagDBModel tagDBModel = (TagDBModel) longSparseArrayN.valueAt(i18);
            if (tagDBModel.isShared() != z10) {
                tagDBModel.setShared(z10);
                if (this.f25135v.putItem(tagDBModel) > 0) {
                    n1Var.n().add(Long.valueOf(tagDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayM = m1Var.m();
        int size10 = longSparseArrayM.size();
        for (int i19 = 0; i19 < size10; i19++) {
            longSparseArrayM.keyAt(i19);
            TagHostDBModel tagHostDBModel = (TagHostDBModel) longSparseArrayM.valueAt(i19);
            if (tagHostDBModel.isShared() != z10) {
                tagHostDBModel.setShared(z10);
                if (this.f25136w.putItem(tagHostDBModel) > 0) {
                    n1Var.m().add(Long.valueOf(tagHostDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayA = m1Var.a();
        int size11 = longSparseArrayA.size();
        for (int i20 = 0; i20 < size11; i20++) {
            longSparseArrayA.keyAt(i20);
            ChainHostsDBModel chainHostsDBModel = (ChainHostsDBModel) longSparseArrayA.valueAt(i20);
            if (m1Var.k().indexOfKey(chainHostsDBModel.getSshConfigId()) >= 0) {
                chainHostsDBModel.setShared(((SshRemoteConfigDBModel) m1Var.k().get(chainHostsDBModel.getSshConfigId())).isShared());
                if (this.B.putItem(chainHostsDBModel) > 0) {
                    n1Var.a().add(Long.valueOf(chainHostsDBModel.getIdInDatabase()));
                }
            } else {
                m1 m1VarS = S();
                if (m1VarS.k().indexOfKey(chainHostsDBModel.getSshConfigId()) >= 0) {
                    chainHostsDBModel.setShared(((SshRemoteConfigDBModel) m1VarS.k().get(chainHostsDBModel.getSshConfigId())).isShared());
                    if (this.B.putItem(chainHostsDBModel) > 0) {
                        n1Var.a().add(Long.valueOf(chainHostsDBModel.getIdInDatabase()));
                    }
                } else {
                    this.B.deleteItem(chainHostsDBModel);
                }
            }
        }
        LongSparseArray longSparseArrayG = m1Var.g();
        int size12 = longSparseArrayG.size();
        for (int i21 = 0; i21 < size12; i21++) {
            longSparseArrayG.keyAt(i21);
            SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel = (SharedSshConfigIdentityDBModel) longSparseArrayG.valueAt(i21);
            if (this.C.putItem(sharedSshConfigIdentityDBModel) > 0) {
                n1Var.g().add(Long.valueOf(sharedSshConfigIdentityDBModel.getIdInDatabase()));
            }
        }
        LongSparseArray longSparseArrayH = m1Var.h();
        int size13 = longSparseArrayH.size();
        for (int i22 = 0; i22 < size13; i22++) {
            longSparseArrayH.keyAt(i22);
            SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = (SharedTelnetConfigIdentityDBModel) longSparseArrayH.valueAt(i22);
            if (this.D.putItem(sharedTelnetConfigIdentityDBModel) > 0) {
                n1Var.h().add(Long.valueOf(sharedTelnetConfigIdentityDBModel.getIdInDatabase()));
            }
        }
        LongSparseArray longSparseArrayL = m1Var.l();
        int size14 = longSparseArrayL.size();
        for (int i23 = 0; i23 < size14; i23++) {
            longSparseArrayL.keyAt(i23);
            SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) longSparseArrayL.valueAt(i23);
            if (sshKeyDBModel.isShared() != z10) {
                sshKeyDBModel.setShared(z10);
                if (this.E.putItem(sshKeyDBModel) > 0) {
                    n1Var.l().add(Long.valueOf(sshKeyDBModel.getIdInDatabase()));
                }
            }
        }
        LongSparseArray longSparseArrayJ = m1Var.j();
        int size15 = longSparseArrayJ.size();
        for (int i24 = 0; i24 < size15; i24++) {
            longSparseArrayJ.keyAt(i24);
            SshCertificateDBModel sshCertificateDBModel = (SshCertificateDBModel) longSparseArrayJ.valueAt(i24);
            if (sshCertificateDBModel.isShared() != z10) {
                sshCertificateDBModel.setShared(z10);
                if (this.F.putItem(sshCertificateDBModel) > 0) {
                    n1Var.j().add(Long.valueOf(sshCertificateDBModel.getIdInDatabase()));
                }
            }
        }
        return n1Var;
    }

    private final void p(m1 m1Var, SshKeyDBModel sshKeyDBModel, long j10, int i10, int i11, m1 m1Var2) {
        int i12 = i10 + i11;
        boolean z10 = true;
        if (i12 > 1 && sshKeyDBModel.isShared()) {
            z10 = false;
        }
        if (m1Var.l().indexOfKey(j10) < 0 && z10) {
            m1Var.l().put(sshKeyDBModel.getIdInDatabase(), sshKeyDBModel);
            P(sshKeyDBModel, m1Var, m1Var2);
        }
    }

    private final int q(m1 m1Var, long j10, int i10) {
        return (i10 <= 1 || !I(m1Var, j10)) ? i10 : i10 - 1;
    }

    private final int r(m1 m1Var, final long j10) {
        List<IdentityDBModel> listB = l1.b(m1Var.d(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.h1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.s(j10, (IdentityDBModel) obj));
            }
        });
        LongSparseArray longSparseArrayF = m1Var.f();
        int size = longSparseArrayF.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArrayF.keyAt(i11);
            ProxyDBModel proxyDBModel = (ProxyDBModel) longSparseArrayF.valueAt(i11);
            for (IdentityDBModel identityDBModel : listB) {
                if (proxyDBModel.isShared()) {
                    Long identityId = proxyDBModel.getIdentityId();
                    long idInDatabase = identityDBModel.getIdInDatabase();
                    if (identityId != null && identityId.longValue() == idInDatabase) {
                        i10++;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(long j10, IdentityDBModel identityDBModel) {
        Long sshKeyId;
        ju.t.f(identityDBModel, "identity");
        return identityDBModel.isShared() && (sshKeyId = identityDBModel.getSshKeyId()) != null && sshKeyId.longValue() == j10;
    }

    private final int t(m1 m1Var, final long j10) {
        List listB = l1.b(m1Var.d(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.w0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.u(j10, (IdentityDBModel) obj));
            }
        });
        LongSparseArray longSparseArrayG = m1Var.g();
        int size = longSparseArrayG.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArrayG.keyAt(i11);
            SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel = (SharedSshConfigIdentityDBModel) longSparseArrayG.valueAt(i11);
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (sharedSshConfigIdentityDBModel.getIdentityId() == ((IdentityDBModel) it.next()).getIdInDatabase()) {
                    i10++;
                }
            }
        }
        LongSparseArray longSparseArrayH = m1Var.h();
        int size2 = longSparseArrayH.size();
        for (int i12 = 0; i12 < size2; i12++) {
            longSparseArrayH.keyAt(i12);
            SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = (SharedTelnetConfigIdentityDBModel) longSparseArrayH.valueAt(i12);
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                if (sharedTelnetConfigIdentityDBModel.getIdentityId() == ((IdentityDBModel) it2.next()).getIdInDatabase()) {
                    i10++;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(long j10, IdentityDBModel identityDBModel) {
        Long sshKeyId;
        ju.t.f(identityDBModel, "identity");
        return identityDBModel.isShared() && (sshKeyId = identityDBModel.getSshKeyId()) != null && sshKeyId.longValue() == j10;
    }

    private final String v(boolean z10, Long l10, String str) {
        String credentialsMode;
        GroupDBModel itemByLocalId = (!z10 || l10 == null) ? null : this.f25116c.getItemByLocalId(l10.longValue());
        return (itemByLocalId == null || (credentialsMode = itemByLocalId.getCredentialsMode()) == null) ? str : credentialsMode;
    }

    private final ArrayList w(Set set, ArrayList arrayList, m1 m1Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (!set.contains(Long.valueOf(jLongValue))) {
                set.add(Long.valueOf(jLongValue));
                HostDBModel hostDBModel = (HostDBModel) m1Var.c().get(jLongValue);
                if (hostDBModel != null && hostDBModel.getSshConfigId() != null) {
                    Long sshConfigId = hostDBModel.getSshConfigId();
                    ju.t.e(sshConfigId, "getSshConfigId(...)");
                    ChainHostsDBModel chainHostsDBModelE = E(sshConfigId.longValue(), m1Var);
                    if (chainHostsDBModelE != null && chainHostsDBModelE.getChainigHosts() != null) {
                        String chainigHosts = chainHostsDBModelE.getChainigHosts();
                        ju.t.e(chainigHosts, "getChainigHosts(...)");
                        if (chainigHosts.length() > 0) {
                            ArrayList arrayListD = tp.h.d(chainHostsDBModelE.getChainigHosts());
                            ju.t.c(arrayListD);
                            vt.v.E(arrayList2, w(set, arrayListD, m1Var));
                        }
                    }
                }
                arrayList2.add(Long.valueOf(jLongValue));
            }
        }
        return arrayList2;
    }

    private final void x(m1 m1Var, m1 m1Var2) {
        y(m1Var, m1Var2);
        B(m1Var, m1Var2);
    }

    private final void y(m1 m1Var, m1 m1Var2) {
        ArrayList arrayList = new ArrayList();
        LongSparseArray longSparseArrayD = m1Var2.d();
        int size = longSparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            final long jKeyAt = longSparseArrayD.keyAt(i10);
            if (l1.b(m1Var.f(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.c1
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(k1.z(jKeyAt, (ProxyDBModel) obj));
                }
            }).size() > l1.b(m1Var2.f(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.d1
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(k1.A(jKeyAt, (ProxyDBModel) obj));
                }
            }).size()) {
                arrayList.add(Long.valueOf(jKeyAt));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1Var2.d().delete(((Number) it.next()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(long j10, ProxyDBModel proxyDBModel) {
        ju.t.f(proxyDBModel, "it");
        Long identityId = proxyDBModel.getIdentityId();
        return identityId != null && identityId.longValue() == j10 && proxyDBModel.isShared();
    }

    public final void G() {
        long j10;
        try {
            List<SshRemoteConfigDBModel> itemListWhichNotDeleted = this.f25114a.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
            ArrayList<SshRemoteConfigDBModel> arrayList = new ArrayList();
            Iterator<T> it = itemListWhichNotDeleted.iterator();
            while (true) {
                j10 = -1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                SshRemoteConfigDBModel sshRemoteConfigDBModel = (SshRemoteConfigDBModel) next;
                if (sshRemoteConfigDBModel.isShared() && sshRemoteConfigDBModel.getIdOnServer() == -1) {
                    arrayList.add(next);
                }
            }
            List<TelnetRemoteConfigDBModel> itemListWhichNotDeleted2 = this.f25115b.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted2, "getItemListWhichNotDeleted(...)");
            ArrayList<TelnetRemoteConfigDBModel> arrayList2 = new ArrayList();
            for (Object obj : itemListWhichNotDeleted2) {
                TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = (TelnetRemoteConfigDBModel) obj;
                if (telnetRemoteConfigDBModel.isShared() && telnetRemoteConfigDBModel.getIdOnServer() == -1) {
                    arrayList2.add(obj);
                }
            }
            List<GroupDBModel> itemListWhichNotDeleted3 = this.f25116c.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted3, "getItemListWhichNotDeleted(...)");
            ArrayList<GroupDBModel> arrayList3 = new ArrayList();
            for (Object obj2 : itemListWhichNotDeleted3) {
                GroupDBModel groupDBModel = (GroupDBModel) obj2;
                if (groupDBModel.isShared() && groupDBModel.getIdOnServer() == -1) {
                    arrayList3.add(obj2);
                }
            }
            List<HostDBModel> itemListWhichNotDeleted4 = this.f25117d.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted4, "getItemListWhichNotDeleted(...)");
            ArrayList<HostDBModel> arrayList4 = new ArrayList();
            for (Object obj3 : itemListWhichNotDeleted4) {
                HostDBModel hostDBModel = (HostDBModel) obj3;
                if (hostDBModel.isShared() && hostDBModel.getIdOnServer() == -1) {
                    arrayList4.add(obj3);
                }
            }
            List<TagDBModel> itemListWhichNotDeleted5 = this.f25118e.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted5, "getItemListWhichNotDeleted(...)");
            ArrayList<TagDBModel> arrayList5 = new ArrayList();
            for (Object obj4 : itemListWhichNotDeleted5) {
                TagDBModel tagDBModel = (TagDBModel) obj4;
                if (tagDBModel.isShared() && tagDBModel.getIdOnServer() == -1) {
                    arrayList5.add(obj4);
                }
            }
            List<TagHostDBModel> itemListWhichNotDeleted6 = this.f25119f.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted6, "getItemListWhichNotDeleted(...)");
            ArrayList<TagHostDBModel> arrayList6 = new ArrayList();
            for (Object obj5 : itemListWhichNotDeleted6) {
                TagHostDBModel tagHostDBModel = (TagHostDBModel) obj5;
                if (tagHostDBModel.isShared() && tagHostDBModel.getIdOnServer() == -1) {
                    arrayList6.add(obj5);
                }
            }
            List<ProxyDBModel> itemListWhichNotDeleted7 = this.f25120g.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted7, "getItemListWhichNotDeleted(...)");
            ArrayList<ProxyDBModel> arrayList7 = new ArrayList();
            for (Object obj6 : itemListWhichNotDeleted7) {
                ProxyDBModel proxyDBModel = (ProxyDBModel) obj6;
                if (proxyDBModel.isShared() && proxyDBModel.getIdOnServer() == -1) {
                    arrayList7.add(obj6);
                }
            }
            List<SnippetPackageDBModel> itemListWhichNotDeleted8 = this.f25121h.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted8, "getItemListWhichNotDeleted(...)");
            ArrayList<SnippetPackageDBModel> arrayList8 = new ArrayList();
            for (Object obj7 : itemListWhichNotDeleted8) {
                SnippetPackageDBModel snippetPackageDBModel = (SnippetPackageDBModel) obj7;
                if (snippetPackageDBModel.isShared() && snippetPackageDBModel.getIdOnServer() == -1) {
                    arrayList8.add(obj7);
                }
            }
            List<SnippetDBModel> itemListWhichNotDeleted9 = this.f25122i.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted9, "getItemListWhichNotDeleted(...)");
            ArrayList<SnippetDBModel> arrayList9 = new ArrayList();
            for (Object obj8 : itemListWhichNotDeleted9) {
                SnippetDBModel snippetDBModel = (SnippetDBModel) obj8;
                if (snippetDBModel.isShared() && snippetDBModel.getIdOnServer() == -1) {
                    arrayList9.add(obj8);
                }
            }
            List<IdentityDBModel> itemListWhichNotDeleted10 = this.f25123j.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted10, "getItemListWhichNotDeleted(...)");
            ArrayList<IdentityDBModel> arrayList10 = new ArrayList();
            for (Object obj9 : itemListWhichNotDeleted10) {
                IdentityDBModel identityDBModel = (IdentityDBModel) obj9;
                if (identityDBModel.isShared() && identityDBModel.getIdOnServer() == -1) {
                    arrayList10.add(obj9);
                }
            }
            List<ChainHostsDBModel> itemListWhichNotDeleted11 = this.f25124k.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted11, "getItemListWhichNotDeleted(...)");
            ArrayList<ChainHostsDBModel> arrayList11 = new ArrayList();
            for (Object obj10 : itemListWhichNotDeleted11) {
                long j11 = j10;
                ChainHostsDBModel chainHostsDBModel = (ChainHostsDBModel) obj10;
                if (chainHostsDBModel.isShared() && chainHostsDBModel.getIdOnServer() == j11) {
                    arrayList11.add(obj10);
                }
                j10 = j11;
            }
            long j12 = j10;
            List<SshKeyDBModel> itemListWhichNotDeleted12 = this.f25127n.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted12, "getItemListWhichNotDeleted(...)");
            ArrayList<SshKeyDBModel> arrayList12 = new ArrayList();
            for (Object obj11 : itemListWhichNotDeleted12) {
                SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) obj11;
                if (sshKeyDBModel.isShared() && sshKeyDBModel.getIdOnServer() == j12) {
                    arrayList12.add(obj11);
                }
            }
            List<SshCertificateDBModel> itemListWhichNotDeleted13 = this.f25128o.getItemListWhichNotDeleted();
            ju.t.e(itemListWhichNotDeleted13, "getItemListWhichNotDeleted(...)");
            ArrayList<SshCertificateDBModel> arrayList13 = new ArrayList();
            for (Object obj12 : itemListWhichNotDeleted13) {
                SshCertificateDBModel sshCertificateDBModel = (SshCertificateDBModel) obj12;
                if (sshCertificateDBModel.isShared() && sshCertificateDBModel.getIdOnServer() == j12) {
                    arrayList13.add(obj12);
                }
            }
            int size = arrayList3.size() + arrayList4.size() + arrayList.size() + arrayList2.size() + arrayList5.size() + arrayList6.size() + arrayList7.size() + arrayList9.size() + arrayList10.size() + arrayList11.size() + arrayList12.size() + arrayList13.size();
            ArrayList arrayList14 = new ArrayList(vt.v.z(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList14.add(Long.valueOf(((GroupDBModel) it2.next()).getIdInDatabase()));
            }
            ArrayList arrayList15 = new ArrayList(vt.v.z(arrayList3, 10));
            for (GroupDBModel groupDBModel2 : arrayList3) {
                groupDBModel2.setShared(false);
                if (!arrayList14.contains(groupDBModel2.getParentGroupId())) {
                    groupDBModel2.setParentGroupId(null);
                }
                arrayList15.add(Integer.valueOf(this.f25133t.putItem(groupDBModel2)));
            }
            int iT0 = vt.v.T0(arrayList15);
            ArrayList arrayList16 = new ArrayList(vt.v.z(arrayList4, 10));
            for (HostDBModel hostDBModel2 : arrayList4) {
                hostDBModel2.setShared(false);
                if (!arrayList14.contains(hostDBModel2.getGroupId())) {
                    hostDBModel2.setGroupId(null);
                }
                arrayList16.add(Integer.valueOf(this.f25134u.putItem(hostDBModel2)));
            }
            int iT02 = vt.v.T0(arrayList16);
            ArrayList arrayList17 = new ArrayList(vt.v.z(arrayList, 10));
            for (SshRemoteConfigDBModel sshRemoteConfigDBModel2 : arrayList) {
                sshRemoteConfigDBModel2.setShared(false);
                sshRemoteConfigDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList17.add(Integer.valueOf(this.f25131r.putItem(sshRemoteConfigDBModel2)));
            }
            int iT03 = vt.v.T0(arrayList17);
            ArrayList arrayList18 = new ArrayList(vt.v.z(arrayList2, 10));
            for (TelnetRemoteConfigDBModel telnetRemoteConfigDBModel2 : arrayList2) {
                telnetRemoteConfigDBModel2.setShared(false);
                telnetRemoteConfigDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList18.add(Integer.valueOf(this.f25132s.putItem(telnetRemoteConfigDBModel2)));
            }
            int iT04 = vt.v.T0(arrayList18);
            ArrayList arrayList19 = new ArrayList(vt.v.z(arrayList5, 10));
            for (TagDBModel tagDBModel2 : arrayList5) {
                tagDBModel2.setShared(false);
                tagDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList19.add(Integer.valueOf(this.f25135v.putItem(tagDBModel2)));
            }
            int iT05 = vt.v.T0(arrayList19);
            ArrayList arrayList20 = new ArrayList(vt.v.z(arrayList6, 10));
            for (TagHostDBModel tagHostDBModel2 : arrayList6) {
                tagHostDBModel2.setShared(false);
                tagHostDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList20.add(Integer.valueOf(this.f25136w.putItem(tagHostDBModel2)));
            }
            int iT06 = vt.v.T0(arrayList20);
            ArrayList arrayList21 = new ArrayList(vt.v.z(arrayList7, 10));
            for (ProxyDBModel proxyDBModel2 : arrayList7) {
                proxyDBModel2.setShared(false);
                proxyDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList21.add(Integer.valueOf(this.f25137x.putItem(proxyDBModel2)));
            }
            int iT07 = vt.v.T0(arrayList21);
            ArrayList arrayList22 = new ArrayList(vt.v.z(arrayList8, 10));
            for (SnippetPackageDBModel snippetPackageDBModel2 : arrayList8) {
                snippetPackageDBModel2.setShared(false);
                snippetPackageDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList22.add(Integer.valueOf(this.f25138y.putItem(snippetPackageDBModel2)));
            }
            int iT08 = vt.v.T0(arrayList22);
            ArrayList arrayList23 = new ArrayList(vt.v.z(arrayList9, 10));
            for (SnippetDBModel snippetDBModel2 : arrayList9) {
                snippetDBModel2.setShared(false);
                snippetDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList23.add(Integer.valueOf(this.f25139z.putItem(snippetDBModel2)));
            }
            int iT09 = vt.v.T0(arrayList23);
            ArrayList arrayList24 = new ArrayList(vt.v.z(arrayList10, 10));
            for (IdentityDBModel identityDBModel2 : arrayList10) {
                identityDBModel2.setShared(false);
                identityDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList24.add(Integer.valueOf(this.A.putItem(identityDBModel2)));
            }
            int iT010 = vt.v.T0(arrayList24);
            ArrayList arrayList25 = new ArrayList(vt.v.z(arrayList11, 10));
            for (ChainHostsDBModel chainHostsDBModel2 : arrayList11) {
                chainHostsDBModel2.setShared(false);
                chainHostsDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList25.add(Integer.valueOf(this.B.putItem(chainHostsDBModel2)));
            }
            int iT011 = vt.v.T0(arrayList25);
            ArrayList arrayList26 = new ArrayList(vt.v.z(arrayList12, 10));
            for (SshKeyDBModel sshKeyDBModel2 : arrayList12) {
                sshKeyDBModel2.setShared(false);
                sshKeyDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList26.add(Integer.valueOf(this.E.putItem(sshKeyDBModel2)));
            }
            int iT012 = vt.v.T0(arrayList26);
            ArrayList arrayList27 = new ArrayList(vt.v.z(arrayList13, 10));
            for (SshCertificateDBModel sshCertificateDBModel2 : arrayList13) {
                sshCertificateDBModel2.setShared(false);
                sshCertificateDBModel2.setVaultKeyId(VaultKeyId.Companion.a());
                arrayList27.add(Integer.valueOf(this.F.putItem(sshCertificateDBModel2)));
                iT0 = iT0;
            }
            if (iT0 + iT02 + iT03 + iT04 + iT05 + iT06 + iT07 + iT08 + iT09 + iT010 + iT011 + iT012 + vt.v.T0(arrayList27) != size) {
                y9.a.f86838a.i(new o0());
            }
        } catch (IOException e10) {
            y9.a.f86838a.i(e10);
        }
    }

    public final Long[] R(m1 m1Var, m1 m1Var2, boolean z10) {
        ju.t.f(m1Var, "sharingModel");
        ju.t.f(m1Var2, "fullData");
        HashSet hashSet = new HashSet();
        LongSparseArray longSparseArrayK = m1Var.k();
        int size = longSparseArrayK.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayK.keyAt(i10);
            SshRemoteConfigDBModel sshRemoteConfigDBModel = (SshRemoteConfigDBModel) longSparseArrayK.valueAt(i10);
            ChainHostsDBModel chainHostsDBModelE = E(sshRemoteConfigDBModel.getIdInDatabase(), m1Var2);
            if (chainHostsDBModelE != null) {
                HashSet hashSet2 = H(m1Var, sshRemoteConfigDBModel.getIdInDatabase()) ? new HashSet() : vt.c1.f(Long.valueOf(F(m1Var, sshRemoteConfigDBModel.getIdInDatabase()).getIdInDatabase()));
                ArrayList arrayListD = tp.h.d(chainHostsDBModelE.getChainigHosts());
                ju.t.e(arrayListD, "convertStringToArrayListOfIds(...)");
                ArrayList arrayListW = w(hashSet2, arrayListD, m1Var2);
                if (m1Var.a().indexOfKey(chainHostsDBModelE.getIdInDatabase()) < 0) {
                    Iterator it = arrayListW.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Number) it.next()).longValue();
                        if (z10 && m1Var.c().indexOfKey(jLongValue) < 0) {
                            hashSet.add(Long.valueOf(((HostDBModel) m1Var2.c().get(jLongValue)).getIdInDatabase()));
                        }
                    }
                    m1Var.a().put(chainHostsDBModelE.getIdInDatabase(), chainHostsDBModelE);
                }
            }
        }
        LongSparseArray longSparseArrayC = m1Var.c();
        int size2 = longSparseArrayC.size();
        for (int i11 = 0; i11 < size2; i11++) {
            longSparseArrayC.keyAt(i11);
            HostDBModel hostDBModel = (HostDBModel) longSparseArrayC.valueAt(i11);
            LongSparseArray longSparseArrayA = m1Var2.a();
            int size3 = longSparseArrayA.size();
            for (int i12 = 0; i12 < size3; i12++) {
                longSparseArrayA.keyAt(i12);
                ChainHostsDBModel chainHostsDBModel = (ChainHostsDBModel) longSparseArrayA.valueAt(i12);
                if (tp.h.d(chainHostsDBModel.getChainigHosts()).contains(Long.valueOf(hostDBModel.getIdInDatabase())) && m1Var.a().indexOfKey(chainHostsDBModel.getIdInDatabase()) < 0) {
                    m1Var.a().put(chainHostsDBModel.getIdInDatabase(), chainHostsDBModel);
                }
            }
        }
        return (Long[]) hashSet.toArray(new Long[0]);
    }

    public final m1 S() {
        m1 m1Var = new m1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        List<SshRemoteConfigDBModel> itemListWhichNotDeleted = this.f25114a.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        for (SshRemoteConfigDBModel sshRemoteConfigDBModel : itemListWhichNotDeleted) {
            m1Var.k().put(sshRemoteConfigDBModel.getIdInDatabase(), sshRemoteConfigDBModel);
        }
        List<TelnetRemoteConfigDBModel> itemListWhichNotDeleted2 = this.f25115b.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted2, "getItemListWhichNotDeleted(...)");
        for (TelnetRemoteConfigDBModel telnetRemoteConfigDBModel : itemListWhichNotDeleted2) {
            m1Var.o().put(telnetRemoteConfigDBModel.getIdInDatabase(), telnetRemoteConfigDBModel);
        }
        List<GroupDBModel> itemListWhichNotDeleted3 = this.f25116c.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted3, "getItemListWhichNotDeleted(...)");
        for (GroupDBModel groupDBModel : itemListWhichNotDeleted3) {
            m1Var.b().put(groupDBModel.getIdInDatabase(), groupDBModel);
        }
        List<HostDBModel> itemListWhichNotDeleted4 = this.f25117d.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted4, "getItemListWhichNotDeleted(...)");
        for (HostDBModel hostDBModel : itemListWhichNotDeleted4) {
            m1Var.c().put(hostDBModel.getIdInDatabase(), hostDBModel);
        }
        List<ProxyDBModel> itemListWhichNotDeleted5 = this.f25120g.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted5, "getItemListWhichNotDeleted(...)");
        for (ProxyDBModel proxyDBModel : itemListWhichNotDeleted5) {
            m1Var.f().put(proxyDBModel.getIdInDatabase(), proxyDBModel);
        }
        List<SnippetPackageDBModel> itemListWhichNotDeleted6 = this.f25121h.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted6, "getItemListWhichNotDeleted(...)");
        for (SnippetPackageDBModel snippetPackageDBModel : itemListWhichNotDeleted6) {
            m1Var.e().put(snippetPackageDBModel.getIdInDatabase(), snippetPackageDBModel);
        }
        List<SnippetDBModel> itemListWhichNotDeleted7 = this.f25122i.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted7, "getItemListWhichNotDeleted(...)");
        for (SnippetDBModel snippetDBModel : itemListWhichNotDeleted7) {
            m1Var.i().put(snippetDBModel.getIdInDatabase(), snippetDBModel);
        }
        List<IdentityDBModel> itemListWhichNotDeleted8 = this.f25123j.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted8, "getItemListWhichNotDeleted(...)");
        for (IdentityDBModel identityDBModel : itemListWhichNotDeleted8) {
            m1Var.d().put(identityDBModel.getIdInDatabase(), identityDBModel);
        }
        List<ChainHostsDBModel> itemListWhichNotDeleted9 = this.f25124k.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted9, "getItemListWhichNotDeleted(...)");
        for (ChainHostsDBModel chainHostsDBModel : itemListWhichNotDeleted9) {
            m1Var.a().put(chainHostsDBModel.getIdInDatabase(), chainHostsDBModel);
        }
        List<TagDBModel> itemListWhichNotDeleted10 = this.f25118e.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted10, "getItemListWhichNotDeleted(...)");
        for (TagDBModel tagDBModel : itemListWhichNotDeleted10) {
            m1Var.n().put(tagDBModel.getIdInDatabase(), tagDBModel);
        }
        List<TagHostDBModel> itemListWhichNotDeleted11 = this.f25119f.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted11, "getItemListWhichNotDeleted(...)");
        for (TagHostDBModel tagHostDBModel : itemListWhichNotDeleted11) {
            m1Var.m().put(tagHostDBModel.getIdInDatabase(), tagHostDBModel);
        }
        List<SharedSshConfigIdentityDBModel> itemListWhichNotDeleted12 = this.f25125l.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted12, "getItemListWhichNotDeleted(...)");
        for (SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel : itemListWhichNotDeleted12) {
            m1Var.g().put(sharedSshConfigIdentityDBModel.getIdInDatabase(), sharedSshConfigIdentityDBModel);
        }
        List<SharedTelnetConfigIdentityDBModel> itemListWhichNotDeleted13 = this.f25126m.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted13, "getItemListWhichNotDeleted(...)");
        for (SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel : itemListWhichNotDeleted13) {
            m1Var.h().put(sharedTelnetConfigIdentityDBModel.getIdInDatabase(), sharedTelnetConfigIdentityDBModel);
        }
        List<SshKeyDBModel> itemListWhichNotDeleted14 = this.f25127n.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted14, "getItemListWhichNotDeleted(...)");
        for (SshKeyDBModel sshKeyDBModel : itemListWhichNotDeleted14) {
            m1Var.l().put(sshKeyDBModel.getIdInDatabase(), sshKeyDBModel);
        }
        List<SshCertificateDBModel> itemListWhichNotDeleted15 = this.f25128o.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted15, "getItemListWhichNotDeleted(...)");
        for (SshCertificateDBModel sshCertificateDBModel : itemListWhichNotDeleted15) {
            m1Var.j().put(sshCertificateDBModel.getIdInDatabase(), sshCertificateDBModel);
        }
        return m1Var;
    }

    public final void T(GroupDBModel groupDBModel, m1 m1Var, m1 m1Var2) {
        ju.t.f(groupDBModel, HostBulk.GROUP_ID_SERIAL_NAME);
        ju.t.f(m1Var, "sharingModel");
        ju.t.f(m1Var2, "fullData");
        if (m1Var.b().indexOfKey(groupDBModel.getIdInDatabase()) < 0) {
            m1Var.b().put(groupDBModel.getIdInDatabase(), groupDBModel);
            if (groupDBModel.getSshConfigId() != null) {
                LongSparseArray longSparseArrayK = m1Var2.k();
                Long sshConfigId = groupDBModel.getSshConfigId();
                ju.t.e(sshConfigId, "getSshConfigId(...)");
                SshRemoteConfigDBModel sshRemoteConfigDBModel = (SshRemoteConfigDBModel) longSparseArrayK.get(sshConfigId.longValue());
                if (sshRemoteConfigDBModel != null) {
                    a0(sshRemoteConfigDBModel, m1Var, m1Var2);
                }
            }
            if (groupDBModel.getTelnetConfigId() != null) {
                LongSparseArray longSparseArrayO = m1Var2.o();
                Long telnetConfigId = groupDBModel.getTelnetConfigId();
                ju.t.e(telnetConfigId, "getTelnetConfigId(...)");
                TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = (TelnetRemoteConfigDBModel) longSparseArrayO.get(telnetConfigId.longValue());
                if (telnetRemoteConfigDBModel != null) {
                    d0(telnetRemoteConfigDBModel, m1Var, m1Var2);
                }
            }
        }
        LongSparseArray longSparseArrayC = m1Var2.c();
        int size = longSparseArrayC.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayC.keyAt(i10);
            HostDBModel hostDBModel = (HostDBModel) longSparseArrayC.valueAt(i10);
            Long groupId = hostDBModel.getGroupId();
            long idInDatabase = groupDBModel.getIdInDatabase();
            if (groupId != null && groupId.longValue() == idInDatabase) {
                U(hostDBModel, m1Var, m1Var2);
            }
        }
        LongSparseArray longSparseArrayB = m1Var2.b();
        int size2 = longSparseArrayB.size();
        for (int i11 = 0; i11 < size2; i11++) {
            longSparseArrayB.keyAt(i11);
            GroupDBModel groupDBModel2 = (GroupDBModel) longSparseArrayB.valueAt(i11);
            Long parentGroupId = groupDBModel2.getParentGroupId();
            long idInDatabase2 = groupDBModel.getIdInDatabase();
            if (parentGroupId != null && parentGroupId.longValue() == idInDatabase2) {
                T(groupDBModel2, m1Var, m1Var2);
            }
        }
    }

    public final void X(SnippetPackageDBModel snippetPackageDBModel, m1 m1Var, m1 m1Var2) {
        ju.t.f(snippetPackageDBModel, "packageDBModel");
        ju.t.f(m1Var, "sharingModel");
        ju.t.f(m1Var2, "fullData");
        if (m1Var.e().indexOfKey(snippetPackageDBModel.getIdInDatabase()) < 0) {
            m1Var.e().put(snippetPackageDBModel.getIdInDatabase(), snippetPackageDBModel);
        }
        LongSparseArray longSparseArrayI = m1Var2.i();
        int size = longSparseArrayI.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArrayI.keyAt(i10);
            SnippetDBModel snippetDBModel = (SnippetDBModel) longSparseArrayI.valueAt(i10);
            Long packageId = snippetDBModel.getPackageId();
            long idInDatabase = snippetPackageDBModel.getIdInDatabase();
            if (packageId != null && packageId.longValue() == idInDatabase) {
                Z(snippetDBModel, m1Var, m1Var2);
            }
        }
    }

    public final void e0(final m1 m1Var) {
        ju.t.f(m1Var, "fullData");
        List<TagHostDBModel> listB = l1.b(m1Var.m(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.e1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.f0(m1Var, (TagHostDBModel) obj));
            }
        });
        List<TagDBModel> listB2 = l1.b(m1Var.n(), new iu.l() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.f1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k1.h0(m1Var, (TagDBModel) obj));
            }
        });
        for (TagHostDBModel tagHostDBModel : listB) {
            tagHostDBModel.setShared(false);
            this.f25136w.putItem(tagHostDBModel);
        }
        for (TagDBModel tagDBModel : listB2) {
            tagDBModel.setShared(false);
            this.f25135v.putItem(tagDBModel);
        }
    }

    public final void k0(GroupDBModel groupDBModel, boolean z10) {
        ju.t.f(groupDBModel, "updatedGroup");
        m1 m1VarS = S();
        GroupDBModel groupDBModel2 = (GroupDBModel) m1VarS.b().get(groupDBModel.getIdInDatabase());
        if (groupDBModel2 != null) {
            m1 m1Var = new m1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            T(groupDBModel2, m1Var, m1VarS);
            x(m1VarS, m1Var);
            R(m1Var, m1VarS, z10);
            j0(m1Var, z10);
            e0(S());
        }
    }

    public /* synthetic */ k1(SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, HostsDBAdapter hostsDBAdapter, TagDBAdapter tagDBAdapter, TagHostDBAdapter tagHostDBAdapter, ProxyDBAdapter proxyDBAdapter, SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetDBAdapter snippetDBAdapter, IdentityDBAdapter identityDBAdapter, ChainHostsDBAdapter chainHostsDBAdapter, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, SshCertificateDBAdapter sshCertificateDBAdapter, KnownHostsDBAdapter knownHostsDBAdapter, PFRulesDBAdapter pFRulesDBAdapter, SshConfigApiAdapter sshConfigApiAdapter, TelnetConfigApiAdapter telnetConfigApiAdapter, GroupApiAdapter groupApiAdapter, HostsApiAdapter hostsApiAdapter, TagApiAdapter tagApiAdapter, TagHostApiAdapter tagHostApiAdapter, ProxyApiAdapter proxyApiAdapter, SnippetPackageApiAdapter snippetPackageApiAdapter, SnippetApiAdapter snippetApiAdapter, IdentityApiAdapter identityApiAdapter, ChainHostApiAdapter chainHostApiAdapter, SharedSshConfigIdentityApiAdapter sharedSshConfigIdentityApiAdapter, SharedTelnetConfigIdentityApiAdapter sharedTelnetConfigIdentityApiAdapter, SshKeyApiAdapter sshKeyApiAdapter, SshCertificateApiAdapter sshCertificateApiAdapter, KnownHostsApiAdapter knownHostsApiAdapter, PFApiAdapter pFApiAdapter, int i10, int i11, ju.k kVar) {
        this((i10 & 1) != 0 ? hg.f.p().S() : sshConfigDBAdapter, (i10 & 2) != 0 ? hg.f.p().e0() : telnetConfigDBAdapter, (i10 & 4) != 0 ? hg.f.p().h() : groupDBAdapter, (i10 & 8) != 0 ? hg.f.p().i() : hostsDBAdapter, (i10 & 16) != 0 ? hg.f.p().a0() : tagDBAdapter, (i10 & 32) != 0 ? hg.f.p().c0() : tagHostDBAdapter, (i10 & 64) != 0 ? hg.f.p().B() : proxyDBAdapter, (i10 & 128) != 0 ? hg.f.p().O() : snippetPackageDBAdapter, (i10 & 256) != 0 ? hg.f.p().J() : snippetDBAdapter, (i10 & File.FLAG_O_TRUNC) != 0 ? hg.f.p().n() : identityDBAdapter, (i10 & File.FLAG_O_APPEND) != 0 ? hg.f.p().c() : chainHostsDBAdapter, (i10 & 2048) != 0 ? hg.f.p().E() : sharedSshConfigIdentityDBAdapter, (i10 & 4096) != 0 ? hg.f.p().G() : sharedTelnetConfigIdentityDBAdapter, (i10 & 8192) != 0 ? hg.f.p().W() : sshKeyDBAdapter, (i10 & 16384) != 0 ? hg.f.p().Q() : sshCertificateDBAdapter, (i10 & 32768) != 0 ? hg.f.p().r() : knownHostsDBAdapter, (i10 & LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE) != 0 ? hg.f.p().z() : pFRulesDBAdapter, (i10 & 131072) != 0 ? hg.f.p().R() : sshConfigApiAdapter, (i10 & 262144) != 0 ? hg.f.p().d0() : telnetConfigApiAdapter, (i10 & 524288) != 0 ? hg.f.p().g() : groupApiAdapter, (i10 & 1048576) != 0 ? hg.f.p().l() : hostsApiAdapter, (i10 & 2097152) != 0 ? hg.f.p().Z() : tagApiAdapter, (i10 & 4194304) != 0 ? hg.f.p().b0() : tagHostApiAdapter, (i10 & 8388608) != 0 ? hg.f.p().A() : proxyApiAdapter, (i10 & 16777216) != 0 ? hg.f.p().N() : snippetPackageApiAdapter, (i10 & 33554432) != 0 ? hg.f.p().I() : snippetApiAdapter, (i10 & 67108864) != 0 ? hg.f.p().m() : identityApiAdapter, (i10 & 134217728) != 0 ? hg.f.p().b() : chainHostApiAdapter, (i10 & 268435456) != 0 ? hg.f.p().D() : sharedSshConfigIdentityApiAdapter, (i10 & 536870912) != 0 ? hg.f.p().F() : sharedTelnetConfigIdentityApiAdapter, (i10 & 1073741824) != 0 ? hg.f.p().V() : sshKeyApiAdapter, (i10 & RtlSpacingHelper.UNDEFINED) != 0 ? hg.f.p().P() : sshCertificateApiAdapter, (i11 & 1) != 0 ? hg.f.p().q() : knownHostsApiAdapter, (i11 & 2) != 0 ? hg.f.p().y() : pFApiAdapter);
    }
}
