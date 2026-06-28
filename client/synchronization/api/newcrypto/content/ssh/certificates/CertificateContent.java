package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.certificates;

import com.server.auditor.ssh.client.database.Table;
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
public final class CertificateContent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String certificate;
    private final String label;
    private final int version;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CertificateContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public CertificateContent() {
        this((String) null, (String) null, 0, 7, (k) null);
    }

    public static /* synthetic */ CertificateContent copy$default(CertificateContent certificateContent, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = certificateContent.certificate;
        }
        if ((i11 & 2) != 0) {
            str2 = certificateContent.label;
        }
        if ((i11 & 4) != 0) {
            i10 = certificateContent.version;
        }
        return certificateContent.copy(str, str2, i10);
    }

    @o(Table.SSH_CERTIFICATE)
    public static /* synthetic */ void getCertificate$annotations() {
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CertificateContent certificateContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(certificateContent.certificate, "")) {
            dVar.f(fVar, 0, certificateContent.certificate);
        }
        if (dVar.E(fVar, 1) || !t.b(certificateContent.label, "")) {
            dVar.f(fVar, 1, certificateContent.label);
        }
        if (!dVar.E(fVar, 2) && certificateContent.version == 1) {
            return;
        }
        dVar.t(fVar, 2, certificateContent.version);
    }

    public final String component1() {
        return this.certificate;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.version;
    }

    public final CertificateContent copy(String str, String str2, int i10) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, "label");
        return new CertificateContent(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateContent)) {
            return false;
        }
        CertificateContent certificateContent = (CertificateContent) obj;
        return t.b(this.certificate, certificateContent.certificate) && t.b(this.label, certificateContent.label) && this.version == certificateContent.version;
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.certificate.hashCode() * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "CertificateContent(certificate=" + this.certificate + ", label=" + this.label + ", version=" + this.version + ")";
    }

    public /* synthetic */ CertificateContent(int i10, String str, String str2, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.certificate = "";
        } else {
            this.certificate = str;
        }
        if ((i10 & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i10 & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public CertificateContent(String str, String str2, int i10) {
        t.f(str, Table.SSH_CERTIFICATE);
        t.f(str2, "label");
        this.certificate = str;
        this.label = str2;
        this.version = i10;
    }

    public /* synthetic */ CertificateContent(String str, String str2, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 1 : i10);
    }
}
