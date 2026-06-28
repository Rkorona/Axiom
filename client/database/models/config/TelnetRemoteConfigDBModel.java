package com.server.auditor.ssh.client.database.models.config;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.base.BaseRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TelnetRemoteConfigDBModel extends BaseRemoteConfigDBModel {
    public TelnetRemoteConfigDBModel() {
    }

    public static TelnetRemoteConfigDBModel getTelnetConfigDBModelWithExternalReferences(Cursor cursor, s sVar) {
        IdentityDBModel itemByLocalId;
        TelnetRemoteConfigDBModel telnetRemoteConfigDBModel = new TelnetRemoteConfigDBModel(cursor, sVar);
        if (telnetRemoteConfigDBModel.mIdentityId != null && (itemByLocalId = f.p().n().getItemByLocalId(telnetRemoteConfigDBModel.mIdentityId.longValue())) != null && itemByLocalId.getIdOnServer() != -1) {
            telnetRemoteConfigDBModel.mIdentityId = Long.valueOf(itemByLocalId.getIdOnServer());
        }
        return telnetRemoteConfigDBModel;
    }

    public TelnetProperties convertToTelnetConfig() {
        return new TelnetProperties(Long.valueOf(this.mId), this.mColorScheme, this.mFontSize, this.mCharset, this.mPort, getIdentity());
    }

    @Override // com.server.auditor.ssh.client.database.models.config.base.BaseRemoteConfigDBModel, com.server.auditor.ssh.client.database.models.config.base.BaseConfigDBModel, com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        return super.toContentValues(sVar);
    }

    public TelnetRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, Long l10, String str, String str2) {
        super(num, num2, bool, str, str2, l10);
    }

    public TelnetRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, Long l10, String str, String str2, long j10, int i10, String str3) {
        super(num, num2, bool, str, str2, l10, j10, str3, i10);
    }

    public TelnetRemoteConfigDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
    }
}
