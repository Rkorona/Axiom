package com.server.auditor.ssh.client.ui.cryptography.data;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.ui.cryptography.data.EncryptionFailureCause;
import hv.c;
import hv.e0;
import hv.m;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import lv.x2;
import qu.b;
import ut.n;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public interface EncryptionFailureCause {
    public static final a Companion = a.f40167a;

    @p
    @o("CryptorReturnedNull")
    public static final class CryptorReturnedNull implements EncryptionFailureCause {
        public static final CryptorReturnedNull INSTANCE = new CryptorReturnedNull();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: go.c
            @Override // iu.a
            public final Object a() {
                return EncryptionFailureCause.CryptorReturnedNull._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private CryptorReturnedNull() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("CryptorReturnedNull", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CryptorReturnedNull);
        }

        public int hashCode() {
            return 278395720;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CryptorReturnedNull";
        }
    }

    @p
    @o("FailedToEncrypt")
    public static final class FailedToEncrypt implements EncryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String exceptionType;
        private final String message;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40164b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40163a = aVar;
                i2 i2Var = new i2("FailedToEncrypt", aVar, 2);
                i2Var.r(NewConnectionFlowActivity.EXTRA_MESSAGE, false);
                i2Var.r("exceptionType", false);
                descriptor = i2Var;
                f40164b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FailedToEncrypt deserialize(e eVar) {
                String str;
                int i10;
                String str2;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    x2 x2Var = x2.f64817a;
                    str2 = (String) cVarD.v(fVar, 0, x2Var, null);
                    str = (String) cVarD.v(fVar, 1, x2Var, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    str = null;
                    String str3 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            str3 = (String) cVarD.v(fVar, 0, x2.f64817a, str3);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            str = (String) cVarD.v(fVar, 1, x2.f64817a, str);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    str2 = str3;
                }
                cVarD.b(fVar);
                return new FailedToEncrypt(i10, str2, str, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, FailedToEncrypt failedToEncrypt) {
                t.f(fVar, "encoder");
                t.f(failedToEncrypt, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                FailedToEncrypt.write$Self$Termius_app_googleProductionRelease(failedToEncrypt, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new c[]{iv.a.u(x2Var), iv.a.u(x2Var)};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final c serializer() {
                return a.f40163a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ FailedToEncrypt(int i10, String str, String str2, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f40163a.getDescriptor());
            }
            this.message = str;
            this.exceptionType = str2;
        }

        public static /* synthetic */ FailedToEncrypt copy$default(FailedToEncrypt failedToEncrypt, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failedToEncrypt.message;
            }
            if ((i10 & 2) != 0) {
                str2 = failedToEncrypt.exceptionType;
            }
            return failedToEncrypt.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(FailedToEncrypt failedToEncrypt, d dVar, f fVar) {
            x2 x2Var = x2.f64817a;
            dVar.v(fVar, 0, x2Var, failedToEncrypt.message);
            dVar.v(fVar, 1, x2Var, failedToEncrypt.exceptionType);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.exceptionType;
        }

        public final FailedToEncrypt copy(String str, String str2) {
            return new FailedToEncrypt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedToEncrypt)) {
                return false;
            }
            FailedToEncrypt failedToEncrypt = (FailedToEncrypt) obj;
            return t.b(this.message, failedToEncrypt.message) && t.b(this.exceptionType, failedToEncrypt.exceptionType);
        }

        public final String getExceptionType() {
            return this.exceptionType;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.exceptionType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FailedToEncrypt(message=" + this.message + ", exceptionType=" + this.exceptionType + ")";
        }

        public FailedToEncrypt(String str, String str2) {
            this.message = str;
            this.exceptionType = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FailedToEncrypt(Throwable th2) {
            this(th2.getMessage(), ju.n0.b(th2.getClass()).d());
            t.f(th2, "throwable");
        }
    }

    @p
    @o("InputStringIsNull")
    public static final class InputStringIsNull implements EncryptionFailureCause {
        public static final InputStringIsNull INSTANCE = new InputStringIsNull();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: go.d
            @Override // iu.a
            public final Object a() {
                return EncryptionFailureCause.InputStringIsNull._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private InputStringIsNull() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("InputStringIsNull", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InputStringIsNull);
        }

        public int hashCode() {
            return 287123277;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "InputStringIsNull";
        }
    }

    @p
    @o("LibsodiumReturnedNull")
    public static final class LibsodiumReturnedNull implements EncryptionFailureCause {
        public static final LibsodiumReturnedNull INSTANCE = new LibsodiumReturnedNull();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: go.e
            @Override // iu.a
            public final Object a() {
                return EncryptionFailureCause.LibsodiumReturnedNull._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private LibsodiumReturnedNull() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("LibsodiumReturnedNull", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LibsodiumReturnedNull);
        }

        public int hashCode() {
            return 1929002165;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "LibsodiumReturnedNull";
        }
    }

    @p
    @o("Other")
    public static final class Other implements EncryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String message;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40166b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40165a = aVar;
                i2 i2Var = new i2("Other", aVar, 1);
                i2Var.r(NewConnectionFlowActivity.EXTRA_MESSAGE, false);
                descriptor = i2Var;
                f40166b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Other deserialize(e eVar) {
                String strB;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            strB = cVarD.B(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new Other(i10, strB, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, Other other) {
                t.f(fVar, "encoder");
                t.f(other, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                Other.write$Self$Termius_app_googleProductionRelease(other, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final c[] childSerializers() {
                return new c[]{x2.f64817a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final c serializer() {
                return a.f40165a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ Other(int i10, String str, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40165a.getDescriptor());
            }
            this.message = str;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = other.message;
            }
            return other.copy(str);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Other other, d dVar, f fVar) {
            dVar.f(fVar, 0, other.message);
        }

        public final String component1() {
            return this.message;
        }

        public final Other copy(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            return new Other(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Other) && t.b(this.message, ((Other) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Other(message=" + this.message + ")";
        }

        public Other(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            this.message = str;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40167a = new a();

        private a() {
        }

        public final c serializer() {
            return new m("com.server.auditor.ssh.client.ui.cryptography.data.EncryptionFailureCause", ju.n0.b(EncryptionFailureCause.class), new b[]{ju.n0.b(CryptorReturnedNull.class), ju.n0.b(FailedToEncrypt.class), ju.n0.b(InputStringIsNull.class), ju.n0.b(LibsodiumReturnedNull.class), ju.n0.b(Other.class)}, new c[]{new w1("CryptorReturnedNull", CryptorReturnedNull.INSTANCE, new Annotation[0]), FailedToEncrypt.a.f40163a, new w1("InputStringIsNull", InputStringIsNull.INSTANCE, new Annotation[0]), new w1("LibsodiumReturnedNull", LibsodiumReturnedNull.INSTANCE, new Annotation[0]), Other.a.f40165a}, new Annotation[0]);
        }
    }
}
