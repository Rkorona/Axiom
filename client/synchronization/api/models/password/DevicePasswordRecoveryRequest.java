package com.server.auditor.ssh.client.synchronization.api.models.password;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest$$serializer;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DevicePasswordRecoveryRequest {
    private final String hmacSalt;
    private final String newPassword;
    private final List<EntityChangePasswordModel> objects;
    private final EncryptedPersonalKeySetRequest personalKeySet;
    private final String salt;
    private final String securityToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, o.b(r.f82638b, new a() { // from class: cn.a
        @Override // iu.a
        public final Object a() {
            return DevicePasswordRecoveryRequest._childSerializers$_anonymous_();
        }
    }), null, null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DevicePasswordRecoveryRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ DevicePasswordRecoveryRequest(int i10, String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, List list, String str3, String str4, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, DevicePasswordRecoveryRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.securityToken = str;
        this.newPassword = str2;
        this.personalKeySet = encryptedPersonalKeySetRequest;
        this.objects = list;
        this.salt = str3;
        this.hmacSalt = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(EntityChangePasswordModel.Companion.EntityChangePasswordModelSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicePasswordRecoveryRequest copy$default(DevicePasswordRecoveryRequest devicePasswordRecoveryRequest, String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, List list, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = devicePasswordRecoveryRequest.securityToken;
        }
        if ((i10 & 2) != 0) {
            str2 = devicePasswordRecoveryRequest.newPassword;
        }
        if ((i10 & 4) != 0) {
            encryptedPersonalKeySetRequest = devicePasswordRecoveryRequest.personalKeySet;
        }
        if ((i10 & 8) != 0) {
            list = devicePasswordRecoveryRequest.objects;
        }
        if ((i10 & 16) != 0) {
            str3 = devicePasswordRecoveryRequest.salt;
        }
        if ((i10 & 32) != 0) {
            str4 = devicePasswordRecoveryRequest.hmacSalt;
        }
        String str5 = str3;
        String str6 = str4;
        return devicePasswordRecoveryRequest.copy(str, str2, encryptedPersonalKeySetRequest, list, str5, str6);
    }

    @hv.o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @hv.o(SyncConstants.Bundle.NEW_PASSWORD)
    public static /* synthetic */ void getNewPassword$annotations() {
    }

    @hv.o("objects")
    public static /* synthetic */ void getObjects$annotations() {
    }

    @hv.o("personal_keyset")
    public static /* synthetic */ void getPersonalKeySet$annotations() {
    }

    @hv.o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    @hv.o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DevicePasswordRecoveryRequest devicePasswordRecoveryRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, devicePasswordRecoveryRequest.securityToken);
        dVar.f(fVar, 1, devicePasswordRecoveryRequest.newPassword);
        dVar.o(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, devicePasswordRecoveryRequest.personalKeySet);
        dVar.o(fVar, 3, (hv.r) nVarArr[3].getValue(), devicePasswordRecoveryRequest.objects);
        dVar.f(fVar, 4, devicePasswordRecoveryRequest.salt);
        dVar.f(fVar, 5, devicePasswordRecoveryRequest.hmacSalt);
    }

    public final String component1() {
        return this.securityToken;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final EncryptedPersonalKeySetRequest component3() {
        return this.personalKeySet;
    }

    public final List<EntityChangePasswordModel> component4() {
        return this.objects;
    }

    public final String component5() {
        return this.salt;
    }

    public final String component6() {
        return this.hmacSalt;
    }

    public final DevicePasswordRecoveryRequest copy(String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, List<? extends EntityChangePasswordModel> list, String str3, String str4) {
        t.f(str, "securityToken");
        t.f(str2, "newPassword");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        t.f(list, "objects");
        t.f(str3, "salt");
        t.f(str4, "hmacSalt");
        return new DevicePasswordRecoveryRequest(str, str2, encryptedPersonalKeySetRequest, list, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePasswordRecoveryRequest)) {
            return false;
        }
        DevicePasswordRecoveryRequest devicePasswordRecoveryRequest = (DevicePasswordRecoveryRequest) obj;
        return t.b(this.securityToken, devicePasswordRecoveryRequest.securityToken) && t.b(this.newPassword, devicePasswordRecoveryRequest.newPassword) && t.b(this.personalKeySet, devicePasswordRecoveryRequest.personalKeySet) && t.b(this.objects, devicePasswordRecoveryRequest.objects) && t.b(this.salt, devicePasswordRecoveryRequest.salt) && t.b(this.hmacSalt, devicePasswordRecoveryRequest.hmacSalt);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final List<EntityChangePasswordModel> getObjects() {
        return this.objects;
    }

    public final EncryptedPersonalKeySetRequest getPersonalKeySet() {
        return this.personalKeySet;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        return (((((((((this.securityToken.hashCode() * 31) + this.newPassword.hashCode()) * 31) + this.personalKeySet.hashCode()) * 31) + this.objects.hashCode()) * 31) + this.salt.hashCode()) * 31) + this.hmacSalt.hashCode();
    }

    public String toString() {
        return "DevicePasswordRecoveryRequest(securityToken=" + this.securityToken + ", newPassword=" + this.newPassword + ", personalKeySet=" + this.personalKeySet + ", objects=" + this.objects + ", salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevicePasswordRecoveryRequest(String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, List<? extends EntityChangePasswordModel> list, String str3, String str4) {
        t.f(str, "securityToken");
        t.f(str2, "newPassword");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        t.f(list, "objects");
        t.f(str3, "salt");
        t.f(str4, "hmacSalt");
        this.securityToken = str;
        this.newPassword = str2;
        this.personalKeySet = encryptedPersonalKeySetRequest;
        this.objects = list;
        this.salt = str3;
        this.hmacSalt = str4;
    }
}
