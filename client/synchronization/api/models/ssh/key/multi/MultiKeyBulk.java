package com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi;

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
@p(with = Companion.MultiKeyBulkSerializer.class)
public abstract class MultiKeyBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class MultiKeyBulkSerializer extends g {
            public static final MultiKeyBulkSerializer INSTANCE = new MultiKeyBulkSerializer();
            public static final int $stable = 8;

            private MultiKeyBulkSerializer() {
                super(n0.b(MultiKeyBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? MultiKeyBulkV5.Companion.serializer() : MultiKeyBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return MultiKeyBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiKeyBulk(k kVar) {
        this();
    }

    private MultiKeyBulk() {
    }
}
