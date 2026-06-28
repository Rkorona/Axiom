package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.ConnectionProperties;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SerialProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.net.URI;
import tp.e1;
import tp.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseConnection implements Connection {
    protected Avo.ConnectionOrigin connectionOrigin;
    protected int countOfFailedSshIdKeys;
    protected boolean isFido2SshIdKeyUsed;
    protected boolean isSshIdKeyConnection;
    protected String mAddress;
    protected String mAlias;
    protected Boolean mBackspaceType;
    protected Long mHostId;
    protected long mId;
    protected LocalProperties mLocalProperties;
    protected HostIconUtil.OsModelType mOsModelType;
    protected SshProperties mSshProperties;
    protected TelnetProperties mTelnetProperties;
    protected SerialProperties serialProperties;
    protected String uuid;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27855a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f27855a = iArr;
            try {
                iArr[ConnectionType.ssh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27855a[ConnectionType.local.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27855a[ConnectionType.telnet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27855a[ConnectionType.serial.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected BaseConnection() {
        this.mBackspaceType = null;
        this.connectionOrigin = null;
        this.countOfFailedSshIdKeys = 0;
        this.isSshIdKeyConnection = false;
        this.isFido2SshIdKeyUsed = false;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public boolean IsSshIdKeyConnection() {
        return this.isSshIdKeyConnection;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getAlias() {
        return this.mAlias;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Boolean getBackspaceType() {
        return this.mBackspaceType;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getCharset() {
        ConnectionProperties config = getConfig();
        String charset = config == null ? null : config.getCharset();
        return charset == null ? SQLiteHelper.DEFAULT_CHARSET : charset;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getColorScheme() {
        ConnectionProperties config = getConfig();
        if (config == null) {
            return null;
        }
        return config.getColorScheme();
    }

    protected ConnectionProperties getConfig() {
        int i10 = a.f27855a[getType().ordinal()];
        if (i10 == 1) {
            return this.mSshProperties;
        }
        if (i10 == 2) {
            return this.mLocalProperties;
        }
        if (i10 == 3) {
            return this.mTelnetProperties;
        }
        if (i10 != 4) {
            return null;
        }
        return this.serialProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Avo.ConnectionOrigin getConnectionOrigin() {
        return this.connectionOrigin;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public int getCountOfFailedSshIdKeys() {
        return this.countOfFailedSshIdKeys;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Integer getFontSize() {
        ConnectionProperties config = getConfig();
        if (config == null || config.getFontSize() == null || config.getFontSize().intValue() == 0) {
            return null;
        }
        return config.getFontSize();
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getHost() {
        return this.mAddress;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Long getHostId() {
        return this.mHostId;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public long getId() {
        return this.mId;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public LocalProperties getLocalProperties() {
        return this.mLocalProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public SshProperties getOrCreateSshPropertiesIfNotExist() {
        if (this.mSshProperties == null) {
            this.mSshProperties = new SshProperties();
        }
        return this.mSshProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public HostIconUtil.OsModelType getOsModelType() {
        return this.mOsModelType;
    }

    public String getReadableHostname() {
        return !TextUtils.isEmpty(this.mAlias) ? this.mAlias : this.mAddress;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public SshProperties getSafeSshProperties() {
        SshProperties sshProperties = this.mSshProperties;
        return sshProperties != null ? sshProperties : new SshProperties();
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public TelnetProperties getSafeTelnetProperties() {
        TelnetProperties telnetProperties = this.mTelnetProperties;
        return telnetProperties != null ? telnetProperties : new TelnetProperties();
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public SerialProperties getSerialProperties() {
        return this.serialProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public SshProperties getSshProperties() {
        return this.mSshProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public TelnetProperties getTelnetProperties() {
        return this.mTelnetProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public ConnectionType getType() {
        if (this.mLocalProperties != null) {
            return ConnectionType.local;
        }
        SshProperties sshProperties = this.mSshProperties;
        return (sshProperties == null || this.mTelnetProperties == null) ? sshProperties != null ? ConnectionType.ssh : this.mTelnetProperties != null ? ConnectionType.telnet : this.serialProperties != null ? ConnectionType.serial : ConnectionType.none : ConnectionType.both_ssh_telnet;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getUUID() {
        return this.uuid;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public URI getUri() {
        int i10 = a.f27855a[getType().ordinal()];
        if (i10 == 1) {
            return getSafeSshProperties().isUseMosh() ? e1.d(getHost(), getSafeSshProperties().getUser(), getSafeSshProperties().getPort()) : e1.e(getSafeSshProperties().getUser(), getHost(), getSafeSshProperties().getPort());
        }
        if (i10 == 3) {
            return e1.f(getHost(), getSafeTelnetProperties().getUser(), getSafeTelnetProperties().getPort());
        }
        if (i10 != 4) {
            return h0.a();
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public boolean isFido2SshIdKeyUsed() {
        return this.isFido2SshIdKeyUsed;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setAlias(String str) {
        this.mAlias = str;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setColorScheme(String str) {
        ConnectionProperties config = getConfig();
        if (config != null) {
            config.setColorScheme(str);
        }
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setConfig(ConnectionType connectionType, ConnectionProperties connectionProperties) {
        int i10 = a.f27855a[connectionType.ordinal()];
        if (i10 == 1) {
            this.mSshProperties = (SshProperties) connectionProperties;
        } else if (i10 == 2) {
            this.mLocalProperties = (LocalProperties) connectionProperties;
        } else {
            if (i10 != 3) {
                return;
            }
            this.mTelnetProperties = (TelnetProperties) connectionProperties;
        }
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setConnectionOrigin(Avo.ConnectionOrigin connectionOrigin) {
        this.connectionOrigin = connectionOrigin;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setCountOfFailedSshIdKeys(int i10) {
        this.countOfFailedSshIdKeys = i10;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setHostId(Long l10) {
        this.mHostId = l10;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setId(long j10) {
        this.mId = j10;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setIsFido2SshIdKeyUsed(boolean z10) {
        this.isFido2SshIdKeyUsed = z10;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setIsSshIdKeyConnection(boolean z10) {
        this.isSshIdKeyConnection = z10;
    }

    public void setOsModelType(HostIconUtil.OsModelType osModelType) {
        this.mOsModelType = osModelType;
    }

    public void setSshProperties(SshProperties sshProperties) {
        this.mSshProperties = sshProperties;
    }

    public void setTelnetProperties(TelnetProperties telnetProperties) {
        this.mTelnetProperties = telnetProperties;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setType(ConnectionType connectionType) {
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public void setUUID(String str) {
        this.uuid = str;
    }

    public String toString() {
        return "Hostname: " + this.mAddress + "; Alias = " + this.mAlias;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.mId);
        parcel.writeParcelable(this.mSshProperties, i10);
        parcel.writeParcelable(this.mLocalProperties, i10);
        parcel.writeParcelable(this.mTelnetProperties, i10);
        HostIconUtil.OsModelType osModelType = this.mOsModelType;
        parcel.writeInt(osModelType == null ? -1 : osModelType.ordinal());
        parcel.writeString(this.mAddress);
        parcel.writeString(this.mAlias);
        parcel.writeValue(this.mHostId);
        parcel.writeString(this.uuid);
    }

    protected BaseConnection(long j10, String str, Long l10, String str2, String str3, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, HostIconUtil.OsModelType osModelType, Boolean bool, Avo.ConnectionOrigin connectionOrigin) {
        this(j10, str, l10, str2, str3, sshProperties, localProperties, telnetProperties, null, osModelType, bool, connectionOrigin);
    }

    protected BaseConnection(long j10, Long l10, String str, String str2, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, SerialProperties serialProperties, HostIconUtil.OsModelType osModelType, Boolean bool) {
        this.connectionOrigin = null;
        this.countOfFailedSshIdKeys = 0;
        this.isSshIdKeyConnection = false;
        this.isFido2SshIdKeyUsed = false;
        this.mId = j10;
        this.mHostId = l10;
        this.mAlias = str;
        this.mAddress = str2;
        this.mSshProperties = sshProperties;
        this.mLocalProperties = localProperties;
        this.mTelnetProperties = telnetProperties;
        this.serialProperties = serialProperties;
        this.mOsModelType = osModelType;
        this.mBackspaceType = bool;
    }

    protected BaseConnection(long j10, String str, Long l10, String str2, String str3, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, SerialProperties serialProperties, HostIconUtil.OsModelType osModelType, Boolean bool, Avo.ConnectionOrigin connectionOrigin) {
        this.countOfFailedSshIdKeys = 0;
        this.isSshIdKeyConnection = false;
        this.isFido2SshIdKeyUsed = false;
        this.mId = j10;
        this.mHostId = l10;
        this.mAlias = str2;
        this.mAddress = str3;
        this.mSshProperties = sshProperties;
        this.mLocalProperties = localProperties;
        this.mTelnetProperties = telnetProperties;
        this.serialProperties = serialProperties;
        this.mOsModelType = osModelType;
        this.mBackspaceType = bool;
        this.uuid = str;
        this.connectionOrigin = connectionOrigin;
    }

    protected BaseConnection(Parcel parcel) {
        this.mBackspaceType = null;
        this.connectionOrigin = null;
        this.countOfFailedSshIdKeys = 0;
        this.isSshIdKeyConnection = false;
        this.isFido2SshIdKeyUsed = false;
        this.mId = parcel.readLong();
        this.mSshProperties = (SshProperties) parcel.readParcelable(SshProperties.class.getClassLoader());
        this.mLocalProperties = (LocalProperties) parcel.readParcelable(LocalProperties.class.getClassLoader());
        this.mTelnetProperties = (TelnetProperties) parcel.readParcelable(TelnetProperties.class.getClassLoader());
        int i10 = parcel.readInt();
        this.mOsModelType = i10 != -1 ? HostIconUtil.OsModelType.values()[i10] : null;
        this.mAddress = parcel.readString();
        this.mAlias = parcel.readString();
        this.mHostId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.uuid = parcel.readString();
    }
}
