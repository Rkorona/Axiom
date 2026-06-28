package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.k0;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingCreateRulePresenter;
import com.server.auditor.ssh.client.synchronization.api.adapters.PFApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import dq.h0;
import eq.b0;
import iq.b;
import java.util.List;
import java.util.UUID;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import vp.a;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingCreateRulePresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f37526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f37528f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final PFRulesDBAdapter f37529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zi.a f37530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final h0 f37531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f37532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ut.n f37533y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f37522z = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37534a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37534a;
            if (i10 == 0) {
                x.b(obj);
                PortForwardingCreateRulePresenter.this.getViewState().je(PortForwardingCreateRulePresenter.this.f37523a.getPortForwardingType());
                PortForwardingCreateRulePresenter portForwardingCreateRulePresenter = PortForwardingCreateRulePresenter.this;
                this.f37534a = 1;
                if (portForwardingCreateRulePresenter.C3(this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37536a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f37538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f37538c = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new c(this.f37538c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37536a;
            if (i10 == 0) {
                x.b(obj);
                h0 h0Var = PortForwardingCreateRulePresenter.this.f37531w;
                VaultKeyId vaultKeyId = this.f37538c;
                this.f37536a = 1;
                obj = h0Var.c(vaultKeyId, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PortForwardingCreateRulePresenter.this.getViewState().e6(((Boolean) obj).booleanValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37539a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.f37523a.setIntermediateHostId(-1L);
            PortForwardingCreateRulePresenter.this.getViewState().l7(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37541a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f37543c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new e(this.f37543c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37541a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.f37523a.setBindAddress(this.f37543c);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ eq.i f37546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f37547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f37548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f37549f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(eq.i iVar, List list, VaultKeyId vaultKeyId, String str, zt.e eVar) {
            super(2, eVar);
            this.f37546c = iVar;
            this.f37547d = list;
            this.f37548e = vaultKeyId;
            this.f37549f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new f(this.f37546c, this.f37547d, this.f37548e, this.f37549f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37544a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().pe();
            PortForwardingCreateRulePresenter.this.getViewState().I();
            b0.a aVar = b0.f48942a;
            ConflictsArgData[] conflictsArgDataArrA = aVar.a(this.f37546c);
            boolean zB = PortForwardingCreateRulePresenter.this.f37528f.b(conflictsArgDataArrA);
            SourceEntitiesArgData[] sourceEntitiesArgDataArrB = aVar.b(this.f37547d);
            if (zB) {
                PortForwardingCreateRulePresenter.this.getViewState().v1(this.f37548e, this.f37549f, conflictsArgDataArrA, sourceEntitiesArgDataArrB, PortForwardingCreateRulePresenter.this.f37525c);
            } else {
                PortForwardingCreateRulePresenter.this.getViewState().Z1(this.f37548e, this.f37549f, conflictsArgDataArrA, sourceEntitiesArgDataArrB, PortForwardingCreateRulePresenter.this.f37525c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37550a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().V9(PortForwardingCreateRulePresenter.this.f37523a.getTargetVaultKeyId());
            PortForwardingCreateRulePresenter.this.t3();
            hg.f.p().Y().startFullSync();
            PortForwardingCreateRulePresenter.this.w3("Move");
            PortForwardingCreateRulePresenter portForwardingCreateRulePresenter = PortForwardingCreateRulePresenter.this;
            portForwardingCreateRulePresenter.f37524b = portForwardingCreateRulePresenter.f37523a.hashCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37552a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f37554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f37554c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new h(this.f37554c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.x3(this.f37554c.d());
            boolean z10 = com.server.auditor.ssh.client.app.a.N().M().getBoolean("authorized_feature_show_multikey_promotion", true);
            if (ju.t.b(this.f37554c.d(), "multikey") && z10) {
                PortForwardingCreateRulePresenter.this.getViewState().p9();
            } else if (PortForwardingCreateRulePresenter.this.f37523a.isOpenToEditExistRule()) {
                PortForwardingCreateRulePresenter.this.z3(this.f37554c);
            } else {
                PortForwardingCreateRulePresenter.this.f37523a.setTargetVaultKeyId(this.f37554c.f());
                PortForwardingCreateRulePresenter.this.f37523a.setCredentialsMode(this.f37554c.d());
                PortForwardingCreateRulePresenter.this.getViewState().p0(this.f37554c.f());
                PortForwardingCreateRulePresenter.this.getViewState().pe();
                PortForwardingCreateRulePresenter.this.getViewState().Za();
                PortForwardingCreateRulePresenter.this.w3("Create");
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37555a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f37557c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new i(this.f37557c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37555a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.f37523a.setDestinationAddress(this.f37557c);
            PortForwardingCreateRulePresenter.this.getViewState().xd(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37558a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f37560c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new j(this.f37560c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37558a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingWizardData portForwardingWizardData = PortForwardingCreateRulePresenter.this.f37523a;
            Integer numV = su.s.v(this.f37560c);
            portForwardingWizardData.setDestinationPortNumber(numV != null ? numV.intValue() : -1);
            PortForwardingCreateRulePresenter.this.getViewState().c6(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37561a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37564d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, int i10, zt.e eVar) {
            super(2, eVar);
            this.f37563c = z10;
            this.f37564d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new k(this.f37563c, this.f37564d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37561a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().O(!this.f37563c);
            if (!this.f37563c) {
                PortForwardingCreateRulePresenter.this.p3(this.f37564d);
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
        int f37565a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().w1(PortForwardingCreateRulePresenter.this.f37523a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37567a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f37569c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new m(this.f37569c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37567a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.f37523a.setRuleLabel(this.f37569c);
            PortForwardingCreateRulePresenter.this.getViewState().P2(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37570a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, zt.e eVar) {
            super(2, eVar);
            this.f37572c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new n(this.f37572c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37570a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingWizardData portForwardingWizardData = PortForwardingCreateRulePresenter.this.f37523a;
            Integer numV = su.s.v(this.f37572c);
            portForwardingWizardData.setLocalPortNumber(numV != null ? numV.intValue() : -1);
            PortForwardingCreateRulePresenter.this.getViewState().b7(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37573a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37573a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!PortForwardingCreateRulePresenter.this.A3()) {
                return m0.f82633a;
            }
            PortForwardingCreateRulePresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingCreateRulePresenter f37577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, PortForwardingCreateRulePresenter portForwardingCreateRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37576b = i10;
            this.f37577c = portForwardingCreateRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p(this.f37576b, this.f37577c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37575a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int i10 = this.f37576b;
            if (i10 == 0) {
                this.f37577c.f37523a.setPortForwardingType(0);
                this.f37577c.getViewState().J5();
            } else if (i10 == 1) {
                this.f37577c.f37523a.setPortForwardingType(1);
                this.f37577c.getViewState().t9();
            } else if (i10 == 2) {
                this.f37577c.f37523a.setPortForwardingType(2);
                this.f37577c.getViewState().Le();
            }
            this.f37577c.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37578a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().B(qq.b.b(b0.f48942a.d(com.server.auditor.ssh.client.ui.vaults.data.a.e(PortForwardingCreateRulePresenter.this.f37523a.getTargetVaultKeyId()), "Move"), null, false, null, false, false, PortForwardingCreateRulePresenter.this.f37524b != PortForwardingCreateRulePresenter.this.f37523a.hashCode() && PortForwardingCreateRulePresenter.this.f37523a.isOpenToEditExistRule(), null, null, 223, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37580a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            RuleDBModel itemByLocalId;
            au.b.f();
            if (this.f37580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = UUID.randomUUID().toString();
            ju.t.e(string, "toString(...)");
            PortForwardingCreateRulePresenter.this.f37527e.J0(new wp.a(Avo.ChangeVaultAction.MOVE, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.PORT_FORWARDING_RULE, string, Avo.ChangeToVault.NOT_MINUSPERSONAL, Avo.CurrentVault.PERSONAL));
            PortForwardingCreateRulePresenter.this.f37527e.V4();
            if (!PortForwardingCreateRulePresenter.this.A3()) {
                return m0.f82633a;
            }
            long idOfExistRule = PortForwardingCreateRulePresenter.this.f37523a.getIdOfExistRule();
            if (idOfExistRule != -1 && (itemByLocalId = PortForwardingCreateRulePresenter.this.f37529u.getItemByLocalId(idOfExistRule)) != null) {
                PortForwardingCreateRulePresenter.this.f37527e.L4(Avo.OpenedFrom.EDIT_PORT_FORWARDING, string);
                PortForwardingCreateRulePresenter.this.getViewState().ua(itemByLocalId, string);
                return m0.f82633a;
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37582a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f37584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f37584c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new s(this.f37584c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37582a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (PortForwardingCreateRulePresenter.this.c3(this.f37584c)) {
                PortForwardingCreateRulePresenter.this.getViewState().I();
            } else {
                PortForwardingCreateRulePresenter portForwardingCreateRulePresenter = PortForwardingCreateRulePresenter.this;
                portForwardingCreateRulePresenter.v3(portForwardingCreateRulePresenter.R2(this.f37584c), com.server.auditor.ssh.client.ui.vaults.data.a.b(this.f37584c.f()));
                if (com.server.auditor.ssh.client.ui.vaults.data.a.b(this.f37584c.f())) {
                    if (PortForwardingCreateRulePresenter.this.f37523a.isOpenToEditExistRule()) {
                        PortForwardingCreateRulePresenter.this.z3(this.f37584c);
                    } else {
                        PortForwardingCreateRulePresenter.this.K2(this.f37584c);
                        PortForwardingCreateRulePresenter.this.w3("Create");
                    }
                } else if (PortForwardingCreateRulePresenter.this.f37523a.isOpenToEditExistRule()) {
                    PortForwardingCreateRulePresenter.this.getViewState().Je(this.f37584c);
                    PortForwardingCreateRulePresenter.this.y3();
                } else {
                    PortForwardingCreateRulePresenter.this.K2(this.f37584c);
                    PortForwardingCreateRulePresenter.this.w3("Create");
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37585a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37585a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().p0(PortForwardingCreateRulePresenter.this.f37523a.getTargetVaultKeyId());
            PortForwardingCreateRulePresenter portForwardingCreateRulePresenter = PortForwardingCreateRulePresenter.this;
            portForwardingCreateRulePresenter.f37524b = portForwardingCreateRulePresenter.f37523a.hashCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37587a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37587a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingCreateRulePresenter.this.getViewState().p0(PortForwardingCreateRulePresenter.this.f37523a.getInitialVaultKeyId());
            PortForwardingCreateRulePresenter.this.f37523a.setTargetVaultKeyId(PortForwardingCreateRulePresenter.this.f37523a.getInitialVaultKeyId());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37589a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f37591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(long j10, zt.e eVar) {
            super(2, eVar);
            this.f37591c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingCreateRulePresenter.this.new v(this.f37591c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37589a;
            if (i10 == 0) {
                x.b(obj);
                PortForwardingCreateRulePresenter.this.f37523a.setIntermediateHostId(this.f37591c);
                PortForwardingCreateRulePresenter.this.f37523a.setInitialVaultKeyId(PortForwardingCreateRulePresenter.this.f37523a.getTargetVaultKeyId());
                PortForwardingCreateRulePresenter portForwardingCreateRulePresenter = PortForwardingCreateRulePresenter.this;
                this.f37589a = 1;
                if (portForwardingCreateRulePresenter.C3(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PortForwardingCreateRulePresenter.this.getViewState().l7(null);
            PortForwardingCreateRulePresenter.this.D3();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37594c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37596e;

        w(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37594c = obj;
            this.f37596e |= RtlSpacingHelper.UNDEFINED;
            return PortForwardingCreateRulePresenter.this.C3(this);
        }
    }

    public PortForwardingCreateRulePresenter(PortForwardingWizardData portForwardingWizardData) {
        ju.t.f(portForwardingWizardData, "wizardData");
        this.f37523a = portForwardingWizardData;
        this.f37525c = "";
        this.f37526d = com.server.auditor.ssh.client.app.a.N();
        this.f37527e = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f37528f = new k0();
        PFRulesDBAdapter pFRulesDBAdapterZ = hg.f.p().z();
        this.f37529u = pFRulesDBAdapterZ;
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        ju.t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        SshConfigDBAdapter sshConfigDBAdapterS = hg.f.p().S();
        ju.t.e(sshConfigDBAdapterS, "getSshConfigDBAdapter(...)");
        ju.t.e(pFRulesDBAdapterZ, "portForwardingRulesDBAdapter");
        PFApiAdapter pFApiAdapterY = hg.f.p().y();
        ju.t.e(pFApiAdapterY, "getPFRulesApiAdapter(...)");
        this.f37530v = new zi.a(hostsDBAdapterI, sshConfigDBAdapterS, pFRulesDBAdapterZ, pFApiAdapterY);
        this.f37531w = new h0(vl.g.f83702b.b(), null, null, 6, null);
        this.f37532x = portForwardingWizardData.copy((8191 & 1) != 0 ? portForwardingWizardData.portForwardingType : 0, (8191 & 2) != 0 ? portForwardingWizardData.localPortNumber : 0, (8191 & 4) != 0 ? portForwardingWizardData.bindAddress : null, (8191 & 8) != 0 ? portForwardingWizardData.intermediateHostId : 0L, (8191 & 16) != 0 ? portForwardingWizardData.destinationPortNumber : 0, (8191 & 32) != 0 ? portForwardingWizardData.destinationAddress : null, (8191 & 64) != 0 ? portForwardingWizardData.ruleLabel : null, (8191 & 128) != 0 ? portForwardingWizardData.isRuleCreatedByWizard : false, (8191 & 256) != 0 ? portForwardingWizardData.isOpenToEditExistRule : false, (8191 & File.FLAG_O_TRUNC) != 0 ? portForwardingWizardData.idOfExistRule : 0L, (8191 & File.FLAG_O_APPEND) != 0 ? portForwardingWizardData.initialVaultKeyId : null, (8191 & 2048) != 0 ? portForwardingWizardData.targetVaultKeyId : null, (8191 & 4096) != 0 ? portForwardingWizardData.credentialsMode : null).hashCode();
        this.f37533y = ut.o.a(new iu.a() { // from class: cl.a
            @Override // iu.a
            public final Object a() {
                return PortForwardingCreateRulePresenter.d3(this.f15922a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A3() {
        if (!Y2(true)) {
            return false;
        }
        PortForwardingWizardData portForwardingWizardData = this.f37523a;
        portForwardingWizardData.setIdOfExistRule(this.f37530v.f(portForwardingWizardData));
        this.f37523a.setOpenToEditExistRule(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C3(zt.e r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingCreateRulePresenter.C3(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3() {
        getViewState().X(Z2(this, false, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(qq.a aVar) {
        this.f37523a.setTargetVaultKeyId(aVar.f());
        getViewState().p0(aVar.f());
        getViewState().I();
        getViewState().Za();
    }

    private final void M2(VaultKeyId vaultKeyId) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(vaultKeyId, null), 3, null);
    }

    private final iq.b Q2() {
        return (iq.b) this.f37533y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String R2(qq.a aVar) {
        return !this.f37523a.isOpenToEditExistRule() ? "Create" : aVar.c();
    }

    private final boolean S2(boolean z10) {
        boolean zM0 = su.s.m0(this.f37523a.getDestinationAddress());
        boolean z11 = !zM0;
        if (z10 && zM0) {
            getViewState().xd(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    private final boolean T2(boolean z10) {
        boolean z11 = this.f37523a.getDestinationPortNumber() != -1;
        if (z10 && !z11) {
            getViewState().c6(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    private final boolean U2(boolean z10) {
        return W2(z10) && a3(z10) && V2(z10);
    }

    private final boolean V2(boolean z10) {
        boolean z11 = this.f37523a.getIntermediateHostId() != -1;
        if (z10 && !z11) {
            getViewState().l7(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    private final boolean W2(boolean z10) {
        boolean zM0 = su.s.m0(this.f37523a.getRuleLabel());
        boolean z11 = !zM0;
        if (z10 && zM0) {
            getViewState().P2(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    private final boolean X2(boolean z10) {
        return W2(z10) && a3(z10) && V2(z10) && S2(z10) && T2(z10);
    }

    private final boolean Y2(boolean z10) {
        int portForwardingType = this.f37523a.getPortForwardingType();
        if (portForwardingType == 0) {
            return X2(z10);
        }
        if (portForwardingType == 1) {
            return b3(z10);
        }
        if (portForwardingType != 2) {
            return false;
        }
        return U2(z10);
    }

    static /* synthetic */ boolean Z2(PortForwardingCreateRulePresenter portForwardingCreateRulePresenter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return portForwardingCreateRulePresenter.Y2(z10);
    }

    private final boolean a3(boolean z10) {
        boolean z11 = this.f37523a.getLocalPortNumber() != -1;
        if (z10 && !z11) {
            getViewState().b7(new a0.a(R.string.required_field, new Object[0]));
        }
        return z11;
    }

    private final boolean b3(boolean z10) {
        return W2(z10) && a3(z10) && V2(z10) && S2(z10) && T2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c3(qq.a aVar) {
        return ju.t.b(this.f37523a.getTargetVaultKeyId(), aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b d3(PortForwardingCreateRulePresenter portForwardingCreateRulePresenter) {
        hg.d dVarM = portForwardingCreateRulePresenter.f37526d.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new wn.j(dVarM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(String str, boolean z10) {
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.f37525c = string;
        com.server.auditor.ssh.client.utils.analytics.a.y().J0(new wp.a(changeVaultActionC, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.PORT_FORWARDING_RULE, this.f37525c, c1341a.b(z10), c1341a.a(this.f37523a.getInitialVaultKeyId())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(String str) {
        Avo.ChangeVaultAction changeVaultActionC = vp.a.f83866a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().K0(new wp.b(changeVaultActionC, this.f37525c, Avo.Entity.PORT_FORWARDING_RULE, Avo.ChangeVaultSource.EDIT_FORM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(String str) {
        com.server.auditor.ssh.client.utils.analytics.a.y().r1(vp.a.f83866a.e(str), this.f37525c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3() {
        com.server.auditor.ssh.client.utils.analytics.a.y().s1(this.f37525c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(qq.a aVar) {
        this.f37523a.setTargetVaultKeyId(aVar.f());
        Q2().j(vt.v.e(this.f37530v.a(this.f37523a)), aVar.f(), aVar.d(), "editor_screen", this);
    }

    public final void B3(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new v(j10, null), 3, null);
    }

    @Override // iq.b.a
    public void J3(dq.t tVar) {
        ju.t.f(tVar, "recreatedCredentialsInfo");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: L2, reason: merged with bridge method [inline-methods] */
    public void attachView(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
        super.attachView(bVar);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final int O2() {
        return this.f37523a.hashCode();
    }

    public final int P2() {
        return this.f37532x;
    }

    public final void e3(String str) {
        ju.t.f(str, "newBindAddress");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(str, null), 3, null);
    }

    public final void f3(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(aVar, null), 3, null);
    }

    public final void g3(String str) {
        ju.t.f(str, "newDestinationAddress");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    public final void h3(String str) {
        ju.t.f(str, "newDestinationPort");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
    }

    public final void i3(boolean z10, int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(z10, i10, null), 3, null);
    }

    public final void j3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    @Override // iq.b.a
    public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        ju.t.f(list, "sourceEntitiesToMove");
        ju.t.f(iVar, "conflictsEntities");
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        ju.t.f(str, "credentialsMode");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(iVar, list, vaultKeyId, str, null), 3, null);
    }

    public final void l3(String str) {
        ju.t.f(str, "newLabel");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(str, null), 3, null);
    }

    public final void m3(String str) {
        ju.t.f(str, "newPortNumber");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(str, null), 3, null);
    }

    public final void n3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    public final void o3(int i10) {
        if (i10 == 1000) {
            getViewState().f();
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        if (this.f37523a.isOpenToEditExistRule()) {
            getViewState().y5(false);
        }
        if (this.f37524b == 0) {
            this.f37524b = this.f37523a.hashCode();
        }
    }

    public final void p3(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(i10, this, null), 3, null);
    }

    public final void q3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    public final void r3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(null), 3, null);
    }

    public final void s3(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(aVar, null), 3, null);
    }

    public final void t3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(null), 3, null);
    }

    public final void u3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new u(null), 3, null);
    }
}
