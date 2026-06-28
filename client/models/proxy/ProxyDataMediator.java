package com.server.auditor.ssh.client.models.proxy;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
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
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.b0;
import ut.u;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class ProxyDataMediator implements Parcelable {
    public static final int $stable = 0;
    private final String host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final Long f27935id;
    private final Long identityId;
    private final VaultKeyId identityVaultKeyId;
    private final boolean isVisible;
    private final String password;
    private final Integer port;
    private final String type;
    private final String username;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ProxyDataMediator> CREATOR = new c();
    private static final u typeMap = b0.a(n0.j(ProxyDataMediator.class), new d(false, mv.b.f65981d));

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27937b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27936a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.proxy.ProxyDataMediator", aVar, 9);
            i2Var.r("id", false);
            i2Var.r(Column.TYPE, false);
            i2Var.r("host", false);
            i2Var.r(Column.PORT, false);
            i2Var.r("identityId", false);
            i2Var.r("username", false);
            i2Var.r("password", false);
            i2Var.r("isVisible", true);
            i2Var.r("identityVaultKeyId", false);
            descriptor = i2Var;
            f27937b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProxyDataMediator deserialize(e eVar) {
            boolean zH;
            String str;
            VaultKeyId vaultKeyId;
            String str2;
            Long l10;
            Integer num;
            int i10;
            Long l11;
            String str3;
            String str4;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i11 = 7;
            int i12 = 6;
            if (cVarD.l()) {
                h1 h1Var = h1.f64699a;
                Long l12 = (Long) cVarD.v(fVar, 0, h1Var, null);
                String strB = cVarD.B(fVar, 1);
                String strB2 = cVarD.B(fVar, 2);
                Integer num2 = (Integer) cVarD.v(fVar, 3, w0.f64808a, null);
                Long l13 = (Long) cVarD.v(fVar, 4, h1Var, null);
                x2 x2Var = x2.f64817a;
                String str5 = (String) cVarD.v(fVar, 5, x2Var, null);
                String str6 = (String) cVarD.v(fVar, 6, x2Var, null);
                l10 = l13;
                zH = cVarD.H(fVar, 7);
                str = str6;
                str2 = str5;
                num = num2;
                vaultKeyId = (VaultKeyId) cVarD.i(fVar, 8, VaultKeyId.a.f41418a, null);
                i10 = 511;
                str4 = strB2;
                str3 = strB;
                l11 = l12;
            } else {
                boolean z10 = true;
                boolean zH2 = false;
                String str7 = null;
                VaultKeyId vaultKeyId2 = null;
                String str8 = null;
                Long l14 = null;
                Long l15 = null;
                String strB3 = null;
                String strB4 = null;
                int i13 = 0;
                Integer num3 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            i12 = 6;
                            break;
                        case 0:
                            l15 = (Long) cVarD.v(fVar, 0, h1.f64699a, l15);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 1:
                            i13 |= 2;
                            strB3 = cVarD.B(fVar, 1);
                            i11 = 7;
                            break;
                        case 2:
                            strB4 = cVarD.B(fVar, 2);
                            i13 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            num3 = (Integer) cVarD.v(fVar, 3, w0.f64808a, num3);
                            i13 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            l14 = (Long) cVarD.v(fVar, 4, h1.f64699a, l14);
                            i13 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            str8 = (String) cVarD.v(fVar, 5, x2.f64817a, str8);
                            i13 |= 32;
                            i11 = 7;
                            break;
                        case 6:
                            str7 = (String) cVarD.v(fVar, i12, x2.f64817a, str7);
                            i13 |= 64;
                            break;
                        case 7:
                            zH2 = cVarD.H(fVar, i11);
                            i13 |= 128;
                            break;
                        case 8:
                            vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 8, VaultKeyId.a.f41418a, vaultKeyId2);
                            i13 |= 256;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                zH = zH2;
                str = str7;
                vaultKeyId = vaultKeyId2;
                str2 = str8;
                l10 = l14;
                num = num3;
                i10 = i13;
                l11 = l15;
                str3 = strB3;
                str4 = strB4;
            }
            cVarD.b(fVar);
            return new ProxyDataMediator(i10, l11, str3, str4, num, l10, str2, str, zH, vaultKeyId, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, ProxyDataMediator proxyDataMediator) {
            t.f(fVar, "encoder");
            t.f(proxyDataMediator, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            ProxyDataMediator.write$Self$Termius_app_googleProductionRelease(proxyDataMediator, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            h1 h1Var = h1.f64699a;
            hv.c cVarU = iv.a.u(h1Var);
            x2 x2Var = x2.f64817a;
            return new hv.c[]{cVarU, x2Var, x2Var, iv.a.u(w0.f64808a), iv.a.u(h1Var), iv.a.u(x2Var), iv.a.u(x2Var), i.f64704a, VaultKeyId.a.f41418a};
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

        public final u a() {
            return ProxyDataMediator.typeMap;
        }

        public final hv.c serializer() {
            return a.f27936a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProxyDataMediator createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ProxyDataMediator(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, VaultKeyId.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProxyDataMediator[] newArray(int i10) {
            return new ProxyDataMediator[i10];
        }
    }

    public static final class d extends x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f27938t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, mv.b bVar) {
            super(z10);
            this.f27938t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f27938t;
            bVar.a();
            return bVar.b(ProxyDataMediator.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f27938t;
            bVar.a();
            return bVar.b(ProxyDataMediator.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f27938t;
            bVar.a();
            bundle.putString(str, bVar.c(ProxyDataMediator.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f27938t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(ProxyDataMediator.Companion.serializer(), obj));
            t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    public /* synthetic */ ProxyDataMediator(int i10, Long l10, String str, String str2, Integer num, Long l11, String str3, String str4, boolean z10, VaultKeyId vaultKeyId, s2 s2Var) {
        if (383 != (i10 & 383)) {
            d2.a(i10, 383, a.f27936a.getDescriptor());
        }
        this.f27935id = l10;
        this.type = str;
        this.host = str2;
        this.port = num;
        this.identityId = l11;
        this.username = str3;
        this.password = str4;
        if ((i10 & 128) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z10;
        }
        this.identityVaultKeyId = vaultKeyId;
    }

    public static /* synthetic */ ProxyDataMediator copy$default(ProxyDataMediator proxyDataMediator, Long l10, String str, String str2, Integer num, Long l11, String str3, String str4, boolean z10, VaultKeyId vaultKeyId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = proxyDataMediator.f27935id;
        }
        if ((i10 & 2) != 0) {
            str = proxyDataMediator.type;
        }
        if ((i10 & 4) != 0) {
            str2 = proxyDataMediator.host;
        }
        if ((i10 & 8) != 0) {
            num = proxyDataMediator.port;
        }
        if ((i10 & 16) != 0) {
            l11 = proxyDataMediator.identityId;
        }
        if ((i10 & 32) != 0) {
            str3 = proxyDataMediator.username;
        }
        if ((i10 & 64) != 0) {
            str4 = proxyDataMediator.password;
        }
        if ((i10 & 128) != 0) {
            z10 = proxyDataMediator.isVisible;
        }
        if ((i10 & 256) != 0) {
            vaultKeyId = proxyDataMediator.identityVaultKeyId;
        }
        boolean z11 = z10;
        VaultKeyId vaultKeyId2 = vaultKeyId;
        String str5 = str3;
        String str6 = str4;
        Long l12 = l11;
        String str7 = str2;
        return proxyDataMediator.copy(l10, str, str7, num, l12, str5, str6, z11, vaultKeyId2);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyDataMediator proxyDataMediator, kv.d dVar, f fVar) {
        h1 h1Var = h1.f64699a;
        dVar.v(fVar, 0, h1Var, proxyDataMediator.f27935id);
        dVar.f(fVar, 1, proxyDataMediator.type);
        dVar.f(fVar, 2, proxyDataMediator.host);
        dVar.v(fVar, 3, w0.f64808a, proxyDataMediator.port);
        dVar.v(fVar, 4, h1Var, proxyDataMediator.identityId);
        x2 x2Var = x2.f64817a;
        dVar.v(fVar, 5, x2Var, proxyDataMediator.username);
        dVar.v(fVar, 6, x2Var, proxyDataMediator.password);
        if (dVar.E(fVar, 7) || proxyDataMediator.isVisible) {
            dVar.u(fVar, 7, proxyDataMediator.isVisible);
        }
        dVar.o(fVar, 8, VaultKeyId.a.f41418a, proxyDataMediator.identityVaultKeyId);
    }

    public final Long component1() {
        return this.f27935id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.host;
    }

    public final Integer component4() {
        return this.port;
    }

    public final Long component5() {
        return this.identityId;
    }

    public final String component6() {
        return this.username;
    }

    public final String component7() {
        return this.password;
    }

    public final boolean component8() {
        return this.isVisible;
    }

    public final VaultKeyId component9() {
        return this.identityVaultKeyId;
    }

    public final ProxyDataMediator copy(Long l10, String str, String str2, Integer num, Long l11, String str3, String str4, boolean z10, VaultKeyId vaultKeyId) {
        t.f(str, Column.TYPE);
        t.f(str2, "host");
        t.f(vaultKeyId, "identityVaultKeyId");
        return new ProxyDataMediator(l10, str, str2, num, l11, str3, str4, z10, vaultKeyId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProxyDataMediator)) {
            return false;
        }
        ProxyDataMediator proxyDataMediator = (ProxyDataMediator) obj;
        return t.b(this.f27935id, proxyDataMediator.f27935id) && t.b(this.type, proxyDataMediator.type) && t.b(this.host, proxyDataMediator.host) && t.b(this.port, proxyDataMediator.port) && t.b(this.identityId, proxyDataMediator.identityId) && t.b(this.username, proxyDataMediator.username) && t.b(this.password, proxyDataMediator.password) && this.isVisible == proxyDataMediator.isVisible && t.b(this.identityVaultKeyId, proxyDataMediator.identityVaultKeyId);
    }

    public final String getHost() {
        return this.host;
    }

    public final Long getId() {
        return this.f27935id;
    }

    public final Long getIdentityId() {
        return this.identityId;
    }

    public final VaultKeyId getIdentityVaultKeyId() {
        return this.identityVaultKeyId;
    }

    public final String getPassword() {
        return this.password;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        Long l10 = this.f27935id;
        int iHashCode = (((((l10 == null ? 0 : l10.hashCode()) * 31) + this.type.hashCode()) * 31) + this.host.hashCode()) * 31;
        Integer num = this.port;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.identityId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.username;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.password;
        return ((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + this.identityVaultKeyId.hashCode();
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "ProxyDataMediator(id=" + this.f27935id + ", type=" + this.type + ", host=" + this.host + ", port=" + this.port + ", identityId=" + this.identityId + ", username=" + this.username + ", password=" + this.password + ", isVisible=" + this.isVisible + ", identityVaultKeyId=" + this.identityVaultKeyId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Long l10 = this.f27935id;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        parcel.writeString(this.type);
        parcel.writeString(this.host);
        Integer num = this.port;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l11 = this.identityId;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeInt(this.isVisible ? 1 : 0);
        this.identityVaultKeyId.writeToParcel(parcel, i10);
    }

    public ProxyDataMediator(Long l10, String str, String str2, Integer num, Long l11, String str3, String str4, boolean z10, VaultKeyId vaultKeyId) {
        t.f(str, Column.TYPE);
        t.f(str2, "host");
        t.f(vaultKeyId, "identityVaultKeyId");
        this.f27935id = l10;
        this.type = str;
        this.host = str2;
        this.port = num;
        this.identityId = l11;
        this.username = str3;
        this.password = str4;
        this.isVisible = z10;
        this.identityVaultKeyId = vaultKeyId;
    }

    public /* synthetic */ ProxyDataMediator(Long l10, String str, String str2, Integer num, Long l11, String str3, String str4, boolean z10, VaultKeyId vaultKeyId, int i10, k kVar) {
        this(l10, str, str2, num, l11, str3, str4, (i10 & 128) != 0 ? false : z10, vaultKeyId);
    }
}
