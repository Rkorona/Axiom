package com.server.auditor.ssh.client.fragments.editors.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.fragments.editors.base.BaseEditorFragmentViewModel;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.chainhosts.ChainingHostResult;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import com.server.auditor.ssh.client.presenters.BaseEditorPresenter;
import com.server.auditor.ssh.client.synchronization.api.adapters.MultiKeyApiAdapter;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.editors.EnvironmentVariablesEditorLayout;
import com.server.auditor.ssh.client.widget.editors.ParentGroupEditorLayout;
import io.split.android.client.dtos.SerializableEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.l0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.n0;
import ti.a;
import tp.c1;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends MvpAppCompatFragment implements a.InterfaceC1245a, mq.b, com.server.auditor.ssh.client.contracts.s, mq.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bq.a f24784a = new bq.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final il.y f24785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ut.n f24786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private jh.x f24787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l0 f24788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n0 f24789f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final MoxyKtxDelegate f24790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.server.auditor.ssh.client.widget.o f24791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f24792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final lq.k f24793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ti.a f24794y;
    static final /* synthetic */ qu.k[] A = {ju.n0.g(new ju.g0(c.class, "baseEditorPresenter", "getBaseEditorPresenter()Lcom/server/auditor/ssh/client/presenters/BaseEditorPresenter;", 0))};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f24783z = new a(null);
    public static final int B = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements a.InterfaceC1245a {
        b() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.base.c$c, reason: collision with other inner class name */
    static final class C0398c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24795a;

        C0398c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new C0398c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24795a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            c.this.Nf().updateAddVariableBottomSheetVisibility(false);
            c.this.Nf().updateEnvVariableEditModel(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((C0398c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public c() {
        MultiKeyDBAdapter multiKeyDBAdapterX = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW, "getMultiKeyApiAdapter(...)");
        this.f24785b = new il.y(multiKeyDBAdapterX, multiKeyApiAdapterW);
        this.f24786c = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.a
            @Override // iu.a
            public final Object a() {
                return c.Bg();
            }
        });
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.base.b
            @Override // iu.a
            public final Object a() {
                return c.vf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24790u = new MoxyKtxDelegate(mvpDelegate, BaseEditorPresenter.class.getName() + ".presenter", aVar);
        this.f24792w = new ArrayList();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        ju.t.e(aVarN, "getInstance(...)");
        this.f24793x = new lq.k(aVarN, new dq.h0(vl.g.f83702b.b(), null, null, 6, null));
        il.r rVarJ = hg.f.p().j();
        ju.t.e(rVarJ, "getHostDBRepository(...)");
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        ju.t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        ChainHostsDBAdapter chainHostsDBAdapterC = hg.f.p().c();
        ju.t.e(chainHostsDBAdapterC, "getChainHostsDBAdapter(...)");
        this.f24794y = new ti.a(rVarJ, groupDBAdapterH, chainHostsDBAdapterC, new b());
    }

    private final Long Af() {
        if (Xf()) {
            return Long.valueOf(Df().f24934a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEditorFragmentViewModel Bg() {
        BaseEditorFragmentViewModel baseEditorFragmentViewModelA = BaseEditorFragmentViewModel.Companion.a();
        if (baseEditorFragmentViewModelA != null) {
            return baseEditorFragmentViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final boolean Ef() {
        return Nf().getMIsFirstLaunch();
    }

    private final String Jf() {
        GroupDBModel groupDBModel = Df().f24941h;
        String strC = this.f24784a.c(groupDBModel != null ? Long.valueOf(groupDBModel.getIdInDatabase()) : null);
        return strC == null ? "" : strC;
    }

    private final void Pf() {
        zf().f73261m.setOnParentGroupEditorListener(this);
        List list = this.f24792w;
        ParentGroupEditorLayout parentGroupEditorLayout = zf().f73261m;
        ju.t.e(parentGroupEditorLayout, "parentGroupItemLayout");
        list.add(parentGroupEditorLayout);
        List list2 = this.f24792w;
        EnvironmentVariablesEditorLayout environmentVariablesEditorLayout = zf().f73267s;
        ju.t.e(environmentVariablesEditorLayout, "sshEnvironmentVariables");
        list2.add(environmentVariablesEditorLayout);
        xg();
        zf().f73252d.setBackspaceTypeSetListener(this);
        zf().f73252d.setBackspaceType(Df().f24937d);
        pg(Df().f24941h);
        zg();
    }

    private final void Rf() {
        this.f24787d = Kf();
    }

    private final void Sf() {
        this.f24788e = Mf();
    }

    private final boolean Tf(String str, String str2) {
        return ju.t.b(str, "multikey") && ju.t.b(str2, "no_credentials_sharing");
    }

    private final boolean Uf(String str, String str2) {
        return ju.t.b(str, "no_credentials_sharing") && ju.t.b(str2, "multikey");
    }

    private final boolean Wf() {
        return ju.t.b(Df().f24945l, "no_credentials_sharing") || Df().f24945l == null;
    }

    private final boolean Yf() {
        return Nf().isHideSshLayout();
    }

    private final void mg(boolean z10) {
        Nf().setHideSshLayout(z10);
    }

    private final void og(boolean z10) {
        Nf().setMIsFirstLaunch(z10);
    }

    private final boolean uf(String str, String str2) {
        return ju.t.b(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEditorPresenter vf() {
        return new BaseEditorPresenter();
    }

    private final void wg(MenuItem menuItem) {
        if (Of()) {
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                icon.setAlpha(getResources().getInteger(R.integer.save_item_alpha_50));
                return;
            }
            return;
        }
        Drawable icon2 = menuItem.getIcon();
        if (icon2 != null) {
            icon2.setAlpha(getResources().getInteger(R.integer.save_item_alpha_100));
        }
    }

    private final void xg() {
        GroupDBModel groupDBModel = Df().f24941h;
        String title = groupDBModel != null ? groupDBModel.getTitle() : null;
        if (title == null) {
            title = "";
        }
        zf().f73261m.P(title);
    }

    private final void zg() {
        lq.j jVarB = this.f24793x.b(Lf());
        Iterator it = this.f24792w.iterator();
        while (it.hasNext()) {
            ((mq.a) it.next()).setState(jVarB);
        }
    }

    public final void Ag() {
        jh.x xVar = this.f24787d;
        if (xVar != null) {
            xVar.H4(Lf());
        }
        l0 l0Var = this.f24788e;
        if (l0Var != null) {
            l0Var.H4(Lf());
        }
    }

    protected final int Bf() {
        ChainingHost chainingHost = Df().f24943j;
        int iHashCode = 0;
        if (chainingHost != null) {
            Iterator<Host> it = chainingHost.getHostList().iterator();
            ju.t.e(it, "iterator(...)");
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
        }
        return iHashCode;
    }

    protected final VaultKeyId Cf() {
        return Nf().getInitialVaultKeyId();
    }

    protected final r Df() {
        return Nf().getEditModel();
    }

    protected final jh.x Ff() {
        return this.f24787d;
    }

    protected final l0 Gf() {
        return this.f24788e;
    }

    public final il.y Hf() {
        return this.f24785b;
    }

    protected final GroupDBModel If() {
        return Df().f24941h;
    }

    protected jh.x Kf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
        jh.x xVar = new jh.x(fragmentActivityRequireActivity, this, parentFragmentManager, null, Df().f24941h, zf());
        xVar.D3();
        return xVar;
    }

    protected final VaultKeyId Lf() {
        return Nf().getTargetVaultKeyId();
    }

    protected l0 Mf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        ju.t.e(parentFragmentManager, "getParentFragmentManager(...)");
        l0 l0Var = new l0(fragmentActivityRequireActivity, this, parentFragmentManager, Df().f24941h, zf());
        l0Var.D3();
        return l0Var;
    }

    protected final BaseEditorFragmentViewModel Nf() {
        return (BaseEditorFragmentViewModel) this.f24786c.getValue();
    }

    protected abstract boolean Of();

    protected abstract void Qf();

    @Override // mq.i
    public void Ra() {
        tf(null);
    }

    public final void T5() {
        bh.a.b(this, new C0398c(null));
    }

    protected final boolean Vf() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        return ju.t.b("com.server.auditor.ssh.client.sftp.SftpConnectionPickerActivity", activity.getClass().getName());
    }

    protected abstract boolean Xf();

    @Override // mq.i
    public void Y7() {
        Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.h(Af(), com.server.auditor.ssh.client.ui.vaults.data.a.e(Lf())));
    }

    public final boolean Zf() {
        return Nf().isInCompose();
    }

    public final void a7() {
        byte[] bArrA0 = com.server.auditor.ssh.client.app.a.N().a0();
        if (bArrA0 == null) {
            bArrA0 = new byte[0];
        }
        String str = new String(bArrA0, su.d.f78241b);
        if (TextUtils.isEmpty(str) || hg.f.p().x().getItemsForBaseAdapter(str).isEmpty()) {
            return;
        }
        new ei.v();
    }

    protected final boolean ag(String str, String str2) {
        ju.t.f(str, "oldCredMode");
        ju.t.f(str2, "newCredMode");
        return (Uf(str, str2) || Tf(str, str2) || uf(str, str2)) ? false : true;
    }

    protected final void bg() {
        jh.x xVar = this.f24787d;
        if (xVar != null) {
            xVar.Qc();
        }
        l0 l0Var = this.f24788e;
        if (l0Var != null) {
            l0Var.j9();
        }
    }

    protected abstract void c();

    public final void cg(SelectPurpose selectPurpose, boolean z10) {
        ju.t.f(selectPurpose, "selectPurpose");
        if (Zf()) {
            Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.i((!z10 || com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) ? VaultKeyId.Companion.a() : Lf(), selectPurpose));
        }
    }

    public final void dg(Proxy proxy, VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        if (Zf()) {
            Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.f(proxy, vaultKeyId));
        }
    }

    public final void eg(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        if (Zf()) {
            Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.j(vaultKeyId));
        }
    }

    public final void fg(SshIdSettingsData sshIdSettingsData) {
        ju.t.f(sshIdSettingsData, "sshIdSettings");
        if (Zf()) {
            Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.m(sshIdSettingsData));
        }
    }

    public final void gg(SelectPurpose selectPurpose, boolean z10) {
        ju.t.f(selectPurpose, "selectPurpose");
        if (Zf()) {
            Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.k((!z10 || com.server.auditor.ssh.client.ui.vaults.data.a.b(Lf())) ? VaultKeyId.Companion.a() : Lf(), selectPurpose, Wf()));
        }
    }

    @Override // mq.b
    public void hf(Boolean bool) {
        if (ju.t.b(bool, Df().f24937d)) {
            return;
        }
        Df().f24937d = bool;
        zf().f73252d.setBackspaceType(bool);
    }

    public void hg(Long l10) {
        tf(l10 != null ? hg.f.p().h().getItemByLocalId(l10.longValue()) : null);
    }

    public abstract void ig(boolean z10, qq.a aVar);

    public abstract void jg();

    protected abstract void kg();

    public void lg(String str) {
        Df().f24935b = str;
    }

    protected final void ng(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, SerializableEvent.VALUE_FIELD);
        Nf().setInitialVaultKeyId(vaultKeyId);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            Df().f24941h = hg.f.p().h().getItemByLocalId(arguments.getLong(Column.GROUP_ID));
            String string = arguments.getString("host_connection_type");
            String string2 = arguments.getString("host_password");
            String string3 = arguments.getString("host_address");
            String string4 = arguments.getString("host_username");
            int i10 = arguments.getInt("host_port");
            Df().f24936c = string3;
            if (ju.t.b("ssh", string)) {
                SshProperties sshProperties = new SshProperties();
                sshProperties.setPort(Integer.valueOf(i10));
                sshProperties.setUser(string4);
                sshProperties.setPassword(string2);
                Df().f24938e = sshProperties;
                return;
            }
            if (ju.t.b("telnet", string)) {
                TelnetProperties telnetProperties = new TelnetProperties();
                telnetProperties.setPort(Integer.valueOf(i10));
                telnetProperties.setUser(string4);
                telnetProperties.setPassword(string2);
                Df().f24939f = telnetProperties;
                mg(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ju.t.f(menu, "menu");
        ju.t.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.editor_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save);
        ju.t.e(menuItemFindItem, "findItem(...)");
        wg(menuItemFindItem);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        tp.g.a().k(new ch.q(false));
        this.f24792w.clear();
        this.f24789f = n0.c(layoutInflater, viewGroup, false);
        Rf();
        Sf();
        Pf();
        Ag();
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        this.f24791v = new com.server.auditor.ssh.client.widget.o(new yp.d(contextRequireContext, false).create(), 0L, 0L, 6, null);
        c();
        ch.f fVar = new ch.f();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.o(fragmentActivityRequireActivity);
        fVar.j();
        return zf().b();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        tp.g.a().k(new ch.q(true));
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ju.t.f(menuItem, "item");
        if (menuItem.getItemId() != R.id.save) {
            return super.onOptionsItemSelected(menuItem);
        }
        kg();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jh.x xVar = this.f24787d;
        if (xVar != null && xVar.J3()) {
            wf();
        }
        l0 l0Var = this.f24788e;
        if (l0Var == null || !l0Var.J3()) {
            return;
        }
        xf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        jh.x xVar;
        l0 l0Var;
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        Qf();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isInPanel", false)) {
            zf().b().setBackgroundColor(c1.a(requireContext(), R.attr.termius_background_background));
        } else {
            zf().b().setBackgroundColor(c1.a(requireContext(), R.attr.termius_background_foreground));
        }
        if (Df().f24934a == -1) {
            wf();
        }
        if (Df().f24938e == null) {
            Df().f24938e = new SshProperties();
        } else if (Ef() && (xVar = this.f24787d) != null) {
            xVar.w8();
        }
        if (Df().f24939f == null) {
            Df().f24939f = new TelnetProperties();
        } else if (Ef() && (l0Var = this.f24788e) != null) {
            l0Var.f6();
        }
        if (Df().f24943j == null) {
            Df().f24943j = new ChainingHost();
        }
        jh.x xVar2 = this.f24787d;
        if (xVar2 != null) {
            SshProperties sshProperties = Df().f24938e;
            ju.t.e(sshProperties, "mSshProperties");
            xVar2.kf(sshProperties);
        }
        jh.x xVar3 = this.f24787d;
        if (xVar3 != null) {
            xVar3.B1();
        }
        l0 l0Var2 = this.f24788e;
        if (l0Var2 != null) {
            TelnetProperties telnetProperties = Df().f24939f;
            ju.t.e(telnetProperties, "mTelnetProperties");
            l0Var2.oa(telnetProperties);
        }
        l0 l0Var3 = this.f24788e;
        if (l0Var3 != null) {
            l0Var3.B1();
        }
        tf(Df().f24941h);
        og(false);
    }

    public final void p9() {
        NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        aVar.b(fragmentActivityRequireActivity, NavigationPopUpWhenLargeActivity.NavigationDestination.MultikeyPromotionFlow.INSTANCE);
    }

    protected void pg(GroupDBModel groupDBModel) {
        Df().f24941h = groupDBModel;
    }

    protected final void qg(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, SerializableEvent.VALUE_FIELD);
        Nf().setTargetVaultKeyId(vaultKeyId);
        Ag();
        zg();
    }

    public final void rg(com.server.auditor.ssh.client.models.properties.b bVar) {
        Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.b(bVar));
    }

    public final void sg(VaultKeyId vaultKeyId, Long l10, String str, Long l11, List list, String str2) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        ju.t.f(str, "finalHostForChain");
        ju.t.f(str2, "chainingType");
        Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.e(vaultKeyId, l10, str, l11, list, str2));
    }

    protected final void tf(GroupDBModel groupDBModel) {
        Df().f24941h = groupDBModel;
        jh.x xVar = this.f24787d;
        if (xVar != null) {
            xVar.rf(groupDBModel);
        }
        l0 l0Var = this.f24788e;
        if (l0Var != null) {
            l0Var.Aa(groupDBModel);
        }
        xg();
        GroupDBModel groupDBModel2 = Df().f24941h;
        ChainingHost chainingHostD = this.f24794y.d(groupDBModel2 != null ? groupDBModel2.getIdInDatabase() : -1L);
        String strJf = Jf();
        jh.x xVar2 = this.f24787d;
        if (xVar2 != null) {
            ChainingHost chainingHost = Df().f24943j;
            ju.t.e(chainingHost, "mChainingHost");
            xVar2.jf(chainingHost, chainingHostD, strJf);
        }
    }

    public final void tg(SelectPurpose selectPurpose, String str, String str2) {
        ju.t.f(selectPurpose, "selectPurpose");
        ju.t.f(str, "currentCharset");
        ju.t.f(str2, "defaultCharset");
        Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.C0397c(str, str2, selectPurpose));
    }

    public final void ug(SelectPurpose selectPurpose, String str, String str2) {
        ju.t.f(selectPurpose, "selectPurpose");
        ju.t.f(str, "initialColorScheme");
        ju.t.f(str2, "defaultColorScheme");
        Nf().sendFragmentAction(new BaseEditorFragmentViewModel.c.d(str, str2, selectPurpose));
    }

    protected final void vg(ChainingHostResult chainingHostResult) {
        if (chainingHostResult == null) {
            return;
        }
        il.r rVarJ = hg.f.p().j();
        Long sshConfigId = chainingHostResult.getSshConfigId();
        List<Long> chainingHostIds = chainingHostResult.getChainingHostIds();
        ArrayList arrayList = new ArrayList(vt.v.z(chainingHostIds, 10));
        Iterator<T> it = chainingHostIds.iterator();
        while (it.hasNext()) {
            arrayList.add(rVarJ.s(Long.valueOf(((Number) it.next()).longValue())));
        }
        ChainingHost chainingHost = new ChainingHost(sshConfigId, arrayList);
        if (!chainingHost.getHostList().isEmpty()) {
            jh.x xVar = this.f24787d;
            if (xVar != null) {
                xVar.jf(chainingHost, null, "");
            }
            Df().f24943j = chainingHost;
            return;
        }
        Df().f24943j = chainingHost;
        GroupDBModel groupDBModel = Df().f24941h;
        ChainingHost chainingHostD = this.f24794y.d(groupDBModel != null ? groupDBModel.getIdInDatabase() : -1L);
        if (chainingHostD == null) {
            jh.x xVar2 = this.f24787d;
            if (xVar2 != null) {
                xVar2.jf(chainingHost, null, "");
            }
            Df().f24943j = chainingHost;
            return;
        }
        String strJf = Jf();
        jh.x xVar3 = this.f24787d;
        if (xVar3 != null) {
            xVar3.jf(chainingHost, chainingHostD, strJf);
        }
    }

    protected final void wf() {
        if (Yf()) {
            jh.x xVar = this.f24787d;
            if (xVar != null) {
                xVar.f8();
                return;
            }
            return;
        }
        jh.x xVar2 = this.f24787d;
        if (xVar2 != null) {
            xVar2.w8();
        }
    }

    protected final void xf() {
        l0 l0Var = this.f24788e;
        if (l0Var != null) {
            l0Var.f6();
        }
    }

    public final boolean yf() {
        return Df().f24937d != null && Df().f24937d.booleanValue();
    }

    protected final void yg(boolean z10) {
        if (z10) {
            com.server.auditor.ssh.client.widget.o oVar = this.f24791v;
            if (oVar != null) {
                oVar.g();
                return;
            }
            return;
        }
        com.server.auditor.ssh.client.widget.o oVar2 = this.f24791v;
        if (oVar2 != null) {
            oVar2.e();
        }
    }

    protected final n0 zf() {
        n0 n0Var = this.f24789f;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("Binding is not initialized");
    }
}
