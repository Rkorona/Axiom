package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.fragments.history.ConnectionStatus;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.connections.HostType;
import com.server.auditor.ssh.client.models.properties.ConnectionProperties;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.models.proxy.ProxyType;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;

/* JADX INFO: loaded from: classes3.dex */
public class UsedHost extends BaseConnection implements IVaultKeyIdHolder {
    public static final Parcelable.Creator<UsedHost> CREATOR = new b();
    public static final String DEFAULT_SHELL_PATH = "/system/bin/sh";
    private Long hostLocalId;
    private com.server.auditor.ssh.client.models.properties.a mConnectionPropertyChangedListener;
    private ConnectionStatus mConnectionStatus;
    private final String mCreatedAt;
    private String mErrorMessage;
    private final HostType mHostType;
    private Long mRemoteId;
    private ConnectionType mType;
    private VaultKeyId vaultKeyId;

    class a implements com.server.auditor.ssh.client.models.properties.a {
        a() {
        }

        @Override // com.server.auditor.ssh.client.models.properties.a
        public void a(String str) {
            SshProperties sshProperties = UsedHost.this.getSshProperties();
            if (UsedHost.this.mType != ConnectionType.ssh || sshProperties == null) {
                return;
            }
            sshProperties.setPassword(hg.f.p().v().a(tp.i.e(str)));
        }

        @Override // com.server.auditor.ssh.client.models.properties.a
        public void b(SshKeyDBModel sshKeyDBModel) {
            if (UsedHost.this.mType == ConnectionType.ssh) {
                UsedHost.this.getSshProperties().getIdentity().setSshKey(sshKeyDBModel);
            }
        }

        @Override // com.server.auditor.ssh.client.models.properties.a
        public void c(Identity identity) {
        }

        @Override // com.server.auditor.ssh.client.models.properties.a
        public void d(String str) {
        }

        @Override // com.server.auditor.ssh.client.models.properties.a
        public void e(Integer num) {
        }
    }

