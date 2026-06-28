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
import qg.r3;
import tp.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Fragment implements k.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r3 f29165b;

    public static final class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            t.f(view, "widget");
            k kVar = e.this.f29164a;
            if (kVar == null) {
                t.t("presenter");
                kVar = null;
            }
            kVar.onNewEncryptionLinkClick();
        }
    }

    private final r3 tf() {
        r3 r3Var = this.f29165b;
        if (r3Var != null) {
            return r3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(e eVar, View view) {
        k kVar = eVar.f29164a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onDoneClick();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.e
    public void c() {
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.new_crypto_done_text));
        String string = getString(R.string.new_crypto_done_text_1);
        t.e(string, "getString(...)");
        tf().f73715c.setText(aVar.a(spannableStringBuilder, string, new a()), TextView.BufferType.SPANNABLE);
        tf().f73715c.setMovementMethod(LinkMovementMethod.getInstance());
        tf().f73715c.setHighlightColor(0);
        tf().f73714b.setOnClickListener(new View.OnClickListener() { // from class: vj.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.e.uf(this.f83463a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29165b = r3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29165b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29164a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onDoneViewCreated(this);
    }
}
