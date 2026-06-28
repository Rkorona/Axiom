package com.server.auditor.ssh.client.fragments.editors.base;

import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostApiAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TagHostDBAdapter f24885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TagDBAdapter f24886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TagHostApiAdapter f24887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TagApiAdapter f24888d;

    public j0(TagHostDBAdapter tagHostDBAdapter, TagDBAdapter tagDBAdapter, TagHostApiAdapter tagHostApiAdapter, TagApiAdapter tagApiAdapter) {
        ju.t.f(tagHostDBAdapter, "tagHostDBAdapter");
        ju.t.f(tagDBAdapter, "tagDBAdapter");
        ju.t.f(tagHostApiAdapter, "tagHostApiAdapter");
        ju.t.f(tagApiAdapter, "tagApiAdapter");
        this.f24885a = tagHostDBAdapter;
        this.f24886b = tagDBAdapter;
        this.f24887c = tagHostApiAdapter;
        this.f24888d = tagApiAdapter;
    }

    private final void c(TagDBModel tagDBModel) {
        for (TagHostDBModel tagHostDBModel : this.f24885a.getItemListWhichNotDeleted()) {
            if (tagHostDBModel.getTagId() == tagDBModel.getIdInDatabase()) {
                this.f24887c.deleteItem(tagHostDBModel);
            }
        }
    }

    private final TagDBModel e(TagDBModel tagDBModel) {
        Object obj;
        List<TagDBModel> itemListDeleteFailed = this.f24886b.getItemListDeleteFailed();
        ju.t.e(itemListDeleteFailed, "getItemListDeleteFailed(...)");
        Iterator<T> it = itemListDeleteFailed.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (ju.t.b(((TagDBModel) next).getTitle(), tagDBModel != null ? tagDBModel.getTitle() : null)) {
                obj = next;
                break;
            }
        }
        TagDBModel tagDBModel2 = (TagDBModel) obj;
        if (tagDBModel2 == null) {
            return tagDBModel;
        }
        tagDBModel2.setStatus(1);
        return tagDBModel2;
    }

    public final TagDBModel a(String str) {
        ju.t.f(str, "text");
        TagDBModel tagDBModel = new TagDBModel(str);
        try {
            tagDBModel.setIdInDatabase(this.f24886b.add(tagDBModel));
            return tagDBModel;
        } catch (Exception unused) {
            TagDBModel tagDBModelE = e(tagDBModel);
            return tagDBModelE == null ? tagDBModel : tagDBModelE;
        }
    }

    public final void b(TagDBModel tagDBModel) {
        ju.t.f(tagDBModel, "tagToDelete");
        c(tagDBModel);
        this.f24888d.deleteItem(tagDBModel);
    }

    public final List d(long j10) {
        List<TagHostDBModel> tagHostsByHostIdWhichNotDeleted = this.f24885a.getTagHostsByHostIdWhichNotDeleted(j10);
        ju.t.c(tagHostsByHostIdWhichNotDeleted);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tagHostsByHostIdWhichNotDeleted.iterator();
        while (it.hasNext()) {
            TagDBModel itemByLocalId = this.f24886b.getItemByLocalId(((TagHostDBModel) it.next()).getTagId());
            if (itemByLocalId != null) {
                arrayList.add(itemByLocalId);
            }
        }
        List listG1 = vt.v.g1(arrayList);
        vt.v.C(listG1);
        return listG1;
    }

    public final int f(TagDBModel tagDBModel) {
        ju.t.f(tagDBModel, "tagToUpdate");
        return this.f24888d.putItem(tagDBModel);
    }
}
