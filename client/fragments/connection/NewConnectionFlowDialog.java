package com.server.auditor.ssh.client.fragments.connection;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.nfc.NdefMessage;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowQueue;
import com.crystalnix.termius.libtermius.wrappers.TypeOfCurrentConnection;
import com.crystalnix.termius.libtermius.wrappers.WebAuthnAuth;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.navigation.MainActivity;
import com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter;
import com.server.auditor.ssh.client.ssh.terminal.TerminalActivity;
import com.server.auditor.ssh.client.sshid.KeyPairStatus;
import com.server.auditor.ssh.client.sshid.SshIdAuthData;
import com.server.auditor.ssh.client.widget.ConnectionProgressView;
import com.server.auditor.ssh.client.yubikey.nordpolbackward.TagDispatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.a6;
import qg.b6;
import qg.c6;
import qg.e6;
import qg.f6;
import qg.g6;
import qg.g7;
import qg.h6;
import qg.i6;
import qg.j6;
import qg.m3;
import qg.m8;
import qg.t0;
import qg.t8;
import qg.u0;
import qg.w2;
import qg.y5;
import qg.z5;
import tp.g1;
import ut.b0;
import ut.m0;
import vt.s0;
import w6.a0;
import w6.w;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class NewConnectionFlowDialog extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.connection.d, uq.c, rq.b {
    private boolean A;
    private rq.a B;
    private UsbDevice C;
    private final ut.n D;
    private final ut.n E;
    private com.server.auditor.ssh.client.fragments.connection.c F;
    private com.server.auditor.ssh.client.fragments.connection.c G;
    private com.server.auditor.ssh.client.fragments.connection.c H;
    private com.server.auditor.ssh.client.fragments.connection.c I;
    private com.server.auditor.ssh.client.fragments.connection.c J;
    private com.server.auditor.ssh.client.fragments.connection.c K;
    private com.server.auditor.ssh.client.fragments.connection.c L;
    private com.server.auditor.ssh.client.fragments.connection.c M;
    private com.server.auditor.ssh.client.fragments.connection.c N;
    private com.server.auditor.ssh.client.fragments.connection.c O;
    private com.server.auditor.ssh.client.fragments.connection.c P;
    private com.server.auditor.ssh.client.fragments.connection.c Q;
    private com.server.auditor.ssh.client.fragments.connection.c R;
    private com.server.auditor.ssh.client.fragments.connection.c S;
    private com.server.auditor.ssh.client.fragments.connection.c T;
    private com.server.auditor.ssh.client.fragments.connection.c U;
    private com.server.auditor.ssh.client.fragments.connection.c V;
    private com.server.auditor.ssh.client.fragments.connection.c W;
    private com.server.auditor.ssh.client.fragments.connection.c X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m3 f24478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f24481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private pi.c f24482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a0 f24483f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f24484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TagDispatcher f24485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private rq.b f24486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BroadcastReceiver f24487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private UsbManager f24488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24489z;
    static final /* synthetic */ qu.k[] Z = {n0.g(new g0(NewConnectionFlowDialog.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/connection/NewConnectionFlowPresenter;", 0))};
    public static final a Y = new a(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f24477a0 = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24490a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 975614129;
            }

            public String toString() {
                return "ApproveBiometric";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog$b$b, reason: collision with other inner class name */
        public static final class C0391b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WebAuthnAuth f24491a;

            public C0391b(WebAuthnAuth webAuthnAuth) {
                super(null);
                this.f24491a = webAuthnAuth;
            }

            public final WebAuthnAuth a() {
                return this.f24491a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0391b) && ju.t.b(this.f24491a, ((C0391b) obj).f24491a);
            }

            public int hashCode() {
                WebAuthnAuth webAuthnAuth = this.f24491a;
                if (webAuthnAuth == null) {
                    return 0;
                }
                return webAuthnAuth.hashCode();
            }

            public String toString() {
                return "ApproveWebAuthn(webAuthnAuth=" + this.f24491a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24492a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.f24492a = str;
            }

            public final String a() {
                return this.f24492a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && ju.t.b(this.f24492a, ((c) obj).f24492a);
            }

            public int hashCode() {
                return this.f24492a.hashCode();
            }

            public String toString() {
                return "AuthBannerStep(message=" + this.f24492a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24495c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f24496d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f24497e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f24498f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final String f24499g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, String str2, boolean z10, boolean z11, String str3, String str4, String str5) {
                super(null);
                ju.t.f(str, "alias");
                ju.t.f(str2, Column.ADDRESS);
                this.f24493a = str;
                this.f24494b = str2;
                this.f24495c = z10;
                this.f24496d = z11;
                this.f24497e = str3;
                this.f24498f = str4;
                this.f24499g = str5;
            }

            public final String a() {
                return this.f24494b;
            }

            public final String b() {
                return this.f24493a;
            }

            public final boolean c() {
                return this.f24495c;
            }

            public final String d() {
                return this.f24498f;
            }

            public final boolean e() {
                return this.f24496d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return ju.t.b(this.f24493a, dVar.f24493a) && ju.t.b(this.f24494b, dVar.f24494b) && this.f24495c == dVar.f24495c && this.f24496d == dVar.f24496d && ju.t.b(this.f24497e, dVar.f24497e) && ju.t.b(this.f24498f, dVar.f24498f) && ju.t.b(this.f24499g, dVar.f24499g);
            }

            public final String f() {
                return this.f24497e;
            }

            public final String g() {
                return this.f24499g;
            }

            public int hashCode() {
                int iHashCode = ((((((this.f24493a.hashCode() * 31) + this.f24494b.hashCode()) * 31) + Boolean.hashCode(this.f24495c)) * 31) + Boolean.hashCode(this.f24496d)) * 31;
                String str = this.f24497e;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f24498f;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f24499g;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "ConnectionType(alias=" + this.f24493a + ", address=" + this.f24494b + ", defaultSaveToHostValue=" + this.f24495c + ", showSaveToHostToggle=" + this.f24496d + ", sshPort=" + this.f24497e + ", moshCommand=" + this.f24498f + ", telnetPort=" + this.f24499g + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f24502c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, String str2, String str3) {
                super(null);
                ju.t.f(str, "host");
                ju.t.f(str2, "fingerprintType");
                ju.t.f(str3, "fingerprint");
                this.f24500a = str;
                this.f24501b = str2;
                this.f24502c = str3;
            }

            public final String a() {
                return this.f24502c;
            }

            public final String b() {
                return this.f24501b;
            }

            public final String c() {
                return this.f24500a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return ju.t.b(this.f24500a, eVar.f24500a) && ju.t.b(this.f24501b, eVar.f24501b) && ju.t.b(this.f24502c, eVar.f24502c);
            }

            public int hashCode() {
                return (((this.f24500a.hashCode() * 31) + this.f24501b.hashCode()) * 31) + this.f24502c.hashCode();
            }

            public String toString() {
                return "FingerprintStep(host=" + this.f24500a + ", fingerprintType=" + this.f24501b + ", fingerprint=" + this.f24502c + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24504b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, String str2) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(str2, "promptMessage");
                this.f24503a = str;
                this.f24504b = str2;
            }

            public final String a() {
                return this.f24504b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return ju.t.b(this.f24503a, fVar.f24503a) && ju.t.b(this.f24504b, fVar.f24504b);
            }

            public int hashCode() {
                return (this.f24503a.hashCode() * 31) + this.f24504b.hashCode();
            }

            public String toString() {
                return "KeyboardInteractiveStep(hostTitle=" + this.f24503a + ", promptMessage=" + this.f24504b + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24505a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f24506b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24507c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, boolean z10, boolean z11) {
                super(null);
                ju.t.f(str, "logs");
                this.f24505a = str;
                this.f24506b = z10;
                this.f24507c = z11;
            }

            public final boolean a() {
                return this.f24506b;
            }

            public final String b() {
                return this.f24505a;
            }

            public final boolean c() {
                return this.f24507c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return ju.t.b(this.f24505a, gVar.f24505a) && this.f24506b == gVar.f24506b && this.f24507c == gVar.f24507c;
            }

            public int hashCode() {
                return (((this.f24505a.hashCode() * 31) + Boolean.hashCode(this.f24506b)) * 31) + Boolean.hashCode(this.f24507c);
            }

            public String toString() {
                return "LogsStep(logs=" + this.f24505a + ", enableStartOverButton=" + this.f24506b + ", showEditHostButton=" + this.f24507c + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24509b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24510c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, String str2, boolean z10) {
                super(null);
                ju.t.f(str, Column.PORT);
                ju.t.f(str2, Column.COMMAND);
                this.f24508a = str;
                this.f24509b = str2;
                this.f24510c = z10;
            }

            public final String a() {
                return this.f24509b;
            }

            public final String b() {
                return this.f24508a;
            }

            public final boolean c() {
                return this.f24510c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return ju.t.b(this.f24508a, hVar.f24508a) && ju.t.b(this.f24509b, hVar.f24509b) && this.f24510c == hVar.f24510c;
            }

            public int hashCode() {
                return (((this.f24508a.hashCode() * 31) + this.f24509b.hashCode()) * 31) + Boolean.hashCode(this.f24510c);
            }

            public String toString() {
                return "MoshParams(port=" + this.f24508a + ", command=" + this.f24509b + ", showSaveAndContinueButton=" + this.f24510c + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24513c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str, String str2, boolean z10) {
                super(null);
                ju.t.f(str, "sshKeyTitle");
                ju.t.f(str2, "sshKeyType");
                this.f24511a = str;
                this.f24512b = str2;
                this.f24513c = z10;
            }

            public final boolean a() {
                return this.f24513c;
            }

            public final String b() {
                return this.f24511a;
            }

            public final String c() {
                return this.f24512b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return ju.t.b(this.f24511a, iVar.f24511a) && ju.t.b(this.f24512b, iVar.f24512b) && this.f24513c == iVar.f24513c;
            }

            public int hashCode() {
                return (((this.f24511a.hashCode() * 31) + this.f24512b.hashCode()) * 31) + Boolean.hashCode(this.f24513c);
            }

            public String toString() {
                return "PassphraseStep(sshKeyTitle=" + this.f24511a + ", sshKeyType=" + this.f24512b + ", showSaveAndContinueButton=" + this.f24513c + ")";
            }
        }

        public static final class j extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f24515b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str, boolean z10) {
                super(null);
                ju.t.f(str, "hostTitle");
                this.f24514a = str;
                this.f24515b = z10;
            }

            public final String a() {
                return this.f24514a;
            }

            public final boolean b() {
                return this.f24515b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return ju.t.b(this.f24514a, jVar.f24514a) && this.f24515b == jVar.f24515b;
            }

            public int hashCode() {
                return (this.f24514a.hashCode() * 31) + Boolean.hashCode(this.f24515b);
            }

            public String toString() {
                return "PasswordStep(hostTitle=" + this.f24514a + ", showSaveAndContinueButton=" + this.f24515b + ")";
            }
        }

        public static final class k extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f24516a = new k();

            private k() {
                super(null);
            }
        }

        public static final class l extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f24518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f24520d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(String str, List list, boolean z10, boolean z11) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(list, "identities");
                this.f24517a = str;
                this.f24518b = list;
                this.f24519c = z10;
                this.f24520d = z11;
            }

            public final boolean a() {
                return this.f24519c;
            }

            public final String b() {
                return this.f24517a;
            }

            public final List c() {
                return this.f24518b;
            }

            public final boolean d() {
                return this.f24520d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return ju.t.b(this.f24517a, lVar.f24517a) && ju.t.b(this.f24518b, lVar.f24518b) && this.f24519c == lVar.f24519c && this.f24520d == lVar.f24520d;
            }

            public int hashCode() {
                return (((((this.f24517a.hashCode() * 31) + this.f24518b.hashCode()) * 31) + Boolean.hashCode(this.f24519c)) * 31) + Boolean.hashCode(this.f24520d);
            }

            public String toString() {
                return "SelectIdentityStep(hostTitle=" + this.f24517a + ", identities=" + this.f24518b + ", defaultSaveToHostValue=" + this.f24519c + ", showSaveToggle=" + this.f24520d + ")";
            }
        }

        public static final class m extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f24523c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(String str, String str2, List list) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(str2, "promptMessage");
                ju.t.f(list, "codeList");
                this.f24521a = str;
                this.f24522b = str2;
                this.f24523c = list;
            }

            public final List a() {
                return this.f24523c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return ju.t.b(this.f24521a, mVar.f24521a) && ju.t.b(this.f24522b, mVar.f24522b) && ju.t.b(this.f24523c, mVar.f24523c);
            }

            public int hashCode() {
                return (((this.f24521a.hashCode() * 31) + this.f24522b.hashCode()) * 31) + this.f24523c.hashCode();
            }

            public String toString() {
                return "SelectOneTimeCodeStep(hostTitle=" + this.f24521a + ", promptMessage=" + this.f24522b + ", codeList=" + this.f24523c + ")";
            }
        }

        public static final class n extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f24524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24525b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(List list, String str) {
                super(null);
                ju.t.f(list, "hardwarePasskeysData");
                ju.t.f(str, "logs");
                this.f24524a = list;
                this.f24525b = str;
            }

            public final List a() {
                return this.f24524a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return ju.t.b(this.f24524a, nVar.f24524a) && ju.t.b(this.f24525b, nVar.f24525b);
            }

            public int hashCode() {
                return (this.f24524a.hashCode() * 31) + this.f24525b.hashCode();
            }

            public String toString() {
                return "SelectSshIdHardwareKeyStep(hardwarePasskeysData=" + this.f24524a + ", logs=" + this.f24525b + ")";
            }
        }

        public static final class o extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f24526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24527b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(List list, String str) {
                super(null);
                ju.t.f(list, "passkeysData");
                ju.t.f(str, "logs");
                this.f24526a = list;
                this.f24527b = str;
            }

            public final String a() {
                return this.f24527b;
            }

            public final List b() {
                return this.f24526a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return ju.t.b(this.f24526a, oVar.f24526a) && ju.t.b(this.f24527b, oVar.f24527b);
            }

            public int hashCode() {
                return (this.f24526a.hashCode() * 31) + this.f24527b.hashCode();
            }

            public String toString() {
                return "SelectSshIdKeyStep(passkeysData=" + this.f24526a + ", logs=" + this.f24527b + ")";
            }
        }

        public static final class p extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f24529b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24530c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f24531d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(String str, List list, boolean z10, boolean z11) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(list, "sshKeys");
                this.f24528a = str;
                this.f24529b = list;
                this.f24530c = z10;
                this.f24531d = z11;
            }

            public final boolean a() {
                return this.f24530c;
            }

            public final String b() {
                return this.f24528a;
            }

            public final boolean c() {
                return this.f24531d;
            }

            public final List d() {
                return this.f24529b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return ju.t.b(this.f24528a, pVar.f24528a) && ju.t.b(this.f24529b, pVar.f24529b) && this.f24530c == pVar.f24530c && this.f24531d == pVar.f24531d;
            }

            public int hashCode() {
                return (((((this.f24528a.hashCode() * 31) + this.f24529b.hashCode()) * 31) + Boolean.hashCode(this.f24530c)) * 31) + Boolean.hashCode(this.f24531d);
            }

            public String toString() {
                return "SelectSshKeyStep(hostTitle=" + this.f24528a + ", sshKeys=" + this.f24529b + ", defaultSaveToHostValue=" + this.f24530c + ", showSaveToggle=" + this.f24531d + ")";
            }
        }

        public static final class q extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f24533b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f24534c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Editable f24535d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(String str, String str2, String str3, Editable editable) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(str2, "snippetTitle");
                ju.t.f(str3, "snippetScript");
                this.f24532a = str;
                this.f24533b = str2;
                this.f24534c = str3;
                this.f24535d = editable;
            }

            public final String a() {
                return this.f24532a;
            }

            public final Editable b() {
                return this.f24535d;
            }

            public final String c() {
                return this.f24534c;
            }

            public final String d() {
                return this.f24533b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return ju.t.b(this.f24532a, qVar.f24532a) && ju.t.b(this.f24533b, qVar.f24533b) && ju.t.b(this.f24534c, qVar.f24534c) && ju.t.b(this.f24535d, qVar.f24535d);
            }

            public int hashCode() {
                int iHashCode = ((((this.f24532a.hashCode() * 31) + this.f24533b.hashCode()) * 31) + this.f24534c.hashCode()) * 31;
                Editable editable = this.f24535d;
                return iHashCode + (editable == null ? 0 : editable.hashCode());
            }

            public String toString() {
                return "SnippetVariableErrorStep(hostTitle=" + this.f24532a + ", snippetTitle=" + this.f24533b + ", snippetScript=" + this.f24534c + ", scriptStructure=" + ((Object) this.f24535d) + ")";
            }
        }

        public static final class r extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f24537b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(String str, boolean z10) {
                super(null);
                ju.t.f(str, Column.PORT);
                this.f24536a = str;
                this.f24537b = z10;
            }

            public final String a() {
                return this.f24536a;
            }

            public final boolean b() {
                return this.f24537b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return ju.t.b(this.f24536a, rVar.f24536a) && this.f24537b == rVar.f24537b;
            }

            public int hashCode() {
                return (this.f24536a.hashCode() * 31) + Boolean.hashCode(this.f24537b);
            }

            public String toString() {
                return "SshParams(port=" + this.f24536a + ", showSaveAndContinueButton=" + this.f24537b + ")";
            }
        }

        public static final class s extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f24539b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(String str, boolean z10) {
                super(null);
                ju.t.f(str, Column.PORT);
                this.f24538a = str;
                this.f24539b = z10;
            }

            public final String a() {
                return this.f24538a;
            }

            public final boolean b() {
                return this.f24539b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return ju.t.b(this.f24538a, sVar.f24538a) && this.f24539b == sVar.f24539b;
            }

            public int hashCode() {
                return (this.f24538a.hashCode() * 31) + Boolean.hashCode(this.f24539b);
            }

            public String toString() {
                return "TelnetParams(port=" + this.f24538a + ", showSaveAndContinueButton=" + this.f24539b + ")";
            }
        }

        public static final class t extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f24541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f24542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f24543d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(String str, boolean z10, boolean z11, String str2) {
                super(null);
                ju.t.f(str, "hostTitle");
                ju.t.f(str2, "credentialsMode");
                this.f24540a = str;
                this.f24541b = z10;
                this.f24542c = z11;
                this.f24543d = str2;
            }

            public final boolean a() {
                return this.f24541b;
            }

            public final String b() {
                return this.f24540a;
            }

            public final boolean c() {
                return this.f24542c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof t)) {
                    return false;
                }
                t tVar = (t) obj;
                return ju.t.b(this.f24540a, tVar.f24540a) && this.f24541b == tVar.f24541b && this.f24542c == tVar.f24542c && ju.t.b(this.f24543d, tVar.f24543d);
            }

            public int hashCode() {
                return (((((this.f24540a.hashCode() * 31) + Boolean.hashCode(this.f24541b)) * 31) + Boolean.hashCode(this.f24542c)) * 31) + this.f24543d.hashCode();
            }

            public String toString() {
                return "UsernameStep(hostTitle=" + this.f24540a + ", enableSelectIdentity=" + this.f24541b + ", showSaveAndContinueButton=" + this.f24542c + ", credentialsMode=" + this.f24543d + ")";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24544a;

        static {
            int[] iArr = new int[TagDispatcher.NfcStatus.values().length];
            try {
                iArr[TagDispatcher.NfcStatus.AVAILABLE_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagDispatcher.NfcStatus.NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TagDispatcher.NfcStatus.AVAILABLE_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24544a = iArr;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f24546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowDialog f24547c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, NewConnectionFlowDialog newConnectionFlowDialog, zt.e eVar) {
            super(2, eVar);
            this.f24546b = bVar;
            this.f24547c = newConnectionFlowDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f24546b, this.f24547c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24545a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b bVar = this.f24546b;
            if (!(bVar instanceof b.d) && !(bVar instanceof b.h) && !(bVar instanceof b.r) && !(bVar instanceof b.s)) {
                if (bVar instanceof b.g) {
                    NewConnectionFlowDialog newConnectionFlowDialog = this.f24547c;
                    newConnectionFlowDialog.f24483f = newConnectionFlowDialog.zg().f73176t.N();
                } else if (!(bVar instanceof b.l) && !ju.t.b(bVar, b.k.f24516a)) {
                    if (bVar instanceof b.e) {
                        NewConnectionFlowDialog newConnectionFlowDialog2 = this.f24547c;
                        newConnectionFlowDialog2.f24483f = newConnectionFlowDialog2.zg().f73176t.P(R.drawable.ic_connection_fingerprint);
                    } else if (bVar instanceof b.c) {
                        NewConnectionFlowDialog newConnectionFlowDialog3 = this.f24547c;
                        newConnectionFlowDialog3.f24483f = newConnectionFlowDialog3.zg().f73176t.P(R.drawable.is_security_shield);
                    } else if (bVar instanceof b.f) {
                        NewConnectionFlowDialog newConnectionFlowDialog4 = this.f24547c;
                        newConnectionFlowDialog4.f24483f = newConnectionFlowDialog4.zg().f73176t.P(R.drawable.ic_connection_interactive);
                    } else if (bVar instanceof b.j) {
                        NewConnectionFlowDialog newConnectionFlowDialog5 = this.f24547c;
                        newConnectionFlowDialog5.f24483f = newConnectionFlowDialog5.zg().f73176t.P(R.drawable.ic_connection_password);
                    } else if (bVar instanceof b.p) {
                        NewConnectionFlowDialog newConnectionFlowDialog6 = this.f24547c;
                        newConnectionFlowDialog6.f24483f = newConnectionFlowDialog6.zg().f73176t.P(R.drawable.ic_connection_key);
                    } else if (bVar instanceof b.i) {
                        NewConnectionFlowDialog newConnectionFlowDialog7 = this.f24547c;
                        newConnectionFlowDialog7.f24483f = newConnectionFlowDialog7.zg().f73176t.P(R.drawable.ic_connection_key);
                    } else if (bVar instanceof b.t) {
                        NewConnectionFlowDialog newConnectionFlowDialog8 = this.f24547c;
                        newConnectionFlowDialog8.f24483f = newConnectionFlowDialog8.zg().f73176t.P(R.drawable.ic_connection_identity);
                    } else if (bVar instanceof b.q) {
                        NewConnectionFlowDialog newConnectionFlowDialog9 = this.f24547c;
                        newConnectionFlowDialog9.f24483f = newConnectionFlowDialog9.zg().f73176t.P(R.drawable.ic_connection_snippet_icon);
                    } else if (!(bVar instanceof b.m)) {
                        if (ju.t.b(bVar, b.a.f24490a)) {
                            NewConnectionFlowDialog newConnectionFlowDialog10 = this.f24547c;
                            newConnectionFlowDialog10.f24483f = newConnectionFlowDialog10.zg().f73176t.P(R.drawable.ic_approve_biometric);
                        } else if (bVar instanceof b.C0391b) {
                            NewConnectionFlowDialog newConnectionFlowDialog11 = this.f24547c;
                            newConnectionFlowDialog11.f24483f = newConnectionFlowDialog11.zg().f73176t.P(R.drawable.ic_approve_biometric);
                        } else if (bVar instanceof b.o) {
                            NewConnectionFlowDialog newConnectionFlowDialog12 = this.f24547c;
                            newConnectionFlowDialog12.f24483f = newConnectionFlowDialog12.zg().f73176t.P(R.drawable.ic_connection_ssh_id_paddings);
                        } else {
                            if (!(bVar instanceof b.n)) {
                                throw new ut.s();
                            }
                            NewConnectionFlowDialog newConnectionFlowDialog13 = this.f24547c;
                            newConnectionFlowDialog13.f24483f = newConnectionFlowDialog13.zg().f73176t.P(R.drawable.ic_connection_ssh_id_paddings);
                        }
                    }
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24548a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24548a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity activity = NewConnectionFlowDialog.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            FragmentActivity activity2 = NewConnectionFlowDialog.this.getActivity();
            if (activity2 != null) {
                activity2.overridePendingTransition(0, R.anim.fadeout);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24550a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity activity = NewConnectionFlowDialog.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            FragmentActivity activity2 = NewConnectionFlowDialog.this.getActivity();
            if (activity2 != null) {
                activity2.overridePendingTransition(0, R.anim.alpha_down_out);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24552a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73179w.f71901h.setVisibility(0);
            NewConnectionFlowDialog.this.zg().f73179w.f71902i.setVisibility(4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24554a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24554a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73179w.f71901h.setVisibility(4);
            NewConnectionFlowDialog.this.zg().f73179w.f71902i.setVisibility(4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24556a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(NewConnectionFlowDialog newConnectionFlowDialog, View view) {
            newConnectionFlowDialog.Lg().N2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24556a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = NewConnectionFlowDialog.this.zg().f73162f;
            final NewConnectionFlowDialog newConnectionFlowDialog = NewConnectionFlowDialog.this;
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.connection.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewConnectionFlowDialog.i.k(newConnectionFlowDialog, view);
                }
            });
            AppCompatTextView appCompatTextView2 = NewConnectionFlowDialog.this.zg().f73162f;
            ju.t.e(appCompatTextView2, "closeButton");
            g1.c(appCompatTextView2, NewConnectionFlowDialog.this.getResources().getDimension(R.dimen.materialButtonCornerRadius));
            NewConnectionFlowDialog.this.Mg().c();
            NewConnectionFlowDialog.this.Og().c();
            NewConnectionFlowDialog.this.Sg().c();
            NewConnectionFlowDialog.this.Gg().c();
            NewConnectionFlowDialog.this.Tg().c();
            NewConnectionFlowDialog.this.Dg().c();
            NewConnectionFlowDialog.this.Kg().c();
            NewConnectionFlowDialog.this.Jg().c();
            NewConnectionFlowDialog.this.Eg().c();
            NewConnectionFlowDialog.this.Rg().c();
            NewConnectionFlowDialog.this.Ag().c();
            NewConnectionFlowDialog.this.Ug().c();
            NewConnectionFlowDialog.this.xg().c();
            NewConnectionFlowDialog.this.Fg().c();
            NewConnectionFlowDialog.this.Bg().c();
            NewConnectionFlowDialog.this.Ng().c();
            NewConnectionFlowDialog.this.Hg().c();
            NewConnectionFlowDialog.this.Qg().c();
            NewConnectionFlowDialog.this.Pg().c();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24558a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f24560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j10, zt.e eVar) {
            super(2, eVar);
            this.f24560c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new j(this.f24560c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24558a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent(NewConnectionFlowDialog.this.requireActivity(), (Class<?>) MainActivity.class);
            intent.setAction("VIEW_HOST_EDITOR");
            intent.putExtra(Column.HOST_ID, this.f24560c);
            intent.setFlags(67239936);
            NewConnectionFlowDialog.this.startActivity(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f24561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24563c;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            Object objF = au.b.f();
            int i10 = this.f24563c;
            if (i10 == 0) {
                ut.x.b(obj);
                Context context2 = NewConnectionFlowDialog.this.getContext();
                if (context2 != null) {
                    cp.e eVarA = cp.e.f46961d.a(context2);
                    this.f24561a = context2;
                    this.f24562b = context2;
                    this.f24563c = 1;
                    Object objJ = eVarA.j(this);
                    if (objJ == objF) {
                        return objF;
                    }
                    context = context2;
                    obj = objJ;
                }
                return m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.f24562b;
            ut.x.b(obj);
            bp.d dVar = (bp.d) obj;
            String strF = dVar != null ? dVar.f() : null;
            if (strF == null) {
                strF = "";
            }
            xn.e.a(context, strF);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24565a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Context context = NewConnectionFlowDialog.this.getContext();
            if (context != null) {
                String string = NewConnectionFlowDialog.this.getString(R.string.connection_troubleshooting_page_url);
                ju.t.e(string, "getString(...)");
                xn.e.d(context, string);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24567a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24567a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73176t.I();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24569a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24569a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73176t.setColorForSshId();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24571a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73176t.T();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24574a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24574a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73180x.f72008l.setVisibility(4);
            NewConnectionFlowDialog.this.zg().f73180x.f72009m.setVisibility(4);
            NewConnectionFlowDialog.this.zg().f73180x.f72010n.setVisibility(0);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24576a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24576a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.zg().f73179w.f71901h.setVisibility(4);
            NewConnectionFlowDialog.this.zg().f73179w.f71902i.setVisibility(0);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowDialog f24580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f24581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f24582e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z10, NewConnectionFlowDialog newConnectionFlowDialog, boolean z11, boolean z12, zt.e eVar) {
            super(2, eVar);
            this.f24579b = z10;
            this.f24580c = newConnectionFlowDialog;
            this.f24581d = z11;
            this.f24582e = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(NewConnectionFlowDialog newConnectionFlowDialog, boolean z10, boolean z11, boolean z12) {
            newConnectionFlowDialog.Lg().X2(z10, z11, z12);
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new r(this.f24579b, this.f24580c, this.f24581d, this.f24582e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!this.f24579b) {
                ConnectionProgressView connectionProgressView = this.f24580c.zg().f73176t;
                final NewConnectionFlowDialog newConnectionFlowDialog = this.f24580c;
                final boolean z10 = this.f24581d;
                final boolean z11 = this.f24579b;
                final boolean z12 = this.f24582e;
                connectionProgressView.K(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.connection.j
                    @Override // iu.a
                    public final Object a() {
                        return NewConnectionFlowDialog.r.k(newConnectionFlowDialog, z10, z11, z12);
                    }
                });
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
        int f24583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gh.s f24584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypeOfCurrentConnection f24585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowDialog f24586d;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24587a;

            static {
                int[] iArr = new int[TypeOfConnect.values().length];
                try {
                    iArr[TypeOfConnect.Terminal.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f24587a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(gh.s sVar, TypeOfCurrentConnection typeOfCurrentConnection, NewConnectionFlowDialog newConnectionFlowDialog, zt.e eVar) {
            super(2, eVar);
            this.f24584b = sVar;
            this.f24585c = typeOfCurrentConnection;
            this.f24586d = newConnectionFlowDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new s(this.f24584b, this.f24585c, this.f24586d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TypeOfCurrentConnection terminalConnection;
            Long lA;
            au.b.f();
            if (this.f24583a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            gh.s sVar = this.f24584b;
            if (sVar == null || (lA = sVar.a()) == null) {
                terminalConnection = this.f24585c;
            } else {
                gh.s sVar2 = this.f24584b;
                long jLongValue = lA.longValue();
                terminalConnection = a.f24587a[sVar2.b().ordinal()] == 1 ? new TypeOfCurrentConnection.TerminalConnection(true, kotlin.coroutines.jvm.internal.b.e(jLongValue)) : new TypeOfCurrentConnection.SftpConnection(true, kotlin.coroutines.jvm.internal.b.e(jLongValue));
            }
            NewConnectionFlowQueue.INSTANCE.setStartOverConnectionType(terminalConnection);
            FragmentActivity activity = this.f24586d.getActivity();
            if (activity != null) {
                activity.finish();
            }
            FragmentActivity activity2 = this.f24586d.getActivity();
            if (activity2 != null) {
                activity2.overridePendingTransition(0, R.anim.fadeout);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24588a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i10, zt.e eVar) {
            super(2, eVar);
            this.f24590c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new t(this.f24590c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24588a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Bundle bundle = new Bundle();
            Intent intent = new Intent(NewConnectionFlowDialog.this.requireActivity(), (Class<?>) TerminalActivity.class);
            intent.setFlags(603979776);
            intent.putExtra("parameter_history", this.f24590c).putExtras(bundle);
            NewConnectionFlowDialog.this.startActivity(intent);
            FragmentActivity activity = NewConnectionFlowDialog.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            FragmentActivity activity2 = NewConnectionFlowDialog.this.getActivity();
            if (activity2 != null) {
                activity2.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class u implements w.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f24592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f24593c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f24595b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(iu.a aVar, zt.e eVar) {
                super(2, eVar);
                this.f24595b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24595b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f24594a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f24595b.a();
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f24597b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(iu.a aVar, zt.e eVar) {
                super(2, eVar);
                this.f24597b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new b(this.f24597b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f24596a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f24597b.a();
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        u(iu.a aVar, iu.a aVar2) {
            this.f24592b = aVar;
            this.f24593c = aVar2;
        }

        @Override // w6.w.f
        public void a(w6.w wVar) {
            ju.t.f(wVar, "transition");
            bh.a.b(NewConnectionFlowDialog.this, new b(this.f24592b, null));
        }

        @Override // w6.w.f
        public void b(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void c(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void d(w6.w wVar) {
            ju.t.f(wVar, "transition");
        }

        @Override // w6.w.f
        public void e(w6.w wVar) {
            ju.t.f(wVar, "transition");
            bh.a.b(NewConnectionFlowDialog.this, new a(this.f24593c, null));
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24598a;

        v(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new v(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24598a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            UsbManager usbManager = NewConnectionFlowDialog.this.f24488y;
            HashMap<String, UsbDevice> deviceList = usbManager != null ? usbManager.getDeviceList() : null;
            if (deviceList != null) {
                Collection<UsbDevice> collectionValues = deviceList.values();
                ju.t.e(collectionValues, "<get-values>(...)");
                ArrayList<UsbDevice> arrayList = new ArrayList(collectionValues);
                NewConnectionFlowDialog newConnectionFlowDialog = NewConnectionFlowDialog.this;
                for (UsbDevice usbDevice : arrayList) {
                    UsbManager usbManager2 = newConnectionFlowDialog.f24488y;
                    if (usbManager2 == null || !usbManager2.hasPermission(usbDevice)) {
                        newConnectionFlowDialog.C = usbDevice;
                        FragmentActivity fragmentActivityRequireActivity = newConnectionFlowDialog.requireActivity();
                        Intent intent = new Intent("com.android.example.USB_PERMISSION");
                        intent.putExtra("yubikey_usb_request_code", 9373);
                        m0 m0Var = m0.f82633a;
                        PendingIntent broadcast = PendingIntent.getBroadcast(fragmentActivityRequireActivity, 9373, intent, 67108864);
                        UsbManager usbManager3 = newConnectionFlowDialog.f24488y;
                        if (usbManager3 != null) {
                            usbManager3.requestPermission(usbDevice, broadcast);
                        }
                    } else {
                        newConnectionFlowDialog.ih(usbDevice);
                    }
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24600a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24600a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.eh();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24602a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f24604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(b bVar, zt.e eVar) {
            super(2, eVar);
            this.f24604c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 l(View view, NewConnectionFlowDialog newConnectionFlowDialog, b bVar) {
            if (view == null) {
                newConnectionFlowDialog.ng(bVar);
            }
            return m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 m(View view, NewConnectionFlowDialog newConnectionFlowDialog, b bVar) {
            if (view != null) {
                newConnectionFlowDialog.ng(bVar);
            }
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new x(this.f24604c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24602a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final View viewWg = NewConnectionFlowDialog.this.wg();
            View viewYg = NewConnectionFlowDialog.this.Yg(this.f24604c);
            String strTg = NewConnectionFlowDialog.this.tg(this.f24604c);
            if (strTg.length() > 0) {
                NewConnectionFlowDialog.this.zg().f73158b.setText(strTg);
            }
            if (viewYg != null) {
                viewYg.setEnabled(true);
                NewConnectionFlowDialog.this.fh(this.f24604c);
                final NewConnectionFlowDialog newConnectionFlowDialog = NewConnectionFlowDialog.this;
                final b bVar = this.f24604c;
                iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.connection.k
                    @Override // iu.a
                    public final Object a() {
                        return NewConnectionFlowDialog.x.l(viewWg, newConnectionFlowDialog, bVar);
                    }
                };
                final NewConnectionFlowDialog newConnectionFlowDialog2 = NewConnectionFlowDialog.this;
                final b bVar2 = this.f24604c;
                newConnectionFlowDialog.jg(viewWg, viewYg, aVar, new iu.a() { // from class: com.server.auditor.ssh.client.fragments.connection.l
                    @Override // iu.a
                    public final Object a() {
                        return NewConnectionFlowDialog.x.m(viewWg, newConnectionFlowDialog2, bVar2);
                    }
                });
            } else if (viewWg != null) {
                NewConnectionFlowDialog.this.vg(viewWg);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24607c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowDialog.this.new y(this.f24607c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24605a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.this.Bg().L1(this.f24607c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowDialog f24610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(boolean z10, NewConnectionFlowDialog newConnectionFlowDialog, zt.e eVar) {
            super(2, eVar);
            this.f24609b = z10;
            this.f24610c = newConnectionFlowDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new z(this.f24609b, this.f24610c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24608a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f24609b) {
                this.f24610c.zg().f73176t.U();
            } else {
                this.f24610c.zg().f73176t.H();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public NewConnectionFlowDialog() {
        iu.a aVar = new iu.a() { // from class: gh.c0
            @Override // iu.a
            public final Object a() {
                return NewConnectionFlowDialog.bh();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24480c = new MoxyKtxDelegate(mvpDelegate, NewConnectionFlowPresenter.class.getName() + ".presenter", aVar);
        this.f24481d = ut.o.a(new iu.a() { // from class: gh.d0
            @Override // iu.a
            public final Object a() {
                return NewConnectionFlowDialog.ah(this.f51284a);
            }
        });
        this.f24484u = true;
        this.D = ut.o.a(new iu.a() { // from class: gh.e0
            @Override // iu.a
            public final Object a() {
                return NewConnectionFlowDialog.mg(this.f51287a);
            }
        });
        this.E = ut.o.a(new iu.a() { // from class: gh.f0
            @Override // iu.a
            public final Object a() {
                return NewConnectionFlowDialog.ug(this.f51290a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Ag() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Bg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map Cg() {
        return (Map) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Dg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Eg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Fg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Gg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Hg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    private final ViewGroup Ig() {
        return (ViewGroup) this.f24481d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Jg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Kg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewConnectionFlowPresenter Lg() {
        return (NewConnectionFlowPresenter) this.f24480c.getValue(this, Z[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Mg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.F;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Ng() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Og() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Pg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Qg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Rg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Sg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Tg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c Ug() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    private final void Wg() {
        Xg();
        ConstraintLayout constraintLayout = zg().f73164h;
        ConstraintLayout constraintLayout2 = zg().f73164h;
        ju.t.e(constraintLayout2, "connectionStepsLayout");
        z0.N0(constraintLayout, new pi.d(constraintLayout2, a2.l.i(), a2.l.d(), 1));
        ConnectionProgressView connectionProgressView = zg().f73176t;
        ConnectionProgressView connectionProgressView2 = zg().f73176t;
        ju.t.e(connectionProgressView2, "progressIndicator");
        int i10 = 8;
        ju.k kVar = null;
        int i11 = 0;
        z0.N0(connectionProgressView, new pi.d(connectionProgressView2, a2.l.i(), a2.l.d(), i11, i10, kVar));
        ConstraintLayout constraintLayout3 = zg().f73182z;
        ConstraintLayout constraintLayout4 = zg().f73182z;
        ju.t.e(constraintLayout4, "topBar");
        z0.N0(constraintLayout3, new pi.d(constraintLayout4, a2.l.i(), a2.l.d(), i11, i10, kVar));
        View view = zg().f73160d;
        View view2 = zg().f73160d;
        ju.t.e(view2, "backgroundView");
        z0.N0(view, new pi.d(view2, a2.l.i(), a2.l.d(), i11, i10, kVar));
        TextInputEditText textInputEditText = zg().f73174r.f72655e;
        TextInputEditText textInputEditText2 = zg().f73174r.f72655e;
        ju.t.e(textInputEditText2, "portInputField");
        int i12 = 0;
        int i13 = 2;
        ju.k kVar2 = null;
        z0.N0(textInputEditText, new pi.b(textInputEditText2, i12, i13, kVar2));
        TextInputEditText textInputEditText3 = zg().A.f72873i;
        TextInputEditText textInputEditText4 = zg().A.f72873i;
        ju.t.e(textInputEditText4, "usernameInputField");
        z0.N0(textInputEditText3, new pi.b(textInputEditText4, i12, i13, kVar2));
        TextInputEditText textInputEditText5 = zg().f73172p.f72557f;
        TextInputEditText textInputEditText6 = zg().f73172p.f72557f;
        ju.t.e(textInputEditText6, "passwordInputField");
        z0.N0(textInputEditText5, new pi.b(textInputEditText6, i12, i13, kVar2));
        TextInputEditText textInputEditText7 = zg().f73171o.f72457h;
        TextInputEditText textInputEditText8 = zg().f73171o.f72457h;
        ju.t.e(textInputEditText8, "passphraseInputField");
        z0.N0(textInputEditText7, new pi.b(textInputEditText8, i12, i13, kVar2));
    }

    private final void Xg() {
        this.f24482e = new pi.c(a2.l.i(), a2.l.d());
        ConstraintLayout constraintLayoutB = zg().b();
        pi.c cVar = this.f24482e;
        pi.c cVar2 = null;
        if (cVar == null) {
            ju.t.t("deferringInsetsListener");
            cVar = null;
        }
        z0.N0(constraintLayoutB, cVar);
        ConstraintLayout constraintLayoutB2 = zg().b();
        pi.c cVar3 = this.f24482e;
        if (cVar3 == null) {
            ju.t.t("deferringInsetsListener");
        } else {
            cVar2 = cVar3;
        }
        z0.F0(constraintLayoutB2, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Yg(b bVar) {
        if (bVar instanceof b.d) {
            return zg().f73177u.b();
        }
        if (bVar instanceof b.e) {
            return zg().f73166j.b();
        }
        if (bVar instanceof b.h) {
            return zg().f73173q.b();
        }
        if (bVar instanceof b.r) {
            return zg().f73174r.b();
        }
        if (bVar instanceof b.s) {
            return zg().f73175s.b();
        }
        if (bVar instanceof b.c) {
            return zg().f73159c.b();
        }
        if (bVar instanceof b.f) {
            return zg().f73168l.b();
        }
        if (bVar instanceof b.g) {
            return zg().f73163g.b();
        }
        if (bVar instanceof b.j) {
            return zg().f73172p.b();
        }
        if (bVar instanceof b.l) {
            return zg().f73167k.b();
        }
        if (bVar instanceof b.p) {
            return zg().f73181y.b();
        }
        if (bVar instanceof b.t) {
            return zg().A.b();
        }
        if (bVar instanceof b.i) {
            return zg().f73171o.b();
        }
        if (bVar instanceof b.q) {
            return zg().f73178v.b();
        }
        if (bVar instanceof b.m) {
            return zg().f73170n.b();
        }
        if (ju.t.b(bVar, b.a.f24490a)) {
            return zg().f73161e.b();
        }
        if (bVar instanceof b.C0391b) {
            return zg().B.b();
        }
        if (bVar instanceof b.o) {
            return zg().f73180x.b();
        }
        if (bVar instanceof b.n) {
            return zg().f73179w.b();
        }
        if (ju.t.b(bVar, b.k.f24516a)) {
            return null;
        }
        throw new ut.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Zg(NewConnectionFlowDialog newConnectionFlowDialog, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        newConnectionFlowDialog.Lg().M2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup ah(NewConnectionFlowDialog newConnectionFlowDialog) {
        ViewParent parent = newConnectionFlowDialog.requireView().getParent();
        ju.t.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewConnectionFlowPresenter bh() {
        return new NewConnectionFlowPresenter();
    }

    private final void ch(a0 a0Var, View view, View view2, iu.a aVar, iu.a aVar2) {
        a0Var.b(new u(aVar, aVar2));
        w6.y.b(Ig(), a0Var);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.p(zg().f73164h);
        if (view != null) {
            cVar.c0(view.getId(), 8);
        }
        if (view2 != null) {
            cVar.c0(view2.getId(), 0);
        }
        cVar.i(zg().f73164h);
        if (this.f24483f != null) {
            zg().f73176t.G();
            this.f24483f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.fragment.app.Fragment, com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.Toast] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.Toast] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x0034
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void dh(com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog r6, android.nfc.Tag r7) throws java.lang.Throwable {
        /*
            r0 = 2132019552(0x7f140960, float:1.9677442E38)
            r1 = 0
            r2 = 0
            rq.d r3 = new rq.d     // Catch: java.lang.Throwable -> L40 sq.c -> L42 sq.b -> L44 sq.a -> L55 java.io.IOException -> L66
            rq.a r4 = r6.B     // Catch: java.lang.Throwable -> L40 sq.c -> L42 sq.b -> L44 sq.a -> L55 java.io.IOException -> L66
            uq.a r5 = uq.a.f82549a     // Catch: java.lang.Throwable -> L40 sq.c -> L42 sq.b -> L44 sq.a -> L55 java.io.IOException -> L66
            uq.b r7 = r5.a(r7)     // Catch: java.lang.Throwable -> L40 sq.c -> L42 sq.b -> L44 sq.a -> L55 java.io.IOException -> L66
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L40 sq.c -> L42 sq.b -> L44 sq.a -> L55 java.io.IOException -> L66
            boolean r7 = r3.h()     // Catch: java.lang.Throwable -> L1c sq.b -> L20 sq.a -> L22 java.io.IOException -> L24 sq.c -> L26
            if (r7 == 0) goto L29
            r3.m()     // Catch: java.lang.Throwable -> L1c sq.b -> L20 sq.a -> L22 java.io.IOException -> L24 sq.c -> L26
            goto L29
        L1c:
            r7 = move-exception
            r2 = r3
            goto L89
        L20:
            r2 = r3
            goto L44
        L22:
            r2 = r3
            goto L55
        L24:
            r2 = r3
            goto L66
        L26:
            r7 = move-exception
            r2 = r3
            goto L74
        L29:
            rq.b r7 = r6.f24486w     // Catch: java.lang.Throwable -> L1c sq.b -> L20 sq.a -> L22 java.io.IOException -> L24 sq.c -> L26
            if (r7 == 0) goto L30
            r7.T8(r3)     // Catch: java.lang.Throwable -> L1c sq.b -> L20 sq.a -> L22 java.io.IOException -> L24 sq.c -> L26
        L30:
            r3.b()     // Catch: java.io.IOException -> L34
            goto L88
        L34:
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)
            r6.show()
            goto L88
        L40:
            r7 = move-exception
            goto L89
        L42:
            r7 = move-exception
            goto L74
        L44:
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()     // Catch: java.lang.Throwable -> L40
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)     // Catch: java.lang.Throwable -> L40
            r7.show()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L88
        L51:
            r2.b()     // Catch: java.io.IOException -> L34
            goto L88
        L55:
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()     // Catch: java.lang.Throwable -> L40
            r3 = 2132017275(0x7f14007b, float:1.9672824E38)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r3, r1)     // Catch: java.lang.Throwable -> L40
            r7.show()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L88
            goto L51
        L66:
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()     // Catch: java.lang.Throwable -> L40
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)     // Catch: java.lang.Throwable -> L40
            r7.show()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L88
            goto L51
        L74:
            rq.b r3 = r6.f24486w     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L85
            rq.a r4 = r6.B     // Catch: java.lang.Throwable -> L40
            byte[] r5 = r7.a()     // Catch: java.lang.Throwable -> L40
            boolean r7 = r7.b()     // Catch: java.lang.Throwable -> L40
            r3.Fa(r4, r5, r7)     // Catch: java.lang.Throwable -> L40
        L85:
            if (r2 == 0) goto L88
            goto L51
        L88:
            return
        L89:
            if (r2 == 0) goto L9a
            r2.b()     // Catch: java.io.IOException -> L8f
            goto L9a
        L8f:
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)
            r6.show()
        L9a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.dh(com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog, android.nfc.Tag):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eh() {
        bh.a.b(this, new v(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fh(b bVar) {
        if (bVar instanceof b.d) {
            Mg().O0(bVar);
            return;
        }
        if (bVar instanceof b.e) {
            Dg().O0(bVar);
            return;
        }
        if (bVar instanceof b.j) {
            Kg().O0(bVar);
            return;
        }
        if (bVar instanceof b.i) {
            Jg().O0(bVar);
            return;
        }
        if (bVar instanceof b.t) {
            Tg().O0(bVar);
            return;
        }
        if (bVar instanceof b.l) {
            Eg().O0(bVar);
            return;
        }
        if (bVar instanceof b.p) {
            Rg().O0(bVar);
            return;
        }
        if (bVar instanceof b.c) {
            xg().O0(bVar);
            return;
        }
        if (bVar instanceof b.f) {
            Fg().O0(bVar);
            return;
        }
        if (bVar instanceof b.a) {
            Ag().O0(bVar);
            return;
        }
        if (bVar instanceof b.C0391b) {
            Ug().O0(bVar);
            return;
        }
        if (bVar instanceof b.g) {
            Bg().O0(bVar);
            return;
        }
        if (bVar instanceof b.r) {
            Og().O0(bVar);
            return;
        }
        if (bVar instanceof b.h) {
            Gg().O0(bVar);
            return;
        }
        if (bVar instanceof b.s) {
            Sg().O0(bVar);
            return;
        }
        if (bVar instanceof b.q) {
            Ng().O0(bVar);
            return;
        }
        if (bVar instanceof b.m) {
            Hg().O0(bVar);
            return;
        }
        if (!(bVar instanceof b.o)) {
            if (bVar instanceof b.n) {
                Pg().O0(bVar);
                return;
            } else {
                if (!ju.t.b(bVar, b.k.f24516a)) {
                    throw new ut.s();
                }
                return;
            }
        }
        Qg().O0(bVar);
        if (lg(((b.o) bVar).b())) {
            ConnectionProgressView connectionProgressView = zg().f73176t;
            ju.t.e(connectionProgressView, "progressIndicator");
            connectionProgressView.setVisibility(0);
            return;
        }
        ConnectionProgressView connectionProgressView2 = zg().f73176t;
        ju.t.e(connectionProgressView2, "progressIndicator");
        connectionProgressView2.setVisibility(8);
        zg().f73158b.setText(getString(R.string.ssh_id_connection_flow_failed));
        ConstraintLayout constraintLayout = zg().f73179w.f71901h;
        ju.t.e(constraintLayout, "keySelectorLayout");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = zg().f73179w.f71902i;
        ju.t.e(constraintLayout2, "progress");
        constraintLayout2.setVisibility(8);
        ConstraintLayout constraintLayoutB = zg().f73163g.b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        constraintLayoutB.setVisibility(8);
    }

    private final void hh(tq.j jVar) {
        try {
            if (jVar.r0()) {
                jVar.L0();
            }
            rq.b bVar = this.f24486w;
            if (bVar != null) {
                bVar.a9(jVar);
            }
        } catch (Exception e10) {
            y9.a.f86838a.i(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ih(UsbDevice usbDevice) {
        try {
            rq.a aVar = this.B;
            UsbManager usbManager = this.f24488y;
            if (aVar == null || usbManager == null) {
                return;
            }
            hh(new tq.j(aVar, tq.d.f81075v.b(usbManager, usbDevice)));
        } catch (Exception e10) {
            y9.a.f86838a.i(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jg(View view, View view2, iu.a aVar, iu.a aVar2) {
        pi.c cVar = this.f24482e;
        pi.c cVar2 = null;
        if (cVar == null) {
            ju.t.t("deferringInsetsListener");
            cVar = null;
        }
        if (cVar.f() != 0) {
            ConnectionProgressView connectionProgressView = zg().f73176t;
            pi.c cVar3 = this.f24482e;
            if (cVar3 == null) {
                ju.t.t("deferringInsetsListener");
            } else {
                cVar2 = cVar3;
            }
            connectionProgressView.setAnimationDuration(cVar2.f());
        }
        a0 a0Var = new a0();
        a0Var.q0(0);
        a0Var.X(zg().f73176t.getAnimationDuration());
        a0Var.Z(new LinearInterpolator());
        if (view2 != null) {
            w6.f fVar = new w6.f(1);
            fVar.d(view2);
            a0Var.i0(fVar);
        }
        if (view != null) {
            w6.f fVar2 = new w6.f(2);
            fVar2.d(view);
            a0Var.i0(fVar2);
        }
        ConstraintLayout constraintLayout = zg().f73164h;
        w6.d dVar = new w6.d();
        dVar.c(constraintLayout.getId());
        a0Var.i0(dVar);
        ConstraintLayout constraintLayout2 = zg().f73182z;
        w6.d dVar2 = new w6.d();
        dVar2.c(constraintLayout2.getId());
        a0Var.i0(dVar2);
        ConnectionProgressView connectionProgressView2 = zg().f73176t;
        w6.d dVar3 = new w6.d();
        dVar3.c(connectionProgressView2.getId());
        a0Var.i0(dVar3);
        View view3 = zg().f73160d;
        w6.d dVar4 = new w6.d();
        dVar4.c(view3.getId());
        a0Var.i0(dVar4);
        a0 a0Var2 = this.f24483f;
        if (a0Var2 != null) {
            a0Var.i0(a0Var2);
        }
        ch(a0Var, view, view2, aVar, aVar2);
    }

    private final void kg(b bVar, iu.l lVar) {
        if (bVar instanceof b.d) {
            lVar.invoke(Mg());
            return;
        }
        if (bVar instanceof b.e) {
            lVar.invoke(Dg());
            return;
        }
        if (bVar instanceof b.j) {
            lVar.invoke(Kg());
            return;
        }
        if (bVar instanceof b.i) {
            lVar.invoke(Jg());
            return;
        }
        if (bVar instanceof b.g) {
            lVar.invoke(Bg());
            return;
        }
        if (bVar instanceof b.l) {
            lVar.invoke(Eg());
            return;
        }
        if (bVar instanceof b.p) {
            lVar.invoke(Rg());
            return;
        }
        if (bVar instanceof b.c) {
            lVar.invoke(xg());
            return;
        }
        if (bVar instanceof b.f) {
            lVar.invoke(Fg());
            return;
        }
        if (bVar instanceof b.h) {
            lVar.invoke(Gg());
            return;
        }
        if (bVar instanceof b.r) {
            lVar.invoke(Og());
            return;
        }
        if (bVar instanceof b.s) {
            lVar.invoke(Sg());
            return;
        }
        if (bVar instanceof b.t) {
            lVar.invoke(Tg());
            return;
        }
        if (bVar instanceof b.q) {
            lVar.invoke(Ng());
            return;
        }
        if (ju.t.b(bVar, b.a.f24490a)) {
            lVar.invoke(Ag());
        } else if (bVar instanceof b.C0391b) {
            lVar.invoke(Ug());
        } else if (bVar instanceof b.m) {
            lVar.invoke(Hg());
        }
    }

    private final boolean lg(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((SshIdAuthData) it.next()).getKeyPairStatus() != KeyPairStatus.FAILED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View[] mg(NewConnectionFlowDialog newConnectionFlowDialog) {
        return new View[]{newConnectionFlowDialog.zg().f73177u.b(), newConnectionFlowDialog.zg().f73174r.b(), newConnectionFlowDialog.zg().f73173q.b(), newConnectionFlowDialog.zg().f73175s.b(), newConnectionFlowDialog.zg().f73166j.b(), newConnectionFlowDialog.zg().A.b(), newConnectionFlowDialog.zg().f73167k.b(), newConnectionFlowDialog.zg().f73172p.b(), newConnectionFlowDialog.zg().f73171o.b(), newConnectionFlowDialog.zg().f73181y.b(), newConnectionFlowDialog.zg().f73161e.b(), newConnectionFlowDialog.zg().f73159c.b(), newConnectionFlowDialog.zg().f73168l.b(), newConnectionFlowDialog.zg().f73163g.b(), newConnectionFlowDialog.zg().f73178v.b(), newConnectionFlowDialog.zg().f73170n.b(), newConnectionFlowDialog.zg().f73180x.b(), newConnectionFlowDialog.zg().f73179w.b()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ng(b bVar) {
        kg(bVar, new iu.l() { // from class: gh.g0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return NewConnectionFlowDialog.pg(this.f51293a, (com.server.auditor.ssh.client.fragments.connection.c) obj);
            }
        });
    }

    private static final void og(View view) {
        tp.z.c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 pg(final NewConnectionFlowDialog newConnectionFlowDialog, com.server.auditor.ssh.client.fragments.connection.c cVar) {
        ju.t.f(cVar, "_delegate");
        cVar.B1();
        cVar.J1(new iu.l() { // from class: gh.i0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return NewConnectionFlowDialog.qg((TextInputEditText) obj);
            }
        });
        cVar.b1(new iu.a() { // from class: gh.j0
            @Override // iu.a
            public final Object a() {
                return NewConnectionFlowDialog.rg(this.f51302a);
            }
        });
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 qg(TextInputEditText textInputEditText) {
        ju.t.f(textInputEditText, "textInputField");
        sg(textInputEditText);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 rg(NewConnectionFlowDialog newConnectionFlowDialog) {
        ConstraintLayout constraintLayoutB = newConnectionFlowDialog.zg().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        og(constraintLayoutB);
        return m0.f82633a;
    }

    private static final void sg(View view) {
        tp.z.e(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tg(b bVar) {
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            String strB = dVar.b();
            return strB.length() == 0 ? dVar.a() : strB;
        }
        if (bVar instanceof b.e) {
            String string = getString(R.string.connection_flow_approve_fingerprint);
            ju.t.c(string);
            return string;
        }
        if (bVar instanceof b.j) {
            String string2 = getString(R.string.connection_flow_enter_password);
            ju.t.c(string2);
            return string2;
        }
        if (bVar instanceof b.c) {
            String string3 = getString(R.string.connection_flow_auth_banner_title);
            ju.t.c(string3);
            return string3;
        }
        if (bVar instanceof b.f) {
            String string4 = getString(R.string.connection_flow_keyboard_interactive_auth);
            ju.t.c(string4);
            return string4;
        }
        if (bVar instanceof b.g) {
            String string5 = getString(R.string.connection_flow_keyboard_connection_failed);
            ju.t.c(string5);
            return string5;
        }
        if (bVar instanceof b.h) {
            String string6 = getString(R.string.connection_flow_configure_mosh);
            ju.t.c(string6);
            return string6;
        }
        if (bVar instanceof b.l) {
            String string7 = getString(R.string.connection_flow_select_identity);
            ju.t.c(string7);
            return string7;
        }
        if (bVar instanceof b.p) {
            String string8 = getString(R.string.connection_flow_select_key_title);
            ju.t.c(string8);
            return string8;
        }
        if (bVar instanceof b.r) {
            String string9 = getString(R.string.connection_flow_configure_ssh);
            ju.t.c(string9);
            return string9;
        }
        if (bVar instanceof b.s) {
            String string10 = getString(R.string.connection_flow_configure_telnet);
            ju.t.c(string10);
            return string10;
        }
        if (bVar instanceof b.t) {
            String string11 = getString(R.string.connection_flow_set_username);
            ju.t.c(string11);
            return string11;
        }
        if (bVar instanceof b.i) {
            String string12 = getString(R.string.connection_flow_enter_passphrase);
            ju.t.c(string12);
            return string12;
        }
        if (bVar instanceof b.q) {
            String string13 = getString(R.string.connection_type_snippet_variables_restricted_title);
            ju.t.c(string13);
            return string13;
        }
        if (bVar instanceof b.m) {
            String string14 = getString(R.string.connection_flow_keyboard_interactive_auth);
            ju.t.c(string14);
            return string14;
        }
        if (ju.t.b(bVar, b.a.f24490a)) {
            String string15 = getString(R.string.connection_flow_unlock_biometric_key);
            ju.t.c(string15);
            return string15;
        }
        if (bVar instanceof b.C0391b) {
            String string16 = getString(R.string.connection_flow_web_authn_step_title);
            ju.t.c(string16);
            return string16;
        }
        if (bVar instanceof b.o) {
            String string17 = getString(R.string.ssh_id_connection_flow_select_key_step_title);
            ju.t.c(string17);
            return string17;
        }
        if (bVar instanceof b.n) {
            String string18 = getString(R.string.ssh_id_connection_flow_select_key_step_title);
            ju.t.c(string18);
            return string18;
        }
        if (ju.t.b(bVar, b.k.f24516a)) {
            return "";
        }
        throw new ut.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map ug(NewConnectionFlowDialog newConnectionFlowDialog) {
        return s0.k(b0.a(newConnectionFlowDialog.zg().f73177u.b(), newConnectionFlowDialog.Mg()), b0.a(newConnectionFlowDialog.zg().f73174r.b(), newConnectionFlowDialog.Og()), b0.a(newConnectionFlowDialog.zg().f73173q.b(), newConnectionFlowDialog.Gg()), b0.a(newConnectionFlowDialog.zg().f73175s.b(), newConnectionFlowDialog.Sg()), b0.a(newConnectionFlowDialog.zg().f73166j.b(), newConnectionFlowDialog.Dg()), b0.a(newConnectionFlowDialog.zg().A.b(), newConnectionFlowDialog.Tg()), b0.a(newConnectionFlowDialog.zg().f73167k.b(), newConnectionFlowDialog.Eg()), b0.a(newConnectionFlowDialog.zg().f73172p.b(), newConnectionFlowDialog.Kg()), b0.a(newConnectionFlowDialog.zg().f73171o.b(), newConnectionFlowDialog.Jg()), b0.a(newConnectionFlowDialog.zg().f73181y.b(), newConnectionFlowDialog.Rg()), b0.a(newConnectionFlowDialog.zg().f73161e.b(), newConnectionFlowDialog.Ag()), b0.a(newConnectionFlowDialog.zg().B.b(), newConnectionFlowDialog.Ug()), b0.a(newConnectionFlowDialog.zg().f73159c.b(), newConnectionFlowDialog.xg()), b0.a(newConnectionFlowDialog.zg().f73168l.b(), newConnectionFlowDialog.Fg()), b0.a(newConnectionFlowDialog.zg().f73163g.b(), newConnectionFlowDialog.Bg()), b0.a(newConnectionFlowDialog.zg().f73178v.b(), newConnectionFlowDialog.Ng()), b0.a(newConnectionFlowDialog.zg().f73170n.b(), newConnectionFlowDialog.Hg()), b0.a(newConnectionFlowDialog.zg().f73180x.b(), newConnectionFlowDialog.Qg()), b0.a(newConnectionFlowDialog.zg().f73179w.b(), newConnectionFlowDialog.Pg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vg(View view) {
        com.server.auditor.ssh.client.fragments.connection.c cVar = (com.server.auditor.ssh.client.fragments.connection.c) Cg().get(view);
        if (cVar != null) {
            cVar.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View wg() {
        for (View view : yg()) {
            if (view.getVisibility() == 0) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.fragments.connection.c xg() {
        com.server.auditor.ssh.client.fragments.connection.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    private final View[] yg() {
        return (View[]) this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m3 zg() {
        m3 m3Var = this.f24478a;
        if (m3Var != null) {
            return m3Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void B8(TypeOfCurrentConnection typeOfCurrentConnection, gh.s sVar) {
        ju.t.f(typeOfCurrentConnection, "typeOfCurrentConnection");
        bh.a.b(this, new s(sVar, typeOfCurrentConnection, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Cb(long j10) {
        bh.a.b(this, new j(j10, null));
    }

    @Override // uq.c
    public void Ee(final Tag tag) {
        ju.t.f(tag, "tag");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: gh.h0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                NewConnectionFlowDialog.dh(this.f51296a, tag);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void F9(b bVar) {
        ju.t.f(bVar, "step");
        bh.a.b(this, new x(bVar, null));
    }

    @Override // rq.b
    public void Fa(rq.a aVar, byte[] bArr, boolean z10) {
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void H3() {
        bh.a.b(this, new p(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Ie(int i10) {
        bh.a.b(this, new t(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void K9() {
        bh.a.b(this, new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void L1(boolean z10) {
        bh.a.b(this, new y(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Sa(boolean z10) {
        bh.a.b(this, new z(z10, this, null));
    }

    @Override // rq.b
    public void T8(rq.d dVar) throws IOException {
        ju.t.f(dVar, "neo");
        List listF = dVar.f(((System.currentTimeMillis() / 1000) + 10) / 30);
        ju.t.c(listF);
        gh(listF);
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void T9() {
        bh.a.b(this, new o(null));
    }

    public final void Vg(Intent intent) {
        ju.t.f(intent, "intent");
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        Parcelable parcelable = parcelableArrayExtra != null ? parcelableArrayExtra[0] : null;
        NdefMessage ndefMessage = parcelable instanceof NdefMessage ? (NdefMessage) parcelable : null;
        if (ndefMessage != null) {
            byte[] byteArray = ndefMessage.toByteArray();
            char[] cArr = new char[byteArray.length];
            int length = byteArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                cArr[i10] = (char) byteArray[i10];
            }
            Object objB0 = vt.v.B0(su.s.Q0(new String(cArr), new String[]{"/"}, false, 0, 6, null));
            String str = (String) objB0;
            if (su.s.S(str, "#", false, 2, null)) {
                objB0 = su.s.O(str, "#", "", false, 4, null);
            }
            com.server.auditor.ssh.client.fragments.connection.c cVar = (com.server.auditor.ssh.client.fragments.connection.c) Cg().get(wg());
            if (cVar == null || !(cVar instanceof OneTimeCodeSelectViewDelegate)) {
                return;
            }
            Lg().a3(vt.v.e(new rq.c((String) objB0, "")));
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void W1() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Xd() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Xe() {
        bh.a.b(this, new g(null));
    }

    @Override // rq.b
    public void a9(tq.j jVar) {
        ju.t.f(jVar, "oAth");
        gh(jVar.g0(((System.currentTimeMillis() / 1000) + 10) / 30));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void c() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void d3() {
        bh.a.b(this, new w(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void dd() {
        bh.a.b(this, new m(null));
    }

    public final void gh(List list) {
        ju.t.f(list, "codes");
        ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new rq.c((String) map.get("code"), (String) map.get("label")));
        }
        Lg().z3(arrayList);
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void h9(boolean z10, boolean z11, boolean z12) {
        bh.a.b(this, new r(z11, this, z10, z12, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void ha() {
        bh.a.b(this, new q(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void j6() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void k7(b bVar) {
        ju.t.f(bVar, "step");
        bh.a.b(this, new d(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void kd() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: gh.b0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return NewConnectionFlowDialog.Zg(this.f51271a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24479b = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24486w = this;
        Object systemService = requireActivity().getSystemService("usb");
        ju.t.d(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        this.f24488y = (UsbManager) systemService;
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("NEO_STORE", 0);
        ju.t.e(sharedPreferences, "getSharedPreferences(...)");
        this.B = new rq.a(sharedPreferences);
        if (Build.VERSION.SDK_INT < 31) {
            TagDispatcher.a aVar = TagDispatcher.f46888e;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f24485v = aVar.a(fragmentActivityRequireActivity, this, false, false, true, false, true);
        }
        this.f24487x = new BroadcastReceiver() { // from class: com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.onCreate.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                UsbManager usbManager;
                ju.t.f(context, "context");
                ju.t.f(intent, "intent");
                if (NewConnectionFlowDialog.this.Cg().get(NewConnectionFlowDialog.this.wg()) instanceof OneTimeCodeSelectViewDelegate) {
                    if (!ju.t.b("com.android.example.USB_PERMISSION", intent.getAction())) {
                        if (ju.t.b("android.hardware.usb.action.USB_DEVICE_ATTACHED", intent.getAction())) {
                            NewConnectionFlowDialog.this.Lg().A3();
                            return;
                        }
                        return;
                    }
                    NewConnectionFlowDialog newConnectionFlowDialog = NewConnectionFlowDialog.this;
                    synchronized (this) {
                        try {
                            if (intent.getIntExtra("yubikey_usb_request_code", 0) != 9373) {
                                return;
                            }
                            UsbDevice usbDevice = newConnectionFlowDialog.C;
                            if (usbDevice != null && (usbManager = newConnectionFlowDialog.f24488y) != null && usbManager.hasPermission(usbDevice)) {
                                newConnectionFlowDialog.ih(usbDevice);
                            }
                            newConnectionFlowDialog.C = null;
                            m0 m0Var = m0.f82633a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.android.example.USB_PERMISSION");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        androidx.core.content.a.registerReceiver(requireContext(), this.f24487x, intentFilter, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24478a = m3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = zg().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        requireActivity().unregisterReceiver(this.f24487x);
        super.onDestroy();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.f24478a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24479b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        TagDispatcher tagDispatcher;
        super.onPause();
        if (Build.VERSION.SDK_INT >= 31 || (tagDispatcher = this.f24485v) == null) {
            return;
        }
        tagDispatcher.c();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 31) {
            if (this.f24484u) {
                TagDispatcher tagDispatcher = this.f24485v;
                if (tagDispatcher != null) {
                    tagDispatcher.e(requireActivity().getIntent());
                }
                this.f24484u = false;
            }
            TagDispatcher tagDispatcher2 = this.f24485v;
            TagDispatcher.NfcStatus nfcStatusD = tagDispatcher2 != null ? tagDispatcher2.d() : null;
            int i10 = nfcStatusD == null ? -1 : c.f24544a[nfcStatusD.ordinal()];
            if (i10 == 1) {
                this.f24489z = false;
                this.A = true;
            } else if (i10 == 2) {
                this.f24489z = false;
                this.A = false;
            } else if (i10 != 3) {
                this.f24489z = false;
                this.A = false;
            } else {
                this.f24489z = true;
                this.A = true;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        t0 t0Var = zg().f73177u;
        ju.t.e(t0Var, "selectConnectionTypeStep");
        this.F = new com.server.auditor.ssh.client.fragments.connection.o(t0Var, Lg());
        h6 h6Var = zg().f73174r;
        ju.t.e(h6Var, "portEditorSsh");
        this.G = new com.server.auditor.ssh.client.fragments.connection.q(h6Var, Lg());
        i6 i6Var = zg().f73175s;
        ju.t.e(i6Var, "portEditorTelnet");
        this.H = new com.server.auditor.ssh.client.fragments.connection.u(i6Var, Lg());
        e6 e6Var = zg().f73173q;
        ju.t.e(e6Var, "portEditorMosh");
        this.I = new com.server.auditor.ssh.client.fragments.connection.h(e6Var, Lg());
        j6 j6Var = zg().A;
        ju.t.e(j6Var, "usernameInputStep");
        this.J = new com.server.auditor.ssh.client.fragments.connection.v(j6Var, Lg());
        qg.r rVar = zg().f73166j;
        ju.t.e(rVar, "hostFingerprintStep");
        this.K = new com.server.auditor.ssh.client.fragments.connection.f(rVar, Lg());
        g6 g6Var = zg().f73172p;
        ju.t.e(g6Var, "passwordInputStep");
        this.L = new com.server.auditor.ssh.client.fragments.connection.n(g6Var, Lg());
        f6 f6Var = zg().f73171o;
        ju.t.e(f6Var, "passphraseInputStep");
        this.M = new com.server.auditor.ssh.client.fragments.connection.m(f6Var, Lg());
        y5 y5Var = zg().f73167k;
        ju.t.e(y5Var, "identitySelectionStep");
        this.N = new IdentitySelectViewDelegate(y5Var, Lg());
        c6 c6Var = zg().f73181y;
        ju.t.e(c6Var, "sshKeySelectionStep");
        this.O = new com.server.auditor.ssh.client.fragments.connection.t(c6Var, Lg());
        m8 m8Var = zg().f73161e;
        ju.t.e(m8Var, "biometricKeyUnlockStep");
        this.P = new com.server.auditor.ssh.client.fragments.connection.b(m8Var, Lg());
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "getMvpDelegate(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        t8 t8Var = zg().B;
        ju.t.e(t8Var, "webAuthnKeyStep");
        this.Q = new com.server.auditor.ssh.client.fragments.connection.d(mvpDelegate, fragmentActivityRequireActivity, t8Var, Lg());
        qg.s sVar = zg().f73159c;
        ju.t.e(sVar, "authBannerStep");
        this.R = new com.server.auditor.ssh.client.fragments.connection.a(sVar, Lg(), null, 4, null);
        w2 w2Var = zg().f73168l;
        ju.t.e(w2Var, "keyboardInteractiveStep");
        this.S = new com.server.auditor.ssh.client.fragments.connection.g(w2Var, Lg());
        u0 u0Var = zg().f73163g;
        ju.t.e(u0Var, "connectionLogsStep");
        this.T = new com.server.auditor.ssh.client.fragments.connection.e(u0Var, Lg());
        g7 g7Var = zg().f73178v;
        ju.t.e(g7Var, "snippetVariableErrorStep");
        this.U = new com.server.auditor.ssh.client.fragments.connection.p(g7Var, Lg());
        z5 z5Var = zg().f73170n;
        ju.t.e(z5Var, "oneTimeCodeSelectStep");
        this.V = new OneTimeCodeSelectViewDelegate(z5Var, Lg());
        b6 b6Var = zg().f73180x;
        ju.t.e(b6Var, "sshIdKeySelectionStep");
        this.W = new com.server.auditor.ssh.client.fragments.connection.s(b6Var, Lg());
        a6 a6Var = zg().f73179w;
        ju.t.e(a6Var, "sshIdHardwareKeySelectionStep");
        this.X = new com.server.auditor.ssh.client.fragments.connection.r(a6Var, Lg());
        Wg();
    }

    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void ue() {
        bh.a.b(this, new k(null));
    }
}
