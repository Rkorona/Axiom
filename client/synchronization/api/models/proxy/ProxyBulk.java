package com.server.auditor.ssh.client.synchronization.api.models.proxy;

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
@p(with = Companion.ProxyBulkSerializer.class)
public abstract class ProxyBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String IDENTITY_ID_SERIAL_NAME = "identity";

    public static final class Companion {

        public static final class ProxyBulkSerializer extends g {
            public static final ProxyBulkSerializer INSTANCE = new ProxyBulkSerializer();
            public static final int $stable = 8;

            private ProxyBulkSerializer() {
                super(n0.b(ProxyBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? ProxyBulkV5.Companion.serializer() : ProxyBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return ProxyBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProxyBulk(k kVar) {
        this();
    }

    @o("identity")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    public abstract Object getIdentityId();

    public abstract void setIdentityId(Object obj);

    private ProxyBulk() {
    }
}
