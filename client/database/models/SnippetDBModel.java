package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import java.util.Arrays;
import rg.s;
import y9.a;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetDBModel extends SyncableModel implements Parcelable {
    public static final Parcelable.Creator<SnippetDBModel> CREATOR = new Parcelable.Creator<SnippetDBModel>() { // from class: com.server.auditor.ssh.client.database.models.SnippetDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SnippetDBModel createFromParcel(Parcel parcel) {
            return new SnippetDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SnippetDBModel[] newArray(int i10) {
            return new SnippetDBModel[i10];
        }
    };
    private boolean mCloseAfterRunDefault;
    private String mExpression;
    private String mTitle;
    private Long packageId;
    private String scriptStructure;

    public SnippetDBModel(String str, String str2, boolean z10) {
        this.packageId = null;
        this.scriptStructure = "";
        try {
            l.f(str);
            l.f(str2);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on SnippetDBModel.java"));
        }
        this.mTitle = str;
        this.mExpression = str2;
        this.mCloseAfterRunDefault = z10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SnippetDBModel snippetDBModel = (SnippetDBModel) obj;
            String str = this.mTitle;
            if (str == null ? snippetDBModel.mTitle != null : !str.equals(snippetDBModel.mTitle)) {
                return false;
            }
            String str2 = this.mExpression;
            String str3 = snippetDBModel.mExpression;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean getCloseAfterRunDefault() {
        return this.mCloseAfterRunDefault;
    }

    public String getExpression() {
        return this.mExpression;
    }

    public Long getPackageId() {
        return this.packageId;
    }

    public String getScriptStructure() {
        return this.scriptStructure;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        Long l10 = this.packageId;
        return Arrays.hashCode(new String[]{this.mTitle, this.mExpression, l10 != null ? l10.toString() : "", String.valueOf(this.mCloseAfterRunDefault)});
    }

    public void setCloseAfterRunDefault(Boolean bool) {
        this.mCloseAfterRunDefault = bool.booleanValue();
    }

    public void setExpression(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on SnippetDBModel.java"));
        }
        this.mExpression = str;
    }

    public void setPackageId(Long l10) {
        this.packageId = l10;
    }

    public void setScriptStructure(String str) {
        this.scriptStructure = str;
    }

    public void setTitle(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on SnippetDBModel.java"));
        }
        this.mTitle = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("title", this.mTitle);
        contentValues.put(Column.EXPRESSION, this.mExpression);
        contentValues.put(Column.CLOSE_AFTER_RUN, Boolean.valueOf(this.mCloseAfterRunDefault));
        contentValues.put("package", this.packageId);
        contentValues.put(Column.SNIPPET_SCRIPT_STRUCTURE, this.scriptStructure);
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mExpression);
        parcel.writeValue(Boolean.valueOf(this.mCloseAfterRunDefault));
        parcel.writeValue(this.packageId);
        parcel.writeString(this.scriptStructure);
    }

    public SnippetDBModel(String str, String str2) {
        this(str, str2, true);
    }

    public SnippetDBModel(String str, String str2, boolean z10, long j10, int i10, String str3) {
        super(j10, str3, i10);
        this.packageId = null;
        this.scriptStructure = "";
        try {
            l.f(str);
            l.f(str2);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on SnippetDBModel.java"));
        }
        this.mTitle = str;
        this.mExpression = str2;
        this.mCloseAfterRunDefault = z10;
    }

    public SnippetDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.packageId = null;
        this.scriptStructure = "";
        int columnIndex = cursor.getColumnIndex("title");
        int columnIndex2 = cursor.getColumnIndex(Column.EXPRESSION);
        int columnIndex3 = cursor.getColumnIndex("package");
        int columnIndex4 = cursor.getColumnIndex(Column.SNIPPET_SCRIPT_STRUCTURE);
        this.mTitle = cursor.getString(columnIndex);
        this.mExpression = cursor.getString(columnIndex2);
        if (!cursor.isNull(columnIndex3)) {
            this.packageId = cursor.getLong(columnIndex3) != 0 ? Long.valueOf(cursor.getLong(columnIndex3)) : null;
        }
        String string = cursor.getString(columnIndex4);
        this.scriptStructure = string;
        if (string == null) {
            this.scriptStructure = "";
        }
        int columnIndex5 = cursor.getColumnIndex(Column.CLOSE_AFTER_RUN);
        boolean z10 = true;
        if (!cursor.isNull(columnIndex5) && (cursor.isNull(columnIndex5) || 1 != cursor.getInt(columnIndex5))) {
            z10 = false;
        }
        this.mCloseAfterRunDefault = z10;
    }

    public SnippetDBModel(Parcel parcel) {
        super(parcel);
        this.packageId = null;
        this.scriptStructure = "";
        this.mTitle = parcel.readString();
        this.mExpression = parcel.readString();
        this.mCloseAfterRunDefault = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.packageId = Long.valueOf(parcel.readLong());
        this.scriptStructure = parcel.readString();
    }
}
