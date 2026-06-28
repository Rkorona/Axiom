package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.o0;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.interactors.e1;
import com.server.auditor.ssh.client.interactors.f1;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.a0;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.models.proxy.ProxyType;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import iu.p;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vk.q0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class EditProxyScreenPresenter extends MvpPresenter<o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProxyDataMediator f35473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VaultKeyId f35474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f35475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e1 f35477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f1 f35478f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final hg.f f35480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final IdentityDBAdapter f35481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SshKeyDBAdapter f35482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f35471y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f35472z = 8;
    private static final ProxyType A = ProxyType.http;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ProxyType f35483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f35485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Identity f35486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35487e;

        public b(ProxyType proxyType, String str, Integer num, Identity identity, String str2) {
            t.f(proxyType, "proxyType");
            t.f(str, Column.ADDRESS);
            t.f(str2, "credentialsMode");
            this.f35483a = proxyType;
            this.f35484b = str;
            this.f35485c = num;
            this.f35486d = identity;
            this.f35487e = str2;
        }

        public static /* synthetic */ b b(b bVar, ProxyType proxyType, String str, Integer num, Identity identity, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                proxyType = bVar.f35483a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f35484b;
            }
            if ((i10 & 4) != 0) {
                num = bVar.f35485c;
            }
            if ((i10 & 8) != 0) {
                identity = bVar.f35486d;
            }
            if ((i10 & 16) != 0) {
                str2 = bVar.f35487e;
            }
            String str3 = str2;
            Integer num2 = num;
            return bVar.a(proxyType, str, num2, identity, str3);
        }

        public final b a(ProxyType proxyType, String str, Integer num, Identity identity, String str2) {
            t.f(proxyType, "proxyType");
            t.f(str, Column.ADDRESS);
            t.f(str2, "credentialsMode");
            return new b(proxyType, str, num, identity, str2);
        }

        public final String c() {
            return this.f35484b;
        }

        public final String d() {
            return this.f35487e;
        }

        public final Identity e() {
            return this.f35486d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f35483a == bVar.f35483a && t.b(this.f35484b, bVar.f35484b) && t.b(this.f35485c, bVar.f35485c) && t.b(this.f35486d, bVar.f35486d) && t.b(this.f35487e, bVar.f35487e);
        }

        public final Integer f() {
            return this.f35485c;
        }

        public final ProxyType g() {
            return this.f35483a;
        }

        public int hashCode() {
            int iHashCode = ((this.f35483a.hashCode() * 31) + this.f35484b.hashCode()) * 31;
            Integer num = this.f35485c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Identity identity = this.f35486d;
            return ((iHashCode2 + (identity != null ? identity.hashCode() : 0)) * 31) + this.f35487e.hashCode();
        }

        public String toString() {
            return "ProxyEditorProperties(proxyType=" + this.f35483a + ", address=" + this.f35484b + ", port=" + this.f35485c + ", identity=" + this.f35486d + ", credentialsMode=" + this.f35487e + ")";
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35488a;

        static {
            int[] iArr = new int[ProxyType.values().length];
            try {
                iArr[ProxyType.http.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProxyType.socks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProxyType.socks4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35488a = iArr;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f35491c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new d(this.f35491c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35489a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.getViewState().G5(null);
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, s.n1(this.f35491c).toString(), null, null, null, 29, null);
            EditProxyScreenPresenter.this.getViewState().X(EditProxyScreenPresenter.J2(EditProxyScreenPresenter.this, false, 1, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35492a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35492a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.getViewState().V5(EditProxyScreenPresenter.this.f35474b, !com.server.auditor.ssh.client.ui.vaults.data.a.b(EditProxyScreenPresenter.this.f35474b) && t.b(EditProxyScreenPresenter.this.f35475c.d(), "credentials_sharing"));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35494a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35494a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, null, null, null, null, 23, null);
            EditProxyScreenPresenter.this.getViewState().w9(EditProxyScreenPresenter.this.f35475c.e(), true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f35498c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new g(this.f35498c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35496a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.getViewState().r9(null);
            Identity identityE = EditProxyScreenPresenter.this.f35475c.e();
            if (identityE == null) {
                identityE = new Identity();
            }
            Identity identity = identityE;
            identity.setPassword(s.n1(this.f35498c).toString());
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, null, null, identity, null, 23, null);
            EditProxyScreenPresenter.this.getViewState().X(EditProxyScreenPresenter.J2(EditProxyScreenPresenter.this, false, 1, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditProxyScreenPresenter f35501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Object obj, EditProxyScreenPresenter editProxyScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35500b = obj;
            this.f35501c = editProxyScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f35500b, this.f35501c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Identity identity;
            au.b.f();
            if (this.f35499a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshKeyDBModel itemByLocalId = null;
            IdentityDBModel itemByLocalId2 = this.f35500b instanceof Identity ? this.f35501c.f35481w.getItemByLocalId(((Identity) this.f35500b).getId()) : null;
            if (itemByLocalId2 != null) {
                if (itemByLocalId2.getSshKeyId() != null) {
                    SshKeyDBAdapter sshKeyDBAdapter = this.f35501c.f35482x;
                    Long sshKeyId = itemByLocalId2.getSshKeyId();
                    t.e(sshKeyId, "getSshKeyId(...)");
                    itemByLocalId = sshKeyDBAdapter.getItemByLocalId(sshKeyId.longValue());
                }
                identity = new Identity(itemByLocalId2.getTitle(), itemByLocalId2.getUsername(), itemByLocalId2.getPassword(), itemByLocalId, itemByLocalId2.getIdInDatabase(), true, itemByLocalId2.getVaultKeyId(), itemByLocalId2.getSshIdMode());
            } else {
                identity = null;
            }
            EditProxyScreenPresenter editProxyScreenPresenter = this.f35501c;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, null, null, identity, null, 23, null);
            this.f35501c.getViewState().w9(this.f35501c.f35475c.e(), false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35502a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f35504c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new i(this.f35504c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35502a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.getViewState().Q5(null);
            Identity identityE = EditProxyScreenPresenter.this.f35475c.e();
            if (identityE == null) {
                identityE = new Identity();
            }
            Identity identity = identityE;
            identity.setUsername(s.n1(this.f35504c).toString());
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, null, null, identity, null, 23, null);
            EditProxyScreenPresenter.this.getViewState().X(EditProxyScreenPresenter.J2(EditProxyScreenPresenter.this, false, 1, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35505a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35505a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.f35476d = false;
            EditProxyScreenPresenter.this.W2(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35507a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35507a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.f35476d = true;
            EditProxyScreenPresenter.this.W2(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f35511c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new l(this.f35511c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35509a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter.this.getViewState().ga(null);
            Integer numV = s.v(this.f35511c);
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            editProxyScreenPresenter.f35475c = b.b(editProxyScreenPresenter.f35475c, null, null, numV, null, null, 27, null);
            EditProxyScreenPresenter.this.getViewState().X(EditProxyScreenPresenter.J2(EditProxyScreenPresenter.this, false, 1, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35512a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProxyType f35514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ProxyType proxyType, zt.e eVar) {
            super(2, eVar);
            this.f35514c = proxyType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new m(this.f35514c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            b bVar = editProxyScreenPresenter.f35475c;
            ProxyType proxyType = this.f35514c;
            if (proxyType == null) {
                proxyType = EditProxyScreenPresenter.A;
            }
            editProxyScreenPresenter.f35475c = b.b(bVar, proxyType, null, null, null, null, 30, null);
            o0 viewState = EditProxyScreenPresenter.this.getViewState();
            EditProxyScreenPresenter editProxyScreenPresenter2 = EditProxyScreenPresenter.this;
            viewState.Ge(editProxyScreenPresenter2.F2(editProxyScreenPresenter2.f35475c.g()));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditProxyScreenPresenter f35517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, EditProxyScreenPresenter editProxyScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35516b = z10;
            this.f35517c = editProxyScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new n(this.f35516b, this.f35517c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35515a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!this.f35516b) {
                this.f35517c.getViewState().I0();
            } else if (this.f35517c.f35476d || !this.f35517c.K2()) {
                this.f35517c.getViewState().m7();
            } else {
                this.f35517c.getViewState().h2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35518a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EditProxyScreenPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int iF2;
            VaultKeyId vaultKeyIdA;
            au.b.f();
            if (this.f35518a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EditProxyScreenPresenter editProxyScreenPresenter = EditProxyScreenPresenter.this;
            if (editProxyScreenPresenter.H2(editProxyScreenPresenter.f35475c.c(), true)) {
                EditProxyScreenPresenter editProxyScreenPresenter2 = EditProxyScreenPresenter.this;
                if (editProxyScreenPresenter2.L2(editProxyScreenPresenter2.f35475c.f(), true)) {
                    ProxyDataMediator proxyDataMediator = EditProxyScreenPresenter.this.f35473a;
                    Long id2 = proxyDataMediator != null ? proxyDataMediator.getId() : null;
                    String strName = EditProxyScreenPresenter.this.f35475c.g().name();
                    String strC = EditProxyScreenPresenter.this.f35475c.c();
                    Integer numF = EditProxyScreenPresenter.this.f35475c.f();
                    if (numF != null) {
                        iF2 = numF.intValue();
                    } else {
                        EditProxyScreenPresenter editProxyScreenPresenter3 = EditProxyScreenPresenter.this;
                        iF2 = editProxyScreenPresenter3.F2(editProxyScreenPresenter3.f35475c.g());
                    }
                    Integer numD = kotlin.coroutines.jvm.internal.b.d(iF2);
                    Identity identityE = EditProxyScreenPresenter.this.f35475c.e();
                    Long lE = identityE != null ? kotlin.coroutines.jvm.internal.b.e(identityE.getId()) : null;
                    Identity identityE2 = EditProxyScreenPresenter.this.f35475c.e();
                    String username = identityE2 != null ? identityE2.getUsername() : null;
                    Identity identityE3 = EditProxyScreenPresenter.this.f35475c.e();
                    String password = identityE3 != null ? identityE3.getPassword() : null;
                    Identity identityE4 = EditProxyScreenPresenter.this.f35475c.e();
                    boolean zIsVisible = identityE4 != null ? identityE4.isVisible() : true;
                    Identity identityE5 = EditProxyScreenPresenter.this.f35475c.e();
                    if (identityE5 == null || (vaultKeyIdA = identityE5.getVaultKeyId()) == null) {
                        vaultKeyIdA = VaultKeyId.Companion.a();
                    }
                    EditProxyScreenPresenter.this.getViewState().Hb(new ProxyDataMediator(id2, strName, strC, numD, lE, username, password, zIsVisible, vaultKeyIdA));
                    return m0.f82633a;
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EditProxyScreenPresenter(ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyId");
        this.f35473a = proxyDataMediator;
        this.f35474b = vaultKeyId;
        this.f35475c = G2();
        this.f35477e = new e1();
        this.f35478f = new f1();
        this.f35479u = com.server.auditor.ssh.client.app.a.N();
        hg.f fVarP = hg.f.p();
        this.f35480v = fVarP;
        this.f35481w = fVarP.n();
        this.f35482x = fVarP.W();
    }

    private final String E2(VaultKeyId vaultKeyId) {
        return com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId) ? "no_credentials_sharing" : "credentials_sharing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F2(ProxyType proxyType) {
        int i10 = c.f35488a[proxyType.ordinal()];
        if (i10 == 1) {
            return 3128;
        }
        if (i10 == 2 || i10 == 3) {
            return 1080;
        }
        throw new ut.s();
    }

    private final b G2() {
        Identity identity;
        ProxyDataMediator proxyDataMediator = this.f35473a;
        if (proxyDataMediator == null) {
            return new b(A, "", null, null, E2(this.f35474b));
        }
        Long identityId = proxyDataMediator.getIdentityId();
        Identity applicationModel = null;
        if (identityId != null) {
            if (identityId.longValue() == -1) {
                identityId = null;
            }
            if (identityId != null) {
                applicationModel = hg.f.p().n().getApplicationModel(identityId.longValue());
            }
        }
        if (applicationModel != null) {
            Identity identity2 = new Identity(applicationModel);
            identity2.setUsername(this.f35473a.getUsername());
            identity2.setPassword(this.f35473a.getPassword());
            identity = identity2;
        } else {
            identity = new Identity("", this.f35473a.getUsername(), this.f35473a.getPassword(), null, -1L, false, this.f35473a.getIdentityVaultKeyId(), null);
        }
        return new b(ProxyType.valueOf(this.f35473a.getType()), this.f35473a.getHost(), this.f35473a.getPort(), identity, E2(this.f35474b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H2(String str, boolean z10) {
        a0 a0VarA = this.f35477e.a(str);
        if (z10 && !a0VarA.b()) {
            getViewState().G5(a0VarA.a());
        }
        return a0VarA.b();
    }

    private final boolean I2(boolean z10) {
        return H2(this.f35475c.c(), z10) && L2(this.f35475c.f(), z10);
    }

    static /* synthetic */ boolean J2(EditProxyScreenPresenter editProxyScreenPresenter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return editProxyScreenPresenter.I2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K2() {
        q0 q0Var = q0.f83536a;
        ug.c cVarQ = this.f35479u.Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        return q0Var.i(cVarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L2(Integer num, boolean z10) {
        a0 a0VarA = this.f35478f.a(num);
        if (z10 && !a0VarA.b()) {
            getViewState().ga(a0VarA.a());
        }
        return a0VarA.b();
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: D2, reason: merged with bridge method [inline-methods] */
    public void attachView(o0 o0Var) {
        super.attachView(o0Var);
        this.f35476d = false;
        getViewState().ke(this.f35475c.g());
        getViewState().Q9(this.f35475c.c());
        getViewState().fb(this.f35475c.f());
        getViewState().Ge(F2(this.f35475c.g()));
        getViewState().X(J2(this, false, 1, null));
        getViewState().w9(this.f35475c.e(), false);
    }

    public final void M2(String str) {
        t.f(str, "newAddress");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void O2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void P2(String str) {
        t.f(str, "newPassword");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    public final void Q2(Object obj) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(obj, this, null), 3, null);
    }

    public final void R2(String str) {
        t.f(str, "newUsername");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    public final void S2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    public final void T2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void U2(String str) {
        t.f(str, "newPortString");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    public final void V2(ProxyType proxyType) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(proxyType, null), 3, null);
    }

    public final void W2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(z10, this, null), 3, null);
    }

    public final void X2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }
}
