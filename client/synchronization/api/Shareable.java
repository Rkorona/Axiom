package com.server.auditor.ssh.client.synchronization.api;

import hv.o;

/* JADX INFO: loaded from: classes4.dex */
public interface Shareable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ENCRYPTED_WITH_SERIAL_NAME = "encrypted_with";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ENCRYPTED_WITH_SERIAL_NAME = "encrypted_with";

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        @o("encrypted_with")
        public static /* synthetic */ void getEncryptedWith$annotations() {
        }
    }

    Long getEncryptedWith();

    Boolean getShared();

    void resetSharingBeforeSync();

    void setEncryptedWith(Long l10);
}
