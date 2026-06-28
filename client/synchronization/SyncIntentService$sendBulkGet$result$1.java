package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.interactors.a1;
import java.util.List;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$sendBulkGet$result$1", f = "SyncIntentService.kt", l = {1722}, m = "invokeSuspend")
final class SyncIntentService$sendBulkGet$result$1 extends kotlin.coroutines.jvm.internal.m implements iu.p {
    final /* synthetic */ pl.r $keyValidationResult;
    final /* synthetic */ dq.s $personalVaultKeyData;
    final /* synthetic */ a1 $terminalSyncApiInteractor;
    int label;
    final /* synthetic */ SyncIntentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncIntentService$sendBulkGet$result$1(a1 a1Var, dq.s sVar, pl.r rVar, SyncIntentService syncIntentService, zt.e<? super SyncIntentService$sendBulkGet$result$1> eVar) {
        super(2, eVar);
        this.$terminalSyncApiInteractor = a1Var;
        this.$personalVaultKeyData = sVar;
        this.$keyValidationResult = rVar;
        this.this$0 = syncIntentService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
        return new SyncIntentService$sendBulkGet$result$1(this.$terminalSyncApiInteractor, this.$personalVaultKeyData, this.$keyValidationResult, this.this$0, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
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
        a1 a1Var = this.$terminalSyncApiInteractor;
        dq.s sVar = this.$personalVaultKeyData;
        List listD = this.$keyValidationResult.d();
        boolean zP0 = this.this$0.termiusStorage.p0();
        boolean zA0 = this.this$0.termiusStorage.A0();
        this.label = 1;
        Object objD = a1Var.d(null, sVar, listD, zP0, zA0, this);
        return objD == objF ? objF : objD;
    }

    @Override // iu.p
    public final Object invoke(i0 i0Var, zt.e<? super a1.a> eVar) {
        return ((SyncIntentService$sendBulkGet$result$1) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
    }
}
