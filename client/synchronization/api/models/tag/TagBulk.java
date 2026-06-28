package com.server.auditor.ssh.client.synchronization.api.models.tag;

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
@p(with = Companion.TagBulkSerializer.class)
public abstract class TagBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class TagBulkSerializer extends g {
            public static final TagBulkSerializer INSTANCE = new TagBulkSerializer();
            public static final int $stable = 8;

            private TagBulkSerializer() {
                super(n0.b(TagBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? TagBulkV5.Companion.serializer() : TagBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return TagBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TagBulk(k kVar) {
        this();
    }

    private TagBulk() {
    }
}
