package com.server.auditor.ssh.client.ui.sshid.data.actions;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdPasskeysGenerationScreenActions {
    public static final int $stable = 0;

    public static final class a extends SshIdPasskeysGenerationScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40868a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -511663365;
        }

        public String toString() {
            return "DoRegenerateKeysAction";
        }
    }

    public static final class b extends SshIdPasskeysGenerationScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40869a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 138456273;
        }

        public String toString() {
            return "FinishLaterAction";
        }
    }

    public static final class c extends SshIdPasskeysGenerationScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f40870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final UserDeviceType f40871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, UserDeviceType userDeviceType) {
            super(null);
            t.f(userDeviceType, "deviceType");
            this.f40870a = j10;
            this.f40871b = userDeviceType;
        }

        public final long a() {
            return this.f40870a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f40870a == cVar.f40870a && this.f40871b == cVar.f40871b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f40870a) * 31) + this.f40871b.hashCode();
        }

        public String toString() {
            return "LogoutDevice(deviceId=" + this.f40870a + ", deviceType=" + this.f40871b + ")";
        }
    }

    public static final class d extends SshIdPasskeysGenerationScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f40872a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 634682548;
        }

        public String toString() {
            return "ShowReadyScreen";
        }
    }

    public static final class e extends SshIdPasskeysGenerationScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40873a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1338834317;
        }

        public String toString() {
            return "ShowUseBiometricsScreen";
        }
    }

    public /* synthetic */ SshIdPasskeysGenerationScreenActions(k kVar) {
        this();
    }

    private SshIdPasskeysGenerationScreenActions() {
    }
}
