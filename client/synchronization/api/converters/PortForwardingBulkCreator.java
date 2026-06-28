package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.pfrule.PortForwardingRuleContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingBulkCreator extends BaseBulkApiCreator<RuleBulk, RuleBulkV3, RuleBulkV5, RuleDBModel> {
    private static final String hostIdPrefix = "host_set/";
    private final ContentPatcher contentPatcher;
    private final HostsDBAdapter hostsDBAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortForwardingBulkCreator(HostsDBAdapter hostsDBAdapter, a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(hostsDBAdapter, "hostsDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.hostsDBAdapter = hostsDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final Object prepareHostId(Long l10) {
        if (l10 == null) {
            return null;
        }
        HostDBModel itemByRemoteId = this.hostsDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return hostIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public RuleBulkV3 createV3(RuleDBModel ruleDBModel) {
        t.f(ruleDBModel, "dbModel");
        return new RuleBulkV3(ruleDBModel.getType(), ruleDBModel.getBoundAddress(), Integer.valueOf(ruleDBModel.getLocalPort()), Integer.valueOf(ruleDBModel.getRemotePort()), ruleDBModel.getHost(), ruleDBModel.getLabel(), prepareHostId(Long.valueOf(ruleDBModel.getHostId())), Long.valueOf(ruleDBModel.getIdInDatabase()), prepareIdOnServer(ruleDBModel.getIdOnServer()), ruleDBModel.getUpdatedAtTime(), ruleDBModel.getVaultKeyId().getId());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public RuleBulkV5 createV5(RuleDBModel ruleDBModel) throws JSONException {
        t.f(ruleDBModel, "dbModel");
        String host = ruleDBModel.getHost();
        t.e(host, "getHost(...)");
        int localPort = ruleDBModel.getLocalPort();
        int remotePort = ruleDBModel.getRemotePort();
        String type = ruleDBModel.getType();
        t.e(type, "getType(...)");
        String label = ruleDBModel.getLabel();
        t.e(label, "getLabel(...)");
        String boundAddress = ruleDBModel.getBoundAddress();
        t.e(boundAddress, "getBoundAddress(...)");
        PortForwardingRuleContent portForwardingRuleContent = new PortForwardingRuleContent(host, localPort, remotePort, type, label, boundAddress, 0, 64, (k) null);
        String content = ruleDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(PortForwardingRuleContent.Companion.serializer(), portForwardingRuleContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new RuleBulkV5(strC, prepareHostId(Long.valueOf(ruleDBModel.getHostId())), Long.valueOf(ruleDBModel.getIdInDatabase()), prepareIdOnServer(ruleDBModel.getIdOnServer()), ruleDBModel.getUpdatedAtTime(), ruleDBModel.getVaultKeyId().getId());
    }
}
