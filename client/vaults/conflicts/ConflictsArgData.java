package com.server.auditor.ssh.client.vaults.conflicts;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class ConflictsArgData implements Parcelable {
    private final Class<? extends SyncableModel> entityType;
    private final String footer;
    private final String header;
    private final Integer iconResId;
    public static final Parcelable.Creator<ConflictsArgData> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConflictsArgData createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ConflictsArgData((Class) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConflictsArgData[] newArray(int i10) {
            return new ConflictsArgData[i10];
        }
    }

    public ConflictsArgData(Class<? extends SyncableModel> cls, String str, String str2, Integer num) {
        t.f(cls, "entityType");
        t.f(str, "header");
        t.f(str2, "footer");
        this.entityType = cls;
        this.header = str;
        this.footer = str2;
        this.iconResId = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConflictsArgData copy$default(ConflictsArgData conflictsArgData, Class cls, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cls = conflictsArgData.entityType;
        }
        if ((i10 & 2) != 0) {
            str = conflictsArgData.header;
        }
        if ((i10 & 4) != 0) {
            str2 = conflictsArgData.footer;
        }
        if ((i10 & 8) != 0) {
            num = conflictsArgData.iconResId;
        }
        return conflictsArgData.copy(cls, str, str2, num);
    }

    public final Class<? extends SyncableModel> component1() {
        return this.entityType;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.footer;
    }

    public final Integer component4() {
        return this.iconResId;
    }

    public final ConflictsArgData copy(Class<? extends SyncableModel> cls, String str, String str2, Integer num) {
        t.f(cls, "entityType");
        t.f(str, "header");
        t.f(str2, "footer");
        return new ConflictsArgData(cls, str, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConflictsArgData)) {
            return false;
        }
        ConflictsArgData conflictsArgData = (ConflictsArgData) obj;
        return t.b(this.entityType, conflictsArgData.entityType) && t.b(this.header, conflictsArgData.header) && t.b(this.footer, conflictsArgData.footer) && t.b(this.iconResId, conflictsArgData.iconResId);
    }

    public final Class<? extends SyncableModel> getEntityType() {
        return this.entityType;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final String getHeader() {
        return this.header;
    }

    public final Integer getIconResId() {
        return this.iconResId;
    }

    public int hashCode() {
        int iHashCode = ((((this.entityType.hashCode() * 31) + this.header.hashCode()) * 31) + this.footer.hashCode()) * 31;
        Integer num = this.iconResId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ConflictsArgData(entityType=" + this.entityType + ", header=" + this.header + ", footer=" + this.footer + ", iconResId=" + this.iconResId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeSerializable(this.entityType);
        parcel.writeString(this.header);
        parcel.writeString(this.footer);
        Integer num = this.iconResId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
