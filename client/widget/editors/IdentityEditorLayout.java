package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.widget.sharingmodeselector.CredentialsModeSelectorView;
import iu.l;
import ju.k;
import ju.t;
import qg.s2;
import ut.s;

/* JADX INFO: loaded from: classes4.dex */
public final class IdentityEditorLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46704b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46705c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final IdentityEditorMode f46706d = IdentityEditorMode.USERNAME;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s2 f46707a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IdentityEditorMode {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ IdentityEditorMode[] $VALUES;
        public static final IdentityEditorMode INVISIBLE = new IdentityEditorMode("INVISIBLE", 0);
        public static final IdentityEditorMode IDENTITY = new IdentityEditorMode("IDENTITY", 1);
        public static final IdentityEditorMode USERNAME = new IdentityEditorMode("USERNAME", 2);

        private static final /* synthetic */ IdentityEditorMode[] $values() {
            return new IdentityEditorMode[]{INVISIBLE, IDENTITY, USERNAME};
        }

        static {
            IdentityEditorMode[] identityEditorModeArr$values = $values();
            $VALUES = identityEditorModeArr$values;
            $ENTRIES = bu.b.a(identityEditorModeArr$values);
        }

        private IdentityEditorMode(String str, int i10) {
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static IdentityEditorMode valueOf(String str) {
            return (IdentityEditorMode) Enum.valueOf(IdentityEditorMode.class, str);
        }

        public static IdentityEditorMode[] values() {
            return (IdentityEditorMode[]) $VALUES.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46708a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1874260399;
            }

            public String toString() {
                return "Attach";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$b$b, reason: collision with other inner class name */
        public static final class C0664b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0664b f46709a = new C0664b();

            private C0664b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0664b);
            }

            public int hashCode() {
                return 1946295037;
            }

            public String toString() {
                return "Detach";
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46710a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -513695516;
            }

            public String toString() {
                return "Attach";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f46711a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -441660878;
            }

