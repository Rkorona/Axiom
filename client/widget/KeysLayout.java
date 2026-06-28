package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
public class KeysLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KeyTextView[] f46529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnTouchListener f46531c;

    public KeysLayout(Context context) {
        this(context, null);
    }

    private void c() {
        for (KeyTextView keyTextView : this.f46529a) {
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.c(keyTextView);
        }
    }

    public void a(String str) {
        for (KeyTextView keyTextView : this.f46529a) {
            if (((com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.k) keyTextView.getTag()).f39007b.equals(str)) {
                keyTextView.a();
            }
        }
    }

    public void b(String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            KeyTextView keyTextView = this.f46529a[i10];
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.b(this.f46530b, keyTextView, strArr[i10], iArr[i10]);
            keyTextView.setOnTouchListener(this.f46531c);
        }
    }

    public void d(LinearLayout.LayoutParams layoutParams) {
        for (KeyTextView keyTextView : this.f46529a) {
            keyTextView.setLayoutParams(layoutParams);
        }
    }

    public void setButtonState(String str, KeyTextView.State state) {
        for (KeyTextView keyTextView : this.f46529a) {
            if (((com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.k) keyTextView.getTag()).f39007b.equals(str)) {
                keyTextView.setState(state);
            }
        }
    }

    public void setButtonsStyle(String str) {
        this.f46530b = str;
        c();
    }

    public void setOnAdditionalKeysClickListener(View.OnTouchListener onTouchListener) {
        this.f46531c = onTouchListener;
    }

    public KeysLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeysLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cg.b.KeysLayout, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.additional_key_group);
            typedArrayObtainStyledAttributes.recycle();
            View.inflate(context, resourceId, this);
            this.f46529a = new KeyTextView[]{(KeyTextView) findViewById(R.id.key1), (KeyTextView) findViewById(R.id.key2), (KeyTextView) findViewById(R.id.key3), (KeyTextView) findViewById(R.id.key4)};
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
