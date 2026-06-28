package com.server.auditor.ssh.client.widget;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {
    public static final void a(SwipeRefreshLayout swipeRefreshLayout) {
        ju.t.f(swipeRefreshLayout, "<this>");
        swipeRefreshLayout.setColorSchemeResources(yk.a.a(swipeRefreshLayout.getContext(), R.attr.swipe_refresh_color_1), yk.a.a(swipeRefreshLayout.getContext(), R.attr.swipe_refresh_color_2));
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(yk.a.a(swipeRefreshLayout.getContext(), R.attr.swipe_refresh_background_color));
    }
}
