package com.server.auditor.ssh.client.synchronization.api.models.ssh.config;

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
@p(with = Companion.SshConfigBulkSerializer.class)
public abstract class SshConfigBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String PROXY_ID_SERIAL_NAME = "proxycommand";
    public static final String STARTUP_SNIPPET_ID_SERIAL_NAME = "startup_snippet";

    public static final class Companion {

        public static final class SshConfigBulkSerializer extends g {
            public static final SshConfigBulkSerializer INSTANCE = new SshConfigBulkSerializer();
            public static final int $stable = 8;

            private SshConfigBulkSerializer() {
                super(n0.b(SshConfigBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? SshConfigBulkV5.Companion.serializer() : SshConfigBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return SshConfigBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SshConfigBulk(k kVar) {
        this();
    }

    @o(PROXY_ID_SERIAL_NAME)
    public static /* synthetic */ void getProxyId$annotations() {
    }

    @o(STARTUP_SNIPPET_ID_SERIAL_NAME)
    public static /* synthetic */ void getSnippetId$annotations() {
    }

    public final void clearProxyId() {
        setProxyId(null);
    }

    public final void clearSnippetId() {
        setSnippetId(null);
    }

    public abstract Object getProxyId();

    public abstract Object getSnippetId();

    public abstract void setProxyId(Object obj);

    public abstract void setSnippetId(Object obj);

    private SshConfigBulk() {
    }
}
