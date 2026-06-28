package com.server.auditor.ssh.client.hostinfo;

import com.server.auditor.ssh.client.R;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HostIconUtil {
    public static final oi.b A;
    public static final oi.b B;
    public static final oi.b C;
    private static final Map D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oi.b f27140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oi.b f27141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oi.b f27142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oi.b f27143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final oi.b f27144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final oi.b f27145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final oi.b f27146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final oi.b f27147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final oi.b f27148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final oi.b f27149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final oi.b f27150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final oi.b f27151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final oi.b f27152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oi.b f27153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final oi.b f27154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final oi.b f27155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final oi.b f27156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final oi.b f27157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final oi.b f27158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final oi.b f27159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final oi.b f27160u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final oi.b f27161v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final oi.b f27162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final oi.b f27163x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final oi.b f27164y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final oi.b f27165z;

    public enum OsModelType {
        raspbian,
        centos,
        osx,
        ubuntu,
        openbsd,
        netbsd,
        freebsd,
        suse,
        redhat,
        fedora,
        mageia,
        arch,
        gentoo,
        debian,
        linux,
        none,
        android,
        routeros,
        kde,
        gloria_ops_agent,
        windows,
        group,
        alma,
        rocky,
        amazon,
        alpine
    }

    @Deprecated
    public enum SupportedOS {
        MacOS(OsModelType.osx),
        Ubuntu(OsModelType.ubuntu),
        RedHat(OsModelType.redhat),
        CentOS(OsModelType.centos),
        Fedora(OsModelType.fedora),
        Debian(OsModelType.debian),
        Gentoo(OsModelType.gentoo),
        Mageia(OsModelType.mageia),
        ArchLinux(OsModelType.arch),
        FreeBSD(OsModelType.freebsd),
        NetBSD(OsModelType.netbsd),
        OpenBSD(OsModelType.openbsd),
        Suse(OsModelType.suse),
        Raspbian(OsModelType.raspbian),
        LinuxOS(OsModelType.linux),
        DefaultOS(OsModelType.none),
        Local(OsModelType.android),
        RouterOS(OsModelType.routeros),
        KDE(OsModelType.kde),
        Gloria(OsModelType.gloria_ops_agent),
        Windows(OsModelType.windows),
        Alma(OsModelType.alma),
        Rocky(OsModelType.rocky),
        Amazon(OsModelType.amazon),
        Alpine(OsModelType.alpine);

        private final OsModelType mOsModelType;

        SupportedOS(OsModelType osModelType) {
            this.mOsModelType = osModelType;
        }

        public OsModelType getOsModelType() {
            return this.mOsModelType;
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27167a;

        static {
            int[] iArr = new int[n9.a.values().length];
            f27167a = iArr;
            try {
                iArr[n9.a.Raspbian.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27167a[n9.a.Centos.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27167a[n9.a.OSX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27167a[n9.a.Ubuntu.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27167a[n9.a.Openbsd.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27167a[n9.a.Netbsd.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27167a[n9.a.Freebsd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27167a[n9.a.Suse.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27167a[n9.a.Redhat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27167a[n9.a.Fedora.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27167a[n9.a.Mageia.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27167a[n9.a.Arch.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27167a[n9.a.Gentoo.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27167a[n9.a.Debian.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27167a[n9.a.Linux.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f27167a[n9.a.Android.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f27167a[n9.a.RouterOS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f27167a[n9.a.KDE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f27167a[n9.a.Gloria.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f27167a[n9.a.Windows.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f27167a[n9.a.Alma.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f27167a[n9.a.Alpine.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f27167a[n9.a.Amazon.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f27167a[n9.a.Rocky.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    static {
        oi.b bVar = new oi.b(R.drawable.ic_host_oval_active);
        f27140a = bVar;
        oi.b bVar2 = new oi.b(R.drawable.ic_circled_freebsd_active);
        f27141b = bVar2;
        oi.b bVar3 = new oi.b(R.drawable.ic_circled_netbsd_active);
        f27142c = bVar3;
        oi.b bVar4 = new oi.b(R.drawable.ic_circled_openbsd_active);
        f27143d = bVar4;
        oi.b bVar5 = new oi.b(R.drawable.ic_circled_linux_active);
        f27144e = bVar5;
        oi.b bVar6 = new oi.b(R.drawable.ic_circled_macosx_active);
        f27145f = bVar6;
        oi.b bVar7 = new oi.b(R.drawable.ic_circled_arch_active);
        f27146g = bVar7;
        oi.b bVar8 = new oi.b(R.drawable.ic_circled_ubuntu_active);
        f27147h = bVar8;
        oi.b bVar9 = new oi.b(R.drawable.ic_circled_centos_active);
        f27148i = bVar9;
        oi.b bVar10 = new oi.b(R.drawable.ic_circled_fedora_active);
        f27149j = bVar10;
        oi.b bVar11 = new oi.b(R.drawable.ic_circled_debian_active);
        f27150k = bVar11;
        oi.b bVar12 = new oi.b(R.drawable.ic_circled_gentoo_active);
        f27151l = bVar12;
        oi.b bVar13 = new oi.b(R.drawable.ic_circled_mageia_active);
        f27152m = bVar13;
        oi.b bVar14 = new oi.b(R.drawable.ic_circled_redhat_active);
        f27153n = bVar14;
        oi.b bVar15 = new oi.b(R.drawable.ic_circled_raspbian_active);
        f27154o = bVar15;
        oi.b bVar16 = new oi.b(R.drawable.ic_circled_suse_active);
        f27155p = bVar16;
        oi.b bVar17 = new oi.b(R.drawable.ic_new_circled_android_active);
        f27156q = bVar17;
        f27157r = new oi.b(R.drawable.ic_serial_connection);
        f27158s = new oi.b(R.drawable.ic_quick_connection);
        oi.b bVar18 = new oi.b(R.drawable.ic_circled_routeros_active);
        f27159t = bVar18;
        oi.b bVar19 = new oi.b(R.drawable.ic_circled_kde_neon_active);
        f27160u = bVar19;
        oi.b bVar20 = new oi.b(R.drawable.ic_circled_gloria_ops_agent_active);
        f27161v = bVar20;
        oi.b bVar21 = new oi.b(R.drawable.ic_circled_windows_os_active);
        f27162w = bVar21;
        oi.b bVar22 = new oi.b(R.drawable.ic_circled_alma_active);
        f27163x = bVar22;
        oi.b bVar23 = new oi.b(R.drawable.ic_circled_alpine_active);
        f27164y = bVar23;
        oi.b bVar24 = new oi.b(R.drawable.ic_circled_amazon_active);
        f27165z = bVar24;
        oi.b bVar25 = new oi.b(R.drawable.ic_circled_rocky_active);
        A = bVar25;
        B = new oi.b(R.drawable.ic_group_circle_active);
        C = new oi.b(R.drawable.ic_history_circle);
        EnumMap enumMap = new EnumMap(OsModelType.class);
        D = enumMap;
        enumMap.put(OsModelType.osx, bVar6);
        enumMap.put(OsModelType.freebsd, bVar2);
        enumMap.put(OsModelType.netbsd, bVar3);
        enumMap.put(OsModelType.openbsd, bVar4);
        enumMap.put(OsModelType.linux, bVar5);
        enumMap.put(OsModelType.none, bVar);
        enumMap.put(OsModelType.ubuntu, bVar8);
        enumMap.put(OsModelType.centos, bVar9);
        enumMap.put(OsModelType.redhat, bVar14);
        enumMap.put(OsModelType.fedora, bVar10);
        enumMap.put(OsModelType.debian, bVar11);
        enumMap.put(OsModelType.gentoo, bVar12);
        enumMap.put(OsModelType.mageia, bVar13);
        enumMap.put(OsModelType.raspbian, bVar15);
        enumMap.put(OsModelType.arch, bVar7);
        enumMap.put(OsModelType.suse, bVar16);
        enumMap.put(OsModelType.android, bVar17);
        enumMap.put(OsModelType.routeros, bVar18);
        enumMap.put(OsModelType.kde, bVar19);
        enumMap.put(OsModelType.gloria_ops_agent, bVar20);
        enumMap.put(OsModelType.windows, bVar21);
        enumMap.put(OsModelType.alma, bVar22);
        enumMap.put(OsModelType.alpine, bVar23);
        enumMap.put(OsModelType.amazon, bVar24);
        enumMap.put(OsModelType.rocky, bVar25);
        enumMap.put(OsModelType.group, bVar);
    }

    public static OsModelType a(n9.a aVar) {
        switch (a.f27167a[aVar.ordinal()]) {
            case 1:
                return OsModelType.raspbian;
            case 2:
                return OsModelType.centos;
            case 3:
                return OsModelType.osx;
            case 4:
                return OsModelType.ubuntu;
            case 5:
                return OsModelType.openbsd;
            case 6:
                return OsModelType.netbsd;
            case 7:
                return OsModelType.freebsd;
            case 8:
                return OsModelType.suse;
            case 9:
                return OsModelType.redhat;
            case 10:
                return OsModelType.fedora;
            case 11:
                return OsModelType.mageia;
            case 12:
                return OsModelType.arch;
            case 13:
                return OsModelType.gentoo;
            case 14:
                return OsModelType.debian;
            case 15:
                return OsModelType.linux;
            case 16:
                return OsModelType.android;
            case 17:
                return OsModelType.routeros;
            case 18:
                return OsModelType.kde;
            case 19:
                return OsModelType.gloria_ops_agent;
            case 20:
                return OsModelType.windows;
            case 21:
                return OsModelType.alma;
            case 22:
                return OsModelType.alpine;
            case 23:
                return OsModelType.amazon;
            case 24:
                return OsModelType.rocky;
            default:
                return OsModelType.none;
        }
    }

    public static oi.b b(OsModelType osModelType) {
        return (oi.b) D.get(osModelType);
    }
}
