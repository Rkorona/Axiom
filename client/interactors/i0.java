package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetPackageDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.models.PackageItem;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetPackageApiAdapter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnippetPackageDBAdapter f27442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SnippetPackageApiAdapter f27443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SnippetDBAdapter f27444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TagDBAdapter f27445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f27446e;

    public interface a {
        void N(ArrayList arrayList);

        void l2(long j10);
    }

    public i0(SnippetPackageDBAdapter snippetPackageDBAdapter, SnippetPackageApiAdapter snippetPackageApiAdapter, SnippetDBAdapter snippetDBAdapter, TagDBAdapter tagDBAdapter, a aVar) {
        ju.t.f(snippetPackageDBAdapter, "snippetPackageDBAdapter");
        ju.t.f(snippetPackageApiAdapter, "snippetPackageApiAdapter");
        ju.t.f(snippetDBAdapter, "snippetDBAdapter");
        ju.t.f(tagDBAdapter, "tagDBAdapter");
        ju.t.f(aVar, "callback");
        this.f27442a = snippetPackageDBAdapter;
        this.f27443b = snippetPackageApiAdapter;
        this.f27444c = snippetDBAdapter;
        this.f27445d = tagDBAdapter;
        this.f27446e = aVar;
    }

    private final List a(List list) {
        List<SnippetDBModel> itemListWhichNotDeleted = this.f27444c.getItemListWhichNotDeleted();
        ArrayList arrayList = new ArrayList(vt.v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageItem packageItem = (PackageItem) it.next();
            ju.t.c(itemListWhichNotDeleted);
            int i10 = 0;
            if (itemListWhichNotDeleted == null || !itemListWhichNotDeleted.isEmpty()) {
                Iterator<T> it2 = itemListWhichNotDeleted.iterator();
                while (it2.hasNext()) {
                    Long packageId = ((SnippetDBModel) it2.next()).getPackageId();
                    long id2 = packageItem.getId();
                    if (packageId != null && packageId.longValue() == id2 && (i10 = i10 + 1) < 0) {
                        vt.v.x();
                    }
                }
            }
            arrayList.add(PackageItem.copy$default(packageItem, null, 0L, false, null, i10, 15, null));
        }
        return arrayList;
    }

    private final ArrayList c(String str) {
        List<di.f> listG = g();
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        ju.t.e(lowerCase, "toLowerCase(...)");
        for (di.f fVar : listG) {
            if (fVar instanceof di.e) {
                String lowerCase2 = ((di.e) fVar).b().getLabel().toLowerCase(Locale.ROOT);
                ju.t.e(lowerCase2, "toLowerCase(...)");
                if (su.s.Y(lowerCase2, lowerCase, false, 2, null)) {
                    arrayList.add(fVar);
                }
            } else if (fVar instanceof di.k) {
                String lowerCase3 = ((di.k) fVar).b().toLowerCase(Locale.ROOT);
                ju.t.e(lowerCase3, "toLowerCase(...)");
                if (su.s.Y(lowerCase3, lowerCase, false, 2, null)) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    private final ArrayList d(List list, VaultKeyId vaultKeyId) {
        boolean zG = vl.g.f83702b.g(vaultKeyId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            di.f fVar = (di.f) obj;
            boolean z10 = false;
            if (fVar instanceof di.e) {
                di.e eVar = (di.e) fVar;
                if (gj.a.f51371c.d(eVar.b().getVaultKeyId(), zG) || ju.t.b(eVar.b().getVaultKeyId(), vaultKeyId)) {
                    z10 = true;
                }
            }
            if (fVar instanceof di.k ? true : z10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    private final List g() {
        ArrayList arrayList = new ArrayList();
        List<PackageItem> allPackageItems = this.f27442a.getAllPackageItems();
        Iterator<T> it = allPackageItems.iterator();
        while (it.hasNext()) {
            arrayList.add(new di.e((PackageItem) it.next()));
        }
        List listA = a(allPackageItems);
        List<com.server.auditor.ssh.client.models.s> allTagsItems = this.f27445d.getAllTagsItems();
        ju.t.c(allTagsItems);
        for (com.server.auditor.ssh.client.models.s sVar : allTagsItems) {
            if (!h(listA, sVar.a())) {
                arrayList.add(new di.k(sVar.a()));
            }
        }
        return arrayList;
    }

    private final boolean h(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ju.t.b(((PackageItem) it.next()).getLabel(), str)) {
                return true;
            }
        }
        return false;
    }

    private final void i(SnippetPackageDBModel snippetPackageDBModel, Avo.PackageOrigin packageOrigin) {
        VaultKeyId vaultKeyId = snippetPackageDBModel.getVaultKeyId();
        ju.t.e(vaultKeyId, "<get-vaultKeyId>(...)");
        com.server.auditor.ssh.client.utils.analytics.a.y().f5(packageOrigin, com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyId) ? Avo.IsSharedEntity.NO : Avo.IsSharedEntity.YES);
    }

    public final void b(String str, Avo.PackageOrigin packageOrigin, VaultKeyId vaultKeyId) {
        ju.t.f(str, "packageName");
        ju.t.f(packageOrigin, "origin");
        ju.t.f(vaultKeyId, "vaultKeyId");
        SnippetPackageDBModel snippetPackageDBModel = new SnippetPackageDBModel(str, vaultKeyId);
        Long lPostItem = this.f27443b.postItem(snippetPackageDBModel);
        if (lPostItem != null && lPostItem.longValue() == -1) {
            return;
        }
        a aVar = this.f27446e;
        ju.t.c(lPostItem);
        aVar.l2(lPostItem.longValue());
        i(snippetPackageDBModel, packageOrigin);
    }

    public final void e(String str, VaultKeyId vaultKeyId) {
        ju.t.f(str, "searchValue");
        ju.t.f(vaultKeyId, "vaultKeyId");
        ArrayList arrayListD = d(c(str), vaultKeyId);
        if (arrayListD.isEmpty()) {
            if (str.length() == 0) {
                arrayListD.add(new di.o(null, 1, null));
            } else {
                arrayListD.add(new di.a(str));
            }
        }
        this.f27446e.N(arrayListD);
    }

    public final void f(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "vaultKeyId");
        ArrayList arrayListD = d(g(), vaultKeyId);
        if (arrayListD.isEmpty()) {
            arrayListD.add(new di.o(null, 1, null));
        }
        this.f27446e.N(arrayListD);
    }
}
