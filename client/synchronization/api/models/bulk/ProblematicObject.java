package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.h1;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ProblematicObject implements Parcelable {
    private final Long localId;
    private final String objectType;
    private final Long remoteId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProblematicObject> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ProblematicObject$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<ProblematicObject> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProblematicObject createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ProblematicObject(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProblematicObject[] newArray(int i10) {
            return new ProblematicObject[i10];
        }
    }

    public ProblematicObject() {
        this((String) null, (Long) null, (Long) null, 7, (k) null);
    }

    @o(CommonBulkShareable.LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @o("object_set")
    public static /* synthetic */ void getObjectType$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ProblematicObject problematicObject, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || problematicObject.objectType != null) {
            dVar.v(fVar, 0, x2.f64817a, problematicObject.objectType);
        }
        if (dVar.E(fVar, 1) || problematicObject.localId != null) {
            dVar.v(fVar, 1, h1.f64699a, problematicObject.localId);
        }
        if (!dVar.E(fVar, 2) && problematicObject.remoteId == null) {
            return;
        }
        dVar.v(fVar, 2, h1.f64699a, problematicObject.remoteId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final Long getRemoteId() {
        return this.remoteId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.objectType);
        Long l10 = this.localId;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        Long l11 = this.remoteId;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ ProblematicObject(int i10, String str, Long l10, Long l11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.objectType = null;
        } else {
            this.objectType = str;
        }
        if ((i10 & 2) == 0) {
            this.localId = null;
        } else {
            this.localId = l10;
        }
        if ((i10 & 4) == 0) {
            this.remoteId = null;
        } else {
            this.remoteId = l11;
        }
    }

    public ProblematicObject(String str, Long l10, Long l11) {
        this.objectType = str;
        this.localId = l10;
        this.remoteId = l11;
    }

    public /* synthetic */ ProblematicObject(String str, Long l10, Long l11, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11);
    }
}
