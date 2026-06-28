package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.crystalnix.termius.libtermius.wrappers.sftp.modern.SftpTransferTask;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.a$a, reason: collision with other inner class name */
    public static final class C0567a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0567a f34945a = new C0567a();

        private C0567a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0567a);
        }

        public int hashCode() {
            return 1038546549;
        }

        public String toString() {
            return "Hidden";
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SftpTransferTask f34946a;

        public b(SftpTransferTask sftpTransferTask) {
            ju.t.f(sftpTransferTask, "task");
            this.f34946a = sftpTransferTask;
        }

        public final SftpTransferTask a() {
            return this.f34946a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ju.t.b(this.f34946a, ((b) obj).f34946a);
        }

        public int hashCode() {
            return this.f34946a.hashCode();
        }

        public String toString() {
            return "Visible(task=" + this.f34946a + ")";
        }
    }
}
