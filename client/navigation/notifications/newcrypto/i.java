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
import qg.z3;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Fragment implements k.InterfaceC0457k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z3 f29315b;

    private final z3 tf() {
        z3 z3Var = this.f29315b;
        if (z3Var != null) {
            return z3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(i iVar, View view) {
        k kVar = iVar.f29314a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onCloseErrorScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vf(i iVar, View view) {
        k kVar = iVar.f29314a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnableNewEncryptionClick();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.InterfaceC0457k
    public void c() {
        tf().f74541d.setOnClickListener(new View.OnClickListener() { // from class: vj.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.i.uf(this.f83473a, view);
            }
        });
        tf().f74544g.setOnClickListener(new View.OnClickListener() { // from class: vj.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.i.vf(this.f83474a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29315b = z3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29315b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29314a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onOfflineErrorViewCreated(this);
    }
}
