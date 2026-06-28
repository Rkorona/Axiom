package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SshConfigDBAdapter f27379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TelnetConfigDBAdapter f27380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GroupDBAdapter f27381c;

    public f(SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter) {
        ju.t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        ju.t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        ju.t.f(groupDBAdapter, "groupDBAdapter");
        this.f27379a = sshConfigDBAdapter;
        this.f27380b = telnetConfigDBAdapter;
        this.f27381c = groupDBAdapter;
    }

    private final GroupDBModel a(Long l10) {
        if (l10 == null) {
            return null;
        }
        return this.f27381c.getItemByLocalId(l10.longValue());
    }

    private final SshRemoteConfigDBModel d(Long l10) {
        if (l10 == null) {
            return null;
        }
        return this.f27379a.getItemByLocalId(l10.longValue());
    }

    private final TelnetRemoteConfigDBModel f(Long l10) {
        if (l10 == null) {
            return null;
        }
        return this.f27380b.getItemByLocalId(l10.longValue());
    }

    public final String b(Long l10) {
        String charset;
        GroupDBModel groupDBModelA = a(l10);
        if (groupDBModelA == null) {
            return null;
        }
        SshRemoteConfigDBModel sshRemoteConfigDBModelD = d(groupDBModelA.getSshConfigId());
        return (sshRemoteConfigDBModelD == null || (charset = sshRemoteConfigDBModelD.getCharset()) == null) ? b(groupDBModelA.getParentGroupId()) : charset;
    }

    public final String c(Long l10) {
        String colorScheme;
        GroupDBModel groupDBModelA = a(l10);
        if (groupDBModelA == null) {
            return null;
        }
        SshRemoteConfigDBModel sshRemoteConfigDBModelD = d(groupDBModelA.getSshConfigId());
        return (sshRemoteConfigDBModelD == null || (colorScheme = sshRemoteConfigDBModelD.getColorScheme()) == null) ? c(groupDBModelA.getParentGroupId()) : colorScheme;
    }

    public final String e(Long l10) {
        String charset;
        GroupDBModel groupDBModelA = a(l10);
        if (groupDBModelA == null) {
            return null;
        }
        TelnetRemoteConfigDBModel telnetRemoteConfigDBModelF = f(groupDBModelA.getTelnetConfigId());
        return (telnetRemoteConfigDBModelF == null || (charset = telnetRemoteConfigDBModelF.getCharset()) == null) ? e(groupDBModelA.getParentGroupId()) : charset;
    }
}
