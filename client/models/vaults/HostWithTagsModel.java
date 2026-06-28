package com.server.auditor.ssh.client.models.vaults;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import java.util.List;
import ju.t;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class HostWithTagsModel extends HostDBModel {
    public static final int $stable = 8;
    private List<String> tags;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostWithTagsModel(String str, String str2) {
        super(str, str2);
        t.f(str, "title");
        t.f(str2, Column.ADDRESS);
        this.tags = v.o();
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final void setTags(List<String> list) {
        t.f(list, "<set-?>");
        this.tags = list;
    }
}
