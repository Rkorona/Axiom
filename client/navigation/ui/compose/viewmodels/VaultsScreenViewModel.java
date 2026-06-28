package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import ci.n0;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.models.KnownHost;
import com.server.auditor.ssh.client.models.PackageItem;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.viewitems.PFRuleViewItem;
import com.server.auditor.ssh.client.synchronization.api.adapters.MultiKeyApiAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tl.l2;
import ut.m0;
import vl.d;
import wu.i0;
import wu.p0;
import wu.x0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class VaultsScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final zu.w _hostsCount;
    private final zu.w _keychainCount;
    private final zu.w _knownHostsCount;
    private final zu.w _logsCount;
    private final zu.w _portForwardingCount;
    private final zu.w _snippetsCount;
    private final gj.a filterEntityHelper;
    private final to.t filterSessionLogsUseCase;
    private final il.y multiKeyDBRepository;
    private final vl.d sessionLogsAndLastConnectionsDaoRepository;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final vl.g vaultsRepository;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34880c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f34882e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, zt.e eVar) {
            super(2, eVar);
            this.f34882e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsScreenViewModel.this.new a(this.f34882e, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (r7 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f34880c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r7)
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f34879b
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r3 = r6.f34878a
                to.t r3 = (to.t) r3
                ut.x.b(r7)
                goto L47
            L26:
                ut.x.b(r7)
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.this
                to.t r7 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.access$getFilterSessionLogsUseCase$p(r7)
                java.util.List r1 = r6.f34882e
                com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel r4 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.this
                vl.d r4 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.access$getSessionLogsAndLastConnectionsDaoRepository$p(r4)
                r6.f34878a = r7
                r6.f34879b = r1
                r6.f34880c = r3
                java.lang.Object r3 = r4.c(r6)
                if (r3 != r0) goto L44
                goto L56
            L44:
                r5 = r3
                r3 = r7
                r7 = r5
            L47:
                java.util.List r7 = (java.util.List) r7
                r4 = 0
                r6.f34878a = r4
                r6.f34879b = r4
                r6.f34880c = r2
                java.lang.Object r7 = r3.f(r1, r7, r6)
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.List r7 = (java.util.List) r7
                int r7 = r7.size()
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.d(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f34887e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f34889u;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34890a;

            a(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34890a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return hg.f.p().h().getItemListWhichNotDeleted();
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel$b$b, reason: collision with other inner class name */
        static final class C0565b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34891a;

            C0565b(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new C0565b(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34891a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return hg.f.p().i().getItemListWhichNotDeleted();
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((C0565b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, zt.e eVar) {
            super(2, eVar);
            this.f34889u = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            b bVar = VaultsScreenViewModel.this.new b(this.f34889u, eVar);
            bVar.f34887e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p0 p0VarB;
            gj.a aVar;
            List list;
            int i10;
            gj.a aVar2;
            List list2;
            Object objF = au.b.f();
            int i11 = this.f34886d;
            if (i11 == 0) {
                ut.x.b(obj);
                i0 i0Var = (i0) this.f34887e;
                p0 p0VarB2 = wu.k.b(i0Var, null, null, new C0565b(null), 3, null);
                p0VarB = wu.k.b(i0Var, null, null, new a(null), 3, null);
                gj.a aVar3 = VaultsScreenViewModel.this.filterEntityHelper;
                List list3 = this.f34889u;
                this.f34887e = p0VarB;
                this.f34883a = aVar3;
                this.f34884b = list3;
                this.f34886d = 1;
                obj = p0VarB2.a0(this);
                if (obj != objF) {
                    aVar = aVar3;
                    list = list3;
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f34885c;
                list2 = (List) this.f34883a;
                aVar2 = (gj.a) this.f34887e;
                ut.x.b(obj);
                ju.t.e(obj, "await(...)");
                return kotlin.coroutines.jvm.internal.b.d(i10 + aVar2.a(list2, (List) obj).size());
            }
            list = (List) this.f34884b;
            aVar = (gj.a) this.f34883a;
            p0VarB = (p0) this.f34887e;
            ut.x.b(obj);
            ju.t.e(obj, "await(...)");
            int size = aVar.b(list, (List) obj).size();
            gj.a aVar4 = VaultsScreenViewModel.this.filterEntityHelper;
            List list4 = this.f34889u;
            this.f34887e = aVar4;
            this.f34883a = list4;
            this.f34884b = null;
            this.f34885c = size;
            this.f34886d = 2;
            Object objA0 = p0VarB.a0(this);
            if (objA0 != objF) {
                i10 = size;
                obj = objA0;
                aVar2 = aVar4;
                list2 = list4;
                ju.t.e(obj, "await(...)");
                return kotlin.coroutines.jvm.internal.b.d(i10 + aVar2.a(list2, (List) obj).size());
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f34897f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ List f34899v;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34900a;

            a(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34900a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                List<IdentityDBModel> itemListWhichNotDeleted = hg.f.p().n().getItemListWhichNotDeleted();
                ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : itemListWhichNotDeleted) {
                    if (((IdentityDBModel) obj2).isVisible()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((IdentityDBModel) it.next()).convertToIdentity());
                }
                return arrayList2;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34901a;

            b(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34901a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                List<SshKeyDBModel> itemListWhichNotDeleted = hg.f.p().W().getItemListWhichNotDeleted();
                ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
                ArrayList arrayList = new ArrayList(vt.v.z(itemListWhichNotDeleted, 10));
                Iterator<T> it = itemListWhichNotDeleted.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lj.y((SshKeyDBModel) it.next()));
                }
                return arrayList;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel$c$c, reason: collision with other inner class name */
        static final class C0566c extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0566c(VaultsScreenViewModel vaultsScreenViewModel, zt.e eVar) {
                super(2, eVar);
                this.f34903b = vaultsScreenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new C0566c(this.f34903b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34902a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return kotlin.coroutines.jvm.internal.b.d(this.f34903b.multiKeyDBRepository.c() ? 0 : this.f34903b.multiKeyDBRepository.d().size());
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((C0566c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, zt.e eVar) {
            super(2, eVar);
            this.f34899v = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            c cVar = VaultsScreenViewModel.this.new c(this.f34899v, eVar);
            cVar.f34897f = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34904a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, zt.e eVar) {
            super(2, eVar);
            this.f34906c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsScreenViewModel.this.new d(this.f34906c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34904a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            gj.a aVar = VaultsScreenViewModel.this.filterEntityHelper;
            List list = this.f34906c;
            List<KnownHost> knownHostsItems = hg.f.p().r().getKnownHostsItems();
            ju.t.e(knownHostsItems, "getKnownHostsItems(...)");
            return kotlin.coroutines.jvm.internal.b.d(aVar.f(list, knownHostsItems).size());
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34907a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, zt.e eVar) {
            super(2, eVar);
            this.f34909c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsScreenViewModel.this.new e(this.f34909c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34907a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            gj.a aVar = VaultsScreenViewModel.this.filterEntityHelper;
            List list = this.f34909c;
            List<PFRuleViewItem> itemsForBaseAdapter = hg.f.p().z().getItemsForBaseAdapter(vt.v.o());
            ju.t.e(itemsForBaseAdapter, "getItemsForBaseAdapter(...)");
            return kotlin.coroutines.jvm.internal.b.d(aVar.h(list, itemsForBaseAdapter).size());
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f34913d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f34915f;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34916a;

            a(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34916a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                List<PackageItem> allPackageItems = hg.f.p().O().getAllPackageItems();
                ArrayList arrayList = new ArrayList(vt.v.z(allPackageItems, 10));
                Iterator<T> it = allPackageItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n0.a((PackageItem) it.next()));
                }
                return arrayList;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34917a;

            b(zt.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f34917a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                List<SnippetItem> allSnippetItems = hg.f.p().J().getAllSnippetItems();
                ju.t.e(allSnippetItems, "getAllSnippetItems(...)");
                ArrayList arrayList = new ArrayList(vt.v.z(allSnippetItems, 10));
                Iterator<T> it = allSnippetItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n0.a((SnippetItem) it.next()));
                }
                return arrayList;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, zt.e eVar) {
            super(2, eVar);
            this.f34915f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            f fVar = VaultsScreenViewModel.this.new f(this.f34915f, eVar);
            fVar.f34913d = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p0 p0VarB;
            gj.a aVar;
            List list;
            Collection collection;
            gj.a aVar2;
            Object objF = au.b.f();
            int i10 = this.f34912c;
            if (i10 == 0) {
                ut.x.b(obj);
                i0 i0Var = (i0) this.f34913d;
                p0 p0VarB2 = wu.k.b(i0Var, null, null, new b(null), 3, null);
                p0VarB = wu.k.b(i0Var, null, null, new a(null), 3, null);
                gj.a aVar3 = VaultsScreenViewModel.this.filterEntityHelper;
                List list2 = this.f34915f;
                this.f34913d = p0VarB;
                this.f34910a = aVar3;
                this.f34911b = list2;
                this.f34912c = 1;
                Object objA0 = p0VarB2.a0(this);
                if (objA0 != objF) {
                    aVar = aVar3;
                    obj = objA0;
                    list = list2;
                }
                return objF;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) this.f34911b;
                list = (List) this.f34910a;
                aVar2 = (gj.a) this.f34913d;
                ut.x.b(obj);
                return kotlin.coroutines.jvm.internal.b.d(aVar2.k(list, vt.v.J0(collection, (Iterable) obj)).size());
            }
            list = (List) this.f34911b;
            aVar = (gj.a) this.f34910a;
            p0VarB = (p0) this.f34913d;
            ut.x.b(obj);
            Collection collection2 = (Collection) obj;
            this.f34913d = aVar;
            this.f34910a = list;
            this.f34911b = collection2;
            this.f34912c = 2;
            Object objA02 = p0VarB.a0(this);
            if (objA02 != objF) {
                collection = collection2;
                obj = objA02;
                aVar2 = aVar;
                return kotlin.coroutines.jvm.internal.b.d(aVar2.k(list, vt.v.J0(collection, (Iterable) obj)).size());
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f34921d;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34925c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34924b = vaultsScreenViewModel;
                this.f34925c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f34924b, this.f34925c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34923a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34924b;
                List list = this.f34925c;
                this.f34923a = 1;
                Object objFetchHostsScreenItemsCountFromDatabase = vaultsScreenViewModel.fetchHostsScreenItemsCountFromDatabase(list, this);
                return objFetchHostsScreenItemsCountFromDatabase == objF ? objF : objFetchHostsScreenItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34927b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34928c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34927b = vaultsScreenViewModel;
                this.f34928c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(this.f34927b, this.f34928c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34926a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34927b;
                List list = this.f34928c;
                this.f34926a = 1;
                Object objFetchSnippetItemsCountFromDatabase = vaultsScreenViewModel.fetchSnippetItemsCountFromDatabase(list, this);
                return objFetchSnippetItemsCountFromDatabase == objF ? objF : objFetchSnippetItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34931c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34930b = vaultsScreenViewModel;
                this.f34931c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new c(this.f34930b, this.f34931c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34929a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34930b;
                List list = this.f34931c;
                this.f34929a = 1;
                Object objFetchPortForwardingItemsCountFromDatabase = vaultsScreenViewModel.fetchPortForwardingItemsCountFromDatabase(list, this);
                return objFetchPortForwardingItemsCountFromDatabase == objF ? objF : objFetchPortForwardingItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34933b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34934c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34933b = vaultsScreenViewModel;
                this.f34934c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new d(this.f34933b, this.f34934c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34932a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34933b;
                List list = this.f34934c;
                this.f34932a = 1;
                Object objFetchKeychainItemsCountFromDatabase = vaultsScreenViewModel.fetchKeychainItemsCountFromDatabase(list, this);
                return objFetchKeychainItemsCountFromDatabase == objF ? objF : objFetchKeychainItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34936b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34937c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34936b = vaultsScreenViewModel;
                this.f34937c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new e(this.f34936b, this.f34937c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34935a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34936b;
                List list = this.f34937c;
                this.f34935a = 1;
                Object objFetchKnownHostItemsCountFromDatabase = vaultsScreenViewModel.fetchKnownHostItemsCountFromDatabase(list, this);
                return objFetchKnownHostItemsCountFromDatabase == objF ? objF : objFetchKnownHostItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VaultsScreenViewModel f34939b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f34940c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(VaultsScreenViewModel vaultsScreenViewModel, List list, zt.e eVar) {
                super(2, eVar);
                this.f34939b = vaultsScreenViewModel;
                this.f34940c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new f(this.f34939b, this.f34940c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f34938a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                VaultsScreenViewModel vaultsScreenViewModel = this.f34939b;
                List list = this.f34940c;
                this.f34938a = 1;
                Object objFetchHistoryItemsCountFromDatabase = vaultsScreenViewModel.fetchHistoryItemsCountFromDatabase(list, this);
                return objFetchHistoryItemsCountFromDatabase == objF ? objF : objFetchHistoryItemsCountFromDatabase;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            g gVar = VaultsScreenViewModel.this.new g(eVar);
            gVar.f34921d = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e8 A[PHI: r1 r3 r4 r12
          0x00e8: PHI (r1v12 zu.w) = (r1v9 zu.w), (r1v15 zu.w) binds: [B:22:0x00e4, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x00e8: PHI (r3v6 java.util.List) = (r3v3 java.util.List), (r3v8 java.util.List) binds: [B:22:0x00e4, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x00e8: PHI (r4v8 wu.i0) = (r4v5 wu.i0), (r4v10 wu.i0) binds: [B:22:0x00e4, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x00e8: PHI (r12v13 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:22:0x00e4, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0111 A[PHI: r1 r3 r4 r12
          0x0111: PHI (r1v16 zu.w) = (r1v13 zu.w), (r1v19 zu.w) binds: [B:25:0x010d, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x0111: PHI (r3v9 java.util.List) = (r3v6 java.util.List), (r3v11 java.util.List) binds: [B:25:0x010d, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x0111: PHI (r4v11 wu.i0) = (r4v8 wu.i0), (r4v13 wu.i0) binds: [B:25:0x010d, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x0111: PHI (r12v18 java.lang.Object) = (r12v17 java.lang.Object), (r12v0 java.lang.Object) binds: [B:25:0x010d, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0139 A[PHI: r1 r3 r4 r12
          0x0139: PHI (r1v20 zu.w) = (r1v17 zu.w), (r1v23 zu.w) binds: [B:28:0x0136, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x0139: PHI (r3v12 java.util.List) = (r3v9 java.util.List), (r3v14 java.util.List) binds: [B:28:0x0136, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x0139: PHI (r4v14 wu.i0) = (r4v11 wu.i0), (r4v16 wu.i0) binds: [B:28:0x0136, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]
          0x0139: PHI (r12v23 java.lang.Object) = (r12v22 java.lang.Object), (r12v0 java.lang.Object) binds: [B:28:0x0136, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0161 A[PHI: r1 r3 r4 r12
          0x0161: PHI (r1v24 zu.w) = (r1v21 zu.w), (r1v29 zu.w) binds: [B:31:0x015e, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0161: PHI (r3v15 java.util.List) = (r3v12 java.util.List), (r3v17 java.util.List) binds: [B:31:0x015e, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0161: PHI (r4v17 wu.i0) = (r4v14 wu.i0), (r4v19 wu.i0) binds: [B:31:0x015e, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0161: PHI (r12v28 java.lang.Object) = (r12v27 java.lang.Object), (r12v0 java.lang.Object) binds: [B:31:0x015e, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0189  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.VaultsScreenViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public VaultsScreenViewModel() {
        gj.a aVarE = gj.a.f51371c.e();
        this.filterEntityHelper = aVarE;
        this.termiusStorage = com.server.auditor.ssh.client.app.a.N();
        this.vaultsRepository = vl.g.f83702b.b();
        this.sessionLogsAndLastConnectionsDaoRepository = d.a.b(vl.d.f83673b, null, 1, null);
        MultiKeyDBAdapter multiKeyDBAdapterX = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW, "getMultiKeyApiAdapter(...)");
        this.multiKeyDBRepository = new il.y(multiKeyDBAdapterX, multiKeyApiAdapterW);
        SessionManager sessionManager = SessionManager.getInstance();
        ju.t.e(sessionManager, "getInstance(...)");
        this.filterSessionLogsUseCase = new to.t(sessionManager, aVarE);
        this._hostsCount = zu.m0.a(null);
        this._snippetsCount = zu.m0.a(null);
        this._portForwardingCount = zu.m0.a(null);
        this._keychainCount = zu.m0.a(null);
        this._knownHostsCount = zu.m0.a(null);
        this._logsCount = zu.m0.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchHistoryItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new a(list, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchHostsScreenItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new b(list, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchKeychainItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new c(list, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchKnownHostItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new d(list, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchPortForwardingItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new e(list, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchSnippetItemsCountFromDatabase(List<l2> list, zt.e<? super Integer> eVar) {
        return wu.i.g(x0.b(), new f(list, null), eVar);
    }

    public final k0 getHostsCount() {
        return this._hostsCount;
    }

    public final k0 getKeychainCount() {
        return this._keychainCount;
    }

    public final k0 getKnownHostsCount() {
        return this._knownHostsCount;
    }

    public final k0 getLogsCount() {
        return this._logsCount;
    }

    public final k0 getPortForwardingCount() {
        return this._portForwardingCount;
    }

    public final k0 getSnippetCount() {
        return this._snippetsCount;
    }

    public final void loadData() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }
}
