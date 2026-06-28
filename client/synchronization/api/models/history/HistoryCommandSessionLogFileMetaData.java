package com.server.auditor.ssh.client.synchronization.api.models.history;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryCommandSessionLogFileMetaData implements Parcelable {
    private final String filename;
    private final String secretKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HistoryCommandSessionLogFileMetaData> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return HistoryCommandSessionLogFileMetaData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<HistoryCommandSessionLogFileMetaData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryCommandSessionLogFileMetaData createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new HistoryCommandSessionLogFileMetaData(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryCommandSessionLogFileMetaData[] newArray(int i10) {
            return new HistoryCommandSessionLogFileMetaData[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryCommandSessionLogFileMetaData() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ HistoryCommandSessionLogFileMetaData copy$default(HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = historyCommandSessionLogFileMetaData.filename;
        }
        if ((i10 & 2) != 0) {
            str2 = historyCommandSessionLogFileMetaData.secretKey;
        }
        return historyCommandSessionLogFileMetaData.copy(str, str2);
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getFilename$annotations() {
    }

    @o("secretKey")
    public static /* synthetic */ void getSecretKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || historyCommandSessionLogFileMetaData.filename != null) {
            dVar.v(fVar, 0, x2.f64817a, historyCommandSessionLogFileMetaData.filename);
        }
        if (!dVar.E(fVar, 1) && historyCommandSessionLogFileMetaData.secretKey == null) {
            return;
        }
        dVar.v(fVar, 1, x2.f64817a, historyCommandSessionLogFileMetaData.secretKey);
    }

    public final String component1() {
        return this.filename;
    }

    public final String component2() {
        return this.secretKey;
    }

    public final HistoryCommandSessionLogFileMetaData copy(String str, String str2) {
        return new HistoryCommandSessionLogFileMetaData(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryCommandSessionLogFileMetaData)) {
            return false;
        }
        HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData = (HistoryCommandSessionLogFileMetaData) obj;
        return t.b(this.filename, historyCommandSessionLogFileMetaData.filename) && t.b(this.secretKey, historyCommandSessionLogFileMetaData.secretKey);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public int hashCode() {
        String str = this.filename;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HistoryCommandSessionLogFileMetaData(filename=" + this.filename + ", secretKey=" + this.secretKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.filename);
        parcel.writeString(this.secretKey);
    }

    public /* synthetic */ HistoryCommandSessionLogFileMetaData(int i10, String str, String str2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.filename = null;
        } else {
            this.filename = str;
        }
        if ((i10 & 2) == 0) {
            this.secretKey = null;
        } else {
            this.secretKey = str2;
        }
    }

    public HistoryCommandSessionLogFileMetaData(String str, String str2) {
        this.filename = str;
        this.secretKey = str2;
    }

    public /* synthetic */ HistoryCommandSessionLogFileMetaData(String str, String str2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
