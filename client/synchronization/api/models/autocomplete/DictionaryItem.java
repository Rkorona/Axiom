package com.server.auditor.ssh.client.synchronization.api.models.autocomplete;

import com.server.auditor.ssh.client.database.Column;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class DictionaryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String command;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f39033id;
    private final int rating;
    private final long updatedAt;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return DictionaryItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ DictionaryItem(int i10, int i11, String str, int i12, long j10, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, DictionaryItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f39033id = i11;
        this.command = str;
        this.rating = i12;
        this.updatedAt = j10;
    }

    public static /* synthetic */ DictionaryItem copy$default(DictionaryItem dictionaryItem, int i10, String str, int i11, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = dictionaryItem.f39033id;
        }
        if ((i12 & 2) != 0) {
            str = dictionaryItem.command;
        }
        if ((i12 & 4) != 0) {
            i11 = dictionaryItem.rating;
        }
        if ((i12 & 8) != 0) {
            j10 = dictionaryItem.updatedAt;
        }
        int i13 = i11;
        return dictionaryItem.copy(i10, str, i13, j10);
    }

    @o(Column.COMMAND)
    public static /* synthetic */ void getCommand$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("rating")
    public static /* synthetic */ void getRating$annotations() {
    }

    @o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DictionaryItem dictionaryItem, d dVar, f fVar) {
        dVar.t(fVar, 0, dictionaryItem.f39033id);
        dVar.f(fVar, 1, dictionaryItem.command);
        dVar.t(fVar, 2, dictionaryItem.rating);
        dVar.q(fVar, 3, dictionaryItem.updatedAt);
    }

    public final int component1() {
        return this.f39033id;
    }

    public final String component2() {
        return this.command;
    }

    public final int component3() {
        return this.rating;
    }

    public final long component4() {
        return this.updatedAt;
    }

    public final DictionaryItem copy(int i10, String str, int i11, long j10) {
        t.f(str, Column.COMMAND);
        return new DictionaryItem(i10, str, i11, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryItem)) {
            return false;
        }
        DictionaryItem dictionaryItem = (DictionaryItem) obj;
        return this.f39033id == dictionaryItem.f39033id && t.b(this.command, dictionaryItem.command) && this.rating == dictionaryItem.rating && this.updatedAt == dictionaryItem.updatedAt;
    }

    public final String getCommand() {
        return this.command;
    }

    public final int getId() {
        return this.f39033id;
    }

    public final int getRating() {
        return this.rating;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f39033id) * 31) + this.command.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "DictionaryItem(id=" + this.f39033id + ", command=" + this.command + ", rating=" + this.rating + ", updatedAt=" + this.updatedAt + ")";
    }

    public DictionaryItem(int i10, String str, int i11, long j10) {
        t.f(str, Column.COMMAND);
        this.f39033id = i10;
        this.command = str;
        this.rating = i11;
        this.updatedAt = j10;
    }
}
