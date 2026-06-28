package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
class a extends KeyTextView.a {
    a(Context context, String str) {
        super(context, str);
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.a, com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
    protected Drawable c(KeyTextView.State state, String str, Context context) {
        return state == KeyTextView.State.Hold ? androidx.core.content.a.getDrawable(context, R.drawable.hold_states_button_light) : androidx.core.content.a.getDrawable(context, R.drawable.pressed_states_button_light);
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.a, com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
    protected int e(KeyTextView.State state, String str, Context context) {
        return state == KeyTextView.State.Initial ? R.color.additional_keyboard_btn_text_color : R.color.additional_keyboard_toggle_active_color;
    }
}
