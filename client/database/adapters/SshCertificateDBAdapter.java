package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ju.r0;
import ju.t;
import rg.s;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class SshCertificateDBAdapter extends DbAdapterAbstract<SshCertificateDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
        t.f(contentResolver, "resolver");
        t.f(sVar, "localCryptor");
    }

    public final List<SshCertificateDBModel> getCertificatesBySshKeyId(long j10) {
        r0 r0Var = r0.f62955a;
        String str = String.format("%s!=%s and %s=%s", Arrays.copyOf(new Object[]{Column.STATUS, 2, Column.SSH_KEY_ID, Long.valueOf(j10)}, 4));
        t.e(str, "format(...)");
        List<SshCertificateDBModel> itemList = getItemList(str);
        t.e(itemList, "getItemList(...)");
        return v.R0(itemList, new Comparator() { // from class: com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter$getCertificatesBySshKeyId$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return yt.a.e(((SshCertificateDBModel) t11).getUpdatedAtTime(), ((SshCertificateDBModel) t10).getUpdatedAtTime());
            }
        });
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return Table.SSH_CERTIFICATE;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshCertificateDBModel createItemFromCursor(Cursor cursor) {
        t.f(cursor, "cursor");
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        return new SshCertificateDBModel(cursor, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SshCertificateDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        t.f(cursor, "cursor");
        this.localCryptor.h();
        s sVar = this.localCryptor;
        t.e(sVar, "localCryptor");
        SshCertificateDBModel sshCertificateDBModel = new SshCertificateDBModel(cursor, sVar);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.CERTIFICATE, sshCertificateDBModel.getIdOnServer());
        }
        return sshCertificateDBModel;
    }
}
