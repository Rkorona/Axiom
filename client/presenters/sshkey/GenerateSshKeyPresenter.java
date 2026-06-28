package com.server.auditor.ssh.client.presenters.sshkey;

import android.text.TextUtils;
import cj.d;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import dq.b0;
import io.split.android.client.dtos.SerializableEvent;
import iu.p;
import java.util.UUID;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import tp.c0;
import u9.a;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class GenerateSshKeyPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.sshkey.h> implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VaultKeyId f38040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj.d f38041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u9.a f38044f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f38045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f38046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f38047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f38048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f38049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f38038z = new a(null);
    public static final int A = 8;
    private static final a.c B = a.c.f81654b;
    private static final Integer[] C = {Integer.valueOf(File.FLAG_O_APPEND), 2048, 4096};
    private static final Integer[] D = {256, Integer.valueOf(LibTermiusKeygen.KEY_SIZE_384), Integer.valueOf(LibTermiusKeygen.KEY_SIZE_521)};
    private static final Integer[] E = {44, 65, 87};

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38050a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38050a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38052a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f38054c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new c(this.f38054c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38052a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38047w = this.f38054c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GenerateSshKeyPresenter f38057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, GenerateSshKeyPresenter generateSshKeyPresenter, zt.e eVar) {
            super(2, eVar);
            this.f38056b = str;
            this.f38057c = generateSshKeyPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38056b, this.f38057c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Integer numV;
            au.b.f();
            if (this.f38055a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TextUtils.isDigitsOnly(this.f38056b) && this.f38056b.length() > 0 && (numV = s.v(this.f38056b)) != null) {
                this.f38057c.f38046v = numV.intValue();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38058a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.getViewState().c();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38060a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38060a;
            if (i10 == 0) {
                x.b(obj);
                GenerateSshKeyPresenter generateSshKeyPresenter = GenerateSshKeyPresenter.this;
                this.f38060a = 1;
                if (generateSshKeyPresenter.O2(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SshKeyDBModel f38063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GenerateSshKeyPresenter f38064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SshKeyDBModel sshKeyDBModel, GenerateSshKeyPresenter generateSshKeyPresenter, zt.e eVar) {
            super(2, eVar);
            this.f38063b = sshKeyDBModel;
            this.f38064c = generateSshKeyPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f38063b, this.f38064c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38062a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditKeyData editKeyData = new EditKeyData(this.f38063b, "edit_key_action", c0.e(), (int) this.f38063b.getIdInDatabase());
            this.f38064c.getViewState().g0();
            this.f38064c.getViewState().O7(editKeyData, this.f38064c.f38049y);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38065a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38065a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.getViewState().g0();
            GenerateSshKeyPresenter.this.getViewState().y2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38067a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38069c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, zt.e eVar) {
            super(2, eVar);
            this.f38069c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new i(this.f38069c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38067a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38045u = this.f38069c;
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38070a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u9.a f38072c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(u9.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f38072c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new j(this.f38072c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38070a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38044f = this.f38072c;
            GenerateSshKeyPresenter.this.P2(this.f38072c);
            GenerateSshKeyPresenter generateSshKeyPresenter = GenerateSshKeyPresenter.this;
            generateSshKeyPresenter.Q2(generateSshKeyPresenter.f38042d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f38075c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new k(this.f38075c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38073a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38043e = !TextUtils.isEmpty(this.f38075c) ? this.f38075c : "SSH Key";
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38076a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f38078c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new l(this.f38078c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38042d = this.f38078c;
            GenerateSshKeyPresenter.this.Q2(this.f38078c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38079a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38081c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f38081c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new m(this.f38081c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38079a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GenerateSshKeyPresenter.this.f38048x = this.f38081c;
            GenerateSshKeyPresenter.this.getViewState().Me(GenerateSshKeyPresenter.this.f38048x);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38082a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GenerateSshKeyPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38082a;
            if (i10 == 0) {
                x.b(obj);
                GenerateSshKeyPresenter generateSshKeyPresenter = GenerateSshKeyPresenter.this;
                this.f38082a = 1;
                if (generateSshKeyPresenter.O2(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public GenerateSshKeyPresenter(boolean z10, VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "originalHostVaultKeyId");
        this.f38039a = z10;
        this.f38040b = vaultKeyId;
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        SshCertificateDBAdapter sshCertificateDBAdapterQ = hg.f.p().Q();
        t.e(sshCertificateDBAdapterQ, "getSshCertificateDBAdapter(...)");
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.f38041c = new cj.d(identityDBAdapterN, sshCertificateDBAdapterQ, sshKeyDBAdapterW, aVarY, this);
        this.f38042d = "";
        this.f38043e = "SSH Key";
        this.f38044f = B;
        this.f38045u = 256;
        this.f38046v = 100;
        String string = UUID.randomUUID().toString();
        t.e(string, "toString(...)");
        this.f38049y = string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O2(zt.e eVar) {
        VaultKeyId vaultKeyIdH = b0.f47897a.h();
        if (this.f38039a) {
            vaultKeyIdH = this.f38040b;
        }
        getViewState().A();
        Object objB = this.f38041c.b(this.f38043e, this.f38044f, this.f38045u, this.f38042d, this.f38047w, this.f38046v, vaultKeyIdH, eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(u9.a aVar) {
        getViewState().Pb(aVar, t.b(aVar, a.f.f81657b) ? C : t.b(aVar, a.b.f81653b) ? D : t.b(aVar, a.d.f81655b) ? E : new Integer[]{256});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        getViewState().Ue(!zIsEmpty);
        getViewState().J8(!zIsEmpty && t.b(this.f38044f, B));
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: D2, reason: merged with bridge method [inline-methods] */
    public void attachView(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
        super.attachView(hVar);
        getViewState().Me(this.f38048x);
    }

    public final void E2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void F2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(z10, null), 3, null);
    }

    public final void G2(String str) {
        t.f(str, "changed");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, this, null), 3, null);
    }

    public final void H2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void I2(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(i10, null), 3, null);
    }

    public final void J2(u9.a aVar) {
        t.f(aVar, "sshKeyType");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(aVar, null), 3, null);
    }

    public final void K2(String str) {
        t.f(str, "newLabel");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, null), 3, null);
    }

    public final void L2(String str) {
        t.f(str, SshOptions.EXTRA_PASSPHRASE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    public final void M2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(z10, null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    @Override // cj.d.a
    public void U() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // cj.d.a
    public void c0(SshKeyDBModel sshKeyDBModel) {
        t.f(sshKeyDBModel, SerializableEvent.KEY_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(sshKeyDBModel, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }
}
