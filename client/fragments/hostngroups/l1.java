package com.server.auditor.ssh.client.fragments.hostngroups;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(LongSparseArray longSparseArray, iu.l lVar) {
        ArrayList arrayList = new ArrayList();
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.keyAt(i10);
            Object objValueAt = longSparseArray.valueAt(i10);
            if (((Boolean) lVar.invoke(objValueAt)).booleanValue()) {
                arrayList.add(objValueAt);
            }
        }
        return arrayList;
    }
}
