package com.server.auditor.ssh.client.ui.user.domain;

import android.content.SharedPreferences;
import hg.d;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.Map;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.e;
import lv.b1;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import mv.b;
import vt.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class UserAvatarDownloadAttemptTimestampRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41397c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41398d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f41399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f41400b;

    @p
    private static final class UserAvatarDownloadAttemptMetaData {
        public static final b Companion = new b(null);
        private final long timestamp;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f41401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f41402b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f41401a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository.UserAvatarDownloadAttemptMetaData", aVar, 1);
                i2Var.r("timestamp", false);
                descriptor = i2Var;
                f41402b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserAvatarDownloadAttemptMetaData deserialize(e eVar) {
                long jO;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                c cVarD = eVar.d(fVar);
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
                                throw new e0(iD);
                            }
                            jO2 = cVarD.o(fVar, 0);
                            i11 = 1;
                        }
                    }
                    jO = jO2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new UserAvatarDownloadAttemptMetaData(i10, jO, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, UserAvatarDownloadAttemptMetaData userAvatarDownloadAttemptMetaData) {
                t.f(fVar, "encoder");
                t.f(userAvatarDownloadAttemptMetaData, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                UserAvatarDownloadAttemptMetaData.write$Self$Termius_app_googleProductionRelease(userAvatarDownloadAttemptMetaData, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{h1.f64699a};
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
                return a.f41401a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ UserAvatarDownloadAttemptMetaData(int i10, long j10, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f41401a.getDescriptor());
            }
            this.timestamp = j10;
        }

        public static /* synthetic */ UserAvatarDownloadAttemptMetaData copy$default(UserAvatarDownloadAttemptMetaData userAvatarDownloadAttemptMetaData, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = userAvatarDownloadAttemptMetaData.timestamp;
            }
            return userAvatarDownloadAttemptMetaData.copy(j10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(UserAvatarDownloadAttemptMetaData userAvatarDownloadAttemptMetaData, kv.d dVar, f fVar) {
            dVar.q(fVar, 0, userAvatarDownloadAttemptMetaData.timestamp);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final UserAvatarDownloadAttemptMetaData copy(long j10) {
            return new UserAvatarDownloadAttemptMetaData(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserAvatarDownloadAttemptMetaData) && this.timestamp == ((UserAvatarDownloadAttemptMetaData) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "UserAvatarDownloadAttemptMetaData(timestamp=" + this.timestamp + ")";
        }

        public UserAvatarDownloadAttemptMetaData(long j10) {
            this.timestamp = j10;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public UserAvatarDownloadAttemptTimestampRepository(b bVar, d dVar) {
        t.f(bVar, "jsonConverter");
        t.f(dVar, "insensitiveKeyValueRepository");
        this.f41399a = bVar;
        this.f41400b = dVar;
    }

    private final Map c() {
        String string = this.f41400b.getString("users_avatar_download_attempts_timestamp", "");
        if (string == null || string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return s0.h();
        }
        try {
            b bVar = this.f41399a;
            bVar.a();
            return (Map) bVar.b(new b1(h1.f64699a, UserAvatarDownloadAttemptMetaData.Companion.serializer()), string);
        } catch (IllegalArgumentException e10) {
            y9.a.f86838a.k(e10, "Failed to deserialize users avatar download attempt timestamp");
            return s0.h();
        }
    }

    private final boolean e(Map map) {
        try {
            b bVar = this.f41399a;
            bVar.a();
            String strC = bVar.c(new b1(h1.f64699a, UserAvatarDownloadAttemptMetaData.Companion.serializer()), map);
            SharedPreferences.Editor editorEdit = this.f41400b.edit();
            editorEdit.putString("users_avatar_download_attempts_timestamp", strC);
            editorEdit.apply();
            return true;
        } catch (IllegalArgumentException e10) {
            y9.a.f86838a.k(e10, "Failed to serialize users avatar download attempt timestamp");
            return false;
        }
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = this.f41400b.edit();
        editorEdit.remove("users_avatar_download_attempts_timestamp");
        editorEdit.apply();
    }

    public final long b(long j10) {
        UserAvatarDownloadAttemptMetaData userAvatarDownloadAttemptMetaData = (UserAvatarDownloadAttemptMetaData) c().get(Long.valueOf(j10));
        if (userAvatarDownloadAttemptMetaData != null) {
            return userAvatarDownloadAttemptMetaData.getTimestamp();
        }
        return 0L;
    }

    public final boolean d(long j10, long j11) {
        Map mapW = s0.w(c());
        mapW.put(Long.valueOf(j10), new UserAvatarDownloadAttemptMetaData(j11));
        return e(mapW);
    }
}
