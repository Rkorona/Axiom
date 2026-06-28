package com.server.auditor.ssh.client.synchronization.api.models.ssh.key;

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
@p(with = Companion.SshKeyBulkSerializer.class)
public abstract class SshKeyBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class SshKeyBulkSerializer extends g {
            public static final SshKeyBulkSerializer INSTANCE = new SshKeyBulkSerializer();
            public static final int $stable = 8;

            private SshKeyBulkSerializer() {
                super(n0.b(SshKeyBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? SshKeyBulkV5.Companion.serializer() : SshKeyBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SshKeyBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SshKeyBulk(k kVar) {
        this();
    }

    private SshKeyBulk() {
    }
}
