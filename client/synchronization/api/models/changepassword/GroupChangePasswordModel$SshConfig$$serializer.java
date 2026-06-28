package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel;
import hv.c;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.d;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.e;

/* JADX INFO: loaded from: classes4.dex */
@e
public /* synthetic */ class GroupChangePasswordModel$SshConfig$$serializer implements n0 {
    public static final int $stable;
    public static final GroupChangePasswordModel$SshConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        GroupChangePasswordModel$SshConfig$$serializer groupChangePasswordModel$SshConfig$$serializer = new GroupChangePasswordModel$SshConfig$$serializer();
        INSTANCE = groupChangePasswordModel$SshConfig$$serializer;
        i2 i2Var = new i2("com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel.SshConfig", groupChangePasswordModel$SshConfig$$serializer, 1);
        i2Var.r(Column.ENVIRONMENT_VARIABLES, true);
        descriptor = i2Var;
        $stable = 8;
    }

    private GroupChangePasswordModel$SshConfig$$serializer() {
    }

    @Override // lv.n0
    public final c[] childSerializers() {
        return new c[]{iv.a.u(x2.f64817a)};
    }

    @Override // hv.b
    public final GroupChangePasswordModel.SshConfig deserialize(kv.e eVar) {
        String str;
        t.f(eVar, "decoder");
        f fVar = descriptor;
        kv.c cVarD = eVar.d(fVar);
        int i10 = 1;
        if (cVarD.l()) {
            str = (String) cVarD.v(fVar, 0, x2.f64817a, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            while (z10) {
                int iD = cVarD.D(fVar);
                if (iD == -1) {
                    z10 = false;
                } else {
                    if (iD != 0) {
                        throw new e0(iD);
                    }
                    str = (String) cVarD.v(fVar, 0, x2.f64817a, str);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarD.b(fVar);
        return new GroupChangePasswordModel.SshConfig(i10, str, (s2) null);
    }

    @Override // hv.c, hv.r, hv.b
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // hv.r
    public final void serialize(kv.f fVar, GroupChangePasswordModel.SshConfig sshConfig) {
        t.f(fVar, "encoder");
        t.f(sshConfig, SerializableEvent.VALUE_FIELD);
        f fVar2 = descriptor;
        d dVarD = fVar.d(fVar2);
        GroupChangePasswordModel.SshConfig.write$Self$Termius_app_googleProductionRelease(sshConfig, dVarD, fVar2);
        dVarD.b(fVar2);
    }

    @Override // lv.n0
    public c[] typeParametersSerializers() {
        return n0.a.a(this);
    }
}
