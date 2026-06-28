package com.server.auditor.ssh.client.ui.sessionlogs.data;

import androidx.compose.runtime.w;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.w1;
import mp.g;
import qu.b;
import ut.n;
import ut.o;
import ut.r;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
@p
public abstract class SessionLogsColumnSavedSortState {
    public static final int $stable = 0;
    public static final a Companion = new a(null);
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.a0
        @Override // iu.a
        public final Object a() {
            return SessionLogsColumnSavedSortState._init_$_anonymous_();
        }
    });

    @p
    public static final class None extends SessionLogsColumnSavedSortState {
        public static final None INSTANCE = new None();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.b0
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumnSavedSortState.None._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private None() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return -1263767537;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "None";
        }
    }

    @p
    public static final class Saved extends SessionLogsColumnSavedSortState {
        public static final Saved INSTANCE = new Saved();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.c0
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumnSavedSortState.Saved._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private Saved() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState.Saved", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Saved);
        }

        public int hashCode() {
            return -517879664;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Saved";
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) SessionLogsColumnSavedSortState.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public /* synthetic */ SessionLogsColumnSavedSortState(k kVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return new m("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState", n0.b(SessionLogsColumnSavedSortState.class), new b[]{n0.b(None.class), n0.b(Saved.class)}, new c[]{new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState.None", None.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState.Saved", Saved.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SessionLogsColumnSavedSortState sessionLogsColumnSavedSortState, d dVar, f fVar) {
    }

    public final h2.d getIcon(androidx.compose.runtime.m mVar, int i10) {
        h2.d dVarA;
        mVar.W(-1633570689);
        if (w.R()) {
            w.b0(-1633570689, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnSavedSortState.getIcon (SessionLogsColumnSavedSortState.kt:22)");
        }
        if (t.b(this, Saved.INSTANCE)) {
            dVarA = mp.b.a(g.f65961a);
        } else {
            if (!t.b(this, None.INSTANCE)) {
                throw new s();
            }
            dVarA = mp.a.a(g.f65961a);
        }
        if (w.R()) {
            w.a0();
        }
        mVar.Q();
        return dVarA;
    }

    private SessionLogsColumnSavedSortState() {
    }

    public /* synthetic */ SessionLogsColumnSavedSortState(int i10, s2 s2Var) {
    }
}
