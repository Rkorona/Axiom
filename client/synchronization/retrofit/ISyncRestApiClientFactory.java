package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;

/* JADX INFO: loaded from: classes4.dex */
public interface ISyncRestApiClientFactory extends IRestApiClientFactory<SyncRestInterface> {
    SyncRestInterface createAuthenticatedRestApiClient();

    SyncRestInterface createCustomApiKeyApiClient(ApiKey apiKey);

    @Override // com.server.auditor.ssh.client.synchronization.retrofit.IRestApiClientFactory
    SyncRestInterface createRegularRestApiClient();
}
