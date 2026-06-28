package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest$$serializer;
import hv.c;
import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ChangePasswordModel {
    private static final n[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion;
    private static final c serializer;
    private final String authyToken;
    private final String hmacSalt;
    private final List<EntityChangePasswordModel> listReEncryptionObject;
    private final String newPassword;
    private final String oldPassword;
    private final EncryptedPersonalKeySetRequest personalKeySet;
    private final String salt;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c getSerializer() {
            return ChangePasswordModel.serializer;
        }

        public final c serializer() {
            return ChangePasswordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        $childSerializers = new n[]{null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.changepassword.a
            @Override // iu.a
            public final Object a() {
                return ChangePasswordModel._childSerializers$_anonymous_();
            }
        }), null, null};
        serializer = companion.serializer();
    }

    public /* synthetic */ ChangePasswordModel(int i10, String str, String str2, String str3, String str4, List list, String str5, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, s2 s2Var) {
        if (83 != (i10 & 83)) {
            d2.a(i10, 83, ChangePasswordModel$$serializer.INSTANCE.getDescriptor());
        }
        this.newPassword = str;
        this.oldPassword = str2;
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
        this.listReEncryptionObject = list;
        if ((i10 & 32) == 0) {
            this.authyToken = null;
        } else {
            this.authyToken = str5;
        }
        this.personalKeySet = encryptedPersonalKeySetRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(EntityChangePasswordModel.Companion.EntityChangePasswordModelSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangePasswordModel copy$default(ChangePasswordModel changePasswordModel, String str, String str2, String str3, String str4, List list, String str5, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changePasswordModel.newPassword;
        }
        if ((i10 & 2) != 0) {
            str2 = changePasswordModel.oldPassword;
        }
        if ((i10 & 4) != 0) {
            str3 = changePasswordModel.salt;
        }
        if ((i10 & 8) != 0) {
            str4 = changePasswordModel.hmacSalt;
        }
        if ((i10 & 16) != 0) {
            list = changePasswordModel.listReEncryptionObject;
        }
        if ((i10 & 32) != 0) {
            str5 = changePasswordModel.authyToken;
        }
        if ((i10 & 64) != 0) {
            encryptedPersonalKeySetRequest = changePasswordModel.personalKeySet;
        }
        String str6 = str5;
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest2 = encryptedPersonalKeySetRequest;
        List list2 = list;
        String str7 = str3;
        return changePasswordModel.copy(str, str2, str7, str4, list2, str6, encryptedPersonalKeySetRequest2);
    }

    @hv.o("authy_token")
    public static /* synthetic */ void getAuthyToken$annotations() {
    }

    @hv.o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @hv.o("objects")
    public static /* synthetic */ void getListReEncryptionObject$annotations() {
    }

    @hv.o(SyncConstants.Bundle.NEW_PASSWORD)
    public static /* synthetic */ void getNewPassword$annotations() {
    }

    @hv.o(SyncConstants.Bundle.OLD_PASSWORD)
    public static /* synthetic */ void getOldPassword$annotations() {
    }

    @hv.o("personal_keyset")
    public static /* synthetic */ void getPersonalKeySet$annotations() {
    }

    @hv.o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChangePasswordModel changePasswordModel, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, changePasswordModel.newPassword);
        dVar.f(fVar, 1, changePasswordModel.oldPassword);
        if (dVar.E(fVar, 2) || changePasswordModel.salt != null) {
            dVar.v(fVar, 2, x2.f64817a, changePasswordModel.salt);
        }
        if (dVar.E(fVar, 3) || changePasswordModel.hmacSalt != null) {
            dVar.v(fVar, 3, x2.f64817a, changePasswordModel.hmacSalt);
        }
        dVar.o(fVar, 4, (hv.r) nVarArr[4].getValue(), changePasswordModel.listReEncryptionObject);
        if (dVar.E(fVar, 5) || changePasswordModel.authyToken != null) {
            dVar.v(fVar, 5, x2.f64817a, changePasswordModel.authyToken);
        }
        dVar.o(fVar, 6, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, changePasswordModel.personalKeySet);
    }

    public final String component1() {
        return this.newPassword;
    }

    public final String component2() {
        return this.oldPassword;
    }

    public final String component3() {
        return this.salt;
    }

    public final String component4() {
        return this.hmacSalt;
    }

    public final List<EntityChangePasswordModel> component5() {
        return this.listReEncryptionObject;
    }

    public final String component6() {
        return this.authyToken;
    }

    public final EncryptedPersonalKeySetRequest component7() {
        return this.personalKeySet;
    }

    public final ChangePasswordModel copy(String str, String str2, String str3, String str4, List<? extends EntityChangePasswordModel> list, String str5, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest) {
        t.f(str, "newPassword");
        t.f(str2, "oldPassword");
        t.f(list, "listReEncryptionObject");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        return new ChangePasswordModel(str, str2, str3, str4, list, str5, encryptedPersonalKeySetRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordModel)) {
            return false;
        }
        ChangePasswordModel changePasswordModel = (ChangePasswordModel) obj;
        return t.b(this.newPassword, changePasswordModel.newPassword) && t.b(this.oldPassword, changePasswordModel.oldPassword) && t.b(this.salt, changePasswordModel.salt) && t.b(this.hmacSalt, changePasswordModel.hmacSalt) && t.b(this.listReEncryptionObject, changePasswordModel.listReEncryptionObject) && t.b(this.authyToken, changePasswordModel.authyToken) && t.b(this.personalKeySet, changePasswordModel.personalKeySet);
    }

    public final String getAuthyToken() {
        return this.authyToken;
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final List<EntityChangePasswordModel> getListReEncryptionObject() {
        return this.listReEncryptionObject;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public final EncryptedPersonalKeySetRequest getPersonalKeySet() {
        return this.personalKeySet;
    }

    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        int iHashCode = ((this.newPassword.hashCode() * 31) + this.oldPassword.hashCode()) * 31;
        String str = this.salt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hmacSalt;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.listReEncryptionObject.hashCode()) * 31;
        String str3 = this.authyToken;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.personalKeySet.hashCode();
    }

    public String toString() {
        return "ChangePasswordModel(newPassword=" + this.newPassword + ", oldPassword=" + this.oldPassword + ", salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ", listReEncryptionObject=" + this.listReEncryptionObject + ", authyToken=" + this.authyToken + ", personalKeySet=" + this.personalKeySet + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangePasswordModel(String str, String str2, String str3, String str4, List<? extends EntityChangePasswordModel> list, String str5, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest) {
        t.f(str, "newPassword");
        t.f(str2, "oldPassword");
        t.f(list, "listReEncryptionObject");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        this.newPassword = str;
        this.oldPassword = str2;
        this.salt = str3;
        this.hmacSalt = str4;
        this.listReEncryptionObject = list;
        this.authyToken = str5;
        this.personalKeySet = encryptedPersonalKeySetRequest;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChangePasswordModel(String str, String str2, String str3, String str4, List list, String str5, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, int i10, k kVar) {
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest2;
        String str6;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        if ((i10 & 32) != 0) {
            encryptedPersonalKeySetRequest2 = encryptedPersonalKeySetRequest;
            str6 = null;
        } else {
            encryptedPersonalKeySetRequest2 = encryptedPersonalKeySetRequest;
            str6 = str5;
        }
        this(str, str2, str3, str4, list, str6, encryptedPersonalKeySetRequest2);
    }
}
