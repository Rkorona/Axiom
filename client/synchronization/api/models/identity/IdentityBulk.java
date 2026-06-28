package com.server.auditor.ssh.client.synchronization.api.models.identity;

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
@p(with = Companion.IdentityBulkSerializer.class)
public abstract class IdentityBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String SSHID_MODE_NAME = "sshid_mode";
    public static final String SSH_KEY_ID_SERIAL_NAME = "ssh_key";

    public static final class Companion {

        public static final class IdentityBulkSerializer extends g {
            public static final IdentityBulkSerializer INSTANCE = new IdentityBulkSerializer();
            public static final int $stable = 8;

            private IdentityBulkSerializer() {
                super(n0.b(IdentityBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? IdentityBulkV5.Companion.serializer() : IdentityBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return IdentityBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IdentityBulk(k kVar) {
        this();
    }

    @o("ssh_key")
    public static /* synthetic */ void getSshKeyId$annotations() {
    }

    public final void clearSshKeyId() {
        setSshKeyId(null);
    }

    public abstract Object getSshKeyId();

    public abstract void setSshKeyId(Object obj);

    private IdentityBulk() {
    }
}
