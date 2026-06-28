package com.server.auditor.ssh.client.ui.vaults.data;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import hv.c;
import hv.e0;
import hv.m;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import ut.b0;
import ut.n;
import ut.o;
import ut.r;
import ut.u;

/* JADX INFO: loaded from: classes4.dex */
@p
public abstract class VaultKeyIdSpecification implements Parcelable {
    public static final int $stable = 0;
    public static final a Companion = new a(null);
    private static final u typeMap = b0.a(n0.j(VaultKeyIdSpecification.class), new b(false, mv.b.f65981d));
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: op.h
        @Override // iu.a
        public final Object a() {
            return VaultKeyIdSpecification._init_$_anonymous_();
        }
    });

    @p
    public static final class NotSpecified extends VaultKeyIdSpecification {
        public static final NotSpecified INSTANCE = new NotSpecified();
        public static final Parcelable.Creator<NotSpecified> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: op.i
            @Override // iu.a
            public final Object a() {
                return VaultKeyIdSpecification.NotSpecified._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NotSpecified createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return NotSpecified.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NotSpecified[] newArray(int i10) {
                return new NotSpecified[i10];
            }
        }

        private NotSpecified() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification.NotSpecified", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotSpecified);
        }

        public int hashCode() {
            return 786994770;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NotSpecified";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    public static final class Specified extends VaultKeyIdSpecification {
        public static final int $stable = 0;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Specified> CREATOR = new c();

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41422b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f41421a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification.Specified", aVar, 1);
                i2Var.r("vaultKeyId", false);
                descriptor = i2Var;
                f41422b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Specified deserialize(e eVar) {
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    vaultKeyId = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new Specified(i10, vaultKeyId, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, Specified specified) {
                t.f(fVar, "encoder");
                t.f(specified, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                Specified.write$Self$Termius_app_googleProductionRelease(specified, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a};
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
                return a.f41421a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Specified createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new Specified(VaultKeyId.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Specified[] newArray(int i10) {
                return new Specified[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Specified(int i10, VaultKeyId vaultKeyId, s2 s2Var) {
            super(i10, s2Var);
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f41421a.getDescriptor());
            }
            this.vaultKeyId = vaultKeyId;
        }

        public static /* synthetic */ Specified copy$default(Specified specified, VaultKeyId vaultKeyId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = specified.vaultKeyId;
            }
            return specified.copy(vaultKeyId);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Specified specified, d dVar, f fVar) {
            VaultKeyIdSpecification.write$Self(specified, dVar, fVar);
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, specified.vaultKeyId);
        }

        public final VaultKeyId component1() {
            return this.vaultKeyId;
        }

        public final Specified copy(VaultKeyId vaultKeyId) {
            t.f(vaultKeyId, "vaultKeyId");
            return new Specified(vaultKeyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Specified) && t.b(this.vaultKeyId, ((Specified) obj).vaultKeyId);
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return this.vaultKeyId.hashCode();
        }

        public String toString() {
            return "Specified(vaultKeyId=" + this.vaultKeyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            this.vaultKeyId.writeToParcel(parcel, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Specified(VaultKeyId vaultKeyId) {
            super(null);
            t.f(vaultKeyId, "vaultKeyId");
            this.vaultKeyId = vaultKeyId;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private final /* synthetic */ c a() {
            return (c) VaultKeyIdSpecification.$cachedSerializer$delegate.getValue();
        }

        public final Specified b() {
            return new Specified(VaultKeyId.Companion.a());
        }

        public final u c() {
            return VaultKeyIdSpecification.typeMap;
        }

        public final c serializer() {
            return a();
        }

        private a() {
        }
    }

    public static final class b extends x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f41423t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, mv.b bVar) {
            super(z10);
            this.f41423t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f41423t;
            bVar.a();
            return bVar.b(VaultKeyIdSpecification.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41423t;
            bVar.a();
            return bVar.b(VaultKeyIdSpecification.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41423t;
            bVar.a();
            bundle.putString(str, bVar.c(VaultKeyIdSpecification.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41423t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(VaultKeyIdSpecification.Companion.serializer(), obj));
            t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    public /* synthetic */ VaultKeyIdSpecification(k kVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return new m("com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification", ju.n0.b(VaultKeyIdSpecification.class), new qu.b[]{ju.n0.b(NotSpecified.class), ju.n0.b(Specified.class)}, new c[]{new w1("com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification.NotSpecified", NotSpecified.INSTANCE, new Annotation[0]), Specified.a.f41421a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(VaultKeyIdSpecification vaultKeyIdSpecification, d dVar, f fVar) {
    }

    private VaultKeyIdSpecification() {
    }

    public /* synthetic */ VaultKeyIdSpecification(int i10, s2 s2Var) {
    }
}
