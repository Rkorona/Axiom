package com.server.auditor.ssh.client.synchronization.handleresponse;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class SyncResultReceiver extends ResultReceiver {
    public static final String BUNDLE_RESULT_RECEIVER = "bundle_result_receiver";
    private SyncCallbackResultReceiver mSyncListener;

    public SyncResultReceiver(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i10, Bundle bundle) {
        SyncCallbackResultReceiver syncCallbackResultReceiver = this.mSyncListener;
        if (syncCallbackResultReceiver != null) {
            syncCallbackResultReceiver.onServiceCallback(i10, bundle);
        }
    }

    public void setSyncListener(SyncCallbackResultReceiver syncCallbackResultReceiver) {
        this.mSyncListener = syncCallbackResultReceiver;
    }
}
