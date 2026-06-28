package com.server.auditor.ssh.client.ssh.terminal;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import lv.j0;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
@Keep
public abstract class TypedSessionId {
    private static final n $cachedSerializer$delegate;
    private static final n[] $childSerializers;
    public static final int $stable = 0;
    public static final a Companion = new a(null);
    private final ConnectionType connectionType;
    private final int sessionId;

    @Keep
    public static final class PortForwarding extends TypedSessionId {
        public static final int $stable = 0;
        private final n9.b ruleType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PortForwarding(int i10, n9.b bVar) {
            super(i10, ConnectionType.ssh, null);
            t.f(bVar, "ruleType");
            this.ruleType = bVar;
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PortForwarding)) {
                return false;
            }
            PortForwarding portForwarding = (PortForwarding) obj;
            return getSessionId() == portForwarding.getSessionId() && this.ruleType == portForwarding.ruleType;
        }

        public final n9.b getRuleType() {
            return this.ruleType;
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public int hashCode() {
            return (getSessionId() * 31) + this.ruleType.hashCode();
        }
    }

    @Keep
    public static final class Sftp extends TypedSessionId {
        public static final int $stable = 0;

        public Sftp(int i10) {
            super(i10, ConnectionType.ssh, null);
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sftp) && getSessionId() == ((Sftp) obj).getSessionId();
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public int hashCode() {
            return getSessionId();
        }
    }

    @Keep
    public static final class Terminal extends TypedSessionId {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Terminal(int i10, ConnectionType connectionType) {
            super(i10, connectionType, null);
            t.f(connectionType, "connectionType");
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Terminal)) {
                return false;
            }
            Terminal terminal = (Terminal) obj;
            return getSessionId() == terminal.getSessionId() && getConnectionType() == terminal.getConnectionType();
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.TypedSessionId
        public int hashCode() {
            return (getSessionId() * 31) + getConnectionType().hashCode();
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ hv.c a() {
            return (hv.c) TypedSessionId.$cachedSerializer$delegate.getValue();
        }

        public final hv.c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{null, o.b(rVar, new iu.a() { // from class: nm.a1
            @Override // iu.a
            public final Object a() {
                return TypedSessionId._childSerializers$_anonymous_();
            }
        })};
        $cachedSerializer$delegate = o.b(rVar, new iu.a() { // from class: nm.b1
            @Override // iu.a
            public final Object a() {
                return TypedSessionId._init_$_anonymous_$0();
            }
        });
    }

    public /* synthetic */ TypedSessionId(int i10, ConnectionType connectionType, k kVar) {
        this(i10, connectionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return j0.b("com.server.auditor.ssh.client.models.connections.ConnectionType", ConnectionType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_$0() {
        return new m("com.server.auditor.ssh.client.ssh.terminal.TypedSessionId", n0.b(TypedSessionId.class), new qu.b[0], new hv.c[0], new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(TypedSessionId typedSessionId, kv.d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.t(fVar, 0, typedSessionId.sessionId);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), typedSessionId.connectionType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TypedSessionId) && this.sessionId == ((TypedSessionId) obj).sessionId;
    }

    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId;
    }

    public /* synthetic */ TypedSessionId(int i10, int i11, ConnectionType connectionType, s2 s2Var) {
        this.sessionId = i11;
        this.connectionType = connectionType;
    }

    private TypedSessionId(int i10, ConnectionType connectionType) {
        this.sessionId = i10;
        this.connectionType = connectionType;
    }
}
