package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.presenters.vaults.ConflictsProcessingPresenter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dq.t;
import eq.b0;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vp.a;
import vt.v;
import wn.j;
import wu.i0;
import wu.s0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ConflictsProcessingPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.vaults.b> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f38461y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f38462z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VaultKeyId f38464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f38468f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f38469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f38470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n f38472x;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38473a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38473a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38474a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f38476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l10, e eVar) {
            super(2, eVar);
            this.f38476c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConflictsProcessingPresenter.this.new c(this.f38476c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38474a;
            if (i10 == 0) {
                x.b(obj);
                this.f38474a = 1;
                if (s0.b(1000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            ConflictsProcessingPresenter.this.getViewState().h3(this.f38476c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38479c;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ConflictsProcessingPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listM;
            t tVar;
            Object objF = au.b.f();
            int i10 = this.f38479c;
            if (i10 == 0) {
                x.b(obj);
                listM = b0.f48942a.m(ConflictsProcessingPresenter.this.f38463a);
                t tVarE2 = ju.t.b(ConflictsProcessingPresenter.this.f38470v, "drag_and_drop") ? ConflictsProcessingPresenter.this.E2(listM) : ConflictsProcessingPresenter.this.G2(listM);
                this.f38477a = listM;
                this.f38478b = tVarE2;
                this.f38479c = 1;
                if (s0.b(1000L, this) == objF) {
                    return objF;
                }
                tVar = tVarE2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) this.f38478b;
                listM = (List) this.f38477a;
                x.b(obj);
            }
            ConflictsProcessingPresenter.this.getViewState().jd();
            ConflictsProcessingPresenter.this.C2(listM);
            dq.n nVar = (dq.n) v.r0(tVar.a());
            ConflictsProcessingPresenter.this.D2(nVar != null ? kotlin.coroutines.jvm.internal.b.e(nVar.b()) : null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ConflictsProcessingPresenter(List list, VaultKeyId vaultKeyId, String str, String str2, String str3, long j10, String str4, String str5) {
        ju.t.f(list, "sourceEntitiesArgData");
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        ju.t.f(str, "ordinaryConflictsResolveMethod");
        ju.t.f(str2, "pfConflictsResolveMethod");
        ju.t.f(str3, "credentialsMode");
        ju.t.f(str4, "wizardId");
        ju.t.f(str5, "wayToMove");
        this.f38463a = list;
        this.f38464b = vaultKeyId;
        this.f38465c = str;
        this.f38466d = str2;
        this.f38467e = str3;
        this.f38468f = j10;
        this.f38469u = str4;
        this.f38470v = str5;
        this.f38471w = com.server.auditor.ssh.client.app.a.N();
        this.f38472x = o.a(new iu.a() { // from class: gl.a
            @Override // iu.a
            public final Object a() {
                return ConflictsProcessingPresenter.A2(this.f51395a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b A2(ConflictsProcessingPresenter conflictsProcessingPresenter) {
        hg.d dVarM = conflictsProcessingPresenter.f38471w.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new j(dVarM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(List list) {
        a.C1341a c1341a = vp.a.f83866a;
        com.server.auditor.ssh.client.utils.analytics.a.y().K0(new wp.b(Avo.ChangeVaultAction.MOVE, this.f38469u, c1341a.h(list), c1341a.d(this.f38470v)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(Long l10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(l10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t E2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ju.t.b(((SyncableModel) obj).getVaultKeyId(), this.f38464b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (ju.t.b(((SyncableModel) obj2).getVaultKeyId(), this.f38464b)) {
                arrayList2.add(obj2);
            }
        }
        x2(arrayList, arrayList2);
        return z2().i(arrayList, this.f38464b, this.f38465c, this.f38466d, this.f38467e, this.f38470v);
    }

    private final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t G2(List list) {
        return z2().i(list, this.f38464b, this.f38465c, this.f38466d, this.f38467e, this.f38470v);
    }

    private final void x2(List list, List list2) {
        if (this.f38468f != -1) {
            y2(list, false);
            y2(list2, true);
        }
    }

    private final void y2(List list, boolean z10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SyncableModel syncableModel = (SyncableModel) it.next();
            if (syncableModel instanceof HostDBModel) {
                ((HostDBModel) syncableModel).setGroupId(Long.valueOf(this.f38468f));
                if (z10) {
                    gq.c.f51456a.a(syncableModel);
                }
            } else if (syncableModel instanceof SnippetDBModel) {
                ((SnippetDBModel) syncableModel).setPackageId(Long.valueOf(this.f38468f));
                if (z10) {
                    gq.c.f51456a.a(syncableModel);
                }
            }
        }
    }

    private final iq.b z2() {
        return (iq.b) this.f38472x.getValue();
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        F2();
    }
}
