package com.server.auditor.ssh.client.app.preferencesmigration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k[] f21440a = {new h(), new c(), new e(), new w(), new b(), new f(), new g(), new a(), new x(), new n(), new p(), new d(), new v(), new q(), new m(), new r(), new t(), new s(), new i(), new MigrateToAccountAccessObjectsPatch(), new o(), new u(), new l()};

    public static hg.d a(hg.d dVar) {
        k[] kVarArr;
        int i10 = dVar.getInt("preferences_version", 0);
        if (i10 != f21440a.length) {
            while (true) {
                kVarArr = f21440a;
                if (i10 >= kVarArr.length) {
                    break;
                }
                kVarArr[i10].a(dVar);
                i10++;
            }
            dVar.edit().putInt("preferences_version", kVarArr.length).apply();
        }
        return new hg.g(dVar);
    }
}
