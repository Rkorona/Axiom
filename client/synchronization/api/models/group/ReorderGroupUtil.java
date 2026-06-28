package com.server.auditor.ssh.client.synchronization.api.models.group;

import com.server.auditor.ssh.client.synchronization.api.models.group.IParentGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReorderGroupUtil<T extends IParentGroup> {
    private boolean isContainsParent(T t10, List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (t10.parentGroupId().equals(it.next().currentId())) {
                return true;
            }
        }
        return false;
    }

    public void reorderGroupList(List<T> list) {
        ArrayList arrayList = new ArrayList();
        while (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next.parentGroupId() == null || !isContainsParent(next, list)) {
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        list.addAll(arrayList);
    }
}
