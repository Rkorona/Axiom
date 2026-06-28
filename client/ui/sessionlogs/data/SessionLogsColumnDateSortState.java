package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import jv.f;
import kv.d;
import lv.s2;
import lv.w1;
import qu.b;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public abstract class SessionLogsColumnDateSortState {
    public static final int $stable = 0;
    public static final a Companion = new a(null);
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.x
        @Override // iu.a
        public final Object a() {
            return SessionLogsColumnDateSortState._init_$_anonymous_();
        }
    });

    @p
    public static final class Asc extends SessionLogsColumnDateSortState {
        public static final Asc INSTANCE = new Asc();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.y
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumnDateSortState.Asc._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private Asc() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState.Asc", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Asc);
        }

        public int hashCode() {
            return 1216345725;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Asc";
        }
    }

    @p
    public static final class Desc extends SessionLogsColumnDateSortState {
        public static final Desc INSTANCE = new Desc();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.z
            @Override // iu.a
            public final Object a() {
                return SessionLogsColumnDateSortState.Desc._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private Desc() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState.Desc", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Desc);
        }

        public int hashCode() {
            return -947911675;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Desc";
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) SessionLogsColumnDateSortState.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public /* synthetic */ SessionLogsColumnDateSortState(k kVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return new m("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState", n0.b(SessionLogsColumnDateSortState.class), new b[]{n0.b(Asc.class), n0.b(Desc.class)}, new c[]{new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState.Asc", Asc.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsColumnDateSortState.Desc", Desc.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SessionLogsColumnDateSortState sessionLogsColumnDateSortState, d dVar, f fVar) {
    }

    private SessionLogsColumnDateSortState() {
    }

    public /* synthetic */ SessionLogsColumnDateSortState(int i10, s2 s2Var) {
    }
}
