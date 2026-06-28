package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetPackageApiAdapter extends ApiAdapterAbstract<SnippetPackageDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetPackageApiAdapter(SnippetPackageDBAdapter snippetPackageDBAdapter) {
        super(snippetPackageDBAdapter);
        t.f(snippetPackageDBAdapter, "snippetPackageDBAdapter");
    }
}
