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
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultLogsSettingApiPayload {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final boolean isEnabled;
    private final Long vaultRemoteId;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40404b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f40403a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.VaultLogsSettingApiPayload", aVar, 2);
            i2Var.r("vault_id", true);
            i2Var.r("enabled", false);
            descriptor = i2Var;
            f40404b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VaultLogsSettingApiPayload deserialize(e eVar) {
            Long l10;
            boolean zH;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            s2 s2Var = null;
            if (cVarD.l()) {
                l10 = (Long) cVarD.v(fVar, 0, h1.f64699a, null);
                zH = cVarD.H(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                boolean zH2 = false;
                int i11 = 0;
                l10 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        l10 = (Long) cVarD.v(fVar, 0, h1.f64699a, l10);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        zH2 = cVarD.H(fVar, 1);
                        i11 |= 2;
                    }
                }
                zH = zH2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new VaultLogsSettingApiPayload(i10, l10, zH, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, VaultLogsSettingApiPayload vaultLogsSettingApiPayload) {
            t.f(fVar, "encoder");
            t.f(vaultLogsSettingApiPayload, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            VaultLogsSettingApiPayload.write$Self$Termius_app_googleProductionRelease(vaultLogsSettingApiPayload, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{iv.a.u(h1.f64699a), i.f64704a};
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
            return a.f40403a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ VaultLogsSettingApiPayload(int i10, Long l10, boolean z10, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, a.f40403a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.vaultRemoteId = null;
        } else {
            this.vaultRemoteId = l10;
        }
        this.isEnabled = z10;
    }

    public static /* synthetic */ VaultLogsSettingApiPayload copy$default(VaultLogsSettingApiPayload vaultLogsSettingApiPayload, Long l10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = vaultLogsSettingApiPayload.vaultRemoteId;
        }
        if ((i10 & 2) != 0) {
            z10 = vaultLogsSettingApiPayload.isEnabled;
        }
        return vaultLogsSettingApiPayload.copy(l10, z10);
    }

    @o("vault_id")
    public static /* synthetic */ void getVaultRemoteId$annotations() {
    }

    @o("enabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VaultLogsSettingApiPayload vaultLogsSettingApiPayload, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || vaultLogsSettingApiPayload.vaultRemoteId != null) {
            dVar.v(fVar, 0, h1.f64699a, vaultLogsSettingApiPayload.vaultRemoteId);
        }
        dVar.u(fVar, 1, vaultLogsSettingApiPayload.isEnabled);
    }

    public final Long component1() {
        return this.vaultRemoteId;
    }

    public final boolean component2() {
        return this.isEnabled;
    }

    public final VaultLogsSettingApiPayload copy(Long l10, boolean z10) {
        return new VaultLogsSettingApiPayload(l10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultLogsSettingApiPayload)) {
            return false;
        }
        VaultLogsSettingApiPayload vaultLogsSettingApiPayload = (VaultLogsSettingApiPayload) obj;
        return t.b(this.vaultRemoteId, vaultLogsSettingApiPayload.vaultRemoteId) && this.isEnabled == vaultLogsSettingApiPayload.isEnabled;
    }

    public final Long getVaultRemoteId() {
        return this.vaultRemoteId;
    }

    public int hashCode() {
        Long l10 = this.vaultRemoteId;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "VaultLogsSettingApiPayload(vaultRemoteId=" + this.vaultRemoteId + ", isEnabled=" + this.isEnabled + ")";
    }

    public VaultLogsSettingApiPayload(Long l10, boolean z10) {
        this.vaultRemoteId = l10;
        this.isEnabled = z10;
    }

    public /* synthetic */ VaultLogsSettingApiPayload(Long l10, boolean z10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : l10, z10);
    }
}
