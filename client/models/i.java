package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.synchronization.api.models.user.EnterpriseResponse;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final EnterprisePlanData a(EnterpriseResponse enterpriseResponse) {
        ju.t.f(enterpriseResponse, "<this>");
        return new EnterprisePlanData(enterpriseResponse.getId(), enterpriseResponse.getName());
    }
}
