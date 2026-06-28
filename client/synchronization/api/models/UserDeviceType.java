package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@p(with = UserDeviceTypeSerializer.class)
public final class UserDeviceType {
    private static final /* synthetic */ bu.a $ENTRIES;
    private static final /* synthetic */ UserDeviceType[] $VALUES;
    public static final Companion Companion;

    @o("iPhone")
    public static final UserDeviceType IPHONE = new UserDeviceType("IPHONE", 0);

    @o("Google")
    public static final UserDeviceType GOOGLE = new UserDeviceType("GOOGLE", 1);

    @o("Chrome")
    public static final UserDeviceType CHROME = new UserDeviceType("CHROME", 2);

    @o("Desktop")
    public static final UserDeviceType DESKTOP = new UserDeviceType("DESKTOP", 3);

    @o("Amazon")
    public static final UserDeviceType AMAZON = new UserDeviceType("AMAZON", 4);

    @o("AccountManagement")
    public static final UserDeviceType ACCOUNT_MANAGEMENT = new UserDeviceType("ACCOUNT_MANAGEMENT", 5);

    @o("Fido")
    public static final UserDeviceType FIDO = new UserDeviceType("FIDO", 6);

    @o("Unknown")
    public static final UserDeviceType UNKNOWN = new UserDeviceType("UNKNOWN", 7);

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return UserDeviceTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private static final /* synthetic */ UserDeviceType[] $values() {
        return new UserDeviceType[]{IPHONE, GOOGLE, CHROME, DESKTOP, AMAZON, ACCOUNT_MANAGEMENT, FIDO, UNKNOWN};
    }

    static {
        UserDeviceType[] userDeviceTypeArr$values = $values();
        $VALUES = userDeviceTypeArr$values;
        $ENTRIES = bu.b.a(userDeviceTypeArr$values);
        Companion = new Companion(null);
    }

    private UserDeviceType(String str, int i10) {
    }

    public static bu.a getEntries() {
        return $ENTRIES;
    }

    public static UserDeviceType valueOf(String str) {
        return (UserDeviceType) Enum.valueOf(UserDeviceType.class, str);
    }

    public static UserDeviceType[] values() {
        return (UserDeviceType[]) $VALUES.clone();
    }
}
