package com.server.auditor.ssh.client.ui.sessionlogs.data;

import androidx.compose.runtime.m;
import androidx.compose.runtime.w;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w1;
import ut.n;
import ut.r;
import z2.h;

/* JADX INFO: loaded from: classes4.dex */
@p
public interface SessionLogsColumn {
    public static final a Companion = a.f40399a;

    @p
    @o("SessionLogsDateColumn")
    public static final class Date implements SessionLogsColumn {
        public static final int $stable = 0;
        private final SessionLogsColumnDateSortState sortState;
        public static final b Companion = new b(null);
        private static final n[] $childSerializers = {ut.o.b(r.f82638b, new iu.a() { // from class: so.t
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumn.Date._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40396b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40395a = aVar;
                i2 i2Var = new i2("SessionLogsDateColumn", aVar, 1);
                i2Var.r("sortState", true);
                descriptor = i2Var;
                f40396b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Date deserialize(e eVar) {
                SessionLogsColumnDateSortState sessionLogsColumnDateSortState;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
                n[] nVarArr = Date.$childSerializers;
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    sessionLogsColumnDateSortState = (SessionLogsColumnDateSortState) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    SessionLogsColumnDateSortState sessionLogsColumnDateSortState2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            sessionLogsColumnDateSortState2 = (SessionLogsColumnDateSortState) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), sessionLogsColumnDateSortState2);
                            i11 = 1;
                        }
                    }
                    sessionLogsColumnDateSortState = sessionLogsColumnDateSortState2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new Date(i10, sessionLogsColumnDateSortState, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, Date date) {
                t.f(fVar, "encoder");
                t.f(date, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                Date.write$Self$Termius_app_googleProductionRelease(date, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{Date.$childSerializers[0].getValue()};
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
                return a.f40395a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Date() {
            this((SessionLogsColumnDateSortState) null, 1, (k) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SessionLogsColumnDateSortState.Companion.serializer();
        }

        public static /* synthetic */ Date copy$default(Date date, SessionLogsColumnDateSortState sessionLogsColumnDateSortState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sessionLogsColumnDateSortState = date.sortState;
            }
            return date.copy(sessionLogsColumnDateSortState);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Date date, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            if (!dVar.E(fVar, 0) && t.b(date.sortState, SessionLogsColumnDateSortState.Desc.INSTANCE)) {
                return;
            }
            dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), date.sortState);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public boolean canFillAvailableSpace() {
            return false;
        }

        public final SessionLogsColumnDateSortState component1() {
            return this.sortState;
        }

        public final Date copy(SessionLogsColumnDateSortState sessionLogsColumnDateSortState) {
            t.f(sessionLogsColumnDateSortState, "sortState");
            return new Date(sessionLogsColumnDateSortState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Date) && t.b(this.sortState, ((Date) obj).sortState);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public String getName(m mVar, int i10) {
            mVar.W(-397578576);
            if (w.R()) {
                w.b0(-397578576, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Date.getName (SessionLogsColumn.kt:28)");
            }
            String strB = h.b(R.string.session_logs_table_column_date, mVar, 6);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return strB;
        }

        public final SessionLogsColumnDateSortState getSortState() {
            return this.sortState;
        }

        public int hashCode() {
            return this.sortState.hashCode();
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        /* JADX INFO: renamed from: preferredWidth-chRvn1I */
        public float mo17preferredWidthchRvn1I(m mVar, int i10) {
            mVar.W(-594554571);
            if (w.R()) {
                w.b0(-594554571, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Date.preferredWidth (SessionLogsColumn.kt:31)");
            }
            float fM = q3.h.m(120);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return fM;
        }

        public String toString() {
            return "Date(sortState=" + this.sortState + ")";
        }

        public /* synthetic */ Date(int i10, SessionLogsColumnDateSortState sessionLogsColumnDateSortState, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.sortState = SessionLogsColumnDateSortState.Desc.INSTANCE;
            } else {
                this.sortState = sessionLogsColumnDateSortState;
            }
        }

        public Date(SessionLogsColumnDateSortState sessionLogsColumnDateSortState) {
            t.f(sessionLogsColumnDateSortState, "sortState");
            this.sortState = sessionLogsColumnDateSortState;
        }

        public /* synthetic */ Date(SessionLogsColumnDateSortState sessionLogsColumnDateSortState, int i10, k kVar) {
            this((i10 & 1) != 0 ? SessionLogsColumnDateSortState.Desc.INSTANCE : sessionLogsColumnDateSortState);
        }
    }

    @p
    @o("SessionLogsHostColumn")
    public static final class Host implements SessionLogsColumn {
        public static final Host INSTANCE = new Host();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: so.u
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumn.Host._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private Host() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("SessionLogsHostColumn", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public boolean canFillAvailableSpace() {
            return b.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Host);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public String getName(m mVar, int i10) {
            mVar.W(1190372010);
            if (w.R()) {
                w.b0(1190372010, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Host.getName (SessionLogsColumn.kt:50)");
            }
            String strB = h.b(R.string.session_logs_table_column_host, mVar, 6);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return strB;
        }

        public int hashCode() {
            return -1194067285;
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        /* JADX INFO: renamed from: preferredWidth-chRvn1I */
        public float mo17preferredWidthchRvn1I(m mVar, int i10) {
            mVar.W(993396015);
            if (w.R()) {
                w.b0(993396015, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Host.preferredWidth (SessionLogsColumn.kt:53)");
            }
            float fM = q3.h.m(180);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return fM;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Host";
        }
    }

    @p
    @o("SessionLogsSavedColumn")
    public static final class Saved implements SessionLogsColumn {
        public static final int $stable = 0;
        private final SessionLogsColumnSavedSortState sortState;
        public static final b Companion = new b(null);
        private static final n[] $childSerializers = {ut.o.b(r.f82638b, new iu.a() { // from class: so.v
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumn.Saved._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40398b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40397a = aVar;
                i2 i2Var = new i2("SessionLogsSavedColumn", aVar, 1);
                i2Var.r("sortState", true);
                descriptor = i2Var;
                f40398b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Saved deserialize(e eVar) {
                SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
                n[] nVarArr = Saved.$childSerializers;
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    sessionLogsColumnSavedSortState = (SessionLogsColumnSavedSortState) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            sessionLogsColumnSavedSortState2 = (SessionLogsColumnSavedSortState) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), sessionLogsColumnSavedSortState2);
                            i11 = 1;
                        }
                    }
                    sessionLogsColumnSavedSortState = sessionLogsColumnSavedSortState2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new Saved(i10, sessionLogsColumnSavedSortState, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, Saved saved) {
                t.f(fVar, "encoder");
                t.f(saved, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                Saved.write$Self$Termius_app_googleProductionRelease(saved, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{Saved.$childSerializers[0].getValue()};
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
                return a.f40397a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Saved() {
            this((SessionLogsColumnSavedSortState) null, 1, (k) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return SessionLogsColumnSavedSortState.Companion.serializer();
        }

        public static /* synthetic */ Saved copy$default(Saved saved, SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sessionLogsColumnSavedSortState = saved.sortState;
            }
            return saved.copy(sessionLogsColumnSavedSortState);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Saved saved, d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            if (!dVar.E(fVar, 0) && t.b(saved.sortState, SessionLogsColumnSavedSortState.None.INSTANCE)) {
                return;
            }
            dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), saved.sortState);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public boolean canFillAvailableSpace() {
            return b.a(this);
        }

        public final SessionLogsColumnSavedSortState component1() {
            return this.sortState;
        }

        public final Saved copy(SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState) {
            t.f(sessionLogsColumnSavedSortState, "sortState");
            return new Saved(sessionLogsColumnSavedSortState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Saved) && t.b(this.sortState, ((Saved) obj).sortState);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public String getName(m mVar, int i10) {
            mVar.W(-1167742101);
            if (w.R()) {
                w.b0(-1167742101, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Saved.getName (SessionLogsColumn.kt:62)");
            }
            String strB = h.b(R.string.session_logs_table_column_saved, mVar, 6);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return strB;
        }

        public final SessionLogsColumnSavedSortState getSortState() {
            return this.sortState;
        }

        public int hashCode() {
            return this.sortState.hashCode();
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        /* JADX INFO: renamed from: preferredWidth-chRvn1I */
        public float mo17preferredWidthchRvn1I(m mVar, int i10) {
            mVar.W(1315936646);
            if (w.R()) {
                w.b0(1315936646, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.Saved.preferredWidth (SessionLogsColumn.kt:65)");
            }
            float fM = q3.h.m(240);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return fM;
        }

        public String toString() {
            return "Saved(sortState=" + this.sortState + ")";
        }

        public /* synthetic */ Saved(int i10, SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState, s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.sortState = SessionLogsColumnSavedSortState.None.INSTANCE;
            } else {
                this.sortState = sessionLogsColumnSavedSortState;
            }
        }

        public Saved(SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState) {
            t.f(sessionLogsColumnSavedSortState, "sortState");
            this.sortState = sessionLogsColumnSavedSortState;
        }

        public /* synthetic */ Saved(SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState, int i10, k kVar) {
            this((i10 & 1) != 0 ? SessionLogsColumnSavedSortState.None.INSTANCE : sessionLogsColumnSavedSortState);
        }
    }

    @p
    @o("SessionLogsUserColumn")
    public static final class User implements SessionLogsColumn {
        public static final User INSTANCE = new User();
        private static final /* synthetic */ n $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: so.w
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumn.User._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private User() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new w1("SessionLogsUserColumn", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public boolean canFillAvailableSpace() {
            return b.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof User);
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        public String getName(m mVar, int i10) {
            mVar.W(1210507725);
            if (w.R()) {
                w.b0(1210507725, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.User.getName (SessionLogsColumn.kt:40)");
            }
            String strB = h.b(R.string.session_logs_table_column_user, mVar, 6);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return strB;
        }

        public int hashCode() {
            return -1193676594;
        }

        @Override // com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn
        /* JADX INFO: renamed from: preferredWidth-chRvn1I */
        public float mo17preferredWidthchRvn1I(m mVar, int i10) {
            mVar.W(1013531730);
            if (w.R()) {
                w.b0(1013531730, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn.User.preferredWidth (SessionLogsColumn.kt:43)");
            }
            float fM = q3.h.m(180);
            if (w.R()) {
                w.a0();
            }
            mVar.Q();
            return fM;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "User";
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40399a = new a();

        private a() {
        }

        public final hv.c serializer() {
            return new hv.m("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumn", ju.n0.b(SessionLogsColumn.class), new qu.b[]{ju.n0.b(Date.class), ju.n0.b(Host.class), ju.n0.b(Saved.class), ju.n0.b(User.class)}, new hv.c[]{Date.a.f40395a, new w1("SessionLogsHostColumn", Host.INSTANCE, new Annotation[0]), Saved.a.f40397a, new w1("SessionLogsUserColumn", User.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    public static final class b {
        public static boolean a(SessionLogsColumn sessionLogsColumn) {
            return true;
        }
    }

    boolean canFillAvailableSpace();

    String getName(m mVar, int i10);

    /* JADX INFO: renamed from: preferredWidth-chRvn1I, reason: not valid java name */
    float mo17preferredWidthchRvn1I(m mVar, int i10);
}
