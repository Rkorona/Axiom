package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import tl.r1;
import tl.t1;
import ut.m0;
import ut.s;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f38838d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38839e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.e f38842c;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR REPLACE INTO `team_devices` (`id`,`mobile_type`,`name`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, r1 r1Var) {
            t.f(dVar, "statement");
            t.f(r1Var, "entity");
            dVar.B(1, r1Var.b());
            dVar.i0(2, h.this.g(r1Var.a()));
            dVar.i0(3, r1Var.c());
        }
    }

    public static final class b extends androidx.room.e {
        b() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `team_devices` SET `id` = ?,`mobile_type` = ?,`name` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, r1 r1Var) {
            t.f(dVar, "statement");
            t.f(r1Var, "entity");
            dVar.B(1, r1Var.b());
            dVar.i0(2, h.this.g(r1Var.a()));
            dVar.i0(3, r1Var.c());
            dVar.B(4, r1Var.b());
        }
    }

    public static final class c {
        public /* synthetic */ c(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private c() {
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38845a;

        static {
            int[] iArr = new int[UserDeviceType.values().length];
            try {
                iArr[UserDeviceType.IPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserDeviceType.GOOGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserDeviceType.CHROME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserDeviceType.DESKTOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserDeviceType.AMAZON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserDeviceType.ACCOUNT_MANAGEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UserDeviceType.FIDO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UserDeviceType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f38845a = iArr;
        }
    }

    public h(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38840a = d0Var;
        this.f38841b = new a();
        this.f38842c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(UserDeviceType userDeviceType) {
        switch (d.f38845a[userDeviceType.ordinal()]) {
            case 1:
                return "IPHONE";
            case 2:
                return "GOOGLE";
            case 3:
                return "CHROME";
            case 4:
                return "DESKTOP";
            case 5:
                return "AMAZON";
            case 6:
                return "ACCOUNT_MANAGEMENT";
            case 7:
                return "FIDO";
            case 8:
                return "UNKNOWN";
            default:
                throw new s();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final UserDeviceType h(String str) {
        switch (str.hashCode()) {
            case -2128934235:
                if (str.equals("IPHONE")) {
                    return UserDeviceType.IPHONE;
                }
                break;
            case -2019877892:
                if (str.equals("DESKTOP")) {
                    return UserDeviceType.DESKTOP;
                }
                break;
            case -323270219:
                if (str.equals("ACCOUNT_MANAGEMENT")) {
                    return UserDeviceType.ACCOUNT_MANAGEMENT;
                }
                break;
            case 2157710:
                if (str.equals("FIDO")) {
                    return UserDeviceType.FIDO;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return UserDeviceType.UNKNOWN;
                }
                break;
            case 1934031364:
                if (str.equals("AMAZON")) {
                    return UserDeviceType.AMAZON;
                }
                break;
            case 1987167866:
                if (str.equals("CHROME")) {
                    return UserDeviceType.CHROME;
                }
                break;
            case 2108052025:
                if (str.equals("GOOGLE")) {
                    return UserDeviceType.GOOGLE;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 j(String str, long j10, h hVar, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            return dVarH2.C2() ? new r1(dVarH2.getLong(l.d(dVarH2, "id")), hVar.h(dVarH2.c2(l.d(dVarH2, "mobile_type"))), dVarH2.c2(l.d(dVarH2, Column.MULTI_KEY_NAME))) : null;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(h hVar, List list, p6.b bVar) {
        t.f(bVar, "_connection");
        return hVar.f38841b.f(bVar, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 l(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    @Override // tl.t1
    public Object a(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM team_devices WHERE id = ?";
        return l6.b.f(this.f38840a, true, false, new iu.l() { // from class: tl.v1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.h.j(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.t1
    public Object b(zt.e eVar) {
        final String str = "DELETE FROM team_devices";
        Object objF = l6.b.f(this.f38840a, false, true, new iu.l() { // from class: tl.u1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.h.l(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.t1
    public Object c(final List list, zt.e eVar) {
        return l6.b.f(this.f38840a, false, true, new iu.l() { // from class: tl.w1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.h.k(this.f79881a, list, (p6.b) obj);
            }
        }, eVar);
    }
}
