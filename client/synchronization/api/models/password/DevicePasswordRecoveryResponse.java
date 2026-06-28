package com.server.auditor.ssh.client.synchronization.api.models.password;

import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModelFullData;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModelFullData$$serializer;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DevicePasswordRecoveryResponse {
    private String hmacSalt;
    private String salt;
    private final BulkModelFullData terminalObjects;
    private final String token;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DevicePasswordRecoveryResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public DevicePasswordRecoveryResponse() {
        this((String) null, (String) null, (String) null, (String) null, (BulkModelFullData) null, 31, (k) null);
    }

    public static /* synthetic */ DevicePasswordRecoveryResponse copy$default(DevicePasswordRecoveryResponse devicePasswordRecoveryResponse, String str, String str2, String str3, String str4, BulkModelFullData bulkModelFullData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = devicePasswordRecoveryResponse.username;
        }
        if ((i10 & 2) != 0) {
            str2 = devicePasswordRecoveryResponse.token;
        }
        if ((i10 & 4) != 0) {
            str3 = devicePasswordRecoveryResponse.salt;
        }
        if ((i10 & 8) != 0) {
            str4 = devicePasswordRecoveryResponse.hmacSalt;
        }
        if ((i10 & 16) != 0) {
            bulkModelFullData = devicePasswordRecoveryResponse.terminalObjects;
        }
        BulkModelFullData bulkModelFullData2 = bulkModelFullData;
        String str5 = str3;
        return devicePasswordRecoveryResponse.copy(str, str2, str5, str4, bulkModelFullData2);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    @o("terminal_objects")
    public static /* synthetic */ void getTerminalObjects$annotations() {
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @o("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DevicePasswordRecoveryResponse devicePasswordRecoveryResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || devicePasswordRecoveryResponse.username != null) {
            dVar.v(fVar, 0, x2.f64817a, devicePasswordRecoveryResponse.username);
        }
        if (dVar.E(fVar, 1) || devicePasswordRecoveryResponse.token != null) {
            dVar.v(fVar, 1, x2.f64817a, devicePasswordRecoveryResponse.token);
        }
        if (dVar.E(fVar, 2) || devicePasswordRecoveryResponse.salt != null) {
            dVar.v(fVar, 2, x2.f64817a, devicePasswordRecoveryResponse.salt);
        }
        if (dVar.E(fVar, 3) || devicePasswordRecoveryResponse.hmacSalt != null) {
            dVar.v(fVar, 3, x2.f64817a, devicePasswordRecoveryResponse.hmacSalt);
        }
        if (!dVar.E(fVar, 4) && devicePasswordRecoveryResponse.terminalObjects == null) {
            return;
        }
        dVar.v(fVar, 4, BulkModelFullData$$serializer.INSTANCE, devicePasswordRecoveryResponse.terminalObjects);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.token;
    }

    public final String component3() {
        return this.salt;
    }

    public final String component4() {
        return this.hmacSalt;
    }

    public final BulkModelFullData component5() {
        return this.terminalObjects;
    }

    public final DevicePasswordRecoveryResponse copy(String str, String str2, String str3, String str4, BulkModelFullData bulkModelFullData) {
        return new DevicePasswordRecoveryResponse(str, str2, str3, str4, bulkModelFullData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePasswordRecoveryResponse)) {
            return false;
        }
        DevicePasswordRecoveryResponse devicePasswordRecoveryResponse = (DevicePasswordRecoveryResponse) obj;
        return t.b(this.username, devicePasswordRecoveryResponse.username) && t.b(this.token, devicePasswordRecoveryResponse.token) && t.b(this.salt, devicePasswordRecoveryResponse.salt) && t.b(this.hmacSalt, devicePasswordRecoveryResponse.hmacSalt) && t.b(this.terminalObjects, devicePasswordRecoveryResponse.terminalObjects);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final BulkModelFullData getTerminalObjects() {
        return this.terminalObjects;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.salt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hmacSalt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BulkModelFullData bulkModelFullData = this.terminalObjects;
        return iHashCode4 + (bulkModelFullData != null ? bulkModelFullData.hashCode() : 0);
    }

    public final void setHmacSalt(String str) {
        this.hmacSalt = str;
    }

    public final void setSalt(String str) {
        this.salt = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "DevicePasswordRecoveryResponse(username=" + this.username + ", token=" + this.token + ", salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ", terminalObjects=" + this.terminalObjects + ")";
    }

    public /* synthetic */ DevicePasswordRecoveryResponse(int i10, String str, String str2, String str3, String str4, BulkModelFullData bulkModelFullData, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 2) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
        if ((i10 & 4) == 0) {
            this.salt = null;
        } else {
            this.salt = str3;
        }
        if ((i10 & 8) == 0) {
            this.hmacSalt = null;
        } else {
            this.hmacSalt = str4;
        }
        if ((i10 & 16) == 0) {
            this.terminalObjects = null;
        } else {
            this.terminalObjects = bulkModelFullData;
        }
    }

    public DevicePasswordRecoveryResponse(String str, String str2, String str3, String str4, BulkModelFullData bulkModelFullData) {
        this.username = str;
        this.token = str2;
        this.salt = str3;
        this.hmacSalt = str4;
        this.terminalObjects = bulkModelFullData;
    }

    public /* synthetic */ DevicePasswordRecoveryResponse(String str, String str2, String str3, String str4, BulkModelFullData bulkModelFullData, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : bulkModelFullData);
    }
}
