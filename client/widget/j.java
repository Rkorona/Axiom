package com.server.auditor.ssh.client.widget;

import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.MultiKeyApiAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.y f46785a;

    public j() {
        MultiKeyDBAdapter multiKeyDBAdapterX = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW, "getMultiKeyApiAdapter(...)");
        this.f46785a = new il.y(multiKeyDBAdapterX, multiKeyApiAdapterW);
    }

    public final boolean a() {
        return !this.f46785a.c();
    }
}
