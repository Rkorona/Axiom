package com.server.auditor.ssh.client.fragments.editors.base;

import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f24937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SshProperties f24938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TelnetProperties f24939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalProperties f24940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GroupDBModel f24941h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ChainingHost f24943j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24946m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24934a = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f24942i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24944k = false;

    public int hashCode() {
        GroupDBModel groupDBModel = this.f24941h;
        String title = groupDBModel != null ? groupDBModel.getTitle() : "";
        SshProperties sshProperties = this.f24938e;
        int iHashCode = sshProperties != null ? sshProperties.hashCode() : 0;
        TelnetProperties telnetProperties = this.f24939f;
        return Arrays.hashCode(new String[]{this.f24935b, this.f24936c, title}) + iHashCode + (telnetProperties != null ? telnetProperties.hashCode() : 0);
    }
}
