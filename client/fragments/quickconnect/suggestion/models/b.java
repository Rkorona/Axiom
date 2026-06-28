package com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models;

import android.net.nsd.NsdServiceInfo;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.ConnectionProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.utils.analytics.Avo;

/* JADX INFO: loaded from: classes3.dex */
public class b extends HostSuggestion {
    public b(NsdServiceInfo nsdServiceInfo, int i10) {
        super(k(nsdServiceInfo), i10);
    }

    private static Host k(NsdServiceInfo nsdServiceInfo) {
        String strL = l(nsdServiceInfo);
        ConnectionProperties telnetProperties = nsdServiceInfo.getServiceType().contains("_telnet._tcp") ? new TelnetProperties(null, null, null, null, Integer.valueOf(nsdServiceInfo.getPort()), null) : new SshProperties(m(nsdServiceInfo), null, null, null, null, Boolean.FALSE, null);
        Host host = new Host(strL);
        host.setAlias(nsdServiceInfo.getServiceName());
        host.setConfig(nsdServiceInfo.getServiceType().contains("_telnet._tcp") ? ConnectionType.telnet : ConnectionType.ssh, telnetProperties);
        host.setConnectionOrigin(Avo.ConnectionOrigin.DISCOVER_NEW_DEVICE);
        return host;
    }

    private static String l(NsdServiceInfo nsdServiceInfo) {
        return nsdServiceInfo.getHost() == null ? nsdServiceInfo.getServiceName() : nsdServiceInfo.getHost().getHostAddress();
    }

    private static Integer m(NsdServiceInfo nsdServiceInfo) {
        Integer numValueOf = Integer.valueOf(nsdServiceInfo.getPort());
        if (nsdServiceInfo.getServiceType().contains("_workstation._tcp")) {
            return null;
        }
        return numValueOf;
    }
}
