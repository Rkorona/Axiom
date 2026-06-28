package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdUseBiometricScreenActions;
import cp.d;
import cp.f;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdUseBiometricScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final w _devices;
    private final yu.d _screenActionFlow;
    private final k0 devices;
    private final zu.f screenActionFlow;
    private final cp.f sshIdDevicesDaoRepository = f.a.b(cp.f.f47012b, null, 1, null);
    private final cp.d sshIdRemoteKeysRepository = d.a.b(cp.d.f46939d, null, 1, null);
    private final gp.l deviceListSorter = new gp.l();

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f41364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f41365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f41366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41367f;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdUseBiometricScreenViewModel.this.new a(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
        
            if (r14 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        
            if (r14 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:22:0x0098). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels.SshIdUseBiometricScreenViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41369a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdUseBiometricScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41369a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdUseBiometricScreenViewModel.this._screenActionFlow;
                SshIdUseBiometricScreenActions.b bVar = SshIdUseBiometricScreenActions.b.f40883a;
                this.f41369a = 1;
                if (dVar.b(bVar, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41371a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdUseBiometricScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41371a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdUseBiometricScreenViewModel.this._screenActionFlow;
                SshIdUseBiometricScreenActions.a aVar = SshIdUseBiometricScreenActions.a.f40882a;
                this.f41371a = 1;
                if (dVar.b(aVar, this) == objF) {
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdUseBiometricScreenViewModel() {
        w wVarA = zu.m0.a(v.o());
        this._devices = wVarA;
        this.devices = wVarA;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final k0 getDevices() {
        return this.devices;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onHandleDontUseBiometricButtonClicked() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onHandleUseBiometricButtonClicked() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}
