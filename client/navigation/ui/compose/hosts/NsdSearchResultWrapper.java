package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResult;
import io.split.android.client.dtos.SerializableEvent;
import lv.n0;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
@Keep
public final class NsdSearchResultWrapper implements Parcelable {
    public static final int $stable = 0;
    private final NsdSearchResult result;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<NsdSearchResultWrapper> CREATOR = new c();
    private static final ut.u typeMap = ut.b0.a(ju.n0.j(NsdSearchResultWrapper.class), new d(false, mv.b.f65981d));

    public /* synthetic */ class a implements lv.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30829b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f30828a = aVar;
            lv.i2 i2Var = new lv.i2("com.server.auditor.ssh.client.navigation.ui.compose.hosts.NsdSearchResultWrapper", aVar, 1);
            i2Var.r("result", true);
            descriptor = i2Var;
            f30829b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResultWrapper deserialize(kv.e eVar) {
            NsdSearchResult nsdSearchResult;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            lv.s2 s2Var = null;
            if (cVarD.l()) {
                nsdSearchResult = (NsdSearchResult) cVarD.v(fVar, 0, NsdSearchResult.a.f30826a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                nsdSearchResult = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new hv.e0(iD);
                        }
                        nsdSearchResult = (NsdSearchResult) cVarD.v(fVar, 0, NsdSearchResult.a.f30826a, nsdSearchResult);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new NsdSearchResultWrapper(i10, nsdSearchResult, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, NsdSearchResultWrapper nsdSearchResultWrapper) {
            ju.t.f(fVar, "encoder");
            ju.t.f(nsdSearchResultWrapper, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            NsdSearchResultWrapper.write$Self$Termius_app_googleProductionRelease(nsdSearchResultWrapper, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{iv.a.u(NsdSearchResult.a.f30826a)};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        public final ut.u a() {
            return NsdSearchResultWrapper.typeMap;
        }

        public final hv.c serializer() {
            return a.f30828a;
        }

        private b() {
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResultWrapper createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new NsdSearchResultWrapper(parcel.readInt() == 0 ? null : NsdSearchResult.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NsdSearchResultWrapper[] newArray(int i10) {
            return new NsdSearchResultWrapper[i10];
        }
    }

    public static final class d extends androidx.navigation.x1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mv.b f30830t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, mv.b bVar) {
            super(z10);
            this.f30830t = bVar;
        }

        @Override // androidx.navigation.x1
        public Object a(Bundle bundle, String str) {
            ju.t.f(bundle, "bundle");
            ju.t.f(str, SerializableEvent.KEY_FIELD);
            String string = bundle.getString(str);
            if (string == null) {
                return null;
            }
            mv.b bVar = this.f30830t;
            bVar.a();
            return bVar.b(NsdSearchResultWrapper.Companion.serializer(), string);
        }

        @Override // androidx.navigation.x1
        /* JADX INFO: renamed from: f */
        public Object l(String str) {
            ju.t.f(str, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f30830t;
            bVar.a();
            return bVar.b(NsdSearchResultWrapper.Companion.serializer(), str);
        }

        @Override // androidx.navigation.x1
        public void h(Bundle bundle, String str, Object obj) {
            ju.t.f(bundle, "bundle");
            ju.t.f(str, SerializableEvent.KEY_FIELD);
            ju.t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f30830t;
            bVar.a();
            bundle.putString(str, bVar.c(NsdSearchResultWrapper.Companion.serializer(), obj));
        }

        @Override // androidx.navigation.x1
        public String i(Object obj) {
            ju.t.f(obj, SerializableEvent.VALUE_FIELD);
            mv.b bVar = this.f30830t;
            bVar.a();
            String strEncode = Uri.encode(bVar.c(NsdSearchResultWrapper.Companion.serializer(), obj));
            ju.t.e(strEncode, "encode(...)");
            return strEncode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NsdSearchResultWrapper() {
        this((NsdSearchResult) null, 1, (ju.k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ NsdSearchResultWrapper copy$default(NsdSearchResultWrapper nsdSearchResultWrapper, NsdSearchResult nsdSearchResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nsdSearchResult = nsdSearchResultWrapper.result;
        }
        return nsdSearchResultWrapper.copy(nsdSearchResult);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(NsdSearchResultWrapper nsdSearchResultWrapper, kv.d dVar, jv.f fVar) {
        if (!dVar.E(fVar, 0) && nsdSearchResultWrapper.result == null) {
            return;
        }
        dVar.v(fVar, 0, NsdSearchResult.a.f30826a, nsdSearchResultWrapper.result);
    }

    public final NsdSearchResult component1() {
        return this.result;
    }

    public final NsdSearchResultWrapper copy(NsdSearchResult nsdSearchResult) {
        return new NsdSearchResultWrapper(nsdSearchResult);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NsdSearchResultWrapper) && ju.t.b(this.result, ((NsdSearchResultWrapper) obj).result);
    }

    public final NsdSearchResult getResult() {
        return this.result;
    }

    public int hashCode() {
        NsdSearchResult nsdSearchResult = this.result;
        if (nsdSearchResult == null) {
            return 0;
        }
        return nsdSearchResult.hashCode();
    }

    public String toString() {
        return "NsdSearchResultWrapper(result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        NsdSearchResult nsdSearchResult = this.result;
        if (nsdSearchResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nsdSearchResult.writeToParcel(parcel, i10);
        }
    }

    public /* synthetic */ NsdSearchResultWrapper(int i10, NsdSearchResult nsdSearchResult, lv.s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.result = null;
        } else {
            this.result = nsdSearchResult;
        }
    }

    public NsdSearchResultWrapper(NsdSearchResult nsdSearchResult) {
        this.result = nsdSearchResult;
    }

    public /* synthetic */ NsdSearchResultWrapper(NsdSearchResult nsdSearchResult, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? null : nsdSearchResult);
    }
}
