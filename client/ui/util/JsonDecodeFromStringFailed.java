package com.server.auditor.ssh.client.ui.util;

import androidx.annotation.Keep;
import io.sentry.b;
import ju.k;
import ju.t;
import su.d;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class JsonDecodeFromStringFailed extends IllegalArgumentException {
    public static final int $stable = 8;
    private final Throwable cause;
    private final String jsonFieldsInfo;
    private final String message;

    public /* synthetic */ JsonDecodeFromStringFailed(String str, String str2, Throwable th2, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? "Failed to decode JSON string. See attachments for details." : str2, (i10 & 4) != 0 ? null : th2);
    }

    public static /* synthetic */ JsonDecodeFromStringFailed copy$default(JsonDecodeFromStringFailed jsonDecodeFromStringFailed, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jsonDecodeFromStringFailed.jsonFieldsInfo;
        }
        if ((i10 & 2) != 0) {
            str2 = jsonDecodeFromStringFailed.message;
        }
        if ((i10 & 4) != 0) {
            th2 = jsonDecodeFromStringFailed.cause;
        }
        return jsonDecodeFromStringFailed.copy(str, str2, th2);
    }

    public final b asAttachment() {
        byte[] bytes = this.jsonFieldsInfo.getBytes(d.f78241b);
        t.e(bytes, "getBytes(...)");
        return new b(bytes, "json_decoding.log", "text/plain");
    }

    public final String component1() {
        return this.jsonFieldsInfo;
    }

    public final String component2() {
        return this.message;
    }

    public final Throwable component3() {
        return this.cause;
    }

    public final JsonDecodeFromStringFailed copy(String str, String str2, Throwable th2) {
        t.f(str, "jsonFieldsInfo");
        return new JsonDecodeFromStringFailed(str, str2, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonDecodeFromStringFailed)) {
            return false;
        }
        JsonDecodeFromStringFailed jsonDecodeFromStringFailed = (JsonDecodeFromStringFailed) obj;
        return t.b(this.jsonFieldsInfo, jsonDecodeFromStringFailed.jsonFieldsInfo) && t.b(this.message, jsonDecodeFromStringFailed.message) && t.b(this.cause, jsonDecodeFromStringFailed.cause);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final String getJsonFieldsInfo() {
        return this.jsonFieldsInfo;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.jsonFieldsInfo.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.cause;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "JsonDecodeFromStringFailed(jsonFieldsInfo=" + this.jsonFieldsInfo + ", message=" + this.message + ", cause=" + this.cause + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodeFromStringFailed(String str, String str2, Throwable th2) {
        super(str2, th2);
        t.f(str, "jsonFieldsInfo");
        this.jsonFieldsInfo = str;
        this.message = str2;
        this.cause = th2;
    }
}
