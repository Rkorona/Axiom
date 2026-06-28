package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.hostngroups.o1;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleDeviceObject;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.StaleMemberObject;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import qg.o3;
import qg.q3;
import qg.v3;
import tp.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Fragment implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0453b f29146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f29147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o3 f29148d;

    public static final class a extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f29149d = new ArrayList();

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.b$a$a, reason: collision with other inner class name */
        public static final class C0452a extends com.server.auditor.ssh.client.navigation.b {

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private final q3 f29150u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C0452a(q3 q3Var) {
                t.f(q3Var, "binding");
                ConstraintLayout constraintLayoutB = q3Var.b();
                t.e(constraintLayoutB, "getRoot(...)");
                super(constraintLayoutB);
                this.f29150u = q3Var;
            }

            public final q3 Q() {
                return this.f29150u;
            }
        }

        public final ArrayList L() {
            return this.f29149d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public void z(C0452a c0452a, int i10) {
            t.f(c0452a, "holder");
            Object obj = this.f29149d.get(i10);
            t.e(obj, "get(...)");
            c0452a.Q().f73625b.setText(((StaleDeviceObject) obj).getName());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public C0452a B(ViewGroup viewGroup, int i10) {
            t.f(viewGroup, "parent");
            q3 q3VarC = q3.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            t.e(q3VarC, "inflate(...)");
            return new C0452a(q3VarC);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int i() {
            return this.f29149d.size();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.b$b, reason: collision with other inner class name */
    public static final class C0453b extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f29151d = new ArrayList();

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.b$b$a */
        public static final class a extends com.server.auditor.ssh.client.navigation.b {

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private final v3 f29152u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(v3 v3Var) {
                t.f(v3Var, "binding");
                ConstraintLayout constraintLayoutB = v3Var.b();
                t.e(constraintLayoutB, "getRoot(...)");
                super(constraintLayoutB);
                this.f29152u = v3Var;
            }

            public final v3 Q() {
                return this.f29152u;
            }
        }

        public final ArrayList L() {
            return this.f29151d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public void z(a aVar, int i10) {
            t.f(aVar, "holder");
            Object obj = this.f29151d.get(i10);
            t.e(obj, "get(...)");
            aVar.Q().f74126b.setText(((StaleMemberObject) obj).getEmail());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public a B(ViewGroup viewGroup, int i10) {
            t.f(viewGroup, "parent");
            v3 v3VarC = v3.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            t.e(v3VarC, "inflate(...)");
            return new a(v3VarC);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int i() {
            return this.f29151d.size();
        }
    }

    private final o3 tf() {
        o3 o3Var = this.f29148d;
        if (o3Var != null) {
            return o3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(b bVar, View view) {
        k kVar = bVar.f29145a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onContinueBeforeProceed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vf(b bVar, View view) {
        k kVar = bVar.f29145a;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onBack();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void A5() {
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.new_crypto_before_proceed_message_team_owner_subtitle));
        String string = getString(R.string.new_crypto_before_proceed_message_team_owner_all_devices);
        t.e(string, "getString(...)");
        tf().f73375d.setText(aVar.a(spannableStringBuilder, string, new StyleSpan(1)), TextView.BufferType.SPANNABLE);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void I5() {
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.new_crypto_before_proceed_message_member_subtitle));
        String string = getString(R.string.new_crypto_before_proceed_message_2_2_all_team_members);
        t.e(string, "getString(...)");
        tf().f73376e.setText(aVar.a(spannableStringBuilder, string, new StyleSpan(1)), TextView.BufferType.SPANNABLE);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void N2() {
        tf().f73375d.setVisibility(8);
        tf().f73378g.setVisibility(8);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void Ub(List list) {
        t.f(list, "list");
        a aVar = this.f29147c;
        a aVar2 = null;
        if (aVar == null) {
            t.t("devicesAdapter");
            aVar = null;
        }
        aVar.L().clear();
        a aVar3 = this.f29147c;
        if (aVar3 == null) {
            t.t("devicesAdapter");
            aVar3 = null;
        }
        aVar3.L().addAll(list);
        a aVar4 = this.f29147c;
        if (aVar4 == null) {
            t.t("devicesAdapter");
        } else {
            aVar2 = aVar4;
        }
        aVar2.o();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void Ve() {
        tf().f73376e.setVisibility(8);
        tf().f73381j.setVisibility(8);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void c() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.team_entities_vertical_spacing);
        tf().f73379h.setOnClickListener(new View.OnClickListener() { // from class: vj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.b.uf(this.f83461a, view);
            }
        });
        tf().f73373b.setOnClickListener(new View.OnClickListener() { // from class: vj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.b.vf(this.f83462a, view);
            }
        });
        this.f29146b = new C0453b();
        this.f29147c = new a();
        tf().f73378g.setLayoutManager(new LinearLayoutManager(requireContext()));
        tf().f73378g.i(new o1(0, dimensionPixelSize));
        RecyclerView recyclerView = tf().f73378g;
        a aVar = this.f29147c;
        C0453b c0453b = null;
        if (aVar == null) {
            t.t("devicesAdapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        tf().f73381j.setLayoutManager(new LinearLayoutManager(requireContext()));
        tf().f73381j.i(new o1(0, dimensionPixelSize));
        RecyclerView recyclerView2 = tf().f73381j;
        C0453b c0453b2 = this.f29146b;
        if (c0453b2 == null) {
            t.t("membersAdapter");
        } else {
            c0453b = c0453b2;
        }
        recyclerView2.setAdapter(c0453b);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.c
    public void j4(List list) {
        t.f(list, "list");
        C0453b c0453b = this.f29146b;
        C0453b c0453b2 = null;
        if (c0453b == null) {
            t.t("membersAdapter");
            c0453b = null;
        }
        c0453b.L().clear();
        C0453b c0453b3 = this.f29146b;
        if (c0453b3 == null) {
            t.t("membersAdapter");
            c0453b3 = null;
        }
        c0453b3.L().addAll(list);
        C0453b c0453b4 = this.f29146b;
        if (c0453b4 == null) {
            t.t("membersAdapter");
        } else {
            c0453b2 = c0453b4;
        }
        c0453b2.o();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29148d = o3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29148d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29145a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onBeforeProceedViewCreated(this);
    }
}
