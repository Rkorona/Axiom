package com.server.auditor.ssh.client.models.connections;

/* JADX INFO: loaded from: classes3.dex */
public enum ConnectionType {
    local,
    ssh,
    telnet,
    both_ssh_telnet,
    none,
    serial;

    public static ConnectionType getConnectionType(String str) {
        for (ConnectionType connectionType : values()) {
            if (connectionType.name().equalsIgnoreCase(str)) {
                return connectionType;
            }
        }
        return none;
    }
}
