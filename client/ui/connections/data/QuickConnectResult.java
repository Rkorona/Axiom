package com.server.auditor.ssh.client.ui.connections.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.models.connections.Connection;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class QuickConnectResult {
    public static final int $stable = 8;
    private final Connection connection;
    private final String error;
    private final boolean isValid;

    public QuickConnectResult(boolean z10, Connection connection, String str) {
        this.isValid = z10;
        this.connection = connection;
        this.error = str;
    }

    public static /* synthetic */ QuickConnectResult copy$default(QuickConnectResult quickConnectResult, boolean z10, Connection connection, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = quickConnectResult.isValid;
        }
        if ((i10 & 2) != 0) {
            connection = quickConnectResult.connection;
        }
        if ((i10 & 4) != 0) {
            str = quickConnectResult.error;
        }
        return quickConnectResult.copy(z10, connection, str);
    }

    public final boolean component1() {
        return this.isValid;
    }

    public final Connection component2() {
        return this.connection;
    }

    public final String component3() {
        return this.error;
    }

    public final QuickConnectResult copy(boolean z10, Connection connection, String str) {
        return new QuickConnectResult(z10, connection, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickConnectResult)) {
            return false;
        }
        QuickConnectResult quickConnectResult = (QuickConnectResult) obj;
        return this.isValid == quickConnectResult.isValid && t.b(this.connection, quickConnectResult.connection) && t.b(this.error, quickConnectResult.error);
    }

    public final Connection getConnection() {
        return this.connection;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        Connection connection = this.connection;
        int iHashCode2 = (iHashCode + (connection == null ? 0 : connection.hashCode())) * 31;
        String str = this.error;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        return "QuickConnectResult(isValid=" + this.isValid + ", connection=" + this.connection + ", error=" + this.error + ")";
    }

    public /* synthetic */ QuickConnectResult(boolean z10, Connection connection, String str, int i10, k kVar) {
        this(z10, (i10 & 2) != 0 ? null : connection, (i10 & 4) != 0 ? null : str);
    }
}
