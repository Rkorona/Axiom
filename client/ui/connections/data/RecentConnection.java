package com.server.auditor.ssh.client.ui.connections.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.models.connections.Connection;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class RecentConnection {
    public static final int $stable = 8;
    private final Connection connection;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39974id;
    private final long lastUsedTimestamp;
    private final String subtitle;
    private final String title;

    public RecentConnection(long j10, String str, String str2, Connection connection, long j11) {
        t.f(str, "title");
        t.f(str2, "subtitle");
        t.f(connection, "connection");
        this.f39974id = j10;
        this.title = str;
        this.subtitle = str2;
        this.connection = connection;
        this.lastUsedTimestamp = j11;
    }

    public static /* synthetic */ RecentConnection copy$default(RecentConnection recentConnection, long j10, String str, String str2, Connection connection, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = recentConnection.f39974id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = recentConnection.title;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = recentConnection.subtitle;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            connection = recentConnection.connection;
        }
        Connection connection2 = connection;
        if ((i10 & 16) != 0) {
            j11 = recentConnection.lastUsedTimestamp;
        }
        return recentConnection.copy(j12, str3, str4, connection2, j11);
    }

    public final long component1() {
        return this.f39974id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final Connection component4() {
        return this.connection;
    }

    public final long component5() {
        return this.lastUsedTimestamp;
    }

    public final RecentConnection copy(long j10, String str, String str2, Connection connection, long j11) {
        t.f(str, "title");
        t.f(str2, "subtitle");
        t.f(connection, "connection");
        return new RecentConnection(j10, str, str2, connection, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentConnection)) {
            return false;
        }
        RecentConnection recentConnection = (RecentConnection) obj;
        return this.f39974id == recentConnection.f39974id && t.b(this.title, recentConnection.title) && t.b(this.subtitle, recentConnection.subtitle) && t.b(this.connection, recentConnection.connection) && this.lastUsedTimestamp == recentConnection.lastUsedTimestamp;
    }

    public final Connection getConnection() {
        return this.connection;
    }

    public final long getId() {
        return this.f39974id;
    }

    public final long getLastUsedTimestamp() {
        return this.lastUsedTimestamp;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f39974id) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.connection.hashCode()) * 31) + Long.hashCode(this.lastUsedTimestamp);
    }

    public String toString() {
        return "RecentConnection(id=" + this.f39974id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", connection=" + this.connection + ", lastUsedTimestamp=" + this.lastUsedTimestamp + ")";
    }
}
