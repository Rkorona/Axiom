package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKey;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeyDevice;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeyUser;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f27384d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27385e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final SimpleDateFormat f27386f = new SimpleDateFormat("MMM dd, yyy", Locale.ENGLISH);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.p0 f27387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f27388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27389c;

    public interface a {
        void W3();

        void d6();

        void t7(CharSequence charSequence);
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27394e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27396u;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27394e = obj;
            this.f27396u |= RtlSpacingHelper.UNDEFINED;
            return g.this.b(null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27397a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ju.m0 f27399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ju.m0 m0Var, zt.e eVar) {
            super(2, eVar);
            this.f27399c = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new d(this.f27399c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27397a;
            if (i10 == 0) {
                ut.x.b(obj);
                il.p0 p0Var = g.this.f27387a;
                SnippetDBModel snippetDBModel = (SnippetDBModel) this.f27399c.f62948a;
                this.f27397a = 1;
                if (p0Var.c(snippetDBModel, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27400a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ju.m0 f27402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ju.m0 m0Var, zt.e eVar) {
            super(2, eVar);
            this.f27402c = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new e(this.f27402c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27400a;
            if (i10 == 0) {
                ut.x.b(obj);
                il.p0 p0Var = g.this.f27387a;
                SnippetDBModel snippetDBModel = (SnippetDBModel) this.f27402c.f62948a;
                this.f27400a = 1;
                if (p0Var.d(snippetDBModel, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27403a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f27405c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new f(this.f27405c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27403a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            il.p0 p0Var = g.this.f27387a;
            String str = this.f27405c;
            this.f27403a = 1;
            Object objB = p0Var.b(str, this);
            return objB == objF ? objF : objB;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public g(il.p0 p0Var, com.server.auditor.ssh.client.utils.analytics.a aVar, a aVar2) {
        ju.t.f(p0Var, "snippetDBRepository");
        ju.t.f(aVar, "avoAnalytics");
        ju.t.f(aVar2, "callback");
        this.f27387a = p0Var;
        this.f27388b = aVar;
        this.f27389c = aVar2;
    }

    private final TeamPublicKeyDevice c(TeamPublicKeysByDevices teamPublicKeysByDevices, Long l10) {
        Object next;
        Iterator<T> it = teamPublicKeysByDevices.getDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long id2 = ((TeamPublicKeyDevice) next).getId();
            if (l10 != null && id2 == l10.longValue()) {
                break;
            }
        }
        return (TeamPublicKeyDevice) next;
    }

    private final TeamPublicKeyUser d(TeamPublicKeysByDevices teamPublicKeysByDevices, Long l10) {
        Object next;
        Iterator<T> it = teamPublicKeysByDevices.getUsers().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long id2 = ((TeamPublicKeyUser) next).getId();
            if (l10 != null && id2 == l10.longValue()) {
                break;
            }
        }
        return (TeamPublicKeyUser) next;
    }

    private final String f(String str, String str2, String str3, String str4) {
        String str5 = "# Multikey by Termius from " + str2 + " from " + str3 + "\n" + str + " Multikey by Termius from " + str2 + " " + str4;
        ju.t.e(str5, "toString(...)");
        return str5;
    }

    private final String g(TeamPublicKeysByDevices teamPublicKeysByDevices) {
        List<TeamPublicKey> publicKey = teamPublicKeysByDevices.getPublicKey();
        ArrayList<TeamPublicKey> arrayList = new ArrayList();
        for (Object obj : publicKey) {
            if (((TeamPublicKey) obj).getPublicKey() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (TeamPublicKey teamPublicKey : arrayList) {
            TeamPublicKeyDevice teamPublicKeyDeviceC = c(teamPublicKeysByDevices, Long.valueOf(teamPublicKey.getDeviceId()));
            String strF = null;
            TeamPublicKeyUser teamPublicKeyUserD = d(teamPublicKeysByDevices, teamPublicKeyDeviceC != null ? Long.valueOf(teamPublicKeyDeviceC.getUserId()) : null);
            if (teamPublicKeyUserD != null && teamPublicKey.getPublicKey() != null && teamPublicKeyDeviceC != null) {
                strF = f(teamPublicKey.getPublicKey(), teamPublicKeyUserD.getEmail(), teamPublicKeyDeviceC.getName(), teamPublicKey.getGeneratedAt());
            }
            if (strF != null) {
                arrayList2.add(strF);
            }
        }
        return vt.v.z0(arrayList2, "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (wu.i.g(r1, r2, r3) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (wu.i.g(r1, r2, r3) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, java.lang.String r18, com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices r19, zt.e r20) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g.b(java.lang.String, java.lang.String, com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices, zt.e):java.lang.Object");
    }

    public final Object e(TeamPublicKeysByDevices teamPublicKeysByDevices, zt.e eVar) {
        this.f27388b.h1();
        String strG = g(teamPublicKeysByDevices);
        f27386f.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strG);
        sb2.append("\n");
        a aVar = this.f27389c;
        ju.t.c(sb2);
        aVar.t7(sb2);
        return ut.m0.f82633a;
    }
}
