package com.server.auditor.ssh.client.navigation.ui.compose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetsNavGraph;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import lv.n0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface TerminalSnippetsNavGraph extends Parcelable {

    @hv.p
    @Keep
    public static final class CommandHistory implements TerminalSnippetsNavGraph {
        public static final CommandHistory INSTANCE = new CommandHistory();
        public static final Parcelable.Creator<CommandHistory> CREATOR = new a();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.ha
            @Override // iu.a
            public final Object a() {
                return TerminalSnippetsNavGraph.CommandHistory._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CommandHistory createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return CommandHistory.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CommandHistory[] newArray(int i10) {
                return new CommandHistory[i10];
            }
        }

        private CommandHistory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new lv.w1("com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetsNavGraph.CommandHistory", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CommandHistory);
        }

        public int hashCode() {
            return -1327012433;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CommandHistory";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @hv.p
    @Keep
    public static final class SnippetVariableSetup implements TerminalSnippetsNavGraph {
        private final long snippetId;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SnippetVariableSetup> CREATOR = new c();
        public static final int $stable = 8;

        public /* synthetic */ class a implements lv.n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f30214b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f30213a = aVar;
                lv.i2 i2Var = new lv.i2("com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetsNavGraph.SnippetVariableSetup", aVar, 1);
                i2Var.r("snippetId", false);
                descriptor = i2Var;
                f30214b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnippetVariableSetup deserialize(kv.e eVar) {
                long jO;
                ju.t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    jO = cVarD.o(fVar, 0);
                } else {
                    long jO2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new hv.e0(iD);
                            }
                            jO2 = cVarD.o(fVar, 0);
                            i11 = 1;
                        }
                    }
                    jO = jO2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SnippetVariableSetup(i10, jO, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SnippetVariableSetup snippetVariableSetup) {
                ju.t.f(fVar, "encoder");
                ju.t.f(snippetVariableSetup, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                SnippetVariableSetup.write$Self$Termius_app_googleProductionRelease(snippetVariableSetup, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{lv.h1.f64699a};
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
            private b() {
            }

            public final hv.c serializer() {
                return a.f30213a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnippetVariableSetup createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                return new SnippetVariableSetup(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SnippetVariableSetup[] newArray(int i10) {
                return new SnippetVariableSetup[i10];
            }
        }

        public /* synthetic */ SnippetVariableSetup(int i10, long j10, lv.s2 s2Var) {
            if (1 != (i10 & 1)) {
                lv.d2.a(i10, 1, a.f30213a.getDescriptor());
            }
            this.snippetId = j10;
        }

        public static /* synthetic */ SnippetVariableSetup copy$default(SnippetVariableSetup snippetVariableSetup, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = snippetVariableSetup.snippetId;
            }
            return snippetVariableSetup.copy(j10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SnippetVariableSetup snippetVariableSetup, kv.d dVar, jv.f fVar) {
            dVar.q(fVar, 0, snippetVariableSetup.snippetId);
        }

        public final long component1() {
            return this.snippetId;
        }

        public final SnippetVariableSetup copy(long j10) {
            return new SnippetVariableSetup(j10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SnippetVariableSetup) && this.snippetId == ((SnippetVariableSetup) obj).snippetId;
        }

        public final long getSnippetId() {
            return this.snippetId;
        }

        public int hashCode() {
            return Long.hashCode(this.snippetId);
        }

        public String toString() {
            return "SnippetVariableSetup(snippetId=" + this.snippetId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeLong(this.snippetId);
        }

        public SnippetVariableSetup(long j10) {
            this.snippetId = j10;
        }
    }

    @hv.p
    @Keep
    public static final class Snippets implements TerminalSnippetsNavGraph {
        public static final Snippets INSTANCE = new Snippets();
        public static final Parcelable.Creator<Snippets> CREATOR = new a();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.ia
            @Override // iu.a
            public final Object a() {
                return TerminalSnippetsNavGraph.Snippets._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Snippets createFromParcel(Parcel parcel) {
                ju.t.f(parcel, "parcel");
                parcel.readInt();
                return Snippets.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Snippets[] newArray(int i10) {
                return new Snippets[i10];
            }
        }

        private Snippets() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new lv.w1("com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetsNavGraph.Snippets", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Snippets);
        }

        public int hashCode() {
            return 1807964764;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Snippets";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            ju.t.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
