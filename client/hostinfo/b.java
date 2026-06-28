package com.server.auditor.ssh.client.hostinfo;

import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27170a;

        static {
            int[] iArr = new int[HostIconUtil.OsModelType.values().length];
            try {
                iArr[HostIconUtil.OsModelType.gloria_ops_agent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27170a = iArr;
        }
    }

    public static final String a(HostIconUtil.OsModelType osModelType) {
        t.f(osModelType, "<this>");
        return a.f27170a[osModelType.ordinal()] == 1 ? "gloria" : osModelType.name();
    }
}
