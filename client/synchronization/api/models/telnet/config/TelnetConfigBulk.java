package com.server.auditor.ssh.client.synchronization.api.models.telnet.config;

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
@p(with = Companion.TelnetConfigBulkSerializer.class)
public abstract class TelnetConfigBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class TelnetConfigBulkSerializer extends g {
            public static final TelnetConfigBulkSerializer INSTANCE = new TelnetConfigBulkSerializer();
            public static final int $stable = 8;

            private TelnetConfigBulkSerializer() {
                super(n0.b(TelnetConfigBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? TelnetConfigBulkV5.Companion.serializer() : TelnetConfigBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return TelnetConfigBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TelnetConfigBulk(k kVar) {
        this();
    }

    private TelnetConfigBulk() {
    }
}
