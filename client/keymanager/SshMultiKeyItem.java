package com.server.auditor.ssh.client.keymanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class SshMultiKeyItem implements Parcelable, IVaultKeyIdHolder {
    private static final String onlyKeyType = "ECDSA";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f27813id;
    private final String name;
    private final String type;
    private final String username;
    private VaultKeyId vaultKeyId;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SshMultiKeyItem> CREATOR = new c();
    public static final int $stable = 8;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27815b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27814a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.keymanager.SshMultiKeyItem", aVar, 5);
            i2Var.r("id", false);
            i2Var.r(Column.MULTI_KEY_NAME, false);
            i2Var.r("username", false);
            i2Var.r(Column.TYPE, false);
            i2Var.r("vaultKeyId", false);
            descriptor = i2Var;
            f27815b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshMultiKeyItem deserialize(e eVar) {
            int i10;
            String str;
            String str2;
            String strB;
            VaultKeyId vaultKeyId;
            long j10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            String strB2 = null;
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                String strB3 = cVarD.B(fVar, 1);
                String strB4 = cVarD.B(fVar, 2);
                str = strB3;
                strB = cVarD.B(fVar, 3);
                vaultKeyId = (VaultKeyId) cVarD.i(fVar, 4, VaultKeyId.a.f41418a, null);
                str2 = strB4;
                i10 = 31;
                j10 = jO;
            } else {
                boolean z10 = true;
                int i11 = 0;
                VaultKeyId vaultKeyId2 = null;
                long jO2 = 0;
                String strB5 = null;
                String strB6 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        jO2 = cVarD.o(fVar, 0);
                        i11 |= 1;
                    } else if (iD == 1) {
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    } else if (iD == 2) {
                        strB5 = cVarD.B(fVar, 2);
                        i11 |= 4;
                    } else if (iD == 3) {
                        strB6 = cVarD.B(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iD != 4) {
                            throw new e0(iD);
                        }
                        vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 4, VaultKeyId.a.f41418a, vaultKeyId2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strB2;
                str2 = strB5;
                strB = strB6;
                vaultKeyId = vaultKeyId2;
                j10 = jO2;
            }
            cVarD.b(fVar);
            return new SshMultiKeyItem(i10, j10, str, str2, strB, vaultKeyId, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshMultiKeyItem sshMultiKeyItem) {
            t.f(fVar, "encoder");
            t.f(sshMultiKeyItem, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SshMultiKeyItem.write$Self$Termius_app_googleProductionRelease(sshMultiKeyItem, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{h1.f64699a, x2Var, x2Var, x2Var, VaultKeyId.a.f41418a};
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

        public final SshMultiKeyItem a(MultiKeyDBModel multiKeyDBModel, String str) {
            t.f(multiKeyDBModel, "dbModel");
            t.f(str, "teamName");
            long idInDatabase = multiKeyDBModel.getIdInDatabase();
            String username = multiKeyDBModel.getUsername();
            if (username == null) {
                username = "";
            }
            VaultKeyId vaultKeyId = multiKeyDBModel.getVaultKeyId();
            t.e(vaultKeyId, "<get-vaultKeyId>(...)");
            return new SshMultiKeyItem(idInDatabase, str, username, SshMultiKeyItem.onlyKeyType, vaultKeyId);
        }

        public final hv.c serializer() {
            return a.f27814a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshMultiKeyItem createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SshMultiKeyItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), VaultKeyId.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SshMultiKeyItem[] newArray(int i10) {
            return new SshMultiKeyItem[i10];
        }
    }

    public /* synthetic */ SshMultiKeyItem(int i10, long j10, String str, String str2, String str3, VaultKeyId vaultKeyId, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, a.f27814a.getDescriptor());
        }
        this.f27813id = j10;
        this.name = str;
        this.username = str2;
        this.type = str3;
        this.vaultKeyId = vaultKeyId;
    }

    public static /* synthetic */ SshMultiKeyItem copy$default(SshMultiKeyItem sshMultiKeyItem, long j10, String str, String str2, String str3, VaultKeyId vaultKeyId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sshMultiKeyItem.f27813id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = sshMultiKeyItem.name;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = sshMultiKeyItem.username;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = sshMultiKeyItem.type;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            vaultKeyId = sshMultiKeyItem.vaultKeyId;
        }
        return sshMultiKeyItem.copy(j11, str4, str5, str6, vaultKeyId);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshMultiKeyItem sshMultiKeyItem, d dVar, f fVar) {
        dVar.q(fVar, 0, sshMultiKeyItem.f27813id);
        dVar.f(fVar, 1, sshMultiKeyItem.name);
        dVar.f(fVar, 2, sshMultiKeyItem.username);
        dVar.f(fVar, 3, sshMultiKeyItem.type);
        dVar.o(fVar, 4, VaultKeyId.a.f41418a, sshMultiKeyItem.getVaultKeyId());
    }

    public final long component1() {
        return this.f27813id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.type;
    }

    public final VaultKeyId component5() {
        return this.vaultKeyId;
    }

    public final SshMultiKeyItem copy(long j10, String str, String str2, String str3, VaultKeyId vaultKeyId) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "username");
        t.f(str3, Column.TYPE);
        t.f(vaultKeyId, "vaultKeyId");
        return new SshMultiKeyItem(j10, str, str2, str3, vaultKeyId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshMultiKeyItem)) {
            return false;
        }
        SshMultiKeyItem sshMultiKeyItem = (SshMultiKeyItem) obj;
        return this.f27813id == sshMultiKeyItem.f27813id && t.b(this.name, sshMultiKeyItem.name) && t.b(this.username, sshMultiKeyItem.username) && t.b(this.type, sshMultiKeyItem.type) && t.b(this.vaultKeyId, sshMultiKeyItem.vaultKeyId);
    }

    public final long getId() {
        return this.f27813id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f27813id) * 31) + this.name.hashCode()) * 31) + this.username.hashCode()) * 31) + this.type.hashCode()) * 31) + this.vaultKeyId.hashCode();
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<set-?>");
        this.vaultKeyId = vaultKeyId;
    }

    public String toString() {
        return "SshMultiKeyItem(id=" + this.f27813id + ", name=" + this.name + ", username=" + this.username + ", type=" + this.type + ", vaultKeyId=" + this.vaultKeyId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeLong(this.f27813id);
        parcel.writeString(this.name);
        parcel.writeString(this.username);
        parcel.writeString(this.type);
        this.vaultKeyId.writeToParcel(parcel, i10);
    }

    public SshMultiKeyItem(long j10, String str, String str2, String str3, VaultKeyId vaultKeyId) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "username");
        t.f(str3, Column.TYPE);
        t.f(vaultKeyId, "vaultKeyId");
        this.f27813id = j10;
        this.name = str;
        this.username = str2;
        this.type = str3;
        this.vaultKeyId = vaultKeyId;
    }
}
