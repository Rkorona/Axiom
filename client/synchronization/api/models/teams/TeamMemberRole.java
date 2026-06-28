package com.server.auditor.ssh.client.synchronization.api.models.teams;

import bu.a;
import bu.b;
import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole;
import hv.c;
import hv.o;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import lv.j0;
import tp.c0;
import ut.n;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamMemberRole {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TeamMemberRole[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final Companion Companion;

    @o("Member")
    public static final TeamMemberRole MEMBER = new TeamMemberRole("MEMBER", 0);

    @o("Admin")
    public static final TeamMemberRole OWNER = new TeamMemberRole("OWNER", 1);

    @o("Editor")
    public static final TeamMemberRole EDITOR = new TeamMemberRole("EDITOR", 2);

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) TeamMemberRole.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ TeamMemberRole[] $values() {
        return new TeamMemberRole[]{MEMBER, OWNER, EDITOR};
    }

    static {
        TeamMemberRole[] teamMemberRoleArr$values = $values();
        $VALUES = teamMemberRoleArr$values;
        $ENTRIES = b.a(teamMemberRoleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: fn.e
            @Override // iu.a
            public final Object a() {
                return TeamMemberRole._init_$_anonymous_();
            }
        });
    }

    private TeamMemberRole(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.a("com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole", values(), new String[]{"Member", "Admin", "Editor"}, new Annotation[][]{null, null, null}, null);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TeamMemberRole valueOf(String str) {
        return (TeamMemberRole) Enum.valueOf(TeamMemberRole.class, str);
    }

    public static TeamMemberRole[] values() {
        return (TeamMemberRole[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return c0.j(this);
    }
}
