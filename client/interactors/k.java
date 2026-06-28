package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.models.SnippetItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27450c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27451d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final su.p f27452e = new su.p("^\\w+.* copy [0123456789]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SnippetDBAdapter f27453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27454b;

    public interface a {
        void N3(SnippetItem snippetItem);
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public k(SnippetDBAdapter snippetDBAdapter, a aVar) {
        ju.t.f(snippetDBAdapter, "snippetsRepository");
        ju.t.f(aVar, "callback");
        this.f27453a = snippetDBAdapter;
        this.f27454b = aVar;
    }

    private final int a(String str) {
        try {
            return Integer.parseInt(su.s.n1(str).toString());
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    private final String b(String str) {
        int iQ0 = su.s.q0(str, " copy", 0, false, 6, null);
        if (iQ0 == -1) {
            return "";
        }
        String strSubstring = str.substring(iQ0 + 5, str.length());
        ju.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final List c() {
        List<SnippetItem> allSnippetItems = this.f27453a.getAllSnippetItems();
        Collections.sort(allSnippetItems, new ci.f());
        ju.t.c(allSnippetItems);
        return allSnippetItems;
    }

    private final String d(String str) {
        int iQ0 = su.s.q0(str, " copy", 0, false, 6, null);
        boolean zD = su.s.D(str, " copy", false, 2, null);
        boolean zF = f27452e.f(str);
        if (iQ0 == -1) {
            return str + " copy";
        }
        if (zF || zD) {
            String strSubstring = str.substring(0, iQ0 + 5);
            ju.t.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        return str + " copy";
    }

    private final String f(String str) {
        return su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(str, "\t", "%20", false, 4, null), "\n", "%20", false, 4, null), "\r", "%20", false, 4, null), "!", "%21", false, 4, null), "\"", "%22", false, 4, null), "#", "%23", false, 4, null), "$", "%24", false, 4, null), "&", "%26", false, 4, null), "'", "%27", false, 4, null), "(", "%28", false, 4, null), ")", "%29", false, 4, null), "*", "%2a", false, 4, null), "+", "%2b", false, 4, null), ",", "%2c", false, 4, null), "-", "%2d", false, 4, null), ".", "%2e", false, 4, null), "/", "%2f", false, 4, null), ":", "%3a", false, 4, null), ";", "%3b", false, 4, null), "<", "%3c", false, 4, null), "=", "%3d", false, 4, null), ">", "%3e", false, 4, null), "?", "%3f", false, 4, null), "@", "%40", false, 4, null), "[", "%5b", false, 4, null), "\\", "%5c", false, 4, null), "]", "%5d", false, 4, null), "^", "%5e", false, 4, null), "_", "%5f", false, 4, null), "`", "%60", false, 4, null), "{", "%7b", false, 4, null), "|", "%7c", false, 4, null), "}", "%7d", false, 4, null), "~", "%7e", false, 4, null);
    }

    private final String g(String str) {
        return su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(su.s.M(str, "%20", "\t", false, 4, null), "%20", "\n", false, 4, null), "%20", "\r", false, 4, null), "%21", "!", false, 4, null), "%22", "\"", false, 4, null), "%23", "#", false, 4, null), "%24", "$", false, 4, null), "%26", "&", false, 4, null), "%27", "'", false, 4, null), "%28", "(", false, 4, null), "%29", ")", false, 4, null), "%2a", "*", false, 4, null), "%2b", "+", false, 4, null), "%2c", ",", false, 4, null), "%2d", "-", false, 4, null), "%2e", ".", false, 4, null), "%2f", "/", false, 4, null), "%3a", ":", false, 4, null), "%3b", ";", false, 4, null), "%3c", "<", false, 4, null), "%3d", "=", false, 4, null), "%3e", ">", false, 4, null), "%3f", "?", false, 4, null), "%40", "@", false, 4, null), "%5b", "[", false, 4, null), "%5c", "\\", false, 4, null), "%5d", "]", false, 4, null), "%5e", "^", false, 4, null), "%5f", "_", false, 4, null), "%60", "`", false, 4, null), "%7b", "{", false, 4, null), "%7c", "|", false, 4, null), "%7d", "}", false, 4, null), "%7e", "~", false, 4, null);
    }

    public final void e(SnippetItem snippetItem) {
        ju.t.f(snippetItem, "snippetItem");
        String title = snippetItem.getTitle();
        ju.t.e(title, "getTitle(...)");
        String strD = d(f(title));
        List<SnippetItem> listC = c();
        for (SnippetItem snippetItem2 : listC) {
            String title2 = snippetItem2.getTitle();
            ju.t.e(title2, "getTitle(...)");
            snippetItem2.setTitle(f(title2));
        }
        su.p pVar = new su.p(strD + " [0123456789]|" + strD);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            String title3 = ((SnippetItem) obj).getTitle();
            ju.t.e(title3, "getTitle(...)");
            if (pVar.f(title3)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            snippetItem.setTitle(g(strD));
        } else {
            String title4 = ((SnippetItem) vt.v.p0(arrayList)).getTitle();
            ju.t.c(title4);
            int iA = a(b(title4)) + 1;
            snippetItem.setTitle(g(strD) + " " + iA);
        }
        this.f27454b.N3(snippetItem);
    }
}
