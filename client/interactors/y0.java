package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.KnownHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import java.util.ArrayList;
import java.util.List;
import u9.a;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wu.g0 f27688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GroupDBAdapter f27689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostsDBAdapter f27690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SnippetDBAdapter f27691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SnippetPackageDBAdapter f27692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PFRulesDBAdapter f27693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IdentityDBAdapter f27694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SshKeyDBAdapter f27695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final KnownHostsDBAdapter f27696i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f27698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f27699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f27700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f27701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f27702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f27703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f27704h;

        public a(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8) {
            ju.t.f(list, "groups");
            ju.t.f(list2, Table.HOSTS);
            ju.t.f(list3, "snippets");
            ju.t.f(list4, "snippetPackages");
            ju.t.f(list5, "portForwardings");
            ju.t.f(list6, "identities");
            ju.t.f(list7, "sshKeys");
            ju.t.f(list8, "knownHosts");
            this.f27697a = list;
            this.f27698b = list2;
            this.f27699c = list3;
            this.f27700d = list4;
            this.f27701e = list5;
            this.f27702f = list6;
            this.f27703g = list7;
            this.f27704h = list8;
        }

        public final List a() {
            return this.f27697a;
        }

        public final List b() {
            return this.f27698b;
        }

        public final List c() {
            return this.f27702f;
        }

        public final List d() {
            return this.f27704h;
        }

        public final List e() {
            return this.f27701e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ju.t.b(this.f27697a, aVar.f27697a) && ju.t.b(this.f27698b, aVar.f27698b) && ju.t.b(this.f27699c, aVar.f27699c) && ju.t.b(this.f27700d, aVar.f27700d) && ju.t.b(this.f27701e, aVar.f27701e) && ju.t.b(this.f27702f, aVar.f27702f) && ju.t.b(this.f27703g, aVar.f27703g) && ju.t.b(this.f27704h, aVar.f27704h);
        }

        public final List f() {
            return this.f27700d;
        }

        public final List g() {
            return this.f27699c;
        }

        public final List h() {
            return this.f27703g;
        }

        public int hashCode() {
            return (((((((((((((this.f27697a.hashCode() * 31) + this.f27698b.hashCode()) * 31) + this.f27699c.hashCode()) * 31) + this.f27700d.hashCode()) * 31) + this.f27701e.hashCode()) * 31) + this.f27702f.hashCode()) * 31) + this.f27703g.hashCode()) * 31) + this.f27704h.hashCode();
        }

        public String toString() {
            return "SetupTeamVaultEntitiesToShareModel(groups=" + this.f27697a + ", hosts=" + this.f27698b + ", snippets=" + this.f27699c + ", snippetPackages=" + this.f27700d + ", portForwardings=" + this.f27701e + ", identities=" + this.f27702f + ", sshKeys=" + this.f27703g + ", knownHosts=" + this.f27704h + ")";
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27705a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return y0.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27705a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return new a(y0.this.k(), y0.this.l(), y0.this.q(), y0.this.p(), y0.this.o(), y0.this.m(), y0.this.r(), y0.this.n());
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27707a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27709c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27707a = obj;
            this.f27709c |= RtlSpacingHelper.UNDEFINED;
            return y0.this.j(this);
        }
    }

    public y0(wu.g0 g0Var, GroupDBAdapter groupDBAdapter, HostsDBAdapter hostsDBAdapter, SnippetDBAdapter snippetDBAdapter, SnippetPackageDBAdapter snippetPackageDBAdapter, PFRulesDBAdapter pFRulesDBAdapter, IdentityDBAdapter identityDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, KnownHostsDBAdapter knownHostsDBAdapter) {
        ju.t.f(g0Var, "ioDispatcher");
        ju.t.f(groupDBAdapter, "groupDBAdapter");
        ju.t.f(hostsDBAdapter, "hostsDBAdapter");
        ju.t.f(snippetDBAdapter, "snippetsDBAdapter");
        ju.t.f(snippetPackageDBAdapter, "snippetPackagesDBAdapter");
        ju.t.f(pFRulesDBAdapter, "portForwardingsDBAdapter");
        ju.t.f(identityDBAdapter, "identityDBAdapter");
        ju.t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        ju.t.f(knownHostsDBAdapter, "knownHostsDBAdapter");
        this.f27688a = g0Var;
        this.f27689b = groupDBAdapter;
        this.f27690c = hostsDBAdapter;
        this.f27691d = snippetDBAdapter;
        this.f27692e = snippetPackageDBAdapter;
        this.f27693f = pFRulesDBAdapter;
        this.f27694g = identityDBAdapter;
        this.f27695h = sshKeyDBAdapter;
        this.f27696i = knownHostsDBAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k() {
        List<GroupDBModel> itemListWhichNotDeleted = this.f27689b.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            if (((GroupDBModel) obj).getParentGroupId() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List l() {
        List<HostDBModel> itemListWhichNotDeleted = this.f27690c.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            HostDBModel hostDBModel = (HostDBModel) obj;
            if (!hostDBModel.hasLocalConfig() && !hostDBModel.hasGroup()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List m() {
        List<IdentityDBModel> itemListWhichNotDeleted = this.f27694g.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            if (((IdentityDBModel) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List n() {
        List<KnownHostsDBModel> itemListWhichNotDeleted = this.f27696i.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        return itemListWhichNotDeleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List o() {
        List<RuleDBModel> itemListWhichNotDeleted = this.f27693f.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        return itemListWhichNotDeleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List p() {
        List<SnippetPackageDBModel> itemListWhichNotDeleted = this.f27692e.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        return itemListWhichNotDeleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List q() {
        List<SnippetDBModel> itemListWhichNotDeleted = this.f27691d.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            if (((SnippetDBModel) obj).getPackageId() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List r() {
        List<SshKeyDBModel> itemListWhichNotDeleted = this.f27695h.getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemListWhichNotDeleted) {
            SshKeyDBModel sshKeyDBModel = (SshKeyDBModel) obj;
            if (!ju.t.b(sshKeyDBModel.getKeyType(), "EC") && !ju.t.b(sshKeyDBModel.getKeyType(), a.h.f81659b.a()) && !ju.t.b(sshKeyDBModel.getKeyType(), a.g.f81658b.a())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object i(zt.e eVar) {
        return wu.i.g(this.f27688a, new b(null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.interactors.y0.c
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.interactors.y0$c r0 = (com.server.auditor.ssh.client.interactors.y0.c) r0
            int r1 = r0.f27709c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27709c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.y0$c r0 = new com.server.auditor.ssh.client.interactors.y0$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27707a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27709c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            r0.f27709c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.server.auditor.ssh.client.interactors.y0$a r5 = (com.server.auditor.ssh.client.interactors.y0.a) r5
            java.util.List r0 = r5.a()
            int r0 = r0.size()
            java.util.List r1 = r5.b()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r1 = r5.g()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r1 = r5.f()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r1 = r5.e()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r1 = r5.c()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r1 = r5.h()
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.List r5 = r5.d()
            int r5 = r5.size()
            int r0 = r0 + r5
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.d(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.y0.j(zt.e):java.lang.Object");
    }
}
