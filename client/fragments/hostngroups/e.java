package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GroupDBModel f25068b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupDBModel groupDBModel) {
        super(1, null);
        ju.t.f(groupDBModel, HostBulk.GROUP_ID_SERIAL_NAME);
        this.f25068b = groupDBModel;
    }

    public final GroupDBModel b() {
        return this.f25068b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && ju.t.b(this.f25068b, ((e) obj).f25068b);
    }

    public int hashCode() {
        return this.f25068b.hashCode();
    }

    public String toString() {
        return "GroupContainer(group=" + this.f25068b + ")";
    }
}
