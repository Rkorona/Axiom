package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import io.split.android.client.dtos.SerializableEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class VaultSelectorItemView extends ConstraintLayout implements IVaultKeyIdHolder {
    public static final a V = new a(null);
    public static final int W = 8;
    private AppCompatImageView N;
    private AppCompatImageView O;
    private AppCompatTextView P;
    private final AppCompatImageView Q;
    private long R;
    private VaultKeyId S;
    private boolean T;
    private boolean U;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorItemView(Context context) {
        this(context, null, 0, 0, 14, null);
        ju.t.f(context, "context");
    }

    public final long getVaultId() {
        return this.R;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.S;
    }

    public final void setIsDefault(boolean z10) {
        this.T = z10;
    }

    public final void setIsSelected(boolean z10) {
        this.U = z10;
        this.O.setVisibility(z10 ? 0 : 8);
    }

    public final void setName(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        this.P.setText(str);
    }

    public final void setVaultId(long j10) {
        this.R = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.S = vaultKeyId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        ju.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultSelectorItemView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        ju.t.f(context, "context");
    }

    public /* synthetic */ VaultSelectorItemView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, ju.k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultSelectorItemView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        ju.t.f(context, "context");
        this.R = -1L;
        this.S = VaultKeyId.Companion.a();
        LayoutInflater.from(context).inflate(R.layout.vault_selector_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.icon);
        ju.t.e(viewFindViewById, "findViewById(...)");
        this.N = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.selected_mark);
        ju.t.e(viewFindViewById2, "findViewById(...)");
        this.O = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.name);
        ju.t.e(viewFindViewById3, "findViewById(...)");
        this.P = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.upgrade_icon);
        ju.t.e(viewFindViewById4, "findViewById(...)");
        this.Q = (AppCompatImageView) viewFindViewById4;
    }
}
