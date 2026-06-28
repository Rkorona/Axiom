package com.server.auditor.ssh.client.ui.sessionlogs.data;

import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion;
import hv.c;
import hv.e0;
import hv.m;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.lang.annotation.Annotation;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.w1;
import qu.b;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public interface SessionLogsScreenPromotion {
    public static final a Companion = a.f40402a;

    @p
    public static final class EnableRetention implements SessionLogsScreenPromotion {
        public static final EnableRetention INSTANCE = new EnableRetention();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.f0
            @Override // iu.a
            public final Object a() {
                return SessionLogsScreenPromotion.EnableRetention._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private EnableRetention() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableRetention", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableRetention);
        }

        public int hashCode() {
            return 1819339823;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnableRetention";
        }
    }

    @p
    public static final class EnableSharing implements SessionLogsScreenPromotion {
        public static final EnableSharing INSTANCE = new EnableSharing();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.g0
            @Override // iu.a
            public final Object a() {
                return SessionLogsScreenPromotion.EnableSharing._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private EnableSharing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableSharing", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSharing);
        }

        public int hashCode() {
            return 28511789;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnableSharing";
        }
    }

    @p
    public static final class EnableSync implements SessionLogsScreenPromotion {
        public static final EnableSync INSTANCE = new EnableSync();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.h0
            @Override // iu.a
            public final Object a() {
                return SessionLogsScreenPromotion.EnableSync._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private EnableSync() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableSync", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSync);
        }

        public int hashCode() {
            return 887383786;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnableSync";
        }
    }

    @p
    public static final class OversizedUnsyncedLogs implements SessionLogsScreenPromotion {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final int logsSize;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40401b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40400a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.OversizedUnsyncedLogs", aVar, 1);
                i2Var.r("logsSize", false);
                descriptor = i2Var;
                f40401b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OversizedUnsyncedLogs deserialize(e eVar) {
                int iE;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            iE = cVarD.e(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new OversizedUnsyncedLogs(i10, iE, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, OversizedUnsyncedLogs oversizedUnsyncedLogs) {
                t.f(fVar, "encoder");
                t.f(oversizedUnsyncedLogs, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                OversizedUnsyncedLogs.write$Self$Termius_app_googleProductionRelease(oversizedUnsyncedLogs, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final c[] childSerializers() {
                return new c[]{w0.f64808a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final c serializer() {
                return a.f40400a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ OversizedUnsyncedLogs(int i10, int i11, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40400a.getDescriptor());
            }
            this.logsSize = i11;
        }

        public static /* synthetic */ OversizedUnsyncedLogs copy$default(OversizedUnsyncedLogs oversizedUnsyncedLogs, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oversizedUnsyncedLogs.logsSize;
            }
            return oversizedUnsyncedLogs.copy(i10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(OversizedUnsyncedLogs oversizedUnsyncedLogs, d dVar, f fVar) {
            dVar.t(fVar, 0, oversizedUnsyncedLogs.logsSize);
        }

        public final int component1() {
            return this.logsSize;
        }

        public final OversizedUnsyncedLogs copy(int i10) {
            return new OversizedUnsyncedLogs(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OversizedUnsyncedLogs) && this.logsSize == ((OversizedUnsyncedLogs) obj).logsSize;
        }

        public final int getLogsSize() {
            return this.logsSize;
        }

        public int hashCode() {
            return Integer.hashCode(this.logsSize);
        }

        public String toString() {
            return "OversizedUnsyncedLogs(logsSize=" + this.logsSize + ")";
        }

        public OversizedUnsyncedLogs(int i10) {
            this.logsSize = i10;
        }
    }

    @p
    public static final class SetupVault implements SessionLogsScreenPromotion {
        public static final SetupVault INSTANCE = new SetupVault();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: so.i0
            @Override // iu.a
            public final Object a() {
                return SessionLogsScreenPromotion.SetupVault._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private SetupVault() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.SetupVault", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupVault);
        }

        public int hashCode() {
            return 55818721;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SetupVault";
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40402a = new a();

        private a() {
        }

        public final c serializer() {
            return new m("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion", ju.n0.b(SessionLogsScreenPromotion.class), new b[]{ju.n0.b(EnableRetention.class), ju.n0.b(EnableSharing.class), ju.n0.b(EnableSync.class), ju.n0.b(OversizedUnsyncedLogs.class), ju.n0.b(SetupVault.class)}, new c[]{new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableRetention", EnableRetention.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableSharing", EnableSharing.INSTANCE, new Annotation[0]), new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.EnableSync", EnableSync.INSTANCE, new Annotation[0]), OversizedUnsyncedLogs.a.f40400a, new w1("com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogsScreenPromotion.SetupVault", SetupVault.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }
}
