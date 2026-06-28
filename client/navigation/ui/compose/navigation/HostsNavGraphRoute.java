package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResultWrapper;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant;
import hv.c;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.g1;
import lv.h1;
import lv.i;
import lv.i0;
import lv.i2;
import lv.j0;
import lv.n0;
import lv.s2;
import lv.w1;
import lv.x2;
import qu.l;
import ut.b0;
import ut.n;
import ut.o;
import ut.r;
import vt.s0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface HostsNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class ChainHostSelectRoute implements HostsNavGraphRoute {
        private final long[] filteredHostIds;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ChainHostSelectRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32865b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32864a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.ChainHostSelectRoute", aVar, 2);
                i2Var.r("vaultKeyId", false);
                i2Var.r("filteredHostIds", false);
                descriptor = i2Var;
                f32865b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChainHostSelectRoute deserialize(e eVar) {
                VaultKeyId vaultKeyId;
                long[] jArr;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    jArr = (long[]) cVarD.i(fVar, 1, g1.f64693c, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    vaultKeyId = null;
                    long[] jArr2 = null;
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
                            jArr2 = (long[]) cVarD.i(fVar, 1, g1.f64693c, jArr2);
                            i11 |= 2;
                        }
                    }
                    jArr = jArr2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ChainHostSelectRoute(i10, vaultKeyId, jArr, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ChainHostSelectRoute chainHostSelectRoute) {
                t.f(fVar, "encoder");
                t.f(chainHostSelectRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ChainHostSelectRoute.write$Self$Termius_app_googleProductionRelease(chainHostSelectRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, g1.f64693c};
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
                return ChainHostSelectRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32864a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChainHostSelectRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new ChainHostSelectRoute((VaultKeyId) parcel.readParcelable(ChainHostSelectRoute.class.getClassLoader()), parcel.createLongArray());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChainHostSelectRoute[] newArray(int i10) {
                return new ChainHostSelectRoute[i10];
            }
        }

        public /* synthetic */ ChainHostSelectRoute(int i10, VaultKeyId vaultKeyId, long[] jArr, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32864a.getDescriptor());
            }
            this.vaultKeyId = vaultKeyId;
            this.filteredHostIds = jArr;
        }

        public static /* synthetic */ ChainHostSelectRoute copy$default(ChainHostSelectRoute chainHostSelectRoute, VaultKeyId vaultKeyId, long[] jArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = chainHostSelectRoute.vaultKeyId;
            }
            if ((i10 & 2) != 0) {
                jArr = chainHostSelectRoute.filteredHostIds;
            }
            return chainHostSelectRoute.copy(vaultKeyId, jArr);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChainHostSelectRoute chainHostSelectRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, chainHostSelectRoute.vaultKeyId);
            dVar.o(fVar, 1, g1.f64693c, chainHostSelectRoute.filteredHostIds);
        }

        public final VaultKeyId component1() {
            return this.vaultKeyId;
        }

        public final long[] component2() {
            return this.filteredHostIds;
        }

        public final ChainHostSelectRoute copy(VaultKeyId vaultKeyId, long[] jArr) {
            t.f(vaultKeyId, "vaultKeyId");
            t.f(jArr, "filteredHostIds");
            return new ChainHostSelectRoute(vaultKeyId, jArr);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!t.b(ChainHostSelectRoute.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            t.d(obj, "null cannot be cast to non-null type com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.ChainHostSelectRoute");
            ChainHostSelectRoute chainHostSelectRoute = (ChainHostSelectRoute) obj;
            return t.b(this.vaultKeyId, chainHostSelectRoute.vaultKeyId) && Arrays.equals(this.filteredHostIds, chainHostSelectRoute.filteredHostIds);
        }

        public final long[] getFilteredHostIds() {
            return this.filteredHostIds;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (this.vaultKeyId.hashCode() * 31) + Arrays.hashCode(this.filteredHostIds);
        }

        public String toString() {
            return "ChainHostSelectRoute(vaultKeyId=" + this.vaultKeyId + ", filteredHostIds=" + Arrays.toString(this.filteredHostIds) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.vaultKeyId, i10);
            parcel.writeLongArray(this.filteredHostIds);
        }

        public ChainHostSelectRoute(VaultKeyId vaultKeyId, long[] jArr) {
            t.f(vaultKeyId, "vaultKeyId");
            t.f(jArr, "filteredHostIds");
            this.vaultKeyId = vaultKeyId;
            this.filteredHostIds = jArr;
        }
    }

    @p
    @Keep
    public static final class CharsetManagerRoute implements HostsNavGraphRoute {
        private final String defaultCharset;
        private final String initialCharset;
        private final SelectPurpose selectPurpose;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<CharsetManagerRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, null, o.b(r.f82638b, new iu.a() { // from class: ik.f
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.CharsetManagerRoute._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32867b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32866a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.CharsetManagerRoute", aVar, 3);
                i2Var.r("initialCharset", false);
                i2Var.r("defaultCharset", false);
                i2Var.r("selectPurpose", false);
                descriptor = i2Var;
                f32867b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharsetManagerRoute deserialize(e eVar) {
                int i10;
                String str;
                String str2;
                SelectPurpose selectPurpose;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = CharsetManagerRoute.$childSerializers;
                String strB = null;
                if (cVarD.l()) {
                    String strB2 = cVarD.B(fVar, 0);
                    String strB3 = cVarD.B(fVar, 1);
                    selectPurpose = (SelectPurpose) cVarD.i(fVar, 2, (hv.b) nVarArr[2].getValue(), null);
                    str = strB2;
                    i10 = 7;
                    str2 = strB3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String strB4 = null;
                    SelectPurpose selectPurpose2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            strB4 = cVarD.B(fVar, 1);
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
                    str = strB;
                    str2 = strB4;
                    selectPurpose = selectPurpose2;
                }
                cVarD.b(fVar);
                return new CharsetManagerRoute(i10, str, str2, selectPurpose, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, CharsetManagerRoute charsetManagerRoute) {
                t.f(fVar, "encoder");
                t.f(charsetManagerRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                CharsetManagerRoute.write$Self$Termius_app_googleProductionRelease(charsetManagerRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                n[] nVarArr = CharsetManagerRoute.$childSerializers;
                x2 x2Var = x2.f64817a;
                return new hv.c[]{x2Var, x2Var, nVarArr[2].getValue()};
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
                return a.f32866a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharsetManagerRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new CharsetManagerRoute(parcel.readString(), parcel.readString(), SelectPurpose.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharsetManagerRoute[] newArray(int i10) {
                return new CharsetManagerRoute[i10];
            }
        }

        public /* synthetic */ CharsetManagerRoute(int i10, String str, String str2, SelectPurpose selectPurpose, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32866a.getDescriptor());
            }
            this.initialCharset = str;
            this.defaultCharset = str2;
            this.selectPurpose = selectPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SelectPurpose.Companion.serializer();
        }

        public static /* synthetic */ CharsetManagerRoute copy$default(CharsetManagerRoute charsetManagerRoute, String str, String str2, SelectPurpose selectPurpose, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = charsetManagerRoute.initialCharset;
            }
            if ((i10 & 2) != 0) {
                str2 = charsetManagerRoute.defaultCharset;
            }
            if ((i10 & 4) != 0) {
                selectPurpose = charsetManagerRoute.selectPurpose;
            }
            return charsetManagerRoute.copy(str, str2, selectPurpose);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CharsetManagerRoute charsetManagerRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.f(fVar, 0, charsetManagerRoute.initialCharset);
            dVar.f(fVar, 1, charsetManagerRoute.defaultCharset);
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), charsetManagerRoute.selectPurpose);
        }

        public final String component1() {
            return this.initialCharset;
        }

        public final String component2() {
            return this.defaultCharset;
        }

        public final SelectPurpose component3() {
            return this.selectPurpose;
        }

        public final CharsetManagerRoute copy(String str, String str2, SelectPurpose selectPurpose) {
            t.f(str, "initialCharset");
            t.f(str2, "defaultCharset");
            t.f(selectPurpose, "selectPurpose");
            return new CharsetManagerRoute(str, str2, selectPurpose);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CharsetManagerRoute)) {
                return false;
            }
            CharsetManagerRoute charsetManagerRoute = (CharsetManagerRoute) obj;
            return t.b(this.initialCharset, charsetManagerRoute.initialCharset) && t.b(this.defaultCharset, charsetManagerRoute.defaultCharset) && this.selectPurpose == charsetManagerRoute.selectPurpose;
        }

        public final String getDefaultCharset() {
            return this.defaultCharset;
        }

        public final String getInitialCharset() {
            return this.initialCharset;
        }

        public final SelectPurpose getSelectPurpose() {
            return this.selectPurpose;
        }

        public int hashCode() {
            return (((this.initialCharset.hashCode() * 31) + this.defaultCharset.hashCode()) * 31) + this.selectPurpose.hashCode();
        }

        public String toString() {
            return "CharsetManagerRoute(initialCharset=" + this.initialCharset + ", defaultCharset=" + this.defaultCharset + ", selectPurpose=" + this.selectPurpose + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.initialCharset);
            parcel.writeString(this.defaultCharset);
            parcel.writeString(this.selectPurpose.name());
        }

        public CharsetManagerRoute(String str, String str2, SelectPurpose selectPurpose) {
            t.f(str, "initialCharset");
            t.f(str2, "defaultCharset");
            t.f(selectPurpose, "selectPurpose");
            this.initialCharset = str;
            this.defaultCharset = str2;
            this.selectPurpose = selectPurpose;
        }
    }

    @p
    @Keep
    public static final class ColorSchemeManagerRoute implements HostsNavGraphRoute {
        private final String defaultColorScheme;
        private final String initialColorScheme;
        private final boolean isInGroupEditor;
        private final boolean isSettingsMode;
        private final SelectPurpose selectPurpose;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ColorSchemeManagerRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: ik.g
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.ColorSchemeManagerRoute._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32868a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32869b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32868a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.ColorSchemeManagerRoute", aVar, 5);
                i2Var.r("initialColorScheme", false);
                i2Var.r("defaultColorScheme", false);
                i2Var.r("isSettingsMode", false);
                i2Var.r("isInGroupEditor", false);
                i2Var.r("selectPurpose", false);
                descriptor = i2Var;
                f32869b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ColorSchemeManagerRoute deserialize(e eVar) {
                boolean z10;
                boolean z11;
                int i10;
                String str;
                String str2;
                SelectPurpose selectPurpose;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = ColorSchemeManagerRoute.$childSerializers;
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    String strB2 = cVarD.B(fVar, 1);
                    boolean zH = cVarD.H(fVar, 2);
                    boolean zH2 = cVarD.H(fVar, 3);
                    selectPurpose = (SelectPurpose) cVarD.i(fVar, 4, (hv.b) nVarArr[4].getValue(), null);
                    str = strB;
                    z10 = zH2;
                    z11 = zH;
                    i10 = 31;
                    str2 = strB2;
                } else {
                    boolean z12 = true;
                    boolean zH3 = false;
                    int i11 = 0;
                    String strB3 = null;
                    String strB4 = null;
                    SelectPurpose selectPurpose2 = null;
                    boolean zH4 = false;
                    while (z12) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z12 = false;
                        } else if (iD == 0) {
                            strB3 = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            strB4 = cVarD.B(fVar, 1);
                            i11 |= 2;
                        } else if (iD == 2) {
                            zH4 = cVarD.H(fVar, 2);
                            i11 |= 4;
                        } else if (iD == 3) {
                            zH3 = cVarD.H(fVar, 3);
                            i11 |= 8;
                        } else {
                            if (iD != 4) {
                                throw new e0(iD);
                            }
                            selectPurpose2 = (SelectPurpose) cVarD.i(fVar, 4, (hv.b) nVarArr[4].getValue(), selectPurpose2);
                            i11 |= 16;
                        }
                    }
                    z10 = zH3;
                    z11 = zH4;
                    i10 = i11;
                    str = strB3;
                    str2 = strB4;
                    selectPurpose = selectPurpose2;
                }
                cVarD.b(fVar);
                return new ColorSchemeManagerRoute(i10, str, str2, z11, z10, selectPurpose, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ColorSchemeManagerRoute colorSchemeManagerRoute) {
                t.f(fVar, "encoder");
                t.f(colorSchemeManagerRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ColorSchemeManagerRoute.write$Self$Termius_app_googleProductionRelease(colorSchemeManagerRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                n[] nVarArr = ColorSchemeManagerRoute.$childSerializers;
                x2 x2Var = x2.f64817a;
                i iVar = i.f64704a;
                return new hv.c[]{x2Var, x2Var, iVar, iVar, nVarArr[4].getValue()};
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
                return a.f32868a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ColorSchemeManagerRoute createFromParcel(Parcel parcel) {
                boolean z10;
                t.f(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                return new ColorSchemeManagerRoute(string, string2, z11, parcel.readInt() == 0 ? z10 : true, SelectPurpose.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ColorSchemeManagerRoute[] newArray(int i10) {
                return new ColorSchemeManagerRoute[i10];
            }
        }

        public /* synthetic */ ColorSchemeManagerRoute(int i10, String str, String str2, boolean z10, boolean z11, SelectPurpose selectPurpose, s2 s2Var) {
            if (31 != (i10 & 31)) {
                d2.a(i10, 31, a.f32868a.getDescriptor());
            }
            this.initialColorScheme = str;
            this.defaultColorScheme = str2;
            this.isSettingsMode = z10;
            this.isInGroupEditor = z11;
            this.selectPurpose = selectPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SelectPurpose.Companion.serializer();
        }

        public static /* synthetic */ ColorSchemeManagerRoute copy$default(ColorSchemeManagerRoute colorSchemeManagerRoute, String str, String str2, boolean z10, boolean z11, SelectPurpose selectPurpose, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = colorSchemeManagerRoute.initialColorScheme;
            }
            if ((i10 & 2) != 0) {
                str2 = colorSchemeManagerRoute.defaultColorScheme;
            }
            if ((i10 & 4) != 0) {
                z10 = colorSchemeManagerRoute.isSettingsMode;
            }
            if ((i10 & 8) != 0) {
                z11 = colorSchemeManagerRoute.isInGroupEditor;
            }
            if ((i10 & 16) != 0) {
                selectPurpose = colorSchemeManagerRoute.selectPurpose;
            }
            SelectPurpose selectPurpose2 = selectPurpose;
            boolean z12 = z10;
            return colorSchemeManagerRoute.copy(str, str2, z12, z11, selectPurpose2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ColorSchemeManagerRoute colorSchemeManagerRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.f(fVar, 0, colorSchemeManagerRoute.initialColorScheme);
            dVar.f(fVar, 1, colorSchemeManagerRoute.defaultColorScheme);
            dVar.u(fVar, 2, colorSchemeManagerRoute.isSettingsMode);
            dVar.u(fVar, 3, colorSchemeManagerRoute.isInGroupEditor);
            dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), colorSchemeManagerRoute.selectPurpose);
        }

        public final String component1() {
            return this.initialColorScheme;
        }

        public final String component2() {
            return this.defaultColorScheme;
        }

        public final boolean component3() {
            return this.isSettingsMode;
        }

        public final boolean component4() {
            return this.isInGroupEditor;
        }

        public final SelectPurpose component5() {
            return this.selectPurpose;
        }

        public final ColorSchemeManagerRoute copy(String str, String str2, boolean z10, boolean z11, SelectPurpose selectPurpose) {
            t.f(str, "initialColorScheme");
            t.f(str2, "defaultColorScheme");
            t.f(selectPurpose, "selectPurpose");
            return new ColorSchemeManagerRoute(str, str2, z10, z11, selectPurpose);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorSchemeManagerRoute)) {
                return false;
            }
            ColorSchemeManagerRoute colorSchemeManagerRoute = (ColorSchemeManagerRoute) obj;
            return t.b(this.initialColorScheme, colorSchemeManagerRoute.initialColorScheme) && t.b(this.defaultColorScheme, colorSchemeManagerRoute.defaultColorScheme) && this.isSettingsMode == colorSchemeManagerRoute.isSettingsMode && this.isInGroupEditor == colorSchemeManagerRoute.isInGroupEditor && this.selectPurpose == colorSchemeManagerRoute.selectPurpose;
        }

        public final String getDefaultColorScheme() {
            return this.defaultColorScheme;
        }

        public final String getInitialColorScheme() {
            return this.initialColorScheme;
        }

        public final SelectPurpose getSelectPurpose() {
            return this.selectPurpose;
        }

        public int hashCode() {
            return (((((((this.initialColorScheme.hashCode() * 31) + this.defaultColorScheme.hashCode()) * 31) + Boolean.hashCode(this.isSettingsMode)) * 31) + Boolean.hashCode(this.isInGroupEditor)) * 31) + this.selectPurpose.hashCode();
        }

        public final boolean isInGroupEditor() {
            return this.isInGroupEditor;
        }

        public final boolean isSettingsMode() {
            return this.isSettingsMode;
        }

        public String toString() {
            return "ColorSchemeManagerRoute(initialColorScheme=" + this.initialColorScheme + ", defaultColorScheme=" + this.defaultColorScheme + ", isSettingsMode=" + this.isSettingsMode + ", isInGroupEditor=" + this.isInGroupEditor + ", selectPurpose=" + this.selectPurpose + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.initialColorScheme);
            parcel.writeString(this.defaultColorScheme);
            parcel.writeInt(this.isSettingsMode ? 1 : 0);
            parcel.writeInt(this.isInGroupEditor ? 1 : 0);
            parcel.writeString(this.selectPurpose.name());
        }

        public ColorSchemeManagerRoute(String str, String str2, boolean z10, boolean z11, SelectPurpose selectPurpose) {
            t.f(str, "initialColorScheme");
            t.f(str2, "defaultColorScheme");
            t.f(selectPurpose, "selectPurpose");
            this.initialColorScheme = str;
            this.defaultColorScheme = str2;
            this.isSettingsMode = z10;
            this.isInGroupEditor = z11;
            this.selectPurpose = selectPurpose;
        }
    }

    @p
    @Keep
    public static final class EditGroupRoute implements HostsNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32870id;
        private final Long initialGroupId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditGroupRoute> CREATOR = new c();
        public static final int $stable = 8;

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f32871a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditGroupRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditGroupRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditGroupRoute[] newArray(int i10) {
                return new EditGroupRoute[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EditGroupRoute() {
            this((Long) null, (Long) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ EditGroupRoute copy$default(EditGroupRoute editGroupRoute, Long l10, Long l11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editGroupRoute.f32870id;
            }
            if ((i10 & 2) != 0) {
                l11 = editGroupRoute.initialGroupId;
            }
            return editGroupRoute.copy(l10, l11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditGroupRoute editGroupRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editGroupRoute.f32870id != null) {
                dVar.v(fVar, 0, h1.f64699a, editGroupRoute.f32870id);
            }
            if (!dVar.E(fVar, 1) && editGroupRoute.initialGroupId == null) {
                return;
            }
            dVar.v(fVar, 1, h1.f64699a, editGroupRoute.initialGroupId);
        }

        public final Long component1() {
            return this.f32870id;
        }

        public final Long component2() {
            return this.initialGroupId;
        }

        public final EditGroupRoute copy(Long l10, Long l11) {
            return new EditGroupRoute(l10, l11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditGroupRoute)) {
                return false;
            }
            EditGroupRoute editGroupRoute = (EditGroupRoute) obj;
            return t.b(this.f32870id, editGroupRoute.f32870id) && t.b(this.initialGroupId, editGroupRoute.initialGroupId);
        }

        public final Long getId() {
            return this.f32870id;
        }

        public final Long getInitialGroupId() {
            return this.initialGroupId;
        }

        public int hashCode() {
            Long l10 = this.f32870id;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.initialGroupId;
            return iHashCode + (l11 != null ? l11.hashCode() : 0);
        }

        public String toString() {
            return "EditGroupRoute(id=" + this.f32870id + ", initialGroupId=" + this.initialGroupId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32870id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            Long l11 = this.initialGroupId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
        }

        public /* synthetic */ EditGroupRoute(int i10, Long l10, Long l11, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.f32870id = null;
            } else {
                this.f32870id = l10;
            }
            if ((i10 & 2) == 0) {
                this.initialGroupId = null;
            } else {
                this.initialGroupId = l11;
            }
        }

        public EditGroupRoute(Long l10, Long l11) {
            this.f32870id = l10;
            this.initialGroupId = l11;
        }

        public /* synthetic */ EditGroupRoute(Long l10, Long l11, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11);
        }
    }

    @p
    @Keep
    public static final class EditHostRoute implements HostsNavGraphRoute {
        public static final int $stable = 0;
        private final HostCreationOriginVariant hostCreationOriginVariant;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32873id;
        private final Long initialGroupId;
        private final String initialHostPort;
        private final NsdSearchResultWrapper nsdSearchResult;
        private final boolean startConnection;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditHostRoute> CREATOR = new c();
        private static final n[] $childSerializers = {null, null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: ik.h
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.EditHostRoute._childSerializers$_anonymous_();
            }
        })};
        private static final Map<l, x1> typeMap = s0.k(NsdSearchResultWrapper.Companion.a(), b0.a(ju.n0.j(HostCreationOriginVariant.class), new d(false, mv.b.f65981d)));

        public static final class b {
            public /* synthetic */ b(k kVar) {
                this();
            }

            public final Map a() {
                return EditHostRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32874a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditHostRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditHostRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), (NsdSearchResultWrapper) parcel.readParcelable(EditHostRoute.class.getClassLoader()), parcel.readInt() != 0, HostCreationOriginVariant.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditHostRoute[] newArray(int i10) {
                return new EditHostRoute[i10];
            }
        }

        public static final class d extends x1 {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mv.b f32876t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z10, mv.b bVar) {
                super(z10);
                this.f32876t = bVar;
            }

            @Override // androidx.navigation.x1
            public Object a(Bundle bundle, String str) {
                t.f(bundle, "bundle");
                t.f(str, SerializableEvent.KEY_FIELD);
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                mv.b bVar = this.f32876t;
                bVar.a();
                return bVar.b(new i0("com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant", HostCreationOriginVariant.values()), string);
            }

            @Override // androidx.navigation.x1
            /* JADX INFO: renamed from: f */
            public Object l(String str) {
                t.f(str, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f32876t;
                bVar.a();
                return bVar.b(new i0("com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant", HostCreationOriginVariant.values()), str);
            }

            @Override // androidx.navigation.x1
            public void h(Bundle bundle, String str, Object obj) {
                t.f(bundle, "bundle");
                t.f(str, SerializableEvent.KEY_FIELD);
                t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f32876t;
                bVar.a();
                bundle.putString(str, bVar.c(new i0("com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant", HostCreationOriginVariant.values()), obj));
            }

            @Override // androidx.navigation.x1
            public String i(Object obj) {
                t.f(obj, SerializableEvent.VALUE_FIELD);
                mv.b bVar = this.f32876t;
                bVar.a();
                String strEncode = Uri.encode(bVar.c(new i0("com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant", HostCreationOriginVariant.values()), obj));
                t.e(strEncode, "encode(...)");
                return strEncode;
            }
        }

        public EditHostRoute() {
            this((Long) null, (Long) null, (String) null, (NsdSearchResultWrapper) null, false, (HostCreationOriginVariant) null, 63, (k) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return j0.b("com.server.auditor.ssh.client.utils.analytics.HostCreationOriginVariant", HostCreationOriginVariant.values());
        }

        public static /* synthetic */ EditHostRoute copy$default(EditHostRoute editHostRoute, Long l10, Long l11, String str, NsdSearchResultWrapper nsdSearchResultWrapper, boolean z10, HostCreationOriginVariant hostCreationOriginVariant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editHostRoute.f32873id;
            }
            if ((i10 & 2) != 0) {
                l11 = editHostRoute.initialGroupId;
            }
            if ((i10 & 4) != 0) {
                str = editHostRoute.initialHostPort;
            }
            if ((i10 & 8) != 0) {
                nsdSearchResultWrapper = editHostRoute.nsdSearchResult;
            }
            if ((i10 & 16) != 0) {
                z10 = editHostRoute.startConnection;
            }
            if ((i10 & 32) != 0) {
                hostCreationOriginVariant = editHostRoute.hostCreationOriginVariant;
            }
            boolean z11 = z10;
            HostCreationOriginVariant hostCreationOriginVariant2 = hostCreationOriginVariant;
            return editHostRoute.copy(l10, l11, str, nsdSearchResultWrapper, z11, hostCreationOriginVariant2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditHostRoute editHostRoute, kv.d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            if (dVar.E(fVar, 0) || editHostRoute.f32873id != null) {
                dVar.v(fVar, 0, h1.f64699a, editHostRoute.f32873id);
            }
            int i10 = 1;
            if (dVar.E(fVar, 1) || editHostRoute.initialGroupId != null) {
                dVar.v(fVar, 1, h1.f64699a, editHostRoute.initialGroupId);
            }
            if (dVar.E(fVar, 2) || editHostRoute.initialHostPort != null) {
                dVar.v(fVar, 2, x2.f64817a, editHostRoute.initialHostPort);
            }
            if (dVar.E(fVar, 3) || !t.b(editHostRoute.nsdSearchResult, new NsdSearchResultWrapper((NsdSearchResult) null, i10, (k) (0 == true ? 1 : 0)))) {
                dVar.o(fVar, 3, NsdSearchResultWrapper.a.f30828a, editHostRoute.nsdSearchResult);
            }
            if (dVar.E(fVar, 4) || editHostRoute.startConnection) {
                dVar.u(fVar, 4, editHostRoute.startConnection);
            }
            if (!dVar.E(fVar, 5) && editHostRoute.hostCreationOriginVariant == HostCreationOriginVariant.HOSTS_SCREEN) {
                return;
            }
            dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), editHostRoute.hostCreationOriginVariant);
        }

        public final Long component1() {
            return this.f32873id;
        }

        public final Long component2() {
            return this.initialGroupId;
        }

        public final String component3() {
            return this.initialHostPort;
        }

        public final NsdSearchResultWrapper component4() {
            return this.nsdSearchResult;
        }

        public final boolean component5() {
            return this.startConnection;
        }

        public final HostCreationOriginVariant component6() {
            return this.hostCreationOriginVariant;
        }

        public final EditHostRoute copy(Long l10, Long l11, String str, NsdSearchResultWrapper nsdSearchResultWrapper, boolean z10, HostCreationOriginVariant hostCreationOriginVariant) {
            t.f(nsdSearchResultWrapper, "nsdSearchResult");
            t.f(hostCreationOriginVariant, "hostCreationOriginVariant");
            return new EditHostRoute(l10, l11, str, nsdSearchResultWrapper, z10, hostCreationOriginVariant);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditHostRoute)) {
                return false;
            }
            EditHostRoute editHostRoute = (EditHostRoute) obj;
            return t.b(this.f32873id, editHostRoute.f32873id) && t.b(this.initialGroupId, editHostRoute.initialGroupId) && t.b(this.initialHostPort, editHostRoute.initialHostPort) && t.b(this.nsdSearchResult, editHostRoute.nsdSearchResult) && this.startConnection == editHostRoute.startConnection && this.hostCreationOriginVariant == editHostRoute.hostCreationOriginVariant;
        }

        public final HostCreationOriginVariant getHostCreationOriginVariant() {
            return this.hostCreationOriginVariant;
        }

        public final Long getId() {
            return this.f32873id;
        }

        public final Long getInitialGroupId() {
            return this.initialGroupId;
        }

        public final String getInitialHostPort() {
            return this.initialHostPort;
        }

        public final NsdSearchResultWrapper getNsdSearchResult() {
            return this.nsdSearchResult;
        }

        public final boolean getStartConnection() {
            return this.startConnection;
        }

        public int hashCode() {
            Long l10 = this.f32873id;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.initialGroupId;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.initialHostPort;
            return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.nsdSearchResult.hashCode()) * 31) + Boolean.hashCode(this.startConnection)) * 31) + this.hostCreationOriginVariant.hashCode();
        }

        public String toString() {
            return "EditHostRoute(id=" + this.f32873id + ", initialGroupId=" + this.initialGroupId + ", initialHostPort=" + this.initialHostPort + ", nsdSearchResult=" + this.nsdSearchResult + ", startConnection=" + this.startConnection + ", hostCreationOriginVariant=" + this.hostCreationOriginVariant + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32873id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            Long l11 = this.initialGroupId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.initialHostPort);
            parcel.writeParcelable(this.nsdSearchResult, i10);
            parcel.writeInt(this.startConnection ? 1 : 0);
            parcel.writeString(this.hostCreationOriginVariant.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ EditHostRoute(int i10, Long l10, Long l11, String str, NsdSearchResultWrapper nsdSearchResultWrapper, boolean z10, HostCreationOriginVariant hostCreationOriginVariant, s2 s2Var) {
            NsdSearchResult nsdSearchResult = null;
            Object[] objArr = 0;
            if ((i10 & 1) == 0) {
                this.f32873id = null;
            } else {
                this.f32873id = l10;
            }
            if ((i10 & 2) == 0) {
                this.initialGroupId = null;
            } else {
                this.initialGroupId = l11;
            }
            if ((i10 & 4) == 0) {
                this.initialHostPort = null;
            } else {
                this.initialHostPort = str;
            }
            if ((i10 & 8) == 0) {
                this.nsdSearchResult = new NsdSearchResultWrapper(nsdSearchResult, 1, (k) (objArr == true ? 1 : 0));
            } else {
                this.nsdSearchResult = nsdSearchResultWrapper;
            }
            if ((i10 & 16) == 0) {
                this.startConnection = false;
            } else {
                this.startConnection = z10;
            }
            if ((i10 & 32) == 0) {
                this.hostCreationOriginVariant = HostCreationOriginVariant.HOSTS_SCREEN;
            } else {
                this.hostCreationOriginVariant = hostCreationOriginVariant;
            }
        }

        public EditHostRoute(Long l10, Long l11, String str, NsdSearchResultWrapper nsdSearchResultWrapper, boolean z10, HostCreationOriginVariant hostCreationOriginVariant) {
            t.f(nsdSearchResultWrapper, "nsdSearchResult");
            t.f(hostCreationOriginVariant, "hostCreationOriginVariant");
            this.f32873id = l10;
            this.initialGroupId = l11;
            this.initialHostPort = str;
            this.nsdSearchResult = nsdSearchResultWrapper;
            this.startConnection = z10;
            this.hostCreationOriginVariant = hostCreationOriginVariant;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ EditHostRoute(Long l10, Long l11, String str, NsdSearchResultWrapper nsdSearchResultWrapper, boolean z10, HostCreationOriginVariant hostCreationOriginVariant, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? new NsdSearchResultWrapper((NsdSearchResult) null, 1, (k) (0 == true ? 1 : 0)) : nsdSearchResultWrapper, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? HostCreationOriginVariant.HOSTS_SCREEN : hostCreationOriginVariant);
        }
    }

    @p
    @Keep
    public static final class EditLocalHostRoute implements HostsNavGraphRoute {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final Long f32877id;
        private final Long initialGroupId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditLocalHostRoute> CREATOR = new c();
        public static final int $stable = 8;

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f32878a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditLocalHostRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditLocalHostRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditLocalHostRoute[] newArray(int i10) {
                return new EditLocalHostRoute[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EditLocalHostRoute() {
            this((Long) null, (Long) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ EditLocalHostRoute copy$default(EditLocalHostRoute editLocalHostRoute, Long l10, Long l11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = editLocalHostRoute.f32877id;
            }
            if ((i10 & 2) != 0) {
                l11 = editLocalHostRoute.initialGroupId;
            }
            return editLocalHostRoute.copy(l10, l11);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditLocalHostRoute editLocalHostRoute, d dVar, f fVar) {
            if (dVar.E(fVar, 0) || editLocalHostRoute.f32877id != null) {
                dVar.v(fVar, 0, h1.f64699a, editLocalHostRoute.f32877id);
            }
            if (!dVar.E(fVar, 1) && editLocalHostRoute.initialGroupId == null) {
                return;
            }
            dVar.v(fVar, 1, h1.f64699a, editLocalHostRoute.initialGroupId);
        }

        public final Long component1() {
            return this.f32877id;
        }

        public final Long component2() {
            return this.initialGroupId;
        }

        public final EditLocalHostRoute copy(Long l10, Long l11) {
            return new EditLocalHostRoute(l10, l11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditLocalHostRoute)) {
                return false;
            }
            EditLocalHostRoute editLocalHostRoute = (EditLocalHostRoute) obj;
            return t.b(this.f32877id, editLocalHostRoute.f32877id) && t.b(this.initialGroupId, editLocalHostRoute.initialGroupId);
        }

        public final Long getId() {
            return this.f32877id;
        }

        public final Long getInitialGroupId() {
            return this.initialGroupId;
        }

        public int hashCode() {
            Long l10 = this.f32877id;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.initialGroupId;
            return iHashCode + (l11 != null ? l11.hashCode() : 0);
        }

        public String toString() {
            return "EditLocalHostRoute(id=" + this.f32877id + ", initialGroupId=" + this.initialGroupId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.f32877id;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            Long l11 = this.initialGroupId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
        }

        public /* synthetic */ EditLocalHostRoute(int i10, Long l10, Long l11, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.f32877id = null;
            } else {
                this.f32877id = l10;
            }
            if ((i10 & 2) == 0) {
                this.initialGroupId = null;
            } else {
                this.initialGroupId = l11;
            }
        }

        public EditLocalHostRoute(Long l10, Long l11) {
            this.f32877id = l10;
            this.initialGroupId = l11;
        }

        public /* synthetic */ EditLocalHostRoute(Long l10, Long l11, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11);
        }
    }

    @p
    @Keep
    public static final class GroupSelectRoute implements HostsNavGraphRoute {
        private final Long groupIdToFilterInSelector;
        private final boolean isFromEditor;
        private final VaultKeyIdSpecification vaultKeyIdSpecification;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<GroupSelectRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: ik.i
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.GroupSelectRoute._childSerializers$_anonymous_();
            }
        }), null};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyIdSpecification.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32881b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32880a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.GroupSelectRoute", aVar, 3);
                i2Var.r("groupIdToFilterInSelector", false);
                i2Var.r("vaultKeyIdSpecification", false);
                i2Var.r("isFromEditor", false);
                descriptor = i2Var;
                f32881b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GroupSelectRoute deserialize(e eVar) {
                boolean zH;
                int i10;
                Long l10;
                VaultKeyIdSpecification vaultKeyIdSpecification;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = GroupSelectRoute.$childSerializers;
                if (cVarD.l()) {
                    Long l11 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
                    vaultKeyIdSpecification = (VaultKeyIdSpecification) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    l10 = l11;
                    zH = cVarD.H(fVar, 2);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    boolean zH2 = false;
                    Long l12 = null;
                    VaultKeyIdSpecification vaultKeyIdSpecification2 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            l12 = (Long) cVarD.v(fVar, 0, h1.f64699a, l12);
                            i11 |= 1;
                        } else if (iD == 1) {
                            vaultKeyIdSpecification2 = (VaultKeyIdSpecification) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), vaultKeyIdSpecification2);
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
                    vaultKeyIdSpecification = vaultKeyIdSpecification2;
                }
                cVarD.b(fVar);
                return new GroupSelectRoute(i10, l10, vaultKeyIdSpecification, zH, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, GroupSelectRoute groupSelectRoute) {
                t.f(fVar, "encoder");
                t.f(groupSelectRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                GroupSelectRoute.write$Self$Termius_app_googleProductionRelease(groupSelectRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{iv.a.u(h1.f64699a), GroupSelectRoute.$childSerializers[1].getValue(), i.f64704a};
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
                return GroupSelectRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32880a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GroupSelectRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new GroupSelectRoute(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (VaultKeyIdSpecification) parcel.readParcelable(GroupSelectRoute.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GroupSelectRoute[] newArray(int i10) {
                return new GroupSelectRoute[i10];
            }
        }

        public /* synthetic */ GroupSelectRoute(int i10, Long l10, VaultKeyIdSpecification vaultKeyIdSpecification, boolean z10, s2 s2Var) {
            if (7 != (i10 & 7)) {
                d2.a(i10, 7, a.f32880a.getDescriptor());
            }
            this.groupIdToFilterInSelector = l10;
            this.vaultKeyIdSpecification = vaultKeyIdSpecification;
            this.isFromEditor = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return VaultKeyIdSpecification.Companion.serializer();
        }

        public static /* synthetic */ GroupSelectRoute copy$default(GroupSelectRoute groupSelectRoute, Long l10, VaultKeyIdSpecification vaultKeyIdSpecification, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = groupSelectRoute.groupIdToFilterInSelector;
            }
            if ((i10 & 2) != 0) {
                vaultKeyIdSpecification = groupSelectRoute.vaultKeyIdSpecification;
            }
            if ((i10 & 4) != 0) {
                z10 = groupSelectRoute.isFromEditor;
            }
            return groupSelectRoute.copy(l10, vaultKeyIdSpecification, z10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GroupSelectRoute groupSelectRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.v(fVar, 0, h1.f64699a, groupSelectRoute.groupIdToFilterInSelector);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), groupSelectRoute.vaultKeyIdSpecification);
            dVar.u(fVar, 2, groupSelectRoute.isFromEditor);
        }

        public final Long component1() {
            return this.groupIdToFilterInSelector;
        }

        public final VaultKeyIdSpecification component2() {
            return this.vaultKeyIdSpecification;
        }

        public final boolean component3() {
            return this.isFromEditor;
        }

        public final GroupSelectRoute copy(Long l10, VaultKeyIdSpecification vaultKeyIdSpecification, boolean z10) {
            t.f(vaultKeyIdSpecification, "vaultKeyIdSpecification");
            return new GroupSelectRoute(l10, vaultKeyIdSpecification, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupSelectRoute)) {
                return false;
            }
            GroupSelectRoute groupSelectRoute = (GroupSelectRoute) obj;
            return t.b(this.groupIdToFilterInSelector, groupSelectRoute.groupIdToFilterInSelector) && t.b(this.vaultKeyIdSpecification, groupSelectRoute.vaultKeyIdSpecification) && this.isFromEditor == groupSelectRoute.isFromEditor;
        }

        public final Long getGroupIdToFilterInSelector() {
            return this.groupIdToFilterInSelector;
        }

        public final VaultKeyIdSpecification getVaultKeyIdSpecification() {
            return this.vaultKeyIdSpecification;
        }

        public int hashCode() {
            Long l10 = this.groupIdToFilterInSelector;
            return ((((l10 == null ? 0 : l10.hashCode()) * 31) + this.vaultKeyIdSpecification.hashCode()) * 31) + Boolean.hashCode(this.isFromEditor);
        }

        public final boolean isFromEditor() {
            return this.isFromEditor;
        }

        public String toString() {
            return "GroupSelectRoute(groupIdToFilterInSelector=" + this.groupIdToFilterInSelector + ", vaultKeyIdSpecification=" + this.vaultKeyIdSpecification + ", isFromEditor=" + this.isFromEditor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            Long l10 = this.groupIdToFilterInSelector;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeParcelable(this.vaultKeyIdSpecification, i10);
            parcel.writeInt(this.isFromEditor ? 1 : 0);
        }

        public GroupSelectRoute(Long l10, VaultKeyIdSpecification vaultKeyIdSpecification, boolean z10) {
            t.f(vaultKeyIdSpecification, "vaultKeyIdSpecification");
            this.groupIdToFilterInSelector = l10;
            this.vaultKeyIdSpecification = vaultKeyIdSpecification;
            this.isFromEditor = z10;
        }
    }

    @p
    @Keep
    public static final class HostsRoute implements HostsNavGraphRoute, NavigationRailsRoute {
        public static final HostsRoute INSTANCE = new HostsRoute();
        public static final Parcelable.Creator<HostsRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.j
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.HostsRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HostsRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return HostsRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final HostsRoute[] newArray(int i10) {
                return new HostsRoute[i10];
            }
        }

        private HostsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.HostsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HostsRoute);
        }

        public int hashCode() {
            return -1485870390;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "HostsRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class IdentitySelectRoute implements HostsNavGraphRoute {
        private final SelectPurpose purpose;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<IdentitySelectRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: ik.k
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.IdentitySelectRoute._childSerializers$_anonymous_();
            }
        })};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32883b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32882a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.IdentitySelectRoute", aVar, 2);
                i2Var.r("targetVaultKeyId", false);
                i2Var.r("purpose", false);
                descriptor = i2Var;
                f32883b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdentitySelectRoute deserialize(e eVar) {
                SelectPurpose selectPurpose;
                VaultKeyId vaultKeyId;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = IdentitySelectRoute.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 0, VaultKeyId.a.f41418a, null);
                    selectPurpose = (SelectPurpose) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    SelectPurpose selectPurpose2 = null;
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
                            selectPurpose2 = (SelectPurpose) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), selectPurpose2);
                            i11 |= 2;
                        }
                    }
                    selectPurpose = selectPurpose2;
                    vaultKeyId = vaultKeyId2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new IdentitySelectRoute(i10, vaultKeyId, selectPurpose, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, IdentitySelectRoute identitySelectRoute) {
                t.f(fVar, "encoder");
                t.f(identitySelectRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                IdentitySelectRoute.write$Self$Termius_app_googleProductionRelease(identitySelectRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{VaultKeyId.a.f41418a, IdentitySelectRoute.$childSerializers[1].getValue()};
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
                return IdentitySelectRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32882a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdentitySelectRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new IdentitySelectRoute((VaultKeyId) parcel.readParcelable(IdentitySelectRoute.class.getClassLoader()), SelectPurpose.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdentitySelectRoute[] newArray(int i10) {
                return new IdentitySelectRoute[i10];
            }
        }

        public /* synthetic */ IdentitySelectRoute(int i10, VaultKeyId vaultKeyId, SelectPurpose selectPurpose, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32882a.getDescriptor());
            }
            this.targetVaultKeyId = vaultKeyId;
            this.purpose = selectPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SelectPurpose.Companion.serializer();
        }

        public static /* synthetic */ IdentitySelectRoute copy$default(IdentitySelectRoute identitySelectRoute, VaultKeyId vaultKeyId, SelectPurpose selectPurpose, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vaultKeyId = identitySelectRoute.targetVaultKeyId;
            }
            if ((i10 & 2) != 0) {
                selectPurpose = identitySelectRoute.purpose;
            }
            return identitySelectRoute.copy(vaultKeyId, selectPurpose);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IdentitySelectRoute identitySelectRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, VaultKeyId.a.f41418a, identitySelectRoute.targetVaultKeyId);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), identitySelectRoute.purpose);
        }

        public final VaultKeyId component1() {
            return this.targetVaultKeyId;
        }

        public final SelectPurpose component2() {
            return this.purpose;
        }

        public final IdentitySelectRoute copy(VaultKeyId vaultKeyId, SelectPurpose selectPurpose) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(selectPurpose, "purpose");
            return new IdentitySelectRoute(vaultKeyId, selectPurpose);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentitySelectRoute)) {
                return false;
            }
            IdentitySelectRoute identitySelectRoute = (IdentitySelectRoute) obj;
            return t.b(this.targetVaultKeyId, identitySelectRoute.targetVaultKeyId) && this.purpose == identitySelectRoute.purpose;
        }

        public final SelectPurpose getPurpose() {
            return this.purpose;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (this.targetVaultKeyId.hashCode() * 31) + this.purpose.hashCode();
        }

        public String toString() {
            return "IdentitySelectRoute(targetVaultKeyId=" + this.targetVaultKeyId + ", purpose=" + this.purpose + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.targetVaultKeyId, i10);
            parcel.writeString(this.purpose.name());
        }

        public IdentitySelectRoute(VaultKeyId vaultKeyId, SelectPurpose selectPurpose) {
            t.f(vaultKeyId, "targetVaultKeyId");
            t.f(selectPurpose, "purpose");
            this.targetVaultKeyId = vaultKeyId;
            this.purpose = selectPurpose;
        }
    }

    @p
    @Keep
    public static final class NsdSearchRoute implements HostsNavGraphRoute {
        public static final NsdSearchRoute INSTANCE = new NsdSearchRoute();
        public static final Parcelable.Creator<NsdSearchRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.l
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.NsdSearchRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NsdSearchRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return NsdSearchRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NsdSearchRoute[] newArray(int i10) {
                return new NsdSearchRoute[i10];
            }
        }

        private NsdSearchRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.NsdSearchRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NsdSearchRoute);
        }

        public int hashCode() {
            return 1464078414;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NsdSearchRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class TagSelectRoute implements HostsNavGraphRoute {
        private final List<Long> chosenTagIds;
        private final VaultKeyId targetVaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<TagSelectRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: ik.m
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.TagSelectRoute._childSerializers$_anonymous_();
            }
        }), null};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32887b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32886a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.TagSelectRoute", aVar, 2);
                i2Var.r("chosenTagIds", false);
                i2Var.r("targetVaultKeyId", false);
                descriptor = i2Var;
                f32887b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TagSelectRoute deserialize(e eVar) {
                List list;
                VaultKeyId vaultKeyId;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = TagSelectRoute.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    list = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
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
                            list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list2);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId2);
                            i11 |= 2;
                        }
                    }
                    list = list2;
                    vaultKeyId = vaultKeyId2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new TagSelectRoute(i10, list, vaultKeyId, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, TagSelectRoute tagSelectRoute) {
                t.f(fVar, "encoder");
                t.f(tagSelectRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                TagSelectRoute.write$Self$Termius_app_googleProductionRelease(tagSelectRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{TagSelectRoute.$childSerializers[0].getValue(), VaultKeyId.a.f41418a};
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
                return TagSelectRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32886a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TagSelectRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new TagSelectRoute(arrayList, (VaultKeyId) parcel.readParcelable(TagSelectRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TagSelectRoute[] newArray(int i10) {
                return new TagSelectRoute[i10];
            }
        }

        public /* synthetic */ TagSelectRoute(int i10, List list, VaultKeyId vaultKeyId, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f32886a.getDescriptor());
            }
            this.chosenTagIds = list;
            this.targetVaultKeyId = vaultKeyId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TagSelectRoute copy$default(TagSelectRoute tagSelectRoute, List list, VaultKeyId vaultKeyId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = tagSelectRoute.chosenTagIds;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = tagSelectRoute.targetVaultKeyId;
            }
            return tagSelectRoute.copy(list, vaultKeyId);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TagSelectRoute tagSelectRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), tagSelectRoute.chosenTagIds);
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, tagSelectRoute.targetVaultKeyId);
        }

        public final List<Long> component1() {
            return this.chosenTagIds;
        }

        public final VaultKeyId component2() {
            return this.targetVaultKeyId;
        }

        public final TagSelectRoute copy(List<Long> list, VaultKeyId vaultKeyId) {
            t.f(list, "chosenTagIds");
            t.f(vaultKeyId, "targetVaultKeyId");
            return new TagSelectRoute(list, vaultKeyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagSelectRoute)) {
                return false;
            }
            TagSelectRoute tagSelectRoute = (TagSelectRoute) obj;
            return t.b(this.chosenTagIds, tagSelectRoute.chosenTagIds) && t.b(this.targetVaultKeyId, tagSelectRoute.targetVaultKeyId);
        }

        public final List<Long> getChosenTagIds() {
            return this.chosenTagIds;
        }

        public final VaultKeyId getTargetVaultKeyId() {
            return this.targetVaultKeyId;
        }

        public int hashCode() {
            return (this.chosenTagIds.hashCode() * 31) + this.targetVaultKeyId.hashCode();
        }

        public String toString() {
            return "TagSelectRoute(chosenTagIds=" + this.chosenTagIds + ", targetVaultKeyId=" + this.targetVaultKeyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            List<Long> list = this.chosenTagIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            parcel.writeParcelable(this.targetVaultKeyId, i10);
        }

        public TagSelectRoute(List<Long> list, VaultKeyId vaultKeyId) {
            t.f(list, "chosenTagIds");
            t.f(vaultKeyId, "targetVaultKeyId");
            this.chosenTagIds = list;
            this.targetVaultKeyId = vaultKeyId;
        }
    }

    @p
    @Keep
    public static final class ChainHostEditRoute implements HostsNavGraphRoute {
        private final List<Long> chainingHostIds;
        private final String chainingType;
        private final Long editedHostId;
        private final String finalHostForChain;
        private final Long sshConfigId;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ChainHostEditRoute> CREATOR = new c();
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: ik.e
            @Override // iu.a
            public final Object a() {
                return HostsNavGraphRoute.ChainHostEditRoute._childSerializers$_anonymous_();
            }
        }), null};
        private static final Map<l, x1> typeMap = s0.f(VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32863b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32862a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.ChainHostEditRoute", aVar, 6);
                i2Var.r("chainingType", false);
                i2Var.r("editedHostId", false);
                i2Var.r("finalHostForChain", false);
                i2Var.r("sshConfigId", false);
                i2Var.r("chainingHostIds", false);
                i2Var.r("vaultKeyId", true);
                descriptor = i2Var;
                f32863b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChainHostEditRoute deserialize(e eVar) {
                int i10;
                String str;
                Long l10;
                String str2;
                Long l11;
                List list;
                VaultKeyId vaultKeyId;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = ChainHostEditRoute.$childSerializers;
                String strB = null;
                if (cVarD.l()) {
                    String strB2 = cVarD.B(fVar, 0);
                    h1 h1Var = h1.f64699a;
                    Long l12 = (Long) cVarD.v(fVar, 1, h1Var, null);
                    String strB3 = cVarD.B(fVar, 2);
                    Long l13 = (Long) cVarD.v(fVar, 3, h1Var, null);
                    list = (List) cVarD.v(fVar, 4, (hv.b) nVarArr[4].getValue(), null);
                    str = strB2;
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 5, VaultKeyId.a.f41418a, null);
                    l11 = l13;
                    str2 = strB3;
                    i10 = 63;
                    l10 = l12;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Long l14 = null;
                    String strB4 = null;
                    Long l15 = null;
                    List list2 = null;
                    VaultKeyId vaultKeyId2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                strB = cVarD.B(fVar, 0);
                                i11 |= 1;
                                continue;
                            case 1:
                                l14 = (Long) cVarD.v(fVar, 1, h1.f64699a, l14);
                                i11 |= 2;
                                break;
                            case 2:
                                strB4 = cVarD.B(fVar, 2);
                                i11 |= 4;
                                break;
                            case 3:
                                l15 = (Long) cVarD.v(fVar, 3, h1.f64699a, l15);
                                i11 |= 8;
                                break;
                            case 4:
                                list2 = (List) cVarD.v(fVar, 4, (hv.b) nVarArr[4].getValue(), list2);
                                i11 |= 16;
                                break;
                            case 5:
                                vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 5, VaultKeyId.a.f41418a, vaultKeyId2);
                                i11 |= 32;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    i10 = i11;
                    str = strB;
                    l10 = l14;
                    str2 = strB4;
                    l11 = l15;
                    list = list2;
                    vaultKeyId = vaultKeyId2;
                }
                cVarD.b(fVar);
                return new ChainHostEditRoute(i10, str, l10, str2, l11, list, vaultKeyId, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ChainHostEditRoute chainHostEditRoute) {
                t.f(fVar, "encoder");
                t.f(chainHostEditRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ChainHostEditRoute.write$Self$Termius_app_googleProductionRelease(chainHostEditRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                n[] nVarArr = ChainHostEditRoute.$childSerializers;
                h1 h1Var = h1.f64699a;
                hv.c cVarU = iv.a.u(h1Var);
                hv.c cVarU2 = iv.a.u(h1Var);
                hv.c cVarU3 = iv.a.u((hv.c) nVarArr[4].getValue());
                x2 x2Var = x2.f64817a;
                return new hv.c[]{x2Var, cVarU, x2Var, cVarU2, cVarU3, VaultKeyId.a.f41418a};
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
                return ChainHostEditRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32862a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChainHostEditRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                String string = parcel.readString();
                ArrayList arrayList = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string2 = parcel.readString();
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    int i10 = parcel.readInt();
                    arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(Long.valueOf(parcel.readLong()));
                    }
                }
                return new ChainHostEditRoute(string, lValueOf, string2, lValueOf2, arrayList, (VaultKeyId) parcel.readParcelable(ChainHostEditRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChainHostEditRoute[] newArray(int i10) {
                return new ChainHostEditRoute[i10];
            }
        }

        public /* synthetic */ ChainHostEditRoute(int i10, String str, Long l10, String str2, Long l11, List list, VaultKeyId vaultKeyId, s2 s2Var) {
            if (31 != (i10 & 31)) {
                d2.a(i10, 31, a.f32862a.getDescriptor());
            }
            this.chainingType = str;
            this.editedHostId = l10;
            this.finalHostForChain = str2;
            this.sshConfigId = l11;
            this.chainingHostIds = list;
            if ((i10 & 32) == 0) {
                this.vaultKeyId = VaultKeyId.Companion.a();
            } else {
                this.vaultKeyId = vaultKeyId;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(h1.f64699a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChainHostEditRoute copy$default(ChainHostEditRoute chainHostEditRoute, String str, Long l10, String str2, Long l11, List list, VaultKeyId vaultKeyId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = chainHostEditRoute.chainingType;
            }
            if ((i10 & 2) != 0) {
                l10 = chainHostEditRoute.editedHostId;
            }
            if ((i10 & 4) != 0) {
                str2 = chainHostEditRoute.finalHostForChain;
            }
            if ((i10 & 8) != 0) {
                l11 = chainHostEditRoute.sshConfigId;
            }
            if ((i10 & 16) != 0) {
                list = chainHostEditRoute.chainingHostIds;
            }
            if ((i10 & 32) != 0) {
                vaultKeyId = chainHostEditRoute.vaultKeyId;
            }
            List list2 = list;
            VaultKeyId vaultKeyId2 = vaultKeyId;
            return chainHostEditRoute.copy(str, l10, str2, l11, list2, vaultKeyId2);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChainHostEditRoute chainHostEditRoute, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.f(fVar, 0, chainHostEditRoute.chainingType);
            h1 h1Var = h1.f64699a;
            dVar.v(fVar, 1, h1Var, chainHostEditRoute.editedHostId);
            dVar.f(fVar, 2, chainHostEditRoute.finalHostForChain);
            dVar.v(fVar, 3, h1Var, chainHostEditRoute.sshConfigId);
            dVar.v(fVar, 4, (hv.r) nVarArr[4].getValue(), chainHostEditRoute.chainingHostIds);
            if (!dVar.E(fVar, 5) && t.b(chainHostEditRoute.vaultKeyId, VaultKeyId.Companion.a())) {
                return;
            }
            dVar.o(fVar, 5, VaultKeyId.a.f41418a, chainHostEditRoute.vaultKeyId);
        }

        public final String component1() {
            return this.chainingType;
        }

        public final Long component2() {
            return this.editedHostId;
        }

        public final String component3() {
            return this.finalHostForChain;
        }

        public final Long component4() {
            return this.sshConfigId;
        }

        public final List<Long> component5() {
            return this.chainingHostIds;
        }

        public final VaultKeyId component6() {
            return this.vaultKeyId;
        }

        public final ChainHostEditRoute copy(String str, Long l10, String str2, Long l11, List<Long> list, VaultKeyId vaultKeyId) {
            t.f(str, "chainingType");
            t.f(str2, "finalHostForChain");
            t.f(vaultKeyId, "vaultKeyId");
            return new ChainHostEditRoute(str, l10, str2, l11, list, vaultKeyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChainHostEditRoute)) {
                return false;
            }
            ChainHostEditRoute chainHostEditRoute = (ChainHostEditRoute) obj;
            return t.b(this.chainingType, chainHostEditRoute.chainingType) && t.b(this.editedHostId, chainHostEditRoute.editedHostId) && t.b(this.finalHostForChain, chainHostEditRoute.finalHostForChain) && t.b(this.sshConfigId, chainHostEditRoute.sshConfigId) && t.b(this.chainingHostIds, chainHostEditRoute.chainingHostIds) && t.b(this.vaultKeyId, chainHostEditRoute.vaultKeyId);
        }

        public final List<Long> getChainingHostIds() {
            return this.chainingHostIds;
        }

        public final String getChainingType() {
            return this.chainingType;
        }

        public final Long getEditedHostId() {
            return this.editedHostId;
        }

        public final String getFinalHostForChain() {
            return this.finalHostForChain;
        }

        public final Long getSshConfigId() {
            return this.sshConfigId;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            int iHashCode = this.chainingType.hashCode() * 31;
            Long l10 = this.editedHostId;
            int iHashCode2 = (((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.finalHostForChain.hashCode()) * 31;
            Long l11 = this.sshConfigId;
            int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            List<Long> list = this.chainingHostIds;
            return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.vaultKeyId.hashCode();
        }

        public String toString() {
            return "ChainHostEditRoute(chainingType=" + this.chainingType + ", editedHostId=" + this.editedHostId + ", finalHostForChain=" + this.finalHostForChain + ", sshConfigId=" + this.sshConfigId + ", chainingHostIds=" + this.chainingHostIds + ", vaultKeyId=" + this.vaultKeyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.chainingType);
            Long l10 = this.editedHostId;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeString(this.finalHostForChain);
            Long l11 = this.sshConfigId;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            List<Long> list = this.chainingHostIds;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Long> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeLong(it.next().longValue());
                }
            }
            parcel.writeParcelable(this.vaultKeyId, i10);
        }

        public ChainHostEditRoute(String str, Long l10, String str2, Long l11, List<Long> list, VaultKeyId vaultKeyId) {
            t.f(str, "chainingType");
            t.f(str2, "finalHostForChain");
            t.f(vaultKeyId, "vaultKeyId");
            this.chainingType = str;
            this.editedHostId = l10;
            this.finalHostForChain = str2;
            this.sshConfigId = l11;
            this.chainingHostIds = list;
            this.vaultKeyId = vaultKeyId;
        }

        public /* synthetic */ ChainHostEditRoute(String str, Long l10, String str2, Long l11, List list, VaultKeyId vaultKeyId, int i10, k kVar) {
            this(str, l10, str2, l11, list, (i10 & 32) != 0 ? VaultKeyId.Companion.a() : vaultKeyId);
        }
    }

    @p
    @Keep
    public static final class ProxyEditRoute implements HostsNavGraphRoute {
        private final ProxyDataMediator proxy;
        private final VaultKeyId vaultKeyId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ProxyEditRoute> CREATOR = new c();
        public static final int $stable = VaultKeyId.$stable;
        private static final Map<l, x1> typeMap = s0.k(ProxyDataMediator.Companion.a(), VaultKeyId.Companion.c());

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32885b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32884a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute.ProxyEditRoute", aVar, 2);
                i2Var.r(Table.PROXY, false);
                i2Var.r("vaultKeyId", true);
                descriptor = i2Var;
                f32885b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProxyEditRoute deserialize(e eVar) {
                ProxyDataMediator proxyDataMediator;
                VaultKeyId vaultKeyId;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    proxyDataMediator = (ProxyDataMediator) cVarD.i(fVar, 0, ProxyDataMediator.a.f27936a, null);
                    vaultKeyId = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    proxyDataMediator = null;
                    VaultKeyId vaultKeyId2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            proxyDataMediator = (ProxyDataMediator) cVarD.i(fVar, 0, ProxyDataMediator.a.f27936a, proxyDataMediator);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            vaultKeyId2 = (VaultKeyId) cVarD.i(fVar, 1, VaultKeyId.a.f41418a, vaultKeyId2);
                            i11 |= 2;
                        }
                    }
                    vaultKeyId = vaultKeyId2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ProxyEditRoute(i10, proxyDataMediator, vaultKeyId, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ProxyEditRoute proxyEditRoute) {
                t.f(fVar, "encoder");
                t.f(proxyEditRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                ProxyEditRoute.write$Self$Termius_app_googleProductionRelease(proxyEditRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{ProxyDataMediator.a.f27936a, VaultKeyId.a.f41418a};
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
                return ProxyEditRoute.typeMap;
            }

            public final hv.c serializer() {
                return a.f32884a;
            }

            private b() {
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProxyEditRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new ProxyEditRoute((ProxyDataMediator) parcel.readParcelable(ProxyEditRoute.class.getClassLoader()), (VaultKeyId) parcel.readParcelable(ProxyEditRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProxyEditRoute[] newArray(int i10) {
                return new ProxyEditRoute[i10];
            }
        }

        public /* synthetic */ ProxyEditRoute(int i10, ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32884a.getDescriptor());
            }
            this.proxy = proxyDataMediator;
            if ((i10 & 2) == 0) {
                this.vaultKeyId = VaultKeyId.Companion.a();
            } else {
                this.vaultKeyId = vaultKeyId;
            }
        }

        public static /* synthetic */ ProxyEditRoute copy$default(ProxyEditRoute proxyEditRoute, ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                proxyDataMediator = proxyEditRoute.proxy;
            }
            if ((i10 & 2) != 0) {
                vaultKeyId = proxyEditRoute.vaultKeyId;
            }
            return proxyEditRoute.copy(proxyDataMediator, vaultKeyId);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProxyEditRoute proxyEditRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, ProxyDataMediator.a.f27936a, proxyEditRoute.proxy);
            if (!dVar.E(fVar, 1) && t.b(proxyEditRoute.vaultKeyId, VaultKeyId.Companion.a())) {
                return;
            }
            dVar.o(fVar, 1, VaultKeyId.a.f41418a, proxyEditRoute.vaultKeyId);
        }

        public final ProxyDataMediator component1() {
            return this.proxy;
        }

        public final VaultKeyId component2() {
            return this.vaultKeyId;
        }

        public final ProxyEditRoute copy(ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId) {
            t.f(proxyDataMediator, Table.PROXY);
            t.f(vaultKeyId, "vaultKeyId");
            return new ProxyEditRoute(proxyDataMediator, vaultKeyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProxyEditRoute)) {
                return false;
            }
            ProxyEditRoute proxyEditRoute = (ProxyEditRoute) obj;
            return t.b(this.proxy, proxyEditRoute.proxy) && t.b(this.vaultKeyId, proxyEditRoute.vaultKeyId);
        }

        public final ProxyDataMediator getProxy() {
            return this.proxy;
        }

        public final VaultKeyId getVaultKeyId() {
            return this.vaultKeyId;
        }

        public int hashCode() {
            return (this.proxy.hashCode() * 31) + this.vaultKeyId.hashCode();
        }

        public String toString() {
            return "ProxyEditRoute(proxy=" + this.proxy + ", vaultKeyId=" + this.vaultKeyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.proxy, i10);
            parcel.writeParcelable(this.vaultKeyId, i10);
        }

        public ProxyEditRoute(ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId) {
            t.f(proxyDataMediator, Table.PROXY);
            t.f(vaultKeyId, "vaultKeyId");
            this.proxy = proxyDataMediator;
            this.vaultKeyId = vaultKeyId;
        }

        public /* synthetic */ ProxyEditRoute(ProxyDataMediator proxyDataMediator, VaultKeyId vaultKeyId, int i10, k kVar) {
            this(proxyDataMediator, (i10 & 2) != 0 ? VaultKeyId.Companion.a() : vaultKeyId);
        }
    }
}
