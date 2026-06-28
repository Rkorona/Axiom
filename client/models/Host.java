package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.fragments.history.ConnectionStatus;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.connections.HostType;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SerialProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import tp.c0;
import tp.e1;
import tp.h0;

/* JADX INFO: loaded from: classes3.dex */
public class Host extends BaseConnection implements IVaultKeyIdHolder {
    public static final Parcelable.Creator<Host> CREATOR = new a();
    private String credentialsMode;
    private Long hostRemoteId;
    private boolean isShared;
    private GroupDBModel mGroup;

    @Deprecated
    private String mInteractionDate;
    private String mRecentConnectionDate;
    private int mUseCounter;
    private String sortingByDateField;
    private String updatedAt;
    protected VaultKeyId vaultKeyId;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Host createFromParcel(Parcel parcel) {
            return new Host(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Host[] newArray(int i10) {
            return new Host[i10];
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27859a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f27859a = iArr;
            try {
                iArr[ConnectionType.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27859a[ConnectionType.ssh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27859a[ConnectionType.both_ssh_telnet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27859a[ConnectionType.local.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27859a[ConnectionType.telnet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public Host(long j10, Long l10, String str, String str2, SshProperties sshProperties, TelnetProperties telnetProperties, LocalProperties localProperties, GroupDBModel groupDBModel, String str3, String str4, String str5, String str6, int i10, Boolean bool, VaultKeyId vaultKeyId) {
        this(str, str2, sshProperties, telnetProperties, localProperties, groupDBModel, str3, bool);
        this.mId = j10;
        this.hostRemoteId = l10;
        this.mHostId = Long.valueOf(j10);
        this.updatedAt = str4;
        this.mRecentConnectionDate = str5;
        this.mInteractionDate = str6;
        this.mUseCounter = i10;
        this.vaultKeyId = vaultKeyId;
    }

    private int getHashOfTags() {
        Iterator<TagHostDBModel> it = hg.f.p().c0().getTagHostsByHostId(this.mId).iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
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
            com.server.auditor.ssh.client.models.connections.ConnectionType r2 = r4.getType()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            int[] r1 = com.server.auditor.ssh.client.models.Host.b.f27859a
            com.server.auditor.ssh.client.models.connections.ConnectionType r2 = r4.getType()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 2
            if (r1 == r2) goto L1f
            goto L4a
        L1f:
            com.server.auditor.ssh.client.models.properties.SshProperties r1 = r4.getSshProperties()
            com.server.auditor.ssh.client.models.properties.SshProperties r2 = r5.getSshProperties()
            if (r1 == 0) goto L47
            if (r2 == 0) goto L46
            com.server.auditor.ssh.client.models.Identity r3 = r1.getIdentity()
            if (r3 == 0) goto L40
            com.server.auditor.ssh.client.models.Identity r1 = r1.getIdentity()
            com.server.auditor.ssh.client.models.Identity r2 = r2.getIdentity()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4a
            return r0
        L40:
            com.server.auditor.ssh.client.models.Identity r1 = r2.getIdentity()
            if (r1 == 0) goto L4a
        L46:
            return r0
        L47:
            if (r2 == 0) goto L4a
            return r0
        L4a:
            java.net.URI r1 = r4.getUri()
            if (r1 == 0) goto L5f
            java.net.URI r1 = r4.getUri()
            java.net.URI r2 = r5.getUri()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5f
            return r0
        L5f:
            java.lang.String r0 = r4.getHost()
            java.lang.String r5 = r5.getHost()
            boolean r5 = r0.equals(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.models.Host.equals(com.server.auditor.ssh.client.models.connections.Connection):boolean");
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public ConnectionStatus getConnectionStatus() {
        return ConnectionStatus.unknown;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getCreatedAt() {
        return this.mInteractionDate;
    }

    public String getCredentialsMode() {
        return this.credentialsMode;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public String getErrorMessage() {
        return null;
    }

    public GroupDBModel getGroup() {
        return this.mGroup;
    }

    public String getHeaderText() {
        return !c0.p(this.mAlias) ? this.mAlias : this.mAddress;
    }

    public Long getHostRemoteId() {
        return this.hostRemoteId;
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public HostType getHostType() {
        return this.mLocalProperties != null ? HostType.local : HostType.remote;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public long getId() {
        return this.mId;
    }

    @Deprecated
    public String getInteractionDate() {
        return this.mInteractionDate;
    }

    public String getRecentConnectionDate() {
        return this.mRecentConnectionDate;
    }

    public String getSortingByDateField() {
        return this.sortingByDateField;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public ConnectionType getType() {
        if (this.mLocalProperties != null) {
            return ConnectionType.local;
        }
        SshProperties sshProperties = this.mSshProperties;
        return (sshProperties == null || this.mTelnetProperties == null) ? sshProperties != null ? ConnectionType.ssh : this.mTelnetProperties != null ? ConnectionType.telnet : this.serialProperties != null ? ConnectionType.serial : ConnectionType.none : ConnectionType.both_ssh_telnet;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public URI getUri() {
        Integer port;
        TelnetProperties telnetProperties;
        int i10 = b.f27859a[getType().ordinal()];
        String user = null;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return h0.a();
            }
            if (i10 == 5 && (telnetProperties = getTelnetProperties()) != null) {
                return e1.f(getHost(), !c0.p(telnetProperties.getUser()) ? telnetProperties.getUser() : "", telnetProperties.getPort());
            }
            return null;
        }
        SshProperties sshProperties = getSshProperties();
        if (sshProperties != null) {
            user = sshProperties.getUser();
            port = sshProperties.getPort();
            if (sshProperties.isUseMosh()) {
                return e1.d(getHost(), user, port);
            }
        } else {
            port = null;
        }
        return e1.e(user, getHost(), port);
    }

    public int getUseCounter() {
        return this.mUseCounter;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public int hashCode() {
        GroupDBModel groupDBModel = this.mGroup;
        String title = groupDBModel != null ? groupDBModel.getTitle() : "";
        String strValueOf = String.valueOf(getBackspaceType());
        SshProperties sshProperties = this.mSshProperties;
        int iHashCode = sshProperties != null ? sshProperties.hashCode() : 0;
        TelnetProperties telnetProperties = this.mTelnetProperties;
        return Arrays.hashCode(new String[]{this.mAlias, this.mAddress, title, strValueOf}) + iHashCode + (telnetProperties != null ? telnetProperties.hashCode() : 0) + getHashOfTags();
    }

    public boolean isShared() {
        return this.isShared;
    }

    public HostDBModel patchHostDBModel(HostDBModel hostDBModel) {
        hostDBModel.setTitle(this.mAlias);
        hostDBModel.setAddress(this.mAddress);
        hostDBModel.setBackspaceType(this.mBackspaceType);
        GroupDBModel groupDBModel = this.mGroup;
        if (groupDBModel != null) {
            hostDBModel.setGroupId(Long.valueOf(groupDBModel.getIdInDatabase()));
            return hostDBModel;
        }
        hostDBModel.setGroupId(null);
        return hostDBModel;
    }

    public void setCredentialsMode(String str) {
        this.credentialsMode = str;
    }

    public void setGroup(GroupDBModel groupDBModel) {
        this.mGroup = groupDBModel;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public void setId(long j10) {
        this.mId = j10;
    }

    @Deprecated
    public void setInteractionDate(String str) {
        this.mInteractionDate = str;
    }

    public void setShared(boolean z10) {
        this.isShared = z10;
    }

    public void setSortingByDateField(String str) {
        this.sortingByDateField = str;
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public void setType(ConnectionType connectionType) {
    }

    public void setUseCounter(int i10) {
        this.mUseCounter = i10;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    public HostDBModel toDBModel(Long l10, Long l11, Long l12, Long l13, String str, String str2, String str3) {
        return new HostDBModel(this.mAlias, "", this.mAddress, l10, l11, l12, l13, str, str2, this.mUseCounter, this.mBackspaceType, str3);
    }

    @Override // com.server.auditor.ssh.client.models.BaseConnection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mRecentConnectionDate);
        parcel.writeString(this.mInteractionDate);
    }

    @Override // com.server.auditor.ssh.client.models.connections.Connection
    public Host cloneConnection() {
        return new Host(this.mId, this.hostRemoteId, this.mAddress, this.mAlias, this.mSshProperties != null ? new SshProperties(this.mSshProperties) : null, this.mTelnetProperties != null ? new TelnetProperties(this.mTelnetProperties) : null, this.mLocalProperties != null ? new LocalProperties(this.mLocalProperties) : null, this.mGroup, this.mOsModelType.name(), this.updatedAt, this.mRecentConnectionDate, this.mInteractionDate, 0, this.mBackspaceType, this.vaultKeyId);
    }

    public Host(String str, String str2, SshProperties sshProperties, TelnetProperties telnetProperties, LocalProperties localProperties, GroupDBModel groupDBModel, String str3, Boolean bool) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAlias = str2;
        this.mAddress = str;
        this.mSshProperties = sshProperties;
        this.mLocalProperties = localProperties;
        this.mTelnetProperties = telnetProperties;
        this.mOsModelType = HostIconUtil.OsModelType.valueOf(str3);
        this.mGroup = groupDBModel;
        this.mBackspaceType = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Host) {
            Host host = (Host) obj;
            if (this.mId == host.getId() && this.mUseCounter == host.mUseCounter && isShared() == host.isShared() && Objects.equals(getHostRemoteId(), host.getHostRemoteId()) && Objects.equals(this.mRecentConnectionDate, host.mRecentConnectionDate) && Objects.equals(this.mInteractionDate, host.mInteractionDate) && Objects.equals(getSortingByDateField(), host.getSortingByDateField()) && Objects.equals(getVaultKeyId(), host.getVaultKeyId()) && Objects.equals(getCredentialsMode(), host.getCredentialsMode()) && Objects.equals(getUpdatedAt(), host.getUpdatedAt()) && Objects.equals(this.mGroup, host.mGroup)) {
                return true;
            }
        }
        return false;
    }

    public Host(String str, String str2, SshProperties sshProperties) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAlias = str2;
        this.mAddress = str;
        this.mSshProperties = sshProperties;
        this.mOsModelType = HostIconUtil.OsModelType.none;
    }

    public Host(String str, String str2, TelnetProperties telnetProperties) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAlias = str2;
        this.mAddress = str;
        this.mTelnetProperties = telnetProperties;
        this.mOsModelType = HostIconUtil.OsModelType.none;
    }

    public Host(String str, String str2, LocalProperties localProperties) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAlias = str2;
        this.mAddress = str;
        this.mLocalProperties = localProperties;
        this.mOsModelType = HostIconUtil.OsModelType.android;
    }

    public Host(String str, SerialProperties serialProperties) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        this.mAlias = str;
        this.mAddress = str;
        this.serialProperties = serialProperties;
        this.mOsModelType = HostIconUtil.OsModelType.none;
    }

    public Host(String str, String str2, SshProperties sshProperties, TelnetProperties telnetProperties, LocalProperties localProperties, GroupDBModel groupDBModel, Boolean bool) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAlias = str2;
        this.mAddress = str;
        this.mSshProperties = sshProperties;
        this.mTelnetProperties = telnetProperties;
        this.mLocalProperties = localProperties;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        this.mGroup = groupDBModel;
        this.mBackspaceType = bool;
    }

    public Host(String str, String str2, SshProperties sshProperties, TelnetProperties telnetProperties, LocalProperties localProperties, GroupDBModel groupDBModel, Boolean bool, String str3) {
        this(str, str2, sshProperties, telnetProperties, localProperties, groupDBModel, bool);
        this.credentialsMode = str3;
    }

    public Host(String str) {
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        fw.l.d(str);
        this.mAddress = str;
        this.mOsModelType = HostIconUtil.OsModelType.none;
    }

    protected Host(Parcel parcel) {
        super(parcel);
        this.hostRemoteId = null;
        this.mUseCounter = 0;
        this.isShared = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.credentialsMode = null;
        this.updatedAt = null;
        this.mRecentConnectionDate = parcel.readString();
        this.mInteractionDate = parcel.readString();
    }
}
