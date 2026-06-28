package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a0;
import androidx.lifecycle.l1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.c;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import iu.p;
import ju.t;
import qg.p3;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Fragment implements k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f29153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p3 f29154b;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29155a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29155a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            c.this.tf().f73514d.setSpinSpeed(1.0f);
            c.this.tf().f73514d.setProgress(1.0f);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29157a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29157a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            c.this.tf().f73515e.setVisibility(8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.c$c, reason: collision with other inner class name */
    static final class C0454c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29159a;

        C0454c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(c cVar, View view) {
            k kVar = cVar.f29153a;
            if (kVar == null) {
                t.t("presenter");
                kVar = null;
            }
            kVar.onDoItLaterClick();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new C0454c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MaterialButton materialButton = c.this.tf().f73515e;
            final c cVar = c.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.notifications.newcrypto.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.C0454c.k(cVar, view);
                }
            });
            c.this.tf().f73517g.setVisibility(8);
            c.this.tf().f73514d.g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((C0454c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29161a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29161a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            c.this.tf().f73517g.setVisibility(0);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p3 tf() {
        p3 p3Var = this.f29154b;
        if (p3Var != null) {
            return p3Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.d
    public void U4() {
        a0.a(this).d(new b(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.d
    public void c() {
        a0.a(this).d(new C0454c(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.d
    public void n7() {
        a0.a(this).d(new d(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        this.f29154b = p3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = tf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29154b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29153a = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onCheckingSetupViewCreated(this);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.d
    public void s4() {
        a0.a(this).d(new a(null));
    }
}
