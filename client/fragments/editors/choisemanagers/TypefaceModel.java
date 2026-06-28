package com.server.auditor.ssh.client.fragments.editors.choisemanagers;

import android.os.Parcel;
import android.os.Parcelable;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceModel implements Parcelable {
    private final String typefacePath;
    private final String typefaceTitle;
    public static final Parcelable.Creator<TypefaceModel> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypefaceModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new TypefaceModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TypefaceModel[] newArray(int i10) {
            return new TypefaceModel[i10];
        }
    }

    public TypefaceModel(String str, String str2) {
        t.f(str, "typefaceTitle");
        t.f(str2, "typefacePath");
        this.typefaceTitle = str;
        this.typefacePath = str2;
    }

    public static /* synthetic */ TypefaceModel copy$default(TypefaceModel typefaceModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = typefaceModel.typefaceTitle;
        }
        if ((i10 & 2) != 0) {
            str2 = typefaceModel.typefacePath;
        }
        return typefaceModel.copy(str, str2);
    }

    public final String component1() {
        return this.typefaceTitle;
    }

    public final String component2() {
        return this.typefacePath;
    }

    public final TypefaceModel copy(String str, String str2) {
        t.f(str, "typefaceTitle");
        t.f(str2, "typefacePath");
        return new TypefaceModel(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceModel)) {
            return false;
        }
        TypefaceModel typefaceModel = (TypefaceModel) obj;
        return t.b(this.typefaceTitle, typefaceModel.typefaceTitle) && t.b(this.typefacePath, typefaceModel.typefacePath);
    }

    public final String getTypefacePath() {
        return this.typefacePath;
    }

    public final String getTypefaceTitle() {
        return this.typefaceTitle;
    }

    public int hashCode() {
        return (this.typefaceTitle.hashCode() * 31) + this.typefacePath.hashCode();
    }

    public String toString() {
        return "TypefaceModel(typefaceTitle=" + this.typefaceTitle + ", typefacePath=" + this.typefacePath + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.typefaceTitle);
        parcel.writeString(this.typefacePath);
    }
}
