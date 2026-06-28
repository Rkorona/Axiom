package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.a2;
import com.server.auditor.ssh.client.fragments.SetupTeamVaultCredentialsModeScreen;
import com.server.auditor.ssh.client.fragments.o;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.presenters.SetupTeamVaultCredentialsModePresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import java.util.List;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.k6;
import tp.c1;
import tp.w0;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class SetupTeamVaultCredentialsModeScreen extends MvpAppCompatFragment implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k6 f24050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f24052c = new androidx.navigation.x(n0.b(SetupTeamVaultCredentialsModeScreenArgs.class), new i(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f24053d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24048f = {n0.g(new g0(SetupTeamVaultCredentialsModeScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/SetupTeamVaultCredentialsModePresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24047e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f24049u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, zt.e eVar) {
            super(2, eVar);
            this.f24056c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new b(this.f24056c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = SetupTeamVaultCredentialsModeScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(this.f24056c);
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24057a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24057a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultCredentialsModeScreen.this.Mf();
            SetupTeamVaultCredentialsModeScreen.this.Gf();
            SetupTeamVaultCredentialsModeScreen.this.Hf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24059a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24059a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(SetupTeamVaultCredentialsModeScreen.this).T()) {
                SetupTeamVaultCredentialsModeScreen.this.x(1002);
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
        int f24061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f24064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModeScreen f24065e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, boolean z10, String str, SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, zt.e eVar) {
            super(2, eVar);
            this.f24062b = i10;
            this.f24063c = z10;
            this.f24064d = str;
            this.f24065e = setupTeamVaultCredentialsModeScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f24062b, this.f24063c, this.f24064d, this.f24065e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            o.a aVarF = o.a(this.f24062b, this.f24063c).f(this.f24064d);
            ju.t.e(aVarF, "setCallerFeature(...)");
            androidx.navigation.fragment.c.a(this.f24065e).O(aVarF);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f24067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f24069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModeScreen f24070e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, boolean z10, String str, SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, zt.e eVar) {
            super(2, eVar);
            this.f24067b = list;
            this.f24068c = z10;
            this.f24069d = str;
            this.f24070e = setupTeamVaultCredentialsModeScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f24067b, this.f24068c, this.f24069d, this.f24070e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24066a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            o.b bVarB = o.b((TypedEntityIdentifier[]) this.f24067b.toArray(new TypedEntityIdentifier[0]), this.f24068c, this.f24069d);
            ju.t.e(bVarB, "actionSetupTeamVaultCred…viteColleaguesScreen(...)");
            androidx.navigation.fragment.c.a(this.f24070e).O(bVarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModeScreen f24073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, zt.e eVar) {
            super(2, eVar);
            this.f24072b = i10;
            this.f24073c = setupTeamVaultCredentialsModeScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f24072b, this.f24073c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24071a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            o.c cVarC = o.c(this.f24072b, new SetupTeamVaultShareEntitiesSectionType[0]);
            ju.t.e(cVarC, "actionSetupTeamVaultCred…amVaultSuccessScreen(...)");
            androidx.navigation.fragment.c.a(this.f24073c).O(cVarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModePresenter.a f24075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModeScreen f24076c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(SetupTeamVaultCredentialsModePresenter.a aVar, SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, zt.e eVar) {
            super(2, eVar);
            this.f24075b = aVar;
            this.f24076c = setupTeamVaultCredentialsModeScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f24075b, this.f24076c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int id2;
            au.b.f();
            if (this.f24074a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultCredentialsModePresenter.a aVar = this.f24075b;
            if (aVar instanceof SetupTeamVaultCredentialsModePresenter.a.b) {
                id2 = this.f24076c.Ef().f72978o.getId();
            } else {
                if (!(aVar instanceof SetupTeamVaultCredentialsModePresenter.a.C0573a)) {
                    throw new ut.s();
                }
                id2 = this.f24076c.Ef().f72976m.getId();
            }
            this.f24076c.Ef().f72971h.clearCheck();
            this.f24076c.Ef().f72971h.check(id2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class i implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24077a;

        public i(Fragment fragment) {
            this.f24077a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24077a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24077a + " has null arguments");
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24078a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24080c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new j(this.f24080c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24078a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = SetupTeamVaultCredentialsModeScreen.this.Ef().f72965b.f72392b;
            ju.t.e(toolbarImageButtonWithOvalRipple, "actionBarBackButton");
            toolbarImageButtonWithOvalRipple.setVisibility(this.f24080c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24083c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new k(this.f24083c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24081a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = SetupTeamVaultCredentialsModeScreen.this.Ef().f72973j;
            ju.t.e(materialButton, "doItLaterButton");
            materialButton.setVisibility(this.f24083c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24084a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24086c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultCredentialsModeScreen.this.new l(this.f24086c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24084a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultCredentialsModeScreen.this.Ef().f72975l.setEnabled(this.f24086c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModePresenter.b f24088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SetupTeamVaultCredentialsModeScreen f24089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(SetupTeamVaultCredentialsModePresenter.b bVar, SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, zt.e eVar) {
            super(2, eVar);
            this.f24088b = bVar;
            this.f24089c = setupTeamVaultCredentialsModeScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new m(this.f24088b, this.f24089c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultCredentialsModePresenter.b bVar = this.f24088b;
            if (ju.t.b(bVar, SetupTeamVaultCredentialsModePresenter.b.a.f35901a)) {
                this.f24089c.Ef().f72977n.setText(this.f24089c.getString(R.string.setup_team_vault_step_info, kotlin.coroutines.jvm.internal.b.d(1), kotlin.coroutines.jvm.internal.b.d(2)));
                this.f24089c.Ef().f72975l.setText(this.f24089c.getString(R.string.next_invite_team_members));
            } else if (ju.t.b(bVar, SetupTeamVaultCredentialsModePresenter.b.C0574b.f35902a)) {
                this.f24089c.Ef().f72977n.setText(this.f24089c.getString(R.string.setup_team_vault_step_info, kotlin.coroutines.jvm.internal.b.d(2), kotlin.coroutines.jvm.internal.b.d(3)));
                this.f24089c.Ef().f72975l.setText(this.f24089c.getString(R.string.next_select_data_to_move));
            } else {
                if (!ju.t.b(bVar, SetupTeamVaultCredentialsModePresenter.b.c.f35903a)) {
                    throw new ut.s();
                }
                this.f24089c.Ef().f72965b.f72393c.setText(this.f24089c.getString(R.string.move_to_the_team_vault));
                this.f24089c.Ef().f72977n.setText(this.f24089c.getString(R.string.setup_team_vault_step_info, kotlin.coroutines.jvm.internal.b.d(1), kotlin.coroutines.jvm.internal.b.d(2)));
                this.f24089c.Ef().f72975l.setText(this.f24089c.getString(R.string.next_select_data_to_move));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SetupTeamVaultCredentialsModeScreen() {
        iu.a aVar = new iu.a() { // from class: ch.e1
            @Override // iu.a
            public final Object a() {
                return SetupTeamVaultCredentialsModeScreen.Pf(this.f15484a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24053d = new MoxyKtxDelegate(mvpDelegate, SetupTeamVaultCredentialsModePresenter.class.getName() + ".presenter", aVar);
    }

    private final void Cf() {
        z0.F0(Ef().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final SetupTeamVaultCredentialsModeScreenArgs Df() {
        return (SetupTeamVaultCredentialsModeScreenArgs) this.f24052c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k6 Ef() {
        k6 k6Var = this.f24050a;
        if (k6Var != null) {
            return k6Var;
        }
        throw new IllegalStateException();
    }

    private final SetupTeamVaultCredentialsModePresenter Ff() {
        return (SetupTeamVaultCredentialsModePresenter) this.f24053d.getValue(this, f24048f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Gf() {
        String string = getString(R.string.setup_team_vault_shared_credentials_mode);
        ju.t.e(string, "getString(...)");
        String string2 = getString(R.string.setup_team_vault_shared_credentials_mode_description);
        ju.t.e(string2, "getString(...)");
        MaterialRadioButton materialRadioButton = Ef().f72978o;
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilderAppend = aVar.a(new SpannableStringBuilder(string), string, new AbsoluteSizeSpan(14, true)).append((CharSequence) "\n").append((CharSequence) string2);
        ju.t.e(spannableStringBuilderAppend, "append(...)");
        materialRadioButton.setText(aVar.a(spannableStringBuilderAppend, string2, new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c1.a(requireContext(), android.R.attr.textColorSecondary))));
        String string3 = getString(R.string.setup_team_vault_personal_credentials_mode);
        ju.t.e(string3, "getString(...)");
        String string4 = getString(R.string.setup_team_vault_personal_credentials_mode_description);
        ju.t.e(string4, "getString(...)");
        MaterialRadioButton materialRadioButton2 = Ef().f72976m;
        SpannableStringBuilder spannableStringBuilderAppend2 = aVar.a(new SpannableStringBuilder(string3), string3, new AbsoluteSizeSpan(14, true)).append((CharSequence) "\n").append((CharSequence) string4);
        ju.t.e(spannableStringBuilderAppend2, "append(...)");
        materialRadioButton2.setText(aVar.a(spannableStringBuilderAppend2, string4, new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c1.a(requireContext(), android.R.attr.textColorSecondary))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Ef().f72975l.setOnClickListener(new View.OnClickListener() { // from class: ch.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultCredentialsModeScreen.If(this.f15464a, view);
            }
        });
        Ef().f72973j.setOnClickListener(new View.OnClickListener() { // from class: ch.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultCredentialsModeScreen.Jf(this.f15470a, view);
            }
        });
        Ef().f72978o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ch.c1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SetupTeamVaultCredentialsModeScreen.Kf(this.f15476a, compoundButton, z10);
            }
        });
        Ef().f72976m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ch.d1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SetupTeamVaultCredentialsModeScreen.Lf(this.f15480a, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, View view) {
        setupTeamVaultCredentialsModeScreen.Ff().C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, View view) {
        setupTeamVaultCredentialsModeScreen.Ff().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, CompoundButton compoundButton, boolean z10) {
        if (z10) {
            setupTeamVaultCredentialsModeScreen.Ff().E2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, CompoundButton compoundButton, boolean z10) {
        if (z10) {
            setupTeamVaultCredentialsModeScreen.Ff().D2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Ef().f72965b.f72393c.setText(getString(R.string.team_vault_setup));
        Ef().f72965b.f72392b.setOnClickListener(new View.OnClickListener() { // from class: ch.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultCredentialsModeScreen.Nf(this.f15669a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, View view) {
        setupTeamVaultCredentialsModeScreen.Ff().B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Of(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        setupTeamVaultCredentialsModeScreen.Ff().B2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetupTeamVaultCredentialsModePresenter Pf(SetupTeamVaultCredentialsModeScreen setupTeamVaultCredentialsModeScreen) {
        int invitedColleaguesCount = setupTeamVaultCredentialsModeScreen.Df().getInvitedColleaguesCount();
        TypedEntityIdentifier[] typedEntityToShareIdentifiers = setupTeamVaultCredentialsModeScreen.Df().getTypedEntityToShareIdentifiers();
        ju.t.e(typedEntityToShareIdentifiers, "getTypedEntityToShareIdentifiers(...)");
        List listG1 = vt.n.g1(typedEntityToShareIdentifiers);
        String callerFeature = setupTeamVaultCredentialsModeScreen.Df().getCallerFeature();
        String analyticsFunnelId = setupTeamVaultCredentialsModeScreen.Df().getAnalyticsFunnelId();
        ju.t.e(analyticsFunnelId, "getAnalyticsFunnelId(...)");
        return new SetupTeamVaultCredentialsModePresenter(invitedColleaguesCount, listG1, callerFeature, analyticsFunnelId);
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void Y6(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void ad(SetupTeamVaultCredentialsModePresenter.a aVar) {
        ju.t.f(aVar, "credentialsMode");
        bh.a.b(this, new h(aVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void c7(List list, boolean z10, String str) {
        ju.t.f(list, "entitiesToShare");
        ju.t.f(str, "analyticsFunnelId");
        bh.a.b(this, new f(list, z10, str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void l0(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void o3(boolean z10) {
        bh.a.b(this, new l(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void oc(int i10) {
        bh.a.b(this, new g(i10, this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.f1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SetupTeamVaultCredentialsModeScreen.Of(this.f15497a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24051b = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24050a = k6.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Ef().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24050a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24051b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void q7(SetupTeamVaultCredentialsModePresenter.b bVar) {
        ju.t.f(bVar, "step");
        bh.a.b(this, new m(bVar, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void x(int i10) {
        bh.a.b(this, new b(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a2
    public void xa(int i10, boolean z10, String str) {
        bh.a.b(this, new e(i10, z10, str, this, null));
    }
}
