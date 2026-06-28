package com.server.auditor.ssh.client.widget.vaultselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import qg.r8;
import tl.l2;
import vl.g;

/* JADX INFO: loaded from: classes4.dex */
public final class VaultSelectorView extends ConstraintLayout {
    private r8 N;
    private a O;
    private final ArrayList P;
    private VaultKeyId Q;

    public interface a {
        void S6();

        void We();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorView(Context context) {
        this(context, null, 0, 0, 14, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(View view) {
    }

    public static /* synthetic */ VaultKeyId D(VaultSelectorView vaultSelectorView, VaultKeyId vaultKeyId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vaultKeyId = VaultKeyId.Companion.a();
        }
        return vaultSelectorView.C(vaultKeyId);
    }

    private final r8 getBinding() {
        r8 r8Var = this.N;
        if (r8Var != null) {
            return r8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(VaultSelectorView vaultSelectorView, View view) {
        a aVar = vaultSelectorView.O;
        if (aVar != null) {
            aVar.We();
        }
        a aVar2 = vaultSelectorView.O;
        if (aVar2 != null) {
            aVar2.S6();
        }
    }

    public final void A(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        C(vaultKeyId);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: qq.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VaultSelectorView.B(view);
            }
        });
        AppCompatImageView appCompatImageView = getBinding().f73753e;
        t.e(appCompatImageView, "vaultTriangle");
        appCompatImageView.setVisibility(8);
        getBinding().f73750b.setEnabled(false);
        getBinding().f73751c.setEnabled(false);
    }

    public final VaultKeyId C(VaultKeyId vaultKeyId) {
        Object next;
        t.f(vaultKeyId, "vaultKeyId");
        if (com.server.auditor.ssh.client.ui.vaults.data.a.c(vaultKeyId)) {
            Iterator it = this.P.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (sp.a.g((l2) next)) {
                    break;
                }
            }
            l2 l2Var = (l2) next;
            if (l2Var != null) {
                getBinding().f73751c.setText(g.f83702b.a(l2Var));
                this.Q = l2Var.g();
            }
        } else {
            for (l2 l2Var2 : this.P) {
                if (t.b(l2Var2.g(), vaultKeyId)) {
                    getBinding().f73751c.setText(g.f83702b.a(l2Var2));
                    this.Q = vaultKeyId;
                }
            }
        }
        return this.Q;
    }

    public final VaultKeyId getCurrentVaultKeyId() {
        return this.Q;
    }

    public final void z(List list, a aVar) {
        t.f(list, "vaults");
        this.O = aVar;
        this.P.addAll(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        t.f(context, "context");
    }

    public /* synthetic */ VaultSelectorView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultSelectorView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        t.f(context, "context");
        this.P = new ArrayList();
        this.Q = VaultKeyId.Companion.a();
        this.N = r8.c(LayoutInflater.from(context), this, true);
        D(this, null, 1, null);
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: qq.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VaultSelectorView.y(this.f75365a, view);
            }
        });
    }
}
