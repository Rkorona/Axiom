package com.server.auditor.ssh.client.ui.sshid.data.actions;

import androidx.annotation.Keep;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdShareLinkCardActions {
    public static final int $stable = 0;

    public static final class a extends SshIdShareLinkCardActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f40881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            t.f(str, "sshIdUsername");
            this.f40880a = str;
            this.f40881b = str2;
        }

        public final String a() {
            return this.f40881b;
        }

        public final String b() {
            return this.f40880a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.b(this.f40880a, aVar.f40880a) && t.b(this.f40881b, aVar.f40881b);
        }

        public int hashCode() {
            int iHashCode = this.f40880a.hashCode() * 31;
            String str = this.f40881b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ShowShareBottomSheet(sshIdUsername=" + this.f40880a + ", keyType=" + this.f40881b + ")";
        }
    }

    public /* synthetic */ SshIdShareLinkCardActions(k kVar) {
        this();
    }

    private SshIdShareLinkCardActions() {
    }
}
