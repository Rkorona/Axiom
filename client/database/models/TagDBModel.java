package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import kj.a;
import kj.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TagDBModel extends SyncableModel implements f, Comparable<TagDBModel>, a {
    private boolean mIsSelected;
    private String mTitle;

    public TagDBModel(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            y9.a.f86838a.i(new MergeException("Couldn't validate a value on TagDBModel.java"));
        }
        this.mTitle = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TagDBModel)) {
            return false;
        }
        TagDBModel tagDBModel = (TagDBModel) obj;
        return tagDBModel.getTitle() != null && tagDBModel.getTitle().equals(getTitle());
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (int) this.mId;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public void setSelected(boolean z10) {
        this.mIsSelected = z10;
    }

    public void setTitle(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            y9.a.f86838a.i(new MergeException("Couldn't validate a value on TagDBModel.java"));
        }
        this.mTitle = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("title", this.mTitle);
        return contentValues;
    }

    public String toString() {
        return getTitle();
    }

    @Override // java.lang.Comparable
    public int compareTo(TagDBModel tagDBModel) {
        return getTitle().compareTo(tagDBModel.getTitle());
    }

    public TagDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mTitle = cursor.getString(cursor.getColumnIndex("title"));
    }
}
