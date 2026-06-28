package com.server.auditor.ssh.client.models.viewitems;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.adapters.PFRulesDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public class PFRuleViewItem extends Host {
    public static final Parcelable.Creator<PFRuleViewItem> CREATOR = new a();
    private final boolean mActive;
    private String mBoundAddress;
    private long mId;
    private boolean mIsInHosts;
    private String mLabel;
    private int mLocalPort;
    private String mRemoteAlias;
    private String mRemoteHost;
    private int mRemotePort;
    private String mRuleType;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PFRuleViewItem createFromParcel(Parcel parcel) {
            return new PFRuleViewItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PFRuleViewItem[] newArray(int i10) {
            return new PFRuleViewItem[i10];
        }
    }

    public PFRuleViewItem(String str, SshProperties sshProperties, String str2, long j10, String str3, String str4, int i10, String str5, String str6, int i11, boolean z10, String str7, VaultKeyId vaultKeyId) {
        super(str, str6, sshProperties, (TelnetProperties) null, (LocalProperties) null, (GroupDBModel) null, str2, (Boolean) null);
        this.mIsInHosts = false;
        this.mId = j10;
        this.mRuleType = str3;
        this.mBoundAddress = str4;
        this.mLocalPort = i10;
        this.mRemoteHost = str5;
        this.mRemoteAlias = str6;
        this.mRemotePort = i11;
        this.mActive = z10;
        this.mLabel = str7;
        this.vaultKeyId = vaultKeyId;
    }

    @Override // com.server.auditor.ssh.client.models.Host, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(RuleDBModel ruleDBModel, URI uri) {
        return this.mBoundAddress.equals(ruleDBModel.getBoundAddress()) && this.mRemoteHost.equals(ruleDBModel.getHost()) && this.mLabel.equals(ruleDBModel.getLabel()) && this.mLocalPort == ruleDBModel.getLocalPort() && this.mRemotePort == ruleDBModel.getRemotePort() && getUri().equals(uri);
    }

    public String getDescription() {
        return PFRulesDBAdapter.makeDescriptionString(this.mRuleType, this.mLocalPort, this.mRemoteHost, this.mRemotePort, getReadableHostname());
    }

    @Override // com.server.auditor.ssh.client.models.Host, com.server.auditor.ssh.client.models.BaseConnection, com.server.auditor.ssh.client.models.connections.Connection
    public long getId() {
        return this.mId;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public String getRemoteAlias() {
        return this.mRemoteAlias;
    }

    public String getRuleType() {
        return this.mRuleType;
    }

    public boolean isActive() {
        return this.mActive;
    }

    public boolean isInHost() {
        return this.mIsInHosts;
    }

    public void setRemoteAlias(String str) {
        this.mRemoteAlias = str;
    }

    @Override // com.server.auditor.ssh.client.models.Host, com.server.auditor.ssh.client.models.BaseConnection, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    public PFRuleViewItem(Parcel parcel) {
        super(parcel);
        this.mId = -1L;
        this.mIsInHosts = false;
        this.mActive = false;
    }
}
