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
import lv.i2;
import lv.n0;
import lv.s2;
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DeleteSet$$serializer implements n0 {
    public static final int $stable;
    public static final DeleteSet$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DeleteSet$$serializer deleteSet$$serializer = new DeleteSet$$serializer();
        INSTANCE = deleteSet$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet", deleteSet$$serializer, 21);
        i2Var.r(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME, true);
        i2Var.r(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME, true);
        i2Var.r("taghost_set", true);
        i2Var.r(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME, true);
        i2Var.r(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME, true);
        i2Var.r("sshconfig_set", true);
        i2Var.r("telnetconfig_set", true);
        i2Var.r(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME, true);
        i2Var.r(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME, true);
        i2Var.r(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME, true);
        i2Var.r(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME, true);
        i2Var.r(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME, true);
        i2Var.r(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME, true);
        i2Var.r(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME, true);
        i2Var.r("hostsnippet_set", true);
        i2Var.r("hostchain_set", true);
        i2Var.r("sshconfigidentity_set", true);
        i2Var.r("telnetconfigidentity_set", true);
        i2Var.r("multikey_set", true);
        i2Var.r("sharedsshconfigidentity_set", true);
        i2Var.r("sharedtelnetconfigidentity_set", true);
        descriptor = i2Var;
        $stable = 8;
    }

    private DeleteSet$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = DeleteSet.$childSerializers;
        return new c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue(), nVarArr[3].getValue(), nVarArr[4].getValue(), nVarArr[5].getValue(), nVarArr[6].getValue(), nVarArr[7].getValue(), nVarArr[8].getValue(), nVarArr[9].getValue(), nVarArr[10].getValue(), nVarArr[11].getValue(), nVarArr[12].getValue(), nVarArr[13].getValue(), nVarArr[14].getValue(), nVarArr[15].getValue(), nVarArr[16].getValue(), nVarArr[17].getValue(), nVarArr[18].getValue(), nVarArr[19].getValue(), nVarArr[20].getValue()};
    }

    @Override // hv.b
    public final DeleteSet deserialize(kv.e eVar) {
        int i10;
        List list;
        List list2;
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
        List list22;
        List list23;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        n[] nVarArr = DeleteSet.$childSerializers;
        if (cVarD.l()) {
            list = (List) cVarD.i(fVar, 0, (b) nVarArr[0].getValue(), null);
            List list24 = (List) cVarD.i(fVar, 1, (b) nVarArr[1].getValue(), null);
            List list25 = (List) cVarD.i(fVar, 2, (b) nVarArr[2].getValue(), null);
            List list26 = (List) cVarD.i(fVar, 3, (b) nVarArr[3].getValue(), null);
            List list27 = (List) cVarD.i(fVar, 4, (b) nVarArr[4].getValue(), null);
            List list28 = (List) cVarD.i(fVar, 5, (b) nVarArr[5].getValue(), null);
            List list29 = (List) cVarD.i(fVar, 6, (b) nVarArr[6].getValue(), null);
            List list30 = (List) cVarD.i(fVar, 7, (b) nVarArr[7].getValue(), null);
            List list31 = (List) cVarD.i(fVar, 8, (b) nVarArr[8].getValue(), null);
            List list32 = (List) cVarD.i(fVar, 9, (b) nVarArr[9].getValue(), null);
            List list33 = (List) cVarD.i(fVar, 10, (b) nVarArr[10].getValue(), null);
            List list34 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), null);
            List list35 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), null);
            List list36 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), null);
            List list37 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), null);
            List list38 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), null);
            List list39 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), null);
            List list40 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), null);
            List list41 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), null);
            i10 = 2097151;
            list13 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), null);
            list3 = list29;
            list6 = list28;
            list7 = list26;
            list11 = list31;
            list4 = list27;
            list8 = list25;
            list21 = list24;
            list12 = (List) cVarD.i(fVar, 20, (b) nVarArr[20].getValue(), null);
            list10 = list33;
            list5 = list32;
            list2 = list30;
            list14 = list41;
            list15 = list40;
            list16 = list39;
            list17 = list38;
            list18 = list37;
            list19 = list36;
            list20 = list35;
            list9 = list34;
        } else {
            int i11 = 20;
            int i12 = 0;
            int i13 = 6;
            int i14 = 5;
            int i15 = 3;
            int i16 = 8;
            int i17 = 4;
            int i18 = 2;
            int i19 = 1;
            int i20 = 1;
            List list42 = null;
            List list43 = null;
            List list44 = null;
            List list45 = null;
            List list46 = null;
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
            int i21 = 10;
            int i22 = 9;
            int i23 = 7;
            i10 = 0;
            List list59 = null;
            List list60 = null;
            List list61 = null;
            List list62 = null;
            while (i20 != 0) {
                int i24 = i11;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        i20 = i12;
                        i11 = 20;
                        i19 = 1;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        list58 = list58;
                        list42 = list42;
                        break;
                    case 0:
                        int i25 = i12;
                        i10 |= 1;
                        list58 = (List) cVarD.i(fVar, i25, (b) nVarArr[i12].getValue(), list58);
                        list59 = list59;
                        i12 = i25;
                        list42 = list42;
                        i11 = 20;
                        i19 = 1;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 1:
                        int i26 = i19;
                        list59 = (List) cVarD.i(fVar, i26, (b) nVarArr[i19].getValue(), list59);
                        i10 |= 2;
                        list42 = list42;
                        list50 = list50;
                        i18 = 2;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        i19 = i26;
                        i11 = 20;
                        break;
                    case 2:
                        list49 = (List) cVarD.i(fVar, i18, (b) nVarArr[i18].getValue(), list49);
                        i10 |= 4;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i15 = 3;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 3:
                        list48 = (List) cVarD.i(fVar, i15, (b) nVarArr[i15].getValue(), list48);
                        i10 |= 8;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i17 = 4;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 4:
                        list45 = (List) cVarD.i(fVar, i17, (b) nVarArr[i17].getValue(), list45);
                        i10 |= 16;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i14 = 5;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 5:
                        list47 = (List) cVarD.i(fVar, i14, (b) nVarArr[i14].getValue(), list47);
                        i10 |= 32;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i13 = 6;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 6:
                        list44 = (List) cVarD.i(fVar, i13, (b) nVarArr[i13].getValue(), list44);
                        i10 |= 64;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i23 = 7;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 7:
                        list43 = (List) cVarD.i(fVar, i23, (b) nVarArr[i23].getValue(), list43);
                        i10 |= 128;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i16 = 8;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 8:
                        list62 = (List) cVarD.i(fVar, i16, (b) nVarArr[i16].getValue(), list62);
                        i10 |= 256;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i22 = 9;
                        i21 = 10;
                        break;
                    case 9:
                        list46 = (List) cVarD.i(fVar, i22, (b) nVarArr[i22].getValue(), list46);
                        i10 |= File.FLAG_O_TRUNC;
                        list42 = list42;
                        list59 = list59;
                        i11 = 20;
                        i21 = 10;
                        break;
                    case 10:
                        list22 = list59;
                        list23 = list42;
                        list61 = (List) cVarD.i(fVar, i21, (b) nVarArr[i21].getValue(), list61);
                        i10 |= File.FLAG_O_APPEND;
                        list42 = list23;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 11:
                        list22 = list59;
                        list23 = list42;
                        list60 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), list60);
                        i10 |= 2048;
                        list42 = list23;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 12:
                        list22 = list59;
                        list50 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), list50);
                        i10 |= 4096;
                        list42 = list42;
                        list51 = list51;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 13:
                        list22 = list59;
                        list51 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), list51);
                        i10 |= 8192;
                        list42 = list42;
                        list52 = list52;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 14:
                        list22 = list59;
                        list52 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), list52);
                        i10 |= 16384;
                        list42 = list42;
                        list53 = list53;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 15:
                        list22 = list59;
                        list53 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), list53);
                        i10 |= 32768;
                        list42 = list42;
                        list54 = list54;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 16:
                        list22 = list59;
                        list54 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), list54);
                        i10 |= LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
                        list42 = list42;
                        list55 = list55;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 17:
                        list22 = list59;
                        list55 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), list55);
                        i10 |= 131072;
                        list42 = list42;
                        list56 = list56;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 18:
                        list22 = list59;
                        list56 = (List) cVarD.i(fVar, 18, (b) nVarArr[18].getValue(), list56);
                        i10 |= 262144;
                        list42 = list42;
                        list57 = list57;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 19:
                        list22 = list59;
                        list23 = list42;
                        list57 = (List) cVarD.i(fVar, 19, (b) nVarArr[19].getValue(), list57);
                        i10 |= 524288;
                        list42 = list23;
                        list59 = list22;
                        i11 = 20;
                        break;
                    case 20:
                        list42 = (List) cVarD.i(fVar, i24, (b) nVarArr[i24].getValue(), list42);
                        i10 |= 1048576;
                        i11 = i24;
                        list59 = list59;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            List list63 = list42;
            list = list58;
            list2 = list43;
            list3 = list44;
            list4 = list45;
            list5 = list46;
            list6 = list47;
            list7 = list48;
            list8 = list49;
            list9 = list60;
            list10 = list61;
            list11 = list62;
            list12 = list63;
            list13 = list57;
            list14 = list56;
            list15 = list55;
            list16 = list54;
            list17 = list53;
            list18 = list52;
            list19 = list51;
            list20 = list50;
            list21 = list59;
        }
        List list64 = list;
        int i27 = i10;
        cVarD.b(fVar);
        return new DeleteSet(i27, list64, list21, list8, list7, list4, list6, list3, list2, list11, list5, list10, list9, list20, list19, list18, list17, list16, list15, list14, list13, list12, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DeleteSet deleteSet) {
        t.f(fVar, "encoder");
        t.f(deleteSet, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        DeleteSet.write$Self$Termius_app_googleProductionRelease(deleteSet, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
