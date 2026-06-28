package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.pfrule.PortForwardingRuleContent;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.f;
import io.sentry.h7;
import java.util.Iterator;
import ju.n0;
import ju.t;
import mv.b;
import np.k;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeRule extends BulkDataMergeService<RuleFullData> {
    public static final int $stable = 8;
    private final HostsDBAdapter hostsDBAdapter;
    private final b jsonConverter;
    private final PFRulesDBAdapter portForwardingRulesDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeRule(h hVar, v vVar, HostsDBAdapter hostsDBAdapter, PFRulesDBAdapter pFRulesDBAdapter, b bVar) {
        super(hVar, vVar, RuleFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        t.f(pFRulesDBAdapter, "portForwardingRulesDBAdapter");
        t.f(bVar, "jsonConverter");
        this.hostsDBAdapter = hostsDBAdapter;
        this.portForwardingRulesDBAdapter = pFRulesDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getPfRules().iterator();
        while (it.hasNext()) {
            this.portForwardingRulesDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(RuleFullData ruleFullData) throws po.a {
        RuleDBModel ruleDBModel;
        t.f(ruleFullData, "item");
        if (ruleFullData.getHostId() == null) {
            return;
        }
        String str = ruleFullData.content;
        boolean z10 = str != null;
        HostDBModel itemByRemoteId = this.hostsDBAdapter.getItemByRemoteId(r0.getId());
        if (itemByRemoteId == null) {
            return;
        }
        if (z10) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    PortForwardingRuleContent portForwardingRuleContent = (PortForwardingRuleContent) bVar.b(PortForwardingRuleContent.Companion.serializer(), str2);
                    ruleDBModel = new RuleDBModel(itemByRemoteId.getIdInDatabase(), portForwardingRuleContent.getPfType(), portForwardingRuleContent.getBoundAddress(), portForwardingRuleContent.getLocalPort(), portForwardingRuleContent.getHostname(), portForwardingRuleContent.getRemotePort(), -1L, ruleFullData.getId(), 0, portForwardingRuleContent.getLabel());
                    ruleDBModel.setContent(str);
                    ruleDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("RuleFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(PortForwardingRuleContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(ruleFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            long idInDatabase = itemByRemoteId.getIdInDatabase();
            String type = ruleFullData.getType();
            String boundAddress = ruleFullData.getBoundAddress();
            Integer localPort = ruleFullData.getLocalPort();
            int iIntValue = localPort != null ? localPort.intValue() : 0;
            String str3 = ruleFullData.host;
            Integer remotePort = ruleFullData.getRemotePort();
            ruleDBModel = new RuleDBModel(idInDatabase, type, boundAddress, iIntValue, str3, remotePort != null ? remotePort.intValue() : 0, -1L, ruleFullData.getId(), 0, ruleFullData.getLabel());
        }
        ruleDBModel.setUpdatedAtTime(ruleFullData.getUpdatedAt());
        ruleDBModel.setShared(t.b(ruleFullData.getShared(), Boolean.TRUE));
        ruleDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(ruleFullData.getEncryptedWith()));
        Long localId = ruleFullData.getLocalId();
        if (localId == null) {
            this.portForwardingRulesDBAdapter.editByRemoteId(ruleFullData.getId(), ruleDBModel);
        } else {
            ruleDBModel.setIdInDatabase(localId.longValue());
            this.portForwardingRulesDBAdapter.editByLocalId(localId.longValue(), ruleDBModel);
        }
    }
}
