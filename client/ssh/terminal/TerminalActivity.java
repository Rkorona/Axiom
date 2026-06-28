package com.server.auditor.ssh.client.ssh.terminal;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.viewpager.widget.ViewPager;
import b9.d;
import com.crystalnix.terminal.view.TerminalView;
import com.crystalnix.termius.libtermius.wrappers.SelectedConnectionTab;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.TerminalConnectionManager;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.CompletionDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.models.CompletionDBModel;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.interactors.snippets.a;
import com.server.auditor.ssh.client.models.ActiveConnection;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.SftpAnnouncementViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.d;
import com.server.auditor.ssh.client.ssh.terminal.TerminalActivity;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import com.server.auditor.ssh.client.ssh.terminal.a;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.copypastewidget.CopyPasteModeManager;
import com.server.auditor.ssh.client.ssh.terminal.c;
import com.server.auditor.ssh.client.ssh.terminal.d;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.ScrollableViewPager;
import hg.b2;
import il.p0;
import io.split.android.client.dtos.SerializableEvent;
import io.split.android.client.service.sseclient.EventStreamParser;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ju.n0;
import o4.a2;
import o4.z0;
import om.d;
import qg.e8;
import qg.o7;
import qm.f;
import tp.f1;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class TerminalActivity extends TransparentStatusBarActivity implements kj.d, ViewPager.j, d.b, a.InterfaceC0441a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final a f38860c0 = new a(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f38861d0 = 8;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f38862e0 = R.raw.command_line_noscroll;
    private CopyPasteModeManager A;
    private tm.m B;
    private com.server.auditor.ssh.client.ssh.terminal.c C;
    private com.server.auditor.ssh.client.ssh.terminal.a D;
    private com.server.auditor.ssh.client.interactors.snippets.a E;
    private View F;
    private View G;
    private AppCompatTextView H;
    private AppCompatTextView I;
    private AppCompatTextView J;
    private AppCompatTextView K;
    private MaterialButton L;
    private View M;
    private AppCompatTextView N;
    private AppCompatImageView O;
    private qm.f Q;
    private SensorManager R;
    private Sensor S;
    private Toast T;
    private final com.server.auditor.ssh.client.app.a U;
    private final hg.d V;
    private final com.server.auditor.ssh.client.interactors.snippets.b W;
    private final ut.n X;
    private final ut.n Y;
    private final g.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ut.n f38863a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private o7 f38864b0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ConstraintLayout f38866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout f38867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private om.d f38868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f f38869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private om.b f38870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.server.auditor.ssh.client.ssh.terminal.e f38871z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ut.n f38865f = new k1(n0.b(TerminalActivityViewModel.class), new w(this), new v(this), new x(null, this));
    private final nm.p P = new nm.p(this, new iu.l() { // from class: nm.g0
        @Override // iu.l
        public final Object invoke(Object obj) {
            return TerminalActivity.t1(this.f66904a, ((Boolean) obj).booleanValue());
        }
    });

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        public final int a() {
            return TerminalActivity.f38862e0;
        }

        private a() {
        }
    }

    public static final class a0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f38872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38873b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f38872a = aVar;
            this.f38873b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f38872a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f38873b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38874a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38874a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TerminalActivity.this.C1().setScaledScreenDensity(new tp.p(TerminalActivity.this).b());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentActivity componentActivity) {
            super(0);
            this.f38876a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f38876a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c implements z9.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Toast f38877a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.ssh.terminal.b f38879c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38880a;

            static {
                int[] iArr = new int[ConnectionType.values().length];
                try {
                    iArr[ConnectionType.ssh.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConnectionType.local.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConnectionType.telnet.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f38880a = iArr;
            }
        }

        c(com.server.auditor.ssh.client.ssh.terminal.b bVar) {
            this.f38879c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(ArrayList arrayList, TerminalActivity terminalActivity, int i10) {
            String strY1;
            Intent intent = new Intent("android.intent.action.VIEW");
            String str = (String) vt.v.s0(arrayList, i10);
            if (str == null || (strY1 = terminalActivity.y1(str)) == null) {
                return;
            }
            Uri uri = Uri.parse(strY1);
            intent.setDataAndType(uri, terminalActivity.getContentResolver().getType(uri));
            try {
                terminalActivity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                new be.b(terminalActivity).setTitle(R.string.message_could_not_open_browser).setMessage(strY1).setPositiveButton(android.R.string.ok, null).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(ArrayList arrayList, ClipboardManager clipboardManager, int i10) {
            String str = (String) vt.v.s0(arrayList, i10);
            if (str == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
        }

        @Override // z9.c
        public void a() {
            Ringtone ringtone;
            Ringtone ringtone2;
            if (TerminalActivity.this.C1().getTerminalParameters().e()) {
                if (TerminalActivity.this.C1().getTerminalParameters().g() && (ringtone = TerminalActivity.this.C1().getRingtone()) != null && !ringtone.isPlaying() && (ringtone2 = TerminalActivity.this.C1().getRingtone()) != null) {
                    ringtone2.play();
                }
                if (!TerminalActivity.this.C1().getTerminalParameters().h() || TerminalActivity.this.C1().getVibrator() == null) {
                    return;
                }
                try {
                    Vibrator vibrator = TerminalActivity.this.C1().getVibrator();
                    if (vibrator != null) {
                        vibrator.cancel();
                    }
                    Vibrator vibrator2 = TerminalActivity.this.C1().getVibrator();
                    if (vibrator2 != null) {
                        f1.a(vibrator2, 100L);
                    }
                } catch (Exception e10) {
                    y9.a.f86838a.i(e10);
                }
            }
        }

        @Override // z9.c
        public void b(String str) {
            TerminalActivity.this.v1();
            Toast toast = this.f38877a;
            if (toast != null) {
                toast.cancel();
            }
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 2747) {
                    if (iHashCode != 2136258) {
                        if (iHashCode != 2364455) {
                            if (iHashCode == 78959100 && str.equals("Right")) {
                                str = "→";
                            }
                        } else if (str.equals("Left")) {
                            str = "←";
                        }
                    } else if (str.equals("Down")) {
                        str = "↓";
                    }
                } else if (str.equals("Up")) {
                    str = "↑";
                }
            }
            if (str != null) {
                Toast toastMakeText = Toast.makeText(TerminalActivity.this, str, 0);
                toastMakeText.show();
                this.f38877a = toastMakeText;
            }
        }

        @Override // z9.c
        public void c(TerminalView terminalView) {
            TerminalActivity.this.v1();
            CopyPasteModeManager copyPasteModeManager = TerminalActivity.this.A;
            CopyPasteModeManager copyPasteModeManager2 = null;
            if (copyPasteModeManager == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager = null;
            }
            copyPasteModeManager.b(CopyPasteModeManager.MODE.Paste);
            CopyPasteModeManager copyPasteModeManager3 = TerminalActivity.this.A;
            if (copyPasteModeManager3 == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager3 = null;
            }
            copyPasteModeManager3.l(terminalView);
            CopyPasteModeManager copyPasteModeManager4 = TerminalActivity.this.A;
            if (copyPasteModeManager4 == null) {
                ju.t.t("copyPasteModeManager");
            } else {
                copyPasteModeManager2 = copyPasteModeManager4;
            }
            copyPasteModeManager2.o();
            TerminalActivity.this.B2();
        }

        @Override // z9.c
        public void d(TerminalView terminalView) {
            TerminalActivity.this.v1();
            CopyPasteModeManager copyPasteModeManager = TerminalActivity.this.A;
            CopyPasteModeManager copyPasteModeManager2 = null;
            if (copyPasteModeManager == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager = null;
            }
            copyPasteModeManager.b(CopyPasteModeManager.MODE.Copy);
            CopyPasteModeManager copyPasteModeManager3 = TerminalActivity.this.A;
            if (copyPasteModeManager3 == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager3 = null;
            }
            copyPasteModeManager3.l(terminalView);
            CopyPasteModeManager copyPasteModeManager4 = TerminalActivity.this.A;
            if (copyPasteModeManager4 == null) {
                ju.t.t("copyPasteModeManager");
            } else {
                copyPasteModeManager2 = copyPasteModeManager4;
            }
            copyPasteModeManager2.n();
            TerminalActivity.this.B2();
        }

        @Override // z9.c
        public void e() {
            TerminalActivity.this.v1();
            CopyPasteModeManager copyPasteModeManager = TerminalActivity.this.A;
            if (copyPasteModeManager == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager = null;
            }
            copyPasteModeManager.n();
        }

        @Override // z9.c
        public void f(TerminalView terminalView, boolean z10) {
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = TerminalActivity.this.f38869x;
            if (fVar == null) {
                ju.t.t("moreKeyboardManager");
                fVar = null;
            }
            fVar.X(z10);
        }

        @Override // z9.c
        public void g(TerminalView terminalView, a9.f fVar, boolean z10) {
            ju.t.f(terminalView, "terminalView");
            ju.t.f(fVar, SerializableEvent.KEY_FIELD);
            TerminalActivity.this.v1();
            if (fVar == a9.f.Key_Ctrl && !z10) {
                terminalView.setUseCtrl(false, false);
            }
            if (fVar == a9.f.Key_Alt && !z10) {
                terminalView.setUseAlt(false, false);
            }
            if (z10) {
                return;
            }
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar2 = TerminalActivity.this.f38869x;
            if (fVar2 == null) {
                ju.t.t("moreKeyboardManager");
                fVar2 = null;
            }
            fVar2.V(fVar);
        }

        @Override // z9.c
        public void h() {
            CopyPasteModeManager copyPasteModeManager = TerminalActivity.this.A;
            if (copyPasteModeManager == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager = null;
            }
            copyPasteModeManager.d();
            TerminalActivity.this.B2();
        }

        @Override // z9.c
        public void i(TerminalView terminalView) {
            TelnetProperties telnetProperties;
            ju.t.f(terminalView, "terminalView");
            Connection connectionXf = this.f38879c.xf();
            if (connectionXf != null) {
                ConnectionType type = connectionXf.getType();
                int i10 = type == null ? -1 : a.f38880a[type.ordinal()];
                if (i10 == 1) {
                    SshProperties sshProperties = connectionXf.getSshProperties();
                    if (sshProperties != null) {
                        g9.a terminalSession = terminalView.getTerminalSession();
                        sshProperties.setFontSize(terminalSession != null ? Integer.valueOf(terminalSession.N()) : null);
                        return;
                    }
                    return;
                }
                if (i10 != 2) {
                    if (i10 == 3 && (telnetProperties = connectionXf.getTelnetProperties()) != null) {
                        g9.a terminalSession2 = terminalView.getTerminalSession();
                        telnetProperties.setFontSize(terminalSession2 != null ? Integer.valueOf(terminalSession2.N()) : null);
                        return;
                    }
                    return;
                }
                LocalProperties localProperties = connectionXf.getLocalProperties();
                if (localProperties != null) {
                    g9.a terminalSession3 = terminalView.getTerminalSession();
                    localProperties.setFontSize(terminalSession3 != null ? Integer.valueOf(terminalSession3.N()) : null);
                }
            }
        }

        @Override // z9.c
        public void j() {
            Toast.makeText(TerminalActivity.this, "Out of memory error", 1).show();
        }

        @Override // z9.c
        public void k() {
            TerminalActivity.this.v1();
            CopyPasteModeManager copyPasteModeManager = TerminalActivity.this.A;
            if (copyPasteModeManager == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager = null;
            }
            copyPasteModeManager.g();
        }

        @Override // z9.c
        public void l(TerminalView terminalView, final ArrayList arrayList, MotionEvent motionEvent) {
            ju.t.f(terminalView, "terminalView");
            ju.t.f(arrayList, "urls");
            TerminalActivity.this.v1();
            Object systemService = TerminalActivity.this.getSystemService("clipboard");
            ju.t.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            final ClipboardManager clipboardManager = (ClipboardManager) systemService;
            qm.f fVar = TerminalActivity.this.Q;
            if (fVar != null) {
                fVar.a();
            }
            TerminalActivity terminalActivity = TerminalActivity.this;
            qm.f fVar2 = new qm.f(terminalActivity, arrayList);
            final TerminalActivity terminalActivity2 = TerminalActivity.this;
            fVar2.n(terminalView, motionEvent);
            fVar2.l(new f.b() { // from class: nm.o0
                @Override // qm.f.b
                public final void a(int i10) {
                    TerminalActivity.c.p(arrayList, terminalActivity2, i10);
                }
            });
            fVar2.m(new f.c() { // from class: nm.p0
                @Override // qm.f.c
                public final void a(int i10) {
                    TerminalActivity.c.q(arrayList, clipboardManager, i10);
                }
            });
            terminalActivity.Q = fVar2;
        }

        @Override // z9.c
        public void m(TerminalView terminalView, int i10, int i11, int i12) {
            qm.f fVar;
            ju.t.f(terminalView, "terminalView");
            if (TerminalActivity.this.C1().isIgnoreTap()) {
                TerminalActivity.this.C1().setIgnoreTap(false);
                return;
            }
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar2 = TerminalActivity.this.f38869x;
            om.b bVar = null;
            if (fVar2 == null) {
                ju.t.t("moreKeyboardManager");
                fVar2 = null;
            }
            if (!fVar2.P() && ((fVar = TerminalActivity.this.Q) == null || !fVar.f())) {
                om.b bVar2 = TerminalActivity.this.f38870y;
                if (bVar2 == null) {
                    ju.t.t("completionPopup");
                } else {
                    bVar = bVar2;
                }
                if (!bVar.d()) {
                    if (TerminalActivity.this.P.i0()) {
                        TerminalActivity.this.v1();
                        return;
                    } else {
                        if (TerminalActivity.this.b2() && terminalView.R()) {
                            terminalView.k0(i11, i12);
                            return;
                        }
                        return;
                    }
                }
            }
            TerminalActivity.this.x1();
        }
    }

    public static final class c0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38881a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentActivity componentActivity) {
            super(0);
            this.f38881a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f38881a.getViewModelStore();
        }
    }

    /* synthetic */ class d implements g.a, ju.n {
        d() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ActivityResult activityResult) {
            ju.t.f(activityResult, "p0");
            TerminalActivity.this.f2(activityResult);
        }

        @Override // ju.n
        public final ut.i c() {
            return new ju.q(1, TerminalActivity.this, TerminalActivity.class, "onFreeOpenAiPromotionScreenResultReceived", "onFreeOpenAiPromotionScreenResultReceived(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class d0 extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f38883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f38883a = aVar;
            this.f38884b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f38883a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f38884b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class e implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f38885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f38886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f38887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38888d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.ssh.terminal.b f38890f;

        e(com.server.auditor.ssh.client.ssh.terminal.b bVar) {
            this.f38890f = bVar;
        }

        private final d.a g(final String str) {
            final TerminalActivity terminalActivity = TerminalActivity.this;
            final com.server.auditor.ssh.client.ssh.terminal.b bVar = this.f38890f;
            return new d.a() { // from class: nm.s0
                @Override // om.d.a
                public final void a(int i10) {
                    TerminalActivity.e.h(terminalActivity, this, str, bVar, i10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(TerminalActivity terminalActivity, e eVar, String str, com.server.auditor.ssh.client.ssh.terminal.b bVar, int i10) {
            TerminalView terminalView;
            g9.a terminalSession;
            b9.d dVarM;
            TerminalView terminalView2;
            g9.a terminalSession2;
            TerminalView terminalView3;
            g9.a terminalSession3;
            final CompletionDBAdapter completionDBAdapterD = hg.f.p().d();
            om.d dVar = terminalActivity.f38868w;
            om.d dVar2 = null;
            if (dVar == null) {
                ju.t.t("completionAdapter");
                dVar = null;
            }
            if (i10 < dVar.c()) {
                om.d dVar3 = terminalActivity.f38868w;
                if (dVar3 == null) {
                    ju.t.t("completionAdapter");
                } else {
                    dVar2 = dVar3;
                }
                final b9.i iVarD = dVar2.d(i10);
                ju.t.e(iVarD, "getItem(...)");
                if (iVarD.h()) {
                    eVar.f38888d = true;
                    SnippetDBAdapter snippetDBAdapterJ = hg.f.p().J();
                    Long lF = iVarD.f();
                    ju.t.e(lF, "getSnippetId(...)");
                    SnippetDBModel itemByLocalId = snippetDBAdapterJ.getItemByLocalId(lF.longValue());
                    if (itemByLocalId == null) {
                        return;
                    }
                    SnippetItem snippetItem = new SnippetItem(itemByLocalId);
                    int iA = terminalActivity.W.a(terminalActivity.W.c(snippetItem.getScriptStructure()));
                    if (iA <= 0 || !terminalActivity.W.b(snippetItem)) {
                        String script = snippetItem.getScript();
                        ju.t.e(script, "getScript(...)");
                        char[] cArrQ2 = terminalActivity.q2(str, script);
                        e8 e8VarVf = bVar.vf();
                        if (e8VarVf != null && (terminalView2 = e8VarVf.f72390g) != null && (terminalSession2 = terminalView2.getTerminalSession()) != null) {
                            terminalSession2.B(cArrQ2);
                        }
                        com.server.auditor.ssh.client.utils.analytics.a.y().e5(SnippetSourceOrigin.AUTOCOMPLETE, snippetItem.isShared(), snippetItem.getPackageId(), iA, String.valueOf(snippetItem.getRemoteId()));
                    } else {
                        terminalActivity.v2(snippetItem);
                    }
                } else {
                    eVar.f38888d = false;
                    String string = iVarD.toString();
                    ju.t.e(string, "toString(...)");
                    int iK0 = su.s.k0(string, str, 0, false, 6, null);
                    if (iK0 == 0) {
                        String strSubstring = string.substring(iK0 + str.length(), string.length());
                        ju.t.e(strSubstring, "substring(...)");
                        char[] charArray = (strSubstring + " ").toCharArray();
                        ju.t.e(charArray, "toCharArray(...)");
                        e8 e8VarVf2 = bVar.vf();
                        if (e8VarVf2 != null && (terminalView3 = e8VarVf2.f72390g) != null && (terminalSession3 = terminalView3.getTerminalSession()) != null) {
                            terminalSession3.B(charArray);
                        }
                        eVar.f38885a = true;
                        eVar.f38886b = Integer.valueOf(str.length());
                        eVar.f38887c = Integer.valueOf(i10);
                    }
                    new Thread(new Runnable() { // from class: nm.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            TerminalActivity.e.i(iVarD, completionDBAdapterD);
                        }
                    }).start();
                }
            } else {
                terminalActivity.w1();
            }
            e8 e8VarVf3 = bVar.vf();
            if (e8VarVf3 == null || (terminalView = e8VarVf3.f72390g) == null || (terminalSession = terminalView.getTerminalSession()) == null || (dVarM = terminalSession.M()) == null) {
                return;
            }
            dVarM.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(b9.i iVar, CompletionDBAdapter completionDBAdapter) {
            if (iVar.b() != null) {
                Long lB = iVar.b();
                ju.t.c(lB);
                CompletionDBModel itemById = completionDBAdapter.getItemById(lB.longValue());
                if (itemById != null) {
                    itemById.setUseCounter(itemById.getUseCounter() + 1);
                    itemById.setUpdated(System.currentTimeMillis());
                    completionDBAdapter.editItemById(lB.longValue(), itemById);
                }
            }
        }

        private final Runnable j(final b9.c cVar) {
            final TerminalActivity terminalActivity = TerminalActivity.this;
            final com.server.auditor.ssh.client.ssh.terminal.b bVar = this.f38890f;
            return new Runnable() { // from class: nm.q0
                @Override // java.lang.Runnable
                public final void run() {
                    TerminalActivity.e.k(cVar, terminalActivity, this, bVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(b9.c cVar, TerminalActivity terminalActivity, e eVar, com.server.auditor.ssh.client.ssh.terminal.b bVar) {
            g9.a terminalSession;
            List listA = cVar.a();
            String strC = cVar.c();
            terminalActivity.C1().getCompletionList().clear();
            terminalActivity.C1().getCompletionList().addAll(listA);
            om.d dVar = terminalActivity.f38868w;
            om.b bVar2 = null;
            if (dVar == null) {
                ju.t.t("completionAdapter");
                dVar = null;
            }
            ju.t.c(strC);
            dVar.l(eVar.g(strC));
            e8 e8VarVf = bVar.vf();
            TerminalView terminalView = e8VarVf != null ? e8VarVf.f72390g : null;
            d9.a aVarS = (terminalView == null || (terminalSession = terminalView.getTerminalSession()) == null) ? null : terminalSession.S();
            if (aVarS != null) {
                aVarS.W0(cVar);
            }
            if (terminalView != null) {
                terminalView.postInvalidate();
            }
            om.d dVar2 = terminalActivity.f38868w;
            if (dVar2 == null) {
                ju.t.t("completionAdapter");
                dVar2 = null;
            }
            dVar2.m(strC.length());
            om.d dVar3 = terminalActivity.f38868w;
            if (dVar3 == null) {
                ju.t.t("completionAdapter");
                dVar3 = null;
            }
            dVar3.h();
            if (terminalView != null) {
                om.b bVar3 = terminalActivity.f38870y;
                if (bVar3 == null) {
                    ju.t.t("completionPopup");
                } else {
                    bVar2 = bVar3;
                }
                bVar2.g(listA.size(), terminalView);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(TerminalActivity terminalActivity, TerminalView terminalView) {
            terminalActivity.C1().getCompletionList().clear();
            om.d dVar = terminalActivity.f38868w;
            if (dVar == null) {
                ju.t.t("completionAdapter");
                dVar = null;
            }
            dVar.h();
            om.b bVar = terminalActivity.f38870y;
            if (bVar == null) {
                ju.t.t("completionPopup");
                bVar = null;
            }
            bVar.b();
            g9.a terminalSession = terminalView.getTerminalSession();
            d9.a aVarS = terminalSession != null ? terminalSession.S() : null;
            if (aVarS != null) {
                aVarS.W0(null);
            }
            terminalView.postInvalidate();
        }

        private final void m() {
            this.f38885a = false;
            this.f38886b = null;
            this.f38887c = null;
        }

        @Override // b9.d.b
        public void a() {
            if (TerminalActivity.this.isFinishing()) {
                return;
            }
            om.b bVar = TerminalActivity.this.f38870y;
            if (bVar == null) {
                ju.t.t("completionPopup");
                bVar = null;
            }
            if (bVar.d()) {
                if (this.f38888d) {
                    com.server.auditor.ssh.client.utils.analytics.a.y().t0(this.f38885a, this.f38886b, this.f38887c);
                } else {
                    com.server.auditor.ssh.client.utils.analytics.a.y().s0(this.f38885a, this.f38886b, this.f38887c);
                }
            }
            m();
            View view = this.f38890f.getView();
            final TerminalView terminalView = view != null ? (TerminalView) view.findViewById(R.id.terminalView) : null;
            if (terminalView != null) {
                final TerminalActivity terminalActivity = TerminalActivity.this;
                terminalView.post(new Runnable() { // from class: nm.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TerminalActivity.e.l(terminalActivity, terminalView);
                    }
                });
            }
        }

        @Override // b9.d.b
        public void b(b9.c cVar) {
            e8 e8VarVf;
            TerminalView terminalView;
            ju.t.f(cVar, "resultBundle");
            List listA = cVar.a();
            ju.t.e(listA, "getCompletionList(...)");
            if (listA.isEmpty()) {
                a();
                return;
            }
            com.server.auditor.ssh.client.ssh.terminal.c cVar2 = TerminalActivity.this.C;
            if (cVar2 == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar2 = null;
            }
            o7 o7Var = TerminalActivity.this.f38864b0;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            Fragment fragmentS = cVar2.s(o7Var.f73437n.getCurrentItem());
            com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
            if (bVar == null || (e8VarVf = bVar.vf()) == null || (terminalView = e8VarVf.f72390g) == null) {
                return;
            }
            terminalView.post(j(cVar));
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38891a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38891a;
            if (i10 == 0) {
                ut.x.b(obj);
                com.server.auditor.ssh.client.interactors.snippets.a aVar = TerminalActivity.this.E;
                if (aVar == null) {
                    ju.t.t("activateIntoSnippetsTerminalInteractor");
                    aVar = null;
                }
                this.f38891a = 1;
                if (aVar.c(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Integer.valueOf(((TypedSessionId) obj).getSessionId()), Integer.valueOf(((TypedSessionId) obj2).getSessionId()));
        }
    }

    public static final class h implements c.a {
        h() {
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.c.a
        public void a(int i10) {
            TerminalActivity.this.E2();
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38894a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38894a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NavigationPopUpWhenLargeActivity.f28304b.c(TerminalActivity.this.Z, TerminalActivity.this, NavigationPopUpWhenLargeActivity.NavigationDestination.FreeOpenAiPromoFlow.INSTANCE);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TerminalActivity f38897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Configuration f38898c;

        j(int i10, TerminalActivity terminalActivity, Configuration configuration) {
            this.f38896a = i10;
            this.f38897b = terminalActivity;
            this.f38898c = configuration;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i10 = this.f38896a;
            LinearLayout linearLayout = this.f38897b.f38867v;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                ju.t.t("additionalKeyboardLayout");
                linearLayout = null;
            }
            if (i10 != linearLayout.getWidth()) {
                LinearLayout linearLayout3 = this.f38897b.f38867v;
                if (linearLayout3 == null) {
                    ju.t.t("additionalKeyboardLayout");
                    linearLayout3 = null;
                }
                linearLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38897b.f38869x;
                if (fVar == null) {
                    ju.t.t("moreKeyboardManager");
                    fVar = null;
                }
                Configuration configuration = this.f38898c;
                LinearLayout linearLayout4 = this.f38897b.f38867v;
                if (linearLayout4 == null) {
                    ju.t.t("additionalKeyboardLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                fVar.w(configuration, linearLayout2.getWidth());
            }
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38899a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38899a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = TerminalActivity.this.F;
            if (view == null) {
                ju.t.t("activateSnippetsLayout");
                view = null;
            }
            view.setVisibility(8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38901a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38901a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = TerminalActivity.this.G;
            AppCompatTextView appCompatTextView = null;
            if (view == null) {
                ju.t.t("promoCard");
                view = null;
            }
            view.setVisibility(8);
            View view2 = TerminalActivity.this.M;
            if (view2 == null) {
                ju.t.t("finishCard");
                view2 = null;
            }
            view2.setVisibility(0);
            AppCompatTextView appCompatTextView2 = TerminalActivity.this.N;
            if (appCompatTextView2 == null) {
                ju.t.t("headerTitle");
            } else {
                appCompatTextView = appCompatTextView2;
            }
            appCompatTextView.setText(R.string.top3_commands_saved);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38903a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, zt.e eVar) {
            super(2, eVar);
            this.f38905c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new m(this.f38905c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38903a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TerminalActivity.this.k2(this.f38905c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38906a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Object systemService = TerminalActivity.this.getSystemService("input_method");
            ju.t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = TerminalActivity.this.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38908a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38908a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Object systemService = TerminalActivity.this.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            TerminalView terminalView = (TerminalView) TerminalActivity.this.findViewById(R.id.terminalView);
            if (terminalView != null) {
                terminalView.requestFocus();
                View currentFocus = TerminalActivity.this.getCurrentFocus();
                if (inputMethodManager != null && (currentFocus instanceof TerminalView)) {
                    inputMethodManager.showSoftInput(terminalView, 0);
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38910a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38910a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TerminalActivity.this.E1().onNewConnectionVariantSelected("sftp");
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Integer.valueOf(((TypedSessionId) obj).getSessionId()), Integer.valueOf(((TypedSessionId) obj2).getSessionId()));
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38912a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38912a;
            if (i10 == 0) {
                ut.x.b(obj);
                com.server.auditor.ssh.client.interactors.snippets.a aVar = TerminalActivity.this.E;
                if (aVar == null) {
                    ju.t.t("activateIntoSnippetsTerminalInteractor");
                    aVar = null;
                }
                this.f38912a = 1;
                if (aVar.f(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38914a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38914a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.interactors.snippets.a aVar = TerminalActivity.this.E;
            if (aVar == null) {
                ju.t.t("activateIntoSnippetsTerminalInteractor");
                aVar = null;
            }
            aVar.h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38916a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TerminalActivity.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38916a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.interactors.snippets.a aVar = TerminalActivity.this.E;
            if (aVar == null) {
                ju.t.t("activateIntoSnippetsTerminalInteractor");
                aVar = null;
            }
            aVar.i();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f38918a;

        u(iu.l lVar) {
            ju.t.f(lVar, "function");
            this.f38918a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f38918a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f38918a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class v extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38919a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentActivity componentActivity) {
            super(0);
            this.f38919a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f38919a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class w extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f38920a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f38920a.getViewModelStore();
        }
    }

    public static final class x extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f38921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f38921a = aVar;
            this.f38922b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f38921a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f38922b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class y extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f38923a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f38923a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class z extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f38924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f38924a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f38924a.getViewModelStore();
        }
    }

    public TerminalActivity() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.U = aVarN;
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.V = dVarM;
        ju.t.e(aVarN, "termiusStorage");
        this.W = new com.server.auditor.ssh.client.interactors.snippets.b(aVarN);
        this.X = new k1(n0.b(HomeScreenViewModel.class), new z(this), new y(this), new a0(null, this));
        this.Y = new k1(n0.b(SftpAnnouncementViewModel.class), new c0(this), new b0(this), new d0(null, this));
        this.Z = registerForActivityResult(new h.c(), new d());
        this.f38863a0 = ut.o.a(new iu.a() { // from class: nm.h0
            @Override // iu.a
            public final Object a() {
                return TerminalActivity.x2(this.f66906a);
            }
        });
    }

    private final d.b A1(com.server.auditor.ssh.client.ssh.terminal.b bVar) {
        return new e(bVar);
    }

    private final void A2() {
        k9.b bVarT;
        Object next;
        com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.c cVarA;
        TypedSessionId typedSessionIdD;
        d9.a aVarS;
        List listA = ((com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z) E1().getConnectionTabBarItems().getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof d.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((d.a) obj2).a().d() instanceof TypedSessionId.PortForwarding)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            bVarT = null;
            if (it.hasNext()) {
                next = it.next();
                if (((d.a) next).a().j()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        d.a aVar = (d.a) next;
        if (aVar == null) {
            aVar = (d.a) vt.v.r0(arrayList2);
        }
        if (aVar == null || (cVarA = aVar.a()) == null || (typedSessionIdD = cVarA.d()) == null) {
            return;
        }
        g9.a terminalSession = SessionManager.getInstance().getTerminalSession(typedSessionIdD.getSessionId());
        if (terminalSession != null && (aVarS = terminalSession.S()) != null) {
            bVarT = aVarS.t();
        }
        TransparentStatusBarActivity.f28653d.c(this, bVarT != null ? bVarT.c(-1) : androidx.core.content.a.getColor(this, yk.a.a(this, R.attr.termius_background_background)));
    }

    private final SftpAnnouncementViewModel B1() {
        return (SftpAnnouncementViewModel) this.Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2() {
        e8 e8VarVf;
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        com.server.auditor.ssh.client.ssh.terminal.c cVar2 = null;
        CopyPasteModeManager copyPasteModeManager = null;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = this.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
        TerminalView terminalView = (bVar == null || (e8VarVf = bVar.vf()) == null) ? null : e8VarVf.f72390g;
        if (terminalView == null) {
            try {
                com.server.auditor.ssh.client.ssh.terminal.c cVar3 = this.C;
                if (cVar3 == null) {
                    ju.t.t("terminalFragmentViewPagerAdapter");
                } else {
                    cVar2 = cVar3;
                }
                if (cVar2.c() == 0) {
                    finish();
                    return;
                }
                return;
            } catch (IllegalStateException unused) {
                finish();
                return;
            }
        }
        terminalView.w(C1().isNeedDrawCursor());
        bVar.Gf(u1(bVar));
        int iZf = bVar.zf();
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38869x;
        if (fVar == null) {
            ju.t.t("moreKeyboardManager");
            fVar = null;
        }
        fVar.Y(terminalView);
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar2 = this.f38869x;
        if (fVar2 == null) {
            ju.t.t("moreKeyboardManager");
            fVar2 = null;
        }
        fVar2.W(Integer.valueOf(iZf));
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar3 = this.f38869x;
        if (fVar3 == null) {
            ju.t.t("moreKeyboardManager");
            fVar3 = null;
        }
        fVar3.d0(b2());
        CopyPasteModeManager copyPasteModeManager2 = this.A;
        if (copyPasteModeManager2 == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager2 = null;
        }
        copyPasteModeManager2.k(terminalView.getTerminalSelectionManager());
        com.server.auditor.ssh.client.ssh.terminal.a aVar = new com.server.auditor.ssh.client.ssh.terminal.a(this, terminalView);
        this.D = aVar;
        aVar.j(new a.InterfaceC0600a() { // from class: nm.s
            @Override // com.server.auditor.ssh.client.ssh.terminal.a.InterfaceC0600a
            public final void a() {
                TerminalActivity.C2(this.f66974a);
            }
        });
        CopyPasteModeManager copyPasteModeManager3 = this.A;
        if (copyPasteModeManager3 == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager3 = null;
        }
        com.server.auditor.ssh.client.ssh.terminal.a aVar2 = this.D;
        if (aVar2 == null) {
            ju.t.t("copyPasteHelper");
            aVar2 = null;
        }
        copyPasteModeManager3.j(aVar2);
        CopyPasteModeManager copyPasteModeManager4 = this.A;
        if (copyPasteModeManager4 == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager4 = null;
        }
        if (copyPasteModeManager4.e() == TerminalView.b.f16929b) {
            o7 o7Var2 = this.f38864b0;
            if (o7Var2 == null) {
                ju.t.t("binding");
                o7Var2 = null;
            }
            o7Var2.f73437n.R();
            terminalView.requestFocus();
        } else if (!b2()) {
            o7 o7Var3 = this.f38864b0;
            if (o7Var3 == null) {
                ju.t.t("binding");
                o7Var3 = null;
            }
            o7Var3.f73437n.S();
        }
        terminalView.setGestureMode(b2());
        CopyPasteModeManager copyPasteModeManager5 = this.A;
        if (copyPasteModeManager5 == null) {
            ju.t.t("copyPasteModeManager");
        } else {
            copyPasteModeManager = copyPasteModeManager5;
        }
        TerminalView.b bVarE = copyPasteModeManager.e();
        ju.t.e(bVarE, "getCurrentTerminalMode(...)");
        terminalView.setMode(bVarE);
        d.b bVarA1 = A1(bVar);
        final g9.a terminalSession = SessionManager.getInstance().getTerminalSession(iZf);
        if (terminalSession != null) {
            d.a aVar3 = new d.a() { // from class: nm.d0
                @Override // b9.d.a
                public final boolean a() {
                    return TerminalActivity.D2(terminalSession);
                }
            };
            if (terminalSession.M() != null) {
                terminalSession.M().z(bVarA1);
                terminalSession.M().w(aVar3);
            } else {
                b9.d dVar = new b9.d();
                dVar.y(terminalSession.getOSType());
                dVar.z(bVarA1);
                dVar.w(aVar3);
                terminalSession.c0(dVar);
            }
            A2();
            this.P.B0();
        }
        y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TerminalActivityViewModel C1() {
        return (TerminalActivityViewModel) this.f38865f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(TerminalActivity terminalActivity) {
        CopyPasteModeManager copyPasteModeManager = terminalActivity.A;
        if (copyPasteModeManager == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager = null;
        }
        copyPasteModeManager.d();
        terminalActivity.B2();
    }

    private final k9.d D1() {
        return (k9.d) this.f38863a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D2(g9.a aVar) {
        return aVar.X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeScreenViewModel E1() {
        return (HomeScreenViewModel) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        tm.m mVar = this.B;
        if (mVar == null) {
            ju.t.t("terminalTabIndicatorLayout");
            mVar = null;
        }
        mVar.v();
    }

    private final void F1(SnippetItem snippetItem) {
        String strC;
        Object next;
        com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.c cVarA;
        TypedSessionId typedSessionIdD;
        int sessionId;
        g9.a terminalSession;
        b9.c cVarV;
        List listA = ((com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.z) E1().getConnectionTabBarItems().getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof d.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((d.a) obj2).a().d() instanceof TypedSessionId.PortForwarding)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            strC = null;
            if (it.hasNext()) {
                next = it.next();
                if (((d.a) next).a().j()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        d.a aVar = (d.a) next;
        if (aVar == null) {
            aVar = (d.a) vt.v.r0(arrayList2);
        }
        if (aVar == null || (cVarA = aVar.a()) == null || (typedSessionIdD = cVarA.d()) == null || (sessionId = typedSessionIdD.getSessionId()) <= -1 || (terminalSession = SessionManager.getInstance().getTerminalSession(sessionId)) == null) {
            return;
        }
        String script = snippetItem.getScript();
        d9.a aVarS = terminalSession.S();
        if (aVarS != null && (cVarV = aVarS.v()) != null) {
            strC = cVarV.c();
        }
        if (strC == null) {
            strC = "";
        }
        ju.t.c(script);
        terminalSession.B(q2(strC, script));
        com.server.auditor.ssh.client.utils.analytics.a.y().e5(SnippetSourceOrigin.AUTOCOMPLETE, snippetItem.isShared(), snippetItem.getPackageId(), this.W.a(this.W.c(snippetItem.getScriptStructure())), String.valueOf(snippetItem.getRemoteId()));
    }

    private final void F2() {
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = this.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
        if (bVar == null || !bVar.Cf()) {
            return;
        }
        this.P.B0();
    }

    private final boolean G1(long j10) {
        HostDBModel itemByLocalId = hg.f.p().i().getItemByLocalId(j10);
        if (itemByLocalId == null || ju.t.b(itemByLocalId.getVaultKeyId(), VaultKeyId.Companion.a()) || !itemByLocalId.hasGroup()) {
            return true;
        }
        Long groupId = itemByLocalId.getGroupId();
        ju.t.e(groupId, "getGroupId(...)");
        return H1(groupId.longValue());
    }

    private final void G2() {
        o7 o7Var = this.f38864b0;
        o7 o7Var2 = null;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        z0.F0(o7Var.f73434k, new o4.i0() { // from class: nm.l0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TerminalActivity.H2(this.f66913a, view, a2Var);
            }
        });
        o7 o7Var3 = this.f38864b0;
        if (o7Var3 == null) {
            ju.t.t("binding");
            o7Var3 = null;
        }
        z0.F0(o7Var3.f73425b, new o4.i0() { // from class: nm.m0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TerminalActivity.I2(view, a2Var);
            }
        });
        o7 o7Var4 = this.f38864b0;
        if (o7Var4 == null) {
            ju.t.t("binding");
            o7Var4 = null;
        }
        z0.F0(o7Var4.f73427d, new o4.i0() { // from class: nm.n0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TerminalActivity.K2(view, a2Var);
            }
        });
        o7 o7Var5 = this.f38864b0;
        if (o7Var5 == null) {
            ju.t.t("binding");
        } else {
            o7Var2 = o7Var5;
        }
        z0.F0(o7Var2.f73426c, new o4.i0() { // from class: nm.t
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TerminalActivity.L2(this.f66979a, view, a2Var);
            }
        });
    }

    private final boolean H1(long j10) {
        if (this.U.z()) {
            return true;
        }
        return I1(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 H2(TerminalActivity terminalActivity, View view, a2 a2Var) {
        ju.t.f(view, "<unused var>");
        ju.t.f(a2Var, "insets");
        int i10 = a2Var.f(a2.l.h()).f47584b;
        o7 o7Var = terminalActivity.f38864b0;
        o7 o7Var2 = null;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        ViewGroup.LayoutParams layoutParams = o7Var.f73438o.getLayoutParams();
        ju.t.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f7623a = i10;
        o7 o7Var3 = terminalActivity.f38864b0;
        if (o7Var3 == null) {
            ju.t.t("binding");
        } else {
            o7Var2 = o7Var3;
        }
        o7Var2.f73438o.setLayoutParams(bVar);
        return a2Var;
    }

    private final boolean I1(long j10) {
        GroupDBModel groupDBModelZ1 = z1(j10);
        return groupDBModelZ1 == null || !dq.f.f47917a.a(groupDBModelZ1.getCredentialsMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 I2(View view, a2 a2Var) {
        ju.t.f(view, "v");
        ju.t.f(a2Var, "insets");
        view.setPadding(0, 0, a2Var.f(a2.l.g()).f47585c, Math.max(a2Var.f(a2.l.g()).f47586d, a2Var.f(a2.l.d()).f47586d));
        return a2Var;
    }

    private final boolean J1(KeyEvent keyEvent) {
        om.b bVar = this.f38870y;
        om.d dVar = null;
        if (bVar == null) {
            ju.t.t("completionPopup");
            bVar = null;
        }
        if (!bVar.d()) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            if (keyEvent.getAction() == 1) {
                om.d dVar2 = this.f38868w;
                if (dVar2 == null) {
                    ju.t.t("completionAdapter");
                } else {
                    dVar = dVar2;
                }
                dVar.j();
            }
            return true;
        }
        if (keyCode == 20) {
            if (keyEvent.getAction() == 1) {
                om.d dVar3 = this.f38868w;
                if (dVar3 == null) {
                    ju.t.t("completionAdapter");
                } else {
                    dVar = dVar3;
                }
                dVar.i();
            }
            return true;
        }
        if (keyCode != 66) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            om.d dVar4 = this.f38868w;
            if (dVar4 == null) {
                ju.t.t("completionAdapter");
                dVar4 = null;
            }
            if (dVar4.e()) {
                om.d dVar5 = this.f38868w;
                if (dVar5 == null) {
                    ju.t.t("completionAdapter");
                    dVar5 = null;
                }
                dVar5.b();
            }
        }
        om.d dVar6 = this.f38868w;
        if (dVar6 == null) {
            ju.t.t("completionAdapter");
        } else {
            dVar = dVar6;
        }
        return dVar.e();
    }

    private final void K1() {
        a2();
        L1();
        Z1();
        O1();
        R1();
        P1();
        M1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 K2(View view, a2 a2Var) {
        ju.t.f(view, "v");
        ju.t.f(a2Var, "insets");
        view.setPadding(0, 0, a2Var.f(a2.l.g()).f47585c, Math.max(a2Var.f(a2.l.g()).f47586d, a2Var.f(a2.l.d()).f47586d));
        return a2Var;
    }

    private final void L1() {
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.c.b(this.V);
        o7 o7Var = this.f38864b0;
        ConstraintLayout constraintLayout = null;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        this.f38866u = o7Var.f73434k;
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
            o7Var2 = null;
        }
        LinearLayout linearLayout = o7Var2.f73439p;
        this.f38867v = linearLayout;
        if (linearLayout == null) {
            ju.t.t("additionalKeyboardLayout");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        om.d dVar = new om.d(C1().getCompletionList());
        this.f38868w = dVar;
        this.f38870y = new om.b(this, dVar);
        LinearLayout linearLayout2 = this.f38867v;
        if (linearLayout2 == null) {
            ju.t.t("additionalKeyboardLayout");
            linearLayout2 = null;
        }
        ConstraintLayout constraintLayout2 = this.f38866u;
        if (constraintLayout2 == null) {
            ju.t.t("baseBackground");
        } else {
            constraintLayout = constraintLayout2;
        }
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = new com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f(this, linearLayout2, constraintLayout);
        this.f38869x = fVar;
        fVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 L2(TerminalActivity terminalActivity, View view, a2 a2Var) {
        ju.t.f(view, "v");
        ju.t.f(a2Var, "insets");
        int dimensionPixelSize = terminalActivity.getResources().getDimensionPixelSize(R.dimen.key_text_view_height);
        view.setPadding(0, 0, a2Var.f(a2.l.g()).f47585c, Math.max(a2Var.f(a2.l.g()).f47586d + dimensionPixelSize, a2Var.f(a2.l.d()).f47586d + dimensionPixelSize));
        return a2Var;
    }

    private final void M1() {
        o7 o7Var = this.f38864b0;
        View view = null;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        FrameLayout frameLayout = o7Var.f73426c;
        ju.t.e(frameLayout, "additionalPopupLayout");
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
            o7Var2 = null;
        }
        FrameLayout frameLayout2 = o7Var2.f73427d;
        ju.t.e(frameLayout2, "aiPopupLayout");
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.activate_snippets_popup_layout, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.activate_snippets_layout);
        this.F = viewFindViewById;
        if (viewFindViewById == null) {
            ju.t.t("activateSnippetsLayout");
            viewFindViewById = null;
        }
        this.G = viewFindViewById.findViewById(R.id.activate_snippet_promotion);
        View view2 = this.F;
        if (view2 == null) {
            ju.t.t("activateSnippetsLayout");
            view2 = null;
        }
        this.H = (AppCompatTextView) view2.findViewById(R.id.activate_snippets_close_button);
        View view3 = this.F;
        if (view3 == null) {
            ju.t.t("activateSnippetsLayout");
            view3 = null;
        }
        this.I = (AppCompatTextView) view3.findViewById(R.id.activate_snippets_first_command_review);
        View view4 = this.F;
        if (view4 == null) {
            ju.t.t("activateSnippetsLayout");
            view4 = null;
        }
        this.J = (AppCompatTextView) view4.findViewById(R.id.activate_snippets_second_command_review);
        View view5 = this.F;
        if (view5 == null) {
            ju.t.t("activateSnippetsLayout");
            view5 = null;
        }
        this.K = (AppCompatTextView) view5.findViewById(R.id.activate_snippets_third_command_review);
        View view6 = this.F;
        if (view6 == null) {
            ju.t.t("activateSnippetsLayout");
            view6 = null;
        }
        this.L = (MaterialButton) view6.findViewById(R.id.activate_snippets_button);
        View view7 = this.F;
        if (view7 == null) {
            ju.t.t("activateSnippetsLayout");
            view7 = null;
        }
        this.M = view7.findViewById(R.id.activate_snippet_finish);
        View view8 = this.F;
        if (view8 == null) {
            ju.t.t("activateSnippetsLayout");
            view8 = null;
        }
        this.N = (AppCompatTextView) view8.findViewById(R.id.activate_snippet_header_title);
        View view9 = this.F;
        if (view9 == null) {
            ju.t.t("activateSnippetsLayout");
        } else {
            view = view9;
        }
        this.O = (AppCompatImageView) view.findViewById(R.id.add_snippets_open_snippets_button_example);
        frameLayout.addView(viewInflate);
        this.P.T(frameLayout2, new iu.a() { // from class: nm.b0
            @Override // iu.a
            public final Object a() {
                return TerminalActivity.N1(this.f66893a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.ssh.terminal.b N1(TerminalActivity terminalActivity) {
        com.server.auditor.ssh.client.ssh.terminal.c cVar = terminalActivity.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = terminalActivity.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        if (fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b) {
            return (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS;
        }
        return null;
    }

    private final void O1() {
        this.A = new CopyPasteModeManager(this, getWindow());
        PopupMenu popupMenu = new PopupMenu(this, getWindow().getDecorView());
        popupMenu.inflate(R.menu.copy_paste_menu);
        CopyPasteModeManager copyPasteModeManager = this.A;
        if (copyPasteModeManager == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager = null;
        }
        copyPasteModeManager.i(popupMenu.getMenu());
    }

    private final void P1() {
        w2(b2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Q1(TerminalActivity terminalActivity, Integer num) {
        bh.a.b(terminalActivity, terminalActivity.new f(null));
        return m0.f82633a;
    }

    private final void R1() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("parameter_history", -1);
            S1(intExtra);
            int iIndexOf = SessionManager.getInstance().getTerminalSessionIds().indexOf(Integer.valueOf(intExtra));
            o7 o7Var = this.f38864b0;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            ScrollableViewPager scrollableViewPager = o7Var.f73437n;
            if (iIndexOf == -1) {
                iIndexOf = 0;
            }
            scrollableViewPager.setCurrentItem(iIndexOf, false);
        }
    }

    private final void S1(int i10) {
        ConstraintLayout constraintLayout;
        com.server.auditor.ssh.client.ssh.terminal.c cVar;
        ConnectionType type;
        ActiveConnection activeConnectionA;
        E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(i10));
        List<Integer> sFTPSessionIds = SessionManager.getInstance().getSFTPSessionIds();
        ju.t.e(sFTPSessionIds, "getSFTPSessionIds(...)");
        ArrayList arrayList = new ArrayList();
        for (Integer num : sFTPSessionIds) {
            ju.t.c(num);
            arrayList.add(new TypedSessionId.Sftp(num.intValue()));
        }
        List<Integer> terminalSessionIds = SessionManager.getInstance().getTerminalSessionIds();
        ju.t.e(terminalSessionIds, "getTerminalSessionIds(...)");
        ArrayList arrayList2 = new ArrayList(vt.v.z(terminalSessionIds, 10));
        for (Integer num2 : terminalSessionIds) {
            SessionManager sessionManager = SessionManager.getInstance();
            ju.t.c(num2);
            zl.d terminalConnectionHolder = sessionManager.getTerminalConnectionHolder(num2.intValue());
            if (terminalConnectionHolder == null || (activeConnectionA = terminalConnectionHolder.a()) == null || (type = activeConnectionA.getType()) == null) {
                type = ConnectionType.none;
            }
            arrayList2.add(new TypedSessionId.Terminal(num2.intValue(), type));
        }
        List listR0 = vt.v.R0(vt.v.J0(arrayList, arrayList2), new g());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ju.t.e(supportFragmentManager, "getSupportFragmentManager(...)");
        this.C = new com.server.auditor.ssh.client.ssh.terminal.c(supportFragmentManager, vt.v.g1(listR0), new h());
        o7 o7Var = this.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        o7Var.f73437n.setOffscreenPageLimit(5);
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
            o7Var2 = null;
        }
        ScrollableViewPager scrollableViewPager = o7Var2.f73437n;
        com.server.auditor.ssh.client.ssh.terminal.c cVar2 = this.C;
        if (cVar2 == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar2 = null;
        }
        scrollableViewPager.setAdapter(cVar2);
        o7 o7Var3 = this.f38864b0;
        if (o7Var3 == null) {
            ju.t.t("binding");
            o7Var3 = null;
        }
        o7Var3.f73437n.c(this);
        HomeScreenViewModel homeScreenViewModelE1 = E1();
        SftpAnnouncementViewModel sftpAnnouncementViewModelB1 = B1();
        ConstraintLayout constraintLayout2 = this.f38866u;
        if (constraintLayout2 == null) {
            ju.t.t("baseBackground");
            constraintLayout = null;
        } else {
            constraintLayout = constraintLayout2;
        }
        com.server.auditor.ssh.client.ssh.terminal.c cVar3 = this.C;
        if (cVar3 == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        } else {
            cVar = cVar3;
        }
        this.B = new tm.m(homeScreenViewModelE1, sftpAnnouncementViewModelB1, constraintLayout, cVar, D1(), new iu.a() { // from class: nm.u
            @Override // iu.a
            public final Object a() {
                return TerminalActivity.T1(this.f66982a);
            }
        }, new iu.l() { // from class: nm.v
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.U1(this.f66985a, ((Integer) obj).intValue());
            }
        }, new iu.l() { // from class: nm.w
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.V1(this.f66987a, (SnippetItem) obj);
            }
        }, new iu.l() { // from class: nm.x
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.W1(this.f66989a, (SnippetItem) obj);
            }
        }, new iu.l() { // from class: nm.y
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.X1(this.f66990a, (TypedSessionId) obj);
            }
        }, new iu.a() { // from class: nm.z
            @Override // iu.a
            public final Object a() {
                return TerminalActivity.Y1(this.f66991a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 T1(TerminalActivity terminalActivity) {
        terminalActivity.A2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 U1(TerminalActivity terminalActivity, int i10) {
        o7 o7Var = terminalActivity.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        o7Var.f73437n.setCurrentItem(i10, false);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 V1(TerminalActivity terminalActivity, SnippetItem snippetItem) {
        ju.t.f(snippetItem, "snippetItem");
        com.server.auditor.ssh.client.ssh.terminal.c cVar = terminalActivity.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = terminalActivity.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
        if (bVar != null) {
            g9.a terminalSession = SessionManager.getInstance().getTerminalSession(bVar.zf());
            if (terminalSession != null) {
                terminalSession.w(snippetItem.getScript() + "\r");
                com.server.auditor.ssh.client.utils.analytics.a.y().e5(SnippetSourceOrigin.SNIPPETS_PANEL, snippetItem.isShared(), snippetItem.getPackageId(), 0, String.valueOf(snippetItem.getRemoteId()));
            }
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 W1(TerminalActivity terminalActivity, SnippetItem snippetItem) {
        ju.t.f(snippetItem, "snippetItem");
        terminalActivity.F1(snippetItem);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 X1(TerminalActivity terminalActivity, TypedSessionId typedSessionId) {
        ju.t.f(typedSessionId, "sftpId");
        com.server.auditor.ssh.client.ssh.terminal.c cVar = terminalActivity.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        cVar.u(terminalActivity.j2());
        terminalActivity.E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(typedSessionId.getSessionId()));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Y1(TerminalActivity terminalActivity) {
        com.server.auditor.ssh.client.ssh.terminal.c cVar = terminalActivity.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        cVar.u(terminalActivity.j2());
        return m0.f82633a;
    }

    private final void Z1() {
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38869x;
        com.server.auditor.ssh.client.ssh.terminal.e eVar = null;
        if (fVar == null) {
            ju.t.t("moreKeyboardManager");
            fVar = null;
        }
        com.server.auditor.ssh.client.ssh.terminal.e eVar2 = new com.server.auditor.ssh.client.ssh.terminal.e(this, fVar, this);
        this.f38871z = eVar2;
        eVar2.h(C1().getTerminalParameters().a(), C1().getTerminalParameters().b());
        com.server.auditor.ssh.client.ssh.terminal.e eVar3 = this.f38871z;
        if (eVar3 == null) {
            ju.t.t("userInputListener");
        } else {
            eVar = eVar3;
        }
        eVar.g(C1().getTerminalParameters().d(), C1().getTerminalParameters().c());
    }

    private final void a2() {
        Object systemService = getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        this.R = sensorManager;
        if (sensorManager != null) {
            this.S = sensorManager.getDefaultSensor(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b2() {
        return this.V.getBoolean("is_last_gesture_mode", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 e2(TerminalActivity terminalActivity, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        com.server.auditor.ssh.client.interactors.snippets.a aVar = terminalActivity.E;
        if (aVar == null) {
            ju.t.t("activateIntoSnippetsTerminalInteractor");
            aVar = null;
        }
        if (!aVar.g()) {
            e0Var.j(false);
            terminalActivity.getOnBackPressedDispatcher().l();
            e0Var.j(true);
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(ActivityResult activityResult) {
        if (activityResult.getResultCode() != -1) {
            return;
        }
        this.P.q0();
        this.P.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(TerminalActivity terminalActivity) {
        terminalActivity.v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(TerminalActivity terminalActivity) {
        terminalActivity.B2();
        terminalActivity.F2();
    }

    private final boolean i2(KeyEvent keyEvent) {
        Connection connectionXf;
        Connection connectionCloneConnection;
        if (!tp.u.a(keyEvent)) {
            return J1(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        o7 o7Var = null;
        o7 o7Var2 = null;
        if (keyCode == 21) {
            if (keyEvent.getAction() == 1) {
                o7 o7Var3 = this.f38864b0;
                if (o7Var3 == null) {
                    ju.t.t("binding");
                    o7Var3 = null;
                }
                if (o7Var3.f73437n.getCurrentItem() - 1 >= 0) {
                    o7 o7Var4 = this.f38864b0;
                    if (o7Var4 == null) {
                        ju.t.t("binding");
                    } else {
                        o7Var = o7Var4;
                    }
                    ScrollableViewPager scrollableViewPager = o7Var.f73437n;
                    scrollableViewPager.setCurrentItem(scrollableViewPager.getCurrentItem() - 1);
                    String string = getString(R.string.hotkeys_jump_left);
                    ju.t.e(string, "getString(...)");
                    t2(string);
                }
            }
            return true;
        }
        if (keyCode == 22) {
            if (keyEvent.getAction() == 1) {
                o7 o7Var5 = this.f38864b0;
                if (o7Var5 == null) {
                    ju.t.t("binding");
                    o7Var5 = null;
                }
                int currentItem = o7Var5.f73437n.getCurrentItem() + 1;
                com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
                if (cVar == null) {
                    ju.t.t("terminalFragmentViewPagerAdapter");
                    cVar = null;
                }
                if (currentItem < cVar.c()) {
                    o7 o7Var6 = this.f38864b0;
                    if (o7Var6 == null) {
                        ju.t.t("binding");
                    } else {
                        o7Var2 = o7Var6;
                    }
                    ScrollableViewPager scrollableViewPager2 = o7Var2.f73437n;
                    scrollableViewPager2.setCurrentItem(scrollableViewPager2.getCurrentItem() + 1);
                    String string2 = getString(R.string.hotkeys_jump_right);
                    ju.t.e(string2, "getString(...)");
                    t2(string2);
                }
            }
            return true;
        }
        if (keyCode == 42) {
            if (keyEvent.getAction() == 1) {
                com.server.auditor.ssh.client.ssh.terminal.c cVar2 = this.C;
                if (cVar2 == null) {
                    ju.t.t("terminalFragmentViewPagerAdapter");
                    cVar2 = null;
                }
                o7 o7Var7 = this.f38864b0;
                if (o7Var7 == null) {
                    ju.t.t("binding");
                    o7Var7 = null;
                }
                Fragment fragmentS = cVar2.s(o7Var7.f73437n.getCurrentItem());
                com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
                if (bVar != null && (connectionXf = bVar.xf()) != null && (connectionCloneConnection = connectionXf.cloneConnection()) != null) {
                    connectionCloneConnection.setUUID(null);
                    TerminalConnectionManager.enqueueStartTerminalSession(connectionCloneConnection);
                }
                String string3 = getString(R.string.hotkeys_clone_connection);
                ju.t.e(string3, "getString(...)");
                t2(string3);
            }
            return true;
        }
        if (keyCode == 48) {
            if (keyEvent.getAction() == 1) {
                u2();
                String string4 = getString(R.string.hotkeys_show_quickconnect_toast);
                ju.t.e(string4, "getString(...)");
                t2(string4);
            }
            return true;
        }
        if (keyCode != 51) {
            return J1(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            com.server.auditor.ssh.client.ssh.terminal.c cVar3 = this.C;
            if (cVar3 == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar3 = null;
            }
            o7 o7Var8 = this.f38864b0;
            if (o7Var8 == null) {
                ju.t.t("binding");
                o7Var8 = null;
            }
            Fragment fragmentS2 = cVar3.s(o7Var8.f73437n.getCurrentItem());
            com.server.auditor.ssh.client.ssh.terminal.b bVar2 = fragmentS2 instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS2 : null;
            if (bVar2 != null) {
                SessionManager.getInstance().disconnectTerminalSession(bVar2.zf());
            }
            String string5 = getString(R.string.hotkeys_close_tab);
            ju.t.e(string5, "getString(...)");
            t2(string5);
        }
        return true;
    }

    private final List j2() {
        ConnectionType type;
        ActiveConnection activeConnectionA;
        List<Integer> sFTPSessionIds = SessionManager.getInstance().getSFTPSessionIds();
        ju.t.e(sFTPSessionIds, "getSFTPSessionIds(...)");
        ArrayList arrayList = new ArrayList();
        for (Integer num : sFTPSessionIds) {
            ju.t.c(num);
            arrayList.add(new TypedSessionId.Sftp(num.intValue()));
        }
        List<Integer> terminalSessionIds = SessionManager.getInstance().getTerminalSessionIds();
        ju.t.e(terminalSessionIds, "getTerminalSessionIds(...)");
        ArrayList arrayList2 = new ArrayList(vt.v.z(terminalSessionIds, 10));
        for (Integer num2 : terminalSessionIds) {
            SessionManager sessionManager = SessionManager.getInstance();
            ju.t.c(num2);
            zl.d terminalConnectionHolder = sessionManager.getTerminalConnectionHolder(num2.intValue());
            if (terminalConnectionHolder == null || (activeConnectionA = terminalConnectionHolder.a()) == null || (type = activeConnectionA.getType()) == null) {
                type = ConnectionType.none;
            }
            arrayList2.add(new TypedSessionId.Terminal(num2.intValue(), type));
        }
        return vt.v.R0(vt.v.J0(arrayList, arrayList2), new q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(List list) {
        AppCompatTextView appCompatTextView = this.I;
        View view = null;
        if (appCompatTextView == null) {
            ju.t.t("commandsReview1");
            appCompatTextView = null;
        }
        AppCompatTextView appCompatTextView2 = this.J;
        if (appCompatTextView2 == null) {
            ju.t.t("commandsReview2");
            appCompatTextView2 = null;
        }
        AppCompatTextView appCompatTextView3 = this.K;
        if (appCompatTextView3 == null) {
            ju.t.t("commandsReview3");
            appCompatTextView3 = null;
        }
        AppCompatTextView[] appCompatTextViewArr = {appCompatTextView, appCompatTextView2, appCompatTextView3};
        if (list.size() != 3) {
            return;
        }
        View view2 = this.F;
        if (view2 == null) {
            ju.t.t("activateSnippetsLayout");
            view2 = null;
        }
        view2.setVisibility(0);
        View view3 = this.F;
        if (view3 == null) {
            ju.t.t("activateSnippetsLayout");
            view3 = null;
        }
        view3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        View view4 = this.F;
        if (view4 == null) {
            ju.t.t("activateSnippetsLayout");
            view4 = null;
        }
        view4.setClipToOutline(true);
        int i10 = 0;
        int i11 = 0;
        while (i10 < 3) {
            appCompatTextViewArr[i10].setText((CharSequence) list.get(i11));
            i10++;
            i11++;
        }
        View view5 = this.G;
        if (view5 == null) {
            ju.t.t("promoCard");
            view5 = null;
        }
        view5.setVisibility(0);
        MaterialButton materialButton = this.L;
        if (materialButton == null) {
            ju.t.t("addToSnippetsButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: nm.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                TerminalActivity.l2(this.f66896a, view6);
            }
        });
        AppCompatTextView appCompatTextView4 = this.H;
        if (appCompatTextView4 == null) {
            ju.t.t("headerCloseButton");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setOnClickListener(new View.OnClickListener() { // from class: nm.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                TerminalActivity.n2(this.f66900a, view6);
            }
        });
        AppCompatImageView appCompatImageView = this.O;
        if (appCompatImageView == null) {
            ju.t.t("snippetHintIcon");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: nm.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                TerminalActivity.o2(this.f66902a, view6);
            }
        });
        View view6 = this.F;
        if (view6 == null) {
            ju.t.t("activateSnippetsLayout");
        } else {
            view = view6;
        }
        view.invalidate();
    }

    private final void l0() {
        this.U.U().k(new u(new iu.l() { // from class: nm.a0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.Q1(this.f66891a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(TerminalActivity terminalActivity, View view) {
        bh.a.b(terminalActivity, terminalActivity.new r(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(TerminalActivity terminalActivity, View view) {
        bh.a.b(terminalActivity, terminalActivity.new s(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(TerminalActivity terminalActivity, View view) {
        bh.a.b(terminalActivity, terminalActivity.new t(null));
    }

    private final void p2() {
        om.k.f69124d.a().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final char[] q2(String str, String str2) {
        char[] cArrC = a9.e.c(a9.f.Key_BackSpace);
        int length = str.length();
        char[] charArray = (str2 + " ").toCharArray();
        ju.t.e(charArray, "toCharArray(...)");
        char[] cArr = new char[(cArrC.length * length) + charArray.length];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int length2 = cArrC.length;
            int i13 = 0;
            while (i13 < length2) {
                cArr[i11] = cArrC[i13];
                i13++;
                i11++;
            }
        }
        int length3 = charArray.length;
        while (i10 < length3) {
            cArr[i11] = charArray[i10];
            i10++;
            i11++;
        }
        return cArr;
    }

    private final void s2() {
        e8 e8VarVf;
        TerminalView terminalView;
        C1().setNeedDrawCursor(true);
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        if (cVar.c() != 0) {
            com.server.auditor.ssh.client.ssh.terminal.c cVar2 = this.C;
            if (cVar2 == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar2 = null;
            }
            o7 o7Var = this.f38864b0;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            Fragment fragmentS = cVar2.s(o7Var.f73437n.getCurrentItem());
            com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
            if (bVar == null || (e8VarVf = bVar.vf()) == null || (terminalView = e8VarVf.f72390g) == null) {
                return;
            }
            terminalView.w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 t1(TerminalActivity terminalActivity, boolean z10) {
        com.server.auditor.ssh.client.ssh.terminal.c cVar = terminalActivity.C;
        LinearLayout linearLayout = null;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = terminalActivity.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        LinearLayout linearLayout2 = terminalActivity.f38867v;
        if (linearLayout2 == null) {
            ju.t.t("additionalKeyboardLayout");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(!z10 && (fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b) ? 0 : 8);
        return m0.f82633a;
    }

    private final void t2(String str) {
        Toast toast = this.T;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(this, str, 0);
        toastMakeText.show();
        this.T = toastMakeText;
    }

    private final z9.c u1(com.server.auditor.ssh.client.ssh.terminal.b bVar) {
        return new c(bVar);
    }

    private final void u2() {
        E1().updateShowStartNewTerminalConnectionVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1() {
        om.b bVar = this.f38870y;
        if (bVar == null) {
            ju.t.t("completionPopup");
            bVar = null;
        }
        if (bVar.d()) {
            om.b bVar2 = this.f38870y;
            if (bVar2 == null) {
                ju.t.t("completionPopup");
                bVar2 = null;
            }
            bVar2.b();
            com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
            if (cVar == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar = null;
            }
            o7 o7Var = this.f38864b0;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
            com.server.auditor.ssh.client.ssh.terminal.b bVar3 = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
            if (bVar3 != null) {
                g9.a terminalSession = SessionManager.getInstance().getTerminalSession(bVar3.zf());
                if (terminalSession == null || terminalSession.M() == null) {
                    return;
                }
                terminalSession.M().g();
            }
        }
    }

    private final void w2(boolean z10) {
        this.V.edit().putBoolean("is_last_gesture_mode", z10).apply();
        o7 o7Var = null;
        if (z10) {
            o7 o7Var2 = this.f38864b0;
            if (o7Var2 == null) {
                ju.t.t("binding");
            } else {
                o7Var = o7Var2;
            }
            o7Var.f73437n.R();
        } else if (this.U.u0()) {
            o7 o7Var3 = this.f38864b0;
            if (o7Var3 == null) {
                ju.t.t("binding");
            } else {
                o7Var = o7Var3;
            }
            o7Var.f73437n.S();
        }
        B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1() {
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38869x;
        CopyPasteModeManager copyPasteModeManager = null;
        if (fVar == null) {
            ju.t.t("moreKeyboardManager");
            fVar = null;
        }
        fVar.A();
        qm.f fVar2 = this.Q;
        if (fVar2 != null) {
            fVar2.a();
        }
        CopyPasteModeManager copyPasteModeManager2 = this.A;
        if (copyPasteModeManager2 == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager2 = null;
        }
        if (copyPasteModeManager2.f() != null) {
            CopyPasteModeManager copyPasteModeManager3 = this.A;
            if (copyPasteModeManager3 == null) {
                ju.t.t("copyPasteModeManager");
            } else {
                copyPasteModeManager = copyPasteModeManager3;
            }
            copyPasteModeManager.f().j();
        }
        w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k9.d x2(TerminalActivity terminalActivity) {
        return k9.d.f63270c.b(terminalActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y1(String str) {
        if (su.s.Y(str, "https://", false, 2, null) || su.s.Y(str, "http://", false, 2, null)) {
            return str;
        }
        return "https://" + str;
    }

    private final void y2() {
        d9.a aVarS;
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        o7 o7Var = null;
        LinearLayout linearLayout = null;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
            o7Var2 = null;
        }
        Fragment fragmentS = cVar.s(o7Var2.f73437n.getCurrentItem());
        if (fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b) {
            com.server.auditor.ssh.client.ssh.terminal.b bVar = (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS;
            int iZf = bVar.zf();
            e8 e8VarVf = bVar.vf();
            TerminalView terminalView = e8VarVf != null ? e8VarVf.f72390g : null;
            g9.a terminalSession = terminalView != null ? terminalView.getTerminalSession() : null;
            if (terminalSession != null && (aVarS = terminalSession.S()) != null) {
                terminalView.setContentDescription(aVarS.A());
            }
            tp.g.a().k(new wm.a(iZf, bVar.xf()));
            E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(iZf));
            LinearLayout linearLayout2 = this.f38867v;
            if (linearLayout2 == null) {
                ju.t.t("additionalKeyboardLayout");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(this.P.i0() ? 8 : 0);
            return;
        }
        if (fragmentS instanceof nk.y) {
            Bundle arguments = ((nk.y) fragmentS).getArguments();
            int i10 = arguments != null ? arguments.getInt("session_id_key", 0) : 0;
            if (i10 > 0) {
                E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(i10));
            }
            LinearLayout linearLayout3 = this.f38867v;
            if (linearLayout3 == null) {
                ju.t.t("additionalKeyboardLayout");
                linearLayout3 = null;
            }
            linearLayout3.setVisibility(8);
            o7 o7Var3 = this.f38864b0;
            if (o7Var3 == null) {
                ju.t.t("binding");
            } else {
                o7Var = o7Var3;
            }
            xl.a.a(this, o7Var.f73437n);
        }
    }

    private final GroupDBModel z1(long j10) {
        GroupDBModel itemByLocalId = hg.f.p().h().getItemByLocalId(j10);
        if (itemByLocalId == null) {
            return null;
        }
        if (itemByLocalId.getParentGroupId() == null) {
            return itemByLocalId;
        }
        Long parentGroupId = itemByLocalId.getParentGroupId();
        ju.t.e(parentGroupId, "getParentGroupId(...)");
        return z1(parentGroupId.longValue());
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.d.b
    public void d() {
        bh.a.b(this, new b(null));
    }

    public final void d2() {
        bh.a.b(this, new i(null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ju.t.f(keyEvent, EventStreamParser.EVENT_FIELD);
        com.server.auditor.ssh.client.ssh.terminal.e eVar = this.f38871z;
        if (eVar == null) {
            ju.t.t("userInputListener");
            eVar = null;
        }
        return eVar.b(keyEvent) || i2(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.server.auditor.ssh.client.interactors.snippets.a.InterfaceC0441a
    public void e() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.interactors.snippets.a.InterfaceC0441a
    public void i() {
        bh.a.b(this, new o(null));
    }

    @Override // kj.d
    public void l() {
        if (SessionManager.getInstance().getTerminalSessionIds().size() > 1) {
            o7 o7Var = this.f38864b0;
            o7 o7Var2 = null;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            int currentItem = o7Var.f73437n.getCurrentItem();
            if (currentItem == 0) {
                return;
            }
            o7 o7Var3 = this.f38864b0;
            if (o7Var3 == null) {
                ju.t.t("binding");
            } else {
                o7Var2 = o7Var3;
            }
            o7Var2.f73437n.setCurrentItem(currentItem - 1);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void o(int i10, float f10, int i11) {
    }

    @pw.m
    public final void onAiAssistantClick(pm.a aVar) {
        ju.t.f(aVar, EventStreamParser.EVENT_FIELD);
        w1();
        this.P.m0();
    }

    @pw.m
    public final void onAutocompleteEnableStateChange(b9.f fVar) {
        ju.t.f(fVar, "enableStateChangeEvent");
        w1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ju.t.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        this.P.F0(configuration);
        CopyPasteModeManager copyPasteModeManager = this.A;
        LinearLayout linearLayout = null;
        if (copyPasteModeManager == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager = null;
        }
        if (copyPasteModeManager.f() != null) {
            CopyPasteModeManager copyPasteModeManager2 = this.A;
            if (copyPasteModeManager2 == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager2 = null;
            }
            copyPasteModeManager2.f().j();
        }
        LinearLayout linearLayout2 = this.f38867v;
        if (linearLayout2 == null) {
            ju.t.t("additionalKeyboardLayout");
            linearLayout2 = null;
        }
        int width = linearLayout2.getWidth();
        LinearLayout linearLayout3 = this.f38867v;
        if (linearLayout3 == null) {
            ju.t.t("additionalKeyboardLayout");
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new j(width, this, configuration));
    }

    @Override // com.server.auditor.ssh.client.navigation.TransparentStatusBarActivity, com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o7 o7VarC = o7.c(getLayoutInflater());
        this.f38864b0 = o7VarC;
        if (o7VarC == null) {
            ju.t.t("binding");
            o7VarC = null;
        }
        setContentView(o7VarC.b());
        C1().createMainView(this);
        if (C1().getTerminalParameters().f()) {
            getWindow().addFlags(128);
        }
        K1();
        G2();
        p2();
        tp.g.a().o(this);
        SessionManager sessionManager = SessionManager.getInstance();
        ju.t.e(sessionManager, "getInstance(...)");
        il.h hVarA1 = b2.f52944a.a1();
        p0 p0VarK = hg.f.p().K();
        ju.t.e(p0VarK, "getSnippetDBRepository(...)");
        hg.d dVarM = this.U.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        il.a aVar = new il.a(aVarY);
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        ju.t.e(syncServiceHelperY, "getSyncServiceHelper(...)");
        this.E = new com.server.auditor.ssh.client.interactors.snippets.a(sessionManager, hVarA1, p0VarK, dVarM, aVar, syncServiceHelperY, this);
        l0();
        h0.b(getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: nm.i0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TerminalActivity.e2(this.f66908a, (androidx.activity.e0) obj);
            }
        }, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tp.g.a().q(this);
        CopyPasteModeManager copyPasteModeManager = this.A;
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = null;
        if (copyPasteModeManager == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager = null;
        }
        if (copyPasteModeManager.h()) {
            CopyPasteModeManager copyPasteModeManager2 = this.A;
            if (copyPasteModeManager2 == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager2 = null;
            }
            copyPasteModeManager2.l(null);
            CopyPasteModeManager copyPasteModeManager3 = this.A;
            if (copyPasteModeManager3 == null) {
                ju.t.t("copyPasteModeManager");
                copyPasteModeManager3 = null;
            }
            copyPasteModeManager3.c();
        }
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar2 = this.f38869x;
        if (fVar2 == null) {
            ju.t.t("moreKeyboardManager");
        } else {
            fVar = fVar2;
        }
        fVar.z();
        this.P.n0();
    }

    @pw.m
    public final void onForceEnableAutocomplete(b9.g gVar) {
        ju.t.f(gVar, "forceEnableACEvent");
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38869x;
        if (fVar == null) {
            ju.t.t("moreKeyboardManager");
            fVar = null;
        }
        fVar.c0(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        com.server.auditor.ssh.client.ssh.terminal.e eVar = this.f38871z;
        if (eVar == null) {
            ju.t.t("userInputListener");
            eVar = null;
        }
        return eVar.e(i10) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        ju.t.f(configuration, "newConfig");
        super.onMultiWindowModeChanged(z10, configuration);
        if (z10) {
            s2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        ju.t.f(intent, "intent");
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        int i10 = extras != null ? extras.getInt("parameter_history", -1) : -1;
        if (i10 >= 0) {
            E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(i10));
        }
    }

    @pw.m
    public final void onPasteBufferClick(pm.b bVar) {
        ju.t.f(bVar, EventStreamParser.EVENT_FIELD);
        com.server.auditor.ssh.client.ssh.terminal.a aVar = this.D;
        if (aVar == null) {
            ju.t.t("copyPasteHelper");
            aVar = null;
        }
        aVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    @pw.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPastePasswordClick(pm.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            ju.t.f(r6, r0)
            com.server.auditor.ssh.client.utils.analytics.a r6 = com.server.auditor.ssh.client.utils.analytics.a.y()
            r6.t3()
            com.server.auditor.ssh.client.ssh.terminal.c r6 = r5.C
            r0 = 0
            if (r6 != 0) goto L17
            java.lang.String r6 = "terminalFragmentViewPagerAdapter"
            ju.t.t(r6)
            r6 = r0
        L17:
            qg.o7 r1 = r5.f38864b0
            if (r1 != 0) goto L21
            java.lang.String r1 = "binding"
            ju.t.t(r1)
            r1 = r0
        L21:
            com.server.auditor.ssh.client.widget.ScrollableViewPager r1 = r1.f73437n
            int r1 = r1.getCurrentItem()
            androidx.fragment.app.Fragment r6 = r6.s(r1)
            boolean r1 = r6 instanceof com.server.auditor.ssh.client.ssh.terminal.b
            if (r1 == 0) goto L32
            com.server.auditor.ssh.client.ssh.terminal.b r6 = (com.server.auditor.ssh.client.ssh.terminal.b) r6
            goto L33
        L32:
            r6 = r0
        L33:
            if (r6 == 0) goto Lb6
            com.server.auditor.ssh.client.models.connections.Connection r1 = r6.xf()
            if (r1 == 0) goto L40
            com.server.auditor.ssh.client.models.properties.SshProperties r1 = r1.getSshProperties()
            goto L41
        L40:
            r1 = r0
        L41:
            com.server.auditor.ssh.client.models.connections.Connection r2 = r6.xf()
            if (r2 == 0) goto L4c
            java.lang.Long r2 = r2.getHostId()
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r2 == 0) goto L58
            long r2 = r2.longValue()
            boolean r2 = r5.G1(r2)
            goto L59
        L58:
            r2 = 1
        L59:
            com.server.auditor.ssh.client.models.connections.Connection r3 = r6.xf()
            if (r3 == 0) goto L64
            com.server.auditor.ssh.client.models.connections.ConnectionType r3 = r3.getType()
            goto L65
        L64:
            r3 = r0
        L65:
            com.server.auditor.ssh.client.models.connections.ConnectionType r4 = com.server.auditor.ssh.client.models.connections.ConnectionType.ssh
            if (r3 != r4) goto L7a
            if (r1 == 0) goto L7a
            com.server.auditor.ssh.client.models.Identity r4 = r1.getIdentity()
            if (r4 == 0) goto L7a
            com.server.auditor.ssh.client.models.Identity r0 = r1.getIdentity()
            java.lang.String r0 = r0.getPassword()
            goto L91
        L7a:
            com.server.auditor.ssh.client.models.connections.ConnectionType r1 = com.server.auditor.ssh.client.models.connections.ConnectionType.telnet
            if (r3 != r1) goto L8f
            com.server.auditor.ssh.client.models.connections.Connection r1 = r6.xf()
            if (r1 == 0) goto L88
            com.server.auditor.ssh.client.models.properties.TelnetProperties r0 = r1.getTelnetProperties()
        L88:
            if (r0 == 0) goto L8f
            java.lang.String r0 = r0.getPassword()
            goto L91
        L8f:
            java.lang.String r0 = ""
        L91:
            int r6 = r6.zf()
            com.crystalnix.termius.libtermius.wrappers.SessionManager r1 = com.crystalnix.termius.libtermius.wrappers.SessionManager.getInstance()
            g9.a r6 = r1.getTerminalSession(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lab
            if (r6 == 0) goto Lab
            if (r2 == 0) goto Lab
            r6.w(r0)
            return
        Lab:
            r6 = 2132019656(0x7f1409c8, float:1.9677653E38)
            r0 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r5, r6, r0)
            r6.show()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ssh.terminal.TerminalActivity.onPastePasswordClick(pm.c):void");
    }

    @pw.m
    public final void onPasteSymbolsBufferClick(pm.d dVar) {
        ju.t.f(dVar, EventStreamParser.EVENT_FIELD);
        com.server.auditor.ssh.client.ssh.terminal.a aVar = this.D;
        if (aVar == null) {
            ju.t.t("copyPasteHelper");
            aVar = null;
        }
        aVar.i(dVar.a());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        SensorManager sensorManager;
        super.onPause();
        C1().setNeedDrawCursor(false);
        CopyPasteModeManager copyPasteModeManager = this.A;
        com.server.auditor.ssh.client.ssh.terminal.e eVar = null;
        if (copyPasteModeManager == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager = null;
        }
        copyPasteModeManager.a();
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        if (cVar.c() == 0 || (sensorManager = this.R) == null) {
            return;
        }
        com.server.auditor.ssh.client.ssh.terminal.e eVar2 = this.f38871z;
        if (eVar2 == null) {
            ju.t.t("userInputListener");
        } else {
            eVar = eVar2;
        }
        sensorManager.unregisterListener(eVar);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        SensorManager sensorManager = this.R;
        o7 o7Var = null;
        if (sensorManager != null) {
            com.server.auditor.ssh.client.ssh.terminal.e eVar = this.f38871z;
            if (eVar == null) {
                ju.t.t("userInputListener");
                eVar = null;
            }
            sensorManager.registerListener(eVar, this.S, 3);
        }
        s2();
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f fVar = this.f38869x;
        if (fVar == null) {
            ju.t.t("moreKeyboardManager");
            fVar = null;
        }
        fVar.U();
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
        } else {
            o7Var = o7Var2;
        }
        o7Var.f73437n.post(new Runnable() { // from class: nm.j0
            @Override // java.lang.Runnable
            public final void run() {
                TerminalActivity.h2(this.f66910a);
            }
        });
    }

    @pw.m
    public final void onSessionConnected(yl.a aVar) {
        ju.t.f(aVar, EventStreamParser.EVENT_FIELD);
        if (aVar.f87003d == h9.a.Terminal) {
            com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
            if (cVar == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar = null;
            }
            cVar.u(j2());
            E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(aVar.f87002c));
        }
    }

    @pw.m
    public final void onSessionDisconnected(yl.b bVar) {
        ju.t.f(bVar, EventStreamParser.EVENT_FIELD);
        List listJ2 = j2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ2) {
            if (((TypedSessionId) obj).getSessionId() != bVar.f87004a) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        com.server.auditor.ssh.client.ssh.terminal.c cVar2 = null;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        int iR = cVar.r(bVar.f87004a);
        if (iR >= 0) {
            com.server.auditor.ssh.client.ssh.terminal.c cVar3 = this.C;
            if (cVar3 == null) {
                ju.t.t("terminalFragmentViewPagerAdapter");
                cVar3 = null;
            }
            if (iR < cVar3.c()) {
                com.server.auditor.ssh.client.ssh.terminal.c cVar4 = this.C;
                if (cVar4 == null) {
                    ju.t.t("terminalFragmentViewPagerAdapter");
                    cVar4 = null;
                }
                cVar4.t(iR);
                o7 o7Var = this.f38864b0;
                if (o7Var == null) {
                    ju.t.t("binding");
                    o7Var = null;
                }
                o7Var.f73437n.setCurrentItem(iR == 0 ? 0 : iR - 1, false);
                B2();
                com.server.auditor.ssh.client.ssh.terminal.c cVar5 = this.C;
                if (cVar5 == null) {
                    ju.t.t("terminalFragmentViewPagerAdapter");
                    cVar5 = null;
                }
                o7 o7Var2 = this.f38864b0;
                if (o7Var2 == null) {
                    ju.t.t("binding");
                    o7Var2 = null;
                }
                Fragment fragmentS = cVar5.s(o7Var2.f73437n.getCurrentItem());
                if (fragmentS != null) {
                    E1().updateSelectedTab(new SelectedConnectionTab.ConnectionTabSelected(fragmentS.getArguments() != null ? r7.getInt("session_id_key", 0) : 0));
                }
                E2();
                F2();
            }
        }
        com.server.auditor.ssh.client.ssh.terminal.c cVar6 = this.C;
        if (cVar6 == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
        } else {
            cVar2 = cVar6;
        }
        cVar2.u(arrayList);
    }

    @pw.m
    public final void onSftpClick(pm.e eVar) {
        ju.t.f(eVar, EventStreamParser.EVENT_FIELD);
        bh.a.b(this, new p(null));
    }

    @pw.m
    public final void onSnippetsClick(pm.f fVar) {
        Bundle arguments;
        ju.t.f(fVar, EventStreamParser.EVENT_FIELD);
        com.server.auditor.ssh.client.interactors.snippets.a aVar = this.E;
        if (aVar == null) {
            ju.t.t("activateIntoSnippetsTerminalInteractor");
            aVar = null;
        }
        aVar.j();
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = this.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
        if (bVar != null && (arguments = bVar.getArguments()) != null) {
            ActiveConnection activeConnection = SessionManager.getInstance().getActiveConnection(Integer.valueOf(arguments.getInt("session_id_key")).intValue());
            E1().getHistoryCommands().clear();
            if (activeConnection != null && activeConnection.getHistoryCommands() != null) {
                List<String> historyCommands = E1().getHistoryCommands();
                List<String> historyCommands2 = activeConnection.getHistoryCommands();
                ju.t.e(historyCommands2, "getHistoryCommands(...)");
                historyCommands.addAll(historyCommands2);
            }
        }
        HomeScreenViewModel.updateIsSnippetsDialogVisible$default(E1(), true, null, 2, null);
    }

    @pw.m
    public final void onSoftKeyboardCloseClick(pm.g gVar) {
        ju.t.f(gVar, EventStreamParser.EVENT_FIELD);
        Object systemService = getSystemService("input_method");
        ju.t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @pw.m
    public final void onSoftKeyboardOpenClick(pm.h hVar) {
        ju.t.f(hVar, EventStreamParser.EVENT_FIELD);
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        TerminalView terminalView = (TerminalView) findViewById(R.id.terminalView);
        if (terminalView != null) {
            terminalView.requestFocus();
            View currentFocus = getCurrentFocus();
            if (inputMethodManager == null || !(currentFocus instanceof TerminalView)) {
                return;
            }
            inputMethodManager.showSoftInput(terminalView, 0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        C1().setHasFocus(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        m5.a.b(this).e(new Intent("com.crystalnix.gloria.SA_REFRESH_CONNECTIONS"));
    }

    @pw.m
    public final void onToggleGestureModeClick(pm.i iVar) {
        ju.t.f(iVar, EventStreamParser.EVENT_FIELD);
        w2(!b2());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!C1().getHasFocus() && z10) {
            C1().setIgnoreTap(true);
        }
        C1().setHasFocus(z10);
    }

    @Override // kj.d
    public void p() {
        if (SessionManager.getInstance().getTerminalSessionIds().size() > 1) {
            o7 o7Var = this.f38864b0;
            o7 o7Var2 = null;
            if (o7Var == null) {
                ju.t.t("binding");
                o7Var = null;
            }
            int currentItem = o7Var.f73437n.getCurrentItem();
            if (currentItem >= SessionManager.getInstance().getTerminalSessionIds().size() - 1) {
                return;
            }
            o7 o7Var3 = this.f38864b0;
            if (o7Var3 == null) {
                ju.t.t("binding");
            } else {
                o7Var2 = o7Var3;
            }
            o7Var2.f73437n.setCurrentItem(currentItem + 1);
        }
    }

    public final boolean r2(Fragment fragment) {
        ju.t.f(fragment, "fragment");
        o7 o7Var = this.f38864b0;
        com.server.auditor.ssh.client.ssh.terminal.c cVar = null;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        int currentItem = o7Var.f73437n.getCurrentItem();
        com.server.auditor.ssh.client.ssh.terminal.c cVar2 = this.C;
        if (cVar2 == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
        } else {
            cVar = cVar2;
        }
        Fragment fragmentS = cVar.s(currentItem);
        return (fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b) && ju.t.b(fragment, fragmentS);
    }

    @Override // com.server.auditor.ssh.client.interactors.snippets.a.InterfaceC0441a
    public void t() {
        bh.a.b(this, new n(null));
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void u(int i10) {
        e8 e8VarVf;
        TerminalView terminalView;
        com.server.auditor.ssh.client.ssh.terminal.c cVar = this.C;
        CopyPasteModeManager copyPasteModeManager = null;
        if (cVar == null) {
            ju.t.t("terminalFragmentViewPagerAdapter");
            cVar = null;
        }
        o7 o7Var = this.f38864b0;
        if (o7Var == null) {
            ju.t.t("binding");
            o7Var = null;
        }
        Fragment fragmentS = cVar.s(o7Var.f73437n.getCurrentItem());
        com.server.auditor.ssh.client.ssh.terminal.b bVar = fragmentS instanceof com.server.auditor.ssh.client.ssh.terminal.b ? (com.server.auditor.ssh.client.ssh.terminal.b) fragmentS : null;
        CopyPasteModeManager copyPasteModeManager2 = this.A;
        if (copyPasteModeManager2 == null) {
            ju.t.t("copyPasteModeManager");
            copyPasteModeManager2 = null;
        }
        if (copyPasteModeManager2.h()) {
            CopyPasteModeManager copyPasteModeManager3 = this.A;
            if (copyPasteModeManager3 == null) {
                ju.t.t("copyPasteModeManager");
            } else {
                copyPasteModeManager = copyPasteModeManager3;
            }
            copyPasteModeManager.f().j();
        }
        if (bVar == null || (e8VarVf = bVar.vf()) == null || (terminalView = e8VarVf.f72390g) == null) {
            return;
        }
        if (i10 == 0) {
            terminalView.setIsLongPressGranted(true);
        } else {
            if (i10 != 1) {
                return;
            }
            terminalView.setIsLongPressGranted(false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void v(int i10) {
        om.b bVar = this.f38870y;
        o7 o7Var = null;
        if (bVar == null) {
            ju.t.t("completionPopup");
            bVar = null;
        }
        if (bVar.d()) {
            C1().getCompletionList().clear();
            om.d dVar = this.f38868w;
            if (dVar == null) {
                ju.t.t("completionAdapter");
                dVar = null;
            }
            dVar.h();
            om.b bVar2 = this.f38870y;
            if (bVar2 == null) {
                ju.t.t("completionPopup");
                bVar2 = null;
            }
            bVar2.b();
        }
        B2();
        y2();
        E2();
        F2();
        o7 o7Var2 = this.f38864b0;
        if (o7Var2 == null) {
            ju.t.t("binding");
        } else {
            o7Var = o7Var2;
        }
        o7Var.b().post(new Runnable() { // from class: nm.k0
            @Override // java.lang.Runnable
            public final void run() {
                TerminalActivity.g2(this.f66911a);
            }
        });
    }

    public final void v1() {
        this.P.M();
    }

    public final void v2(SnippetItem snippetItem) {
        ju.t.f(snippetItem, Table.SNIPPET);
        E1().updateIsSnippetsDialogVisible(true, Long.valueOf(snippetItem.getId()));
    }

    @Override // com.server.auditor.ssh.client.interactors.snippets.a.InterfaceC0441a
    public void w() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.interactors.snippets.a.InterfaceC0441a
    public void y(List list) {
        ju.t.f(list, "commands");
        bh.a.a(this, new m(list, null));
    }
}
