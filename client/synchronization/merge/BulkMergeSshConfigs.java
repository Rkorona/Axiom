package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.ProxyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.config.SshConfigContent;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
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
public final class BulkMergeSshConfigs extends BulkDataMergeService<SshConfigFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final ProxyDBAdapter proxyDBAdapter;
    private final SnippetDBAdapter snippetDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSshConfigs(h hVar, v vVar, ProxyDBAdapter proxyDBAdapter, SnippetDBAdapter snippetDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, b bVar) {
        super(hVar, vVar, SshConfigFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(proxyDBAdapter, "proxyDBAdapter");
        t.f(snippetDBAdapter, "snippetDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(bVar, "jsonConverter");
        this.proxyDBAdapter = proxyDBAdapter;
        this.snippetDBAdapter = snippetDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.jsonConverter = bVar;
    }

    private final SshRemoteConfigDBModel initDBModel(SshConfigFullData sshConfigFullData) throws po.a {
        SshRemoteConfigDBModel sshRemoteConfigDBModel;
        WithRecourseId proxyId = sshConfigFullData.getProxyId();
        WithRecourseId startupSnippetId = sshConfigFullData.getStartupSnippetId();
        String str = sshConfigFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    SshConfigContent sshConfigContent = (SshConfigContent) bVar.b(SshConfigContent.Companion.serializer(), str2);
                    sshRemoteConfigDBModel = new SshRemoteConfigDBModel();
                    sshRemoteConfigDBModel.setColorScheme(VariablesConverter.convertFromApiColorScheme(sshConfigContent.getColorScheme()));
                    sshRemoteConfigDBModel.setCharset(sshConfigContent.getCharset());
                    sshRemoteConfigDBModel.setUseMosh(sshConfigContent.getUseMosh());
                    sshRemoteConfigDBModel.setUseAgentForwarding(sshConfigContent.getAgentForwarding());
                    sshRemoteConfigDBModel.setMoshServerCommand(sshConfigContent.getMoshServerCommand());
                    sshRemoteConfigDBModel.setEnvironmentVariables(sshConfigContent.getEnvVariables());
                    sshConfigFullData.setPort(sshConfigContent.getPort());
                    setPort(sshConfigFullData, sshRemoteConfigDBModel);
                    sshRemoteConfigDBModel.setContent(str);
                    sshRemoteConfigDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("SshConfigFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(SshConfigContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(sshConfigFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            sshRemoteConfigDBModel = new SshRemoteConfigDBModel();
            sshRemoteConfigDBModel.setColorScheme(VariablesConverter.convertFromApiColorScheme(sshConfigFullData.getColorScheme()));
            sshRemoteConfigDBModel.setCharset(sshConfigFullData.getCharset());
            sshRemoteConfigDBModel.setUseMosh(sshConfigFullData.getUseMosh());
            sshRemoteConfigDBModel.setUseAgentForwarding(sshConfigFullData.getUseAgentForwarding());
            sshRemoteConfigDBModel.setMoshServerCommand(sshConfigFullData.getMoshServerCommand());
            sshRemoteConfigDBModel.setEnvironmentVariables(sshConfigFullData.envVariables);
            setPort(sshConfigFullData, sshRemoteConfigDBModel);
        }
        sshRemoteConfigDBModel.setStatus(0);
        sshRemoteConfigDBModel.setIdOnServer(sshConfigFullData.getId());
        sshRemoteConfigDBModel.setUpdatedAtTime(sshConfigFullData.getUpdatedAt());
        sshRemoteConfigDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(sshConfigFullData.getEncryptedWith()));
        sshRemoteConfigDBModel.setShared(t.b(sshConfigFullData.getShared(), Boolean.TRUE));
        if (startupSnippetId != null) {
            SnippetDBModel itemByRemoteId = this.snippetDBAdapter.getItemByRemoteId(startupSnippetId.getId());
            sshRemoteConfigDBModel.setStartupSnippetId(itemByRemoteId != null ? Long.valueOf(itemByRemoteId.getIdInDatabase()) : null);
        }
        if (proxyId != null) {
            ProxyDBModel itemByRemoteId2 = this.proxyDBAdapter.getItemByRemoteId(proxyId.getId());
            sshRemoteConfigDBModel.setProxyId(itemByRemoteId2 != null ? Long.valueOf(itemByRemoteId2.getIdInDatabase()) : null);
        }
        return sshRemoteConfigDBModel;
    }

    private final void setPort(SshConfigFullData sshConfigFullData, SshRemoteConfigDBModel sshRemoteConfigDBModel) {
        Integer port = sshConfigFullData.getPort();
        if (port == null || port.intValue() != 0) {
            sshRemoteConfigDBModel.setPort(port);
        } else {
            sshRemoteConfigDBModel.setPort(null);
            sshRemoteConfigDBModel.setStatus(1);
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSshConfigs().iterator();
        while (it.hasNext()) {
            this.sshConfigDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SshConfigFullData sshConfigFullData) throws po.a {
        t.f(sshConfigFullData, "item");
        SshRemoteConfigDBModel sshRemoteConfigDBModelInitDBModel = initDBModel(sshConfigFullData);
        Long localId = sshConfigFullData.getLocalId();
        if (localId == null) {
            this.sshConfigDBAdapter.editByRemoteId(sshConfigFullData.getId(), sshRemoteConfigDBModelInitDBModel);
        } else {
            sshRemoteConfigDBModelInitDBModel.setIdInDatabase(localId.longValue());
            this.sshConfigDBAdapter.editByLocalId(localId.longValue(), sshRemoteConfigDBModelInitDBModel);
        }
    }
}