    class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UsedHost createFromParcel(Parcel parcel) {
            return new UsedHost(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UsedHost[] newArray(int i10) {
            return new UsedHost[i10];
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27866a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f27866a = iArr;
            try {
                iArr[ConnectionType.ssh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27866a[ConnectionType.local.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27866a[ConnectionType.telnet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27866a[ConnectionType.serial.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private UsedHost(ConnectionType connectionType, HostType hostType, String str, String str2, SshProperties sshProperties, LocalProperties localProperties, TelnetProperties telnetProperties, HostIconUtil.OsModelType osModelType, String str3, Long l10, Boolean bool, VaultKeyId vaultKeyId, Long l11) {
        super(l10.longValue(), null, null, str, str2, sshProperties, localProperties, telnetProperties, osModelType, bool, null);
        this.mErrorMessage = null;
        this.mRemoteId = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.hostLocalId = null;
        this.mConnectionPropertyChangedListener = new a();
        this.mType = connectionType;
        this.mHostType = hostType;
        this.mCreatedAt = str3;
        this.vaultKeyId = vaultKeyId;
        this.hostLocalId = l11;
    }

    private Proxy initProxy(tl.u uVar) {
        Identity identity = null;
        if (TextUtils.isEmpty(uVar.z()) || TextUtils.isEmpty(uVar.w())) {
            return null;
        }
        int iIntValue = (uVar.y() == null || uVar.y().intValue() <= 0) ? 80 : uVar.y().intValue();
        if (!TextUtils.isEmpty(uVar.A())) {
            identity = new Identity(uVar.A(), !TextUtils.isEmpty(uVar.x()) ? uVar.x() : null, null, false);
        }
        return new Proxy(ProxyType.valueOf(uVar.z()), uVar.w(), iIntValue, identity);
    }

    private void initialize(tl.u uVar) {
        this.mAlias = uVar.H();
        this.mAddress = uVar.m();
        if (TextUtils.isEmpty(uVar.o())) {
            this.mOsModelType = HostIconUtil.OsModelType.none;
        } else {
            try {
                this.mOsModelType = HostIconUtil.OsModelType.valueOf(uVar.o());
            } catch (IllegalArgumentException unused) {
                this.mOsModelType = HostIconUtil.OsModelType.none;
            }
        }
        if (uVar.f() < 0 || uVar.f() >= ConnectionStatus.values().length) {
            this.mConnectionStatus = ConnectionStatus.unknown;
        } else {
            this.mConnectionStatus = ConnectionStatus.values()[uVar.f()];
        }
        this.mErrorMessage = uVar.l();
        int i10 = c.f27866a[this.mType.ordinal()];
        if (i10 == 1) {
            initializeSshProperties(uVar);
        } else if (i10 == 2) {
            initializeLocalProperties(uVar);
        } else {
            if (i10 != 3) {
                return;
            }
            initializeTelnetProperties(uVar);
        }
    }

    private void initializeCommon(tl.u uVar, ConnectionProperties connectionProperties) {
        int i10;
        try {
            i10 = Integer.parseInt(com.server.auditor.ssh.client.app.a.N().M().getString("fontSize", "8"));
        } catch (NumberFormatException unused) {
            i10 = Integer.parseInt("8");
        }
        connectionProperties.setFontSize(Integer.valueOf(i10));
        connectionProperties.setColorScheme(uVar.e());
        connectionProperties.setCharset(uVar.d());
    }

    private void initializeLocalProperties(tl.u uVar) {
        LocalProperties localProperties = new LocalProperties();
        this.mLocalProperties = localProperties;
        initializeCommon(uVar, localProperties);
        String strS = uVar.s();
        if (strS == null || TextUtils.isEmpty("/system/bin/sh")) {
            strS = "/system/bin/sh";
        }
        this.mLocalProperties.setLocalPath(strS);
        if (uVar.E() != null) {
            this.mLocalProperties.setStartupSnippet(new SnippetItem(uVar.E(), -1L));
        }
        if (TextUtils.isEmpty(uVar.r())) {
            return;
        }
        this.mLocalProperties.setLocalArgv(TextUtils.split(uVar.r(), ","));
    }

    private void initializeSshProperties(tl.u uVar) {
        SshProperties sshProperties = new SshProperties();
        this.mSshProperties = sshProperties;
        initializeCommon(uVar, sshProperties);
        if (uVar.E() != null) {
            this.mSshProperties.setStartupSnippet(new SnippetItem(uVar.E(), -1L));
        }
        this.mSshProperties.setPort(uVar.u());
        this.mSshProperties.setUser(uVar.J());
        this.mSshProperties.setUseMosh(Boolean.valueOf(uVar.Q()));
        this.mSshProperties.setMoshServerCommand(uVar.t());
        this.mSshProperties.setProxy(initProxy(uVar));
        this.mSshProperties.setEnvironmentVariables(uVar.k());
        this.mSshProperties.setOnPropertyChangedListener(this.mConnectionPropertyChangedListener);
    }

    private void initializeTelnetProperties(tl.u uVar) {
        TelnetProperties telnetProperties = new TelnetProperties();
        this.mTelnetProperties = telnetProperties;
        initializeCommon(uVar, telnetProperties);
        this.mTelnetProperties.setPort(uVar.u());
        this.mTelnetProperties.setUser(uVar.J());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2.getIdentity() != null) goto L21;
     */
    @Override // com.server.auditor.ssh.client.models.connections.Connection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(com.server.auditor.ssh.client.models.connections.Connection r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.server.auditor.ssh.client.models.connections.ConnectionType r1 = r5.getType()
            com.server.auditor.ssh.client.models.connections.ConnectionType r2 = r4.mType
            if (r1 == r2) goto Ld
            return r0
        Ld:
            int[] r1 = com.server.auditor.ssh.client.models.UsedHost.c.f27866a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L19
            goto L44
        L19:
            com.server.auditor.ssh.client.models.properties.SshProperties r1 = r4.getSshProperties()
            com.server.auditor.ssh.client.models.properties.SshProperties r2 = r5.getSshProperties()
            if (r1 == 0) goto L41
            if (r2 == 0) goto L40
            com.server.auditor.ssh.client.models.Identity r3 = r1.getIdentity()
            if (r3 == 0) goto L3a
            com.server.auditor.ssh.client.models.Identity r1 = r1.getIdentity()
            com.server.auditor.ssh.client.models.Identity r2 = r2.getIdentity()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            return r0
        L3a:
            com.server.auditor.ssh.client.models.Identity r1 = r2.getIdentity()
            if (r1 == 0) goto L44
        L40:
            return r0
        L41:
            if (r2 == 0) goto L44
            return r0
        L44:
            java.net.URI r1 = r4.getUri()
            if (r1 == 0) goto L59
            java.net.URI r1 = r4.getUri()
            java.net.URI r2 = r5.getUri()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L59
            return r0
        L59:
            java.lang.String r1 = r4.getHost()
            if (r1 == 0) goto L6e
            java.lang.String r1 = r4.getHost()
            java.lang.String r2 = r5.getHost()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            return r0
        L6e:
            java.lang.String r0 = r4.getCreatedAt()
            if (r0 == 0) goto L79
            java.lang.String r0 = r4.getCreatedAt()
            goto L7b
        L79:
            java.lang.String r0 = ""
        L7b:
            java.lang.String r5 = r5.getCreatedAt()
            boolean r5 = r0.equals(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.models.UsedHost.equals(com.server.auditor.ssh.client.models.connections.Connection):boolean");
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public String getAlias() {
        return this.mAlias;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public String getColorScheme() {
        ConnectionProperties config = getConfig();
        if (config == null) {
            return null;
        }
        return config.getColorScheme();
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

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public Integer getFontSize() {
        ConnectionProperties config = getConfig();
        if (config == null || config.getFontSize() == null || config.getFontSize().intValue() == 0) {
            return null;
        }
        return config.getFontSize();
    }

    public Long getHostLocalId() {
        return this.hostLocalId;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public HostType getHostType() {
        return this.mHostType;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public HostIconUtil.OsModelType getOsModelType() {
        return this.mOsModelType;
    }

    public Long getRemoteId() {
        return this.mRemoteId;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public ConnectionType getType() {
        return this.mType;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public boolean isHostHistory() {
        return this.mHostId != null;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public void setAlias(String str) {
        this.mAlias = str;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public void setColorScheme(String str) {
        ConnectionProperties config = getConfig();
        if (config != null) {
            config.setColorScheme(str);
        }
        setConfig(getType(), config);
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public void setType(ConnectionType connectionType) {
        this.mType = connectionType;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        ConnectionType connectionType = this.mType;
        parcel.writeInt(connectionType == null ? -1 : connectionType.ordinal());
        HostType hostType = this.mHostType;
        parcel.writeInt(hostType == null ? -1 : hostType.ordinal());
        parcel.writeString(this.mCreatedAt);
        ConnectionStatus connectionStatus = this.mConnectionStatus;
        parcel.writeInt(connectionStatus != null ? connectionStatus.ordinal() : -1);
        parcel.writeString(this.mErrorMessage);
        parcel.writeString(this.uuid);
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public UsedHost cloneConnection() {
        return new UsedHost(this.mType, this.mHostType, this.mAlias, getHost(), getSshProperties(), getLocalProperties(), getTelnetProperties(), getOsModelType(), this.mCreatedAt, Long.valueOf(this.mId), this.mBackspaceType, this.vaultKeyId, this.hostLocalId);
    }

    public UsedHost(tl.u uVar) {
        this.mErrorMessage = null;
        this.mRemoteId = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.hostLocalId = null;
        this.mConnectionPropertyChangedListener = new a();
        ConnectionType connectionType = ConnectionType.getConnectionType(uVar.g());
        this.mType = connectionType;
        if (connectionType == ConnectionType.local) {
            this.mHostType = HostType.local;
        } else {
            this.mHostType = HostType.remote;
        }
        this.hostLocalId = uVar.n();
        this.mCreatedAt = uVar.h();
        this.mId = uVar.p();
        this.mRemoteId = Long.valueOf(uVar.q());
        this.vaultKeyId = uVar.K();
        setHostId(uVar.n());
        initialize(uVar);
    }

    protected UsedHost(Parcel parcel) {
        super(parcel);
        this.mErrorMessage = null;
        this.mRemoteId = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.hostLocalId = null;
        this.mConnectionPropertyChangedListener = new a();
        int i10 = parcel.readInt();
        this.mType = i10 == -1 ? null : ConnectionType.values()[i10];
        int i11 = parcel.readInt();
        this.mHostType = i11 == -1 ? null : HostType.values()[i11];
        this.mCreatedAt = parcel.readString();
        int i12 = parcel.readInt();
        this.mConnectionStatus = i12 != -1 ? ConnectionStatus.values()[i12] : null;
        this.mErrorMessage = parcel.readString();
        this.uuid = parcel.readString();
    }
}
