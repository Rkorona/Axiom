package com.server.auditor.ssh.client.models.connections;

import android.os.Parcelable;
import com.server.auditor.ssh.client.fragments.history.ConnectionStatus;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.properties.ConnectionProperties;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SerialProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public interface Connection extends Parcelable {
    boolean IsSshIdKeyConnection();

    Connection cloneConnection();

    boolean equals(Connection connection);

    String getAlias();

    Boolean getBackspaceType();

    String getCharset();

    String getColorScheme();

    Avo.ConnectionOrigin getConnectionOrigin();

    ConnectionStatus getConnectionStatus();

    int getCountOfFailedSshIdKeys();

    String getCreatedAt();

    String getErrorMessage();

    Integer getFontSize();

    String getHost();

    Long getHostId();

    HostType getHostType();

    long getId();

    LocalProperties getLocalProperties();

    SshProperties getOrCreateSshPropertiesIfNotExist();

    HostIconUtil.OsModelType getOsModelType();

    SshProperties getSafeSshProperties();

    TelnetProperties getSafeTelnetProperties();

    SerialProperties getSerialProperties();

    SshProperties getSshProperties();

    TelnetProperties getTelnetProperties();

    ConnectionType getType();

    String getUUID();

    URI getUri();

    boolean isFido2SshIdKeyUsed();

    void setAlias(String str);

    void setColorScheme(String str);

    void setConfig(ConnectionType connectionType, ConnectionProperties connectionProperties);

    void setConnectionOrigin(Avo.ConnectionOrigin connectionOrigin);

    void setCountOfFailedSshIdKeys(int i10);

    void setHostId(Long l10);

    void setId(long j10);

    void setIsFido2SshIdKeyUsed(boolean z10);

    void setIsSshIdKeyConnection(boolean z10);

    void setType(ConnectionType connectionType);

    void setUUID(String str);
}
