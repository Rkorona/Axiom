package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DeactivateTeamRequestBody {
    private final DeactivateTeamTerminalObjects terminalObjects;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DeactivateTeamRequestBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ DeactivateTeamRequestBody(int i10, DeactivateTeamTerminalObjects deactivateTeamTerminalObjects, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, DeactivateTeamRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.terminalObjects = deactivateTeamTerminalObjects;
    }

    public static /* synthetic */ DeactivateTeamRequestBody copy$default(DeactivateTeamRequestBody deactivateTeamRequestBody, DeactivateTeamTerminalObjects deactivateTeamTerminalObjects, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deactivateTeamTerminalObjects = deactivateTeamRequestBody.terminalObjects;
        }
        return deactivateTeamRequestBody.copy(deactivateTeamTerminalObjects);
    }

    @o("terminal_objects")
    public static /* synthetic */ void getTerminalObjects$annotations() {
    }

    public final DeactivateTeamTerminalObjects component1() {
        return this.terminalObjects;
    }

    public final DeactivateTeamRequestBody copy(DeactivateTeamTerminalObjects deactivateTeamTerminalObjects) {
        t.f(deactivateTeamTerminalObjects, "terminalObjects");
        return new DeactivateTeamRequestBody(deactivateTeamTerminalObjects);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeactivateTeamRequestBody) && t.b(this.terminalObjects, ((DeactivateTeamRequestBody) obj).terminalObjects);
    }

    public final DeactivateTeamTerminalObjects getTerminalObjects() {
        return this.terminalObjects;
    }

    public int hashCode() {
        return this.terminalObjects.hashCode();
    }

    public String toString() {
        return "DeactivateTeamRequestBody(terminalObjects=" + this.terminalObjects + ")";
    }

    public DeactivateTeamRequestBody(DeactivateTeamTerminalObjects deactivateTeamTerminalObjects) {
        t.f(deactivateTeamTerminalObjects, "terminalObjects");
        this.terminalObjects = deactivateTeamTerminalObjects;
    }
}