            public String toString() {
                return "Detach";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$c$c, reason: collision with other inner class name */
        public static final class C0665c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0665c f46712a = new C0665c();

            private C0665c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0665c);
            }

            public int hashCode() {
                return -1662557500;
            }

            public String toString() {
                return "SshId";
            }
        }

        public /* synthetic */ c(k kVar) {
            this();
        }

        private c() {
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46713a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 2102866391;
            }

            public String toString() {
                return "UserAttachedKey";
            }
        }

        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f46714a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2067203397;
            }

            public String toString() {
                return "UserAttachedSshId";
            }
        }

        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f46715a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -748991790;
            }

            public String toString() {
                return "UserCanAttachSshId";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout$d$d, reason: collision with other inner class name */
        public static final class C0666d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0666d f46716a = new C0666d();

            private C0666d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0666d);
            }

            public int hashCode() {
                return -1937935401;
            }

            public String toString() {
                return "UserCanNotAttachSshId";
            }
        }

        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f46717a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 994004470;
            }

            public String toString() {
                return "UserNotLoggedIn";
            }
        }

        public /* synthetic */ d(k kVar) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f46718a;

        public e(l lVar) {
            this.f46718a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f46718a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class f implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f46719a;

        public f(l lVar) {
            this.f46719a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f46719a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdentityEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void R(boolean z10) {
        ConstraintLayout constraintLayout = this.f46707a.Q;
        t.e(constraintLayout, "usernameContainer");
        constraintLayout.setVisibility(z10 ? 0 : 8);
        RelativeLayout relativeLayout = this.f46707a.f73798s;
        t.e(relativeLayout, "flipAnimationIdentityLayout");
        relativeLayout.setVisibility(z10 ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.f46707a.I;
        t.e(constraintLayout2, "passwordSectionContainer");
        constraintLayout2.setVisibility(z10 ? 0 : 8);
    }

    private final String d(d dVar) {
        if (dVar instanceof d.e) {
            String string = this.f46707a.b().getContext().getString(R.string.key_hint_user_no_login);
            t.e(string, "getString(...)");
            return string;
        }
        if (dVar instanceof d.c) {
            String string2 = this.f46707a.b().getContext().getString(R.string.key_hint_user_can_attach_ssh_id);
            t.e(string2, "getString(...)");
            return string2;
        }
        if (dVar instanceof d.C0666d) {
            String string3 = this.f46707a.b().getContext().getString(R.string.key_hint_user_cannot_attach_ssh_id);
            t.e(string3, "getString(...)");
            return string3;
        }
        if (dVar instanceof d.b) {
            String string4 = this.f46707a.b().getContext().getString(R.string.key_hint_user_attached_ssh_id);
            t.e(string4, "getString(...)");
            return string4;
        }
        if (!(dVar instanceof d.a)) {
            throw new s();
        }
        String string5 = this.f46707a.b().getContext().getString(R.string.key_hint_user_attached_ssh_key);
        t.e(string5, "getString(...)");
        return string5;
    }

    private final void g(String str, String str2) {
        if (str != null) {
            this.f46707a.P.setText(str);
        }
        ConstraintLayout constraintLayout = this.f46707a.O;
        t.e(constraintLayout, "sshidViewUsernameLayout");
        boolean z10 = true;
        constraintLayout.setVisibility(!(str == null || str.length() == 0) ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.f46707a.M;
        t.e(constraintLayout2, "sshidViewPasswordLayout");
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        }
        constraintLayout2.setVisibility(z10 ? 8 : 0);
        Space space = this.f46707a.J;
        t.e(space, "passwordSpacer");
        space.setVisibility(0);
    }

    private final void l(boolean z10) {
        String string = this.f46707a.b().getContext().getString(R.string.account_ssh_id);
        t.e(string, "getString(...)");
        if (z10) {
            this.f46707a.f73786g.setHint(string);
        } else {
            this.f46707a.f73786g.setHint("");
            this.f46707a.f73786g.setText(string);
        }
    }

    public final void A(d dVar) {
        t.f(dVar, "keySectionState");
        this.f46707a.f73787h.setHint(d(dVar));
    }

    public final void B(boolean z10) {
        this.f46707a.C.setEnabled(z10);
        this.f46707a.f73787h.setEnabled(z10);
        this.f46707a.f73786g.setEnabled(z10);
        this.f46707a.f73784e.setEnabled(z10);
        this.f46707a.f73793n.setEnabled(z10);
    }

    public final void C(String str) {
        t.f(str, "teamName");
        this.f46707a.f73796q.setText(getContext().getString(R.string.ssh_multikey_footer, str));
    }

    public final void D(boolean z10) {
        ConstraintLayout constraintLayout = this.f46707a.D;
        t.e(constraintLayout, "multikeyItem");
        constraintLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void E(String str) {
        this.f46707a.E.setText(str);
    }

    public final void F(String str) {
        this.f46707a.H.setError(str);
    }

    public final void G(boolean z10) {
        LinearLayout linearLayout = this.f46707a.F;
        t.e(linearLayout, "passwordInheritanceInfoContainer");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void H(String str) {
        t.f(str, "inheritanceName");
        this.f46707a.G.setText(str);
    }

    public final void I(String str) {
        this.f46707a.H.setPlaceholderText(str);
    }

    public final void J(boolean z10) {
        this.f46707a.H.setEnabled(z10);
        this.f46707a.K.setEnabled(z10);
    }

    public final void K(boolean z10) {
        ConstraintLayout constraintLayout = this.f46707a.I;
        t.e(constraintLayout, "passwordSectionContainer");
        constraintLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void L(d dVar) {
        t.f(dVar, "keySectionState");
        boolean zB = t.b(dVar, d.b.f46714a);
        ConstraintLayout constraintLayout = this.f46707a.O;
        t.e(constraintLayout, "sshidViewUsernameLayout");
        constraintLayout.setVisibility(zB ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.f46707a.M;
        t.e(constraintLayout2, "sshidViewPasswordLayout");
        constraintLayout2.setVisibility(zB ? 0 : 8);
        Space space = this.f46707a.J;
        t.e(space, "passwordSpacer");
        space.setVisibility(zB ? 0 : 8);
    }

    public final void M(String str) {
        this.f46707a.R.setText(str);
    }

    public final void N(String str) {
        this.f46707a.U.setError(str);
    }

    public final void O(boolean z10) {
        LinearLayout linearLayout = this.f46707a.S;
        t.e(linearLayout, "usernameInheritanceInfoContainer");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void P(String str) {
        t.f(str, "inheritanceName");
        this.f46707a.T.setText(str);
    }

    public final void Q(String str) {
        this.f46707a.U.setPlaceholderText(str);
    }

    public final void a(l lVar) {
        t.f(lVar, "action");
        TextInputEditText textInputEditText = this.f46707a.E;
        t.e(textInputEditText, "passwordEditText");
        textInputEditText.addTextChangedListener(new e(lVar));
    }

    public final void b(l lVar) {
        t.f(lVar, "action");
        TextInputEditText textInputEditText = this.f46707a.R;
        t.e(textInputEditText, "usernameEditText");
        textInputEditText.addTextChangedListener(new f(lVar));
    }

    public final void c() {
        int selectionStart = this.f46707a.E.getSelectionStart();
        int selectionEnd = this.f46707a.E.getSelectionEnd();
        this.f46707a.K.setChecked(false);
        this.f46707a.E.setTransformationMethod(new PasswordTransformationMethod());
        this.f46707a.E.setSelection(selectionStart, selectionEnd);
    }

    public final void e() {
        ConstraintLayout constraintLayout = this.f46707a.Q;
        t.e(constraintLayout, "usernameContainer");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = this.f46707a.I;
        t.e(constraintLayout2, "passwordSectionContainer");
        constraintLayout2.setVisibility(8);
    }

    public final void f() {
        int selectionStart = this.f46707a.E.getSelectionStart();
        int selectionEnd = this.f46707a.E.getSelectionEnd();
        this.f46707a.K.setChecked(true);
        this.f46707a.E.setTransformationMethod(null);
        this.f46707a.E.setSelection(selectionStart, selectionEnd);
    }

    public final void h(String str) {
        this.f46707a.f73785f.setText(str);
    }

    public final void i(String str) {
        this.f46707a.f73785f.setHint(str);
    }

    public final void j(String str) {
        this.f46707a.f73786g.setHint(str);
    }

    public final void k(String str) {
        this.f46707a.f73786g.setText(str);
    }

    public final void m(String str) {
        t.f(str, "credentialsMode");
        this.f46707a.f73789j.A(str);
    }

    public final void n(boolean z10) {
        this.f46707a.f73789j.setEnabled(z10);
    }

    public final void o(boolean z10) {
        CredentialsModeSelectorView credentialsModeSelectorView = this.f46707a.f73789j;
        t.e(credentialsModeSelectorView, "credentialsModeSelector");
        credentialsModeSelectorView.setVisibility(z10 ? 0 : 8);
        AppCompatTextView appCompatTextView = this.f46707a.f73791l;
        t.e(appCompatTextView, "credentialsTitle");
        appCompatTextView.setVisibility(z10 ? 8 : 0);
    }

    public final void p(String str, boolean z10, String str2, String str3) {
        if (str != null) {
            l(z10);
            R(false);
        } else {
            R(true);
        }
        g(str2, str3);
    }

    public final void q(boolean z10) {
        AppCompatImageButton appCompatImageButton = this.f46707a.f73794o;
        t.e(appCompatImageButton, "detachSshIdButton");
        appCompatImageButton.setVisibility(z10 ? 0 : 8);
    }

    public final void r(b bVar, boolean z10) {
        t.f(bVar, "identityIconState");
        AppCompatImageButton appCompatImageButton = this.f46707a.f73782c;
        t.e(appCompatImageButton, "attachIdentityButton");
        boolean z11 = appCompatImageButton.getVisibility() == 0;
        b.a aVar = b.a.f46708a;
        if (z11 != t.b(bVar, aVar)) {
            if (z10) {
                s2 s2Var = this.f46707a;
                xp.a aVar2 = new xp.a(s2Var.f73782c, s2Var.f73792m);
                if (t.b(bVar, aVar)) {
                    aVar2.b();
                }
                this.f46707a.f73798s.startAnimation(aVar2);
                return;
            }
            AppCompatImageButton appCompatImageButton2 = this.f46707a.f73782c;
            t.e(appCompatImageButton2, "attachIdentityButton");
            appCompatImageButton2.setVisibility(t.b(bVar, aVar) ? 0 : 8);
            AppCompatImageButton appCompatImageButton3 = this.f46707a.f73792m;
            t.e(appCompatImageButton3, "detachIdentityButton");
            appCompatImageButton3.setVisibility(t.b(bVar, b.C0664b.f46709a) ? 0 : 8);
        }
    }

    public final void s(boolean z10) {
        LinearLayout linearLayout = this.f46707a.f73802w;
        t.e(linearLayout, "identityInheritanceInfoContainer");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void setOnAttachIdentityButtonClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73782c.setOnClickListener(onClickListener);
    }

    public final void setOnAttachKeyButtonClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73784e.setOnClickListener(onClickListener);
    }

    public final void setOnCredentialsModeSelectorCallback(CredentialsModeSelectorView.a aVar) {
        t.f(aVar, "callback");
        this.f46707a.f73789j.setCallBack(aVar);
    }

    public final void setOnDetachIdentityButtonClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73792m.setOnClickListener(onClickListener);
    }

    public final void setOnDetachKeyButtonClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73793n.setOnClickListener(onClickListener);
    }

    public final void setOnDetachSshIdButtonClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73794o.setOnClickListener(onClickListener);
    }

    public final void setOnIdentityContainerClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.f73800u.setOnClickListener(onClickListener);
    }

    public final void setOnKeySectionClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.C.setOnClickListener(onClickListener);
    }

    public final void setOnMultikeyClickListener(View.OnClickListener onClickListener) {
        t.f(onClickListener, "onClickListener");
        this.f46707a.D.setOnClickListener(onClickListener);
    }

    public final void setOnRevealPasswordButtonClickListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        t.f(onCheckedChangeListener, "onCheckedChangeListener");
        this.f46707a.K.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setPasswordHintExpandable(boolean z10) {
        this.f46707a.H.setExpandedHintEnabled(z10);
    }

    public final void setUsernameHintExpandable(boolean z10) {
        this.f46707a.U.setExpandedHintEnabled(z10);
    }

    public final void t(String str) {
        t.f(str, "inheritanceName");
        this.f46707a.f73803x.setText(str);
    }

    public final void u(boolean z10) {
        this.f46707a.f73800u.setEnabled(z10);
        this.f46707a.f73785f.setEnabled(z10);
        this.f46707a.f73783d.setEnabled(z10);
        this.f46707a.f73782c.setEnabled(z10);
        this.f46707a.f73792m.setEnabled(z10);
        this.f46707a.U.setEnabled(z10);
        this.f46707a.f73782c.setEnabled(z10);
        this.f46707a.f73792m.setEnabled(z10);
    }

    public final void v(IdentityEditorMode identityEditorMode) {
        t.f(identityEditorMode, "identityMode");
        boolean z10 = identityEditorMode == IdentityEditorMode.IDENTITY;
        boolean z11 = identityEditorMode == IdentityEditorMode.USERNAME;
        boolean z12 = identityEditorMode == IdentityEditorMode.INVISIBLE;
        ConstraintLayout constraintLayout = this.f46707a.f73804y;
        t.e(constraintLayout, "identitySectionContainer");
        constraintLayout.setVisibility(!z12 ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.f46707a.f73800u;
        t.e(constraintLayout2, "identityContainer");
        constraintLayout2.setVisibility(z10 ? 0 : 8);
        ConstraintLayout constraintLayout3 = this.f46707a.Q;
        t.e(constraintLayout3, "usernameContainer");
        constraintLayout3.setVisibility(z11 ? 0 : 8);
    }

    public final void w(boolean z10) {
        ConstraintLayout constraintLayout = this.f46707a.C;
        t.e(constraintLayout, "keySectionContainer");
        constraintLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void x(c cVar, boolean z10) {
        t.f(cVar, "keyIconState");
        if (z10) {
            s2 s2Var = this.f46707a;
            xp.a aVar = new xp.a(s2Var.f73784e, s2Var.f73793n);
            if (t.b(cVar, c.a.f46710a)) {
                aVar.b();
            }
            this.f46707a.f73799t.startAnimation(aVar);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.f46707a.f73784e;
        t.e(appCompatImageButton, "attachKeyButton");
        appCompatImageButton.setVisibility(t.b(cVar, c.a.f46710a) ? 0 : 8);
        AppCompatImageButton appCompatImageButton2 = this.f46707a.f73793n;
        t.e(appCompatImageButton2, "detachKeyButton");
        appCompatImageButton2.setVisibility(t.b(cVar, c.b.f46711a) ? 0 : 8);
        RelativeLayout relativeLayout = this.f46707a.f73798s;
        t.e(relativeLayout, "flipAnimationIdentityLayout");
        c.C0665c c0665c = c.C0665c.f46712a;
        relativeLayout.setVisibility(t.b(cVar, c0665c) ? 8 : 0);
        q(t.b(cVar, c0665c));
    }

    public final void y(boolean z10) {
        LinearLayout linearLayout = this.f46707a.A;
        t.e(linearLayout, "keyInheritanceInfoContainer");
        linearLayout.setVisibility(z10 ? 0 : 8);
    }

    public final void z(String str) {
        t.f(str, "inheritanceName");
        this.f46707a.B.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdentityEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ IdentityEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        s2 s2VarC = s2.c(LayoutInflater.from(context), this, true);
        t.e(s2VarC, "inflate(...)");
        this.f46707a = s2VarC;
        int[] iArr = cg.b.IdentityEditorLayout;
        t.e(iArr, "IdentityEditorLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o(typedArrayObtainStyledAttributes.getBoolean(2, false));
        D(typedArrayObtainStyledAttributes.getBoolean(3, false));
        IdentityEditorMode identityEditorMode = f46706d;
        int i11 = typedArrayObtainStyledAttributes.getInt(1, -1);
        v(i11 >= 0 ? IdentityEditorMode.values()[i11] : identityEditorMode);
        w(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
