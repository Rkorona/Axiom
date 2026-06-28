package com.server.auditor.ssh.client.models.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.Identity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class TelnetProperties extends ConnectionRemoteProperties {
    public static final Parcelable.Creator<TelnetProperties> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TelnetProperties createFromParcel(Parcel parcel) {
            return new TelnetProperties(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TelnetProperties[] newArray(int i10) {
            return new TelnetProperties[i10];
        }
    }

    public TelnetProperties(Long l10, String str, Integer num, String str2, Integer num2, Identity identity) {
        super(num2, identity, l10, str, num, str2, null, Boolean.FALSE);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public Integer getMergeFontSize(Long l10) {
        TelnetProperties telnetPropertiesA = aq.c.a(l10);
        if (telnetPropertiesA != null) {
            return telnetPropertiesA.getFontSize();
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedCharset(Long l10) {
        TelnetProperties telnetPropertiesA = aq.c.a(l10);
        if (telnetPropertiesA != null) {
            return telnetPropertiesA.getCharset();
        }
        return null;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getMergedColorScheme(Long l10) {
        TelnetProperties telnetPropertiesA = aq.c.a(l10);
        if (telnetPropertiesA != null) {
            return telnetPropertiesA.getColorScheme();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{String.valueOf(this.port.b()), (String) this.charset.b(), (String) this.colorScheme.b()}) + (this.identity.b() != null ? ((Identity) this.identity.b()).hashCode() : 0);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties, com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TelnetProperties(TelnetProperties telnetProperties) {
        Integer fontSize;
        Integer port;
        Long dbId = telnetProperties.getDbId();
        String colorScheme = telnetProperties.getColorScheme();
        if (telnetProperties.getFontSize() != null) {
            fontSize = telnetProperties.getFontSize();
            fontSize.intValue();
        } else {
            fontSize = null;
        }
        String charset = telnetProperties.getCharset();
        if (telnetProperties.getPort() != null) {
            port = telnetProperties.getPort();
            port.intValue();
        } else {
            port = null;
        }
        this(dbId, colorScheme, fontSize, charset, port, telnetProperties.getIdentity() != null ? new Identity(telnetProperties.getIdentity()) : null);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionRemoteProperties
    public TelnetRemoteConfigDBModel toDBModel() {
        return new TelnetRemoteConfigDBModel(this.mFontSize, (Integer) this.port.b(), Boolean.valueOf(this.mIsCursorBlink), null, (String) this.colorScheme.b(), (String) this.charset.b());
    }

    public TelnetProperties() {
        super(null, null, null, null, null, null, null, Boolean.FALSE);
    }

    protected TelnetProperties(Parcel parcel) {
        super(parcel);
    }
}
