package com.server.auditor.ssh.client.presenters;

import com.crystalnix.termius.libtermius.SKKeyInfo;
import com.crystalnix.termius.libtermius.SshKey;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.i1;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.c0;
import com.server.auditor.ssh.client.interactors.g1;
import com.server.auditor.ssh.client.interactors.r;
import com.server.auditor.ssh.client.models.webauthn.Fido2AuthenticatorAttestationResponse;
import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshKeyApiAdapter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import hg.b2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import ju.t;
import lj.h0;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import tp.c0;
import tp.x;
import u9.a;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.x0;

/* JADX INFO: loaded from: classes4.dex */
public final class GenerateWebAuthnKeyPresenter extends MvpPresenter<i1> {
    public static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35576f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final h0 f35579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final r f35580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SshKeyApiAdapter f35581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final SshKeyDBAdapter f35582z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SshKeyDBModel f35584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GenerateWebAuthnKeyPresenter f35585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SshKeyDBModel sshKeyDBModel, GenerateWebAuthnKeyPresenter generateWebAuthnKeyPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35584b = sshKeyDBModel;
            this.f35585c = generateWebAuthnKeyPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f35584b, this.f35585c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35583a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!t.b(this.f35584b.getLabel(), "FIDO")) {
                return m0.f82633a;
            }
            su.p pVarA = tp.x.f81062a.a("FIDO");
            List<SshKeyDBModel> sshKeysWithSpecificTitleRegex = this.f35585c.f35582z.getSshKeysWithSpecificTitleRegex(pVarA.d());
            t.e(sshKeysWithSpecificTitleRegex, "getSshKeysWithSpecificTitleRegex(...)");
            ArrayList arrayList = new ArrayList(v.z(sshKeysWithSpecificTitleRegex, 10));
            Iterator<T> it = sshKeysWithSpecificTitleRegex.iterator();
            while (it.hasNext()) {
                arrayList.add(((SshKeyDBModel) it.next()).getLabel());
            }
            this.f35584b.setLabel(x.a.c(tp.x.f81062a, "FIDO", arrayList, pVarA, 0, 8, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35586a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35588a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35588a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35590a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35590a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().B4(new a0.a(R.string.error_message_google_play_services_not_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35592a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35592a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().B4(new a0.a(R.string.something_went_wrong_try_again_later, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35594a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35594a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().B4(new a0.a(R.string.network_is_unreachable, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35597b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35599d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f35599d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            h hVar = GenerateWebAuthnKeyPresenter.this.new h(this.f35599d, eVar);
            hVar.f35597b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SshKeyDBModel sshKeyDBModelL2;
            SshKeyDBModel sshKeyDBModel;
            Object objF = au.b.f();
            int i10 = this.f35596a;
            if (i10 == 0) {
                ut.x.b(obj);
                GenerateWebAuthnKeyPresenter.this.f35578v.r2(GenerateWebAuthnKeyPresenter.this.f35571a);
                try {
                    mv.b bVarS1 = b2.f52944a.s1();
                    String str = this.f35599d;
                    bVarS1.a();
                    Fido2AuthenticatorAttestationResponse fido2AuthenticatorAttestationResponse = (Fido2AuthenticatorAttestationResponse) bVarS1.b(Fido2AuthenticatorAttestationResponse.Companion.serializer(), str);
                    sshKeyDBModelL2 = GenerateWebAuthnKeyPresenter.this.L2(fido2AuthenticatorAttestationResponse.getResponse().getPublicKey(), g1.f27417b.b(), c0.d(fido2AuthenticatorAttestationResponse.getRawId()), c0.d(fido2AuthenticatorAttestationResponse.getResponse().getAttestationObject()));
                    if (sshKeyDBModelL2 == null) {
                        GenerateWebAuthnKeyPresenter.this.R2();
                        return m0.f82633a;
                    }
                    GenerateWebAuthnKeyPresenter.this.f35578v.q2(GenerateWebAuthnKeyPresenter.this.f35571a);
                    GenerateWebAuthnKeyPresenter generateWebAuthnKeyPresenter = GenerateWebAuthnKeyPresenter.this;
                    this.f35597b = sshKeyDBModelL2;
                    this.f35596a = 1;
                    if (generateWebAuthnKeyPresenter.N2(sshKeyDBModelL2, this) != objF) {
                    }
                    return objF;
                } catch (IllegalArgumentException unused) {
                    GenerateWebAuthnKeyPresenter.this.T2();
                    return m0.f82633a;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SshKeyDBModel sshKeyDBModel2 = (SshKeyDBModel) this.f35597b;
                ut.x.b(obj);
                sshKeyDBModel = sshKeyDBModel2;
                GenerateWebAuthnKeyPresenter.this.getViewState().Xc(new EditKeyData(sshKeyDBModel, "edit_key_action", null, (int) sshKeyDBModel.getIdInDatabase(), 4, null), GenerateWebAuthnKeyPresenter.this.f35571a);
                GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
                GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
                GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
                GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
                GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
                return m0.f82633a;
            }
            SshKeyDBModel sshKeyDBModel3 = (SshKeyDBModel) this.f35597b;
            ut.x.b(obj);
            sshKeyDBModelL2 = sshKeyDBModel3;
            GenerateWebAuthnKeyPresenter generateWebAuthnKeyPresenter2 = GenerateWebAuthnKeyPresenter.this;
            this.f35597b = sshKeyDBModelL2;
            this.f35596a = 2;
            if (generateWebAuthnKeyPresenter2.e3(sshKeyDBModelL2, this) != objF) {
                sshKeyDBModel = sshKeyDBModelL2;
                GenerateWebAuthnKeyPresenter.this.getViewState().Xc(new EditKeyData(sshKeyDBModel, "edit_key_action", null, (int) sshKeyDBModel.getIdInDatabase(), 4, null), GenerateWebAuthnKeyPresenter.this.f35571a);
                GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
                GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
                GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
                GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
                GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
                return m0.f82633a;
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35600a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35600a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().B4(new a0.a(R.string.error_message_timeout_try_again_later, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35602a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35602a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.C0663b.f46550a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            GenerateWebAuthnKeyPresenter.this.getViewState().r(true);
            GenerateWebAuthnKeyPresenter.this.getViewState().B4(new a0.a(R.string.something_went_wrong_try_again, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35604a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35604a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35578v.p2(GenerateWebAuthnKeyPresenter.this.f35571a);
            if (!GenerateWebAuthnKeyPresenter.this.f35580x.b()) {
                GenerateWebAuthnKeyPresenter.this.S2();
                return m0.f82633a;
            }
            GenerateWebAuthnKeyPresenter.this.getViewState().bf(ProgressButton.b.c.f46551a);
            GenerateWebAuthnKeyPresenter.this.getViewState().Oc(false);
            GenerateWebAuthnKeyPresenter.this.getViewState().P9(false);
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(false);
            GenerateWebAuthnKeyPresenter.this.getViewState().r(false);
            GenerateWebAuthnKeyPresenter.this.getViewState().Cc(GenerateWebAuthnKeyPresenter.this.f35572b, GenerateWebAuthnKeyPresenter.this.M2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f35608c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new l(this.f35608c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35606a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35573c = this.f35608c;
            GenerateWebAuthnKeyPresenter.this.getViewState().yc(GenerateWebAuthnKeyPresenter.this.O2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.a f35611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(c0.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f35611c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new m(this.f35611c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35609a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35577u = t.b(this.f35611c, c0.a.C0435a.f27337a);
            GenerateWebAuthnKeyPresenter.this.getViewState().yc(GenerateWebAuthnKeyPresenter.this.O2());
            GenerateWebAuthnKeyPresenter.this.getViewState().Wb(!GenerateWebAuthnKeyPresenter.this.f35577u);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35612a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, zt.e eVar) {
            super(2, eVar);
            this.f35614c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new n(this.f35614c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35612a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35574d = this.f35614c;
            GenerateWebAuthnKeyPresenter.this.getViewState().Yc(GenerateWebAuthnKeyPresenter.this.P2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35615a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35615a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35576f = !r2.f35576f;
            if (GenerateWebAuthnKeyPresenter.this.f35576f) {
                GenerateWebAuthnKeyPresenter.this.getViewState().m1();
            } else {
                GenerateWebAuthnKeyPresenter.this.getViewState().Z7();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35617a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35617a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GenerateWebAuthnKeyPresenter.this.f35575e = !r2.f35575e;
            GenerateWebAuthnKeyPresenter.this.getViewState().B3(GenerateWebAuthnKeyPresenter.this.f35575e);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35619a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshKeyDBModel f35621c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(SshKeyDBModel sshKeyDBModel, zt.e eVar) {
            super(2, eVar);
            this.f35621c = sshKeyDBModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateWebAuthnKeyPresenter.this.new q(this.f35621c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35619a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Long lPostItem = GenerateWebAuthnKeyPresenter.this.f35581y.postItem(this.f35621c);
            SshKeyDBModel sshKeyDBModel = this.f35621c;
            t.c(lPostItem);
            sshKeyDBModel.setIdInDatabase(lPostItem.longValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public GenerateWebAuthnKeyPresenter(String str) {
        t.f(str, "funnelId");
        this.f35571a = str;
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f35572b = string;
        this.f35573c = "FIDO";
        this.f35574d = "";
        this.f35578v = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f35579w = new h0();
        this.f35580x = b2.f52944a.n1();
        this.f35581y = hg.f.p().V();
        this.f35582z = hg.f.p().W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshKeyDBModel L2(String str, String str2, byte[] bArr, byte[] bArr2) {
        String strA;
        SshKey sshKeyA = this.f35579w.a(this.f35574d, new SKKeyInfo(str, str2, bArr, true, false, false), bArr2);
        if (sshKeyA == null) {
            return null;
        }
        switch (sshKeyA.getType()) {
            case 0:
                strA = a.f.f81657b.a();
                break;
            case 1:
                strA = a.C1294a.f81652b.a();
                break;
            case 2:
                strA = a.b.f81653b.a();
                break;
            case 3:
                strA = a.c.f81654b.a();
                break;
            case 4:
                strA = a.g.f81658b.a();
                break;
            case 5:
                strA = a.h.f81659b.a();
                break;
            case 6:
                strA = a.d.f81655b.a();
                break;
            default:
                strA = a.e.f81656b.a();
                break;
        }
        return new SshKeyDBModel(M2(), this.f35575e ? this.f35574d : null, sshKeyA.getPrivateKey(), sshKeyA.getPublicKey(), strA, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M2() {
        String str = this.f35573c;
        return s.m0(str) ? "FIDO" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N2(SshKeyDBModel sshKeyDBModel, zt.e eVar) {
        Object objG = wu.i.g(x0.b(), new b(sshKeyDBModel, this, null), eVar);
        return objG == au.b.f() ? objG : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O2() {
        return !s.m0(M2()) && this.f35577u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P2() {
        return !s.m0(this.f35574d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e3(SshKeyDBModel sshKeyDBModel, zt.e eVar) {
        Object objG = wu.i.g(x0.b(), new q(sshKeyDBModel, null), eVar);
        return objG == au.b.f() ? objG : m0.f82633a;
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: K2, reason: merged with bridge method [inline-methods] */
    public void attachView(i1 i1Var) {
        super.attachView(i1Var);
        getViewState().E2(this.f35573c);
        getViewState().R0("FIDO");
        getViewState().B3(this.f35575e);
        getViewState().Yc(P2());
        if (this.f35576f) {
            getViewState().m1();
        } else {
            getViewState().Z7();
        }
    }

    public final void Q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void R2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void S2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void T2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void U2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void V2(String str) {
        t.f(str, "authenticatorAttestationResponseJson");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    public final void W2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void X2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    public final void Y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void Z2(String str) {
        t.f(str, "newKeyName");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    public final void a3(c0.a aVar) {
        t.f(aVar, "newStatus");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(aVar, null), 3, null);
    }

    public final void b3(String str) {
        t.f(str, "newPassphrase");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(str, null), 3, null);
    }

    public final void c3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    public final void d3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().c();
    }
}
