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
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.fragments.conflictsflow.OrdinaryConflictsScreenArgs;
import com.server.auditor.ssh.client.fragments.conflictsflow.PortForwardingConflictArgs;
import com.server.auditor.ssh.client.fragments.editors.base.BaseEditorFragmentViewModel;
import com.server.auditor.ssh.client.fragments.editors.base.l;
import com.server.auditor.ssh.client.interactors.k0;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.NavigationRouterActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.DirtyCheckViewModel;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import com.server.auditor.ssh.client.widget.a1;
import com.server.auditor.ssh.client.widget.b1;
import com.server.auditor.ssh.client.widget.editors.HostAliasEditorLayout;
import com.server.auditor.ssh.client.widget.editors.ParentGroupEditorLayout;
import com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView;
import dl.b;
import dq.j0;
import eq.b0;
import iq.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import jh.l0;
import lq.j;
import tp.a1;
import ut.m0;
import vp.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends com.server.auditor.ssh.client.fragments.editors.base.c implements VaultSelectorView.a, b1, com.server.auditor.ssh.client.widget.k, b.a, b.a {
    public static final a Q = new a(null);
    public static final int R = 8;
    private final com.server.auditor.ssh.client.app.a C = com.server.auditor.ssh.client.app.a.N();
    private final com.server.auditor.ssh.client.utils.analytics.a D;
    private GroupDBAdapter E;
    private final IdentityDBAdapter F;
    private nq.a G;
    private final SparseArray H;
    private a1 I;
    private com.server.auditor.ssh.client.widget.i J;
    private com.server.auditor.ssh.client.widget.i K;
    private final dl.b L;
    private final k0 M;
    private final ut.n N;
    private final g.b O;
    private final g.b P;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24891a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24893c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(l lVar, qq.a aVar) {
            lVar.qg(aVar.f());
            lVar.Uh(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new b(this.f24893c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24891a;
            if (i10 == 0) {
                ut.x.b(obj);
                final l lVar = l.this;
                final qq.a aVar = this.f24893c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.m
                    @Override // iu.a
                    public final Object a() {
                        return l.b.k(lVar, aVar);
                    }
                };
                this.f24891a = 1;
                if (lVar.Vh(aVar2, this) == objF) {
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
        int f24894a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24896c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(l lVar, qq.a aVar) {
            lVar.qg(aVar.f());
            lVar.Uh(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new c(this.f24896c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24894a;
            if (i10 == 0) {
                ut.x.b(obj);
                final l lVar = l.this;
                final qq.a aVar = this.f24896c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.n
                    @Override // iu.a
                    public final Object a() {
                        return l.c.k(lVar, aVar);
                    }
                };
                this.f24894a = 1;
                if (lVar.Vh(aVar2, this) == objF) {
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

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24897a;

        d(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return l.this.new d(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((d) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24897a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(l.this.Nf().getInitialEditorDataHashCode() != l.this.bh());
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24899a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f24902b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.l$e$a$a, reason: collision with other inner class name */
            static final class C0406a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l f24903a;

                C0406a(l lVar) {
                    this.f24903a = lVar;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(BaseEditorFragmentViewModel.b bVar, zt.e eVar) {
                    Identity identity;
                    Identity identity2;
                    if (ju.t.b(bVar, BaseEditorFragmentViewModel.b.d.f24733a)) {
                        this.f24903a.kg();
                    } else if (bVar instanceof BaseEditorFragmentViewModel.b.f) {
                        this.f24903a.hg(((BaseEditorFragmentViewModel.b.f) bVar).a());
                    } else if (!(bVar instanceof BaseEditorFragmentViewModel.b.j) && !(bVar instanceof BaseEditorFragmentViewModel.b.a)) {
                        if (bVar instanceof BaseEditorFragmentViewModel.b.h) {
                            SshProperties sshProperties = this.f24903a.Df().f24938e;
                            if (sshProperties != null) {
                                sshProperties.setIdentity(hg.f.p().n().getApplicationModel(((BaseEditorFragmentViewModel.b.h) bVar).a()));
                            }
                            jh.x xVarFf = this.f24903a.Ff();
                            if (xVarFf != null) {
                                xVarFf.ed(((BaseEditorFragmentViewModel.b.h) bVar).a());
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.k) {
                            TelnetProperties telnetProperties = this.f24903a.Df().f24939f;
                            if (telnetProperties != null) {
                                telnetProperties.setIdentity(hg.f.p().n().getApplicationModel(((BaseEditorFragmentViewModel.b.k) bVar).a()));
                            }
                            l0 l0VarGf = this.f24903a.Gf();
                            if (l0VarGf != null) {
                                l0VarGf.Z9(((BaseEditorFragmentViewModel.b.k) bVar).a());
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.i) {
                            SshProperties sshProperties2 = this.f24903a.Df().f24938e;
                            if (sshProperties2 != null) {
                                sshProperties2.setSshKey(hg.f.p().W().getItemByLocalId(((BaseEditorFragmentViewModel.b.i) bVar).a()));
                            }
                            jh.x xVarFf2 = this.f24903a.Ff();
                            if (xVarFf2 != null) {
                                xVarFf2.Ee(((BaseEditorFragmentViewModel.b.i) bVar).a());
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.m) {
                            SshProperties sshProperties3 = this.f24903a.Df().f24938e;
                            if (sshProperties3 != null && (identity2 = sshProperties3.getIdentity()) != null) {
                                identity2.setSshIdMode(HostContentKt.BACKSPACE_TYPE_DEFAULT);
                            }
                            jh.x xVarFf3 = this.f24903a.Ff();
                            if (xVarFf3 != null) {
                                jh.x.Dd(xVarFf3, null, 1, null);
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.n) {
                            SshProperties sshProperties4 = this.f24903a.Df().f24938e;
                            if (sshProperties4 != null && (identity = sshProperties4.getIdentity()) != null) {
                                identity.setSshIdMode(null);
                            }
                            jh.x xVarFf4 = this.f24903a.Ff();
                            if (xVarFf4 != null) {
                                xVarFf4.Wd();
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.o) {
                            jh.x xVarFf5 = this.f24903a.Ff();
                            if (xVarFf5 != null) {
                                BaseEditorFragmentViewModel.b.o oVar = (BaseEditorFragmentViewModel.b.o) bVar;
                                xVarFf5.le(oVar.a().getPasskeyType(), oVar.a().getUsername(), oVar.a().getPassword());
                            }
                        } else if (bVar instanceof BaseEditorFragmentViewModel.b.g) {
                            SshProperties sshProperties5 = this.f24903a.Df().f24938e;
                            if (sshProperties5 != null) {
                                sshProperties5.setStartupSnippet(new SnippetItem(hg.f.p().J().getItemByLocalId(((BaseEditorFragmentViewModel.b.g) bVar).a())));
                            }
                            jh.x xVarFf6 = this.f24903a.Ff();
                            if (xVarFf6 != null) {
                                xVarFf6.rd();
                            }
                        } else if (!(bVar instanceof BaseEditorFragmentViewModel.b.l)) {
                            if (bVar instanceof BaseEditorFragmentViewModel.b.p) {
                                jh.x xVarFf7 = this.f24903a.Ff();
                                if (xVarFf7 != null) {
                                    xVarFf7.hd(((BaseEditorFragmentViewModel.b.p) bVar).a());
                                }
                            } else if (bVar instanceof BaseEditorFragmentViewModel.b.e) {
                                this.f24903a.vg(((BaseEditorFragmentViewModel.b.e) bVar).a());
                            } else if (bVar instanceof BaseEditorFragmentViewModel.b.c) {
                                BaseEditorFragmentViewModel.b.c cVar = (BaseEditorFragmentViewModel.b.c) bVar;
                                if (cVar.b() == SelectPurpose.SSH) {
                                    jh.x xVarFf8 = this.f24903a.Ff();
                                    if (xVarFf8 != null) {
                                        xVarFf8.cd(cVar.a());
                                    }
                                } else {
                                    l0 l0VarGf2 = this.f24903a.Gf();
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
                                    jh.x xVarFf9 = this.f24903a.Ff();
                                    if (xVarFf9 != null) {
                                        xVarFf9.bd(c0396b.a());
                                    }
                                } else {
                                    l0 l0VarGf3 = this.f24903a.Gf();
                                    if (l0VarGf3 != null) {
                                        l0VarGf3.E9(c0396b.a());
                                    }
                                }
                            }
                        }
                    }
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, zt.e eVar) {
                super(2, eVar);
                this.f24902b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24902b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24901a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    zu.a0 composeActions = this.f24902b.Nf().getComposeActions();
                    C0406a c0406a = new C0406a(this.f24902b);
                    this.f24901a = 1;
                    if (composeActions.collect(c0406a, this) == objF) {
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
            return l.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24899a;
            if (i10 == 0) {
                ut.x.b(obj);
                l lVar = l.this;
                q.b bVar = q.b.f8799d;
                a aVar = new a(lVar, null);
                this.f24899a = 1;
                if (r0.b(lVar, bVar, aVar, this) == objF) {
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
        int f24904a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qq.a f24906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qq.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f24906c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(l lVar, qq.a aVar) {
            lVar.Df().f24945l = aVar.d();
            lVar.Uh(aVar);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new f(this.f24906c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24904a;
            if (i10 == 0) {
                ut.x.b(obj);
                final l lVar = l.this;
                final qq.a aVar = this.f24906c;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.o
                    @Override // iu.a
                    public final Object a() {
                        return l.f.k(lVar, aVar);
                    }
                };
                this.f24904a = 1;
                if (lVar.Vh(aVar2, this) == objF) {
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
        int f24907a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(l lVar) {
            lVar.Yg();
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24907a;
            if (i10 == 0) {
                ut.x.b(obj);
                final l lVar = l.this;
                iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.p
                    @Override // iu.a
                    public final Object a() {
                        return l.g.k(lVar);
                    }
                };
                this.f24907a = 1;
                if (lVar.Vh(aVar, this) == objF) {
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
        int f24909a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f24911c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(l lVar, String str) {
            lVar.Ih(str);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new h(this.f24911c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24909a;
            if (i10 == 0) {
                ut.x.b(obj);
                final l lVar = l.this;
                final String str = this.f24911c;
                iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.q
                    @Override // iu.a
                    public final Object a() {
                        return l.h.k(lVar, str);
                    }
                };
                this.f24909a = 1;
                if (lVar.Vh(aVar, this) == objF) {
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
        Object f24912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24914c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24916e;

        i(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24914c = obj;
            this.f24916e |= RtlSpacingHelper.UNDEFINED;
            return l.this.Vh(null, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24917a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GroupDBModel f24919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(GroupDBModel groupDBModel, zt.e eVar) {
            super(2, eVar);
            this.f24919c = groupDBModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return l.this.new j(this.f24919c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24917a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a aVar = l.this.D;
            boolean zIsShared = this.f24919c.isShared();
            a1.a aVar2 = tp.a1.f80840a;
            aVar.f3(zIsShared, aVar2.d(), aVar2.b(), aVar2.f());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f24920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24922c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24924e;

        k(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24922c = obj;
            this.f24924e |= RtlSpacingHelper.UNDEFINED;
            return l.this.Wh(null, null, this);
        }
    }

    public l() {
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        this.D = aVarY;
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        ju.t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        this.E = groupDBAdapterH;
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        ju.t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        this.F = identityDBAdapterN;
        this.H = new SparseArray();
        this.L = new dl.b();
        this.M = new k0();
        this.N = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.d
            @Override // iu.a
            public final Object a() {
                return l.Fh(this.f24799a);
            }
        });
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.e
            @Override // g.a
            public final void a(Object obj) {
                l.ah(this.f24827a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.O = bVarRegisterForActivityResult;
        g.b bVarRegisterForActivityResult2 = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.f
            @Override // g.a
            public final void a(Object obj) {
                l.fi(this.f24830a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.P = bVarRegisterForActivityResult2;
    }

    private final boolean Ah() {
        return Df().f24934a == -1;
    }

    private final boolean Bh() {
        return Nf().isSavingToVaultPermitted();
    }

    private final boolean Ch() {
        jh.x xVarFf = Ff();
        boolean z10 = xVarFf != null && xVarFf.N3();
        l0 l0VarGf = Gf();
        boolean z11 = l0VarGf != null && l0VarGf.N3();
        nq.a aVar = this.G;
        return aVar != null && aVar.a(R.string.required_field, new nq.c() { // from class: com.server.auditor.ssh.client.fragments.editors.base.i
            @Override // nq.c
            public final boolean a(Object obj) {
                return l.Kg((String) obj);
            }
        }) && z10 && z11;
    }

    private final boolean Dh(qq.a aVar) {
        return ju.t.b(Lf(), aVar.f());
    }

    private final void Eh(SshProperties sshProperties) {
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
    public static final iq.b Fh(l lVar) {
        hg.d dVarM = lVar.C.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        return new iq.b(new wn.j(dVarM));
    }

    private final void G8() {
        com.server.auditor.ssh.client.widget.i iVar = this.J;
        if (iVar != null) {
            iVar.dismiss();
        }
        this.J = null;
    }

    private final void Gh(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showOrdinaryConflictsScreen");
        Bundle bundle = new OrdinaryConflictsScreenArgs.a("editor_screen", nh(), -1L, vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        intent.putExtras(bundle);
        this.O.a(intent);
    }

    private final void Hh(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        Intent intent = new Intent(requireActivity(), (Class<?>) NavigationRouterActivity.class);
        intent.setAction("showPFConflictsScreen");
        Bundle bundle = new PortForwardingConflictArgs.a("editor_screen", nh(), -1L, "No conflicts", vaultKeyId, str, sourceEntitiesArgDataArr, conflictsArgDataArr).a().toBundle();
        ju.t.e(bundle, "toBundle(...)");
        intent.putExtras(bundle);
        this.O.a(intent);
    }

    private final void I() {
        com.server.auditor.ssh.client.widget.a1 a1Var = this.I;
        if (a1Var != null) {
            a1Var.dismiss();
        }
        this.I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ih(String str) {
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TypedEntityIdentifier(groupDBModelGh.getIdInDatabase(), groupDBModelGh.getClass()));
        this.D.L4(Avo.OpenedFrom.EDIT_GROUP, str);
        NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
        g.b bVar = this.P;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        aVar.c(bVar, fragmentActivityRequireActivity, new NavigationPopUpWhenLargeActivity.NavigationDestination.SetupTeamVaultFlow(new NavigationPopUpWhenLargeActivity.SetupTeamVaultFlowStartDestination.Onboarding(arrayList, str)));
    }

    private final void Jh(ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1000) {
            Yg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Kg(String str) {
        return !TextUtils.isEmpty(str);
    }

    private final void Kh() {
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        this.D.J0(new wp.a(Avo.ChangeVaultAction.MOVE, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.GROUP, string, Avo.ChangeToVault.NOT_MINUSPERSONAL, Avo.CurrentVault.PERSONAL));
        this.D.S4();
        if (Ch()) {
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new h(string, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lh(qq.a aVar, l lVar, qq.a aVar2) {
        ju.t.f(aVar2, "flowData");
        boolean z10 = com.server.auditor.ssh.client.app.a.N().M().getBoolean("authorized_feature_show_multikey_promotion", true);
        if (ju.t.b(aVar.d(), "multikey") && z10) {
            lVar.p9();
            return;
        }
        if (lVar.Ah()) {
            lVar.zf().I.C(lVar.Lf());
            lVar.Df().f24944k = true ^ com.server.auditor.ssh.client.ui.vaults.data.a.b(lVar.Lf());
            lVar.ki();
            String str = lVar.Df().f24945l;
            ju.t.e(str, "credentialsMode");
            lVar.Vg(str, aVar.d());
        } else {
            String str2 = lVar.Df().f24945l;
            ju.t.e(str2, "credentialsMode");
            lVar.Vg(str2, aVar.d());
        }
        lVar.Yh(aVar2.d());
        com.server.auditor.ssh.client.widget.i iVar = lVar.K;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    private final void Mh(ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            Ag();
            pi(Lf());
            ki();
            Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
            ng(Lf());
            zf().I.C(Lf());
            Th();
            di(fh());
            hg.f.p().Y().startFullSync();
        }
    }

    private final void Nh(String str, boolean z10) {
        a.C1341a c1341a = vp.a.f83866a;
        Avo.ChangeVaultAction changeVaultActionC = c1341a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        ju.t.e(string, "toString(...)");
        ei(string);
        this.D.J0(new wp.a(changeVaultActionC, Avo.ChangeVaultSource.EDIT_FORM, Avo.Entity.GROUP, nh(), c1341a.b(z10), c1341a.a(Cf())));
    }

    private final void Oh(String str) {
        Avo.ChangeVaultAction changeVaultActionC = vp.a.f83866a.c(str);
        if (changeVaultActionC == null) {
            return;
        }
        this.D.K0(new wp.b(changeVaultActionC, nh(), Avo.Entity.GROUP, Avo.ChangeVaultSource.EDIT_FORM));
    }

    private final void Ph(String str) {
        this.D.r1(vp.a.f83866a.e(str), nh());
    }

    private final void Qh() {
        this.D.s1(nh());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.server.auditor.ssh.client.database.models.GroupDBModel Rh() {
        /*
            r6 = this;
            jh.x r0 = r6.Ff()
            r1 = 0
            if (r0 == 0) goto L16
            boolean r2 = r0.J3()
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L16
            com.server.auditor.ssh.client.models.properties.SshProperties r0 = r0.V8()
            goto L17
        L16:
            r0 = r1
        L17:
            jh.l0 r2 = r6.Gf()
            if (r2 == 0) goto L2c
            boolean r3 = r2.J3()
            if (r3 == 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L2c
            com.server.auditor.ssh.client.models.properties.TelnetProperties r2 = r2.t7()
            goto L2d
        L2c:
            r2 = r1
        L2d:
            com.server.auditor.ssh.client.database.models.GroupDBModel r3 = new com.server.auditor.ssh.client.database.models.GroupDBModel
            java.lang.String r4 = r6.ch()
            com.server.auditor.ssh.client.database.models.GroupDBModel r5 = r6.If()
            r3.<init>(r4, r0, r2, r5)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r6.Df()
            long r4 = r0.f24934a
            r3.setIdInDatabase(r4)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r6.Df()
            boolean r0 = r0.f24944k
            r3.setShared(r0)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r6.Df()
            boolean r0 = r0.f24944k
            if (r0 == 0) goto L5b
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r0 = r6.Lf()
            r3.setVaultKeyId(r0)
        L5b:
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r6.Df()
            boolean r0 = r0.f24944k
            if (r0 == 0) goto L7d
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r6.Df()
            java.lang.String r0 = r0.f24945l
            r3.setCredentialsMode(r0)
            java.lang.String r0 = r3.getCredentialsMode()
            com.server.auditor.ssh.client.database.models.GroupDBModel r1 = r6.If()
            if (r1 != 0) goto L78
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            r6.Xh(r0, r1)
            return r3
        L7d:
            r3.setCredentialsMode(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.l.Rh():com.server.auditor.ssh.client.database.models.GroupDBModel");
    }

    private final void Sg(VaultKeyId vaultKeyId) {
        if (Ah() && tp.a1.f80840a.f()) {
            if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId)) {
                qg(vaultKeyId);
                Df().f24944k = true;
            } else {
                if (xh() || !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
                    return;
                }
                qg(dq.b0.f47897a.h());
            }
        }
    }

    private final void Sh() {
        Yh("no_credentials_sharing");
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
            sh();
        } else {
            hi(Bh());
        }
    }

    private final void Tg(GroupDBModel groupDBModel) {
        SshProperties sshConfig = groupDBModel.getSshConfig();
        if (yh(groupDBModel, sshConfig)) {
            Eh(sshConfig);
        }
    }

    private final void Th() {
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

    private final void Ug() {
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
    public final void Uh(qq.a aVar) {
        GroupDBModel groupDBModelHh = hh(Df().f24934a);
        if (groupDBModelHh == null) {
            return;
        }
        ih().j(vt.v.e(groupDBModelHh), aVar.f(), aVar.d(), "editor_screen", this);
    }

    private final void Vg(String str, String str2) {
        if (ag(str, str2)) {
            Wg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (Wh(r13, r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Vh(iu.a r13, zt.e r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.server.auditor.ssh.client.fragments.editors.base.l.i
            if (r0 == 0) goto L13
            r0 = r14
            com.server.auditor.ssh.client.fragments.editors.base.l$i r0 = (com.server.auditor.ssh.client.fragments.editors.base.l.i) r0
            int r1 = r0.f24916e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24916e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.fragments.editors.base.l$i r0 = new com.server.auditor.ssh.client.fragments.editors.base.l$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24914c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f24916e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            ut.x.b(r14)
            goto L95
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.Object r13 = r0.f24913b
            com.server.auditor.ssh.client.database.models.GroupDBModel r13 = (com.server.auditor.ssh.client.database.models.GroupDBModel) r13
            java.lang.Object r2 = r0.f24912a
            iu.a r2 = (iu.a) r2
            ut.x.b(r14)
            goto L88
        L41:
            ut.x.b(r14)
            boolean r14 = r12.Ch()
            if (r14 != 0) goto L4d
            ut.m0 r13 = ut.m0.f82633a
            return r13
        L4d:
            r12.yg(r5)
            com.server.auditor.ssh.client.database.models.GroupDBModel r14 = r12.Rh()
            boolean r2 = r12.Ah()
            if (r2 == 0) goto L6a
            androidx.lifecycle.t r6 = androidx.lifecycle.a0.a(r12)
            com.server.auditor.ssh.client.fragments.editors.base.l$j r9 = new com.server.auditor.ssh.client.fragments.editors.base.l$j
            r9.<init>(r14, r4)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            wu.i.d(r6, r7, r8, r9, r10, r11)
        L6a:
            com.server.auditor.ssh.client.database.adapters.GroupDBAdapter r2 = r12.E
            hg.f r6 = hg.f.p()
            com.server.auditor.ssh.client.synchronization.api.adapters.GroupApiAdapter r6 = r6.g()
            java.lang.String r7 = "getGroupApiAdapter(...)"
            ju.t.e(r6, r7)
            r0.f24912a = r13
            r0.f24913b = r14
            r0.f24916e = r5
            java.lang.Object r2 = zp.d.c(r2, r6, r14, r0)
            if (r2 != r1) goto L86
            goto L94
        L86:
            r2 = r13
            r13 = r14
        L88:
            r0.f24912a = r4
            r0.f24913b = r4
            r0.f24916e = r3
            java.lang.Object r13 = r12.Wh(r13, r2, r0)
            if (r13 != r1) goto L95
        L94:
            return r1
        L95:
            ut.m0 r13 = ut.m0.f82633a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.l.Vh(iu.a, zt.e):java.lang.Object");
    }

    private final void Wg() {
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
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Wh(com.server.auditor.ssh.client.database.models.GroupDBModel r7, iu.a r8, zt.e r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.fragments.editors.base.l.k
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.fragments.editors.base.l$k r0 = (com.server.auditor.ssh.client.fragments.editors.base.l.k) r0
            int r1 = r0.f24924e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24924e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.fragments.editors.base.l$k r0 = new com.server.auditor.ssh.client.fragments.editors.base.l$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24922c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f24924e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f24921b
            r8 = r7
            iu.a r8 = (iu.a) r8
            java.lang.Object r7 = r0.f24920a
            com.server.auditor.ssh.client.database.models.GroupDBModel r7 = (com.server.auditor.ssh.client.database.models.GroupDBModel) r7
            ut.x.b(r9)
            ut.w r9 = (ut.w) r9
            java.lang.Object r9 = r9.j()
            goto L70
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            ut.x.b(r9)
            r6.Tg(r7)
            zp.c r9 = new zp.c
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            hg.f r4 = hg.f.p()
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r4 = r4.Y()
            r5 = 0
            r9.<init>(r2, r5, r4)
            com.server.auditor.ssh.client.fragments.editors.base.r r2 = r6.Df()
            com.server.auditor.ssh.client.models.ChainingHost r2 = r2.f24943j
            java.lang.String r4 = "mChainingHost"
            ju.t.e(r2, r4)
            r0.f24920a = r7
            r0.f24921b = r8
            r0.f24924e = r3
            java.lang.Object r9 = zp.d.d(r9, r7, r2, r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            java.lang.Throwable r0 = ut.w.e(r9)
            r1 = 0
            if (r0 != 0) goto L93
            java.lang.Number r9 = (java.lang.Number) r9
            long r2 = r9.longValue()
            r6.ai(r7)
            com.server.auditor.ssh.client.database.models.GroupDBModel r9 = r6.gh()
            if (r9 == 0) goto L89
            r9.setIdInDatabase(r2)
        L89:
            r6.Zh(r7)
            r6.yg(r1)
            r8.a()
            goto L9d
        L93:
            r6.yg(r1)
            java.lang.String r7 = r0.getMessage()
            r6.ii(r7)
        L9d:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.base.l.Wh(com.server.auditor.ssh.client.database.models.GroupDBModel, iu.a, zt.e):java.lang.Object");
    }

    private final void Xg() {
        com.server.auditor.ssh.client.widget.i iVar = this.J;
        if (iVar != null) {
            iVar.Z2();
        }
        this.J = null;
    }

    private final void Xh(String str, boolean z10) {
        GroupDBModel groupDBModelGh = gh();
        String credentialsMode = groupDBModelGh != null ? groupDBModelGh.getCredentialsMode() : null;
        if (str == null || ju.t.b(str, credentialsMode)) {
            return;
        }
        this.D.q1(str, true, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yg() {
        if (Zf()) {
            Nf().sendFragmentAction(BaseEditorFragmentViewModel.c.a.f24746a);
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
        parentFragmentManager.g1();
    }

    private final int Zg() {
        GroupDBModel groupDBModelIf = If();
        String title = groupDBModelIf != null ? groupDBModelIf.getTitle() : null;
        if (title == null) {
            title = "";
        }
        jh.x xVarFf = Ff();
        SshProperties sshPropertiesU8 = xVarFf != null ? xVarFf.U8() : null;
        l0 l0VarGf = Gf();
        TelnetProperties telnetPropertiesN7 = l0VarGf != null ? l0VarGf.n7() : null;
        return Arrays.hashCode(new String[]{ch(), Df().f24936c, title}) + (sshPropertiesU8 != null ? sshPropertiesU8.hashCode() : 0) + (telnetPropertiesN7 != null ? telnetPropertiesN7.hashCode() : 0);
    }

    private final void Zh(GroupDBModel groupDBModel) throws IOException {
        ai(groupDBModel);
        if (groupDBModel == null) {
            return;
        }
        Df().f24934a = groupDBModel.getIdInDatabase();
        Df().f24935b = groupDBModel.getTitle();
        Df().f24941h = jh(groupDBModel);
        Df().f24945l = groupDBModel.getCredentialsMode();
        if (groupDBModel.getSshConfigId() != null) {
            r rVarDf = Df();
            SshConfigDBAdapter sshConfigDBAdapterS = hg.f.p().S();
            Long sshConfigId = groupDBModel.getSshConfigId();
            ju.t.e(sshConfigId, "getSshConfigId(...)");
            rVarDf.f24938e = sshConfigDBAdapterS.getItemByLocalId(sshConfigId.longValue()).convertToSshConfig();
            SshProperties sshProperties = Df().f24938e;
            if (sshProperties != null) {
                oi(sshProperties);
            }
        }
        if (groupDBModel.getTelnetConfigId() != null) {
            r rVarDf2 = Df();
            TelnetConfigDBAdapter telnetConfigDBAdapterE0 = hg.f.p().e0();
            Long telnetConfigId = groupDBModel.getTelnetConfigId();
            ju.t.e(telnetConfigId, "getTelnetConfigId(...)");
            rVarDf2.f24939f = telnetConfigDBAdapterE0.getItemByLocalId(telnetConfigId.longValue()).convertToTelnetConfig();
            TelnetProperties telnetProperties = Df().f24939f;
            if (telnetProperties != null) {
                qi(telnetProperties);
            }
        }
        di(Df().hashCode() + Bf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah(l lVar, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        lVar.Mh(activityResult);
    }

    private final void ai(GroupDBModel groupDBModel) {
        Nf().setMGroupDBModel(groupDBModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int bh() {
        GroupDBModel groupDBModelIf = If();
        String title = groupDBModelIf != null ? groupDBModelIf.getTitle() : null;
        if (title == null) {
            title = "";
        }
        return Arrays.hashCode(new String[]{ch(), Df().f24936c, title});
    }

    private final void bi(boolean z10) {
        Nf().setNeedLockVaultSelectorOnStart(z10);
    }

    private final void ci(boolean z10) {
        Nf().setSavingToVaultPermitted(z10);
    }

    private final Long dh() {
        Identity identity;
        if (Df().f24938e == null || (identity = Df().f24938e.getIdentity()) == null) {
            return null;
        }
        return Long.valueOf(identity.getId());
    }

    private final void di(int i10) {
        if (Nf().getStartModelHashCode() == 0) {
            Nf().setStartModelHashCode(i10);
        }
    }

    private final Long eh() {
        Identity identity;
        if (Df().f24939f == null || (identity = Df().f24939f.getIdentity()) == null) {
            return null;
        }
        return Long.valueOf(identity.getId());
    }

    private final void ei(String str) {
        Nf().setVaultWizardId(str);
    }

    private final int fh() {
        if (gh() == null) {
            return 0;
        }
        return Zg() + Bf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fi(l lVar, ActivityResult activityResult) {
        ju.t.f(activityResult, "result");
        lVar.Jh(activityResult);
    }

    private final GroupDBModel gh() {
        return Nf().getMGroupDBModel();
    }

    private final void gi() {
        new be.b(requireContext()).setMessage(R.string.alert_edit_only_owner).setPositiveButton(android.R.string.ok, null).show();
    }

    private final GroupDBModel hh(long j10) {
        return this.E.getItemByLocalId(j10);
    }

    private final void hi(boolean z10) {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.sf(true, z10);
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.Fa(true, z10);
        }
    }

    private final void ic(qq.a aVar) {
        I();
        Qh();
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(this, qq.a.b(aVar, null, false, null, false, true, false, null, null, 239, null), true);
        this.J = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    private final iq.b ih() {
        return (iq.b) this.N.getValue();
    }

    private final void ii(String str) {
        be.b bVar = new be.b(requireContext());
        bVar.setTitle(R.string.saving_error_title);
        if (TextUtils.isEmpty(str)) {
            bVar.setMessage(R.string.saving_error_unknown_contact_us);
        } else {
            bVar.setMessage(str);
        }
        bVar.setPositiveButton(R.string.ok, null).show();
    }

    private final GroupDBModel jh(GroupDBModel groupDBModel) {
        if ((groupDBModel != null ? groupDBModel.getParentGroupId() : null) == null) {
            return null;
        }
        GroupDBAdapter groupDBAdapter = this.E;
        Long parentGroupId = groupDBModel.getParentGroupId();
        ju.t.e(parentGroupId, "getParentGroupId(...)");
        return groupDBAdapter.getItemByLocalId(parentGroupId.longValue());
    }

    private final void ji(String str) {
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

    private final String kh(qq.a aVar) {
        return Ah() ? "Create" : aVar.c();
    }

    private final void ki() {
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) {
            sh();
            return;
        }
        hi(Bh());
        String str = Df().f24945l;
        if (str == null) {
            str = "no_credentials_sharing";
        }
        Yh(str);
    }

    private final int lh() {
        return Nf().getStartModelHashCode();
    }

    private final void li(final dq.t tVar) {
        final Long lDh = dh();
        final Long lEh = eh();
        if (lDh != null) {
            tVar.a().forEach(new Consumer() { // from class: com.server.auditor.ssh.client.fragments.editors.base.j
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    l.mi(lDh, this, tVar, (dq.n) obj);
                }
            });
        }
        if (lEh != null) {
            tVar.a().forEach(new Consumer() { // from class: com.server.auditor.ssh.client.fragments.editors.base.k
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    l.ni(lEh, this, (dq.n) obj);
                }
            });
        }
    }

    private final String mh() {
        return Nf().getUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mi(Long l10, l lVar, dq.t tVar, dq.n nVar) {
        SshKeyDBModel itemByLocalId;
        ju.t.f(nVar, "identitiesInfo");
        long jA = nVar.a();
        if (l10 != null && jA == l10.longValue()) {
            lVar.Df().f24938e.getIdentity().setId(Long.valueOf(nVar.b()));
            if (tVar.b() == null || (itemByLocalId = hg.f.p().W().getItemByLocalId(tVar.b().longValue())) == null) {
                return;
            }
            lVar.Df().f24938e.getIdentity().setSshKey(itemByLocalId);
        }
    }

    private final String nh() {
        return Nf().getVaultWizardId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ni(Long l10, l lVar, dq.n nVar) {
        ju.t.f(nVar, "identitiesInfo");
        long jA = nVar.a();
        if (l10 != null && jA == l10.longValue()) {
            lVar.Df().f24939f.getIdentity().setId(Long.valueOf(nVar.b()));
        }
    }

    private final void oh(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        b0.a aVar = eq.b0.f48942a;
        ConflictsArgData[] conflictsArgDataArrA = aVar.a(iVar);
        boolean zB = this.M.b(conflictsArgDataArrA);
        SourceEntitiesArgData[] sourceEntitiesArgDataArrB = aVar.b(list);
        if (zB) {
            Hh(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB);
        } else {
            Gh(vaultKeyId, str, conflictsArgDataArrA, sourceEntitiesArgDataArrB);
        }
    }

    private final void oi(SshProperties sshProperties) throws IOException {
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh != null && groupDBModelGh.isShared() && dq.f.f47917a.a(groupDBModelGh.getCredentialsMode())) {
            SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapterE = hg.f.p().E();
            Long sshConfigId = groupDBModelGh.getSshConfigId();
            ju.t.e(sshConfigId, "getSshConfigId(...)");
            SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModelFindItemBySharedSshConfigId = sharedSshConfigIdentityDBAdapterE.findItemBySharedSshConfigId(sshConfigId.longValue());
            if (sharedSshConfigIdentityDBModelFindItemBySharedSshConfigId != null) {
                ti(sharedSshConfigIdentityDBModelFindItemBySharedSshConfigId, sshProperties);
                return;
            }
            return;
        }
        if (groupDBModelGh != null) {
            SshConfigIdentityDBAdapter sshConfigIdentityDBAdapterU = hg.f.p().U();
            Long sshConfigId2 = groupDBModelGh.getSshConfigId();
            ju.t.e(sshConfigId2, "getSshConfigId(...)");
            SshConfigIdentityDBModel sshConfigIdentityDBModelFindItemBySshConfigId = sshConfigIdentityDBAdapterU.findItemBySshConfigId(sshConfigId2.longValue());
            if (sshConfigIdentityDBModelFindItemBySshConfigId != null) {
                ri(sshConfigIdentityDBModelFindItemBySshConfigId, sshProperties);
            }
        }
    }

    private final void ph(qq.a aVar) {
        if (com.server.auditor.ssh.client.ui.vaults.data.a.b(Cf())) {
            ic(aVar);
        } else {
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new b(aVar, null), 3, null);
        }
    }

    private final void pi(VaultKeyId vaultKeyId) {
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh != null) {
            groupDBModelGh.setVaultKeyId(vaultKeyId);
        }
    }

    private final void qh(qq.a aVar) {
        qg(aVar.f());
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f());
        com.server.auditor.ssh.client.widget.a1 a1Var = this.I;
        if (a1Var != null) {
            a1Var.dismiss();
        }
        Sh();
        zf().I.C(Lf());
        Ug();
    }

    private final void qi(TelnetProperties telnetProperties) throws IOException {
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh != null && groupDBModelGh.isShared() && dq.f.f47917a.a(groupDBModelGh.getCredentialsMode())) {
            SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapterG = hg.f.p().G();
            Long telnetConfigId = groupDBModelGh.getTelnetConfigId();
            ju.t.e(telnetConfigId, "getTelnetConfigId(...)");
            SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModelFindItemBySharedTelnetConfigId = sharedTelnetConfigIdentityDBAdapterG.findItemBySharedTelnetConfigId(telnetConfigId.longValue());
            if (sharedTelnetConfigIdentityDBModelFindItemBySharedTelnetConfigId != null) {
                ui(sharedTelnetConfigIdentityDBModelFindItemBySharedTelnetConfigId, telnetProperties);
                return;
            }
            return;
        }
        if (groupDBModelGh != null) {
            TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapterG0 = hg.f.p().g0();
            Long telnetConfigId2 = groupDBModelGh.getTelnetConfigId();
            ju.t.e(telnetConfigId2, "getTelnetConfigId(...)");
            TelnetConfigIdentityDBModel telnetConfigIdentityDBModelFindItemByTelnetConfigId = telnetConfigIdentityDBAdapterG0.findItemByTelnetConfigId(telnetConfigId2.longValue());
            if (telnetConfigIdentityDBModelFindItemByTelnetConfigId != null) {
                si(telnetConfigIdentityDBModelFindItemByTelnetConfigId, telnetProperties);
            }
        }
    }

    private final void rh(qq.a aVar) {
        if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f())) {
            ph(aVar);
        } else {
            Yh("no_credentials_sharing");
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new c(aVar, null), 3, null);
        }
    }

    private final void ri(SshConfigIdentityDBModel sshConfigIdentityDBModel, SshProperties sshProperties) {
        IdentityDBModel itemByLocalId = this.F.getItemByLocalId(sshConfigIdentityDBModel.getIdentityId());
        if (itemByLocalId != null) {
            sshProperties.setIdentity(itemByLocalId.convertToIdentity());
        }
    }

    private final void sh() {
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.sf(false, false);
        }
        l0 l0VarGf = Gf();
        if (l0VarGf != null) {
            l0VarGf.Fa(false, false);
        }
    }

    private final void si(TelnetConfigIdentityDBModel telnetConfigIdentityDBModel, TelnetProperties telnetProperties) {
        IdentityDBModel itemByLocalId = this.F.getItemByLocalId(telnetConfigIdentityDBModel.getIdentityId());
        if (itemByLocalId != null) {
            telnetProperties.setIdentity(itemByLocalId.convertToIdentity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 th(l lVar, String str) {
        ju.t.f(str, "alias");
        lVar.requireActivity().invalidateOptionsMenu();
        lVar.ji(str);
        return m0.f82633a;
    }

    private final void ti(SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel, SshProperties sshProperties) {
        IdentityDBModel itemByLocalId = this.F.getItemByLocalId(sharedSshConfigIdentityDBModel.getIdentityId());
        if (itemByLocalId != null) {
            sshProperties.setIdentity(itemByLocalId.convertToIdentity());
        }
    }

    private final void uh() {
        this.G = zf().f73251c.a();
    }

    private final void ui(SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel, TelnetProperties telnetProperties) {
        IdentityDBModel itemByLocalId = this.F.getItemByLocalId(sharedTelnetConfigIdentityDBModel.getIdentityId());
        if (itemByLocalId != null) {
            telnetProperties.setIdentity(itemByLocalId.convertToIdentity());
        }
    }

    private final void vh() {
        VaultSelectorView vaultSelectorView = zf().I;
        j0.a aVar = dq.j0.f47941a;
        ju.t.c(vaultSelectorView);
        aVar.d(vaultSelectorView, Lf(), true, this);
        ki();
        if (xh()) {
            vaultSelectorView.A(Lf());
        }
    }

    private final boolean wh() {
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh != null) {
            return dq.f.f47917a.a(groupDBModelGh.getCredentialsMode());
        }
        return false;
    }

    private final boolean xh() {
        return Nf().isNeedLockVaultSelectorOnStart();
    }

    private final boolean yh(GroupDBModel groupDBModel, SshProperties sshProperties) {
        SnippetItem startupSnippet;
        if (!groupDBModel.isShared() || sshProperties == null || (startupSnippet = sshProperties.getStartupSnippet()) == null || startupSnippet.getPackageId() == null) {
            return false;
        }
        return !startupSnippet.isShared();
    }

    private final boolean zh() {
        return (gh() != null) && (lh() != fh());
    }

    @Override // iq.b.a
    public void J3(dq.t tVar) {
        ju.t.f(tVar, "recreatedCredentialsInfo");
        Ag();
        pi(Lf());
        zf().I.C(Lf());
        ki();
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
        ng(Lf());
        Th();
        li(tVar);
        hg.f.p().Y().startFullSync();
        com.server.auditor.ssh.client.widget.a1 a1Var = this.I;
        if (a1Var != null) {
            a1Var.Z2();
        }
        com.server.auditor.ssh.client.widget.i iVar = this.J;
        if (iVar != null) {
            iVar.Z2();
        }
        Oh("Move");
        di(fh());
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected jh.x Kf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
        jh.d dVar = new jh.d(fragmentActivityRequireActivity, this, parentFragmentManager, Df().f24941h, zf());
        dVar.D3();
        return dVar;
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected l0 Mf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
        jh.e eVar = new jh.e(fragmentActivityRequireActivity, this, parentFragmentManager, Df().f24941h, zf());
        eVar.D3();
        return eVar;
    }

    @Override // com.server.auditor.ssh.client.widget.k
    public void O8(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        qg(aVar.f());
        Ph(aVar.d());
        boolean z10 = com.server.auditor.ssh.client.app.a.N().M().getBoolean("authorized_feature_show_multikey_promotion", true);
        if (ju.t.b(aVar.d(), "multikey") && z10) {
            p9();
            return;
        }
        Yh(aVar.d());
        if (!Ah()) {
            Xg();
            wu.k.d(androidx.lifecycle.a0.a(this), null, null, new f(aVar, null), 3, null);
            return;
        }
        zf().I.C(Lf());
        Df().f24944k = !com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
        ki();
        Ug();
        com.server.auditor.ssh.client.widget.i iVar = this.J;
        if (iVar != null) {
            iVar.dismiss();
        }
        Oh("Create");
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected boolean Of() {
        return TextUtils.isEmpty(zf().f73251c.getAlias());
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected void Qf() {
        zf().f73251c.setOnAliasChangedListener(new iu.l() { // from class: com.server.auditor.ssh.client.fragments.editors.base.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return l.th(this.f24833a, (String) obj);
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
        com.server.auditor.ssh.client.widget.a1 a1Var = new com.server.auditor.ssh.client.widget.a1(qq.b.b(bVarD, null, true, null, false, false, zh(), null, str, 93, null), false, this);
        this.I = a1Var;
        a1Var.show(requireActivity().getSupportFragmentManager(), "EditorVaultSelectorBottomSheetDialogTag");
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void U5() {
    }

    @Override // com.server.auditor.ssh.client.widget.vaultselector.VaultSelectorView.a
    public void We() {
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            xl.a.a(requireActivity(), currentFocus);
            currentFocus.clearFocus();
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected boolean Xf() {
        return true;
    }

    protected void Yh(String str) {
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

    @Override // com.server.auditor.ssh.client.widget.b1
    public void bb() {
        Kh();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    protected void c() {
        ParentGroupEditorLayout parentGroupEditorLayout = zf().f73261m;
        String string = getString(R.string.hint_parent_group_edittext);
        ju.t.e(string, "getString(...)");
        parentGroupEditorLayout.O(string);
        HostAliasEditorLayout hostAliasEditorLayout = zf().f73251c;
        hostAliasEditorLayout.setNextFocusForwardId(R.id.ssh_port_edit_text);
        hostAliasEditorLayout.setAlias(getString(R.string.hint_name));
        zf().f73259k.setVisibility(8);
        zf().A.setVisibility(8);
        uh();
    }

    protected String ch() {
        return zf().f73251c.getAlias();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void ig(boolean z10, final qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        com.server.auditor.ssh.client.widget.i iVar = new com.server.auditor.ssh.client.widget.i(new com.server.auditor.ssh.client.widget.k() { // from class: com.server.auditor.ssh.client.fragments.editors.base.h
            @Override // com.server.auditor.ssh.client.widget.k
            public final void O8(qq.a aVar2) {
                l.Lh(aVar, this, aVar2);
            }
        }, aVar, z10);
        this.K = iVar;
        iVar.show(requireActivity().getSupportFragmentManager(), "CredentialsKindBottomSheetDialog");
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void jg() {
        ji(ch());
    }

    @Override // iq.b.a
    public void k3(List list, eq.i iVar, VaultKeyId vaultKeyId, String str) {
        ju.t.f(list, "sourceEntitiesToMove");
        ju.t.f(iVar, "conflictsEntities");
        ju.t.f(vaultKeyId, "targetVaultKeyId");
        ju.t.f(str, "credentialsMode");
        I();
        G8();
        oh(list, iVar, vaultKeyId, str);
    }

    @Override // dl.b.a
    public void ka() {
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new g(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void kg() {
        this.L.c(Lf(), this, wh());
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c
    public void lg(String str) {
        super.lg(str);
        zf().f73251c.setAlias(str);
    }

    @Override // com.server.auditor.ssh.client.widget.b1
    public void na(qq.a aVar) {
        ju.t.f(aVar, "vaultFlowData");
        if (Dh(aVar)) {
            com.server.auditor.ssh.client.widget.a1 a1Var = this.I;
            if (a1Var != null) {
                a1Var.dismiss();
                return;
            }
            return;
        }
        Nh(kh(aVar), com.server.auditor.ssh.client.ui.vaults.data.a.b(aVar.f()));
        if (Ah()) {
            qh(aVar);
        } else {
            rh(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        View view;
        Handler handler;
        super.onActivityResult(i10, i11, intent);
        Runnable runnable = (Runnable) this.H.get(i10);
        this.H.remove(i10);
        if (i11 != -1 || runnable == null || (view = getView()) == null || (handler = view.getHandler()) == null) {
            return;
        }
        handler.post(runnable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        if (((Boolean) SessionManager.getInstance().terminalSessionHelper.isTabletLayout().getValue()).booleanValue()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            ((DirtyCheckViewModel) new l1(fragmentActivityRequireActivity).a(DirtyCheckViewModel.class)).registerDirtyCheck(mh(), new d(null));
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws IOException {
        VaultKeyId vaultKeyIdA;
        ChainingHost chainHostAppModelByConfigId;
        super.onCreate(bundle);
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new e(null), 3, null);
        tp.l0.a(this);
        if (gh() == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bi(arguments.getBoolean("bundle_vault_should_be_locked", false));
                if (xh()) {
                    VaultKeyId vaultKeyIdA2 = (VaultKeyId) j4.c.a(arguments, "bundle_vault_key_id_to_be_locked", VaultKeyId.class);
                    if (vaultKeyIdA2 == null) {
                        vaultKeyIdA2 = VaultKeyId.Companion.a();
                    }
                    if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyIdA2)) {
                        ng(vaultKeyIdA2);
                        qg(vaultKeyIdA2);
                    }
                }
            }
            long j10 = arguments != null ? arguments.getLong("chainhosts_sshconfig_id") : -1L;
            if (j10 != -1 && (chainHostAppModelByConfigId = hg.f.p().c().getChainHostAppModelByConfigId(Long.valueOf(j10))) != null) {
                Df().f24943j = chainHostAppModelByConfigId;
            }
            Zh(this.E.getItemByLocalId(arguments != null ? arguments.getLong("edit_group_model_id") : -1L));
            if (arguments == null || (vaultKeyIdA = (VaultKeyId) j4.c.a(arguments, "parent_group_vault_key_id", VaultKeyId.class)) == null) {
                vaultKeyIdA = VaultKeyId.Companion.a();
            }
            Sg(vaultKeyIdA);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ((DirtyCheckViewModel) new l1(fragmentActivityRequireActivity).a(DirtyCheckViewModel.class)).unregisterDirtyCheck(mh());
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jh.x xVarFf = Ff();
        if (xVarFf != null) {
            xVarFf.wf();
        }
    }

    @Override // com.server.auditor.ssh.client.fragments.editors.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        lg(Df().f24935b);
        zf().f73252d.setVisibility(8);
        GroupDBModel groupDBModelGh = gh();
        if (groupDBModelGh != null) {
            Df().f24944k = groupDBModelGh.isShared();
            VaultKeyId vaultKeyId = groupDBModelGh.getVaultKeyId();
            ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
            ng(vaultKeyId);
            VaultKeyId vaultKeyId2 = groupDBModelGh.getVaultKeyId();
            ju.t.e(vaultKeyId2, "<get-vaultKeyId>(...)");
            qg(vaultKeyId2);
        } else {
            Ag();
            Df().f24944k = true ^ com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf());
            ng(Lf());
            String str = Df().f24945l;
            if (str != null) {
                Yh(str);
            } else {
                Yh("no_credentials_sharing");
            }
        }
        vh();
        di(fh());
        this.L.a(Lf(), this);
        ji(ch());
        Nf().setInitialEditorDataHashCode(bh());
    }

    @Override // dl.b.a
    public void v7(boolean z10) {
        ci(false);
        zf().f73251c.setEnabled(false);
        zf().f73261m.setEnabled(false);
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
        ki();
        if (wh()) {
            bg();
        }
        if (z10) {
            gi();
        }
    }
}
