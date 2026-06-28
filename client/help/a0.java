package com.server.auditor.ssh.client.help;

import android.content.Context;
import io.split.android.client.dtos.SerializableEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    public static final class a extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f27034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Object... objArr) {
            super(null);
            ju.t.f(objArr, "args");
            this.f27033a = i10;
            this.f27034b = objArr;
        }

        public final Object[] c() {
            return this.f27034b;
        }

        public final int d() {
            return this.f27033a;
        }
    }

    public static final class b extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            ju.t.f(str, SerializableEvent.VALUE_FIELD);
            this.f27035a = str;
        }

        public final String c() {
            return this.f27035a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ju.t.b(this.f27035a, ((b) obj).f27035a);
        }

        public int hashCode() {
            return this.f27035a.hashCode();
        }

        public String toString() {
            return "StringValue(value=" + this.f27035a + ")";
        }
    }

    public /* synthetic */ a0(ju.k kVar) {
        this();
    }

    public final String a(Context context) {
        ju.t.f(context, "context");
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (!(this instanceof a)) {
            throw new ut.s();
        }
        a aVar = (a) this;
        int iD = aVar.d();
        Object[] objArrC = aVar.c();
        String string = context.getString(iD, Arrays.copyOf(objArrC, objArrC.length));
        ju.t.e(string, "getString(...)");
        return string;
    }

    public final String b(androidx.compose.runtime.m mVar, int i10) {
        String strC;
        mVar.W(43110102);
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.b0(43110102, i10, -1, "com.server.auditor.ssh.client.help.UiText.asString (UiText.kt:40)");
        }
        if (this instanceof b) {
            mVar.W(-1520860453);
            mVar.Q();
            strC = ((b) this).c();
        } else {
            if (!(this instanceof a)) {
                mVar.W(-1520861666);
                mVar.Q();
                throw new ut.s();
            }
            mVar.W(-1520859182);
            a aVar = (a) this;
            int iD = aVar.d();
            Object[] objArrC = aVar.c();
            strC = z2.h.c(iD, Arrays.copyOf(objArrC, objArrC.length), mVar, 0);
            mVar.Q();
        }
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.a0();
        }
        mVar.Q();
        return strC;
    }

    private a0() {
    }
}
