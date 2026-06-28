package com.server.auditor.ssh.client.synchronization.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AppSettings implements Parcelable {
    private final String colorScheme;
    private final boolean synchronizeKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppSettings> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return AppSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<AppSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppSettings createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AppSettings(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppSettings[] newArray(int i10) {
            return new AppSettings[i10];
        }
    }

    public /* synthetic */ AppSettings(int i10, String str, boolean z10, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, AppSettings$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str;
        }
        this.synchronizeKey = z10;
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o("synchronize_key")
    public static /* synthetic */ void getSynchronizeKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AppSettings appSettings, kv.d dVar, jv.f fVar) {
        if (dVar.E(fVar, 0) || appSettings.colorScheme != null) {
            dVar.v(fVar, 0, x2.f64817a, appSettings.colorScheme);
        }
        dVar.u(fVar, 1, appSettings.synchronizeKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    public final boolean getSynchronizeKey() {
        return this.synchronizeKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.colorScheme);
        parcel.writeInt(this.synchronizeKey ? 1 : 0);
    }

    public AppSettings(String str, boolean z10) {
        this.colorScheme = str;
        this.synchronizeKey = z10;
    }

    public /* synthetic */ AppSettings(String str, boolean z10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, z10);
    }
}
