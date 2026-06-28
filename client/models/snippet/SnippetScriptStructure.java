package com.server.auditor.ssh.client.models.snippet;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructure;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@p
public final class SnippetScriptStructure implements Parcelable {
    private final String content;
    private final SnippetScriptStructureType type;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SnippetScriptStructure> CREATOR = new c();
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: pj.a
        @Override // iu.a
        public final Object a() {
            return SnippetScriptStructure._childSerializers$_anonymous_();
        }
    }), null};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27947b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f27946a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.snippet.SnippetScriptStructure", aVar, 2);
            i2Var.r(Column.TYPE, false);
            i2Var.r("content", false);
            descriptor = i2Var;
            f27947b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnippetScriptStructure deserialize(e eVar) {
            SnippetScriptStructureType snippetScriptStructureType;
            String strB;
            int i10;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            n[] nVarArr = SnippetScriptStructure.$childSerializers;
            s2 s2Var = null;
            if (cVarD.l()) {
                snippetScriptStructureType = (SnippetScriptStructureType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                strB = cVarD.B(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                SnippetScriptStructureType snippetScriptStructureType2 = null;
                String strB2 = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else if (iD == 0) {
                        snippetScriptStructureType2 = (SnippetScriptStructureType) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), snippetScriptStructureType2);
                        i11 |= 1;
                    } else {
                        if (iD != 1) {
                            throw new e0(iD);
                        }
                        strB2 = cVarD.B(fVar, 1);
                        i11 |= 2;
                    }
                }
                snippetScriptStructureType = snippetScriptStructureType2;
                strB = strB2;
                i10 = i11;
            }
            cVarD.b(fVar);
            return new SnippetScriptStructure(i10, snippetScriptStructureType, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, SnippetScriptStructure snippetScriptStructure) {
            t.f(fVar, "encoder");
            t.f(snippetScriptStructure, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            SnippetScriptStructure.write$Self$Termius_app_googleProductionRelease(snippetScriptStructure, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{SnippetScriptStructure.$childSerializers[0].getValue(), x2.f64817a};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f27946a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnippetScriptStructure createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new SnippetScriptStructure(SnippetScriptStructureType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SnippetScriptStructure[] newArray(int i10) {
            return new SnippetScriptStructure[i10];
        }
    }

    public /* synthetic */ SnippetScriptStructure(int i10, SnippetScriptStructureType snippetScriptStructureType, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, a.f27946a.getDescriptor());
        }
        this.type = snippetScriptStructureType;
        this.content = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return SnippetScriptStructureType.Companion.serializer();
    }

    public static /* synthetic */ SnippetScriptStructure copy$default(SnippetScriptStructure snippetScriptStructure, SnippetScriptStructureType snippetScriptStructureType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            snippetScriptStructureType = snippetScriptStructure.type;
        }
        if ((i10 & 2) != 0) {
            str = snippetScriptStructure.content;
        }
        return snippetScriptStructure.copy(snippetScriptStructureType, str);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetScriptStructure snippetScriptStructure, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), snippetScriptStructure.type);
        dVar.f(fVar, 1, snippetScriptStructure.content);
    }

    public final SnippetScriptStructureType component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final SnippetScriptStructure copy(SnippetScriptStructureType snippetScriptStructureType, String str) {
        t.f(snippetScriptStructureType, Column.TYPE);
        t.f(str, "content");
        return new SnippetScriptStructure(snippetScriptStructureType, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetScriptStructure)) {
            return false;
        }
        SnippetScriptStructure snippetScriptStructure = (SnippetScriptStructure) obj;
        return this.type == snippetScriptStructure.type && t.b(this.content, snippetScriptStructure.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final SnippetScriptStructureType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        return "SnippetScriptStructure(type=" + this.type + ", content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.type.name());
        parcel.writeString(this.content);
    }

    public SnippetScriptStructure(SnippetScriptStructureType snippetScriptStructureType, String str) {
        t.f(snippetScriptStructureType, Column.TYPE);
        t.f(str, "content");
        this.type = snippetScriptStructureType;
        this.content = str;
    }
}
