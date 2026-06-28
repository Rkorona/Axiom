package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.HostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.IdentityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.KnownHostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.PackageChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ProxyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.RuleChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SnippetChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshCertificateChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshKeyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.TagChangePasswordModel;
import hv.b;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class BulkModel$$serializer implements n0 {
    public static final int $stable;
    public static final BulkModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        BulkModel$$serializer bulkModel$$serializer = new BulkModel$$serializer();
        INSTANCE = bulkModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModel", bulkModel$$serializer, 24);
        i2Var.r("full_dataset", false);
        i2Var.r(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME, false);
        i2Var.r("sshconfig_set", false);
        i2Var.r("telnetconfig_set", false);
        i2Var.r(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME, false);
        i2Var.r(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME, false);
        i2Var.r(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME, false);
        i2Var.r(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME, false);
        i2Var.r(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME, false);
        i2Var.r(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME, false);
        i2Var.r(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME, false);
        i2Var.r("taghost_set", false);
        i2Var.r("hostsnippet_set", false);
        i2Var.r("hostchain_set", false);
        i2Var.r(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME, false);
        i2Var.r(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME, false);
        i2Var.r(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME, false);
        i2Var.r("sshconfigidentity_set", false);
        i2Var.r("telnetconfigidentity_set", false);
        i2Var.r("multikey_set", false);
        i2Var.r("sharedsshconfigidentity_set", false);
        i2Var.r("sharedtelnetconfigidentity_set", false);
        i2Var.r("delete_sets", false);
        i2Var.r("last_synced", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private BulkModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = BulkModel.$childSerializers;
        return new c[]{i.f64704a, nVarArr[1].getValue(), nVarArr[2].getValue(), nVarArr[3].getValue(), nVarArr[4].getValue(), nVarArr[5].getValue(), nVarArr[6].getValue(), nVarArr[7].getValue(), nVarArr[8].getValue(), nVarArr[9].getValue(), nVarArr[10].getValue(), nVarArr[11].getValue(), nVarArr[12].getValue(), nVarArr[13].getValue(), nVarArr[14].getValue(), nVarArr[15].getValue(), nVarArr[16].getValue(), nVarArr[17].getValue(), nVarArr[18].getValue(), nVarArr[19].getValue(), nVarArr[20].getValue(), nVarArr[21].getValue(), DeleteSet$$serializer.INSTANCE, x2.f64817a};
    }

    @Override // hv.b
    public final BulkModel deserialize(kv.e eVar) {
        List list;
        List list2;
        int i10;
        DeleteSet deleteSet;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        List list17;
        List list18;
        List list19;
        List list20;
        List list21;
        boolean z10;
        String strB;
        List list22;
        List list23;
        int i11;
        List list24;
        List list25;
        int i12;
        int i13;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = BulkModel.$childSerializers;
        List list26 = null;
        if (cVarD.l()) {
            boolean zH = cVarD.H(fVar, 0);
            List list27 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), null);
            List list28 = (List) cVarD.i(fVar, 2, (b) nVarArr[2].getValue(), null);
            List list29 = (List) cVarD.i(fVar, 3, (b) nVarArr[3].getValue(), null);
            List list30 = (List) cVarD.i(fVar, 4, (b) nVarArr[4].getValue(), null);
            List list31 = (List) cVarD.i(fVar, 5, (b) nVarArr[5].getValue(), null);
            List list32 = (List) cVarD.i(fVar, 6, (b) nVarArr[6].getValue(), null);
            List list33 = (List) cVarD.i(fVar, 7, (b) nVarArr[7].getValue(), null);
            List list34 = (List) cVarD.i(fVar, 8, (b) nVarArr[8].getValue(), null);
            List list35 = (List) cVarD.i(fVar, 9, (b) nVarArr[9].getValue(), null);
            List list36 = (List) cVarD.i(fVar, 10, (b) nVarArr[10].getValue(), null);
            List list37 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), null);
            List list38 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), null);
            List list39 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), null);
            List list40 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), null);
            List list41 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), null);
            List list42 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), null);
            List list43 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), null);
            List list44 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), null);
            List list45 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), null);
            List list46 = (List) cVarD.i(fVar, 20, (b) nVarArr[20].getValue(), null);
            List list47 = (List) cVarD.i(fVar, 21, (b) nVarArr[21].getValue(), null);
            list3 = list46;
            deleteSet = (DeleteSet) cVarD.i(fVar, 22, DeleteSet$$serializer.INSTANCE, null);
            z10 = zH;
            list16 = list32;
            list15 = list31;
            list13 = list29;
            list18 = list34;
            list14 = list30;
            list12 = list28;
            list = list27;
            list17 = list33;
            strB = cVarD.B(fVar, 23);
            list20 = list36;
            list19 = list35;
            i10 = 16777215;
            list5 = list45;
            list6 = list44;
            list7 = list43;
            list11 = list42;
            list8 = list41;
            list2 = list40;
            list9 = list39;
            list10 = list38;
            list21 = list37;
            list4 = list47;
        } else {
            int i14 = 6;
            int i15 = 5;
            int i16 = 3;
            int i17 = 8;
            int i18 = 4;
            int i19 = 2;
            int i20 = 1;
            boolean z11 = true;
            int i21 = 0;
            boolean zH2 = false;
            List list48 = null;
            List list49 = null;
            DeleteSet deleteSet2 = null;
            List list50 = null;
            List list51 = null;
            List list52 = null;
            List list53 = null;
            List list54 = null;
            List list55 = null;
            List list56 = null;
            List list57 = null;
            List list58 = null;
            List list59 = null;
            List list60 = null;
            List list61 = null;
            List list62 = null;
            List list63 = null;
            String strB2 = null;
            List list64 = null;
            int i22 = 10;
            int i23 = 9;
            int i24 = 7;
            List list65 = null;
            List list66 = null;
            List list67 = null;
            while (z11) {
                List list68 = list67;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        list22 = list48;
                        list23 = list51;
                        i11 = i20;
                        list24 = list68;
                        z11 = false;
                        list48 = list22;
                        list51 = list23;
                        i19 = 2;
                        i16 = 3;
                        i18 = 4;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i20 = i11;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 0:
                        list22 = list48;
                        list23 = list51;
                        i11 = i20;
                        list24 = list68;
                        zH2 = cVarD.H(fVar, 0);
                        i21 |= 1;
                        list48 = list22;
                        list51 = list23;
                        i19 = 2;
                        i16 = 3;
                        i18 = 4;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i20 = i11;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 1:
                        list23 = list51;
                        list24 = list68;
                        i11 = i20;
                        list56 = (List) cVarD.i(fVar, i11, (b) nVarArr[i20].getValue(), list56);
                        i21 |= 2;
                        list48 = list48;
                        list57 = list57;
                        list51 = list23;
                        i19 = 2;
                        i16 = 3;
                        i18 = 4;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i20 = i11;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 2:
                        list24 = list68;
                        int i25 = i19;
                        list57 = (List) cVarD.i(fVar, i25, (b) nVarArr[i19].getValue(), list57);
                        i21 |= 4;
                        list48 = list48;
                        list58 = list58;
                        list51 = list51;
                        i16 = 3;
                        i18 = 4;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i19 = i25;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 3:
                        list24 = list68;
                        int i26 = i16;
                        list58 = (List) cVarD.i(fVar, i26, (b) nVarArr[i16].getValue(), list58);
                        i21 |= 8;
                        list48 = list48;
                        list59 = list59;
                        list51 = list51;
                        i18 = 4;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i16 = i26;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 4:
                        list24 = list68;
                        int i27 = i18;
                        list59 = (List) cVarD.i(fVar, i27, (b) nVarArr[i18].getValue(), list59);
                        i21 |= 16;
                        list48 = list48;
                        list60 = list60;
                        list51 = list51;
                        i15 = 5;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i18 = i27;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 5:
                        list24 = list68;
                        int i28 = i15;
                        list60 = (List) cVarD.i(fVar, i28, (b) nVarArr[i15].getValue(), list60);
                        i21 |= 32;
                        list48 = list48;
                        list61 = list61;
                        list51 = list51;
                        i14 = 6;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i15 = i28;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 6:
                        list24 = list68;
                        int i29 = i14;
                        list61 = (List) cVarD.i(fVar, i29, (b) nVarArr[i14].getValue(), list61);
                        i21 |= 64;
                        list48 = list48;
                        list62 = list62;
                        list51 = list51;
                        i24 = 7;
                        i17 = 8;
                        i22 = 10;
                        i14 = i29;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 7:
                        list24 = list68;
                        int i30 = i24;
                        list62 = (List) cVarD.i(fVar, i30, (b) nVarArr[i24].getValue(), list62);
                        i21 |= 128;
                        list48 = list48;
                        list63 = list63;
                        list51 = list51;
                        i17 = 8;
                        i22 = 10;
                        i24 = i30;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 8:
                        list24 = list68;
                        int i31 = i17;
                        list63 = (List) cVarD.i(fVar, i31, (b) nVarArr[i17].getValue(), list63);
                        i21 |= 256;
                        list48 = list48;
                        list64 = list64;
                        list51 = list51;
                        i22 = 10;
                        i17 = i31;
                        list67 = list24;
                        i23 = 9;
                        break;
                    case 9:
                        int i32 = i23;
                        list64 = (List) cVarD.i(fVar, i32, (b) nVarArr[i23].getValue(), list64);
                        i21 |= File.FLAG_O_TRUNC;
                        i23 = i32;
                        list67 = list68;
                        list48 = list48;
                        list51 = list51;
                        i22 = 10;
                        break;
                    case 10:
                        List list69 = list48;
                        int i33 = i22;
                        List list70 = (List) cVarD.i(fVar, i33, (b) nVarArr[i22].getValue(), list68);
                        i21 |= File.FLAG_O_APPEND;
                        list51 = list51;
                        i22 = i33;
                        list67 = list70;
                        list48 = list69;
                        break;
                    case 11:
                        list51 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), list51);
                        i21 |= 2048;
                        list48 = list48;
                        list67 = list68;
                        break;
                    case 12:
                        list25 = list51;
                        list66 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), list66);
                        i21 |= 4096;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 13:
                        list25 = list51;
                        list65 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), list65);
                        i21 |= 8192;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 14:
                        list25 = list51;
                        list49 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), list49);
                        i21 |= 16384;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 15:
                        list25 = list51;
                        list26 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), list26);
                        i12 = 32768;
                        i21 |= i12;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 16:
                        list25 = list51;
                        list48 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), list48);
                        i13 = LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
                        i21 |= i13;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 17:
                        list25 = list51;
                        list55 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), list55);
                        i12 = 131072;
                        i21 |= i12;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 18:
                        list25 = list51;
                        list54 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), list54);
                        i13 = 262144;
                        i21 |= i13;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 19:
                        list25 = list51;
                        list53 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), list53);
                        i12 = 524288;
                        i21 |= i12;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 20:
                        list25 = list51;
                        list50 = (List) cVarD.i(fVar, 20, (b) nVarArr[20].getValue(), list50);
                        i13 = 1048576;
                        i21 |= i13;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 21:
                        list25 = list51;
                        list52 = (List) cVarD.i(fVar, 21, (b) nVarArr[21].getValue(), list52);
                        i12 = 2097152;
                        i21 |= i12;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 22:
                        list25 = list51;
                        deleteSet2 = (DeleteSet) cVarD.i(fVar, 22, DeleteSet$$serializer.INSTANCE, deleteSet2);
                        i12 = 4194304;
                        i21 |= i12;
                        list67 = list68;
                        list51 = list25;
                        break;
                    case 23:
                        strB2 = cVarD.B(fVar, 23);
                        i21 |= 8388608;
                        list67 = list68;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            list = list56;
            list2 = list49;
            i10 = i21;
            deleteSet = deleteSet2;
            list3 = list50;
            list4 = list52;
            list5 = list53;
            list6 = list54;
            list7 = list55;
            list8 = list26;
            list9 = list65;
            list10 = list66;
            list11 = list48;
            list12 = list57;
            list13 = list58;
            list14 = list59;
            list15 = list60;
            list16 = list61;
            list17 = list62;
            list18 = list63;
            list19 = list64;
            list20 = list67;
            list21 = list51;
            z10 = zH2;
            strB = strB2;
        }
        cVarD.b(fVar);
        return new BulkModel(i10, z10, list, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, list10, list9, list2, list8, list11, list7, list6, list5, list3, list4, deleteSet, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, BulkModel bulkModel) {
        t.f(fVar, "encoder");
        t.f(bulkModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        BulkModel.write$Self$Termius_app_googleProductionRelease(bulkModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
