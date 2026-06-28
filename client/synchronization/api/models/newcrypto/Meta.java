package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class Meta {
    private int limit;
    private String next;
    private int offset;
    private String previous;
    private int totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return Meta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ Meta(int i10, String str, String str2, int i11, int i12, int i13, s2 s2Var) {
        if (28 != (i10 & 28)) {
            d2.a(i10, 28, Meta$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.next = null;
        } else {
            this.next = str;
        }
        if ((i10 & 2) == 0) {
            this.previous = null;
        } else {
            this.previous = str2;
        }
        this.totalCount = i11;
        this.limit = i12;
        this.offset = i13;
    }

    public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = meta.next;
        }
        if ((i13 & 2) != 0) {
            str2 = meta.previous;
        }
        if ((i13 & 4) != 0) {
            i10 = meta.totalCount;
        }
        if ((i13 & 8) != 0) {
            i11 = meta.limit;
        }
        if ((i13 & 16) != 0) {
            i12 = meta.offset;
        }
        int i14 = i12;
        int i15 = i10;
        return meta.copy(str, str2, i15, i11, i14);
    }

    @o("limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @o("next")
    public static /* synthetic */ void getNext$annotations() {
    }

    @o("offset")
    public static /* synthetic */ void getOffset$annotations() {
    }

    @o("previous")
    public static /* synthetic */ void getPrevious$annotations() {
    }

    @o("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Meta meta, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || meta.next != null) {
            dVar.v(fVar, 0, x2.f64817a, meta.next);
        }
        if (dVar.E(fVar, 1) || meta.previous != null) {
            dVar.v(fVar, 1, x2.f64817a, meta.previous);
        }
        dVar.t(fVar, 2, meta.totalCount);
        dVar.t(fVar, 3, meta.limit);
        dVar.t(fVar, 4, meta.offset);
    }

    public final String component1() {
        return this.next;
    }

    public final String component2() {
        return this.previous;
    }

    public final int component3() {
        return this.totalCount;
    }

    public final int component4() {
        return this.limit;
    }

    public final int component5() {
        return this.offset;
    }

    public final Meta copy(String str, String str2, int i10, int i11, int i12) {
        return new Meta(str, str2, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return t.b(this.next, meta.next) && t.b(this.previous, meta.previous) && this.totalCount == meta.totalCount && this.limit == meta.limit && this.offset == meta.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        String str = this.next;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previous;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.limit)) * 31) + Integer.hashCode(this.offset);
    }

    public final void setLimit(int i10) {
        this.limit = i10;
    }

    public final void setNext(String str) {
        this.next = str;
    }

    public final void setOffset(int i10) {
        this.offset = i10;
    }

    public final void setPrevious(String str) {
        this.previous = str;
    }

    public final void setTotalCount(int i10) {
        this.totalCount = i10;
    }

    public String toString() {
        return "Meta(next=" + this.next + ", previous=" + this.previous + ", totalCount=" + this.totalCount + ", limit=" + this.limit + ", offset=" + this.offset + ")";
    }

    public Meta(String str, String str2, int i10, int i11, int i12) {
        this.next = str;
        this.previous = str2;
        this.totalCount = i10;
        this.limit = i11;
        this.offset = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Meta(String str, String str2, int i10, int i11, int i12, int i13, k kVar) {
        int i14;
        int i15;
        int i16;
        String str3;
        str = (i13 & 1) != 0 ? null : str;
        if ((i13 & 2) != 0) {
            i14 = i12;
            i15 = i11;
            i16 = i10;
            str3 = null;
        } else {
            i14 = i12;
            i15 = i11;
            i16 = i10;
            str3 = str2;
        }
        this(str, str3, i16, i15, i14);
    }
}
