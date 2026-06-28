package com.server.auditor.ssh.client.synchronization;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;
import to.l2;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class VaultsApiCoroutineHelper {
    public static final int $stable = 8;
    private final to.c cachePersonalVaultSessionLogsSettingUseCase;
    private final to.d cacheVaultSessionLogsSettingUseCase;
    private final pp.g requestPersonalVaultApiInteractor;
    private final pp.i requestVaultsApiInteractor;
    private final l2 syncSessionLogsLocallyUseCase;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final gj.b vaultsDbInteractor;
    private final vl.g vaultsDbRepository;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestPersonalVaultData$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper", f = "VaultsApiCoroutineHelper.kt", l = {44, 46, 49}, m = "requestPersonalVaultData")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(zt.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RtlSpacingHelper.UNDEFINED;
            return VaultsApiCoroutineHelper.this.requestPersonalVaultData(this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestVaults$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper", f = "VaultsApiCoroutineHelper.kt", l = {61, 63, 66, 69}, m = "requestVaults")
    static final class C14741 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14741(zt.e<? super C14741> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RtlSpacingHelper.UNDEFINED;
            return VaultsApiCoroutineHelper.this.requestVaults(this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$selectAllVaultsIfNothingSelected$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper", f = "VaultsApiCoroutineHelper.kt", l = {143, 147}, m = "selectAllVaultsIfNothingSelected")
    static final class C14751 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C14751(zt.e<? super C14751> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RtlSpacingHelper.UNDEFINED;
            return VaultsApiCoroutineHelper.this.selectAllVaultsIfNothingSelected(this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$updateDbByBackendValues$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper", f = "VaultsApiCoroutineHelper.kt", l = {89, 91, 105, 112}, m = "updateDbByBackendValues")
    static final class C14761 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14761(zt.e<? super C14761> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RtlSpacingHelper.UNDEFINED;
            return VaultsApiCoroutineHelper.this.updateDbByBackendValues(null, this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$updateVaultsListBlocking$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper", f = "VaultsApiCoroutineHelper.kt", l = {35, 37, 40}, m = "updateVaultsListBlocking")
    static final class C14771 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C14771(zt.e<? super C14771> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RtlSpacingHelper.UNDEFINED;
            return VaultsApiCoroutineHelper.this.updateVaultsListBlocking(this);
        }
    }

    public VaultsApiCoroutineHelper(com.server.auditor.ssh.client.app.a aVar, gj.b bVar, vl.g gVar, pp.i iVar, l2 l2Var, pp.g gVar2, to.d dVar, to.c cVar) {
        t.f(aVar, "termiusStorage");
        t.f(bVar, "vaultsDbInteractor");
        t.f(gVar, "vaultsDbRepository");
        t.f(iVar, "requestVaultsApiInteractor");
        t.f(l2Var, "syncSessionLogsLocallyUseCase");
        t.f(gVar2, "requestPersonalVaultApiInteractor");
        t.f(dVar, "cacheVaultSessionLogsSettingUseCase");
        t.f(cVar, "cachePersonalVaultSessionLogsSettingUseCase");
        this.termiusStorage = aVar;
        this.vaultsDbInteractor = bVar;
        this.vaultsDbRepository = gVar;
        this.requestVaultsApiInteractor = iVar;
        this.syncSessionLogsLocallyUseCase = l2Var;
        this.requestPersonalVaultApiInteractor = gVar2;
        this.cacheVaultSessionLogsSettingUseCase = dVar;
        this.cachePersonalVaultSessionLogsSettingUseCase = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteIrrelevantCachedVaults(List<tl.l2> list, List<VaultApiModel> list2, zt.e<? super m0> eVar) {
        ArrayList arrayList = new ArrayList(v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tl.l2) it.next()).g());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!com.server.auditor.ssh.client.ui.vaults.data.a.b((VaultKeyId) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(v.z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(com.server.auditor.ssh.client.ui.vaults.data.a.d(((VaultApiModel) it2.next()).getOriginalKey()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!com.server.auditor.ssh.client.ui.vaults.data.a.b((VaultKeyId) obj2)) {
                arrayList4.add(obj2);
            }
        }
        Object objC = this.vaultsDbRepository.c(v.d1(v.S0(arrayList2, v.i1(arrayList4))), eVar);
        return objC == au.b.f() ? objC : m0.f82633a;
    }

    private final List<VaultApiModel> filterOutOtherVaults(List<VaultApiModel> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!sp.a.d((VaultApiModel) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r7.a(r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestPersonalVaultData(zt.e<? super ut.m0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestPersonalVaultData$1 r0 = (com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestPersonalVaultData$1 r0 = new com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestPersonalVaultData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = au.b.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ut.x.b(r7)
            goto L78
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            ut.x.b(r7)
            goto L64
        L3b:
            ut.x.b(r7)
            goto L4d
        L3f:
            ut.x.b(r7)
            pp.g r7 = r6.requestPersonalVaultApiInteractor
            r0.label = r5
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L4d
            goto L77
        L4d:
            pp.g$a r7 = (pp.g.a) r7
            boolean r2 = r7 instanceof pp.g.a.b
            if (r2 == 0) goto L7b
            to.c r2 = r6.cachePersonalVaultSessionLogsSettingUseCase
            pp.g$a$b r7 = (pp.g.a.b) r7
            com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload r7 = r7.a()
            r0.label = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L64
            goto L77
        L64:
            to.l2 r7 = r6.syncSessionLogsLocallyUseCase
            android.content.Context r2 = com.server.auditor.ssh.client.app.TermiusApplication.F()
            java.lang.String r4 = "getTermiusAppContext(...)"
            ju.t.e(r2, r4)
            r0.label = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L7b:
            pp.g$a$a r0 = pp.g.a.C1104a.f70518a
            boolean r7 = ju.t.b(r7, r0)
            if (r7 == 0) goto L86
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L86:
            ut.s r7 = new ut.s
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.requestPersonalVaultData(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r8.a(r2, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestVaults(zt.e<? super ut.m0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14741
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestVaults$1 r0 = (com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestVaults$1 r0 = new com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$requestVaults$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = au.b.f()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            ut.x.b(r8)
            goto L9d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            ut.x.b(r8)
            goto L89
        L3e:
            java.lang.Object r2 = r0.L$0
            pp.i$a r2 = (pp.i.a) r2
            ut.x.b(r8)
            goto L75
        L46:
            ut.x.b(r8)
            goto L58
        L4a:
            ut.x.b(r8)
            pp.i r8 = r7.requestVaultsApiInteractor
            r0.label = r6
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L58
            goto L9c
        L58:
            r2 = r8
            pp.i$a r2 = (pp.i.a) r2
            boolean r8 = r2 instanceof pp.i.a.b
            if (r8 == 0) goto La0
            r8 = r2
            pp.i$a$b r8 = (pp.i.a.b) r8
            java.util.List r8 = r8.b()
            java.util.List r8 = r7.filterOutOtherVaults(r8)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r7.updateDbByBackendValues(r8, r0)
            if (r8 != r1) goto L75
            goto L9c
        L75:
            to.d r8 = r7.cacheVaultSessionLogsSettingUseCase
            pp.i$a$b r2 = (pp.i.a.b) r2
            java.util.List r2 = r2.a()
            r5 = 0
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L89
            goto L9c
        L89:
            to.l2 r8 = r7.syncSessionLogsLocallyUseCase
            android.content.Context r2 = com.server.auditor.ssh.client.app.TermiusApplication.F()
            java.lang.String r4 = "getTermiusAppContext(...)"
            ju.t.e(r2, r4)
            r0.label = r3
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L9d
        L9c:
            return r1
        L9d:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        La0:
            pp.i$a$a r8 = pp.i.a.C1106a.f70536a
            boolean r8 = ju.t.b(r2, r8)
            if (r8 == 0) goto Lab
            ut.m0 r8 = ut.m0.f82633a
            return r8
        Lab:
            ut.s r8 = new ut.s
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.requestVaults(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r4.e(r6, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectAllVaultsIfNothingSelected(zt.e<? super ut.m0> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14751
            if (r2 == 0) goto L17
            r2 = r1
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$selectAllVaultsIfNothingSelected$1 r2 = (com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14751) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$selectAllVaultsIfNothingSelected$1 r2 = new com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$selectAllVaultsIfNothingSelected$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = au.b.f()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            ut.x.b(r1)
            goto Lad
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            ut.x.b(r1)
            goto L4b
        L3d:
            ut.x.b(r1)
            gj.b r1 = r0.vaultsDbInteractor
            r2.label = r6
            java.lang.Object r1 = r1.d(r2)
            if (r1 != r3) goto L4b
            goto Lac
        L4b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L56
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L56
            goto L6f
        L56:
            java.util.Iterator r4 = r1.iterator()
        L5a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r4.next()
            tl.l2 r6 = (tl.l2) r6
            boolean r6 = r6.i()
            if (r6 == 0) goto L5a
            ut.m0 r1 = ut.m0.f82633a
            return r1
        L6f:
            gj.b r4 = r0.vaultsDbInteractor
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = vt.v.z(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L80:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto La4
            java.lang.Object r7 = r1.next()
            r8 = r7
            tl.l2 r8 = (tl.l2) r8
            r18 = 63
            r19 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            tl.l2 r7 = tl.l2.b(r8, r9, r11, r12, r14, r15, r16, r17, r18, r19)
            r6.add(r7)
            goto L80
        La4:
            r2.label = r5
            java.lang.Object r1 = r4.e(r6, r2)
            if (r1 != r3) goto Lad
        Lac:
            return r3
        Lad:
            ut.m0 r1 = ut.m0.f82633a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.selectAllVaultsIfNothingSelected(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[LOOP:2: B:38:0x00b4->B:40:0x00ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDbByBackendValues(java.util.List<com.server.auditor.ssh.client.synchronization.api.models.VaultApiModel> r24, zt.e<? super ut.m0> r25) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.updateDbByBackendValues(java.util.List, zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (selectAllVaultsIfNothingSelected(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateVaultsListBlocking(zt.e<? super ut.m0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14771
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$updateVaultsListBlocking$1 r0 = (com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.C14771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$updateVaultsListBlocking$1 r0 = new com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper$updateVaultsListBlocking$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = au.b.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ut.x.b(r7)
            goto L61
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            ut.x.b(r7)
            goto L58
        L3b:
            ut.x.b(r7)
            com.server.auditor.ssh.client.app.a r7 = r6.termiusStorage
            boolean r7 = r7.z0()
            if (r7 == 0) goto L4f
            r0.label = r5
            java.lang.Object r7 = r6.requestVaults(r0)
            if (r7 != r1) goto L58
            goto L60
        L4f:
            r0.label = r4
            java.lang.Object r7 = r6.requestPersonalVaultData(r0)
            if (r7 != r1) goto L58
            goto L60
        L58:
            r0.label = r3
            java.lang.Object r7 = r6.selectAllVaultsIfNothingSelected(r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.VaultsApiCoroutineHelper.updateVaultsListBlocking(zt.e):java.lang.Object");
    }
}
