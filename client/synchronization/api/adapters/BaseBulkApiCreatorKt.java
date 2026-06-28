package com.server.auditor.ssh.client.synchronization.api.adapters;

import java.util.Iterator;
import ju.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseBulkApiCreatorKt {
    public static final String patchToString(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        t.f(jSONObject, "<this>");
        t.f(jSONObject2, "jsonObject");
        Iterator<String> itKeys = jSONObject2.keys();
        t.e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!t.b(next, "version")) {
                jSONObject.putOpt(next, jSONObject2.get(next));
            }
        }
        String string = jSONObject.toString();
        t.e(string, "toString(...)");
        return string;
    }
}
