package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdActivityActions {
    public static final int $stable = 0;

    public static final class a extends SshIdActivityActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40838a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1868913487;
        }

        public String toString() {
            return "CloseFlow";
        }
    }

    public /* synthetic */ SshIdActivityActions(k kVar) {
        this();
    }

    private SshIdActivityActions() {
    }
}
