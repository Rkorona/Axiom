package com.server.auditor.ssh.client.ui.sshid.domain;

import androidx.annotation.Keep;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdSetupErrorDetails {
    public static final int $stable = 0;

    public static final class a extends SshIdSetupErrorDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f41078b;

        public a(int i10, String str) {
            super(null);
            this.f41077a = i10;
            this.f41078b = str;
        }

        public final int a() {
            return this.f41077a;
        }

        public final String b() {
            return this.f41078b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41077a == aVar.f41077a && t.b(this.f41078b, aVar.f41078b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f41077a) * 31;
            String str = this.f41078b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ErrorWithCodeAndMessage(errorCode=" + this.f41077a + ", errorMessage=" + this.f41078b + ")";
        }

        public /* synthetic */ a(int i10, String str, int i11, k kVar) {
            this(i10, (i11 & 2) != 0 ? null : str);
        }
    }

    public static final class b extends SshIdSetupErrorDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f41080b;

        public /* synthetic */ b(int i10, String str, int i11, k kVar) {
            this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? null : str);
        }

        public final String a() {
            return this.f41080b;
        }

        public final int b() {
            return this.f41079a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f41079a == bVar.f41079a && t.b(this.f41080b, bVar.f41080b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f41079a) * 31;
            String str = this.f41080b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InternalError(internalErrorCode=" + this.f41079a + ", extraMessage=" + this.f41080b + ")";
        }

        public b(int i10, String str) {
            super(null);
            this.f41079a = i10;
            this.f41080b = str;
        }
    }

    public static final class c extends SshIdSetupErrorDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41082b;

        public c(int i10, int i11) {
            super(null);
            this.f41081a = i10;
            this.f41082b = i11;
        }

        public final int a() {
            return this.f41082b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f41081a == cVar.f41081a && this.f41082b == cVar.f41082b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f41081a) * 31) + Integer.hashCode(this.f41082b);
        }

        public String toString() {
            return "ThrottledErrorWithMessage(errorCode=" + this.f41081a + ", seconds=" + this.f41082b + ")";
        }
    }

    public /* synthetic */ SshIdSetupErrorDetails(k kVar) {
        this();
    }

    private SshIdSetupErrorDetails() {
    }
}
