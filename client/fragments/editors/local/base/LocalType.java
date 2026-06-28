package com.server.auditor.ssh.client.fragments.editors.local.base;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LocalType {
    private static final /* synthetic */ LocalType[] $VALUES = $values();
    public static final LocalType CUSTOM;
    public static final LocalType SH;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.local.base.LocalType$1, reason: invalid class name */
    enum AnonymousClass1 extends LocalType {
        @Override // com.server.auditor.ssh.client.fragments.editors.local.base.LocalType
        public String getPath() {
            return TermiusApplication.F().getString(R.string.path_local_sh_hint);
        }

        private AnonymousClass1(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.editors.local.base.LocalType$2, reason: invalid class name */
    enum AnonymousClass2 extends LocalType {
        @Override // com.server.auditor.ssh.client.fragments.editors.local.base.LocalType
        public String getPath() {
            return TermiusApplication.F().getString(R.string.path_local_hint);
        }

        private AnonymousClass2(String str, int i10) {
            super(str, i10);
        }
    }

    private static /* synthetic */ LocalType[] $values() {
        return new LocalType[]{SH, CUSTOM};
    }

    static {
        SH = new AnonymousClass1("SH", 0);
        CUSTOM = new AnonymousClass2("CUSTOM", 1);
    }

    public static LocalType getLocalType(int i10) {
        return values()[i10];
    }

    public static LocalType valueOf(String str) {
        return (LocalType) Enum.valueOf(LocalType.class, str);
    }

    public static LocalType[] values() {
        return (LocalType[]) $VALUES.clone();
    }

    public abstract String getPath();

    private LocalType(String str, int i10) {
    }
}
