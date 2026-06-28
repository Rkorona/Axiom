package com.server.auditor.ssh.client.navigation.ui.compose.components;

import androidx.annotation.Keep;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class GroupsAndHostsHeader {
    public static final int $stable = 0;
    private final String title;

    public GroupsAndHostsHeader(String str) {
        t.f(str, "title");
        this.title = str;
    }

    public static /* synthetic */ GroupsAndHostsHeader copy$default(GroupsAndHostsHeader groupsAndHostsHeader, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupsAndHostsHeader.title;
        }
        return groupsAndHostsHeader.copy(str);
    }

    public final String component1() {
        return this.title;
    }

    public final GroupsAndHostsHeader copy(String str) {
        t.f(str, "title");
        return new GroupsAndHostsHeader(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsAndHostsHeader) && t.b(this.title, ((GroupsAndHostsHeader) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "GroupsAndHostsHeader(title=" + this.title + ")";
    }
}
