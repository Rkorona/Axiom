package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.Keygen;
import com.crystalnix.termius.libtermius.SshKey;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.crystalnix.termius.libtermius.wrappers.options.KeygenOptions;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper;
import iu.l;
import iu.p;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import lj.b;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdKeygenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40841c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40842d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo.c f40843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lj.b f40844b;

    @Keep
    public static abstract class BiometricKeyGenerationResult {
        public static final int $stable = 0;

        public static final class a extends BiometricKeyGenerationResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40845a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1527144573;
            }

            public String toString() {
                return "BiometricNotEnabledOnDevice";
            }
        }

        public static final class b extends BiometricKeyGenerationResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f40846a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -855873316;
            }

            public String toString() {
                return "BiometricNotSupport";
            }
        }

        public static final class c extends BiometricKeyGenerationResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f40847a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -384938053;
            }

            public String toString() {
                return "CertificateNotGenerated";
            }
        }

        public static final class d extends BiometricKeyGenerationResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final LocalPasskeyModelWithCertificate f40848a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LocalPasskeyModelWithCertificate localPasskeyModelWithCertificate) {
                super(null);
                t.f(localPasskeyModelWithCertificate, "body");
                this.f40848a = localPasskeyModelWithCertificate;
            }

            public final LocalPasskeyModelWithCertificate a() {
                return this.f40848a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f40848a, ((d) obj).f40848a);
            }

            public int hashCode() {
                return this.f40848a.hashCode();
            }

            public String toString() {
                return "GeneratedBiometricKey(body=" + this.f40848a + ")";
            }
        }

        public /* synthetic */ BiometricKeyGenerationResult(k kVar) {
            this();
        }

        private BiometricKeyGenerationResult() {
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f40849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f40851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f40852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f40853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40854f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40856v;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40854f = obj;
            this.f40856v |= RtlSpacingHelper.UNDEFINED;
            return SshIdKeygenHelper.this.c(0L, null, null, null, this);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.AbstractC0974b f40858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b.AbstractC0974b abstractC0974b, e eVar) {
            super(2, eVar);
            this.f40858b = abstractC0974b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f40858b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40857a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String strGenerateSshKeyFromDERPublicKey = Keygen.generateSshKeyFromDERPublicKey(((b.AbstractC0974b.c) this.f40858b).a().getPublic().getEncoded());
            t.e(strGenerateSshKeyFromDERPublicKey, "generateSshKeyFromDERPublicKey(...)");
            return s.n1(strGenerateSshKeyFromDERPublicKey).toString();
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdKeygenHelper(yo.c cVar, lj.b bVar) {
        t.f(cVar, "libTermiusWrapper");
        t.f(bVar, "biometricKeyGenerator");
        this.f40843a = cVar;
        this.f40844b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyPairGenerator b(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        t.f(str, "algorithm");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, TermiusApplication.f21391y);
        t.e(keyPairGenerator, "getInstance(...)");
        return keyPairGenerator;
    }

    private final String e(String str, String str2, String str3) {
        return this.f40843a.b(new yo.d(str, str2, str3));
    }

    private final String f(String str) {
        return "#SSH ID - @" + str;
    }

    private final KeygenOptions g(int i10, String str) {
        KeygenOptions keygenOptions = new KeygenOptions();
        keygenOptions.setKeyType(i10);
        if (i10 == 0) {
            keygenOptions.setBits(4096);
        } else if (i10 == 2) {
            keygenOptions.setCurve(LibTermiusKeygen.CURVE_NISTP_521);
        }
        keygenOptions.setIncludePublicKey(true);
        keygenOptions.setComment(f(str));
        return keygenOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, zt.e r24) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.SshIdKeygenHelper.c(long, java.lang.String, java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }

    public final SshKey d(int i10, String str) {
        t.f(str, "sshIdUsername");
        return this.f40843a.a(g(i10, str));
    }

    public /* synthetic */ SshIdKeygenHelper(yo.c cVar, lj.b bVar, int i10, k kVar) {
        cVar = (i10 & 1) != 0 ? new yo.c() : cVar;
        if ((i10 & 2) != 0) {
            androidx.biometric.e eVarG = androidx.biometric.e.g(TermiusApplication.F());
            t.e(eVarG, "from(...)");
            bVar = new lj.b(eVarG, new l() { // from class: yo.e
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return SshIdKeygenHelper.b((String) obj);
                }
            });
        }
        this(cVar, bVar);
    }
}
