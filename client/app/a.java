package com.server.auditor.ssh.client.app;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.biometric.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.encryption.EncryptionKeyStorage;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import hg.c2;
import hg.d;
import javax.crypto.SecretKey;
import og.i;
import ow.e;
import rg.k;
import tp.c1;
import ug.c;
import xg.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c2 {
    private static a A;
    private static final byte[] B = {66, 82, -101, 61, 55, -67, 96, 41};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ApiKey f21413h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f21416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f21417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f21418m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SecretKey f21424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SecretKey f21425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SecretKey f21426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f21427v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21406a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kg.a f21407b = new kg.a(Q(), y9.a.f86838a, i.f67880a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f21408c = new k0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k0 f21409d = new k0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k0 f21410e = new k0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f21411f = new k0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k0 f21412g = new k0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f21414i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f21415j = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f21419n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f21420o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte[] f21421p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte[] f21422q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private byte[] f21423r = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f21428w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21429x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21430y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f.c f21431z = null;

    private a() {
        boolean z10 = false;
        d dVarD = ((TermiusApplication) TermiusApplication.F()).D();
        boolean z11 = dVarD.getBoolean("key_is_pro_mode_inactive", true);
        boolean z12 = !z11;
        boolean z13 = ((TermiusApplication) TermiusApplication.F()).C().c(EncryptionKeyStorage.KeyTypes.ENCRIPTION).length == 0;
        if (z11 || !z13) {
            z10 = z12;
        } else {
            dVarD.edit().putBoolean("unauthorized_request", true).apply();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f21409d.p(Boolean.valueOf(z10));
        } else {
            this.f21409d.n(Boolean.valueOf(z10));
        }
    }

    public static synchronized a N() {
        try {
            if (A == null) {
                A = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return A;
    }

    public static /* synthetic */ void a() {
    }

    public c A() {
        return ((TermiusApplication) TermiusApplication.F()).A();
    }

    public boolean A0() {
        return "v5".equals(N().M().getString("team_data_encryption_schema", "v3"));
    }

    public String B() {
        ApiKey apiKey = this.f21413h;
        if (apiKey == null) {
            this.f21413h = b.f85766a.a(N().Q());
            return null;
        }
        if (apiKey.getHmacSalt() == null) {
            this.f21413h = b.f85766a.a(N().Q());
        }
        ApiKey apiKey2 = this.f21413h;
        return apiKey2 != null ? apiKey2.getHmacSalt() : "";
    }

    public boolean B0() {
        return N().M().getBoolean("unauthorized_request", false);
    }

    public String C() {
        ApiKey apiKey = this.f21413h;
        if (apiKey == null) {
            this.f21413h = b.f85766a.a(N().Q());
            return null;
        }
        if (apiKey.getSalt() == null) {
            this.f21413h = b.f85766a.a(N().Q());
        }
        ApiKey apiKey2 = this.f21413h;
        return apiKey2 != null ? apiKey2.getSalt() : "";
    }

    public a C0(boolean z10) {
        this.f21410e.n(Boolean.valueOf(z10));
        return this;
    }

    public k0 D() {
        return this.f21408c;
    }

    public void D0() {
        M().edit().remove("TermiusStorage.IsTrialActive").remove("TermiusStorage.GotTrial").remove("TermiusStorage.TrialCreatedAt").remove("TermiusStorage.TrialValidUntil").apply();
    }

    public f.c E() {
        return this.f21431z;
    }

    public void E0() {
        this.f21430y = false;
    }

    public int F() {
        return M().getInt("sharedPreferencesTheme", 0);
    }

    public void F0() {
        this.f21407b.f();
    }

    public String G() {
        String strConcat = Build.BRAND.concat(" ").concat(Build.MODEL);
        return strConcat.substring(0, 1).toUpperCase() + strConcat.substring(1);
    }

    public a G0(ApiKey apiKey) {
        this.f21413h = apiKey;
        return this;
    }

    public SecretKey H() {
        EncryptionKeyStorage encryptionKeyStorageI = I();
        if (this.f21426u == null) {
            this.f21426u = new k().b(encryptionKeyStorageI.c(EncryptionKeyStorage.KeyTypes.LOCAL));
        }
        SecretKey secretKey = this.f21426u;
        if (secretKey != null) {
            return secretKey;
        }
        EncryptionKeyStorage.KeyTypes keyTypes = EncryptionKeyStorage.KeyTypes.LOCAL;
        if (encryptionKeyStorageI.a(keyTypes)) {
            y9.a.f86838a.i(new e());
        }
        k kVar = new k();
        kVar.c(new vg.a(keyTypes, encryptionKeyStorageI, new tg.b() { // from class: hg.e2
            @Override // tg.b
            public final void a() {
                com.server.auditor.ssh.client.app.a.a();
            }
        }));
        return kVar.a();
    }

    public void H0(f.c cVar) {
        this.f21431z = cVar;
    }

    public EncryptionKeyStorage I() {
        return ((TermiusApplication) TermiusApplication.F()).C();
    }

    public void I0(int i10) {
        M().edit().putInt("sharedPreferencesTheme", i10).apply();
        c1.d(i10);
    }

    public SecretKey J() {
        if (this.f21424s == null) {
            this.f21424s = new k().b(I().c(EncryptionKeyStorage.KeyTypes.ENCRIPTION));
        }
        return this.f21424s;
    }

    public void J0(String str) {
        str.getClass();
        int i10 = 0;
        if (str.equals("Dark")) {
            i10 = 1;
        } else {
            str.equals("Light");
        }
        I0(i10);
    }

    public SecretKey K() {
        if (this.f21425t == null) {
            this.f21425t = new k().b(I().c(EncryptionKeyStorage.KeyTypes.HMAC));
        }
        return this.f21425t;
    }

    public a K0(boolean z10) {
        this.f21427v = z10;
        return this;
    }

    public int L() {
        return M().getInt("sharedPreferencesHistoryItemsCount", 0);
    }

    public a L0(SecretKey secretKey) {
        this.f21426u = secretKey;
        return this;
    }

    public d M() {
        return ((TermiusApplication) TermiusApplication.F()).D();
    }

    public void M0(int i10) {
        M().edit().putInt("sharedPreferencesHistoryItemsCount", i10).apply();
    }

    public void N0(boolean z10) {
        M().edit().putBoolean("isEnterpriseSSO", z10).apply();
    }

    public k0 O() {
        return this.f21409d;
    }

    public void O0(boolean z10) {
        M().edit().putBoolean("isSSO", z10).apply();
    }

    public k0 P() {
        return this.f21411f;
    }

    public void P0(boolean z10) {
        this.f21406a = z10;
    }

    public c Q() {
        return ((TermiusApplication) TermiusApplication.F()).E();
    }

    public a Q0(boolean z10) {
        this.f21410e.p(Boolean.valueOf(z10));
        return this;
    }

    public byte[] R() {
        return B;
    }

    public void R0(boolean z10) {
        M().edit().putBoolean("isNeedShowQuickImportDailyTip", z10).apply();
    }

    public int S() {
        return M().getInt("team_id", -1);
    }

    public void S0() {
        this.f21430y = true;
    }

    public f0 T() {
        return this.f21410e;
    }

    public void T0(String str) {
        M().edit().putString("key_personal_subscription_provider", str).apply();
    }

    public k0 U() {
        return this.f21412g;
    }

    public void U0(String str) {
        M().edit().putString("key_personal_subscription_status", str).apply();
    }

    public byte[] V() {
        if (this.f21418m == null) {
            byte[] bArrD = Q().d("7465616D5F6F776E65725F7075626C69635F6B6579", new byte[0]);
            if (bArrD.length > 0) {
                this.f21418m = bArrD;
            }
        }
        return this.f21418m;
    }

    public void V0(String str) {
        M().edit().putString("key_team_trial_created_at", str).apply();
    }

    public String W() {
        try {
            return M().getString("key_personal_subscription_provider", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public void W0(String str) {
        M().edit().putString("key_team_trial_valid_until", str).apply();
    }

    public String X() {
        try {
            return M().getString("key_personal_subscription_status", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public void X0(String str) {
        String string = M().getString("key_current_plan_type", "");
        if (TextUtils.equals(string, "")) {
            M().edit().putString("key_current_plan_type", str).apply();
        } else if (!TextUtils.equals(string, str)) {
            M().edit().putString("key_current_plan_type", str).apply();
            com.server.auditor.ssh.client.utils.analytics.a.y().b0();
        }
        this.f21428w = str;
    }

    public String Y() {
        try {
            return M().getString("key_team_trial_valid_until", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public a Y0(boolean z10) {
        M().edit().putBoolean("key_is_pro_mode_inactive", !z10).apply();
        this.f21409d.n(Boolean.valueOf(z10));
        return this;
    }

    public String Z() {
        String string = M().getString("key_current_plan_type", WelcomeFlowViewModel.planTypeFree);
        this.f21428w = string;
        return string;
    }

    public void Z0() {
        this.f21429x = true;
    }

    public byte[] a0() {
        if (this.f21423r == null) {
            byte[] bArrD = Q().d("7465616D5F696E666F5F6E616D65", new byte[0]);
            if (bArrD.length > 0) {
                this.f21423r = bArrD;
            }
        }
        return this.f21423r;
    }

    public void a1(String str) {
        M().edit().putString("key_team_subscription_provider", str).apply();
    }

    public void b() {
        M().edit().putInt("sharedPreferencesHistoryItemsCount", M().getInt("sharedPreferencesHistoryItemsCount", 0) + 1).apply();
    }

    public byte[] b0() {
        if (this.f21420o == null) {
            byte[] bArrD = Q().d("7465616D5F696E666F5F6F776E6572", new byte[0]);
            if (bArrD.length > 0) {
                this.f21420o = bArrD;
            }
        }
        return this.f21420o;
    }

    public void b1(String str) {
        M().edit().putString("key_team_subscription_status", str).apply();
    }

    @Override // hg.c2
    public void c(Integer num) {
        this.f21419n = num;
        if (num == null) {
            N().M().edit().remove("user_profile_user_id").apply();
        } else {
            N().M().edit().putInt("user_profile_user_id", num.intValue()).apply();
        }
    }

    public byte[] c0() {
        if (this.f21421p == null) {
            byte[] bArrD = Q().d("7465616D5F696E666F5F6F776E65725F66756C6C5F6E616D65", new byte[0]);
            if (bArrD.length > 0) {
                this.f21421p = bArrD;
            }
        }
        return this.f21421p;
    }

    public void c1(String str) {
        M().edit().putString("key_team_subscription_valid_from", str).apply();
    }

    @Override // hg.c2
    public c2 d(byte[] bArr) {
        this.f21422q = bArr;
        if (bArr != null) {
            Q().g("7465616D5F696E666F5F6F776E65725F6C61746573745F6163746976697479", bArr);
            return this;
        }
        Q().f("7465616D5F696E666F5F6F776E65725F6C61746573745F6163746976697479");
        return this;
    }

    public byte[] d0() {
        if (this.f21422q == null) {
            byte[] bArrD = Q().d("7465616D5F696E666F5F6F776E65725F6C61746573745F6163746976697479", new byte[0]);
            if (bArrD.length > 0) {
                this.f21422q = bArrD;
            }
        }
        return this.f21422q;
    }

    public void d1(String str) {
        M().edit().putString("key_team_subscription_valid_until", str).apply();
    }

    @Override // hg.c2
    public c2 e(byte[] bArr) {
        this.f21421p = bArr;
        if (bArr != null) {
            Q().g("7465616D5F696E666F5F6F776E65725F66756C6C5F6E616D65", bArr);
            return this;
        }
        Q().f("7465616D5F696E666F5F6F776E65725F66756C6C5F6E616D65");
        return this;
    }

    public String e0() {
        try {
            return M().getString("key_team_subscription_provider", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    @Override // hg.c2
    public byte[] f() {
        if (this.f21416k == null) {
            byte[] bArrD = Q().d("706572736F6E616C5F707269766174655F6B6579", new byte[0]);
            if (bArrD.length > 0) {
                this.f21416k = bArrD;
            }
        }
        return this.f21416k;
    }

    public String f0() {
        try {
            return M().getString("key_team_subscription_status", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    @Override // hg.c2
    public byte[] g() {
        if (this.f21415j == null) {
            byte[] bArrD = Q().d("706572736F6E616C5F72656D6F74655F656E6372797074696F6E5F6B6579", new byte[0]);
            if (bArrD.length > 0) {
                this.f21415j = bArrD;
            }
        }
        return this.f21415j;
    }

    public String g0() {
        try {
            return M().getString("key_team_subscription_valid_until", "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    @Override // hg.c2
    public ApiKey getApiKey() {
        return this.f21413h;
    }

    @Override // hg.c2
    public c2 h(String str) {
        if (str != null) {
            Q().g("706572736F6E616C5F7075626C69635F6B65795F656E63727970746564", str.getBytes(su.d.f78241b));
            return this;
        }
        Q().f("706572736F6E616C5F7075626C69635F6B65795F656E63727970746564");
        return this;
    }

    public boolean h0() {
        return M().getBoolean("has_edit_shared_entities_permission", false);
    }

    @Override // hg.c2
    public c2 i(byte[] bArr) {
        this.f21417l = bArr;
        if (bArr != null) {
            Q().g("706572736F6E616C5F7075626C69635F6B6579", bArr);
            return this;
        }
        Q().f("706572736F6E616C5F7075626C69635F6B6579");
        return this;
    }

    public boolean i0() {
        return M().getBoolean("key_account_has_team_key", false);
    }

    @Override // hg.c2
    public boolean j() {
        return M().getBoolean("key_is_team_owner", false);
    }

    public void j0() {
        G0(b.f85766a.a(Q()));
        this.f21416k = f();
        this.f21417l = u();
        this.f21415j = g();
        this.f21420o = b0();
        this.f21421p = c0();
        this.f21422q = d0();
        this.f21423r = a0();
        this.f21418m = V();
        if (N().M().contains("user_profile_user_id")) {
            this.f21419n = q();
        }
    }

    @Override // hg.c2
    public c2 k(byte[] bArr) {
        this.f21416k = bArr;
        if (bArr != null) {
            Q().g("706572736F6E616C5F707269766174655F6B6579", bArr);
            return this;
        }
        Q().f("706572736F6E616C5F707269766174655F6B6579");
        return this;
    }

    public boolean k0() {
        return false;
    }

    @Override // hg.c2
    public String l() {
        return new String(Q().d("706572736F6E616C5F7075626C69635F6B65795F656E63727970746564", new byte[0]), su.d.f78241b);
    }

    public boolean l0() {
        return this.f21427v;
    }

    @Override // hg.c2
    public boolean m() {
        return M().getBoolean("key_account_has_team", false);
    }

    public boolean m0() {
        ApiKey apiKey = this.f21413h;
        return apiKey == null || TextUtils.isEmpty(apiKey.getToken()) || TextUtils.isEmpty(this.f21413h.getUsername());
    }

    @Override // hg.c2
    public c2 n(byte[] bArr) {
        this.f21423r = bArr;
        if (bArr != null) {
            Q().g("7465616D5F696E666F5F6E616D65", bArr);
            return this;
        }
        Q().f("7465616D5F696E666F5F6E616D65");
        return this;
    }

    public boolean n0() {
        return M().getBoolean("isEnterpriseSSO", false);
    }

    @Override // hg.c2
    public c2 o(SecretKey secretKey) {
        this.f21425t = secretKey;
        if (secretKey != null) {
            I().e(EncryptionKeyStorage.KeyTypes.HMAC, secretKey);
            return this;
        }
        I().d(EncryptionKeyStorage.KeyTypes.HMAC);
        return this;
    }

    public boolean o0() {
        return (!r0() || getApiKey() == null || u0()) ? false : true;
    }

    @Override // hg.c2
    public c2 p(byte[] bArr) {
        this.f21414i = bArr;
        if (bArr != null) {
            Q().g("7465616D5F72656D6F74655F656E6372797074696F6E5F6B6579", bArr);
            return this;
        }
        Q().f("7465616D5F72656D6F74655F656E6372797074696F6E5F6B6579");
        return this;
    }

    public boolean p0() {
        return "v5".equals(N().M().getString("feature_toggle_encryption_schema", "v3"));
    }

    @Override // hg.c2
    public Integer q() {
        if (this.f21419n == null) {
            int i10 = N().M().getInt("user_profile_user_id", -1);
            if (i10 == -1) {
                this.f21419n = null;
            } else {
                this.f21419n = Integer.valueOf(i10);
            }
        }
        return this.f21419n;
    }

    public boolean q0() {
        return this.f21406a;
    }

    @Override // hg.c2
    public SecretKey r() {
        return this.f21425t;
    }

    public boolean r0() {
        return this.f21410e.f() != null && ((Boolean) this.f21410e.f()).booleanValue();
    }

    @Override // hg.c2
    public SecretKey s() {
        return this.f21424s;
    }

    public boolean s0() {
        return M().getBoolean("isNeedShowQuickImportDailyTip", true);
    }

    @Override // hg.c2
    public c2 t(byte[] bArr) {
        this.f21415j = bArr;
        if (bArr != null) {
            Q().g("706572736F6E616C5F72656D6F74655F656E6372797074696F6E5F6B6579", bArr);
            return this;
        }
        Q().f("706572736F6E616C5F72656D6F74655F656E6372797074696F6E5F6B6579");
        return this;
    }

    public boolean t0() {
        return this.f21430y;
    }

    @Override // hg.c2
    public byte[] u() {
        if (this.f21417l == null) {
            byte[] bArrD = Q().d("706572736F6E616C5F7075626C69635F6B6579", new byte[0]);
            if (bArrD.length > 0) {
                this.f21417l = bArrD;
            }
        }
        return this.f21417l;
    }

    public boolean u0() {
        return this.f21409d.f() != null && ((Boolean) this.f21409d.f()).booleanValue();
    }

    @Override // hg.c2
    public c2 v(boolean z10) {
        if (z10) {
            N().M().edit().putBoolean("unauthorized_request", true).apply();
            return this;
        }
        N().M().edit().remove("unauthorized_request").apply();
        return this;
    }

    public boolean v0() {
        return this.f21429x;
    }

    @Override // hg.c2
    public c2 w(byte[] bArr) {
        this.f21418m = bArr;
        if (bArr != null) {
            Q().g("7465616D5F6F776E65725F7075626C69635F6B6579", bArr);
            return this;
        }
        Q().f("7465616D5F6F776E65725F7075626C69635F6B6579");
        return this;
    }

    public boolean w0() {
        return this.f21407b.d();
    }

    @Override // hg.c2
    public c2 x(byte[] bArr) {
        this.f21420o = bArr;
        if (bArr != null) {
            Q().g("7465616D5F696E666F5F6F776E6572", bArr);
            return this;
        }
        Q().f("7465616D5F696E666F5F6F776E6572");
        return this;
    }

    public boolean x0() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) TermiusApplication.F().getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // hg.c2
    public c2 y(SecretKey secretKey) {
        this.f21424s = secretKey;
        if (secretKey != null) {
            I().e(EncryptionKeyStorage.KeyTypes.ENCRIPTION, secretKey);
            return this;
        }
        I().d(EncryptionKeyStorage.KeyTypes.ENCRIPTION);
        return this;
    }

    public boolean y0() {
        if (!j() && M().getBoolean("key_is_team_require_two_factor_auth", false)) {
            return !M().getBoolean("key_account_has_two_factor_auth", false);
        }
        return false;
    }

    public boolean z() {
        return j() || h0();
    }

    public boolean z0() {
        return u0() && m();
    }
}
