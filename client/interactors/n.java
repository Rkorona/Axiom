package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import uu.a;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.c f27460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rl.b f27461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UserAvatarDownloadAttemptTimestampRepository f27462c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f27464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27465c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27467e;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27465c = obj;
            this.f27467e |= RtlSpacingHelper.UNDEFINED;
            return n.this.c(null, 0L, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f27469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27470c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27472e;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27470c = obj;
            this.f27472e |= RtlSpacingHelper.UNDEFINED;
            return n.this.d(null, 0L, this);
        }
    }

    public n(il.c cVar, rl.b bVar, UserAvatarDownloadAttemptTimestampRepository userAvatarDownloadAttemptTimestampRepository) {
        ju.t.f(cVar, "avatarsCacheRepository");
        ju.t.f(bVar, "downloadUserAvatarRepository");
        ju.t.f(userAvatarDownloadAttemptTimestampRepository, "userAvatarDownloadAttemptTimestampRepository");
        this.f27460a = cVar;
        this.f27461b = bVar;
        this.f27462c = userAvatarDownloadAttemptTimestampRepository;
    }

    private final boolean b(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f27462c.b(j10);
        a.C1320a c1320a = uu.a.f82655b;
        return uu.a.n(uu.c.t(jCurrentTimeMillis, uu.d.f82664d), uu.c.s(24, uu.d.f82667u)) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r12, long r13, zt.e r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.server.auditor.ssh.client.interactors.n.a
            if (r0 == 0) goto L14
            r0 = r15
            com.server.auditor.ssh.client.interactors.n$a r0 = (com.server.auditor.ssh.client.interactors.n.a) r0
            int r1 = r0.f27467e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f27467e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.server.auditor.ssh.client.interactors.n$a r0 = new com.server.auditor.ssh.client.interactors.n$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f27465c
            java.lang.Object r0 = au.b.f()
            int r1 = r6.f27467e
            r2 = 4
            r7 = 3
            r3 = 2
            r4 = 1
            r8 = 0
            if (r1 == 0) goto L56
            if (r1 == r4) goto L4c
            if (r1 == r3) goto L42
            if (r1 == r7) goto L3e
            if (r1 != r2) goto L36
            ut.x.b(r15)
            goto Lbb
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3e:
            ut.x.b(r15)
            return r15
        L42:
            long r12 = r6.f27464b
            java.lang.Object r14 = r6.f27463a
            android.content.Context r14 = (android.content.Context) r14
            ut.x.b(r15)
            goto L91
        L4c:
            long r13 = r6.f27464b
            java.lang.Object r12 = r6.f27463a
            android.content.Context r12 = (android.content.Context) r12
            ut.x.b(r15)
            goto L72
        L56:
            ut.x.b(r15)
            com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository r15 = r11.f27462c
            long r9 = java.lang.System.currentTimeMillis()
            r15.d(r13, r9)
            rl.b r15 = r11.f27461b
            int r1 = (int) r13
            r6.f27463a = r12
            r6.f27464b = r13
            r6.f27467e = r4
            java.lang.Object r15 = r15.a(r1, r6)
            if (r15 != r0) goto L72
            goto Lba
        L72:
            rl.b$a r15 = (rl.b.a) r15
            boolean r1 = r15 instanceof rl.b.a.c
            if (r1 == 0) goto La8
            il.c r1 = r11.f27460a
            rl.b$a$c r15 = (rl.b.a.c) r15
            byte[] r5 = r15.a()
            r6.f27463a = r12
            r6.f27464b = r13
            r6.f27467e = r3
            r2 = r12
            r3 = r13
            java.lang.Object r15 = r1.c(r2, r3, r5, r6)
            r14 = r2
            if (r15 != r0) goto L90
            goto Lba
        L90:
            r12 = r3
        L91:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto La7
            il.c r15 = r11.f27460a
            r6.f27463a = r8
            r6.f27467e = r7
            java.lang.Object r12 = r15.h(r14, r12, r6)
            if (r12 != r0) goto La6
            goto Lba
        La6:
            return r12
        La7:
            return r8
        La8:
            r3 = r13
            r14 = r12
            boolean r12 = r15 instanceof rl.b.a.C1193b
            if (r12 == 0) goto Lbb
            il.c r12 = r11.f27460a
            r6.f27463a = r8
            r6.f27467e = r2
            java.lang.Object r12 = r12.f(r14, r3, r6)
            if (r12 != r0) goto Lbb
        Lba:
            return r0
        Lbb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.n.c(android.content.Context, long, zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r9, long r10, zt.e r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.server.auditor.ssh.client.interactors.n.b
            if (r0 == 0) goto L13
            r0 = r12
            com.server.auditor.ssh.client.interactors.n$b r0 = (com.server.auditor.ssh.client.interactors.n.b) r0
            int r1 = r0.f27472e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27472e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.n$b r0 = new com.server.auditor.ssh.client.interactors.n$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f27470c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27472e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ut.x.b(r12)
            goto L6e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            long r10 = r0.f27469b
            java.lang.Object r9 = r0.f27468a
            android.content.Context r9 = (android.content.Context) r9
            ut.x.b(r12)
            goto L58
        L3f:
            ut.x.b(r12)
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L49
            return r5
        L49:
            il.c r12 = r8.f27460a
            r0.f27468a = r9
            r0.f27469b = r10
            r0.f27472e = r4
            java.lang.Object r12 = r12.h(r9, r10, r0)
            if (r12 != r1) goto L58
            goto L6d
        L58:
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 != 0) goto L70
            boolean r12 = r8.b(r10)
            if (r12 != 0) goto L63
            return r5
        L63:
            r0.f27468a = r5
            r0.f27472e = r3
            java.lang.Object r12 = r8.c(r9, r10, r0)
            if (r12 != r1) goto L6e
        L6d:
            return r1
        L6e:
            android.net.Uri r12 = (android.net.Uri) r12
        L70:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.n.d(android.content.Context, long, zt.e):java.lang.Object");
    }
}
