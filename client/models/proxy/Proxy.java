package com.server.auditor.ssh.client.models.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.models.Identity;
import hg.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Proxy implements Parcelable {
    public static final Parcelable.Creator<Proxy> CREATOR = new a();
    private String mHost;
    private Long mId;
    private Identity mIdentity;
    private int mPort;
    private ProxyType mType;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proxy createFromParcel(Parcel parcel) {
            return new Proxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Proxy[] newArray(int i10) {
            return new Proxy[i10];
        }
    }

    public Proxy(ProxyType proxyType, String str, int i10, Identity identity) {
        this.mType = proxyType;
        this.mHost = str;
        this.mPort = i10;
        this.mIdentity = identity;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHost() {
        return this.mHost;
    }

    public long getId() {
        Long l10 = this.mId;
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public Identity getIdentity() {
        return this.mIdentity;
    }

    public int getPort() {
        return this.mPort;
    }

    public ProxyType getType() {
        return this.mType;
    }

    public int hashCode() {
        String strValueOf = String.valueOf(this.mPort);
        Identity identity = this.mIdentity;
        return Arrays.hashCode(new String[]{this.mType.name(), this.mHost, strValueOf}) + (identity != null ? identity.hashCode() : 0);
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setId(Long l10) {
        this.mId = l10;
    }

    public void setIdentity(Identity identity) {
        this.mIdentity = identity;
    }

    public void setPort(int i10) {
        this.mPort = i10;
    }

    public void setType(ProxyType proxyType) {
        this.mType = proxyType;
    }

    public com.crystalnix.terminal.transport.ssh.a toJTEModel() {
        String username;
        String password;
        ProxyType type = getType();
        String host = getHost();
        int port = getPort();
        if (getIdentity() != null) {
            username = getIdentity().getUsername();
            password = getIdentity().getPassword();
        } else {
            username = null;
            password = null;
        }
        return new com.crystalnix.terminal.transport.ssh.a(type.name(), host, port, username, password);
    }

    public String toString() {
        String strConcat = this.mType.name().concat(" ").concat(this.mHost).concat(":").concat(String.valueOf(this.mPort));
        if (this.mIdentity == null) {
            return strConcat;
        }
        String strConcat2 = strConcat.concat(" [");
        if (!TextUtils.isEmpty(this.mIdentity.getUsername())) {
            strConcat2 = strConcat2.concat(this.mIdentity.getUsername());
        }
        if (!TextUtils.isEmpty(this.mIdentity.getPassword())) {
            strConcat2 = strConcat2.concat(" - ").concat(this.mIdentity.getPassword().replaceAll(".?", "•"));
        }
        return strConcat2.concat("]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mType.name());
        parcel.writeString(this.mHost);
        parcel.writeInt(this.mPort);
        parcel.writeParcelable(this.mIdentity, i10);
    }

    public Proxy(Long l10, ProxyType proxyType, String str, int i10, Identity identity) {
        this.mId = l10;
        this.mType = proxyType;
        this.mHost = str;
        this.mPort = i10;
        this.mIdentity = identity;
    }

    public Proxy(ProxyDBModel proxyDBModel) {
        this.mId = Long.valueOf(proxyDBModel.getIdInDatabase());
        this.mType = ProxyType.valueOf(proxyDBModel.getType());
        this.mHost = proxyDBModel.getHost();
        this.mPort = proxyDBModel.getPort();
        if (proxyDBModel.getIdentityId() != null) {
            this.mIdentity = f.p().n().getApplicationModel(proxyDBModel.getIdentityId().longValue());
        }
    }

    public Proxy(Parcel parcel) {
        this.mType = ProxyType.valueOf(parcel.readString());
        this.mHost = parcel.readString();
        this.mPort = parcel.readInt();
        this.mIdentity = (Identity) parcel.readParcelable(Identity.class.getClassLoader());
    }
}
