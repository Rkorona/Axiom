package com.server.auditor.ssh.client.navigation.sshkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class EditKeyData implements Parcelable {
    private String action;
    private String certificate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f29583id;
    private SshKeyDBModel sshKeyDBModel;
    public static final Parcelable.Creator<EditKeyData> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditKeyData createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new EditKeyData((SshKeyDBModel) parcel.readParcelable(EditKeyData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EditKeyData[] newArray(int i10) {
            return new EditKeyData[i10];
        }
    }

    public EditKeyData() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ EditKeyData copy$default(EditKeyData editKeyData, SshKeyDBModel sshKeyDBModel, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sshKeyDBModel = editKeyData.sshKeyDBModel;
        }
        if ((i11 & 2) != 0) {
            str = editKeyData.action;
        }
        if ((i11 & 4) != 0) {
            str2 = editKeyData.certificate;
        }
        if ((i11 & 8) != 0) {
            i10 = editKeyData.f29583id;
        }
        return editKeyData.copy(sshKeyDBModel, str, str2, i10);
    }

    public final SshKeyDBModel component1() {
        return this.sshKeyDBModel;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.certificate;
    }

    public final int component4() {
        return this.f29583id;
    }

    public final EditKeyData copy(SshKeyDBModel sshKeyDBModel, String str, String str2, int i10) {
        t.f(str, "action");
        t.f(str2, Table.SSH_CERTIFICATE);
        return new EditKeyData(sshKeyDBModel, str, str2, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditKeyData)) {
            return false;
        }
        EditKeyData editKeyData = (EditKeyData) obj;
        return t.b(this.sshKeyDBModel, editKeyData.sshKeyDBModel) && t.b(this.action, editKeyData.action) && t.b(this.certificate, editKeyData.certificate) && this.f29583id == editKeyData.f29583id;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final int getId() {
        return this.f29583id;
    }

    public final SshKeyDBModel getSshKeyDBModel() {
        return this.sshKeyDBModel;
    }

    public int hashCode() {
        SshKeyDBModel sshKeyDBModel = this.sshKeyDBModel;
        return ((((((sshKeyDBModel == null ? 0 : sshKeyDBModel.hashCode()) * 31) + this.action.hashCode()) * 31) + this.certificate.hashCode()) * 31) + Integer.hashCode(this.f29583id);
    }

    public final void setAction(String str) {
        t.f(str, "<set-?>");
        this.action = str;
    }

    public final void setCertificate(String str) {
        t.f(str, "<set-?>");
        this.certificate = str;
    }

    public final void setId(int i10) {
        this.f29583id = i10;
    }

    public final void setSshKeyDBModel(SshKeyDBModel sshKeyDBModel) {
        this.sshKeyDBModel = sshKeyDBModel;
    }

    public String toString() {
        return "EditKeyData(sshKeyDBModel=" + this.sshKeyDBModel + ", action=" + this.action + ", certificate=" + this.certificate + ", id=" + this.f29583id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeParcelable(this.sshKeyDBModel, i10);
        parcel.writeString(this.action);
        parcel.writeString(this.certificate);
        parcel.writeInt(this.f29583id);
    }

    public EditKeyData(SshKeyDBModel sshKeyDBModel, String str, String str2, int i10) {
        t.f(str, "action");
        t.f(str2, Table.SSH_CERTIFICATE);
        this.sshKeyDBModel = sshKeyDBModel;
        this.action = str;
        this.certificate = str2;
        this.f29583id = i10;
    }

    public /* synthetic */ EditKeyData(SshKeyDBModel sshKeyDBModel, String str, String str2, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? null : sshKeyDBModel, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0 : i10);
    }
}
