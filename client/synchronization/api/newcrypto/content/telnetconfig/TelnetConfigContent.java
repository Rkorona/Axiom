package com.server.auditor.ssh.client.synchronization.api.newcrypto.content.telnetconfig;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.w0;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TelnetConfigContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final c serializer;
    private final String charset;
    private final String colorScheme;
    private final Integer port;
    private final int version;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return TelnetConfigContent.serializer;
        }

        public final c serializer() {
            return TelnetConfigContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        serializer = companion.serializer();
    }

    public TelnetConfigContent() {
        this((Integer) null, (String) null, (String) null, 0, 15, (k) null);
    }

    public static /* synthetic */ TelnetConfigContent copy$default(TelnetConfigContent telnetConfigContent, Integer num, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = telnetConfigContent.port;
        }
        if ((i11 & 2) != 0) {
            str = telnetConfigContent.charset;
        }
        if ((i11 & 4) != 0) {
            str2 = telnetConfigContent.colorScheme;
        }
        if ((i11 & 8) != 0) {
            i10 = telnetConfigContent.version;
        }
        return telnetConfigContent.copy(num, str, str2, i10);
    }

    @o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @o("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TelnetConfigContent telnetConfigContent, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || telnetConfigContent.port != null) {
            dVar.v(fVar, 0, w0.f64808a, telnetConfigContent.port);
        }
        if (dVar.E(fVar, 1) || telnetConfigContent.charset != null) {
            dVar.v(fVar, 1, x2.f64817a, telnetConfigContent.charset);
        }
        if (dVar.E(fVar, 2) || telnetConfigContent.colorScheme != null) {
            dVar.v(fVar, 2, x2.f64817a, telnetConfigContent.colorScheme);
        }
        if (!dVar.E(fVar, 3) && telnetConfigContent.version == 1) {
            return;
        }
        dVar.t(fVar, 3, telnetConfigContent.version);
    }

    public final Integer component1() {
        return this.port;
    }

    public final String component2() {
        return this.charset;
    }

    public final String component3() {
        return this.colorScheme;
    }

    public final int component4() {
        return this.version;
    }

    public final TelnetConfigContent copy(Integer num, String str, String str2, int i10) {
        return new TelnetConfigContent(num, str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelnetConfigContent)) {
            return false;
        }
        TelnetConfigContent telnetConfigContent = (TelnetConfigContent) obj;
        return t.b(this.port, telnetConfigContent.port) && t.b(this.charset, telnetConfigContent.charset) && t.b(this.colorScheme, telnetConfigContent.colorScheme) && this.version == telnetConfigContent.version;
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.port;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.charset;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorScheme;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "TelnetConfigContent(port=" + this.port + ", charset=" + this.charset + ", colorScheme=" + this.colorScheme + ", version=" + this.version + ")";
    }

    public /* synthetic */ TelnetConfigContent(int i10, Integer num, String str, String str2, int i11, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 2) == 0) {
            this.charset = null;
        } else {
            this.charset = str;
        }
        if ((i10 & 4) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str2;
        }
        if ((i10 & 8) == 0) {
            this.version = 1;
        } else {
            this.version = i11;
        }
    }

    public TelnetConfigContent(Integer num, String str, String str2, int i10) {
        this.port = num;
        this.charset = str;
        this.colorScheme = str2;
        this.version = i10;
    }

    public /* synthetic */ TelnetConfigContent(Integer num, String str, String str2, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? 1 : i10);
    }
}
