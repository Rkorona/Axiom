package com.server.auditor.ssh.client.room;

import android.content.Context;
import androidx.room.d0;
import ap.c0;
import ap.q0;
import ap.u;
import com.server.auditor.ssh.client.room.c;
import ju.k;
import ju.n0;
import ju.t;
import tl.l1;
import tl.m2;
import tl.o;
import tl.t1;
import tl.v0;
import tl.w;
import tl.x1;
import ut.m0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AppDatabase extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38762a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38763b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AppDatabase f38764c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final AppDatabase a(Context context) {
            t.f(context, "context");
            if (AppDatabase.f38764c == null) {
                synchronized (n0.b(AppDatabase.class)) {
                    Context applicationContext = context.getApplicationContext();
                    t.e(applicationContext, "getApplicationContext(...)");
                    d0.a aVarA = androidx.room.t.a(applicationContext, AppDatabase.class, "termius_room_database.db");
                    c.a aVar = c.f38798a;
                    AppDatabase.f38764c = (AppDatabase) aVarA.b(aVar.j(), aVar.k(), aVar.l(), aVar.r(context), aVar.m(), aVar.n(), aVar.o(), aVar.p(), aVar.q(), aVar.a(), aVar.b(), aVar.c(), aVar.d(), aVar.e(), aVar.f(), aVar.g(), aVar.h(), aVar.i()).d();
                    m0 m0Var = m0.f82633a;
                }
            }
            AppDatabase appDatabase = AppDatabase.f38764c;
            t.d(appDatabase, "null cannot be cast to non-null type com.server.auditor.ssh.client.room.AppDatabase");
            return appDatabase;
        }

        private a() {
        }
    }

    public abstract l1 A();

    public abstract c0 B();

    public abstract q0 C();

    public abstract t1 D();

    public abstract x1 E();

    public abstract m2 F();

    public abstract ap.a s();

    public abstract ap.h t();

    public abstract o u();

    public abstract w v();

    public abstract ap.o w();

    public abstract u x();

    public abstract d y();

    public abstract v0 z();
}
