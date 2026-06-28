package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.content.Context;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
class l extends KeyTextView.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39008c;

    l(Context context, String str, String str2) {
        super(context, str);
        this.f39008c = str2;
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.a, com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
    protected Integer d(KeyTextView.State state, String str, Context context, boolean z10) {
        Integer[] numArrA = i.a(this.f39008c);
        return state == KeyTextView.State.Initial ? numArrA[0] : numArrA[1];
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.a, com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
    protected int e(KeyTextView.State state, String str, Context context) {
        return state == KeyTextView.State.Initial ? R.color.additional_keyboard_btn_text_color : R.color.additional_keyboard_toggle_active_color;
    }
}
