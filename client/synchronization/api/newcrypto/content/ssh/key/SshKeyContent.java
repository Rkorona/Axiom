package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key;

import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SshKeyContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String label;
    private final String passphrase;
    private final String privateKey;
    private final String publicKey;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return SshKeyContent.serializer;
        }

        public final c serializer() {
            return SshKeyContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public SshKeyContent() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31, (k) null);
    }

    public static /* synthetic */ SshKeyContent copy$default(SshKeyContent sshKeyContent, String str, String str2, String str3, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sshKeyContent.passphrase;
        }
        if ((i11 & 2) != 0) {
            str2 = sshKeyContent.privateKey;
        }
        if ((i11 & 4) != 0) {
            str3 = sshKeyContent.publicKey;
        }
        if ((i11 & 8) != 0) {
            str4 = sshKeyContent.label;
        }
        if ((i11 & 16) != 0) {
            i10 = sshKeyContent.version;
        }
        int i12 = i10;
        String str5 = str3;
        return sshKeyContent.copy(str, str2, str5, str4, i12);
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o(SshOptions.EXTRA_PASSPHRASE)
    public static /* synthetic */ void getPassphrase$annotations() {
    }

    @o("private_key")
    public static /* synthetic */ void getPrivateKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeyContent sshKeyContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(sshKeyContent.passphrase, "")) {
            dVar.f(fVar, 0, sshKeyContent.passphrase);
        }
        if (dVar.E(fVar, 1) || !t.b(sshKeyContent.privateKey, "")) {
            dVar.f(fVar, 1, sshKeyContent.privateKey);
        }
        if (dVar.E(fVar, 2) || !t.b(sshKeyContent.publicKey, "")) {
            dVar.f(fVar, 2, sshKeyContent.publicKey);
        }
        if (dVar.E(fVar, 3) || !t.b(sshKeyContent.label, "")) {
            dVar.f(fVar, 3, sshKeyContent.label);
        }
        if (!dVar.E(fVar, 4) && sshKeyContent.version == 1) {
            return;
        }
        dVar.t(fVar, 4, sshKeyContent.version);
    }

    public final String component1() {
        return this.passphrase;
    }

    public final String component2() {
        return this.privateKey;
    }

    public final String component3() {
        return this.publicKey;
    }

    public final String component4() {
        return this.label;
    }

    public final int component5() {
        return this.version;
    }

    public final SshKeyContent copy(String str, String str2, String str3, String str4, int i10) {
        t.f(str, SshOptions.EXTRA_PASSPHRASE);
        t.f(str2, Column.KEY_PRIVATE);
        t.f(str3, Column.KEY_PUBLIC);
        t.f(str4, "label");
        return new SshKeyContent(str, str2, str3, str4, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshKeyContent)) {
            return false;
        }
        SshKeyContent sshKeyContent = (SshKeyContent) obj;
        return t.b(this.passphrase, sshKeyContent.passphrase) && t.b(this.privateKey, sshKeyContent.privateKey) && t.b(this.publicKey, sshKeyContent.publicKey) && t.b(this.label, sshKeyContent.label) && this.version == sshKeyContent.version;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPassphrase() {
        return this.passphrase;
    }

    public final String getPrivateKey() {
        return this.privateKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((this.passphrase.hashCode() * 31) + this.privateKey.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "SshKeyContent(passphrase=" + this.passphrase + ", privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ", label=" + this.label + ", version=" + this.version + ")";
    }

    public /* synthetic */ SshKeyContent(int i10, String str, String str2, String str3, String str4, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.passphrase = "";
        } else {
            this.passphrase = str;
        }
        if ((i10 & 2) == 0) {
            this.privateKey = "";
        } else {
            this.privateKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.publicKey = "";
        } else {
            this.publicKey = str3;
        }
        if ((i10 & 8) == 0) {
            this.label = "";
        } else {
            this.label = str4;
        }
        if ((i10 & 16) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public SshKeyContent(String str, String str2, String str3, String str4, int i10) {
        t.f(str, SshOptions.EXTRA_PASSPHRASE);
        t.f(str2, Column.KEY_PRIVATE);
        t.f(str3, Column.KEY_PUBLIC);
        t.f(str4, "label");
        this.passphrase = str;
        this.privateKey = str2;
        this.publicKey = str3;
        this.label = str4;
        this.version = i10;
    }

    public /* synthetic */ SshKeyContent(String str, String str2, String str3, String str4, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? 1 : i10);
    }
}
