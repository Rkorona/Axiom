package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.api.Shareable;
import hv.h;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public abstract class CommonBulkShareable implements Shareable {
    public static final int $stable = 0;
    public static final String LOCAL_ID_SERIAL_NAME = "local_id";
    public static final String REMOTE_ID_SERIAL_NAME = "id";
    public static final String UPDATED_AT_SERIAL_NAME = "updated_at";
    public static final long defaultLocalId = 0;
    public static final long defaultRemoteId = 0;
    private static final String defaultUpdatedAt = null;
    public static final Companion Companion = new Companion(null);
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.a
        @Override // iu.a
        public final Object a() {
            return CommonBulkShareable._init_$_anonymous_();
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final /* synthetic */ hv.c get$cachedSerializer() {
            return (hv.c) CommonBulkShareable.$cachedSerializer$delegate.getValue();
        }

        public final String getDefaultUpdatedAt() {
            return CommonBulkShareable.defaultUpdatedAt;
        }

        public final hv.c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public CommonBulkShareable() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _init_$_anonymous_() {
        return new h(n0.b(CommonBulkShareable.class), new Annotation[0]);
    }

    @hv.o(LOCAL_ID_SERIAL_NAME)
    public static /* synthetic */ void getLocalId$annotations() {
    }

    @hv.o("id")
    public static /* synthetic */ void getRemoteId$annotations() {
    }

    @hv.o("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self(CommonBulkShareable commonBulkShareable, kv.d dVar, jv.f fVar) {
    }

    public abstract Long getLocalId();

    public abstract Long getRemoteId();

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public Boolean getShared() {
        return Boolean.valueOf(getEncryptedWith() != null);
    }

    public abstract String getUpdatedAt();

    @Override // com.server.auditor.ssh.client.synchronization.api.Shareable
    public void resetSharingBeforeSync() {
        setEncryptedWith(null);
    }

    public abstract void setUpdatedAt(String str);

    public /* synthetic */ CommonBulkShareable(int i10, s2 s2Var) {
    }
}
