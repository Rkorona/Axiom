package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout;
import k9.d;
import moxy.PresenterScopeKt;
import tp.e1;
import tp.w;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class TelnetConfigEditorPresenter extends BaseConfigEditorPresenter<com.server.auditor.ssh.client.contracts.q> {
    private final SshKeyDBAdapter A;
    private final w B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TelnetProperties f36176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private GroupDBModel f36177v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final hg.f f36180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final IdentityDBAdapter f36181z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TelnetProperties f36175f = new TelnetProperties();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f36178w = "no_credentials_sharing";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f36179x = com.server.auditor.ssh.client.app.a.N();

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36182a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36182a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).k2(false);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).d2(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36184a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36184a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).x0(TelnetConfigEditorPresenter.this.R2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36186a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36187a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36187a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).f2(new qq.a(TelnetConfigEditorPresenter.this.v2(), false, "Move", false, true, false, TelnetConfigEditorPresenter.this.v2(), "no_credentials_sharing"), false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36189a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36189a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = TelnetConfigEditorPresenter.this.B;
            Identity identity = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
            TelnetConfigEditorPresenter.this.f36175f.setIdentity(wVar.d(identity, telnetProperties != null ? telnetProperties.getIdentity() : null) ? new Identity() : null);
            TelnetConfigEditorPresenter telnetConfigEditorPresenter = TelnetConfigEditorPresenter.this;
            Identity identity2 = telnetConfigEditorPresenter.f36175f.getIdentity();
            TelnetProperties telnetProperties2 = TelnetConfigEditorPresenter.this.f36176u;
            telnetConfigEditorPresenter.U2(identity2, telnetProperties2 != null ? telnetProperties2.getIdentityData() : null, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36191a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36191a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36192a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!TelnetConfigEditorPresenter.this.B.c(TelnetConfigEditorPresenter.this.f36175f.getIdentity())) {
                TelnetConfigEditorPresenter.this.Z2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36194a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f36196c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new h(this.f36196c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36194a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Identity identity = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            String password = identity != null ? identity.getPassword() : null;
            if (password == null) {
                password = "";
            }
            if (ju.t.b(password, this.f36196c)) {
                return m0.f82633a;
            }
            Identity identity2 = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            if (identity2 == null) {
                identity2 = new Identity();
            }
            identity2.setPassword(this.f36196c);
            TelnetConfigEditorPresenter.this.f36175f.setIdentity(identity2);
            w wVar = TelnetConfigEditorPresenter.this.B;
            Identity identity3 = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
            String strA = wVar.a(identity3, telnetProperties != null ? telnetProperties.getIdentity() : null);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).J0((this.f36196c.length() != 0 || strA == null || strA.length() == 0) ? false : true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36197a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f36199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10, zt.e eVar) {
            super(2, eVar);
            this.f36199c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new i(this.f36199c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Identity identity;
            SshKeyDBModel itemByLocalId;
            au.b.f();
            if (this.f36197a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            IdentityDBModel itemByLocalId2 = TelnetConfigEditorPresenter.this.f36181z.getItemByLocalId(this.f36199c);
            if (itemByLocalId2 != null) {
                if (itemByLocalId2.getSshKeyId() != null) {
                    SshKeyDBAdapter sshKeyDBAdapter = TelnetConfigEditorPresenter.this.A;
                    Long sshKeyId = itemByLocalId2.getSshKeyId();
                    ju.t.e(sshKeyId, "getSshKeyId(...)");
                    itemByLocalId = sshKeyDBAdapter.getItemByLocalId(sshKeyId.longValue());
                } else {
                    itemByLocalId = null;
                }
                identity = new Identity(itemByLocalId2.getTitle(), itemByLocalId2.getUsername(), itemByLocalId2.getPassword(), itemByLocalId, itemByLocalId2.getIdInDatabase(), true, itemByLocalId2.getVaultKeyId(), itemByLocalId2.getSshIdMode());
            } else {
                identity = null;
            }
            TelnetConfigEditorPresenter.this.f36175f.setIdentity(identity);
            TelnetConfigEditorPresenter telnetConfigEditorPresenter = TelnetConfigEditorPresenter.this;
            Identity identity2 = telnetConfigEditorPresenter.f36175f.getIdentity();
            TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
            telnetConfigEditorPresenter.U2(identity2, telnetProperties != null ? telnetProperties.getIdentityData() : null, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36200a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f36202c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new j(this.f36202c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Identity identity = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            String username = identity != null ? identity.getUsername() : null;
            if (username == null) {
                username = "";
            }
            if (!ju.t.b(username, this.f36202c)) {
                Identity identity2 = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
                if (identity2 == null || !identity2.isVisible()) {
                    Identity identity3 = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
                    if (identity3 == null) {
                        identity3 = new Identity();
                    }
                    identity3.setUsername(su.s.n1(this.f36202c).toString());
                    TelnetConfigEditorPresenter.this.f36175f.setIdentity(identity3);
                    w wVar = TelnetConfigEditorPresenter.this.B;
                    Identity identity4 = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
                    TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
                    String strB = wVar.b(identity4, telnetProperties != null ? telnetProperties.getIdentity() : null);
                    ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).y1((!su.s.m0(this.f36202c) || strB == null || su.s.m0(strB)) ? false : true);
                    return m0.f82633a;
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36203a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36203a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36204a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36204a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).a6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36206a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).w4();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, zt.e eVar) {
            super(2, eVar);
            this.f36210c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new n(this.f36210c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36208a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TelnetConfigEditorPresenter.this.f36175f.setCharset(this.f36210c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36211a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, zt.e eVar) {
            super(2, eVar);
            this.f36213c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new o(this.f36213c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36211a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TelnetConfigEditorPresenter.this.f36175f.setColorScheme(this.f36213c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36214a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            VaultKeyId vaultKeyId;
            au.b.f();
            if (this.f36214a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Identity identity = TelnetConfigEditorPresenter.this.f36175f.getIdentity();
            if (identity == null) {
                return m0.f82633a;
            }
            SshKeyDBModel sshKey = identity.getSshKey();
            boolean z10 = false;
            if (sshKey != null && (vaultKeyId = sshKey.getVaultKeyId()) != null && !com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId)) {
                z10 = true;
            }
            VaultKeyId vaultKeyId2 = identity.getVaultKeyId();
            ju.t.e(vaultKeyId2, "<get-vaultKeyId>(...)");
            boolean zB = com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId2);
            if (com.server.auditor.ssh.client.ui.vaults.data.a.b(TelnetConfigEditorPresenter.this.v2())) {
                if (!zB || z10) {
                    TelnetConfigEditorPresenter.this.p3();
                }
            } else if (ju.t.b(TelnetConfigEditorPresenter.this.f36178w, "credentials_sharing")) {
                TelnetConfigEditorPresenter.this.p3();
            } else if (identity.getId() == -1) {
                if (!zB) {
                    TelnetConfigEditorPresenter.this.p3();
                }
            } else if (z10) {
                TelnetConfigEditorPresenter.this.p3();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36216a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new q(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                au.b.f()
                int r0 = r3.f36216a
                if (r0 != 0) goto L4f
                ut.x.b(r4)
                com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter r4 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.this
                com.server.auditor.ssh.client.models.properties.TelnetProperties r4 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.K2(r4)
                com.server.auditor.ssh.client.models.Identity r4 = r4.getIdentity()
                r0 = 0
                if (r4 == 0) goto L21
                boolean r1 = r4.isVisible()
                if (r1 != 0) goto L1e
                goto L1f
            L1e:
                r4 = r0
            L1f:
                if (r4 != 0) goto L26
            L21:
                com.server.auditor.ssh.client.models.Identity r4 = new com.server.auditor.ssh.client.models.Identity
                r4.<init>()
            L26:
                r4.setSshKey(r0)
                com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter r1 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.this
                com.server.auditor.ssh.client.models.properties.TelnetProperties r1 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.K2(r1)
                r1.setIdentity(r4)
                com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter r4 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.this
                com.server.auditor.ssh.client.models.properties.TelnetProperties r1 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.K2(r4)
                com.server.auditor.ssh.client.models.Identity r1 = r1.getIdentity()
                com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter r2 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.this
                com.server.auditor.ssh.client.models.properties.TelnetProperties r2 = com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.I2(r2)
                if (r2 == 0) goto L48
                com.server.auditor.ssh.client.models.properties.c r0 = r2.getIdentityData()
            L48:
                r2 = 1
                com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.L2(r4, r1, r0, r2)
                ut.m0 r4 = ut.m0.f82633a
                return r4
            L4f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36218a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36220c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, zt.e eVar) {
            super(2, eVar);
            this.f36220c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new r(this.f36220c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TelnetConfigEditorPresenter.this.f36178w = this.f36220c;
            TelnetConfigEditorPresenter telnetConfigEditorPresenter = TelnetConfigEditorPresenter.this;
            Identity identity = telnetConfigEditorPresenter.f36175f.getIdentity();
            TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
            telnetConfigEditorPresenter.U2(identity, telnetProperties != null ? telnetProperties.getIdentityData() : null, false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36221a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f36224d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z10, boolean z11, zt.e eVar) {
            super(2, eVar);
            this.f36223c = z10;
            this.f36224d = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new s(this.f36223c, this.f36224d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36221a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).V0(this.f36223c);
            ((com.server.auditor.ssh.client.contracts.q) TelnetConfigEditorPresenter.this.getViewState()).G2(this.f36224d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36225a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TelnetProperties f36227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TelnetProperties f36228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GroupDBModel f36229e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(TelnetProperties telnetProperties, TelnetProperties telnetProperties2, GroupDBModel groupDBModel, zt.e eVar) {
            super(2, eVar);
            this.f36227c = telnetProperties;
            this.f36228d = telnetProperties2;
            this.f36229e = groupDBModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TelnetConfigEditorPresenter.this.new t(this.f36227c, this.f36228d, this.f36229e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36225a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TelnetConfigEditorPresenter.this.f36175f = this.f36227c;
            TelnetConfigEditorPresenter.this.f36176u = this.f36228d;
            TelnetConfigEditorPresenter.this.f36177v = this.f36229e;
            TelnetConfigEditorPresenter telnetConfigEditorPresenter = TelnetConfigEditorPresenter.this;
            Identity identity = telnetConfigEditorPresenter.f36175f.getIdentity();
            TelnetProperties telnetProperties = TelnetConfigEditorPresenter.this.f36176u;
            telnetConfigEditorPresenter.U2(identity, telnetProperties != null ? telnetProperties.getIdentityData() : null, false);
            TelnetConfigEditorPresenter.this.u3();
            TelnetConfigEditorPresenter.this.v3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TelnetConfigEditorPresenter() {
        hg.f fVarP = hg.f.p();
        this.f36180y = fVarP;
        this.f36181z = fVarP.n();
        this.A = fVarP.W();
        this.B = new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R2() {
        return !com.server.auditor.ssh.client.ui.vaults.data.a.b(v2()) && ju.t.b(this.f36178w, "credentials_sharing");
    }

    private final IdentityEditorLayout.IdentityEditorMode S2(boolean z10, boolean z11) {
        return (z10 || z11) ? IdentityEditorLayout.IdentityEditorMode.IDENTITY : IdentityEditorLayout.IdentityEditorMode.USERNAME;
    }

    private final String T2() {
        GroupDBModel groupDBModel = this.f36177v;
        String title = groupDBModel != null ? groupDBModel.getTitle() : null;
        return title == null ? "" : title;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(Identity identity, com.server.auditor.ssh.client.models.properties.c cVar, boolean z10) {
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).a1(this.f36178w);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).V0(!com.server.auditor.ssh.client.ui.vaults.data.a.b(v2()));
        IdentityEditorLayout.IdentityEditorMode identityEditorModeS2 = S2(this.B.c(identity), this.B.d(identity, cVar != null ? (Identity) cVar.b() : null));
        String strT2 = T2();
        V2(identity, cVar, strT2, identityEditorModeS2, z10);
        X2(identity, cVar != null ? (Identity) cVar.b() : null, strT2);
        W2(identity, cVar != null ? (Identity) cVar.b() : null, strT2, identityEditorModeS2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V2(com.server.auditor.ssh.client.models.Identity r5, com.server.auditor.ssh.client.models.properties.c r6, java.lang.String r7, com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout.IdentityEditorMode r8, boolean r9) {
        /*
            r4 = this;
            tp.w r0 = r4.B
            boolean r0 = r0.c(r5)
            tp.w r1 = r4.B
            r2 = 0
            if (r6 == 0) goto L12
            java.lang.Object r3 = r6.b()
            com.server.auditor.ssh.client.models.Identity r3 = (com.server.auditor.ssh.client.models.Identity) r3
            goto L13
        L12:
            r3 = r2
        L13:
            boolean r1 = r1.d(r5, r3)
            moxy.MvpView r3 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r3 = (com.server.auditor.ssh.client.contracts.q) r3
            r3.l1(r8)
            if (r0 != 0) goto L28
            if (r1 == 0) goto L25
            goto L28
        L25:
            com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$b$a r8 = com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout.b.a.f46708a
            goto L2a
        L28:
            com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$b$b r8 = com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout.b.C0664b.f46709a
        L2a:
            moxy.MvpView r3 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r3 = (com.server.auditor.ssh.client.contracts.q) r3
            r3.q2(r8, r9)
            moxy.MvpView r8 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r8 = (com.server.auditor.ssh.client.contracts.q) r8
            if (r5 == 0) goto L53
            if (r0 == 0) goto L3f
            r9 = r5
            goto L40
        L3f:
            r9 = r2
        L40:
            if (r9 == 0) goto L53
            java.lang.String r9 = r9.getTitle()
            if (r9 == 0) goto L53
            boolean r0 = su.s.m0(r9)
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r9 = r2
        L50:
            if (r9 == 0) goto L53
            goto L5b
        L53:
            if (r5 == 0) goto L5a
            java.lang.String r9 = r5.getUsername()
            goto L5b
        L5a:
            r9 = r2
        L5b:
            r8.i2(r9)
            moxy.MvpView r5 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r5 = (com.server.auditor.ssh.client.contracts.q) r5
            if (r6 == 0) goto L87
            if (r1 == 0) goto L6a
            r8 = r6
            goto L6b
        L6a:
            r8 = r2
        L6b:
            if (r8 == 0) goto L87
            java.lang.Object r8 = r8.b()
            com.server.auditor.ssh.client.models.Identity r8 = (com.server.auditor.ssh.client.models.Identity) r8
            if (r8 == 0) goto L87
            java.lang.String r8 = r8.getTitle()
            if (r8 == 0) goto L87
            boolean r9 = su.s.m0(r8)
            if (r9 != 0) goto L82
            goto L83
        L82:
            r8 = r2
        L83:
            if (r8 == 0) goto L87
            r2 = r8
            goto L95
        L87:
            if (r6 == 0) goto L95
            java.lang.Object r8 = r6.b()
            com.server.auditor.ssh.client.models.Identity r8 = (com.server.auditor.ssh.client.models.Identity) r8
            if (r8 == 0) goto L95
            java.lang.String r2 = r8.getUsername()
        L95:
            r5.N0(r2)
            moxy.MvpView r5 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r5 = (com.server.auditor.ssh.client.contracts.q) r5
            if (r6 == 0) goto La8
            java.lang.String r6 = r6.a()
            if (r6 != 0) goto La7
            goto La8
        La7:
            r7 = r6
        La8:
            r5.Z0(r7)
            moxy.MvpView r5 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.q r5 = (com.server.auditor.ssh.client.contracts.q) r5
            r5.X0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.TelnetConfigEditorPresenter.V2(com.server.auditor.ssh.client.models.Identity, com.server.auditor.ssh.client.models.properties.c, java.lang.String, com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$IdentityEditorMode, boolean):void");
    }

    private final void W2(Identity identity, Identity identity2, String str, IdentityEditorLayout.IdentityEditorMode identityEditorMode) {
        String password;
        String strA;
        if (identity == null || (password = identity.getPassword()) == null || this.B.c(identity)) {
            password = null;
        }
        com.server.auditor.ssh.client.models.properties.c passwordData = identity2 != null ? identity2.getPasswordData() : null;
        String str2 = passwordData != null ? (String) passwordData.b() : null;
        if (this.B.e(identity2)) {
            str2 = null;
        }
        boolean z10 = (str2 == null || str2.length() == 0 || (password != null && password.length() != 0)) ? false : true;
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).E0(password);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).W0(str2 != null ? u2(str2) : null);
        com.server.auditor.ssh.client.contracts.q qVar = (com.server.auditor.ssh.client.contracts.q) getViewState();
        if (passwordData != null && (strA = passwordData.a()) != null) {
            str = strA;
        }
        qVar.G0(str);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).J0(z10);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).t1(identityEditorMode == IdentityEditorLayout.IdentityEditorMode.USERNAME);
    }

    private final void X2(Identity identity, Identity identity2, String str) {
        String username;
        String strA;
        if (identity == null || (username = identity.getUsername()) == null || this.B.c(identity)) {
            username = null;
        }
        com.server.auditor.ssh.client.models.properties.c usernameData = identity2 != null ? identity2.getUsernameData() : null;
        String str2 = this.B.e(identity2) ? null : usernameData != null ? (String) usernameData.b() : null;
        boolean z10 = (str2 == null || su.s.m0(str2) || (username != null && !su.s.m0(username))) ? false : true;
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).F2(username);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).D2(str2);
        com.server.auditor.ssh.client.contracts.q qVar = (com.server.auditor.ssh.client.contracts.q) getViewState();
        if (usernameData != null && (strA = usernameData.a()) != null) {
            str = strA;
        }
        qVar.u2(str);
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).y1(z10);
    }

    private final String q3() {
        String charset = this.f36175f.getCharset();
        if (charset != null) {
            return charset;
        }
        TelnetProperties telnetProperties = this.f36176u;
        String charset2 = telnetProperties != null ? telnetProperties.getCharset() : null;
        return charset2 == null ? SQLiteHelper.DEFAULT_CHARSET : charset2;
    }

    private final String r3() {
        String colorScheme = this.f36175f.getColorScheme();
        if (colorScheme != null) {
            return colorScheme;
        }
        TelnetProperties telnetProperties = this.f36176u;
        String colorScheme2 = telnetProperties != null ? telnetProperties.getColorScheme() : null;
        if (colorScheme2 != null) {
            return colorScheme2;
        }
        hg.d dVarM = this.f36179x.M();
        d.a aVar = k9.d.f63270c;
        String string = dVarM.getString("color_scheme_settings", aVar.a().getName());
        return string == null ? aVar.a().getName() : string;
    }

    private final String s3() {
        com.server.auditor.ssh.client.models.properties.c charsetData;
        TelnetProperties telnetProperties = this.f36176u;
        String strA = (telnetProperties == null || (charsetData = telnetProperties.getCharsetData()) == null) ? null : charsetData.a();
        if (this.f36175f.getCharset() == null) {
            return strA;
        }
        return null;
    }

    private final String t3() {
        com.server.auditor.ssh.client.models.properties.c colorSchemeData;
        TelnetProperties telnetProperties = this.f36176u;
        String strA = (telnetProperties == null || (colorSchemeData = telnetProperties.getColorSchemeData()) == null) ? null : colorSchemeData.a();
        if (this.f36175f.getColorScheme() == null) {
            TelnetProperties telnetProperties2 = this.f36176u;
            if ((telnetProperties2 != null ? telnetProperties2.getColorScheme() : null) != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public void attachView(com.server.auditor.ssh.client.contracts.q qVar) {
        super.t2(qVar);
    }

    public final void Y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void Z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void a3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void b3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void c3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void d3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void e3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void f3(String str) {
        ju.t.f(str, "newPassword");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    public final void g3(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(j10, null), 3, null);
    }

    public final void h3(String str) {
        ju.t.f(str, "newUsername");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
    }

    public final void i3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void j3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    public final void l3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    public final void m3(String str) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(str, null), 3, null);
    }

    public final void n3(String str) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(str, null), 3, null);
    }

    public final void o3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.presenters.BaseConfigEditorPresenter, moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public final void p3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    public final void u3() {
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).oe(q3(), s3());
    }

    public final void v3() {
        ((com.server.auditor.ssh.client.contracts.q) getViewState()).Ld(r3(), t3());
    }

    public final void w3(String str) {
        ju.t.f(str, "newCredentialsMode");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(str, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.presenters.BaseConfigEditorPresenter
    protected boolean x2() {
        Identity identity = this.f36175f.getIdentity();
        if (identity == null) {
            return true;
        }
        if (identity.isVisible()) {
            identity = null;
        }
        if (identity != null) {
            return e1.c(identity.getUsername());
        }
        return true;
    }

    public final void x3(boolean z10, boolean z11) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(z10, z11, null), 3, null);
    }

    public final void y3(TelnetProperties telnetProperties, TelnetProperties telnetProperties2, GroupDBModel groupDBModel) {
        ju.t.f(telnetProperties, "updatedTelnetProperties");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(telnetProperties, telnetProperties2, groupDBModel, null), 3, null);
    }
}
