package com.server.auditor.ssh.client.hostinfo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import ju.k;
import ju.t;
import ut.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0428a f27168a = new C0428a(null);

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.hostinfo.a$a, reason: collision with other inner class name */
    public static final class C0428a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.hostinfo.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0429a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27169a;

            static {
                int[] iArr = new int[HostIconUtil.OsModelType.values().length];
                try {
                    iArr[HostIconUtil.OsModelType.android.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.ubuntu.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.osx.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.redhat.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.centos.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.fedora.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.debian.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.gentoo.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.mageia.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.arch.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.freebsd.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.netbsd.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.openbsd.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.suse.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.raspbian.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.linux.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.kde.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.gloria_ops_agent.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.windows.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.routeros.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.none.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.group.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.alma.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.rocky.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.amazon.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[HostIconUtil.OsModelType.alpine.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                f27169a = iArr;
            }
        }

        public /* synthetic */ C0428a(k kVar) {
            this();
        }

        public final Drawable a(HostIconUtil.OsModelType osModelType, Context context) {
            t.f(osModelType, "os");
            t.f(context, "context");
            switch (C0429a.f27169a[osModelType.ordinal()]) {
                case 1:
                    return context.getDrawable(R.drawable.ic_hosts_new_local);
                case 2:
                    return context.getDrawable(R.drawable.ic_ubuntu);
                case 3:
                    return context.getDrawable(R.drawable.ic_macosx);
                case 4:
                    return context.getDrawable(R.drawable.ic_redhat);
                case 5:
                    return context.getDrawable(R.drawable.ic_centos);
                case 6:
                    return context.getDrawable(R.drawable.os_fedora);
                case 7:
                    return context.getDrawable(R.drawable.ic_debian);
                case 8:
                    return context.getDrawable(R.drawable.ic_gentoo);
                case 9:
                    return context.getDrawable(R.drawable.ic_mageia);
                case 10:
                    return context.getDrawable(R.drawable.ic_arch);
                case 11:
                    return context.getDrawable(R.drawable.ic_freebsd);
                case 12:
                    return context.getDrawable(R.drawable.ic_netbsd);
                case 13:
                    return context.getDrawable(R.drawable.ic_openbsd);
                case 14:
                    return context.getDrawable(R.drawable.ic_suse);
                case 15:
                    return context.getDrawable(R.drawable.ic_pi);
                case 16:
                    return context.getDrawable(R.drawable.ic_linux);
                case 17:
                    return context.getDrawable(R.drawable.ic_kde_neon);
                case 18:
                    return context.getDrawable(R.drawable.ic_gloria_ops_agent);
                case 19:
                    return context.getDrawable(R.drawable.ic_windows_os);
                case 20:
                    return context.getDrawable(R.drawable.ic_routeros);
                case 21:
                    return context.getDrawable(R.drawable.ic_os_none);
                case 22:
                    return context.getDrawable(R.drawable.ic_group);
                case 23:
                    return context.getDrawable(R.drawable.ic_alma);
                case 24:
                    return context.getDrawable(R.drawable.ic_rocky);
                case 25:
                    return context.getDrawable(R.drawable.ic_amazon);
                case 26:
                    return context.getDrawable(R.drawable.ic_alpine);
                default:
                    throw new s();
            }
        }

        public final int b(HostIconUtil.OsModelType osModelType) {
            t.f(osModelType, "os");
            switch (C0429a.f27169a[osModelType.ordinal()]) {
                case 1:
                    return R.drawable.ic_hosts_new_local;
                case 2:
                    return R.drawable.ic_ubuntu;
                case 3:
                    return R.drawable.ic_macosx;
                case 4:
                    return R.drawable.ic_redhat;
                case 5:
                    return R.drawable.ic_centos;
                case 6:
                    return R.drawable.os_fedora;
                case 7:
                    return R.drawable.ic_debian;
                case 8:
                    return R.drawable.ic_gentoo;
                case 9:
                    return R.drawable.ic_mageia;
                case 10:
                    return R.drawable.ic_arch;
                case 11:
                    return R.drawable.ic_freebsd;
                case 12:
                    return R.drawable.ic_netbsd;
                case 13:
                    return R.drawable.ic_openbsd;
                case 14:
                    return R.drawable.ic_suse;
                case 15:
                    return R.drawable.ic_pi;
                case 16:
                    return R.drawable.ic_linux;
                case 17:
                    return R.drawable.ic_kde_neon;
                case 18:
                    return R.drawable.ic_gloria_ops_agent;
                case 19:
                    return R.drawable.ic_windows_os;
                case 20:
                    return R.drawable.ic_routeros;
                case 21:
                    return R.drawable.ic_os_none;
                case 22:
                    return R.drawable.ic_group;
                case 23:
                    return R.drawable.ic_alma;
                case 24:
                    return R.drawable.ic_rocky;
                case 25:
                    return R.drawable.ic_amazon;
                case 26:
                    return R.drawable.ic_alpine;
                default:
                    throw new s();
            }
        }

        private C0428a() {
        }
    }
}
