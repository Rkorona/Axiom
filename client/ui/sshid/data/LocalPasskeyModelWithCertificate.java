package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import bp.b;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.DeviceKeyBoundPublicApiModel;
import java.util.Date;
import ju.t;
import tp.c0;
import tp.d1;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class LocalPasskeyModelWithCertificate {
    public static final int $stable = 0;
    private final String certificate;
    private final b localPasskeyDbModel;

    public LocalPasskeyModelWithCertificate(String str, b bVar) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(bVar, "localPasskeyDbModel");
        this.certificate = str;
        this.localPasskeyDbModel = bVar;
    }

    public static /* synthetic */ LocalPasskeyModelWithCertificate copy$default(LocalPasskeyModelWithCertificate localPasskeyModelWithCertificate, String str, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localPasskeyModelWithCertificate.certificate;
        }
        if ((i10 & 2) != 0) {
            bVar = localPasskeyModelWithCertificate.localPasskeyDbModel;
        }
        return localPasskeyModelWithCertificate.copy(str, bVar);
    }

    public final String component1() {
        return this.certificate;
    }

    public final b component2() {
        return this.localPasskeyDbModel;
    }

    public final DeviceKeyBoundPublicApiModel convertToApiModel() {
        String str = this.certificate;
        String strH = this.localPasskeyDbModel.h();
        String strB = d1.b(new Date());
        t.e(strB, "convertDateToSQL(...)");
        String strD = this.localPasskeyDbModel.d();
        if (strD == null) {
            strD = c0.e();
        }
        return new DeviceKeyBoundPublicApiModel(str, strH, strB, strD);
    }

    public final LocalPasskeyModelWithCertificate copy(String str, b bVar) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(bVar, "localPasskeyDbModel");
        return new LocalPasskeyModelWithCertificate(str, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPasskeyModelWithCertificate)) {
            return false;
        }
        LocalPasskeyModelWithCertificate localPasskeyModelWithCertificate = (LocalPasskeyModelWithCertificate) obj;
        return t.b(this.certificate, localPasskeyModelWithCertificate.certificate) && t.b(this.localPasskeyDbModel, localPasskeyModelWithCertificate.localPasskeyDbModel);
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final b getLocalPasskeyDbModel() {
        return this.localPasskeyDbModel;
    }

    public int hashCode() {
        return (this.certificate.hashCode() * 31) + this.localPasskeyDbModel.hashCode();
    }

    public String toString() {
        return "LocalPasskeyModelWithCertificate(certificate=" + this.certificate + ", localPasskeyDbModel=" + this.localPasskeyDbModel + ")";
    }
}
