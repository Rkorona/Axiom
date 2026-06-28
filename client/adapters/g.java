package com.server.auditor.ssh.client.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21303d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21304e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f21305f = vt.v.r(a.C0319a.f21306a, a.c.f21308a, a.b.f21307a);

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.adapters.g$a$a, reason: collision with other inner class name */
        public static final class C0319a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0319a f21306a = new C0319a();

            private C0319a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21307a = new b();

            private b() {
                super(null);
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f21308a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final class b extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final qg.x f21309u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ g f21310v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, qg.x xVar) {
            super(xVar.b());
            ju.t.f(xVar, "binding");
            this.f21310v = gVar;
            this.f21309u = xVar;
        }

        public final void Q(a aVar) {
            ju.t.f(aVar, "item");
            Context context = this.f21309u.b().getContext();
            if (ju.t.b(aVar, a.C0319a.f21306a)) {
                this.f21309u.f74294f.setActualImageResource(R.drawable.ic_3d_keys);
                this.f21309u.f74296h.setText(context.getString(R.string.secure_vault_first_argument_title));
                this.f21309u.f74292d.setText(context.getString(R.string.secure_vault_first_argument_description));
            } else if (ju.t.b(aVar, a.c.f21308a)) {
                this.f21309u.f74294f.setActualImageResource(R.drawable.ic_3d_fingerprint);
                this.f21309u.f74296h.setText(context.getString(R.string.secure_vault_second_argument_title));
                this.f21309u.f74292d.setText(context.getString(R.string.secure_vault_second_argument_description));
            } else {
                if (!ju.t.b(aVar, a.b.f21307a)) {
                    throw new ut.s();
                }
                this.f21309u.f74294f.setActualImageResource(R.drawable.ic_3d_connection_cable);
                this.f21309u.f74296h.setText(context.getString(R.string.secure_vault_third_argument_title));
                this.f21309u.f74292d.setText(context.getString(R.string.secure_vault_third_argument_description));
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        private c() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(b bVar, int i10) {
        ju.t.f(bVar, "holder");
        bVar.Q((a) f21305f.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        qg.x xVarC = qg.x.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(xVarC, "inflate(...)");
        return new b(this, xVarC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return f21305f.size();
    }
}
