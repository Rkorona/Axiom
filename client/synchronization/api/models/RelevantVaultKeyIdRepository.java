package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import vl.g;
import wu.i0;
import wu.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RelevantVaultKeyIdRepository implements IRelevantVaultKeyIdRepository {
    public static final int $stable = 8;
    private final g vaultsRepository;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.api.models.RelevantVaultKeyIdRepository$getRelevantVaultKeyId$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.api.models.RelevantVaultKeyIdRepository$getRelevantVaultKeyId$1", f = "RelevantVaultKeyIdRepository.kt", l = {20}, m = "invokeSuspend")
    static final class AnonymousClass1 extends m implements p {
        int label;

        AnonymousClass1(zt.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return RelevantVaultKeyIdRepository.this.new AnonymousClass1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            g gVar = RelevantVaultKeyIdRepository.this.vaultsRepository;
            this.label = 1;
            Object objH = gVar.h(this);
            return objH == objF ? objF : objH;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super VaultKeyId> eVar) {
            return ((AnonymousClass1) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public RelevantVaultKeyIdRepository(g gVar) {
        t.f(gVar, "vaultsRepository");
        this.vaultsRepository = gVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository
    public VaultKeyId getRelevantVaultKeyId(boolean z10, VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "vaultKeyIdInDB");
        if (!com.server.auditor.ssh.client.ui.vaults.data.a.c(vaultKeyId) && (!com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId) || !z10)) {
            return vaultKeyId;
        }
        VaultKeyId vaultKeyId2 = (VaultKeyId) j.b(null, new AnonymousClass1(null), 1, null);
        return vaultKeyId2 == null ? VaultKeyId.Companion.a() : vaultKeyId2;
    }
}
