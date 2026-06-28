package com.server.auditor.ssh.client.navigation.teamtrialviasharing;

import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class InviteRequest {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String email;
    private final String role;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29867b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f29866a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.navigation.teamtrialviasharing.InviteRequest", aVar, 2);
            i2Var.r("email", false);
            i2Var.r("role", false);
            descriptor = i2Var;
            f29867b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InviteRequest deserialize(e eVar) {
            String strB;
            String strB2;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
                strB2 = cVarD.B(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strB = null;
                String strB3 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        strB = cVarD.B(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        strB3 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    }
                }
                strB2 = strB3;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new InviteRequest(i10, strB, strB2, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, InviteRequest inviteRequest) {
            t.f(fVar, "encoder");
            t.f(inviteRequest, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            InviteRequest.write$Self$Termius_app_googleProductionRelease(inviteRequest, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, x2Var};
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
            return a.f29866a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ InviteRequest(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f29866a.getDescriptor());
        }
        this.email = str;
        this.role = str2;
    }

    public static /* synthetic */ InviteRequest copy$default(InviteRequest inviteRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inviteRequest.email;
        }
        if ((i10 & 2) != 0) {
            str2 = inviteRequest.role;
        }
        return inviteRequest.copy(str, str2);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InviteRequest inviteRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, inviteRequest.email);
        dVar.f(fVar, 1, inviteRequest.role);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.role;
    }

    public final InviteRequest copy(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "role");
        return new InviteRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteRequest)) {
            return false;
        }
        InviteRequest inviteRequest = (InviteRequest) obj;
        return t.b(this.email, inviteRequest.email) && t.b(this.role, inviteRequest.role);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.role.hashCode();
    }

    public String toString() {
        return "InviteRequest(email=" + this.email + ", role=" + this.role + ")";
    }

    public InviteRequest(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "role");
        this.email = str;
        this.role = str2;
    }
}
