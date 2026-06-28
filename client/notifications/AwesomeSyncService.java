package com.server.auditor.ssh.client.notifications;

import android.content.Intent;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.navigation.MainActivity;
import com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity;
import hg.b2;
import hg.f;
import java.util.Map;
import ju.k;
import ju.t;
import org.json.JSONException;
import org.json.JSONObject;
import su.d;
import ug.c;
import zu.a0;
import zu.c0;
import zu.v;

/* JADX INFO: loaded from: classes3.dex */
public final class AwesomeSyncService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f35130v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f35131w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final v f35132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a0 f35133y;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final a0 a() {
            return AwesomeSyncService.f35133y;
        }

        private a() {
        }
    }

    static {
        v vVarB = c0.b(0, 1, null, 4, null);
        f35132x = vVarB;
        f35133y = vVarB;
    }

    private final void v(String str) {
        if (hg.a.f52933c.a() instanceof SshIdNavigationActivity) {
            f35132x.b(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void w(Map map) {
        String string;
        String str = (String) map.get("termius_data");
        if (str != null) {
            try {
                string = new JSONObject(str).getString("notification_type");
            } catch (JSONException e10) {
                y9.a.f86838a.i(e10);
            }
            if (string != null) {
                switch (string.hashCode()) {
                    case -1874981156:
                        if (string.equals("ssh-id-pass-key-posted")) {
                            v(string);
                        }
                        break;
                    case -1440640973:
                        if (string.equals("update_profile")) {
                            f.p().Y().getUserProfile();
                        }
                        break;
                    case -1097329270:
                        if (string.equals("logout")) {
                            TermiusApplication.Y(true);
                            if (hg.a.f52933c.d()) {
                                Intent intent = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
                                intent.setAction("android.intent.action.FORCE_LOGOUT");
                                intent.setFlags(335544320);
                                getApplicationContext().startActivity(intent);
                            } else {
                                ig.f.n(getApplicationContext());
                            }
                            new am.a(TermiusApplication.F()).m((String) map.get(NewConnectionFlowActivity.EXTRA_MESSAGE));
                        }
                        break;
                    case 3545755:
                        if (string.equals("sync")) {
                            x();
                        }
                        break;
                    case 515390387:
                        if (string.equals("in-app-message")) {
                            b2.f52944a.D1().m();
                        }
                        break;
                    case 541874507:
                        if (string.equals("team-updated")) {
                            com.server.auditor.ssh.client.app.a.N().Q().f("7465616D5F6D656D626572735F6F6E6C696E655F6361636865");
                            f.p().Y().requestTeamMembersList(false);
                        }
                        break;
                    case 1943921893:
                        if (string.equals("mobile-device-activated")) {
                            v(string);
                        }
                        break;
                }
            }
        }
    }

    private final void x() {
        f.p().Y().startPartialSync();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void p(RemoteMessage remoteMessage) {
        t.f(remoteMessage, "remoteMessage");
        super.p(remoteMessage);
        Map<String, String> data = remoteMessage.getData();
        t.e(data, "getData(...)");
        if (data.containsKey("termius_data")) {
            w(data);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(String str) {
        t.f(str, "pushToken");
        super.r(str);
        c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        byte[] bytes = str.getBytes(d.f78241b);
        t.e(bytes, "getBytes(...)");
        cVarQ.g("66636D5F707573685F746F6B656E", bytes);
        if (com.server.auditor.ssh.client.app.a.N().r0()) {
            f.p().Y().activateDevice();
        }
    }
}
