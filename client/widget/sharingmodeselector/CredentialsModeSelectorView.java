package com.server.auditor.ssh.client.widget.sharingmodeselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.widget.sharingmodeselector.CredentialsModeSelectorView;
import ju.k;
import ju.t;
import qg.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialsModeSelectorView extends ConstraintLayout {
    public static final b Q = new b(null);
    public static final int R = 8;
    private final t6 N;
    private a O;
    private String P;

    public interface a {
        void a();
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialsModeSelectorView(Context context) {
        this(context, null, 0, 0, 14, null);
        t.f(context, "context");
    }

    private final void x() {
        this.N.b().setOnClickListener(new View.OnClickListener() { // from class: oq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CredentialsModeSelectorView.y(this.f69487a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(CredentialsModeSelectorView credentialsModeSelectorView, View view) {
        if (credentialsModeSelectorView.isEnabled()) {
            credentialsModeSelectorView.z();
        }
    }

    private final void z() {
        a aVar = this.O;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "credentialsMode"
            ju.t.f(r3, r0)
            int r0 = r3.hashCode()
            r1 = -648741223(0xffffffffd954fe99, float:-3.7470393E15)
            if (r0 == r1) goto L45
            r1 = 304885531(0x122c2f1b, float:5.433169E-28)
            if (r0 == r1) goto L2f
            r1 = 653824646(0x26f89286, float:1.7248172E-15)
            if (r0 == r1) goto L19
            goto L4d
        L19:
            java.lang.String r0 = "multikey"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L22
            goto L4d
        L22:
            qg.t6 r0 = r2.N
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f73973c
            java.lang.String r1 = "Multikey"
            r0.setText(r1)
            r0 = 2131231757(0x7f08040d, float:1.8079604E38)
            goto L5d
        L2f:
            java.lang.String r0 = "no_credentials_sharing"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L38
            goto L4d
        L38:
            qg.t6 r0 = r2.N
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f73973c
            java.lang.String r1 = "Private Credentials"
            r0.setText(r1)
            r0 = 2131231754(0x7f08040a, float:1.8079598E38)
            goto L5d
        L45:
            java.lang.String r0 = "credentials_sharing"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L51
        L4d:
            r0 = 2131231758(0x7f08040e, float:1.8079606E38)
            goto L5d
        L51:
            qg.t6 r0 = r2.N
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f73973c
            java.lang.String r1 = "Shared Credentials"
            r0.setText(r1)
            r0 = 2131231760(0x7f080410, float:1.807961E38)
        L5d:
            qg.t6 r1 = r2.N
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f73972b
            r1.setImageResource(r0)
            r2.P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.widget.sharingmodeselector.CredentialsModeSelectorView.A(java.lang.String):void");
    }

    public final String getSelectedCredentialsMode() {
        return this.P;
    }

    public final void setCallBack(a aVar) {
        t.f(aVar, "callback");
        this.O = aVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.N.f73972b.setEnabled(z10);
        this.N.f73974d.setEnabled(z10);
        this.N.f73973c.setEnabled(z10);
        this.N.f73975e.setEnabled(z10);
    }

    public final void setSelectedCredentialsMode(String str) {
        t.f(str, "<set-?>");
        this.P = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialsModeSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialsModeSelectorView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        t.f(context, "context");
    }

    public /* synthetic */ CredentialsModeSelectorView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsModeSelectorView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        t.f(context, "context");
        this.P = "no_credentials_sharing";
        t6 t6VarC = t6.c(LayoutInflater.from(context), this, true);
        t.e(t6VarC, "inflate(...)");
        this.N = t6VarC;
        x();
    }
}
