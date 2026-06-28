package com.server.auditor.ssh.client.navigation.ui.compose.navigation;

import androidx.annotation.Keep;
import bu.b;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose;
import hv.c;
import hv.p;
import ju.k;
import lv.j0;
import ut.n;
import ut.o;
import ut.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@p
@Keep
public final class SelectPurpose {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ SelectPurpose[] $VALUES;
    private static final n $cachedSerializer$delegate;
    public static final a Companion;
    public static final SelectPurpose SSH = new SelectPurpose("SSH", 0);
    public static final SelectPurpose TELNET = new SelectPurpose("TELNET", 1);
    public static final SelectPurpose PROXY = new SelectPurpose("PROXY", 2);
    public static final SelectPurpose IDENTITY = new SelectPurpose("IDENTITY", 3);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) SelectPurpose.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ SelectPurpose[] $values() {
        return new SelectPurpose[]{SSH, TELNET, PROXY, IDENTITY};
    }

    static {
        SelectPurpose[] selectPurposeArr$values = $values();
        $VALUES = selectPurposeArr$values;
        $ENTRIES = b.a(selectPurposeArr$values);
        Companion = new a(null);
        $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: ik.t
            @Override // iu.a
            public final Object a() {
                return SelectPurpose._init_$_anonymous_();
            }
        });
    }

    private SelectPurpose(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return j0.b("com.server.auditor.ssh.client.navigation.ui.compose.navigation.SelectPurpose", values());
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static SelectPurpose valueOf(String str) {
        return (SelectPurpose) Enum.valueOf(SelectPurpose.class, str);
    }

    public static SelectPurpose[] values() {
        return (SelectPurpose[]) $VALUES.clone();
    }
}
