package com.server.auditor.ssh.client.presenters.snippets;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructure;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructureType;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import com.server.auditor.ssh.client.presenters.snippets.SnippetVariableSetupPresenter;
import com.server.auditor.ssh.client.widget.textview.TextRoundedBgAnnotation;
import hg.b2;
import iu.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ju.k;
import ju.r0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetVariableSetupPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.snippets.b> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f37790x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f37791y = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnippetItem f37792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SnippetSourceOrigin f37795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.snippets.b f37797f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SpannableStringBuilder f37798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Set f37799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final mv.b f37800w;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37806a;

        static {
            int[] iArr = new int[SnippetScriptStructureType.values().length];
            try {
                iArr[SnippetScriptStructureType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetScriptStructureType.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37806a = iArr;
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37807a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetVariableSetupPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37807a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Set<b> set = SnippetVariableSetupPresenter.this.f37799v;
            SnippetVariableSetupPresenter snippetVariableSetupPresenter = SnippetVariableSetupPresenter.this;
            for (b bVar : set) {
                bVar.f(false);
                snippetVariableSetupPresenter.O2(bVar);
            }
            SnippetVariableSetupPresenter.this.getViewState().z5();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f37809a;

        e(iu.a aVar) {
            this.f37809a = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            t.f(view, "widget");
            this.f37809a.a();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            t.f(textPaint, "ds");
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37810a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetVariableSetupPresenter.this.new f(eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            au.b.f();
            if (this.f37810a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            List listD1 = v.d1(SnippetVariableSetupPresenter.this.f37799v);
            Iterator it = listD1.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (((b) it.next()).e()) {
                    break;
                }
                i10++;
            }
            int i11 = i10 + 1;
            List listJ0 = v.J0(v.V0(v.d1(listD1), listD1.size() - Math.abs(i11)), v.U0(listD1, i11));
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listJ0) {
                if (s.m0(((b) obj3).d())) {
                    arrayList.add(obj3);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ?? E = ((b) next).e();
                    do {
                        Object next2 = it2.next();
                        ?? E2 = ((b) next2).e();
                        E = E;
                        if (E > E2) {
                            next = next2;
                            E = E2 == true ? 1 : 0;
                        }
                    } while (it2.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            b bVar = (b) obj2;
            if (bVar != null) {
                bVar.a().a();
            } else {
                SnippetVariableSetupPresenter.this.getViewState().r3(false);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37812a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetVariableSetupPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37812a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Editable editableL2 = SnippetVariableSetupPresenter.this.L2(true);
            SnippetItem snippetItem = new SnippetItem(SnippetVariableSetupPresenter.this.f37792a);
            SnippetVariableSetupPresenter snippetVariableSetupPresenter = SnippetVariableSetupPresenter.this;
            snippetItem.setScript(editableL2.toString());
            snippetItem.setScriptStructure(snippetVariableSetupPresenter.B2(snippetVariableSetupPresenter.D2(editableL2)));
            SnippetVariableSetupPresenter.this.getViewState().Ob(snippetItem, SnippetVariableSetupPresenter.this.f37793b, SnippetVariableSetupPresenter.this.f37794c, SnippetVariableSetupPresenter.this.f37795d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37814a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SnippetVariableSetupPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37814a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SnippetVariableSetupPresenter.this.getViewState().E6(SnippetVariableSetupPresenter.M2(SnippetVariableSetupPresenter.this, false, 1, null));
            boolean zG2 = SnippetVariableSetupPresenter.this.G2();
            SnippetVariableSetupPresenter.this.getViewState().h7(zG2);
            SnippetVariableSetupPresenter.this.getViewState().O6(zG2);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SnippetVariableSetupPresenter(SnippetItem snippetItem, int i10, boolean z10, SnippetSourceOrigin snippetSourceOrigin) {
        t.f(snippetItem, Table.SNIPPET);
        t.f(snippetSourceOrigin, "snippetSource");
        this.f37792a = snippetItem;
        this.f37793b = i10;
        this.f37794c = z10;
        this.f37795d = snippetSourceOrigin;
        this.f37796e = com.server.auditor.ssh.client.utils.analytics.a.y();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        this.f37797f = new com.server.auditor.ssh.client.interactors.snippets.b(aVarN);
        this.f37798u = new SpannableStringBuilder();
        this.f37799v = new LinkedHashSet();
        this.f37800w = b2.f52944a.s1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B2(List list) {
        mv.b bVar = this.f37800w;
        bVar.a();
        return bVar.c(new lv.f(SnippetScriptStructure.Companion.serializer()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List D2(Editable editable) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < editable.length()) {
            int iNextSpanTransition = editable.nextSpanTransition(i10, editable.length(), TextRoundedBgAnnotation.class);
            TextRoundedBgAnnotation[] textRoundedBgAnnotationArr = (TextRoundedBgAnnotation[]) editable.getSpans(i10, iNextSpanTransition, TextRoundedBgAnnotation.class);
            t.c(textRoundedBgAnnotationArr);
            if (textRoundedBgAnnotationArr.length == 0) {
                arrayList.add(new SnippetScriptStructure(SnippetScriptStructureType.TEXT, editable.subSequence(i10, iNextSpanTransition).toString()));
            } else {
                Iterator itA = ju.c.a(textRoundedBgAnnotationArr);
                while (itA.hasNext()) {
                    arrayList.add(new SnippetScriptStructure(SnippetScriptStructureType.VARIABLE, editable.subSequence(i10, iNextSpanTransition).toString()));
                }
            }
            i10 = iNextSpanTransition;
        }
        return arrayList;
    }

    private final void E2(List list) {
        Object next;
        List listB;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SnippetScriptStructure snippetScriptStructure = (SnippetScriptStructure) it.next();
            int i10 = c.f37806a[snippetScriptStructure.getType().ordinal()];
            if (i10 == 1) {
                this.f37798u.append((CharSequence) snippetScriptStructure.getContent());
            } else {
                if (i10 != 2) {
                    throw new ut.s();
                }
                final String content = snippetScriptStructure.getContent();
                this.f37798u.append((CharSequence) content);
                Iterator it2 = this.f37799v.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (t.b(((b) next).c(), content)) {
                            break;
                        }
                    }
                }
                final b bVar = (b) next;
                iu.a aVar = new iu.a() { // from class: dl.a
                    @Override // iu.a
                    public final Object a() {
                        return SnippetVariableSetupPresenter.F2(bVar, this, content);
                    }
                };
                TextRoundedBgAnnotation textRoundedBgAnnotation = new TextRoundedBgAnnotation(null, null, null, null, null, 31, null);
                if (bVar == null || (listB = bVar.b()) == null) {
                    this.f37799v.add(new b(content, null, false, aVar, v.u(textRoundedBgAnnotation), 6, null));
                } else {
                    listB.add(textRoundedBgAnnotation);
                }
                e eVar = new e(aVar);
                int length = this.f37798u.length() - content.length();
                int length2 = this.f37798u.length();
                this.f37798u.setSpan(textRoundedBgAnnotation, length, length2, 33);
                this.f37798u.setSpan(eVar, length, length2, 33);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 F2(b bVar, SnippetVariableSetupPresenter snippetVariableSetupPresenter, String str) {
        if (bVar == null || bVar.a() == null) {
            snippetVariableSetupPresenter.I2(str);
            m0 m0Var = m0.f82633a;
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G2() {
        Set set = this.f37799v;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (s.m0(((b) it.next()).d())) {
                return false;
            }
        }
        return true;
    }

    private final void I2(String str) {
        for (b bVar : this.f37799v) {
            bVar.f(t.b(bVar.c(), str));
            if (bVar.e()) {
                getViewState().r3(true);
                getViewState().we(bVar);
            }
            O2(bVar);
        }
        getViewState().z5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Editable L2(boolean z10) {
        Object next;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37798u);
        Iterator itA = ju.c.a((TextRoundedBgAnnotation[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), TextRoundedBgAnnotation.class));
        while (itA.hasNext()) {
            TextRoundedBgAnnotation textRoundedBgAnnotation = (TextRoundedBgAnnotation) itA.next();
            int spanStart = spannableStringBuilder.getSpanStart(textRoundedBgAnnotation);
            int spanEnd = spannableStringBuilder.getSpanEnd(textRoundedBgAnnotation);
            String string = spannableStringBuilder.subSequence(spanStart, spanEnd).toString();
            Iterator it = this.f37799v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (t.b(((b) next).c(), string)) {
                    break;
                }
            }
            b bVar = (b) next;
            if (bVar != null) {
                String strD = bVar.d();
                if (s.m0(strD)) {
                    strD = bVar.c();
                }
                if (!z10) {
                    r0 r0Var = r0.f62955a;
                    strD = String.format(" %s ", Arrays.copyOf(new Object[]{strD}, 1));
                    t.e(strD, "format(...)");
                }
                spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) strD);
            }
        }
        return spannableStringBuilder;
    }

    static /* synthetic */ Editable M2(SnippetVariableSetupPresenter snippetVariableSetupPresenter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return snippetVariableSetupPresenter.L2(z10);
    }

    private final void N2(List list) {
        this.f37796e.i5(String.valueOf(this.f37792a.getRemoteId()), this.f37797f.a(list), this.f37795d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(b bVar) {
        Iterator it = bVar.b().iterator();
        while (it.hasNext()) {
            getViewState().zb((TextRoundedBgAnnotation) it.next(), bVar.e(), !s.m0(bVar.d()));
        }
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void H2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void J2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void K2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        List listC = this.f37797f.c(this.f37792a.getScriptStructure());
        if (listC == null) {
            getViewState().c4();
            return;
        }
        getViewState().a();
        E2(listC);
        getViewState().E6(M2(this, false, 1, null));
        getViewState().ma(this.f37799v.size() > 1);
        ((b) v.o0(this.f37799v)).a().a();
        N2(listC);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private iu.a f37804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f37805e;

        public b(String str, String str2, boolean z10, iu.a aVar, List list) {
            t.f(str, "variableName");
            t.f(str2, "variableValue");
            t.f(aVar, "onClick");
            t.f(list, "spans");
            this.f37801a = str;
            this.f37802b = str2;
            this.f37803c = z10;
            this.f37804d = aVar;
            this.f37805e = list;
        }

        public final iu.a a() {
            return this.f37804d;
        }

        public final List b() {
            return this.f37805e;
        }

        public final String c() {
            return this.f37801a;
        }

        public final String d() {
            return this.f37802b;
        }

        public final boolean e() {
            return this.f37803c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.b(this.f37801a, bVar.f37801a) && t.b(this.f37802b, bVar.f37802b) && this.f37803c == bVar.f37803c && t.b(this.f37804d, bVar.f37804d) && t.b(this.f37805e, bVar.f37805e);
        }

        public final void f(boolean z10) {
            this.f37803c = z10;
        }

        public final void g(String str) {
            t.f(str, "<set-?>");
            this.f37802b = str;
        }

        public int hashCode() {
            return (((((((this.f37801a.hashCode() * 31) + this.f37802b.hashCode()) * 31) + Boolean.hashCode(this.f37803c)) * 31) + this.f37804d.hashCode()) * 31) + this.f37805e.hashCode();
        }

        public String toString() {
            return "SnippetVariableInfo(variableName=" + this.f37801a + ", variableValue=" + this.f37802b + ", isSelected=" + this.f37803c + ", onClick=" + this.f37804d + ", spans=" + this.f37805e + ")";
        }

        public /* synthetic */ b(String str, String str2, boolean z10, iu.a aVar, List list, int i10, k kVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, aVar, list);
        }
    }
}
