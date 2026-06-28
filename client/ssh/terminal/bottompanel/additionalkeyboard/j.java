package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.content.Context;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
public class j extends KeyTextView.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39005c;

    public j(Context context, String str, String str2) {
        super(context, str);
        this.f39005c = str2;
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.a, com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
    protected Integer d(KeyTextView.State state, String str, Context context, boolean z10) {
        Integer[] numArrA = i.a(this.f39005c);
        return numArrA.length == 1 ? numArrA[0] : super.d(state, str, context, z10);
    }
}
