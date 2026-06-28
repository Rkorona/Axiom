package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class GroupChangePasswordModel$$serializer implements n0 {
    public static final int $stable;
    public static final GroupChangePasswordModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        GroupChangePasswordModel$$serializer groupChangePasswordModel$$serializer = new GroupChangePasswordModel$$serializer();
        INSTANCE = groupChangePasswordModel$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel", groupChangePasswordModel$$serializer, 6);
        i2Var.r("id", false);
        i2Var.r("label", true);
        i2Var.r("ssh_config", true);
        i2Var.r(Column.IS_SHARED, true);
        i2Var.r("encrypted_with", true);
        i2Var.r(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private GroupChangePasswordModel$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        h1 h1Var = h1.f64699a;
        x2 x2Var = x2.f64817a;
        return new c[]{h1Var, iv.a.u(x2Var), iv.a.u(GroupChangePasswordModel$SshConfig$$serializer.INSTANCE), iv.a.u(i.f64704a), iv.a.u(h1Var), x2Var};
    }

    @Override // hv.b
    public final GroupChangePasswordModel deserialize(kv.e eVar) {
        int i10;
        String str;
        GroupChangePasswordModel.SshConfig sshConfig;
        Boolean bool;
        Long l10;
        String strB;
        long j10;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        String str2 = null;
        if (cVarD.l()) {
            long jO = cVarD.o(fVar, 0);
            String str3 = (String) cVarD.v(fVar, 1, x2.f64817a, null);
            GroupChangePasswordModel.SshConfig sshConfig2 = (GroupChangePasswordModel.SshConfig) cVarD.v(fVar, 2, GroupChangePasswordModel$SshConfig$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) cVarD.v(fVar, 3, i.f64704a, null);
            Long l11 = (Long) cVarD.v(fVar, 4, h1.f64699a, null);
            str = str3;
            strB = cVarD.B(fVar, 5);
            bool = bool2;
            l10 = l11;
            sshConfig = sshConfig2;
            i10 = 63;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Long l12 = null;
            String strB2 = null;
            long jO2 = 0;
            GroupChangePasswordModel.SshConfig sshConfig3 = null;
            Boolean bool3 = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                switch (iD) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        jO2 = cVarD.o(fVar, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str2 = (String) cVarD.v(fVar, 1, x2.f64817a, str2);
                        i11 |= 2;
                        break;
                    case 2:
                        sshConfig3 = (GroupChangePasswordModel.SshConfig) cVarD.v(fVar, 2, GroupChangePasswordModel$SshConfig$$serializer.INSTANCE, sshConfig3);
                        i11 |= 4;
                        break;
                    case 3:
                        bool3 = (Boolean) cVarD.v(fVar, 3, i.f64704a, bool3);
                        i11 |= 8;
                        break;
                    case 4:
                        l12 = (Long) cVarD.v(fVar, 4, h1.f64699a, l12);
                        i11 |= 16;
                        break;
                    case 5:
                        strB2 = cVarD.B(fVar, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new e0(iD);
                }
            }
            i10 = i11;
            str = str2;
            sshConfig = sshConfig3;
            bool = bool3;
            l10 = l12;
            strB = strB2;
            j10 = jO2;
        }
        cVarD.b(fVar);
        return new GroupChangePasswordModel(i10, j10, str, sshConfig, bool, l10, strB, null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, GroupChangePasswordModel groupChangePasswordModel) {
        t.f(fVar, "encoder");
        t.f(groupChangePasswordModel, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        GroupChangePasswordModel.write$Self$Termius_app_googleProductionRelease(groupChangePasswordModel, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
