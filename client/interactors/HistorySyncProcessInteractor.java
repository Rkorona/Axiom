package com.server.auditor.ssh.client.interactors;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor;
import com.server.auditor.ssh.client.synchronization.CryptoErrorCollector;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import com.server.auditor.ssh.client.synchronization.api.models.PostHistoryConnectionModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.HistoryApiModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.HistoryHostInfo;
import com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogUploadStatus;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import com.server.auditor.ssh.client.ui.util.MissingCryptorException;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import io.sentry.h7;
import io.sentry.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import po.b;
import po.c;
import to.h2;
import to.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class HistorySyncProcessInteractor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f27171q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f27172r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f27174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f27175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vl.b f27176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vl.a f27177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vl.e f27178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vl.f f27179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final to.y f27180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.i f27181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.h f27182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.j f27183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ho.f f27184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h2 f27185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j2 f27186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final to.q f27187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final mv.b f27188p;

    public static abstract class HistorySyncProcessResultCode implements Parcelable {
        public static final int $stable = 0;

        public static final class EncryptionError extends HistorySyncProcessResultCode {
            public static final EncryptionError INSTANCE = new EncryptionError();
            public static final Parcelable.Creator<EncryptionError> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EncryptionError createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return EncryptionError.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EncryptionError[] newArray(int i10) {
                    return new EncryptionError[i10];
                }
            }

            private EncryptionError() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof EncryptionError);
            }

            public int hashCode() {
                return 1240022067;
            }

            public String toString() {
                return "EncryptionError";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ErrorOccurred extends HistorySyncProcessResultCode {
            public static final ErrorOccurred INSTANCE = new ErrorOccurred();
            public static final Parcelable.Creator<ErrorOccurred> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ErrorOccurred createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return ErrorOccurred.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ErrorOccurred[] newArray(int i10) {
                    return new ErrorOccurred[i10];
                }
            }

            private ErrorOccurred() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ErrorOccurred);
            }

            public int hashCode() {
                return 1144745659;
            }

            public String toString() {
                return "ErrorOccurred";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class SerializationError extends HistorySyncProcessResultCode {
            public static final SerializationError INSTANCE = new SerializationError();
            public static final Parcelable.Creator<SerializationError> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SerializationError createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return SerializationError.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SerializationError[] newArray(int i10) {
                    return new SerializationError[i10];
                }
            }

            private SerializationError() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SerializationError);
            }

            public int hashCode() {
                return -825324214;
            }

            public String toString() {
                return "SerializationError";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class Success extends HistorySyncProcessResultCode {
            public static final Success INSTANCE = new Success();
            public static final Parcelable.Creator<Success> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Success createFromParcel(Parcel parcel) {
                    ju.t.f(parcel, "parcel");
                    parcel.readInt();
                    return Success.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Success[] newArray(int i10) {
                    return new Success[i10];
                }
            }

            private Success() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -1148895759;
            }

            public String toString() {
                return "Success";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                ju.t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ HistorySyncProcessResultCode(ju.k kVar) {
            this();
        }

        private HistorySyncProcessResultCode() {
        }
    }

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27189a;

        static {
            int[] iArr = new int[SessionLogProtocol.values().length];
            try {
                iArr[SessionLogProtocol.SSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionLogProtocol.TELNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionLogProtocol.MOSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionLogProtocol.QUICK_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SessionLogProtocol.LOCAL_TERMINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SessionLogProtocol.SERIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f27189a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27195f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f27196u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f27197v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f27198w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f27200y;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27198w = obj;
            this.f27200y |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.k(null, null, null, null, null, null, null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27203c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27205e;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27203c = obj;
            this.f27205e |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.n(null, null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27208c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27210e;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27208c = obj;
            this.f27210e |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.o(null, null, null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27216f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27217u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f27219w;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27217u = obj;
            this.f27219w |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.p(null, null, null, 0, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f27222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27223d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27225f;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27223d = obj;
            this.f27225f |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.r(null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f27228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HistorySyncProcessInteractor f27229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ rg.a f27230e;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HistorySyncProcessInteractor f27232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ResponseHistoryConnectionModel f27233c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ rg.a f27234d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HistorySyncProcessInteractor historySyncProcessInteractor, ResponseHistoryConnectionModel responseHistoryConnectionModel, rg.a aVar, zt.e eVar) {
                super(2, eVar);
                this.f27232b = historySyncProcessInteractor;
                this.f27233c = responseHistoryConnectionModel;
                this.f27234d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(rg.a aVar, ResponseHistoryConnectionModel responseHistoryConnectionModel, io.sentry.a1 a1Var) {
                io.sentry.f fVarB = y9.b.b("Missing cryptor for history connection", b.c.f70431c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("action", "Skip entity decryption");
                Set setKeySet = aVar.k().k().keySet();
                ju.t.e(setKeySet, "<get-keys>(...)");
                fVarB.E("available_team_cryptor_ids", vt.v.z0(setKeySet, null, null, null, 0, null, null, 63, null));
                fVarB.E("history_info", vt.s0.k(ut.b0.a("remote_id", Long.valueOf(responseHistoryConnectionModel.getId())), ut.b0.a(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, String.valueOf(responseHistoryConnectionModel.getLocalId())), ut.b0.a("encrypted_with", String.valueOf(responseHistoryConnectionModel.getEncryptedWith()))));
                HistoryHostInfo host = responseHistoryConnectionModel.getHost();
                fVarB.E("host_remote_id", String.valueOf(host != null ? Long.valueOf(host.getId()) : null));
                a1Var.b(fVarB);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f27232b, this.f27233c, this.f27234d, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f27231a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    try {
                        ResponseHistoryConnectionModel responseHistoryConnectionModel = (ResponseHistoryConnectionModel) io.a.a(this.f27232b.f27184l.a(com.server.auditor.ssh.client.ui.vaults.data.a.d(this.f27233c.getEncryptedWith()), this.f27234d.f(), this.f27234d.k()), this.f27233c);
                        if (responseHistoryConnectionModel == null) {
                            return null;
                        }
                        HistorySyncProcessInteractor historySyncProcessInteractor = this.f27232b;
                        this.f27231a = 1;
                        obj = historySyncProcessInteractor.r(responseHistoryConnectionModel, this);
                        if (obj == objF) {
                            return objF;
                        }
                    } catch (MissingCryptorException e10) {
                        y9.a aVar = y9.a.f86838a;
                        final rg.a aVar2 = this.f27234d;
                        final ResponseHistoryConnectionModel responseHistoryConnectionModel2 = this.f27233c;
                        aVar.j(e10, new i4() { // from class: com.server.auditor.ssh.client.interactors.v
                            @Override // io.sentry.i4
                            public final void a(io.sentry.a1 a1Var) {
                                HistorySyncProcessInteractor.h.a.k(aVar2, responseHistoryConnectionModel2, a1Var);
                            }
                        });
                        return null;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return (tl.u) obj;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List list, HistorySyncProcessInteractor historySyncProcessInteractor, rg.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f27228c = list;
            this.f27229d = historySyncProcessInteractor;
            this.f27230e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            h hVar = new h(this.f27228c, this.f27229d, this.f27230e, eVar);
            hVar.f27227b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27226a;
            if (i10 == 0) {
                ut.x.b(obj);
                wu.i0 i0Var = (wu.i0) this.f27227b;
                List list = this.f27228c;
                HistorySyncProcessInteractor historySyncProcessInteractor = this.f27229d;
                rg.a aVar = this.f27230e;
                ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(wu.k.b(i0Var, null, null, new a(historySyncProcessInteractor, (ResponseHistoryConnectionModel) it.next(), aVar, null), 3, null));
                }
                this.f27226a = 1;
                obj = wu.f.a(arrayList, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return vt.v.m0((Iterable) obj);
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27236b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f27238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ rg.a f27239e;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f27241b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HistorySyncProcessInteractor f27242c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ rg.a f27243d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ SessionLogItemApiModel f27244e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, HistorySyncProcessInteractor historySyncProcessInteractor, rg.a aVar, SessionLogItemApiModel sessionLogItemApiModel, zt.e eVar) {
                super(2, eVar);
                this.f27241b = list;
                this.f27242c = historySyncProcessInteractor;
                this.f27243d = aVar;
                this.f27244e = sessionLogItemApiModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(rg.a aVar, SessionLogItemApiModel sessionLogItemApiModel, tl.u uVar, io.sentry.a1 a1Var) {
                io.sentry.f fVarB = y9.b.b("Missing cryptor for Session Log Bookmark", b.c.f70431c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("action", "Skip entity decryption");
                Set setKeySet = aVar.k().k().keySet();
                ju.t.e(setKeySet, "<get-keys>(...)");
                fVarB.E("available_team_cryptor_ids", vt.v.z0(setKeySet, null, null, null, 0, null, null, 63, null));
                fVarB.E("session_log_info", vt.s0.k(ut.b0.a("remote_id", Long.valueOf(sessionLogItemApiModel.getId())), ut.b0.a("history_remote_id", String.valueOf(sessionLogItemApiModel.getHistoryConnectionId())), ut.b0.a("history_encrypted_with", String.valueOf(uVar.K().getId()))));
                a1Var.b(fVarB);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f27241b, this.f27242c, this.f27243d, this.f27244e, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object next;
                au.b.f();
                if (this.f27240a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                List list = this.f27241b;
                SessionLogItemApiModel sessionLogItemApiModel = this.f27244e;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((tl.u) next).q() == sessionLogItemApiModel.getHistoryConnectionId()) {
                        break;
                    }
                }
                final tl.u uVar = (tl.u) next;
                if (uVar == null) {
                    return null;
                }
                try {
                    SessionLogItemApiModel sessionLogItemApiModel2 = (SessionLogItemApiModel) io.a.a(this.f27242c.f27184l.a(uVar.K(), this.f27243d.f(), this.f27243d.k()), this.f27244e);
                    if (sessionLogItemApiModel2 == null) {
                        return null;
                    }
                    long jP = uVar.p();
                    long id2 = sessionLogItemApiModel2.getId();
                    long size = sessionLogItemApiModel2.getSize();
                    String checksum = sessionLogItemApiModel2.getChecksum();
                    String disconnectedAt = sessionLogItemApiModel2.getDisconnectedAt();
                    String updatedAt = sessionLogItemApiModel2.getUpdatedAt();
                    SessionLogUploadStatus uploadStatus = sessionLogItemApiModel2.getUploadStatus();
                    String ipAddress = sessionLogItemApiModel2.getIpAddress();
                    String location = sessionLogItemApiModel2.getLocation();
                    String str = sessionLogItemApiModel2.bookmarkComment;
                    return new tl.u0(jP, id2, size, checksum, disconnectedAt, updatedAt, uploadStatus, ipAddress, location, str != null ? new tl.t0(str, 0) : null);
                } catch (MissingCryptorException e10) {
                    y9.a aVar = y9.a.f86838a;
                    final rg.a aVar2 = this.f27243d;
                    final SessionLogItemApiModel sessionLogItemApiModel3 = this.f27244e;
                    aVar.j(e10, new i4() { // from class: com.server.auditor.ssh.client.interactors.w
                        @Override // io.sentry.i4
                        public final void a(io.sentry.a1 a1Var) {
                            HistorySyncProcessInteractor.i.a.k(aVar2, sessionLogItemApiModel3, uVar, a1Var);
                        }
                    });
                    return null;
                }
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, rg.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f27238d = list;
            this.f27239e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            i iVar = HistorySyncProcessInteractor.this.new i(this.f27238d, this.f27239e, eVar);
            iVar.f27236b = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            if (r13 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r12.f27235a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ut.x.b(r13)
                goto L87
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                java.lang.Object r1 = r12.f27236b
                wu.i0 r1 = (wu.i0) r1
                ut.x.b(r13)
            L22:
                r3 = r1
                goto L3d
            L24:
                ut.x.b(r13)
                java.lang.Object r13 = r12.f27236b
                r1 = r13
                wu.i0 r1 = (wu.i0) r1
                com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor r13 = com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.this
                vl.b r13 = com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.d(r13)
                r12.f27236b = r1
                r12.f27235a = r3
                java.lang.Object r13 = r13.g(r12)
                if (r13 != r0) goto L22
                goto L86
            L3d:
                r5 = r13
                java.util.List r5 = (java.util.List) r5
                java.util.List r13 = r12.f27238d
                com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor r6 = com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.this
                rg.a r7 = r12.f27239e
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = vt.v.z(r13, r4)
                r1.<init>(r4)
                java.util.Iterator r13 = r13.iterator()
            L55:
                boolean r4 = r13.hasNext()
                if (r4 == 0) goto L7b
                java.lang.Object r4 = r13.next()
                r8 = r4
                com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel r8 = (com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogItemApiModel) r8
                com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$i$a r4 = new com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$i$a
                r9 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                r9 = r5
                r10 = r6
                r11 = r7
                r7 = 3
                r8 = 0
                r6 = r4
                r4 = 0
                r5 = 0
                wu.p0 r4 = wu.i.b(r3, r4, r5, r6, r7, r8)
                r1.add(r4)
                r5 = r9
                r6 = r10
                r7 = r11
                goto L55
            L7b:
                r13 = 0
                r12.f27236b = r13
                r12.f27235a = r2
                java.lang.Object r13 = wu.f.a(r1, r12)
                if (r13 != r0) goto L87
            L86:
                return r0
            L87:
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.List r13 = vt.v.m0(r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27246b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27248d;

        j(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27246b = obj;
            this.f27248d |= RtlSpacingHelper.UNDEFINED;
            return HistorySyncProcessInteractor.this.w(this);
        }
    }

    public HistorySyncProcessInteractor(com.server.auditor.ssh.client.app.a aVar, r0 r0Var, n0 n0Var, vl.b bVar, vl.a aVar2, vl.e eVar, vl.f fVar, to.y yVar, com.server.auditor.ssh.client.interactors.i iVar, com.server.auditor.ssh.client.interactors.h hVar, com.server.auditor.ssh.client.interactors.j jVar, ho.f fVar2, h2 h2Var, j2 j2Var, to.q qVar, mv.b bVar2) {
        ju.t.f(aVar, "termiusStorage");
        ju.t.f(r0Var, "requestHistoryConnectionsApiInteractor");
        ju.t.f(n0Var, "postHistoryConnectionsApiInteractor");
        ju.t.f(bVar, "lastConnectionsDaoRepository");
        ju.t.f(aVar2, "hostInteractionDaoRepository");
        ju.t.f(eVar, "sessionLogsDaoRepository");
        ju.t.f(fVar, "teamDevicesDaoRepository");
        ju.t.f(yVar, "historySyncRevisionRepository");
        ju.t.f(iVar, "createRemoteCryptorUseCase");
        ju.t.f(hVar, "createRemoteAnnotationCryptorUseCase");
        ju.t.f(jVar, "createTeamAnnotationCryptorsUseCase");
        ju.t.f(fVar2, "getAnnotationCryptorByVaultKeyIdUseCase");
        ju.t.f(h2Var, "syncDeletedLastConnectionsUseCase");
        ju.t.f(j2Var, "syncDeletedSessionLogsUseCase");
        ju.t.f(qVar, "determineSessionLogProtocolUseCase");
        ju.t.f(bVar2, "jsonConverter");
        this.f27173a = aVar;
        this.f27174b = r0Var;
        this.f27175c = n0Var;
        this.f27176d = bVar;
        this.f27177e = aVar2;
        this.f27178f = eVar;
        this.f27179g = fVar;
        this.f27180h = yVar;
        this.f27181i = iVar;
        this.f27182j = hVar;
        this.f27183k = jVar;
        this.f27184l = fVar2;
        this.f27185m = h2Var;
        this.f27186n = j2Var;
        this.f27187o = qVar;
        this.f27188p = bVar2;
    }

    private final SessionLogProtocol j(Long l10, tl.u uVar) {
        SessionLogProtocol sessionLogProtocolV = uVar.v();
        if (sessionLogProtocolV == null) {
            sessionLogProtocolV = this.f27187o.a(uVar.Q(), uVar.O(), uVar.R());
        }
        switch (sessionLogProtocolV == null ? -1 : b.f27189a[sessionLogProtocolV.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new ut.s();
            case 1:
            case 2:
                if (l10 == null) {
                    return SessionLogProtocol.QUICK_CONNECTION;
                }
            case 3:
            case 4:
            case 5:
            case 6:
                return sessionLogProtocolV;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0196 A[LOOP:2: B:42:0x0190->B:44:0x0196, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1 A[Catch: SQLiteException -> 0x0080, TryCatch #1 {SQLiteException -> 0x0080, blocks: (B:16:0x007a, B:21:0x009b, B:60:0x0207, B:49:0x01c0, B:50:0x01cb, B:52:0x01d1, B:54:0x01e0, B:56:0x01e6), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0238 A[LOOP:0: B:65:0x0232->B:67:0x0238, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.content.Context r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, java.lang.String r23, java.util.List r24, java.util.List r25, rg.a r26, zt.e r27) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.k(android.content.Context, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, rg.a, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(JsonDecodeFromStringFailed jsonDecodeFromStringFailed, io.sentry.a1 a1Var) {
        ju.t.f(a1Var, "scope");
        a1Var.O(jsonDecodeFromStringFailed.asAttachment());
    }

    private final rg.a m(dq.s sVar, List list, CryptoErrorCollector cryptoErrorCollector) {
        try {
            rg.h hVarA = this.f27182j.a(this.f27181i.a(true, sVar), true);
            hVarA.s0(cryptoErrorCollector);
            try {
                rg.v vVarB = com.server.auditor.ssh.client.interactors.j.b(this.f27183k, true, list, false, 4, null);
                vVarB.a(cryptoErrorCollector);
                return new rg.a(hVarA, vVarB);
            } catch (IllegalStateException e10) {
                y9.a.f86838a.i(e10);
                return null;
            }
        } catch (IllegalStateException e11) {
            y9.a.f86838a.i(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(android.content.Context r13, rg.a r14, zt.e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.d
            if (r0 == 0) goto L14
            r0 = r15
            com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$d r0 = (com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.d) r0
            int r1 = r0.f27205e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f27205e = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$d r0 = new com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$d
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r11.f27203c
            java.lang.Object r0 = au.b.f()
            int r1 = r11.f27205e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            ut.x.b(r15)
            return r15
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.Object r13 = r11.f27202b
            r14 = r13
            rg.a r14 = (rg.a) r14
            java.lang.Object r13 = r11.f27201a
            android.content.Context r13 = (android.content.Context) r13
            ut.x.b(r15)
        L42:
            r10 = r14
            goto L56
        L44:
            ut.x.b(r15)
            com.server.auditor.ssh.client.interactors.r0 r15 = r12.f27174b
            r11.f27201a = r13
            r11.f27202b = r14
            r11.f27205e = r3
            java.lang.Object r15 = r15.c(r11)
            if (r15 != r0) goto L42
            goto L89
        L56:
            com.server.auditor.ssh.client.interactors.r0$b r15 = (com.server.auditor.ssh.client.interactors.r0.b) r15
            boolean r14 = r15 instanceof com.server.auditor.ssh.client.interactors.r0.b.c
            if (r14 == 0) goto L8b
            com.server.auditor.ssh.client.interactors.r0$b$c r15 = (com.server.auditor.ssh.client.interactors.r0.b.c) r15
            java.util.List r3 = r15.d()
            java.util.List r4 = r15.e()
            java.util.List r5 = r15.g()
            java.util.List r6 = r15.c()
            java.lang.String r7 = r15.f()
            java.util.List r8 = r15.a()
            java.util.List r9 = r15.b()
            r14 = 0
            r11.f27201a = r14
            r11.f27202b = r14
            r11.f27205e = r2
            r1 = r12
            r2 = r13
            java.lang.Object r13 = r1.k(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L8a
        L89:
            return r0
        L8a:
            return r13
        L8b:
            boolean r13 = r15 instanceof com.server.auditor.ssh.client.interactors.r0.b.C0439b
            if (r13 != 0) goto L9a
            boolean r13 = r15 instanceof com.server.auditor.ssh.client.interactors.r0.b.a
            if (r13 == 0) goto L94
            goto L9a
        L94:
            ut.s r13 = new ut.s
            r13.<init>()
            throw r13
        L9a:
            com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$HistorySyncProcessResultCode$ErrorOccurred r13 = com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.HistorySyncProcessResultCode.ErrorOccurred.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.n(android.content.Context, rg.a, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(android.content.Context r15, java.util.List r16, rg.a r17, zt.e r18) throws com.server.auditor.ssh.client.interactors.j0 {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.o(android.content.Context, java.util.List, rg.a, zt.e):java.lang.Object");
    }

    public static /* synthetic */ Object q(HistorySyncProcessInteractor historySyncProcessInteractor, Context context, dq.s sVar, List list, int i10, zt.e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = TermiusApplication.F();
        }
        if ((i11 & 8) != 0) {
            i10 = SyncConstants.ResultCode.OK;
        }
        return historySyncProcessInteractor.p(context, sVar, list, i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (r5 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel r54, zt.e r55) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.r(com.server.auditor.ssh.client.synchronization.api.models.history.ResponseHistoryConnectionModel, zt.e):java.lang.Object");
    }

    private final Object s(List list, rg.a aVar, zt.e eVar) {
        return wu.i.g(wu.x0.a(), new h(list, this, aVar, null), eVar);
    }

    private final PostHistoryConnectionModel t(final tl.u uVar, final rg.a aVar) {
        rg.h hVarF;
        HistoryApiModel historyApiModel = new HistoryApiModel(uVar);
        mv.b bVar = this.f27188p;
        bVar.a();
        String strC = bVar.c(HistoryApiModel.Companion.serializer(), historyApiModel);
        Long hostRemoteId = historyApiModel.getHostRemoteId();
        String strG = uVar.G();
        if (strG == null) {
            strG = uVar.h();
        }
        String str = strG;
        try {
            hVarF = this.f27184l.a(uVar.K(), aVar.f(), aVar.k());
        } catch (MissingCryptorException e10) {
            y9.a.f86838a.j(e10, new i4() { // from class: com.server.auditor.ssh.client.interactors.u
                @Override // io.sentry.i4
                public final void a(io.sentry.a1 a1Var) {
                    HistorySyncProcessInteractor.u(uVar, aVar, a1Var);
                }
            });
            hVarF = aVar.f();
        }
        return (PostHistoryConnectionModel) io.a.c(hVarF, new PostHistoryConnectionModel(uVar.p(), hostRemoteId, strC, str, hVarF.K(), j(hostRemoteId, uVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(tl.u uVar, rg.a aVar, io.sentry.a1 a1Var) {
        VaultKeyId vaultKeyId;
        ju.t.f(a1Var, "scope");
        h7 h7Var = h7.WARNING;
        a1Var.r(h7Var);
        HostDBModel itemByLocalId = uVar.n() != null ? hg.f.p().i().getItemByLocalId(uVar.n().longValue()) : null;
        io.sentry.f fVarB = y9.b.b("Missing cryptor for history connection", b.c.f70431c, c.C1098c.f70437b);
        fVarB.F(h7Var);
        fVarB.E("action", "Fallback to Remote Cryptor");
        Set setKeySet = aVar.k().k().keySet();
        ju.t.e(setKeySet, "<get-keys>(...)");
        fVarB.E("available_team_cryptor_ids", vt.v.z0(setKeySet, null, null, null, 0, null, null, 63, null));
        ut.u uVarA = ut.b0.a(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, Long.valueOf(uVar.p()));
        ut.u uVarA2 = ut.b0.a("encrypted_with", String.valueOf(uVar.K().getId()));
        ut.u uVarA3 = ut.b0.a(SshOptions.EXTRA_CONNECTION_TYPE, String.valueOf(uVar.g()));
        String strD = uVar.D();
        fVarB.E("history_info", vt.s0.k(uVarA, uVarA2, uVarA3, ut.b0.a("has_session_log", Boolean.valueOf(!(strD == null || strD.length() == 0)))));
        fVarB.E("host_info", vt.s0.k(ut.b0.a(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, String.valueOf(uVar.n())), ut.b0.a("remote_id", String.valueOf(itemByLocalId != null ? Long.valueOf(itemByLocalId.getIdOnServer()) : null)), ut.b0.a("encrypted_with", String.valueOf((itemByLocalId == null || (vaultKeyId = itemByLocalId.getVaultKeyId()) == null) ? null : vaultKeyId.getId())), ut.b0.a(Column.STATUS, String.valueOf(itemByLocalId != null ? Integer.valueOf(itemByLocalId.getStatus()) : null))));
        a1Var.b(fVarB);
    }

    private final Object v(List list, rg.a aVar, zt.e eVar) {
        return wu.i.g(wu.x0.a(), new i(list, aVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.j
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$j r0 = (com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.j) r0
            int r1 = r0.f27248d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27248d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$j r0 = new com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27246b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27248d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27245a
            com.server.auditor.ssh.client.app.a r0 = (com.server.auditor.ssh.client.app.a) r0
            ut.x.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            ut.x.b(r6)
            com.server.auditor.ssh.client.app.a r6 = r5.f27173a
            vl.b r2 = r5.f27176d
            r0.f27245a = r6
            r0.f27248d = r3
            java.lang.Object r0 = r2.m(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            r0.M0(r6)
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.w(zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0168, code lost:
    
        if (r0 == r4) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #3 {all -> 0x00ff, blocks: (B:37:0x00d8, B:39:0x00de, B:47:0x0107), top: B:81:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ff, blocks: (B:37:0x00d8, B:39:0x00de, B:47:0x0107), top: B:81:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v7, types: [to.h2] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, rg.a] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [vl.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [dq.s] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0168 -> B:67:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(android.content.Context r15, dq.s r16, java.util.List r17, int r18, zt.e r19) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor.p(android.content.Context, dq.s, java.util.List, int, zt.e):java.lang.Object");
    }
}
