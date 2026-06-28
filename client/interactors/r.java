package com.server.auditor.ssh.client.interactors;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27561c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27562d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.d f27564b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final boolean a(Context context) {
            ju.t.f(context, "context");
            com.google.android.gms.common.b bVarM = com.google.android.gms.common.b.m();
            ju.t.e(bVarM, "getInstance(...)");
            return bVarM.f(context) == 0;
        }

        private a() {
        }
    }

    public r(Context context, hg.d dVar) {
        ju.t.f(context, "applicationContext");
        ju.t.f(dVar, "insensitiveKeyValueRepository");
        this.f27563a = context;
        this.f27564b = dVar;
    }

    public final void a() {
        boolean zB = b();
        SharedPreferences.Editor editorEdit = this.f27564b.edit();
        editorEdit.putBoolean("CACHED_GOOGLE_SERVICES_AVAILABILITY_KEY", zB);
        editorEdit.apply();
    }

    public final boolean b() {
        return f27561c.a(this.f27563a);
    }
}
