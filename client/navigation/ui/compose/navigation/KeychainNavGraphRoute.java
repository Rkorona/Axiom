package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.navigation.x1;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import hv.c;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import java.util.Map;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import lv.x2;
import qu.l;
import ut.n;
import ut.o;
import ut.r;
import vt.s0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface KeychainNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class EditBiometricKeyRoute implements KeychainNavGraphRoute {
        private final String certificate;
        private final String dateTime;
        private final String funnelId;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32888id;
        private final boolean isFromPicker;
        private final String label;
        private final String publicKey;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditBiometricKeyRoute> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32890b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32889a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.EditBiometricKeyRoute", aVar, 7);
                i2Var.r("id", true);
                i2Var.r("label", false);
                i2Var.r(Column.KEY_PUBLIC, false);
                i2Var.r("dateTime", false);
                i2Var.r(Table.SSH_CERTIFICATE, false);
                i2Var.r("funnelId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32890b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditBiometricKeyRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                Long l10;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i11 = 6;
                if (cVarD.l()) {
                    Long l11 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
                    String strB = cVarD.B(fVar, 1);
                    String strB2 = cVarD.B(fVar, 2);
                    String strB3 = cVarD.B(fVar, 3);
                    String strB4 = cVarD.B(fVar, 4);
                    String strB5 = cVarD.B(fVar, 5);
                    l10 = l11;
                    zH = cVarD.H(fVar, 6);
                    str5 = strB5;
                    str3 = strB3;
                    str4 = strB4;
                    str2 = strB2;
                    str = strB;
                    i10 = 127;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    Long l12 = null;
                    String strB6 = null;
                    String strB7 = null;
                    String strB8 = null;
                    String strB9 = null;
                    String strB10 = null;
                    int i12 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z10 = false;
                                i11 = 6;
                                break;
                            case 0:
                                l12 = (Long) cVarD.v(fVar, 0, h1.f64699a, l12);
                                i12 |= 1;
                                i11 = 6;
                                break;
                            case 1:
                                strB6 = cVarD.B(fVar, 1);
                                i12 |= 2;
                                break;
                            case 2:
                                strB7 = cVarD.B(fVar, 2);
                                i12 |= 4;
                                break;
                            case 3:
                                strB8 = cVarD.B(fVar, 3);
                                i12 |= 8;
                                break;
                            case 4:
                                strB9 = cVarD.B(fVar, 4);
                                i12 |= 16;
                                break;
                            case 5:
                                strB10 = cVarD.B(fVar, 5);
                                i12 |= 32;
                                break;
                            case 6:
                                zH2 = cVarD.H(fVar, i11);
                                i12 |= 64;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    zH = zH2;
                    i10 = i12;
                    l10 = l12;
                    str = strB6;
                    str2 = strB7;
                    str3 = strB8;
                    str4 = strB9;
                    str5 = strB10;
                }
                cVarD.b(fVar);
                return new EditBiometricKeyRoute(i10, l10, str, str2, str3, str4, str5, zH, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditBiometricKeyRoute editBiometricKeyRoute) {
                t.f(fVar, "encoder");
                t.f(editBiometricKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditBiometricKeyRoute.write$Self$Termius_app_googleProductionRelease(editBiometricKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{iv.a.u(h1.f64699a), x2Var, x2Var, x2Var, x2Var, x2Var, i.f64704a};
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
                return a.f32889a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditBiometricKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditBiometricKeyRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditBiometricKeyRoute[] newArray(int i10) {
                return new EditBiometricKeyRoute[i10];
            }
        }

        public /* synthetic */ EditBiometricKeyRoute(int i10, Long l10, String str, String str2, String str3, String str4, String str5, boolean z10, s2 s2Var) {
            if (126 != (i10 & 126)) {
                d2.a(i10, 126, a.f32889a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f32888id = null;
            } else {
                this.f32888id = l10;
            }
            this.label = str;
            this.publicKey = str2;
            this.dateTime = str3;
            this.certificate = str4;
            this.funnelId = str5;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ EditBiometricKeyRoute copy$default(EditBiometricKeyRoute editBiometricKeyRoute, Long l10, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editBiometricKeyRoute.f32888id;
            }
            if ((i10 & 2) != 0) {
                str = editBiometricKeyRoute.label;
            }
            if ((i10 & 4) != 0) {
                str2 = editBiometricKeyRoute.publicKey;
            }
            if ((i10 & 8) != 0) {
                str3 = editBiometricKeyRoute.dateTime;
            }
            if ((i10 & 16) != 0) {
                str4 = editBiometricKeyRoute.certificate;
            }
            if ((i10 & 32) != 0) {
                str5 = editBiometricKeyRoute.funnelId;
            }
            if ((i10 & 64) != 0) {
                z10 = editBiometricKeyRoute.isFromPicker;
            }
            String str6 = str5;
            boolean z11 = z10;
            String str7 = str4;
            String str8 = str2;
            return editBiometricKeyRoute.copy(l10, str, str8, str3, str7, str6, z11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditBiometricKeyRoute editBiometricKeyRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editBiometricKeyRoute.f32888id != null) {
                dVar.v(fVar, 0, h1.f64699a, editBiometricKeyRoute.f32888id);
            }
            dVar.f(fVar, 1, editBiometricKeyRoute.label);
            dVar.f(fVar, 2, editBiometricKeyRoute.publicKey);
            dVar.f(fVar, 3, editBiometricKeyRoute.dateTime);
            dVar.f(fVar, 4, editBiometricKeyRoute.certificate);
            dVar.f(fVar, 5, editBiometricKeyRoute.funnelId);
            dVar.u(fVar, 6, editBiometricKeyRoute.isFromPicker);
        }

        public final Long component1() {
            return this.f32888id;
        }

        public final String component2() {
            return this.label;
        }

        public final String component3() {
            return this.publicKey;
        }

        public final String component4() {
            return this.dateTime;
        }

        public final String component5() {
            return this.certificate;
        }

        public final String component6() {
            return this.funnelId;
        }

        public final boolean component7() {
            return this.isFromPicker;
        }

        public final EditBiometricKeyRoute copy(Long l10, String str, String str2, String str3, String str4, String str5, boolean z10) {
            t.f(str, "label");
            t.f(str2, Column.KEY_PUBLIC);
            t.f(str3, "dateTime");
            t.f(str4, Table.SSH_CERTIFICATE);
            t.f(str5, "funnelId");
            return new EditBiometricKeyRoute(l10, str, str2, str3, str4, str5, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditBiometricKeyRoute)) {
                return false;
            }
            EditBiometricKeyRoute editBiometricKeyRoute = (EditBiometricKeyRoute) obj;
            return t.b(this.f32888id, editBiometricKeyRoute.f32888id) && t.b(this.label, editBiometricKeyRoute.label) && t.b(this.publicKey, editBiometricKeyRoute.publicKey) && t.b(this.dateTime, editBiometricKeyRoute.dateTime) && t.b(this.certificate, editBiometricKeyRoute.certificate) && t.b(this.funnelId, editBiometricKeyRoute.funnelId) && this.isFromPicker == editBiometricKeyRoute.isFromPicker;
        }

        public final String getCertificate() {
            return this.certificate;
        }

        public final String getDateTime() {
            return this.dateTime;
        }

        public final String getFunnelId() {
            return this.funnelId;
        }

        public final Long getId() {
            return this.f32888id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public int hashCode() {
            Long l10 = this.f32888id;
            return ((((((((((((l10 == null ? 0 : l10.hashCode()) * 31) + this.label.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.dateTime.hashCode()) * 31) + this.certificate.hashCode()) * 31) + this.funnelId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "EditBiometricKeyRoute(id=" + this.f32888id + ", label=" + this.label + ", publicKey=" + this.publicKey + ", dateTime=" + this.dateTime + ", certificate=" + this.certificate + ", funnelId=" + this.funnelId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32888id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeString(this.label);
            parcel.writeString(this.publicKey);
            parcel.writeString(this.dateTime);
            parcel.writeString(this.certificate);
            parcel.writeString(this.funnelId);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public EditBiometricKeyRoute(Long l10, String str, String str2, String str3, String str4, String str5, boolean z10) {
            t.f(str, "label");
            t.f(str2, Column.KEY_PUBLIC);
            t.f(str3, "dateTime");
            t.f(str4, Table.SSH_CERTIFICATE);
            t.f(str5, "funnelId");
            this.f32888id = l10;
            this.label = str;
            this.publicKey = str2;
            this.dateTime = str3;
            this.certificate = str4;
            this.funnelId = str5;
            this.isFromPicker = z10;
        }

        public /* synthetic */ EditBiometricKeyRoute(Long l10, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, str, str2, str3, str4, str5, z10);
        }
    }

    @p
    @Keep
    public static final class EditIdentityRoute implements KeychainNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32891id;
        private final boolean isFromPicker;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditIdentityRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32893b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32892a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.EditIdentityRoute", aVar, 3);
                i2Var.r("id", true);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32893b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditIdentityRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                Long l10;
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    Long l11 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    l10 = l11;
                    zH = cVarD.H(fVar, 2);
                    vaultKeyId = vaultKeyId2;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    Long l12 = null;
                    VaultKeyId vaultKeyId3 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            l12 = (Long) cVarD.v(fVar, 0, h1.f64699a, l12);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                    l10 = l12;
                    vaultKeyId = vaultKeyId3;
                }
                cVarD.b(fVar);
                return new EditIdentityRoute(i10, l10, vaultKeyId, zH, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditIdentityRoute editIdentityRoute) {
                t.f(fVar, "encoder");
                t.f(editIdentityRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditIdentityRoute.write$Self$Termius_app_googleProductionRelease(editIdentityRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{iv.a.u(h1.f64699a), VaultKeyId.a.f41418a, i.f64704a};
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

            public final Map a() {
                return EditIdentityRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32892a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditIdentityRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditIdentityRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (VaultKeyId) parcel.readParcelable(EditIdentityRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditIdentityRoute[] newArray(int i10) {
                return new EditIdentityRoute[i10];
            }
        }

        public /* synthetic */ EditIdentityRoute(int i10, Long l10, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (6 != (i10 & 6)) {
                d2.a(i10, 6, a.f32892a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f32891id = null;
            } else {
                this.f32891id = l10;
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ EditIdentityRoute copy$default(EditIdentityRoute editIdentityRoute, Long l10, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editIdentityRoute.f32891id;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = editIdentityRoute.targetVaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = editIdentityRoute.isFromPicker;
            }
            return editIdentityRoute.copy(l10, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditIdentityRoute editIdentityRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editIdentityRoute.f32891id != null) {
                dVar.v(fVar, 0, h1.f64699a, editIdentityRoute.f32891id);
            }
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, editIdentityRoute.targetVaultKeyId);
            dVar.u(fVar, 2, editIdentityRoute.isFromPicker);
        }

        public final Long component1() {
            return this.f32891id;
        }

        public final VaultKeyId component2() {
            return this.targetVaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final EditIdentityRoute copy(Long l10, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            return new EditIdentityRoute(l10, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditIdentityRoute)) {
                return false;
            }
            EditIdentityRoute editIdentityRoute = (EditIdentityRoute) obj;
            return t.b(this.f32891id, editIdentityRoute.f32891id) && t.b(this.targetVaultKeyId, editIdentityRoute.targetVaultKeyId) && this.isFromPicker == editIdentityRoute.isFromPicker;
        }

        public final Long getId() {
            return this.f32891id;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            Long l10 = this.f32891id;
            return ((((l10 == null ? 0 : l10.hashCode()) * 31) + this.targetVaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "EditIdentityRoute(id=" + this.f32891id + ", targetVaultKeyId=" + this.targetVaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32891id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public EditIdentityRoute(Long l10, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            this.f32891id = l10;
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public /* synthetic */ EditIdentityRoute(Long l10, VaultKeyId vaultKeyId, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, vaultKeyId, z10);
        }
    }

    @p
    @Keep
    public static final class EditMultiKeyRoute implements KeychainNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f32894id;
        private final String name;
        private final String type;
        private final String username;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditMultiKeyRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32895a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32896b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32895a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.EditMultiKeyRoute", aVar, 5);
                i2Var.r("id", false);
                i2Var.r(Column.MULTI_KEY_NAME, false);
                i2Var.r("username", false);
                i2Var.r(Column.TYPE, false);
                i2Var.r("vaultKeyId", false);
                descriptor = i2Var;
                f32896b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditMultiKeyRoute deserialize(e eVar) {
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
                return new EditMultiKeyRoute(i10, j10, str, str2, strB, vaultKeyId, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditMultiKeyRoute editMultiKeyRoute) {
                t.f(fVar, "encoder");
                t.f(editMultiKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditMultiKeyRoute.write$Self$Termius_app_googleProductionRelease(editMultiKeyRoute, dVarD, fVar2);
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

            public final Map a() {
                return EditMultiKeyRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32895a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditMultiKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditMultiKeyRoute(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (VaultKeyId) parcel.readParcelable(EditMultiKeyRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditMultiKeyRoute[] newArray(int i10) {
                return new EditMultiKeyRoute[i10];
            }
        }

        public /* synthetic */ EditMultiKeyRoute(int i10, long j10, String str, String str2, String str3, VaultKeyId vaultKeyId, s2 s2Var) {
            if (31 != (i10 & 31)) {
                d2.a(i10, 31, a.f32895a.getDescriptor());
            }
            this.f32894id = j10;
            this.name = str;
            this.username = str2;
            this.type = str3;
            this.vaultKeyId = vaultKeyId;
        }

        public static /* synthetic */ EditMultiKeyRoute copy$default(EditMultiKeyRoute editMultiKeyRoute, long j10, String str, String str2, String str3, VaultKeyId vaultKeyId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = editMultiKeyRoute.f32894id;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = editMultiKeyRoute.name;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                str2 = editMultiKeyRoute.username;
            }
            String str5 = str2;
            if ((i10 & 8) != 0) {
                str3 = editMultiKeyRoute.type;
            }
            String str6 = str3;
            if ((i10 & 16) != 0) {
                vaultKeyId = editMultiKeyRoute.vaultKeyId;
            }
            return editMultiKeyRoute.copy(j11, str4, str5, str6, vaultKeyId);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditMultiKeyRoute editMultiKeyRoute, d dVar, f fVar) {
            dVar.q(fVar, 0, editMultiKeyRoute.f32894id);
            dVar.f(fVar, 1, editMultiKeyRoute.name);
            dVar.f(fVar, 2, editMultiKeyRoute.username);
            dVar.f(fVar, 3, editMultiKeyRoute.type);
            dVar.o(fVar, 4, VaultKeyId.a.f41418a, editMultiKeyRoute.vaultKeyId);
        }

        public final long component1() {
            return this.f32894id;
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

        public final EditMultiKeyRoute copy(long j10, String str, String str2, String str3, VaultKeyId vaultKeyId) {
            t.f(str, Column.MULTI_KEY_NAME);
            t.f(str2, "username");
            t.f(str3, Column.TYPE);
            t.f(vaultKeyId, "vaultKeyId");
            return new EditMultiKeyRoute(j10, str, str2, str3, vaultKeyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditMultiKeyRoute)) {
                return false;
            }
            EditMultiKeyRoute editMultiKeyRoute = (EditMultiKeyRoute) obj;
            return this.f32894id == editMultiKeyRoute.f32894id && t.b(this.name, editMultiKeyRoute.name) && t.b(this.username, editMultiKeyRoute.username) && t.b(this.type, editMultiKeyRoute.type) && t.b(this.vaultKeyId, editMultiKeyRoute.vaultKeyId);
        }

        public final long getId() {
            return this.f32894id;
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

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.f32894id) * 31) + this.name.hashCode()) * 31) + this.username.hashCode()) * 31) + this.type.hashCode()) * 31) + this.vaultKeyId.hashCode();
        }

        public String toString() {
            return "EditMultiKeyRoute(id=" + this.f32894id + ", name=" + this.name + ", username=" + this.username + ", type=" + this.type + ", vaultKeyId=" + this.vaultKeyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeLong(this.f32894id);
            parcel.writeString(this.name);
            parcel.writeString(this.username);
            parcel.writeString(this.type);
            parcel.writeParcelable(this.vaultKeyId, i10);
        }

        public EditMultiKeyRoute(long j10, String str, String str2, String str3, VaultKeyId vaultKeyId) {
            t.f(str, Column.MULTI_KEY_NAME);
            t.f(str2, "username");
            t.f(str3, Column.TYPE);
            t.f(vaultKeyId, "vaultKeyId");
            this.f32894id = j10;
            this.name = str;
            this.username = str2;
            this.type = str3;
            this.vaultKeyId = vaultKeyId;
        }
    }

    @p
    @Keep
    public static final class EditSshKeyRoute implements KeychainNavGraphRoute {
        private final String action;
        private final String certificate;
        private final String funnelId;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32897id;
        private final boolean isFromPicker;
        private final String label;
        private final String passphrase;
        private final String privateKey;
        private final String publicKey;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditSshKeyRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32899b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32898a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.EditSshKeyRoute", aVar, 10);
                i2Var.r("id", true);
                i2Var.r("action", false);
                i2Var.r("label", false);
                i2Var.r(SshOptions.EXTRA_PASSPHRASE, false);
                i2Var.r(Column.KEY_PRIVATE, false);
                i2Var.r(Column.KEY_PUBLIC, false);
                i2Var.r(Table.SSH_CERTIFICATE, false);
                i2Var.r("vaultKeyId", false);
                i2Var.r("funnelId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32899b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditSshKeyRoute deserialize(e eVar) {
                boolean zH;
                VaultKeyId vaultKeyId;
                int i10;
                Long l10;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i11 = 9;
                int i12 = 7;
                if (cVarD.l()) {
                    Long l11 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
                    String strB = cVarD.B(fVar, 1);
                    String strB2 = cVarD.B(fVar, 2);
                    String strB3 = cVarD.B(fVar, 3);
                    String strB4 = cVarD.B(fVar, 4);
                    String strB5 = cVarD.B(fVar, 5);
                    String strB6 = cVarD.B(fVar, 6);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 7, VaultKeyId.a.f41418a, null);
                    String strB7 = cVarD.B(fVar, 8);
                    l10 = l11;
                    zH = cVarD.H(fVar, 9);
                    vaultKeyId = vaultKeyId2;
                    str6 = strB6;
                    str5 = strB5;
                    str3 = strB3;
                    str7 = strB7;
                    str4 = strB4;
                    str2 = strB2;
                    str = strB;
                    i10 = 1023;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    Long l12 = null;
                    String strB8 = null;
                    String strB9 = null;
                    String strB10 = null;
                    String strB11 = null;
                    String strB12 = null;
                    String strB13 = null;
                    String strB14 = null;
                    int i13 = 0;
                    VaultKeyId vaultKeyId3 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z10 = false;
                                i12 = 7;
                                break;
                            case 0:
                                l12 = (Long) cVarD.v(fVar, 0, h1.f64699a, l12);
                                i13 |= 1;
                                i11 = 9;
                                i12 = 7;
                                break;
                            case 1:
                                strB8 = cVarD.B(fVar, 1);
                                i13 |= 2;
                                break;
                            case 2:
                                strB9 = cVarD.B(fVar, 2);
                                i13 |= 4;
                                break;
                            case 3:
                                strB10 = cVarD.B(fVar, 3);
                                i13 |= 8;
                                break;
                            case 4:
                                strB11 = cVarD.B(fVar, 4);
                                i13 |= 16;
                                break;
                            case 5:
                                strB12 = cVarD.B(fVar, 5);
                                i13 |= 32;
                                break;
                            case 6:
                                strB13 = cVarD.B(fVar, 6);
                                i13 |= 64;
                                break;
                            case 7:
                                vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, i12, VaultKeyId.a.f41418a, vaultKeyId3);
                                i13 |= 128;
                                break;
                            case 8:
                                strB14 = cVarD.B(fVar, 8);
                                i13 |= 256;
                                break;
                            case 9:
                                zH2 = cVarD.H(fVar, i11);
                                i13 |= File.FLAG_O_TRUNC;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    zH = zH2;
                    vaultKeyId = vaultKeyId3;
                    i10 = i13;
                    l10 = l12;
                    str = strB8;
                    str2 = strB9;
                    str3 = strB10;
                    str4 = strB11;
                    str5 = strB12;
                    str6 = strB13;
                    str7 = strB14;
                }
                cVarD.b(fVar);
                return new EditSshKeyRoute(i10, l10, str, str2, str3, str4, str5, str6, vaultKeyId, str7, zH, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditSshKeyRoute editSshKeyRoute) {
                t.f(fVar, "encoder");
                t.f(editSshKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditSshKeyRoute.write$Self$Termius_app_googleProductionRelease(editSshKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{iv.a.u(h1.f64699a), x2Var, x2Var, x2Var, x2Var, x2Var, x2Var, VaultKeyId.a.f41418a, x2Var, i.f64704a};
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

            public final Map a() {
                return EditSshKeyRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32898a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditSshKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditSshKeyRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (VaultKeyId) parcel.readParcelable(EditSshKeyRoute.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditSshKeyRoute[] newArray(int i10) {
                return new EditSshKeyRoute[i10];
            }
        }

        public /* synthetic */ EditSshKeyRoute(int i10, Long l10, String str, String str2, String str3, String str4, String str5, String str6, VaultKeyId vaultKeyId, String str7, boolean z10, s2 s2Var) {
            if (1022 != (i10 & 1022)) {
                d2.a(i10, 1022, a.f32898a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f32897id = null;
            } else {
                this.f32897id = l10;
            }
            this.action = str;
            this.label = str2;
            this.passphrase = str3;
            this.privateKey = str4;
            this.publicKey = str5;
            this.certificate = str6;
            this.vaultKeyId = vaultKeyId;
            this.funnelId = str7;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ EditSshKeyRoute copy$default(EditSshKeyRoute editSshKeyRoute, Long l10, String str, String str2, String str3, String str4, String str5, String str6, VaultKeyId vaultKeyId, String str7, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editSshKeyRoute.f32897id;
            }
            if ((i10 & 2) != 0) {
                str = editSshKeyRoute.action;
            }
            if ((i10 & 4) != 0) {
                str2 = editSshKeyRoute.label;
            }
            if ((i10 & 8) != 0) {
                str3 = editSshKeyRoute.passphrase;
            }
            if ((i10 & 16) != 0) {
                str4 = editSshKeyRoute.privateKey;
            }
            if ((i10 & 32) != 0) {
                str5 = editSshKeyRoute.publicKey;
            }
            if ((i10 & 64) != 0) {
                str6 = editSshKeyRoute.certificate;
            }
            if ((i10 & 128) != 0) {
                vaultKeyId = editSshKeyRoute.vaultKeyId;
            }
            if ((i10 & 256) != 0) {
                str7 = editSshKeyRoute.funnelId;
            }
            if ((i10 & File.FLAG_O_TRUNC) != 0) {
                z10 = editSshKeyRoute.isFromPicker;
            }
            String str8 = str7;
            boolean z11 = z10;
            String str9 = str6;
            VaultKeyId vaultKeyId2 = vaultKeyId;
            String str10 = str4;
            String str11 = str5;
            return editSshKeyRoute.copy(l10, str, str2, str3, str10, str11, str9, vaultKeyId2, str8, z11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditSshKeyRoute editSshKeyRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editSshKeyRoute.f32897id != null) {
                dVar.v(fVar, 0, h1.f64699a, editSshKeyRoute.f32897id);
            }
            dVar.f(fVar, 1, editSshKeyRoute.action);
            dVar.f(fVar, 2, editSshKeyRoute.label);
            dVar.f(fVar, 3, editSshKeyRoute.passphrase);
            dVar.f(fVar, 4, editSshKeyRoute.privateKey);
            dVar.f(fVar, 5, editSshKeyRoute.publicKey);
            dVar.f(fVar, 6, editSshKeyRoute.certificate);
            dVar.o(fVar, 7, VaultKeyId.a.f41418a, editSshKeyRoute.vaultKeyId);
            dVar.f(fVar, 8, editSshKeyRoute.funnelId);
            dVar.u(fVar, 9, editSshKeyRoute.isFromPicker);
        }

        public final Long component1() {
            return this.f32897id;
        }

        public final boolean component10() {
            return this.isFromPicker;
        }

        public final String component2() {
            return this.action;
        }

        public final String component3() {
            return this.label;
        }

        public final String component4() {
            return this.passphrase;
        }

        public final String component5() {
            return this.privateKey;
        }

        public final String component6() {
            return this.publicKey;
        }

        public final String component7() {
            return this.certificate;
        }

        public final VaultKeyId component8() {
            return this.vaultKeyId;
        }

        public final String component9() {
            return this.funnelId;
        }

        public final EditSshKeyRoute copy(Long l10, String str, String str2, String str3, String str4, String str5, String str6, VaultKeyId vaultKeyId, String str7, boolean z10) {
            t.f(str, "action");
            t.f(str2, "label");
            t.f(str3, SshOptions.EXTRA_PASSPHRASE);
            t.f(str4, Column.KEY_PRIVATE);
            t.f(str5, Column.KEY_PUBLIC);
            t.f(str6, Table.SSH_CERTIFICATE);
            t.f(vaultKeyId, "vaultKeyId");
            t.f(str7, "funnelId");
            return new EditSshKeyRoute(l10, str, str2, str3, str4, str5, str6, vaultKeyId, str7, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditSshKeyRoute)) {
                return false;
            }
            EditSshKeyRoute editSshKeyRoute = (EditSshKeyRoute) obj;
            return t.b(this.f32897id, editSshKeyRoute.f32897id) && t.b(this.action, editSshKeyRoute.action) && t.b(this.label, editSshKeyRoute.label) && t.b(this.passphrase, editSshKeyRoute.passphrase) && t.b(this.privateKey, editSshKeyRoute.privateKey) && t.b(this.publicKey, editSshKeyRoute.publicKey) && t.b(this.certificate, editSshKeyRoute.certificate) && t.b(this.vaultKeyId, editSshKeyRoute.vaultKeyId) && t.b(this.funnelId, editSshKeyRoute.funnelId) && this.isFromPicker == editSshKeyRoute.isFromPicker;
        }

        public final String getAction() {
            return this.action;
        }

        public final String getCertificate() {
            return this.certificate;
        }

        public final String getFunnelId() {
            return this.funnelId;
        }

        public final Long getId() {
            return this.f32897id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPassphrase() {
            return this.passphrase;
        }

        public final String getPrivateKey() {
            return this.privateKey;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            Long l10 = this.f32897id;
            return ((((((((((((((((((l10 == null ? 0 : l10.hashCode()) * 31) + this.action.hashCode()) * 31) + this.label.hashCode()) * 31) + this.passphrase.hashCode()) * 31) + this.privateKey.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.certificate.hashCode()) * 31) + this.vaultKeyId.hashCode()) * 31) + this.funnelId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "EditSshKeyRoute(id=" + this.f32897id + ", action=" + this.action + ", label=" + this.label + ", passphrase=" + this.passphrase + ", privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ", certificate=" + this.certificate + ", vaultKeyId=" + this.vaultKeyId + ", funnelId=" + this.funnelId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32897id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeString(this.action);
            parcel.writeString(this.label);
            parcel.writeString(this.passphrase);
            parcel.writeString(this.privateKey);
            parcel.writeString(this.publicKey);
            parcel.writeString(this.certificate);
            parcel.writeParcelable(this.vaultKeyId, i10);
            parcel.writeString(this.funnelId);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public EditSshKeyRoute(Long l10, String str, String str2, String str3, String str4, String str5, String str6, VaultKeyId vaultKeyId, String str7, boolean z10) {
            t.f(str, "action");
            t.f(str2, "label");
            t.f(str3, SshOptions.EXTRA_PASSPHRASE);
            t.f(str4, Column.KEY_PRIVATE);
            t.f(str5, Column.KEY_PUBLIC);
            t.f(str6, Table.SSH_CERTIFICATE);
            t.f(vaultKeyId, "vaultKeyId");
            t.f(str7, "funnelId");
            this.f32897id = l10;
            this.action = str;
            this.label = str2;
            this.passphrase = str3;
            this.privateKey = str4;
            this.publicKey = str5;
            this.certificate = str6;
            this.vaultKeyId = vaultKeyId;
            this.funnelId = str7;
            this.isFromPicker = z10;
        }

        public /* synthetic */ EditSshKeyRoute(Long l10, String str, String str2, String str3, String str4, String str5, String str6, VaultKeyId vaultKeyId, String str7, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, str, str2, str3, str4, str5, str6, vaultKeyId, str7, z10);
        }
    }

    @p
    @Keep
    public static final class GenerateBiometricKeyRoute implements KeychainNavGraphRoute {
        private final String funnelId;
        private final boolean isFromPicker;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<GenerateBiometricKeyRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32900a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32901b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32900a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.GenerateBiometricKeyRoute", aVar, 3);
                i2Var.r("funnelId", false);
                i2Var.r("vaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32901b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateBiometricKeyRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                String str;
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    str = strB;
                    zH = cVarD.H(fVar, 2);
                    vaultKeyId = vaultKeyId2;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    String strB2 = null;
                    VaultKeyId vaultKeyId3 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB2 = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                    str = strB2;
                    vaultKeyId = vaultKeyId3;
                }
                cVarD.b(fVar);
                return new GenerateBiometricKeyRoute(i10, str, vaultKeyId, zH, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, GenerateBiometricKeyRoute generateBiometricKeyRoute) {
                t.f(fVar, "encoder");
                t.f(generateBiometricKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                GenerateBiometricKeyRoute.write$Self$Termius_app_googleProductionRelease(generateBiometricKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, VaultKeyId.a.f41418a, i.f64704a};
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

            public final Map a() {
                return GenerateBiometricKeyRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32900a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateBiometricKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new GenerateBiometricKeyRoute(parcel.readString(), (VaultKeyId) parcel.readParcelable(GenerateBiometricKeyRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GenerateBiometricKeyRoute[] newArray(int i10) {
                return new GenerateBiometricKeyRoute[i10];
            }
        }

        public /* synthetic */ GenerateBiometricKeyRoute(int i10, String str, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32900a.getDescriptor());
            }
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ GenerateBiometricKeyRoute copy$default(GenerateBiometricKeyRoute generateBiometricKeyRoute, String str, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = generateBiometricKeyRoute.funnelId;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = generateBiometricKeyRoute.vaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = generateBiometricKeyRoute.isFromPicker;
            }
            return generateBiometricKeyRoute.copy(str, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GenerateBiometricKeyRoute generateBiometricKeyRoute, d dVar, f fVar) {
            dVar.f(fVar, 0, generateBiometricKeyRoute.funnelId);
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, generateBiometricKeyRoute.vaultKeyId);
            dVar.u(fVar, 2, generateBiometricKeyRoute.isFromPicker);
        }

        public final String component1() {
            return this.funnelId;
        }

        public final VaultKeyId component2() {
            return this.vaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final GenerateBiometricKeyRoute copy(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            return new GenerateBiometricKeyRoute(str, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateBiometricKeyRoute)) {
                return false;
            }
            GenerateBiometricKeyRoute generateBiometricKeyRoute = (GenerateBiometricKeyRoute) obj;
            return t.b(this.funnelId, generateBiometricKeyRoute.funnelId) && t.b(this.vaultKeyId, generateBiometricKeyRoute.vaultKeyId) && this.isFromPicker == generateBiometricKeyRoute.isFromPicker;
        }

        public final String getFunnelId() {
            return this.funnelId;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (((this.funnelId.hashCode() * 31) + this.vaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "GenerateBiometricKeyRoute(funnelId=" + this.funnelId + ", vaultKeyId=" + this.vaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.funnelId);
            parcel.writeParcelable(this.vaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public GenerateBiometricKeyRoute(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class GenerateFidoKeyRoute implements KeychainNavGraphRoute {
        private final String funnelId;
        private final boolean isFromPicker;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<GenerateFidoKeyRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32903b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32902a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.GenerateFidoKeyRoute", aVar, 3);
                i2Var.r("funnelId", false);
                i2Var.r("vaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32903b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateFidoKeyRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                String str;
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    str = strB;
                    zH = cVarD.H(fVar, 2);
                    vaultKeyId = vaultKeyId2;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    String strB2 = null;
                    VaultKeyId vaultKeyId3 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB2 = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                    str = strB2;
                    vaultKeyId = vaultKeyId3;
                }
                cVarD.b(fVar);
                return new GenerateFidoKeyRoute(i10, str, vaultKeyId, zH, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, GenerateFidoKeyRoute generateFidoKeyRoute) {
                t.f(fVar, "encoder");
                t.f(generateFidoKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                GenerateFidoKeyRoute.write$Self$Termius_app_googleProductionRelease(generateFidoKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, VaultKeyId.a.f41418a, i.f64704a};
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

            public final Map a() {
                return GenerateFidoKeyRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32902a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateFidoKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new GenerateFidoKeyRoute(parcel.readString(), (VaultKeyId) parcel.readParcelable(GenerateFidoKeyRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GenerateFidoKeyRoute[] newArray(int i10) {
                return new GenerateFidoKeyRoute[i10];
            }
        }

        public /* synthetic */ GenerateFidoKeyRoute(int i10, String str, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32902a.getDescriptor());
            }
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ GenerateFidoKeyRoute copy$default(GenerateFidoKeyRoute generateFidoKeyRoute, String str, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = generateFidoKeyRoute.funnelId;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = generateFidoKeyRoute.vaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = generateFidoKeyRoute.isFromPicker;
            }
            return generateFidoKeyRoute.copy(str, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GenerateFidoKeyRoute generateFidoKeyRoute, d dVar, f fVar) {
            dVar.f(fVar, 0, generateFidoKeyRoute.funnelId);
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, generateFidoKeyRoute.vaultKeyId);
            dVar.u(fVar, 2, generateFidoKeyRoute.isFromPicker);
        }

        public final String component1() {
            return this.funnelId;
        }

        public final VaultKeyId component2() {
            return this.vaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final GenerateFidoKeyRoute copy(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            return new GenerateFidoKeyRoute(str, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateFidoKeyRoute)) {
                return false;
            }
            GenerateFidoKeyRoute generateFidoKeyRoute = (GenerateFidoKeyRoute) obj;
            return t.b(this.funnelId, generateFidoKeyRoute.funnelId) && t.b(this.vaultKeyId, generateFidoKeyRoute.vaultKeyId) && this.isFromPicker == generateFidoKeyRoute.isFromPicker;
        }

        public final String getFunnelId() {
            return this.funnelId;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (((this.funnelId.hashCode() * 31) + this.vaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "GenerateFidoKeyRoute(funnelId=" + this.funnelId + ", vaultKeyId=" + this.vaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.funnelId);
            parcel.writeParcelable(this.vaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public GenerateFidoKeyRoute(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class GenerateSshKeyRoute implements KeychainNavGraphRoute {
        private final String funnelId;
        private final boolean isFromPicker;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<GenerateSshKeyRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32905b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32904a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.GenerateSshKeyRoute", aVar, 3);
                i2Var.r("funnelId", false);
                i2Var.r("vaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32905b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateSshKeyRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                String str;
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    str = strB;
                    zH = cVarD.H(fVar, 2);
                    vaultKeyId = vaultKeyId2;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    String strB2 = null;
                    VaultKeyId vaultKeyId3 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB2 = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                    str = strB2;
                    vaultKeyId = vaultKeyId3;
                }
                cVarD.b(fVar);
                return new GenerateSshKeyRoute(i10, str, vaultKeyId, zH, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, GenerateSshKeyRoute generateSshKeyRoute) {
                t.f(fVar, "encoder");
                t.f(generateSshKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                GenerateSshKeyRoute.write$Self$Termius_app_googleProductionRelease(generateSshKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, VaultKeyId.a.f41418a, i.f64704a};
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

            public final Map a() {
                return GenerateSshKeyRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32904a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GenerateSshKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new GenerateSshKeyRoute(parcel.readString(), (VaultKeyId) parcel.readParcelable(GenerateSshKeyRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GenerateSshKeyRoute[] newArray(int i10) {
                return new GenerateSshKeyRoute[i10];
            }
        }

        public /* synthetic */ GenerateSshKeyRoute(int i10, String str, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32904a.getDescriptor());
            }
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ GenerateSshKeyRoute copy$default(GenerateSshKeyRoute generateSshKeyRoute, String str, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = generateSshKeyRoute.funnelId;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = generateSshKeyRoute.vaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = generateSshKeyRoute.isFromPicker;
            }
            return generateSshKeyRoute.copy(str, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GenerateSshKeyRoute generateSshKeyRoute, d dVar, f fVar) {
            dVar.f(fVar, 0, generateSshKeyRoute.funnelId);
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, generateSshKeyRoute.vaultKeyId);
            dVar.u(fVar, 2, generateSshKeyRoute.isFromPicker);
        }

        public final String component1() {
            return this.funnelId;
        }

        public final VaultKeyId component2() {
            return this.vaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final GenerateSshKeyRoute copy(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            return new GenerateSshKeyRoute(str, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateSshKeyRoute)) {
                return false;
            }
            GenerateSshKeyRoute generateSshKeyRoute = (GenerateSshKeyRoute) obj;
            return t.b(this.funnelId, generateSshKeyRoute.funnelId) && t.b(this.vaultKeyId, generateSshKeyRoute.vaultKeyId) && this.isFromPicker == generateSshKeyRoute.isFromPicker;
        }

        public final String getFunnelId() {
            return this.funnelId;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (((this.funnelId.hashCode() * 31) + this.vaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "GenerateSshKeyRoute(funnelId=" + this.funnelId + ", vaultKeyId=" + this.vaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.funnelId);
            parcel.writeParcelable(this.vaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public GenerateSshKeyRoute(String str, VaultKeyId vaultKeyId, boolean z10) {
            t.f(str, "funnelId");
            t.f(vaultKeyId, "vaultKeyId");
            this.funnelId = str;
            this.vaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class KeyHostExporterRoute implements KeychainNavGraphRoute {
        private final long hostId;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f32906id;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<KeyHostExporterRoute> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32908b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32907a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.KeyHostExporterRoute", aVar, 2);
                i2Var.r("id", false);
                i2Var.r("hostId", false);
                descriptor = i2Var;
                f32908b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeyHostExporterRoute deserialize(e eVar) {
                int i10;
                long jO;
                long j10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    long jO2 = cVarD.o(fVar, 0);
                    jO = cVarD.o(fVar, 1);
                    j10 = jO2;
                    i10 = 3;
                } else {
                    long jO3 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    long jO4 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            jO4 = cVarD.o(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            jO3 = cVarD.o(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    jO = jO3;
                    j10 = jO4;
                }
                cVarD.b(fVar);
                return new KeyHostExporterRoute(i10, j10, jO, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, KeyHostExporterRoute keyHostExporterRoute) {
                t.f(fVar, "encoder");
                t.f(keyHostExporterRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                KeyHostExporterRoute.write$Self$Termius_app_googleProductionRelease(keyHostExporterRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                h1 h1Var = h1.f64699a;
                return new hv.c[]{h1Var, h1Var};
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
                return a.f32907a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeyHostExporterRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new KeyHostExporterRoute(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KeyHostExporterRoute[] newArray(int i10) {
                return new KeyHostExporterRoute[i10];
            }
        }

        public /* synthetic */ KeyHostExporterRoute(int i10, long j10, long j11, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32907a.getDescriptor());
            }
            this.f32906id = j10;
            this.hostId = j11;
        }

        public static /* synthetic */ KeyHostExporterRoute copy$default(KeyHostExporterRoute keyHostExporterRoute, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = keyHostExporterRoute.f32906id;
            }
            if ((i10 & 2) != 0) {
                j11 = keyHostExporterRoute.hostId;
            }
            return keyHostExporterRoute.copy(j10, j11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KeyHostExporterRoute keyHostExporterRoute, d dVar, f fVar) {
            dVar.q(fVar, 0, keyHostExporterRoute.f32906id);
            dVar.q(fVar, 1, keyHostExporterRoute.hostId);
        }

        public final long component1() {
            return this.f32906id;
        }

        public final long component2() {
            return this.hostId;
        }

        public final KeyHostExporterRoute copy(long j10, long j11) {
            return new KeyHostExporterRoute(j10, j11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyHostExporterRoute)) {
                return false;
            }
            KeyHostExporterRoute keyHostExporterRoute = (KeyHostExporterRoute) obj;
            return this.f32906id == keyHostExporterRoute.f32906id && this.hostId == keyHostExporterRoute.hostId;
        }

        public final long getHostId() {
            return this.hostId;
        }

        public final long getId() {
            return this.f32906id;
        }

        public int hashCode() {
            return (Long.hashCode(this.f32906id) * 31) + Long.hashCode(this.hostId);
        }

        public String toString() {
            return "KeyHostExporterRoute(id=" + this.f32906id + ", hostId=" + this.hostId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeLong(this.f32906id);
            parcel.writeLong(this.hostId);
        }

        public KeyHostExporterRoute(long j10, long j11) {
            this.f32906id = j10;
            this.hostId = j11;
        }
    }

    @p
    @Keep
    public static final class KeyHostSelectorRoute implements KeychainNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32909id;
        private final Long sshKeyAttachOnlyId;
        private final boolean sshKeyAttachOnlyIsBiometric;
        private final VaultKeyId sshKeyAttachOnlyVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<KeyHostSelectorRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public static final class b {
            public /* synthetic */ b(k kVar) {
                this();
            }

            public final Map a() {
                return KeyHostSelectorRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32910a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeyHostSelectorRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new KeyHostSelectorRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (VaultKeyId) parcel.readParcelable(KeyHostSelectorRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KeyHostSelectorRoute[] newArray(int i10) {
                return new KeyHostSelectorRoute[i10];
            }
        }

        public KeyHostSelectorRoute() {
            this((Long) null, (Long) null, (VaultKeyId) null, false, 15, (k) null);
        }

        public static /* synthetic */ KeyHostSelectorRoute copy$default(KeyHostSelectorRoute keyHostSelectorRoute, Long l10, Long l11, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = keyHostSelectorRoute.f32909id;
            }
            if ((i10 & 2) != 0) {
                l11 = keyHostSelectorRoute.sshKeyAttachOnlyId;
            }
            if ((i10 & 4) != 0) {
                vaultKeyId = keyHostSelectorRoute.sshKeyAttachOnlyVaultKeyId;
            }
            if ((i10 & 8) != 0) {
                z10 = keyHostSelectorRoute.sshKeyAttachOnlyIsBiometric;
            }
            return keyHostSelectorRoute.copy(l10, l11, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(KeyHostSelectorRoute keyHostSelectorRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || keyHostSelectorRoute.f32909id != null) {
                dVar.v(fVar, 0, h1.f64699a, keyHostSelectorRoute.f32909id);
            }
            if (dVar.E(fVar, 1) || keyHostSelectorRoute.sshKeyAttachOnlyId != null) {
                dVar.v(fVar, 1, h1.f64699a, keyHostSelectorRoute.sshKeyAttachOnlyId);
            }
            if (dVar.E(fVar, 2) || !t.b(keyHostSelectorRoute.sshKeyAttachOnlyVaultKeyId, VaultKeyId.Companion.a())) {
                dVar.o(fVar, 2, VaultKeyId.a.f41418a, keyHostSelectorRoute.sshKeyAttachOnlyVaultKeyId);
            }
            if (dVar.E(fVar, 3) || keyHostSelectorRoute.sshKeyAttachOnlyIsBiometric) {
                dVar.u(fVar, 3, keyHostSelectorRoute.sshKeyAttachOnlyIsBiometric);
            }
        }

        public final Long component1() {
            return this.f32909id;
        }

        public final Long component2() {
            return this.sshKeyAttachOnlyId;
        }

        public final VaultKeyId component3() {
            return this.sshKeyAttachOnlyVaultKeyId;
        }

        public final boolean component4() {
            return this.sshKeyAttachOnlyIsBiometric;
        }

        public final KeyHostSelectorRoute copy(Long l10, Long l11, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "sshKeyAttachOnlyVaultKeyId");
            return new KeyHostSelectorRoute(l10, l11, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyHostSelectorRoute)) {
                return false;
            }
            KeyHostSelectorRoute keyHostSelectorRoute = (KeyHostSelectorRoute) obj;
            return t.b(this.f32909id, keyHostSelectorRoute.f32909id) && t.b(this.sshKeyAttachOnlyId, keyHostSelectorRoute.sshKeyAttachOnlyId) && t.b(this.sshKeyAttachOnlyVaultKeyId, keyHostSelectorRoute.sshKeyAttachOnlyVaultKeyId) && this.sshKeyAttachOnlyIsBiometric == keyHostSelectorRoute.sshKeyAttachOnlyIsBiometric;
        }

        public final Long getId() {
            return this.f32909id;
        }

        public final Long getSshKeyAttachOnlyId() {
            return this.sshKeyAttachOnlyId;
        }

        public final boolean getSshKeyAttachOnlyIsBiometric() {
            return this.sshKeyAttachOnlyIsBiometric;
        }

        public final VaultKeyId getSshKeyAttachOnlyVaultKeyId() {
            return this.sshKeyAttachOnlyVaultKeyId;
        }

        public int hashCode() {
            Long l10 = this.f32909id;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.sshKeyAttachOnlyId;
            return ((((iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31) + this.sshKeyAttachOnlyVaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.sshKeyAttachOnlyIsBiometric);
        }

        public String toString() {
            return "KeyHostSelectorRoute(id=" + this.f32909id + ", sshKeyAttachOnlyId=" + this.sshKeyAttachOnlyId + ", sshKeyAttachOnlyVaultKeyId=" + this.sshKeyAttachOnlyVaultKeyId + ", sshKeyAttachOnlyIsBiometric=" + this.sshKeyAttachOnlyIsBiometric + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32909id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            Long l11 = this.sshKeyAttachOnlyId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeParcelable(this.sshKeyAttachOnlyVaultKeyId, i10);
            parcel.writeInt(this.sshKeyAttachOnlyIsBiometric ? 1 : 0);
        }

        public /* synthetic */ KeyHostSelectorRoute(int i10, Long l10, Long l11, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.f32909id = null;
            } else {
                this.f32909id = l10;
            }
            if ((i10 & 2) == 0) {
                this.sshKeyAttachOnlyId = null;
            } else {
                this.sshKeyAttachOnlyId = l11;
            }
            if ((i10 & 4) == 0) {
                this.sshKeyAttachOnlyVaultKeyId = VaultKeyId.Companion.a();
            } else {
                this.sshKeyAttachOnlyVaultKeyId = vaultKeyId;
            }
            if ((i10 & 8) == 0) {
                this.sshKeyAttachOnlyIsBiometric = false;
            } else {
                this.sshKeyAttachOnlyIsBiometric = z10;
            }
        }

        public KeyHostSelectorRoute(Long l10, Long l11, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "sshKeyAttachOnlyVaultKeyId");
            this.f32909id = l10;
            this.sshKeyAttachOnlyId = l11;
            this.sshKeyAttachOnlyVaultKeyId = vaultKeyId;
            this.sshKeyAttachOnlyIsBiometric = z10;
        }

        public /* synthetic */ KeyHostSelectorRoute(Long l10, Long l11, VaultKeyId vaultKeyId, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? VaultKeyId.Companion.a() : vaultKeyId, (i10 & 8) != 0 ? false : z10);
        }
    }

    @p
    @Keep
    public static final class KeychainRoute implements KeychainNavGraphRoute, NavigationRailsRoute {
        public static final KeychainRoute INSTANCE = new KeychainRoute();
        public static final Parcelable.Creator<KeychainRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.n
            @Override // iu.a
            public final Object a() {
                return KeychainNavGraphRoute.KeychainRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeychainRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return KeychainRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KeychainRoute[] newArray(int i10) {
                return new KeychainRoute[i10];
            }
        }

        private KeychainRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.KeychainRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KeychainRoute);
        }

        public int hashCode() {
            return -563705722;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "KeychainRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class PasteSshCertificateRoute implements KeychainNavGraphRoute {
        private final String certificate;
        private final boolean isFromPicker;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<PasteSshCertificateRoute> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32912a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32913b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32912a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.PasteSshCertificateRoute", aVar, 2);
                i2Var.r(Table.SSH_CERTIFICATE, false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32913b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PasteSshCertificateRoute deserialize(e eVar) {
                String strB;
                boolean zH;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
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
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new PasteSshCertificateRoute(i10, strB, zH, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, PasteSshCertificateRoute pasteSshCertificateRoute) {
                t.f(fVar, "encoder");
                t.f(pasteSshCertificateRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                PasteSshCertificateRoute.write$Self$Termius_app_googleProductionRelease(pasteSshCertificateRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, i.f64704a};
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
                return a.f32912a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PasteSshCertificateRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PasteSshCertificateRoute(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PasteSshCertificateRoute[] newArray(int i10) {
                return new PasteSshCertificateRoute[i10];
            }
        }

        public /* synthetic */ PasteSshCertificateRoute(int i10, String str, boolean z10, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32912a.getDescriptor());
            }
            this.certificate = str;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ PasteSshCertificateRoute copy$default(PasteSshCertificateRoute pasteSshCertificateRoute, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pasteSshCertificateRoute.certificate;
            }
            if ((i10 & 2) != 0) {
                z10 = pasteSshCertificateRoute.isFromPicker;
            }
            return pasteSshCertificateRoute.copy(str, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PasteSshCertificateRoute pasteSshCertificateRoute, d dVar, f fVar) {
            dVar.f(fVar, 0, pasteSshCertificateRoute.certificate);
            dVar.u(fVar, 1, pasteSshCertificateRoute.isFromPicker);
        }

        public final String component1() {
            return this.certificate;
        }

        public final boolean component2() {
            return this.isFromPicker;
        }

        public final PasteSshCertificateRoute copy(String str, boolean z10) {
            t.f(str, Table.SSH_CERTIFICATE);
            return new PasteSshCertificateRoute(str, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasteSshCertificateRoute)) {
                return false;
            }
            PasteSshCertificateRoute pasteSshCertificateRoute = (PasteSshCertificateRoute) obj;
            return t.b(this.certificate, pasteSshCertificateRoute.certificate) && this.isFromPicker == pasteSshCertificateRoute.isFromPicker;
        }

        public final String getCertificate() {
            return this.certificate;
        }

        public int hashCode() {
            return (this.certificate.hashCode() * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "PasteSshCertificateRoute(certificate=" + this.certificate + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.certificate);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public PasteSshCertificateRoute(String str, boolean z10) {
            t.f(str, Table.SSH_CERTIFICATE);
            this.certificate = str;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class PasteSshKeyRoute implements KeychainNavGraphRoute {
        private final boolean isFromPicker;
        private final String privateKey;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<PasteSshKeyRoute> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32915b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32914a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.PasteSshKeyRoute", aVar, 2);
                i2Var.r(Column.KEY_PRIVATE, false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32915b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PasteSshKeyRoute deserialize(e eVar) {
                String strB;
                boolean zH;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
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
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new PasteSshKeyRoute(i10, strB, zH, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, PasteSshKeyRoute pasteSshKeyRoute) {
                t.f(fVar, "encoder");
                t.f(pasteSshKeyRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                PasteSshKeyRoute.write$Self$Termius_app_googleProductionRelease(pasteSshKeyRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, i.f64704a};
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
                return a.f32914a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PasteSshKeyRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PasteSshKeyRoute(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PasteSshKeyRoute[] newArray(int i10) {
                return new PasteSshKeyRoute[i10];
            }
        }

        public /* synthetic */ PasteSshKeyRoute(int i10, String str, boolean z10, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32914a.getDescriptor());
            }
            this.privateKey = str;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ PasteSshKeyRoute copy$default(PasteSshKeyRoute pasteSshKeyRoute, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pasteSshKeyRoute.privateKey;
            }
            if ((i10 & 2) != 0) {
                z10 = pasteSshKeyRoute.isFromPicker;
            }
            return pasteSshKeyRoute.copy(str, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PasteSshKeyRoute pasteSshKeyRoute, d dVar, f fVar) {
            dVar.f(fVar, 0, pasteSshKeyRoute.privateKey);
            dVar.u(fVar, 1, pasteSshKeyRoute.isFromPicker);
        }

        public final String component1() {
            return this.privateKey;
        }

        public final boolean component2() {
            return this.isFromPicker;
        }

        public final PasteSshKeyRoute copy(String str, boolean z10) {
            t.f(str, Column.KEY_PRIVATE);
            return new PasteSshKeyRoute(str, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasteSshKeyRoute)) {
                return false;
            }
            PasteSshKeyRoute pasteSshKeyRoute = (PasteSshKeyRoute) obj;
            return t.b(this.privateKey, pasteSshKeyRoute.privateKey) && this.isFromPicker == pasteSshKeyRoute.isFromPicker;
        }

        public final String getPrivateKey() {
            return this.privateKey;
        }

        public int hashCode() {
            return (this.privateKey.hashCode() * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "PasteSshKeyRoute(privateKey=" + this.privateKey + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.privateKey);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public PasteSshKeyRoute(String str, boolean z10) {
            t.f(str, Column.KEY_PRIVATE);
            this.privateKey = str;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class SshIdParametersRoute implements KeychainNavGraphRoute {
        private final boolean isGroupEditing;
        private final SshIdSettingsData sshIdParameters;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SshIdParametersRoute> CREATOR = new c();
        public static final int $stable = SshIdSettingsData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32917b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32916a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.SshIdParametersRoute", aVar, 2);
                i2Var.r("sshIdParameters", false);
                i2Var.r("isGroupEditing", false);
                descriptor = i2Var;
                f32917b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshIdParametersRoute deserialize(e eVar) {
                SshIdSettingsData sshIdSettingsData;
                boolean zH;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    sshIdSettingsData = (SshIdSettingsData) cVarD.i(fVar, 0, SshIdSettingsData.a.f40861a, null);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    int i11 = 0;
                    sshIdSettingsData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            sshIdSettingsData = (SshIdSettingsData) cVarD.i(fVar, 0, SshIdSettingsData.a.f40861a, sshIdSettingsData);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SshIdParametersRoute(i10, sshIdSettingsData, zH, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SshIdParametersRoute sshIdParametersRoute) {
                t.f(fVar, "encoder");
                t.f(sshIdParametersRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SshIdParametersRoute.write$Self$Termius_app_googleProductionRelease(sshIdParametersRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{SshIdSettingsData.a.f40861a, i.f64704a};
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
                return a.f32916a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshIdParametersRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new SshIdParametersRoute((SshIdSettingsData) parcel.readParcelable(SshIdParametersRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SshIdParametersRoute[] newArray(int i10) {
                return new SshIdParametersRoute[i10];
            }
        }

        public /* synthetic */ SshIdParametersRoute(int i10, SshIdSettingsData sshIdSettingsData, boolean z10, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32916a.getDescriptor());
            }
            this.sshIdParameters = sshIdSettingsData;
            this.isGroupEditing = z10;
        }

        public static /* synthetic */ SshIdParametersRoute copy$default(SshIdParametersRoute sshIdParametersRoute, SshIdSettingsData sshIdSettingsData, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sshIdSettingsData = sshIdParametersRoute.sshIdParameters;
            }
            if ((i10 & 2) != 0) {
                z10 = sshIdParametersRoute.isGroupEditing;
            }
            return sshIdParametersRoute.copy(sshIdSettingsData, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdParametersRoute sshIdParametersRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, SshIdSettingsData.a.f40861a, sshIdParametersRoute.sshIdParameters);
            dVar.u(fVar, 1, sshIdParametersRoute.isGroupEditing);
        }

        public final SshIdSettingsData component1() {
            return this.sshIdParameters;
        }

        public final boolean component2() {
            return this.isGroupEditing;
        }

        public final SshIdParametersRoute copy(SshIdSettingsData sshIdSettingsData, boolean z10) {
            t.f(sshIdSettingsData, "sshIdParameters");
            return new SshIdParametersRoute(sshIdSettingsData, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SshIdParametersRoute)) {
                return false;
            }
            SshIdParametersRoute sshIdParametersRoute = (SshIdParametersRoute) obj;
            return t.b(this.sshIdParameters, sshIdParametersRoute.sshIdParameters) && this.isGroupEditing == sshIdParametersRoute.isGroupEditing;
        }

        public final SshIdSettingsData getSshIdParameters() {
            return this.sshIdParameters;
        }

        public int hashCode() {
            return (this.sshIdParameters.hashCode() * 31) + Boolean.hashCode(this.isGroupEditing);
        }

        public final boolean isGroupEditing() {
            return this.isGroupEditing;
        }

        public String toString() {
            return "SshIdParametersRoute(sshIdParameters=" + this.sshIdParameters + ", isGroupEditing=" + this.isGroupEditing + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.sshIdParameters, i10);
            parcel.writeInt(this.isGroupEditing ? 1 : 0);
        }

        public SshIdParametersRoute(SshIdSettingsData sshIdSettingsData, boolean z10) {
            t.f(sshIdSettingsData, "sshIdParameters");
            this.sshIdParameters = sshIdSettingsData;
            this.isGroupEditing = z10;
        }
    }

    @p
    @Keep
    public static final class SshKeySelectRoute implements KeychainNavGraphRoute {
        private final boolean isPrivateCredentialsMode;
        private final SelectPurpose purpose;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SshKeySelectRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final n[] $childSerializers = {null, null, o.b(r.f82638b, new iu.a() { // from class: ik.o
            @Override // iu.a
            public final Object a() {
                return KeychainNavGraphRoute.SshKeySelectRoute._childSerializers$_anonymous_();
            }
        })};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32919b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32918a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.KeychainNavGraphRoute.SshKeySelectRoute", aVar, 3);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isPrivateCredentialsMode", false);
                i2Var.r("purpose", false);
                descriptor = i2Var;
                f32919b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshKeySelectRoute deserialize(e eVar) {
                int i10;
                boolean z10;
                VaultKeyId vaultKeyId;
                SelectPurpose selectPurpose;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = SshKeySelectRoute.$childSerializers;
                if (cVarD.l()) {
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    boolean zH = cVarD.H(fVar, 1);
                    selectPurpose = (SelectPurpose) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                    vaultKeyId = vaultKeyId2;
                    i10 = 7;
                    z10 = zH;
                } else {
                    boolean z11 = true;
                    int i11 = 0;
                    VaultKeyId vaultKeyId3 = null;
                    SelectPurpose selectPurpose2 = null;
                    boolean zH2 = false;
                    while (z11) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z11 = false;
                        } else if (iD == 0) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 1;
                        } else if (iD == 1) {
                            zH2 = cVarD.H(fVar, 1);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            selectPurpose2 = (SelectPurpose) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), selectPurpose2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    z10 = zH2;
                    vaultKeyId = vaultKeyId3;
                    selectPurpose = selectPurpose2;
                }
                cVarD.b(fVar);
                return new SshKeySelectRoute(i10, vaultKeyId, z10, selectPurpose, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SshKeySelectRoute sshKeySelectRoute) {
                t.f(fVar, "encoder");
                t.f(sshKeySelectRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SshKeySelectRoute.write$Self$Termius_app_googleProductionRelease(sshKeySelectRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, i.f64704a, SshKeySelectRoute.$childSerializers[2].getValue()};
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

            public final Map a() {
                return SshKeySelectRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32918a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshKeySelectRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new SshKeySelectRoute((VaultKeyId) parcel.readParcelable(SshKeySelectRoute.class.getClassLoader()), parcel.readInt() != 0, SelectPurpose.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SshKeySelectRoute[] newArray(int i10) {
                return new SshKeySelectRoute[i10];
            }
        }

        public /* synthetic */ SshKeySelectRoute(int i10, VaultKeyId vaultKeyId, boolean z10, SelectPurpose selectPurpose, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32918a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isPrivateCredentialsMode = z10;
            this.purpose = selectPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SelectPurpose.Companion.serializer();
        }

        public static /* synthetic */ SshKeySelectRoute copy$default(SshKeySelectRoute sshKeySelectRoute, VaultKeyId vaultKeyId, boolean z10, SelectPurpose selectPurpose, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = sshKeySelectRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                z10 = sshKeySelectRoute.isPrivateCredentialsMode;
            }
            if ((i10 & 4) != 0) {
                selectPurpose = sshKeySelectRoute.purpose;
            }
            return sshKeySelectRoute.copy(vaultKeyId, z10, selectPurpose);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshKeySelectRoute sshKeySelectRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, sshKeySelectRoute.targetVaultKeyId);
            dVar.u(fVar, 1, sshKeySelectRoute.isPrivateCredentialsMode);
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), sshKeySelectRoute.purpose);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final boolean component2() {
            return this.isPrivateCredentialsMode;
        }

        public final SelectPurpose component3() {
            return this.purpose;
        }

        public final SshKeySelectRoute copy(VaultKeyId vaultKeyId, boolean z10, SelectPurpose selectPurpose) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(selectPurpose, "purpose");
            return new SshKeySelectRoute(vaultKeyId, z10, selectPurpose);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SshKeySelectRoute)) {
                return false;
            }
            SshKeySelectRoute sshKeySelectRoute = (SshKeySelectRoute) obj;
            return t.b(this.targetVaultKeyId, sshKeySelectRoute.targetVaultKeyId) && this.isPrivateCredentialsMode == sshKeySelectRoute.isPrivateCredentialsMode && this.purpose == sshKeySelectRoute.purpose;
        }

        public final SelectPurpose getPurpose() {
            return this.purpose;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (((this.targetVaultKeyId.hashCode() * 31) + Boolean.hashCode(this.isPrivateCredentialsMode)) * 31) + this.purpose.hashCode();
        }

        public final boolean isPrivateCredentialsMode() {
            return this.isPrivateCredentialsMode;
        }

        public String toString() {
            return "SshKeySelectRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", isPrivateCredentialsMode=" + this.isPrivateCredentialsMode + ", purpose=" + this.purpose + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isPrivateCredentialsMode ? 1 : 0);
            parcel.writeString(this.purpose.name());
        }

        public SshKeySelectRoute(VaultKeyId vaultKeyId, boolean z10, SelectPurpose selectPurpose) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(selectPurpose, "purpose");
            this.targetVaultKeyId = vaultKeyId;
            this.isPrivateCredentialsMode = z10;
            this.purpose = selectPurpose;
        }
    }
}
