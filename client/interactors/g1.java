package com.server.auditor.ssh.client.interactors;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.security.SecureRandom;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27417b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27418c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f27419d = vt.v.r("termius.com", "dev.termius.com");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f27420e = vt.v.e(new PublicKeyCredentialParameters(PublicKeyCredentialType.PUBLIC_KEY.toString(), com.google.android.gms.fido.fido2.api.common.b.ES256.b()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AuthenticatorSelectionCriteria f27421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AuthenticationExtensions f27422g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.a f27423a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final List a() {
            return g1.f27419d;
        }

        public final String b() {
            return tp.f.a() ? "termius.com" : "dev.termius.com";
        }

        public final boolean c(double d10) {
            return d10 >= 8.4d;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27424a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27426c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27424a = obj;
            this.f27426c |= RtlSpacingHelper.UNDEFINED;
            return g1.this.c(null, null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27427a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27429c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27427a = obj;
            this.f27429c |= RtlSpacingHelper.UNDEFINED;
            return g1.this.g(null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f27432c = str;
            this.f27433d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g1.this.new d(this.f27432c, this.f27433d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g1 g1Var = g1.this;
            byte[] bytes = this.f27432c.getBytes(su.d.f78241b);
            ju.t.e(bytes, "getBytes(...)");
            return g1Var.e(bytes, this.f27433d);
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static {
        AuthenticatorSelectionCriteria authenticatorSelectionCriteriaA = new AuthenticatorSelectionCriteria.a().b(Attachment.CROSS_PLATFORM).a();
        ju.t.e(authenticatorSelectionCriteriaA, "build(...)");
        f27421f = authenticatorSelectionCriteriaA;
        AuthenticationExtensions authenticationExtensionsA = new AuthenticationExtensions.a().b(new UserVerificationMethodExtension(false)).a();
        ju.t.e(authenticationExtensionsA, "build(...)");
        f27422g = authenticationExtensionsA;
    }

    public g1(qd.a aVar) {
        ju.t.f(aVar, "fido2ApiClient");
        this.f27423a = aVar;
    }

    private final byte[] d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PublicKeyCredentialCreationOptions e(byte[] bArr, String str) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsA = new PublicKeyCredentialCreationOptions.a().f(new PublicKeyCredentialRpEntity(f27417b.b(), "Termius", null)).g(new PublicKeyCredentialUserEntity(bArr, str, "", str)).d(d()).e(f27420e).c(f27421f).b(f27422g).a();
        ju.t.e(publicKeyCredentialCreationOptionsA, "build(...)");
        return publicKeyCredentialCreationOptionsA;
    }

    private final PublicKeyCredentialRequestOptions f(String str, String str2, byte[] bArr) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsA = new PublicKeyCredentialRequestOptions.a().d(str).c(bArr).b(vt.v.e(new PublicKeyCredentialDescriptor(PublicKeyCredentialType.PUBLIC_KEY.toString(), tp.c0.d(str2), null))).a();
        ju.t.e(publicKeyCredentialRequestOptionsA, "build(...)");
        return publicKeyCredentialRequestOptionsA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, byte[] r7, zt.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.interactors.g1.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.interactors.g1$b r0 = (com.server.auditor.ssh.client.interactors.g1.b) r0
            int r1 = r0.f27426c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27426c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.g1$b r0 = new com.server.auditor.ssh.client.interactors.g1$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27424a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27426c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29
            goto L4e
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ut.x.b(r8)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r5 = r4.f(r5, r6, r7)     // Catch: java.lang.Exception -> L29
            qd.a r6 = r4.f27423a     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r5 = r6.e(r5)     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = "getSignPendingIntent(...)"
            ju.t.e(r5, r6)     // Catch: java.lang.Exception -> L29
            r0.f27426c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = gv.b.a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L4e
            return r1
        L4e:
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8     // Catch: java.lang.Exception -> L29
            return r8
        L51:
            y9.a r6 = y9.a.f86838a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " (Potentially noise)"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.g(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g1.c(java.lang.String, java.lang.String, byte[], zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, java.lang.String r8, zt.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.interactors.g1.c
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.interactors.g1$c r0 = (com.server.auditor.ssh.client.interactors.g1.c) r0
            int r1 = r0.f27429c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27429c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.g1$c r0 = new com.server.auditor.ssh.client.interactors.g1$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27427a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27429c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            ut.x.b(r9)     // Catch: java.lang.Exception -> L2d
            goto L66
        L2d:
            r7 = move-exception
            goto L69
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ut.x.b(r9)     // Catch: java.lang.Exception -> L2d
            goto L50
        L3b:
            ut.x.b(r9)
            wu.g0 r9 = wu.x0.b()     // Catch: java.lang.Exception -> L2d
            com.server.auditor.ssh.client.interactors.g1$d r2 = new com.server.auditor.ssh.client.interactors.g1$d     // Catch: java.lang.Exception -> L2d
            r2.<init>(r7, r8, r3)     // Catch: java.lang.Exception -> L2d
            r0.f27429c = r5     // Catch: java.lang.Exception -> L2d
            java.lang.Object r9 = wu.i.g(r9, r2, r0)     // Catch: java.lang.Exception -> L2d
            if (r9 != r1) goto L50
            goto L65
        L50:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r9 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r9     // Catch: java.lang.Exception -> L2d
            qd.a r7 = r6.f27423a     // Catch: java.lang.Exception -> L2d
            com.google.android.gms.tasks.Task r7 = r7.d(r9)     // Catch: java.lang.Exception -> L2d
            java.lang.String r8 = "getRegisterPendingIntent(...)"
            ju.t.e(r7, r8)     // Catch: java.lang.Exception -> L2d
            r0.f27429c = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r9 = gv.b.a(r7, r0)     // Catch: java.lang.Exception -> L2d
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9     // Catch: java.lang.Exception -> L2d
            return r9
        L69:
            y9.a r8 = y9.a.f86838a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = " (Potentially noise)"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.g(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.g1.g(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}
