package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.widget.TokenCompleteTextView;
import com.server.auditor.ssh.client.widget.editors.TagsEditorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import mq.f;
import mq.j;
import qg.r7;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class TagsEditorLayout extends LinearLayout implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46741c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46742d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f46743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r7 f46744b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagsEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TagsEditorLayout tagsEditorLayout, View view) {
        tagsEditorLayout.getBinding().f73747f.clearFocus();
        tagsEditorLayout.j();
        j jVar = tagsEditorLayout.f46743a;
        if (jVar != null) {
            jVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(List list, TagsEditorLayout tagsEditorLayout) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                tagsEditorLayout.getBinding().f73747f.p((TagDBModel) it.next());
            } catch (Exception unused) {
            }
        }
    }

    private final r7 getBinding() {
        r7 r7Var = this.f46744b;
        if (r7Var != null) {
            return r7Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TagsEditorLayout tagsEditorLayout) {
        tagsEditorLayout.getBinding().f73747f.invalidate();
    }

    private final void j() {
        getBinding().f73747f.performCompletion();
        List<Object> objects = getBinding().f73747f.getObjects();
        t.e(objects, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objects) {
            if (obj instanceof TagDBModel) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            TagDBModel tagDBModel = (TagDBModel) obj2;
            if (!t.b(tagDBModel.getTitle(), "default_empty_tag") && tagDBModel.getIdInDatabase() <= 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((TagDBModel) it.next()).setSelected(true);
        }
        j jVar = this.f46743a;
        if (jVar != null) {
            jVar.c(arrayList2);
        }
        List<TagDBModel> tagsList = getTagsList();
        j jVar2 = this.f46743a;
        if (jVar2 != null) {
            jVar2.b(tagsList);
        }
    }

    @Override // mq.f
    public void a() {
        j jVar = this.f46743a;
        if (jVar != null) {
            jVar.b(getTagsList());
        }
    }

    public final void f(final List list) {
        t.f(list, "chosenTags");
        List<Object> objects = getBinding().f73747f.getObjects();
        t.e(objects, "getObjects(...)");
        Iterator it = v.d1(objects).iterator();
        while (it.hasNext()) {
            getBinding().f73747f.E(it.next());
        }
        getBinding().f73747f.post(new Runnable() { // from class: lq.c1
            @Override // java.lang.Runnable
            public final void run() {
                TagsEditorLayout.g(list, this);
            }
        });
    }

    public final List<TagDBModel> getTagsList() {
        getBinding().f73747f.performCompletion();
        List<Object> objects = getBinding().f73747f.getObjects();
        t.e(objects, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objects) {
            if (obj instanceof TagDBModel) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void h() {
        getBinding().f73747f.post(new Runnable() { // from class: lq.d1
            @Override // java.lang.Runnable
            public final void run() {
                TagsEditorLayout.i(this.f64545a);
            }
        });
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f73744c.setEnabled(z10);
        getBinding().f73747f.setEnabled(z10);
        getBinding().f73745d.setEnabled(z10);
    }

    public final void setTagsActionsListener(j jVar) {
        t.f(jVar, "tagsActionsListener");
        this.f46743a = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagsEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ TagsEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46744b = r7.b(LayoutInflater.from(context), this, true);
        getBinding().f73747f.setAdapter(new ArrayAdapter(context, R.layout.tag_chip_item_layout, new ArrayList()));
        getBinding().f73744c.setOnClickListener(new View.OnClickListener() { // from class: lq.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TagsEditorLayout.e(this.f64540a, view);
            }
        });
        getBinding().f73747f.r(false);
        getBinding().f73747f.setTokenClickStyle(TokenCompleteTextView.TokenClickStyle.Delete);
        getBinding().f73747f.setCompletionPerformListener(this);
    }
}
