package com.server.auditor.ssh.client.navigation.portforwardingwizard;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.x1;
import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.Arrays;
import ju.n0;
import ju.t;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.b0;
import ut.u;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class PortForwardingWizardData implements Parcelable {
    private String bindAddress;
    private String credentialsMode;
    private String destinationAddress;
    private int destinationPortNumber;
    private long idOfExistRule;
    private VaultKeyId initialVaultKeyId;
    private long intermediateHostId;
    private boolean isOpenToEditExistRule;
    private boolean isRuleCreatedByWizard;
    private int localPortNumber;
    private int portForwardingType;
    private String ruleLabel;
    private VaultKeyId targetVaultKeyId;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<PortForwardingWizardData> CREATOR = new c();
    public static final int $stable = 8;
    private static final u typeMap = b0.a(n0.j(PortForwardingWizardData.class), new d(false, mv.b.f65981d));

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29561b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f29560a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData", aVar, 13);
            i2Var.r("portForwardingType", true);
            i2Var.r("localPortNumber", true);
            i2Var.r("bindAddress", true);
            i2Var.r("intermediateHostId", true);
            i2Var.r("destinationPortNumber", true);
            i2Var.r("destinationAddress", true);
            i2Var.r("ruleLabel", true);
            i2Var.r("isRuleCreatedByWizard", true);
            i2Var.r("isOpenToEditExistRule", true);
            i2Var.r("idOfExistRule", true);
            i2Var.r("initialVaultKeyId", true);
            i2Var.r("targetVaultKeyId", true);
            i2Var.r("credentialsMode", true);
            descriptor = i2Var;
            f29561b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PortForwardingWizardData deserialize(kv.e eVar) {
            int i10;
            int i11;
            VaultKeyId vaultKeyId;
            VaultKeyId vaultKeyId2;
            String str;
            String str2;
            String str3;
            String strB;
            boolean z10;
            int i12;
            boolean z11;
            int i13;
            long j10;
            long j11;
            t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            if (cVarD.l()) {
                int iE = cVarD.e(fVar, 0);
                int iE2 = cVarD.e(fVar, 1);
                String strB2 = cVarD.B(fVar, 2);
                long jO = cVarD.o(fVar, 3);
                int iE3 = cVarD.e(fVar, 4);
                String strB3 = cVarD.B(fVar, 5);
                String strB4 = cVarD.B(fVar, 6);
                boolean zH = cVarD.H(fVar, 7);
                boolean zH2 = cVarD.H(fVar, 8);
                long jO2 = cVarD.o(fVar, 9);
                VaultKeyId.a aVar = VaultKeyId.a.f41418a;
                VaultKeyId vaultKeyId3 = (VaultKeyId) cVarD.i(fVar, 10, aVar, null);
                i10 = iE;
                vaultKeyId = (VaultKeyId) cVarD.i(fVar, 11, aVar, null);
                strB = cVarD.B(fVar, 12);
                vaultKeyId2 = vaultKeyId3;
                i11 = 8191;
                z10 = zH;
                str3 = strB4;
                str2 = strB3;
                i12 = iE3;
                z11 = zH2;
                str = strB2;
                i13 = iE2;
                j10 = jO;
                j11 = jO2;
            } else {
                int i14 = 12;
                String strB5 = null;
                String strB6 = null;
                boolean z12 = true;
                int i15 = 0;
                boolean zH3 = false;
                int iE4 = 0;
                boolean zH4 = false;
                int iE5 = 0;
                long jO3 = 0;
                long jO4 = 0;
                VaultKeyId vaultKeyId4 = null;
                VaultKeyId vaultKeyId5 = null;
                String strB7 = null;
                String strB8 = null;
                int iE6 = 0;
                while (z12) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z12 = false;
                            i14 = 12;
                            break;
                        case 0:
                            i15 |= 1;
                            iE6 = cVarD.e(fVar, 0);
                            i14 = 12;
                            break;
                        case 1:
                            iE5 = cVarD.e(fVar, 1);
                            i15 |= 2;
                            i14 = 12;
                            break;
                        case 2:
                            strB7 = cVarD.B(fVar, 2);
                            i15 |= 4;
                            i14 = 12;
                            break;
                        case 3:
                            jO3 = cVarD.o(fVar, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            iE4 = cVarD.e(fVar, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strB8 = cVarD.B(fVar, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            strB5 = cVarD.B(fVar, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            zH3 = cVarD.H(fVar, 7);
                            i15 |= 128;
                            break;
                        case 8:
                            zH4 = cVarD.H(fVar, 8);
                            i15 |= 256;
                            break;
                        case 9:
                            jO4 = cVarD.o(fVar, 9);
                            i15 |= File.FLAG_O_TRUNC;
                            break;
                        case 10:
                            vaultKeyId5 = (VaultKeyId) cVarD.i(fVar, 10, VaultKeyId.a.f41418a, vaultKeyId5);
                            i15 |= File.FLAG_O_APPEND;
                            break;
                        case 11:
                            vaultKeyId4 = (VaultKeyId) cVarD.i(fVar, 11, VaultKeyId.a.f41418a, vaultKeyId4);
                            i15 |= 2048;
                            break;
                        case 12:
                            strB6 = cVarD.B(fVar, i14);
                            i15 |= 4096;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = iE6;
                i11 = i15;
                vaultKeyId = vaultKeyId4;
                vaultKeyId2 = vaultKeyId5;
                str = strB7;
                str2 = strB8;
                str3 = strB5;
                strB = strB6;
                z10 = zH3;
                i12 = iE4;
                z11 = zH4;
                i13 = iE5;
                j10 = jO3;
                j11 = jO4;
            }
            cVarD.b(fVar);
            return new PortForwardingWizardData(i11, i10, i13, str, j10, i12, str2, str3, z10, z11, j11, vaultKeyId2, vaultKeyId, strB, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PortForwardingWizardData portForwardingWizardData) {
            t.f(fVar, "encoder");
            t.f(portForwardingWizardData, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            PortForwardingWizardData.write$Self$Termius_app_googleProductionRelease(portForwardingWizardData, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            w0 w0Var = w0.f64808a;
            x2 x2Var = x2.f64817a;
            h1 h1Var = h1.f64699a;
            lv.i iVar = lv.i.f64704a;
            VaultKeyId.a aVar = VaultKeyId.a.f41418a;
            return new hv.c[]{w0Var, w0Var, x2Var, h1Var, w0Var, x2Var, x2Var, iVar, iVar, h1Var, aVar, aVar, x2Var};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        public final u a() {
            return PortForwardingWizardData.typeMap;
        }

        public final hv.c serializer() {
            return a.f29560a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PortForwardingWizardData createFromParcel(Parcel parcel) {
            boolean z10;
            t.f(parcel, "parcel");
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string = parcel.readString();
            long j10 = parcel.readLong();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            boolean z12 = parcel.readInt() == 0 ? z10 : true;
            long j11 = parcel.readLong();
            Parcelable.Creator<VaultKeyId> creator = VaultKeyId.CREATOR;
            return new PortForwardingWizardData(i10, i11, string, j10, i12, string2, string3, z11, z12, j11, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PortForwardingWizardData[] newArray(int i10) {
            return new PortForwardingWizardData[i10];
        }
    }

    public static final class d extends x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f29562t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, mv.b bVar) {
            super(z10);
            this.f29562t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f29562t;
            bVar.a();
            return bVar.b(PortForwardingWizardData.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f29562t;
            bVar.a();
            return bVar.b(PortForwardingWizardData.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f29562t;
            bVar.a();
            bundle.putString(str, bVar.c(PortForwardingWizardData.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f29562t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(PortForwardingWizardData.Companion.serializer(), obj));
            t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    public PortForwardingWizardData() {
        this(0, 0, (String) null, 0L, 0, (String) null, (String) null, false, false, 0L, (VaultKeyId) null, (VaultKeyId) null, (String) null, 8191, (ju.k) null);
    }

    private final int getDigitalFieldsHashValue() {
        return this.localPortNumber + ((int) this.intermediateHostId) + this.destinationPortNumber;
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PortForwardingWizardData portForwardingWizardData, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || portForwardingWizardData.portForwardingType != 0) {
            dVar.t(fVar, 0, portForwardingWizardData.portForwardingType);
        }
        if (dVar.E(fVar, 1) || portForwardingWizardData.localPortNumber != -1) {
            dVar.t(fVar, 1, portForwardingWizardData.localPortNumber);
        }
        if (dVar.E(fVar, 2) || !t.b(portForwardingWizardData.bindAddress, "")) {
            dVar.f(fVar, 2, portForwardingWizardData.bindAddress);
        }
        if (dVar.E(fVar, 3) || portForwardingWizardData.intermediateHostId != -1) {
            dVar.q(fVar, 3, portForwardingWizardData.intermediateHostId);
        }
        if (dVar.E(fVar, 4) || portForwardingWizardData.destinationPortNumber != 0) {
            dVar.t(fVar, 4, portForwardingWizardData.destinationPortNumber);
        }
        if (dVar.E(fVar, 5) || !t.b(portForwardingWizardData.destinationAddress, "")) {
            dVar.f(fVar, 5, portForwardingWizardData.destinationAddress);
        }
        if (dVar.E(fVar, 6) || !t.b(portForwardingWizardData.ruleLabel, "")) {
            dVar.f(fVar, 6, portForwardingWizardData.ruleLabel);
        }
        if (dVar.E(fVar, 7) || !portForwardingWizardData.isRuleCreatedByWizard) {
            dVar.u(fVar, 7, portForwardingWizardData.isRuleCreatedByWizard);
        }
        if (dVar.E(fVar, 8) || portForwardingWizardData.isOpenToEditExistRule) {
            dVar.u(fVar, 8, portForwardingWizardData.isOpenToEditExistRule);
        }
        if (dVar.E(fVar, 9) || portForwardingWizardData.idOfExistRule != -1) {
            dVar.q(fVar, 9, portForwardingWizardData.idOfExistRule);
        }
        if (dVar.E(fVar, 10) || !t.b(portForwardingWizardData.initialVaultKeyId, VaultKeyId.Companion.a())) {
            dVar.o(fVar, 10, VaultKeyId.a.f41418a, portForwardingWizardData.initialVaultKeyId);
        }
        if (dVar.E(fVar, 11) || !t.b(portForwardingWizardData.targetVaultKeyId, VaultKeyId.Companion.a())) {
            dVar.o(fVar, 11, VaultKeyId.a.f41418a, portForwardingWizardData.targetVaultKeyId);
        }
        if (!dVar.E(fVar, 12) && t.b(portForwardingWizardData.credentialsMode, "no_credentials_sharing")) {
            return;
        }
        dVar.f(fVar, 12, portForwardingWizardData.credentialsMode);
    }

    public final int component1() {
        return this.portForwardingType;
    }

    public final long component10() {
        return this.idOfExistRule;
    }

    public final VaultKeyId component11() {
        return this.initialVaultKeyId;
    }

    public final VaultKeyId component12() {
        return this.targetVaultKeyId;
    }

    public final String component13() {
        return this.credentialsMode;
    }

    public final int component2() {
        return this.localPortNumber;
    }

    public final String component3() {
        return this.bindAddress;
    }

    public final long component4() {
        return this.intermediateHostId;
    }

    public final int component5() {
        return this.destinationPortNumber;
    }

    public final String component6() {
        return this.destinationAddress;
    }

    public final String component7() {
        return this.ruleLabel;
    }

    public final boolean component8() {
        return this.isRuleCreatedByWizard;
    }

    public final boolean component9() {
        return this.isOpenToEditExistRule;
    }

    public final PortForwardingWizardData copy(int i10, int i11, String str, long j10, int i12, String str2, String str3, boolean z10, boolean z11, long j11, VaultKeyId vaultKeyId, VaultKeyId vaultKeyId2, String str4) {
        t.f(str, "bindAddress");
        t.f(str2, "destinationAddress");
        t.f(str3, "ruleLabel");
        t.f(vaultKeyId, "initialVaultKeyId");
        t.f(vaultKeyId2, "targetVaultKeyId");
        t.f(str4, "credentialsMode");
        return new PortForwardingWizardData(i10, i11, str, j10, i12, str2, str3, z10, z11, j11, vaultKeyId, vaultKeyId2, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortForwardingWizardData)) {
            return false;
        }
        PortForwardingWizardData portForwardingWizardData = (PortForwardingWizardData) obj;
        return this.portForwardingType == portForwardingWizardData.portForwardingType && this.localPortNumber == portForwardingWizardData.localPortNumber && t.b(this.bindAddress, portForwardingWizardData.bindAddress) && this.intermediateHostId == portForwardingWizardData.intermediateHostId && this.destinationPortNumber == portForwardingWizardData.destinationPortNumber && t.b(this.destinationAddress, portForwardingWizardData.destinationAddress) && t.b(this.ruleLabel, portForwardingWizardData.ruleLabel) && this.isRuleCreatedByWizard == portForwardingWizardData.isRuleCreatedByWizard && this.isOpenToEditExistRule == portForwardingWizardData.isOpenToEditExistRule && this.idOfExistRule == portForwardingWizardData.idOfExistRule && t.b(this.initialVaultKeyId, portForwardingWizardData.initialVaultKeyId) && t.b(this.targetVaultKeyId, portForwardingWizardData.targetVaultKeyId) && t.b(this.credentialsMode, portForwardingWizardData.credentialsMode);
    }

    public final String getBindAddress() {
        return this.bindAddress;
    }

    public final String getCredentialsMode() {
        return this.credentialsMode;
    }

    public final String getDestinationAddress() {
        return this.destinationAddress;
    }

    public final int getDestinationPortNumber() {
        return this.destinationPortNumber;
    }

    public final long getIdOfExistRule() {
        return this.idOfExistRule;
    }

    public final VaultKeyId getInitialVaultKeyId() {
        return this.initialVaultKeyId;
    }

    public final long getIntermediateHostId() {
        return this.intermediateHostId;
    }

    public final int getLocalPortNumber() {
        return this.localPortNumber;
    }

    public final int getPortForwardingType() {
        return this.portForwardingType;
    }

    public final String getRuleLabel() {
        return this.ruleLabel;
    }

    public final VaultKeyId getTargetVaultKeyId() {
        return this.targetVaultKeyId;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.bindAddress, this.destinationAddress, this.ruleLabel}) + getDigitalFieldsHashValue();
    }

    public final boolean isOpenToEditExistRule() {
        return this.isOpenToEditExistRule;
    }

    public final boolean isRuleCreatedByWizard() {
        return this.isRuleCreatedByWizard;
    }

    public final void setBindAddress(String str) {
        t.f(str, "<set-?>");
        this.bindAddress = str;
    }

    public final void setCredentialsMode(String str) {
        t.f(str, "<set-?>");
        this.credentialsMode = str;
    }

    public final void setDestinationAddress(String str) {
        t.f(str, "<set-?>");
        this.destinationAddress = str;
    }

    public final void setDestinationPortNumber(int i10) {
        this.destinationPortNumber = i10;
    }

    public final void setIdOfExistRule(long j10) {
        this.idOfExistRule = j10;
    }

    public final void setInitialVaultKeyId(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<set-?>");
        this.initialVaultKeyId = vaultKeyId;
    }

    public final void setIntermediateHostId(long j10) {
        this.intermediateHostId = j10;
    }

    public final void setLocalPortNumber(int i10) {
        this.localPortNumber = i10;
    }

    public final void setOpenToEditExistRule(boolean z10) {
        this.isOpenToEditExistRule = z10;
    }

    public final void setPortForwardingType(int i10) {
        this.portForwardingType = i10;
    }

    public final void setRuleCreatedByWizard(boolean z10) {
        this.isRuleCreatedByWizard = z10;
    }

    public final void setRuleLabel(String str) {
        t.f(str, "<set-?>");
        this.ruleLabel = str;
    }

    public final void setTargetVaultKeyId(VaultKeyId vaultKeyId) {
        t.f(vaultKeyId, "<set-?>");
        this.targetVaultKeyId = vaultKeyId;
    }

    public String toString() {
        return "PortForwardingWizardData(portForwardingType=" + this.portForwardingType + ", localPortNumber=" + this.localPortNumber + ", bindAddress=" + this.bindAddress + ", intermediateHostId=" + this.intermediateHostId + ", destinationPortNumber=" + this.destinationPortNumber + ", destinationAddress=" + this.destinationAddress + ", ruleLabel=" + this.ruleLabel + ", isRuleCreatedByWizard=" + this.isRuleCreatedByWizard + ", isOpenToEditExistRule=" + this.isOpenToEditExistRule + ", idOfExistRule=" + this.idOfExistRule + ", initialVaultKeyId=" + this.initialVaultKeyId + ", targetVaultKeyId=" + this.targetVaultKeyId + ", credentialsMode=" + this.credentialsMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeInt(this.portForwardingType);
        parcel.writeInt(this.localPortNumber);
        parcel.writeString(this.bindAddress);
        parcel.writeLong(this.intermediateHostId);
        parcel.writeInt(this.destinationPortNumber);
        parcel.writeString(this.destinationAddress);
        parcel.writeString(this.ruleLabel);
        parcel.writeInt(this.isRuleCreatedByWizard ? 1 : 0);
        parcel.writeInt(this.isOpenToEditExistRule ? 1 : 0);
        parcel.writeLong(this.idOfExistRule);
        this.initialVaultKeyId.writeToParcel(parcel, i10);
        this.targetVaultKeyId.writeToParcel(parcel, i10);
        parcel.writeString(this.credentialsMode);
    }

    public /* synthetic */ PortForwardingWizardData(int i10, int i11, int i12, String str, long j10, int i13, String str2, String str3, boolean z10, boolean z11, long j11, VaultKeyId vaultKeyId, VaultKeyId vaultKeyId2, String str4, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.portForwardingType = 0;
        } else {
            this.portForwardingType = i11;
        }
        if ((i10 & 2) == 0) {
            this.localPortNumber = -1;
        } else {
            this.localPortNumber = i12;
        }
        if ((i10 & 4) == 0) {
            this.bindAddress = "";
        } else {
            this.bindAddress = str;
        }
        if ((i10 & 8) == 0) {
            this.intermediateHostId = -1L;
        } else {
            this.intermediateHostId = j10;
        }
        if ((i10 & 16) == 0) {
            this.destinationPortNumber = 0;
        } else {
            this.destinationPortNumber = i13;
        }
        if ((i10 & 32) == 0) {
            this.destinationAddress = "";
        } else {
            this.destinationAddress = str2;
        }
        if ((i10 & 64) == 0) {
            this.ruleLabel = "";
        } else {
            this.ruleLabel = str3;
        }
        if ((i10 & 128) == 0) {
            this.isRuleCreatedByWizard = true;
        } else {
            this.isRuleCreatedByWizard = z10;
        }
        if ((i10 & 256) == 0) {
            this.isOpenToEditExistRule = false;
        } else {
            this.isOpenToEditExistRule = z11;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.idOfExistRule = -1L;
        } else {
            this.idOfExistRule = j11;
        }
        this.initialVaultKeyId = (i10 & File.FLAG_O_APPEND) == 0 ? VaultKeyId.Companion.a() : vaultKeyId;
        this.targetVaultKeyId = (i10 & 2048) == 0 ? VaultKeyId.Companion.a() : vaultKeyId2;
        this.credentialsMode = (i10 & 4096) == 0 ? "no_credentials_sharing" : str4;
    }

    public PortForwardingWizardData(int i10, int i11, String str, long j10, int i12, String str2, String str3, boolean z10, boolean z11, long j11, VaultKeyId vaultKeyId, VaultKeyId vaultKeyId2, String str4) {
        t.f(str, "bindAddress");
        t.f(str2, "destinationAddress");
        t.f(str3, "ruleLabel");
        t.f(vaultKeyId, "initialVaultKeyId");
        t.f(vaultKeyId2, "targetVaultKeyId");
        t.f(str4, "credentialsMode");
        this.portForwardingType = i10;
        this.localPortNumber = i11;
        this.bindAddress = str;
        this.intermediateHostId = j10;
        this.destinationPortNumber = i12;
        this.destinationAddress = str2;
        this.ruleLabel = str3;
        this.isRuleCreatedByWizard = z10;
        this.isOpenToEditExistRule = z11;
        this.idOfExistRule = j11;
        this.initialVaultKeyId = vaultKeyId;
        this.targetVaultKeyId = vaultKeyId2;
        this.credentialsMode = str4;
    }

    public /* synthetic */ PortForwardingWizardData(int i10, int i11, String str, long j10, int i12, String str2, String str3, boolean z10, boolean z11, long j11, VaultKeyId vaultKeyId, VaultKeyId vaultKeyId2, String str4, int i13, ju.k kVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? "" : str2, (i13 & 64) == 0 ? str3 : "", (i13 & 128) != 0 ? true : z10, (i13 & 256) == 0 ? z11 : false, (i13 & File.FLAG_O_TRUNC) == 0 ? j11 : -1L, (i13 & File.FLAG_O_APPEND) != 0 ? VaultKeyId.Companion.a() : vaultKeyId, (i13 & 2048) != 0 ? VaultKeyId.Companion.a() : vaultKeyId2, (i13 & 4096) != 0 ? "no_credentials_sharing" : str4);
    }
}
