package com.server.auditor.ssh.client.utils.binaries;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Architecture {
    private static final /* synthetic */ Architecture[] $VALUES = $values();
    public static final Architecture ARM;
    public static final Architecture x86;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.utils.binaries.Architecture$1, reason: invalid class name */
    enum AnonymousClass1 extends Architecture {
        @Override // com.server.auditor.ssh.client.utils.binaries.Architecture
        public String getDir() {
            return String.format("/arm/%s/", "pie");
        }

        private AnonymousClass1(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.utils.binaries.Architecture$2, reason: invalid class name */
    enum AnonymousClass2 extends Architecture {
        @Override // com.server.auditor.ssh.client.utils.binaries.Architecture
        public String getDir() {
            return String.format("/x86/%s/", "pie");
        }

        private AnonymousClass2(String str, int i10) {
            super(str, i10);
        }
    }

    private static /* synthetic */ Architecture[] $values() {
        return new Architecture[]{ARM, x86};
    }

    static {
        ARM = new AnonymousClass1("ARM", 0);
        x86 = new AnonymousClass2("x86", 1);
    }

    public static Architecture getArchitecture() {
        return Build.SUPPORTED_ABIS[0].contains("x86") ? x86 : ARM;
    }

    public static Architecture valueOf(String str) {
        return (Architecture) Enum.valueOf(Architecture.class, str);
    }

    public static Architecture[] values() {
        return (Architecture[]) $VALUES.clone();
    }

    public abstract String getDir();

    private Architecture(String str, int i10) {
    }
}
