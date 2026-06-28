package com.server.auditor.ssh.client.interactors;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27252b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27253c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27254d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.d f27255a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public a0(hg.d dVar) {
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        this.f27255a = dVar;
    }

    private final void b(Date date) {
        SharedPreferences.Editor editorEdit = this.f27255a.edit();
        editorEdit.putString("last_sync_datetime", SyncConstants.LastSyncTime.sLastSyncFormat.format(date));
        editorEdit.apply();
    }

    public final String a() {
        return this.f27255a.getString("last_sync_datetime", f27254d);
    }

    public final void c() {
        b(new Date());
    }
}
