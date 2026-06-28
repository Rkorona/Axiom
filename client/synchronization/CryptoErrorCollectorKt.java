package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.synchronization.CryptoErrorCollector;
import com.server.auditor.ssh.client.ui.cryptography.data.DecryptionSeverity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoErrorCollectorKt {
    public static final List<CryptoErrorCollector.CryptoError.RemoteDecryptError> fatalErrors(List<CryptoErrorCollector.CryptoError.RemoteDecryptError> list) {
        t.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CryptoErrorCollector.CryptoError.RemoteDecryptError) obj).getSeverity() == DecryptionSeverity.Fatal) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean hasFatalErrors(List<CryptoErrorCollector.CryptoError.RemoteDecryptError> list) {
        t.f(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((CryptoErrorCollector.CryptoError.RemoteDecryptError) it.next()).getSeverity() == DecryptionSeverity.Fatal) {
                return true;
            }
        }
        return false;
    }
}
