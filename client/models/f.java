package com.server.auditor.ssh.client.models;

import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final e a(Response response) {
        ju.t.f(response, "<this>");
        int iCode = response.code();
        if (iCode == 400) {
            return new h(response.errorBody());
        }
        if (iCode == 401) {
            return new y(response.errorBody());
        }
        if (iCode == 403) {
            return new m(response.errorBody());
        }
        if (iCode == 404) {
            return new l(response.errorBody());
        }
        if (iCode != 429) {
            return new z(response.code(), response.errorBody());
        }
        pv.u uVarHeaders = response.headers();
        ju.t.e(uVarHeaders, "headers(...)");
        return new w(uVarHeaders, response.errorBody());
    }
}
