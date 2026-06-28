package com.server.auditor.ssh.client.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kj.c;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f38550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38551b = 0;

    public void a(c cVar) {
        this.f38550a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
        Timber.d("---NetworkCallback NetworkBroadcastReceiver onReceive noConnectivity %s", Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            c cVar = this.f38550a;
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f38551b;
        if (j10 == 0 || Math.abs(jCurrentTimeMillis - j10) >= 5000) {
            this.f38551b = jCurrentTimeMillis;
            c cVar2 = this.f38550a;
            if (cVar2 != null) {
                cVar2.b();
            }
        }
    }
}
