package com.server.auditor.ssh.client.ui.sessionlogs.data;

import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class SessionLogFileStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SessionLogFileStatus[] $VALUES;
    public static final SessionLogFileStatus WRITING = new SessionLogFileStatus("WRITING", 0);
    public static final SessionLogFileStatus READY_TO_UPLOAD = new SessionLogFileStatus("READY_TO_UPLOAD", 1);
    public static final SessionLogFileStatus UPLOADED = new SessionLogFileStatus("UPLOADED", 2);
    public static final SessionLogFileStatus NONE = new SessionLogFileStatus("NONE", 3);

    private static final /* synthetic */ SessionLogFileStatus[] $values() {
        return new SessionLogFileStatus[]{WRITING, READY_TO_UPLOAD, UPLOADED, NONE};
    }

    static {
        SessionLogFileStatus[] sessionLogFileStatusArr$values = $values();
        $VALUES = sessionLogFileStatusArr$values;
        $ENTRIES = b.a(sessionLogFileStatusArr$values);
    }

    private SessionLogFileStatus(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SessionLogFileStatus valueOf(String str) {
        return (SessionLogFileStatus) Enum.valueOf(SessionLogFileStatus.class, str);
    }

    public static SessionLogFileStatus[] values() {
        return (SessionLogFileStatus[]) $VALUES.clone();
    }
}
