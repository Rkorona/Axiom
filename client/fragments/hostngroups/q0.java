package com.server.auditor.ssh.client.fragments.hostngroups;

import android.content.Context;
import com.server.auditor.ssh.client.models.Host;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 implements kj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f25188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zp.e f25191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kj.e f25192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private il.r f25193f;

    public interface a {
        void a(Long l10);
    }

    public interface b {
        void a(Long l10);
    }

    public q0(Context context, b bVar, a aVar, zp.e eVar, kj.e eVar2, il.r rVar) {
        this.f25190c = context;
        this.f25188a = bVar;
        this.f25191d = eVar;
        this.f25192e = eVar2;
        this.f25193f = rVar;
        this.f25189b = aVar;
    }

    @Override // kj.b
    public void a(long[] jArr, boolean z10) {
        for (long j10 : jArr) {
            if (j10 != -1) {
                this.f25191d.e((int) j10);
                this.f25189b.a(Long.valueOf(j10));
            }
        }
        this.f25188a.a(null);
        hg.f.p().Y().startFullSync();
    }

    @Override // kj.b
    public void b(long j10) {
        Host hostS = this.f25193f.s(Long.valueOf(j10));
        if (hostS != null) {
            d(j10, hostS);
        }
    }

    public void c(long[] jArr) {
        for (long j10 : jArr) {
            if (j10 != -1) {
                this.f25191d.e((int) j10);
                this.f25189b.a(Long.valueOf(j10));
            }
        }
        this.f25188a.a(null);
    }

    public abstract void d(long j10, Host host);

    public abstract void e();
}
