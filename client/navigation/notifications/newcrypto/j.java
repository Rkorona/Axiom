package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import ju.t;
import qg.b4;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Fragment implements k.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b4 f29317b;

    private final b4 tf() {
        b4 b4Var = this.f29317b;
        if (b4Var != null) {
            return b4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(j jVar, View view) {
        k kVar = jVar.f29316a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onCloseErrorScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vf(j jVar, View view) {
        k kVar = jVar.f29316a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnableNewEncryptionClick();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.l
    public void c() {
        tf().f71980d.setOnClickListener(new View.OnClickListener() { // from class: vj.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.j.uf(this.f83475a, view);
            }
        });
        tf().f71983g.setOnClickListener(new View.OnClickListener() { // from class: vj.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.j.vf(this.f83476a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29317b = b4.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29317b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29316a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onOopsErrorViewCreated(this);
    }
}
