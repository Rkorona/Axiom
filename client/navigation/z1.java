package com.server.auditor.ssh.client.navigation;

import com.server.auditor.ssh.client.widget.ProgressButton;

/* JADX INFO: loaded from: classes3.dex */
public interface z1 {

    public interface a {
        void Qc(int i10);

        void c();

        void kb(int i10);

        void lc(int i10);

        void n0();

        void sb(int i10, ProgressButton.b bVar);
    }

    zu.k0 getNotifications();

    void onActionButtonClicked(com.server.auditor.ssh.client.adapters.h hVar, Integer num);

    void onResume();

    void onSwipeToRefreshGesture();

    void onViewCreated(a aVar);
}
