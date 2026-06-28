package com.server.auditor.ssh.client.models.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SshProperties extends ConnectionRemoteProperties {
    public static final Parcelable.Creator<SshProperties> CREATOR = new a();
    private c environmentVariables;
    private c isUseAgentForwarding;
    private Integer mHostChainSessionId;
    private Boolean mIsPortForwarding;
    private Boolean mIsUseMosh;
    private Integer mKeepAlivePackages;
    private Boolean mStrictCheckHostKey;
    private Integer mTimeout;
    private Boolean mUseSshKey;
    private c moshServerCommand;
    private c proxy;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SshProperties createFromParcel(Parcel parcel) {
            return new SshProperties(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SshProperties[] newArray(int i10) {
            return new SshProperties[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SshProperties() {
        Boolean bool = Boolean.FALSE;
        this(null, null, null, null, null, null, null, null, bool, null, null, bool);
    }

    private void notifyKeyChanged(SshKeyDBModel sshKeyDBModel) {
        com.server.auditor.ssh.client.models.properties.a aVar = this.mPropertyChangedListener;
        if (aVar != null) {
            aVar.b(sshKeyDBModel);
        }
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties
    public String getEnvironmentVariables() {
        return (String) this.environmentVariables.b();
    }

    public c getEnvironmentVariablesData() {
        return this.environmentVariables;
    }

    public Integer getHostChainSessionId() {
        return this.mHostChainSessionId;
    }

    public Integer getKeepAlivePackages() {
        return this.mKeepAlivePackages;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public Integer getMergeFontSize(Long l10) {
        SshProperties sshPropertiesA = aq.b.a(l10);
        if (sshPropertiesA != null) {
            return sshPropertiesA.getFontSize();
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedCharset(Long l10) {
        SshProperties sshPropertiesA = aq.b.a(l10);
        if (sshPropertiesA != null) {
            return sshPropertiesA.getCharset();
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedColorScheme(Long l10) {
        SshProperties sshPropertiesA = aq.b.a(l10);
        if (sshPropertiesA != null) {
            return sshPropertiesA.getColorScheme();
        }
        return null;
    }

    public String getMoshServerCommand() {
        return (String) this.moshServerCommand.b();
    }

    public c getMoshServerCommandData() {
        return this.moshServerCommand;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties
    public Proxy getProxy() {
        return (Proxy) this.proxy.b();
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties
    public c getProxyData() {
        return this.proxy;
    }

    public SshKeyDBModel getSshKey() {
        if (this.identity.b() == null) {
            return null;
        }
        return ((Identity) this.identity.b()).getSshKey();
    }

    public Integer getTimeout() {
        return this.mTimeout;
    }

    public c getUseAgentForwardingData() {
        return this.isUseAgentForwarding;
    }

    public int hashCode() {
        String strValueOf = String.valueOf(this.mIsUseMosh);
        String strValueOf2 = String.valueOf(this.isUseAgentForwarding.b());
        String strValueOf3 = String.valueOf(this.port.b());
        String title = this.startupSnippet.b() != null ? ((SnippetItem) this.startupSnippet.b()).getTitle() : "";
        return Arrays.hashCode(new String[]{strValueOf, strValueOf2, (String) this.moshServerCommand.b(), strValueOf3, (String) this.charset.b(), (String) this.colorScheme.b(), title, (String) this.environmentVariables.b()}) + (this.proxy.b() != null ? ((Proxy) this.proxy.b()).hashCode() : 0) + (this.identity.b() != null ? ((Identity) this.identity.b()).hashCode() : 0);
    }

    public Boolean isIsPortForwarding() {
        return this.mIsPortForwarding;
    }

    public Boolean isStrictCheckHostKey() {
        return this.mStrictCheckHostKey;
    }

    public Boolean isUseAgentForwarding() {
        return Boolean.valueOf(this.isUseAgentForwarding.b() == null ? false : ((Boolean) this.isUseAgentForwarding.b()).booleanValue());
    }

    public boolean isUseMosh() {
        Boolean bool = this.mIsUseMosh;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public Boolean isUseSshKey() {
        return this.mUseSshKey;
    }

    public void setEnvironmentVariables(String str) {
        this.environmentVariables.f(str);
    }

    public void setEnvironmentVariablesAndSource(String str, String str2) {
        this.environmentVariables.f(str);
        this.environmentVariables.e(str2);
    }

    public void setHostChainSessionId(Integer num) {
        this.mHostChainSessionId = num;
    }

    public void setMoshServerCommand(String str) {
        this.moshServerCommand.f(str);
    }

    public void setMoshServerCommandAndSource(String str, String str2) {
        this.moshServerCommand.f(str);
        this.moshServerCommand.e(str2);
    }

    public void setPortForwarding(Boolean bool) {
        this.mIsPortForwarding = bool;
    }

    public void setProxy(Proxy proxy) {
        this.proxy.f(proxy);
    }

    public void setProxyAndSource(Proxy proxy, String str) {
        this.proxy.f(proxy);
        this.proxy.e(str);
    }

    public void setSshKey(SshKeyDBModel sshKeyDBModel) {
        getOrCreateIdentity().setSshKey(sshKeyDBModel);
        notifyKeyChanged(sshKeyDBModel);
    }

    public void setTimeout(int i10) {
        this.mTimeout = Integer.valueOf(i10);
    }

    public void setUseAgentForwarding(Boolean bool) {
        this.isUseAgentForwarding.f(bool);
    }

    public void setUseAgentForwardingAndSource(Boolean bool, String str) {
        this.isUseAgentForwarding.f(bool);
        this.isUseAgentForwarding.e(str);
    }

    public void setUseMosh(Boolean bool) {
        this.mIsUseMosh = bool;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties, com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(this.mStrictCheckHostKey);
        parcel.writeValue(this.mUseSshKey);
        parcel.writeValue(this.mIsPortForwarding);
        parcel.writeValue(this.mTimeout);
        parcel.writeValue(this.mKeepAlivePackages);
        parcel.writeValue(this.mIsUseMosh);
        parcel.writeValue(this.moshServerCommand.b());
        parcel.writeValue(this.environmentVariables.b());
        parcel.writeValue(this.isUseAgentForwarding.b());
        parcel.writeValue(this.mHostChainSessionId);
        parcel.writeParcelable((Parcelable) this.proxy.b(), i10);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties
    public SshRemoteConfigDBModel toDBModel() {
        Integer num = this.mFontSize;
        Integer num2 = (Integer) this.port.b();
        Boolean bool = this.mIsUseMosh;
        String str = (String) this.moshServerCommand.b();
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.FALSE;
        return new SshRemoteConfigDBModel(num, num2, bool, str, bool2, bool2, bool3, bool3, 0, 0, (String) this.colorScheme.b(), (String) this.charset.b(), null, this.startupSnippet.b() != null ? Long.valueOf(((SnippetItem) this.startupSnippet.b()).getId()) : null, this.proxy.b() != null ? Long.valueOf(((Proxy) this.proxy.b()).getId()) : null, (String) this.environmentVariables.b(), (Boolean) this.isUseAgentForwarding.b());
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity) {
        this(num, str, num2, str2, identity, null, null, null, null);
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity, Boolean bool, String str3) {
        this(num, str, num2, str2, identity, null, null, null, bool, str3, null, null);
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity, Long l10) {
        this(num, str, num2, str2, identity, l10, null, null, null);
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity, Long l10, SnippetItem snippetItem, Proxy proxy, String str3) {
        super(num, identity, l10, str, num2, str2, snippetItem, Boolean.FALSE);
        this.proxy = new c();
        this.environmentVariables = new c();
        this.isUseAgentForwarding = new c(Boolean.TRUE, "", false);
        this.moshServerCommand = new c();
        this.mHostChainSessionId = null;
        this.proxy.f(proxy);
        this.environmentVariables.f(str3);
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity, Long l10, SnippetItem snippetItem, Proxy proxy, Boolean bool, String str3, String str4, Boolean bool2) {
        super(num, identity, l10, str, num2, str2, snippetItem, Boolean.FALSE);
        this.proxy = new c();
        this.environmentVariables = new c();
        this.isUseAgentForwarding = new c(Boolean.TRUE, "", false);
        this.moshServerCommand = new c();
        this.mHostChainSessionId = null;
        this.mIsUseMosh = bool;
        this.proxy.f(proxy);
        this.moshServerCommand.f(str3);
        this.environmentVariables.f(str4);
        this.isUseAgentForwarding.f(bool2);
    }

    public SshProperties(Integer num, String str, Integer num2, String str2, Identity identity, Long l10, SnippetItem snippetItem, Proxy proxy, Boolean bool, String str3, String str4, Boolean bool2, Integer num3) {
        super(num, identity, l10, str, num2, str2, snippetItem, Boolean.FALSE);
        this.proxy = new c();
        this.environmentVariables = new c();
        this.isUseAgentForwarding = new c(Boolean.TRUE, "", false);
        this.moshServerCommand = new c();
        this.mHostChainSessionId = null;
        this.mIsUseMosh = bool;
        this.proxy.f(proxy);
        this.moshServerCommand.f(str3);
        this.environmentVariables.f(str4);
        this.isUseAgentForwarding.f(bool2);
        this.mHostChainSessionId = num3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SshProperties(SshProperties sshProperties) {
        Integer num;
        Integer num2;
        if (sshProperties.port.b() != null) {
            Integer num3 = (Integer) sshProperties.port.b();
            num3.intValue();
            num = num3;
        } else {
            num = null;
        }
        String str = (String) sshProperties.colorScheme.b();
        Integer num4 = sshProperties.mFontSize;
        if (num4 != null) {
            num4.intValue();
            num2 = num4;
        } else {
            num2 = null;
        }
        this(num, str, num2, (String) sshProperties.charset.b(), sshProperties.identity.b() != null ? new Identity((Identity) sshProperties.identity.b()) : null, sshProperties.mDbId, sshProperties.startupSnippet.b() != null ? new SnippetItem((SnippetItem) sshProperties.startupSnippet.b()) : null, sshProperties.proxy.b() != null ? (Proxy) sshProperties.proxy.b() : null, sshProperties.mIsUseMosh, (String) sshProperties.moshServerCommand.b(), sshProperties.environmentVariables.b() != null ? (String) sshProperties.environmentVariables.b() : null, (Boolean) sshProperties.isUseAgentForwarding.b(), sshProperties.mHostChainSessionId);
    }

    protected SshProperties(Parcel parcel) {
        super(parcel);
        this.proxy = new c();
        this.environmentVariables = new c();
        this.isUseAgentForwarding = new c(Boolean.TRUE, "", false);
        this.moshServerCommand = new c();
        this.mHostChainSessionId = null;
        this.mStrictCheckHostKey = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.mUseSshKey = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.mIsPortForwarding = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.mTimeout = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.mKeepAlivePackages = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.mIsUseMosh = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.moshServerCommand.f((String) parcel.readValue(String.class.getClassLoader()));
        this.environmentVariables.f((String) parcel.readValue(String.class.getClassLoader()));
        this.isUseAgentForwarding.f((Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        this.mHostChainSessionId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.proxy.f((Proxy) parcel.readParcelable(Proxy.class.getClassLoader()));
    }
}
