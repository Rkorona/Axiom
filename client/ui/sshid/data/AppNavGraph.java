package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.ui.sshid.data.AppNavGraph;
import hv.c;
import hv.p;
import iu.a;
import java.lang.annotation.Annotation;
import lv.w1;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface AppNavGraph {

    @p
    @Keep
    public static final class CredentialsSelectorNavGraph implements AppNavGraph {
        public static final CredentialsSelectorNavGraph INSTANCE = new CredentialsSelectorNavGraph();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.a
            @Override // iu.a
            public final Object a() {
                return AppNavGraph.CredentialsSelectorNavGraph._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private CredentialsSelectorNavGraph() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.AppNavGraph.CredentialsSelectorNavGraph", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsSelectorNavGraph);
        }

        public int hashCode() {
            return -1040101034;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CredentialsSelectorNavGraph";
        }
    }

    @p
    @Keep
    public static final class SshIdNavGraph implements AppNavGraph {
        public static final SshIdNavGraph INSTANCE = new SshIdNavGraph();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.b
            @Override // iu.a
            public final Object a() {
                return AppNavGraph.SshIdNavGraph._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private SshIdNavGraph() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.AppNavGraph.SshIdNavGraph", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SshIdNavGraph);
        }

        public int hashCode() {
            return 1613314974;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SshIdNavGraph";
        }
    }
}
