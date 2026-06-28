package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetItem implements Parcelable, IVaultKeyIdHolder {
    public static final Parcelable.Creator<SnippetItem> CREATOR = new a();
    private static final int noRemoteId = -1;
    private static final String noScriptStructure = "";
    protected boolean isShared;
    private boolean mCloseAfterRun;
    private boolean mExecute;
    private long mId;
    private String mScript;
    private String mTitle;
    private Long packageId;
    private final long remoteId;
    private String scriptStructure;
    private VaultKeyId vaultKeyId;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnippetItem createFromParcel(Parcel parcel) {
            return new SnippetItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnippetItem[] newArray(int i10) {
            return new SnippetItem[i10];
        }
    }

    public SnippetItem(String str, long j10) {
        this(null, str, true, false, j10, false, null, "", -1L, VaultKeyId.Companion.a());
    }

    public void clearPackage() {
        this.packageId = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SnippetItem snippetItem = (SnippetItem) obj;
            if (this.mId == snippetItem.mId && Objects.equals(this.mScript, snippetItem.mScript)) {
                return true;
            }
        }
        return false;
    }

    public long getId() {
        return this.mId;
    }

    public String getOriginTitle() {
        return this.mTitle;
    }

    public Long getPackageId() {
        return this.packageId;
    }

    public long getRemoteId() {
        return this.remoteId;
    }

    public String getScript() {
        return this.mScript;
    }

    public String getScriptStructure() {
        return this.scriptStructure;
    }

    public String getTitle() {
        if ("".equals(this.mTitle)) {
            String[] strArrSplit = this.mScript.split("\n");
            if (strArrSplit.length > 0) {
                return strArrSplit[0];
            }
        }
        return this.mTitle;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public int hashCode() {
        return Objects.hash(this.mScript, Long.valueOf(this.mId));
    }

    public boolean isCloseAfterRun() {
        return this.mCloseAfterRun;
    }

    public boolean isExecute() {
        return this.mExecute;
    }

    public boolean isShared() {
        return this.isShared;
    }

    public void setCloseAfterRun(boolean z10) {
        this.mCloseAfterRun = z10;
    }

    public void setExecute(boolean z10) {
        this.mExecute = z10;
    }

    public void setId(long j10) {
        this.mId = j10;
    }

    public void setPackageId(Long l10) {
        this.packageId = l10;
    }

    public void setScript(String str) {
        this.mScript = str;
    }

    public void setScriptStructure(String str) {
        this.scriptStructure = str;
    }

    public void setShared(boolean z10) {
        this.isShared = z10;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    public String toString() {
        return getTitle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mScript);
        parcel.writeByte(this.mExecute ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mCloseAfterRun ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.mId);
        parcel.writeLong(this.remoteId);
        parcel.writeString(this.scriptStructure);
        this.vaultKeyId.writeToParcel(parcel, i10);
    }

    public SnippetItem(String str, String str2, long j10) {
        this(str, str2, false, false, j10, false, null, "", -1L, VaultKeyId.Companion.a());
    }

    public SnippetItem(String str, String str2, long j10, Long l10, VaultKeyId vaultKeyId) {
        this(str, str2, false, false, j10, false, l10, "", -1L, vaultKeyId);
    }

    public SnippetItem(String str, String str2, long j10, Long l10, String str3, long j11, VaultKeyId vaultKeyId) {
        this(str, str2, false, false, j10, false, l10, str3, j11, vaultKeyId);
    }

    public SnippetItem(String str, String str2, boolean z10, boolean z11, long j10, boolean z12, Long l10, String str3, long j11, VaultKeyId vaultKeyId) {
        this.packageId = null;
        VaultKeyId.Companion.a();
        this.mTitle = str;
        this.mScript = str2;
        this.mExecute = z10;
        this.mCloseAfterRun = z11;
        this.mId = j10;
        this.isShared = z12;
        this.packageId = l10;
        this.scriptStructure = str3;
        this.remoteId = j11;
        this.vaultKeyId = vaultKeyId;
    }

    public SnippetItem(SnippetItem snippetItem) {
        this(snippetItem.mTitle, snippetItem.mScript, snippetItem.mExecute, snippetItem.mCloseAfterRun, snippetItem.mId, snippetItem.isShared, snippetItem.packageId, snippetItem.scriptStructure, snippetItem.remoteId, snippetItem.getVaultKeyId());
    }

    public SnippetItem(SnippetDBModel snippetDBModel) {
        this(snippetDBModel.getTitle(), snippetDBModel.getExpression(), false, snippetDBModel.getCloseAfterRunDefault(), snippetDBModel.getIdInDatabase(), snippetDBModel.isShared(), snippetDBModel.getPackageId(), snippetDBModel.getScriptStructure(), snippetDBModel.getIdOnServer(), snippetDBModel.getVaultKeyId());
    }

    protected SnippetItem(Parcel parcel) {
        this.packageId = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mTitle = parcel.readString();
        this.mScript = parcel.readString();
        this.mExecute = parcel.readByte() != 0;
        this.mCloseAfterRun = parcel.readByte() != 0;
        this.mId = parcel.readLong();
        this.remoteId = parcel.readLong();
        this.scriptStructure = parcel.readString();
        this.vaultKeyId = VaultKeyId.CREATOR.createFromParcel(parcel);
    }
}
