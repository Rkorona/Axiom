package com.server.auditor.ssh.client.ui.sessionlogs.data;

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
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PersonalVaultLogsSettingApiPayload {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final boolean isEnabled;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40381b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40380a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.PersonalVaultLogsSettingApiPayload", aVar, 1);
            i2Var.r("enabled", false);
            descriptor = i2Var;
            f40381b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PersonalVaultLogsSettingApiPayload deserialize(e eVar) {
            boolean zH;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            int i10 = 1;
            if (cVarD.l()) {
                zH = cVarD.H(fVar, 0);
            } else {
                boolean z10 = true;
                zH = false;
                int i11 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        zH = cVarD.H(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new PersonalVaultLogsSettingApiPayload(i10, zH, null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload) {
            t.f(fVar, "encoder");
            t.f(personalVaultLogsSettingApiPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            PersonalVaultLogsSettingApiPayload.write$Self$Termius_app_googleProductionRelease(personalVaultLogsSettingApiPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{i.f64704a};
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
            return a.f40380a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ PersonalVaultLogsSettingApiPayload(int i10, boolean z10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f40380a.getDescriptor());
        }
        this.isEnabled = z10;
    }

    public static /* synthetic */ PersonalVaultLogsSettingApiPayload copy$default(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = personalVaultLogsSettingApiPayload.isEnabled;
        }
        return personalVaultLogsSettingApiPayload.copy(z10);
    }

    @o("enabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(PersonalVaultLogsSettingApiPayload personalVaultLogsSettingApiPayload, d dVar, f fVar) {
        dVar.u(fVar, 0, personalVaultLogsSettingApiPayload.isEnabled);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final PersonalVaultLogsSettingApiPayload copy(boolean z10) {
        return new PersonalVaultLogsSettingApiPayload(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalVaultLogsSettingApiPayload) && this.isEnabled == ((PersonalVaultLogsSettingApiPayload) obj).isEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "PersonalVaultLogsSettingApiPayload(isEnabled=" + this.isEnabled + ")";
    }

    public PersonalVaultLogsSettingApiPayload(boolean z10) {
        this.isEnabled = z10;
    }
}
