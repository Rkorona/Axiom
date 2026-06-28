package com.server.auditor.ssh.client.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.ImportOptionType;
import com.server.auditor.ssh.client.models.o;
import java.util.ArrayList;
import java.util.List;
import qg.h5;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends RecyclerView.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21270e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21271f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f21272d = new ArrayList();

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final class b extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final h5 f21273u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c0 f21274v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, h5 h5Var) {
            super(h5Var.b());
            ju.t.f(h5Var, "binding");
            this.f21274v = c0Var;
            this.f21273u = h5Var;
        }

        private final String Q(Context context, ImportOptionType importOptionType) {
            if (ju.t.b(importOptionType, ImportOptionType.AWS.INSTANCE)) {
                String string = context.getString(R.string.quick_import_aws_option_label);
                ju.t.e(string, "getString(...)");
                String string2 = context.getString(R.string.quick_import_step_configure_credentials, string);
                ju.t.c(string2);
                return string2;
            }
            if (ju.t.b(importOptionType, ImportOptionType.DigitalOcean.INSTANCE)) {
                String string3 = context.getString(R.string.quick_import_digital_ocean_option_label);
                ju.t.e(string3, "getString(...)");
                String string4 = context.getString(R.string.quick_import_step_configure_credentials, string3);
                ju.t.c(string4);
                return string4;
            }
            if (!ju.t.b(importOptionType, ImportOptionType.CSV.INSTANCE) && !ju.t.b(importOptionType, ImportOptionType.MobaXTerm.INSTANCE) && !ju.t.b(importOptionType, ImportOptionType.PuTTY.INSTANCE) && !ju.t.b(importOptionType, ImportOptionType.SecureCRT.INSTANCE) && !ju.t.b(importOptionType, ImportOptionType.SshConfig.INSTANCE)) {
                throw new ut.s();
            }
            String string5 = context.getString(R.string.quick_import_step_choose_files_to_import);
            ju.t.c(string5);
            return string5;
        }

        public final void R(int i10, com.server.auditor.ssh.client.models.o oVar) {
            ju.t.f(oVar, "step");
            Context context = this.f21273u.b().getContext();
            this.f21273u.f72649c.setImageDrawable(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? androidx.core.content.a.getDrawable(context, R.drawable.ic_circle) : androidx.core.content.a.getDrawable(context, R.drawable.ic_fourth_ball) : androidx.core.content.a.getDrawable(context, R.drawable.ic_third_ball) : androidx.core.content.a.getDrawable(context, R.drawable.ic_second_ball) : androidx.core.content.a.getDrawable(context, R.drawable.ic_first_ball));
            if (ju.t.b(oVar, o.a.f27918a)) {
                this.f21273u.f72648b.setText(context.getString(R.string.quick_import_step_create_account));
                return;
            }
            if (ju.t.b(oVar, o.b.f27919a)) {
                this.f21273u.f72648b.setText(context.getString(R.string.quick_import_step_download_desktop_app));
                return;
            }
            if (ju.t.b(oVar, o.c.f27920a)) {
                this.f21273u.f72648b.setText(context.getString(R.string.quick_import_step_open_desktop_app));
                return;
            }
            if (oVar instanceof o.d) {
                TextView textView = this.f21273u.f72648b;
                ju.t.c(context);
                textView.setText(Q(context, ((o.d) oVar).a()));
            } else if (ju.t.b(oVar, o.e.f27922a)) {
                this.f21273u.f72648b.setText(context.getString(R.string.quick_import_step_sync_data));
            } else {
                if (!ju.t.b(oVar, o.f.f27923a)) {
                    throw new ut.s();
                }
                this.f21273u.f72648b.setText(context.getString(R.string.quick_import_step_upgrade_to_pro));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(b bVar, int i10) {
        ju.t.f(bVar, "holder");
        int i11 = i10 + 1;
        Object obj = this.f21272d.get(i10);
        ju.t.e(obj, "get(...)");
        bVar.R(i11, (com.server.auditor.ssh.client.models.o) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        h5 h5VarC = h5.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(h5VarC, "inflate(...)");
        return new b(this, h5VarC);
    }

    public final void N(List list) {
        ju.t.f(list, "newInstructions");
        this.f21272d.clear();
        this.f21272d.addAll(list);
        o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21272d.size();
    }
}
