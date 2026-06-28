package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.HaveIBeenPwnedRestInterface;
import java.util.concurrent.TimeUnit;
import ju.k;
import ju.t;
import pv.z;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PasswordBreachApiClientFactory implements IPasswordBreachApiClientFactory {
    private static final String PWNED_PASSWORDS_BASE_URL = "https://api.pwnedpasswords.com/";
    private final ScalarsConverterFactory scalarsConverterFactory = ScalarsConverterFactory.create();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.server.auditor.ssh.client.synchronization.retrofit.IRestApiClientFactory
    public HaveIBeenPwnedRestInterface createRegularRestApiClient() {
        ScalarsConverterFactory scalarsConverterFactory = this.scalarsConverterFactory;
        t.e(scalarsConverterFactory, "scalarsConverterFactory");
        RetrofitClient retrofitClient = new RetrofitClient(PWNED_PASSWORDS_BASE_URL, scalarsConverterFactory, null, 0L, 0L, 28, null);
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
        Object objCreate = retrofitBuild.create(HaveIBeenPwnedRestInterface.class);
        t.e(objCreate, "create(...)");
        return (HaveIBeenPwnedRestInterface) objCreate;
    }
}
