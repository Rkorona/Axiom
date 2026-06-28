package com.server.auditor.ssh.client.synchronization;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
public interface HaveIBeenPwnedRestInterface {
    @Headers({"User-Agent: Termius"})
    @GET("range/{f5ch}")
    Object requestPasswordBreachCheck(@Path("f5ch") String str, zt.e<? super Response<String>> eVar);
}
