package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.fragments.history.ConnectionStatus;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.HostType;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.Date;
import java.util.List;
import tp.d1;

/* JADX INFO: loaded from: classes3.dex */
public class ActiveConnection extends BaseConnection {
    public static final Parcelable.Creator<ActiveConnection> CREATOR = new a();
    private Long lastConnectionId;
    private ConnectionStatus mConnectionStatus;
    private String mCreatedAt;
    private String mErrorMessage;
    private List<String> mHistoryCommands;
    private String metaHostAddress;
    private String metaPort;
    private long sessionLogSize;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActiveConnection createFromParcel(Parcel parcel) {
            return new ActiveConnection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActiveConnection[] newArray(int i10) {
            return new ActiveConnection[i10];
        }
    }

    public ActiveConnection() {
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Connection cloneConnection() {
        SshProperties sshProperties = getSshProperties();
        SshProperties sshProperties2 = sshProperties != null ? new SshProperties(sshProperties) : sshProperties;
        TelnetProperties telnetProperties = getTelnetProperties();
        TelnetProperties telnetProperties2 = telnetProperties != null ? new TelnetProperties(telnetProperties) : telnetProperties;
        LocalProperties localProperties = getLocalProperties();
        LocalProperties localProperties2 = localProperties != null ? new LocalProperties(localProperties) : localProperties;
        return (this.metaHostAddress == null || this.metaPort == null) ? new ActiveConnection(getId(), this.uuid, getHostId(), getAlias(), getHost(), sshProperties2, localProperties2, telnetProperties2, getOsModelType(), getBackspaceType(), getConnectionOrigin()) : new ActiveConnection(getId(), this.uuid, getHostId(), getAlias(), getHost(), sshProperties2, localProperties2, telnetProperties2, getOsModelType(), getBackspaceType(), this.metaHostAddress, this.metaPort, getConnectionOrigin());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public boolean equals(Connection connection) {
        return false;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public ConnectionStatus getConnectionStatus() {
        return this.mConnectionStatus;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public List<String> getHistoryCommands() {
        return this.mHistoryCommands;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public HostType getHostType() {
        return this.mLocalProperties != null ? HostType.local : HostType.remote;
    }

    public Long getLastConnectionId() {
        return this.lastConnectionId;
    }

    public String getMetaHostAddress() {
        return this.metaHostAddress;
    }

    public String getMetaPort() {
        return this.metaPort;
    }

    public long getSessionLogSize() {
        return this.sessionLogSize;
    }

    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.mConnectionStatus = connectionStatus;
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public void setHistoryCommands(List<String> list) {
        this.mHistoryCommands = list;
    }

    public void setHost(String str) {
        this.mAddress = str;
    }

    public void setLastConnectionId(Long l10) {
        this.lastConnectionId = l10;
    }

    public void setMetaHostAddress(String str) {
        this.metaHostAddress = str;
    }

    public void setMetaPort(String str) {
        this.metaPort = str;
    }

    public void setSessionLogSize(long j10) {
        this.sessionLogSize = j10;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mCreatedAt);
        ConnectionStatus connectionStatus = this.mConnectionStatus;
        parcel.writeInt(connectionStatus == null ? -1 : connectionStatus.ordinal());
        parcel.writeString(this.mErrorMessage);
        parcel.writeString(this.metaHostAddress);
        parcel.writeString(this.metaPort);
    }

    public ActiveConnection(String str) {
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
        this.mAddress = str;
        this.mOsModelType = HostIconUtil.OsModelType.none;
    }

    public ActiveConnection(Connection connection) {
        super(connection.getId(), connection.getUUID(), connection.getHostId(), connection.getAlias(), connection.getHost(), connection.getSshProperties(), connection.getLocalProperties(), connection.getTelnetProperties(), connection.getSerialProperties(), connection.getOsModelType(), connection.getBackspaceType(), connection.getConnectionOrigin());
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
        this.isSshIdKeyConnection = connection.IsSshIdKeyConnection();
        this.countOfFailedSshIdKeys = connection.getCountOfFailedSshIdKeys();
        this.isFido2SshIdKeyUsed = connection.isFido2SshIdKeyUsed();
    }

    public ActiveConnection(long j10, String str, Long l10, String str2, String str3, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, HostIconUtil.OsModelType osModelType, Boolean bool, Avo.ConnectionOrigin connectionOrigin) {
        super(j10, str, l10, str2, str3, sshProperties, localProperties, telnetProperties, osModelType, bool, connectionOrigin);
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
    }

    public ActiveConnection(long j10, String str, Long l10, String str2, String str3, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, HostIconUtil.OsModelType osModelType, Boolean bool, String str4, String str5, Avo.ConnectionOrigin connectionOrigin) {
        super(j10, str, l10, str2, str3, sshProperties, localProperties, telnetProperties, osModelType, bool, connectionOrigin);
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
        setMetaHostAddress(str4);
        setMetaPort(str5);
    }

    protected ActiveConnection(Parcel parcel) {
        super(parcel);
        this.mCreatedAt = d1.b(new Date());
        this.mConnectionStatus = ConnectionStatus.connecting;
        this.mErrorMessage = null;
        this.metaHostAddress = null;
        this.metaPort = null;
        this.lastConnectionId = null;
        this.mCreatedAt = parcel.readString();
        int i10 = parcel.readInt();
        this.mConnectionStatus = i10 != -1 ? ConnectionStatus.values()[i10] : null;
        this.mErrorMessage = parcel.readString();
        this.metaHostAddress = parcel.readString();
        this.metaPort = parcel.readString();
    }
}
