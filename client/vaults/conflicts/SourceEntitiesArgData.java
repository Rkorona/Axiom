package com.server.auditor.ssh.client.vaults.conflicts;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SourceEntitiesArgData implements Parcelable {
    private final Class<? extends SyncableModel> entityType;
    private final long localId;
    public static final Parcelable.Creator<SourceEntitiesArgData> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SourceEntitiesArgData createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SourceEntitiesArgData((Class) parcel.readSerializable(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SourceEntitiesArgData[] newArray(int i10) {
            return new SourceEntitiesArgData[i10];
        }
    }

    public SourceEntitiesArgData(Class<? extends SyncableModel> cls, long j10) {
        t.f(cls, "entityType");
        this.entityType = cls;
        this.localId = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SourceEntitiesArgData copy$default(SourceEntitiesArgData sourceEntitiesArgData, Class cls, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cls = sourceEntitiesArgData.entityType;
        }
        if ((i10 & 2) != 0) {
            j10 = sourceEntitiesArgData.localId;
        }
        return sourceEntitiesArgData.copy(cls, j10);
    }

    public final Class<? extends SyncableModel> component1() {
        return this.entityType;
    }

    public final long component2() {
        return this.localId;
    }

    public final SourceEntitiesArgData copy(Class<? extends SyncableModel> cls, long j10) {
        t.f(cls, "entityType");
        return new SourceEntitiesArgData(cls, j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceEntitiesArgData)) {
            return false;
        }
        SourceEntitiesArgData sourceEntitiesArgData = (SourceEntitiesArgData) obj;
        return t.b(this.entityType, sourceEntitiesArgData.entityType) && this.localId == sourceEntitiesArgData.localId;
    }

    public final Class<? extends SyncableModel> getEntityType() {
        return this.entityType;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public int hashCode() {
        return (this.entityType.hashCode() * 31) + Long.hashCode(this.localId);
    }

    public String toString() {
        return "SourceEntitiesArgData(entityType=" + this.entityType + ", localId=" + this.localId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeSerializable(this.entityType);
        parcel.writeLong(this.localId);
    }
}
