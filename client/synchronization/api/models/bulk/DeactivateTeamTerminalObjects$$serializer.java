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
import ut.e;
import ut.n;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class DeactivateTeamTerminalObjects$$serializer implements n0 {
    public static final int $stable;
    public static final DeactivateTeamTerminalObjects$$serializer INSTANCE;
    private static final f descriptor;

    static {
        DeactivateTeamTerminalObjects$$serializer deactivateTeamTerminalObjects$$serializer = new DeactivateTeamTerminalObjects$$serializer();
        INSTANCE = deactivateTeamTerminalObjects$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.bulk.DeactivateTeamTerminalObjects", deactivateTeamTerminalObjects$$serializer, 18);
        i2Var.r(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME, false);
        i2Var.r("sshconfig_set", false);
        i2Var.r("telnetconfig_set", false);
        i2Var.r(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME, false);
        i2Var.r(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME, false);
        i2Var.r(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME, false);
        i2Var.r(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME, false);
        i2Var.r("taghost_set", false);
        i2Var.r("hostsnippet_set", false);
        i2Var.r(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME, false);
        i2Var.r(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME, false);
        i2Var.r(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME, false);
        i2Var.r(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME, false);
        i2Var.r("hostchain_set", false);
        i2Var.r(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME, false);
        i2Var.r(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME, false);
        i2Var.r("sshconfigidentity_set", false);
        i2Var.r("telnetconfigidentity_set", false);
        descriptor = i2Var;
        $stable = 8;
    }

    private DeactivateTeamTerminalObjects$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.n0
    public final c[] childSerializers() {
        n[] nVarArr = DeactivateTeamTerminalObjects.$childSerializers;
        return new c[]{nVarArr[0].getValue(), nVarArr[1].getValue(), nVarArr[2].getValue(), nVarArr[3].getValue(), nVarArr[4].getValue(), nVarArr[5].getValue(), nVarArr[6].getValue(), nVarArr[7].getValue(), nVarArr[8].getValue(), nVarArr[9].getValue(), nVarArr[10].getValue(), nVarArr[11].getValue(), nVarArr[12].getValue(), nVarArr[13].getValue(), nVarArr[14].getValue(), nVarArr[15].getValue(), nVarArr[16].getValue(), nVarArr[17].getValue()};
    }

    @Override // hv.b
    public final DeactivateTeamTerminalObjects deserialize(kv.e eVar) {
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
        n[] nVarArr = DeactivateTeamTerminalObjects.$childSerializers;
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
            i10 = 262143;
            list13 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), null);
            list8 = list31;
            list11 = list27;
            list5 = list25;
            list18 = list24;
            list12 = (List) cVarD.i(fVar, 17, (b) nVarArr[17].getValue(), null);
            list7 = list33;
            list2 = list32;
            list9 = list30;
            list10 = list29;
            list3 = list28;
            list4 = list26;
            list14 = list38;
            list15 = list37;
            list16 = list36;
            list17 = list35;
            list6 = list34;
        } else {
            int i11 = 17;
            int i12 = 8;
            int i13 = 4;
            int i14 = 2;
            int i15 = 1;
            boolean z10 = true;
            List list39 = null;
            List list40 = null;
            List list41 = null;
            List list42 = null;
            List list43 = null;
            List list44 = null;
            List list45 = null;
            List list46 = null;
            List list47 = null;
            List list48 = null;
            List list49 = null;
            int i16 = 10;
            int i17 = 9;
            int i18 = 7;
            int i19 = 6;
            int i20 = 5;
            int i21 = 3;
            i10 = 0;
            List list50 = null;
            List list51 = null;
            List list52 = null;
            List list53 = null;
            List list54 = null;
            List list55 = null;
            List list56 = null;
            while (z10) {
                int i22 = i11;
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        list19 = list39;
                        list20 = list49;
                        list21 = list50;
                        z10 = false;
                        list50 = list21;
                        i11 = 17;
                        i15 = 1;
                        i14 = 2;
                        i21 = 3;
                        i13 = 4;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        list49 = list20;
                        list39 = list19;
                        break;
                    case 0:
                        list19 = list39;
                        List list57 = list50;
                        b bVar = (b) nVarArr[0].getValue();
                        List list58 = list49;
                        list21 = list57;
                        list20 = (List) cVarD.i(fVar, 0, bVar, list58);
                        i10 |= 1;
                        list50 = list21;
                        i11 = 17;
                        i15 = 1;
                        i14 = 2;
                        i21 = 3;
                        i13 = 4;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        list49 = list20;
                        list39 = list19;
                        break;
                    case 1:
                        List list59 = list50;
                        list19 = list39;
                        b bVar2 = (b) nVarArr[i15].getValue();
                        int i23 = i15;
                        List list60 = (List) cVarD.i(fVar, i23, bVar2, list59);
                        i10 |= 2;
                        list44 = list44;
                        i11 = 17;
                        i14 = 2;
                        i21 = 3;
                        i13 = 4;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        i15 = i23;
                        list50 = list60;
                        list39 = list19;
                        break;
                    case 2:
                        list43 = (List) cVarD.i(fVar, i14, (b) nVarArr[i14].getValue(), list43);
                        i10 |= 4;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i21 = 3;
                        i13 = 4;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 3:
                        list42 = (List) cVarD.i(fVar, i21, (b) nVarArr[i21].getValue(), list42);
                        i10 |= 8;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i13 = 4;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 4:
                        list56 = (List) cVarD.i(fVar, i13, (b) nVarArr[i13].getValue(), list56);
                        i10 |= 16;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i20 = 5;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 5:
                        list41 = (List) cVarD.i(fVar, i20, (b) nVarArr[i20].getValue(), list41);
                        i10 |= 32;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i19 = 6;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 6:
                        list55 = (List) cVarD.i(fVar, i19, (b) nVarArr[i19].getValue(), list55);
                        i10 |= 64;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i18 = 7;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 7:
                        list54 = (List) cVarD.i(fVar, i18, (b) nVarArr[i18].getValue(), list54);
                        i10 |= 128;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i12 = 8;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 8:
                        list53 = (List) cVarD.i(fVar, i12, (b) nVarArr[i12].getValue(), list53);
                        i10 |= 256;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 9:
                        list40 = (List) cVarD.i(fVar, i17, (b) nVarArr[i17].getValue(), list40);
                        i10 |= File.FLAG_O_TRUNC;
                        list39 = list39;
                        list50 = list50;
                        i11 = 17;
                        i16 = 10;
                        break;
                    case 10:
                        list22 = list50;
                        list23 = list39;
                        list52 = (List) cVarD.i(fVar, i16, (b) nVarArr[i16].getValue(), list52);
                        i10 |= File.FLAG_O_APPEND;
                        list39 = list23;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 11:
                        list22 = list50;
                        list23 = list39;
                        list51 = (List) cVarD.i(fVar, 11, (b) nVarArr[11].getValue(), list51);
                        i10 |= 2048;
                        list39 = list23;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 12:
                        list22 = list50;
                        list44 = (List) cVarD.i(fVar, 12, (b) nVarArr[12].getValue(), list44);
                        i10 |= 4096;
                        list39 = list39;
                        list45 = list45;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 13:
                        list22 = list50;
                        list45 = (List) cVarD.i(fVar, 13, (b) nVarArr[13].getValue(), list45);
                        i10 |= 8192;
                        list39 = list39;
                        list46 = list46;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 14:
                        list22 = list50;
                        list46 = (List) cVarD.i(fVar, 14, (b) nVarArr[14].getValue(), list46);
                        i10 |= 16384;
                        list39 = list39;
                        list47 = list47;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 15:
                        list22 = list50;
                        list47 = (List) cVarD.i(fVar, 15, (b) nVarArr[15].getValue(), list47);
                        i10 |= 32768;
                        list39 = list39;
                        list48 = list48;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 16:
                        list22 = list50;
                        list23 = list39;
                        list48 = (List) cVarD.i(fVar, 16, (b) nVarArr[16].getValue(), list48);
                        i10 |= LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
                        list39 = list23;
                        list50 = list22;
                        i11 = 17;
                        break;
                    case 17:
                        list39 = (List) cVarD.i(fVar, i22, (b) nVarArr[i22].getValue(), list39);
                        i10 |= 131072;
                        i11 = i22;
                        list50 = list50;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            List list61 = list39;
            list = list49;
            list2 = list40;
            list3 = list41;
            list4 = list42;
            list5 = list43;
            list6 = list51;
            list7 = list52;
            list8 = list53;
            list9 = list54;
            list10 = list55;
            list11 = list56;
            list12 = list61;
            list13 = list48;
            list14 = list47;
            list15 = list46;
            list16 = list45;
            list17 = list44;
            list18 = list50;
        }
        List list62 = list;
        int i24 = i10;
        cVarD.b(fVar);
        return new DeactivateTeamTerminalObjects(i24, list62, list18, list5, list4, list11, list3, list10, list9, list8, list2, list7, list6, list17, list16, list15, list14, list13, list12, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, DeactivateTeamTerminalObjects deactivateTeamTerminalObjects) {
        t.f(fVar, "encoder");
        t.f(deactivateTeamTerminalObjects, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        DeactivateTeamTerminalObjects.write$Self$Termius_app_googleProductionRelease(deactivateTeamTerminalObjects, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
