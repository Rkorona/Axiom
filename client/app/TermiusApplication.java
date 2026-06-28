package com.server.auditor.ssh.client.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.q;
import com.crystalnix.termius.libtermius.EventLoop;
import com.crystalnix.termius.libtermius.SshAgentStorage;
import com.crystalnix.termius.libtermius.SshAgentStorageObserver;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LocalCacheFileWriterOpener;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.app.preferencesmigration.j;
import com.server.auditor.ssh.client.database.DataLoadingHelper;
import com.server.auditor.ssh.client.encryption.EncryptionKeyStorage;
import com.server.auditor.ssh.client.interactors.b1;
import com.server.auditor.ssh.client.navigation.ui.compose.i1;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import hg.d2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.w2;
import io.sentry.d0;
import io.sentry.f5;
import io.sentry.h7;
import io.sentry.i4;
import io.sentry.protocol.e0;
import io.sentry.protocol.i0;
import io.sentry.protocol.s;
import io.sentry.w8;
import io.sentry.x6;
import io.sentry.z7;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import timber.log.Timber;
import tp.c1;
import wu.x0;
import xg.l;
import zt.i;

/* JADX INFO: loaded from: classes2.dex */
public class TermiusApplication extends Application {
    private static boolean A = false;
    private static final hg.b B;
    private static hg.e C = null;
    private static boolean D = false;
    private static final AtomicBoolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f21388v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f21389w = "split_uuid";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f21390x = "Unknown architecture";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f21391y = "AndroidKeyStore";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static Context f21392z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private hg.d f21393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ug.c f21394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ug.c f21395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private KeyStore f21396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EncryptionKeyStorage f21397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f21398f = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/app/Superuser.apk", "/cache", "/data", "/dev"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String[] f21399u = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.noshufou.android.su", "eu.chainfire.supersu"};

    class a implements y9.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i0 f21400a = new i0();

        a() {
        }

        private void m(String str, h7 h7Var, i4 i4Var) {
            Timber.d("[Exception Logger] %s", str);
            if (i4Var != null) {
                f5.t(str, h7Var, i4Var);
            } else {
                f5.s(str, h7Var);
            }
        }

        @Override // y9.c
        public void a(String str) {
            Timber.d("[Exception Logger] removeTag: %s", str);
            f5.U(str);
        }

        @Override // y9.c
        public void b(io.sentry.f fVar) {
            Timber.d("[Exception Logger] addBreadcrumb: [%s] %s", fVar.w(), fVar.u());
            f5.e(fVar);
        }

        @Override // y9.c
        public void c(Integer num) {
            Timber.d("---> Sentry custom set userId: %s", num);
            if (num != null) {
                this.f21400a.l(num.toString());
                f5.X(this.f21400a);
            }
        }

        @Override // y9.c
        public void d(String str, i4 i4Var) {
            m(String.format("Error Message: %s", str), h7.ERROR, i4Var);
        }

        @Override // y9.c
        public void e(Throwable th2, String str) {
            Timber.d("[Exception Logger] onCaughtException: " + th2 + ";\ndetailMessage: " + str, new Object[0]);
            f5.k(th2);
        }

        @Override // y9.c
        public void f(String str, String str2) {
            Timber.d("[Exception Logger] addTag: %s - %s", str, str2);
            f5.W(str, str2);
        }

        @Override // y9.c
        public void g(Throwable th2, i4 i4Var) {
            Timber.d("[Exception Logger] onCaughtException: " + th2, new Object[0]);
            f5.n(th2, i4Var);
        }

        @Override // y9.c
        public void h(String str, i4 i4Var) {
            m(String.format("Warning Message: %s", str), h7.WARNING, i4Var);
        }

        @Override // y9.c
        public void i() {
            Timber.d("[Exception Logger] clearBreadcrumbs", new Object[0]);
            f5.u();
        }

        @Override // y9.c
        public void j(Throwable th2) {
            Timber.d("[Exception Logger] onCaughtException: " + th2, new Object[0]);
            f5.k(th2);
        }

        @Override // y9.c
        public void k(String str, String str2) {
            Timber.d("[Exception Logger] onCaughtIssue: " + str + "; label: " + str2, new Object[0]);
            f5.r(String.format("%s: %s - %s", "Caught Issue", str, str2));
        }

        @Override // y9.c
        public void l(String str) {
            Timber.d("[Exception Logger] onCaughtException: " + str, new Object[0]);
            f5.r(String.format("Error Message: %s", str));
        }

        @Override // y9.c
        public void o(String str) {
            Timber.d("[Exception Logger] addBreadcrumb: %s", str);
            f5.g(str);
        }

        @Override // y9.c
        public void r(String str, String str2) {
            Timber.d("[Exception Logger] addBreadcrumb: %s", str);
            f5.h(str, str2);
        }
    }

    class b implements zt.e {
        b() {
        }

        @Override // zt.e
        public i getContext() {
            return x0.a();
        }

        @Override // zt.e
        public void resumeWith(Object obj) {
        }
    }

    class c implements z7.a {
        c() {
        }

        @Override // io.sentry.z7.a
        public io.sentry.f a(io.sentry.f fVar, io.sentry.i0 i0Var) {
            if ("navigation".equals(fVar.q())) {
                fVar.C("from_arguments");
                fVar.C("to_arguments");
            }
            return fVar;
        }
    }

    class d implements d0 {
        d() {
        }

        @Override // io.sentry.d0
        public e0 k(e0 e0Var, io.sentry.i0 i0Var) {
            w8 w8VarJ = e0Var.C().j();
            if (w8VarJ != null && "navigation".equals(w8VarJ.f())) {
                e0Var.R("arguments");
            }
            return e0Var;
        }
    }

    class e extends Thread {
        e() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            new EventLoop().start();
        }
    }

    class f extends Timber.b {
        f() {
        }

        @Override // timber.log.Timber.b
        protected void l(int i10, String str, String str2, Throwable th2) {
        }
    }

    static {
        y9.a.f86838a.f(new a());
        A = true;
        B = new hg.b();
        C = new d2();
        D = false;
        E = new AtomicBoolean(false);
        System.loadLibrary("net");
    }

    private String B() {
        String str = f21390x;
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr.length != 0 ? strArr[0] : str;
    }

    public static Context F() {
        return f21392z;
    }

    private void G() {
        int i10;
        Integer numValueOf;
        String string = f21392z.getString(R.string.avo_env);
        String string2 = f21392z.getString(R.string.inspector_env);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        Avo.AvoEnv avoEnvValueOf = Avo.AvoEnv.valueOf(string);
        Avo.AppSource appSource = Avo.AppSource.GOOGLE_PLAY;
        Avo.SystemPlan systemPlanN = aVarY.N(aVarN.Z());
        String strB = B();
        int i11 = D().getInt("ANALYTICS_HOST_COUNT", 0);
        int i12 = D().getInt("ANALYTICS_SNIPPETS_COUNT", 0);
        int i13 = D().getInt("ANALYTICS_GROUPS_COUNT", 0);
        int i14 = D().getInt("ANALYTICS_SHARED_HOSTS_COUNT", 0);
        int i15 = D().getInt("ANALYTICS_SHARED_GROUPS_COUNT", 0);
        int i16 = D().getInt("ANALYTICS_SHARED_SNIPPETS_COUNT", 0);
        int i17 = D().getInt("ANALYTICS_SHARED_SNIPPET_PACKAGES_COUNT", 0);
        int i18 = D().getInt("ANALYTICS_PACKAGES_COUNT", 0);
        int i19 = D().getInt("ANALYTICS_SHARED_VAULTS_COUNT", 0);
        int i20 = D().getInt("ANALYTICS_PORT_FORWARDING_RULES_COUNT", 0);
        if (com.server.auditor.ssh.client.app.a.N().z0()) {
            i10 = i20;
            numValueOf = Integer.valueOf(D().getInt("ANALYTICS_ONLINE_USERS_COUNT", 1));
        } else {
            i10 = i20;
            numValueOf = null;
        }
        String strA = new up.b(new up.a(D())).a();
        Avo.S3(this, avoEnvValueOf, appSource, systemPlanN, "7.6.0", strB, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i18), Integer.valueOf(i17), Integer.valueOf(i19), Integer.valueOf(i10), numValueOf, Avo.Platform.ANDROID, strA, aVarY.O(), strA);
        Avo.IsHardwareKeyStorageAvailable isHardwareKeyStorageAvailable = Avo.IsHardwareKeyStorageAvailable.NO;
        if (D().getBoolean("is_hardware_key_storage_available", false)) {
            isHardwareKeyStorageAvailable = Avo.IsHardwareKeyStorageAvailable.YES;
        }
        aVarY.r0(Avo.FirstTime.YES, isHardwareKeyStorageAvailable);
        if (aVarN.q() != null) {
            aVarY.a0(aVarN.q().toString());
        }
    }

    private void H(Context context) {
        w2.g(context, new f5.a() { // from class: hg.k
            @Override // io.sentry.f5.a
            public final void a(z7 z7Var) {
                this.f53029a.W((SentryAndroidOptions) z7Var);
            }
        });
        f5.g(context.getString(R.string.sentry_breadcrumbs_app_started));
    }

    private void I() {
        com.server.auditor.ssh.client.billing.a.B.a(this, ProcessLifecycleOwner.l().getLifecycle());
    }

    private void J() {
        try {
            KeyStore keyStore = KeyStore.getInstance(f21391y);
            this.f21396d = keyStore;
            if (keyStore != null) {
                keyStore.load(null);
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            y9.a.f86838a.i(e10);
        }
        ug.d dVar = new ug.d();
        KeyStore keyStore2 = this.f21396d;
        hg.d dVarB = C.b();
        int i10 = Build.VERSION.SDK_INT;
        this.f21394b = dVar.a(keyStore2, dVarB, i10);
        this.f21393a = j.a(C.c());
        new l(this.f21396d, this.f21394b, this.f21393a).a();
        this.f21397e = new EncryptionKeyStorage(this.f21394b);
        this.f21395c = new vk.a().a(this.f21396d, C.a(), i10);
        new xg.e(this.f21396d, this.f21395c).a();
    }

    private void K() {
        new e().start();
    }

    private void L() {
        hg.f.p().v().h();
    }

    private void M() {
        y();
        try {
            zl.a.f88024a.o(new SshAgentStorage(r()));
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private void N() {
        Timber.h(new f());
    }

    private void O() {
        b2.f52944a.n1().a();
    }

    private void P() {
        new pp.e().e(new pp.d().a(), true, new b());
    }

    public static boolean Q() {
        return E.get();
    }

    public static boolean R() {
        return f21388v;
    }

    public static boolean S() {
        return A;
    }

    public static boolean T() {
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x6 V(x6 x6Var, io.sentry.i0 i0Var) {
        if (d0(x6Var) || c0(x6Var) || !i(x6Var.O())) {
            return null;
        }
        h(x6Var);
        List<s> listR0 = x6Var.r0();
        if (listR0 != null) {
            for (s sVar : listR0) {
                sVar.s(hg.c.f52980a.e(sVar.l(), sVar.k()));
            }
            x6Var.C0(listR0);
        }
        return x6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnvironment("production");
        sentryAndroidOptions.setDsn("https://bfe983dd373f479e882081ce0d891ab3@o76327.ingest.sentry.io/1875633");
        sentryAndroidOptions.setEnableAutoSessionTracking(true);
        sentryAndroidOptions.setBeforeBreadcrumb(new c());
        sentryAndroidOptions.addEventProcessor(new d());
        sentryAndroidOptions.setBeforeSend(new z7.c() { // from class: hg.l
            @Override // io.sentry.z7.c
            public final x6 a(x6 x6Var, io.sentry.i0 i0Var) {
                return this.f53030a.V(x6Var, i0Var);
            }
        });
    }

    private void X(Locale locale) {
        Configuration configuration = new Configuration(Resources.getSystem().getConfiguration());
        configuration.locale = locale;
        Resources.getSystem().updateConfiguration(configuration, null);
    }

    public static void Y(boolean z10) {
        f21388v = z10;
    }

    public static void Z(boolean z10) {
        A = z10;
    }

    public static void a0(boolean z10) {
        E.set(z10);
    }

    public static void b0(Context context) {
        if (f21392z == null) {
            f21392z = context;
        }
    }

    private boolean c0(x6 x6Var) {
        if (x6Var == null) {
            return false;
        }
        if (gw.a.d(x6Var.O(), SocketException.class) != -1) {
            return true;
        }
        List listR0 = x6Var.r0();
        if (listR0 == null) {
            return false;
        }
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            if ("SocketException".equals(((s) it.next()).k())) {
                return true;
            }
        }
        return false;
    }

    public static native void d();

    public static /* synthetic */ void d(int i10) {
    }

    private boolean d0(x6 x6Var) {
        if (x6Var == null) {
            return false;
        }
        if (gw.a.d(x6Var.O(), SocketTimeoutException.class) != -1) {
            return true;
        }
        List listR0 = x6Var.r0();
        if (listR0 == null) {
            return false;
        }
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            if ("SocketTimeoutException".equals(((s) it.next()).k())) {
                return true;
            }
        }
        return false;
    }

    public static void e() {
        if (T()) {
            d();
            t();
            s();
        }
    }

    private void f() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        if (Build.VERSION.SDK_INT >= 29) {
            aVarN.I0(2);
        }
        c1.d(aVarN.F());
    }

    private void g() {
        q lifecycle = ProcessLifecycleOwner.l().getLifecycle();
        wn.l.a(lifecycle);
        wn.f.a(lifecycle);
    }

    private void h(x6 x6Var) {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        x6Var.e0("user.is_logined", String.valueOf(aVarN.r0()));
        x6Var.e0("user.plan_type", aVarN.Z());
        x6Var.e0("user.is_pro_mode_active", String.valueOf(aVarN.u0()));
        x6Var.e0("user.has_team", String.valueOf(aVarN.m()));
    }

    private boolean i(Throwable th2) {
        return true;
    }

    private boolean j(String str) {
        for (String str2 : this.f21398f) {
            if (new File(str2, str).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean k() {
        return j("busybox");
    }

    private boolean l() {
        return j("su");
    }

    private void m() {
        new ri.e(androidx.biometric.e.g(f21392z), this.f21396d, com.server.auditor.ssh.client.app.a.N().M(), x0.b(), y9.a.f86838a).f();
    }

    private boolean n() {
        PackageManager packageManager = f21392z.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f21399u) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    private boolean o() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system /xbin/which", "su"});
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            processExec.destroy();
            return line != null;
        } catch (Exception unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    private void p() {
        LocalCacheFileWriterOpener.Companion.clearPreviewFiles(f21392z);
    }

    private void q() {
        File[] fileArrListFiles;
        try {
            File file = new File(F().getFilesDir(), "share");
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        } catch (SecurityException e10) {
            y9.a.f86838a.i(e10);
        }
    }

    public static SshAgentStorageObserver r() {
        return new SshAgentStorageObserver() { // from class: hg.i
            @Override // com.crystalnix.termius.libtermius.SshAgentStorageObserver
            public final void onStateChanged(int i10) {
                TermiusApplication.d(i10);
            }
        };
    }

    public static native void s();

    public static native void t();

    public static void u() {
        D = true;
    }

    private boolean v() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private void w() {
        new mk.j(com.server.auditor.ssh.client.app.a.N().M()).a();
    }

    private void y() {
        zl.a aVar = zl.a.f88024a;
        if (aVar.k() != null) {
            aVar.k().dispose();
            aVar.o(null);
        }
    }

    ug.c A() {
        return this.f21395c;
    }

    EncryptionKeyStorage C() {
        return this.f21397e;
    }

    hg.d D() {
        return this.f21393a;
    }

    ug.c E() {
        return this.f21394b;
    }

    public boolean U() {
        return v() || o() || l() || k() || n();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        N();
    }

    @Override // android.app.Application
    public void onCreate() {
        io.sentry.android.core.performance.j.s(this);
        D = U();
        if (T()) {
            s();
        }
        f21392z = getApplicationContext();
        super.onCreate();
        H(this);
        i1.a();
        aa.a.b(this);
        if (T()) {
            d();
        }
        q();
        p();
        K();
        J();
        f();
        L();
        m();
        O();
        G();
        registerActivityLifecycleCallbacks(new hg.a());
        if (com.server.auditor.ssh.client.app.a.N().q() != null) {
            y9.a.f86838a.q(com.server.auditor.ssh.client.app.a.N().q());
        }
        X(Locale.ENGLISH);
        ya.c.a(this);
        hg.b bVar = B;
        synchronized (bVar) {
            try {
                bVar.c(true);
                if (bVar.a() > 0) {
                    bVar.b(com.server.auditor.ssh.client.utils.analytics.a.y());
                }
            } catch (Throwable th2) {
                io.sentry.android.core.performance.j.t(this);
                throw th2;
            }
        }
        hg.f.a();
        new DataLoadingHelper().startLoading();
        if (T()) {
            t();
        }
        if (com.server.auditor.ssh.client.app.a.N().Q().d("6170695F617574686F72697A6174696F6E", new byte[0]).length == 0 && com.server.auditor.ssh.client.app.a.N().Q().d("6170695F6465766963655F746F6B656E", new byte[0]).length == 0) {
            com.server.auditor.ssh.client.app.a.N().Q().g("6170695F6465766963655F746F6B656E", UUID.randomUUID().toString().getBytes(su.d.f78241b));
        } else if (com.server.auditor.ssh.client.app.a.N().Q().d("6170695F617574686F72697A6174696F6E", new byte[0]).length != 0 && com.server.auditor.ssh.client.app.a.N().Q().d("6170695F6465766963655F746F6B656E", new byte[0]).length == 0) {
            com.server.auditor.ssh.client.app.a.N().Q().g("6170695F6465766963655F746F6B656E", Settings.Secure.getString(getContentResolver(), "android_id").getBytes(su.d.f78241b));
        }
        I();
        P();
        g();
        new b1(com.server.auditor.ssh.client.app.a.N().M(), com.server.auditor.ssh.client.utils.analytics.a.y(), new iu.a() { // from class: hg.j
            @Override // iu.a
            public final Object a() {
                return Boolean.valueOf(com.server.auditor.ssh.client.app.a.N().B0());
            }
        }).a();
        w();
        M();
        io.sentry.android.core.performance.j.t(this);
    }

    public void x() {
        b2.f52944a.T0().t();
    }

    public KeyStore z() {
        return this.f21396d;
    }
}
