package com.server.auditor.ssh.client.synchronization.api.submodels;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class WithRecourseId {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f39072id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return WithRecourseId$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public WithRecourseId() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(WithRecourseId withRecourseId, d dVar, f fVar) {
        if (!dVar.E(fVar, 0) && withRecourseId.f39072id == 0) {
            return;
        }
        dVar.t(fVar, 0, withRecourseId.f39072id);
    }

    public final int getId() {
        return this.f39072id;
    }

    protected final void setId(int i10) {
        this.f39072id = i10;
    }

    public /* synthetic */ WithRecourseId(int i10, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.f39072id = 0;
        } else {
            this.f39072id = i11;
        }
    }
}
