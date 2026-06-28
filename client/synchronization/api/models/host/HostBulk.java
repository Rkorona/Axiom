package com.server.auditor.ssh.client.synchronization.api.models.host;

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
@p(with = Companion.HostBulkSerializer.class)
public abstract class HostBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final String CREDENTIALS_MODE_SERIAL_NAME = "credentials_mode";
    public static final Companion Companion = new Companion(null);
    public static final String GROUP_ID_SERIAL_NAME = "group";
    public static final String SSH_CONFIG_SERIAL_NAME = "ssh_config";
    public static final String TELNET_CONFIG_SERIAL_NAME = "telnet_config";

    public static final class Companion {

        public static final class HostBulkSerializer extends g {
            public static final HostBulkSerializer INSTANCE = new HostBulkSerializer();
            public static final int $stable = 8;

            private HostBulkSerializer() {
                super(n0.b(HostBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? HostBulkV5.Companion.serializer() : HostBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return HostBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HostBulk(k kVar) {
        this();
    }

    @o("credentials_mode")
    public static /* synthetic */ void getCredentialsMode$annotations() {
    }

    @o(GROUP_ID_SERIAL_NAME)
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @o("telnet_config")
    public static /* synthetic */ void getTelnetConfigId$annotations() {
    }

    public final void clearGroupId() {
        setGroupId(null);
    }

    public final void clearSshConfigId() {
        setSshConfigId(null);
    }

    public final void clearTelnetConfigId() {
        setTelnetConfigId(null);
    }

    public abstract String getCredentialsMode();

    public abstract Object getGroupId();

    public abstract Object getSshConfigId();

    public abstract Object getTelnetConfigId();

    public abstract void setCredentialsMode(String str);

    public abstract void setGroupId(Object obj);

    public abstract void setSshConfigId(Object obj);

    public abstract void setTelnetConfigId(Object obj);

    private HostBulk() {
    }
}
