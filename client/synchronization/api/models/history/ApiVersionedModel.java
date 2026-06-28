package com.server.auditor.ssh.client.synchronization.api.models.history;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public class ApiVersionedModel {
    private int versionCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ApiVersionedModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ApiVersionedModel() {
    }

    @o("version_code")
    public static /* synthetic */ void getVersionCode$annotations() {
    }

    public static final /* synthetic */ void write$Self(ApiVersionedModel apiVersionedModel, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && apiVersionedModel.versionCode == 0) {
            return;
        }
        dVar.t(fVar, 0, apiVersionedModel.versionCode);
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final void setVersionCode(int i10) {
        this.versionCode = i10;
    }

    public /* synthetic */ ApiVersionedModel(int i10, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.versionCode = 0;
        } else {
            this.versionCode = i11;
        }
    }
}
