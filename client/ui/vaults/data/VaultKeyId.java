package com.server.auditor.ssh.client.ui.vaults.data;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.x1;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import ut.b0;
import ut.u;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultKeyId implements Parcelable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final Long f41417id;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<VaultKeyId> CREATOR = new c();
    public static final int $stable = 8;
    private static final u typeMap = b0.a(n0.j(VaultKeyId.class), new d(false, mv.b.f65981d));

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41419b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41418a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId", aVar, 1);
            i2Var.r("id", false);
            descriptor = i2Var;
            f41419b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VaultKeyId deserialize(e eVar) {
            Long l10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                l10 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                l10 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        l10 = (Long) cVarD.v(fVar, 0, h1.f64699a, l10);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new VaultKeyId(i10, l10, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, VaultKeyId vaultKeyId) {
            t.f(fVar, "encoder");
            t.f(vaultKeyId, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            VaultKeyId.write$Self$Termius_app_googleProductionRelease(vaultKeyId, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{iv.a.u(h1.f64699a)};
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
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final VaultKeyId a() {
            return new VaultKeyId(null);
        }

        public final VaultKeyId b() {
            return new VaultKeyId(-2048L);
        }

        public final u c() {
            return VaultKeyId.typeMap;
        }

        public final hv.c serializer() {
            return a.f41418a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VaultKeyId createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new VaultKeyId(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VaultKeyId[] newArray(int i10) {
            return new VaultKeyId[i10];
        }
    }

    public static final class d extends x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f41420t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, mv.b bVar) {
            super(z10);
            this.f41420t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f41420t;
            bVar.a();
            return bVar.b(VaultKeyId.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41420t;
            bVar.a();
            return bVar.b(VaultKeyId.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41420t;
            bVar.a();
            bundle.putString(str, bVar.c(VaultKeyId.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f41420t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(VaultKeyId.Companion.serializer(), obj));
            t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    public /* synthetic */ VaultKeyId(int i10, Long l10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f41418a.getDescriptor());
        }
        this.f41417id = l10;
    }

    public static /* synthetic */ VaultKeyId copy$default(VaultKeyId vaultKeyId, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = vaultKeyId.f41417id;
        }
        return vaultKeyId.copy(l10);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VaultKeyId vaultKeyId, kv.d dVar, f fVar) {
        dVar.v(fVar, 0, h1.f64699a, vaultKeyId.f41417id);
    }

    public final Long component1() {
        return this.f41417id;
    }

    public final VaultKeyId copy(Long l10) {
        return new VaultKeyId(l10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VaultKeyId) && t.b(this.f41417id, ((VaultKeyId) obj).f41417id);
    }

    public final Long getId() {
        return this.f41417id;
    }

    public int hashCode() {
        Long l10 = this.f41417id;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public String toString() {
        return "VaultKeyId(id=" + this.f41417id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Long l10 = this.f41417id;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
    }

    public VaultKeyId(Long l10) {
        this.f41417id = l10;
    }
}
