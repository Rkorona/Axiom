package com.server.auditor.ssh.client.ui.cryptography.data;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.ui.cryptography.data.DecryptionFailureCause;
import hv.e0;
import hv.m;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.w1;
import lv.x2;
import qu.b;
import ut.n;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public interface DecryptionFailureCause {
    public static final a Companion = a.f40162a;

    @p
    @o("CryptorReturnedNull")
    public static final class CryptorReturnedNull implements DecryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int version;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40153b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40152a = aVar;
                i2 i2Var = new i2("CryptorReturnedNull", aVar, 1);
                i2Var.r("version", false);
                descriptor = i2Var;
                f40153b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CryptorReturnedNull deserialize(e eVar) {
                int iE;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
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
                                throw new e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new CryptorReturnedNull(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, CryptorReturnedNull cryptorReturnedNull) {
                t.f(fVar, "encoder");
                t.f(cryptorReturnedNull, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                CryptorReturnedNull.write$Self$Termius_app_googleProductionRelease(cryptorReturnedNull, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
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
                return a.f40152a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ CryptorReturnedNull(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40152a.getDescriptor());
            }
            this.version = i11;
        }

        public static /* synthetic */ CryptorReturnedNull copy$default(CryptorReturnedNull cryptorReturnedNull, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = cryptorReturnedNull.version;
            }
            return cryptorReturnedNull.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CryptorReturnedNull cryptorReturnedNull, d dVar, f fVar) {
            dVar.t(fVar, 0, cryptorReturnedNull.version);
        }

        public final int component1() {
            return this.version;
        }

        public final CryptorReturnedNull copy(int i10) {
            return new CryptorReturnedNull(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CryptorReturnedNull) && this.version == ((CryptorReturnedNull) obj).version;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return Integer.hashCode(this.version);
        }

        public String toString() {
            return "CryptorReturnedNull(version=" + this.version + ")";
        }

        public CryptorReturnedNull(int i10) {
            this.version = i10;
        }
    }

    @p
    @o("MalformedCiphertext")
    public static final class MalformedCiphertext implements DecryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int byteLength;
        private final String message;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40155b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40154a = aVar;
                i2 i2Var = new i2("MalformedCiphertext", aVar, 2);
                i2Var.r("byteLength", false);
                i2Var.r(NewConnectionFlowActivity.EXTRA_MESSAGE, true);
                descriptor = i2Var;
                f40155b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MalformedCiphertext deserialize(e eVar) {
                int iE;
                String str;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    str = (String) cVarD.v(fVar, 1, x2.f64817a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    String str2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            str2 = (String) cVarD.v(fVar, 1, x2.f64817a, str2);
                            i11 |= 2;
                        }
                    }
                    str = str2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new MalformedCiphertext(i10, iE, str, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, MalformedCiphertext malformedCiphertext) {
                t.f(fVar, "encoder");
                t.f(malformedCiphertext, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                MalformedCiphertext.write$Self$Termius_app_googleProductionRelease(malformedCiphertext, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{w0.f64808a, iv.a.u(x2.f64817a)};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
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
                return a.f40154a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ MalformedCiphertext(int i10, int i11, String str, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40154a.getDescriptor());
            }
            this.byteLength = i11;
            if ((i10 & 2) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
        }

        public static /* synthetic */ MalformedCiphertext copy$default(MalformedCiphertext malformedCiphertext, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = malformedCiphertext.byteLength;
            }
            if ((i11 & 2) != 0) {
                str = malformedCiphertext.message;
            }
            return malformedCiphertext.copy(i10, str);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(MalformedCiphertext malformedCiphertext, d dVar, f fVar) {
            dVar.t(fVar, 0, malformedCiphertext.byteLength);
            if (!dVar.E(fVar, 1) && malformedCiphertext.message == null) {
                return;
            }
            dVar.v(fVar, 1, x2.f64817a, malformedCiphertext.message);
        }

        public final int component1() {
            return this.byteLength;
        }

        public final String component2() {
            return this.message;
        }

        public final MalformedCiphertext copy(int i10, String str) {
            return new MalformedCiphertext(i10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MalformedCiphertext)) {
                return false;
            }
            MalformedCiphertext malformedCiphertext = (MalformedCiphertext) obj;
            return this.byteLength == malformedCiphertext.byteLength && t.b(this.message, malformedCiphertext.message);
        }

        public final int getByteLength() {
            return this.byteLength;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.byteLength) * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MalformedCiphertext(byteLength=" + this.byteLength + ", message=" + this.message + ")";
        }

        public MalformedCiphertext(int i10, String str) {
            this.byteLength = i10;
            this.message = str;
        }

        public /* synthetic */ MalformedCiphertext(int i10, String str, int i11, k kVar) {
            this(i10, (i11 & 2) != 0 ? null : str);
        }
    }

    @p
    @o("NotBase64")
    public static final class NotBase64 implements DecryptionFailureCause {
        public static final NotBase64 INSTANCE = new NotBase64();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: go.a
            @Override // iu.a
            public final Object a() {
                return DecryptionFailureCause.NotBase64._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private NotBase64() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("NotBase64", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotBase64);
        }

        public int hashCode() {
            return 1937829371;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NotBase64";
        }
    }

    @p
    @o("Other")
    public static final class Other implements DecryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String message;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40157b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40156a = aVar;
                i2 i2Var = new i2("Other", aVar, 1);
                i2Var.r(NewConnectionFlowActivity.EXTRA_MESSAGE, false);
                descriptor = i2Var;
                f40157b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Other deserialize(e eVar) {
                String strB;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
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
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
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
                return a.f40156a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ Other(int i10, String str, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40156a.getDescriptor());
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

    @p
    @o("ReflectionFailure")
    public static final class ReflectionFailure implements DecryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String exceptionType;
        private final String message;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40159b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40158a = aVar;
                i2 i2Var = new i2("ReflectionFailure", aVar, 2);
                i2Var.r(NewConnectionFlowActivity.EXTRA_MESSAGE, false);
                i2Var.r("exceptionType", false);
                descriptor = i2Var;
                f40159b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReflectionFailure deserialize(e eVar) {
                String str;
                int i10;
                String str2;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
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
                return new ReflectionFailure(i10, str2, str, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ReflectionFailure reflectionFailure) {
                t.f(fVar, "encoder");
                t.f(reflectionFailure, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ReflectionFailure.write$Self$Termius_app_googleProductionRelease(reflectionFailure, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{iv.a.u(x2Var), iv.a.u(x2Var)};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
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
                return a.f40158a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ ReflectionFailure(int i10, String str, String str2, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f40158a.getDescriptor());
            }
            this.message = str;
            this.exceptionType = str2;
        }

        public static /* synthetic */ ReflectionFailure copy$default(ReflectionFailure reflectionFailure, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = reflectionFailure.message;
            }
            if ((i10 & 2) != 0) {
                str2 = reflectionFailure.exceptionType;
            }
            return reflectionFailure.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ReflectionFailure reflectionFailure, d dVar, f fVar) {
            x2 x2Var = x2.f64817a;
            dVar.v(fVar, 0, x2Var, reflectionFailure.message);
            dVar.v(fVar, 1, x2Var, reflectionFailure.exceptionType);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.exceptionType;
        }

        public final ReflectionFailure copy(String str, String str2) {
            return new ReflectionFailure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectionFailure)) {
                return false;
            }
            ReflectionFailure reflectionFailure = (ReflectionFailure) obj;
            return t.b(this.message, reflectionFailure.message) && t.b(this.exceptionType, reflectionFailure.exceptionType);
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
            return "ReflectionFailure(message=" + this.message + ", exceptionType=" + this.exceptionType + ")";
        }

        public ReflectionFailure(String str, String str2) {
            this.message = str;
            this.exceptionType = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ReflectionFailure(Throwable th2) {
            this(th2.getMessage(), ju.n0.b(th2.getClass()).d());
            t.f(th2, "throwable");
        }
    }

    @p
    @o("UnsupportedVersion")
    public static final class UnsupportedVersion implements DecryptionFailureCause {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int version;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40161b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40160a = aVar;
                i2 i2Var = new i2("UnsupportedVersion", aVar, 1);
                i2Var.r("version", false);
                descriptor = i2Var;
                f40161b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnsupportedVersion deserialize(e eVar) {
                int iE;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
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
                                throw new e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new UnsupportedVersion(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, UnsupportedVersion unsupportedVersion) {
                t.f(fVar, "encoder");
                t.f(unsupportedVersion, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                UnsupportedVersion.write$Self$Termius_app_googleProductionRelease(unsupportedVersion, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
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
                return a.f40160a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ UnsupportedVersion(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40160a.getDescriptor());
            }
            this.version = i11;
        }

        public static /* synthetic */ UnsupportedVersion copy$default(UnsupportedVersion unsupportedVersion, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = unsupportedVersion.version;
            }
            return unsupportedVersion.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UnsupportedVersion unsupportedVersion, d dVar, f fVar) {
            dVar.t(fVar, 0, unsupportedVersion.version);
        }

        public final int component1() {
            return this.version;
        }

        public final UnsupportedVersion copy(int i10) {
            return new UnsupportedVersion(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedVersion) && this.version == ((UnsupportedVersion) obj).version;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return Integer.hashCode(this.version);
        }

        public String toString() {
            return "UnsupportedVersion(version=" + this.version + ")";
        }

        public UnsupportedVersion(int i10) {
            this.version = i10;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40162a = new a();

        private a() {
        }

        public final hv.c serializer() {
            return new m("com.server.auditor.ssh.client.ui.cryptography.data.DecryptionFailureCause", ju.n0.b(DecryptionFailureCause.class), new b[]{ju.n0.b(CryptorReturnedNull.class), ju.n0.b(MalformedCiphertext.class), ju.n0.b(NotBase64.class), ju.n0.b(Other.class), ju.n0.b(ReflectionFailure.class), ju.n0.b(UnsupportedVersion.class)}, new hv.c[]{CryptorReturnedNull.a.f40152a, MalformedCiphertext.a.f40154a, new w1("NotBase64", NotBase64.INSTANCE, new Annotation[0]), Other.a.f40156a, ReflectionFailure.a.f40158a, UnsupportedVersion.a.f40160a}, new Annotation[0]);
        }
    }
}
