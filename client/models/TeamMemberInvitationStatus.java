package com.server.auditor.ssh.client.models;

import java.lang.annotation.Annotation;
import lv.j0;
import tp.c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class TeamMemberInvitationStatus {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ TeamMemberInvitationStatus[] $VALUES;
    private static final ut.n $cachedSerializer$delegate;
    public static final a Companion;

    @hv.o("Pending")
    public static final TeamMemberInvitationStatus PENDING = new TeamMemberInvitationStatus("PENDING", 0);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ hv.c a() {
            return (hv.c) TeamMemberInvitationStatus.$cachedSerializer$delegate.getValue();
        }

        public final hv.c serializer() {
            return a();
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }
    }

    private static final /* synthetic */ TeamMemberInvitationStatus[] $values() {
        return new TeamMemberInvitationStatus[]{PENDING};
    }

    static {
        TeamMemberInvitationStatus[] teamMemberInvitationStatusArr$values = $values();
        $VALUES = teamMemberInvitationStatusArr$values;
        $ENTRIES = bu.b.a(teamMemberInvitationStatusArr$values);
        Companion = new a(null);
        $cachedSerializer$delegate = ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.models.t
            @Override // iu.a
            public final Object a() {
                return TeamMemberInvitationStatus._init_$_anonymous_();
            }
        });
    }

    private TeamMemberInvitationStatus(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_() {
        return j0.a("com.server.auditor.ssh.client.models.TeamMemberInvitationStatus", values(), new String[]{"Pending"}, new Annotation[][]{null}, null);
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static TeamMemberInvitationStatus valueOf(String str) {
        return (TeamMemberInvitationStatus) Enum.valueOf(TeamMemberInvitationStatus.class, str);
    }

    public static TeamMemberInvitationStatus[] values() {
        return (TeamMemberInvitationStatus[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return c0.j(this);
    }
}
