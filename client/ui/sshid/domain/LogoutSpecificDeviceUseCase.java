package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class LogoutSpecificDeviceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nl.a f41033a;

    @Keep
    public static abstract class DeviceLogoutResult {
        public static final int $stable = 0;

        public static final class a extends DeviceLogoutResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41034a;

            public a(int i10) {
                super(null);
                this.f41034a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f41034a == ((a) obj).f41034a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f41034a);
            }

            public String toString() {
                return "FailedLogout(deviceId=" + this.f41034a + ")";
            }
        }

        public static final class b extends DeviceLogoutResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41035a;

            public b(int i10) {
                super(null);
                this.f41035a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f41035a == ((b) obj).f41035a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f41035a);
            }

            public String toString() {
                return "SuccessLogout(deviceId=" + this.f41035a + ")";
            }
        }

        public /* synthetic */ DeviceLogoutResult(k kVar) {
            this();
        }

        private DeviceLogoutResult() {
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41037b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41039d;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41037b = obj;
            this.f41039d |= RtlSpacingHelper.UNDEFINED;
            return LogoutSpecificDeviceUseCase.this.a(0, this);
        }
    }

    public LogoutSpecificDeviceUseCase(nl.a aVar) {
        t.f(aVar, "logoutSpecificDeviceRepository");
        this.f41033a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase.a
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$a r0 = (com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase.a) r0
            int r1 = r0.f41039d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41039d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$a r0 = new com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41037b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41039d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f41036a
            ut.x.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ut.x.b(r6)
            nl.a r6 = r4.f41033a
            r0.f41036a = r5
            r0.f41039d = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            nl.a$b r6 = (nl.a.b) r6
            boolean r6 = r6 instanceof nl.a.b.e
            if (r6 == 0) goto L4f
            com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$DeviceLogoutResult$b r6 = new com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$DeviceLogoutResult$b
            r6.<init>(r5)
            return r6
        L4f:
            com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$DeviceLogoutResult$a r6 = new com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase$DeviceLogoutResult$a
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.LogoutSpecificDeviceUseCase.a(int, zt.e):java.lang.Object");
    }
}
