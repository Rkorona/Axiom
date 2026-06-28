package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ChainingHost implements Parcelable {
    public static final Parcelable.Creator<ChainingHost> CREATOR = new a();
    private ArrayList<Host> mHostList;
    private Long mSshConfigId;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChainingHost createFromParcel(Parcel parcel) {
            return new ChainingHost(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChainingHost[] newArray(int i10) {
            return new ChainingHost[i10];
        }
    }

    public ChainingHost() {
        this.mHostList = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHeader() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.mHostList.size(); i10++) {
            sb2.append(this.mHostList.get(i10).getHeaderText());
            if (i10 < this.mHostList.size() - 1) {
                sb2.append(" → ");
            }
        }
        return sb2.toString();
    }

    public ArrayList<Host> getHostList() {
        return this.mHostList;
    }

    public Long getSshConfigId() {
        return this.mSshConfigId;
    }

    public void setHostList(List<Host> list) {
        this.mHostList.clear();
        this.mHostList.addAll(list);
    }

    public void setSshConfigId(Long l10) {
        this.mSshConfigId = l10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.mHostList);
    }

    public ChainingHost(Long l10, List<Host> list) {
        ArrayList<Host> arrayList = new ArrayList<>();
        this.mHostList = arrayList;
        this.mSshConfigId = l10;
        arrayList.addAll(list);
    }

    public ChainingHost(ChainHostsDBModel chainHostsDBModel) {
        this.mHostList = new ArrayList<>();
        this.mSshConfigId = Long.valueOf(chainHostsDBModel.getSshConfigId());
        ArrayList arrayListC = tp.h.c(chainHostsDBModel.getChainigHosts());
        if (arrayListC != null) {
            this.mHostList.addAll(arrayListC);
        }
    }

    public ChainingHost(Parcel parcel) {
        ArrayList<Host> arrayList = new ArrayList<>();
        this.mHostList = arrayList;
        parcel.readTypedList(arrayList, Host.CREATOR);
    }
}
