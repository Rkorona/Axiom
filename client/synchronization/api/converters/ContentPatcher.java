package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.converters.ContentPatcher;
import hv.z;
import iu.l;
import ju.k;
import ju.w;
import mv.b;
import mv.d;
import mv.t;
import org.json.JSONObject;
import ut.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentPatcher {
    private final b json;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b contentPatcherJson = t.b(null, new l() { // from class: xm.a
        @Override // iu.l
        public final Object invoke(Object obj) {
            return ContentPatcher.contentPatcherJson$lambda$0((d) obj);
        }
    }, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getContentPatcherJson$annotations() {
        }

        public final b getContentPatcherJson() {
            return ContentPatcher.contentPatcherJson;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 contentPatcherJson$lambda$0(d dVar) {
        ju.t.f(dVar, "$this$Json");
        dVar.c(true);
        dVar.d(true);
        return m0.f82633a;
    }

    public final /* synthetic */ <T> String createPatchedJsonString(T t10, String str) {
        b contentPatcherJson2 = Companion.getContentPatcherJson();
        ov.b bVarA = contentPatcherJson2.a();
        ju.t.j(6, "T");
        w.a("kotlinx.serialization.serializer.withModule");
        String strC = contentPatcherJson2.c(z.d(bVarA, null), t10);
        return str != null ? BaseBulkApiCreatorKt.patchToString(new JSONObject(str), new JSONObject(strC)) : strC;
    }

    public final b getJson() {
        return this.json;
    }

    public ContentPatcher(b bVar) {
        ju.t.f(bVar, "json");
        this.json = bVar;
    }

    public /* synthetic */ ContentPatcher(b bVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? contentPatcherJson : bVar);
    }
}
