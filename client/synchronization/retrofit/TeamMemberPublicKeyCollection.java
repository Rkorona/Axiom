package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamMemberPublicKeyCollection {
    private final List<TeamMemberPublicKey> objects;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.retrofit.b
        @Override // iu.a
        public final Object a() {
            return TeamMemberPublicKeyCollection._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamMemberPublicKeyCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamMemberPublicKeyCollection(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TeamMemberPublicKeyCollection$$serializer.INSTANCE.getDescriptor());
        }
        this.objects = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(TeamMemberPublicKey$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamMemberPublicKeyCollection copy$default(TeamMemberPublicKeyCollection teamMemberPublicKeyCollection, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamMemberPublicKeyCollection.objects;
        }
        return teamMemberPublicKeyCollection.copy(list);
    }

    @hv.o("objects")
    public static /* synthetic */ void getObjects$annotations() {
    }

    public final List<TeamMemberPublicKey> component1() {
        return this.objects;
    }

    public final TeamMemberPublicKeyCollection copy(List<TeamMemberPublicKey> list) {
        t.f(list, "objects");
        return new TeamMemberPublicKeyCollection(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeamMemberPublicKeyCollection) && t.b(this.objects, ((TeamMemberPublicKeyCollection) obj).objects);
    }

    public final List<TeamMemberPublicKey> getObjects() {
        return this.objects;
    }

    public int hashCode() {
        return this.objects.hashCode();
    }

    public String toString() {
        return "TeamMemberPublicKeyCollection(objects=" + this.objects + ")";
    }

    public TeamMemberPublicKeyCollection(List<TeamMemberPublicKey> list) {
        t.f(list, "objects");
        this.objects = list;
    }
}
