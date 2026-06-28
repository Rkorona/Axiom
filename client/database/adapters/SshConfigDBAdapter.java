package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class SshConfigDBAdapter extends DbAdapterAbstract<SshRemoteConfigDBModel> {
    private static final String TABLE = "ssh_config";

    public SshConfigDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public SshRemoteConfigDBModel getConfigByProxyId(Long l10) {
        for (SshRemoteConfigDBModel sshRemoteConfigDBModel : getItemListWhichNotDeleted()) {
            if (l10.equals(sshRemoteConfigDBModel.getProxyId())) {
                return sshRemoteConfigDBModel;
            }
        }
        return null;
    }

    public List<SshRemoteConfigDBModel> getConfigsUseStartupSnippet(Long l10) {
        return getItemList(String.format("%s==%s", Column.START_UP_SNIPPET_ID, l10));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "ssh_config";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshRemoteConfigDBModel createItemFromCursor(Cursor cursor) {
        return new SshRemoteConfigDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshRemoteConfigDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        SshRemoteConfigDBModel sshConfigDBModelWithExternalReferences = SshRemoteConfigDBModel.getSshConfigDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.SSHCONFIG, sshConfigDBModelWithExternalReferences.getIdOnServer());
        }
        return sshConfigDBModelWithExternalReferences;
    }
}
