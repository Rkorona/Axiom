package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.TerminalSchemeAppField;
import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class TerminalScheme {
    private final TerminalSchemeAppField app;
    private final String backgroundColor;
    private final List<String> colorPaletteOverrides;
    private final String cursorColor;
    private final String foregroundColor;
    private final String name;
    private final String selectionColor;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    private static final ut.n[] $childSerializers = {null, ut.o.b(ut.r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.models.v
        @Override // iu.a
        public final Object a() {
            return TerminalScheme._childSerializers$_anonymous_();
        }
    }), null, null, null, null, null};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27862b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27861a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.TerminalScheme", aVar, 7);
            i2Var.r(Column.MULTI_KEY_NAME, false);
            i2Var.r("colorPaletteOverrides", false);
            i2Var.r("backgroundColor", false);
            i2Var.r("cursorColor", false);
            i2Var.r("foregroundColor", false);
            i2Var.r("selectionColor", false);
            i2Var.r("app", true);
            descriptor = i2Var;
            f27862b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TerminalScheme deserialize(kv.e eVar) {
            int i10;
            TerminalSchemeAppField terminalSchemeAppField;
            String str;
            List list;
            String str2;
            String str3;
            String str4;
            String str5;
            int i11;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            ut.n[] nVarArr = TerminalScheme.$childSerializers;
            int i12 = 6;
            int i13 = 1;
            String strB = null;
            if (cVarD.l()) {
                String strB2 = cVarD.B(fVar, 0);
                List list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                String strB3 = cVarD.B(fVar, 2);
                String strB4 = cVarD.B(fVar, 3);
                String strB5 = cVarD.B(fVar, 4);
                String strB6 = cVarD.B(fVar, 5);
                list = list2;
                str = strB2;
                terminalSchemeAppField = (TerminalSchemeAppField) cVarD.v(fVar, 6, TerminalSchemeAppField.a.f27863a, null);
                str5 = strB6;
                str3 = strB4;
                str4 = strB5;
                str2 = strB3;
                i10 = 127;
            } else {
                boolean z10 = true;
                int i14 = 0;
                TerminalSchemeAppField terminalSchemeAppField2 = null;
                List list3 = null;
                String strB7 = null;
                String strB8 = null;
                String strB9 = null;
                String strB10 = null;
                while (z10) {
                    int i15 = i13;
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            i13 = i15;
                            break;
                        case 0:
                            i11 = i15;
                            strB = cVarD.B(fVar, 0);
                            i14 |= 1;
                            i13 = i11;
                            i12 = 6;
                            break;
                        case 1:
                            i11 = i15;
                            list3 = (List) cVarD.i(fVar, i11, (hv.b) nVarArr[i15].getValue(), list3);
                            i14 |= 2;
                            i13 = i11;
                            i12 = 6;
                            break;
                        case 2:
                            strB7 = cVarD.B(fVar, 2);
                            i14 |= 4;
                            i13 = i15;
                            break;
                        case 3:
                            strB8 = cVarD.B(fVar, 3);
                            i14 |= 8;
                            i13 = i15;
                            break;
                        case 4:
                            strB9 = cVarD.B(fVar, 4);
                            i14 |= 16;
                            i13 = i15;
                            break;
                        case 5:
                            strB10 = cVarD.B(fVar, 5);
                            i14 |= 32;
                            i13 = i15;
                            break;
                        case 6:
                            terminalSchemeAppField2 = (TerminalSchemeAppField) cVarD.v(fVar, i12, TerminalSchemeAppField.a.f27863a, terminalSchemeAppField2);
                            i14 |= 64;
                            i13 = i15;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = i14;
                terminalSchemeAppField = terminalSchemeAppField2;
                str = strB;
                list = list3;
                str2 = strB7;
                str3 = strB8;
                str4 = strB9;
                str5 = strB10;
            }
            cVarD.b(fVar);
            return new TerminalScheme(i10, str, list, str2, str3, str4, str5, terminalSchemeAppField, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, TerminalScheme terminalScheme) {
            ju.t.f(fVar, "encoder");
            ju.t.f(terminalScheme, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            TerminalScheme.write$Self$Termius_app_googleProductionRelease(terminalScheme, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            ut.n[] nVarArr = TerminalScheme.$childSerializers;
            x2 x2Var = x2.f64817a;
            return new hv.c[]{x2Var, nVarArr[1].getValue(), x2Var, x2Var, x2Var, x2Var, iv.a.u(TerminalSchemeAppField.a.f27863a)};
        }

        @Override // hv.c, hv.r, hv.b
        public final jv.f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f27861a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ TerminalScheme(int i10, String str, List list, String str2, String str3, String str4, String str5, TerminalSchemeAppField terminalSchemeAppField, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, a.f27861a.getDescriptor());
        }
        this.name = str;
        this.colorPaletteOverrides = list;
        this.backgroundColor = str2;
        this.cursorColor = str3;
        this.foregroundColor = str4;
        this.selectionColor = str5;
        if ((i10 & 64) == 0) {
            this.app = null;
        } else {
            this.app = terminalSchemeAppField;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TerminalScheme copy$default(TerminalScheme terminalScheme, String str, List list, String str2, String str3, String str4, String str5, TerminalSchemeAppField terminalSchemeAppField, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalScheme.name;
        }
        if ((i10 & 2) != 0) {
            list = terminalScheme.colorPaletteOverrides;
        }
        if ((i10 & 4) != 0) {
            str2 = terminalScheme.backgroundColor;
        }
        if ((i10 & 8) != 0) {
            str3 = terminalScheme.cursorColor;
        }
        if ((i10 & 16) != 0) {
            str4 = terminalScheme.foregroundColor;
        }
        if ((i10 & 32) != 0) {
            str5 = terminalScheme.selectionColor;
        }
        if ((i10 & 64) != 0) {
            terminalSchemeAppField = terminalScheme.app;
        }
        String str6 = str5;
        TerminalSchemeAppField terminalSchemeAppField2 = terminalSchemeAppField;
        String str7 = str4;
        String str8 = str2;
        return terminalScheme.copy(str, list, str8, str3, str7, str6, terminalSchemeAppField2);
    }

    @hv.o("app")
    public static /* synthetic */ void getApp$annotations() {
    }

    @hv.o("backgroundColor")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @hv.o("colorPaletteOverrides")
    public static /* synthetic */ void getColorPaletteOverrides$annotations() {
    }

    @hv.o("cursorColor")
    public static /* synthetic */ void getCursorColor$annotations() {
    }

    @hv.o("foregroundColor")
    public static /* synthetic */ void getForegroundColor$annotations() {
    }

    @hv.o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @hv.o("selectionColor")
    public static /* synthetic */ void getSelectionColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TerminalScheme terminalScheme, kv.d dVar, jv.f fVar) {
        ut.n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, terminalScheme.name);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), terminalScheme.colorPaletteOverrides);
        dVar.f(fVar, 2, terminalScheme.backgroundColor);
        dVar.f(fVar, 3, terminalScheme.cursorColor);
        dVar.f(fVar, 4, terminalScheme.foregroundColor);
        dVar.f(fVar, 5, terminalScheme.selectionColor);
        if (!dVar.E(fVar, 6) && terminalScheme.app == null) {
            return;
        }
        dVar.v(fVar, 6, TerminalSchemeAppField.a.f27863a, terminalScheme.app);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.colorPaletteOverrides;
    }

    public final String component3() {
        return this.backgroundColor;
    }

    public final String component4() {
        return this.cursorColor;
    }

    public final String component5() {
        return this.foregroundColor;
    }

    public final String component6() {
        return this.selectionColor;
    }

    public final TerminalSchemeAppField component7() {
        return this.app;
    }

    public final TerminalScheme copy(String str, List<String> list, String str2, String str3, String str4, String str5, TerminalSchemeAppField terminalSchemeAppField) {
        ju.t.f(str, Column.MULTI_KEY_NAME);
        ju.t.f(list, "colorPaletteOverrides");
        ju.t.f(str2, "backgroundColor");
        ju.t.f(str3, "cursorColor");
        ju.t.f(str4, "foregroundColor");
        ju.t.f(str5, "selectionColor");
        return new TerminalScheme(str, list, str2, str3, str4, str5, terminalSchemeAppField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TerminalScheme)) {
            return false;
        }
        TerminalScheme terminalScheme = (TerminalScheme) obj;
        return ju.t.b(this.name, terminalScheme.name) && ju.t.b(this.colorPaletteOverrides, terminalScheme.colorPaletteOverrides) && ju.t.b(this.backgroundColor, terminalScheme.backgroundColor) && ju.t.b(this.cursorColor, terminalScheme.cursorColor) && ju.t.b(this.foregroundColor, terminalScheme.foregroundColor) && ju.t.b(this.selectionColor, terminalScheme.selectionColor) && ju.t.b(this.app, terminalScheme.app);
    }

    public final TerminalSchemeAppField getApp() {
        return this.app;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> getColorPaletteOverrides() {
        return this.colorPaletteOverrides;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSelectionColor() {
        return this.selectionColor;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.colorPaletteOverrides.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.cursorColor.hashCode()) * 31) + this.foregroundColor.hashCode()) * 31) + this.selectionColor.hashCode()) * 31;
        TerminalSchemeAppField terminalSchemeAppField = this.app;
        return iHashCode + (terminalSchemeAppField == null ? 0 : terminalSchemeAppField.hashCode());
    }

    public String toString() {
        return "TerminalScheme(name=" + this.name + ", colorPaletteOverrides=" + this.colorPaletteOverrides + ", backgroundColor=" + this.backgroundColor + ", cursorColor=" + this.cursorColor + ", foregroundColor=" + this.foregroundColor + ", selectionColor=" + this.selectionColor + ", app=" + this.app + ")";
    }

    public TerminalScheme(String str, List<String> list, String str2, String str3, String str4, String str5, TerminalSchemeAppField terminalSchemeAppField) {
        ju.t.f(str, Column.MULTI_KEY_NAME);
        ju.t.f(list, "colorPaletteOverrides");
        ju.t.f(str2, "backgroundColor");
        ju.t.f(str3, "cursorColor");
        ju.t.f(str4, "foregroundColor");
        ju.t.f(str5, "selectionColor");
        this.name = str;
        this.colorPaletteOverrides = list;
        this.backgroundColor = str2;
        this.cursorColor = str3;
        this.foregroundColor = str4;
        this.selectionColor = str5;
        this.app = terminalSchemeAppField;
    }

    public /* synthetic */ TerminalScheme(String str, List list, String str2, String str3, String str4, String str5, TerminalSchemeAppField terminalSchemeAppField, int i10, ju.k kVar) {
        this(str, list, str2, str3, str4, str5, (i10 & 64) != 0 ? null : terminalSchemeAppField);
    }
}
