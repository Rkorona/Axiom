package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public class KeyTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private State f38955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f38956b;

    public enum State {
        Initial,
        Pressed,
        Hold
    }

    public static class a extends b {
        a(Context context, String str) {
            super(context, str);
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
        protected Drawable c(State state, String str, Context context) {
            return null;
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
        protected Integer d(State state, String str, Context context, boolean z10) {
            return null;
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView.b
        protected int e(State state, String str, Context context) {
            return R.color.additional_keyboard_btn_text_color;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f38957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38958b;

        b(Context context, String str) {
            this.f38957a = context;
            this.f38958b = str;
        }

        final Drawable a(State state) {
            return c(state, this.f38958b, this.f38957a);
        }

        final Integer b(State state, boolean z10) {
            return d(state, this.f38958b, this.f38957a, z10);
        }

        protected abstract Drawable c(State state, String str, Context context);

        protected abstract Integer d(State state, String str, Context context, boolean z10);

        protected abstract int e(State state, String str, Context context);

        final int f(State state) {
            return e(state, this.f38958b, this.f38957a);
        }
    }

    public KeyTextView(Context context) {
        super(context);
        this.f38956b = null;
    }

    private void c(Drawable drawable, Integer num, int i10) {
        if (num == null) {
            setTextColor(androidx.core.content.a.getColor(getContext(), i10));
        } else {
            b(this, num.intValue());
        }
        if (drawable != null) {
            setBackground(drawable);
        }
    }

    public void a() {
        this.f38955a = State.Initial;
        setResourceByState();
    }

    public void b(TextView textView, int i10) {
        ImageSpan imageSpan = new ImageSpan(getContext(), i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("g");
        spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
        textView.setText("g");
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public b getSafeResourceHolder() {
        if (this.f38956b == null) {
            this.f38956b = new a(getContext(), com.server.auditor.ssh.client.app.a.N().M().getString("terminal_style_setting", "Material Light"));
        }
        return this.f38956b;
    }

    public void setDefaultInitial() {
        b safeResourceHolder = getSafeResourceHolder();
        State state = State.Initial;
        c(safeResourceHolder.a(state), getSafeResourceHolder().b(state, false), getSafeResourceHolder().f(state));
    }

    public void setDefaultPressed() {
        b safeResourceHolder = getSafeResourceHolder();
        State state = State.Pressed;
        c(safeResourceHolder.a(state), getSafeResourceHolder().b(state, false), getSafeResourceHolder().f(state));
    }

    public void setResourceByState() {
        c(getSafeResourceHolder().a(this.f38955a), getSafeResourceHolder().b(this.f38955a, false), getSafeResourceHolder().f(this.f38955a));
    }

    public void setResourceHolder(b bVar) {
        this.f38956b = bVar;
    }

    public void setState(State state) {
        this.f38955a = state;
        setResourceByState();
    }

    public KeyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38956b = null;
    }

    public KeyTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f38956b = null;
    }
}
