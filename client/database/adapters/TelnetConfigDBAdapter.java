package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TelnetConfigDBAdapter extends DbAdapterAbstract<TelnetRemoteConfigDBModel> {
    private static final String TABLE = "telnet_config";

    public TelnetConfigDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "telnet_config";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TelnetRemoteConfigDBModel createItemFromCursor(Cursor cursor) {
        return new TelnetRemoteConfigDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public TelnetRemoteConfigDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        TelnetRemoteConfigDBModel telnetConfigDBModelWithExternalReferences = TelnetRemoteConfigDBModel.getTelnetConfigDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.TELNET_CONFIG, telnetConfigDBModelWithExternalReferences.getIdOnServer());
        }
        return telnetConfigDBModelWithExternalReferences;
    }
}
