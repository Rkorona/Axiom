package com.server.auditor.ssh.client.ui.sessionlogs.data;

import bu.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import so.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p(with = r.class)
public final class SessionLogProtocol {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SessionLogProtocol[] $VALUES;
    public static final a Companion;

    @o("SSH")
    public static final SessionLogProtocol SSH = new SessionLogProtocol("SSH", 0);

    @o("TELNET")
    public static final SessionLogProtocol TELNET = new SessionLogProtocol("TELNET", 1);

    @o("MOSH")
    public static final SessionLogProtocol MOSH = new SessionLogProtocol("MOSH", 2);

    @o("QUICK_CONNECTION")
    public static final SessionLogProtocol QUICK_CONNECTION = new SessionLogProtocol("QUICK_CONNECTION", 3);

    @o("LOCAL_TERMINAL")
    public static final SessionLogProtocol LOCAL_TERMINAL = new SessionLogProtocol("LOCAL_TERMINAL", 4);

    @o("SERIAL")
    public static final SessionLogProtocol SERIAL = new SessionLogProtocol("SERIAL", 5);

    public static final class a {
        private a() {
        }

        public final c serializer() {
            return r.f78184b;
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ SessionLogProtocol[] $values() {
        return new SessionLogProtocol[]{SSH, TELNET, MOSH, QUICK_CONNECTION, LOCAL_TERMINAL, SERIAL};
    }

    static {
        SessionLogProtocol[] sessionLogProtocolArr$values = $values();
        $VALUES = sessionLogProtocolArr$values;
        $ENTRIES = b.a(sessionLogProtocolArr$values);
        Companion = new a(null);
    }

    private SessionLogProtocol(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SessionLogProtocol valueOf(String str) {
        return (SessionLogProtocol) Enum.valueOf(SessionLogProtocol.class, str);
    }

    public static SessionLogProtocol[] values() {
        return (SessionLogProtocol[]) $VALUES.clone();
    }
}
