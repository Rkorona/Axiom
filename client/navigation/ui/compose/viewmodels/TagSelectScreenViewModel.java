package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.fragments.editors.base.j0;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.we;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import e3.g3;
import j3.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ut.m0;
import wu.i0;
import zu.g0;
import zu.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class TagSelectScreenViewModel extends AndroidViewModel {
    public static final String KEY_SELECT_TAG_SORT_TYPE = "termius_select_tag_sort_type";
    private final zu.w _allTags;
    private final zu.w _editingTagMode;
    private final zu.w _isSearchMode;
    private final zu.w _isShowCreateTagDialog;
    private final zu.w _searchQueryFieldValue;
    private final zu.w _selectedTagIds;
    private final zu.w _showNotEnoughPermissionsDialog;
    private final zu.w _showSortTypeSelector;
    private final zu.w _sortingMode;
    private final k0 editingTagModel;
    private final k0 emptyScreenStateFlow;
    private final k0 filteredTags;
    private final k0 isSearchMode;
    private final k0 isShowCreateTagDialog;
    private final hg.d keyValueRepository;
    private final cg.a latestTriggerProcessor;
    private final k0 searchQueryFieldValue;
    private final k0 selectedTagIds;
    private final k0 showNotEnoughPermissionsDialog;
    private final k0 showSortTypeSelector;
    private final k0 sortingMode;
    private final ut.n tagDBAdapter$delegate;
    private final j0 tagsDBInteractor;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final dq.h0 vaultsPermissionHelper;
    private final ut.n vaultsRepository$delegate;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34805a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -853643025;
            }

            public String toString() {
                return "Invisible";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TagSelectScreenViewModel$b$b, reason: collision with other inner class name */
        public static final class C0562b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0562b f34806a = new C0562b();

            private C0562b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0562b);
            }

            public int hashCode() {
                return -1557681097;
            }

            public String toString() {
                return "NoResults";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34807a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 890540920;
            }

            public String toString() {
                return "NoTags";
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f34808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TagDBModel f34810c;

        public c(long j10, String str, TagDBModel tagDBModel) {
            ju.t.f(str, "text");
            this.f34808a = j10;
            this.f34809b = str;
            this.f34810c = tagDBModel;
        }

        public final TagDBModel a() {
            return this.f34810c;
        }

        public final String b() {
            return this.f34809b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34808a == cVar.f34808a && ju.t.b(this.f34809b, cVar.f34809b) && ju.t.b(this.f34810c, cVar.f34810c);
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.f34808a) * 31) + this.f34809b.hashCode()) * 31;
            TagDBModel tagDBModel = this.f34810c;
            return iHashCode + (tagDBModel == null ? 0 : tagDBModel.hashCode());
        }

        public String toString() {
            return "TagModel(id=" + this.f34808a + ", text=" + this.f34809b + ", dbModel=" + this.f34810c + ")";
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34811a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34811a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this.dismissEditingTagMode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34813a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f34813a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._editingTagMode;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, null));
            zu.w wVar2 = TagSelectScreenViewModel.this._isShowCreateTagDialog;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34815a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34815a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this._showNotEnoughPermissionsDialog.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34819c;

        g(zt.e eVar) {
            super(3, eVar);
        }

        @Override // iu.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, t0 t0Var, zt.e eVar) {
            g gVar = TagSelectScreenViewModel.this.new g(eVar);
            gVar.f34818b = list;
            gVar.f34819c = t0Var;
            return gVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34817a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            return TagSelectScreenViewModel.this.determineEmptyScreenState((List) this.f34818b, ((t0) this.f34819c).m());
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f34825e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34826a;

            static {
                int[] iArr = new int[TermiusSortType.values().length];
                try {
                    iArr[TermiusSortType.ByNameAscending.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TermiusSortType.ByNameDescending.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TermiusSortType.ByDateDescending.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TermiusSortType.ByDateAscending.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f34826a = iArr;
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String title = ((TagDBModel) obj).getTitle();
                ju.t.e(title, "getTitle(...)");
                Locale locale = Locale.ROOT;
                String lowerCase = title.toLowerCase(locale);
                ju.t.e(lowerCase, "toLowerCase(...)");
                String title2 = ((TagDBModel) obj2).getTitle();
                ju.t.e(title2, "getTitle(...)");
                String lowerCase2 = title2.toLowerCase(locale);
                ju.t.e(lowerCase2, "toLowerCase(...)");
                return yt.a.e(lowerCase, lowerCase2);
            }
        }

        public static final class c implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yt.a.e(Long.valueOf(((TagDBModel) obj).getIdInDatabase()), Long.valueOf(((TagDBModel) obj2).getIdInDatabase()));
            }
        }

        public static final class d implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String title = ((TagDBModel) obj2).getTitle();
                ju.t.e(title, "getTitle(...)");
                Locale locale = Locale.ROOT;
                String lowerCase = title.toLowerCase(locale);
                ju.t.e(lowerCase, "toLowerCase(...)");
                String title2 = ((TagDBModel) obj).getTitle();
                ju.t.e(title2, "getTitle(...)");
                String lowerCase2 = title2.toLowerCase(locale);
                ju.t.e(lowerCase2, "toLowerCase(...)");
                return yt.a.e(lowerCase, lowerCase2);
            }
        }

        public static final class e implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yt.a.e(Long.valueOf(((TagDBModel) obj2).getIdInDatabase()), Long.valueOf(((TagDBModel) obj).getIdInDatabase()));
            }
        }

        h(zt.e eVar) {
            super(5, eVar);
        }

        @Override // iu.s
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object j(List list, List list2, t0 t0Var, TermiusSortType termiusSortType, zt.e eVar) {
            h hVar = new h(eVar);
            hVar.f34822b = list;
            hVar.f34823c = list2;
            hVar.f34824d = t0Var;
            hVar.f34825e = termiusSortType;
            return hVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Comparator bVar;
            au.b.f();
            if (this.f34821a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            List list = (List) this.f34822b;
            List list2 = (List) this.f34823c;
            t0 t0Var = (t0) this.f34824d;
            int i10 = a.f34826a[((TermiusSortType) this.f34825e).ordinal()];
            if (i10 == 1) {
                bVar = new b();
            } else if (i10 == 2) {
                bVar = new d();
            } else if (i10 == 3) {
                bVar = new e();
            } else {
                if (i10 != 4) {
                    throw new ut.s();
                }
                bVar = new c();
            }
            List listR0 = vt.v.R0(list, bVar);
            ArrayList<TagDBModel> arrayList = new ArrayList();
            for (Object obj2 : listR0) {
                String title = ((TagDBModel) obj2).getTitle();
                ju.t.e(title, "getTitle(...)");
                if (su.s.W(title, t0Var.m(), true)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
            for (TagDBModel tagDBModel : arrayList) {
                long idInDatabase = tagDBModel.getIdInDatabase();
                String title2 = tagDBModel.getTitle();
                ju.t.e(title2, "getTitle(...)");
                arrayList2.add(new we(idInDatabase, title2, list2.contains(kotlin.coroutines.jvm.internal.b.e(tagDBModel.getIdInDatabase()))));
            }
            return arrayList2;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34827a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34827a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this.updateList();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((i) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TagSelectScreenViewModel f34831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, TagSelectScreenViewModel tagSelectScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f34830b = str;
            this.f34831c = tagSelectScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f34830b, this.f34831c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34829a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f34830b.length() != 0 && !su.s.m0(this.f34830b)) {
                Iterable iterable = (Iterable) this.f34831c._allTags.getValue();
                String str = this.f34830b;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (su.s.E(((TagDBModel) it.next()).getTitle(), str, true)) {
                        }
                    }
                }
                c cVar = (c) this.f34831c._editingTagMode.getValue();
                TagDBModel tagDBModelA = cVar != null ? cVar.a() : null;
                this.f34831c.dismissEditingTagMode();
                if (tagDBModelA != null) {
                    tagDBModelA.setTitle(this.f34830b);
                    kotlin.coroutines.jvm.internal.b.d(this.f34831c.tagsDBInteractor.f(tagDBModelA));
                } else {
                    this.f34831c.tagsDBInteractor.a(this.f34830b);
                }
                this.f34831c.updateList();
                return m0.f82633a;
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34832a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34832a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            TagSelectScreenViewModel.this._searchQueryFieldValue.setValue(new t0("", 0L, (g3) null, 6, (ju.k) null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34834a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._showSortTypeSelector;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34837b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f34839d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34839d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new m(this.f34839d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TagDBModel tagDBModel;
            Object value;
            Object value2;
            List listG1;
            Object objF = au.b.f();
            int i10 = this.f34837b;
            if (i10 == 0) {
                ut.x.b(obj);
                TagDBModel itemByLocalId = TagSelectScreenViewModel.this.getTagDBAdapter().getItemByLocalId(this.f34839d);
                if (itemByLocalId == null) {
                    return m0.f82633a;
                }
                dq.h0 h0Var = TagSelectScreenViewModel.this.vaultsPermissionHelper;
                VaultKeyId vaultKeyId = itemByLocalId.getVaultKeyId();
                ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
                this.f34836a = itemByLocalId;
                this.f34837b = 1;
                Object objC = h0Var.c(vaultKeyId, this);
                if (objC == objF) {
                    return objF;
                }
                tagDBModel = itemByLocalId;
                obj = objC;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tagDBModel = (TagDBModel) this.f34836a;
                ut.x.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                TagSelectScreenViewModel.this.tagsDBInteractor.b(tagDBModel);
                zu.w wVar = TagSelectScreenViewModel.this._selectedTagIds;
                long j10 = this.f34839d;
                do {
                    value2 = wVar.getValue();
                    listG1 = vt.v.g1((List) value2);
                    listG1.remove(kotlin.coroutines.jvm.internal.b.e(j10));
                } while (!wVar.g(value2, listG1));
                TagSelectScreenViewModel.this.updateList();
            } else {
                zu.w wVar2 = TagSelectScreenViewModel.this._showNotEnoughPermissionsDialog;
                do {
                    value = wVar2.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar2.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34840a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f34842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f34842c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new n(this.f34842c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34840a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this._searchQueryFieldValue.setValue(this.f34842c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34843a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f34845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(TermiusSortType termiusSortType, zt.e eVar) {
            super(2, eVar);
            this.f34845c = termiusSortType;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new o(this.f34845c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34843a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            hg.d dVar = TagSelectScreenViewModel.this.keyValueRepository;
            ju.t.e(dVar, "access$getKeyValueRepository$p(...)");
            TermiusSortType termiusSortType = this.f34845c;
            SharedPreferences.Editor editorEdit = dVar.edit();
            editorEdit.putString(TagSelectScreenViewModel.KEY_SELECT_TAG_SORT_TYPE, termiusSortType.name());
            editorEdit.apply();
            TagSelectScreenViewModel.this._sortingMode.setValue(this.f34845c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34846a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34846a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._showSortTypeSelector;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34848a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34850c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new q(this.f34850c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            List listG1;
            au.b.f();
            if (this.f34848a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._selectedTagIds;
            long j10 = this.f34850c;
            do {
                value = wVar.getValue();
                List list = (List) value;
                if (list.contains(kotlin.coroutines.jvm.internal.b.e(j10))) {
                    listG1 = vt.v.g1(list);
                    listG1.remove(kotlin.coroutines.jvm.internal.b.e(j10));
                } else {
                    listG1 = vt.v.g1(list);
                    listG1.add(kotlin.coroutines.jvm.internal.b.e(j10));
                }
            } while (!wVar.g(value, listG1));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34851a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f34851a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._editingTagMode;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, null));
            zu.w wVar2 = TagSelectScreenViewModel.this._isShowCreateTagDialog;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34853a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34853a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this.showCreateNewTagMode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34855a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f34857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(c cVar, zt.e eVar) {
            super(2, eVar);
            this.f34857c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new t(this.f34857c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f34855a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._editingTagMode;
            c cVar = this.f34857c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, cVar));
            zu.w wVar2 = TagSelectScreenViewModel.this._isShowCreateTagDialog;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34858a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34858a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this._isSearchMode.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            TagSelectScreenViewModel.this._searchQueryFieldValue.setValue(new t0("", 0L, (g3) null, 6, (ju.k) null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34861b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f34863d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(long j10, zt.e eVar) {
            super(2, eVar);
            this.f34863d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new v(this.f34863d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TagDBModel tagDBModel;
            Object value;
            Object objF = au.b.f();
            int i10 = this.f34861b;
            if (i10 == 0) {
                ut.x.b(obj);
                TagDBModel itemByLocalId = TagSelectScreenViewModel.this.getTagDBAdapter().getItemByLocalId(this.f34863d);
                if (itemByLocalId == null) {
                    return m0.f82633a;
                }
                dq.h0 h0Var = TagSelectScreenViewModel.this.vaultsPermissionHelper;
                VaultKeyId vaultKeyId = itemByLocalId.getVaultKeyId();
                ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
                this.f34860a = itemByLocalId;
                this.f34861b = 1;
                Object objC = h0Var.c(vaultKeyId, this);
                if (objC == objF) {
                    return objF;
                }
                tagDBModel = itemByLocalId;
                obj = objC;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tagDBModel = (TagDBModel) this.f34860a;
                ut.x.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                TagSelectScreenViewModel tagSelectScreenViewModel = TagSelectScreenViewModel.this;
                long idInDatabase = tagDBModel.getIdInDatabase();
                String title = tagDBModel.getTitle();
                ju.t.e(title, "getTitle(...)");
                tagSelectScreenViewModel.showEditingTagMode(new c(idInDatabase, title, tagDBModel));
            } else {
                zu.w wVar = TagSelectScreenViewModel.this._showNotEnoughPermissionsDialog;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
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
        int f34864a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34864a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            zu.w wVar = TagSelectScreenViewModel.this._sortingMode;
            hg.d dVar = TagSelectScreenViewModel.this.keyValueRepository;
            TermiusSortType termiusSortType = com.server.auditor.ssh.client.fragments.hostngroups.j.f25092a;
            String string = dVar.getString(TagSelectScreenViewModel.KEY_SELECT_TAG_SORT_TYPE, termiusSortType.name());
            if (string == null) {
                string = termiusSortType.name();
            }
            wVar.setValue(TermiusSortType.valueOf(string));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((w) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34866a;

        x(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return TagSelectScreenViewModel.this.new x(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((x) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f34866a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            List listFetchAllTags = TagSelectScreenViewModel.this.fetchAllTags();
            zu.w wVar = TagSelectScreenViewModel.this._allTags;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, listFetchAllTags));
            return m0.f82633a;
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34868a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(List list, zt.e eVar) {
            super(2, eVar);
            this.f34870c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TagSelectScreenViewModel.this.new y(this.f34870c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f34868a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TagSelectScreenViewModel.this._selectedTagIds.setValue(this.f34870c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagSelectScreenViewModel(Application application) {
        super(application);
        ju.t.f(application, "application");
        zu.w wVarA = zu.m0.a(vt.v.o());
        this._allTags = wVarA;
        this.vaultsRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.g0
            @Override // iu.a
            public final Object a() {
                return TagSelectScreenViewModel.vaultsRepository_delegate$lambda$0();
            }
        });
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        this.keyValueRepository = aVarN.M();
        Boolean bool = Boolean.FALSE;
        zu.w wVarA2 = zu.m0.a(bool);
        this._isSearchMode = wVarA2;
        this.isSearchMode = zu.h.b(wVarA2);
        zu.w wVarA3 = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        this._searchQueryFieldValue = wVarA3;
        this.searchQueryFieldValue = zu.h.b(wVarA3);
        TermiusSortType termiusSortType = TermiusSortType.ByNameAscending;
        zu.w wVarA4 = zu.m0.a(termiusSortType);
        this._sortingMode = wVarA4;
        zu.f fVarL = zu.h.L(wVarA4, new w(null));
        i0 i0VarA = j1.a(this);
        g0.a aVar = zu.g0.f88389a;
        this.sortingMode = zu.h.P(fVarL, i0VarA, g0.a.b(aVar, 5000L, 0L, 2, null), termiusSortType);
        zu.w wVarA5 = zu.m0.a(bool);
        this._showSortTypeSelector = wVarA5;
        this.showSortTypeSelector = zu.h.b(wVarA5);
        zu.w wVarA6 = zu.m0.a(vt.v.o());
        this._selectedTagIds = wVarA6;
        this.selectedTagIds = zu.h.b(wVarA6);
        zu.w wVarA7 = zu.m0.a(bool);
        this._isShowCreateTagDialog = wVarA7;
        this.isShowCreateTagDialog = zu.h.b(wVarA7);
        zu.w wVarA8 = zu.m0.a(null);
        this._editingTagMode = wVarA8;
        this.editingTagModel = zu.h.b(wVarA8);
        zu.w wVarA9 = zu.m0.a(bool);
        this._showNotEnoughPermissionsDialog = wVarA9;
        this.showNotEnoughPermissionsDialog = zu.h.b(wVarA9);
        this.latestTriggerProcessor = new cg.a(j1.a(this));
        this.tagDBAdapter$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.h0
            @Override // iu.a
            public final Object a() {
                return TagSelectScreenViewModel.tagDBAdapter_delegate$lambda$1();
            }
        });
        this.vaultsPermissionHelper = new dq.h0(getVaultsRepository(), null, null, 6, null);
        TagHostDBAdapter tagHostDBAdapterC0 = hg.f.p().c0();
        ju.t.e(tagHostDBAdapterC0, "getTagHostDBAdapter(...)");
        TagDBAdapter tagDBAdapterA0 = hg.f.p().a0();
        ju.t.e(tagDBAdapterA0, "getTagDBAdapter(...)");
        TagHostApiAdapter tagHostApiAdapterB0 = hg.f.p().b0();
        ju.t.e(tagHostApiAdapterB0, "getTagHostApiAdapter(...)");
        TagApiAdapter tagApiAdapterZ = hg.f.p().Z();
        ju.t.e(tagApiAdapterZ, "getTagApiAdapter(...)");
        this.tagsDBInteractor = new j0(tagHostDBAdapterC0, tagDBAdapterA0, tagHostApiAdapterB0, tagApiAdapterZ);
        k0 k0VarP = zu.h.P(zu.h.L(zu.h.j(wVarA, wVarA6, wVarA3, wVarA4, new h(null)), new i(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), vt.v.o());
        this.filteredTags = k0VarP;
        this.emptyScreenStateFlow = zu.h.P(zu.h.h(k0VarP, wVarA3, new g(null)), j1.a(this), g0.a.b(aVar, 5000L, 0L, 2, null), b.a.f34805a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b determineEmptyScreenState(List<we> list, String str) {
        return !list.isEmpty() ? b.a.f34805a : str.length() > 0 ? b.C0562b.f34806a : (list.isEmpty() && str.length() == 0) ? b.c.f34807a : b.a.f34805a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissEditingTagMode() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TagDBModel> fetchAllTags() {
        List<TagDBModel> itemListWhichNotDeleted = getTagDBAdapter().getItemListWhichNotDeleted();
        ju.t.e(itemListWhichNotDeleted, "getItemListWhichNotDeleted(...)");
        return itemListWhichNotDeleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagDBAdapter getTagDBAdapter() {
        return (TagDBAdapter) this.tagDBAdapter$delegate.getValue();
    }

    private final vl.g getVaultsRepository() {
        return (vl.g) this.vaultsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCreateNewTagMode() {
        wu.k.d(j1.a(this), null, null, new r(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEditingTagMode(c cVar) {
        wu.k.d(j1.a(this), null, null, new t(cVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagDBAdapter tagDBAdapter_delegate$lambda$1() {
        return hg.f.p().a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.g vaultsRepository_delegate$lambda$0() {
        return vl.g.f83702b.b();
    }

    public final void dismissCreateTagDialog() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void dismissNotEnoughPermissionsDialog() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final k0 getEditingTagModel() {
        return this.editingTagModel;
    }

    public final k0 getEmptyScreenStateFlow() {
        return this.emptyScreenStateFlow;
    }

    public final k0 getFilteredTags() {
        return this.filteredTags;
    }

    public final k0 getSearchQueryFieldValue() {
        return this.searchQueryFieldValue;
    }

    public final k0 getSelectedTagIds() {
        return this.selectedTagIds;
    }

    public final k0 getShowNotEnoughPermissionsDialog() {
        return this.showNotEnoughPermissionsDialog;
    }

    public final k0 getShowSortTypeSelector() {
        return this.showSortTypeSelector;
    }

    public final k0 getSortingMode() {
        return this.sortingMode;
    }

    public final k0 isSearchMode() {
        return this.isSearchMode;
    }

    public final k0 isShowCreateTagDialog() {
        return this.isShowCreateTagDialog;
    }

    public final void onConfirmCreateTag(String str) {
        ju.t.f(str, "tag");
        wu.k.d(j1.a(this), null, null, new j(str, this, null), 3, null);
    }

    public final void onDismissSearch() {
        wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    public final void onDismissSortTypeSelector() {
        wu.k.d(j1.a(this), null, null, new l(null), 3, null);
    }

    public final void onRemoveTagClick(long j10) {
        wu.k.d(j1.a(this), null, null, new m(j10, null), 3, null);
    }

    public final void onSearchQueryChanged(t0 t0Var) {
        ju.t.f(t0Var, "query");
        wu.k.d(j1.a(this), null, null, new n(t0Var, null), 3, null);
    }

    public final void onSortingChanged(TermiusSortType termiusSortType) {
        ju.t.f(termiusSortType, "sortType");
        wu.k.d(j1.a(this), null, null, new o(termiusSortType, null), 3, null);
    }

    public final void onSortingClicked() {
        wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    public final void onTagClicked(long j10) {
        wu.k.d(j1.a(this), null, null, new q(j10, null), 3, null);
    }

    public final void showCreateTagDialog() {
        wu.k.d(j1.a(this), null, null, new s(null), 3, null);
    }

    public final void showSearch() {
        wu.k.d(j1.a(this), null, null, new u(null), 3, null);
    }

    public final void showTagEdit(long j10) {
        wu.k.d(j1.a(this), null, null, new v(j10, null), 3, null);
    }

    public final void updateList() {
        this.latestTriggerProcessor.b(new x(null));
    }

    public final void updateSelectedTags(List<Long> list) {
        ju.t.f(list, "tagIds");
        wu.k.d(j1.a(this), null, null, new y(list, null), 3, null);
    }
}
