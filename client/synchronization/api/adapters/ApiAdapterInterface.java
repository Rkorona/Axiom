package com.server.auditor.ssh.client.synchronization.api.adapters;

/* JADX INFO: loaded from: classes4.dex */
public interface ApiAdapterInterface<T> {
    void deleteItem(int i10, int i11);

    void postItem(T t10, int i10);

    void putItem(T t10, int i10, int i11);
}
