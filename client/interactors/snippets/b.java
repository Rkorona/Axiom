package com.server.auditor.ssh.client.interactors.snippets;

import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructure;
import com.server.auditor.ssh.client.models.snippet.SnippetScriptStructureType;
import hg.b2;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import lv.f;
import vt.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27625b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27626c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f27627a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final List a(String str) {
            t.f(str, "<this>");
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                bVarS1.a();
                return (List) bVarS1.b(new f(SnippetScriptStructure.Companion.serializer()), str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public b(com.server.auditor.ssh.client.app.a aVar) {
        t.f(aVar, "termiusStorage");
        this.f27627a = aVar;
    }

    public final int a(List list) {
        int i10;
        Integer numValueOf = null;
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    i10 = 0;
                } else {
                    Iterator it = list.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (((SnippetScriptStructure) it.next()).getType() == SnippetScriptStructureType.VARIABLE && (i10 = i10 + 1) < 0) {
                            v.x();
                        }
                    }
                }
                numValueOf = Integer.valueOf(i10);
            } catch (ArithmeticException e10) {
                y9.a.f86838a.i(e10);
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final boolean b(SnippetItem snippetItem) {
        t.f(snippetItem, "snippetItem");
        if (snippetItem.isShared()) {
            return this.f27627a.A0();
        }
        return true;
    }

    public final List c(String str) {
        if (str != null) {
            return f27625b.a(str);
        }
        return null;
    }
}
