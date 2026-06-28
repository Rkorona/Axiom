package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import com.server.auditor.ssh.client.models.SnippetItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TerminalHistoryScreenViewModel extends FragmentWrapperViewModel<d, c> {
    private static TerminalHistoryScreenViewModel composeViewModel;
    private final List<String> commands = new ArrayList();
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    public interface a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TerminalHistoryScreenViewModel$a$a, reason: collision with other inner class name */
        public static final class C0563a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34871a;

            public C0563a(String str) {
                ju.t.f(str, "title");
                this.f34871a = str;
            }

            public final String a() {
                return this.f34871a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0563a) && ju.t.b(this.f34871a, ((C0563a) obj).f34871a);
            }

            public int hashCode() {
                return this.f34871a.hashCode();
            }

            public String toString() {
                return "ActionMode(title=" + this.f34871a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34872a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2106620724;
            }

            public String toString() {
                return "BaseMode";
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        public final TerminalHistoryScreenViewModel a() {
            return TerminalHistoryScreenViewModel.composeViewModel;
        }

        public final void b(TerminalHistoryScreenViewModel terminalHistoryScreenViewModel) {
            TerminalHistoryScreenViewModel.composeViewModel = terminalHistoryScreenViewModel;
        }

        private b() {
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f34873a;

            public a(int i10) {
                this.f34873a = i10;
            }

            public final int a() {
                return this.f34873a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f34873a == ((a) obj).f34873a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f34873a);
            }

            public String toString() {
                return "OnActionItemClicked(actionId=" + this.f34873a + ")";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34874a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1281855274;
            }

            public String toString() {
                return "OnDismissSelection";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TerminalHistoryScreenViewModel$c$c, reason: collision with other inner class name */
        public static final class C0564c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0564c f34875a = new C0564c();

            private C0564c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0564c);
            }

            public int hashCode() {
                return -1169903022;
            }

            public String toString() {
                return "OnStartSelection";
            }
        }
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SnippetItem f34876a;

            public a(SnippetItem snippetItem) {
                ju.t.f(snippetItem, "snippetItem");
                this.f34876a = snippetItem;
            }

            public final SnippetItem a() {
                return this.f34876a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f34876a, ((a) obj).f34876a);
            }

            public int hashCode() {
                return this.f34876a.hashCode();
            }

            public String toString() {
                return "OnSnippetExecuteAction(snippetItem=" + this.f34876a + ")";
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f34877a;

            public b(a aVar) {
                ju.t.f(aVar, "mode");
                this.f34877a = aVar;
            }

            public final a a() {
                return this.f34877a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f34877a, ((b) obj).f34877a);
            }

            public int hashCode() {
                return this.f34877a.hashCode();
            }

            public String toString() {
                return "OnTopBarModeChange(mode=" + this.f34877a + ")";
            }
        }
    }

    public final List<String> getCommands() {
        return this.commands;
    }

    @Override // androidx.lifecycle.i1
    protected void onCleared() {
        super.onCleared();
        if (ju.t.b(composeViewModel, this)) {
            composeViewModel = null;
        }
    }
}
