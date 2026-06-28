package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.SyncableModel;

/* JADX INFO: loaded from: classes3.dex */
public final class TypedEntityIdentifier implements Parcelable {
    private final long localId;
    private final Class<? extends SyncableModel> type;
    public static final Parcelable.Creator<TypedEntityIdentifier> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TypedEntityIdentifier createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new TypedEntityIdentifier(parcel.readLong(), (Class) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TypedEntityIdentifier[] newArray(int i10) {
            return new TypedEntityIdentifier[i10];
        }
    }

    public TypedEntityIdentifier(long j10, Class<? extends SyncableModel> cls) {
        ju.t.f(cls, Column.TYPE);
        this.localId = j10;
        this.type = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypedEntityIdentifier copy$default(TypedEntityIdentifier typedEntityIdentifier, long j10, Class cls, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = typedEntityIdentifier.localId;
        }
        if ((i10 & 2) != 0) {
            cls = typedEntityIdentifier.type;
        }
        return typedEntityIdentifier.copy(j10, cls);
    }

    public final long component1() {
        return this.localId;
    }

    public final Class<? extends SyncableModel> component2() {
        return this.type;
    }

    public final TypedEntityIdentifier copy(long j10, Class<? extends SyncableModel> cls) {
        ju.t.f(cls, Column.TYPE);
        return new TypedEntityIdentifier(j10, cls);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedEntityIdentifier)) {
            return false;
        }
        TypedEntityIdentifier typedEntityIdentifier = (TypedEntityIdentifier) obj;
        return this.localId == typedEntityIdentifier.localId && ju.t.b(this.type, typedEntityIdentifier.type);
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final Class<? extends SyncableModel> getType() {
        return this.type;
    }

    public int hashCode() {
        return (Long.hashCode(this.localId) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TypedEntityIdentifier(localId=" + this.localId + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        parcel.writeLong(this.localId);
        parcel.writeSerializable(this.type);
    }
}
