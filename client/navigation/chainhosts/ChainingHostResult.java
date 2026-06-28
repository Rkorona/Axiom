package com.server.auditor.ssh.client.navigation.chainhosts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class ChainingHostResult implements Parcelable {
    private final List<Long> chainingHostIds;
    private final Long sshConfigId;
    public static final Parcelable.Creator<ChainingHostResult> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainingHostResult createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new ChainingHostResult(lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainingHostResult[] newArray(int i10) {
            return new ChainingHostResult[i10];
        }
    }

    public ChainingHostResult(Long l10, List<Long> list) {
        t.f(list, "chainingHostIds");
        this.sshConfigId = l10;
        this.chainingHostIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainingHostResult copy$default(ChainingHostResult chainingHostResult, Long l10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = chainingHostResult.sshConfigId;
        }
        if ((i10 & 2) != 0) {
            list = chainingHostResult.chainingHostIds;
        }
        return chainingHostResult.copy(l10, list);
    }

    public final Long component1() {
        return this.sshConfigId;
    }

    public final List<Long> component2() {
        return this.chainingHostIds;
    }

    public final ChainingHostResult copy(Long l10, List<Long> list) {
        t.f(list, "chainingHostIds");
        return new ChainingHostResult(l10, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainingHostResult)) {
            return false;
        }
        ChainingHostResult chainingHostResult = (ChainingHostResult) obj;
        return t.b(this.sshConfigId, chainingHostResult.sshConfigId) && t.b(this.chainingHostIds, chainingHostResult.chainingHostIds);
    }

    public final List<Long> getChainingHostIds() {
        return this.chainingHostIds;
    }

    public final Long getSshConfigId() {
        return this.sshConfigId;
    }

    public int hashCode() {
        Long l10 = this.sshConfigId;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + this.chainingHostIds.hashCode();
    }

    public String toString() {
        return "ChainingHostResult(sshConfigId=" + this.sshConfigId + ", chainingHostIds=" + this.chainingHostIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        Long l10 = this.sshConfigId;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        List<Long> list = this.chainingHostIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }
}
