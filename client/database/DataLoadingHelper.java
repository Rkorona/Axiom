package com.server.auditor.ssh.client.database;

import android.text.TextUtils;
import ug.c;

/* JADX INFO: loaded from: classes3.dex */
public class DataLoadingHelper {
    private boolean hasAuthToken() {
        c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        return !(TextUtils.isEmpty(new String(cVarQ.d("6170695F617574686F72697A6174696F6E", new byte[0]))) || TextUtils.isEmpty(new String(cVarQ.d("6170695F757365726E616D65", new byte[0]))));
    }

    private void initializeUserProfile() {
        com.server.auditor.ssh.client.app.a.N().j0();
    }

    public void startLoading() {
        if (hasAuthToken()) {
            com.server.auditor.ssh.client.app.a.N().Q0(true);
            initializeUserProfile();
        } else {
            com.server.auditor.ssh.client.app.a.N().Y0(false);
            com.server.auditor.ssh.client.app.a.N().Q0(false);
        }
    }
}
