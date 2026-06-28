package com.server.auditor.ssh.client.synchronization.api.models.bulk;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class BulkBadRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BulkBadRequest> CREATOR;
    public static final Companion Companion;
    private static final c serializer;
    private final String errorMessage;
    private final ProblematicObject mProblematicObject;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return BulkBadRequest.serializer;
        }

        public final c serializer() {
            return BulkBadRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<BulkBadRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkBadRequest createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new BulkBadRequest(parcel.readString(), parcel.readInt() == 0 ? null : ProblematicObject.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BulkBadRequest[] newArray(int i10) {
            return new BulkBadRequest[i10];
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        CREATOR = new Creator();
        serializer = companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulkBadRequest() {
        this((String) null, (ProblematicObject) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    @o("error")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    @o("object")
    public static /* synthetic */ void getMProblematicObject$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(BulkBadRequest bulkBadRequest, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || bulkBadRequest.errorMessage != null) {
            dVar.v(fVar, 0, x2.f64817a, bulkBadRequest.errorMessage);
        }
        if (!dVar.E(fVar, 1) && bulkBadRequest.mProblematicObject == null) {
            return;
        }
        dVar.v(fVar, 1, ProblematicObject$$serializer.INSTANCE, bulkBadRequest.mProblematicObject);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Long getLocalId() {
        ProblematicObject problematicObject = this.mProblematicObject;
        if (problematicObject != null) {
            return problematicObject.getLocalId();
        }
        return null;
    }

    public final ProblematicObject getMProblematicObject() {
        return this.mProblematicObject;
    }

    public final String getObjectType() {
        ProblematicObject problematicObject = this.mProblematicObject;
        String objectType = problematicObject != null ? problematicObject.getObjectType() : null;
        return objectType == null ? "" : objectType;
    }

    public final Long getRemoteId() {
        ProblematicObject problematicObject = this.mProblematicObject;
        if (problematicObject != null) {
            return problematicObject.getRemoteId();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.errorMessage);
        ProblematicObject problematicObject = this.mProblematicObject;
        if (problematicObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            problematicObject.writeToParcel(parcel, i10);
        }
    }

    public /* synthetic */ BulkBadRequest(int i10, String str, ProblematicObject problematicObject, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i10 & 2) == 0) {
            this.mProblematicObject = null;
        } else {
            this.mProblematicObject = problematicObject;
        }
    }

    public BulkBadRequest(String str, ProblematicObject problematicObject) {
        this.errorMessage = str;
        this.mProblematicObject = problematicObject;
    }

    public /* synthetic */ BulkBadRequest(String str, ProblematicObject problematicObject, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : problematicObject);
    }
}
