package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class TerminalDrawerLayout extends DrawerLayout {
    public static final String DRAWER_LAYOUT_MARGIN_FIELD = "mMinDrawerMargin";

    public TerminalDrawerLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField(DRAWER_LAYOUT_MARGIN_FIELD);
            declaredField.setAccessible(true);
            declaredField.set(this, 0);
        } catch (Throwable th2) {
            y9.a.f86838a.i(th2);
        }
        setDrawerLockMode(1);
        super.onFinishInflate();
    }

    public TerminalDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TerminalDrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
