package com.server.auditor.ssh.client.fragments.serial;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a0;
import ch.q;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.presenters.SerialConnectParametersPresenter;
import iu.p;
import java.util.Collection;
import java.util.HashMap;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.d6;
import su.s;
import ut.m0;
import ut.x;
import vt.n;
import vt.v;
import wu.g2;
import wu.i0;
import wu.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class SerialConnectParameters extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.views.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d6 f26169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UsbManager f26170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UsbDevice f26171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private iu.a f26172d = new iu.a() { // from class: ai.a
        @Override // iu.a
        public final Object a() {
            return SerialConnectParameters.Qf();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SerialConnectParameters$usbReceiver$1 f26173e = new BroadcastReceiver() { // from class: com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters$usbReceiver$1
        /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:15:0x0030, B:20:0x003d, B:22:0x0044, B:24:0x004a, B:27:0x0054, B:29:0x005a, B:31:0x0098, B:30:0x0076), top: B:46:0x0030 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                r9 = this;
                java.lang.String r0 = "context"
                ju.t.f(r10, r0)
                java.lang.String r10 = "intent"
                ju.t.f(r11, r10)
                java.lang.String r10 = r11.getAction()
                if (r10 == 0) goto Lc6
                int r0 = r10.hashCode()
                r1 = -2114103349(0xffffffff81fd57cb, float:-9.30635E-38)
                if (r0 == r1) goto Lb4
                r1 = -1608292967(0xffffffffa0236599, float:-1.3840253E-19)
                if (r0 == r1) goto La1
                r1 = 69673881(0x4272399, float:1.9647101E-36)
                if (r0 == r1) goto L25
                goto Lc6
            L25:
                java.lang.String r0 = "com.server.auditor.ssh.client.USB_PERMISSION"
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto Lc6
                com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters r10 = r9.f26204a
                monitor-enter(r9)
                java.lang.String r0 = "serial_parameters_request_code"
                r1 = 0
                int r11 = r11.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L51
                r0 = 5364(0x14f4, float:7.517E-42)
                if (r11 == r0) goto L3d
                monitor-exit(r9)
                return
            L3d:
                android.hardware.usb.UsbDevice r3 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.uf(r10)     // Catch: java.lang.Throwable -> L51
                r11 = 0
                if (r3 == 0) goto L76
                android.hardware.usb.UsbManager r0 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.vf(r10)     // Catch: java.lang.Throwable -> L51
                if (r0 != 0) goto L54
                java.lang.String r0 = "manager"
                ju.t.t(r0)     // Catch: java.lang.Throwable -> L51
                r0 = r11
                goto L54
            L51:
                r0 = move-exception
                r10 = r0
                goto L9f
            L54:
                boolean r0 = r0.hasPermission(r3)     // Catch: java.lang.Throwable -> L51
                if (r0 == 0) goto L76
                com.server.auditor.ssh.client.presenters.SerialConnectParametersPresenter r2 = r10.Kf()     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r4 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Af(r10)     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r5 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Cf(r10)     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r6 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Bf(r10)     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r7 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Ef(r10)     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r8 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Df(r10)     // Catch: java.lang.Throwable -> L51
                r2.t2(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
                goto L98
            L76:
                tp.u0$a r0 = tp.u0.f81015a     // Catch: java.lang.Throwable -> L51
                android.content.Context r2 = r10.requireContext()     // Catch: java.lang.Throwable -> L51
                java.lang.String r3 = "requireContext(...)"
                ju.t.e(r2, r3)     // Catch: java.lang.Throwable -> L51
                qg.d6 r3 = com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.tf(r10)     // Catch: java.lang.Throwable -> L51
                android.widget.RelativeLayout r3 = r3.b()     // Catch: java.lang.Throwable -> L51
                java.lang.String r4 = "getRoot(...)"
                ju.t.e(r3, r4)     // Catch: java.lang.Throwable -> L51
                r4 = 2132018979(0x7f140723, float:1.967628E38)
                com.google.android.material.snackbar.Snackbar r0 = r0.c(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L51
                r0.Y()     // Catch: java.lang.Throwable -> L51
            L98:
                com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters.Ff(r10, r11)     // Catch: java.lang.Throwable -> L51
                ut.m0 r10 = ut.m0.f82633a     // Catch: java.lang.Throwable -> L51
                monitor-exit(r9)
                return
            L9f:
                monitor-exit(r9)
                throw r10
            La1:
                java.lang.String r11 = "android.hardware.usb.action.USB_DEVICE_DETACHED"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto Laa
                goto Lc6
            Laa:
                com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters r10 = r9.f26204a
                com.server.auditor.ssh.client.presenters.SerialConnectParametersPresenter r10 = r10.Kf()
                r10.s2()
                return
            Lb4:
                java.lang.String r11 = "android.hardware.usb.action.USB_DEVICE_ATTACHED"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto Lbd
                goto Lc6
            Lbd:
                com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters r10 = r9.f26204a
                com.server.auditor.ssh.client.presenters.SerialConnectParametersPresenter r10 = r10.Kf()
                r10.r2()
            Lc6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters$usbReceiver$1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MoxyKtxDelegate f26174f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f26167v = {n0.g(new g0(SerialConnectParameters.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/SerialConnectParametersPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f26166u = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f26168w = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26175a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(SerialConnectParameters serialConnectParameters, View view) {
            serialConnectParameters.Kf().x2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(SerialConnectParameters serialConnectParameters, View view) {
            serialConnectParameters.Kf().w2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26175a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MaterialButton materialButton = SerialConnectParameters.this.If().f72238d;
            final SerialConnectParameters serialConnectParameters = SerialConnectParameters.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.serial.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SerialConnectParameters.b.l(serialConnectParameters, view);
                }
            });
            MaterialButton materialButton2 = SerialConnectParameters.this.If().f72251q;
            final SerialConnectParameters serialConnectParameters2 = SerialConnectParameters.this;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.serial.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SerialConnectParameters.b.m(serialConnectParameters2, view);
                }
            });
            SerialConnectParameters.this.Of();
            SerialConnectParameters.this.Pf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26177a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UsbManager usbManager = SerialConnectParameters.this.f26170b;
            if (usbManager == null) {
                t.t("manager");
                usbManager = null;
            }
            Collection<UsbDevice> collectionValues = usbManager.getDeviceList().values();
            t.e(collectionValues, "<get-values>(...)");
            if (((UsbDevice) v.q0(collectionValues)) == null) {
                SerialConnectParameters.this.Kf().v2();
            } else {
                SerialConnectParameters.this.Kf().u2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26179a;

        static final class a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SerialConnectParameters f26182b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SerialConnectParameters serialConnectParameters, zt.e eVar) {
                super(2, eVar);
                this.f26182b = serialConnectParameters;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f26182b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f26181a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                UsbManager usbManager = this.f26182b.f26170b;
                UsbManager usbManager2 = null;
                if (usbManager == null) {
                    t.t("manager");
                    usbManager = null;
                }
                HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
                SerialConnectParameters serialConnectParameters = this.f26182b;
                Collection<UsbDevice> collectionValues = deviceList.values();
                t.e(collectionValues, "<get-values>(...)");
                serialConnectParameters.f26171c = (UsbDevice) v.o0(collectionValues);
                Context contextRequireContext = this.f26182b.requireContext();
                Intent intent = new Intent("com.server.auditor.ssh.client.USB_PERMISSION");
                intent.putExtra("serial_parameters_request_code", 5364);
                m0 m0Var = m0.f82633a;
                PendingIntent broadcast = PendingIntent.getBroadcast(contextRequireContext, 5364, intent, 67108864);
                UsbManager usbManager3 = this.f26182b.f26170b;
                if (usbManager3 == null) {
                    t.t("manager");
                } else {
                    usbManager2 = usbManager3;
                }
                usbManager2.requestPermission(this.f26182b.f26171c, broadcast);
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f26179a;
            if (i10 == 0) {
                x.b(obj);
                g2 g2VarC = x0.c();
                a aVar = new a(SerialConnectParameters.this, null);
                this.f26179a = 1;
                if (wu.i.g(g2VarC, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Host f26184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SerialConnectParameters f26185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Host host, SerialConnectParameters serialConnectParameters, zt.e eVar) {
            super(2, eVar);
            this.f26184b = host;
            this.f26185c = serialConnectParameters;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f26184b, this.f26185c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26183a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TerminalConnectionManager.enqueueStartTerminalSession(this.f26184b);
            this.f26185c.Jf().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26188c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new f(this.f26188c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParameters.this.If().f72236b.setText((CharSequence) String.valueOf(this.f26188c), false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26191c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new g(this.f26191c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26189a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SerialConnectParameters.this.Mf().length > this.f26191c) {
                SerialConnectParameters.this.If().f72239e.setText((CharSequence) SerialConnectParameters.this.Mf()[this.f26191c], false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26194c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new h(this.f26194c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParameters.this.If().f72242h.check(this.f26194c != 7 ? R.id.eight_data_bits : R.id.seven_data_bits);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26197c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new i(this.f26197c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26195a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RadioGroup radioGroup = SerialConnectParameters.this.If().f72250p;
            int i10 = this.f26197c;
            int i11 = R.id.no_parity;
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = R.id.odd_parity;
                } else if (i10 == 2) {
                    i11 = R.id.even_parity;
                }
            }
            radioGroup.check(i11);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26198a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, zt.e eVar) {
            super(2, eVar);
            this.f26200c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParameters.this.new j(this.f26200c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26198a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RadioGroup radioGroup = SerialConnectParameters.this.If().f72257w;
            int i10 = this.f26200c;
            int i11 = R.id.one_stop_data_bit;
            if (i10 != 1 && i10 == 2) {
                i11 = R.id.two_stop_data_bits;
            }
            radioGroup.check(i11);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SerialConnectParameters f26203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, SerialConnectParameters serialConnectParameters, zt.e eVar) {
            super(2, eVar);
            this.f26202b = z10;
            this.f26203c = serialConnectParameters;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f26202b, this.f26203c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26201a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f26202b) {
                this.f26203c.Zf();
            } else {
                this.f26203c.Nf();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters$usbReceiver$1] */
    public SerialConnectParameters() {
        iu.a aVar = new iu.a() { // from class: ai.b
            @Override // iu.a
            public final Object a() {
                return SerialConnectParameters.Wf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26174f = new MoxyKtxDelegate(mvpDelegate, SerialConnectParametersPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Hf(int i10) {
        boolean z10 = getResources().getBoolean(R.bool.isTablet);
        View viewFindViewById = If().b().findViewById(R.id.top_card);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i10 != 2 || z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d6 If() {
        d6 d6Var = this.f26169a;
        if (d6Var != null) {
            return d6Var;
        }
        throw new IllegalStateException();
    }

    private final String[] Lf() {
        String[] stringArray = getResources().getStringArray(R.array.serial_connect_baud_rates);
        t.e(stringArray, "getStringArray(...)");
        return stringArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] Mf() {
        String[] stringArray = getResources().getStringArray(R.array.serial_connect_flow_control);
        t.e(stringArray, "getStringArray(...)");
        return stringArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        NestedScrollView nestedScrollView = If().f72252r;
        t.e(nestedScrollView, "scrollView");
        nestedScrollView.setVisibility(0);
        FrameLayout frameLayout = If().f72246l;
        t.e(frameLayout, "noSerialCableStub");
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of() {
        If().f72236b.setAdapter(new ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, Lf()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf() {
        If().f72239e.setAdapter(new ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, Mf()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Qf() {
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Rf() {
        Integer numV = s.v(If().f72236b.getText().toString());
        if (numV == null || !new pu.i(RtlSpacingHelper.UNDEFINED, Integer.MAX_VALUE).o(numV.intValue())) {
            return null;
        }
        return numV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Sf() {
        int checkedRadioButtonId = If().f72242h.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.eight_data_bits) {
            return checkedRadioButtonId != R.id.seven_data_bits ? null : 7;
        }
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Tf() {
        int iY0 = n.y0(Mf(), If().f72239e.getText().toString());
        if (iY0 == 0) {
            return 0;
        }
        if (iY0 == 1) {
            return 1;
        }
        if (iY0 != 2) {
            return iY0 != 3 ? null : 3;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Uf() {
        int checkedRadioButtonId = If().f72250p.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.even_parity) {
            return 2;
        }
        if (checkedRadioButtonId != R.id.no_parity) {
            return checkedRadioButtonId != R.id.odd_parity ? null : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Vf() {
        int checkedRadioButtonId = If().f72257w.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.one_stop_data_bit) {
            return checkedRadioButtonId != R.id.two_stop_data_bits ? null : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialConnectParametersPresenter Wf() {
        return new SerialConnectParametersPresenter();
    }

    private final void Xf() {
        tp.g.a().k(new q(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Zf() {
        Hf(getResources().getConfiguration().orientation);
        NestedScrollView nestedScrollView = If().f72252r;
        t.e(nestedScrollView, "scrollView");
        nestedScrollView.setVisibility(8);
        FrameLayout frameLayout = If().f72246l;
        t.e(frameLayout, "noSerialCableStub");
        frameLayout.setVisibility(0);
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void Ea(int i10) {
        a0.a(this).b(new h(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void Ec(Host host) {
        t.f(host, "host");
        a0.a(this).b(new e(host, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void I9(int i10) {
        a0.a(this).b(new i(i10, null));
    }

    public final iu.a Jf() {
        return this.f26172d;
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void K7(int i10) {
        a0.a(this).b(new j(i10, null));
    }

    public final SerialConnectParametersPresenter Kf() {
        return (SerialConnectParametersPresenter) this.f26174f.getValue(this, f26167v[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void U2(int i10) {
        a0.a(this).b(new g(i10, null));
    }

    public final void Yf(iu.a aVar) {
        t.f(aVar, "<set-?>");
        this.f26172d = aVar;
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void c() {
        a0.a(this).b(new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void cb(int i10) {
        a0.a(this).b(new f(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void i7() {
        a0.a(this).b(new d(null));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        t.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        FrameLayout frameLayout = If().f72246l;
        t.e(frameLayout, "noSerialCableStub");
        if (frameLayout.getVisibility() == 0) {
            Hf(configuration.orientation);
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Object systemService = activity.getSystemService("usb");
            t.d(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
            this.f26170b = (UsbManager) systemService;
            IntentFilter intentFilter = new IntentFilter("com.server.auditor.ssh.client.USB_PERMISSION");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            androidx.core.content.a.registerReceiver(activity, this.f26173e, intentFilter, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26169a = d6.c(getLayoutInflater());
        RelativeLayout relativeLayoutB = If().b();
        t.e(relativeLayoutB, "getRoot(...)");
        return relativeLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        requireActivity().unregisterReceiver(this.f26173e);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Xf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        ch.f fVar = new ch.f();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.o(fragmentActivityRequireActivity);
        fVar.j();
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void q3() {
        a0.a(this).b(new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void s6(boolean z10) {
        a0.a(this).b(new k(z10, this, null));
    }
}
