package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.group;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class GroupContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String label;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return GroupContent.serializer;
        }

        public final c serializer() {
            return GroupContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupContent() {
        this((String) null, 0, 3, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ GroupContent copy$default(GroupContent groupContent, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupContent.label;
        }
        if ((i11 & 2) != 0) {
            i10 = groupContent.version;
        }
        return groupContent.copy(str, i10);
    }

    @o("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(GroupContent groupContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || !t.b(groupContent.label, "")) {
            dVar.f(fVar, 0, groupContent.label);
        }
        if (!dVar.E(fVar, 1) && groupContent.version == 1) {
            return;
        }
        dVar.t(fVar, 1, groupContent.version);
    }

    public final String component1() {
        return this.label;
    }

    public final int component2() {
        return this.version;
    }

    public final GroupContent copy(String str, int i10) {
        t.f(str, "label");
        return new GroupContent(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupContent)) {
            return false;
        }
        GroupContent groupContent = (GroupContent) obj;
        return t.b(this.label, groupContent.label) && this.version == groupContent.version;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "GroupContent(label=" + this.label + ", version=" + this.version + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupContent(String str) {
        this(str, 0, 2, (k) null);
        t.f(str, "label");
    }

    public /* synthetic */ GroupContent(int i10, String str, int i11, s2 s2Var) {
        this.label = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public GroupContent(String str, int i10) {
        t.f(str, "label");
        this.label = str;
        this.version = i10;
    }

    public /* synthetic */ GroupContent(String str, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 1 : i10);
    }
}
