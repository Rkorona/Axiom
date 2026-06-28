package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.contracts.vaults.d;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import com.server.auditor.ssh.client.interactors.k0;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import iu.p;
import java.util.Iterator;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class OrdinaryConflictsPresenter extends MvpPresenter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0 f38483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wp.c f38484d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38485a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return OrdinaryConflictsPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38485a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().K1(Avo.DependencyResolution.CANCEL, OrdinaryConflictsPresenter.this.s2());
            OrdinaryConflictsPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38487a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConflictsArgData[] f38489c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ConflictsArgData[] conflictsArgDataArr, e eVar) {
            super(2, eVar);
            this.f38489c = conflictsArgDataArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return OrdinaryConflictsPresenter.this.new b(this.f38489c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38487a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            OrdinaryConflictsPresenter.this.r2(this.f38489c, "Copy");
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38490a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConflictsArgData[] f38492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ConflictsArgData[] conflictsArgDataArr, e eVar) {
            super(2, eVar);
            this.f38492c = conflictsArgDataArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return OrdinaryConflictsPresenter.this.new c(this.f38492c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38490a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            OrdinaryConflictsPresenter.this.r2(this.f38492c, "Move");
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public OrdinaryConflictsPresenter(List list, String str) {
        t.f(list, "conflictsData");
        t.f(str, "wizardId");
        this.f38481a = list;
        this.f38482b = str;
        this.f38483c = new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(ConflictsArgData[] conflictsArgDataArr, String str) {
        w2(str);
        if (this.f38483c.a(conflictsArgDataArr)) {
            getViewState().Bb(str);
        } else {
            getViewState().Rd(str);
        }
    }

    private final void w2(String str) {
        com.server.auditor.ssh.client.utils.analytics.a.y().K1(vp.a.f83866a.f(str), s2());
    }

    private final void x2() {
        Iterator it = this.f38481a.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            Class<? extends SyncableModel> entityType = ((ConflictsArgData) it.next()).getEntityType();
            if (t.b(entityType, HostDBModel.class)) {
                i10++;
            } else if (t.b(entityType, SnippetDBModel.class)) {
                i11++;
            } else if (t.b(entityType, SshKeyDBModel.class)) {
                i12++;
            } else if (t.b(entityType, IdentityDBModel.class)) {
                i13++;
            }
        }
        y2(new wp.c(this.f38482b, i10, i11, i12, i13));
        com.server.auditor.ssh.client.utils.analytics.a.y().L1(s2());
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        x2();
    }

    public final wp.c s2() {
        wp.c cVar = this.f38484d;
        if (cVar != null) {
            return cVar;
        }
        t.t("dependencyScreenOpenedData");
        return null;
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void u2(ConflictsArgData[] conflictsArgDataArr) {
        t.f(conflictsArgDataArr, "conflicts");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(conflictsArgDataArr, null), 3, null);
    }

    public final void v2(ConflictsArgData[] conflictsArgDataArr) {
        t.f(conflictsArgDataArr, "conflicts");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(conflictsArgDataArr, null), 3, null);
    }

    public final void y2(wp.c cVar) {
        t.f(cVar, "<set-?>");
        this.f38484d = cVar;
    }
}
