package com.server.auditor.ssh.client.ui.auth.welcome.presentation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import lv.x2;
import mv.b;

/* JADX INFO: loaded from: classes4.dex */
@hv.p
@Keep
public interface WelcomeFlowGraphRoutes {
    public static final a Companion = a.f39497a;

    @hv.p
    @Keep
    public static final class ResetPasswordGetInstructions implements WelcomeFlowGraphRoutes {
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.b
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.ResetPasswordGetInstructions._childSerializers$_anonymous_();
            }
        })};
        private static final ut.u typeMap = ut.b0.a(ju.n0.j(AuthenticationModel.class), new c(false, mv.b.f65981d));

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39458b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39457a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.ResetPasswordGetInstructions", aVar, 2);
                i2Var.r("featureType", false);
                i2Var.r("authenticationModel", false);
                descriptor = i2Var;
                f39458b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResetPasswordGetInstructions deserialize(kv.e eVar) {
                AuthenticationModel authenticationModel;
                int iE;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = ResetPasswordGetInstructions.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    int i11 = 0;
                    AuthenticationModel authenticationModel2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE2 = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), authenticationModel2);
                            i11 |= 2;
                        }
                    }
                    authenticationModel = authenticationModel2;
                    iE = iE2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ResetPasswordGetInstructions(i10, iE, authenticationModel, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ResetPasswordGetInstructions resetPasswordGetInstructions) {
                ju.t.f(fVar, "encoder");
                ju.t.f(resetPasswordGetInstructions, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                ResetPasswordGetInstructions.write$Self$Termius_app_googleProductionRelease(resetPasswordGetInstructions, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, ResetPasswordGetInstructions.$childSerializers[1].getValue()};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return ResetPasswordGetInstructions.typeMap;
            }

            public final hv.c serializer() {
                return a.f39457a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39459t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39459t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39459t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39459t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39459t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39459t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public /* synthetic */ ResetPasswordGetInstructions(int i10, int i11, AuthenticationModel authenticationModel, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39457a.getDescriptor());
            }
            this.featureType = i11;
            this.authenticationModel = authenticationModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ ResetPasswordGetInstructions copy$default(ResetPasswordGetInstructions resetPasswordGetInstructions, int i10, AuthenticationModel authenticationModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = resetPasswordGetInstructions.featureType;
            }
            if ((i11 & 2) != 0) {
                authenticationModel = resetPasswordGetInstructions.authenticationModel;
            }
            return resetPasswordGetInstructions.copy(i10, authenticationModel);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ResetPasswordGetInstructions resetPasswordGetInstructions, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            dVar.t(fVar, 0, resetPasswordGetInstructions.featureType);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), resetPasswordGetInstructions.authenticationModel);
        }

        public final int component1() {
            return this.featureType;
        }

        public final AuthenticationModel component2() {
            return this.authenticationModel;
        }

        public final ResetPasswordGetInstructions copy(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            return new ResetPasswordGetInstructions(i10, authenticationModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetPasswordGetInstructions)) {
                return false;
            }
            ResetPasswordGetInstructions resetPasswordGetInstructions = (ResetPasswordGetInstructions) obj;
            return this.featureType == resetPasswordGetInstructions.featureType && ju.t.b(this.authenticationModel, resetPasswordGetInstructions.authenticationModel);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (Integer.hashCode(this.featureType) * 31) + this.authenticationModel.hashCode();
        }

        public String toString() {
            return "ResetPasswordGetInstructions(featureType=" + this.featureType + ", authenticationModel=" + this.authenticationModel + ")";
        }

        public ResetPasswordGetInstructions(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            this.featureType = i10;
            this.authenticationModel = authenticationModel;
        }
    }

    @hv.p
    @Keep
    public static final class ResetPasswordInstructionsSent implements WelcomeFlowGraphRoutes {
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.c
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent._childSerializers$_anonymous_();
            }
        })};
        private static final ut.u typeMap = ut.b0.a(ju.n0.j(AuthenticationModel.class), new c(false, mv.b.f65981d));

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39461b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39460a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent", aVar, 2);
                i2Var.r("featureType", false);
                i2Var.r("authenticationModel", false);
                descriptor = i2Var;
                f39461b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResetPasswordInstructionsSent deserialize(kv.e eVar) {
                AuthenticationModel authenticationModel;
                int iE;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = ResetPasswordInstructionsSent.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    int i11 = 0;
                    AuthenticationModel authenticationModel2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE2 = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), authenticationModel2);
                            i11 |= 2;
                        }
                    }
                    authenticationModel = authenticationModel2;
                    iE = iE2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ResetPasswordInstructionsSent(i10, iE, authenticationModel, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ResetPasswordInstructionsSent resetPasswordInstructionsSent) {
                ju.t.f(fVar, "encoder");
                ju.t.f(resetPasswordInstructionsSent, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                ResetPasswordInstructionsSent.write$Self$Termius_app_googleProductionRelease(resetPasswordInstructionsSent, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, ResetPasswordInstructionsSent.$childSerializers[1].getValue()};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return ResetPasswordInstructionsSent.typeMap;
            }

            public final hv.c serializer() {
                return a.f39460a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39462t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39462t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39462t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39462t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39462t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39462t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public /* synthetic */ ResetPasswordInstructionsSent(int i10, int i11, AuthenticationModel authenticationModel, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39460a.getDescriptor());
            }
            this.featureType = i11;
            this.authenticationModel = authenticationModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ ResetPasswordInstructionsSent copy$default(ResetPasswordInstructionsSent resetPasswordInstructionsSent, int i10, AuthenticationModel authenticationModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = resetPasswordInstructionsSent.featureType;
            }
            if ((i11 & 2) != 0) {
                authenticationModel = resetPasswordInstructionsSent.authenticationModel;
            }
            return resetPasswordInstructionsSent.copy(i10, authenticationModel);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ResetPasswordInstructionsSent resetPasswordInstructionsSent, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            dVar.t(fVar, 0, resetPasswordInstructionsSent.featureType);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), resetPasswordInstructionsSent.authenticationModel);
        }

        public final int component1() {
            return this.featureType;
        }

        public final AuthenticationModel component2() {
            return this.authenticationModel;
        }

        public final ResetPasswordInstructionsSent copy(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            return new ResetPasswordInstructionsSent(i10, authenticationModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetPasswordInstructionsSent)) {
                return false;
            }
            ResetPasswordInstructionsSent resetPasswordInstructionsSent = (ResetPasswordInstructionsSent) obj;
            return this.featureType == resetPasswordInstructionsSent.featureType && ju.t.b(this.authenticationModel, resetPasswordInstructionsSent.authenticationModel);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (Integer.hashCode(this.featureType) * 31) + this.authenticationModel.hashCode();
        }

        public String toString() {
            return "ResetPasswordInstructionsSent(featureType=" + this.featureType + ", authenticationModel=" + this.authenticationModel + ")";
        }

        public ResetPasswordInstructionsSent(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            this.featureType = i10;
            this.authenticationModel = authenticationModel;
        }
    }

    @hv.p
    @Keep
    public static final class SignInAccountNotFound implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String email;
        private final int featureType;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39464b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39463a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInAccountNotFound", aVar, 2);
                i2Var.r("email", false);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39464b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInAccountNotFound deserialize(kv.e eVar) {
                String strB;
                int iE;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    iE = cVarD.e(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    int i11 = 0;
                    strB = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            iE2 = cVarD.e(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    iE = iE2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignInAccountNotFound(i10, strB, iE, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInAccountNotFound signInAccountNotFound) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInAccountNotFound, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInAccountNotFound.write$Self$Termius_app_googleProductionRelease(signInAccountNotFound, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39463a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignInAccountNotFound(int i10, String str, int i11, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39463a.getDescriptor());
            }
            this.email = str;
            this.featureType = i11;
        }

        public static /* synthetic */ SignInAccountNotFound copy$default(SignInAccountNotFound signInAccountNotFound, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signInAccountNotFound.email;
            }
            if ((i11 & 2) != 0) {
                i10 = signInAccountNotFound.featureType;
            }
            return signInAccountNotFound.copy(str, i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInAccountNotFound signInAccountNotFound, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, signInAccountNotFound.email);
            dVar.t(fVar, 1, signInAccountNotFound.featureType);
        }

        public final String component1() {
            return this.email;
        }

        public final int component2() {
            return this.featureType;
        }

        public final SignInAccountNotFound copy(String str, int i10) {
            ju.t.f(str, "email");
            return new SignInAccountNotFound(str, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignInAccountNotFound)) {
                return false;
            }
            SignInAccountNotFound signInAccountNotFound = (SignInAccountNotFound) obj;
            return ju.t.b(this.email, signInAccountNotFound.email) && this.featureType == signInAccountNotFound.featureType;
        }

        public final String getEmail() {
            return this.email;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (this.email.hashCode() * 31) + Integer.hashCode(this.featureType);
        }

        public String toString() {
            return "SignInAccountNotFound(email=" + this.email + ", featureType=" + this.featureType + ")";
        }

        public SignInAccountNotFound(String str, int i10) {
            ju.t.f(str, "email");
            this.email = str;
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignInCheckEmailToVerify implements WelcomeFlowGraphRoutes {
        private static final ut.u typeMap;
        private static final ut.u typeMap2;
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        private final byte[] password;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.d
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignInCheckEmailToVerify._childSerializers$_anonymous_();
            }
        }), null};

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39465a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39466b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39465a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInCheckEmailToVerify", aVar, 3);
                i2Var.r("featureType", false);
                i2Var.r("authenticationModel", false);
                i2Var.r("password", false);
                descriptor = i2Var;
                f39466b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInCheckEmailToVerify deserialize(kv.e eVar) {
                int iE;
                int i10;
                AuthenticationModel authenticationModel;
                byte[] bArr;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = SignInCheckEmailToVerify.$childSerializers;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    bArr = (byte[]) cVarD.i(fVar, 2, lv.k.f64731c, null);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    AuthenticationModel authenticationModel2 = null;
                    byte[] bArr2 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), authenticationModel2);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new hv.e0(iD);
                            }
                            bArr2 = (byte[]) cVarD.i(fVar, 2, lv.k.f64731c, bArr2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    authenticationModel = authenticationModel2;
                    bArr = bArr2;
                }
                int i12 = iE;
                cVarD.b(fVar);
                return new SignInCheckEmailToVerify(i10, i12, authenticationModel, bArr, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInCheckEmailToVerify signInCheckEmailToVerify) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInCheckEmailToVerify, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInCheckEmailToVerify.write$Self$Termius_app_googleProductionRelease(signInCheckEmailToVerify, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, SignInCheckEmailToVerify.$childSerializers[1].getValue(), lv.k.f64731c};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return SignInCheckEmailToVerify.typeMap;
            }

            public final ut.u b() {
                return SignInCheckEmailToVerify.typeMap2;
            }

            public final hv.c serializer() {
                return a.f39465a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39467t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39467t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39467t;
                bVar.a();
                return bVar.b(lv.k.f64731c, string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39467t;
                bVar.a();
                return bVar.b(lv.k.f64731c, str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39467t;
                bVar.a();
                bundle.putString(str, bVar.c(lv.k.f64731c, obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39467t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(lv.k.f64731c, obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public static final class d extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39468t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z10, mv.b bVar) {
                super(z10);
                this.f39468t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39468t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39468t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39468t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39468t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        static {
            qu.l lVarJ = ju.n0.j(byte[].class);
            b.a aVar = mv.b.f65981d;
            typeMap = ut.b0.a(lVarJ, new c(false, aVar));
            typeMap2 = ut.b0.a(ju.n0.j(AuthenticationModel.class), new d(false, aVar));
        }

        public /* synthetic */ SignInCheckEmailToVerify(int i10, int i11, AuthenticationModel authenticationModel, byte[] bArr, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f39465a.getDescriptor());
            }
            this.featureType = i11;
            this.authenticationModel = authenticationModel;
            this.password = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ SignInCheckEmailToVerify copy$default(SignInCheckEmailToVerify signInCheckEmailToVerify, int i10, AuthenticationModel authenticationModel, byte[] bArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signInCheckEmailToVerify.featureType;
            }
            if ((i11 & 2) != 0) {
                authenticationModel = signInCheckEmailToVerify.authenticationModel;
            }
            if ((i11 & 4) != 0) {
                bArr = signInCheckEmailToVerify.password;
            }
            return signInCheckEmailToVerify.copy(i10, authenticationModel, bArr);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInCheckEmailToVerify signInCheckEmailToVerify, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            dVar.t(fVar, 0, signInCheckEmailToVerify.featureType);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), signInCheckEmailToVerify.authenticationModel);
            dVar.o(fVar, 2, lv.k.f64731c, signInCheckEmailToVerify.password);
        }

        public final int component1() {
            return this.featureType;
        }

        public final AuthenticationModel component2() {
            return this.authenticationModel;
        }

        public final byte[] component3() {
            return this.password;
        }

        public final SignInCheckEmailToVerify copy(int i10, AuthenticationModel authenticationModel, byte[] bArr) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            return new SignInCheckEmailToVerify(i10, authenticationModel, bArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignInCheckEmailToVerify)) {
                return false;
            }
            SignInCheckEmailToVerify signInCheckEmailToVerify = (SignInCheckEmailToVerify) obj;
            return this.featureType == signInCheckEmailToVerify.featureType && ju.t.b(this.authenticationModel, signInCheckEmailToVerify.authenticationModel) && Arrays.equals(this.password, signInCheckEmailToVerify.password);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public final byte[] getPassword() {
            return this.password;
        }

        public int hashCode() {
            return (((this.featureType * 31) + this.authenticationModel.hashCode()) * 31) + Arrays.hashCode(this.password);
        }

        public String toString() {
            return "SignInCheckEmailToVerify(featureType=" + this.featureType + ", authenticationModel=" + this.authenticationModel + ", password=" + Arrays.toString(this.password) + ")";
        }

        public SignInCheckEmailToVerify(int i10, AuthenticationModel authenticationModel, byte[] bArr) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            this.featureType = i10;
            this.authenticationModel = authenticationModel;
            this.password = bArr;
        }
    }

    @hv.p
    @Keep
    public static final class SignInChooser implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int featureType;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39470b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39469a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInChooser", aVar, 1);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39470b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInChooser deserialize(kv.e eVar) {
                int iE;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new hv.e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignInChooser(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInChooser signInChooser) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInChooser, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInChooser.write$Self$Termius_app_googleProductionRelease(signInChooser, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39469a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignInChooser(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f39469a.getDescriptor());
            }
            this.featureType = i11;
        }

        public static /* synthetic */ SignInChooser copy$default(SignInChooser signInChooser, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signInChooser.featureType;
            }
            return signInChooser.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInChooser signInChooser, kv.d dVar, jv.f fVar) {
            dVar.t(fVar, 0, signInChooser.featureType);
        }

        public final int component1() {
            return this.featureType;
        }

        public final SignInChooser copy(int i10) {
            return new SignInChooser(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignInChooser) && this.featureType == ((SignInChooser) obj).featureType;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return Integer.hashCode(this.featureType);
        }

        public String toString() {
            return "SignInChooser(featureType=" + this.featureType + ")";
        }

        public SignInChooser(int i10) {
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignInEnterEmail implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int featureType;
        private final boolean requestESSO;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39471a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39472b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39471a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInEnterEmail", aVar, 2);
                i2Var.r("featureType", false);
                i2Var.r("requestESSO", true);
                descriptor = i2Var;
                f39472b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInEnterEmail deserialize(kv.e eVar) {
                int iE;
                boolean zH;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    boolean zH2 = false;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignInEnterEmail(i10, iE, zH, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInEnterEmail signInEnterEmail) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInEnterEmail, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInEnterEmail.write$Self$Termius_app_googleProductionRelease(signInEnterEmail, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, lv.i.f64704a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39471a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignInEnterEmail(int i10, int i11, boolean z10, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f39471a.getDescriptor());
            }
            this.featureType = i11;
            if ((i10 & 2) == 0) {
                this.requestESSO = false;
            } else {
                this.requestESSO = z10;
            }
        }

        public static /* synthetic */ SignInEnterEmail copy$default(SignInEnterEmail signInEnterEmail, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signInEnterEmail.featureType;
            }
            if ((i11 & 2) != 0) {
                z10 = signInEnterEmail.requestESSO;
            }
            return signInEnterEmail.copy(i10, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInEnterEmail signInEnterEmail, kv.d dVar, jv.f fVar) {
            dVar.t(fVar, 0, signInEnterEmail.featureType);
            if (dVar.E(fVar, 1) || signInEnterEmail.requestESSO) {
                dVar.u(fVar, 1, signInEnterEmail.requestESSO);
            }
        }

        public final int component1() {
            return this.featureType;
        }

        public final boolean component2() {
            return this.requestESSO;
        }

        public final SignInEnterEmail copy(int i10, boolean z10) {
            return new SignInEnterEmail(i10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignInEnterEmail)) {
                return false;
            }
            SignInEnterEmail signInEnterEmail = (SignInEnterEmail) obj;
            return this.featureType == signInEnterEmail.featureType && this.requestESSO == signInEnterEmail.requestESSO;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public final boolean getRequestESSO() {
            return this.requestESSO;
        }

        public int hashCode() {
            return (Integer.hashCode(this.featureType) * 31) + Boolean.hashCode(this.requestESSO);
        }

        public String toString() {
            return "SignInEnterEmail(featureType=" + this.featureType + ", requestESSO=" + this.requestESSO + ")";
        }

        public SignInEnterEmail(int i10, boolean z10) {
            this.featureType = i10;
            this.requestESSO = z10;
        }

        public /* synthetic */ SignInEnterEmail(int i10, boolean z10, int i11, ju.k kVar) {
            this(i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    @hv.p
    @Keep
    public static final class SignInEnterPassword implements WelcomeFlowGraphRoutes {
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.e
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignInEnterPassword._childSerializers$_anonymous_();
            }
        })};
        private static final ut.u typeMap = ut.b0.a(ju.n0.j(AuthenticationModel.class), new c(false, mv.b.f65981d));

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39474b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39473a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInEnterPassword", aVar, 2);
                i2Var.r("featureType", false);
                i2Var.r("authenticationModel", false);
                descriptor = i2Var;
                f39474b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInEnterPassword deserialize(kv.e eVar) {
                AuthenticationModel authenticationModel;
                int iE;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = SignInEnterPassword.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    int i11 = 0;
                    AuthenticationModel authenticationModel2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE2 = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), authenticationModel2);
                            i11 |= 2;
                        }
                    }
                    authenticationModel = authenticationModel2;
                    iE = iE2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignInEnterPassword(i10, iE, authenticationModel, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInEnterPassword signInEnterPassword) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInEnterPassword, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInEnterPassword.write$Self$Termius_app_googleProductionRelease(signInEnterPassword, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, SignInEnterPassword.$childSerializers[1].getValue()};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return SignInEnterPassword.typeMap;
            }

            public final hv.c serializer() {
                return a.f39473a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39475t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39475t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39475t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39475t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39475t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39475t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public /* synthetic */ SignInEnterPassword(int i10, int i11, AuthenticationModel authenticationModel, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39473a.getDescriptor());
            }
            this.featureType = i11;
            this.authenticationModel = authenticationModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ SignInEnterPassword copy$default(SignInEnterPassword signInEnterPassword, int i10, AuthenticationModel authenticationModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signInEnterPassword.featureType;
            }
            if ((i11 & 2) != 0) {
                authenticationModel = signInEnterPassword.authenticationModel;
            }
            return signInEnterPassword.copy(i10, authenticationModel);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInEnterPassword signInEnterPassword, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            dVar.t(fVar, 0, signInEnterPassword.featureType);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), signInEnterPassword.authenticationModel);
        }

        public final int component1() {
            return this.featureType;
        }

        public final AuthenticationModel component2() {
            return this.authenticationModel;
        }

        public final SignInEnterPassword copy(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            return new SignInEnterPassword(i10, authenticationModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignInEnterPassword)) {
                return false;
            }
            SignInEnterPassword signInEnterPassword = (SignInEnterPassword) obj;
            return this.featureType == signInEnterPassword.featureType && ju.t.b(this.authenticationModel, signInEnterPassword.authenticationModel);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (Integer.hashCode(this.featureType) * 31) + this.authenticationModel.hashCode();
        }

        public String toString() {
            return "SignInEnterPassword(featureType=" + this.featureType + ", authenticationModel=" + this.authenticationModel + ")";
        }

        public SignInEnterPassword(int i10, AuthenticationModel authenticationModel) {
            ju.t.f(authenticationModel, "authenticationModel");
            this.featureType = i10;
            this.authenticationModel = authenticationModel;
        }
    }

    @hv.p
    @Keep
    public static final class SignInEnterVerificationCode implements WelcomeFlowGraphRoutes {
        private static final ut.u typeMap;
        private static final ut.u typeMap2;
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        private final byte[] password;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.f
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignInEnterVerificationCode._childSerializers$_anonymous_();
            }
        }), null};

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39477b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39476a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignInEnterVerificationCode", aVar, 3);
                i2Var.r("featureType", false);
                i2Var.r("authenticationModel", false);
                i2Var.r("password", false);
                descriptor = i2Var;
                f39477b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignInEnterVerificationCode deserialize(kv.e eVar) {
                int iE;
                int i10;
                AuthenticationModel authenticationModel;
                byte[] bArr;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = SignInEnterVerificationCode.$childSerializers;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    bArr = (byte[]) cVarD.i(fVar, 2, lv.k.f64731c, null);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    AuthenticationModel authenticationModel2 = null;
                    byte[] bArr2 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), authenticationModel2);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new hv.e0(iD);
                            }
                            bArr2 = (byte[]) cVarD.i(fVar, 2, lv.k.f64731c, bArr2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    authenticationModel = authenticationModel2;
                    bArr = bArr2;
                }
                int i12 = iE;
                cVarD.b(fVar);
                return new SignInEnterVerificationCode(i10, i12, authenticationModel, bArr, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignInEnterVerificationCode signInEnterVerificationCode) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signInEnterVerificationCode, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignInEnterVerificationCode.write$Self$Termius_app_googleProductionRelease(signInEnterVerificationCode, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a, SignInEnterVerificationCode.$childSerializers[1].getValue(), lv.k.f64731c};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return SignInEnterVerificationCode.typeMap;
            }

            public final ut.u b() {
                return SignInEnterVerificationCode.typeMap2;
            }

            public final hv.c serializer() {
                return a.f39476a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39478t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39478t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39478t;
                bVar.a();
                return bVar.b(lv.k.f64731c, string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39478t;
                bVar.a();
                return bVar.b(lv.k.f64731c, str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39478t;
                bVar.a();
                bundle.putString(str, bVar.c(lv.k.f64731c, obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39478t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(lv.k.f64731c, obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public static final class d extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39479t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z10, mv.b bVar) {
                super(z10);
                this.f39479t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39479t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39479t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39479t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39479t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        static {
            qu.l lVarJ = ju.n0.j(byte[].class);
            b.a aVar = mv.b.f65981d;
            typeMap = ut.b0.a(lVarJ, new c(false, aVar));
            typeMap2 = ut.b0.a(ju.n0.j(AuthenticationModel.class), new d(false, aVar));
        }

        public /* synthetic */ SignInEnterVerificationCode(int i10, int i11, AuthenticationModel authenticationModel, byte[] bArr, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f39476a.getDescriptor());
            }
            this.featureType = i11;
            this.authenticationModel = authenticationModel;
            this.password = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ SignInEnterVerificationCode copy$default(SignInEnterVerificationCode signInEnterVerificationCode, int i10, AuthenticationModel authenticationModel, byte[] bArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signInEnterVerificationCode.featureType;
            }
            if ((i11 & 2) != 0) {
                authenticationModel = signInEnterVerificationCode.authenticationModel;
            }
            if ((i11 & 4) != 0) {
                bArr = signInEnterVerificationCode.password;
            }
            return signInEnterVerificationCode.copy(i10, authenticationModel, bArr);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignInEnterVerificationCode signInEnterVerificationCode, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            dVar.t(fVar, 0, signInEnterVerificationCode.featureType);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), signInEnterVerificationCode.authenticationModel);
            dVar.o(fVar, 2, lv.k.f64731c, signInEnterVerificationCode.password);
        }

        public final int component1() {
            return this.featureType;
        }

        public final AuthenticationModel component2() {
            return this.authenticationModel;
        }

        public final byte[] component3() {
            return this.password;
        }

        public final SignInEnterVerificationCode copy(int i10, AuthenticationModel authenticationModel, byte[] bArr) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            return new SignInEnterVerificationCode(i10, authenticationModel, bArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignInEnterVerificationCode)) {
                return false;
            }
            SignInEnterVerificationCode signInEnterVerificationCode = (SignInEnterVerificationCode) obj;
            return this.featureType == signInEnterVerificationCode.featureType && ju.t.b(this.authenticationModel, signInEnterVerificationCode.authenticationModel) && Arrays.equals(this.password, signInEnterVerificationCode.password);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public final byte[] getPassword() {
            return this.password;
        }

        public int hashCode() {
            return (((this.featureType * 31) + this.authenticationModel.hashCode()) * 31) + Arrays.hashCode(this.password);
        }

        public String toString() {
            return "SignInEnterVerificationCode(featureType=" + this.featureType + ", authenticationModel=" + this.authenticationModel + ", password=" + Arrays.toString(this.password) + ")";
        }

        public SignInEnterVerificationCode(int i10, AuthenticationModel authenticationModel, byte[] bArr) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            this.featureType = i10;
            this.authenticationModel = authenticationModel;
            this.password = bArr;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpAlreadyHaveAccount implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String email;
        private final int featureType;
        private final boolean isESSO;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39481b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39480a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount", aVar, 3);
                i2Var.r("email", false);
                i2Var.r("isESSO", false);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39481b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpAlreadyHaveAccount deserialize(kv.e eVar) {
                String strB;
                int iE;
                boolean z10;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    boolean zH = cVarD.H(fVar, 1);
                    iE = cVarD.e(fVar, 2);
                    z10 = zH;
                    i10 = 7;
                } else {
                    strB = null;
                    boolean z11 = true;
                    int iE2 = 0;
                    boolean zH2 = false;
                    int i11 = 0;
                    while (z11) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z11 = false;
                        } else if (iD == 0) {
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new hv.e0(iD);
                            }
                            iE2 = cVarD.e(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    iE = iE2;
                    z10 = zH2;
                    i10 = i11;
                }
                String str = strB;
                cVarD.b(fVar);
                return new SignUpAlreadyHaveAccount(i10, str, z10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpAlreadyHaveAccount signUpAlreadyHaveAccount) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpAlreadyHaveAccount, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpAlreadyHaveAccount.write$Self$Termius_app_googleProductionRelease(signUpAlreadyHaveAccount, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, lv.i.f64704a, lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39480a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignUpAlreadyHaveAccount(int i10, String str, boolean z10, int i11, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f39480a.getDescriptor());
            }
            this.email = str;
            this.isESSO = z10;
            this.featureType = i11;
        }

        public static /* synthetic */ SignUpAlreadyHaveAccount copy$default(SignUpAlreadyHaveAccount signUpAlreadyHaveAccount, String str, boolean z10, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signUpAlreadyHaveAccount.email;
            }
            if ((i11 & 2) != 0) {
                z10 = signUpAlreadyHaveAccount.isESSO;
            }
            if ((i11 & 4) != 0) {
                i10 = signUpAlreadyHaveAccount.featureType;
            }
            return signUpAlreadyHaveAccount.copy(str, z10, i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpAlreadyHaveAccount signUpAlreadyHaveAccount, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, signUpAlreadyHaveAccount.email);
            dVar.u(fVar, 1, signUpAlreadyHaveAccount.isESSO);
            dVar.t(fVar, 2, signUpAlreadyHaveAccount.featureType);
        }

        public final String component1() {
            return this.email;
        }

        public final boolean component2() {
            return this.isESSO;
        }

        public final int component3() {
            return this.featureType;
        }

        public final SignUpAlreadyHaveAccount copy(String str, boolean z10, int i10) {
            ju.t.f(str, "email");
            return new SignUpAlreadyHaveAccount(str, z10, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignUpAlreadyHaveAccount)) {
                return false;
            }
            SignUpAlreadyHaveAccount signUpAlreadyHaveAccount = (SignUpAlreadyHaveAccount) obj;
            return ju.t.b(this.email, signUpAlreadyHaveAccount.email) && this.isESSO == signUpAlreadyHaveAccount.isESSO && this.featureType == signUpAlreadyHaveAccount.featureType;
        }

        public final String getEmail() {
            return this.email;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (((this.email.hashCode() * 31) + Boolean.hashCode(this.isESSO)) * 31) + Integer.hashCode(this.featureType);
        }

        public final boolean isESSO() {
            return this.isESSO;
        }

        public String toString() {
            return "SignUpAlreadyHaveAccount(email=" + this.email + ", isESSO=" + this.isESSO + ", featureType=" + this.featureType + ")";
        }

        public SignUpAlreadyHaveAccount(String str, boolean z10, int i10) {
            ju.t.f(str, "email");
            this.email = str;
            this.isESSO = z10;
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpCheckEmail implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String email;
        private final String error;
        private final int featureType;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39482a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39483b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39482a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpCheckEmail", aVar, 3);
                i2Var.r("email", false);
                i2Var.r("featureType", false);
                i2Var.r("error", true);
                descriptor = i2Var;
                f39483b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpCheckEmail deserialize(kv.e eVar) {
                int i10;
                int i11;
                String str;
                String str2;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    int iE = cVarD.e(fVar, 1);
                    str = strB;
                    str2 = (String) cVarD.v(fVar, 2, x2.f64817a, null);
                    i10 = iE;
                    i11 = 7;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    String strB2 = null;
                    String str3 = null;
                    int i12 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB2 = cVarD.B(fVar, 0);
                            i12 |= 1;
                        } else if (iD == 1) {
                            iE2 = cVarD.e(fVar, 1);
                            i12 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new hv.e0(iD);
                            }
                            str3 = (String) cVarD.v(fVar, 2, x2.f64817a, str3);
                            i12 |= 4;
                        }
                    }
                    i10 = iE2;
                    i11 = i12;
                    str = strB2;
                    str2 = str3;
                }
                cVarD.b(fVar);
                return new SignUpCheckEmail(i11, str, i10, str2, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpCheckEmail signUpCheckEmail) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpCheckEmail, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpCheckEmail.write$Self$Termius_app_googleProductionRelease(signUpCheckEmail, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{x2Var, lv.w0.f64808a, iv.a.u(x2Var)};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39482a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignUpCheckEmail(int i10, String str, int i11, String str2, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39482a.getDescriptor());
            }
            this.email = str;
            this.featureType = i11;
            if ((i10 & 4) == 0) {
                this.error = null;
            } else {
                this.error = str2;
            }
        }

        public static /* synthetic */ SignUpCheckEmail copy$default(SignUpCheckEmail signUpCheckEmail, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signUpCheckEmail.email;
            }
            if ((i11 & 2) != 0) {
                i10 = signUpCheckEmail.featureType;
            }
            if ((i11 & 4) != 0) {
                str2 = signUpCheckEmail.error;
            }
            return signUpCheckEmail.copy(str, i10, str2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpCheckEmail signUpCheckEmail, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, signUpCheckEmail.email);
            dVar.t(fVar, 1, signUpCheckEmail.featureType);
            if (!dVar.E(fVar, 2) && signUpCheckEmail.error == null) {
                return;
            }
            dVar.v(fVar, 2, x2.f64817a, signUpCheckEmail.error);
        }

        public final String component1() {
            return this.email;
        }

        public final int component2() {
            return this.featureType;
        }

        public final String component3() {
            return this.error;
        }

        public final SignUpCheckEmail copy(String str, int i10, String str2) {
            ju.t.f(str, "email");
            return new SignUpCheckEmail(str, i10, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignUpCheckEmail)) {
                return false;
            }
            SignUpCheckEmail signUpCheckEmail = (SignUpCheckEmail) obj;
            return ju.t.b(this.email, signUpCheckEmail.email) && this.featureType == signUpCheckEmail.featureType && ju.t.b(this.error, signUpCheckEmail.error);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getError() {
            return this.error;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            int iHashCode = ((this.email.hashCode() * 31) + Integer.hashCode(this.featureType)) * 31;
            String str = this.error;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SignUpCheckEmail(email=" + this.email + ", featureType=" + this.featureType + ", error=" + this.error + ")";
        }

        public SignUpCheckEmail(String str, int i10, String str2) {
            ju.t.f(str, "email");
            this.email = str;
            this.featureType = i10;
            this.error = str2;
        }

        public /* synthetic */ SignUpCheckEmail(String str, int i10, String str2, int i11, ju.k kVar) {
            this(str, i10, (i11 & 4) != 0 ? null : str2);
        }
    }

    @hv.p
    @Keep
    public static final class SignUpChooser implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int featureType;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39485b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39484a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpChooser", aVar, 1);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39485b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpChooser deserialize(kv.e eVar) {
                int iE;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new hv.e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignUpChooser(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpChooser signUpChooser) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpChooser, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpChooser.write$Self$Termius_app_googleProductionRelease(signUpChooser, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39484a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignUpChooser(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f39484a.getDescriptor());
            }
            this.featureType = i11;
        }

        public static /* synthetic */ SignUpChooser copy$default(SignUpChooser signUpChooser, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signUpChooser.featureType;
            }
            return signUpChooser.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpChooser signUpChooser, kv.d dVar, jv.f fVar) {
            dVar.t(fVar, 0, signUpChooser.featureType);
        }

        public final int component1() {
            return this.featureType;
        }

        public final SignUpChooser copy(int i10) {
            return new SignUpChooser(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignUpChooser) && this.featureType == ((SignUpChooser) obj).featureType;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return Integer.hashCode(this.featureType);
        }

        public String toString() {
            return "SignUpChooser(featureType=" + this.featureType + ")";
        }

        public SignUpChooser(int i10) {
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpCongratulation implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int trialDays;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39487b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39486a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpCongratulation", aVar, 1);
                i2Var.r("trialDays", false);
                descriptor = i2Var;
                f39487b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpCongratulation deserialize(kv.e eVar) {
                int iE;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new hv.e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignUpCongratulation(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpCongratulation signUpCongratulation) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpCongratulation, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpCongratulation.write$Self$Termius_app_googleProductionRelease(signUpCongratulation, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39486a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignUpCongratulation(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f39486a.getDescriptor());
            }
            this.trialDays = i11;
        }

        public static /* synthetic */ SignUpCongratulation copy$default(SignUpCongratulation signUpCongratulation, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signUpCongratulation.trialDays;
            }
            return signUpCongratulation.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpCongratulation signUpCongratulation, kv.d dVar, jv.f fVar) {
            dVar.t(fVar, 0, signUpCongratulation.trialDays);
        }

        public final int component1() {
            return this.trialDays;
        }

        public final SignUpCongratulation copy(int i10) {
            return new SignUpCongratulation(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignUpCongratulation) && this.trialDays == ((SignUpCongratulation) obj).trialDays;
        }

        public final int getTrialDays() {
            return this.trialDays;
        }

        public int hashCode() {
            return Integer.hashCode(this.trialDays);
        }

        public String toString() {
            return "SignUpCongratulation(trialDays=" + this.trialDays + ")";
        }

        public SignUpCongratulation(int i10) {
            this.trialDays = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpEnterEmail implements WelcomeFlowGraphRoutes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int featureType;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39489b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39488a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpEnterEmail", aVar, 1);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39489b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpEnterEmail deserialize(kv.e eVar) {
                int iE;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new hv.e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignUpEnterEmail(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpEnterEmail signUpEnterEmail) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpEnterEmail, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpEnterEmail.write$Self$Termius_app_googleProductionRelease(signUpEnterEmail, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f39488a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public /* synthetic */ SignUpEnterEmail(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f39488a.getDescriptor());
            }
            this.featureType = i11;
        }

        public static /* synthetic */ SignUpEnterEmail copy$default(SignUpEnterEmail signUpEnterEmail, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = signUpEnterEmail.featureType;
            }
            return signUpEnterEmail.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpEnterEmail signUpEnterEmail, kv.d dVar, jv.f fVar) {
            dVar.t(fVar, 0, signUpEnterEmail.featureType);
        }

        public final int component1() {
            return this.featureType;
        }

        public final SignUpEnterEmail copy(int i10) {
            return new SignUpEnterEmail(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignUpEnterEmail) && this.featureType == ((SignUpEnterEmail) obj).featureType;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return Integer.hashCode(this.featureType);
        }

        public String toString() {
            return "SignUpEnterEmail(featureType=" + this.featureType + ")";
        }

        public SignUpEnterEmail(int i10) {
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpEnterPassword implements WelcomeFlowGraphRoutes {
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.g
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignUpEnterPassword._childSerializers$_anonymous_();
            }
        }), null};
        private static final ut.u typeMap = ut.b0.a(ju.n0.j(AuthenticationModel.class), new c(false, mv.b.f65981d));

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39491b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39490a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpEnterPassword", aVar, 2);
                i2Var.r("authenticationModel", false);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39491b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpEnterPassword deserialize(kv.e eVar) {
                AuthenticationModel authenticationModel;
                int iE;
                int i10;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = SignUpEnterPassword.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    iE = cVarD.e(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    int i11 = 0;
                    AuthenticationModel authenticationModel2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), authenticationModel2);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new hv.e0(iD);
                            }
                            iE2 = cVarD.e(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    authenticationModel = authenticationModel2;
                    iE = iE2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SignUpEnterPassword(i10, authenticationModel, iE, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpEnterPassword signUpEnterPassword) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpEnterPassword, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpEnterPassword.write$Self$Termius_app_googleProductionRelease(signUpEnterPassword, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{SignUpEnterPassword.$childSerializers[0].getValue(), lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return SignUpEnterPassword.typeMap;
            }

            public final hv.c serializer() {
                return a.f39490a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39492t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39492t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39492t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39492t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39492t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39492t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public /* synthetic */ SignUpEnterPassword(int i10, AuthenticationModel authenticationModel, int i11, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f39490a.getDescriptor());
            }
            this.authenticationModel = authenticationModel;
            this.featureType = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ SignUpEnterPassword copy$default(SignUpEnterPassword signUpEnterPassword, AuthenticationModel authenticationModel, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authenticationModel = signUpEnterPassword.authenticationModel;
            }
            if ((i11 & 2) != 0) {
                i10 = signUpEnterPassword.featureType;
            }
            return signUpEnterPassword.copy(authenticationModel, i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpEnterPassword signUpEnterPassword, kv.d dVar, jv.f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), signUpEnterPassword.authenticationModel);
            dVar.t(fVar, 1, signUpEnterPassword.featureType);
        }

        public final AuthenticationModel component1() {
            return this.authenticationModel;
        }

        public final int component2() {
            return this.featureType;
        }

        public final SignUpEnterPassword copy(AuthenticationModel authenticationModel, int i10) {
            ju.t.f(authenticationModel, "authenticationModel");
            return new SignUpEnterPassword(authenticationModel, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignUpEnterPassword)) {
                return false;
            }
            SignUpEnterPassword signUpEnterPassword = (SignUpEnterPassword) obj;
            return ju.t.b(this.authenticationModel, signUpEnterPassword.authenticationModel) && this.featureType == signUpEnterPassword.featureType;
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public int hashCode() {
            return (this.authenticationModel.hashCode() * 31) + Integer.hashCode(this.featureType);
        }

        public String toString() {
            return "SignUpEnterPassword(authenticationModel=" + this.authenticationModel + ", featureType=" + this.featureType + ")";
        }

        public SignUpEnterPassword(AuthenticationModel authenticationModel, int i10) {
            ju.t.f(authenticationModel, "authenticationModel");
            this.authenticationModel = authenticationModel;
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpInitPersonalVault implements WelcomeFlowGraphRoutes {
        private static final ut.u typeMap;
        private static final ut.u typeMap2;
        private final AuthenticationModel authenticationModel;
        private final int featureType;
        private final byte[] password;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final ut.n[] $childSerializers = {ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.h
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignUpInitPersonalVault._childSerializers$_anonymous_();
            }
        }), null, null};

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f39494b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f39493a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpInitPersonalVault", aVar, 3);
                i2Var.r("authenticationModel", false);
                i2Var.r("password", false);
                i2Var.r("featureType", false);
                descriptor = i2Var;
                f39494b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SignUpInitPersonalVault deserialize(kv.e eVar) {
                int iE;
                int i10;
                AuthenticationModel authenticationModel;
                byte[] bArr;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                ut.n[] nVarArr = SignUpInitPersonalVault.$childSerializers;
                if (cVarD.l()) {
                    authenticationModel = (AuthenticationModel) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    bArr = (byte[]) cVarD.i(fVar, 1, lv.k.f64731c, null);
                    iE = cVarD.e(fVar, 2);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int iE2 = 0;
                    AuthenticationModel authenticationModel2 = null;
                    byte[] bArr2 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            authenticationModel2 = (AuthenticationModel) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), authenticationModel2);
                            i11 |= 1;
                        } else if (iD == 1) {
                            bArr2 = (byte[]) cVarD.i(fVar, 1, lv.k.f64731c, bArr2);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new hv.e0(iD);
                            }
                            iE2 = cVarD.e(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    iE = iE2;
                    i10 = i11;
                    authenticationModel = authenticationModel2;
                    bArr = bArr2;
                }
                cVarD.b(fVar);
                return new SignUpInitPersonalVault(i10, authenticationModel, bArr, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SignUpInitPersonalVault signUpInitPersonalVault) {
                ju.t.f(fVar, "encoder");
                ju.t.f(signUpInitPersonalVault, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SignUpInitPersonalVault.write$Self$Termius_app_googleProductionRelease(signUpInitPersonalVault, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{SignUpInitPersonalVault.$childSerializers[0].getValue(), lv.k.f64731c, lv.w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final ut.u a() {
                return SignUpInitPersonalVault.typeMap;
            }

            public final ut.u b() {
                return SignUpInitPersonalVault.typeMap2;
            }

            public final hv.c serializer() {
                return a.f39493a;
            }

            private b() {
            }
        }

        public static final class c extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39495t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, mv.b bVar) {
                super(z10);
                this.f39495t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39495t;
                bVar.a();
                return bVar.b(lv.k.f64731c, string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39495t;
                bVar.a();
                return bVar.b(lv.k.f64731c, str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39495t;
                bVar.a();
                bundle.putString(str, bVar.c(lv.k.f64731c, obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39495t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(lv.k.f64731c, obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public static final class d extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f39496t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z10, mv.b bVar) {
                super(z10);
                this.f39496t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f39496t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                ju.t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39496t;
                bVar.a();
                return bVar.b(AuthenticationModel.Companion.serializer(), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                ju.t.f(bundle, "bundle");
                ju.t.f(str, SerializableEvent.KEY_FIELD);
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39496t;
                bVar.a();
                bundle.putString(str, bVar.c(AuthenticationModel.Companion.serializer(), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                ju.t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f39496t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(AuthenticationModel.Companion.serializer(), obj));
                ju.t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        static {
            qu.l lVarJ = ju.n0.j(byte[].class);
            b.a aVar = mv.b.f65981d;
            typeMap = ut.b0.a(lVarJ, new c(false, aVar));
            typeMap2 = ut.b0.a(ju.n0.j(AuthenticationModel.class), new d(false, aVar));
        }

        public /* synthetic */ SignUpInitPersonalVault(int i10, AuthenticationModel authenticationModel, byte[] bArr, int i11, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f39493a.getDescriptor());
            }
            this.authenticationModel = authenticationModel;
            this.password = bArr;
            this.featureType = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new hv.m("com.server.auditor.ssh.client.models.account.AuthenticationModel", ju.n0.b(AuthenticationModel.class), new qu.b[]{ju.n0.b(EmailAuthentication.class), ju.n0.b(EnterpriseSingleSignOnAuthentication.class), ju.n0.b(AppleSingleSignOnAuthentication.class), ju.n0.b(GoogleSingleSignOnAuthentication.class)}, new hv.c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }

        public static /* synthetic */ SignUpInitPersonalVault copy$default(SignUpInitPersonalVault signUpInitPersonalVault, AuthenticationModel authenticationModel, byte[] bArr, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authenticationModel = signUpInitPersonalVault.authenticationModel;
            }
            if ((i11 & 2) != 0) {
                bArr = signUpInitPersonalVault.password;
            }
            if ((i11 & 4) != 0) {
                i10 = signUpInitPersonalVault.featureType;
            }
            return signUpInitPersonalVault.copy(authenticationModel, bArr, i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SignUpInitPersonalVault signUpInitPersonalVault, kv.d dVar, jv.f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), signUpInitPersonalVault.authenticationModel);
            dVar.o(fVar, 1, lv.k.f64731c, signUpInitPersonalVault.password);
            dVar.t(fVar, 2, signUpInitPersonalVault.featureType);
        }

        public final AuthenticationModel component1() {
            return this.authenticationModel;
        }

        public final byte[] component2() {
            return this.password;
        }

        public final int component3() {
            return this.featureType;
        }

        public final SignUpInitPersonalVault copy(AuthenticationModel authenticationModel, byte[] bArr, int i10) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            return new SignUpInitPersonalVault(authenticationModel, bArr, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignUpInitPersonalVault)) {
                return false;
            }
            SignUpInitPersonalVault signUpInitPersonalVault = (SignUpInitPersonalVault) obj;
            return this.featureType == signUpInitPersonalVault.featureType && ju.t.b(this.authenticationModel, signUpInitPersonalVault.authenticationModel) && Arrays.equals(this.password, signUpInitPersonalVault.password);
        }

        public final AuthenticationModel getAuthenticationModel() {
            return this.authenticationModel;
        }

        public final int getFeatureType() {
            return this.featureType;
        }

        public final byte[] getPassword() {
            return this.password;
        }

        public int hashCode() {
            return (((this.featureType * 31) + this.authenticationModel.hashCode()) * 31) + Arrays.hashCode(this.password);
        }

        public String toString() {
            return "SignUpInitPersonalVault(authenticationModel=" + this.authenticationModel + ", password=" + Arrays.toString(this.password) + ", featureType=" + this.featureType + ")";
        }

        public SignUpInitPersonalVault(AuthenticationModel authenticationModel, byte[] bArr, int i10) {
            ju.t.f(authenticationModel, "authenticationModel");
            ju.t.f(bArr, "password");
            this.authenticationModel = authenticationModel;
            this.password = bArr;
            this.featureType = i10;
        }
    }

    @hv.p
    @Keep
    public static final class SignUpPromoteDesktopApp implements WelcomeFlowGraphRoutes {
        public static final SignUpPromoteDesktopApp INSTANCE = new SignUpPromoteDesktopApp();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.i
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private SignUpPromoteDesktopApp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignUpPromoteDesktopApp);
        }

        public int hashCode() {
            return -1578145196;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SignUpPromoteDesktopApp";
        }
    }

    @hv.p
    @Keep
    public static final class SignUpPromotePremium implements WelcomeFlowGraphRoutes {
        public static final SignUpPromotePremium INSTANCE = new SignUpPromotePremium();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.j
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.SignUpPromotePremium._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private SignUpPromotePremium() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpPromotePremium", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignUpPromotePremium);
        }

        public int hashCode() {
            return 1705569992;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SignUpPromotePremium";
        }
    }

    @hv.p
    @Keep
    public static final class WelcomeIntro implements WelcomeFlowGraphRoutes {
        public static final WelcomeIntro INSTANCE = new WelcomeIntro();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: vn.k
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowGraphRoutes.WelcomeIntro._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private WelcomeIntro() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.WelcomeIntro", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WelcomeIntro);
        }

        public int hashCode() {
            return 811043363;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WelcomeIntro";
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39497a = new a();

        private a() {
        }

        public final hv.c serializer() {
            return new hv.m("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes", ju.n0.b(WelcomeFlowGraphRoutes.class), new qu.b[]{ju.n0.b(ResetPasswordGetInstructions.class), ju.n0.b(ResetPasswordInstructionsSent.class), ju.n0.b(SignInAccountNotFound.class), ju.n0.b(SignInCheckEmailToVerify.class), ju.n0.b(SignInChooser.class), ju.n0.b(SignInEnterEmail.class), ju.n0.b(SignInEnterPassword.class), ju.n0.b(SignInEnterVerificationCode.class), ju.n0.b(SignUpAlreadyHaveAccount.class), ju.n0.b(SignUpCheckEmail.class), ju.n0.b(SignUpChooser.class), ju.n0.b(SignUpCongratulation.class), ju.n0.b(SignUpEnterEmail.class), ju.n0.b(SignUpEnterPassword.class), ju.n0.b(SignUpInitPersonalVault.class), ju.n0.b(SignUpPromoteDesktopApp.class), ju.n0.b(SignUpPromotePremium.class), ju.n0.b(WelcomeIntro.class)}, new hv.c[]{ResetPasswordGetInstructions.a.f39457a, ResetPasswordInstructionsSent.a.f39460a, SignInAccountNotFound.a.f39463a, SignInCheckEmailToVerify.a.f39465a, SignInChooser.a.f39469a, SignInEnterEmail.a.f39471a, SignInEnterPassword.a.f39473a, SignInEnterVerificationCode.a.f39476a, SignUpAlreadyHaveAccount.a.f39480a, SignUpCheckEmail.a.f39482a, SignUpChooser.a.f39484a, SignUpCongratulation.a.f39486a, SignUpEnterEmail.a.f39488a, SignUpEnterPassword.a.f39490a, SignUpInitPersonalVault.a.f39493a, new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp", SignUpPromoteDesktopApp.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.SignUpPromotePremium", SignUpPromotePremium.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes.WelcomeIntro", WelcomeIntro.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }
}
