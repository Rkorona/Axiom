package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import ju.t;
import qg.n3;
import tp.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Fragment implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n3 f29143b;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.a$a, reason: collision with other inner class name */
    public static final class C0451a extends ClickableSpan {
        C0451a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            t.f(view, "widget");
            k kVar = a.this.f29142a;
            if (kVar == null) {
                t.t("presenter");
                kVar = null;
            }
            kVar.onNewEncryptionLinkClick();
        }
    }

    private final n3 tf() {
        n3 n3Var = this.f29143b;
        if (n3Var != null) {
            return n3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(a aVar, View view) {
        k kVar = aVar.f29142a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onDoneClick();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.a
    public void c() {
        tf().f73306c.setOnClickListener(new View.OnClickListener() { // from class: vj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.a.uf(this.f83460a, view);
            }
        });
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.new_crypto_already_migrated_message));
        String string = getString(R.string.new_crypto_already_migrated_message_here_highlight);
        t.e(string, "getString(...)");
        tf().f73305b.setText(aVar.a(spannableStringBuilder, string, new C0451a()), TextView.BufferType.SPANNABLE);
        tf().f73305b.setMovementMethod(LinkMovementMethod.getInstance());
        tf().f73305b.setHighlightColor(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29143b = n3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29143b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29142a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onAlreadyMigratedViewCreated(this);
    }
}
