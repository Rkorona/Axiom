package com.server.auditor.ssh.client.ui.sshid.data.actions;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface SshIdReadyScreenActions {

    public static final class a implements SshIdReadyScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40874a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -982204374;
        }

        public String toString() {
            return "CloseFlow";
        }
    }

    public static final class b implements SshIdReadyScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40875a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1106372068;
        }

        public String toString() {
            return "ShowPublicProfileWebPage";
        }
    }

    public static final class c implements SshIdReadyScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40876a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -606305958;
        }

        public String toString() {
            return "SuccessFinish";
        }
    }
}
