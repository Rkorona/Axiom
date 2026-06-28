package com.server.auditor.ssh.client.ssh.terminal;

import androidx.lifecycle.i1;
import com.server.auditor.ssh.client.models.connections.Connection;

/* JADX INFO: loaded from: classes4.dex */
public final class TerminalFragmentViewModel extends i1 {
    public static final int $stable = 8;
    private Connection connection;
    private g9.a terminalSession;
    private int terminalSessionId;

    public final Connection getConnection() {
        return this.connection;
    }

    public final g9.a getTerminalSession() {
        return this.terminalSession;
    }

    public final int getTerminalSessionId() {
        return this.terminalSessionId;
    }

    public final void setConnection(Connection connection) {
        this.connection = connection;
    }

    public final void setTerminalSession(g9.a aVar) {
        this.terminalSession = aVar;
    }

    public final void setTerminalSessionId(int i10) {
        this.terminalSessionId = i10;
    }
}
