package com.server.auditor.ssh.client.ui.sessionlogs.data;

import bu.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import so.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p(with = s.class)
public final class SessionLogUploadStatus {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SessionLogUploadStatus[] $VALUES;
    public static final a Companion;

    @o("COMPLETED")
    public static final SessionLogUploadStatus COMPLETED = new SessionLogUploadStatus("COMPLETED", 0);

    @o("CREATED")
    public static final SessionLogUploadStatus CREATED = new SessionLogUploadStatus("CREATED", 1);

    @o("REJECTED")
    public static final SessionLogUploadStatus REJECTED = new SessionLogUploadStatus("REJECTED", 2);

    @o("ABORTED")
    public static final SessionLogUploadStatus ABORTED = new SessionLogUploadStatus("ABORTED", 3);

    @o("UNKNOWN")
    public static final SessionLogUploadStatus UNKNOWN = new SessionLogUploadStatus("UNKNOWN", 4);

    public static final class a {
        private a() {
        }

        public final c serializer() {
            return s.f78188a;
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ SessionLogUploadStatus[] $values() {
        return new SessionLogUploadStatus[]{COMPLETED, CREATED, REJECTED, ABORTED, UNKNOWN};
    }

    static {
        SessionLogUploadStatus[] sessionLogUploadStatusArr$values = $values();
        $VALUES = sessionLogUploadStatusArr$values;
        $ENTRIES = b.a(sessionLogUploadStatusArr$values);
        Companion = new a(null);
    }

    private SessionLogUploadStatus(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SessionLogUploadStatus valueOf(String str) {
        return (SessionLogUploadStatus) Enum.valueOf(SessionLogUploadStatus.class, str);
    }

    public static SessionLogUploadStatus[] values() {
        return (SessionLogUploadStatus[]) $VALUES.clone();
    }
}
