package com.server.auditor.ssh.client.fragments.viewholder;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.ImportOptionType;
import iu.l;
import ju.t;
import qg.j5;
import ut.s;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j5 f27009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final l f27010w;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(j5 j5Var, l lVar) {
        t.f(j5Var, "binding");
        t.f(lVar, "onClick");
        ConstraintLayout constraintLayoutB = j5Var.b();
        t.e(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        this.f27009v = j5Var;
        this.f27010w = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(i iVar, ImportOptionType importOptionType, View view) {
        iVar.f27010w.invoke(importOptionType);
    }

    @Override // com.server.auditor.ssh.client.fragments.viewholder.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void Q(final ImportOptionType importOptionType, boolean z10, boolean z11) {
        t.f(importOptionType, "item");
        Context context = this.f27009v.b().getContext();
        if (t.b(importOptionType, ImportOptionType.AWS.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_aws));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_aws_option_label));
        } else if (t.b(importOptionType, ImportOptionType.CSV.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_csv_file));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_csv_option_label));
        } else if (t.b(importOptionType, ImportOptionType.DigitalOcean.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_digital_ocean));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_digital_ocean_option_label));
        } else if (t.b(importOptionType, ImportOptionType.MobaXTerm.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_mobaxterm));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_mobaxterm_option_label));
        } else if (t.b(importOptionType, ImportOptionType.PuTTY.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_putty));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_putty_option_label));
        } else if (t.b(importOptionType, ImportOptionType.SecureCRT.INSTANCE)) {
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_securecrt));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_securecrt_option_label));
        } else {
            if (!t.b(importOptionType, ImportOptionType.SshConfig.INSTANCE)) {
                throw new s();
            }
            this.f27009v.f72863c.setImageDrawable(androidx.core.content.a.getDrawable(context, R.drawable.ic_file));
            this.f27009v.f72862b.setText(context.getString(R.string.quick_import_ssh_config_option_label));
        }
        this.f27009v.f72864d.setOnClickListener(new View.OnClickListener() { // from class: li.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.fragments.viewholder.i.U(this.f64184a, importOptionType, view);
            }
        });
    }
}
