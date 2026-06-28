package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import com.server.auditor.ssh.client.database.models.ShortcutsTrainDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f38967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f38968c;

    public b(ShortcutsTrainDBModel shortcutsTrainDBModel) {
        this(shortcutsTrainDBModel.getId(), shortcutsTrainDBModel.getShortcuts(), shortcutsTrainDBModel.getOrder());
    }

    public String[] a() {
        return this.f38967b;
    }

    public long b() {
        return this.f38966a;
    }

    public double c() {
        return this.f38968c;
    }

    public void d(long j10) {
        this.f38966a = j10;
    }

    public void e(double d10) {
        this.f38968c = d10;
    }

    public b(long j10, String[] strArr, double d10) {
        this.f38966a = j10;
        this.f38967b = strArr;
        this.f38968c = d10;
    }
}
