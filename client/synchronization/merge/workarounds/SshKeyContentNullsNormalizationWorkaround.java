package com.server.auditor.ssh.client.synchronization.merge.workarounds;

import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key.SshKeyContent;
import iu.l;
import java.util.Iterator;
import ju.k;
import ju.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SshKeyContentNullsNormalizationWorkaround {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String LABEL_FIELD = "label";
    private static final String PASSPHRASE_FIELD = "passphrase";
    private static final String PRIVATE_KEY_FIELD = "private_key";
    private static final String PUBLIC_KEY_FIELD = "public_key";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final SshKeyContent invoke(String str, l lVar) {
        t.f(str, "content");
        t.f(lVar, "onDebugInfo");
        if (str.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SshKeyContent debug nulls:");
            t.c(itKeys);
            String str2 = "";
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                boolean zIsNull = jSONObject.isNull(next);
                sb2.append("\n" + next + ": isNull=" + zIsNull);
                if (next != null) {
                    switch (next.hashCode()) {
                        case 102727412:
                            if (next.equals("label")) {
                                if (!zIsNull) {
                                    String string = jSONObject.getString(next);
                                    t.e(string, "getString(...)");
                                    str5 = string;
                                } else {
                                    str5 = "";
                                }
                            }
                            break;
                        case 1085338122:
                            if (next.equals("passphrase")) {
                                if (!zIsNull) {
                                    String string2 = jSONObject.getString(next);
                                    t.e(string2, "getString(...)");
                                    str2 = string2;
                                } else {
                                    str2 = "";
                                }
                            }
                            break;
                        case 1904812937:
                            if (next.equals("public_key")) {
                                if (!zIsNull) {
                                    String string3 = jSONObject.getString(next);
                                    t.e(string3, "getString(...)");
                                    str4 = string3;
                                } else {
                                    str4 = "";
                                }
                            }
                            break;
                        case 1971943843:
                            if (next.equals(PRIVATE_KEY_FIELD)) {
                                if (!zIsNull) {
                                    String string4 = jSONObject.getString(next);
                                    t.e(string4, "getString(...)");
                                    str3 = string4;
                                } else {
                                    str3 = "";
                                }
                            }
                            break;
                    }
                }
            }
            sb2.append("\nend of SshKeyContent debug nulls");
            lVar.invoke(sb2.toString());
            return new SshKeyContent(str2, str3, str4, str5, 0, 16, (k) null);
        } catch (JSONException unused) {
            return null;
        }
    }
}
