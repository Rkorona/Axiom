package com.server.auditor.ssh.client.models.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.config.base.BaseRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectionRemoteProperties extends ConnectionProperties {
    protected c identity;
    protected boolean mIsCursorBlink;
    protected a mPropertyChangedListener;
    protected c port;

    protected ConnectionRemoteProperties(Integer num, Identity identity, Long l10, String str, Integer num2, String str2, SnippetItem snippetItem, Boolean bool) {
        super(l10, str, num2, str2, snippetItem);
        this.identity = new c();
        c cVar = new c();
        this.port = cVar;
        cVar.f(num);
        this.identity.f(identity);
        this.mIsCursorBlink = bool.booleanValue();
    }

    private void notifyIdentityChanged(Identity identity) {
        a aVar = this.mPropertyChangedListener;
        if (aVar != null) {
            aVar.c(identity);
        }
    }

    private void notifyPasswordChanged(String str) {
        a aVar = this.mPropertyChangedListener;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    private void notifyPortChanged(Integer num) {
        a aVar = this.mPropertyChangedListener;
        if (aVar != null) {
            aVar.e(num);
        }
    }

    private void notifyUserChanged(String str) {
        a aVar = this.mPropertyChangedListener;
        if (aVar != null) {
            aVar.d(str);
        }
    }

    public String getEnvironmentVariables() {
        return null;
    }

    public Identity getIdentity() {
        return (Identity) this.identity.b();
    }

    public c getIdentityData() {
        return this.identity;
    }

    protected Identity getOrCreateIdentity() {
        if (this.identity.b() == null) {
            this.identity.f(new Identity());
        }
        return (Identity) this.identity.b();
    }

    public String getPassword() {
        if (this.identity.b() == null) {
            return null;
        }
        return ((Identity) this.identity.b()).getPassword();
    }

    public Integer getPort() {
        return (Integer) this.port.b();
    }

    public c getPortInheritanceData() {
        return this.port;
    }

    public Integer getPortOrDefaultValue() {
        Integer num = (Integer) this.port.b();
        return (num == null || num.intValue() == 0) ? this instanceof SshProperties ? 22 : 23 : num;
    }

    public Proxy getProxy() {
        return null;
    }

    public c getProxyData() {
        return null;
    }

    public String getUser() {
        if (this.identity.b() == null) {
            return null;
        }
        return ((Identity) this.identity.b()).getUsername();
    }

    public boolean isCursorBlink() {
        return this.mIsCursorBlink;
    }

    public void patchConfig(ConnectionRemoteProperties connectionRemoteProperties) {
        super.patchConfig((ConnectionProperties) connectionRemoteProperties);
        Integer num = (Integer) this.port.b();
        if (num == null || num.intValue() == 0) {
            this.port.f(connectionRemoteProperties.getPort());
        }
        if (this.identity.b() == null) {
            this.identity.f(connectionRemoteProperties.getIdentity());
            return;
        }
        if (!((Identity) this.identity.b()).isVisible() && connectionRemoteProperties.getIdentity() != null && !connectionRemoteProperties.getIdentity().isVisible()) {
            ((Identity) this.identity.b()).patch(connectionRemoteProperties.getIdentity());
            return;
        }
        if (!((Identity) this.identity.b()).isVisible() && c0.p(((Identity) this.identity.b()).getUsername()) && ((Identity) this.identity.b()).getSshKey() == null && ((Identity) this.identity.b()).getSshIdMode() == null && connectionRemoteProperties.getIdentity() != null && connectionRemoteProperties.getIdentity().isVisible()) {
            this.identity.f(connectionRemoteProperties.getIdentity());
        }
    }

    public void setIdentity(Identity identity) {
        this.identity.f(identity);
        notifyIdentityChanged(identity);
    }

    public void setIdentityAndSource(Identity identity, String str) {
        this.identity.f(identity);
        this.identity.e(str);
        if (identity.getUsername() != null && !identity.getUsername().isEmpty() && this.identity.b() != null) {
            ((Identity) this.identity.b()).getUsernameData().e(str);
            ((Identity) this.identity.b()).getUsernameData().d();
        }
        if (identity.getPassword() != null && !identity.getPassword().isEmpty() && this.identity.b() != null) {
            ((Identity) this.identity.b()).getPasswordData().e(str);
            ((Identity) this.identity.b()).getPasswordData().d();
        }
        if (identity.getSshKey() != null && this.identity.b() != null) {
            ((Identity) this.identity.b()).getSshKeyData().e(str);
            ((Identity) this.identity.b()).getSshKeyData().d();
        }
        if (identity.getSshIdMode() != null && this.identity.b() != null) {
            ((Identity) this.identity.b()).getSshIdModeData().e(str);
            ((Identity) this.identity.b()).getSshIdModeData().d();
        }
        notifyIdentityChanged(identity);
    }

    public void setOnPropertyChangedListener(a aVar) {
        this.mPropertyChangedListener = aVar;
    }

    public void setPassword(String str) {
        getOrCreateIdentity().setPassword(str);
        notifyPasswordChanged(str);
    }

    public void setPort(Integer num) {
        this.port.f(num);
        notifyPortChanged(num);
    }

    public void setPortAndSource(Integer num, String str) {
        this.port.f(num);
        this.port.e(str);
        notifyPortChanged(num);
    }

    public void setUser(String str) {
        getOrCreateIdentity().setUsername(str);
        notifyUserChanged(str);
    }

    public abstract BaseRemoteConfigDBModel toDBModel();

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable((Parcelable) this.identity.b(), i10);
        parcel.writeValue(this.port.b());
        parcel.writeByte(this.mIsCursorBlink ? (byte) 1 : (byte) 0);
    }

    protected ConnectionRemoteProperties(Parcel parcel) {
        super(parcel);
        this.identity = new c();
        this.port = new c();
        this.identity.f((Identity) parcel.readParcelable(Identity.class.getClassLoader()));
        this.port.f((Integer) parcel.readValue(Integer.class.getClassLoader()));
        this.mIsCursorBlink = parcel.readByte() != 0;
    }
}
