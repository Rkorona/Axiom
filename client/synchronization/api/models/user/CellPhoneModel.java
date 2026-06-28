package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CellPhoneModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cellPhone;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CellPhoneModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CellPhoneModel(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CellPhoneModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cellPhone = str;
    }

    public static /* synthetic */ CellPhoneModel copy$default(CellPhoneModel cellPhoneModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cellPhoneModel.cellPhone;
        }
        return cellPhoneModel.copy(str);
    }

    @o("cellphone")
    public static /* synthetic */ void getCellPhone$annotations() {
    }

    public final String component1() {
        return this.cellPhone;
    }

    public final CellPhoneModel copy(String str) {
        t.f(str, "cellPhone");
        return new CellPhoneModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CellPhoneModel) && t.b(this.cellPhone, ((CellPhoneModel) obj).cellPhone);
    }

    public final String getCellPhone() {
        return this.cellPhone;
    }

    public int hashCode() {
        return this.cellPhone.hashCode();
    }

    public String toString() {
        return "CellPhoneModel(cellPhone=" + this.cellPhone + ")";
    }

    public CellPhoneModel(String str) {
        t.f(str, "cellPhone");
        this.cellPhone = str;
    }
}
