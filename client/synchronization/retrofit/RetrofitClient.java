package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.MobileDeviceHelper;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import ju.k;
import ju.r0;
import ju.t;
import pv.b0;
import pv.d0;
import pv.w;
import pv.z;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class RetrofitClient {
    private static final String API_KEY_OF_DEVICE = "DeviceToken %s";
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final boolean CAN_LOG_NETWORK = true;
    private static final String DEVICE_APP_VERSION_HEADER = "X-DEVICE-APP-VERSION";
    private static final String DEVICE_PLATFORM_GOOGLE = "Google";
    private static final String DEVICE_PLATFORM_HEADER = "X-DEVICE-PLATFORM";
    private static final long RETROFIT_CONNECT_TIMEOUT_DEFAULT = 60000;
    private static final long RETROFIT_READ_TIMEOUT_DEFAULT = 60000;
    private final String baseUrl;
    private final long connectTimeoutMs;
    private final Converter.Factory converter;
    private final w customHttpClientInterceptor;
    private final long readTimeoutMs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b0.a addDeviceHeaders(b0.a aVar) {
            String appVersion = new MobileDeviceHelper().getAppVersion();
            t.e(appVersion, "getAppVersion(...)");
            aVar.a(RetrofitClient.DEVICE_APP_VERSION_HEADER, appVersion);
            aVar.a(RetrofitClient.DEVICE_PLATFORM_HEADER, RetrofitClient.DEVICE_PLATFORM_GOOGLE);
            return aVar;
        }

        public final w getCustomApiKeyHttpClientInterceptor(ApiKey apiKey) {
            t.f(apiKey, "apiKey");
            r0 r0Var = r0.f62955a;
            final String str = String.format(RetrofitClient.API_KEY_OF_DEVICE, Arrays.copyOf(new Object[]{apiKey.getToken()}, 1));
            t.e(str, "format(...)");
            w.b bVar = w.f71029a;
            return new w() { // from class: com.server.auditor.ssh.client.synchronization.retrofit.RetrofitClient$Companion$getCustomApiKeyHttpClientInterceptor$$inlined$invoke$1
                @Override // pv.w
                public final d0 intercept(w.a aVar) {
                    t.f(aVar, "it");
                    b0.a aVarI = aVar.request().i();
                    aVarI.d("Authorization", str);
                    RetrofitClient.Companion.addDeviceHeaders(aVarI);
                    return aVar.a(aVarI.b());
                }
            };
        }

        public final w getRegularHttpClientInterceptor() {
            w.b bVar = w.f71029a;
            return new w() { // from class: com.server.auditor.ssh.client.synchronization.retrofit.RetrofitClient$Companion$getRegularHttpClientInterceptor$$inlined$invoke$1
                @Override // pv.w
                public final d0 intercept(w.a aVar) {
                    t.f(aVar, "it");
                    b0.a aVarI = aVar.request().i();
                    RetrofitClient.Companion.addDeviceHeaders(aVarI);
                    return aVar.a(aVarI.b());
                }
            };
        }

        private Companion() {
        }
    }

    public RetrofitClient(String str, Converter.Factory factory, w wVar, long j10, long j11) {
        t.f(str, "baseUrl");
        t.f(factory, "converter");
        this.baseUrl = str;
        this.converter = factory;
        this.customHttpClientInterceptor = wVar;
        this.readTimeoutMs = j10;
        this.connectTimeoutMs = j11;
    }

    public static /* synthetic */ RetrofitClient copy$default(RetrofitClient retrofitClient, String str, Converter.Factory factory, w wVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = retrofitClient.baseUrl;
        }
        if ((i10 & 2) != 0) {
            factory = retrofitClient.converter;
        }
        if ((i10 & 4) != 0) {
            wVar = retrofitClient.customHttpClientInterceptor;
        }
        if ((i10 & 8) != 0) {
            j10 = retrofitClient.readTimeoutMs;
        }
        if ((i10 & 16) != 0) {
            j11 = retrofitClient.connectTimeoutMs;
        }
        long j12 = j11;
        w wVar2 = wVar;
        return retrofitClient.copy(str, factory, wVar2, j10, j12);
    }

    public final z.a attachNetworkLoggingInterceptor(z.a aVar) {
        t.f(aVar, "<this>");
        return aVar;
    }

    public final String component1() {
        return this.baseUrl;
    }

    public final Converter.Factory component2() {
        return this.converter;
    }

    public final w component3() {
        return this.customHttpClientInterceptor;
    }

    public final long component4() {
        return this.readTimeoutMs;
    }

    public final long component5() {
        return this.connectTimeoutMs;
    }

    public final RetrofitClient copy(String str, Converter.Factory factory, w wVar, long j10, long j11) {
        t.f(str, "baseUrl");
        t.f(factory, "converter");
        return new RetrofitClient(str, factory, wVar, j10, j11);
    }

    public final /* synthetic */ <T> T create() {
        z.a aVar = new z.a();
        if (getCustomHttpClientInterceptor() != null) {
            aVar.a(getCustomHttpClientInterceptor());
        }
        attachNetworkLoggingInterceptor(aVar);
        long readTimeoutMs = getReadTimeoutMs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.L(readTimeoutMs, timeUnit);
        aVar.c(getConnectTimeoutMs(), timeUnit);
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(getBaseUrl()).addConverterFactory(getConverter()).client(aVar.b()).build();
        t.c(retrofitBuild);
        t.j(4, "T");
        T t10 = (T) retrofitBuild.create(Object.class);
        t.e(t10, "create(...)");
        return t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return CAN_LOG_NETWORK;
        }
        if (!(obj instanceof RetrofitClient)) {
            return false;
        }
        RetrofitClient retrofitClient = (RetrofitClient) obj;
        if (t.b(this.baseUrl, retrofitClient.baseUrl) && t.b(this.converter, retrofitClient.converter) && t.b(this.customHttpClientInterceptor, retrofitClient.customHttpClientInterceptor) && this.readTimeoutMs == retrofitClient.readTimeoutMs && this.connectTimeoutMs == retrofitClient.connectTimeoutMs) {
            return CAN_LOG_NETWORK;
        }
        return false;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final long getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    public final Converter.Factory getConverter() {
        return this.converter;
    }

    public final w getCustomHttpClientInterceptor() {
        return this.customHttpClientInterceptor;
    }

    public final long getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    public int hashCode() {
        int iHashCode = ((this.baseUrl.hashCode() * 31) + this.converter.hashCode()) * 31;
        w wVar = this.customHttpClientInterceptor;
        return ((((iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31) + Long.hashCode(this.readTimeoutMs)) * 31) + Long.hashCode(this.connectTimeoutMs);
    }

    public String toString() {
        return "RetrofitClient(baseUrl=" + this.baseUrl + ", converter=" + this.converter + ", customHttpClientInterceptor=" + this.customHttpClientInterceptor + ", readTimeoutMs=" + this.readTimeoutMs + ", connectTimeoutMs=" + this.connectTimeoutMs + ")";
    }

    public /* synthetic */ RetrofitClient(String str, Converter.Factory factory, w wVar, long j10, long j11, int i10, k kVar) {
        this((i10 & 1) != 0 ? "https://api.termius.com/" : str, factory, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? 60000L : j10, (i10 & 16) != 0 ? 60000L : j11);
    }
}
