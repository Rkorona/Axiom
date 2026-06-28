package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.models.RuleDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class PFApiAdapter extends ApiAdapterAbstract<RuleDBModel> {
    public PFApiAdapter(PFRulesDBAdapter pFRulesDBAdapter) {
        super(pFRulesDBAdapter);
    }
}
