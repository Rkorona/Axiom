package com.server.auditor.ssh.client.navigation.ui.compose;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetDialogState;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface TerminalSnippetDialogState {

    @hv.p
    @Keep
    public static final class Hidden implements TerminalSnippetDialogState {
        public static final Hidden INSTANCE = new Hidden();
        private static final /* synthetic */ ut.n $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.ga
            @Override // iu.a
            public final Object a() {
                return TerminalSnippetDialogState.Hidden._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private Hidden() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _init_$_anonymous_() {
            return new lv.w1("com.server.auditor.ssh.client.navigation.ui.compose.TerminalSnippetDialogState.Hidden", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public int hashCode() {
            return -8936923;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Hidden";
        }
    }

    @hv.p
    @Keep
    public static final class Presented implements TerminalSnippetDialogState {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final Long snippetId;

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f30211a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Presented() {
            this((Long) null, 1, (ju.k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Presented copy$default(Presented presented, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = presented.snippetId;
            }
            return presented.copy(l10);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Presented presented, kv.d dVar, jv.f fVar) {
            if (!dVar.E(fVar, 0) && presented.snippetId == null) {
                return;
            }
            dVar.v(fVar, 0, lv.h1.f64699a, presented.snippetId);
        }

        public final Long component1() {
            return this.snippetId;
        }

        public final Presented copy(Long l10) {
            return new Presented(l10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Presented) && ju.t.b(this.snippetId, ((Presented) obj).snippetId);
        }

        public final Long getSnippetId() {
            return this.snippetId;
        }

        public int hashCode() {
            Long l10 = this.snippetId;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public String toString() {
            return "Presented(snippetId=" + this.snippetId + ")";
        }

        public /* synthetic */ Presented(int i10, Long l10, lv.s2 s2Var) {
            if ((i10 & 1) == 0) {
                this.snippetId = null;
            } else {
                this.snippetId = l10;
            }
        }

        public Presented(Long l10) {
            this.snippetId = l10;
        }

        public /* synthetic */ Presented(Long l10, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? null : l10);
        }
    }
}
