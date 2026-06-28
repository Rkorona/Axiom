package com.server.auditor.ssh.client.fragments.editors.base;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.q;
import androidx.lifecycle.r0;
import com.server.auditor.ssh.client.fragments.hostngroups.HostsRecyclerFragment;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HostsScreenViewModel;
import ut.m0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsRecyclerFragment f24840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HostsScreenViewModel f24841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24842d;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$a$a, reason: collision with other inner class name */
        static final class C0400a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24843a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HostsScreenViewModel f24844b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24845c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ HostsRecyclerFragment f24846d;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$a$a$a, reason: collision with other inner class name */
            static final class C0401a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ HostsScreenViewModel f24847a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24848b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ HostsRecyclerFragment f24849c;

                C0401a(HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar, HostsRecyclerFragment hostsRecyclerFragment) {
                    this.f24847a = hostsScreenViewModel;
                    this.f24848b = kVar;
                    this.f24849c = hostsRecyclerFragment;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(HostsScreenViewModel.e eVar, zt.e eVar2) {
                    this.f24847a.getFilteredContainers().clear();
                    this.f24847a.getFilteredContainers().addAll(eVar.d());
                    this.f24848b.n0((String[]) new su.p("\\s+").j(eVar.e(), 0).toArray(new String[0]));
                    this.f24848b.f0().clear();
                    this.f24848b.f0().addAll(eVar.h());
                    this.f24848b.g0().clear();
                    this.f24848b.g0().addAll(eVar.i());
                    this.f24849c.Bh();
                    this.f24848b.o();
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0400a(HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar, HostsRecyclerFragment hostsRecyclerFragment, zt.e eVar) {
                super(2, eVar);
                this.f24844b = hostsScreenViewModel;
                this.f24845c = kVar;
                this.f24846d = hostsRecyclerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new C0400a(this.f24844b, this.f24845c, this.f24846d, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24843a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    k0 filteredItems = this.f24844b.getFilteredItems();
                    C0401a c0401a = new C0401a(this.f24844b, this.f24845c, this.f24846d);
                    this.f24843a = 1;
                    if (filteredItems.collect(c0401a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                throw new ut.j();
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((C0400a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HostsRecyclerFragment hostsRecyclerFragment, HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar, zt.e eVar) {
            super(2, eVar);
            this.f24840b = hostsRecyclerFragment;
            this.f24841c = hostsScreenViewModel;
            this.f24842d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f24840b, this.f24841c, this.f24842d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24839a;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsRecyclerFragment hostsRecyclerFragment = this.f24840b;
                q.b bVar = q.b.f8799d;
                C0400a c0400a = new C0400a(this.f24841c, this.f24842d, hostsRecyclerFragment, null);
                this.f24839a = 1;
                if (r0.b(hostsRecyclerFragment, bVar, c0400a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsRecyclerFragment f24851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HostsScreenViewModel f24852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24853d;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HostsScreenViewModel f24855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24856c;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$b$a$a, reason: collision with other inner class name */
            static final class C0402a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.server.auditor.ssh.client.fragments.hostngroups.k f24857a;

                C0402a(com.server.auditor.ssh.client.fragments.hostngroups.k kVar) {
                    this.f24857a = kVar;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.f fVar, zt.e eVar) {
                    this.f24857a.b0(fVar);
                    this.f24857a.o();
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar, zt.e eVar) {
                super(2, eVar);
                this.f24855b = hostsScreenViewModel;
                this.f24856c = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24855b, this.f24856c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24854a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    k0 editingState = this.f24855b.getEditingState();
                    C0402a c0402a = new C0402a(this.f24856c);
                    this.f24854a = 1;
                    if (editingState.collect(c0402a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                throw new ut.j();
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HostsRecyclerFragment hostsRecyclerFragment, HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar, zt.e eVar) {
            super(2, eVar);
            this.f24851b = hostsRecyclerFragment;
            this.f24852c = hostsScreenViewModel;
            this.f24853d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f24851b, this.f24852c, this.f24853d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24850a;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsRecyclerFragment hostsRecyclerFragment = this.f24851b;
                q.b bVar = q.b.f8799d;
                a aVar = new a(this.f24852c, this.f24853d, null);
                this.f24850a = 1;
                if (r0.b(hostsRecyclerFragment, bVar, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsRecyclerFragment f24859b;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HostsRecyclerFragment f24861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HostsRecyclerFragment hostsRecyclerFragment, zt.e eVar) {
                super(2, eVar);
                this.f24861b = hostsRecyclerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24861b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f24860a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f24861b.Ah();
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HostsRecyclerFragment hostsRecyclerFragment, zt.e eVar) {
            super(2, eVar);
            this.f24859b = hostsRecyclerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f24859b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24858a;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsRecyclerFragment hostsRecyclerFragment = this.f24859b;
                q.b bVar = q.b.f8800e;
                a aVar = new a(hostsRecyclerFragment, null);
                this.f24858a = 1;
                if (r0.b(hostsRecyclerFragment, bVar, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsRecyclerFragment f24863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zu.f f24864c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zu.f f24866b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HostsRecyclerFragment f24867c;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$d$a$a, reason: collision with other inner class name */
            static final class C0403a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ HostsRecyclerFragment f24868a;

                C0403a(HostsRecyclerFragment hostsRecyclerFragment) {
                    this.f24868a = hostsRecyclerFragment;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(HostsScreenViewModel.d dVar, zt.e eVar) {
                    if (ju.t.b(dVar, HostsScreenViewModel.d.a.f34042a)) {
                        this.f24868a.Zf();
                    } else if (ju.t.b(dVar, HostsScreenViewModel.d.C0534d.f34045a)) {
                        this.f24868a.bb();
                    } else if (dVar instanceof HostsScreenViewModel.d.b) {
                        kotlin.coroutines.jvm.internal.b.a(this.f24868a.Rg(((HostsScreenViewModel.d.b) dVar).a()));
                    } else if (ju.t.b(dVar, HostsScreenViewModel.d.c.f34044a)) {
                        this.f24868a.Rf(true);
                    } else {
                        if (!ju.t.b(dVar, HostsScreenViewModel.d.e.f34046a)) {
                            throw new ut.s();
                        }
                        this.f24868a.Yg();
                    }
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(zu.f fVar, HostsRecyclerFragment hostsRecyclerFragment, zt.e eVar) {
                super(2, eVar);
                this.f24866b = fVar;
                this.f24867c = hostsRecyclerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24866b, this.f24867c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24865a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.f fVar = this.f24866b;
                    C0403a c0403a = new C0403a(this.f24867c);
                    this.f24865a = 1;
                    if (fVar.collect(c0403a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HostsRecyclerFragment hostsRecyclerFragment, zu.f fVar, zt.e eVar) {
            super(2, eVar);
            this.f24863b = hostsRecyclerFragment;
            this.f24864c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f24863b, this.f24864c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24862a;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsRecyclerFragment hostsRecyclerFragment = this.f24863b;
                q.b bVar = q.b.f8799d;
                a aVar = new a(this.f24864c, hostsRecyclerFragment, null);
                this.f24862a = 1;
                if (r0.b(hostsRecyclerFragment, bVar, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HostsRecyclerFragment f24870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f24871c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0 f24873b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HostsRecyclerFragment f24874c;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a, reason: collision with other inner class name */
            static final class C0404a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ HostsRecyclerFragment f24875a;

                /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$a, reason: collision with other inner class name */
                static final class C0405a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f24876a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ut.u f24877b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0405a(ut.u uVar, zt.e eVar) {
                        super(2, eVar);
                        this.f24877b = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zt.e create(Object obj, zt.e eVar) {
                        return new C0405a(this.f24877b, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        au.b.f();
                        if (this.f24876a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                        Long l10 = (Long) this.f24877b.d();
                        if (l10 == null) {
                            return null;
                        }
                        return hg.f.p().h().getItemByLocalId(l10.longValue());
                    }

                    @Override // iu.p
                    public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                        return ((C0405a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
                    }
                }

                /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$b */
                static final class b extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f24878a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f24879b;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    int f24881d;

                    b(zt.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f24879b = obj;
                        this.f24881d |= RtlSpacingHelper.UNDEFINED;
                        return C0404a.this.emit(null, this);
                    }
                }

                C0404a(HostsRecyclerFragment hostsRecyclerFragment) {
                    this.f24875a = hostsRecyclerFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(ut.u r6, zt.e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.server.auditor.ssh.client.fragments.editors.base.i0.e.a.C0404a.b
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$b r0 = (com.server.auditor.ssh.client.fragments.editors.base.i0.e.a.C0404a.b) r0
                        int r1 = r0.f24881d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f24881d = r1
                        goto L18
                    L13:
                        com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$b r0 = new com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$b
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f24879b
                        java.lang.Object r1 = au.b.f()
                        int r2 = r0.f24881d
                        r3 = 1
                        if (r2 == 0) goto L35
                        if (r2 != r3) goto L2d
                        java.lang.Object r6 = r0.f24878a
                        ut.u r6 = (ut.u) r6
                        ut.x.b(r7)
                        goto L5b
                    L2d:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L35:
                        ut.x.b(r7)
                        java.lang.Object r7 = r6.c()
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        boolean r7 = r7.booleanValue()
                        r2 = 0
                        if (r7 == 0) goto L5e
                        hg.b2 r7 = hg.b2.f52944a
                        wu.j1 r7 = r7.g1()
                        com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$a r4 = new com.server.auditor.ssh.client.fragments.editors.base.i0$e$a$a$a
                        r4.<init>(r6, r2)
                        r0.f24878a = r6
                        r0.f24881d = r3
                        java.lang.Object r7 = wu.i.g(r7, r4, r0)
                        if (r7 != r1) goto L5b
                        return r1
                    L5b:
                        r2 = r7
                        com.server.auditor.ssh.client.database.models.GroupDBModel r2 = (com.server.auditor.ssh.client.database.models.GroupDBModel) r2
                    L5e:
                        com.server.auditor.ssh.client.fragments.hostngroups.HostsRecyclerFragment r7 = r5.f24875a
                        java.lang.Object r6 = r6.c()
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        r7.Ug(r6, r2)
                        ut.m0 r6 = ut.m0.f82633a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.i0.e.a.C0404a.emit(ut.u, zt.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, HostsRecyclerFragment hostsRecyclerFragment, zt.e eVar) {
                super(2, eVar);
                this.f24873b = k0Var;
                this.f24874c = hostsRecyclerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24873b, this.f24874c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24872a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    k0 k0Var = this.f24873b;
                    C0404a c0404a = new C0404a(this.f24874c);
                    this.f24872a = 1;
                    if (k0Var.collect(c0404a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                throw new ut.j();
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HostsRecyclerFragment hostsRecyclerFragment, k0 k0Var, zt.e eVar) {
            super(2, eVar);
            this.f24870b = hostsRecyclerFragment;
            this.f24871c = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f24870b, this.f24871c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24869a;
            if (i10 == 0) {
                ut.x.b(obj);
                HostsRecyclerFragment hostsRecyclerFragment = this.f24870b;
                q.b bVar = q.b.f8799d;
                a aVar = new a(this.f24871c, hostsRecyclerFragment, null);
                this.f24869a = 1;
                if (r0.b(hostsRecyclerFragment, bVar, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final void a(HostsRecyclerFragment hostsRecyclerFragment, HostsScreenViewModel hostsScreenViewModel, com.server.auditor.ssh.client.fragments.hostngroups.k kVar) {
        ju.t.f(hostsRecyclerFragment, "<this>");
        ju.t.f(hostsScreenViewModel, "viewModel");
        ju.t.f(kVar, "adapter");
        wu.k.d(androidx.lifecycle.a0.a(hostsRecyclerFragment), null, null, new a(hostsRecyclerFragment, hostsScreenViewModel, kVar, null), 3, null);
        wu.k.d(androidx.lifecycle.a0.a(hostsRecyclerFragment), null, null, new b(hostsRecyclerFragment, hostsScreenViewModel, kVar, null), 3, null);
        wu.k.d(androidx.lifecycle.a0.a(hostsRecyclerFragment), null, null, new c(hostsRecyclerFragment, null), 3, null);
    }

    public static final void b(HostsRecyclerFragment hostsRecyclerFragment, zu.f fVar) {
        ju.t.f(hostsRecyclerFragment, "<this>");
        ju.t.f(fVar, "flow");
        wu.k.d(androidx.lifecycle.a0.a(hostsRecyclerFragment), null, null, new d(hostsRecyclerFragment, fVar, null), 3, null);
    }

    public static final void c(HostsRecyclerFragment hostsRecyclerFragment, k0 k0Var) {
        ju.t.f(hostsRecyclerFragment, "<this>");
        ju.t.f(k0Var, "onGroupSelected");
        wu.k.d(androidx.lifecycle.a0.a(hostsRecyclerFragment), null, null, new e(hostsRecyclerFragment, k0Var, null), 3, null);
    }
}
