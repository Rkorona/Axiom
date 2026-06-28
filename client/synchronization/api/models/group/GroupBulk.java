package com.server.auditor.ssh.client.synchronization.api.models.group;

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
@p(with = Companion.GroupBulkSerializer.class)
public abstract class GroupBulk extends CommonBulkShareable {
    public static final int $stable = 0;
    public static final String CREDENTIALS_MODE_SERIAL_NAME = "credentials_mode";
    public static final Companion Companion = new Companion(null);
    public static final String PARENT_GROUP_ID_SERIAL_NAME = "parent_group";
    public static final String SHARING_MODE_SERIAL_NAME = "sharing_mode";
    public static final String SSH_CONFIG_ID_SERIAL_NAME = "ssh_config";
    public static final String TELNET_CONFIG_ID_SERIAL_NAME = "telnet_config";

    public static final class Companion {

        public static final class GroupBulkSerializer extends g {
            public static final GroupBulkSerializer INSTANCE = new GroupBulkSerializer();
            public static final int $stable = 8;

            private GroupBulkSerializer() {
                super(n0.b(GroupBulk.class));
            }

            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                t.f(jsonElement, "element");
                return i.k(jsonElement).containsKey("content") ? GroupBulkV5.Companion.serializer() : GroupBulkV3.Companion.serializer();
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return GroupBulkSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GroupBulk(k kVar) {
        this();
    }

    @o("credentials_mode")
    public static /* synthetic */ void getCredentialsMode$annotations() {
    }

    @o("parent_group")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @o("sharing_mode")
    public static /* synthetic */ void getSharingMode$annotations() {
    }

    @o("ssh_config")
    public static /* synthetic */ void getSshConfigId$annotations() {
    }

    @o("telnet_config")
    public static /* synthetic */ void getTelnetConfigId$annotations() {
    }

    public final void clearParentGroupId() {
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

    public abstract String getSharingMode();

    public abstract Object getSshConfigId();

    public abstract Object getTelnetConfigId();

    public abstract void setCredentialsMode(String str);

    public abstract void setGroupId(Object obj);

    public abstract void setSharingMode(String str);

    public abstract void setSshConfigId(Object obj);

    public abstract void setTelnetConfigId(Object obj);

    private GroupBulk() {
    }
}
