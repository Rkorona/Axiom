package com.server.auditor.ssh.client.synchronization.api.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class UserPlanModel implements Parcelable {
    private final String planType;
    private final Integer userId;
    public static final Parcelable.Creator<UserPlanModel> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<UserPlanModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserPlanModel createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new UserPlanModel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserPlanModel[] newArray(int i10) {
            return new UserPlanModel[i10];
        }
    }

    public UserPlanModel(String str, Integer num) {
        t.f(str, "planType");
        this.planType = str;
        this.userId = num;
    }

    public static /* synthetic */ UserPlanModel copy$default(UserPlanModel userPlanModel, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userPlanModel.planType;
        }
        if ((i10 & 2) != 0) {
            num = userPlanModel.userId;
        }
        return userPlanModel.copy(str, num);
    }

    public final String component1() {
        return this.planType;
    }

    public final Integer component2() {
        return this.userId;
    }

    public final UserPlanModel copy(String str, Integer num) {
        t.f(str, "planType");
        return new UserPlanModel(str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPlanModel)) {
            return false;
        }
        UserPlanModel userPlanModel = (UserPlanModel) obj;
        return t.b(this.planType, userPlanModel.planType) && t.b(this.userId, userPlanModel.userId);
    }

    public final String getPlanType() {
        return this.planType;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.planType.hashCode() * 31;
        Integer num = this.userId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "UserPlanModel(planType=" + this.planType + ", userId=" + this.userId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.planType);
        Integer num = this.userId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ UserPlanModel(String str, Integer num, int i10, k kVar) {
        this((i10 & 1) != 0 ? WelcomeFlowViewModel.planTypeFree : str, num);
    }
}
