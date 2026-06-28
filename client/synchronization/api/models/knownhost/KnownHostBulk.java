package com.server.auditor.ssh.client.synchronization.api.models.knownhost;

import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.b;
import hv.c;
import hv.p;
import ju.k;
import ju.n0;
import ju.t;
import kotlinx.serialization.json.JsonElement;
import mv.g;
import mv.i;

/* JADX INFO: loaded from: classes4.dex */
@p(with = Companion.KnownHostBulkSerializer.class)
public abstract class KnownHostBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class KnownHostBulkSerializer extends g {
            public static final KnownHostBulkSerializer INSTANCE = new KnownHostBulkSerializer();
            public static final int $stable = 8;

            private KnownHostBulkSerializer() {
                super(n0.b(KnownHostBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? KnownHostBulkV5.Companion.serializer() : KnownHostBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return KnownHostBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KnownHostBulk(k kVar) {
        this();
    }

    private KnownHostBulk() {
    }
}
