package com.server.auditor.ssh.client.interactors;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27292b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27293c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27294a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final boolean a(Context context) {
            NetworkCapabilities networkCapabilities;
            ju.t.f(context, "context");
            Object systemService = context.getSystemService("connectivity");
            ju.t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        }

        private a() {
        }
    }

    public b0(Context context) {
        ju.t.f(context, "applicationContext");
        this.f27294a = context;
    }

    public final boolean a() {
        return f27292b.a(this.f27294a);
    }
}
