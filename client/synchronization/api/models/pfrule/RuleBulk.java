package com.server.auditor.ssh.client.synchronization.api.models.pfrule;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.n0;
import ju.t;
import kotlinx.serialization.json.JsonElement;
import mv.g;
import mv.i;

/* JADX INFO: loaded from: classes4.dex */
@p(with = Companion.RuleBulkSerializer.class)
public abstract class RuleBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String HOST_ID_SERIAL_NAME = "host";

    public static final class Companion {

        public static final class RuleBulkSerializer extends g {
            public static final RuleBulkSerializer INSTANCE = new RuleBulkSerializer();
            public static final int $stable = 8;

            private RuleBulkSerializer() {
                super(n0.b(RuleBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? RuleBulkV5.Companion.serializer() : RuleBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return RuleBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RuleBulk(k kVar) {
        this();
    }

    @o("host")
    public static /* synthetic */ void getServerId$annotations() {
    }

    public final void clearServerId() {
        setServerId(null);
    }

    public abstract Object getServerId();

    public abstract void setServerId(Object obj);

    private RuleBulk() {
    }
}
