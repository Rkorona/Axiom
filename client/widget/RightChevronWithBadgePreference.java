package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class RightChevronWithBadgePreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f46553d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f46554e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightChevronWithBadgePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ju.t.f(context, "context");
        I0(R.layout.right_chevron_badge_settings_widget);
    }

    public final void O0(boolean z10, boolean z11) {
        this.f46553d0 = z10;
        this.f46554e0 = z11;
        P();
    }

    @Override // androidx.preference.Preference
    public void V(androidx.preference.m mVar) {
        ju.t.f(mVar, "holder");
        super.V(mVar);
        View viewQ = mVar.Q(R.id.badge_view_medium);
        View viewQ2 = mVar.Q(R.id.badge_view_critical);
        boolean z10 = this.f46553d0;
        if (z10 && this.f46554e0) {
            if (viewQ2 != null) {
                viewQ2.setVisibility(0);
            }
            if (viewQ != null) {
                viewQ.setVisibility(8);
                return;
            }
            return;
        }
        if (z10) {
            if (viewQ2 != null) {
                viewQ2.setVisibility(8);
            }
            if (viewQ != null) {
                viewQ.setVisibility(0);
                return;
            }
            return;
        }
        if (viewQ != null) {
            viewQ.setVisibility(8);
        }
        if (viewQ2 != null) {
            viewQ2.setVisibility(8);
        }
    }
}
