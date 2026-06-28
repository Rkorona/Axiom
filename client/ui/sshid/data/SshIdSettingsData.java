package com.server.auditor.ssh.client.ui.sshid.data;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.navigation.x1;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdParametersFieldValue;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.e;
import lv.d2;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.b0;
import ut.n;
import ut.o;
import ut.r;
import ut.u;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public final class SshIdSettingsData implements Parcelable {
    private final List<String> availablePasskeyTypes;
    private final String defaultPasskeyTypeOfSshId;
    private final boolean isInheritedSshId;
    private final String passkeyTypeOfSshId;
    private final SshIdParametersFieldValue passwordData;
    private final SshIdParametersFieldValue usernameData;
    private final String usernameOfSshId;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SshIdSettingsData> CREATOR = new c();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: yo.o
        @Override // iu.a
        public final Object a() {
            return SshIdSettingsData._childSerializers$_anonymous_();
        }
    }), null};
    private static final u typeMap = b0.a(n0.j(SshIdSettingsData.class), new d(false, mv.b.f65981d));

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40862b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40861a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData", aVar, 7);
            i2Var.r("usernameData", false);
            i2Var.r("passwordData", false);
            i2Var.r("usernameOfSshId", false);
            i2Var.r("passkeyTypeOfSshId", false);
            i2Var.r("defaultPasskeyTypeOfSshId", false);
            i2Var.r("availablePasskeyTypes", false);
            i2Var.r("isInheritedSshId", false);
            descriptor = i2Var;
            f40862b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdSettingsData deserialize(e eVar) {
            boolean zH;
            List list;
            int i10;
            SshIdParametersFieldValue sshIdParametersFieldValue;
            SshIdParametersFieldValue sshIdParametersFieldValue2;
            String str;
            String str2;
            String str3;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            n[] nVarArr = SshIdSettingsData.$childSerializers;
            int i11 = 6;
            if (cVarD.l()) {
                SshIdParametersFieldValue.a aVar = SshIdParametersFieldValue.a.f40859a;
                SshIdParametersFieldValue sshIdParametersFieldValue3 = (SshIdParametersFieldValue) cVarD.i(fVar, 0, aVar, null);
                SshIdParametersFieldValue sshIdParametersFieldValue4 = (SshIdParametersFieldValue) cVarD.i(fVar, 1, aVar, null);
                String strB = cVarD.B(fVar, 2);
                String str4 = (String) cVarD.v(fVar, 3, x2.f64817a, null);
                String strB2 = cVarD.B(fVar, 4);
                list = (List) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                sshIdParametersFieldValue2 = sshIdParametersFieldValue4;
                zH = cVarD.H(fVar, 6);
                str2 = str4;
                str3 = strB2;
                str = strB;
                i10 = 127;
                sshIdParametersFieldValue = sshIdParametersFieldValue3;
            } else {
                boolean z10 = true;
                boolean zH2 = false;
                SshIdParametersFieldValue sshIdParametersFieldValue5 = null;
                SshIdParametersFieldValue sshIdParametersFieldValue6 = null;
                String strB3 = null;
                String str5 = null;
                String strB4 = null;
                int i12 = 0;
                List list2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            sshIdParametersFieldValue5 = (SshIdParametersFieldValue) cVarD.i(fVar, 0, SshIdParametersFieldValue.a.f40859a, sshIdParametersFieldValue5);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            sshIdParametersFieldValue6 = (SshIdParametersFieldValue) cVarD.i(fVar, 1, SshIdParametersFieldValue.a.f40859a, sshIdParametersFieldValue6);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            strB3 = cVarD.B(fVar, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str5 = (String) cVarD.v(fVar, 3, x2.f64817a, str5);
                            i12 |= 8;
                            break;
                        case 4:
                            strB4 = cVarD.B(fVar, 4);
                            i12 |= 16;
                            break;
                        case 5:
                            list2 = (List) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), list2);
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
                list = list2;
                i10 = i12;
                sshIdParametersFieldValue = sshIdParametersFieldValue5;
                sshIdParametersFieldValue2 = sshIdParametersFieldValue6;
                str = strB3;
                str2 = str5;
                str3 = strB4;
            }
            cVarD.b(fVar);
            return new SshIdSettingsData(i10, sshIdParametersFieldValue, sshIdParametersFieldValue2, str, str2, str3, list, zH, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SshIdSettingsData sshIdSettingsData) {
            t.f(fVar, "encoder");
            t.f(sshIdSettingsData, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            SshIdSettingsData.write$Self$Termius_app_googleProductionRelease(sshIdSettingsData, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = SshIdSettingsData.$childSerializers;
            SshIdParametersFieldValue.a aVar = SshIdParametersFieldValue.a.f40859a;
            x2 x2Var = x2.f64817a;
            return new hv.c[]{aVar, aVar, x2Var, iv.a.u(x2Var), x2Var, nVarArr[5].getValue(), i.f64704a};
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
            return SshIdSettingsData.typeMap;
        }

        public final hv.c serializer() {
            return a.f40861a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SshIdSettingsData createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            Parcelable.Creator<SshIdParametersFieldValue> creator = SshIdParametersFieldValue.CREATOR;
            return new SshIdSettingsData(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SshIdSettingsData[] newArray(int i10) {
            return new SshIdSettingsData[i10];
        }
    }

    public static final class d extends x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f40863t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, mv.b bVar) {
            super(z10);
            this.f40863t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f40863t;
            bVar.a();
            return bVar.b(SshIdSettingsData.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f40863t;
            bVar.a();
            return bVar.b(SshIdSettingsData.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            t.f(bundle, "bundle");
            t.f(str, SerializableEvent.KEY_FIELD);
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f40863t;
            bVar.a();
            bundle.putString(str, bVar.c(SshIdSettingsData.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f40863t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(SshIdSettingsData.Companion.serializer(), obj));
            t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    public /* synthetic */ SshIdSettingsData(int i10, SshIdParametersFieldValue sshIdParametersFieldValue, SshIdParametersFieldValue sshIdParametersFieldValue2, String str, String str2, String str3, List list, boolean z10, s2 s2Var) {
        if (127 != (i10 & 127)) {
            d2.a(i10, 127, a.f40861a.getDescriptor());
        }
        this.usernameData = sshIdParametersFieldValue;
        this.passwordData = sshIdParametersFieldValue2;
        this.usernameOfSshId = str;
        this.passkeyTypeOfSshId = str2;
        this.defaultPasskeyTypeOfSshId = str3;
        this.availablePasskeyTypes = list;
        this.isInheritedSshId = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SshIdSettingsData copy$default(SshIdSettingsData sshIdSettingsData, SshIdParametersFieldValue sshIdParametersFieldValue, SshIdParametersFieldValue sshIdParametersFieldValue2, String str, String str2, String str3, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sshIdParametersFieldValue = sshIdSettingsData.usernameData;
        }
        if ((i10 & 2) != 0) {
            sshIdParametersFieldValue2 = sshIdSettingsData.passwordData;
        }
        if ((i10 & 4) != 0) {
            str = sshIdSettingsData.usernameOfSshId;
        }
        if ((i10 & 8) != 0) {
            str2 = sshIdSettingsData.passkeyTypeOfSshId;
        }
        if ((i10 & 16) != 0) {
            str3 = sshIdSettingsData.defaultPasskeyTypeOfSshId;
        }
        if ((i10 & 32) != 0) {
            list = sshIdSettingsData.availablePasskeyTypes;
        }
        if ((i10 & 64) != 0) {
            z10 = sshIdSettingsData.isInheritedSshId;
        }
        List list2 = list;
        boolean z11 = z10;
        String str4 = str3;
        String str5 = str;
        return sshIdSettingsData.copy(sshIdParametersFieldValue, sshIdParametersFieldValue2, str5, str2, str4, list2, z11);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdSettingsData sshIdSettingsData, kv.d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        SshIdParametersFieldValue.a aVar = SshIdParametersFieldValue.a.f40859a;
        dVar.o(fVar, 0, aVar, sshIdSettingsData.usernameData);
        dVar.o(fVar, 1, aVar, sshIdSettingsData.passwordData);
        dVar.f(fVar, 2, sshIdSettingsData.usernameOfSshId);
        dVar.v(fVar, 3, x2.f64817a, sshIdSettingsData.passkeyTypeOfSshId);
        dVar.f(fVar, 4, sshIdSettingsData.defaultPasskeyTypeOfSshId);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), sshIdSettingsData.availablePasskeyTypes);
        dVar.u(fVar, 6, sshIdSettingsData.isInheritedSshId);
    }

    public final SshIdParametersFieldValue component1() {
        return this.usernameData;
    }

    public final SshIdParametersFieldValue component2() {
        return this.passwordData;
    }

    public final String component3() {
        return this.usernameOfSshId;
    }

    public final String component4() {
        return this.passkeyTypeOfSshId;
    }

    public final String component5() {
        return this.defaultPasskeyTypeOfSshId;
    }

    public final List<String> component6() {
        return this.availablePasskeyTypes;
    }

    public final boolean component7() {
        return this.isInheritedSshId;
    }

    public final SshIdSettingsData copy(SshIdParametersFieldValue sshIdParametersFieldValue, SshIdParametersFieldValue sshIdParametersFieldValue2, String str, String str2, String str3, List<String> list, boolean z10) {
        t.f(sshIdParametersFieldValue, "usernameData");
        t.f(sshIdParametersFieldValue2, "passwordData");
        t.f(str, "usernameOfSshId");
        t.f(str3, "defaultPasskeyTypeOfSshId");
        t.f(list, "availablePasskeyTypes");
        return new SshIdSettingsData(sshIdParametersFieldValue, sshIdParametersFieldValue2, str, str2, str3, list, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshIdSettingsData)) {
            return false;
        }
        SshIdSettingsData sshIdSettingsData = (SshIdSettingsData) obj;
        return t.b(this.usernameData, sshIdSettingsData.usernameData) && t.b(this.passwordData, sshIdSettingsData.passwordData) && t.b(this.usernameOfSshId, sshIdSettingsData.usernameOfSshId) && t.b(this.passkeyTypeOfSshId, sshIdSettingsData.passkeyTypeOfSshId) && t.b(this.defaultPasskeyTypeOfSshId, sshIdSettingsData.defaultPasskeyTypeOfSshId) && t.b(this.availablePasskeyTypes, sshIdSettingsData.availablePasskeyTypes) && this.isInheritedSshId == sshIdSettingsData.isInheritedSshId;
    }

    public final List<String> getAvailablePasskeyTypes() {
        return this.availablePasskeyTypes;
    }

    public final String getDefaultPasskeyTypeOfSshId() {
        return this.defaultPasskeyTypeOfSshId;
    }

    public final String getPasskeyTypeOfSshId() {
        return this.passkeyTypeOfSshId;
    }

    public final SshIdParametersFieldValue getPasswordData() {
        return this.passwordData;
    }

    public final SshIdParametersFieldValue getUsernameData() {
        return this.usernameData;
    }

    public final String getUsernameOfSshId() {
        return this.usernameOfSshId;
    }

    public int hashCode() {
        int iHashCode = ((((this.usernameData.hashCode() * 31) + this.passwordData.hashCode()) * 31) + this.usernameOfSshId.hashCode()) * 31;
        String str = this.passkeyTypeOfSshId;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultPasskeyTypeOfSshId.hashCode()) * 31) + this.availablePasskeyTypes.hashCode()) * 31) + Boolean.hashCode(this.isInheritedSshId);
    }

    public final boolean isInheritedSshId() {
        return this.isInheritedSshId;
    }

    public String toString() {
        return "SshIdSettingsData(usernameData=" + this.usernameData + ", passwordData=" + this.passwordData + ", usernameOfSshId=" + this.usernameOfSshId + ", passkeyTypeOfSshId=" + this.passkeyTypeOfSshId + ", defaultPasskeyTypeOfSshId=" + this.defaultPasskeyTypeOfSshId + ", availablePasskeyTypes=" + this.availablePasskeyTypes + ", isInheritedSshId=" + this.isInheritedSshId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        this.usernameData.writeToParcel(parcel, i10);
        this.passwordData.writeToParcel(parcel, i10);
        parcel.writeString(this.usernameOfSshId);
        parcel.writeString(this.passkeyTypeOfSshId);
        parcel.writeString(this.defaultPasskeyTypeOfSshId);
        parcel.writeStringList(this.availablePasskeyTypes);
        parcel.writeInt(this.isInheritedSshId ? 1 : 0);
    }

    public SshIdSettingsData(SshIdParametersFieldValue sshIdParametersFieldValue, SshIdParametersFieldValue sshIdParametersFieldValue2, String str, String str2, String str3, List<String> list, boolean z10) {
        t.f(sshIdParametersFieldValue, "usernameData");
        t.f(sshIdParametersFieldValue2, "passwordData");
        t.f(str, "usernameOfSshId");
        t.f(str3, "defaultPasskeyTypeOfSshId");
        t.f(list, "availablePasskeyTypes");
        this.usernameData = sshIdParametersFieldValue;
        this.passwordData = sshIdParametersFieldValue2;
        this.usernameOfSshId = str;
        this.passkeyTypeOfSshId = str2;
        this.defaultPasskeyTypeOfSshId = str3;
        this.availablePasskeyTypes = list;
        this.isInheritedSshId = z10;
    }
}
