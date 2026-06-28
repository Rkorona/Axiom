package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import vt.n;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class AdditionalPanelKeys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AdditionalPanelKeys f38941a = new AdditionalPanelKeys();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f38942b = {"AI", "Paste_password", "Snippets", LibTermiusSshClient.SFTP_TAG};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f38943c = {"Esc", "Hide", "Close", "Tab", "Enter", "Back Space", "Insert", "Delete", "Snippets", LibTermiusSshClient.SFTP_TAG, "Paste", "Paste_password", "AI", "Shift+Tab"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f38944d = {"PstQA"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f38945e = {"Alt", "Ctrl"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f38946f = {"AC"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f38947g = {"|", "/", ":", "-", "_", "&", "~", "+", "=", ";", "$", "*", "^", "@", "%", "#", "!", "`", "<", ">", "(", ")", "{", "}", "[", "]", "'", ".", "\\", "?"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f38948h = {"Left", "Right", "Up", "Down", "Home", "End", "Pg Up", "Pg Dn"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f38949i = {"^_", "^XX", "^Z", "^R", "^G", "^A", "^B", "^X", "^F", "^P", "^N", "^C", "^H", "^S", "^Q", "^U", "^W", "^L", "^D"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f38950j = {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f38951k = {"Arrows"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f38952l = {"Shift+Tab", "Ctrl", "Esc", "/", "Left", "Up", "Down", "Right", "Alt", "Tab", "Insert", "Delete", "Home", "Pg Up", "Pg Dn", "End", "|", "\\", "?", "-", "|", ":", ";", "!", "~", "@", "$", "*", "^", "%", "=", "`", "<", ">", "(", ")", "{", "}", "[", "]", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "^_", "^W", "^R", "^XX", "^C", "^L", "^S", "^Z", "^X", "^G", "^N", "^P"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f38953m = {"Hide", "Close", "Snippets", LibTermiusSshClient.SFTP_TAG, "QC", "Alt", "Ctrl", "Arrows", "Home", "End", "Fullscreen", "AC", "Paste_password", "AI", "Shift+Tab"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f38954n = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeAdditionalPanelKey {
        private static final /* synthetic */ bu.a $ENTRIES;
        private static final /* synthetic */ TypeAdditionalPanelKey[] $VALUES;
        public static final b Companion;
        public static final TypeAdditionalPanelKey ControlKey = new c("ControlKey", 0);
        public static final TypeAdditionalPanelKey DifferentStateKey = new e("DifferentStateKey", 1);
        public static final TypeAdditionalPanelKey TwoStateKey = new j("TwoStateKey", 2);
        public static final TypeAdditionalPanelKey TerminalInputKey = new i("TerminalInputKey", 3);
        public static final TypeAdditionalPanelKey RelatedKeys = new h("RelatedKeys", 4);
        public static final TypeAdditionalPanelKey ArrowKeys = new a("ArrowKeys", 5);
        public static final TypeAdditionalPanelKey UsersCustomKeys = new k("UsersCustomKeys", 6);
        public static final TypeAdditionalPanelKey FnKeys = new f("FnKeys", 7);
        public static final TypeAdditionalPanelKey PopupKeys = new g("PopupKeys", 8);
        public static final TypeAdditionalPanelKey DebugQAControlKeys = new d("DebugQAControlKeys", 9);

        static final class a extends TypeAdditionalPanelKey {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38948h);
            }
        }

        public static final class b {
            public /* synthetic */ b(ju.k kVar) {
                this();
            }

            public final TypeAdditionalPanelKey a(String str) {
                t.f(str, SerializableEvent.VALUE_FIELD);
                TypeAdditionalPanelKey typeAdditionalPanelKey = TypeAdditionalPanelKey.ControlKey;
                if (!typeAdditionalPanelKey.getStringList().contains(str)) {
                    TypeAdditionalPanelKey typeAdditionalPanelKey2 = TypeAdditionalPanelKey.DifferentStateKey;
                    if (typeAdditionalPanelKey2.getStringList().contains(str)) {
                        return typeAdditionalPanelKey2;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey3 = TypeAdditionalPanelKey.TwoStateKey;
                    if (typeAdditionalPanelKey3.getStringList().contains(str)) {
                        return typeAdditionalPanelKey3;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey4 = TypeAdditionalPanelKey.RelatedKeys;
                    if (typeAdditionalPanelKey4.getStringList().contains(str)) {
                        return typeAdditionalPanelKey4;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey5 = TypeAdditionalPanelKey.ArrowKeys;
                    if (typeAdditionalPanelKey5.getStringList().contains(str)) {
                        return typeAdditionalPanelKey5;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey6 = TypeAdditionalPanelKey.TerminalInputKey;
                    if (typeAdditionalPanelKey6.getStringList().contains(str)) {
                        return typeAdditionalPanelKey6;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey7 = TypeAdditionalPanelKey.FnKeys;
                    if (typeAdditionalPanelKey7.getStringList().contains(str)) {
                        return typeAdditionalPanelKey7;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey8 = TypeAdditionalPanelKey.PopupKeys;
                    if (typeAdditionalPanelKey8.getStringList().contains(str)) {
                        return typeAdditionalPanelKey8;
                    }
                    TypeAdditionalPanelKey typeAdditionalPanelKey9 = TypeAdditionalPanelKey.DebugQAControlKeys;
                    if (typeAdditionalPanelKey9.getStringList().contains(str)) {
                        return typeAdditionalPanelKey9;
                    }
                }
                return typeAdditionalPanelKey;
            }

            private b() {
            }
        }

        static final class c extends TypeAdditionalPanelKey {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38943c);
            }
        }

        static final class d extends TypeAdditionalPanelKey {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38944d);
            }
        }

        static final class e extends TypeAdditionalPanelKey {
            e(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38945e);
            }
        }

        static final class f extends TypeAdditionalPanelKey {
            f(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38941a.b());
            }
        }

        static final class g extends TypeAdditionalPanelKey {
            g(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38941a.c());
            }
        }

        static final class h extends TypeAdditionalPanelKey {
            h(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38941a.a());
            }
        }

        static final class i extends TypeAdditionalPanelKey {
            i(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38941a.d());
            }
        }

        static final class j extends TypeAdditionalPanelKey {
            j(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return n.e(AdditionalPanelKeys.f38946f);
            }
        }

        static final class k extends TypeAdditionalPanelKey {
            k(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys.TypeAdditionalPanelKey
            public List getStringList() {
                return v.o();
            }
        }

        private static final /* synthetic */ TypeAdditionalPanelKey[] $values() {
            return new TypeAdditionalPanelKey[]{ControlKey, DifferentStateKey, TwoStateKey, TerminalInputKey, RelatedKeys, ArrowKeys, UsersCustomKeys, FnKeys, PopupKeys, DebugQAControlKeys};
        }

        static {
            TypeAdditionalPanelKey[] typeAdditionalPanelKeyArr$values = $values();
            $VALUES = typeAdditionalPanelKeyArr$values;
            $ENTRIES = bu.b.a(typeAdditionalPanelKeyArr$values);
            Companion = new b(null);
        }

        public /* synthetic */ TypeAdditionalPanelKey(String str, int i10, ju.k kVar) {
            this(str, i10);
        }

        public static bu.a getEntries() {
            return $ENTRIES;
        }

        public static final TypeAdditionalPanelKey getType(String str) {
            return Companion.a(str);
        }

        public static TypeAdditionalPanelKey valueOf(String str) {
            return (TypeAdditionalPanelKey) Enum.valueOf(TypeAdditionalPanelKey.class, str);
        }

        public static TypeAdditionalPanelKey[] values() {
            return (TypeAdditionalPanelKey[]) $VALUES.clone();
        }

        public abstract List<String> getStringList();

        private TypeAdditionalPanelKey(String str, int i10) {
        }
    }

    private AdditionalPanelKeys() {
    }

    public final String[] a() {
        return f38949i;
    }

    public final String[] b() {
        return f38950j;
    }

    public final String[] c() {
        return f38951k;
    }

    public final String[] d() {
        return f38947g;
    }
}
