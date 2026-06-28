package com.server.auditor.ssh.client.utils.analytics;

import com.server.auditor.ssh.client.utils.analytics.Avo;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46431a;

        static {
            int[] iArr = new int[HostCreationOriginVariant.values().length];
            try {
                iArr[HostCreationOriginVariant.CONNECTIONS_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46431a = iArr;
        }
    }

    public static final Avo.HostCreationOrigin a(HostCreationOriginVariant hostCreationOriginVariant) {
        t.f(hostCreationOriginVariant, "hostCreationMethod");
        return a.f46431a[hostCreationOriginVariant.ordinal()] == 1 ? Avo.HostCreationOrigin.CONNECTIONS_SCREEN : Avo.HostCreationOrigin.HOSTS_SCREEN;
    }
}
