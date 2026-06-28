package com.server.auditor.ssh.client.ui.sshid.data.actions;

import androidx.annotation.Keep;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class SshIdUseBiometricScreenActions {
    public static final int $stable = 0;

    public static final class a extends SshIdUseBiometricScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40882a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1109643250;
        }

        public String toString() {
            return "SetBiometricKeysAsDefaultAndShowReadyScreen";
        }
    }

    public static final class b extends SshIdUseBiometricScreenActions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40883a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -944030784;
        }

        public String toString() {
            return "ShowReadyScreen";
        }
    }

    public /* synthetic */ SshIdUseBiometricScreenActions(k kVar) {
        this();
    }

    private SshIdUseBiometricScreenActions() {
    }
}
