package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import android.content.SharedPreferences;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.m;
import hg.b2;
import java.util.Iterator;
import ju.k;
import ju.t;
import tp.g0;
import ut.m0;
import zt.e;
import zu.f;
import zu.g;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionLogsPromoBannerRepository {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40470b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40471c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f40472a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SessionLogsPromoBannerType {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ SessionLogsPromoBannerType[] $VALUES;
        private final String promoType;
        public static final SessionLogsPromoBannerType ENABLE_SYNC = new SessionLogsPromoBannerType("ENABLE_SYNC", 0, "enable_session_logs_sync");
        public static final SessionLogsPromoBannerType ENABLE_SHARING = new SessionLogsPromoBannerType("ENABLE_SHARING", 1, "enable_session_logs_sharing");
        public static final SessionLogsPromoBannerType ENABLE_RETENTION = new SessionLogsPromoBannerType("ENABLE_RETENTION", 2, "enable_session_logs_retention");

        private static final /* synthetic */ SessionLogsPromoBannerType[] $values() {
            return new SessionLogsPromoBannerType[]{ENABLE_SYNC, ENABLE_SHARING, ENABLE_RETENTION};
        }

        static {
            SessionLogsPromoBannerType[] sessionLogsPromoBannerTypeArr$values = $values();
            $VALUES = sessionLogsPromoBannerTypeArr$values;
            $ENTRIES = bu.b.a(sessionLogsPromoBannerTypeArr$values);
        }

        private SessionLogsPromoBannerType(String str, int i10, String str2) {
            this.promoType = str2;
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static SessionLogsPromoBannerType valueOf(String str) {
            return (SessionLogsPromoBannerType) Enum.valueOf(SessionLogsPromoBannerType.class, str);
        }

        public static SessionLogsPromoBannerType[] values() {
            return (SessionLogsPromoBannerType[]) $VALUES.clone();
        }

        public final String getPromoType() {
            return this.promoType;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f40473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionLogsPromoBannerRepository f40474b;

        public static final class a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f40475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SessionLogsPromoBannerRepository f40476b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository$b$a$a, reason: collision with other inner class name */
            public static final class C0635a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f40477a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f40478b;

                public C0635a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40477a = obj;
                    this.f40478b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(g gVar, SessionLogsPromoBannerRepository sessionLogsPromoBannerRepository) {
                this.f40475a = gVar;
                this.f40476b = sessionLogsPromoBannerRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zt.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository.b.a.C0635a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository$b$a$a r0 = (com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository.b.a.C0635a) r0
                    int r1 = r0.f40478b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40478b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository$b$a$a r0 = new com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40477a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f40478b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    ut.x.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    ut.x.b(r6)
                    zu.g r6 = r4.f40475a
                    java.lang.String r5 = (java.lang.String) r5
                    com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository r2 = r4.f40476b
                    com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository$SessionLogsPromoBannerType r5 = com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository.a(r2, r5)
                    r0.f40478b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    ut.m0 r5 = ut.m0.f82633a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository.b.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public b(f fVar, SessionLogsPromoBannerRepository sessionLogsPromoBannerRepository) {
            this.f40473a = fVar;
            this.f40474b = sessionLogsPromoBannerRepository;
        }

        @Override // zu.f
        public Object collect(g gVar, e eVar) {
            Object objCollect = this.f40473a.collect(new a(gVar, this.f40474b), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    public SessionLogsPromoBannerRepository(g0 g0Var) {
        t.f(g0Var, "liveSharedPreferences");
        this.f40472a = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionLogsPromoBannerType e(String str) {
        Object obj = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        Iterator<E> it = SessionLogsPromoBannerType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (t.b(((SessionLogsPromoBannerType) next).getPromoType(), str)) {
                obj = next;
                break;
            }
        }
        return (SessionLogsPromoBannerType) obj;
    }

    public final SessionLogsPromoBannerType b() {
        return e(this.f40472a.d().getString("KEY_SESSION_LOGS_PROMO_BANNER_TYPE", ""));
    }

    public final f c() {
        return new b(m.a(this.f40472a.e("KEY_SESSION_LOGS_PROMO_BANNER_TYPE", "")), this);
    }

    public final void d(SessionLogsPromoBannerType sessionLogsPromoBannerType) {
        SharedPreferences.Editor editorEdit = this.f40472a.d().edit();
        editorEdit.putString("KEY_SESSION_LOGS_PROMO_BANNER_TYPE", sessionLogsPromoBannerType != null ? sessionLogsPromoBannerType.getPromoType() : null);
        editorEdit.apply();
    }

    public /* synthetic */ SessionLogsPromoBannerRepository(g0 g0Var, int i10, k kVar) {
        this((i10 & 1) != 0 ? b2.f52944a.y1() : g0Var);
    }
}
