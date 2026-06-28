package com.server.auditor.ssh.client.ui.keyselector.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import c2.c3;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import cp.e;
import e3.e;
import e3.n2;
import hv.m;
import hv.p;
import i3.c0;
import i3.y;
import iu.q;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import ut.m0;
import ut.x;
import wu.i0;
import zu.a0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdParametersEditorViewModel extends i1 {
    private static final String BEGINNING_GROUP = "Authentication for hosts in this group will use device-bound keys from ";
    private static final String BEGINNING_HOST = "Authentication for this host will use device-bound keys from ";
    private static final String BODY_AND = " and ";
    private static final String BODY_AT = "@";
    private static final String BODY_DEFAULT = " with the default username ";
    private static final String BODY_DOT = ".";
    private static final String BODY_PASSWORD = "password.";
    private static final String BODY_USERNAME = " with the username ";
    private final yu.d _fragmentActions;
    private final w _isBottomSheetVisible;
    private final w _isSkPasskeysEnabled;
    private final w _passkeyType;
    private final w _passwordFromCredentials;
    private final w _usernameFromCredentials;
    private final n2 boldStyle;
    private final k0 description;
    private final zu.f fragmentActions;
    private final k0 isBottomSheetVisible;
    private final boolean isGroupEditing;
    private final a0 isSkPasskeysEnabled;
    private final n2 linkStyle;
    private final String sshIdUsername;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    @p
    @Keep
    public interface SshIdParametersFragmentActions extends Parcelable {
        public static final a Companion = a.f40305a;

        public static final class OnOpenSshIdPublicProfilePage implements SshIdParametersFragmentActions {
            public static final OnOpenSshIdPublicProfilePage INSTANCE = new OnOpenSshIdPublicProfilePage();
            public static final Parcelable.Creator<OnOpenSshIdPublicProfilePage> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnOpenSshIdPublicProfilePage createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return OnOpenSshIdPublicProfilePage.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnOpenSshIdPublicProfilePage[] newArray(int i10) {
                    return new OnOpenSshIdPublicProfilePage[i10];
                }
            }

            private OnOpenSshIdPublicProfilePage() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OnOpenSshIdPublicProfilePage);
            }

            public int hashCode() {
                return 866966894;
            }

            public String toString() {
                return "OnOpenSshIdPublicProfilePage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class OnSaveSshIdChanges implements SshIdParametersFragmentActions {
            private final String passkeyType;
            private final String password;
            private final String username;
            public static final Parcelable.Creator<OnSaveSshIdChanges> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OnSaveSshIdChanges createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    return new OnSaveSshIdChanges(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OnSaveSshIdChanges[] newArray(int i10) {
                    return new OnSaveSshIdChanges[i10];
                }
            }

            public OnSaveSshIdChanges(String str, String str2, String str3) {
                t.f(str, "username");
                t.f(str2, "password");
                t.f(str3, "passkeyType");
                this.username = str;
                this.password = str2;
                this.passkeyType = str3;
            }

            public static /* synthetic */ OnSaveSshIdChanges copy$default(OnSaveSshIdChanges onSaveSshIdChanges, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = onSaveSshIdChanges.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = onSaveSshIdChanges.password;
                }
                if ((i10 & 4) != 0) {
                    str3 = onSaveSshIdChanges.passkeyType;
                }
                return onSaveSshIdChanges.copy(str, str2, str3);
            }

            public final String component1() {
                return this.username;
            }

            public final String component2() {
                return this.password;
            }

            public final String component3() {
                return this.passkeyType;
            }

            public final OnSaveSshIdChanges copy(String str, String str2, String str3) {
                t.f(str, "username");
                t.f(str2, "password");
                t.f(str3, "passkeyType");
                return new OnSaveSshIdChanges(str, str2, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnSaveSshIdChanges)) {
                    return false;
                }
                OnSaveSshIdChanges onSaveSshIdChanges = (OnSaveSshIdChanges) obj;
                return t.b(this.username, onSaveSshIdChanges.username) && t.b(this.password, onSaveSshIdChanges.password) && t.b(this.passkeyType, onSaveSshIdChanges.passkeyType);
            }

            public final String getPasskeyType() {
                return this.passkeyType;
            }

            public final String getPassword() {
                return this.password;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.passkeyType.hashCode();
            }

            public String toString() {
                return "OnSaveSshIdChanges(username=" + this.username + ", password=" + this.password + ", passkeyType=" + this.passkeyType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeString(this.username);
                parcel.writeString(this.password);
                parcel.writeString(this.passkeyType);
            }
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f40305a = new a();

            private a() {
            }

            public final hv.c serializer() {
                return new m("com.server.auditor.ssh.client.ui.keyselector.domain.SshIdParametersEditorViewModel.SshIdParametersFragmentActions", n0.b(SshIdParametersFragmentActions.class), new qu.b[0], new hv.c[0], new Annotation[0]);
            }
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40306a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40306a;
            if (i10 == 0) {
                x.b(obj);
                cp.e eVarB = e.a.b(cp.e.f46961d, null, 1, null);
                this.f40306a = 1;
                obj = eVarB.j(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            bp.d dVar = (bp.d) obj;
            if (dVar != null) {
                SshIdParametersEditorViewModel.this._isSkPasskeysEnabled.setValue(kotlin.coroutines.jvm.internal.b.a(dVar.h()));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40310c;

        c(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, String str2, zt.e eVar) {
            c cVar = SshIdParametersEditorViewModel.this.new c(eVar);
            cVar.f40309b = str;
            cVar.f40310c = str2;
            return cVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40308a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String str = (String) this.f40309b;
            String str2 = (String) this.f40310c;
            SshIdParametersEditorViewModel sshIdParametersEditorViewModel = SshIdParametersEditorViewModel.this;
            e.b bVar = new e.b(0, 1, null);
            bVar.g(sshIdParametersEditorViewModel.getDescriptionBeginning());
            bVar.g(sshIdParametersEditorViewModel.getDescriptionOfCredentials(str, str2));
            return bVar.r();
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40312a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40312a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdParametersEditorViewModel.this._fragmentActions;
                SshIdParametersFragmentActions.OnOpenSshIdPublicProfilePage onOpenSshIdPublicProfilePage = SshIdParametersFragmentActions.OnOpenSshIdPublicProfilePage.INSTANCE;
                this.f40312a = 1;
                if (dVar.b(onOpenSshIdPublicProfilePage, this) == objF) {
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

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40314a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40314a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdParametersEditorViewModel.this._fragmentActions;
                SshIdParametersFragmentActions.OnSaveSshIdChanges onSaveSshIdChanges = new SshIdParametersFragmentActions.OnSaveSshIdChanges((String) SshIdParametersEditorViewModel.this._usernameFromCredentials.getValue(), (String) SshIdParametersEditorViewModel.this._passwordFromCredentials.getValue(), (String) SshIdParametersEditorViewModel.this._passkeyType.getValue());
                this.f40314a = 1;
                if (dVar.b(onSaveSshIdChanges, this) == objF) {
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40316a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f40318c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new f(this.f40318c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40316a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdParametersEditorViewModel.this._passkeyType.setValue(this.f40318c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40319a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f40321c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new g(this.f40321c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40319a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdParametersEditorViewModel.this._passwordFromCredentials.setValue(this.f40321c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40322a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f40324c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new h(this.f40324c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40322a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdParametersEditorViewModel.this._usernameFromCredentials.setValue(this.f40324c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40325a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f40327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f40327c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdParametersEditorViewModel.this.new i(this.f40327c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40325a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SshIdParametersEditorViewModel.this._isBottomSheetVisible.setValue(kotlin.coroutines.jvm.internal.b.a(this.f40327c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public /* synthetic */ SshIdParametersEditorViewModel(String str, String str2, String str3, boolean z10, String str4, long j10, k kVar) {
        this(str, str2, str3, z10, str4, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e3.e getDescriptionBeginning() {
        e.b bVar = new e.b(0, 1, null);
        if (this.isGroupEditing) {
            bVar.i(BEGINNING_GROUP);
        } else {
            bVar.i(BEGINNING_HOST);
        }
        int iQ = bVar.q(this.linkStyle);
        try {
            bVar.i("sshid.io/" + this.sshIdUsername);
            m0 m0Var = m0.f82633a;
            bVar.n(iQ);
            return bVar.r();
        } catch (Throwable th2) {
            bVar.n(iQ);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e3.e getDescriptionOfCredentials(String str, String str2) {
        int iQ;
        e.b bVar = new e.b(0, 1, null);
        if (str.length() == 0 && str2.length() == 0) {
            bVar.i(BODY_DEFAULT);
            iQ = bVar.q(this.boldStyle);
            try {
                bVar.i(BODY_AT + this.sshIdUsername + BODY_DOT);
                m0 m0Var = m0.f82633a;
                bVar.n(iQ);
            } finally {
            }
        } else if (str.length() > 0 && str2.length() > 0) {
            bVar.i(BODY_USERNAME);
            iQ = bVar.q(this.boldStyle);
            try {
                bVar.i(BODY_AT + str);
                m0 m0Var2 = m0.f82633a;
                bVar.n(iQ);
                bVar.i(BODY_AND);
                iQ = bVar.q(this.boldStyle);
                try {
                    bVar.i(BODY_PASSWORD);
                    bVar.n(iQ);
                } finally {
                }
            } finally {
            }
        } else if (str.length() != 0 || str2.length() <= 0) {
            bVar.i(BODY_USERNAME);
            iQ = bVar.q(this.boldStyle);
            try {
                bVar.i(BODY_AT + str + BODY_DOT);
                m0 m0Var3 = m0.f82633a;
            } finally {
            }
        } else {
            bVar.i(BODY_DEFAULT);
            iQ = bVar.q(this.boldStyle);
            try {
                bVar.i(BODY_AT + this.sshIdUsername);
                m0 m0Var4 = m0.f82633a;
                bVar.n(iQ);
                bVar.i(BODY_AND);
                iQ = bVar.q(this.boldStyle);
                try {
                    bVar.i(BODY_PASSWORD);
                    bVar.n(iQ);
                } finally {
                }
            } finally {
            }
        }
        return bVar.r();
    }

    public final k0 getDescription() {
        return this.description;
    }

    public final zu.f getFragmentActions() {
        return this.fragmentActions;
    }

    public final k0 getPasskeyType() {
        return this._passkeyType;
    }

    public final k0 getPasswordFromCredentials() {
        return this._passwordFromCredentials;
    }

    public final k0 getUsernameFromCredentials() {
        return this._usernameFromCredentials;
    }

    public final k0 isBottomSheetVisible() {
        return this.isBottomSheetVisible;
    }

    public final a0 isSkPasskeysEnabled() {
        return this.isSkPasskeysEnabled;
    }

    public final void onLearnMoreClicked() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onSaveButtonClicked() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onUpdatePasskeyType(String str) {
        t.f(str, "updatedValue");
        wu.k.d(j1.a(this), null, null, new f(str, null), 3, null);
    }

    public final void onUpdatePasswordFromCredentials(String str) {
        t.f(str, "updatedValue");
        wu.k.d(j1.a(this), null, null, new g(str, null), 3, null);
    }

    public final void onUpdateUsernameFromCredentials(String str) {
        t.f(str, "updatedValue");
        wu.k.d(j1.a(this), null, null, new h(str, null), 3, null);
    }

    public final void setPasskeyBottomSheetVisibility(boolean z10) {
        wu.k.d(j1.a(this), null, null, new i(z10, null), 3, null);
    }

    private SshIdParametersEditorViewModel(String str, String str2, String str3, boolean z10, String str4, long j10) {
        t.f(str, "initCredentialsUsername");
        t.f(str2, "initCredentialsPassword");
        t.f(str4, "sshIdUsername");
        this.isGroupEditing = z10;
        this.sshIdUsername = str4;
        c0.a aVar = c0.f55829b;
        this.boldStyle = new n2(0L, 0L, aVar.b(), (i3.x) null, (y) null, (i3.k) null, (String) null, 0L, (p3.a) null, (p3.q) null, (l3.e) null, 0L, (p3.k) null, (c3) null, (e3.k0) null, (e2.g) null, 65531, (k) null);
        this.linkStyle = new n2(j10, 0L, aVar.b(), (i3.x) null, (y) null, (i3.k) null, (String) null, 0L, (p3.a) null, (p3.q) null, (l3.e) null, 0L, p3.k.f69809b.d(), (c3) null, (e3.k0) null, (e2.g) null, 61434, (k) null);
        w wVarA = zu.m0.a(str);
        this._usernameFromCredentials = wVarA;
        w wVarA2 = zu.m0.a(str2);
        this._passwordFromCredentials = wVarA2;
        this._passkeyType = zu.m0.a(str3 == null ? HostContentKt.BACKSPACE_TYPE_DEFAULT : str3);
        Boolean bool = Boolean.FALSE;
        w wVarA3 = zu.m0.a(bool);
        this._isSkPasskeysEnabled = wVarA3;
        this.isSkPasskeysEnabled = wVarA3;
        w wVarA4 = zu.m0.a(bool);
        this._isBottomSheetVisible = wVarA4;
        this.isBottomSheetVisible = wVarA4;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._fragmentActions = dVarB;
        this.fragmentActions = zu.h.M(dVarB);
        this.description = zu.h.P(zu.h.C(wVarA, wVarA2, new c(null)), j1.a(this), g0.f88389a.c(), new e3.e("", null, 2, null));
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }
}
