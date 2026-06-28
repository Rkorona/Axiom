package com.server.auditor.ssh.client.fragments.editors.local.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.fragments.editors.base.j0;
import com.server.auditor.ssh.client.fragments.editors.base.r;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.ConnectionProperties;
import com.server.auditor.ssh.client.models.properties.LocalProperties;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel;
import com.server.auditor.ssh.client.onboarding.OnboardingActivity;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.widget.editors.CharsetEditorLayout;
import com.server.auditor.ssh.client.widget.editors.ColorSchemeEditorLayout;
import com.server.auditor.ssh.client.widget.editors.SnippetEditorLayout;
import com.server.auditor.ssh.client.widget.editors.TagsEditorLayout;
import iu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import k9.d;
import kotlin.coroutines.jvm.internal.m;
import lq.j;
import moxy.MvpAppCompatFragment;
import mq.i;
import mq.j;
import qg.y2;
import tp.b1;
import tp.c1;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vt.v;
import wu.i0;
import zp.s;
import zu.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends MvpAppCompatFragment implements mq.c, mq.e, i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f24959u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f24960v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y2 f24961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f24962b = o.a(new iu.a() { // from class: com.server.auditor.ssh.client.fragments.editors.local.base.a
        @Override // iu.a
        public final Object a() {
            return c.ug();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nq.a f24963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.f f24964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0 f24965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f24966f;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24967a;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            try {
                iArr[ConnectionType.both_ssh_telnet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionType.ssh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionType.telnet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24967a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.local.base.c$c, reason: collision with other inner class name */
    public static final class C0407c implements SnippetEditorLayout.c {
        C0407c() {
        }

        @Override // com.server.auditor.ssh.client.widget.editors.SnippetEditorLayout.c
        public void a() {
            OnboardingActivity.a aVar = OnboardingActivity.C;
            FragmentActivity fragmentActivityRequireActivity = c.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.a(fragmentActivityRequireActivity, 100);
        }

        @Override // com.server.auditor.ssh.client.widget.editors.SnippetEditorLayout.c
        public void b(SnippetEditorLayout.d dVar) {
            t.f(dVar, "snippetEditorProperties");
            LocalProperties localPropertiesOf = c.this.Of();
            if (localPropertiesOf != null) {
                localPropertiesOf.setStartupSnippet(dVar.d());
            }
        }

        @Override // com.server.auditor.ssh.client.widget.editors.SnippetEditorLayout.c
        public void c() {
            c.this.ig();
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            c cVar = c.this;
            LocalType localType = LocalType.getLocalType(i10);
            t.e(localType, "getLocalType(...)");
            cVar.pg(localType);
            c.this.Gf().f74437l.setPlaceholderText(c.this.Rf().getPath());
            if (c.this.Rf() != LocalType.CUSTOM) {
                c.this.Gf().f74436k.setText("");
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements j {
        e() {
        }

        @Override // mq.j
        public void a() {
            LocalHostEditorScreenViewModel localHostEditorScreenViewModelVf = c.this.Vf();
            List list = c.this.Qf().f24942i;
            t.e(list, "mChosenTags");
            ArrayList arrayList = new ArrayList(v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((TagDBModel) it.next()).getIdInDatabase()));
            }
            localHostEditorScreenViewModelVf.sendFragmentAction(new LocalHostEditorScreenViewModel.c.f(arrayList, VaultKeyId.Companion.a()));
        }

        @Override // mq.j
        public void b(List list) {
            t.f(list, Table.TAG);
            c.this.Qf().f24942i.clear();
            c.this.Qf().f24942i.addAll(list);
        }

        @Override // mq.j
        public void c(List list) {
            t.f(list, Table.TAG);
            c.this.f24966f.c(list);
        }
    }

    public static final class f extends b1 {
        f() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            t.f(charSequence, "s");
            if (i12 > 0) {
                c.this.pg(LocalType.CUSTOM);
                c.this.Gf().f74434i.setSelection(c.this.Rf().ordinal());
            }
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24972a;

        static final class a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f24975b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.local.base.c$g$a$a, reason: collision with other inner class name */
            static final class C0408a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f24976a;

                C0408a(c cVar) {
                    this.f24976a = cVar;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(LocalHostEditorScreenViewModel.b bVar, zt.e eVar) {
                    if (t.b(bVar, LocalHostEditorScreenViewModel.b.c.f34294a)) {
                        this.f24976a.jg();
                    } else if (bVar instanceof LocalHostEditorScreenViewModel.b.d) {
                        this.f24976a.hg(((LocalHostEditorScreenViewModel.b.d) bVar).a());
                    } else if (bVar instanceof LocalHostEditorScreenViewModel.b.f) {
                        this.f24976a.Qf().f24942i.clear();
                        LocalHostEditorScreenViewModel.b.f fVar = (LocalHostEditorScreenViewModel.b.f) bVar;
                        this.f24976a.Qf().f24942i.addAll(fVar.a());
                        this.f24976a.Gf().f74440o.f(fVar.a());
                        this.f24976a.Gf().f74440o.h();
                    } else if (bVar instanceof LocalHostEditorScreenViewModel.b.e) {
                        LocalProperties localPropertiesOf = this.f24976a.Of();
                        if (localPropertiesOf != null) {
                            localPropertiesOf.setStartupSnippet(new SnippetItem(hg.f.p().J().getItemByLocalId(((LocalHostEditorScreenViewModel.b.e) bVar).a())));
                        }
                        c cVar = this.f24976a;
                        cVar.tg(cVar.Of(), null, null);
                    } else if (bVar instanceof LocalHostEditorScreenViewModel.b.C0541b) {
                        LocalProperties localPropertiesOf2 = this.f24976a.Of();
                        if (localPropertiesOf2 != null) {
                            localPropertiesOf2.setColorScheme(((LocalHostEditorScreenViewModel.b.C0541b) bVar).a());
                        }
                        this.f24976a.Gf().f74433h.setColorSchemeName(this.f24976a.Tf(), this.f24976a.Mf());
                    } else {
                        if (!(bVar instanceof LocalHostEditorScreenViewModel.b.a)) {
                            throw new ut.s();
                        }
                        LocalProperties localPropertiesOf3 = this.f24976a.Of();
                        if (localPropertiesOf3 != null) {
                            localPropertiesOf3.setCharset(((LocalHostEditorScreenViewModel.b.a) bVar).a());
                        }
                        this.f24976a.Gf().f74432g.setCharsetForUI(this.f24976a.Sf(), this.f24976a.Lf());
                    }
                    return m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, zt.e eVar) {
                super(2, eVar);
                this.f24975b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f24975b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f24974a;
                if (i10 == 0) {
                    x.b(obj);
                    a0 composeActions = this.f24975b.Vf().getComposeActions();
                    C0408a c0408a = new C0408a(this.f24975b);
                    this.f24974a = 1;
                    if (composeActions.collect(c0408a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(obj);
                }
                throw new ut.j();
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return c.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24972a;
            if (i10 == 0) {
                x.b(obj);
                c cVar = c.this;
                q.b bVar = q.b.f8799d;
                a aVar = new a(cVar, null);
                this.f24972a = 1;
                if (r0.b(cVar, bVar, aVar, this) == objF) {
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
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public c() {
        SshConfigDBAdapter sshConfigDBAdapterS = hg.f.p().S();
        t.e(sshConfigDBAdapterS, "getSshConfigDBAdapter(...)");
        TelnetConfigDBAdapter telnetConfigDBAdapterE0 = hg.f.p().e0();
        t.e(telnetConfigDBAdapterE0, "getTelnetConfigDBAdapter(...)");
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        t.e(groupDBAdapterH, "getGroupDBAdapter(...)");
        this.f24964d = new com.server.auditor.ssh.client.interactors.f(sshConfigDBAdapterS, telnetConfigDBAdapterE0, groupDBAdapterH);
        TagHostDBAdapter tagHostDBAdapterC0 = hg.f.p().c0();
        t.e(tagHostDBAdapterC0, "getTagHostDBAdapter(...)");
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB0 = hg.f.p().b0();
        t.e(tagHostApiAdapterB0, "getTagHostApiAdapter(...)");
        TagApiAdapter tagApiAdapterZ = hg.f.p().Z();
        t.e(tagApiAdapterZ, "getTagApiAdapter(...)");
        this.f24965e = new j0(tagHostDBAdapterC0, tagDBAdapterA0, tagHostApiAdapterB0, tagApiAdapterZ);
        TagDBAdapter tagDBAdapterA02 = hg.f.p().a0();
        t.e(tagDBAdapterA02, "getTagDBAdapter(...)");
        TagApiAdapter tagApiAdapterZ2 = hg.f.p().Z();
        t.e(tagApiAdapterZ2, "getTagApiAdapter(...)");
        TagHostDBAdapter tagHostDBAdapterC02 = hg.f.p().c0();
        t.e(tagHostDBAdapterC02, "getTagHostDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB02 = hg.f.p().b0();
        t.e(tagHostApiAdapterB02, "getTagHostApiAdapter(...)");
        this.f24966f = new s(tagDBAdapterA02, tagApiAdapterZ2, tagHostDBAdapterC02, tagHostApiAdapterB02);
    }

    private final void Df() {
        if (Qf().f24940g == null) {
            mg(new LocalProperties());
        }
        kg(Qf().f24935b);
        LocalProperties localPropertiesOf = Of();
        Gf().f74439n.Z(new SnippetEditorLayout.d(localPropertiesOf != null ? localPropertiesOf.getStartupSnippet() : null, null));
        lg(Qf().f24940g.getColorScheme());
        Integer fontSize = Qf().f24940g.getFontSize();
        if (fontSize != null && fontSize.intValue() == 0) {
            fontSize = null;
        }
        Qf().f24940g.setFontSize(fontSize);
        Gf().f74433h.setColorSchemeName(Tf(), Mf());
        Gf().f74432g.setCharsetActionsListener(this);
        Gf().f74432g.setCharsetForUI(Sf(), Lf());
        TagsEditorLayout tagsEditorLayout = Gf().f74440o;
        List list = Qf().f24942i;
        t.e(list, "mChosenTags");
        tagsEditorLayout.f(list);
        String str = Qf().f24946m;
        if (str != null) {
            String str2 = su.s.m0(str) ? null : str;
            if (str2 != null) {
                og(str2);
            }
        }
    }

    private final String Hf() {
        GroupDBModel groupDBModelUf = Uf();
        if (groupDBModelUf != null) {
            return this.f24964d.b(Long.valueOf(groupDBModelUf.getIdInDatabase()));
        }
        return null;
    }

    private final String If() {
        GroupDBModel groupDBModelUf = Uf();
        if (groupDBModelUf != null) {
            return this.f24964d.c(Long.valueOf(groupDBModelUf.getIdInDatabase()));
        }
        return null;
    }

    private final String Jf() {
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        d.a aVar = k9.d.f63270c;
        String string = dVarM.getString("color_scheme_settings", aVar.a().getName());
        return string == null ? aVar.a().getName() : string;
    }

    private final GroupDBModel Kf(Connection connection) {
        HostDBModel itemByLocalId = hg.f.p().i().getItemByLocalId(connection.getId());
        if (itemByLocalId == null || itemByLocalId.getGroupId() == null) {
            return null;
        }
        GroupDBAdapter groupDBAdapterH = hg.f.p().h();
        Long groupId = itemByLocalId.getGroupId();
        t.e(groupId, "getGroupId(...)");
        return groupDBAdapterH.getItemByLocalId(groupId.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Lf() {
        String title;
        GroupDBModel groupDBModelUf = Uf();
        if (groupDBModelUf == null || (title = groupDBModelUf.getTitle()) == null || !cg()) {
            return null;
        }
        return title;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Mf() {
        String title;
        GroupDBModel groupDBModelUf = Uf();
        if (groupDBModelUf == null || (title = groupDBModelUf.getTitle()) == null || !dg()) {
            return null;
        }
        return title;
    }

    private final SnippetEditorLayout.b Nf(ConnectionProperties connectionProperties, String str) {
        SnippetItem startupSnippet = connectionProperties != null ? connectionProperties.getStartupSnippet() : null;
        if (startupSnippet != null) {
            return new SnippetEditorLayout.b(startupSnippet, str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalProperties Of() {
        return Qf().f24940g;
    }

    private final String Pf() {
        String string = Gf().f74436k.getEditableText().toString();
        if (!TextUtils.isEmpty(string) || Gf().f74434i.getSelectedItemId() != 0) {
            return string;
        }
        String string2 = getString(R.string.path_local_sh_hint);
        t.e(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalType Rf() {
        return Vf().getLocalType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Sf() {
        String charset;
        LocalProperties localPropertiesOf = Of();
        if (localPropertiesOf != null && (charset = localPropertiesOf.getCharset()) != null) {
            return charset;
        }
        String strHf = Hf();
        return strHf == null ? SQLiteHelper.DEFAULT_CHARSET : strHf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Tf() {
        String colorScheme;
        LocalProperties localPropertiesOf = Of();
        if (localPropertiesOf != null && (colorScheme = localPropertiesOf.getColorScheme()) != null) {
            return colorScheme;
        }
        String strIf = If();
        return strIf == null ? Jf() : strIf;
    }

    private final void Wf() {
        Gf().f74435j.setState(j.c.f64557a);
        Gf().f74435j.setOnParentGroupEditorListener(this);
        rg();
    }

    private final SnippetEditorLayout.c Xf() {
        return new C0407c();
    }

    private final void Yf() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.headerspiner, requireContext().getResources().getStringArray(R.array.LocalTerminal));
        arrayAdapter.setDropDownViewResource(R.layout.simple_list_item);
        Gf().f74434i.setAdapter((SpinnerAdapter) arrayAdapter);
        Gf().f74434i.setSelection(0);
        Gf().f74434i.setOnItemSelectedListener(new d());
    }

    private final void Zf() {
        Gf().f74440o.setTagsActionsListener(new e());
    }

    private final void ag() {
        Gf().f74436k.addTextChangedListener(new f());
    }

    private final void bg() {
        TextInputLayout textInputLayout = Gf().f74437l;
        t.e(textInputLayout, "pathLocalLayout");
        TextInputEditText textInputEditText = Gf().f74436k;
        t.e(textInputEditText, "pathLocalEditText");
        this.f24963c = new nq.a(textInputLayout, textInputEditText);
    }

    private final boolean cg() {
        LocalProperties localPropertiesOf = Of();
        return (localPropertiesOf != null ? localPropertiesOf.getCharset() : null) == null && Hf() != null;
    }

    private final boolean dg() {
        LocalProperties localPropertiesOf = Of();
        return (localPropertiesOf != null ? localPropertiesOf.getColorScheme() : null) == null && If() != null;
    }

    private final boolean fg() {
        nq.a aVar = this.f24963c;
        return aVar != null && aVar.a(R.string.required_field, new nq.c() { // from class: com.server.auditor.ssh.client.fragments.editors.local.base.b
            @Override // nq.c
            public final boolean a(Object obj) {
                return c.tf(this.f24958a, (String) obj);
            }
        });
    }

    private final void lg(String str) {
        Qf().f24940g.setColorScheme(str);
    }

    private final void og(String str) {
        int i10;
        Qf().f24946m = str;
        if (t.b(getString(R.string.path_local_sh_hint), str)) {
            i10 = 0;
        } else {
            Gf().f74436k.setText(str);
            i10 = 1;
        }
        Gf().f74434i.setSelection(i10);
        LocalType localType = LocalType.getLocalType(i10);
        t.e(localType, "getLocalType(...)");
        pg(localType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pg(LocalType localType) {
        Vf().setLocalType(localType);
    }

    private final void qg(GroupDBModel groupDBModel) {
        String charset;
        String strJf;
        Qf().f24941h = groupDBModel;
        rg();
        ConnectionProperties connectionPropertiesA = null;
        if (groupDBModel != null) {
            ConnectionType connectionTypeA = aq.a.a(Long.valueOf(groupDBModel.getIdInDatabase()));
            int i10 = connectionTypeA == null ? -1 : b.f24967a[connectionTypeA.ordinal()];
            if (i10 == 1 || i10 == 2) {
                connectionPropertiesA = aq.b.a(Long.valueOf(groupDBModel.getIdInDatabase()));
            } else if (i10 == 3) {
                connectionPropertiesA = aq.c.a(Long.valueOf(groupDBModel.getIdInDatabase()));
            }
            if (connectionPropertiesA != null) {
                tg(connectionPropertiesA, connectionPropertiesA, groupDBModel.getTitle());
                return;
            }
            return;
        }
        CharsetEditorLayout charsetEditorLayout = Gf().f74432g;
        LocalProperties localPropertiesOf = Of();
        if (localPropertiesOf == null || (charset = localPropertiesOf.getCharset()) == null) {
            charset = SQLiteHelper.DEFAULT_CHARSET;
        }
        charsetEditorLayout.setCharsetForUI(charset, null);
        ColorSchemeEditorLayout colorSchemeEditorLayout = Gf().f74433h;
        LocalProperties localPropertiesOf2 = Of();
        if (localPropertiesOf2 == null || (strJf = localPropertiesOf2.getColorScheme()) == null) {
            strJf = Jf();
        }
        colorSchemeEditorLayout.setColorSchemeName(strJf, null);
    }

    private final void rg() {
        GroupDBModel groupDBModel = Qf().f24941h;
        String title = groupDBModel != null ? groupDBModel.getTitle() : null;
        if (title == null) {
            title = "";
        }
        Gf().f74435j.P(title);
    }

    private final void sg() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        if (aVarN.r0() && aVarN.u0()) {
            Gf().f74439n.setState(j.c.f64557a);
        } else {
            Gf().f74439n.setState(j.a.f64555a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tf(c cVar, String str) {
        return (cVar.Rf() == LocalType.CUSTOM && TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tg(ConnectionProperties connectionProperties, ConnectionProperties connectionProperties2, String str) {
        Gf().f74439n.Z(new SnippetEditorLayout.d(connectionProperties != null ? connectionProperties.getStartupSnippet() : null, Nf(connectionProperties2, str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalHostEditorScreenViewModel ug() {
        LocalHostEditorScreenViewModel localHostEditorScreenViewModelA = LocalHostEditorScreenViewModel.Companion.a();
        if (localHostEditorScreenViewModelA != null) {
            return localHostEditorScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    @Override // mq.e
    public void Ab() {
        String strJf = Jf();
        LocalProperties localPropertiesOf = Of();
        String colorScheme = localPropertiesOf != null ? localPropertiesOf.getColorScheme() : null;
        if (colorScheme == null) {
            colorScheme = strJf;
        }
        Vf().sendFragmentAction(new LocalHostEditorScreenViewModel.c.C0542c(colorScheme, strJf));
    }

    protected final void Ef() {
        if (Qf().f24940g == null) {
            mg(new LocalProperties());
        }
        Qf().f24940g.setLocalPath(Pf());
    }

    public final String Ff() {
        return String.valueOf(Gf().f74427b.getText());
    }

    protected final y2 Gf() {
        y2 y2Var = this.f24961a;
        if (y2Var != null) {
            return y2Var;
        }
        throw new IllegalStateException("Binding is not initialized");
    }

    protected final r Qf() {
        return Vf().getHostEditModel();
    }

    @Override // mq.i
    public void Ra() {
        gg(null);
    }

    public final GroupDBModel Uf() {
        return Qf().f24941h;
    }

    protected final LocalHostEditorScreenViewModel Vf() {
        return (LocalHostEditorScreenViewModel) this.f24962b.getValue();
    }

    @Override // mq.i
    public void Y7() {
        if (eg()) {
            Vf().sendFragmentAction(new LocalHostEditorScreenViewModel.c.d(null, VaultKeyIdSpecification.Companion.b()));
        }
    }

    protected final void c() {
        Gf().f74433h.setColorSchemeActionsListener(this);
        Wf();
        Zf();
        Gf().f74439n.setOnSnippetEditorCallback(Xf());
        Gf().f74428c.setHint(R.string.local_alias_hint);
        Yf();
        ag();
        bg();
    }

    public final boolean eg() {
        return Vf().isInCompose();
    }

    public void gg(GroupDBModel groupDBModel) {
        qg(groupDBModel);
    }

    public final void hg(Long l10) {
        GroupDBModel itemByLocalId;
        if (l10 != null) {
            itemByLocalId = hg.f.p().h().getItemByLocalId(l10.longValue());
        } else {
            itemByLocalId = null;
        }
        gg(itemByLocalId);
    }

    public final void ig() {
        Vf().sendFragmentAction(new LocalHostEditorScreenViewModel.c.e(VaultKeyId.Companion.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jg() {
        /*
            r12 = this;
            boolean r0 = r12.fg()
            if (r0 != 0) goto L8
            goto Lbd
        L8:
            hg.f r0 = hg.f.p()
            hg.f r1 = hg.f.p()
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r1 = r1.Y()
            zp.e r2 = r0.k(r1)
            r12.Ef()
            r0 = 2132018217(0x7f140429, float:1.9674734E38)
            java.lang.String r4 = r12.getString(r0)
            java.lang.String r1 = r12.Ff()
            r11 = 0
            if (r1 == 0) goto L36
            boolean r3 = su.s.m0(r1)
            if (r3 != 0) goto L30
            goto L31
        L30:
            r1 = r11
        L31:
            if (r1 != 0) goto L34
            goto L36
        L34:
            r5 = r1
            goto L40
        L36:
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "getString(...)"
            ju.t.e(r1, r0)
            goto L34
        L40:
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r12.Qf()
            com.server.auditor.ssh.client.models.properties.LocalProperties r8 = r0.f24940g
            com.server.auditor.ssh.client.database.models.GroupDBModel r9 = r12.Uf()
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r12.Qf()
            java.lang.Boolean r10 = r0.f24937d
            com.server.auditor.ssh.client.models.Host r3 = new com.server.auditor.ssh.client.models.Host
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.server.auditor.ssh.client.hostinfo.HostIconUtil$OsModelType r0 = com.server.auditor.ssh.client.hostinfo.HostIconUtil.OsModelType.android
            r3.setOsModelType(r0)
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r12.Qf()
            long r0 = r0.f24934a
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L94
            com.server.auditor.ssh.client.fragments.editors.base.r r0 = r12.Qf()
            long r0 = r0.f24934a
            r3.setId(r0)
            qg.y2 r0 = r12.Gf()     // Catch: ah.b -> L8d
            com.server.auditor.ssh.client.widget.editors.TagsEditorLayout r0 = r0.f74440o     // Catch: ah.b -> L8d
            java.util.List r0 = r0.getTagsList()     // Catch: ah.b -> L8d
            boolean r0 = r2.l(r3, r11, r0)     // Catch: ah.b -> L8d
            if (r0 == 0) goto La6
            hg.f r0 = hg.f.p()     // Catch: ah.b -> L8d
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r0 = r0.Y()     // Catch: ah.b -> L8d
            r0.startFullSync()     // Catch: ah.b -> L8d
            goto La6
        L8d:
            r0 = move-exception
            y9.a r1 = y9.a.f86838a
            r1.i(r0)
            goto La6
        L94:
            qg.y2 r0 = r12.Gf()
            com.server.auditor.ssh.client.widget.editors.TagsEditorLayout r0 = r0.f74440o
            java.util.List r5 = r0.getTagsList()
            com.server.auditor.ssh.client.utils.analytics.Avo$HostCreationOrigin r6 = com.server.auditor.ssh.client.utils.analytics.Avo.HostCreationOrigin.HOSTS_SCREEN
            com.server.auditor.ssh.client.utils.analytics.Avo$HostCreationMethod r7 = com.server.auditor.ssh.client.utils.analytics.Avo.HostCreationMethod.ADD_EMPTY_HOST
            r4 = 0
            r2.a(r3, r4, r5, r6, r7)
        La6:
            boolean r0 = r12.eg()
            if (r0 == 0) goto Lb6
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel r0 = r12.Vf()
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel$c$a r1 = com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel.c.a.f34298a
            r0.sendFragmentAction(r1)
            goto Lbd
        Lb6:
            androidx.fragment.app.FragmentManager r0 = r12.getParentFragmentManager()
            r0.g1()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.local.base.c.jg():void");
    }

    public final void kg(String str) {
        Qf().f24935b = str;
        Gf().f74427b.setText(str);
    }

    public final void mg(LocalProperties localProperties) {
        Qf().f24940g = localProperties;
    }

    public final void ng(Connection connection) {
        t.f(connection, "localConnection");
        if (connection instanceof Host) {
            Qf().f24934a = ((Host) connection).getId();
        }
        mg(connection.getLocalProperties());
        Qf().f24935b = connection.getAlias();
        Qf().f24942i = this.f24965e.d(connection.getId());
        r rVarQf = Qf();
        LocalProperties localProperties = connection.getLocalProperties();
        rVarQf.f24946m = localProperties != null ? localProperties.getLocalPath() : null;
        Qf().f24941h = Kf(connection);
        Qf().f24937d = connection.getBackspaceType();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new g(null), 3, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j10 = arguments.getLong(Column.GROUP_ID);
            Qf().f24941h = hg.f.p().h().getItemByLocalId(j10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Drawable icon;
        t.f(menu, "menu");
        t.f(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.editor_menu, menu);
        MenuItem item = menu.getItem(0);
        if (item == null || (icon = item.getIcon()) == null) {
            return;
        }
        icon.setAlpha(getResources().getInteger(R.integer.save_item_alpha_100));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24961a = y2.c(layoutInflater, viewGroup, false);
        c();
        ch.f fVar = new ch.f();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.o(fragmentActivityRequireActivity);
        fVar.j();
        return Gf().b();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        t.f(menuItem, "item");
        if (menuItem.getItemId() != R.id.save) {
            return super.onOptionsItemSelected(menuItem);
        }
        jg();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        sg();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("isInPanel", false)) {
            Gf().b().setBackgroundColor(c1.a(requireContext(), R.attr.termius_background_background));
        } else {
            Gf().b().setBackgroundColor(c1.a(requireContext(), R.attr.termius_background_foreground));
        }
        Df();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // mq.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pc() {
        /*
            r4 = this;
            com.server.auditor.ssh.client.database.models.GroupDBModel r0 = r4.Uf()
            if (r0 == 0) goto L1c
            long r0 = r0.getIdInDatabase()
            com.server.auditor.ssh.client.models.properties.LocalProperties r2 = r4.Of()
            if (r2 == 0) goto L19
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r2.getMergedCharset(r0)
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L1e
        L1c:
            java.lang.String r0 = "UTF-8"
        L1e:
            java.lang.String r1 = r4.Sf()
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel r2 = r4.Vf()
            com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel$c$b r3 = new com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.LocalHostEditorScreenViewModel$c$b
            r3.<init>(r1, r0)
            r2.sendFragmentAction(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.fragments.editors.local.base.c.pc():void");
    }
}
