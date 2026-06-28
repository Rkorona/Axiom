package com.server.auditor.ssh.client.encryption;

import java.util.EnumMap;
import java.util.Map;
import javax.crypto.SecretKey;
import ug.c;

/* JADX INFO: loaded from: classes3.dex */
public class EncryptionKeyStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f23861b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f23862a;

    public enum KeyTypes {
        LOCAL,
        ENCRIPTION,
        HMAC
    }

    static {
        EnumMap enumMap = new EnumMap(KeyTypes.class);
        f23861b = enumMap;
        enumMap.put(KeyTypes.LOCAL, "6C6F63616C5F7365637265745F6B6579");
        enumMap.put(KeyTypes.ENCRIPTION, "72656D6F74655F7365637265745F6B6579");
        enumMap.put(KeyTypes.HMAC, "72656D6F74655F686D61635F7365637265745F6B6579");
    }

    public EncryptionKeyStorage(c cVar) {
        this.f23862a = cVar;
    }

    public boolean a(KeyTypes keyTypes) {
        String str = (String) f23861b.get(keyTypes);
        if (str == null) {
            return false;
        }
        return this.f23862a.a(str);
    }

    public boolean b() {
        return c(KeyTypes.ENCRIPTION).length > 0 && c(KeyTypes.HMAC).length > 0;
    }

    public byte[] c(KeyTypes keyTypes) {
        String str = (String) f23861b.get(keyTypes);
        return str == null ? new byte[0] : this.f23862a.d(str, "".getBytes());
    }

    public void d(KeyTypes keyTypes) {
        String str = (String) f23861b.get(keyTypes);
        if (str == null) {
            return;
        }
        this.f23862a.b().edit().remove(str).apply();
    }

    public void e(KeyTypes keyTypes, SecretKey secretKey) {
        String str = (String) f23861b.get(keyTypes);
        if (str == null || secretKey == null) {
            return;
        }
        this.f23862a.g(str, secretKey.getEncoded());
    }
}
