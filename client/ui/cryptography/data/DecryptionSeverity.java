package com.server.auditor.ssh.client.ui.cryptography.data;

import bu.b;
import com.server.auditor.ssh.client.ui.cryptography.data.DecryptionSeverity;
import hv.c;
import hv.p;
import ju.k;
import lv.j0;
import ut.n;
import ut.o;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p
public final class DecryptionSeverity {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ DecryptionSeverity[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final a Companion;
    public static final DecryptionSeverity Fatal = new DecryptionSeverity("Fatal", 0);
    public static final DecryptionSeverity Recoverable = new DecryptionSeverity("Recoverable", 1);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) DecryptionSeverity.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ DecryptionSeverity[] $values() {
        return new DecryptionSeverity[]{Fatal, Recoverable};
    }

    static {
        DecryptionSeverity[] decryptionSeverityArr$values = $values();
        $VALUES = decryptionSeverityArr$values;
        $ENTRIES = b.a(decryptionSeverityArr$values);
        Companion = new a(null);
        $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: go.b
            @Override // iu.a
            public final Object a() {
                return DecryptionSeverity._init_$_anonymous_();
            }
        });
    }

    private DecryptionSeverity(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.b("com.server.auditor.ssh.client.ui.cryptography.data.DecryptionSeverity", values());
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static DecryptionSeverity valueOf(String str) {
        return (DecryptionSeverity) Enum.valueOf(DecryptionSeverity.class, str);
    }

    public static DecryptionSeverity[] values() {
        return (DecryptionSeverity[]) $VALUES.clone();
    }
}
