package com.server.auditor.ssh.client.models.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.SnippetItem;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectionProperties implements Parcelable, Cloneable {
    private static final String DEFAULT = "Default";
    protected c charset;
    protected c colorScheme;
    protected Long mDbId;
    protected Integer mFontSize;
    private boolean mIsNeedShowTerminal;
    protected c startupSnippet;

    protected ConnectionProperties(Long l10, String str, Integer num, String str2, SnippetItem snippetItem) {
        this.mDbId = null;
        this.colorScheme = new c();
        this.charset = new c();
        this.startupSnippet = new c();
        this.mIsNeedShowTerminal = true;
        this.mDbId = l10;
        this.colorScheme.f(str);
        this.mFontSize = num;
        this.charset.f(str2);
        this.startupSnippet.f(snippetItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCharset() {
        return (String) this.charset.b();
    }

    public c getCharsetData() {
        return this.charset;
    }

    public String getColorScheme() {
        String str = (String) this.colorScheme.b();
        if (str == null || str.equalsIgnoreCase("Default")) {
            return null;
        }
        return str;
    }

    public c getColorSchemeData() {
        String str = (String) this.colorScheme.b();
        if (str == null || str.equalsIgnoreCase("Default")) {
            this.colorScheme.f(null);
        }
        return this.colorScheme;
    }

    public Long getDbId() {
        return this.mDbId;
    }

    public Integer getFontSize() {
        return this.mFontSize;
    }

    public String getLocalPath() {
        return null;
    }

    public abstract Integer getMergeFontSize(Long l10);

    public abstract String getMergedCharset(Long l10);

    public abstract String getMergedColorScheme(Long l10);

    public SnippetItem getStartupSnippet() {
        return (SnippetItem) this.startupSnippet.b();
    }

    public c getStartupSnippetData() {
        return this.startupSnippet;
    }

    public boolean isNeedShowTerminal() {
        return this.mIsNeedShowTerminal;
    }

    public void patchConfig(ConnectionProperties connectionProperties) {
        if (c0.p((String) this.charset.b())) {
            this.charset.f(connectionProperties.getCharset());
        }
        if (c0.p((String) this.colorScheme.b())) {
            this.colorScheme.f(connectionProperties.getColorScheme());
        }
        if (this.startupSnippet.b() == null) {
            this.startupSnippet.f(connectionProperties.getStartupSnippet());
        }
    }

    public void setCharset(String str) {
        this.charset.f(str);
    }

    public void setCharsetAndSource(String str, String str2) {
        this.charset.f(str);
        this.charset.e(str2);
    }

    public void setColorScheme(String str) {
        this.colorScheme.f(str);
    }

    public void setColorSchemeAndSource(String str, String str2) {
        this.colorScheme.f(str);
        this.colorScheme.e(str2);
    }

    public void setFontSize(Integer num) {
        this.mFontSize = num;
    }

    public void setNeedShowTerminal(boolean z10) {
        this.mIsNeedShowTerminal = z10;
    }

    public void setStartupSnippet(SnippetItem snippetItem) {
        this.startupSnippet.f(snippetItem);
    }

    public void setStartupSnippetAndSource(SnippetItem snippetItem, String str) {
        this.startupSnippet.f(snippetItem);
        this.startupSnippet.e(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.mDbId);
        parcel.writeString((String) this.colorScheme.b());
        parcel.writeValue(this.mFontSize);
        parcel.writeString((String) this.charset.b());
        parcel.writeParcelable((Parcelable) this.startupSnippet.b(), i10);
        parcel.writeByte(this.mIsNeedShowTerminal ? (byte) 1 : (byte) 0);
    }

    protected ConnectionProperties(Parcel parcel) {
        this.mDbId = null;
        this.colorScheme = new c();
        this.charset = new c();
        this.startupSnippet = new c();
        this.mIsNeedShowTerminal = true;
        this.mDbId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.colorScheme.f(parcel.readString());
        this.mFontSize = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.charset.f(parcel.readString());
        this.startupSnippet.f((SnippetItem) parcel.readParcelable(SnippetItem.class.getClassLoader()));
        this.mIsNeedShowTerminal = parcel.readByte() != 0;
    }
}
