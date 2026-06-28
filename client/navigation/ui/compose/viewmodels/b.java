package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34947a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -284306465;
        }

        public String toString() {
            return "Hidden";
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b$b, reason: collision with other inner class name */
    public static final class C0568b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypedSessionId f34948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34949b;

        public C0568b(TypedSessionId typedSessionId, String str) {
            ju.t.f(typedSessionId, "connectionId");
            ju.t.f(str, "initialName");
            this.f34948a = typedSessionId;
            this.f34949b = str;
        }

        public final TypedSessionId a() {
            return this.f34948a;
        }

        public final String b() {
            return this.f34949b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0568b)) {
                return false;
            }
            C0568b c0568b = (C0568b) obj;
            return ju.t.b(this.f34948a, c0568b.f34948a) && ju.t.b(this.f34949b, c0568b.f34949b);
        }

        public int hashCode() {
            return (this.f34948a.hashCode() * 31) + this.f34949b.hashCode();
        }

        public String toString() {
            return "Visible(connectionId=" + this.f34948a + ", initialName=" + this.f34949b + ")";
        }
    }
}
