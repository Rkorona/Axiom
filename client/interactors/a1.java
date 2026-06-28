package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.synchronization.BulkModelCreatorFactory;
import com.server.auditor.ssh.client.synchronization.BulkResponseHandler;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkBadRequest;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import java.util.List;
import og.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og.w f27256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BulkResponseHandler f27257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BulkModelCreatorFactory f27258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f27259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f27260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f27261f;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27262a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.a1$a$a, reason: collision with other inner class name */
        public static final class C0430a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final BulkBadRequest f27264c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0430a(int i10, BulkBadRequest bulkBadRequest) {
                super(i10, null);
                ju.t.f(bulkBadRequest, "bulkBadRequest");
                this.f27263b = i10;
                this.f27264c = bulkBadRequest;
            }

            @Override // com.server.auditor.ssh.client.interactors.a1.a
            public int a() {
                return this.f27263b;
            }

            public final BulkBadRequest b() {
                return this.f27264c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0430a)) {
                    return false;
                }
                C0430a c0430a = (C0430a) obj;
                return this.f27263b == c0430a.f27263b && ju.t.b(this.f27264c, c0430a.f27264c);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f27263b) * 31) + this.f27264c.hashCode();
            }

            public String toString() {
                return "Failed(resultCode=" + this.f27263b + ", bulkBadRequest=" + this.f27264c + ")";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f27265d = MinimalVersionErrorModel.$stable;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27266b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final MinimalVersionErrorModel f27267c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, MinimalVersionErrorModel minimalVersionErrorModel) {
                super(i10, null);
                ju.t.f(minimalVersionErrorModel, "model");
                this.f27266b = i10;
                this.f27267c = minimalVersionErrorModel;
            }

            @Override // com.server.auditor.ssh.client.interactors.a1.a
            public int a() {
                return this.f27266b;
            }

            public final MinimalVersionErrorModel b() {
                return this.f27267c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f27266b == bVar.f27266b && ju.t.b(this.f27267c, bVar.f27267c);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f27266b) * 31) + this.f27267c.hashCode();
            }

            public String toString() {
                return "MinimalVersionError(resultCode=" + this.f27266b + ", model=" + this.f27267c + ")";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f27269c;

            public c(int i10, String str) {
                super(i10, null);
                this.f27268b = i10;
                this.f27269c = str;
            }

            @Override // com.server.auditor.ssh.client.interactors.a1.a
            public int a() {
                return this.f27268b;
            }

            public final String b() {
                return this.f27269c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f27268b == cVar.f27268b && ju.t.b(this.f27269c, cVar.f27269c);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f27268b) * 31;
                String str = this.f27269c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Require2FAError(resultCode=" + this.f27268b + ", message=" + this.f27269c + ")";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27270b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final IllegalArgumentException f27271c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, IllegalArgumentException illegalArgumentException) {
                super(i10, null);
                ju.t.f(illegalArgumentException, "exception");
                this.f27270b = i10;
                this.f27271c = illegalArgumentException;
            }

            @Override // com.server.auditor.ssh.client.interactors.a1.a
            public int a() {
                return this.f27270b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f27270b == dVar.f27270b && ju.t.b(this.f27271c, dVar.f27271c);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f27270b) * 31) + this.f27271c.hashCode();
            }

            public String toString() {
                return "SerializationError(resultCode=" + this.f27270b + ", exception=" + this.f27271c + ")";
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27272b;

            public e(int i10) {
                super(i10, null);
                this.f27272b = i10;
            }

            @Override // com.server.auditor.ssh.client.interactors.a1.a
            public int a() {
                return this.f27272b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f27272b == ((e) obj).f27272b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f27272b);
            }

            public String toString() {
                return "Success(resultCode=" + this.f27272b + ")";
            }
        }

        public static final class f extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f27273b = new f();

            private f() {
                super(0, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -39170863;
            }

            public String toString() {
                return "UnableToCreateBulkModel";
            }
        }

        public static final class g extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f27274b = new g();

            private g() {
                super(0, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 1749407226;
            }

            public String toString() {
                return "UnknownError";
            }
        }

        public /* synthetic */ a(int i10, ju.k kVar) {
            this(i10);
        }

        public int a() {
            return this.f27262a;
        }

        private a(int i10) {
            this.f27262a = i10;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27277c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27279e;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27277c = obj;
            this.f27279e |= RtlSpacingHelper.UNDEFINED;
            return a1.this.b(null, null, null, false, false, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27282c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27284e;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27282c = obj;
            this.f27284e |= RtlSpacingHelper.UNDEFINED;
            return a1.this.d(null, null, null, false, false, this);
        }
    }

    public a1(og.w wVar, BulkResponseHandler bulkResponseHandler, BulkModelCreatorFactory bulkModelCreatorFactory, i iVar, h hVar, j jVar) {
        ju.t.f(wVar, "terminalSyncRestApiRepository");
        ju.t.f(bulkResponseHandler, "bulkResponseHandler");
        ju.t.f(bulkModelCreatorFactory, "bulkModelCreatorFactory");
        ju.t.f(iVar, "createRemoteCryptorUseCase");
        ju.t.f(hVar, "createRemoteAnnotationCryptorUseCase");
        ju.t.f(jVar, "createTeamAnnotationCryptorsUseCase");
        this.f27256a = wVar;
        this.f27257b = bulkResponseHandler;
        this.f27258c = bulkModelCreatorFactory;
        this.f27259d = iVar;
        this.f27260e = hVar;
        this.f27261f = jVar;
    }

    private final a a(w.a aVar, rg.a aVar2) {
        if (aVar instanceof w.a.b) {
            w.a.b bVar = (w.a.b) aVar;
            return this.f27257b.handleBulkBody(bVar.a(), aVar2) ? new a.e(bVar.b()) : a.g.f27274b;
        }
        if (!(aVar instanceof w.a.C1056a)) {
            return a.g.f27274b;
        }
        w.a.C1056a c1056a = (w.a.C1056a) aVar;
        return this.f27257b.handleErrorResponse(c1056a.a(), c1056a.b());
    }

    private final rg.a c(dq.s sVar, List list, boolean z10, boolean z11) {
        return new rg.a(this.f27260e.a(this.f27259d.a(z10, sVar), z10), j.b(this.f27261f, z11, list, false, 4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [dq.s] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, dq.s r6, java.util.List r7, boolean r8, boolean r9, zt.e r10) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.interactors.a1.b
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.interactors.a1$b r0 = (com.server.auditor.ssh.client.interactors.a1.b) r0
            int r1 = r0.f27279e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27279e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.a1$b r0 = new com.server.auditor.ssh.client.interactors.a1$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27277c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27279e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f27276b
            rg.a r5 = (rg.a) r5
            java.lang.Object r6 = r0.f27275a
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            ut.x.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r5 = move-exception
            goto L72
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            ut.x.b(r10)
            rg.a r6 = r4.c(r6, r7, r8, r9)
            com.server.auditor.ssh.client.synchronization.BulkModelCreatorFactory r7 = r4.f27258c     // Catch: ow.k -> L78 java.lang.IllegalAccessException -> L81
            rg.h r8 = r6.f()     // Catch: ow.k -> L78 java.lang.IllegalAccessException -> L81
            rg.v r9 = r6.k()     // Catch: ow.k -> L78 java.lang.IllegalAccessException -> L81
            com.server.auditor.ssh.client.synchronization.BulkModelCreator r7 = r7.createBulkModelCreator(r8, r9)     // Catch: ow.k -> L78 java.lang.IllegalAccessException -> L81
            com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModel r5 = r7.getBulkModel(r3, r5)     // Catch: ow.k -> L78 java.lang.IllegalAccessException -> L81
            ju.t.c(r5)
            og.w r7 = r4.f27256a     // Catch: java.lang.Throwable -> L31
            r0.f27275a = r6     // Catch: java.lang.Throwable -> L31
            r0.f27276b = r6     // Catch: java.lang.Throwable -> L31
            r0.f27279e = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r7.b(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L66
            return r1
        L66:
            r5 = r6
        L67:
            og.w$a r10 = (og.w.a) r10     // Catch: java.lang.Throwable -> L31
            com.server.auditor.ssh.client.interactors.a1$a r5 = r4.a(r10, r5)     // Catch: java.lang.Throwable -> L31
            r7 = 0
            gu.a.a(r6, r7)
            return r5
        L72:
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r7 = move-exception
            gu.a.a(r6, r5)
            throw r7
        L78:
            r5 = move-exception
            y9.a r6 = y9.a.f86838a
            r6.i(r5)
            com.server.auditor.ssh.client.interactors.a1$a$f r5 = com.server.auditor.ssh.client.interactors.a1.a.f.f27273b
            return r5
        L81:
            com.server.auditor.ssh.client.interactors.a1$a$f r5 = com.server.auditor.ssh.client.interactors.a1.a.f.f27273b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.a1.b(java.lang.String, dq.s, java.util.List, boolean, boolean, zt.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [dq.s] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, dq.s r6, java.util.List r7, boolean r8, boolean r9, zt.e r10) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.interactors.a1.c
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.interactors.a1$c r0 = (com.server.auditor.ssh.client.interactors.a1.c) r0
            int r1 = r0.f27284e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27284e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.a1$c r0 = new com.server.auditor.ssh.client.interactors.a1$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27282c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27284e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f27281b
            rg.a r5 = (rg.a) r5
            java.lang.Object r6 = r0.f27280a
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            ut.x.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L52
        L31:
            r5 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            ut.x.b(r10)
            rg.a r6 = r4.c(r6, r7, r8, r9)
            og.w r7 = r4.f27256a     // Catch: java.lang.Throwable -> L31
            r0.f27280a = r6     // Catch: java.lang.Throwable -> L31
            r0.f27281b = r6     // Catch: java.lang.Throwable -> L31
            r0.f27284e = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r7.a(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L51
            return r1
        L51:
            r5 = r6
        L52:
            og.w$a r10 = (og.w.a) r10     // Catch: java.lang.Throwable -> L31
            com.server.auditor.ssh.client.interactors.a1$a r5 = r4.a(r10, r5)     // Catch: java.lang.Throwable -> L31
            r7 = 0
            gu.a.a(r6, r7)
            return r5
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r7 = move-exception
            gu.a.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.a1.d(java.lang.String, dq.s, java.util.List, boolean, boolean, zt.e):java.lang.Object");
    }
}
