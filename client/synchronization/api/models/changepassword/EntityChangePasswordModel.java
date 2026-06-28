package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import hv.b;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.n0;
import ju.t;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import mv.g;
import mv.i;
import su.s;

/* JADX INFO: loaded from: classes4.dex */
@p(with = Companion.EntityChangePasswordModelSerializer.class)
public abstract class EntityChangePasswordModel {
    public static final int $stable = 0;
    public static final String CHANGE_PASSWORD_ID_SERIAL_NAME = "id";
    public static final String CHANGE_PASSWORD_SET_NAME_SERIAL_NAME = "set_name";
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final class EntityChangePasswordModelSerializer extends g {
            public static final EntityChangePasswordModelSerializer INSTANCE = new EntityChangePasswordModelSerializer();
            public static final int $stable = 8;

            private EntityChangePasswordModelSerializer() {
                super(n0.b(EntityChangePasswordModel.class));
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // mv.g
            protected b selectDeserializer(JsonElement jsonElement) {
                JsonPrimitive jsonPrimitiveL;
                t.f(jsonElement, "element");
                JsonElement jsonElement2 = (JsonElement) i.k(jsonElement).get(EntityChangePasswordModel.CHANGE_PASSWORD_SET_NAME_SERIAL_NAME);
                String strF = null;
                if (jsonElement2 != null) {
                    if (!(jsonElement2 instanceof JsonPrimitive)) {
                        jsonElement2 = null;
                    }
                    if (jsonElement2 != null && (jsonPrimitiveL = i.l(jsonElement2)) != null) {
                        strF = i.f(jsonPrimitiveL);
                    }
                }
                if (strF != null) {
                    switch (strF.hashCode()) {
                        case -2066001766:
                            if (strF.equals(SshKeyChangePasswordModel.CHANGE_PASSWORD_SSH_KEY_SET_NAME)) {
                                return SshKeyChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -1548661187:
                            if (strF.equals(TagChangePasswordModel.CHANGE_PASSWORD_TAG_SET_NAME)) {
                                return TagChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -1482650974:
                            if (strF.equals(GroupChangePasswordModel.CHANGE_PASSWORD_GROUP_SET_NAME)) {
                                return GroupChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -1140903360:
                            if (strF.equals(ProxyChangePasswordModel.CHANGE_PASSWORD_PROXY_SET_NAME)) {
                                return ProxyChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -1075290738:
                            if (strF.equals(KnownHostChangePasswordModel.CHANGE_PASSWORD_KNOWN_HOST_SET_NAME)) {
                                return KnownHostChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -300233397:
                            if (strF.equals(HostChangePasswordModel.CHANGE_PASSWORD_HOST_SET_NAME)) {
                                return HostChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -192739776:
                            if (strF.equals(SnippetChangePasswordModel.CHANGE_PASSWORD_SNIPPET_SET_NAME)) {
                                return SnippetChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -160630094:
                            if (strF.equals(SshCertificateChangePasswordModel.CHANGE_PASSWORD_SSH_CERTIFICATE_SET_NAME)) {
                                return SshCertificateChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case -120402591:
                            if (strF.equals(IdentityChangePasswordModel.CHANGE_PASSWORD_IDENTITY_SET_NAME)) {
                                return IdentityChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case 552361109:
                            if (strF.equals(RuleChangePasswordModel.CHANGE_PASSWORD_PF_RULE_SET_NAME)) {
                                return RuleChangePasswordModel.Companion.serializer();
                            }
                            break;
                        case 909282537:
                            if (strF.equals(PackageChangePasswordModel.CHANGE_PASSWORD_PACKAGE_SET_NAME)) {
                                return PackageChangePasswordModel.Companion.serializer();
                            }
                            break;
                    }
                }
                if (strF == null || s.m0(strF)) {
                    throw new IllegalArgumentException("There is no 'set_name' field. Make sure you extends the ChangePasswordBaseModel and override that field!");
                }
                throw new IllegalArgumentException("Can't find serializer by 'set_name' type: " + strF + ".");
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return EntityChangePasswordModelSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EntityChangePasswordModel(k kVar) {
        this();
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(CHANGE_PASSWORD_SET_NAME_SERIAL_NAME)
    public static /* synthetic */ void getSetName$annotations() {
    }

    public abstract long getId();

    public abstract String getSetName();

    private EntityChangePasswordModel() {
    }
}
