package com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models;

import android.text.TextUtils;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f26071f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f26073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ko.b f26074c = new ko.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ArrayList f26075d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ArrayList f26076e = new ArrayList();

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0410a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26077a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f26077a = iArr;
            try {
                iArr[ConnectionType.ssh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26077a[ConnectionType.telnet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26077a[ConnectionType.local.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26077a[ConnectionType.both_ssh_telnet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26077a[ConnectionType.none.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(int i10, String str) {
        this.f26072a = i10;
        this.f26073b = str;
    }

    protected String a(Connection connection) {
        int i10 = C0410a.f26077a[connection.getType().ordinal()];
        if (i10 == 1) {
            if (connection.getUri() == null) {
                return connection.getHost();
            }
            try {
                return URLDecoder.decode(connection.getUri().toString()).replace("://", " ").replace(":", " -p ");
            } catch (IllegalArgumentException unused) {
                return connection.getHost();
            }
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return connection.getHost();
            }
            if (i10 != 4 && i10 != 5) {
                return null;
            }
            String strB = this.f26074c.b(TermiusApplication.F(), connection, this.f26075d, this.f26076e);
            if (!TextUtils.isEmpty(strB)) {
                return String.format("%s %s", strB, connection.getHost());
            }
            return strB + connection.getHost();
        }
        TelnetProperties telnetProperties = connection.getTelnetProperties();
        String str = "telnet ";
        if (telnetProperties != null && telnetProperties.getIdentity() != null && !TextUtils.isEmpty(telnetProperties.getIdentity().getUsername())) {
            str = "telnet " + String.format(" -l %s ", telnetProperties.getIdentity().getUsername());
        }
        String str2 = str + connection.getHost();
        if (telnetProperties == null) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(String.format(" %s", (telnetProperties.getPort() == null || telnetProperties.getPort().intValue() == 0) ? "23" : telnetProperties.getPort()));
        return sb2.toString();
    }

    public int b() {
        return this.f26072a;
    }

    public CharSequence c() {
        return this.f26073b;
    }

    public void d(CharSequence charSequence) {
        this.f26073b = charSequence;
    }
}
