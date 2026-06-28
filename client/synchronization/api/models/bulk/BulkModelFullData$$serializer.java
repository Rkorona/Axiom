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
import iv.a;
import java.util.List;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class BulkModelFullData$$serializer implements n0 {
    public static final int $stable;
    public static final BulkModelFullData$$serializer INSTANCE;
    private static final f descriptor;

    static {
        BulkModelFullData$$serializer bulkModelFullData$$serializer = new BulkModelFullData$$serializer();
        INSTANCE = bulkModelFullData$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModelFullData", bulkModelFullData$$serializer, 23);
        i2Var.r(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME, true);
        i2Var.r("sshconfig_set", true);
        i2Var.r("telnetconfig_set", true);
        i2Var.r(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME, true);
        i2Var.r(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME, true);
        i2Var.r(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME, true);
        i2Var.r(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME, true);
        i2Var.r(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME, true);
        i2Var.r("taghost_set", true);
        i2Var.r("hostsnippet_set", true);
        i2Var.r("hostchain_set", true);
        i2Var.r(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME, true);
        i2Var.r(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME, true);
        i2Var.r(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME, true);
        i2Var.r("sshconfigidentity_set", true);
        i2Var.r("sharedsshconfigidentity_set", true);
        i2Var.r("telnetconfigidentity_set", true);
        i2Var.r("sharedtelnetconfigidentity_set", true);
        i2Var.r("multikey_set", true);
        i2Var.r(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME, true);
        i2Var.r(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME, true);
        i2Var.r("deleted_sets", true);
        i2Var.r("now", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private BulkModelFullData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = BulkModelFullData.$childSerializers;
        return new c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue(), nVarArr[3].getValue(), nVarArr[4].getValue(), nVarArr[5].getValue(), nVarArr[6].getValue(), nVarArr[7].getValue(), nVarArr[8].getValue(), nVarArr[9].getValue(), nVarArr[10].getValue(), nVarArr[11].getValue(), nVarArr[12].getValue(), nVarArr[13].getValue(), nVarArr[14].getValue(), nVarArr[15].getValue(), nVarArr[16].getValue(), nVarArr[17].getValue(), nVarArr[18].getValue(), nVarArr[19].getValue(), nVarArr[20].getValue(), DeleteSet$$serializer.INSTANCE, a.u(x2.f64817a)};
    }

    @Override // hv.b
    public final BulkModelFullData deserialize(kv.e eVar) {
        int i10;
        List list;
        List list2;
        DeleteSet deleteSet;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        String str;
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
        List list22;
        int i11;
        int i12;
        List list23;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = BulkModelFullData.$childSerializers;
        if (cVarD.l()) {
            List list24 = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            List list25 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), null);
            List list26 = (List) cVarD.i(fVar, 2, (b) nVarArr[2].getValue(), null);
            List list27 = (List) cVarD.i(fVar, 3, (b) nVarArr[3].getValue(), null);
            List list28 = (List) cVarD.i(fVar, 4, (b) nVarArr[4].getValue(), null);
            List list29 = (List) cVarD.i(fVar, 5, (b) nVarArr[5].getValue(), null);
            List list30 = (List) cVarD.i(fVar, 6, (b) nVarArr[6].getValue(), null);
            List list31 = (List) cVarD.i(fVar, 7, (b) nVarArr[7].getValue(), null);
            List list32 = (List) cVarD.i(fVar, 8, (b) nVarArr[8].getValue(), null);
            List list33 = (List) cVarD.i(fVar, 9, (b) nVarArr[9].getValue(), null);
            List list34 = (List) cVarD.i(fVar, 10, (b) nVarArr[10].getValue(), null);
            List list35 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), null);
            List list36 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), null);
            List list37 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), null);
            List list38 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), null);
            List list39 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), null);
            List list40 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), null);
            List list41 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), null);
            List list42 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), null);
            List list43 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), null);
            List list44 = (List) cVarD.i(fVar, 20, (b) nVarArr[20].getValue(), null);
            DeleteSet deleteSet2 = (DeleteSet) cVarD.i(fVar, 21, DeleteSet$$serializer.INSTANCE, null);
            i10 = 8388607;
            list3 = list44;
            str = (String) cVarD.v(fVar, 22, x2.f64817a, null);
            list = list24;
            list16 = list30;
            list15 = list29;
            list13 = list27;
            list18 = list32;
            list14 = list28;
            list12 = list26;
            list11 = list25;
            list17 = list31;
            list20 = list34;
            list19 = list33;
            list5 = list43;
            list4 = list42;
            list6 = list41;
            list7 = list40;
            list8 = list39;
            list2 = list38;
            list10 = list37;
            list9 = list36;
            list21 = list35;
            deleteSet = deleteSet2;
        } else {
            int i13 = 6;
            int i14 = 5;
            int i15 = 3;
            int i16 = 8;
            int i17 = 4;
            int i18 = 2;
            int i19 = 1;
            int i20 = 1;
            int i21 = 0;
            List list45 = null;
            List list46 = null;
            DeleteSet deleteSet3 = null;
            List list47 = null;
            List list48 = null;
            List list49 = null;
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
            int i22 = 10;
            int i23 = 9;
            int i24 = 7;
            i10 = 0;
            List list63 = null;
            List list64 = null;
            List list65 = null;
            String str2 = null;
            while (i20 != 0) {
                List list66 = list49;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        list23 = list65;
                        i20 = i21;
                        list45 = list45;
                        list49 = list66;
                        i19 = 1;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i21 = i20;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 0:
                        list23 = list65;
                        int i25 = i21;
                        list53 = (List) cVarD.i(fVar, i25, (b) nVarArr[i21].getValue(), list53);
                        i10 |= 1;
                        list45 = list45;
                        list54 = list54;
                        list49 = list66;
                        i19 = 1;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i21 = i25;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 1:
                        list23 = list65;
                        int i26 = i19;
                        list54 = (List) cVarD.i(fVar, i26, (b) nVarArr[i19].getValue(), list54);
                        i10 |= 2;
                        list45 = list45;
                        list55 = list55;
                        list49 = list66;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i19 = i26;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 2:
                        list23 = list65;
                        int i27 = i18;
                        list55 = (List) cVarD.i(fVar, i27, (b) nVarArr[i18].getValue(), list55);
                        i10 |= 4;
                        list45 = list45;
                        list56 = list56;
                        list49 = list66;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i18 = i27;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 3:
                        list23 = list65;
                        int i28 = i15;
                        list56 = (List) cVarD.i(fVar, i28, (b) nVarArr[i15].getValue(), list56);
                        i10 |= 8;
                        list45 = list45;
                        list57 = list57;
                        list49 = list66;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i15 = i28;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 4:
                        list23 = list65;
                        int i29 = i17;
                        list57 = (List) cVarD.i(fVar, i29, (b) nVarArr[i17].getValue(), list57);
                        i10 |= 16;
                        list45 = list45;
                        list58 = list58;
                        list49 = list66;
                        i14 = 5;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i17 = i29;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 5:
                        list23 = list65;
                        int i30 = i14;
                        list58 = (List) cVarD.i(fVar, i30, (b) nVarArr[i14].getValue(), list58);
                        i10 |= 32;
                        list45 = list45;
                        list59 = list59;
                        list49 = list66;
                        i13 = 6;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i14 = i30;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 6:
                        list23 = list65;
                        int i31 = i13;
                        list59 = (List) cVarD.i(fVar, i31, (b) nVarArr[i13].getValue(), list59);
                        i10 |= 64;
                        list45 = list45;
                        list60 = list60;
                        list49 = list66;
                        i24 = 7;
                        i16 = 8;
                        i23 = 9;
                        i13 = i31;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 7:
                        list23 = list65;
                        int i32 = i24;
                        list60 = (List) cVarD.i(fVar, i32, (b) nVarArr[i24].getValue(), list60);
                        i10 |= 128;
                        list45 = list45;
                        list61 = list61;
                        list49 = list66;
                        i16 = 8;
                        i23 = 9;
                        i24 = i32;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 8:
                        list23 = list65;
                        int i33 = i16;
                        list61 = (List) cVarD.i(fVar, i33, (b) nVarArr[i16].getValue(), list61);
                        i10 |= 256;
                        list45 = list45;
                        list62 = list62;
                        list49 = list66;
                        i23 = 9;
                        i16 = i33;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 9:
                        list23 = list65;
                        int i34 = i23;
                        list62 = (List) cVarD.i(fVar, i34, (b) nVarArr[i23].getValue(), list62);
                        i10 |= File.FLAG_O_TRUNC;
                        list45 = list45;
                        list49 = list66;
                        i23 = i34;
                        list65 = list23;
                        i22 = 10;
                        break;
                    case 10:
                        List list67 = list45;
                        List list68 = list65;
                        int i35 = i22;
                        list49 = (List) cVarD.i(fVar, i35, (b) nVarArr[i22].getValue(), list66);
                        i10 |= File.FLAG_O_APPEND;
                        i22 = i35;
                        list65 = list68;
                        list45 = list67;
                        break;
                    case 11:
                        i10 |= 2048;
                        list65 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), list65);
                        list45 = list45;
                        list49 = list66;
                        break;
                    case 12:
                        list22 = list65;
                        list64 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), list64);
                        i10 |= 4096;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 13:
                        list22 = list65;
                        list45 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), list45);
                        i10 |= 8192;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 14:
                        list22 = list65;
                        list46 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), list46);
                        i10 |= 16384;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 15:
                        list22 = list65;
                        list63 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), list63);
                        i11 = 32768;
                        i10 |= i11;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 16:
                        list22 = list65;
                        list52 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), list52);
                        i12 = LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
                        i10 |= i12;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 17:
                        list22 = list65;
                        list51 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), list51);
                        i11 = 131072;
                        i10 |= i11;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 18:
                        list22 = list65;
                        list48 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), list48);
                        i12 = 262144;
                        i10 |= i12;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 19:
                        list22 = list65;
                        list50 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), list50);
                        i11 = 524288;
                        i10 |= i11;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 20:
                        list22 = list65;
                        list47 = (List) cVarD.i(fVar, 20, (b) nVarArr[20].getValue(), list47);
                        i12 = 1048576;
                        i10 |= i12;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 21:
                        list22 = list65;
                        deleteSet3 = (DeleteSet) cVarD.i(fVar, 21, DeleteSet$$serializer.INSTANCE, deleteSet3);
                        i11 = 2097152;
                        i10 |= i11;
                        list49 = list66;
                        list65 = list22;
                        break;
                    case 22:
                        list22 = list65;
                        str2 = (String) cVarD.v(fVar, 22, x2.f64817a, str2);
                        i11 = 4194304;
                        i10 |= i11;
                        list49 = list66;
                        list65 = list22;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            list = list53;
            list2 = list46;
            deleteSet = deleteSet3;
            list3 = list47;
            list4 = list48;
            list5 = list50;
            list6 = list51;
            list7 = list52;
            list8 = list63;
            list9 = list64;
            str = str2;
            list10 = list45;
            list11 = list54;
            list12 = list55;
            list13 = list56;
            list14 = list57;
            list15 = list58;
            list16 = list59;
            list17 = list60;
            list18 = list61;
            list19 = list62;
            list20 = list49;
            list21 = list65;
        }
        int i36 = i10;
        cVarD.b(fVar);
        return new BulkModelFullData(i36, list, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, list9, list10, list2, list8, list7, list6, list4, list5, list3, deleteSet, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, BulkModelFullData bulkModelFullData) {
        t.f(fVar, "encoder");
        t.f(bulkModelFullData, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        BulkModelFullData.write$Self$Termius_app_googleProductionRelease(bulkModelFullData, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
