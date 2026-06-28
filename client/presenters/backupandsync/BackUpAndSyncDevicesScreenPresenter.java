package com.server.auditor.ssh.client.presenters.backupandsync;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.f0;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.interactors.h0;
import com.server.auditor.ssh.client.models.b;
import com.server.auditor.ssh.client.models.c;
import com.server.auditor.ssh.client.synchronization.api.models.MobileDeviceHelper;
import com.server.auditor.ssh.client.synchronization.api.models.UserActiveDeviceResponse;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import hg.b2;
import il.a0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import tp.d1;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import yi.a;

/* JADX INFO: loaded from: classes4.dex */
public final class BackUpAndSyncDevicesScreenPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.d> implements h0.a, a.InterfaceC1405a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f37034w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f37035x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37036a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f37037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yi.a f37038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MobileDeviceHelper f37039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.models.a f37040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f37041f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k0 f37042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.server.auditor.ssh.client.models.d f37043v;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37044a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37044a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.getViewState().u5();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37046a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37049b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37051d;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37049b = obj;
            this.f37051d |= RtlSpacingHelper.UNDEFINED;
            return BackUpAndSyncDevicesScreenPresenter.this.F2(0, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37052a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37054c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new e(this.f37054c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37052a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter backUpAndSyncDevicesScreenPresenter = BackUpAndSyncDevicesScreenPresenter.this;
                int i11 = this.f37054c;
                this.f37052a = 1;
                if (backUpAndSyncDevicesScreenPresenter.F2(i11, this) == objF) {
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37055a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37057c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new f(this.f37057c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37055a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter backUpAndSyncDevicesScreenPresenter = BackUpAndSyncDevicesScreenPresenter.this;
                int i11 = this.f37057c;
                this.f37055a = 1;
                if (backUpAndSyncDevicesScreenPresenter.F2(i11, this) == objF) {
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37060c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new g(this.f37060c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.H2(this.f37060c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37061a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37063c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new h(this.f37063c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.H2(this.f37063c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37064a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37066c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new i(this.f37066c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37064a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter backUpAndSyncDevicesScreenPresenter = BackUpAndSyncDevicesScreenPresenter.this;
                int i11 = this.f37066c;
                this.f37064a = 1;
                if (backUpAndSyncDevicesScreenPresenter.F2(i11, this) == objF) {
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
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37067a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37069c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, zt.e eVar) {
            super(2, eVar);
            this.f37069c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new j(this.f37069c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37067a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter backUpAndSyncDevicesScreenPresenter = BackUpAndSyncDevicesScreenPresenter.this;
                int i11 = this.f37069c;
                this.f37067a = 1;
                if (backUpAndSyncDevicesScreenPresenter.F2(i11, this) == objF) {
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
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37070a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37070a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.E2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37072a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37072a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.E2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37074a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37076c;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yt.a.e(((com.server.auditor.ssh.client.models.a) obj2).e(), ((com.server.auditor.ssh.client.models.a) obj).e());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, zt.e eVar) {
            super(2, eVar);
            this.f37076c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new m(this.f37076c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.server.auditor.ssh.client.models.a aVar;
            au.b.f();
            if (this.f37074a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.f37042u.n(c.a.f27898a);
            List listU = v.u(BackUpAndSyncDevicesScreenPresenter.this.f37040e);
            List<UserActiveDeviceResponse> list = this.f37076c;
            BackUpAndSyncDevicesScreenPresenter backUpAndSyncDevicesScreenPresenter = BackUpAndSyncDevicesScreenPresenter.this;
            ArrayList arrayList = new ArrayList();
            for (UserActiveDeviceResponse userActiveDeviceResponse : list) {
                if (t.b(userActiveDeviceResponse.getToken(), backUpAndSyncDevicesScreenPresenter.f37040e.h())) {
                    aVar = null;
                } else {
                    int id2 = userActiveDeviceResponse.getId();
                    UserDeviceType deviceType = userActiveDeviceResponse.getDeviceType();
                    String latestActivity = userActiveDeviceResponse.getLatestActivity();
                    if (latestActivity == null) {
                        latestActivity = "";
                    }
                    aVar = new com.server.auditor.ssh.client.models.a(id2, deviceType, d1.e(latestActivity), userActiveDeviceResponse.isAbleToLogOut(), userActiveDeviceResponse.getName(), userActiveDeviceResponse.getSubName(), userActiveDeviceResponse.getToken(), userActiveDeviceResponse.getPushToken(), userActiveDeviceResponse.getOsVersion(), userActiveDeviceResponse.getAppVersion(), false, null, 3072, null);
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            v.Y0(v.R0(arrayList, new a()), listU);
            BackUpAndSyncDevicesScreenPresenter.this.f37041f.n(listU);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37077a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37077a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.E2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37079a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37079a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreenPresenter.this.E2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.models.a f37083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(com.server.auditor.ssh.client.models.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f37083c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new p(this.f37083c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37081a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter.this.J2(this.f37083c.d(), b.c.f27897a);
                yi.a aVar = BackUpAndSyncDevicesScreenPresenter.this.f37038c;
                int iD = this.f37083c.d();
                this.f37081a = 1;
                if (aVar.b(iD, this) == objF) {
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
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37084a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreenPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37084a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDevicesScreenPresenter.this.f37042u.n(c.C0447c.f27900a);
                h0 h0Var = BackUpAndSyncDevicesScreenPresenter.this.f37037b;
                this.f37084a = 1;
                if (h0Var.b(this) == objF) {
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
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncDevicesScreenPresenter() {
        b2 b2Var = b2.f52944a;
        this.f37037b = new h0(new a0(b2Var.O1()), this);
        this.f37038c = new yi.a(new nl.a(b2Var.O1()), this);
        MobileDeviceHelper mobileDeviceHelper = new MobileDeviceHelper();
        this.f37039d = mobileDeviceHelper;
        UserDeviceType userDeviceType = UserDeviceType.GOOGLE;
        Boolean bool = Boolean.FALSE;
        String name = mobileDeviceHelper.getName();
        t.e(name, "getName(...)");
        String subName = mobileDeviceHelper.getSubName();
        String token = mobileDeviceHelper.getToken();
        t.e(token, "getToken(...)");
        this.f37040e = new com.server.auditor.ssh.client.models.a(-1, userDeviceType, null, bool, name, subName, token, null, mobileDeviceHelper.getOsVersion(), mobileDeviceHelper.getAppVersion(), true, null, 2048, null);
        this.f37041f = new k0(v.o());
        this.f37042u = new k0();
        this.f37043v = new com.server.auditor.ssh.client.models.d(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        this.f37041f.n(v.e(this.f37040e));
        this.f37042u.n(c.b.f27899a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F2(int r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter.d
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter$d r0 = (com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter.d) r0
            int r1 = r0.f37051d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37051d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter$d r0 = new com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37049b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f37051d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f37048a
            ut.x.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ut.x.b(r6)
            com.server.auditor.ssh.client.models.b$b r6 = com.server.auditor.ssh.client.models.b.C0446b.f27896a
            r4.J2(r5, r6)
            r0.f37048a = r5
            r0.f37051d = r3
            r2 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r6 = wu.s0.b(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.server.auditor.ssh.client.models.b$a r6 = com.server.auditor.ssh.client.models.b.a.f27895a
            r4.J2(r5, r6)
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter.F2(int, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(int i10) {
        List listG1;
        List list = (List) this.f37041f.f();
        if (list == null || (listG1 = v.g1(list)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG1) {
            if (((com.server.auditor.ssh.client.models.a) obj).d() != i10) {
                arrayList.add(obj);
            }
        }
        this.f37041f.n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(int i10, com.server.auditor.ssh.client.models.b bVar) {
        List<com.server.auditor.ssh.client.models.a> list = (List) this.f37041f.f();
        if (list != null) {
            ArrayList arrayList = new ArrayList(v.z(list, 10));
            for (com.server.auditor.ssh.client.models.a aVarB : list) {
                if (aVarB.d() == i10) {
                    aVarB = com.server.auditor.ssh.client.models.a.b(aVarB, 0, null, null, null, null, null, null, null, null, null, false, bVar, 2047, null);
                }
                arrayList.add(aVarB);
            }
            this.f37041f.n(arrayList);
        }
    }

    public final f0 A2() {
        return h1.c(this.f37042u);
    }

    public final f0 B2() {
        return h1.c(this.f37041f);
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.h0.a
    public void D(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void G2(com.server.auditor.ssh.client.models.a aVar) {
        t.f(aVar, "device");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(aVar, null), 3, null);
    }

    @Override // yi.a.InterfaceC1405a
    public void I0(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(i10, null), 3, null);
    }

    public final void I2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.h0.a
    public void P1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    @Override // yi.a.InterfaceC1405a
    public void W0(int i10, String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(i10, null), 3, null);
    }

    @Override // yi.a.InterfaceC1405a
    public void W1(int i10, int i11) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(i10, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.h0.a
    public void X() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    @Override // yi.a.InterfaceC1405a
    public void j0(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(i10, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.h0.a
    public void n0(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.f37036a.n0();
        getViewState().a();
        getViewState().N1();
        I2();
    }

    @Override // yi.a.InterfaceC1405a
    public void q(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(i10, null), 3, null);
    }

    @Override // yi.a.InterfaceC1405a
    public void u1(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(i10, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.h0.a
    public void v0(List list) {
        t.f(list, "userActiveDevices");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(list, null), 3, null);
    }

    public final com.server.auditor.ssh.client.models.d z2() {
        return this.f37043v;
    }
}
