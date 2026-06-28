package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import hv.c;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public interface SnippetsNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class EditPackageRoute implements SnippetsNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32944id;
        private final boolean isFromPicker;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditPackageRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32946b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32945a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.EditPackageRoute", aVar, 3);
                i2Var.r("id", true);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32946b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditPackageRoute deserialize(e eVar) {
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
                return new EditPackageRoute(i10, l10, vaultKeyId, zH, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditPackageRoute editPackageRoute) {
                t.f(fVar, "encoder");
                t.f(editPackageRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditPackageRoute.write$Self$Termius_app_googleProductionRelease(editPackageRoute, dVarD, fVar2);
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
                return EditPackageRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32945a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditPackageRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditPackageRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (VaultKeyId) parcel.readParcelable(EditPackageRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditPackageRoute[] newArray(int i10) {
                return new EditPackageRoute[i10];
            }
        }

        public /* synthetic */ EditPackageRoute(int i10, Long l10, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (6 != (i10 & 6)) {
                d2.a(i10, 6, a.f32945a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f32944id = null;
            } else {
                this.f32944id = l10;
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ EditPackageRoute copy$default(EditPackageRoute editPackageRoute, Long l10, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editPackageRoute.f32944id;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = editPackageRoute.targetVaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = editPackageRoute.isFromPicker;
            }
            return editPackageRoute.copy(l10, vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditPackageRoute editPackageRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editPackageRoute.f32944id != null) {
                dVar.v(fVar, 0, h1.f64699a, editPackageRoute.f32944id);
            }
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, editPackageRoute.targetVaultKeyId);
            dVar.u(fVar, 2, editPackageRoute.isFromPicker);
        }

        public final Long component1() {
            return this.f32944id;
        }

        public final VaultKeyId component2() {
            return this.targetVaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final EditPackageRoute copy(Long l10, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            return new EditPackageRoute(l10, vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditPackageRoute)) {
                return false;
            }
            EditPackageRoute editPackageRoute = (EditPackageRoute) obj;
            return t.b(this.f32944id, editPackageRoute.f32944id) && t.b(this.targetVaultKeyId, editPackageRoute.targetVaultKeyId) && this.isFromPicker == editPackageRoute.isFromPicker;
        }

        public final Long getId() {
            return this.f32944id;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            Long l10 = this.f32944id;
            return ((((l10 == null ? 0 : l10.hashCode()) * 31) + this.targetVaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "EditPackageRoute(id=" + this.f32944id + ", targetVaultKeyId=" + this.targetVaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32944id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public EditPackageRoute(Long l10, VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            this.f32944id = l10;
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public /* synthetic */ EditPackageRoute(Long l10, VaultKeyId vaultKeyId, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, vaultKeyId, z10);
        }
    }

    @p
    @Keep
    public static final class EditSnippetRoute implements SnippetsNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32947id;
        private final boolean isFromPicker;
        private final Long packageId;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditSnippetRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32949b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32948a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.EditSnippetRoute", aVar, 4);
                i2Var.r("id", true);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isFromPicker", false);
                i2Var.r("packageId", true);
                descriptor = i2Var;
                f32949b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditSnippetRoute deserialize(e eVar) {
                int i10;
                boolean z10;
                Long l10;
                VaultKeyId vaultKeyId;
                Long l11;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    h1 h1Var = h1.f64699a;
                    Long l12 = (Long) cVarD.v(fVar, 0, h1Var, null);
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    boolean zH = cVarD.H(fVar, 2);
                    l11 = (Long) cVarD.v(fVar, 3, h1Var, null);
                    i10 = 15;
                    z10 = zH;
                    vaultKeyId = vaultKeyId2;
                    l10 = l12;
                } else {
                    boolean z11 = true;
                    int i11 = 0;
                    Long l13 = null;
                    VaultKeyId vaultKeyId3 = null;
                    Long l14 = null;
                    boolean zH2 = false;
                    while (z11) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z11 = false;
                        } else if (iD == 0) {
                            l13 = (Long) cVarD.v(fVar, 0, h1.f64699a, l13);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId3);
                            i11 |= 2;
                        } else if (iD == 2) {
                            zH2 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        } else {
                            if (iD != 3) {
                                throw new e0(iD);
                            }
                            l14 = (Long) cVarD.v(fVar, 3, h1.f64699a, l14);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    z10 = zH2;
                    l10 = l13;
                    vaultKeyId = vaultKeyId3;
                    l11 = l14;
                }
                cVarD.b(fVar);
                return new EditSnippetRoute(i10, l10, vaultKeyId, z10, l11, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditSnippetRoute editSnippetRoute) {
                t.f(fVar, "encoder");
                t.f(editSnippetRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditSnippetRoute.write$Self$Termius_app_googleProductionRelease(editSnippetRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                h1 h1Var = h1.f64699a;
                return new hv.c[]{iv.a.u(h1Var), VaultKeyId.a.f41418a, i.f64704a, iv.a.u(h1Var)};
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
                return EditSnippetRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32948a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditSnippetRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditSnippetRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (VaultKeyId) parcel.readParcelable(EditSnippetRoute.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditSnippetRoute[] newArray(int i10) {
                return new EditSnippetRoute[i10];
            }
        }

        public /* synthetic */ EditSnippetRoute(int i10, Long l10, VaultKeyId vaultKeyId, boolean z10, Long l11, s2 s2Var) {
            if (6 != (i10 & 6)) {
                d2.a(i10, 6, a.f32948a.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f32947id = null;
            } else {
                this.f32947id = l10;
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
            if ((i10 & 8) == 0) {
                this.packageId = null;
            } else {
                this.packageId = l11;
            }
        }

        public static /* synthetic */ EditSnippetRoute copy$default(EditSnippetRoute editSnippetRoute, Long l10, VaultKeyId vaultKeyId, boolean z10, Long l11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editSnippetRoute.f32947id;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = editSnippetRoute.targetVaultKeyId;
            }
            if ((i10 & 4) != 0) {
                z10 = editSnippetRoute.isFromPicker;
            }
            if ((i10 & 8) != 0) {
                l11 = editSnippetRoute.packageId;
            }
            return editSnippetRoute.copy(l10, vaultKeyId, z10, l11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditSnippetRoute editSnippetRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editSnippetRoute.f32947id != null) {
                dVar.v(fVar, 0, h1.f64699a, editSnippetRoute.f32947id);
            }
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, editSnippetRoute.targetVaultKeyId);
            dVar.u(fVar, 2, editSnippetRoute.isFromPicker);
            if (!dVar.E(fVar, 3) && editSnippetRoute.packageId == null) {
                return;
            }
            dVar.v(fVar, 3, h1.f64699a, editSnippetRoute.packageId);
        }

        public final Long component1() {
            return this.f32947id;
        }

        public final VaultKeyId component2() {
            return this.targetVaultKeyId;
        }

        public final boolean component3() {
            return this.isFromPicker;
        }

        public final Long component4() {
            return this.packageId;
        }

        public final EditSnippetRoute copy(Long l10, VaultKeyId vaultKeyId, boolean z10, Long l11) {
            t.f(vaultKeyId, "targetVaultKeyId");
            return new EditSnippetRoute(l10, vaultKeyId, z10, l11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditSnippetRoute)) {
                return false;
            }
            EditSnippetRoute editSnippetRoute = (EditSnippetRoute) obj;
            return t.b(this.f32947id, editSnippetRoute.f32947id) && t.b(this.targetVaultKeyId, editSnippetRoute.targetVaultKeyId) && this.isFromPicker == editSnippetRoute.isFromPicker && t.b(this.packageId, editSnippetRoute.packageId);
        }

        public final Long getId() {
            return this.f32947id;
        }

        public final Long getPackageId() {
            return this.packageId;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            Long l10 = this.f32947id;
            int iHashCode = (((((l10 == null ? 0 : l10.hashCode()) * 31) + this.targetVaultKeyId.hashCode()) * 31) + Boolean.hashCode(this.isFromPicker)) * 31;
            Long l11 = this.packageId;
            return iHashCode + (l11 != null ? l11.hashCode() : 0);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "EditSnippetRoute(id=" + this.f32947id + ", targetVaultKeyId=" + this.targetVaultKeyId + ", isFromPicker=" + this.isFromPicker + ", packageId=" + this.packageId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32947id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
            Long l11 = this.packageId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
        }

        public EditSnippetRoute(Long l10, VaultKeyId vaultKeyId, boolean z10, Long l11) {
            t.f(vaultKeyId, "targetVaultKeyId");
            this.f32947id = l10;
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
            this.packageId = l11;
        }

        public /* synthetic */ EditSnippetRoute(Long l10, VaultKeyId vaultKeyId, boolean z10, Long l11, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, vaultKeyId, z10, (i10 & 8) != 0 ? null : l11);
        }
    }

    @p
    @Keep
    public static final class ExecuteSnippetConnectionsRoute implements SnippetsNavGraphRoute {
        private final boolean closeSessionAfterRunning;
        private final List<Long> hostsListIds;
        private final String script;
        private final long snippetId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ExecuteSnippetConnectionsRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: ik.u
            @Override // iu.a
            public final Object a() {
                return SnippetsNavGraphRoute.ExecuteSnippetConnectionsRoute._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32951b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32950a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.ExecuteSnippetConnectionsRoute", aVar, 4);
                i2Var.r("hostsListIds", false);
                i2Var.r("snippetId", false);
                i2Var.r("script", false);
                i2Var.r("closeSessionAfterRunning", false);
                descriptor = i2Var;
                f32951b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExecuteSnippetConnectionsRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                long j10;
                List list;
                String str;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = ExecuteSnippetConnectionsRoute.$childSerializers;
                if (cVarD.l()) {
                    List list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    long jO = cVarD.o(fVar, 1);
                    list = list2;
                    str = (String) cVarD.v(fVar, 2, x2.f64817a, null);
                    zH = cVarD.H(fVar, 3);
                    i10 = 15;
                    j10 = jO;
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    boolean zH2 = false;
                    List list3 = null;
                    String str2 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            list3 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list3);
                            i11 |= 1;
                        } else if (iD == 1) {
                            jO2 = cVarD.o(fVar, 1);
                            i11 |= 2;
                        } else if (iD == 2) {
                            str2 = (String) cVarD.v(fVar, 2, x2.f64817a, str2);
                            i11 |= 4;
                        } else {
                            if (iD != 3) {
                                throw new e0(iD);
                            }
                            zH2 = cVarD.H(fVar, 3);
                            i11 |= 8;
                        }
                    }
                    zH = zH2;
                    i10 = i11;
                    j10 = jO2;
                    list = list3;
                    str = str2;
                }
                cVarD.b(fVar);
                return new ExecuteSnippetConnectionsRoute(i10, list, j10, str, zH, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ExecuteSnippetConnectionsRoute executeSnippetConnectionsRoute) {
                t.f(fVar, "encoder");
                t.f(executeSnippetConnectionsRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ExecuteSnippetConnectionsRoute.write$Self$Termius_app_googleProductionRelease(executeSnippetConnectionsRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{ExecuteSnippetConnectionsRoute.$childSerializers[0].getValue(), h1.f64699a, iv.a.u(x2.f64817a), i.f64704a};
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
                return a.f32950a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExecuteSnippetConnectionsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new ExecuteSnippetConnectionsRoute(arrayList, parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExecuteSnippetConnectionsRoute[] newArray(int i10) {
                return new ExecuteSnippetConnectionsRoute[i10];
            }
        }

        public /* synthetic */ ExecuteSnippetConnectionsRoute(int i10, List list, long j10, String str, boolean z10, s2 s2Var) {
            if (15 != (i10 & 15)) {
                d2.a(i10, 15, a.f32950a.getDescriptor());
            }
            this.hostsListIds = list;
            this.snippetId = j10;
            this.script = str;
            this.closeSessionAfterRunning = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExecuteSnippetConnectionsRoute copy$default(ExecuteSnippetConnectionsRoute executeSnippetConnectionsRoute, List list, long j10, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = executeSnippetConnectionsRoute.hostsListIds;
            }
            if ((i10 & 2) != 0) {
                j10 = executeSnippetConnectionsRoute.snippetId;
            }
            if ((i10 & 4) != 0) {
                str = executeSnippetConnectionsRoute.script;
            }
            if ((i10 & 8) != 0) {
                z10 = executeSnippetConnectionsRoute.closeSessionAfterRunning;
            }
            return executeSnippetConnectionsRoute.copy(list, j10, str, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ExecuteSnippetConnectionsRoute executeSnippetConnectionsRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), executeSnippetConnectionsRoute.hostsListIds);
            dVar.q(fVar, 1, executeSnippetConnectionsRoute.snippetId);
            dVar.v(fVar, 2, x2.f64817a, executeSnippetConnectionsRoute.script);
            dVar.u(fVar, 3, executeSnippetConnectionsRoute.closeSessionAfterRunning);
        }

        public final List<Long> component1() {
            return this.hostsListIds;
        }

        public final long component2() {
            return this.snippetId;
        }

        public final String component3() {
            return this.script;
        }

        public final boolean component4() {
            return this.closeSessionAfterRunning;
        }

        public final ExecuteSnippetConnectionsRoute copy(List<Long> list, long j10, String str, boolean z10) {
            t.f(list, "hostsListIds");
            return new ExecuteSnippetConnectionsRoute(list, j10, str, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteSnippetConnectionsRoute)) {
                return false;
            }
            ExecuteSnippetConnectionsRoute executeSnippetConnectionsRoute = (ExecuteSnippetConnectionsRoute) obj;
            return t.b(this.hostsListIds, executeSnippetConnectionsRoute.hostsListIds) && this.snippetId == executeSnippetConnectionsRoute.snippetId && t.b(this.script, executeSnippetConnectionsRoute.script) && this.closeSessionAfterRunning == executeSnippetConnectionsRoute.closeSessionAfterRunning;
        }

        public final boolean getCloseSessionAfterRunning() {
            return this.closeSessionAfterRunning;
        }

        public final List<Long> getHostsListIds() {
            return this.hostsListIds;
        }

        public final String getScript() {
            return this.script;
        }

        public final long getSnippetId() {
            return this.snippetId;
        }

        public int hashCode() {
            int iHashCode = ((this.hostsListIds.hashCode() * 31) + Long.hashCode(this.snippetId)) * 31;
            String str = this.script;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.closeSessionAfterRunning);
        }

        public String toString() {
            return "ExecuteSnippetConnectionsRoute(hostsListIds=" + this.hostsListIds + ", snippetId=" + this.snippetId + ", script=" + this.script + ", closeSessionAfterRunning=" + this.closeSessionAfterRunning + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            List<Long> list = this.hostsListIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            parcel.writeLong(this.snippetId);
            parcel.writeString(this.script);
            parcel.writeInt(this.closeSessionAfterRunning ? 1 : 0);
        }

        public ExecuteSnippetConnectionsRoute(List<Long> list, long j10, String str, boolean z10) {
            t.f(list, "hostsListIds");
            this.hostsListIds = list;
            this.snippetId = j10;
            this.script = str;
            this.closeSessionAfterRunning = z10;
        }
    }

    @p
    @Keep
    public static final class SelectDefaultSnippetHostsRoute implements SnippetsNavGraphRoute {
        private final List<Long> initialSnippetHostsListIds;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SelectDefaultSnippetHostsRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: ik.v
            @Override // iu.a
            public final Object a() {
                return SnippetsNavGraphRoute.SelectDefaultSnippetHostsRoute._childSerializers$_anonymous_();
            }
        })};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32952a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32953b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32952a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SelectDefaultSnippetHostsRoute", aVar, 2);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("initialSnippetHostsListIds", false);
                descriptor = i2Var;
                f32953b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectDefaultSnippetHostsRoute deserialize(e eVar) {
                List list;
                VaultKeyId vaultKeyId;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = SelectDefaultSnippetHostsRoute.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list2 = null;
                    VaultKeyId vaultKeyId2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId2);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list2);
                            i11 |= 2;
                        }
                    }
                    list = list2;
                    vaultKeyId = vaultKeyId2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SelectDefaultSnippetHostsRoute(i10, vaultKeyId, list, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SelectDefaultSnippetHostsRoute selectDefaultSnippetHostsRoute) {
                t.f(fVar, "encoder");
                t.f(selectDefaultSnippetHostsRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SelectDefaultSnippetHostsRoute.write$Self$Termius_app_googleProductionRelease(selectDefaultSnippetHostsRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, SelectDefaultSnippetHostsRoute.$childSerializers[1].getValue()};
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
                return SelectDefaultSnippetHostsRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32952a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectDefaultSnippetHostsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                VaultKeyId vaultKeyId = (VaultKeyId) parcel.readParcelable(SelectDefaultSnippetHostsRoute.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new SelectDefaultSnippetHostsRoute(vaultKeyId, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelectDefaultSnippetHostsRoute[] newArray(int i10) {
                return new SelectDefaultSnippetHostsRoute[i10];
            }
        }

        public /* synthetic */ SelectDefaultSnippetHostsRoute(int i10, VaultKeyId vaultKeyId, List list, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32952a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectDefaultSnippetHostsRoute copy$default(SelectDefaultSnippetHostsRoute selectDefaultSnippetHostsRoute, VaultKeyId vaultKeyId, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = selectDefaultSnippetHostsRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                list = selectDefaultSnippetHostsRoute.initialSnippetHostsListIds;
            }
            return selectDefaultSnippetHostsRoute.copy(vaultKeyId, list);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SelectDefaultSnippetHostsRoute selectDefaultSnippetHostsRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, selectDefaultSnippetHostsRoute.targetVaultKeyId);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), selectDefaultSnippetHostsRoute.initialSnippetHostsListIds);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final List<Long> component2() {
            return this.initialSnippetHostsListIds;
        }

        public final SelectDefaultSnippetHostsRoute copy(VaultKeyId vaultKeyId, List<Long> list) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            return new SelectDefaultSnippetHostsRoute(vaultKeyId, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectDefaultSnippetHostsRoute)) {
                return false;
            }
            SelectDefaultSnippetHostsRoute selectDefaultSnippetHostsRoute = (SelectDefaultSnippetHostsRoute) obj;
            return t.b(this.targetVaultKeyId, selectDefaultSnippetHostsRoute.targetVaultKeyId) && t.b(this.initialSnippetHostsListIds, selectDefaultSnippetHostsRoute.initialSnippetHostsListIds);
        }

        public final List<Long> getInitialSnippetHostsListIds() {
            return this.initialSnippetHostsListIds;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (this.targetVaultKeyId.hashCode() * 31) + this.initialSnippetHostsListIds.hashCode();
        }

        public String toString() {
            return "SelectDefaultSnippetHostsRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", initialSnippetHostsListIds=" + this.initialSnippetHostsListIds + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            List<Long> list = this.initialSnippetHostsListIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }

        public SelectDefaultSnippetHostsRoute(VaultKeyId vaultKeyId, List<Long> list) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
        }
    }

    @p
    @Keep
    public static final class SelectPackageRoute implements SnippetsNavGraphRoute {
        private final boolean isFromPicker;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SelectPackageRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32955b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32954a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SelectPackageRoute", aVar, 2);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32955b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectPackageRoute deserialize(e eVar) {
                VaultKeyId vaultKeyId;
                boolean zH;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    int i11 = 0;
                    vaultKeyId = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId);
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
                return new SelectPackageRoute(i10, vaultKeyId, zH, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SelectPackageRoute selectPackageRoute) {
                t.f(fVar, "encoder");
                t.f(selectPackageRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SelectPackageRoute.write$Self$Termius_app_googleProductionRelease(selectPackageRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, i.f64704a};
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
                return SelectPackageRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32954a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectPackageRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new SelectPackageRoute((VaultKeyId) parcel.readParcelable(SelectPackageRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelectPackageRoute[] newArray(int i10) {
                return new SelectPackageRoute[i10];
            }
        }

        public /* synthetic */ SelectPackageRoute(int i10, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32954a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ SelectPackageRoute copy$default(SelectPackageRoute selectPackageRoute, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = selectPackageRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                z10 = selectPackageRoute.isFromPicker;
            }
            return selectPackageRoute.copy(vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SelectPackageRoute selectPackageRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, selectPackageRoute.targetVaultKeyId);
            dVar.u(fVar, 1, selectPackageRoute.isFromPicker);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final boolean component2() {
            return this.isFromPicker;
        }

        public final SelectPackageRoute copy(VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            return new SelectPackageRoute(vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPackageRoute)) {
                return false;
            }
            SelectPackageRoute selectPackageRoute = (SelectPackageRoute) obj;
            return t.b(this.targetVaultKeyId, selectPackageRoute.targetVaultKeyId) && this.isFromPicker == selectPackageRoute.isFromPicker;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (this.targetVaultKeyId.hashCode() * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "SelectPackageRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public SelectPackageRoute(VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class SelectRunSnippetHostsRoute implements SnippetsNavGraphRoute {
        private final List<Long> initialSnippetHostsListIds;
        private final String script;
        private final long snippetId;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SelectRunSnippetHostsRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: ik.w
            @Override // iu.a
            public final Object a() {
                return SnippetsNavGraphRoute.SelectRunSnippetHostsRoute._childSerializers$_anonymous_();
            }
        }), null, null};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32957b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32956a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SelectRunSnippetHostsRoute", aVar, 4);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("initialSnippetHostsListIds", false);
                i2Var.r("snippetId", false);
                i2Var.r("script", true);
                descriptor = i2Var;
                f32957b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectRunSnippetHostsRoute deserialize(e eVar) {
                int i10;
                VaultKeyId vaultKeyId;
                long j10;
                List list;
                String str;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = SelectRunSnippetHostsRoute.$childSerializers;
                VaultKeyId vaultKeyId2 = null;
                if (cVarD.l()) {
                    VaultKeyId vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    List list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    long jO = cVarD.o(fVar, 2);
                    list = list2;
                    vaultKeyId = vaultKeyId3;
                    str = (String) cVarD.v(fVar, 3, x2.f64817a, null);
                    j10 = jO;
                    i10 = 15;
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    List list3 = null;
                    String str2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId2);
                            i11 |= 1;
                        } else if (iD == 1) {
                            list3 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list3);
                            i11 |= 2;
                        } else if (iD == 2) {
                            jO2 = cVarD.o(fVar, 2);
                            i11 |= 4;
                        } else {
                            if (iD != 3) {
                                throw new e0(iD);
                            }
                            str2 = (String) cVarD.v(fVar, 3, x2.f64817a, str2);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    vaultKeyId = vaultKeyId2;
                    j10 = jO2;
                    list = list3;
                    str = str2;
                }
                cVarD.b(fVar);
                return new SelectRunSnippetHostsRoute(i10, vaultKeyId, list, j10, str, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SelectRunSnippetHostsRoute selectRunSnippetHostsRoute) {
                t.f(fVar, "encoder");
                t.f(selectRunSnippetHostsRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SelectRunSnippetHostsRoute.write$Self$Termius_app_googleProductionRelease(selectRunSnippetHostsRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, SelectRunSnippetHostsRoute.$childSerializers[1].getValue(), h1.f64699a, iv.a.u(x2.f64817a)};
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
                return SelectRunSnippetHostsRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32956a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectRunSnippetHostsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                VaultKeyId vaultKeyId = (VaultKeyId) parcel.readParcelable(SelectRunSnippetHostsRoute.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                int i11 = 0;
                while (true) {
                    long j10 = parcel.readLong();
                    if (i11 == i10) {
                        return new SelectRunSnippetHostsRoute(vaultKeyId, arrayList, j10, parcel.readString());
                    }
                    arrayList.add(Long.valueOf(j10));
                    i11++;
                }
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelectRunSnippetHostsRoute[] newArray(int i10) {
                return new SelectRunSnippetHostsRoute[i10];
            }
        }

        public /* synthetic */ SelectRunSnippetHostsRoute(int i10, VaultKeyId vaultKeyId, List list, long j10, String str, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32956a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
            this.snippetId = j10;
            if ((i10 & 8) == 0) {
                this.script = null;
            } else {
                this.script = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectRunSnippetHostsRoute copy$default(SelectRunSnippetHostsRoute selectRunSnippetHostsRoute, VaultKeyId vaultKeyId, List list, long j10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = selectRunSnippetHostsRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                list = selectRunSnippetHostsRoute.initialSnippetHostsListIds;
            }
            if ((i10 & 4) != 0) {
                j10 = selectRunSnippetHostsRoute.snippetId;
            }
            if ((i10 & 8) != 0) {
                str = selectRunSnippetHostsRoute.script;
            }
            String str2 = str;
            return selectRunSnippetHostsRoute.copy(vaultKeyId, list, j10, str2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SelectRunSnippetHostsRoute selectRunSnippetHostsRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, selectRunSnippetHostsRoute.targetVaultKeyId);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), selectRunSnippetHostsRoute.initialSnippetHostsListIds);
            dVar.q(fVar, 2, selectRunSnippetHostsRoute.snippetId);
            if (!dVar.E(fVar, 3) && selectRunSnippetHostsRoute.script == null) {
                return;
            }
            dVar.v(fVar, 3, x2.f64817a, selectRunSnippetHostsRoute.script);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final List<Long> component2() {
            return this.initialSnippetHostsListIds;
        }

        public final long component3() {
            return this.snippetId;
        }

        public final String component4() {
            return this.script;
        }

        public final SelectRunSnippetHostsRoute copy(VaultKeyId vaultKeyId, List<Long> list, long j10, String str) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            return new SelectRunSnippetHostsRoute(vaultKeyId, list, j10, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectRunSnippetHostsRoute)) {
                return false;
            }
            SelectRunSnippetHostsRoute selectRunSnippetHostsRoute = (SelectRunSnippetHostsRoute) obj;
            return t.b(this.targetVaultKeyId, selectRunSnippetHostsRoute.targetVaultKeyId) && t.b(this.initialSnippetHostsListIds, selectRunSnippetHostsRoute.initialSnippetHostsListIds) && this.snippetId == selectRunSnippetHostsRoute.snippetId && t.b(this.script, selectRunSnippetHostsRoute.script);
        }

        public final List<Long> getInitialSnippetHostsListIds() {
            return this.initialSnippetHostsListIds;
        }

        public final String getScript() {
            return this.script;
        }

        public final long getSnippetId() {
            return this.snippetId;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            int iHashCode = ((((this.targetVaultKeyId.hashCode() * 31) + this.initialSnippetHostsListIds.hashCode()) * 31) + Long.hashCode(this.snippetId)) * 31;
            String str = this.script;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SelectRunSnippetHostsRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", initialSnippetHostsListIds=" + this.initialSnippetHostsListIds + ", snippetId=" + this.snippetId + ", script=" + this.script + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            List<Long> list = this.initialSnippetHostsListIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            parcel.writeLong(this.snippetId);
            parcel.writeString(this.script);
        }

        public SelectRunSnippetHostsRoute(VaultKeyId vaultKeyId, List<Long> list, long j10, String str) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
            this.snippetId = j10;
            this.script = str;
        }

        public /* synthetic */ SelectRunSnippetHostsRoute(VaultKeyId vaultKeyId, List list, long j10, String str, int i10, k kVar) {
            this(vaultKeyId, list, j10, (i10 & 8) != 0 ? null : str);
        }
    }

    @p
    @Keep
    public static final class SelectSnippetRoute implements SnippetsNavGraphRoute {
        private final boolean isFromPicker;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SelectSnippetRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32958a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32959b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32958a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SelectSnippetRoute", aVar, 2);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("isFromPicker", false);
                descriptor = i2Var;
                f32959b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectSnippetRoute deserialize(e eVar) {
                VaultKeyId vaultKeyId;
                boolean zH;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    zH = cVarD.H(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    int i11 = 0;
                    vaultKeyId = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId);
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
                return new SelectSnippetRoute(i10, vaultKeyId, zH, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SelectSnippetRoute selectSnippetRoute) {
                t.f(fVar, "encoder");
                t.f(selectSnippetRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SelectSnippetRoute.write$Self$Termius_app_googleProductionRelease(selectSnippetRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, i.f64704a};
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
                return SelectSnippetRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32958a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectSnippetRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new SelectSnippetRoute((VaultKeyId) parcel.readParcelable(SelectSnippetRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelectSnippetRoute[] newArray(int i10) {
                return new SelectSnippetRoute[i10];
            }
        }

        public /* synthetic */ SelectSnippetRoute(int i10, VaultKeyId vaultKeyId, boolean z10, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32958a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }

        public static /* synthetic */ SelectSnippetRoute copy$default(SelectSnippetRoute selectSnippetRoute, VaultKeyId vaultKeyId, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = selectSnippetRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                z10 = selectSnippetRoute.isFromPicker;
            }
            return selectSnippetRoute.copy(vaultKeyId, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SelectSnippetRoute selectSnippetRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, selectSnippetRoute.targetVaultKeyId);
            dVar.u(fVar, 1, selectSnippetRoute.isFromPicker);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final boolean component2() {
            return this.isFromPicker;
        }

        public final SelectSnippetRoute copy(VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            return new SelectSnippetRoute(vaultKeyId, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectSnippetRoute)) {
                return false;
            }
            SelectSnippetRoute selectSnippetRoute = (SelectSnippetRoute) obj;
            return t.b(this.targetVaultKeyId, selectSnippetRoute.targetVaultKeyId) && this.isFromPicker == selectSnippetRoute.isFromPicker;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (this.targetVaultKeyId.hashCode() * 31) + Boolean.hashCode(this.isFromPicker);
        }

        public final boolean isFromPicker() {
            return this.isFromPicker;
        }

        public String toString() {
            return "SelectSnippetRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", isFromPicker=" + this.isFromPicker + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeInt(this.isFromPicker ? 1 : 0);
        }

        public SelectSnippetRoute(VaultKeyId vaultKeyId, boolean z10) {
            t.f(vaultKeyId, "targetVaultKeyId");
            this.targetVaultKeyId = vaultKeyId;
            this.isFromPicker = z10;
        }
    }

    @p
    @Keep
    public static final class SetupSnippetVariablesRoute implements SnippetsNavGraphRoute {
        private final List<Long> initialSnippetHostsListIds;
        private final boolean isMultiExecution;
        private final long snippetId;
        private final String snippetSourceOriginName;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SetupSnippetVariablesRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: ik.x
            @Override // iu.a
            public final Object a() {
                return SnippetsNavGraphRoute.SetupSnippetVariablesRoute._childSerializers$_anonymous_();
            }
        }), null, null, null};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32961b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32960a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SetupSnippetVariablesRoute", aVar, 5);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("initialSnippetHostsListIds", false);
                i2Var.r("snippetId", false);
                i2Var.r("isMultiExecution", false);
                i2Var.r("snippetSourceOriginName", false);
                descriptor = i2Var;
                f32961b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetupSnippetVariablesRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                long j10;
                VaultKeyId vaultKeyId;
                List list;
                String strB;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = SetupSnippetVariablesRoute.$childSerializers;
                int i11 = 3;
                if (cVarD.l()) {
                    VaultKeyId vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    List list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    long jO = cVarD.o(fVar, 2);
                    list = list2;
                    vaultKeyId = vaultKeyId2;
                    zH = cVarD.H(fVar, 3);
                    strB = cVarD.B(fVar, 4);
                    j10 = jO;
                    i10 = 31;
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    boolean zH2 = false;
                    VaultKeyId vaultKeyId3 = null;
                    List list3 = null;
                    String strB2 = null;
                    int i12 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, vaultKeyId3);
                            i12 |= 1;
                        } else if (iD == 1) {
                            list3 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list3);
                            i12 |= 2;
                        } else if (iD == 2) {
                            jO2 = cVarD.o(fVar, 2);
                            i12 |= 4;
                        } else if (iD == i11) {
                            zH2 = cVarD.H(fVar, i11);
                            i12 |= 8;
                        } else {
                            if (iD != 4) {
                                throw new e0(iD);
                            }
                            strB2 = cVarD.B(fVar, 4);
                            i12 |= 16;
                        }
                        i11 = 3;
                    }
                    zH = zH2;
                    i10 = i12;
                    j10 = jO2;
                    vaultKeyId = vaultKeyId3;
                    list = list3;
                    strB = strB2;
                }
                cVarD.b(fVar);
                return new SetupSnippetVariablesRoute(i10, vaultKeyId, list, j10, zH, strB, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SetupSnippetVariablesRoute setupSnippetVariablesRoute) {
                t.f(fVar, "encoder");
                t.f(setupSnippetVariablesRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SetupSnippetVariablesRoute.write$Self$Termius_app_googleProductionRelease(setupSnippetVariablesRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, SetupSnippetVariablesRoute.$childSerializers[1].getValue(), h1.f64699a, i.f64704a, x2.f64817a};
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
                return SetupSnippetVariablesRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32960a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetupSnippetVariablesRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                VaultKeyId vaultKeyId = (VaultKeyId) parcel.readParcelable(SetupSnippetVariablesRoute.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new SetupSnippetVariablesRoute(vaultKeyId, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SetupSnippetVariablesRoute[] newArray(int i10) {
                return new SetupSnippetVariablesRoute[i10];
            }
        }

        public /* synthetic */ SetupSnippetVariablesRoute(int i10, VaultKeyId vaultKeyId, List list, long j10, boolean z10, String str, s2 s2Var) {
            if (31 != (i10 & 31)) {
                d2.a(i10, 31, a.f32960a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
            this.snippetId = j10;
            this.isMultiExecution = z10;
            this.snippetSourceOriginName = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetupSnippetVariablesRoute copy$default(SetupSnippetVariablesRoute setupSnippetVariablesRoute, VaultKeyId vaultKeyId, List list, long j10, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = setupSnippetVariablesRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                list = setupSnippetVariablesRoute.initialSnippetHostsListIds;
            }
            if ((i10 & 4) != 0) {
                j10 = setupSnippetVariablesRoute.snippetId;
            }
            if ((i10 & 8) != 0) {
                z10 = setupSnippetVariablesRoute.isMultiExecution;
            }
            if ((i10 & 16) != 0) {
                str = setupSnippetVariablesRoute.snippetSourceOriginName;
            }
            long j11 = j10;
            return setupSnippetVariablesRoute.copy(vaultKeyId, list, j11, z10, str);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SetupSnippetVariablesRoute setupSnippetVariablesRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, setupSnippetVariablesRoute.targetVaultKeyId);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), setupSnippetVariablesRoute.initialSnippetHostsListIds);
            dVar.q(fVar, 2, setupSnippetVariablesRoute.snippetId);
            dVar.u(fVar, 3, setupSnippetVariablesRoute.isMultiExecution);
            dVar.f(fVar, 4, setupSnippetVariablesRoute.snippetSourceOriginName);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final List<Long> component2() {
            return this.initialSnippetHostsListIds;
        }

        public final long component3() {
            return this.snippetId;
        }

        public final boolean component4() {
            return this.isMultiExecution;
        }

        public final String component5() {
            return this.snippetSourceOriginName;
        }

        public final SetupSnippetVariablesRoute copy(VaultKeyId vaultKeyId, List<Long> list, long j10, boolean z10, String str) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            t.f(str, "snippetSourceOriginName");
            return new SetupSnippetVariablesRoute(vaultKeyId, list, j10, z10, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupSnippetVariablesRoute)) {
                return false;
            }
            SetupSnippetVariablesRoute setupSnippetVariablesRoute = (SetupSnippetVariablesRoute) obj;
            return t.b(this.targetVaultKeyId, setupSnippetVariablesRoute.targetVaultKeyId) && t.b(this.initialSnippetHostsListIds, setupSnippetVariablesRoute.initialSnippetHostsListIds) && this.snippetId == setupSnippetVariablesRoute.snippetId && this.isMultiExecution == setupSnippetVariablesRoute.isMultiExecution && t.b(this.snippetSourceOriginName, setupSnippetVariablesRoute.snippetSourceOriginName);
        }

        public final List<Long> getInitialSnippetHostsListIds() {
            return this.initialSnippetHostsListIds;
        }

        public final long getSnippetId() {
            return this.snippetId;
        }

        public final String getSnippetSourceOriginName() {
            return this.snippetSourceOriginName;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (((((((this.targetVaultKeyId.hashCode() * 31) + this.initialSnippetHostsListIds.hashCode()) * 31) + Long.hashCode(this.snippetId)) * 31) + Boolean.hashCode(this.isMultiExecution)) * 31) + this.snippetSourceOriginName.hashCode();
        }

        public final boolean isMultiExecution() {
            return this.isMultiExecution;
        }

        public String toString() {
            return "SetupSnippetVariablesRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", initialSnippetHostsListIds=" + this.initialSnippetHostsListIds + ", snippetId=" + this.snippetId + ", isMultiExecution=" + this.isMultiExecution + ", snippetSourceOriginName=" + this.snippetSourceOriginName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            List<Long> list = this.initialSnippetHostsListIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            parcel.writeLong(this.snippetId);
            parcel.writeInt(this.isMultiExecution ? 1 : 0);
            parcel.writeString(this.snippetSourceOriginName);
        }

        public SetupSnippetVariablesRoute(VaultKeyId vaultKeyId, List<Long> list, long j10, boolean z10, String str) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(list, "initialSnippetHostsListIds");
            t.f(str, "snippetSourceOriginName");
            this.targetVaultKeyId = vaultKeyId;
            this.initialSnippetHostsListIds = list;
            this.snippetId = j10;
            this.isMultiExecution = z10;
            this.snippetSourceOriginName = str;
        }
    }

    @p
    @Keep
    public static final class SnippetsRoute implements SnippetsNavGraphRoute, NavigationRailsRoute {
        public static final SnippetsRoute INSTANCE = new SnippetsRoute();
        public static final Parcelable.Creator<SnippetsRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.y
            @Override // iu.a
            public final Object a() {
                return SnippetsNavGraphRoute.SnippetsRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnippetsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return SnippetsRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SnippetsRoute[] newArray(int i10) {
                return new SnippetsRoute[i10];
            }
        }

        private SnippetsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SnippetsNavGraphRoute.SnippetsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SnippetsRoute);
        }

        public int hashCode() {
            return -811967970;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SnippetsRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
