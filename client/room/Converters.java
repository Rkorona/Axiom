package com.server.auditor.ssh.client.room;

import androidx.annotation.Keep;
import hg.b2;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.t;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class Converters {
    public static final int $stable = 0;

    @Keep
    public final String fromArrayList(List<String> list) {
        t.f(list, "list");
        mv.b bVarS1 = b2.f52944a.s1();
        bVarS1.a();
        return bVarS1.c(new lv.f(x2.f64817a), list);
    }

    @Keep
    public final List<String> fromString(String str) {
        t.f(str, SerializableEvent.VALUE_FIELD);
        mv.b bVarS1 = b2.f52944a.s1();
        bVarS1.a();
        return (List) bVarS1.b(new lv.f(x2.f64817a), str);
    }
}
