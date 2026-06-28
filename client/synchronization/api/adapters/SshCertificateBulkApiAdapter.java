package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class SshCertificateBulkApiAdapter extends BulkApiAdapter<CertificateBulk, SshCertificateDBModel> {
    public static final int $stable = 8;
    private final SshKeyDBAdapter sshKeyDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshCertificateBulkApiAdapter(SshCertificateDBAdapter sshCertificateDBAdapter, BulkApiAdapter.BulkItemCreator<CertificateBulk, SshCertificateDBModel> bulkItemCreator, SshKeyDBAdapter sshKeyDBAdapter) {
        super(sshCertificateDBAdapter, bulkItemCreator);
        t.f(sshCertificateDBAdapter, "adapter");
        t.f(bulkItemCreator, "bulkCreator");
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        this.sshKeyDBAdapter = sshKeyDBAdapter;
    }

    public final SshKeyDBAdapter getSshKeyDBAdapter() {
        return this.sshKeyDBAdapter;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter
    public List<CertificateBulk> getUpdateModels() {
        List<SshCertificateDBModel> itemListWithExternalReferences = this.mAdapter.getItemListWithExternalReferences("status = 1");
        List<SshKeyDBModel> itemListWhichNotDeleted = this.sshKeyDBAdapter.getItemListWhichNotDeleted();
        t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            String biometricAlias = ((SshKeyDBModel) obj).getBiometricAlias();
            if (!(biometricAlias == null || biometricAlias.length() == 0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((SshKeyDBModel) it.next()).getIdInDatabase()));
        }
        ArrayList arrayList3 = new ArrayList(itemListWithExternalReferences.size());
        for (SshCertificateDBModel sshCertificateDBModel : itemListWithExternalReferences) {
            if (!arrayList2.contains(Long.valueOf(sshCertificateDBModel.getKeyId()))) {
                CertificateBulk certificateBulk = (CertificateBulk) this.bulkCreator.createItem(sshCertificateDBModel);
                if (certificateBulk.getSshKeyId() != null) {
                    arrayList3.add(certificateBulk);
                }
            }
        }
        return arrayList3;
    }
}
