package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$restSendBulkPut$keyValidationResult$1", f = "SyncIntentService.kt", l = {1283}, m = "invokeSuspend")
final class SyncIntentService$restSendBulkPut$keyValidationResult$1 extends kotlin.coroutines.jvm.internal.m implements iu.p {
    final /* synthetic */ SyncRestInterface $restApiClient;
    int label;
    final /* synthetic */ SyncIntentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncIntentService$restSendBulkPut$keyValidationResult$1(SyncIntentService syncIntentService, SyncRestInterface syncRestInterface, zt.e<? super SyncIntentService$restSendBulkPut$keyValidationResult$1> eVar) {
        super(2, eVar);
        this.this$0 = syncIntentService;
        this.$restApiClient = syncRestInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
        return new SyncIntentService$restSendBulkPut$keyValidationResult$1(this.this$0, this.$restApiClient, eVar);
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
        pl.q qVar = this.this$0.vaultsKeyringRepository;
        SyncRestInterface syncRestInterface = this.$restApiClient;
        this.label = 1;
        Object objE = qVar.e(syncRestInterface, this);
        return objE == objF ? objF : objE;
    }

    @Override // iu.p
    public final Object invoke(i0 i0Var, zt.e<? super pl.r> eVar) {
        return ((SyncIntentService$restSendBulkPut$keyValidationResult$1) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
    }
}
