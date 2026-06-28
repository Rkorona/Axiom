package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.preference.Preference;
import com.facebook.drawee.view.SimpleDraweeView;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountButtonPreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f46509d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f46510e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Uri f46511f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f46512g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        x0(R.layout.settings_account_item);
        this.f46509d0 = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(AccountButtonPreference accountButtonPreference, View view) {
        accountButtonPreference.h0();
    }

    public final void Q0() {
        this.f46512g0 = true;
    }

    public final void R0() {
        this.f46512g0 = false;
    }

    public final void S0(int i10, String str) {
        ju.t.f(str, "avatarInitials");
        this.f46510e0 = i10;
        this.f46509d0 = str;
    }

    public final void T0(Uri uri) {
        ju.t.f(uri, "imageUri");
        this.f46511f0 = uri;
    }

    @Override // androidx.preference.Preference
    public void V(androidx.preference.m mVar) {
        ju.t.f(mVar, "holder");
        mVar.f10534a.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountButtonPreference.P0(this.f46602a, view);
            }
        });
        View viewFindViewById = mVar.f10534a.findViewById(R.id.title);
        ju.t.e(viewFindViewById, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = mVar.f10534a.findViewById(R.id.first_letter);
        ju.t.e(viewFindViewById2, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = mVar.f10534a.findViewById(R.id.profile_icon_view);
        ju.t.e(viewFindViewById3, "findViewById(...)");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = mVar.f10534a.findViewById(R.id.sign_in_view);
        ju.t.e(viewFindViewById4, "findViewById(...)");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = mVar.f10534a.findViewById(R.id.summary);
        ju.t.e(viewFindViewById5, "findViewById(...)");
        if (this.f46512g0) {
            appCompatTextView3.setVisibility(8);
            viewFindViewById5.setVisibility(0);
            simpleDraweeView.setVisibility(0);
            appCompatTextView2.setVisibility(0);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(H());
            if (this.f46511f0 == null) {
                appCompatTextView2.setText(this.f46509d0);
                appCompatTextView2.setVisibility(0);
                simpleDraweeView.setActualImageResource(this.f46510e0);
            } else {
                appCompatTextView2.setVisibility(8);
                simpleDraweeView.setImageURI(this.f46511f0, o());
            }
        } else {
            appCompatTextView3.setText(H());
            appCompatTextView3.setVisibility(0);
            viewFindViewById5.setVisibility(8);
            simpleDraweeView.setVisibility(8);
            appCompatTextView2.setVisibility(8);
            appCompatTextView.setVisibility(8);
        }
        mVar.V(true);
    }
}
