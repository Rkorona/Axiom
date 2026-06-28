package com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage;

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
@p(with = Companion.PackageBulkSerializer.class)
public abstract class PackageBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class PackageBulkSerializer extends g {
            public static final PackageBulkSerializer INSTANCE = new PackageBulkSerializer();
            public static final int $stable = 8;

            private PackageBulkSerializer() {
                super(n0.b(PackageBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? PackageBulkV5.Companion.serializer() : PackageBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return PackageBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PackageBulk(k kVar) {
        this();
    }

    private PackageBulk() {
    }
}
