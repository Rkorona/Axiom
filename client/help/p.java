package com.server.auditor.ssh.client.help;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textview.MaterialTextView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.m1;
import com.server.auditor.ssh.client.help.p;
import com.server.auditor.ssh.client.presenters.HelpDeskPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.p2;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends MvpAppCompatFragment implements m1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f27048e = {n0.g(new g0(p.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/HelpDeskPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27049f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p2 f27050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private iu.l f27051b = new iu.l() { // from class: com.server.auditor.ssh.client.help.d
        @Override // iu.l
        public final Object invoke(Object obj) {
            return p.Bf((String) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private iu.a f27052c = new iu.a() { // from class: com.server.auditor.ssh.client.help.e
        @Override // iu.a
        public final Object a() {
            return p.Af();
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f27053d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27054a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(p pVar, View view) {
            pVar.zf().B2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(p pVar, View view) {
            pVar.zf().A2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(p pVar, View view) {
            pVar.zf().C2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(p pVar, View view) {
            pVar.zf().z2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(p pVar, View view) {
            pVar.zf().s2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(p pVar, View view) {
            pVar.zf().y2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(p pVar, View view) {
            pVar.zf().x2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(p pVar, View view) {
            pVar.zf().u2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(p pVar, View view) {
            pVar.zf().v2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialTextView materialTextView = p.this.wf().f73498d;
            final p pVar = p.this;
            materialTextView.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.s(pVar, view);
                }
            });
            MaterialTextView materialTextView2 = p.this.wf().f73500f;
            final p pVar2 = p.this;
            materialTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.t(pVar2, view);
                }
            });
            MaterialTextView materialTextView3 = p.this.wf().f73497c;
            final p pVar3 = p.this;
            materialTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.u(pVar3, view);
                }
            });
            MaterialTextView materialTextView4 = p.this.wf().f73496b;
            final p pVar4 = p.this;
            materialTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.v(pVar4, view);
                }
            });
            MaterialTextView materialTextView5 = p.this.wf().f73501g;
            final p pVar5 = p.this;
            materialTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.x(pVar5, view);
                }
            });
            LinearLayout linearLayout = p.this.wf().f73499e;
            final p pVar6 = p.this;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.y(pVar6, view);
                }
            });
            LinearLayout linearLayout2 = p.this.wf().f73510p;
            final p pVar7 = p.this;
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.z(pVar7, view);
                }
            });
            LinearLayout linearLayout3 = p.this.wf().f73507m;
            final p pVar8 = p.this;
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.A(pVar8, view);
                }
            });
            LinearLayout linearLayout4 = p.this.wf().f73508n;
            final p pVar9 = p.this;
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.help.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.B(pVar9, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27056a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f27058c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new b(this.f27058c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27056a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = p.this.getString(R.string.helpdesk_link_authorized_feature_request, this.f27058c);
            ju.t.e(string, "getString(...)");
            p.this.yf().invoke(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27059a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27059a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context contextRequireContext = p.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            String string = p.this.getString(R.string.helpdesk_link_changelog);
            ju.t.e(string, "getString(...)");
            xn.e.d(contextRequireContext, string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27061a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context contextRequireContext = p.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            String string = p.this.getString(R.string.helpdesk_link_facebook);
            ju.t.e(string, "getString(...)");
            xn.e.d(contextRequireContext, string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27063a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            p.this.xf().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27065a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27065a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = p.this.getString(R.string.helpdesk_link_team_feature_request);
            ju.t.e(string, "getString(...)");
            p.this.yf().invoke(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27067a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27067a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context contextRequireContext = p.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            String string = p.this.getString(R.string.helpdesk_link_medium);
            ju.t.e(string, "getString(...)");
            xn.e.d(contextRequireContext, string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27069a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27069a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context contextRequireContext = p.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            String string = p.this.getString(R.string.helpdesk_link_termius_docs);
            ju.t.e(string, "getString(...)");
            xn.e.d(contextRequireContext, string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27071a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27071a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context contextRequireContext = p.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            String string = p.this.getString(R.string.helpdesk_link_twitter);
            ju.t.e(string, "getString(...)");
            xn.e.d(contextRequireContext, string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27073a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27073a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = p.this.getString(R.string.helpdesk_link_unauthorized_feature_request);
            ju.t.e(string, "getString(...)");
            p.this.yf().invoke(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27075a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f27077c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new k(this.f27077c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27075a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(p.this.getString(R.string.helpdesk_mailto_prefix)));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{p.this.getString(R.string.helpdesk_support_email)});
            intent.putExtra("android.intent.extra.SUBJECT", p.this.getString(R.string.helpdesk_support_email_subject));
            String string = p.this.getString(R.string.helpdesk_support_email_object, this.f27077c);
            ju.t.e(string, "getString(...)");
            intent.putExtra("android.intent.extra.TEXT", string);
            try {
                p.this.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                p.this.zf().w2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27078a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f27080c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new l(this.f27080c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27078a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            p.this.wf().f73500f.setEnabled(this.f27080c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27081a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27081a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent();
            String string = p.this.getString(R.string.termius_web_site);
            ju.t.e(string, "getString(...)");
            String string2 = p.this.getString(R.string.helpdesk_data_type_share_link);
            ju.t.e(string2, "getString(...)");
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", string);
            intent.setType(string2);
            p.this.startActivity(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27083a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(p pVar, String str, String str2, DialogInterface dialogInterface, int i10) {
            pVar.zf().t2(str, str2);
            dialogInterface.cancel();
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27083a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            yp.a aVar = new yp.a(new be.b(p.this.requireContext()));
            final String string = p.this.getString(R.string.helpdesk_clipboard_label);
            ju.t.e(string, "getString(...)");
            final String string2 = p.this.getString(R.string.helpdesk_support_email);
            ju.t.e(string2, "getString(...)");
            be.b bVarF = aVar.f();
            final p pVar = p.this;
            bVarF.setPositiveButton(R.string.helpdesk_no_email_client_found_copy_button_title, new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.help.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    p.n.l(pVar, string, string2, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.close, new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.help.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    p.n.m(dialogInterface, i10);
                }
            }).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27085a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return p.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27085a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Toast.makeText(p.this.getActivity(), p.this.getString(R.string.helpdesk_network_error), 1).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public p() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.help.f
            @Override // iu.a
            public final Object a() {
                return p.Cf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f27053d = new MoxyKtxDelegate(mvpDelegate, HelpDeskPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Af() {
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Bf(String str) {
        ju.t.f(str, "it");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HelpDeskPresenter Cf() {
        return new HelpDeskPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p2 wf() {
        p2 p2Var = this.f27050a;
        if (p2Var != null) {
            return p2Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HelpDeskPresenter zf() {
        return (HelpDeskPresenter) this.f27053d.getValue(this, f27048e[0]);
    }

    public final void Df(iu.a aVar) {
        ju.t.f(aVar, "<set-?>");
        this.f27052c = aVar;
    }

    public final void Ef(iu.l lVar) {
        ju.t.f(lVar, "<set-?>");
        this.f27051b = lVar;
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void Ke() {
        androidx.lifecycle.a0.a(this).d(new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void N7() {
        androidx.lifecycle.a0.a(this).d(new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void Na(String str) {
        ju.t.f(str, "jwtToken");
        androidx.lifecycle.a0.a(this).d(new b(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void Q2(String str) {
        ju.t.f(str, "appInfo");
        androidx.lifecycle.a0.a(this).d(new k(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void W1() {
        androidx.lifecycle.a0.a(this).d(new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void X8() {
        androidx.lifecycle.a0.a(this).d(new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void X9() {
        androidx.lifecycle.a0.a(this).d(new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void a() {
        androidx.lifecycle.a0.a(this).d(new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void f7() {
        androidx.lifecycle.a0.a(this).d(new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void g() {
        androidx.lifecycle.a0.a(this).d(new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void k5() {
        androidx.lifecycle.a0.a(this).d(new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void n4() {
        androidx.lifecycle.a0.a(this).d(new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void ne(boolean z10) {
        androidx.lifecycle.a0.a(this).d(new l(z10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f27050a = p2.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = wf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f27050a = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        ch.f fVar = new ch.f();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.o(fragmentActivityRequireActivity);
        fVar.j();
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void s1() {
        androidx.lifecycle.a0.a(this).d(new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.m1
    public void ta() {
        androidx.lifecycle.a0.a(this).d(new d(null));
    }

    public final iu.a xf() {
        return this.f27052c;
    }

    public final iu.l yf() {
        return this.f27051b;
    }
}
