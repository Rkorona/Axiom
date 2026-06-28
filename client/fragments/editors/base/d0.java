package com.server.auditor.ssh.client.fragments.editors.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.l1;
import androidx.lifecycle.q;
import androidx.lifecycle.r0;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.fragments.conflictsflow.OrdinaryConflictsScreenArgs;
import com.server.auditor.ssh.client.fragments.conflictsflow.PortForwardingConflictArgs;
import com.server.auditor.ssh.client.fragments.editors.base.BaseEditorFragmentViewModel;
import com.server.auditor.ssh.client.fragments.editors.base.d0;
import com.server.auditor.ssh.client.interactors.k0;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.NavigationRouterActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.DirtyCheckViewModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import com.server.auditor.ssh.client.widget.a1;
import com.server.auditor.ssh.client.widget.b1;
import com.server.auditor.ssh.client.widget.editors.TagsEditorLayout;
import com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView;
import dl.b;
import dq.j0;
import eq.b0;
import iq.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import jh.l0;
import lq.j;
import timber.log.Timber;
import ut.m0;
import vp.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends com.server.auditor.ssh.client.fragments.editors.base.c implements VaultSelectorView.a, b1, com.server.auditor.ssh.client.widget.k, b.a, b.a, mq.h {
    private SparseArray C = new SparseArray();
    private final com.server.auditor.ssh.client.app.a D = com.server.auditor.ssh.client.app.a.N();
    private final com.server.auditor.ssh.client.utils.analytics.a E;
    private final HostsDBAdapter F;
    private final GroupDBAdapter G;
    private a1 H;
    private com.server.auditor.ssh.client.widget.i I;
    private com.server.auditor.ssh.client.widget.i J;
    private final dl.b K;
    private final ut.n L;
    private final zp.s M;
    private final g.b N;
    private final g.b O;
    private final k0 P;
    private final j0 Q;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24800a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24802c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(d0 d0Var, qq.a aVar) {
            d0Var.qg(aVar.f());
            d0Var.mi(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new a(this.f24802c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24800a;
            if (i10 == 0) {
                ut.x.b(obj);
                final d0 d0Var = d0.this;
                final qq.a aVar = this.f24802c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.c0
                    @Override // iu.a
                    public final Object a() {
                        return d0.a.k(d0Var, aVar);
                    }
                };
                this.f24800a = 1;
                if (d0Var.ni(aVar2, this) == objF) {
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
        int f24803a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24805c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(d0 d0Var, qq.a aVar) {
            d0Var.qg(aVar.f());
            d0Var.mi(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new b(this.f24805c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24803a;
            if (i10 == 0) {
                ut.x.b(obj);
                final d0 d0Var = d0.this;
                final qq.a aVar = this.f24805c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.e0
                    @Override // iu.a
                    public final Object a() {
                        return d0.b.k(d0Var, aVar);
                    }
                };
                this.f24803a = 1;
                if (d0Var.ni(aVar2, this) == objF) {
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

    public static final class c implements mq.j {
        c() {
        }

        @Override // mq.j
        public void a() {
            d0.this.Yh();
        }

        @Override // mq.j
        public void b(List list) {
            ju.t.f(list, Table.TAG);
            d0.this.Ii(list);
        }

        @Override // mq.j
        public void c(List list) {
            ju.t.f(list, Table.TAG);
            d0.this.M.c(list);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24807a;

        d(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return d0.this.new d(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((d) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24807a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(d0.this.Nf().getInitialEditorDataHashCode() != d0.this.ih());
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24809a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24811a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f24812b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.d0$e$a$a, reason: collision with other inner class name */
            static final class C0399a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ d0 f24813a;

                C0399a(d0 d0Var) {
                    this.f24813a = d0Var;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(BaseEditorFragmentViewModel.b bVar, zt.e eVar) {
                    Identity identity;
                    Identity identity2;
                    if (ju.t.b(bVar, BaseEditorFragmentViewModel.b.d.f24733a)) {
                        this.f24813a.kg();
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.f) {
                        this.f24813a.hg(((BaseEditorFragmentViewModel.b.f) bVar).a());
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.j) {
                        this.f24813a.Ii(((BaseEditorFragmentViewModel.b.j) bVar).a());
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.a) {
                        BaseEditorFragmentViewModel.b.a aVar = (BaseEditorFragmentViewModel.b.a) bVar;
                        if (aVar.a() == -1) {
                            this.f24813a.Xg(aVar.b(), aVar.c());
                        } else {
                            this.f24813a.Ei(aVar.b(), aVar.c(), aVar.a());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.h) {
                        SshProperties sshProperties = this.f24813a.Df().f24938e;
                        if (sshProperties != null) {
                            sshProperties.setIdentity(hg.f.p().n().getApplicationModel(((BaseEditorFragmentViewModel.b.h) bVar).a()));
                        }
                        jh.x xVarFf = this.f24813a.Ff();
                        if (xVarFf != null) {
                            xVarFf.ed(((BaseEditorFragmentViewModel.b.h) bVar).a());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.k) {
                        TelnetProperties telnetProperties = this.f24813a.Df().f24939f;
                        if (telnetProperties != null) {
                            telnetProperties.setIdentity(hg.f.p().n().getApplicationModel(((BaseEditorFragmentViewModel.b.k) bVar).a()));
                        }
                        l0 l0VarGf = this.f24813a.Gf();
                        if (l0VarGf != null) {
                            l0VarGf.Z9(((BaseEditorFragmentViewModel.b.k) bVar).a());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.i) {
                        SshProperties sshProperties2 = this.f24813a.Df().f24938e;
                        if (sshProperties2 != null) {
                            sshProperties2.setSshKey(hg.f.p().W().getItemByLocalId(((BaseEditorFragmentViewModel.b.i) bVar).a()));
                        }
                        jh.x xVarFf2 = this.f24813a.Ff();
                        if (xVarFf2 != null) {
                            xVarFf2.Ee(((BaseEditorFragmentViewModel.b.i) bVar).a());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.m) {
                        SshProperties sshProperties3 = this.f24813a.Df().f24938e;
                        if (sshProperties3 != null && (identity2 = sshProperties3.getIdentity()) != null) {
                            identity2.setSshIdMode(HostContentKt.BACKSPACE_TYPE_DEFAULT);
                        }
                        jh.x xVarFf3 = this.f24813a.Ff();
                        if (xVarFf3 != null) {
                            jh.x.Dd(xVarFf3, null, 1, null);
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.n) {
                        SshProperties sshProperties4 = this.f24813a.Df().f24938e;
                        if (sshProperties4 != null && (identity = sshProperties4.getIdentity()) != null) {
                            identity.setSshIdMode(null);
                        }
                        jh.x xVarFf4 = this.f24813a.Ff();
                        if (xVarFf4 != null) {
                            xVarFf4.Wd();
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.o) {
                        jh.x xVarFf5 = this.f24813a.Ff();
                        if (xVarFf5 != null) {
                            BaseEditorFragmentViewModel.b.o oVar = (BaseEditorFragmentViewModel.b.o) bVar;
                            xVarFf5.le(oVar.a().getPasskeyType(), oVar.a().getUsername(), oVar.a().getPassword());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.g) {
                        SshProperties sshProperties5 = this.f24813a.Df().f24938e;
                        if (sshProperties5 != null) {
                            sshProperties5.setStartupSnippet(new SnippetItem(hg.f.p().J().getItemByLocalId(((BaseEditorFragmentViewModel.b.g) bVar).a())));
                        }
                        jh.x xVarFf6 = this.f24813a.Ff();
                        if (xVarFf6 != null) {
                            xVarFf6.rd();
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.l) {
                        this.f24813a.di(((BaseEditorFragmentViewModel.b.l) bVar).a());
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.p) {
                        jh.x xVarFf7 = this.f24813a.Ff();
                        if (xVarFf7 != null) {
                            xVarFf7.hd(((BaseEditorFragmentViewModel.b.p) bVar).a());
                        }
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.e) {
                        this.f24813a.vg(((BaseEditorFragmentViewModel.b.e) bVar).a());
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.c) {
                        BaseEditorFragmentViewModel.b.c cVar = (BaseEditorFragmentViewModel.b.c) bVar;
                        if (cVar.b() == SelectPurpose.SSH) {
                            jh.x xVarFf8 = this.f24813a.Ff();
                            if (xVarFf8 != null) {
                                xVarFf8.cd(cVar.a());
                            }
                        } else {
                            l0 l0VarGf2 = this.f24813a.Gf();
                            if (l0VarGf2 != null) {
                                l0VarGf2.O9(cVar.a());
                            }
                        }
                    } else {
                        if (!(bVar instanceof BaseEditorFragmentViewModel.b.C0396b)) {
                            throw new ut.s();
                        }
                        BaseEditorFragmentViewModel.b.C0396b c0396b = (BaseEditorFragmentViewModel.b.C0396b) bVar;
                        if (c0396b.b() == SelectPurpose.SSH) {
                            jh.x xVarFf9 = this.f24813a.Ff();
                            if (xVarFf9 != null) {
                                xVarFf9.bd(c0396b.a());
                            }
                        } else {
                            l0 l0VarGf3 = this.f24813a.Gf();
                            if (l0VarGf3 != null) {
                                l0VarGf3.E9(c0396b.a());
                            }
                        }
                    }
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, zt.e eVar) {
                super(2, eVar);
                this.f24812b = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24812b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24811a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.a0 composeActions = this.f24812b.Nf().getComposeActions();
                    C0399a c0399a = new C0399a(this.f24812b);
                    this.f24811a = 1;
                    if (composeActions.collect(c0399a, this) == objF) {
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

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24809a;
            if (i10 == 0) {
                ut.x.b(obj);
                d0 d0Var = d0.this;
                q.b bVar = q.b.f8799d;
                a aVar = new a(d0Var, null);
                this.f24809a = 1;
                if (r0.b(d0Var, bVar, aVar, this) == objF) {
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

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24814a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24816c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(d0 d0Var, qq.a aVar) {
            d0Var.Df().f24945l = aVar.d();
            d0Var.mi(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new f(this.f24816c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24814a;
            if (i10 == 0) {
                ut.x.b(obj);
                final d0 d0Var = d0.this;
                final qq.a aVar = this.f24816c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.f0
                    @Override // iu.a
                    public final Object a() {
                        return d0.f.k(d0Var, aVar);
                    }
                };
                this.f24814a = 1;
                if (d0Var.ni(aVar2, this) == objF) {
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24817a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(d0 d0Var) {
            d0Var.fh();
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24817a;
            if (i10 == 0) {
                ut.x.b(obj);
                final d0 d0Var = d0.this;
                iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.g0
                    @Override // iu.a
                    public final Object a() {
                        return d0.g.k(d0Var);
                    }
                };
                this.f24817a = 1;
                if (d0Var.ni(aVar, this) == objF) {
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
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24819a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f24821c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(d0 d0Var, String str) {
            d0Var.Vh(str);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return d0.this.new h(this.f24821c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24819a;
            if (i10 == 0) {
                ut.x.b(obj);
                final d0 d0Var = d0.this;
                final String str = this.f24821c;
                iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.h0
                    @Override // iu.a
                    public final Object a() {
                        return d0.h.k(d0Var, str);
                    }
                };
                this.f24819a = 1;
                if (d0Var.ni(aVar, this) == objF) {
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
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f24822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24824c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24826e;

        i(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24824c = obj;
            this.f24826e |= RtlSpacingHelper.UNDEFINED;
            return d0.this.oi(null, null, null, null, this);
        }
    }

    public d0() {
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        this.E = aVarY;
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        ju.t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        this.F = hostsDBAdapterI;
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        ju.t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        this.G = groupDBAdapterH;
        this.K = new dl.b();
        this.L = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.u
            @Override // iu.a
            public final Object a() {
                return d0.Sh(this.f24949a);
            }
        });
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        ju.t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        TagApiAdapter tagApiAdapterZ = hg.f.p().Z();
        ju.t.e(tagApiAdapterZ, "getTagApiAdapter(...)");
        TagHostDBAdapter tagHostDBAdapterC0 = hg.f.p().c0();
        ju.t.e(tagHostDBAdapterC0, "getTagHostDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB0 = hg.f.p().b0();
        ju.t.e(tagHostApiAdapterB0, "getTagHostApiAdapter(...)");
        this.M = new zp.s(tagDBAdapterA0, tagApiAdapterZ, tagHostDBAdapterC0, tagHostApiAdapterB0);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.v
            @Override // g.a
            public final void a(Object obj) {
                d0.hh(this.f24950a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.N = bVarRegisterForActivityResult;
        g.b bVarRegisterForActivityResult2 = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.w
            @Override // g.a
            public final void a(Object obj) {
                d0.yi(this.f24951a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.O = bVarRegisterForActivityResult2;
        this.P = new k0();
        TagHostDBAdapter tagHostDBAdapterC02 = hg.f.p().c0();
        ju.t.e(tagHostDBAdapterC02, "getTagHostDBAdapter(...)");
        TagDBAdapter tagDBAdapterA02 = hg.f.p().a0();
        ju.t.e(tagDBAdapterA02, "getTagDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB02 = hg.f.p().b0();
        ju.t.e(tagHostApiAdapterB02, "getTagHostApiAdapter(...)");
        TagApiAdapter tagApiAdapterZ2 = hg.f.p().Z();
        ju.t.e(tagApiAdapterZ2, "getTagApiAdapter(...)");
        this.Q = new j0(tagHostDBAdapterC02, tagDBAdapterA02, tagHostApiAdapterB02, tagApiAdapterZ2);
    }

    private final void Ah(long j10, Host host, iu.a aVar) {
        Host hostS;
        ti(host);
        host.setId(j10);
        qi(host);
        yg(false);
        try {
            if (Nf().getStartConnectionOnSave() && (hostS = hg.f.p().j().s(Long.valueOf(j10))) != null) {
                TerminalConnectionManager.enqueueStartTerminalSession(hostS);
            }
            aVar.a();
        } catch (Exception unused) {
        }
    }

    private final void Ai(boolean z10) {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.sf(true, z10);
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.Fa(true, z10);
        }
    }

    private final void Bh(qq.a aVar) {
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Cf())) {
            ic(aVar);
        } else {
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new a(aVar, null), 3, null);
        }
    }

    private final void Bi(String str) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            new be.b(context).setTitle(R.string.saving_error_title).setMessage(R.string.saving_error_unknown_contact_us).setPositiveButton(android.R.string.ok, null).show();
        } else {
            new be.b(context).setTitle(R.string.saving_error_title).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    private final void Ch(qq.a aVar) {
        qg(aVar.f());
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f());
        a1 a1Var = this.H;
        if (a1Var != null) {
            a1Var.dismiss();
        }
        ki();
        zf().I.C(Lf());
        bh();
    }

    private final void Ci(String str) {
        if (com.server.auditor.ssh.client.app.a.N().u0()) {
            lq.j jVar = su.s.m0(str) ? j.b.f64556a : j.c.f64557a;
            jh.x xVarFf = Ff();
            if (xVarFf != null) {
                xVarFf.uf(str);
            }
            jh.x xVarFf2 = Ff();
            if (xVarFf2 != null) {
                xVarFf2.qf(jVar);
            }
        }
    }

    private final void Dh(qq.a aVar) {
        if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f())) {
            Bh(aVar);
        } else {
            ri("no_credentials_sharing");
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new b(aVar, null), 3, null);
        }
    }

    private final void Di() {
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
            Eh();
            return;
        }
        Ai(Oh());
        String str = Df().f24945l;
        if (str == null) {
            str = "no_credentials_sharing";
        }
        ri(str);
    }

    private final void Eh() {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.sf(false, false);
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.Fa(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ei(String str, String str2, int i10) {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.tf(str, str2, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Fh(d0 d0Var, String str) {
        ju.t.f(str, "hostName");
        d0Var.requireActivity().invalidateOptionsMenu();
        if (!su.s.m0(str)) {
            d0Var.zf().f73259k.c(null);
        }
        d0Var.Ci(str);
        return m0.f82633a;
    }

    private final void Fi(final dq.t tVar) {
        final Long lKh = kh();
        final Long lLh = lh();
        if (lKh != null) {
            tVar.a().forEach(new Consumer() { // from class: com.server.auditor.ssh.client.fragments.editors.base.x
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    d0.Gi(lKh, this, tVar, (dq.n) obj);
                }
            });
        }
        if (lLh != null) {
            tVar.a().forEach(new Consumer() { // from class: com.server.auditor.ssh.client.fragments.editors.base.y
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    d0.Hi(lLh, this, (dq.n) obj);
                }
            });
        }
    }

    private final void G8() {
        com.server.auditor.ssh.client.widget.i iVar = this.I;
        if (iVar != null) {
            iVar.dismiss();
        }
        this.I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gh(d0 d0Var, String str) {
        ju.t.f(str, "alias");
        if (!su.s.m0(d0Var.zf().f73259k.getHostname())) {
            if (su.s.m0(str)) {
                jh.x xVarFf = d0Var.Ff();
                if (xVarFf != null) {
                    xVarFf.uf(d0Var.zf().f73259k.getHostname());
                }
            } else {
                jh.x xVarFf2 = d0Var.Ff();
                if (xVarFf2 != null) {
                    xVarFf2.uf(str);
                }
            }
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gi(Long l10, d0 d0Var, dq.t tVar, dq.n nVar) {
        SshKeyDBModel itemByLocalId;
        ju.t.f(nVar, "identitiesInfo");
        long jA = nVar.a();
        if (l10 != null && jA == l10.longValue()) {
            d0Var.Df().f24938e.getIdentity().setId(Long.valueOf(nVar.b()));
            if (tVar.b() == null || (itemByLocalId = hg.f.p().W().getItemByLocalId(tVar.b().longValue())) == null) {
                return;
            }
            d0Var.Df().f24938e.getIdentity().setSshKey(itemByLocalId);
        }
    }

    private final void Hh() {
        zf().A.setTagsActionsListener(new c());
        TagsEditorLayout tagsEditorLayout = zf().A;
        List list = Df().f24942i;
        ju.t.e(list, "mChosenTags");
        tagsEditorLayout.f(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hi(Long l10, d0 d0Var, dq.n nVar) {
        ju.t.f(nVar, "identitiesInfo");
        long jA = nVar.a();
        if (l10 != null && jA == l10.longValue()) {
            d0Var.Df().f24939f.getIdentity().setId(Long.valueOf(nVar.b()));
        }
    }

    private final void I() {
        a1 a1Var = this.H;
        if (a1Var != null) {
            a1Var.dismiss();
        }
        this.H = null;
    }

    private final void Ih() {
        j0.a aVar = dq.j0.f47941a;
        VaultSelectorView vaultSelectorView = zf().I;
        ju.t.e(vaultSelectorView, "vaultSelector");
        aVar.d(vaultSelectorView, Lf(), true, this);
        Di();
    }

    private final boolean Jh() {
        return !su.s.m0(ph());
    }

    private final void Ji(VaultKeyId vaultKeyId) {
        Host hostQh = qh();
        if (hostQh != null) {
            hostQh.setVaultKeyId(vaultKeyId);
        }
    }

    private final boolean Kh() {
        Host hostQh = qh();
        if (hostQh != null) {
            return dq.f.f47917a.a(hostQh.getCredentialsMode());
        }
        return false;
    }

    private final boolean Lh(SshProperties sshProperties) {
        GroupDBModel groupDBModelIf;
        SnippetItem startupSnippet;
        return (sshProperties == null || (groupDBModelIf = If()) == null || (startupSnippet = sshProperties.getStartupSnippet()) == null || startupSnippet.getPackageId() == null || !groupDBModelIf.isShared() || startupSnippet.isShared()) ? false : true;
    }

    private final boolean Mh() {
        return (qh() != null) && (vh() != nh());
    }

    private final boolean Nh() {
        return Df().f24934a == -1;
    }

    private final boolean Oh() {
        return Nf().isSavingToVaultPermitted();
    }

    private final boolean Qh(qq.a aVar) {
        return ju.t.b(Lf(), aVar.f());
    }

    private final void Rh(SshProperties sshProperties) {
        SnippetItem startupSnippet;
        if (sshProperties == null || (startupSnippet = sshProperties.getStartupSnippet()) == null) {
            return;
        }
        startupSnippet.clearPackage();
        SnippetDBModel itemByLocalId = hg.f.p().J().getItemByLocalId(startupSnippet.getId());
        itemByLocalId.setPackageId(null);
        hg.f.p().I().putItem(itemByLocalId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq.b Sh(d0 d0Var) {
        hg.d dVarM = d0Var.D.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new wn.j(dVarM));
    }

    private final void Th(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showOrdinaryConflictsScreen");
        Bundle bundle = new OrdinaryConflictsScreenArgs.a("editor_screen", xh(), -1L, vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        intent.putExtras(bundle);
        this.N.a(intent);
    }

    private final void Uh(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showPFConflictsScreen");
        Bundle bundle = new PortForwardingConflictArgs.a("editor_screen", xh(), -1L, "No conflicts", vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        intent.putExtras(bundle);
        this.N.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Vh(String str) {
        Host hostQh = qh();
        if (hostQh != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TypedEntityIdentifier(hostQh.getId(), HostDBModel.class));
            this.E.L4(Avo.OpenedFrom.EDIT_HOST, str);
            NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
            g.b bVar = this.O;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.c(bVar, fragmentActivityRequireActivity, new NavigationPopUpWhenLargeActivity.NavigationDestination.SetupTeamVaultFlow(new NavigationPopUpWhenLargeActivity.SetupTeamVaultFlowStartDestination.Onboarding(arrayList, str)));
        }
    }

    private final void Wh() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            xl.a.a(activity, activity.getCurrentFocus());
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xg(String str, String str2) {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.v7(str, str2);
        }
    }

    private final void Xh(ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1000) {
            fh();
        }
    }

    private final void Yg(VaultKeyId vaultKeyId) {
        if (Nh() && tp.a1.f80840a.f()) {
            if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId)) {
                qg(vaultKeyId);
                Df().f24944k = true;
                return;
            }
            if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
                qg(dq.b0.f47897a.h());
            }
            if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
                return;
            }
            Ag();
            Df().f24944k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yh() {
        BaseEditorFragmentViewModel baseEditorFragmentViewModelNf = Nf();
        List list = Df().f24942i;
        ju.t.e(list, "mChosenTags");
        ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((TagDBModel) it.next()).getIdInDatabase()));
        }
        baseEditorFragmentViewModelNf.sendFragmentAction(new BaseEditorFragmentViewModel.c.l(arrayList, Lf()));
    }

    private final void Zh() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.E.J0(new wp.a(Avo.ChangeVaultAction.MOVE, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.HOST, string, Avo.ChangeToVault.NOT_MINUSPERSONAL, Avo.CurrentVault.PERSONAL));
        this.E.T4();
        if (Ph()) {
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new h(string, null), 3, null);
        }
    }

    private final void ah(SshProperties sshProperties) {
        if (Lh(sshProperties)) {
            Rh(sshProperties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ai(d0 d0Var) {
        d0Var.zf().f73251c.requestFocus();
    }

    private final void bh() {
        tf(null);
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.C7();
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.R5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bi(d0 d0Var) {
        d0Var.zf().f73251c.clearFocus();
    }

    private final void ch(String str, String str2) {
        if (ag(str, str2)) {
            dh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ci(qq.a aVar, d0 d0Var, qq.a aVar2) {
        ju.t.f(aVar2, "flowData");
        boolean z10 = com.server.auditor.ssh.client.app.a.N().M().getBoolean("authorized_feature_show_multikey_promotion", true);
        if (ju.t.b(aVar.d(), "multikey") && z10) {
            d0Var.p9();
            return;
        }
        if (d0Var.Nh()) {
            d0Var.zf().I.C(d0Var.Lf());
            d0Var.Df().f24944k = true ^ com.server.auditor.ssh.client.ui.vaults.data.a.b(d0Var.Lf());
            d0Var.Di();
            String str = d0Var.Df().f24945l;
            ju.t.e(str, "credentialsMode");
            d0Var.ch(str, aVar.d());
        } else {
            String str2 = d0Var.Df().f24945l;
            ju.t.e(str2, "credentialsMode");
            d0Var.ch(str2, aVar.d());
        }
        d0Var.ri(aVar2.d());
        com.server.auditor.ssh.client.widget.i iVar = d0Var.J;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    private final void dh() {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.Y7();
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.U5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void di(NsdSearchResult nsdSearchResult) {
        String address = nsdSearchResult.getAddress();
        if (address == null) {
            address = "";
        }
        si(address);
        String alias = nsdSearchResult.getAlias();
        lg(alias != null ? alias : "");
        String type = nsdSearchResult.getType();
        if (ju.t.b(type, "ssh")) {
            if (Df().f24938e == null) {
                Df().f24938e = new SshProperties();
            }
            Df().f24938e.setPort(nsdSearchResult.getPort());
            jh.x xVarFf = Ff();
            if (xVarFf != null) {
                SshProperties sshProperties = Df().f24938e;
                ju.t.e(sshProperties, "mSshProperties");
                xVarFf.kf(sshProperties);
                xVarFf.B1();
                xVarFf.k4(true);
            }
            wf();
            return;
        }
        if (ju.t.b(type, "telnet")) {
            if (Df().f24939f == null) {
                Df().f24939f = new TelnetProperties();
            }
            Df().f24939f.setPort(nsdSearchResult.getPort());
            l0 l0VarGf = Gf();
            if (l0VarGf != null) {
                TelnetProperties telnetProperties = Df().f24939f;
                ju.t.e(telnetProperties, "mTelnetProperties");
                l0VarGf.oa(telnetProperties);
                l0VarGf.B1();
                l0VarGf.k4(true);
            }
            xf();
        }
    }

    private final void eh() {
        com.server.auditor.ssh.client.widget.i iVar = this.I;
        if (iVar != null) {
            iVar.Z2();
        }
        this.I = null;
    }

    private final void ei(ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            Ag();
            Ji(Lf());
            Di();
            Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
            ng(Lf());
            zf().I.C(Lf());
            li();
            wi(nh());
            hg.f.p().Y().startFullSync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fh() {
        if (Zf()) {
            Nf().sendFragmentAction(BaseEditorFragmentViewModel.c.a.f24746a);
        } else {
            if (Vf()) {
                requireActivity().onBackPressed();
                return;
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.g1();
        }
    }

    private final void fi(String str, boolean z10) {
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        xi(string);
        com.server.auditor.ssh.client.utils.analytics.a.y().J0(new wp.a(changeVaultActionC, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.HOST, xh(), c1341a.b(z10), c1341a.a(Cf())));
    }

    private final int gh() {
        TelnetProperties telnetPropertiesN7;
        SshProperties sshPropertiesU8;
        GroupDBModel groupDBModelIf = If();
        String title = groupDBModelIf != null ? groupDBModelIf.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String strValueOf = String.valueOf(yf());
        jh.x xVarFf = Ff();
        int iHashCode = 0;
        int iHashCode2 = (xVarFf == null || (sshPropertiesU8 = xVarFf.U8()) == null) ? 0 : sshPropertiesU8.hashCode();
        l0 l0VarGf = Gf();
        if (l0VarGf != null && (telnetPropertiesN7 = l0VarGf.n7()) != null) {
            iHashCode = telnetPropertiesN7.hashCode();
        }
        return Arrays.hashCode(new String[]{jh(), ph(), title, strValueOf}) + iHashCode2 + iHashCode + oh();
    }

    private final void gi(String str) {
        Avo.ChangeVaultAction changeVaultActionC = vp.a.f83866a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().K0(new wp.b(changeVaultActionC, xh(), Avo.Entity.HOST, Avo.ChangeVaultSource.EDIT_FORM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hh(d0 d0Var, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        d0Var.ei(activityResult);
    }

    private final void hi(String str) {
        com.server.auditor.ssh.client.utils.analytics.a.y().r1(vp.a.f83866a.e(str), xh());
    }

    private final void ic(qq.a aVar) {
        I();
        ii();
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(this, qq.a.b(aVar, null, false, null, false, true, false, null, null, 239, null), true);
        this.I = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ih() {
        TelnetProperties telnetPropertiesN7;
        SshProperties sshPropertiesU8;
        GroupDBModel groupDBModelIf = If();
        String title = groupDBModelIf != null ? groupDBModelIf.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String strValueOf = String.valueOf(yf());
        jh.x xVarFf = Ff();
        int iHashCode = 0;
        int iHashCode2 = (xVarFf == null || (sshPropertiesU8 = xVarFf.U8()) == null) ? 0 : sshPropertiesU8.hashCode();
        l0 l0VarGf = Gf();
        if (l0VarGf != null && (telnetPropertiesN7 = l0VarGf.n7()) != null) {
            iHashCode = telnetPropertiesN7.hashCode();
        }
        return Arrays.hashCode(new String[]{jh(), ph(), title, strValueOf}) + iHashCode2 + iHashCode;
    }

    private final void ii() {
        com.server.auditor.ssh.client.utils.analytics.a.y().s1(xh());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.server.auditor.ssh.client.models.Host ji() {
        /*
            r11 = this;
            jh.x r0 = r11.Ff()
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = r0.J3()
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L17
            com.server.auditor.ssh.client.models.properties.SshProperties r0 = r0.V8()
            r5 = r0
            goto L18
        L17:
            r5 = r1
        L18:
            jh.l0 r0 = r11.Gf()
            if (r0 == 0) goto L2e
            boolean r2 = r0.J3()
            if (r2 == 0) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L2e
            com.server.auditor.ssh.client.models.properties.TelnetProperties r0 = r0.t7()
            r6 = r0
            goto L2f
        L2e:
            r6 = r1
        L2f:
            com.server.auditor.ssh.client.database.models.GroupDBModel r8 = r11.If()
            boolean r0 = r11.yf()
            com.server.auditor.ssh.client.fragments.editors.base.r r2 = r11.Df()
            boolean r2 = r2.f24944k
            if (r2 == 0) goto L53
            com.server.auditor.ssh.client.fragments.editors.base.r r1 = r11.Df()
            java.lang.String r1 = r1.f24945l
            if (r8 != 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            r11.pi(r1, r2)
            com.server.auditor.ssh.client.fragments.editors.base.r r1 = r11.Df()
            java.lang.String r1 = r1.f24945l
        L53:
            r10 = r1
            com.server.auditor.ssh.client.models.Host r2 = new com.server.auditor.ssh.client.models.Host
            java.lang.String r3 = r11.ph()
            java.lang.String r4 = r11.jh()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r11.Df()
            long r0 = r0.f24934a
            r2.setId(r0)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r11.Df()
            boolean r0 = r0.f24944k
            r2.setShared(r0)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r11.Df()
            boolean r0 = r0.f24944k
            if (r0 == 0) goto L87
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r0 = r11.Lf()
            r2.setVaultKeyId(r0)
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.d0.ji():com.server.auditor.ssh.client.models.Host");
    }

    private final Long kh() {
        Identity identity;
        SshProperties sshProperties = Df().f24938e;
        if (sshProperties == null || (identity = sshProperties.getIdentity()) == null) {
            return null;
        }
        return Long.valueOf(identity.getId());
    }

    private final void ki() {
        ri("no_credentials_sharing");
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
            Eh();
        } else {
            Ai(Oh());
        }
    }

    private final Long lh() {
        Identity identity;
        TelnetProperties telnetProperties = Df().f24939f;
        if (telnetProperties == null || (identity = telnetProperties.getIdentity()) == null) {
            return null;
        }
        return Long.valueOf(identity.getId());
    }

    private final void li() {
        GroupDBModel groupDBModel = Df().f24941h;
        if (groupDBModel == null) {
            tf(null);
        } else {
            if (ju.t.b(groupDBModel.getVaultKeyId(), Lf())) {
                return;
            }
            tf(null);
        }
    }

    private final GroupDBModel mh(Connection connection) {
        Long groupId;
        Long hostId = connection.getHostId();
        if (hostId != null) {
            HostDBModel itemByLocalId = this.F.getItemByLocalId(hostId.longValue());
            if (itemByLocalId != null && (groupId = itemByLocalId.getGroupId()) != null) {
                return this.G.getItemByLocalId(groupId.longValue());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mi(qq.a aVar) {
        HostDBModel hostDBModelSh = sh(Df().f24934a);
        if (hostDBModelSh == null) {
            return;
        }
        th().j(vt.v.e(hostDBModelSh), aVar.f(), aVar.d(), "editor_screen", this);
    }

    private final int nh() {
        if (qh() != null) {
            return gh() + Bf();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ni(iu.a aVar, zt.e eVar) {
        if (!Ph()) {
            return m0.f82633a;
        }
        yg(true);
        Host hostJi = ji();
        List<TagDBModel> tagsList = zf().A.getTagsList();
        ChainingHost chainingHost = Df().f24943j;
        ju.t.e(chainingHost, "mChainingHost");
        Object objOi = oi(hostJi, chainingHost, tagsList, aVar, eVar);
        return objOi == au.b.f() ? objOi : m0.f82633a;
    }

    private final int oh() {
        Iterator<T> it = zf().A.getTagsList().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((TagDBModel) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object oi(com.server.auditor.ssh.client.models.Host r9, com.server.auditor.ssh.client.models.ChainingHost r10, java.util.List r11, iu.a r12, zt.e r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.d0.oi(com.server.auditor.ssh.client.models.Host, com.server.auditor.ssh.client.models.ChainingHost, java.util.List, iu.a, zt.e):java.lang.Object");
    }

    private final void pi(String str, boolean z10) {
        Host hostQh = qh();
        String credentialsMode = hostQh != null ? hostQh.getCredentialsMode() : null;
        if (str == null || ju.t.b(str, credentialsMode)) {
            return;
        }
        com.server.auditor.ssh.client.utils.analytics.a.y().q1(str, false, z10);
    }

    private final Host qh() {
        return Nf().getMEditedHost();
    }

    private final void qi(Connection connection) {
        if (connection instanceof Host) {
            Host host = (Host) connection;
            Df().f24934a = host.getId();
            Df().f24945l = host.getCredentialsMode();
            Df().f24944k = host.isShared();
        }
        Df().f24935b = connection.getAlias();
        Df().f24936c = connection.getHost();
        Df().f24942i = this.Q.d(connection.getId());
        Df().f24941h = mh(connection);
        Df().f24938e = connection.getSshProperties();
        Df().f24939f = connection.getTelnetProperties();
        Df().f24937d = connection.getBackspaceType();
        ChainingHost chainHostAppModelByConfigId = hg.f.p().c().getChainHostAppModelByConfigId(connection.getSafeSshProperties().getDbId());
        r rVarDf = Df();
        if (chainHostAppModelByConfigId == null) {
            chainHostAppModelByConfigId = new ChainingHost();
        }
        rVarDf.f24943j = chainHostAppModelByConfigId;
    }

    private final boolean rh() {
        return Nf().getMIsFirstOpenOfScreen();
    }

    private final HostDBModel sh(long j10) {
        return hg.f.p().i().getItemByLocalId(j10);
    }

    private final iq.b th() {
        return (iq.b) this.L.getValue();
    }

    private final void ti(Host host) {
        Nf().setMEditedHost(host);
    }

    private final String uh(qq.a aVar) {
        return Nh() ? "Create" : aVar.c();
    }

    private final void ui(boolean z10) {
        Nf().setMIsFirstOpenOfScreen(z10);
    }

    private final int vh() {
        return Nf().getStartModelHashCode();
    }

    private final void vi(boolean z10) {
        Nf().setSavingToVaultPermitted(z10);
    }

    private final String wh() {
        return Nf().getUniqueId();
    }

    private final void wi(int i10) {
        if (Nf().getStartModelHashCode() == 0) {
            Nf().setStartModelHashCode(i10);
        }
    }

    private final String xh() {
        return Nf().getVaultWizardId();
    }

    private final void xi(String str) {
        Nf().setVaultWizardId(str);
    }

    private final void yh(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        b0.a aVar = eq.b0.f48942a;
        ConflictsArgData[] conflictsArgDataArrA = aVar.a(iVar);
        boolean zB = this.P.b(conflictsArgDataArrA);
        SourceEntitiesArgData[] sourceEntitiesArgDataArrB = aVar.b(list);
        if (zB) {
            Uh(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB);
        } else {
            Th(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yi(d0 d0Var, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        d0Var.Xh(activityResult);
    }

    private final void zh(Throwable th2) {
        yg(false);
        if (th2 instanceof IllegalStateException) {
            Bi(th2.getMessage());
        } else {
            Bi(getString(R.string.error_saving_host_was_deleted));
        }
    }

    private final void zi() {
        new be.b(requireContext()).setMessage(R.string.alert_edit_only_owner).setPositiveButton(android.R.string.ok, null).show();
    }

    public final void Ii(List list) {
        ju.t.f(list, "list");
        Df().f24942i.clear();
        Df().f24942i.addAll(list);
        zf().A.f(list);
        zf().A.h();
    }

    @Override // iq.b.a
    public void J3(dq.t tVar) {
        ju.t.f(tVar, "recreatedCredentialsInfo");
        Ag();
        ng(Lf());
        Ji(Lf());
        zf().I.C(Lf());
        Di();
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
        ng(Lf());
        li();
        Fi(tVar);
        hg.f.p().Y().startFullSync();
        a1 a1Var = this.H;
        if (a1Var != null) {
            a1Var.Z2();
        }
        gi("Move");
        wi(nh());
    }

    @Override // com.server.auditor.ssh.client.widget.k
    public void O8(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        qg(aVar.f());
        hi(aVar.d());
        boolean z10 = com.server.auditor.ssh.client.app.a.N().M().getBoolean("authorized_feature_show_multikey_promotion", true);
        if (ju.t.b(aVar.d(), "multikey") && z10) {
            p9();
            return;
        }
        ri(aVar.d());
        if (!Nh()) {
            eh();
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new f(aVar, null), 3, null);
            return;
        }
        zf().I.C(Lf());
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
        Di();
        bh();
        G8();
        gi("Create");
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected boolean Of() {
        return zf().f73259k.getHostname().length() == 0;
    }

    protected final boolean Ph() {
        jh.x xVarFf = Ff();
        boolean z10 = xVarFf != null && xVarFf.N3();
        l0 l0VarGf = Gf();
        boolean z11 = l0VarGf != null && l0VarGf.N3();
        boolean zJh = Jh();
        if (!zJh) {
            zf().f73259k.c(getResources().getString(R.string.required_field));
        }
        return zJh && z10 && z11;
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected void Qf() {
        zf().f73259k.setOnHostnameChangedListener(new iu.l() { // from class: com.server.auditor.ssh.client.fragments.editors.base.z
            @Override // iu.l
            public final Object invoke(Object obj) {
                return d0.Fh(this.f24957a, (String) obj);
            }
        });
        zf().f73251c.setOnAliasChangedListener(new iu.l() { // from class: com.server.auditor.ssh.client.fragments.editors.base.a0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return d0.Gh(this.f24780a, (String) obj);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView.a
    public void S6() {
        qq.b bVarD = eq.b0.f48942a.d(com.server.auditor.ssh.client.ui.vaults.data.a.e(Lf()), "Move");
        String str = Df().f24945l;
        if (str == null) {
            str = "no_credentials_sharing";
        }
        a1 a1Var = new a1(qq.b.b(bVarD, null, true, null, false, false, Mh(), Lf(), str, 29, null), false, this);
        this.H = a1Var;
        a1Var.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void U5() {
    }

    @Override // com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView.a
    public void We() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.getCurrentFocus() == null) {
            return;
        }
        xl.a.a(activity, activity.getCurrentFocus());
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected boolean Xf() {
        return false;
    }

    protected final void Zg() {
        this.K.c(Lf(), this, Kh());
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void bb() {
        Zh();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected void c() {
        zf().f73259k.setNsdActionsListener(this);
        Hh();
    }

    @Override // mq.h
    public void cd() {
        Nf().sendFragmentAction(BaseEditorFragmentViewModel.c.g.f24762a);
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void ig(boolean z10, final qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(new com.server.auditor.ssh.client.widget.k() { // from class: com.server.auditor.ssh.client.fragments.editors.base.b0
            @Override // com.server.auditor.ssh.client.widget.k
            public final void O8(qq.a aVar2) {
                d0.ci(aVar, this, aVar2);
            }
        }, aVar, z10);
        this.J = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "CredentialsKindBottomSheetDialog");
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void jg() {
        Ci(ph());
    }

    protected String jh() {
        return zf().f73251c.getAlias();
    }

    @Override // iq.b.a
    public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        ju.t.f(list, "sourceEntitiesToMove");
        ju.t.f(iVar, "conflictsEntities");
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        ju.t.f(str, "credentialsMode");
        I();
        yh(list, iVar, vaultKeyId, str);
    }

    @Override // dl.b.a
    public void ka() {
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new g(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected void kg() {
        Zg();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void lg(String str) {
        super.lg(str);
        zf().f73251c.setAlias(str);
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void na(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        if (Qh(aVar)) {
            a1 a1Var = this.H;
            if (a1Var != null) {
                a1Var.dismiss();
                return;
            }
            return;
        }
        fi(uh(aVar), com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f()));
        if (Nh()) {
            Ch(aVar);
        } else {
            Dh(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Handler handler;
        super.onActivityResult(i10, i11, intent);
        Runnable runnable = (Runnable) this.C.get(i10);
        this.C.remove(i10);
        if (i11 == -1) {
            View view = getView();
            if (runnable == null || view == null || (handler = view.getHandler()) == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        if (((Boolean) SessionManager.getInstance().terminalSessionHelper.isTabletLayout().getValue()).booleanValue()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            ((DirtyCheckViewModel) new l1(fragmentActivityRequireActivity).a(DirtyCheckViewModel.class)).registerDirtyCheck(wh(), new d(null));
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        VaultKeyId vaultKeyIdA;
        Host host;
        super.onCreate(bundle);
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new e(null), 3, null);
        if (qh() == null) {
            Bundle arguments = getArguments();
            Connection connection = arguments != null ? (Connection) j4.c.a(arguments, "connection_bundle", Connection.class) : null;
            if (connection != null) {
                qi(connection);
                if (connection instanceof Host) {
                    host = (Host) connection;
                } else {
                    SshProperties sshProperties = connection.getSshProperties();
                    SshProperties sshProperties2 = sshProperties != null ? new SshProperties(sshProperties) : null;
                    TelnetProperties telnetProperties = connection.getTelnetProperties();
                    TelnetProperties telnetProperties2 = telnetProperties != null ? new TelnetProperties(telnetProperties) : null;
                    LocalProperties localProperties = connection.getLocalProperties();
                    host = new Host(connection.getHost(), connection.getAlias(), sshProperties2, telnetProperties2, localProperties != null ? new LocalProperties(localProperties) : null, (GroupDBModel) null, connection.getOsModelType().name(), connection.getBackspaceType());
                }
                ti(host);
            }
            if (arguments == null || (vaultKeyIdA = (VaultKeyId) j4.c.a(arguments, "parent_group_vault_key_id", VaultKeyId.class)) == null) {
                vaultKeyIdA = VaultKeyId.Companion.a();
            }
            Yg(vaultKeyIdA);
        }
        tp.l0.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ((DirtyCheckViewModel) new l1(fragmentActivityRequireActivity).a(DirtyCheckViewModel.class)).unregisterDirtyCheck(wh());
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Df().f24935b = zf().f73251c.getAlias();
        Df().f24936c = zf().f73259k.getHostname();
        Wh();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.wf();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ju.t.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        GroupDBModel groupDBModel = Df().f24941h;
        if (groupDBModel != null) {
            bundle.putBoolean("hasParentGroupId", true);
            bundle.putLong("groupId", groupDBModel.getIdInDatabase());
        } else {
            bundle.putBoolean("hasParentGroupId", false);
        }
        Timber.f79558a.a("---host: " + Df().f24936c, new Object[0]);
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        lg(Df().f24935b);
        String str = Df().f24936c;
        if (str == null) {
            str = "";
        }
        si(str);
        hf(Df().f24937d);
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.mf(qh());
        }
        if (rh() && zf().f73251c.isEnabled()) {
            zf().f73251c.post(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.editors.base.s
                @Override // java.lang.Runnable
                public final void run() {
                    d0.ai(this.f24947a);
                }
            });
        } else {
            zf().f73251c.post(new Runnable() { // from class: com.server.auditor.ssh.client.fragments.editors.base.t
                @Override // java.lang.Runnable
                public final void run() {
                    d0.bi(this.f24948a);
                }
            });
        }
        ui(false);
        Host hostQh = qh();
        if (hostQh != null) {
            VaultKeyId vaultKeyId = hostQh.getVaultKeyId();
            ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
            ng(vaultKeyId);
            VaultKeyId vaultKeyId2 = hostQh.getVaultKeyId();
            ju.t.e(vaultKeyId2, "<get-vaultKeyId>(...)");
            qg(vaultKeyId2);
        } else {
            Ag();
            Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
            ng(Lf());
            String str2 = Df().f24945l;
            if (str2 != null) {
                ri(str2);
            } else {
                ri("no_credentials_sharing");
            }
        }
        Ih();
        wi(nh());
        this.K.a(Lf(), this);
        Ci(ph());
        if (Nf().getInitialEditorDataHashCode() == 0) {
            Nf().setInitialEditorDataHashCode(ih());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    public final String ph() {
        return zf().f73259k.getHostname();
    }

    protected void ri(String str) {
        ju.t.f(str, "credentialsMode");
        if (ju.t.b(str, "multikey") && Hf().c()) {
            str = "no_credentials_sharing";
        }
        Df().f24945l = str;
        if (ju.t.b(str, "multikey")) {
            jh.x xVarFf = Ff();
            if (xVarFf != null) {
                xVarFf.lf(str);
            }
            l0 l0VarGf = Gf();
            if (l0VarGf != null) {
                l0VarGf.sa("no_credentials_sharing");
                return;
            }
            return;
        }
        jh.x xVarFf2 = Ff();
        if (xVarFf2 != null) {
            xVarFf2.lf(str);
        }
        l0 l0VarGf2 = Gf();
        if (l0VarGf2 != null) {
            l0VarGf2.sa(str);
        }
    }

    public final void si(String str) {
        ju.t.f(str, "hostname");
        Df().f24936c = str;
        zf().f73259k.setHostname(str);
    }

    @Override // dl.b.a
    public void v7(boolean z10) {
        vi(false);
        zf().f73251c.setEnabled(false);
        zf().f73259k.setEnabled(false);
        zf().f73261m.setEnabled(false);
        zf().A.setEnabled(false);
        zf().f73252d.setEnabled(false);
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.yf(false);
        }
        jh.x xVarFf2 = Ff();
        if (xVarFf2 != null) {
            xVarFf2.v8();
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.Ga(false);
        }
        l0 l0VarGf2 = Gf();
        if (l0VarGf2 != null) {
            l0VarGf2.d6();
        }
        Di();
        if (Kh()) {
            bg();
        }
        if (z10) {
            zi();
        }
    }
}
