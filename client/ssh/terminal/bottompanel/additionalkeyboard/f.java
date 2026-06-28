package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crystalnix.terminal.view.TerminalView;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.ManageShortcutsActivity;
import com.server.auditor.ssh.client.database.adapters.ShortcutsTrainDBAdapter;
import com.server.auditor.ssh.client.database.models.ShortcutsTrainDBModel;
import com.server.auditor.ssh.client.ssh.terminal.TerminalActivity;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.toggles.ToggleBtnType;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import com.server.auditor.ssh.client.widget.KeysLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tp.c1;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    private int B;
    private qm.c C;
    private View.OnTouchListener E;
    private View.OnClickListener F;
    private hg.d H;
    private Runnable I;
    private final FrameLayout J;
    private final ConstraintLayout K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f38974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinearLayout f38975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final KeyTextView f38976e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f38978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rm.a f38981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TerminalView f38982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g9.a f38983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f38984m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f38986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f38987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f38988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f38989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private KeyTextView f38990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private KeyTextView f38991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f38992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private qm.e f38993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private qm.d f38994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private qm.b f38995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f38996y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f38977f = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f38985n = new d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f38997z = new ArrayList();
    private final Map D = new HashMap();
    private ShortcutsTrainDBAdapter A = hg.f.p().H();
    private final Pattern G = Pattern.compile("^F(\\d+)");

    class a extends RepeatableOnKeyTouchListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38998e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, boolean z10) {
            super(j10);
            this.f38998e = z10;
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.RepeatableOnKeyTouchListener
        void f(View view, k kVar) {
            if (this.f38998e) {
                try {
                    ((Vibrator) f.this.f38973b.getSystemService("vibrator")).vibrate(5L);
                } catch (SecurityException e10) {
                    y9.a.f86838a.i(e10);
                }
            }
            f.this.F(view, kVar);
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.RepeatableOnKeyTouchListener
        void g(String str) {
        }

        @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.RepeatableOnKeyTouchListener
        void h(String str) {
        }
    }

    class b implements rm.a {
        b() {
        }

        @Override // rm.a
        public void a(String str) {
            if (str.equals("Alt")) {
                if (f.this.f38982k != null) {
                    f.this.f38982k.setUseAlt(false, false);
                }
            } else {
                if (!str.equals("Ctrl") || f.this.f38982k == null) {
                    return;
                }
                f.this.f38982k.setUseCtrl(false, false);
            }
        }

        @Override // rm.a
        public void b(String str) {
            if (str.equals("Alt")) {
                if (f.this.f38982k != null) {
                    f.this.f38982k.setUseAlt(true, false);
                }
            } else {
                if (!str.equals("Ctrl") || f.this.f38982k == null) {
                    return;
                }
                f.this.f38982k.setUseCtrl(true, false);
            }
        }

        @Override // rm.a
        public void c(String str) {
            if (str.equals("Alt")) {
                if (f.this.f38982k != null) {
                    f.this.f38982k.setUseAlt(true, true);
                }
            } else {
                if (!str.equals("Ctrl") || f.this.f38982k == null) {
                    return;
                }
                f.this.f38982k.setUseCtrl(true, true);
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39001a;

        static {
            int[] iArr = new int[AdditionalPanelKeys.TypeAdditionalPanelKey.values().length];
            f39001a = iArr;
            try {
                iArr[AdditionalPanelKeys.TypeAdditionalPanelKey.ControlKey.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.DifferentStateKey.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.TwoStateKey.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.TerminalInputKey.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.RelatedKeys.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.ArrowKeys.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.FnKeys.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.PopupKeys.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39001a[AdditionalPanelKeys.TypeAdditionalPanelKey.DebugQAControlKeys.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {
        d() {
        }

        public static /* synthetic */ void a(EditText editText, DialogInterface dialogInterface, int i10) {
            tp.g.a().k(new pm.d(editText.getText().toString()));
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(KeyTextView keyTextView, String str) {
            f.this.a0(str);
            f.this.g0(str);
            f.this.e0();
            KeyTextView.State state = (KeyTextView.State) f.this.D.get(str);
            keyTextView.setState(state);
            if (f.this.f38982k != null) {
                if (state == KeyTextView.State.Initial) {
                    f.this.f38981j.a(str);
                } else if (state == KeyTextView.State.Pressed) {
                    f.this.f38981j.b(str);
                } else if (state == KeyTextView.State.Hold) {
                    f.this.f38981j.c(str);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(KeyTextView keyTextView, String str) {
            if (f.this.f38983l != null) {
                f.this.b0(str);
                f.this.g0(str);
                f.this.e0();
                KeyTextView.State state = (KeyTextView.State) f.this.D.get(str);
                keyTextView.setState(state);
                if (!str.equals("AC") || state == null) {
                    return;
                }
                if (KeyTextView.State.Initial.name().equals(state.name())) {
                    Avo.C2(Avo.AutocompleteState.DISABLED);
                    f.this.f38983l.b0(false);
                } else {
                    Avo.C2(Avo.AutocompleteState.ENABLED);
                    f.this.f38983l.b0(true);
                }
                tp.g.a().k(new b9.f());
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        boolean e(String str) {
            boolean zY;
            KeyTextView.State state;
            KeyTextView.State state2;
            a9.f fVar;
            if (f.this.f38983l == null) {
                return true;
            }
            zY = f.this.f38983l.S().Y();
            state = (KeyTextView.State) f.this.D.get(ToggleBtnType.Ctrl.name());
            state2 = (KeyTextView.State) f.this.D.get(ToggleBtnType.Alt.name());
            str.getClass();
            switch (str) {
                case "Back Space":
                    if (f.this.f38982k != null) {
                        f.this.f38982k.onKey(f.this.f38982k, 67, new KeyEvent(0, 67));
                    }
                    fVar = null;
                    break;
                case "Up":
                    if (f.this.f38982k == null || !f.this.f38982k.T()) {
                        if (f.this.f38982k != null && f.this.f38982k.U()) {
                            fVar = f.this.f38983l.getOSType() == n9.a.OSX ? a9.f.Key_CtrlUpArrowMac : a9.f.Key_CtrlUpArrow;
                            if (state != KeyTextView.State.Hold) {
                                f.this.f38982k.setUseCtrl(false, false);
                                f.this.V(a9.f.Key_Ctrl);
                            }
                        } else if (!zY) {
                            fVar = a9.f.Key_UpArrow;
                        } else {
                            fVar = a9.f.Key_UpArrow_APP;
                        }
                        break;
                    } else {
                        fVar = a9.f.Key_AltUpArrow;
                        if (state2 != KeyTextView.State.Hold) {
                            f.this.f38982k.setUseAlt(false, false);
                            f.this.V(a9.f.Key_Alt);
                        }
                        break;
                    }
                    break;
                case "End":
                    if (zY) {
                        fVar = a9.f.Key_End_APP;
                        break;
                    } else {
                        fVar = a9.f.Key_End;
                        break;
                    }
                    break;
                case "Down":
                    if (f.this.f38982k == null || !f.this.f38982k.T()) {
                        if (f.this.f38982k != null && f.this.f38982k.U()) {
                            fVar = f.this.f38983l.getOSType() == n9.a.OSX ? a9.f.Key_CtrlDownArrowMac : a9.f.Key_CtrlDownArrow;
                            if (state != KeyTextView.State.Hold) {
                                f.this.f38982k.setUseCtrl(false, false);
                                f.this.V(a9.f.Key_Ctrl);
                            }
                        } else if (!zY) {
                            fVar = a9.f.Key_DownArrow;
                        } else {
                            fVar = a9.f.Key_DownArrow_APP;
                        }
                        break;
                    } else {
                        fVar = a9.f.Key_AltDownArrow;
                        if (state2 != KeyTextView.State.Hold) {
                            f.this.f38982k.setUseAlt(false, false);
                            f.this.V(a9.f.Key_Alt);
                        }
                        break;
                    }
                    break;
                case "Home":
                    if (zY) {
                        fVar = a9.f.Key_Home_APP;
                        break;
                    } else {
                        fVar = a9.f.Key_Home;
                        break;
                    }
                    break;
                case "Left":
                    if (f.this.f38982k == null || !f.this.f38982k.T()) {
                        if (f.this.f38982k != null && f.this.f38982k.U()) {
                            fVar = f.this.f38983l.getOSType() == n9.a.OSX ? a9.f.Key_CtrlLeftArrowMac : a9.f.Key_CtrlLeftArrow;
                            if (state != KeyTextView.State.Hold) {
                                f.this.f38982k.setUseCtrl(false, false);
                                f.this.V(a9.f.Key_Ctrl);
                            }
                        } else if (!zY) {
                            fVar = a9.f.Key_LeftArrow;
                        } else {
                            fVar = a9.f.Key_LeftArrow_APP;
                        }
                        break;
                    } else {
                        fVar = a9.f.Key_AltLeftArrow;
                        if (state2 != KeyTextView.State.Hold) {
                            f.this.f38982k.setUseAlt(false, false);
                            f.this.V(a9.f.Key_Alt);
                        }
                        break;
                    }
                    break;
                case "Enter":
                    if (f.this.f38982k != null) {
                        f.this.f38982k.onKey(f.this.f38982k, 66, new KeyEvent(0, 66));
                    }
                    fVar = null;
                    break;
                case "Pg Dn":
                    fVar = a9.f.Key_Page_Down;
                    break;
                case "Pg Up":
                    fVar = a9.f.Key_Page_Up;
                    break;
                case "Right":
                    if (f.this.f38982k == null || !f.this.f38982k.T()) {
                        if (f.this.f38982k != null && f.this.f38982k.U()) {
                            fVar = f.this.f38983l.getOSType() == n9.a.OSX ? a9.f.Key_CtrlRightArrowMac : a9.f.Key_CtrlRightArrow;
                            if (state != KeyTextView.State.Hold) {
                                f.this.f38982k.setUseCtrl(false, false);
                                f.this.V(a9.f.Key_Ctrl);
                            }
                        } else if (!zY) {
                            fVar = a9.f.Key_RightArrow;
                        } else {
                            fVar = a9.f.Key_RightArrow_APP;
                        }
                        break;
                    } else {
                        fVar = a9.f.Key_AltRightArrow;
                        if (state2 != KeyTextView.State.Hold) {
                            f.this.f38982k.setUseAlt(false, false);
                            f.this.V(a9.f.Key_Alt);
                        }
                        break;
                    }
                    break;
                default:
                    fVar = null;
                    break;
            }
            if (fVar != null && f.this.f38983l != null) {
                f.this.f38983l.A(fVar);
            }
            return fVar != null;
        }

        void f(KeyTextView keyTextView, String str) {
            if (str.equals("Esc") && f.this.f38983l != null) {
                f.this.f38983l.A(a9.f.Key_Esc);
                return;
            }
            if (str.equals("Hide")) {
                ((Activity) f.this.f38973b).finish();
                return;
            }
            if (str.equals("Close")) {
                SessionManager.getInstance().disconnectTerminalSession(f.this.f38984m.intValue());
                return;
            }
            if (str.equals("Tab") && f.this.f38983l != null) {
                f.this.f38983l.x('\t');
                return;
            }
            if (str.equals("Enter")) {
                if (f.this.f38982k != null) {
                    f.this.f38982k.onKey(f.this.f38982k, 66, new KeyEvent(0, 66));
                    return;
                }
                return;
            }
            if (str.equals("Back Space")) {
                if (f.this.f38982k != null) {
                    f.this.f38982k.onKey(f.this.f38982k, 67, new KeyEvent(0, 67));
                    return;
                }
                return;
            }
            if (str.equals("Insert") && f.this.f38983l != null) {
                f.this.f38983l.A(a9.f.Key_Insert);
                return;
            }
            if (str.equals("Delete") && f.this.f38983l != null) {
                f.this.f38983l.A(a9.f.Key_Delete);
                return;
            }
            if (str.equals("Snippets")) {
                if (f.this.f38992u) {
                    tp.g.a().k(new pm.g());
                }
                tp.g.a().k(new b9.f());
                tp.g.a().k(new pm.f());
                return;
            }
            if (str.equals(LibTermiusSshClient.SFTP_TAG)) {
                tp.g.a().k(new pm.e());
                return;
            }
            if (str.equals("Paste")) {
                tp.g.a().k(new pm.b());
                return;
            }
            if (str.equals("Paste_password")) {
                tp.g.a().k(new pm.c());
                return;
            }
            if (str.equals("AI")) {
                tp.g.a().k(new pm.a());
            } else {
                if (!str.equals("Shift+Tab") || f.this.f38983l == null) {
                    return;
                }
                f.this.f38983l.A(a9.f.Key_ShiftTab);
            }
        }

        void g(String str) {
            if (str.equals("PstQA")) {
                be.b bVar = new be.b(f.this.f38973b);
                final EditText editText = new EditText(f.this.f38973b);
                bVar.setTitle("Paste debug");
                bVar.setMessage("Enter text to paste by symbol");
                bVar.setView(editText);
                bVar.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f.d.a(editText, dialogInterface, i10);
                    }
                });
                bVar.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }
                });
                bVar.create().show();
            }
        }

        void i(String str) {
            if (f.this.f38983l != null) {
                KeyTextView.State state = (KeyTextView.State) f.this.D.get(ToggleBtnType.Ctrl.name());
                KeyTextView.State state2 = (KeyTextView.State) f.this.D.get(ToggleBtnType.Alt.name());
                if (f.this.f38982k != null && f.this.f38982k.U() && str.length() == 1) {
                    str = String.valueOf(a9.e.a(str.charAt(0)));
                }
                if (f.this.f38982k != null && f.this.f38982k.T()) {
                    f.this.f38983l.x((char) 27);
                }
                f.this.f38983l.w(str);
                KeyTextView.State state3 = KeyTextView.State.Hold;
                if (!state3.equals(state2)) {
                    if (f.this.f38982k != null) {
                        f.this.f38982k.setUseAlt(false, false);
                    }
                    f.this.V(a9.f.Key_Alt);
                }
                if (state3.equals(state)) {
                    return;
                }
                if (f.this.f38982k != null) {
                    f.this.f38982k.setUseCtrl(false, false);
                }
                f.this.V(a9.f.Key_Ctrl);
            }
        }

        void j(String str) {
            if (f.this.f38983l == null) {
                return;
            }
            String[] strArrSplit = str.split("\\^");
            if (strArrSplit.length == 2) {
                for (char c10 : strArrSplit[1].toCharArray()) {
                    f.this.f38983l.y(c10, true, false);
                }
            }
        }
    }

    public f(Context context, LinearLayout linearLayout, ConstraintLayout constraintLayout) {
        this.f38973b = context;
        this.f38975d = linearLayout;
        this.f38991t = (KeyTextView) linearLayout.findViewById(com.server.auditor.ssh.client.R.id.gesture_key);
        this.f38976e = (KeyTextView) this.f38975d.findViewById(com.server.auditor.ssh.client.R.id.manage_key);
        this.f38990s = (KeyTextView) this.f38975d.findViewById(com.server.auditor.ssh.client.R.id.more_key);
        this.J = (FrameLayout) this.f38975d.findViewById(com.server.auditor.ssh.client.R.id.main_additional_keys_container);
        this.K = constraintLayout;
        this.f38974c = (LayoutInflater) this.f38973b.getSystemService("layout_inflater");
        M();
        N();
        S();
        L();
        K();
        J();
        v(this.f38973b.getResources().getConfiguration());
        y();
    }

    private int B() {
        qm.e eVar;
        return (this.f38992u && (eVar = this.f38993v) != null && eVar.isShowing()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(View view, k kVar) {
        int i10 = kVar.f39006a;
        if (i10 == -1) {
            tp.g.a().k(new pm.h());
        }
        if (i10 == -5 || i10 == -6) {
            tp.g.a().k(new pm.i());
            return;
        }
        if (i10 == -4) {
            Z();
            return;
        }
        if (i10 == -7) {
            H();
            return;
        }
        if (!Objects.equals(kVar.f39007b, "AI")) {
            Context context = this.f38973b;
            if (context instanceof TerminalActivity) {
                ((TerminalActivity) context).v1();
            }
        }
        AdditionalPanelKeys.TypeAdditionalPanelKey type = AdditionalPanelKeys.TypeAdditionalPanelKey.getType(kVar.f39007b);
        String str = kVar.f39007b;
        switch (c.f39001a[type.ordinal()]) {
            case 1:
                this.f38985n.f((KeyTextView) view, str);
                break;
            case 2:
                this.f38985n.h((KeyTextView) view, str);
                break;
            case 3:
                this.f38985n.k((KeyTextView) view, str);
                break;
            case 4:
                this.f38985n.i(str);
                break;
            case 5:
                this.f38985n.j(str);
                break;
            case 6:
                this.f38985n.e(str);
                break;
            case 7:
                Matcher matcher = this.G.matcher(str);
                if (matcher.find()) {
                    G(Integer.valueOf(matcher.group(1)).intValue() - 1);
                    qm.d dVar = this.f38994w;
                    if (dVar != null && dVar.f()) {
                        this.f38994w.a();
                        break;
                    }
                }
                break;
            case 8:
                KeyTextView keyTextView = (KeyTextView) view;
                if ("Arrows".equals(str)) {
                    keyTextView.setDefaultPressed();
                    A();
                    qm.b bVar = new qm.b(this.f38973b);
                    this.f38995x = bVar;
                    bVar.g(this.f38982k);
                    this.f38995x.m(this.E);
                    this.f38995x.h(view);
                } else if ("Fn".equals(str)) {
                    keyTextView.setDefaultPressed();
                    A();
                    qm.d dVar2 = new qm.d(this.f38973b);
                    this.f38994w = dVar2;
                    dVar2.g(this.f38982k);
                    this.f38994w.h(view);
                    this.f38994w.k(this.E);
                }
                break;
            case 9:
                this.f38985n.g(str);
                break;
        }
    }

    private void H() {
        Context context = this.f38973b;
        if (context instanceof TerminalActivity) {
            ((TerminalActivity) context).v1();
        }
        tp.g.a().k(new b9.f());
        qm.e eVar = this.f38993v;
        if (eVar != null && eVar.isShowing()) {
            Z();
        }
        this.f38973b.startActivity(new Intent(this.f38973b, (Class<?>) ManageShortcutsActivity.class));
    }

    private void I(String[] strArr, int i10, KeysLayout keysLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f38988q, (int) (this.f38978g * 38.0f));
        float f10 = this.f38987p;
        layoutParams.setMargins(((int) f10) / 2, 0, ((int) f10) / 2, 0);
        keysLayout.setButtonsStyle(this.f38996y);
        int i11 = i10 * 4;
        keysLayout.setOnAdditionalKeysClickListener(this.E);
        keysLayout.b(strArr, new int[]{i11, i11 + 1, i11 + 2, i11 + 3});
        keysLayout.d(layoutParams);
        for (String str : AdditionalPanelKeys.f38945e) {
            keysLayout.setButtonState(str, (KeyTextView.State) this.D.get(str));
        }
        for (String str2 : AdditionalPanelKeys.f38946f) {
            keysLayout.setButtonState(str2, (KeyTextView.State) this.D.get(str2));
        }
    }

    private void J() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f38973b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f38978g = displayMetrics.density;
        this.f38979h = displayMetrics.heightPixels;
        this.f38980i = displayMetrics.widthPixels;
    }

    private void K() {
        final boolean z10 = Settings.System.getInt(this.f38973b.getContentResolver(), "haptic_feedback_enabled", 0) != 0;
        this.F = new View.OnClickListener() { // from class: com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38970a.Q(z10, view);
            }
        };
    }

    private void L() {
        this.E = new a(this.f38972a, Settings.System.getInt(this.f38973b.getContentResolver(), "haptic_feedback_enabled", 0) != 0);
    }

    private void M() {
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        this.H = dVarM;
        this.f38996y = dVarM.getString("terminal_style_setting", "Material Light");
        this.f38972a = Integer.valueOf(this.H.getString("swipe_timer_serverauditor", "125")).intValue();
    }

    private void N() {
        Map map = this.D;
        String strName = ToggleBtnType.Alt.name();
        KeyTextView.State state = KeyTextView.State.Initial;
        map.put(strName, state);
        this.D.put(ToggleBtnType.Ctrl.name(), state);
        this.D.put(ToggleBtnType.AC.name(), KeyTextView.State.values()[this.H.getInt("key_autocomplete_state", 0)]);
    }

    private boolean O(qm.a aVar) {
        return aVar != null && aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(boolean z10, View view) {
        if (z10) {
            try {
                ((Vibrator) this.f38973b.getSystemService("vibrator")).vibrate(5L);
            } catch (SecurityException e10) {
                y9.a.f86838a.i(e10);
            }
        }
        F(view, (k) view.getTag());
    }

    private void R() {
        if (this.f38993v == null) {
            this.C = new qm.c(this.f38973b, new ArrayList(), this.f38988q, this.f38987p, this.f38996y, this.D, this.E);
            qm.e eVar = new qm.e(this.K, this.f38973b, this.C, (int) ((this.f38988q + this.f38987p) * 4.0f), this.f38975d);
            this.f38993v = eVar;
            eVar.setBackgroundDrawable(new ColorDrawable(c1.a(this.f38973b, com.server.auditor.ssh.client.R.attr.terminalMoreKeyboardBackground)));
            q();
        }
    }

    private void S() {
        TypedValue typedValue = new TypedValue();
        this.f38973b.getResources().getValue(com.server.auditor.ssh.client.R.dimen.padding_keyboard_small, typedValue, true);
        this.f38986o = typedValue.getFloat();
        this.f38988q = this.f38973b.getResources().getDimensionPixelSize(com.server.auditor.ssh.client.R.dimen.additional_key_width);
    }

    private void T() {
        U();
        qm.e eVar = this.f38993v;
        if (eVar != null && eVar.isShowing()) {
            this.f38993v.dismiss();
        }
        this.f38993v = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
        KeyTextView.State state = (KeyTextView.State) this.D.get(str);
        KeyTextView.State state2 = KeyTextView.State.Initial;
        if (state == state2) {
            state2 = KeyTextView.State.Pressed;
        } else if (state == KeyTextView.State.Pressed) {
            state2 = KeyTextView.State.Hold;
        }
        this.D.put(str, state2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(String str) {
        KeyTextView.State state = (KeyTextView.State) this.D.get(str);
        KeyTextView.State state2 = KeyTextView.State.Initial;
        if (state == state2) {
            state2 = KeyTextView.State.Pressed;
        }
        this.D.put(str, state2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        qm.c cVar = this.C;
        if (cVar != null) {
            cVar.c(this.D);
            this.C.notifyDataSetChanged();
        }
    }

    private void f0() {
        qm.e eVar = this.f38993v;
        if (eVar != null && eVar.isShowing()) {
            this.f38993v.dismiss();
        }
        if (this.f38993v != null) {
            U();
            q();
        }
        if (this.f38990s != null) {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        Iterator it = this.f38977f.iterator();
        while (it.hasNext()) {
            ((KeysLayout) it.next()).setButtonState(str, (KeyTextView.State) this.D.get(str));
        }
    }

    private void h0() {
        if (!this.f38992u) {
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(this.f38990s, this.F, com.server.auditor.ssh.client.R.drawable.ic_keyboard, -1, "Open Keyboard");
            this.f38990s.setContentDescription(this.f38973b.getString(com.server.auditor.ssh.client.R.string.cd_open_virtual_keyboard_button));
            return;
        }
        this.f38990s.setContentDescription(this.f38973b.getString(com.server.auditor.ssh.client.R.string.cd_more_actions_button));
        qm.e eVar = this.f38993v;
        if (eVar == null || !eVar.isShowing()) {
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(this.f38990s, this.F, com.server.auditor.ssh.client.R.drawable.ic_more_horizontal, -4, "Show Extended Keyboard");
        } else {
            com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(this.f38990s, this.F, com.server.auditor.ssh.client.R.drawable.ic_more_horiz_dark_active, -4, "Show Extended Keyboard");
        }
    }

    private void n() {
        this.f38991t = (KeyTextView) this.f38975d.findViewById(com.server.auditor.ssh.client.R.id.gesture_key);
        d0(this.H.getBoolean("is_last_gesture_mode", false));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f38988q, (int) (this.f38978g * 38.0f));
        layoutParams.setMargins(0, 0, (int) (this.f38986o * this.f38978g), 0);
        this.f38991t.setLayoutParams(layoutParams);
    }

    private LinearLayout o() {
        return (LinearLayout) this.J.findViewById(com.server.auditor.ssh.client.R.id.dynamic_keys_layout);
    }

    private void q() {
        List<ShortcutsTrainDBModel> itemList = this.A.getItemList(null);
        this.f38997z.clear();
        for (int i10 = this.B; i10 < itemList.size() && itemList.size() != this.B; i10++) {
            this.f38997z.add(new com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.b(itemList.get(i10)));
        }
        this.C.b(this.f38997z);
        this.C.notifyDataSetChanged();
    }

    private KeysLayout r(ViewGroup viewGroup) {
        KeysLayout keysLayout = (KeysLayout) LayoutInflater.from(this.f38973b).inflate(com.server.auditor.ssh.client.R.layout.terminal_key_group_layout, viewGroup, false);
        keysLayout.setGravity(16);
        keysLayout.setOrientation(0);
        viewGroup.addView(keysLayout, new LinearLayout.LayoutParams((int) ((this.f38988q + this.f38987p) * 4.0f), (int) (this.f38978g * 38.0f)));
        this.f38977f.add(keysLayout);
        return keysLayout;
    }

    private void s() {
        this.f38976e.setVisibility(0);
        com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(this.f38976e, this.F, com.server.auditor.ssh.client.R.drawable.manage_shortcuts_key_icon, -7, "Manage Shortcuts");
        this.f38976e.setTextColor(androidx.core.content.a.getColor(this.f38973b, com.server.auditor.ssh.client.R.color.additional_keyboard_btn_text_color));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f38976e.getLayoutParams();
        layoutParams.setMargins((int) (this.f38986o * this.f38978g), 0, (int) this.f38987p, 0);
        this.f38976e.setLayoutParams(layoutParams);
    }

    private void t() {
        this.f38990s = (KeyTextView) this.f38975d.findViewById(com.server.auditor.ssh.client.R.id.more_key);
        h0();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f38990s.getLayoutParams();
        layoutParams.setMargins(0, 0, (int) (this.f38986o * this.f38978g), 0);
        this.f38990s.setLayoutParams(layoutParams);
    }

    private void u(ViewGroup viewGroup) {
        float f10 = this.f38978g;
        viewGroup.addView(this.f38974c.inflate(com.server.auditor.ssh.client.R.layout.vertical_divider, (ViewGroup) null), new LinearLayout.LayoutParams((int) (1.0f * f10), (int) ((38.0f * f10) - (f10 * 15.0f))));
    }

    private void v(Configuration configuration) {
        int i10;
        float f10;
        int i11;
        if (configuration != null) {
            if (configuration.orientation != 1 ? (i10 = this.f38980i) <= (i11 = this.f38979h) : (i10 = this.f38979h) >= (i11 = this.f38980i)) {
                f10 = i11;
            }
            float f11 = f10 - ((this.f38986o * 2.0f) * this.f38978g);
            int i12 = (int) (f11 / this.f38988q);
            this.f38989r = i12;
            this.f38987p = (f11 - (r0 * i12)) / i12;
        }
        i10 = this.f38980i;
        f10 = i10;
        float f112 = f10 - ((this.f38986o * 2.0f) * this.f38978g);
        int i122 = (int) (f112 / this.f38988q);
        this.f38989r = i122;
        this.f38987p = (f112 - (r0 * i122)) / i122;
    }

    private void y() {
        this.f38981j = new b();
    }

    public void A() {
        qm.d dVar = this.f38994w;
        if (dVar != null && dVar.f()) {
            this.f38994w.a();
        }
        qm.b bVar = this.f38995x;
        if (bVar != null && bVar.f()) {
            this.f38995x.a();
        }
        qm.e eVar = this.f38993v;
        if (eVar == null || !eVar.isShowing()) {
            return;
        }
        this.f38993v.dismiss();
        h0();
        U();
        q();
    }

    public Integer C() {
        return this.f38984m;
    }

    public g9.a D() {
        return this.f38983l;
    }

    public TerminalView E() {
        return this.f38982k;
    }

    public void G(int i10) {
        g9.a aVar = this.f38983l;
        aVar.A(a9.a.a(i10 + 9, aVar.T().c()));
    }

    public boolean P() {
        return O(this.f38995x) || O(this.f38994w);
    }

    public void U() {
        ((ViewGroup) this.J.findViewById(com.server.auditor.ssh.client.R.id.dynamic_keys_layout)).removeAllViews();
        this.f38977f.clear();
        p();
    }

    public void V(a9.f fVar) {
        String strReplace = fVar.name().replace("Key_", "");
        N();
        Iterator it = this.f38977f.iterator();
        while (it.hasNext()) {
            ((KeysLayout) it.next()).a(strReplace);
        }
        e0();
    }

    public void W(Integer num) {
        this.f38984m = num;
        g9.a terminalSession = SessionManager.getInstance().getTerminalSession(num.intValue());
        if (terminalSession != null) {
            this.f38983l = terminalSession;
            c0(terminalSession.X());
        }
    }

    public void X(boolean z10) {
        this.f38992u = z10;
        f0();
    }

    public void Y(TerminalView terminalView) {
        this.f38982k = terminalView;
    }

    public void Z() {
        Context context = this.f38973b;
        if (context instanceof TerminalActivity) {
            ((TerminalActivity) context).v1();
        }
        R();
        if (this.f38993v.isShowing()) {
            this.f38993v.dismiss();
        } else if (!this.f38993v.isShowing()) {
            this.f38993v.g();
            this.f38993v.f();
        }
        U();
        q();
        if (this.f38990s != null) {
            h0();
        }
    }

    public void c0(boolean z10) {
        this.D.put("AC", z10 ? KeyTextView.State.Pressed : KeyTextView.State.Initial);
        g0("AC");
        e0();
    }

    public void d0(boolean z10) {
        KeyTextView keyTextView = this.f38991t;
        if (keyTextView != null) {
            if (z10) {
                com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(keyTextView, this.F, com.server.auditor.ssh.client.R.drawable.ic_gesture_active, -5, "Gesture Mode");
            } else {
                com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.d.d(keyTextView, this.F, com.server.auditor.ssh.client.R.drawable.ic_gesture_inactive, -6, "Gesture Mode");
            }
        }
    }

    public void p() {
        List<ShortcutsTrainDBModel> itemList = this.A.getItemList(null);
        int iB = (this.f38989r - 2) - B();
        n();
        if (iB > itemList.size() * 4) {
            iB = itemList.size() * 4;
        }
        int i10 = iB % 4;
        if (i10 != 0) {
            iB += 4 - i10;
        }
        this.B = iB / 4;
        LinearLayout linearLayoutO = o();
        for (int i11 = 0; i11 < this.B; i11++) {
            ShortcutsTrainDBModel shortcutsTrainDBModel = itemList.get(i11);
            if (i11 > 0) {
                u(linearLayoutO);
            }
            I(shortcutsTrainDBModel.getShortcuts(), (int) shortcutsTrainDBModel.getId(), r(linearLayoutO));
        }
        if (B() > 0) {
            s();
        } else {
            this.f38976e.setVisibility(8);
        }
        t();
    }

    public void w(Configuration configuration, int i10) {
        if (this.f38982k != null) {
            for (String str : AdditionalPanelKeys.f38945e) {
                this.f38981j.a(str);
            }
        }
        A();
        S();
        if (i10 == 0) {
            J();
            v(configuration);
        } else {
            this.f38980i = i10;
            v(null);
        }
        T();
    }

    public void x(a9.f fVar, KeyTextView.State state) {
        String strReplace = fVar.name().replace("Key_", "");
        Iterator it = this.f38977f.iterator();
        while (it.hasNext()) {
            ((KeysLayout) it.next()).setButtonState(strReplace, state);
        }
        e0();
    }

    public void z() {
        Runnable runnable = this.I;
        if (runnable != null) {
            this.f38991t.removeCallbacks(runnable);
            this.I = null;
        }
        this.f38973b = null;
        this.f38975d = null;
        this.f38974c = null;
        this.f38981j = null;
        this.A = null;
        this.f38982k = null;
        this.f38983l = null;
        this.E = null;
    }
}
