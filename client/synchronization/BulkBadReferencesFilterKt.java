package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulk;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkBadReferencesFilterKt {
    public static final void checkChainHostLocalReferences(ChainHostBulk chainHostBulk, ChainHostsDBAdapter chainHostsDBAdapter, Iterator<ChainHostBulk> it, List<? extends SshConfigBulk> list) {
        int i10;
        t.f(chainHostBulk, "chainHost");
        t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        t.f(it, "iterator");
        t.f(list, "sshConfigs");
        ChainHostsDBModel chainHostsDBModel = getChainHostsDBModel(chainHostBulk, chainHostsDBAdapter);
        boolean z10 = false;
        if (chainHostBulk.getSshConfigId() instanceof String) {
            Object sshConfigId = chainHostBulk.getSshConfigId();
            t.d(sshConfigId, "null cannot be cast to non-null type kotlin.String");
            long localId = parseLocalId((String) sshConfigId);
            if (list == null || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    Long localId2 = ((SshConfigBulk) it2.next()).getLocalId();
                    if (localId2 != null && localId2.longValue() == localId && (i10 = i10 + 1) < 0) {
                        v.x();
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                it.remove();
                z10 = true;
            }
        }
        if (!z10 || chainHostsDBModel == null) {
            return;
        }
        chainHostsDBAdapter.removeItemByLocalId(chainHostsDBModel.getIdInDatabase());
    }

    public static final void checkChainHostsLocalReferences(List<ChainHostBulk> list, List<? extends SshConfigBulk> list2, ChainHostsDBAdapter chainHostsDBAdapter) {
        t.f(list, "chainHosts");
        t.f(list2, "sshConfigs");
        t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        Iterator<ChainHostBulk> it = list.iterator();
        while (it.hasNext()) {
            checkChainHostLocalReferences(it.next(), chainHostsDBAdapter, it, list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkGroupLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk r10, com.server.auditor.ssh.client.database.adapters.GroupDBAdapter r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk> r13, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk> r14) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkGroupLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk, com.server.auditor.ssh.client.database.adapters.GroupDBAdapter, java.util.List, java.util.List, java.util.List):void");
    }

    public static final void checkGroupsLocalReferences(List<? extends GroupBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, GroupDBAdapter groupDBAdapter) {
        t.f(list, "groups");
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(groupDBAdapter, "groupDBAdapter");
        Iterator<? extends GroupBulk> it = list.iterator();
        while (it.hasNext()) {
            checkGroupLocalReferences(it.next(), groupDBAdapter, list2, list3, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk r10, com.server.auditor.ssh.client.database.adapters.HostsDBAdapter r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk> r13, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk> r14) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk, com.server.auditor.ssh.client.database.adapters.HostsDBAdapter, java.util.List, java.util.List, java.util.List):void");
    }

    public static final void checkHostsLocalReferences(List<? extends HostBulk> list, List<? extends SshConfigBulk> list2, List<? extends TelnetConfigBulk> list3, List<? extends GroupBulk> list4, HostsDBAdapter hostsDBAdapter) {
        t.f(list, Table.HOSTS);
        t.f(list2, "sshConfigs");
        t.f(list3, "telnetConfigs");
        t.f(list4, "groups");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        Iterator<? extends HostBulk> it = list.iterator();
        while (it.hasNext()) {
            checkHostLocalReferences(it.next(), hostsDBAdapter, list2, list3, list4);
        }
    }

    public static final void checkIdentitiesLocalReferences(List<? extends IdentityBulk> list, List<? extends SshKeyBulk> list2, IdentityDBAdapter identityDBAdapter) {
        t.f(list, "identities");
        t.f(list2, "sshKeys");
        t.f(identityDBAdapter, "identityDBAdapter");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            checkIdentityLocalReferences((IdentityBulk) it.next(), identityDBAdapter, list2);
        }
    }

    public static final void checkIdentityLocalReferences(IdentityBulk identityBulk, IdentityDBAdapter identityDBAdapter, List<? extends SshKeyBulk> list) {
        int i10;
        t.f(identityBulk, "identityBulk");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(list, "sshKeys");
        IdentityDBModel identityDBModel = getIdentityDBModel(identityBulk, identityDBAdapter);
        boolean z10 = false;
        if (identityBulk.getSshKeyId() instanceof String) {
            Object sshKeyId = identityBulk.getSshKeyId();
            t.d(sshKeyId, "null cannot be cast to non-null type kotlin.String");
            long localId = parseLocalId((String) sshKeyId);
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    Long localId2 = ((SshKeyBulk) it.next()).getLocalId();
                    if (localId2 != null && localId2.longValue() == localId && (i10 = i10 + 1) < 0) {
                        v.x();
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                identityBulk.clearSshKeyId();
                if (identityDBModel != null) {
                    identityDBModel.setSshKeyId(null);
                }
                z10 = true;
            }
        }
        if (!z10 || identityDBModel == null) {
            return;
        }
        identityDBAdapter.editByLocalId(identityDBModel.getIdInDatabase(), identityDBModel);
    }

    public static final void checkPortForwardingRuleLocalReferences(RuleBulk ruleBulk, PFRulesDBAdapter pFRulesDBAdapter, List<? extends HostBulk> list, Iterator<? extends RuleBulk> it) {
        int i10;
        t.f(ruleBulk, "ruleBulk");
        t.f(pFRulesDBAdapter, "ruleDBAdapter");
        t.f(list, Table.HOSTS);
        t.f(it, "iterator");
        RuleDBModel ruleDBModel = getRuleDBModel(ruleBulk, pFRulesDBAdapter);
        boolean z10 = false;
        if (ruleBulk.getServerId() instanceof String) {
            Object serverId = ruleBulk.getServerId();
            t.d(serverId, "null cannot be cast to non-null type kotlin.String");
            long localId = parseLocalId((String) serverId);
            if (list == null || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    Long localId2 = ((HostBulk) it2.next()).getLocalId();
                    if (localId2 != null && localId2.longValue() == localId && (i10 = i10 + 1) < 0) {
                        v.x();
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                it.remove();
                z10 = true;
            }
        }
        if (!z10 || ruleDBModel == null) {
            return;
        }
        pFRulesDBAdapter.removeItemByLocalId(ruleDBModel.getIdInDatabase());
    }

    public static final void checkPortForwardingRulesLocalReferences(List<RuleBulk> list, List<? extends HostBulk> list2, PFRulesDBAdapter pFRulesDBAdapter) {
        t.f(list, "pfRules");
        t.f(list2, Table.HOSTS);
        t.f(pFRulesDBAdapter, "ruleDBAdapter");
        Iterator<RuleBulk> it = list.iterator();
        while (it.hasNext()) {
            checkPortForwardingRuleLocalReferences(it.next(), pFRulesDBAdapter, list2, it);
        }
    }

    public static final void checkProxiesLocalReferences(List<? extends ProxyBulk> list, List<? extends IdentityBulk> list2, ProxyDBAdapter proxyDBAdapter) {
        t.f(list, "proxies");
        t.f(list2, "identities");
        t.f(proxyDBAdapter, "proxyDBAdapter");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            checkProxyLocalReferences((ProxyBulk) it.next(), proxyDBAdapter, list2);
        }
    }

    public static final void checkProxyLocalReferences(ProxyBulk proxyBulk, ProxyDBAdapter proxyDBAdapter, List<? extends IdentityBulk> list) {
        int i10;
        t.f(proxyBulk, Table.PROXY);
        t.f(proxyDBAdapter, "proxyDBAdapter");
        t.f(list, "identities");
        ProxyDBModel proxyDBModel = getProxyDBModel(proxyBulk, proxyDBAdapter);
        boolean z10 = false;
        if (proxyBulk.getIdentityId() instanceof String) {
            Object identityId = proxyBulk.getIdentityId();
            t.d(identityId, "null cannot be cast to non-null type kotlin.String");
            long localId = parseLocalId((String) identityId);
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    Long localId2 = ((IdentityBulk) it.next()).getLocalId();
                    if (localId2 != null && localId2.longValue() == localId && (i10 = i10 + 1) < 0) {
                        v.x();
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                proxyBulk.setIdentityId(null);
                if (proxyDBModel != null) {
                    proxyDBModel.setIdentityId(null);
                }
                z10 = true;
            }
        }
        if (!z10 || proxyDBModel == null) {
            return;
        }
        proxyDBAdapter.editByLocalId(proxyDBModel.getIdInDatabase(), proxyDBModel);
    }

    public static final void checkSharedSshConfigIdentitiesLocalReferences(List<SharedSshConfigIdentityBulk> list, List<? extends SshConfigBulk> list2, List<? extends IdentityBulk> list3, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter) {
        t.f(list, "sharedSshConfigIdentities");
        t.f(list2, "sshConfigs");
        t.f(list3, "identities");
        t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        Iterator<SharedSshConfigIdentityBulk> it = list.iterator();
        while (it.hasNext()) {
            checkSharedSshConfigIdentityLocalReference(it.next(), sharedSshConfigIdentityDBAdapter, it, list2, list3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkSharedSshConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk r6, com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter r7, java.util.Iterator<com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk> r8, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk> r9, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk> r10) {
        /*
            java.lang.String r0 = "sharedSshConfigIdentity"
            ju.t.f(r6, r0)
            java.lang.String r0 = "sharedSshConfigIdentityDBAdapter"
            ju.t.f(r7, r0)
            java.lang.String r0 = "iterator"
            ju.t.f(r8, r0)
            java.lang.String r0 = "sshConfigs"
            ju.t.f(r9, r0)
            java.lang.String r0 = "identities"
            ju.t.f(r10, r0)
            com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel r0 = getSharedSshConfigIdentityDBModel(r6, r7)
            java.lang.Object r1 = r6.getIdentityId()
            boolean r1 = r1 instanceof java.lang.String
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r3 = 1
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r6.getIdentityId()
            ju.t.d(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            long r4 = parseLocalId(r1)
            boolean r10 = isNotFoundIdentityId(r10, r4)
            if (r10 == 0) goto L44
        L3b:
            r10 = r3
            goto L45
        L3d:
            java.lang.Object r10 = r6.getIdentityId()
            if (r10 != 0) goto L44
            goto L3b
        L44:
            r10 = 0
        L45:
            java.lang.Object r1 = r6.getSshConfigId()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L61
            java.lang.Object r6 = r6.getSshConfigId()
            ju.t.d(r6, r2)
            java.lang.String r6 = (java.lang.String) r6
            long r1 = parseLocalId(r6)
            boolean r6 = isNotFoundSshConfigId(r9, r1)
            if (r6 == 0) goto L68
            goto L69
        L61:
            java.lang.Object r6 = r6.getSshConfigId()
            if (r6 != 0) goto L68
            goto L69
        L68:
            r3 = r10
        L69:
            if (r3 == 0) goto L77
            if (r0 == 0) goto L77
            r8.remove()
            long r8 = r0.getIdInDatabase()
            r7.removeItemByLocalId(r8)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkSharedSshConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk, com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter, java.util.Iterator, java.util.List, java.util.List):void");
    }

    public static final void checkSharedTelnetConfigIdentitiesLocalReferences(List<SharedTelnetConfigIdentityBulk> list, List<? extends TelnetConfigBulk> list2, List<? extends IdentityBulk> list3, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter) {
        t.f(list, "sharedTelnetConfigIdentities");
        t.f(list2, "telnetConfigs");
        t.f(list3, "identities");
        t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        Iterator<SharedTelnetConfigIdentityBulk> it = list.iterator();
        while (it.hasNext()) {
            checkSharedTelnetConfigIdentityLocalReference(it.next(), sharedTelnetConfigIdentityDBAdapter, it, list2, list3);
        }
    }

    public static final void checkSharedTelnetConfigIdentityLocalReference(SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, Iterator<SharedTelnetConfigIdentityBulk> it, List<? extends TelnetConfigBulk> list, List<? extends IdentityBulk> list2) {
        t.f(sharedTelnetConfigIdentityBulk, "sharedTelnetConfigIdentity");
        t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        t.f(it, "iterator");
        t.f(list, "telnetConfigs");
        t.f(list2, "identities");
        SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = getSharedTelnetConfigIdentityDBModel(sharedTelnetConfigIdentityBulk, sharedTelnetConfigIdentityDBAdapter);
        Object identityId = sharedTelnetConfigIdentityBulk.getIdentityId();
        boolean z10 = true;
        boolean z11 = !(identityId instanceof String) ? identityId != null : !isNotFoundIdentityId(list2, parseLocalId((String) identityId));
        Object telnetConfigId = sharedTelnetConfigIdentityBulk.getTelnetConfigId();
        if (!(telnetConfigId instanceof String) ? telnetConfigId != null : !isNotFoundTelnetConfigId(list, parseLocalId((String) telnetConfigId))) {
            z10 = z11;
        }
        if (!z10 || sharedTelnetConfigIdentityDBModel == null) {
            return;
        }
        it.remove();
        sharedTelnetConfigIdentityDBAdapter.removeItemByLocalId(sharedTelnetConfigIdentityDBModel.getIdInDatabase());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkSnippetHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk r9, com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter r10, java.util.Iterator<com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk> r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk> r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkSnippetHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk, com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter, java.util.Iterator, java.util.List, java.util.List):void");
    }

    public static final void checkSnippetHostsLocalReferences(List<SnippetHostBulk> list, List<? extends HostBulk> list2, List<? extends SnippetBulk> list3, SnippetHostDBAdapter snippetHostDBAdapter) {
        t.f(list, "snippetHosts");
        t.f(list2, Table.HOSTS);
        t.f(list3, "snippets");
        t.f(snippetHostDBAdapter, "snippetHostDBAdapter");
        Iterator<SnippetHostBulk> it = list.iterator();
        while (it.hasNext()) {
            checkSnippetHostLocalReferences(it.next(), snippetHostDBAdapter, it, list2, list3);
        }
    }

    public static final void checkSshConfigIdentitiesLocalReferences(List<SshConfigIdentityBulk> list, List<? extends SshConfigBulk> list2, List<? extends IdentityBulk> list3, SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter) {
        t.f(list, "sshConfigIdentities");
        t.f(list2, "sshConfigs");
        t.f(list3, "identities");
        t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
        Iterator<SshConfigIdentityBulk> it = list.iterator();
        while (it.hasNext()) {
            checkSshConfigIdentityLocalReference(it.next(), sshConfigIdentityDBAdapter, it, list2, list3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkSshConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk r9, com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter r10, java.util.Iterator<com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk> r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk> r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkSshConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk, com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter, java.util.Iterator, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkSshConfigLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk r10, com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk> r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkSshConfigLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk, com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter, java.util.List, java.util.List):void");
    }

    public static final void checkSshConfigsLocalReferences(List<? extends SshConfigBulk> list, List<? extends ProxyBulk> list2, List<? extends SnippetBulk> list3, SshConfigDBAdapter sshConfigDBAdapter) {
        t.f(list, "sshConfigs");
        t.f(list2, "proxies");
        t.f(list3, "snippets");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        Iterator<? extends SshConfigBulk> it = list.iterator();
        while (it.hasNext()) {
            checkSshConfigLocalReferences(it.next(), sshConfigDBAdapter, list3, list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkTagHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk r9, com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter r10, java.util.Iterator<com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk> r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulk> r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkTagHostLocalReferences(com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk, com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter, java.util.Iterator, java.util.List, java.util.List):void");
    }

    public static final void checkTagHostsLocalReferences(List<TagHostBulk> list, List<? extends HostBulk> list2, List<? extends TagBulk> list3, TagHostDBAdapter tagHostDBAdapter) {
        t.f(list, "tagHosts");
        t.f(list2, Table.HOSTS);
        t.f(list3, Table.TAG);
        t.f(tagHostDBAdapter, "tagHostDBAdapter");
        Iterator<TagHostBulk> it = list.iterator();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            checkTagHostLocalReferences((TagHostBulk) it2.next(), tagHostDBAdapter, it, list2, list3);
        }
    }

    public static final void checkTelnetConfigIdentitiesLocalReferences(List<TelnetConfigIdentityBulk> list, List<? extends TelnetConfigBulk> list2, List<? extends IdentityBulk> list3, TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter) {
        t.f(list, "telnetConfigIdentities");
        t.f(list2, "telnetConfigs");
        t.f(list3, "identities");
        t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
        Iterator<TelnetConfigIdentityBulk> it = list.iterator();
        while (it.hasNext()) {
            checkTelnetConfigIdentityLocalReference(it.next(), telnetConfigIdentityDBAdapter, it, list2, list3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkTelnetConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk r9, com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter r10, java.util.Iterator<com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk> r11, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk> r12, java.util.List<? extends com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk> r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.BulkBadReferencesFilterKt.checkTelnetConfigIdentityLocalReference(com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk, com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter, java.util.Iterator, java.util.List, java.util.List):void");
    }

    public static final ChainHostsDBModel getChainHostsDBModel(ChainHostBulk chainHostBulk, ChainHostsDBAdapter chainHostsDBAdapter) {
        t.f(chainHostBulk, "chainHost");
        t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        Long localId = chainHostBulk.getLocalId();
        if (localId != null) {
            return chainHostsDBAdapter.getItemByLocalId(localId.longValue());
        }
        return null;
    }

    public static final GroupDBModel getGroupDBModel(GroupBulk groupBulk, GroupDBAdapter groupDBAdapter) {
        t.f(groupBulk, "groupBulk");
        t.f(groupDBAdapter, "groupDBAdapter");
        Long remoteId = groupBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return groupDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = groupBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = groupBulk.getLocalId();
        return groupDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final HostDBModel getHostDBModel(HostBulk hostBulk, HostsDBAdapter hostsDBAdapter) {
        t.f(hostBulk, "hostBulk");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        Long remoteId = hostBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return hostsDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = hostBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = hostBulk.getLocalId();
        return hostsDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final IdentityDBModel getIdentityDBModel(IdentityBulk identityBulk, IdentityDBAdapter identityDBAdapter) {
        t.f(identityBulk, "identityBulk");
        t.f(identityDBAdapter, "identityDBAdapter");
        Long remoteId = identityBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return identityDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = identityBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = identityBulk.getLocalId();
        return identityDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final ProxyDBModel getProxyDBModel(ProxyBulk proxyBulk, ProxyDBAdapter proxyDBAdapter) {
        t.f(proxyBulk, Table.PROXY);
        t.f(proxyDBAdapter, "proxyDBAdapter");
        Long remoteId = proxyBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return proxyDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = proxyBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = proxyBulk.getLocalId();
        return proxyDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final RuleDBModel getRuleDBModel(RuleBulk ruleBulk, PFRulesDBAdapter pFRulesDBAdapter) {
        t.f(ruleBulk, "ruleBulk");
        t.f(pFRulesDBAdapter, "ruleDBAdapter");
        Long remoteId = ruleBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return pFRulesDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = ruleBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = ruleBulk.getLocalId();
        return pFRulesDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final SharedSshConfigIdentityDBModel getSharedSshConfigIdentityDBModel(SharedSshConfigIdentityBulk sharedSshConfigIdentityBulk, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter) {
        t.f(sharedSshConfigIdentityBulk, "sharedSshConfigIdentity");
        t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        long jLongValue = sharedSshConfigIdentityBulk.getRemoteId().longValue();
        if (jLongValue != 0) {
            return sharedSshConfigIdentityDBAdapter.getItemByRemoteId(jLongValue);
        }
        Long localId = sharedSshConfigIdentityBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = sharedSshConfigIdentityBulk.getLocalId();
        return sharedSshConfigIdentityDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final SharedTelnetConfigIdentityDBModel getSharedTelnetConfigIdentityDBModel(SharedTelnetConfigIdentityBulk sharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter) {
        t.f(sharedTelnetConfigIdentityBulk, "sharedTelnetConfigIdentity");
        t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        long jLongValue = sharedTelnetConfigIdentityBulk.getRemoteId().longValue();
        if (jLongValue != 0) {
            return sharedTelnetConfigIdentityDBAdapter.getItemByRemoteId(jLongValue);
        }
        Long localId = sharedTelnetConfigIdentityBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = sharedTelnetConfigIdentityBulk.getLocalId();
        return sharedTelnetConfigIdentityDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final SnippetHostDBModel getSnippetHostDBModel(SnippetHostBulk snippetHostBulk, SnippetHostDBAdapter snippetHostDBAdapter) {
        t.f(snippetHostBulk, "snippetHost");
        t.f(snippetHostDBAdapter, "snippetHostDBAdapter");
        Long localId = snippetHostBulk.getLocalId();
        if (localId != null) {
            return snippetHostDBAdapter.getItemByLocalId(localId.longValue());
        }
        return null;
    }

    public static final SshConfigIdentityDBModel getSshConfigIdentityDBModel(SshConfigIdentityBulk sshConfigIdentityBulk, SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter) {
        t.f(sshConfigIdentityBulk, "sshConfigIdentity");
        t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
        Long remoteId = sshConfigIdentityBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return sshConfigIdentityDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = sshConfigIdentityBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = sshConfigIdentityBulk.getLocalId();
        return sshConfigIdentityDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final SshRemoteConfigDBModel getSshRemoteConfigDBModel(SshConfigBulk sshConfigBulk, SshConfigDBAdapter sshConfigDBAdapter) {
        t.f(sshConfigBulk, "sshConfig");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        Long remoteId = sshConfigBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return sshConfigDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = sshConfigBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = sshConfigBulk.getLocalId();
        return sshConfigDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final TagHostDBModel getTagHostDBModel(TagHostBulk tagHostBulk, TagHostDBAdapter tagHostDBAdapter) {
        t.f(tagHostBulk, "tagHost");
        t.f(tagHostDBAdapter, "tagHostDBAdapter");
        Long localId = tagHostBulk.getLocalId();
        if (localId != null) {
            return tagHostDBAdapter.getItemByLocalId(localId.longValue());
        }
        return null;
    }

    public static final TelnetConfigIdentityDBModel getTelnetConfigIdentityDBModel(TelnetConfigIdentityBulk telnetConfigIdentityBulk, TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter) {
        t.f(telnetConfigIdentityBulk, "telnetConfigIdentity");
        t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
        Long remoteId = telnetConfigIdentityBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return telnetConfigIdentityDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = telnetConfigIdentityBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = telnetConfigIdentityBulk.getLocalId();
        return telnetConfigIdentityDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final TelnetRemoteConfigDBModel getTelnetRemoteConfigDBModel(TelnetConfigBulk telnetConfigBulk, TelnetConfigDBAdapter telnetConfigDBAdapter) {
        t.f(telnetConfigBulk, "telnetConfig");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        Long remoteId = telnetConfigBulk.getRemoteId();
        if (remoteId != null && remoteId.longValue() != 0) {
            return telnetConfigDBAdapter.getItemByRemoteId(remoteId.longValue());
        }
        Long localId = telnetConfigBulk.getLocalId();
        if (localId != null && localId.longValue() == 0) {
            return null;
        }
        Long localId2 = telnetConfigBulk.getLocalId();
        return telnetConfigDBAdapter.getItemByLocalId(localId2 != null ? localId2.longValue() : 0L);
    }

    public static final <T> boolean isNotFound(Iterable<? extends T> iterable, iu.l lVar) {
        int i10;
        t.f(iterable, "<this>");
        t.f(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            i10 = 0;
        } else {
            Iterator<? extends T> it = iterable.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((Boolean) lVar.invoke(it.next())).booleanValue() && (i10 = i10 + 1) < 0) {
                    v.x();
                }
            }
        }
        return i10 == 0;
    }

    private static final boolean isNotFoundIdentityId(List<? extends IdentityBulk> list, long j10) {
        int i10;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                Long localId = ((IdentityBulk) it.next()).getLocalId();
                if (localId != null && localId.longValue() == j10 && (i10 = i10 + 1) < 0) {
                    v.x();
                }
            }
        } else {
            i10 = 0;
        }
        return i10 == 0;
    }

    private static final boolean isNotFoundSshConfigId(List<? extends SshConfigBulk> list, long j10) {
        int i10;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                Long localId = ((SshConfigBulk) it.next()).getLocalId();
                if (localId != null && localId.longValue() == j10 && (i10 = i10 + 1) < 0) {
                    v.x();
                }
            }
        } else {
            i10 = 0;
        }
        return i10 == 0;
    }

    private static final boolean isNotFoundTelnetConfigId(List<? extends TelnetConfigBulk> list, long j10) {
        int i10;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                Long localId = ((TelnetConfigBulk) it.next()).getLocalId();
                if (localId != null && localId.longValue() == j10 && (i10 = i10 + 1) < 0) {
                    v.x();
                }
            }
        } else {
            i10 = 0;
        }
        return i10 == 0;
    }

    public static final long parseLocalId(String str) {
        t.f(str, "stringId");
        String strSubstring = str.substring(su.s.p0(str, '/', 0, false, 6, null) + 1);
        t.e(strSubstring, "substring(...)");
        Long lX = su.s.x(strSubstring);
        if (lX != null) {
            return lX.longValue();
        }
        return -1L;
    }
}
