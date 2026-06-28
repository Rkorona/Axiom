package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import java.util.concurrent.TimeUnit;
import ju.k;
import ju.t;
import pv.x;
import pv.z;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncRestApiClientFactory implements ISyncRestApiClientFactory {
    private final Converter.Factory jsonConverterFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final x contentType = x.f71031e.a("application/json");

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public SyncRestApiClientFactory(mv.b bVar) {
        t.f(bVar, "jsonConverter");
        this.jsonConverterFactory = KotlinSerializationConverterFactory.create(bVar, contentType);
    }

    @Override // com.server.auditor.ssh.client.synchronization.retrofit.ISyncRestApiClientFactory
    public SyncRestInterface createAuthenticatedRestApiClient() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        if (apiKey == null) {
            return null;
        }
        RetrofitClient retrofitClient = new RetrofitClient(null, this.jsonConverterFactory, RetrofitClient.Companion.getCustomApiKeyHttpClientInterceptor(apiKey), 0L, 0L, 25, null);
        z.a aVar = new z.a();
        if (retrofitClient.getCustomHttpClientInterceptor() != null) {
            aVar.a(retrofitClient.getCustomHttpClientInterceptor());
        }
        retrofitClient.attachNetworkLoggingInterceptor(aVar);
        long readTimeoutMs = retrofitClient.getReadTimeoutMs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.L(readTimeoutMs, timeUnit);
        aVar.c(retrofitClient.getConnectTimeoutMs(), timeUnit);
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(retrofitClient.getBaseUrl()).addConverterFactory(retrofitClient.getConverter()).client(aVar.b()).build();
        t.c(retrofitBuild);
        Object objCreate = retrofitBuild.create(SyncRestInterface.class);
        t.e(objCreate, "create(...)");
        return (SyncRestInterface) objCreate;
    }

    @Override // com.server.auditor.ssh.client.synchronization.retrofit.ISyncRestApiClientFactory
    public SyncRestInterface createCustomApiKeyApiClient(ApiKey apiKey) {
        t.f(apiKey, "customApiKey");
        RetrofitClient retrofitClient = new RetrofitClient(null, this.jsonConverterFactory, RetrofitClient.Companion.getCustomApiKeyHttpClientInterceptor(apiKey), 0L, 0L, 25, null);
        z.a aVar = new z.a();
        if (retrofitClient.getCustomHttpClientInterceptor() != null) {
            aVar.a(retrofitClient.getCustomHttpClientInterceptor());
        }
        retrofitClient.attachNetworkLoggingInterceptor(aVar);
        long readTimeoutMs = retrofitClient.getReadTimeoutMs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.L(readTimeoutMs, timeUnit);
        aVar.c(retrofitClient.getConnectTimeoutMs(), timeUnit);
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(retrofitClient.getBaseUrl()).addConverterFactory(retrofitClient.getConverter()).client(aVar.b()).build();
        t.c(retrofitBuild);
        Object objCreate = retrofitBuild.create(SyncRestInterface.class);
        t.e(objCreate, "create(...)");
        return (SyncRestInterface) objCreate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.server.auditor.ssh.client.synchronization.retrofit.IRestApiClientFactory
    public SyncRestInterface createRegularRestApiClient() {
        RetrofitClient retrofitClient = new RetrofitClient(null, this.jsonConverterFactory, RetrofitClient.Companion.getRegularHttpClientInterceptor(), 0L, 0L, 25, null);
        z.a aVar = new z.a();
        if (retrofitClient.getCustomHttpClientInterceptor() != null) {
            aVar.a(retrofitClient.getCustomHttpClientInterceptor());
        }
        retrofitClient.attachNetworkLoggingInterceptor(aVar);
        long readTimeoutMs = retrofitClient.getReadTimeoutMs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.L(readTimeoutMs, timeUnit);
        aVar.c(retrofitClient.getConnectTimeoutMs(), timeUnit);
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(retrofitClient.getBaseUrl()).addConverterFactory(retrofitClient.getConverter()).client(aVar.b()).build();
        t.c(retrofitBuild);
        Object objCreate = retrofitBuild.create(SyncRestInterface.class);
        t.e(objCreate, "create(...)");
        return (SyncRestInterface) objCreate;
    }
}
