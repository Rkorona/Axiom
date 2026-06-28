package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.user.TeamPublicKeysByDevices;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamPublicKeysByDevices {
    private static final n[] $childSerializers;
    private final List<TeamPublicKeyDevice> devices;
    private final List<TeamPublicKey> publicKey;
    private final List<TeamPublicKeyUser> users;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamPublicKeysByDevices$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: gn.e
            @Override // iu.a
            public final Object a() {
                return TeamPublicKeysByDevices._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: gn.f
            @Override // iu.a
            public final Object a() {
                return TeamPublicKeysByDevices._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: gn.g
            @Override // iu.a
            public final Object a() {
                return TeamPublicKeysByDevices._childSerializers$_anonymous_$1();
            }
        })};
    }

    public /* synthetic */ TeamPublicKeysByDevices(int i10, List list, List list2, List list3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, TeamPublicKeysByDevices$$serializer.INSTANCE.getDescriptor());
        }
        this.users = list;
        this.devices = list2;
        this.publicKey = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(TeamPublicKeyUser$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(TeamPublicKeyDevice$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$1() {
        return new f(TeamPublicKey$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPublicKeysByDevices copy$default(TeamPublicKeysByDevices teamPublicKeysByDevices, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamPublicKeysByDevices.users;
        }
        if ((i10 & 2) != 0) {
            list2 = teamPublicKeysByDevices.devices;
        }
        if ((i10 & 4) != 0) {
            list3 = teamPublicKeysByDevices.publicKey;
        }
        return teamPublicKeysByDevices.copy(list, list2, list3);
    }

    @hv.o("devices")
    public static /* synthetic */ void getDevices$annotations() {
    }

    @hv.o("public_keys")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @hv.o("users")
    public static /* synthetic */ void getUsers$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamPublicKeysByDevices teamPublicKeysByDevices, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), teamPublicKeysByDevices.users);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), teamPublicKeysByDevices.devices);
        dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), teamPublicKeysByDevices.publicKey);
    }

    public final List<TeamPublicKeyUser> component1() {
        return this.users;
    }

    public final List<TeamPublicKeyDevice> component2() {
        return this.devices;
    }

    public final List<TeamPublicKey> component3() {
        return this.publicKey;
    }

    public final TeamPublicKeysByDevices copy(List<TeamPublicKeyUser> list, List<TeamPublicKeyDevice> list2, List<TeamPublicKey> list3) {
        t.f(list, "users");
        t.f(list2, "devices");
        t.f(list3, Column.KEY_PUBLIC);
        return new TeamPublicKeysByDevices(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPublicKeysByDevices)) {
            return false;
        }
        TeamPublicKeysByDevices teamPublicKeysByDevices = (TeamPublicKeysByDevices) obj;
        return t.b(this.users, teamPublicKeysByDevices.users) && t.b(this.devices, teamPublicKeysByDevices.devices) && t.b(this.publicKey, teamPublicKeysByDevices.publicKey);
    }

    public final List<TeamPublicKeyDevice> getDevices() {
        return this.devices;
    }

    public final List<TeamPublicKey> getPublicKey() {
        return this.publicKey;
    }

    public final List<TeamPublicKeyUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((this.users.hashCode() * 31) + this.devices.hashCode()) * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "TeamPublicKeysByDevices(users=" + this.users + ", devices=" + this.devices + ", publicKey=" + this.publicKey + ")";
    }

    public TeamPublicKeysByDevices(List<TeamPublicKeyUser> list, List<TeamPublicKeyDevice> list2, List<TeamPublicKey> list3) {
        t.f(list, "users");
        t.f(list2, "devices");
        t.f(list3, Column.KEY_PUBLIC);
        this.users = list;
        this.devices = list2;
        this.publicKey = list3;
    }
}
