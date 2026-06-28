package com.server.auditor.ssh.client.synchronization.api.models.user.errormodels;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RequireTwoFactorAuthForTeamMembersErrorModel {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String detail;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return RequireTwoFactorAuthForTeamMembersErrorModel.serializer;
        }

        public final c serializer() {
            return RequireTwoFactorAuthForTeamMembersErrorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequireTwoFactorAuthForTeamMembersErrorModel() {
        this((String) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RequireTwoFactorAuthForTeamMembersErrorModel copy$default(RequireTwoFactorAuthForTeamMembersErrorModel requireTwoFactorAuthForTeamMembersErrorModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requireTwoFactorAuthForTeamMembersErrorModel.detail;
        }
        return requireTwoFactorAuthForTeamMembersErrorModel.copy(str);
    }

    @o("detail")
    public static /* synthetic */ void getDetail$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RequireTwoFactorAuthForTeamMembersErrorModel requireTwoFactorAuthForTeamMembersErrorModel, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && requireTwoFactorAuthForTeamMembersErrorModel.detail == null) {
            return;
        }
        dVar.v(fVar, 0, x2.f64817a, requireTwoFactorAuthForTeamMembersErrorModel.detail);
    }

    public final String component1() {
        return this.detail;
    }

    public final RequireTwoFactorAuthForTeamMembersErrorModel copy(String str) {
        return new RequireTwoFactorAuthForTeamMembersErrorModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequireTwoFactorAuthForTeamMembersErrorModel) && t.b(this.detail, ((RequireTwoFactorAuthForTeamMembersErrorModel) obj).detail);
    }

    public final String getDetail() {
        return this.detail;
    }

    public int hashCode() {
        String str = this.detail;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "RequireTwoFactorAuthForTeamMembersErrorModel(detail=" + this.detail + ")";
    }

    public /* synthetic */ RequireTwoFactorAuthForTeamMembersErrorModel(int i10, String str, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.detail = null;
        } else {
            this.detail = str;
        }
    }

    public RequireTwoFactorAuthForTeamMembersErrorModel(String str) {
        this.detail = str;
    }

    public /* synthetic */ RequireTwoFactorAuthForTeamMembersErrorModel(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
