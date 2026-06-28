package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import hv.c;
import hv.e0;
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
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface PortForwardingNavGraphRoute extends NavigationRoute {

    @p
    @Keep
    public static final class DestinationHostForLocalRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<DestinationHostForLocalRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32923b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32922a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.DestinationHostForLocalRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32923b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForLocalRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new DestinationHostForLocalRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, DestinationHostForLocalRuleRoute destinationHostForLocalRuleRoute) {
                t.f(fVar, "encoder");
                t.f(destinationHostForLocalRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                DestinationHostForLocalRuleRoute.write$Self$Termius_app_googleProductionRelease(destinationHostForLocalRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32922a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForLocalRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new DestinationHostForLocalRuleRoute((PortForwardingWizardData) parcel.readParcelable(DestinationHostForLocalRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForLocalRuleRoute[] newArray(int i10) {
                return new DestinationHostForLocalRuleRoute[i10];
            }
        }

        public /* synthetic */ DestinationHostForLocalRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32922a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ DestinationHostForLocalRuleRoute copy$default(DestinationHostForLocalRuleRoute destinationHostForLocalRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = destinationHostForLocalRuleRoute.wizardData;
            }
            return destinationHostForLocalRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DestinationHostForLocalRuleRoute destinationHostForLocalRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, destinationHostForLocalRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final DestinationHostForLocalRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new DestinationHostForLocalRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DestinationHostForLocalRuleRoute) && t.b(this.wizardData, ((DestinationHostForLocalRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "DestinationHostForLocalRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public DestinationHostForLocalRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class DestinationHostForRemoteRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<DestinationHostForRemoteRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32925b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32924a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.DestinationHostForRemoteRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32925b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForRemoteRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new DestinationHostForRemoteRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, DestinationHostForRemoteRuleRoute destinationHostForRemoteRuleRoute) {
                t.f(fVar, "encoder");
                t.f(destinationHostForRemoteRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                DestinationHostForRemoteRuleRoute.write$Self$Termius_app_googleProductionRelease(destinationHostForRemoteRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32924a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForRemoteRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new DestinationHostForRemoteRuleRoute((PortForwardingWizardData) parcel.readParcelable(DestinationHostForRemoteRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DestinationHostForRemoteRuleRoute[] newArray(int i10) {
                return new DestinationHostForRemoteRuleRoute[i10];
            }
        }

        public /* synthetic */ DestinationHostForRemoteRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32924a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ DestinationHostForRemoteRuleRoute copy$default(DestinationHostForRemoteRuleRoute destinationHostForRemoteRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = destinationHostForRemoteRuleRoute.wizardData;
            }
            return destinationHostForRemoteRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DestinationHostForRemoteRuleRoute destinationHostForRemoteRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, destinationHostForRemoteRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final DestinationHostForRemoteRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new DestinationHostForRemoteRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DestinationHostForRemoteRuleRoute) && t.b(this.wizardData, ((DestinationHostForRemoteRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "DestinationHostForRemoteRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public DestinationHostForRemoteRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class EditRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32927b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32926a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.EditRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32927b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new EditRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, EditRuleRoute editRuleRoute) {
                t.f(fVar, "encoder");
                t.f(editRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                EditRuleRoute.write$Self$Termius_app_googleProductionRelease(editRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32926a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EditRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new EditRuleRoute((PortForwardingWizardData) parcel.readParcelable(EditRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EditRuleRoute[] newArray(int i10) {
                return new EditRuleRoute[i10];
            }
        }

        public /* synthetic */ EditRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32926a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ EditRuleRoute copy$default(EditRuleRoute editRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = editRuleRoute.wizardData;
            }
            return editRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EditRuleRoute editRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, editRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final EditRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new EditRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditRuleRoute) && t.b(this.wizardData, ((EditRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "EditRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public EditRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class IntermediateHostForDynamicRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<IntermediateHostForDynamicRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32929b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32928a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.IntermediateHostForDynamicRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32929b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForDynamicRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new IntermediateHostForDynamicRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, IntermediateHostForDynamicRuleRoute intermediateHostForDynamicRuleRoute) {
                t.f(fVar, "encoder");
                t.f(intermediateHostForDynamicRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                IntermediateHostForDynamicRuleRoute.write$Self$Termius_app_googleProductionRelease(intermediateHostForDynamicRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32928a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForDynamicRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new IntermediateHostForDynamicRuleRoute((PortForwardingWizardData) parcel.readParcelable(IntermediateHostForDynamicRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForDynamicRuleRoute[] newArray(int i10) {
                return new IntermediateHostForDynamicRuleRoute[i10];
            }
        }

        public /* synthetic */ IntermediateHostForDynamicRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32928a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ IntermediateHostForDynamicRuleRoute copy$default(IntermediateHostForDynamicRuleRoute intermediateHostForDynamicRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = intermediateHostForDynamicRuleRoute.wizardData;
            }
            return intermediateHostForDynamicRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IntermediateHostForDynamicRuleRoute intermediateHostForDynamicRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, intermediateHostForDynamicRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final IntermediateHostForDynamicRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new IntermediateHostForDynamicRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntermediateHostForDynamicRuleRoute) && t.b(this.wizardData, ((IntermediateHostForDynamicRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "IntermediateHostForDynamicRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public IntermediateHostForDynamicRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class IntermediateHostForLocalRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<IntermediateHostForLocalRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32930a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32931b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32930a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.IntermediateHostForLocalRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32931b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForLocalRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new IntermediateHostForLocalRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, IntermediateHostForLocalRuleRoute intermediateHostForLocalRuleRoute) {
                t.f(fVar, "encoder");
                t.f(intermediateHostForLocalRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                IntermediateHostForLocalRuleRoute.write$Self$Termius_app_googleProductionRelease(intermediateHostForLocalRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32930a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForLocalRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new IntermediateHostForLocalRuleRoute((PortForwardingWizardData) parcel.readParcelable(IntermediateHostForLocalRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostForLocalRuleRoute[] newArray(int i10) {
                return new IntermediateHostForLocalRuleRoute[i10];
            }
        }

        public /* synthetic */ IntermediateHostForLocalRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32930a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ IntermediateHostForLocalRuleRoute copy$default(IntermediateHostForLocalRuleRoute intermediateHostForLocalRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = intermediateHostForLocalRuleRoute.wizardData;
            }
            return intermediateHostForLocalRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IntermediateHostForLocalRuleRoute intermediateHostForLocalRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, intermediateHostForLocalRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final IntermediateHostForLocalRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new IntermediateHostForLocalRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntermediateHostForLocalRuleRoute) && t.b(this.wizardData, ((IntermediateHostForLocalRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "IntermediateHostForLocalRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public IntermediateHostForLocalRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class IntermediateHostSelectorRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<IntermediateHostSelectorRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32933b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32932a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.IntermediateHostSelectorRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32933b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostSelectorRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new IntermediateHostSelectorRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, IntermediateHostSelectorRoute intermediateHostSelectorRoute) {
                t.f(fVar, "encoder");
                t.f(intermediateHostSelectorRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                IntermediateHostSelectorRoute.write$Self$Termius_app_googleProductionRelease(intermediateHostSelectorRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32932a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostSelectorRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new IntermediateHostSelectorRoute((PortForwardingWizardData) parcel.readParcelable(IntermediateHostSelectorRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntermediateHostSelectorRoute[] newArray(int i10) {
                return new IntermediateHostSelectorRoute[i10];
            }
        }

        public /* synthetic */ IntermediateHostSelectorRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32932a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ IntermediateHostSelectorRoute copy$default(IntermediateHostSelectorRoute intermediateHostSelectorRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = intermediateHostSelectorRoute.wizardData;
            }
            return intermediateHostSelectorRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(IntermediateHostSelectorRoute intermediateHostSelectorRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, intermediateHostSelectorRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final IntermediateHostSelectorRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new IntermediateHostSelectorRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntermediateHostSelectorRoute) && t.b(this.wizardData, ((IntermediateHostSelectorRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "IntermediateHostSelectorRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public IntermediateHostSelectorRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class LabelForRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<LabelForRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32934a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32935b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32934a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.LabelForRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32935b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LabelForRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new LabelForRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, LabelForRuleRoute labelForRuleRoute) {
                t.f(fVar, "encoder");
                t.f(labelForRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                LabelForRuleRoute.write$Self$Termius_app_googleProductionRelease(labelForRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32934a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LabelForRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new LabelForRuleRoute((PortForwardingWizardData) parcel.readParcelable(LabelForRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LabelForRuleRoute[] newArray(int i10) {
                return new LabelForRuleRoute[i10];
            }
        }

        public /* synthetic */ LabelForRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32934a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ LabelForRuleRoute copy$default(LabelForRuleRoute labelForRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = labelForRuleRoute.wizardData;
            }
            return labelForRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(LabelForRuleRoute labelForRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, labelForRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final LabelForRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new LabelForRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LabelForRuleRoute) && t.b(this.wizardData, ((LabelForRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "LabelForRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public LabelForRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class LocalPortForDynamicRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<LocalPortForDynamicRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32937b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32936a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.LocalPortForDynamicRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32937b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LocalPortForDynamicRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new LocalPortForDynamicRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, LocalPortForDynamicRuleRoute localPortForDynamicRuleRoute) {
                t.f(fVar, "encoder");
                t.f(localPortForDynamicRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                LocalPortForDynamicRuleRoute.write$Self$Termius_app_googleProductionRelease(localPortForDynamicRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32936a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LocalPortForDynamicRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new LocalPortForDynamicRuleRoute((PortForwardingWizardData) parcel.readParcelable(LocalPortForDynamicRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LocalPortForDynamicRuleRoute[] newArray(int i10) {
                return new LocalPortForDynamicRuleRoute[i10];
            }
        }

        public /* synthetic */ LocalPortForDynamicRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32936a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ LocalPortForDynamicRuleRoute copy$default(LocalPortForDynamicRuleRoute localPortForDynamicRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = localPortForDynamicRuleRoute.wizardData;
            }
            return localPortForDynamicRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(LocalPortForDynamicRuleRoute localPortForDynamicRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, localPortForDynamicRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final LocalPortForDynamicRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new LocalPortForDynamicRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalPortForDynamicRuleRoute) && t.b(this.wizardData, ((LocalPortForDynamicRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "LocalPortForDynamicRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public LocalPortForDynamicRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class PortAndAddressForLocalRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<PortAndAddressForLocalRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32939b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32938a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.PortAndAddressForLocalRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32939b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForLocalRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new PortAndAddressForLocalRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, PortAndAddressForLocalRuleRoute portAndAddressForLocalRuleRoute) {
                t.f(fVar, "encoder");
                t.f(portAndAddressForLocalRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                PortAndAddressForLocalRuleRoute.write$Self$Termius_app_googleProductionRelease(portAndAddressForLocalRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32938a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForLocalRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PortAndAddressForLocalRuleRoute((PortForwardingWizardData) parcel.readParcelable(PortAndAddressForLocalRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForLocalRuleRoute[] newArray(int i10) {
                return new PortAndAddressForLocalRuleRoute[i10];
            }
        }

        public /* synthetic */ PortAndAddressForLocalRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32938a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ PortAndAddressForLocalRuleRoute copy$default(PortAndAddressForLocalRuleRoute portAndAddressForLocalRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = portAndAddressForLocalRuleRoute.wizardData;
            }
            return portAndAddressForLocalRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PortAndAddressForLocalRuleRoute portAndAddressForLocalRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, portAndAddressForLocalRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final PortAndAddressForLocalRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new PortAndAddressForLocalRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PortAndAddressForLocalRuleRoute) && t.b(this.wizardData, ((PortAndAddressForLocalRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "PortAndAddressForLocalRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public PortAndAddressForLocalRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class PortAndAddressForRemoteRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<PortAndAddressForRemoteRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32941b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32940a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.PortAndAddressForRemoteRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32941b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForRemoteRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new PortAndAddressForRemoteRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, PortAndAddressForRemoteRuleRoute portAndAddressForRemoteRuleRoute) {
                t.f(fVar, "encoder");
                t.f(portAndAddressForRemoteRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                PortAndAddressForRemoteRuleRoute.write$Self$Termius_app_googleProductionRelease(portAndAddressForRemoteRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32940a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForRemoteRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PortAndAddressForRemoteRuleRoute((PortForwardingWizardData) parcel.readParcelable(PortAndAddressForRemoteRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PortAndAddressForRemoteRuleRoute[] newArray(int i10) {
                return new PortAndAddressForRemoteRuleRoute[i10];
            }
        }

        public /* synthetic */ PortAndAddressForRemoteRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32940a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ PortAndAddressForRemoteRuleRoute copy$default(PortAndAddressForRemoteRuleRoute portAndAddressForRemoteRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = portAndAddressForRemoteRuleRoute.wizardData;
            }
            return portAndAddressForRemoteRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PortAndAddressForRemoteRuleRoute portAndAddressForRemoteRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, portAndAddressForRemoteRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final PortAndAddressForRemoteRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new PortAndAddressForRemoteRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PortAndAddressForRemoteRuleRoute) && t.b(this.wizardData, ((PortAndAddressForRemoteRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "PortAndAddressForRemoteRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public PortAndAddressForRemoteRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class PortForwardingRoute implements PortForwardingNavGraphRoute, NavigationRailsRoute {
        public static final PortForwardingRoute INSTANCE = new PortForwardingRoute();
        public static final Parcelable.Creator<PortForwardingRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.r
            @Override // iu.a
            public final Object a() {
                return PortForwardingNavGraphRoute.PortForwardingRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PortForwardingRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return PortForwardingRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PortForwardingRoute[] newArray(int i10) {
                return new PortForwardingRoute[i10];
            }
        }

        private PortForwardingRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.PortForwardingRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PortForwardingRoute);
        }

        public int hashCode() {
            return 1574208590;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PortForwardingRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @p
    @Keep
    public static final class RemoteHostForRemoteRuleRoute implements PortForwardingNavGraphRoute {
        private final PortForwardingWizardData wizardData;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<RemoteHostForRemoteRuleRoute> CREATOR = new c();
        public static final int $stable = PortForwardingWizardData.$stable;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f32943b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f32942a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.RemoteHostForRemoteRuleRoute", aVar, 1);
                i2Var.r("wizardData", false);
                descriptor = i2Var;
                f32943b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemoteHostForRemoteRuleRoute deserialize(e eVar) {
                PortForwardingWizardData portForwardingWizardData;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    portForwardingWizardData = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            portForwardingWizardData = (PortForwardingWizardData) cVarD.i(fVar, 0, PortForwardingWizardData.a.f29560a, portForwardingWizardData);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new RemoteHostForRemoteRuleRoute(i10, portForwardingWizardData, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, RemoteHostForRemoteRuleRoute remoteHostForRemoteRuleRoute) {
                t.f(fVar, "encoder");
                t.f(remoteHostForRemoteRuleRoute, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                RemoteHostForRemoteRuleRoute.write$Self$Termius_app_googleProductionRelease(remoteHostForRemoteRuleRoute, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{PortForwardingWizardData.a.f29560a};
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
                return a.f32942a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RemoteHostForRemoteRuleRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new RemoteHostForRemoteRuleRoute((PortForwardingWizardData) parcel.readParcelable(RemoteHostForRemoteRuleRoute.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RemoteHostForRemoteRuleRoute[] newArray(int i10) {
                return new RemoteHostForRemoteRuleRoute[i10];
            }
        }

        public /* synthetic */ RemoteHostForRemoteRuleRoute(int i10, PortForwardingWizardData portForwardingWizardData, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f32942a.getDescriptor());
            }
            this.wizardData = portForwardingWizardData;
        }

        public static /* synthetic */ RemoteHostForRemoteRuleRoute copy$default(RemoteHostForRemoteRuleRoute remoteHostForRemoteRuleRoute, PortForwardingWizardData portForwardingWizardData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                portForwardingWizardData = remoteHostForRemoteRuleRoute.wizardData;
            }
            return remoteHostForRemoteRuleRoute.copy(portForwardingWizardData);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RemoteHostForRemoteRuleRoute remoteHostForRemoteRuleRoute, d dVar, f fVar) {
            dVar.o(fVar, 0, PortForwardingWizardData.a.f29560a, remoteHostForRemoteRuleRoute.wizardData);
        }

        public final PortForwardingWizardData component1() {
            return this.wizardData;
        }

        public final RemoteHostForRemoteRuleRoute copy(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            return new RemoteHostForRemoteRuleRoute(portForwardingWizardData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteHostForRemoteRuleRoute) && t.b(this.wizardData, ((RemoteHostForRemoteRuleRoute) obj).wizardData);
        }

        public final PortForwardingWizardData getWizardData() {
            return this.wizardData;
        }

        public int hashCode() {
            return this.wizardData.hashCode();
        }

        public String toString() {
            return "RemoteHostForRemoteRuleRoute(wizardData=" + this.wizardData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeParcelable(this.wizardData, i10);
        }

        public RemoteHostForRemoteRuleRoute(PortForwardingWizardData portForwardingWizardData) {
            t.f(portForwardingWizardData, "wizardData");
            this.wizardData = portForwardingWizardData;
        }
    }

    @p
    @Keep
    public static final class TypeSelectionScreenRoute implements PortForwardingNavGraphRoute {
        public static final TypeSelectionScreenRoute INSTANCE = new TypeSelectionScreenRoute();
        public static final Parcelable.Creator<TypeSelectionScreenRoute> CREATOR = new a();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.s
            @Override // iu.a
            public final Object a() {
                return PortForwardingNavGraphRoute.TypeSelectionScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TypeSelectionScreenRoute createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                parcel.readInt();
                return TypeSelectionScreenRoute.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TypeSelectionScreenRoute[] newArray(int i10) {
                return new TypeSelectionScreenRoute[i10];
            }
        }

        private TypeSelectionScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute.TypeSelectionScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TypeSelectionScreenRoute);
        }

        public int hashCode() {
            return -1305207160;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "TypeSelectionScreenRoute";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
