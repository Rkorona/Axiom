package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.Context;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.crystalnix.termius.libtermius.wrappers.sftp.FileSystemSession;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.ActiveConnection;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Host f25051a;

    class a implements xl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25052a;

        a(Context context) {
            this.f25052a = context;
        }

        @Override // xl.b
        public void onSessionConnectFailed(int i10) {
        }

        @Override // xl.b
        public void onSessionConnected(com.crystalnix.terminal.sessions.common.base.g gVar) {
            TerminalConnectionManager.openActiveTerminalSession(this.f25052a, (int) ((FileSystemSession) gVar).getSessionId());
        }

        @Override // xl.b
        public void onSessionDisconnected(com.crystalnix.terminal.sessions.common.base.g gVar) {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.hostngroups.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0409b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25054a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            f25054a = iArr;
            try {
                iArr[ConnectionType.ssh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25054a[ConnectionType.both_ssh_telnet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25054a[ConnectionType.local.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25054a[ConnectionType.telnet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(Host host) {
        this.f25051a = host;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(Connection connection, Context context, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == -2) {
            SessionManager.getInstance().disconnectTerminalSession(connection);
            SessionManager.getInstance().disconnectHostSftpSession(connection.getId());
            SessionManager.getInstance().terminalSessionHelper.notifyConnectionsChanged();
            return true;
        }
        if (itemId == -1) {
            this.f25051a.setConnectionOrigin(Avo.ConnectionOrigin.HOSTS_SCREEN);
            TerminalConnectionManager.enqueueStartTerminalSession(this.f25051a);
            return true;
        }
        if (itemId != -3) {
            TerminalConnectionManager.openActiveTerminalSession(context, menuItem.getItemId());
            return true;
        }
        this.f25051a.setConnectionOrigin(Avo.ConnectionOrigin.HOSTS_SCREEN);
        SessionManager.getInstance().connectSftpSession(this.f25051a, new a(context));
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10;
        String str;
        String str2;
        final Context context = view.getContext();
        PopupMenu popupMenu = new PopupMenu(context, view);
        popupMenu.getMenu().add(0, -1, 0, context.getString(R.string.connect));
        final Host host = this.f25051a;
        ConnectionType type = host.getType();
        if ((type == ConnectionType.ssh || type == ConnectionType.both_ssh_telnet) && !host.getSafeSshProperties().isUseMosh()) {
            popupMenu.getMenu().add(0, -3, 0, context.getString(R.string.connect_via_sftp));
        }
        Iterator<ActiveConnection> it = SessionManager.getInstance().getActiveTerminalConnection().iterator();
        int i11 = 1;
        while (true) {
            i10 = 4;
            str = "%s  (%d)";
            if (!it.hasNext()) {
                break;
            }
            ActiveConnection next = it.next();
            if (next.getHostId() != null && next.getHostId().equals(Long.valueOf(this.f25051a.getId()))) {
                String alias = next.getAlias();
                if (TextUtils.isEmpty(alias)) {
                    int i12 = C0409b.f25054a[next.getType().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        alias = (next.getUri() == null || TextUtils.isEmpty(next.getUri().getUserInfo())) ? next.getHost() : String.format("%s@%s", next.getUri().getUserInfo(), next.getHost());
                    } else if (i12 == 4) {
                        alias = next.getHost();
                    }
                }
                popupMenu.getMenu().add(0, (int) next.getId(), 0, i11 > 1 ? String.format("%s  (%d)", alias, Integer.valueOf(i11)) : String.format("%s", alias));
                i11++;
            }
        }
        Iterator<Integer> it2 = SessionManager.getInstance().getSFTPSessionIds().iterator();
        while (it2.hasNext()) {
            zl.b libTermiusSftpSession = SessionManager.getInstance().getLibTermiusSftpSession(it2.next().intValue());
            if (libTermiusSftpSession == null || libTermiusSftpSession.c() == null || !libTermiusSftpSession.c().getHostId().equals(Long.valueOf(this.f25051a.getId()))) {
                str2 = str;
            } else {
                String alias2 = libTermiusSftpSession.c().getAlias();
                if (TextUtils.isEmpty(alias2)) {
                    int i13 = C0409b.f25054a[libTermiusSftpSession.c().getType().ordinal()];
                    if (i13 == 1 || i13 == 2) {
                        alias2 = (libTermiusSftpSession.c().getUri() == null || TextUtils.isEmpty(libTermiusSftpSession.c().getUri().getUserInfo())) ? libTermiusSftpSession.c().getHost() : String.format("SFTP - %s@%s", libTermiusSftpSession.c().getUri().getUserInfo(), libTermiusSftpSession.c().getHost());
                    } else if (i13 == i10) {
                        alias2 = libTermiusSftpSession.c().getHost();
                    }
                }
                str2 = str;
                popupMenu.getMenu().add(0, (int) libTermiusSftpSession.c().getId(), 0, i11 > 1 ? String.format(str, alias2, Integer.valueOf(i11)) : String.format("%s", alias2));
                i11++;
            }
            str = str2;
            i10 = 4;
        }
        if (i11 != 1) {
            popupMenu.getMenu().add(0, -2, 0, context.getString(i11 == 2 ? R.string.close_connection : R.string.close_all_connection));
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.server.auditor.ssh.client.fragments.hostngroups.a
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f25046a.b(host, context, menuItem);
            }
        });
        popupMenu.show();
    }
}
