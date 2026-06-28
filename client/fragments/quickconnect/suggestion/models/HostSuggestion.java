package com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models;

import android.text.TextUtils;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HostSuggestion extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected SearchType f26064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f26065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f26066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private oi.b f26067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Connection f26068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f26069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26070m;

    private enum SearchType {
        Alias,
        Uri,
        Group,
        Tag,
        Unknown
    }

    public HostSuggestion(Host host, int i10) {
        super(i10, "");
        this.f26064g = SearchType.Unknown;
        this.f26068k = host;
        if (i10 == R.string.recent_connections) {
            host.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT_RECENT);
        } else if (i10 == R.string.frequently_using_hosts) {
            host.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT_FREQUENT);
        } else if (i10 == R.string.suggestions) {
            host.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT_SEARCH);
        } else if (host.getConnectionOrigin() == null) {
            host.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT);
        }
        j();
    }

    private List g(Long l10) {
        GroupDBModel itemByLocalId;
        ArrayList arrayList = new ArrayList();
        if (l10 != null && (itemByLocalId = f.p().h().getItemByLocalId(l10.longValue())) != null) {
            arrayList.add(itemByLocalId.getTitle());
            arrayList.addAll(g(itemByLocalId.getParentGroupId()));
        }
        return arrayList;
    }

    private String[] h(Host host) {
        ArrayList arrayList = new ArrayList();
        if (host.getGroup() != null) {
            arrayList.addAll(g(Long.valueOf(host.getGroup().getIdInDatabase())));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean i(a aVar) {
        return R.string.recent_connections == aVar.b();
    }

    private void j() {
        Host host = (Host) f();
        String alias = host.getAlias();
        if (TextUtils.isEmpty(alias)) {
            alias = host.getHeaderText();
        }
        boolean zI = i(this);
        this.f26070m = zI;
        if (zI && !TextUtils.isEmpty(host.getRecentConnectionDate())) {
            this.f26069l = host.getRecentConnectionDate();
            alias = "";
        }
        d(alias);
        this.f26067j = HostIconUtil.b(host.getOsModelType());
        this.f26065h = h(host);
        List listA = this.f26074c.a(TermiusApplication.F(), host, this.f26075d, this.f26076e);
        String[] strArr = new String[listA.size()];
        this.f26066i = strArr;
        listA.toArray(strArr);
    }

    public String e() {
        return (f().getType() == ConnectionType.both_ssh_telnet || f().getType() == ConnectionType.none) ? String.format("ssh %s", f().getHost()) : a(f());
    }

    public Connection f() {
        return this.f26068k;
    }
}
