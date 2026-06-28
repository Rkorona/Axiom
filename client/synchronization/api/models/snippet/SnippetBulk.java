package com.server.auditor.ssh.client.synchronization.api.models.snippet;

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
@p(with = Companion.SnippetBulkSerializer.class)
public abstract class SnippetBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String PACKAGE_SERIAL_NAME = "package";

    public static final class Companion {

        public static final class SnippetBulkSerializer extends g {
            public static final SnippetBulkSerializer INSTANCE = new SnippetBulkSerializer();
            public static final int $stable = 8;

            private SnippetBulkSerializer() {
                super(n0.b(SnippetBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? SnippetBulkV5.Companion.serializer() : SnippetBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SnippetBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SnippetBulk(k kVar) {
        this();
    }

    @o("package")
    public static /* synthetic */ void getPackageId$annotations() {
    }

    public abstract Object getPackageId();

    public abstract void setPackageId(Object obj);

    private SnippetBulk() {
    }
}
