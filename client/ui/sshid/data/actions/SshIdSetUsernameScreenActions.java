package com.server.auditor.ssh.client.ui.sshid.data.actions;

import androidx.annotation.Keep;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdSetUsernameScreenActions {
    public static final int $stable = 0;

    public static final class a extends SshIdSetUsernameScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40877a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -366437419;
        }

        public String toString() {
            return "CloseFlow";
        }
    }

    public static final class b extends SshIdSetUsernameScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40878a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1311529325;
        }

        public String toString() {
            return "ContinueCreationWithUsername";
        }
    }

    public static final class c extends SshIdSetUsernameScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40879a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1797377417;
        }

        public String toString() {
            return "ShowPasskeysGenerationScreen";
        }
    }

    public /* synthetic */ SshIdSetUsernameScreenActions(k kVar) {
        this();
    }

    private SshIdSetUsernameScreenActions() {
    }
}
