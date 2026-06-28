package com.server.auditor.ssh.client.models;

import android.text.TextUtils;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import org.json.JSONException;
import org.json.JSONObject;
import pv.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27966e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27967f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pv.u f27968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f27969d;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pv.u uVar, e0 e0Var) {
        super(SyncConstants.ResultCode.THROTTLING_CODE_ERROR, e0Var, null);
        ju.t.f(uVar, "headers");
        this.f27968c = uVar;
        this.f27969d = e0Var;
    }

    public static /* synthetic */ Integer e(w wVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = 0;
        }
        return wVar.d(num);
    }

    @Override // com.server.auditor.ssh.client.models.e
    public e0 a() {
        return this.f27969d;
    }

    public final String c() {
        try {
            e0 e0VarA = a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            JSONObject jSONObject = new JSONObject(strString);
            if (jSONObject.has("detail")) {
                return jSONObject.getString("detail");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public final Integer d(Integer num) {
        String strB = this.f27968c.b(SyncConstants.Headers.RETRY_AFTER_HEADER);
        Integer numValueOf = null;
        if (strB != null && !su.s.m0(strB)) {
            if (TextUtils.isDigitsOnly(strB)) {
                numValueOf = su.s.v(strB);
            } else {
                Float fT = su.s.t(strB);
                if (fT != null) {
                    numValueOf = Integer.valueOf((int) fT.floatValue());
                }
            }
            if (numValueOf == null) {
                return num;
            }
        }
        return numValueOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return ju.t.b(this.f27968c, wVar.f27968c) && ju.t.b(this.f27969d, wVar.f27969d);
    }

    public int hashCode() {
        int iHashCode = this.f27968c.hashCode() * 31;
        e0 e0Var = this.f27969d;
        return iHashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public String toString() {
        return "ThrottlingErrorResponse(headers=" + this.f27968c + ", errorBody=" + this.f27969d + ")";
    }
}
