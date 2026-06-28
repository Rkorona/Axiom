package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetPackageApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnippetPackageDBAdapter f27723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SnippetPackageApiAdapter f27724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SnippetDBAdapter f27725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SnippetHostDBAdapter f27726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn.j f27727e;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.z0$a$a, reason: collision with other inner class name */
        public static final class C0444a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f27728a;

            public C0444a(long j10) {
                super(null);
                this.f27728a = j10;
            }

            public final long a() {
                return this.f27728a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0444a) && this.f27728a == ((C0444a) obj).f27728a;
            }

            public int hashCode() {
                return Long.hashCode(this.f27728a);
            }

            public String toString() {
                return "PackageSaved(savedPackageId=" + this.f27728a + ")";
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SnippetPackageDBModel f27730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0 f27731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SnippetPackageDBModel snippetPackageDBModel, z0 z0Var, zt.e eVar) {
            super(2, eVar);
            this.f27730b = snippetPackageDBModel;
            this.f27731c = z0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f27730b, this.f27731c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long lPostItem;
            au.b.f();
            if (this.f27729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f27730b.getIdInDatabase() == -1 || this.f27730b.getIdInDatabase() == 0) {
                lPostItem = this.f27731c.f27724b.postItem(this.f27730b);
            } else {
                this.f27731c.f27724b.putItem(this.f27730b);
                lPostItem = kotlin.coroutines.jvm.internal.b.e(this.f27730b.getIdInDatabase());
            }
            this.f27731c.i(this.f27730b);
            ju.t.c(lPostItem);
            return new a.C0444a(lPostItem.longValue());
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27732a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnippetPackageDBModel f27734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VaultKeyId f27735d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SnippetPackageDBModel snippetPackageDBModel, VaultKeyId vaultKeyId, zt.e eVar) {
            super(2, eVar);
            this.f27734c = snippetPackageDBModel;
            this.f27735d = vaultKeyId;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return z0.this.new c(this.f27734c, this.f27735d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27732a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            dq.g0.d(new dq.g0(z0.this.f27727e), this.f27734c, "Move", this.f27735d, null, false, 24, null);
            z0.this.i(this.f27734c);
            return new a.C0444a(-1L);
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public z0(SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetPackageApiAdapter snippetPackageApiAdapter, SnippetDBAdapter snippetDBAdapter, SnippetHostDBAdapter snippetHostDBAdapter, wn.j jVar) {
        ju.t.f(snippetPackageDBAdapter, "snippetPackageDBAdapter");
        ju.t.f(snippetPackageApiAdapter, "snippetPackageApiAdapter");
        ju.t.f(snippetDBAdapter, "snippetDBAdapter");
        ju.t.f(snippetHostDBAdapter, "snippetHostDBAdapter");
        ju.t.f(jVar, "syncKeysAndIdentitiesRepository");
        this.f27723a = snippetPackageDBAdapter;
        this.f27724b = snippetPackageApiAdapter;
        this.f27725c = snippetDBAdapter;
        this.f27726d = snippetHostDBAdapter;
        this.f27727e = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(SnippetPackageDBModel snippetPackageDBModel) {
        Avo.IsSharedEntity isSharedEntity = Avo.IsSharedEntity.NO;
        if (snippetPackageDBModel.isShared()) {
            isSharedEntity = Avo.IsSharedEntity.YES;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().f5(Avo.PackageOrigin.PACKAGE_CREATE_FORM, isSharedEntity);
    }

    public final SnippetPackageDBModel d(long j10, String str) {
        ju.t.f(str, "updatedName");
        SnippetPackageDBModel itemByLocalId = this.f27723a.getItemByLocalId(j10);
        itemByLocalId.setLabel(str);
        ju.t.c(itemByLocalId);
        return itemByLocalId;
    }

    public final SnippetPackageDBModel e(long j10) {
        if (j10 == -1) {
            return new SnippetPackageDBModel("", false, (VaultKeyId) null, 4, (ju.k) null);
        }
        SnippetPackageDBModel itemByLocalId = this.f27723a.getItemByLocalId(j10);
        ju.t.c(itemByLocalId);
        return itemByLocalId;
    }

    public final boolean f(long j10) {
        Iterator<SnippetDBModel> it = this.f27725c.getSnippetModelsByPackageId(j10).iterator();
        while (it.hasNext()) {
            if (this.f27726d.getSnippetHostsBySnippetId(it.next().getIdInDatabase()).size() > 0) {
                return true;
            }
        }
        return false;
    }

    public final Object g(SnippetPackageDBModel snippetPackageDBModel, zt.e eVar) {
        return wu.j0.e(new b(snippetPackageDBModel, this, null), eVar);
    }

    public final Object h(SnippetPackageDBModel snippetPackageDBModel, VaultKeyId vaultKeyId, zt.e eVar) {
        return wu.j0.e(new c(snippetPackageDBModel, vaultKeyId, null), eVar);
    }

    public /* synthetic */ z0(SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetPackageApiAdapter snippetPackageApiAdapter, SnippetDBAdapter snippetDBAdapter, SnippetHostDBAdapter snippetHostDBAdapter, wn.j jVar, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? hg.f.p().O() : snippetPackageDBAdapter, (i10 & 2) != 0 ? hg.f.p().N() : snippetPackageApiAdapter, (i10 & 4) != 0 ? hg.f.p().J() : snippetDBAdapter, (i10 & 8) != 0 ? hg.f.p().M() : snippetHostDBAdapter, jVar);
    }
}
