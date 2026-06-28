package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.server.auditor.ssh.client.synchronization.api.models.history.HistoryPostResponse;
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
public final class HistoryPostResponse {
    private final String now;
    private final List<HistoryPostRemote> objects;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new a() { // from class: an.b
        @Override // iu.a
        public final Object a() {
            return HistoryPostResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HistoryPostResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ HistoryPostResponse(int i10, String str, List list, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, HistoryPostResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.now = str;
        this.objects = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(HistoryPostRemote$$serializer.INSTANCE);
    }

    @hv.o("now")
    public static /* synthetic */ void getNow$annotations() {
    }

    @hv.o("objects")
    public static /* synthetic */ void getObjects$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryPostResponse historyPostResponse, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, historyPostResponse.now);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), historyPostResponse.objects);
    }

    public final String getNow() {
        return this.now;
    }

    public final List<HistoryPostRemote> getObjects() {
        return this.objects;
    }

    public HistoryPostResponse(String str, List<HistoryPostRemote> list) {
        t.f(str, "now");
        t.f(list, "objects");
        this.now = str;
        this.objects = list;
    }
}
