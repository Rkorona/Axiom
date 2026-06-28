package com.server.auditor.ssh.client.models.properties;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.models.config.LocalConfigDBModel;
import com.server.auditor.ssh.client.models.SnippetItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class LocalProperties extends ConnectionProperties {
    public static final Parcelable.Creator<LocalProperties> CREATOR = new a();
    private String[] mLocalArgv;
    private String mLocalPath;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalProperties createFromParcel(Parcel parcel) {
            return new LocalProperties(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalProperties[] newArray(int i10) {
            return new LocalProperties[i10];
        }
    }

    public LocalProperties() {
        super(null, null, null, null, null);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalProperties)) {
            return false;
        }
        LocalProperties localProperties = (LocalProperties) obj;
        String str = this.mLocalPath;
        if (str == null ? localProperties.mLocalPath == null : str.equals(localProperties.mLocalPath)) {
            return Arrays.equals(this.mLocalArgv, localProperties.mLocalArgv);
        }
        return false;
    }

    public String[] getLocalArgv() {
        return this.mLocalArgv;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public String getLocalPath() {
        return this.mLocalPath;
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties
    public Integer getMergeFontSize(Long l10) {
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
        return null;
    }

    public int hashCode() {
        String str = this.mLocalPath;
        return ((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.mLocalArgv);
    }

    public void setLocalArgv(String[] strArr) {
        this.mLocalArgv = strArr;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public LocalConfigDBModel toDBModel() {
        return new LocalConfigDBModel(this.mFontSize, (String) this.colorScheme.b(), (String) this.charset.b(), this.startupSnippet.b() == null ? null : Long.valueOf(((SnippetItem) this.startupSnippet.b()).getId()), this.mLocalPath, this.mLocalArgv);
    }

    @Override // com.server.auditor.ssh.client.models.properties.ConnectionProperties, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mLocalPath);
        parcel.writeStringArray(this.mLocalArgv);
    }

    public LocalProperties(String str) {
        super(null, null, null, null, null);
        this.mLocalPath = str;
    }

    public LocalProperties(Long l10, String str, Integer num, String str2, SnippetItem snippetItem, String str3, String str4) {
        super(l10, str, num, str2, snippetItem);
        this.mLocalPath = str3;
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        this.mLocalArgv = str4.split("\\s+");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalProperties(LocalProperties localProperties) {
        Long l10 = localProperties.mDbId;
        String str = (String) localProperties.colorScheme.b();
        Integer num = localProperties.mFontSize;
        if (num != null) {
            num.intValue();
        } else {
            num = null;
        }
        this(l10, str, num, (String) localProperties.charset.b(), localProperties.startupSnippet.b() != null ? new SnippetItem((SnippetItem) localProperties.startupSnippet.b()) : null, localProperties.getLocalPath(), null);
    }

    protected LocalProperties(Parcel parcel) {
        super(parcel);
        this.mLocalPath = parcel.readString();
        this.mLocalArgv = parcel.createStringArray();
    }
}
