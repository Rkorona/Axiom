package com.server.auditor.ssh.client.synchronization.api.models;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class MobileDeviceHelper implements Parcelable {
    public static final Parcelable.Creator<MobileDeviceHelper> CREATOR = new Parcelable.Creator<MobileDeviceHelper>() { // from class: com.server.auditor.ssh.client.synchronization.api.models.MobileDeviceHelper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MobileDeviceHelper createFromParcel(Parcel parcel) {
            return new MobileDeviceHelper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MobileDeviceHelper[] newArray(int i10) {
            return new MobileDeviceHelper[i10];
        }
    };
    private String mAppVersion;
    private String mName;
    private String mOsVersion;
    private String mSubName;
    private String mToken;
    private String mType;

    public MobileDeviceHelper() {
        this.mType = "Google";
        this.mOsVersion = Build.VERSION.RELEASE;
        this.mToken = hg.f.p().f();
        this.mAppVersion = hg.f.p().h0();
        this.mName = com.server.auditor.ssh.client.app.a.N().G();
        this.mSubName = Build.BOARD;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getName() {
        return this.mName;
    }

    public String getOsVersion() {
        return this.mOsVersion;
    }

    public String getSubName() {
        return this.mSubName;
    }

    public String getToken() {
        return this.mToken;
    }

    public String getType() {
        return this.mType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }

    public MobileDeviceHelper(Parcel parcel) {
        this();
    }
}
