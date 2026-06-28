package com.server.auditor.ssh.client.help;

import android.content.Context;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27037b;

    public b(a aVar, com.server.auditor.ssh.client.app.a aVar2) {
        ju.t.f(aVar, "applicationInfo");
        ju.t.f(aVar2, "termiusStorage");
        this.f27036a = aVar;
        this.f27037b = aVar2;
    }

    private final String b() {
        String str = this.f27036a.b() + " " + this.f27036a.c();
        String strSubstring = str.substring(0, 1);
        ju.t.e(strSubstring, "substring(...)");
        Locale locale = Locale.ENGLISH;
        ju.t.e(locale, "ENGLISH");
        String upperCase = strSubstring.toUpperCase(locale);
        ju.t.e(upperCase, "toUpperCase(...)");
        String strSubstring2 = str.substring(1);
        ju.t.e(strSubstring2, "substring(...)");
        return upperCase + strSubstring2;
    }

    private final String c() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        String username = apiKey != null ? apiKey.getUsername() : null;
        return username == null ? "" : username;
    }

    public final String a(Context context) {
        ju.t.f(context, "context");
        String strD = this.f27036a.d();
        String strB = b();
        String strA = this.f27036a.a();
        String strZ = this.f27037b.Z();
        String strC = c();
        Integer numQ = com.server.auditor.ssh.client.app.a.N().q();
        if (numQ == null) {
            String string = context.getString(R.string.helpdesk_application_info_not_auth_user, strD, strB, strA, strZ);
            ju.t.c(string);
            return string;
        }
        String string2 = context.getString(R.string.helpdesk_application_info_auth_user, strD, strB, strA, numQ, strC, strZ);
        ju.t.c(string2);
        return string2;
    }
}
