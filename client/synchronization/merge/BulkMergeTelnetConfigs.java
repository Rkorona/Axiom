package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.telnetconfig.TelnetConfigContent;
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
public final class BulkMergeTelnetConfigs extends BulkDataMergeService<TelnetConfigFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeTelnetConfigs(h hVar, v vVar, TelnetConfigDBAdapter telnetConfigDBAdapter, b bVar) {
        super(hVar, vVar, TelnetConfigFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(bVar, "jsonConverter");
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.jsonConverter = bVar;
    }

    private final TelnetRemoteConfigDBModel initDBModel(TelnetConfigFullData telnetConfigFullData) throws po.a {
        TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = new TelnetRemoteConfigDBModel();
        String str = telnetConfigFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    TelnetConfigContent telnetConfigContent = (TelnetConfigContent) bVar.b(TelnetConfigContent.Companion.serializer(), str2);
                    telnetConfigFullData.setPort(telnetConfigContent.getPort());
                    telnetConfigFullData.setCharset(telnetConfigContent.getCharset());
                    telnetConfigFullData.setColorScheme(telnetConfigContent.getColorScheme());
                    telnetRemoteConfigDBModel.setContent(str);
                    telnetRemoteConfigDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("TelnetConfigFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(TelnetConfigContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(telnetConfigFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        }
        telnetRemoteConfigDBModel.setStatus(0);
        setPort(telnetConfigFullData, telnetRemoteConfigDBModel);
        telnetRemoteConfigDBModel.setColorScheme(VariablesConverter.convertFromApiColorScheme(telnetConfigFullData.getColorScheme()));
        telnetRemoteConfigDBModel.setCharset(telnetConfigFullData.getCharset());
        telnetRemoteConfigDBModel.setIsCursorBlink(Boolean.FALSE);
        telnetRemoteConfigDBModel.setIdOnServer(telnetConfigFullData.getId());
        telnetRemoteConfigDBModel.setUpdatedAtTime(telnetConfigFullData.getUpdatedAt());
        telnetRemoteConfigDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(telnetConfigFullData.getEncryptedWith()));
        telnetRemoteConfigDBModel.setShared(t.b(telnetConfigFullData.getShared(), Boolean.TRUE));
        return telnetRemoteConfigDBModel;
    }

    private final void setPort(TelnetConfigFullData telnetConfigFullData, TelnetRemoteConfigDBModel telnetRemoteConfigDBModel) {
        Integer port = telnetConfigFullData.getPort();
        if (port == null || port.intValue() != 0) {
            telnetRemoteConfigDBModel.setPort(port);
        } else {
            telnetRemoteConfigDBModel.setPort(null);
            telnetRemoteConfigDBModel.setStatus(1);
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getTelnetConfigs().iterator();
        while (it.hasNext()) {
            this.telnetConfigDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(TelnetConfigFullData telnetConfigFullData) throws po.a {
        t.f(telnetConfigFullData, "item");
        TelnetRemoteConfigDBModel telnetRemoteConfigDBModelInitDBModel = initDBModel(telnetConfigFullData);
        Long localId = telnetConfigFullData.getLocalId();
        if (localId == null) {
            this.telnetConfigDBAdapter.editByRemoteId(telnetConfigFullData.getId(), telnetRemoteConfigDBModelInitDBModel);
        } else {
            telnetRemoteConfigDBModelInitDBModel.setIdInDatabase(localId.longValue());
            this.telnetConfigDBAdapter.editByLocalId(localId.longValue(), telnetRemoteConfigDBModelInitDBModel);
        }
    }
}
