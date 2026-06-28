package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.vaults.data.VaultMemberRole;
import hv.c;
import hv.o;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import lv.j0;
import ut.n;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultMemberRole {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ VaultMemberRole[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final a Companion;

    @o("Owner")
    public static final VaultMemberRole OWNER = new VaultMemberRole("OWNER", 0);

    @o("Editor")
    public static final VaultMemberRole EDITOR = new VaultMemberRole("EDITOR", 1);

    @o("Member")
    public static final VaultMemberRole MEMBER = new VaultMemberRole("MEMBER", 2);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) VaultMemberRole.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ VaultMemberRole[] $values() {
        return new VaultMemberRole[]{OWNER, EDITOR, MEMBER};
    }

    static {
        VaultMemberRole[] vaultMemberRoleArr$values = $values();
        $VALUES = vaultMemberRoleArr$values;
        $ENTRIES = bu.b.a(vaultMemberRoleArr$values);
        Companion = new a(null);
        $cachedSerializer$delegate = ut.o.b(r.f82638b, new iu.a() { // from class: op.j
            @Override // iu.a
            public final Object a() {
                return VaultMemberRole._init_$_anonymous_();
            }
        });
    }

    private VaultMemberRole(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.a("com.server.auditor.ssh.client.ui.vaults.data.VaultMemberRole", values(), new String[]{"Owner", "Editor", "Member"}, new Annotation[][]{null, null, null}, null);
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static VaultMemberRole valueOf(String str) {
        return (VaultMemberRole) Enum.valueOf(VaultMemberRole.class, str);
    }

    public static VaultMemberRole[] values() {
        return (VaultMemberRole[]) $VALUES.clone();
    }
}
