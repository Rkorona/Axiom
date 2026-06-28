package com.server.auditor.ssh.client.models;

import hv.e0;
import io.split.android.client.dtos.SerializableEvent;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes3.dex */
@hv.p
public final class TerminalSchemeAppField {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String terminalUIColor;

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27864b;
        private static final jv.f descriptor;

        static {
            a aVar = new a();
            f27863a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.models.TerminalSchemeAppField", aVar, 1);
            i2Var.r("terminalUIColor", false);
            descriptor = i2Var;
            f27864b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TerminalSchemeAppField deserialize(kv.e eVar) {
            String strB;
            ju.t.f(eVar, "decoder");
            jv.f fVar = descriptor;
            kv.c cVarD = eVar.d(fVar);
            int i10 = 1;
            s2 s2Var = null;
            if (cVarD.l()) {
                strB = cVarD.B(fVar, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                strB = null;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    if (iD == -1) {
                        z10 = false;
                    } else {
                        if (iD != 0) {
                            throw new e0(iD);
                        }
                        strB = cVarD.B(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarD.b(fVar);
            return new TerminalSchemeAppField(i10, strB, s2Var);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, TerminalSchemeAppField terminalSchemeAppField) {
            ju.t.f(fVar, "encoder");
            ju.t.f(terminalSchemeAppField, SerializableEvent.VALUE_FIELD);
            jv.f fVar2 = descriptor;
            kv.d dVarD = fVar.d(fVar2);
            TerminalSchemeAppField.write$Self$Termius_app_googleProductionRelease(terminalSchemeAppField, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        @Override // lv.n0
        public final hv.c[] childSerializers() {
            return new hv.c[]{x2.f64817a};
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
            return a.f27863a;
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }
    }

    public /* synthetic */ TerminalSchemeAppField(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, a.f27863a.getDescriptor());
        }
        this.terminalUIColor = str;
    }

    public static /* synthetic */ TerminalSchemeAppField copy$default(TerminalSchemeAppField terminalSchemeAppField, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalSchemeAppField.terminalUIColor;
        }
        return terminalSchemeAppField.copy(str);
    }

    @hv.o("terminalUIColor")
    public static /* synthetic */ void getTerminalUIColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TerminalSchemeAppField terminalSchemeAppField, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, terminalSchemeAppField.terminalUIColor);
    }

    public final String component1() {
        return this.terminalUIColor;
    }

    public final TerminalSchemeAppField copy(String str) {
        ju.t.f(str, "terminalUIColor");
        return new TerminalSchemeAppField(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TerminalSchemeAppField) && ju.t.b(this.terminalUIColor, ((TerminalSchemeAppField) obj).terminalUIColor);
    }

    public final String getTerminalUIColor() {
        return this.terminalUIColor;
    }

    public int hashCode() {
        return this.terminalUIColor.hashCode();
    }

    public String toString() {
        return "TerminalSchemeAppField(terminalUIColor=" + this.terminalUIColor + ")";
    }

    public TerminalSchemeAppField(String str) {
        ju.t.f(str, "terminalUIColor");
        this.terminalUIColor = str;
    }
}
